package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t50  reason: default package */
/* loaded from: classes.dex */
public final class t50 extends u25 {
    public static final t50 c = new u25(u50.a);

    @Override // defpackage.m0
    public final int i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(ux0 ux0Var, int i, Object obj) {
        r50 r50Var = (r50) obj;
        r50Var.getClass();
        boolean W = ux0Var.W(this.b, i);
        r50Var.b(r50Var.d() + 1);
        boolean[] zArr = r50Var.a;
        int i2 = r50Var.b;
        r50Var.b = i2 + 1;
        zArr[i2] = W;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, r50] */
    @Override // defpackage.m0
    public final Object l(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        ?? obj2 = new Object();
        obj2.a = zArr;
        obj2.b = zArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.u25
    public final Object o() {
        return new boolean[0];
    }

    @Override // defpackage.u25
    public final void p(vx0 vx0Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        vx0Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vx0Var.u(this.b, i2, zArr[i2]);
        }
    }
}
