package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q77  reason: default package */
/* loaded from: classes.dex */
public enum q77 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.q77[] $VALUES = null;
    public static final defpackage.q77 HARDCORE = null;
    public static final defpackage.q77 SOFTCORE = null;
    public static final defpackage.q77 SOFTCORE_OFFLINE = null;

    private static final /* synthetic */ defpackage.q77[] $values() {
            q77 r0 = defpackage.q77.SOFTCORE
            q77 r1 = defpackage.q77.HARDCORE
            q77 r2 = defpackage.q77.SOFTCORE_OFFLINE
            q77[] r0 = new defpackage.q77[]{r0, r1, r2}
            return r0
    }

    static {
            q77 r0 = new q77
            java.lang.String r1 = "SOFTCORE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.q77.SOFTCORE = r0
            q77 r0 = new q77
            java.lang.String r1 = "HARDCORE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.q77.HARDCORE = r0
            q77 r0 = new q77
            java.lang.String r1 = "SOFTCORE_OFFLINE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.q77.SOFTCORE_OFFLINE = r0
            q77[] r0 = $values()
            defpackage.q77.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.q77.$ENTRIES = r0
            return
    }

    q77(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.q77.$ENTRIES
            return r0
    }

    public static defpackage.q77 valueOf(java.lang.String r1) {
            java.lang.Class<q77> r0 = defpackage.q77.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            q77 r1 = (defpackage.q77) r1
            return r1
    }

    public static defpackage.q77[] values() {
            q77[] r0 = defpackage.q77.$VALUES
            java.lang.Object r0 = r0.clone()
            q77[] r0 = (defpackage.q77[]) r0
            return r0
    }
}
