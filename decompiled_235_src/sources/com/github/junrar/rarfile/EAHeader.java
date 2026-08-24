package com.github.junrar.rarfile;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class EAHeader extends SubBlockHeader {
    public static final short EAHeaderSize = 10;
    private static final ry3 logger = sy3.d(EAHeader.class);
    private final int EACRC;
    private byte method;
    private final int unpSize;
    private byte unpVer;

    public EAHeader(SubBlockHeader subBlockHeader, byte[] bArr) {
        super(subBlockHeader);
        this.unpSize = Raw.readIntLittleEndian(bArr, 0);
        this.unpVer = (byte) (this.unpVer | (bArr[4] & 255));
        this.method = (byte) (this.method | (bArr[5] & 255));
        this.EACRC = Raw.readIntLittleEndian(bArr, 6);
    }

    public int getEACRC() {
        return this.EACRC;
    }

    public byte getMethod() {
        return this.method;
    }

    public int getUnpSize() {
        return this.unpSize;
    }

    public byte getUnpVer() {
        return this.unpVer;
    }

    @Override // com.github.junrar.rarfile.SubBlockHeader, com.github.junrar.rarfile.BlockHeader, com.github.junrar.rarfile.BaseBlock
    public void print() {
        super.print();
        ry3 ry3Var = logger;
        if (ry3Var.e()) {
            ry3Var.b(Integer.valueOf(this.unpSize), "unpSize: {}");
            ry3Var.b(Byte.valueOf(this.unpVer), "unpVersion: {}");
            ry3Var.b(Byte.valueOf(this.method), "method: {}");
            ry3Var.b(Integer.valueOf(this.EACRC), "EACRC: {}");
        }
    }
}
