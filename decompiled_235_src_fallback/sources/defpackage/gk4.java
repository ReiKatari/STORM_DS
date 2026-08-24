package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: gk4  reason: default package */
/* loaded from: classes.dex */
public enum gk4 extends java.lang.Enum<defpackage.gk4> {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.gk4[] $VALUES = null;
    private static final defpackage.go3 $cachedSerializer$delegate = null;
    public static final defpackage.fk4 Companion = null;
    public static final defpackage.gk4 HARDCORE = null;
    public static final defpackage.gk4 SOFTCORE = null;
    public static final defpackage.gk4 UNKNOWN = null;

    private static final /* synthetic */ defpackage.gk4[] $values() {
            gk4 r0 = defpackage.gk4.UNKNOWN
            gk4 r1 = defpackage.gk4.SOFTCORE
            gk4 r2 = defpackage.gk4.HARDCORE
            gk4[] r0 = new defpackage.gk4[]{r0, r1, r2}
            return r0
    }

    static {
            gk4 r0 = new gk4
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.gk4.UNKNOWN = r0
            gk4 r0 = new gk4
            java.lang.String r1 = "SOFTCORE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.gk4.SOFTCORE = r0
            gk4 r0 = new gk4
            java.lang.String r1 = "HARDCORE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.gk4.HARDCORE = r0
            gk4[] r0 = $values()
            defpackage.gk4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.gk4.$ENTRIES = r0
            fk4 r0 = new fk4
            r0.<init>()
            defpackage.gk4.Companion = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            pi3 r1 = new pi3
            r2 = 22
            r1.<init>(r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            defpackage.gk4.$cachedSerializer$delegate = r0
            return
    }

    gk4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static final defpackage.gg3 _init_$_anonymous_() {
            gk4[] r0 = values()
            r0.getClass()
            v52 r1 = new v52
            java.lang.String r2 = "me.magnum.melonds.impl.retroachievements.offline.OfflineUnlockMode"
            r1.<init>(r2, r0)
            return r1
    }

    public static /* synthetic */ defpackage.gg3 a() {
            gg3 r0 = _init_$_anonymous_()
            return r0
    }

    public static final /* synthetic */ defpackage.go3 access$get$cachedSerializer$delegate$cp() {
            go3 r0 = defpackage.gk4.$cachedSerializer$delegate
            return r0
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.gk4.$ENTRIES
            return r0
    }

    public static defpackage.gk4 valueOf(java.lang.String r1) {
            java.lang.Class<gk4> r0 = defpackage.gk4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            gk4 r1 = (defpackage.gk4) r1
            return r1
    }

    public static defpackage.gk4[] values() {
            gk4[] r0 = defpackage.gk4.$VALUES
            java.lang.Object r0 = r0.clone()
            gk4[] r0 = (defpackage.gk4[]) r0
            return r0
    }
}
