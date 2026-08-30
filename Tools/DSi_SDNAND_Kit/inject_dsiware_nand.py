import os
import sys
import struct
import hashlib
import glob
import time

def make_tmd(rom_path, title_id_cat, title_id_id, version=0):
    with open(rom_path, 'rb') as f:
        rom_data = f.read()
    
    app_sha1 = hashlib.sha1(rom_data).digest()
    app_size = len(rom_data)
    
    pub_sav = 0
    priv_sav = 524288
    
    tmd = bytearray(520)
    struct.pack_into('>I', tmd, 0, 0x00010001)
    issuer = b"Root-CA00000001-CP00000004"
    tmd[0x140:0x140+len(issuer)] = issuer
    tmd[0x180] = 0
    
    struct.pack_into('>II', tmd, 0x18C, title_id_cat, title_id_id)
    struct.pack_into('>I', tmd, 0x194, 0x00000000)
    struct.pack_into('>H', tmd, 0x198, 0x3031)
    struct.pack_into('>II', tmd, 0x19A, pub_sav, priv_sav)
    
    struct.pack_into('>H', tmd, 0x1DC, version)
    struct.pack_into('>H', tmd, 0x1DE, 1)
    struct.pack_into('>H', tmd, 0x1E0, 0)
    
    content_id = version
    struct.pack_into('>IHHQ', tmd, 0x1E4, content_id, 0, 1, app_size)
    tmd[0x1F4:0x208] = app_sha1
    
    return tmd, rom_data, pub_sav, priv_sav

def make_ticket(title_id_cat, title_id_id, version=0):
    ticket = bytearray(0x2C4)
    struct.pack_into('>I', ticket, 0, 0x00010001)
    issuer = b"Root-CA00000001-XS00000006"
    ticket[0x140:0x140+len(issuer)] = issuer
    struct.pack_into('>II', ticket, 0x1DC, title_id_cat, title_id_id)
    ticket[0x1E6] = version
    ticket[0x222:0x242] = b'\xFF' * 0x20
    return ticket

