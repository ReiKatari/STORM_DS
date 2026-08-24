package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum UnrarHeadertype extends java.lang.Enum<com.github.junrar.rarfile.UnrarHeadertype> {
    private static final /* synthetic */ com.github.junrar.rarfile.UnrarHeadertype[] $VALUES = null;
    public static final com.github.junrar.rarfile.UnrarHeadertype AvHeader = null;
    public static final com.github.junrar.rarfile.UnrarHeadertype CommHeader = null;
    public static final com.github.junrar.rarfile.UnrarHeadertype EndArcHeader = null;
    public static final com.github.junrar.rarfile.UnrarHeadertype FileHeader = null;
    public static final com.github.junrar.rarfile.UnrarHeadertype MainHeader = null;
    public static final com.github.junrar.rarfile.UnrarHeadertype MarkHeader = null;
    public static final com.github.junrar.rarfile.UnrarHeadertype NewSubHeader = null;
    public static final com.github.junrar.rarfile.UnrarHeadertype ProtectHeader = null;
    public static final com.github.junrar.rarfile.UnrarHeadertype SignHeader = null;
    public static final com.github.junrar.rarfile.UnrarHeadertype SubHeader = null;
    private final byte headerByte;

    static {
            com.github.junrar.rarfile.UnrarHeadertype r0 = new com.github.junrar.rarfile.UnrarHeadertype
            r1 = 0
            r2 = 115(0x73, float:1.61E-43)
            java.lang.String r3 = "MainHeader"
            r0.<init>(r3, r1, r2)
            com.github.junrar.rarfile.UnrarHeadertype.MainHeader = r0
            com.github.junrar.rarfile.UnrarHeadertype r1 = new com.github.junrar.rarfile.UnrarHeadertype
            r2 = 1
            r3 = 114(0x72, float:1.6E-43)
            java.lang.String r4 = "MarkHeader"
            r1.<init>(r4, r2, r3)
            com.github.junrar.rarfile.UnrarHeadertype.MarkHeader = r1
            com.github.junrar.rarfile.UnrarHeadertype r2 = new com.github.junrar.rarfile.UnrarHeadertype
            r3 = 2
            r4 = 116(0x74, float:1.63E-43)
            java.lang.String r5 = "FileHeader"
            r2.<init>(r5, r3, r4)
            com.github.junrar.rarfile.UnrarHeadertype.FileHeader = r2
            com.github.junrar.rarfile.UnrarHeadertype r3 = new com.github.junrar.rarfile.UnrarHeadertype
            r4 = 3
            r5 = 117(0x75, float:1.64E-43)
            java.lang.String r6 = "CommHeader"
            r3.<init>(r6, r4, r5)
            com.github.junrar.rarfile.UnrarHeadertype.CommHeader = r3
            com.github.junrar.rarfile.UnrarHeadertype r4 = new com.github.junrar.rarfile.UnrarHeadertype
            r5 = 4
            r6 = 118(0x76, float:1.65E-43)
            java.lang.String r7 = "AvHeader"
            r4.<init>(r7, r5, r6)
            com.github.junrar.rarfile.UnrarHeadertype.AvHeader = r4
            com.github.junrar.rarfile.UnrarHeadertype r5 = new com.github.junrar.rarfile.UnrarHeadertype
            r6 = 5
            r7 = 119(0x77, float:1.67E-43)
            java.lang.String r8 = "SubHeader"
            r5.<init>(r8, r6, r7)
            com.github.junrar.rarfile.UnrarHeadertype.SubHeader = r5
            com.github.junrar.rarfile.UnrarHeadertype r6 = new com.github.junrar.rarfile.UnrarHeadertype
            r7 = 6
            r8 = 120(0x78, float:1.68E-43)
            java.lang.String r9 = "ProtectHeader"
            r6.<init>(r9, r7, r8)
            com.github.junrar.rarfile.UnrarHeadertype.ProtectHeader = r6
            com.github.junrar.rarfile.UnrarHeadertype r7 = new com.github.junrar.rarfile.UnrarHeadertype
            r8 = 7
            r9 = 121(0x79, float:1.7E-43)
            java.lang.String r10 = "SignHeader"
            r7.<init>(r10, r8, r9)
            com.github.junrar.rarfile.UnrarHeadertype.SignHeader = r7
            com.github.junrar.rarfile.UnrarHeadertype r8 = new com.github.junrar.rarfile.UnrarHeadertype
            r9 = 8
            r10 = 122(0x7a, float:1.71E-43)
            java.lang.String r11 = "NewSubHeader"
            r8.<init>(r11, r9, r10)
            com.github.junrar.rarfile.UnrarHeadertype.NewSubHeader = r8
            com.github.junrar.rarfile.UnrarHeadertype r9 = new com.github.junrar.rarfile.UnrarHeadertype
            r10 = 9
            r11 = 123(0x7b, float:1.72E-43)
            java.lang.String r12 = "EndArcHeader"
            r9.<init>(r12, r10, r11)
            com.github.junrar.rarfile.UnrarHeadertype.EndArcHeader = r9
            com.github.junrar.rarfile.UnrarHeadertype[] r0 = new com.github.junrar.rarfile.UnrarHeadertype[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            com.github.junrar.rarfile.UnrarHeadertype.$VALUES = r0
            return
    }

    UnrarHeadertype(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.headerByte = r3
            return
    }

    public static com.github.junrar.rarfile.UnrarHeadertype findType(byte r2) {
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.MarkHeader
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L9
            return r0
        L9:
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.MainHeader
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L12
            return r0
        L12:
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.FileHeader
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L1b
            return r0
        L1b:
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.EndArcHeader
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L24
            return r0
        L24:
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.NewSubHeader
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L2d
            return r0
        L2d:
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.SubHeader
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L36
            return r0
        L36:
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.SignHeader
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L3f
            return r0
        L3f:
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.ProtectHeader
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L48
            return r0
        L48:
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.CommHeader
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L51
            return r0
        L51:
            com.github.junrar.rarfile.UnrarHeadertype r0 = com.github.junrar.rarfile.UnrarHeadertype.AvHeader
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L5a
            return r0
        L5a:
            r2 = 0
            return r2
    }

    public static com.github.junrar.rarfile.UnrarHeadertype valueOf(java.lang.String r1) {
            java.lang.Class<com.github.junrar.rarfile.UnrarHeadertype> r0 = com.github.junrar.rarfile.UnrarHeadertype.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.junrar.rarfile.UnrarHeadertype r1 = (com.github.junrar.rarfile.UnrarHeadertype) r1
            return r1
    }

    public static com.github.junrar.rarfile.UnrarHeadertype[] values() {
            com.github.junrar.rarfile.UnrarHeadertype[] r0 = com.github.junrar.rarfile.UnrarHeadertype.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.junrar.rarfile.UnrarHeadertype[] r0 = (com.github.junrar.rarfile.UnrarHeadertype[]) r0
            return r0
    }

    public boolean equals(byte r1) {
            r0 = this;
            byte r0 = r0.headerByte
            if (r0 != r1) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public byte getHeaderByte() {
            r0 = this;
            byte r0 = r0.headerByte
            return r0
    }
}
