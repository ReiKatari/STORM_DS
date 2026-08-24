package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BaseBlock {
    public static final short BaseBlockSize = 7;
    public static final short EARC_DATACRC = 2;
    public static final short EARC_NEXT_VOLUME = 1;
    public static final short EARC_REVSPACE = 4;
    public static final short EARC_VOLNUMBER = 8;
    public static final short LHD_COMMENT = 8;
    public static final short LHD_DIRECTORY = 224;
    public static final short LHD_EXTFLAGS = 8192;
    public static final short LHD_EXTTIME = 4096;
    public static final short LHD_LARGE = 256;
    public static final short LHD_PASSWORD = 4;
    public static final short LHD_SALT = 1024;
    public static final short LHD_SOLID = 16;
    public static final short LHD_SPLIT_AFTER = 2;
    public static final short LHD_SPLIT_BEFORE = 1;
    public static final short LHD_UNICODE = 512;
    public static final short LHD_VERSION = 2048;
    public static final short LHD_WINDOW1024 = 128;
    public static final short LHD_WINDOW128 = 32;
    public static final short LHD_WINDOW2048 = 160;
    public static final short LHD_WINDOW256 = 64;
    public static final short LHD_WINDOW4096 = 192;
    public static final short LHD_WINDOW512 = 96;
    public static final short LHD_WINDOW64 = 0;
    public static final short LHD_WINDOWMASK = 224;
    public static final short LONG_BLOCK = Short.MIN_VALUE;
    public static final short MHD_AV = 32;
    public static final short MHD_COMMENT = 2;
    public static final short MHD_ENCRYPTVER = 512;
    public static final short MHD_FIRSTVOLUME = 256;
    public static final short MHD_LOCK = 4;
    public static final short MHD_NEWNUMBERING = 16;
    public static final short MHD_PACK_COMMENT = 16;
    public static final short MHD_PASSWORD = 128;
    public static final short MHD_PROTECT = 64;
    public static final short MHD_SOLID = 8;
    public static final short MHD_VOLUME = 1;
    public static final short SKIP_IF_UNKNOWN = 16384;
    private static final defpackage.ry3 logger = null;
    protected short flags;
    protected short headCRC;
    protected short headerSize;
    protected byte headerType;
    protected long positionInFile;

    static {
            java.lang.Class<com.github.junrar.rarfile.BaseBlock> r0 = com.github.junrar.rarfile.BaseBlock.class
            ry3 r0 = defpackage.sy3.d(r0)
            com.github.junrar.rarfile.BaseBlock.logger = r0
            return
    }

    public BaseBlock() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.headCRC = r0
            r1.headerType = r0
            r1.flags = r0
            r1.headerSize = r0
            return
    }

    public BaseBlock(com.github.junrar.rarfile.BaseBlock r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.headCRC = r0
            r2.headerType = r0
            r2.flags = r0
            r2.headerSize = r0
            short r1 = r3.getFlags()
            r2.flags = r1
            short r1 = r3.getHeadCRC()
            r2.headCRC = r1
            com.github.junrar.rarfile.UnrarHeadertype r1 = r3.getHeaderType()
            byte r1 = r1.getHeaderByte()
            r2.headerType = r1
            short r0 = r3.getHeaderSize(r0)
            r2.headerSize = r0
            long r0 = r3.getPositionInFile()
            r2.positionInFile = r0
            return
    }

    public BaseBlock(byte[] r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.headCRC = r0
            r2.headerType = r0
            r2.flags = r0
            r2.headerSize = r0
            short r0 = com.github.junrar.io.Raw.readShortLittleEndian(r3, r0)
            r2.headCRC = r0
            byte r0 = r2.headerType
            r1 = 2
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            byte r0 = (byte) r0
            r2.headerType = r0
            r0 = 3
            short r0 = com.github.junrar.io.Raw.readShortLittleEndian(r3, r0)
            r2.flags = r0
            r0 = 5
            short r3 = com.github.junrar.io.Raw.readShortLittleEndian(r3, r0)
            r2.headerSize = r3
            return
    }

    private short getHeaderPaddingSize() {
            r0 = this;
            short r0 = r0.headerSize
            int r0 = ~r0
            int r0 = r0 + 1
            r0 = r0 & 15
            short r0 = (short) r0
            return r0
    }

    public short getFlags() {
            r0 = this;
            short r0 = r0.flags
            return r0
    }

    public short getHeadCRC() {
            r0 = this;
            short r0 = r0.headCRC
            return r0
    }

    @java.lang.Deprecated
    public short getHeaderSize() {
            r0 = this;
            short r0 = r0.headerSize
            return r0
    }

    public short getHeaderSize(boolean r2) {
            r1 = this;
            short r0 = r1.headerSize
            if (r2 == 0) goto Lb
            short r1 = r1.getHeaderPaddingSize()
            int r0 = r0 + r1
            short r1 = (short) r0
            return r1
        Lb:
            return r0
    }

    public com.github.junrar.rarfile.UnrarHeadertype getHeaderType() {
            r0 = this;
            byte r0 = r0.headerType
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.findType(r0)
            return r0
    }

    public long getPositionInFile() {
            r2 = this;
            long r0 = r2.positionInFile
            return r0
    }

    public boolean hasArchiveDataCRC() {
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

    public boolean hasEncryptVersion() {
            r0 = this;
            short r0 = r0.flags
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean hasVolumeNumber() {
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

    public boolean isSubBlock() {
            r3 = this;
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.SubHeader
            byte r1 = r3.headerType
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.NewSubHeader
            byte r2 = r3.headerType
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            short r3 = r3.flags
            r3 = r3 & 16
            if (r3 == 0) goto L1d
            return r1
        L1d:
            r3 = 0
            return r3
    }

    public void print() {
            r4 = this;
            ry3 r0 = com.github.junrar.rarfile.BaseBlock.logger
            boolean r1 = r0.e()
            if (r1 == 0) goto L56
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HeaderType: "
            r1.<init>(r2)
            com.github.junrar.rarfile.UnrarHeadertype r2 = r4.getHeaderType()
            r1.append(r2)
            java.lang.String r2 = "\nHeadCRC: "
            r1.append(r2)
            short r2 = r4.getHeadCRC()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r2 = "\nFlags: "
            r1.append(r2)
            short r2 = r4.getFlags()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r2 = "\nHeaderSize: "
            r1.append(r2)
            r2 = 0
            short r2 = r4.getHeaderSize(r2)
            r1.append(r2)
            java.lang.String r2 = "\nPosition in file: "
            r1.append(r2)
            long r2 = r4.getPositionInFile()
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            r0.o(r4)
        L56:
            return
    }

    public void setPositionInFile(long r1) {
            r0 = this;
            r0.positionInFile = r1
            return
    }
}