class FAT16Manager:
    def __init__(self, nand_path, part_offset=1109504):
        self.nand_path = nand_path
        self.part_offset = part_offset
        self.f = open(nand_path, 'r+b')
        
        self.f.seek(self.part_offset)
        bs = self.f.read(512)
        (self.bps, self.spc, self.rsvd, self.num_fats,
         self.root_entries, self.tot_sec_16, self.media,
         self.spf_16, self.spt, self.heads, self.hidden,
         self.tot_sec_32) = struct.unpack('<HBHBHHBHHHII', bs[11:36])
        
        self.cluster_size = self.bps * self.spc
        self.fat1_offset = self.part_offset + self.rsvd * self.bps
        self.fat2_offset = self.fat1_offset + self.spf_16 * self.bps
        self.root_dir_offset = self.fat2_offset + self.spf_16 * self.bps
        self.root_dir_size = self.root_entries * 32
        self.data_offset = self.root_dir_offset + self.root_dir_size
        
        self.f.seek(self.fat1_offset)
        fat_raw = self.f.read(self.spf_16 * self.bps)
        self.fat = list(struct.unpack(f'<{len(fat_raw)//2}H', fat_raw))
        self.total_clusters = len(self.fat)
        
        free_count = sum(1 for c in self.fat[2:] if c == 0)
        print(f"FAT16 Initialized: Total={self.total_clusters}, Free={free_count} ({free_count * self.cluster_size // (1024*1024)} MB free), RootDir={self.root_entries} entries")

    def find_free_clusters(self, count):
        free = []
        for c in range(2, len(self.fat)):
            if self.fat[c] == 0:
                free.append(c)
                if len(free) == count:
                    return free
        raise RuntimeError(f"NAND Full! Cannot allocate {count} clusters (found only {len(free)})")

    def allocate_clusters_for_data(self, data_len):
        if data_len == 0:
            return 0, []
        needed = (data_len + self.cluster_size - 1) // self.cluster_size
        free_clusters = self.find_free_clusters(needed)
        for i in range(len(free_clusters) - 1):
            self.fat[free_clusters[i]] = free_clusters[i+1]
        self.fat[free_clusters[-1]] = 0xFFFF
        return free_clusters[0], free_clusters

    def write_cluster_data(self, start_cluster, clusters_list, data):
        data_bytes = bytearray(data)
        for i, c in enumerate(clusters_list):
            chunk = data_bytes[i*self.cluster_size : (i+1)*self.cluster_size]
            if len(chunk) < self.cluster_size:
                chunk = chunk.ljust(self.cluster_size, b'\x00')
            c_pos = self.data_offset + (c - 2) * self.cluster_size
            self.f.seek(c_pos)
            self.f.write(chunk)

    def read_directory_entries(self, cluster):
        if cluster == 0:
            self.f.seek(self.root_dir_offset)
            raw = self.f.read(self.root_dir_size)
        else:
            raw = bytearray()
            curr = cluster
            while 0x0002 <= curr <= 0xFFEF:
                c_pos = self.data_offset + (curr - 2) * self.cluster_size
                self.f.seek(c_pos)
                raw.extend(self.f.read(self.cluster_size))
                curr = self.fat[curr]
            if curr >= 0xFFF8:
                c_pos = self.data_offset + (curr - 2) * self.cluster_size
                self.f.seek(c_pos)
                raw.extend(self.f.read(self.cluster_size))
        
        entries = []
        for i in range(0, len(raw), 32):
            entry = raw[i:i+32]
            if entry[0] == 0x00:
                break
            if entry[0] == 0xE5:
                continue
            name = entry[0:11].decode('ascii', errors='ignore')
            attr = entry[11]
            first_c = struct.unpack('<H', entry[26:28])[0]
            size = struct.unpack('<I', entry[28:32])[0]
            entries.append((name.strip(), attr, first_c, size, entry))
        return entries

    def add_entry_to_dir(self, dir_cluster, name_8_3, attr, first_cluster, size):
        name_pad = name_8_3.ljust(11).encode('ascii')[:11]
        t = time.localtime()
        fat_time = (t.tm_hour << 11) | (t.tm_min << 5) | (t.tm_sec // 2)
        fat_date = ((t.tm_year - 1980) << 9) | (t.tm_mon << 5) | t.tm_mday
        
        entry = struct.pack('<11sBBBHHHHHHHI',
            name_pad, attr, 0, 0, fat_time, fat_date, fat_date,
            0, fat_time, fat_date, first_cluster, size
        )
        
        if dir_cluster == 0:
            self.f.seek(self.root_dir_offset)
            raw = bytearray(self.f.read(self.root_dir_size))
            for i in range(0, len(raw), 32):
                if raw[i] == 0x00 or raw[i] == 0xE5:
                    raw[i:i+32] = entry
                    self.f.seek(self.root_dir_offset)
                    self.f.write(raw)
                    return
            raise RuntimeError("Root directory full!")
        else:
            curr = dir_cluster
            while True:
                c_pos = self.data_offset + (curr - 2) * self.cluster_size
                self.f.seek(c_pos)
                raw = bytearray(self.f.read(self.cluster_size))
                for i in range(0, len(raw), 32):
                    if raw[i] == 0x00 or raw[i] == 0xE5:
                        raw[i:i+32] = entry
                        self.f.seek(c_pos)
                        self.f.write(raw)
                        return
                nxt = self.fat[curr]
                if 0x0002 <= nxt <= 0xFFEF:
                    curr = nxt
                else:
                    new_c, _ = self.allocate_clusters_for_data(self.cluster_size)
                    self.fat[curr] = new_c
                    self.fat[new_c] = 0xFFFF
                    c_pos = self.data_offset + (new_c - 2) * self.cluster_size
                    new_block = bytearray(self.cluster_size)
                    new_block[0:32] = entry
                    self.f.seek(c_pos)
                    self.f.write(new_block)
                    return

    def get_or_create_dir(self, parent_cluster, dirname):
        dirname_8_3 = dirname.upper().ljust(11)
        entries = self.read_directory_entries(parent_cluster)
        for name, attr, first_c, size, _ in entries:
            if attr & 0x10 and name.upper().replace(" ", "") == dirname.upper().replace(" ", ""):
                return first_c
        
        new_c, clist = self.allocate_clusters_for_data(self.cluster_size)
        t = time.localtime()
        fat_time = (t.tm_hour << 11) | (t.tm_min << 5) | (t.tm_sec // 2)
        fat_date = ((t.tm_year - 1980) << 9) | (t.tm_mon << 5) | t.tm_mday
        
        dir_data = bytearray(self.cluster_size)
        dot = struct.pack('<11sBBBHHHHHHHI',
            b'.          ', 0x10, 0, 0, fat_time, fat_date, fat_date,
            0, fat_time, fat_date, new_c, 0)
        dotdot = struct.pack('<11sBBBHHHHHHHI',
            b'..         ', 0x10, 0, 0, fat_time, fat_date, fat_date,
            0, fat_time, fat_date, parent_cluster, 0)
        dir_data[0:32] = dot
        dir_data[32:64] = dotdot
        self.write_cluster_data(new_c, [new_c], dir_data)
        
        self.add_entry_to_dir(parent_cluster, dirname.upper(), 0x10, new_c, 0)
        return new_c

    def write_file(self, dir_cluster, sfn_11, data):
        first_c, clist = self.allocate_clusters_for_data(len(data))
        self.write_cluster_data(first_c, clist, data)
        self.add_entry_to_dir(dir_cluster, sfn_11, 0x20, first_c, len(data))

    def flush_fat(self):
        fat_raw = bytearray()
        for v in self.fat:
            fat_raw.extend(struct.pack('<H', v))
        self.f.seek(self.fat1_offset)
        self.f.write(fat_raw)
        self.f.seek(self.fat2_offset)
        self.f.write(fat_raw)
        self.f.flush()

    def close(self):
        self.flush_fat()
        self.f.close()

def inject_all_games(nand_dec_path, roms_dir):
    fat_mgr = FAT16Manager(nand_dec_path)
    
    title_c = fat_mgr.get_or_create_dir(0, "TITLE")
    ticket_c = fat_mgr.get_or_create_dir(0, "TICKET")
    
    cat_title_c = fat_mgr.get_or_create_dir(title_c, "00030004")
    cat_ticket_c = fat_mgr.get_or_create_dir(ticket_c, "00030004")
    
    rom_files = sorted(glob.glob(os.path.join(roms_dir, "*.nds")))
    print(f"Found {len(rom_files)} ROM files to inject from {roms_dir}")
    
    for rom_path in rom_files:
        with open(rom_path, 'rb') as f:
            hdr = f.read(0x240)
        gamecode = hdr[12:16].decode('ascii', errors='ignore')
        title_id_cat = 0x00030004
        title_id_id = int(''.join(f'{ord(c):02x}' for c in gamecode), 16)
        title_hex = f"{title_id_id:08x}".upper()
        
        print(f"-> Injecting Game: {os.path.basename(rom_path)} (TitleID: 00030004/{title_hex})")
        
        tmd_bytes, app_bytes, pub_sav, priv_sav = make_tmd(rom_path, title_id_cat, title_id_id)
        tik_bytes = make_ticket(title_id_cat, title_id_id)
        
        game_dir_c = fat_mgr.get_or_create_dir(cat_title_c, title_hex)
        content_dir_c = fat_mgr.get_or_create_dir(game_dir_c, "CONTENT")
        data_dir_c = fat_mgr.get_or_create_dir(game_dir_c, "DATA")
        
        fat_mgr.write_file(content_dir_c, "00000000APP", app_bytes)
        fat_mgr.write_file(content_dir_c, "TITLE   TMD", tmd_bytes)
        
        if priv_sav > 0:
            fat_mgr.write_file(data_dir_c, "PRIVATE SAV", b'\xFF' * priv_sav)
            
        sfn_tik = (title_hex[:8] + "TIK")
        fat_mgr.write_file(cat_ticket_c, sfn_tik, tik_bytes)
        
        print(f"   [OK] Injected 00000000.app ({len(app_bytes)} B), title.tmd, {sfn_tik}")

    fat_mgr.close()
    print("All titles successfully written into decrypted NAND FAT16!")

if __name__ == '__main__':
    nand_dec = sys.argv[1] if len(sys.argv) > 1 else r"N:\BIOS\HANDHELDS\nand_clean_base.bin"
    roms = sys.argv[2] if len(sys.argv) > 2 else r"N:\BIOS\HANDHELDS\DSiUSA"
    inject_all_games(nand_dec, roms)
