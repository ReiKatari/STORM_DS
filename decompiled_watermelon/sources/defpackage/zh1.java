package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zh1  reason: default package */
/* loaded from: classes.dex */
public final class zh1 extends st4 {
    public static final zh1 c = new st4(ci1.a);

    @Override // defpackage.l0
    public final int i(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.pq0, defpackage.l0
    public final void k(yu0 yu0Var, int i, Object obj) {
        xh1 xh1Var = (xh1) obj;
        xh1Var.getClass();
        double y = yu0Var.y(this.b, i);
        xh1Var.b(xh1Var.d() + 1);
        double[] dArr = xh1Var.a;
        int i2 = xh1Var.b;
        xh1Var.b = i2 + 1;
        dArr[i2] = y;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [xh1, java.lang.Object] */
    @Override // defpackage.l0
    public final Object l(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        ?? obj2 = new Object();
        obj2.a = dArr;
        obj2.b = dArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.st4
    public final Object o() {
        return new double[0];
    }

    @Override // defpackage.st4
    public final void p(zu0 zu0Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        zu0Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            zu0Var.d(this.b, i2, dArr[i2]);
        }
    }
}
