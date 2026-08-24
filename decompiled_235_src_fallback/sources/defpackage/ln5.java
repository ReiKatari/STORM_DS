package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ln5  reason: default package */
/* loaded from: classes.dex */
public enum ln5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ln5[] $VALUES = null;
    public static final defpackage.ln5 BUILT_IN = null;
    public static final defpackage.kn5 Companion = null;
    public static final defpackage.ln5 RA_OFFLINE_PROXY = null;
    private final java.lang.String preferenceValue;

    private static final /* synthetic */ defpackage.ln5[] $values() {
            ln5 r0 = defpackage.ln5.BUILT_IN
            ln5 r1 = defpackage.ln5.RA_OFFLINE_PROXY
            ln5[] r0 = new defpackage.ln5[]{r0, r1}
            return r0
    }

    static {
            ln5 r0 = new ln5
            r1 = 0
            java.lang.String r2 = "built_in"
            java.lang.String r3 = "BUILT_IN"
            r0.<init>(r3, r1, r2)
            defpackage.ln5.BUILT_IN = r0
            ln5 r0 = new ln5
            r1 = 1
            java.lang.String r2 = "ra_offline_proxy"
            java.lang.String r3 = "RA_OFFLINE_PROXY"
            r0.<init>(r3, r1, r2)
            defpackage.ln5.RA_OFFLINE_PROXY = r0
            ln5[] r0 = $values()
            defpackage.ln5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ln5.$ENTRIES = r0
            kn5 r0 = new kn5
            r0.<init>()
            defpackage.ln5.Companion = r0
            return
    }

    ln5(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.preferenceValue = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ln5.$ENTRIES
            return r0
    }

    public static defpackage.ln5 valueOf(java.lang.String r1) {
            java.lang.Class<ln5> r0 = defpackage.ln5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ln5 r1 = (defpackage.ln5) r1
            return r1
    }

    public static defpackage.ln5[] values() {
            ln5[] r0 = defpackage.ln5.$VALUES
            java.lang.Object r0 = r0.clone()
            ln5[] r0 = (defpackage.ln5[]) r0
            return r0
    }

    public final java.lang.String getPreferenceValue() {
            r0 = this;
            java.lang.String r0 = r0.preferenceValue
            return r0
    }
}
