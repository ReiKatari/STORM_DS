package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tj1  reason: default package */
/* loaded from: classes.dex */
public enum tj1 extends java.lang.Enum implements java.util.concurrent.Executor {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.tj1[] $VALUES = null;
    public static final defpackage.tj1 INSTANCE = null;

    private static final /* synthetic */ defpackage.tj1[] $values() {
            tj1 r0 = defpackage.tj1.INSTANCE
            tj1[] r0 = new defpackage.tj1[]{r0}
            return r0
    }

    static {
            tj1 r0 = new tj1
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.tj1.INSTANCE = r0
            tj1[] r0 = $values()
            defpackage.tj1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.tj1.$ENTRIES = r0
            return
    }

    tj1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.tj1.$ENTRIES
            return r0
    }

    public static defpackage.tj1 valueOf(java.lang.String r1) {
            java.lang.Class<tj1> r0 = defpackage.tj1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            tj1 r1 = (defpackage.tj1) r1
            return r1
    }

    public static defpackage.tj1[] values() {
            tj1[] r0 = defpackage.tj1.$VALUES
            java.lang.Object r0 = r0.clone()
            tj1[] r0 = (defpackage.tj1[]) r0
            return r0
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r1) {
            r0 = this;
            r1.getClass()
            r1.run()
            return
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "DirectExecutor"
            return r0
    }
}
