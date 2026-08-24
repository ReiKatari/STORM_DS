package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: dj4  reason: default package */
/* loaded from: classes.dex */
public enum dj4 extends java.lang.Enum<defpackage.dj4> {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.dj4[] $VALUES = null;
    private static final defpackage.go3 $cachedSerializer$delegate = null;
    public static final defpackage.dj4 ACHIEVEMENT_ACK = null;
    public static final defpackage.dj4 ACHIEVEMENT_UNLOCK = null;
    public static final defpackage.cj4 Companion = null;
    public static final defpackage.dj4 SESSION_END = null;
    public static final defpackage.dj4 SESSION_START = null;

    private static final /* synthetic */ defpackage.dj4[] $values() {
            dj4 r0 = defpackage.dj4.SESSION_START
            dj4 r1 = defpackage.dj4.SESSION_END
            dj4 r2 = defpackage.dj4.ACHIEVEMENT_UNLOCK
            dj4 r3 = defpackage.dj4.ACHIEVEMENT_ACK
            dj4[] r0 = new defpackage.dj4[]{r0, r1, r2, r3}
            return r0
    }

    static {
            dj4 r0 = new dj4
            java.lang.String r1 = "SESSION_START"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.dj4.SESSION_START = r0
            dj4 r0 = new dj4
            java.lang.String r1 = "SESSION_END"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.dj4.SESSION_END = r0
            dj4 r0 = new dj4
            java.lang.String r1 = "ACHIEVEMENT_UNLOCK"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.dj4.ACHIEVEMENT_UNLOCK = r0
            dj4 r0 = new dj4
            java.lang.String r1 = "ACHIEVEMENT_ACK"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.dj4.ACHIEVEMENT_ACK = r0
            dj4[] r0 = $values()
            defpackage.dj4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.dj4.$ENTRIES = r0
            cj4 r0 = new cj4
            r0.<init>()
            defpackage.dj4.Companion = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            pi3 r1 = new pi3
            r2 = 19
            r1.<init>(r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            defpackage.dj4.$cachedSerializer$delegate = r0
            return
    }

    dj4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static final defpackage.gg3 _init_$_anonymous_() {
            dj4[] r0 = values()
            r0.getClass()
            v52 r1 = new v52
            java.lang.String r2 = "me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerRecordType"
            r1.<init>(r2, r0)
            return r1
    }

    public static /* synthetic */ defpackage.gg3 a() {
            gg3 r0 = _init_$_anonymous_()
            return r0
    }

    public static final /* synthetic */ defpackage.go3 access$get$cachedSerializer$delegate$cp() {
            go3 r0 = defpackage.dj4.$cachedSerializer$delegate
            return r0
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.dj4.$ENTRIES
            return r0
    }

    public static defpackage.dj4 valueOf(java.lang.String r1) {
            java.lang.Class<dj4> r0 = defpackage.dj4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            dj4 r1 = (defpackage.dj4) r1
            return r1
    }

    public static defpackage.dj4[] values() {
            dj4[] r0 = defpackage.dj4.$VALUES
            java.lang.Object r0 = r0.clone()
            dj4[] r0 = (defpackage.dj4[]) r0
            return r0
    }
}
