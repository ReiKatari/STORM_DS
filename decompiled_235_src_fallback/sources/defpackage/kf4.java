package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kf4  reason: default package */
/* loaded from: classes.dex */
public enum kf4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.kf4[] $VALUES = null;
    public static final defpackage.kf4 CONNECTED = null;
    public static final defpackage.kf4 METERED = null;
    public static final defpackage.kf4 NOT_REQUIRED = null;
    public static final defpackage.kf4 NOT_ROAMING = null;
    public static final defpackage.kf4 TEMPORARILY_UNMETERED = null;
    public static final defpackage.kf4 UNMETERED = null;

    private static final /* synthetic */ defpackage.kf4[] $values() {
            kf4 r0 = defpackage.kf4.NOT_REQUIRED
            kf4 r1 = defpackage.kf4.CONNECTED
            kf4 r2 = defpackage.kf4.UNMETERED
            kf4 r3 = defpackage.kf4.NOT_ROAMING
            kf4 r4 = defpackage.kf4.METERED
            kf4 r5 = defpackage.kf4.TEMPORARILY_UNMETERED
            kf4[] r0 = new defpackage.kf4[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    static {
            kf4 r0 = new kf4
            java.lang.String r1 = "NOT_REQUIRED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.kf4.NOT_REQUIRED = r0
            kf4 r0 = new kf4
            java.lang.String r1 = "CONNECTED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.kf4.CONNECTED = r0
            kf4 r0 = new kf4
            java.lang.String r1 = "UNMETERED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.kf4.UNMETERED = r0
            kf4 r0 = new kf4
            java.lang.String r1 = "NOT_ROAMING"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.kf4.NOT_ROAMING = r0
            kf4 r0 = new kf4
            java.lang.String r1 = "METERED"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.kf4.METERED = r0
            kf4 r0 = new kf4
            java.lang.String r1 = "TEMPORARILY_UNMETERED"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.kf4.TEMPORARILY_UNMETERED = r0
            kf4[] r0 = $values()
            defpackage.kf4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.kf4.$ENTRIES = r0
            return
    }

    kf4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.kf4.$ENTRIES
            return r0
    }

    public static defpackage.kf4 valueOf(java.lang.String r1) {
            java.lang.Class<kf4> r0 = defpackage.kf4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kf4 r1 = (defpackage.kf4) r1
            return r1
    }

    public static defpackage.kf4[] values() {
            kf4[] r0 = defpackage.kf4.$VALUES
            java.lang.Object r0 = r0.clone()
            kf4[] r0 = (defpackage.kf4[]) r0
            return r0
    }
}
