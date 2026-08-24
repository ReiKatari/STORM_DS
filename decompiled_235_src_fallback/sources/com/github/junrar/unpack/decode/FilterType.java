package com.github.junrar.unpack.decode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum FilterType extends java.lang.Enum<com.github.junrar.unpack.decode.FilterType> {
    private static final /* synthetic */ com.github.junrar.unpack.decode.FilterType[] $VALUES = null;
    public static final com.github.junrar.unpack.decode.FilterType FILTER_AUDIO = null;
    public static final com.github.junrar.unpack.decode.FilterType FILTER_DELTA = null;
    public static final com.github.junrar.unpack.decode.FilterType FILTER_E8 = null;
    public static final com.github.junrar.unpack.decode.FilterType FILTER_E8E9 = null;
    public static final com.github.junrar.unpack.decode.FilterType FILTER_E8E9V2 = null;
    public static final com.github.junrar.unpack.decode.FilterType FILTER_ITANIUM = null;
    public static final com.github.junrar.unpack.decode.FilterType FILTER_NONE = null;
    public static final com.github.junrar.unpack.decode.FilterType FILTER_PPM = null;
    public static final com.github.junrar.unpack.decode.FilterType FILTER_RGB = null;
    public static final com.github.junrar.unpack.decode.FilterType FILTER_UPCASETOLOW = null;

    static {
            com.github.junrar.unpack.decode.FilterType r0 = new com.github.junrar.unpack.decode.FilterType
            java.lang.String r1 = "FILTER_NONE"
            r2 = 0
            r0.<init>(r1, r2)
            com.github.junrar.unpack.decode.FilterType.FILTER_NONE = r0
            com.github.junrar.unpack.decode.FilterType r1 = new com.github.junrar.unpack.decode.FilterType
            java.lang.String r2 = "FILTER_PPM"
            r3 = 1
            r1.<init>(r2, r3)
            com.github.junrar.unpack.decode.FilterType.FILTER_PPM = r1
            com.github.junrar.unpack.decode.FilterType r2 = new com.github.junrar.unpack.decode.FilterType
            java.lang.String r3 = "FILTER_E8"
            r4 = 2
            r2.<init>(r3, r4)
            com.github.junrar.unpack.decode.FilterType.FILTER_E8 = r2
            com.github.junrar.unpack.decode.FilterType r3 = new com.github.junrar.unpack.decode.FilterType
            java.lang.String r4 = "FILTER_E8E9"
            r5 = 3
            r3.<init>(r4, r5)
            com.github.junrar.unpack.decode.FilterType.FILTER_E8E9 = r3
            com.github.junrar.unpack.decode.FilterType r4 = new com.github.junrar.unpack.decode.FilterType
            java.lang.String r5 = "FILTER_UPCASETOLOW"
            r6 = 4
            r4.<init>(r5, r6)
            com.github.junrar.unpack.decode.FilterType.FILTER_UPCASETOLOW = r4
            com.github.junrar.unpack.decode.FilterType r5 = new com.github.junrar.unpack.decode.FilterType
            java.lang.String r6 = "FILTER_AUDIO"
            r7 = 5
            r5.<init>(r6, r7)
            com.github.junrar.unpack.decode.FilterType.FILTER_AUDIO = r5
            com.github.junrar.unpack.decode.FilterType r6 = new com.github.junrar.unpack.decode.FilterType
            java.lang.String r7 = "FILTER_RGB"
            r8 = 6
            r6.<init>(r7, r8)
            com.github.junrar.unpack.decode.FilterType.FILTER_RGB = r6
            com.github.junrar.unpack.decode.FilterType r7 = new com.github.junrar.unpack.decode.FilterType
            java.lang.String r8 = "FILTER_DELTA"
            r9 = 7
            r7.<init>(r8, r9)
            com.github.junrar.unpack.decode.FilterType.FILTER_DELTA = r7
            com.github.junrar.unpack.decode.FilterType r8 = new com.github.junrar.unpack.decode.FilterType
            java.lang.String r9 = "FILTER_ITANIUM"
            r10 = 8
            r8.<init>(r9, r10)
            com.github.junrar.unpack.decode.FilterType.FILTER_ITANIUM = r8
            com.github.junrar.unpack.decode.FilterType r9 = new com.github.junrar.unpack.decode.FilterType
            java.lang.String r10 = "FILTER_E8E9V2"
            r11 = 9
            r9.<init>(r10, r11)
            com.github.junrar.unpack.decode.FilterType.FILTER_E8E9V2 = r9
            com.github.junrar.unpack.decode.FilterType[] r0 = new com.github.junrar.unpack.decode.FilterType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            com.github.junrar.unpack.decode.FilterType.$VALUES = r0
            return
    }

    FilterType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.github.junrar.unpack.decode.FilterType valueOf(java.lang.String r1) {
            java.lang.Class<com.github.junrar.unpack.decode.FilterType> r0 = com.github.junrar.unpack.decode.FilterType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.junrar.unpack.decode.FilterType r1 = (com.github.junrar.unpack.decode.FilterType) r1
            return r1
    }

    public static com.github.junrar.unpack.decode.FilterType[] values() {
            com.github.junrar.unpack.decode.FilterType[] r0 = com.github.junrar.unpack.decode.FilterType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.junrar.unpack.decode.FilterType[] r0 = (com.github.junrar.unpack.decode.FilterType[]) r0
            return r0
    }
}
