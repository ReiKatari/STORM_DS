package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oo4  reason: default package */
/* loaded from: classes.dex */
public enum oo4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.oo4[] $VALUES = null;
    public static final defpackage.oo4 DROP_WORK_REQUEST = null;
    public static final defpackage.oo4 RUN_AS_NON_EXPEDITED_WORK_REQUEST = null;

    private static final /* synthetic */ defpackage.oo4[] $values() {
            oo4 r0 = defpackage.oo4.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            oo4 r1 = defpackage.oo4.DROP_WORK_REQUEST
            oo4[] r0 = new defpackage.oo4[]{r0, r1}
            return r0
    }

    static {
            oo4 r0 = new oo4
            java.lang.String r1 = "RUN_AS_NON_EXPEDITED_WORK_REQUEST"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.oo4.RUN_AS_NON_EXPEDITED_WORK_REQUEST = r0
            oo4 r0 = new oo4
            java.lang.String r1 = "DROP_WORK_REQUEST"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.oo4.DROP_WORK_REQUEST = r0
            oo4[] r0 = $values()
            defpackage.oo4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.oo4.$ENTRIES = r0
            return
    }

    oo4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.oo4.$ENTRIES
            return r0
    }

    public static defpackage.oo4 valueOf(java.lang.String r1) {
            java.lang.Class<oo4> r0 = defpackage.oo4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            oo4 r1 = (defpackage.oo4) r1
            return r1
    }

    public static defpackage.oo4[] values() {
            oo4[] r0 = defpackage.oo4.$VALUES
            java.lang.Object r0 = r0.clone()
            oo4[] r0 = (defpackage.oo4[]) r0
            return r0
    }
}
