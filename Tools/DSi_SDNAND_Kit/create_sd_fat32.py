import os
import sys
import struct
import math
import time

def generate_sfn(name, index=1):
    base, ext = os.path.splitext(name)
    ext = ext.lstrip('.').upper()[:3]
    clean_base = "".join(c.upper() for c in base if c.isalnum() or c in "_-~")
    if not clean_base:
        clean_base = "FILE"
    
    if len(name) <= 12 and "." not in base and len(ext) <= 3 and clean_base == base.upper():
        sfn_base = clean_base.ljust(8)
        sfn_ext = ext.ljust(3)
        return (sfn_base + sfn_ext).encode('ascii')
    
    num_str = f"~{index}"
    allowed_base_len = 8 - len(num_str)
    sfn_base = clean_base[:allowed_base_len] + num_str
    sfn_base = sfn_base.ljust(8)
    sfn_ext = ext.ljust(3)
    return (sfn_base + sfn_ext).encode('ascii')

def calc_sfn_checksum(sfn_11):
    c = 0
    for b in sfn_11:
        c = (((c & 1) << 7) + (c >> 1) + b) & 0xFF
    return c

def create_lfn_entries(long_name, sfn_11):
    chksum = calc_sfn_checksum(sfn_11)
    name_utf16 = long_name.encode('utf-16le')
    chars = []
    for i in range(0, len(name_utf16), 2):
        chars.append(name_utf16[i:i+2])
    chars.append(b'\x00\x00')
    while len(chars) % 13 != 0:
        chars.append(b'\xFF\xFF')
    
    num_entries = len(chars) // 13
    entries = []
    for entry_idx in range(num_entries):
        seq = entry_idx + 1
        if entry_idx == num_entries - 1:
            seq |= 0x40
        
        slice_chars = chars[entry_idx * 13 : (entry_idx + 1) * 13]
        part1 = b"".join(slice_chars[0:5])
        part2 = b"".join(slice_chars[5:11])
        part3 = b"".join(slice_chars[11:13])
        
        entry = struct.pack('<B10sBBB6sH4s',
            seq,
            part1,
            0x0F,
            0x00,
            chksum,
            part2,
            0x0000,
            part3
        )
        entries.append(entry)
    
    return entries[::-1]

