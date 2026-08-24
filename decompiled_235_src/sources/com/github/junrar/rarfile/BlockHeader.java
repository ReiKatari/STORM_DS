package com.github.junrar.rarfile;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BlockHeader extends BaseBlock {
    public static final short blockHeaderSize = 4;
    private static final ry3 logger = sy3.d(BlockHeader.class);
    private long dataSize;
    private long packSize;

    public BlockHeader(BlockHeader blockHeader) {
        super(blockHeader);
        long dataSize = blockHeader.getDataSize();
        this.packSize = dataSize;
        this.dataSize = dataSize;
        this.positionInFile = blockHeader.getPositionInFile();
    }

    public long getDataSize() {
        return this.dataSize;
    }

    public long getPackSize() {
        return this.packSize;
    }

    @Override // com.github.junrar.rarfile.BaseBlock
    public void print() {
        super.print();
        ry3 ry3Var = logger;
        if (ry3Var.e()) {
            ry3Var.a(Long.valueOf(getDataSize()), Long.valueOf(getPackSize()));
        }
    }

    public BlockHeader() {
    }

    public BlockHeader(BaseBlock baseBlock, byte[] bArr) {
        super(baseBlock);
        long readIntLittleEndianAsLong = Raw.readIntLittleEndianAsLong(bArr, 0);
        this.packSize = readIntLittleEndianAsLong;
        this.dataSize = readIntLittleEndianAsLong;
    }
}
