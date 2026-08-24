package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum BlockTypes {
    BLOCK_LZ(0),
    BLOCK_PPM(1);
    
    private final int blockType;

    BlockTypes(int i) {
        this.blockType = i;
    }

    public static BlockTypes findBlockType(int i) {
        BlockTypes blockTypes = BLOCK_LZ;
        if (blockTypes.equals(i)) {
            return blockTypes;
        }
        BlockTypes blockTypes2 = BLOCK_PPM;
        if (blockTypes2.equals(i)) {
            return blockTypes2;
        }
        return null;
    }

    public boolean equals(int i) {
        if (this.blockType == i) {
            return true;
        }
        return false;
    }

    public int getBlockType() {
        return this.blockType;
    }
}
