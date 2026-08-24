package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vy3  reason: default package */
/* loaded from: classes.dex */
public final class vy3 extends u25 {
    public static final vy3 c = new u25(fz3.a);

    @Override // defpackage.m0
    public final int i(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(ux0 ux0Var, int i, Object obj) {
        ty3 ty3Var = (ty3) obj;
        ty3Var.getClass();
        long c0 = ux0Var.c0(this.b, i);
        ty3Var.b(ty3Var.d() + 1);
        long[] jArr = ty3Var.a;
        int i2 = ty3Var.b;
        ty3Var.b = i2 + 1;
        jArr[i2] = c0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ty3] */
    @Override // defpackage.m0
    public final Object l(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        ?? obj2 = new Object();
        obj2.a = jArr;
        obj2.b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.u25
    public final Object o() {
        return new long[0];
    }

    @Override // defpackage.u25
    public final void p(vx0 vx0Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        vx0Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vx0Var.n(this.b, i2, jArr[i2]);
        }
    }
}
