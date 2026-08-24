package com.github.junrar.rarfile;

import com.github.junrar.io.Raw;
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
    private static final ry3 logger = sy3.d(BaseBlock.class);
    protected short flags;
    protected short headCRC;
    protected short headerSize;
    protected byte headerType;
    protected long positionInFile;

    public BaseBlock(BaseBlock baseBlock) {
        this.headCRC = (short) 0;
        this.headerType = (byte) 0;
        this.flags = (short) 0;
        this.headerSize = (short) 0;
        this.flags = baseBlock.getFlags();
        this.headCRC = baseBlock.getHeadCRC();
        this.headerType = baseBlock.getHeaderType().getHeaderByte();
        this.headerSize = baseBlock.getHeaderSize(false);
        this.positionInFile = baseBlock.getPositionInFile();
    }

    private short getHeaderPaddingSize() {
        return (short) (((~this.headerSize) + 1) & 15);
    }

    public short getFlags() {
        return this.flags;
    }

    public short getHeadCRC() {
        return this.headCRC;
    }

    public short getHeaderSize(boolean z) {
        short s = this.headerSize;
        if (z) {
            return (short) (s + getHeaderPaddingSize());
        }
        return s;
    }

    public UnrarHeadertype getHeaderType() {
        return UnrarHeadertype.findType(this.headerType);
    }

    public long getPositionInFile() {
        return this.positionInFile;
    }

    public boolean hasArchiveDataCRC() {
        if ((this.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasEncryptVersion() {
        if ((this.flags & 512) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasVolumeNumber() {
        if ((this.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean isSubBlock() {
        if (UnrarHeadertype.SubHeader.equals(this.headerType)) {
            return true;
        }
        if (UnrarHeadertype.NewSubHeader.equals(this.headerType) && (this.flags & 16) != 0) {
            return true;
        }
        return false;
    }

    public void print() {
        ry3 ry3Var = logger;
        if (ry3Var.e()) {
            ry3Var.o("HeaderType: " + getHeaderType() + "\nHeadCRC: " + Integer.toHexString(getHeadCRC()) + "\nFlags: " + Integer.toHexString(getFlags()) + "\nHeaderSize: " + ((int) getHeaderSize(false)) + "\nPosition in file: " + getPositionInFile());
        }
    }

    public void setPositionInFile(long j) {
        this.positionInFile = j;
    }

    @Deprecated
    public short getHeaderSize() {
        return this.headerSize;
    }

    public BaseBlock() {
        this.headCRC = (short) 0;
        this.headerType = (byte) 0;
        this.flags = (short) 0;
        this.headerSize = (short) 0;
    }

    public BaseBlock(byte[] bArr) {
        this.headCRC = (short) 0;
        this.headerType = (byte) 0;
        this.flags = (short) 0;
        this.headerSize = (short) 0;
        this.headCRC = Raw.readShortLittleEndian(bArr, 0);
        this.headerType = (byte) (this.headerType | (bArr[2] & 255));
        this.flags = Raw.readShortLittleEndian(bArr, 3);
        this.headerSize = Raw.readShortLittleEndian(bArr, 5);
    }
}
