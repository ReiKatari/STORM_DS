package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum VMStandardFilters extends java.lang.Enum<com.github.junrar.unpack.vm.VMStandardFilters> {
    private static final /* synthetic */ com.github.junrar.unpack.vm.VMStandardFilters[] $VALUES = null;
    public static final com.github.junrar.unpack.vm.VMStandardFilters VMSF_AUDIO = null;
    public static final com.github.junrar.unpack.vm.VMStandardFilters VMSF_DELTA = null;
    public static final com.github.junrar.unpack.vm.VMStandardFilters VMSF_E8 = null;
    public static final com.github.junrar.unpack.vm.VMStandardFilters VMSF_E8E9 = null;
    public static final com.github.junrar.unpack.vm.VMStandardFilters VMSF_ITANIUM = null;
    public static final com.github.junrar.unpack.vm.VMStandardFilters VMSF_NONE = null;
    public static final com.github.junrar.unpack.vm.VMStandardFilters VMSF_RGB = null;
    public static final com.github.junrar.unpack.vm.VMStandardFilters VMSF_UPCASE = null;
    private final int filter;

    static {
            com.github.junrar.unpack.vm.VMStandardFilters r0 = new com.github.junrar.unpack.vm.VMStandardFilters
            java.lang.String r1 = "VMSF_NONE"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.github.junrar.unpack.vm.VMStandardFilters.VMSF_NONE = r0
            com.github.junrar.unpack.vm.VMStandardFilters r1 = new com.github.junrar.unpack.vm.VMStandardFilters
            java.lang.String r2 = "VMSF_E8"
            r3 = 1
            r1.<init>(r2, r3, r3)
            com.github.junrar.unpack.vm.VMStandardFilters.VMSF_E8 = r1
            com.github.junrar.unpack.vm.VMStandardFilters r2 = new com.github.junrar.unpack.vm.VMStandardFilters
            java.lang.String r3 = "VMSF_E8E9"
            r4 = 2
            r2.<init>(r3, r4, r4)
            com.github.junrar.unpack.vm.VMStandardFilters.VMSF_E8E9 = r2
            com.github.junrar.unpack.vm.VMStandardFilters r3 = new com.github.junrar.unpack.vm.VMStandardFilters
            java.lang.String r4 = "VMSF_ITANIUM"
            r5 = 3
            r3.<init>(r4, r5, r5)
            com.github.junrar.unpack.vm.VMStandardFilters.VMSF_ITANIUM = r3
            com.github.junrar.unpack.vm.VMStandardFilters r4 = new com.github.junrar.unpack.vm.VMStandardFilters
            java.lang.String r5 = "VMSF_RGB"
            r6 = 4
            r4.<init>(r5, r6, r6)
            com.github.junrar.unpack.vm.VMStandardFilters.VMSF_RGB = r4
            com.github.junrar.unpack.vm.VMStandardFilters r5 = new com.github.junrar.unpack.vm.VMStandardFilters
            java.lang.String r6 = "VMSF_AUDIO"
            r7 = 5
            r5.<init>(r6, r7, r7)
            com.github.junrar.unpack.vm.VMStandardFilters.VMSF_AUDIO = r5
            com.github.junrar.unpack.vm.VMStandardFilters r6 = new com.github.junrar.unpack.vm.VMStandardFilters
            java.lang.String r7 = "VMSF_DELTA"
            r8 = 6
            r6.<init>(r7, r8, r8)
            com.github.junrar.unpack.vm.VMStandardFilters.VMSF_DELTA = r6
            com.github.junrar.unpack.vm.VMStandardFilters r7 = new com.github.junrar.unpack.vm.VMStandardFilters
            java.lang.String r8 = "VMSF_UPCASE"
            r9 = 7
            r7.<init>(r8, r9, r9)
            com.github.junrar.unpack.vm.VMStandardFilters.VMSF_UPCASE = r7
            com.github.junrar.unpack.vm.VMStandardFilters[] r0 = new com.github.junrar.unpack.vm.VMStandardFilters[]{r0, r1, r2, r3, r4, r5, r6, r7}
            com.github.junrar.unpack.vm.VMStandardFilters.$VALUES = r0
            return
    }

    VMStandardFilters(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.filter = r3
            return
    }

    public static com.github.junrar.unpack.vm.VMStandardFilters findFilter(int r2) {
            com.github.junrar.unpack.vm.VMStandardFilters r0 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_NONE
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L9
            return r0
        L9:
            com.github.junrar.unpack.vm.VMStandardFilters r0 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_E8
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L12
            return r0
        L12:
            com.github.junrar.unpack.vm.VMStandardFilters r0 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_E8E9
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L1b
            return r0
        L1b:
            com.github.junrar.unpack.vm.VMStandardFilters r0 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_ITANIUM
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L24
            return r0
        L24:
            com.github.junrar.unpack.vm.VMStandardFilters r0 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_RGB
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L2d
            return r0
        L2d:
            com.github.junrar.unpack.vm.VMStandardFilters r0 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_AUDIO
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L36
            return r0
        L36:
            com.github.junrar.unpack.vm.VMStandardFilters r0 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_DELTA
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L3f
            return r0
        L3f:
            com.github.junrar.unpack.vm.VMStandardFilters r0 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_UPCASE
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L48
            return r0
        L48:
            r2 = 0
            return r2
    }

    public static com.github.junrar.unpack.vm.VMStandardFilters valueOf(java.lang.String r1) {
            java.lang.Class<com.github.junrar.unpack.vm.VMStandardFilters> r0 = com.github.junrar.unpack.vm.VMStandardFilters.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.junrar.unpack.vm.VMStandardFilters r1 = (com.github.junrar.unpack.vm.VMStandardFilters) r1
            return r1
    }

    public static com.github.junrar.unpack.vm.VMStandardFilters[] values() {
            com.github.junrar.unpack.vm.VMStandardFilters[] r0 = com.github.junrar.unpack.vm.VMStandardFilters.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.junrar.unpack.vm.VMStandardFilters[] r0 = (com.github.junrar.unpack.vm.VMStandardFilters[]) r0
            return r0
    }

    public boolean equals(int r1) {
            r0 = this;
            int r0 = r0.filter
            if (r0 != r1) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int getFilter() {
            r0 = this;
            int r0 = r0.filter
            return r0
    }
}
