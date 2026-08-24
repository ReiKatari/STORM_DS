package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fs2  reason: default package */
/* loaded from: classes.dex */
public enum fs2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.fs2[] $VALUES = null;
    public static final defpackage.es2 Companion = null;
    public static final defpackage.fs2 STABLE = null;
    public static final defpackage.fs2 STABLE_AND_PRERELEASE = null;
    private final java.lang.String preferenceValue;

    private static final /* synthetic */ defpackage.fs2[] $values() {
            fs2 r0 = defpackage.fs2.STABLE
            fs2 r1 = defpackage.fs2.STABLE_AND_PRERELEASE
            fs2[] r0 = new defpackage.fs2[]{r0, r1}
            return r0
    }

    static {
            fs2 r0 = new fs2
            r1 = 0
            java.lang.String r2 = "stable"
            java.lang.String r3 = "STABLE"
            r0.<init>(r3, r1, r2)
            defpackage.fs2.STABLE = r0
            fs2 r0 = new fs2
            r1 = 1
            java.lang.String r2 = "stable_and_prerelease"
            java.lang.String r3 = "STABLE_AND_PRERELEASE"
            r0.<init>(r3, r1, r2)
            defpackage.fs2.STABLE_AND_PRERELEASE = r0
            fs2[] r0 = $values()
            defpackage.fs2.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.fs2.$ENTRIES = r0
            es2 r0 = new es2
            r0.<init>()
            defpackage.fs2.Companion = r0
            return
    }

    fs2(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.preferenceValue = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.fs2.$ENTRIES
            return r0
    }

    public static defpackage.fs2 valueOf(java.lang.String r1) {
            java.lang.Class<fs2> r0 = defpackage.fs2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            fs2 r1 = (defpackage.fs2) r1
            return r1
    }

    public static defpackage.fs2[] values() {
            fs2[] r0 = defpackage.fs2.$VALUES
            java.lang.Object r0 = r0.clone()
            fs2[] r0 = (defpackage.fs2[]) r0
            return r0
    }

    public final java.lang.String getPreferenceValue() {
            r0 = this;
            java.lang.String r0 = r0.preferenceValue
            return r0
    }
}
