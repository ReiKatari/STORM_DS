package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: ik4  reason: default package */
/* loaded from: classes.dex */
public enum ik4 extends java.lang.Enum<defpackage.ik4> {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ik4[] $VALUES = null;
    private static final defpackage.go3 $cachedSerializer$delegate = null;
    public static final defpackage.hk4 Companion = null;
    public static final defpackage.ik4 OFFLINE_AFTER_START = null;
    public static final defpackage.ik4 OFFLINE_FROM_START = null;
    public static final defpackage.ik4 UNKNOWN = null;

    private static final /* synthetic */ defpackage.ik4[] $values() {
            ik4 r0 = defpackage.ik4.UNKNOWN
            ik4 r1 = defpackage.ik4.OFFLINE_FROM_START
            ik4 r2 = defpackage.ik4.OFFLINE_AFTER_START
            ik4[] r0 = new defpackage.ik4[]{r0, r1, r2}
            return r0
    }

    static {
            ik4 r0 = new ik4
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ik4.UNKNOWN = r0
            ik4 r0 = new ik4
            java.lang.String r1 = "OFFLINE_FROM_START"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ik4.OFFLINE_FROM_START = r0
            ik4 r0 = new ik4
            java.lang.String r1 = "OFFLINE_AFTER_START"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ik4.OFFLINE_AFTER_START = r0
            ik4[] r0 = $values()
            defpackage.ik4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ik4.$ENTRIES = r0
            hk4 r0 = new hk4
            r0.<init>()
            defpackage.ik4.Companion = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            pi3 r1 = new pi3
            r2 = 23
            r1.<init>(r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            defpackage.ik4.$cachedSerializer$delegate = r0
            return
    }

    ik4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static final defpackage.gg3 _init_$_anonymous_() {
            ik4[] r0 = values()
            r0.getClass()
            v52 r1 = new v52
            java.lang.String r2 = "me.magnum.melonds.impl.retroachievements.offline.OfflineUnlockType"
            r1.<init>(r2, r0)
            return r1
    }

    public static /* synthetic */ defpackage.gg3 a() {
            gg3 r0 = _init_$_anonymous_()
            return r0
    }

    public static final /* synthetic */ defpackage.go3 access$get$cachedSerializer$delegate$cp() {
            go3 r0 = defpackage.ik4.$cachedSerializer$delegate
            return r0
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ik4.$ENTRIES
            return r0
    }

    public static defpackage.ik4 valueOf(java.lang.String r1) {
            java.lang.Class<ik4> r0 = defpackage.ik4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ik4 r1 = (defpackage.ik4) r1
            return r1
    }

    public static defpackage.ik4[] values() {
            ik4[] r0 = defpackage.ik4.$VALUES
            java.lang.Object r0 = r0.clone()
            ik4[] r0 = (defpackage.ik4[]) r0
            return r0
    }
}
