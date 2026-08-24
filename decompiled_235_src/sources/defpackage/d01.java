package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d01  reason: default package */
/* loaded from: classes.dex */
public final class d01 extends e01 {
    public final cq5 e;
    public final cq5 f;
    public final float[] g;

    public d01(cq5 cq5Var, cq5 cq5Var2) {
        super(cq5Var2, cq5Var, cq5Var2, null);
        float[] X;
        this.e = cq5Var;
        this.f = cq5Var2;
        float[] fArr = t9.c.b;
        ys7 ys7Var = cq5Var.d;
        float[] fArr2 = cq5Var.i;
        ys7 ys7Var2 = cq5Var2.d;
        float[] fArr3 = cq5Var2.j;
        if (nc1.H(ys7Var, ys7Var2)) {
            X = nc1.X(fArr3, fArr2);
        } else {
            float[] a = ys7Var.a();
            float[] a2 = ys7Var2.a();
            ys7 ys7Var3 = jw2.r;
            X = nc1.X(nc1.H(ys7Var2, ys7Var3) ? fArr3 : nc1.U(nc1.X(nc1.G(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), cq5Var2.i)), nc1.H(ys7Var, ys7Var3) ? fArr2 : nc1.X(nc1.G(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = X;
    }

    @Override // defpackage.e01
    public final long a(long j) {
        float i = kt0.i(j);
        float h = kt0.h(j);
        float f = kt0.f(j);
        float e = kt0.e(j);
        yp5 yp5Var = this.e.p;
        float c = (float) yp5Var.c(i);
        float c2 = (float) yp5Var.c(h);
        float c3 = (float) yp5Var.c(f);
        float[] fArr = this.g;
        float f2 = (fArr[6] * c3) + (fArr[3] * c2) + (fArr[0] * c);
        float f3 = (fArr[7] * c3) + (fArr[4] * c2) + (fArr[1] * c);
        float f4 = fArr[2] * c;
        float f5 = (fArr[8] * c3) + (fArr[5] * c2) + f4;
        cq5 cq5Var = this.f;
        yp5 yp5Var2 = cq5Var.m;
        return hv.a((float) cq5Var.m.c(f2), (float) yp5Var2.c(f3), (float) yp5Var2.c(f5), e, cq5Var);
    }
}
