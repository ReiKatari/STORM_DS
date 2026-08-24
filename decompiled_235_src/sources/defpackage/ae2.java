package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ae2  reason: default package */
/* loaded from: classes.dex */
public final class ae2 extends u25 {
    public static final ae2 c = new u25(be2.a);

    @Override // defpackage.m0
    public final int i(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.ct0, defpackage.m0
    public final void k(ux0 ux0Var, int i, Object obj) {
        yd2 yd2Var = (yd2) obj;
        yd2Var.getClass();
        float p = ux0Var.p(this.b, i);
        yd2Var.b(yd2Var.d() + 1);
        float[] fArr = yd2Var.a;
        int i2 = yd2Var.b;
        yd2Var.b = i2 + 1;
        fArr[i2] = p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [yd2, java.lang.Object] */
    @Override // defpackage.m0
    public final Object l(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        ?? obj2 = new Object();
        obj2.a = fArr;
        obj2.b = fArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.u25
    public final Object o() {
        return new float[0];
    }

    @Override // defpackage.u25
    public final void p(vx0 vx0Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        vx0Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            vx0Var.f0(this.b, i2, fArr[i2]);
        }
    }
}
