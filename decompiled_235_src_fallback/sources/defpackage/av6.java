package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av6  reason: default package */
/* loaded from: classes.dex */
public enum av6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.av6[] $VALUES = null;
    public static final defpackage.av6 WITHOUT_FEATURE_COMBO = null;
    public static final defpackage.av6 WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT = null;
    public static final defpackage.av6 WITH_FEATURE_COMBO = null;

    private static final /* synthetic */ defpackage.av6[] $values() {
            av6 r0 = defpackage.av6.WITHOUT_FEATURE_COMBO
            av6 r1 = defpackage.av6.WITH_FEATURE_COMBO
            av6 r2 = defpackage.av6.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT
            av6[] r0 = new defpackage.av6[]{r0, r1, r2}
            return r0
    }

    static {
            av6 r0 = new av6
            java.lang.String r1 = "WITHOUT_FEATURE_COMBO"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.av6.WITHOUT_FEATURE_COMBO = r0
            av6 r0 = new av6
            java.lang.String r1 = "WITH_FEATURE_COMBO"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.av6.WITH_FEATURE_COMBO = r0
            av6 r0 = new av6
            java.lang.String r1 = "WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.av6.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT = r0
            av6[] r0 = $values()
            defpackage.av6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.av6.$ENTRIES = r0
            return
    }

    av6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.av6.$ENTRIES
            return r0
    }

    public static defpackage.av6 valueOf(java.lang.String r1) {
            java.lang.Class<av6> r0 = defpackage.av6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            av6 r1 = (defpackage.av6) r1
            return r1
    }

    public static defpackage.av6[] values() {
            av6[] r0 = defpackage.av6.$VALUES
            java.lang.Object r0 = r0.clone()
            av6[] r0 = (defpackage.av6[]) r0
            return r0
    }
}
