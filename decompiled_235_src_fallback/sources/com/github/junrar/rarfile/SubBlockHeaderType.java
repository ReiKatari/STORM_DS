package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum SubBlockHeaderType extends java.lang.Enum<com.github.junrar.rarfile.SubBlockHeaderType> {
    private static final /* synthetic */ com.github.junrar.rarfile.SubBlockHeaderType[] $VALUES = null;
    public static final com.github.junrar.rarfile.SubBlockHeaderType BEEA_HEAD = null;
    public static final com.github.junrar.rarfile.SubBlockHeaderType EA_HEAD = null;
    public static final com.github.junrar.rarfile.SubBlockHeaderType MAC_HEAD = null;
    public static final com.github.junrar.rarfile.SubBlockHeaderType NTACL_HEAD = null;
    public static final com.github.junrar.rarfile.SubBlockHeaderType STREAM_HEAD = null;
    public static final com.github.junrar.rarfile.SubBlockHeaderType UO_HEAD = null;
    private final short subblocktype;

    static {
            com.github.junrar.rarfile.SubBlockHeaderType r0 = new com.github.junrar.rarfile.SubBlockHeaderType
            r1 = 0
            r2 = 256(0x100, float:3.59E-43)
            java.lang.String r3 = "EA_HEAD"
            r0.<init>(r3, r1, r2)
            com.github.junrar.rarfile.SubBlockHeaderType.EA_HEAD = r0
            com.github.junrar.rarfile.SubBlockHeaderType r1 = new com.github.junrar.rarfile.SubBlockHeaderType
            r2 = 1
            r3 = 257(0x101, float:3.6E-43)
            java.lang.String r4 = "UO_HEAD"
            r1.<init>(r4, r2, r3)
            com.github.junrar.rarfile.SubBlockHeaderType.UO_HEAD = r1
            com.github.junrar.rarfile.SubBlockHeaderType r2 = new com.github.junrar.rarfile.SubBlockHeaderType
            r3 = 2
            r4 = 258(0x102, float:3.62E-43)
            java.lang.String r5 = "MAC_HEAD"
            r2.<init>(r5, r3, r4)
            com.github.junrar.rarfile.SubBlockHeaderType.MAC_HEAD = r2
            com.github.junrar.rarfile.SubBlockHeaderType r3 = new com.github.junrar.rarfile.SubBlockHeaderType
            r4 = 3
            r5 = 259(0x103, float:3.63E-43)
            java.lang.String r6 = "BEEA_HEAD"
            r3.<init>(r6, r4, r5)
            com.github.junrar.rarfile.SubBlockHeaderType.BEEA_HEAD = r3
            com.github.junrar.rarfile.SubBlockHeaderType r4 = new com.github.junrar.rarfile.SubBlockHeaderType
            r5 = 4
            r6 = 260(0x104, float:3.64E-43)
            java.lang.String r7 = "NTACL_HEAD"
            r4.<init>(r7, r5, r6)
            com.github.junrar.rarfile.SubBlockHeaderType.NTACL_HEAD = r4
            com.github.junrar.rarfile.SubBlockHeaderType r5 = new com.github.junrar.rarfile.SubBlockHeaderType
            r6 = 5
            r7 = 261(0x105, float:3.66E-43)
            java.lang.String r8 = "STREAM_HEAD"
            r5.<init>(r8, r6, r7)
            com.github.junrar.rarfile.SubBlockHeaderType.STREAM_HEAD = r5
            com.github.junrar.rarfile.SubBlockHeaderType[] r0 = new com.github.junrar.rarfile.SubBlockHeaderType[]{r0, r1, r2, r3, r4, r5}
            com.github.junrar.rarfile.SubBlockHeaderType.$VALUES = r0
            return
    }

    SubBlockHeaderType(java.lang.String r1, int r2, short r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.subblocktype = r3
            return
    }

    public static com.github.junrar.rarfile.SubBlockHeaderType findSubblockHeaderType(short r2) {
            com.github.junrar.rarfile.SubBlockHeaderType r0 = com.github.junrar.rarfile.SubBlockHeaderType.EA_HEAD
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L9
            return r0
        L9:
            com.github.junrar.rarfile.SubBlockHeaderType r0 = com.github.junrar.rarfile.SubBlockHeaderType.UO_HEAD
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L12
            return r0
        L12:
            com.github.junrar.rarfile.SubBlockHeaderType r0 = com.github.junrar.rarfile.SubBlockHeaderType.MAC_HEAD
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L1b
            return r0
        L1b:
            com.github.junrar.rarfile.SubBlockHeaderType r0 = com.github.junrar.rarfile.SubBlockHeaderType.BEEA_HEAD
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L24
            return r0
        L24:
            com.github.junrar.rarfile.SubBlockHeaderType r0 = com.github.junrar.rarfile.SubBlockHeaderType.NTACL_HEAD
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L2d
            return r0
        L2d:
            com.github.junrar.rarfile.SubBlockHeaderType r0 = com.github.junrar.rarfile.SubBlockHeaderType.STREAM_HEAD
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L36
            return r0
        L36:
            r2 = 0
            return r2
    }

    public static com.github.junrar.rarfile.SubBlockHeaderType valueOf(java.lang.String r1) {
            java.lang.Class<com.github.junrar.rarfile.SubBlockHeaderType> r0 = com.github.junrar.rarfile.SubBlockHeaderType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.junrar.rarfile.SubBlockHeaderType r1 = (com.github.junrar.rarfile.SubBlockHeaderType) r1
            return r1
    }

    public static com.github.junrar.rarfile.SubBlockHeaderType[] values() {
            com.github.junrar.rarfile.SubBlockHeaderType[] r0 = com.github.junrar.rarfile.SubBlockHeaderType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.junrar.rarfile.SubBlockHeaderType[] r0 = (com.github.junrar.rarfile.SubBlockHeaderType[]) r0
            return r0
    }

    public boolean equals(short r1) {
            r0 = this;
            short r0 = r0.subblocktype
            if (r0 != r1) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public short getSubblocktype() {
            r0 = this;
            short r0 = r0.subblocktype
            return r0
    }
}
