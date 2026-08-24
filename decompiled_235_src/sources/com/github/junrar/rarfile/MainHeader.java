package com.github.junrar.rarfile;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MainHeader extends BaseBlock {
    private static final ry3 logger = sy3.d(MainHeader.class);
    public static final short mainHeaderSize = 6;
    public static final short mainHeaderSizeWithEnc = 7;
    private byte encryptVersion;
    private final short highPosAv;
    private final int posAv;

    public MainHeader(BaseBlock baseBlock, byte[] bArr) {
        super(baseBlock);
        this.highPosAv = Raw.readShortLittleEndian(bArr, 0);
        this.posAv = Raw.readIntLittleEndian(bArr, 2);
        if (hasEncryptVersion()) {
            this.encryptVersion = (byte) (this.encryptVersion | (bArr[6] & 255));
        }
    }

    public byte getEncryptVersion() {
        return this.encryptVersion;
    }

    public short getHighPosAv() {
        return this.highPosAv;
    }

    public int getPosAv() {
        return this.posAv;
    }

    public boolean hasArchCmt() {
        if ((this.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isAV() {
        if ((this.flags & 32) != 0) {
            return true;
        }
        return false;
    }

    public boolean isEncrypted() {
        if ((this.flags & 128) != 0) {
            return true;
        }
        return false;
    }

    public boolean isFirstVolume() {
        if ((this.flags & 256) != 0) {
            return true;
        }
        return false;
    }

    public boolean isLocked() {
        if ((this.flags & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean isMultiVolume() {
        if ((this.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isNewNumbering() {
        if ((this.flags & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isProtected() {
        if ((this.flags & 64) != 0) {
            return true;
        }
        return false;
    }

    public boolean isSolid() {
        if ((this.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.github.junrar.rarfile.BaseBlock
    public void print() {
        Object obj;
        super.print();
        ry3 ry3Var = logger;
        if (ry3Var.e()) {
            StringBuilder sb = new StringBuilder("posav: ");
            sb.append(getPosAv());
            sb.append("\nhighposav: ");
            sb.append((int) getHighPosAv());
            sb.append("\nhasencversion: ");
            sb.append(hasEncryptVersion());
            if (hasEncryptVersion()) {
                obj = Byte.valueOf(getEncryptVersion());
            } else {
                obj = "";
            }
            sb.append(obj);
            sb.append("\nhasarchcmt: ");
            sb.append(hasArchCmt());
            sb.append("\nisEncrypted: ");
            sb.append(isEncrypted());
            sb.append("\nisMultivolume: ");
            sb.append(isMultiVolume());
            sb.append("\nisFirstvolume: ");
            sb.append(isFirstVolume());
            sb.append("\nisSolid: ");
            sb.append(isSolid());
            sb.append("\nisLocked: ");
            sb.append(isLocked());
            sb.append("\nisProtected: ");
            sb.append(isProtected());
            sb.append("\nisAV: ");
            sb.append(isAV());
            ry3Var.o(sb.toString());
        }
    }
}
