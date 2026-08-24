package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MainHeader extends com.github.junrar.rarfile.BaseBlock {
    private static final defpackage.ry3 logger = null;
    public static final short mainHeaderSize = 6;
    public static final short mainHeaderSizeWithEnc = 7;
    private byte encryptVersion;
    private final short highPosAv;
    private final int posAv;

    static {
            java.lang.Class<com.github.junrar.rarfile.MainHeader> r0 = com.github.junrar.rarfile.MainHeader.class
            ry3 r0 = defpackage.sy3.d(r0)
            com.github.junrar.rarfile.MainHeader.logger = r0
            return
    }

    public MainHeader(com.github.junrar.rarfile.BaseBlock r2, byte[] r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            short r2 = com.github.junrar.io.Raw.readShortLittleEndian(r3, r2)
            r1.highPosAv = r2
            r2 = 2
            int r2 = com.github.junrar.io.Raw.readIntLittleEndian(r3, r2)
            r1.posAv = r2
            boolean r2 = r1.hasEncryptVersion()
            if (r2 == 0) goto L22
            byte r2 = r1.encryptVersion
            r0 = 6
            r3 = r3[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2 = r2 | r3
            byte r2 = (byte) r2
            r1.encryptVersion = r2
        L22:
            return
    }

    public byte getEncryptVersion() {
            r0 = this;
            byte r0 = r0.encryptVersion
            return r0
    }

    public short getHighPosAv() {
            r0 = this;
            short r0 = r0.highPosAv
            return r0
    }

    public int getPosAv() {
            r0 = this;
            int r0 = r0.posAv
            return r0
    }

    public boolean hasArchCmt() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isAV() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 32
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isEncrypted() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isFirstVolume() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isLocked() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isMultiVolume() {
            r1 = this;
            short r1 = r1.flags
            r0 = 1
            r1 = r1 & r0
            if (r1 == 0) goto L7
            return r0
        L7:
            r1 = 0
            return r1
    }

    public boolean isNewNumbering() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isProtected() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 64
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean isSolid() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 8
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.github.junrar.rarfile.BaseBlock
    public void print() {
            r3 = this;
            super.print()
            ry3 r0 = com.github.junrar.rarfile.MainHeader.logger
            boolean r1 = r0.e()
            if (r1 == 0) goto Lac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "posav: "
            r1.<init>(r2)
            int r2 = r3.getPosAv()
            r1.append(r2)
            java.lang.String r2 = "\nhighposav: "
            r1.append(r2)
            short r2 = r3.getHighPosAv()
            r1.append(r2)
            java.lang.String r2 = "\nhasencversion: "
            r1.append(r2)
            boolean r2 = r3.hasEncryptVersion()
            r1.append(r2)
            boolean r2 = r3.hasEncryptVersion()
            if (r2 == 0) goto L40
            byte r2 = r3.getEncryptVersion()
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            goto L42
        L40:
            java.lang.String r2 = ""
        L42:
            r1.append(r2)
            java.lang.String r2 = "\nhasarchcmt: "
            r1.append(r2)
            boolean r2 = r3.hasArchCmt()
            r1.append(r2)
            java.lang.String r2 = "\nisEncrypted: "
            r1.append(r2)
            boolean r2 = r3.isEncrypted()
            r1.append(r2)
            java.lang.String r2 = "\nisMultivolume: "
            r1.append(r2)
            boolean r2 = r3.isMultiVolume()
            r1.append(r2)
            java.lang.String r2 = "\nisFirstvolume: "
            r1.append(r2)
            boolean r2 = r3.isFirstVolume()
            r1.append(r2)
            java.lang.String r2 = "\nisSolid: "
            r1.append(r2)
            boolean r2 = r3.isSolid()
            r1.append(r2)
            java.lang.String r2 = "\nisLocked: "
            r1.append(r2)
            boolean r2 = r3.isLocked()
            r1.append(r2)
            java.lang.String r2 = "\nisProtected: "
            r1.append(r2)
            boolean r2 = r3.isProtected()
            r1.append(r2)
            java.lang.String r2 = "\nisAV: "
            r1.append(r2)
            boolean r3 = r3.isAV()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.o(r3)
        Lac:
            return
    }
}
