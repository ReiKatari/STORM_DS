package com.github.junrar.rarfile;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SubBlockHeader extends BlockHeader {
    public static final short SubBlockHeaderSize = 3;
    private static final ry3 logger = sy3.d(SubBlockHeader.class);
    private byte level;
    private final short subType;

    public SubBlockHeader(BlockHeader blockHeader, byte[] bArr) {
        super(blockHeader);
        this.subType = Raw.readShortLittleEndian(bArr, 0);
        this.level = (byte) (this.level | (bArr[2] & 255));
    }

    public byte getLevel() {
        return this.level;
    }

    public SubBlockHeaderType getSubType() {
        return SubBlockHeaderType.findSubblockHeaderType(this.subType);
    }

    @Override // com.github.junrar.rarfile.BlockHeader, com.github.junrar.rarfile.BaseBlock
    public void print() {
        super.print();
        ry3 ry3Var = logger;
        if (ry3Var.e()) {
            ry3Var.b(getSubType(), "subtype: {}");
            ry3Var.b(Byte.valueOf(this.level), "level: {}");
        }
    }

    public SubBlockHeader(SubBlockHeader subBlockHeader) {
        super(subBlockHeader);
        this.subType = subBlockHeader.getSubType().getSubblocktype();
        this.level = subBlockHeader.getLevel();
    }
}
