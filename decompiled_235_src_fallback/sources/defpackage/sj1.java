package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sj1  reason: default package */
/* loaded from: classes.dex */
public enum sj1 extends java.lang.Enum implements java.util.concurrent.Executor {
    private static final /* synthetic */ defpackage.sj1[] $VALUES = null;
    public static final defpackage.sj1 INSTANCE = null;

    static {
            sj1 r0 = new sj1
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.sj1.INSTANCE = r0
            sj1[] r0 = new defpackage.sj1[]{r0}
            defpackage.sj1.$VALUES = r0
            return
    }

    sj1(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.sj1 valueOf(java.lang.String r1) {
            java.lang.Class<sj1> r0 = defpackage.sj1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            sj1 r1 = (defpackage.sj1) r1
            return r1
    }

    public static defpackage.sj1[] values() {
            sj1[] r0 = defpackage.sj1.$VALUES
            java.lang.Object r0 = r0.clone()
            sj1[] r0 = (defpackage.sj1[]) r0
            return r0
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r1) {
            r0 = this;
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
