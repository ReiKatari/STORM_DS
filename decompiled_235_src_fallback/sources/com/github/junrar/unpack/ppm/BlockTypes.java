package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum BlockTypes extends java.lang.Enum<com.github.junrar.unpack.ppm.BlockTypes> {
    private static final /* synthetic */ com.github.junrar.unpack.ppm.BlockTypes[] $VALUES = null;
    public static final com.github.junrar.unpack.ppm.BlockTypes BLOCK_LZ = null;
    public static final com.github.junrar.unpack.ppm.BlockTypes BLOCK_PPM = null;
    private final int blockType;

    static {
            com.github.junrar.unpack.ppm.BlockTypes r0 = new com.github.junrar.unpack.ppm.BlockTypes
            java.lang.String r1 = "BLOCK_LZ"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.github.junrar.unpack.ppm.BlockTypes.BLOCK_LZ = r0
            com.github.junrar.unpack.ppm.BlockTypes r1 = new com.github.junrar.unpack.ppm.BlockTypes
            java.lang.String r2 = "BLOCK_PPM"
            r3 = 1
            r1.<init>(r2, r3, r3)
            com.github.junrar.unpack.ppm.BlockTypes.BLOCK_PPM = r1
            com.github.junrar.unpack.ppm.BlockTypes[] r0 = new com.github.junrar.unpack.ppm.BlockTypes[]{r0, r1}
            com.github.junrar.unpack.ppm.BlockTypes.$VALUES = r0
            return
    }

    BlockTypes(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.blockType = r3
            return
    }

    public static com.github.junrar.unpack.ppm.BlockTypes findBlockType(int r2) {
            com.github.junrar.unpack.ppm.BlockTypes r0 = com.github.junrar.unpack.ppm.BlockTypes.BLOCK_LZ
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L9
            return r0
        L9:
            com.github.junrar.unpack.ppm.BlockTypes r0 = com.github.junrar.unpack.ppm.BlockTypes.BLOCK_PPM
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L12
            return r0
        L12:
            r2 = 0
            return r2
    }

    public static com.github.junrar.unpack.ppm.BlockTypes valueOf(java.lang.String r1) {
            java.lang.Class<com.github.junrar.unpack.ppm.BlockTypes> r0 = com.github.junrar.unpack.ppm.BlockTypes.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.junrar.unpack.ppm.BlockTypes r1 = (com.github.junrar.unpack.ppm.BlockTypes) r1
            return r1
    }

    public static com.github.junrar.unpack.ppm.BlockTypes[] values() {
            com.github.junrar.unpack.ppm.BlockTypes[] r0 = com.github.junrar.unpack.ppm.BlockTypes.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.junrar.unpack.ppm.BlockTypes[] r0 = (com.github.junrar.unpack.ppm.BlockTypes[]) r0
            return r0
    }

    public boolean equals(int r1) {
            r0 = this;
            int r0 = r0.blockType
            if (r0 != r1) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int getBlockType() {
            r0 = this;
            int r0 = r0.blockType
            return r0
    }
}
