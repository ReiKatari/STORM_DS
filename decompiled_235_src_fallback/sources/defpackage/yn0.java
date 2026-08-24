package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yn0  reason: default package */
/* loaded from: classes.dex */
public enum yn0 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.yn0[] $VALUES = null;
    public static final defpackage.yn0 FAILED = null;
    public static final defpackage.yn0 FINISHED = null;
    public static final defpackage.yn0 NOT_IMPORTING = null;
    public static final defpackage.yn0 ONGOING = null;
    public static final defpackage.yn0 STARTING = null;

    private static final /* synthetic */ defpackage.yn0[] $values() {
            yn0 r0 = defpackage.yn0.NOT_IMPORTING
            yn0 r1 = defpackage.yn0.STARTING
            yn0 r2 = defpackage.yn0.ONGOING
            yn0 r3 = defpackage.yn0.FINISHED
            yn0 r4 = defpackage.yn0.FAILED
            yn0[] r0 = new defpackage.yn0[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            yn0 r0 = new yn0
            java.lang.String r1 = "NOT_IMPORTING"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.yn0.NOT_IMPORTING = r0
            yn0 r0 = new yn0
            java.lang.String r1 = "STARTING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.yn0.STARTING = r0
            yn0 r0 = new yn0
            java.lang.String r1 = "ONGOING"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.yn0.ONGOING = r0
            yn0 r0 = new yn0
            java.lang.String r1 = "FINISHED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.yn0.FINISHED = r0
            yn0 r0 = new yn0
            java.lang.String r1 = "FAILED"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.yn0.FAILED = r0
            yn0[] r0 = $values()
            defpackage.yn0.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.yn0.$ENTRIES = r0
            return
    }

    yn0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.yn0.$ENTRIES
            return r0
    }

    public static defpackage.yn0 valueOf(java.lang.String r1) {
            java.lang.Class<yn0> r0 = defpackage.yn0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            yn0 r1 = (defpackage.yn0) r1
            return r1
    }

    public static defpackage.yn0[] values() {
            yn0[] r0 = defpackage.yn0.$VALUES
            java.lang.Object r0 = r0.clone()
            yn0[] r0 = (defpackage.yn0[]) r0
            return r0
    }
}
