package com.github.junrar.rarfile;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class EndArcHeader extends BaseBlock {
    public static final short endArcArchiveDataCrcSize = 4;
    public static final short endArcVolumeNumberSize = 2;
    private int archiveDataCRC;
    private short volumeNumber;

    public EndArcHeader(BaseBlock baseBlock, byte[] bArr) {
        super(baseBlock);
        int i = 0;
        if (hasArchiveDataCRC()) {
            this.archiveDataCRC = Raw.readIntLittleEndian(bArr, 0);
            i = 4;
        }
        if (hasVolumeNumber()) {
            this.volumeNumber = Raw.readShortLittleEndian(bArr, i);
        }
    }

    public int getArchiveDataCRC() {
        return this.archiveDataCRC;
    }

    public short getVolumeNumber() {
        return this.volumeNumber;
    }

    public boolean isValid() {
        if (getHeadCRC() != 15812 || getHeaderType() != UnrarHeadertype.EndArcHeader || getFlags() != 16384 || getHeaderSize(false) != 7) {
            return false;
        }
        return true;
    }
}
