package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dm1  reason: default package */
/* loaded from: classes.dex */
public final class dm1 extends u25 {
    public static final dm1 c = new u25(hm1.a);

    @Override // defpackage.m0
    public final int i(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(ux0 ux0Var, int i, Object obj) {
        bm1 bm1Var = (bm1) obj;
        bm1Var.getClass();
        double t = ux0Var.t(this.b, i);
        bm1Var.b(bm1Var.d() + 1);
        double[] dArr = bm1Var.a;
        int i2 = bm1Var.b;
        bm1Var.b = i2 + 1;
        dArr[i2] = t;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bm1, java.lang.Object] */
    @Override // defpackage.m0
    public final Object l(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        ?? obj2 = new Object();
        obj2.a = dArr;
        obj2.b = dArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.u25
    public final Object o() {
        return new double[0];
    }

    @Override // defpackage.u25
    public final void p(vx0 vx0Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        vx0Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vx0Var.d(this.b, i2, dArr[i2]);
        }
    }
}
