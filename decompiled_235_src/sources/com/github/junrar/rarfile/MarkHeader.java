package com.github.junrar.rarfile;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MarkHeader extends BaseBlock {
    private final ry3 logger;
    private RARVersion version;

    public MarkHeader(BaseBlock baseBlock) {
        super(baseBlock);
        this.logger = sy3.e(MarkHeader.class.getName());
    }

    public RARVersion getVersion() {
        return this.version;
    }

    public boolean isOldFormat() {
        return RARVersion.isOldFormat(this.version);
    }

    public boolean isSignature() {
        byte[] bArr = new byte[7];
        Raw.writeShortLittleEndian(bArr, 0, this.headCRC);
        bArr[2] = this.headerType;
        Raw.writeShortLittleEndian(bArr, 3, this.flags);
        Raw.writeShortLittleEndian(bArr, 5, this.headerSize);
        if (bArr[0] == 82) {
            byte b = bArr[1];
            if (b == 69 && bArr[2] == 126 && bArr[3] == 94) {
                this.version = RARVersion.OLD;
            } else if (b == 97 && bArr[2] == 114 && bArr[3] == 33 && bArr[4] == 26 && bArr[5] == 7) {
                byte b2 = bArr[6];
                if (b2 == 0) {
                    this.version = RARVersion.V4;
                } else if (b2 == 1) {
                    this.version = RARVersion.V5;
                }
            }
        }
        RARVersion rARVersion = this.version;
        if (rARVersion != RARVersion.OLD && rARVersion != RARVersion.V4) {
            return false;
        }
        return true;
    }

    public boolean isValid() {
        if (getHeadCRC() != 24914 || getHeaderType() != UnrarHeadertype.MarkHeader || getFlags() != 6689 || getHeaderSize(false) != 7) {
            return false;
        }
        return true;
    }

    @Override // com.github.junrar.rarfile.BaseBlock
    public void print() {
        super.print();
        if (this.logger.e()) {
            this.logger.b(Boolean.valueOf(isValid()), "valid: {}");
        }
    }
}
