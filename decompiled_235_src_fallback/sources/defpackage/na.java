package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: na  reason: default package */
/* loaded from: classes.dex */
public enum na extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.na[] $VALUES = null;
    public static final defpackage.na ADRENO_6XX = null;
    public static final defpackage.na ADRENO_7XX = null;
    public static final defpackage.na ADRENO_8XX = null;
    public static final defpackage.na ADRENO_OTHER = null;
    public static final defpackage.na NON_ADRENO = null;
    private final java.lang.String displayName;

    private static final /* synthetic */ defpackage.na[] $values() {
            na r0 = defpackage.na.ADRENO_8XX
            na r1 = defpackage.na.ADRENO_7XX
            na r2 = defpackage.na.ADRENO_6XX
            na r3 = defpackage.na.ADRENO_OTHER
            na r4 = defpackage.na.NON_ADRENO
            na[] r0 = new defpackage.na[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            na r0 = new na
            r1 = 0
            java.lang.String r2 = "Adreno 8xx (Snapdragon 8 Elite / Gen 4)"
            java.lang.String r3 = "ADRENO_8XX"
            r0.<init>(r3, r1, r2)
            defpackage.na.ADRENO_8XX = r0
            na r0 = new na
            r1 = 1
            java.lang.String r2 = "Adreno 7xx (Snapdragon 8 Gen 1/2/3, 7+ Gen 2)"
            java.lang.String r3 = "ADRENO_7XX"
            r0.<init>(r3, r1, r2)
            defpackage.na.ADRENO_7XX = r0
            na r0 = new na
            r1 = 2
            java.lang.String r2 = "Adreno 6xx (Snapdragon 865/870/888, 778G)"
            java.lang.String r3 = "ADRENO_6XX"
            r0.<init>(r3, r1, r2)
            defpackage.na.ADRENO_6XX = r0
            na r0 = new na
            r1 = 3
            java.lang.String r2 = "Qualcomm Adreno (Legacy/Other)"
            java.lang.String r3 = "ADRENO_OTHER"
            r0.<init>(r3, r1, r2)
            defpackage.na.ADRENO_OTHER = r0
            na r0 = new na
            r1 = 4
            java.lang.String r2 = "Не-Adreno GPU"
            java.lang.String r3 = "NON_ADRENO"
            r0.<init>(r3, r1, r2)
            defpackage.na.NON_ADRENO = r0
            na[] r0 = $values()
            defpackage.na.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.na.$ENTRIES = r0
            return
    }

    na(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.displayName = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.na.$ENTRIES
            return r0
    }

    public static defpackage.na valueOf(java.lang.String r1) {
            java.lang.Class<na> r0 = defpackage.na.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            na r1 = (defpackage.na) r1
            return r1
    }

    public static defpackage.na[] values() {
            na[] r0 = defpackage.na.$VALUES
            java.lang.Object r0 = r0.clone()
            na[] r0 = (defpackage.na[]) r0
            return r0
    }

    public final java.lang.String getDisplayName() {
            r0 = this;
            java.lang.String r0 = r0.displayName
            return r0
    }
}