def make_fat_time_date():
    t = time.localtime()
    fat_time = (t.tm_hour << 11) | (t.tm_min << 5) | (t.tm_sec // 2)
    fat_date = ((t.tm_year - 1980) << 9) | (t.tm_mon << 5) | t.tm_mday
    return fat_time, fat_date

def create_fat32_image(source_dir, output_img_path, size_mb=2048):
    print(f"Creating FAT32 image: {output_img_path} (Size: {size_mb} MB)...")
    total_bytes = size_mb * 1024 * 1024
    sector_size = 512
    total_sectors = total_bytes // sector_size
    sectors_per_cluster = 8
    cluster_size = sectors_per_cluster * sector_size
    reserved_sectors = 32
    num_fats = 2
    
    data_sectors = total_sectors - reserved_sectors
    num_clusters = data_sectors // sectors_per_cluster
    fat_size_bytes = (num_clusters + 2) * 4
    fat_size_sectors = (fat_size_bytes + sector_size - 1) // sector_size
    
    root_dir_cluster = 2
    
    data_start_sector = reserved_sectors + (num_fats * fat_size_sectors)
    total_data_clusters = (total_sectors - data_start_sector) // sectors_per_cluster
    
    print(f"Geometry: Total Sectors={total_sectors}, Cluster Size={cluster_size}B ({sectors_per_cluster} sec), FAT Size={fat_size_sectors} sec, Data Clusters={total_data_clusters}")
    
    with open(output_img_path, 'wb') as img:
        img.truncate(total_bytes)
        
        # 1. Boot Sector (Sector 0)
        boot_sector = bytearray(sector_size)
        boot_sector[0:3] = b'\xEB\x58\x90'
        boot_sector[3:11] = b'MSDOS5.0'
        struct.pack_into('<HBHBHHBHHHII', boot_sector, 11,
            sector_size,            # 11: 512
            sectors_per_cluster,    # 13: 8
            reserved_sectors,       # 14: 32
            num_fats,               # 16: 2
            0,                      # 17: 0
            0,                      # 19: 0
            0xF8,                   # 21: Media
            0,                      # 22: 0
            63,                     # 24: Sectors per track
            255,                    # 26: Heads
            0,                      # 28: Hidden sectors
            total_sectors           # 32: Total sectors 32
        )
        # FAT32 extended BPB
        struct.pack_into('<IIHHIHH12sBBBI11s8s', boot_sector, 36,
            fat_size_sectors,       # 36: Sectors per FAT 32
            0,                      # 40: Ext flags
            0,                      # 42: FS Version 0.0
            root_dir_cluster,       # 44: Root cluster (2)
            1,                      # 48: FSInfo sector (1)
            6,                      # 50: Backup boot sector (6)
            0,                      # 52: Reserved
            b'\x00' * 12,           # 54: Reserved
            0x80,                   # 64: Drive number
            0,                      # 65: Reserved NT
            0x29,                   # 66: Boot signature
            0x12345678,             # 67: Volume ID
            b'DSISD      ',         # 71: Volume label (11 bytes)
            b'FAT32   '             # 82: System ID (8 bytes)
        )
        boot_sector[510:512] = b'\x55\xAA'
        
        img.seek(0)
        img.write(boot_sector)
        img.seek(6 * sector_size)
        img.write(boot_sector)
        
        # 2. FSInfo Sector
        fsinfo = bytearray(sector_size)
        struct.pack_into('<I480sIII12sI', fsinfo, 0,
            0x41615252,
            b'\x00' * 480,
            0x61417272,
            0xFFFFFFFF,
            3,
            b'\x00' * 12,
            0xAA550000
        )
        img.seek(1 * sector_size)
        img.write(fsinfo)
        img.seek(7 * sector_size)
        img.write(fsinfo)
        
        # 3. Data cluster allocation and FAT table building
        fat_entries = [0] * (total_data_clusters + 2)
        fat_entries[0] = 0x0FFFFFF8
        fat_entries[1] = 0x0FFFFFFF
        fat_entries[2] = 0x0FFFFFFF
        
        next_cluster = 3
        fat_time, fat_date = make_fat_time_date()
        
        def allocate_clusters(data_len):
            nonlocal next_cluster
            if data_len == 0:
                return 0, []
            needed = (data_len + cluster_size - 1) // cluster_size
            clusters = list(range(next_cluster, next_cluster + needed))
            next_cluster += needed
            for i in range(len(clusters) - 1):
                fat_entries[clusters[i]] = clusters[i+1]
            fat_entries[clusters[-1]] = 0x0FFFFFFF
            return clusters[0], clusters

        def write_cluster_data(start_cluster, data):
            pos = (data_start_sector + (start_cluster - 2) * sectors_per_cluster) * sector_size
            img.seek(pos)
            img.write(data)

        def process_directory(dir_path, is_root=False, parent_cluster=0):
            nonlocal next_cluster
            entries_bytes = bytearray()
            
            if not is_root:
                dot = struct.pack('<11sBBBHHHHHHII',
                    b'.          ', 0x10, 0, 0, fat_time, fat_date, fat_date,
                    0, fat_time, fat_date, 0, 0)
                dotdot = struct.pack('<11sBBBHHHHHHII',
                    b'..         ', 0x10, 0, 0, fat_time, fat_date, fat_date,
                    0, fat_time, fat_date, 0, 0)
                entries_bytes.extend(dot)
                entries_bytes.extend(dotdot)
            
            items = os.listdir(dir_path)
            sfn_counts = {}
            subdirs_to_process = []
            
            for item in sorted(items):
                item_path = os.path.join(dir_path, item)
                is_dir = os.path.isdir(item_path)
                
                base_cand = os.path.splitext(item)[0].upper()[:6]
                count = sfn_counts.get(base_cand, 0) + 1
                sfn_counts[base_cand] = count
                sfn = generate_sfn(item, count)
                
                lfn_list = create_lfn_entries(item, sfn)
                for lfn in lfn_list:
                    entries_bytes.extend(lfn)
                
                attr = 0x10 if is_dir else 0x20
                
                if is_dir:
                    dir_cluster = next_cluster
                    next_cluster += 1
                    fat_entries[dir_cluster] = 0x0FFFFFFF
                    
                    sfn_entry = struct.pack('<11sBBBHHHHHHII',
                        sfn, attr, 0, 0, fat_time, fat_date, fat_date,
                        (dir_cluster >> 16) & 0xFFFF,
                        fat_time, fat_date,
                        dir_cluster & 0xFFFF,
                        0
                    )
                    entries_bytes.extend(sfn_entry)
                    subdirs_to_process.append((item_path, dir_cluster))
                else:
                    file_size = os.path.getsize(item_path)
                    if file_size > 0:
                        first_c, clist = allocate_clusters(file_size)
                        with open(item_path, 'rb') as f:
                            file_data = f.read()
                        write_cluster_data(first_c, file_data)
                    else:
                        first_c = 0
                    
                    sfn_entry = struct.pack('<11sBBBHHHHHHII',
                        sfn, attr, 0, 0, fat_time, fat_date, fat_date,
                        (first_c >> 16) & 0xFFFF,
                        fat_time, fat_date,
                        first_c & 0xFFFF,
                        file_size
                    )
                    entries_bytes.extend(sfn_entry)
            
            return entries_bytes, subdirs_to_process

        print(f"Scanning and writing files from {source_dir}...")
        root_data, subdirs = process_directory(source_dir, is_root=True)
        if len(root_data) < cluster_size:
            root_data = root_data.ljust(cluster_size, b'\x00')
        write_cluster_data(root_dir_cluster, root_data)
        
        queue = subdirs
        while queue:
            current_path, current_cluster = queue.pop(0)
            dir_data, child_subdirs = process_directory(current_path, is_root=False)
            if len(dir_data) < cluster_size:
                dir_data = dir_data.ljust(cluster_size, b'\x00')
            write_cluster_data(current_cluster, dir_data)
            queue.extend(child_subdirs)
        
        print(f"Writing FAT tables (allocated {next_cluster - 2} clusters)...")
        fat_bytes = bytearray(fat_size_sectors * sector_size)
        for idx, val in enumerate(fat_entries):
            struct.pack_into('<I', fat_bytes, idx * 4, val & 0x0FFFFFFF)
        
        img.seek(reserved_sectors * sector_size)
        img.write(fat_bytes)
        img.seek((reserved_sectors + fat_size_sectors) * sector_size)
        img.write(fat_bytes)
        
        free_clusters = total_data_clusters - (next_cluster - 2)
        struct.pack_into('<II', fsinfo, 488, free_clusters, next_cluster)
        img.seek(1 * sector_size)
        img.write(fsinfo)
        img.seek(7 * sector_size)
        img.write(fsinfo)
    
    print(f"SUCCESS: SD image created at {output_img_path} ({os.path.getsize(output_img_path)} bytes, Free Clusters: {free_clusters})")

if __name__ == '__main__':
    src = sys.argv[1] if len(sys.argv) > 1 else r"N:\BIOS\HANDHELDS\DSi GAMES"
    out = sys.argv[2] if len(sys.argv) > 2 else r"N:\BIOS\HANDHELDS\sd.bin"
    size = int(sys.argv[3]) if len(sys.argv) > 3 else 2048
    create_fat32_image(src, out, size)
