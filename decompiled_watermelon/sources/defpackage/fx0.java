package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fx0  reason: default package */
/* loaded from: classes.dex */
public final class fx0 extends gx0 {
    public final eg5 e;
    public final eg5 f;
    public final float[] g;

    public fx0(eg5 eg5Var, eg5 eg5Var2) {
        super(eg5Var2, eg5Var, eg5Var2, null);
        float[] I;
        this.e = eg5Var;
        this.f = eg5Var2;
        float[] fArr = s9.c.b;
        xd7 xd7Var = eg5Var.d;
        float[] fArr2 = eg5Var.i;
        xd7 xd7Var2 = eg5Var2.d;
        float[] fArr3 = eg5Var2.j;
        if (l.y(xd7Var, xd7Var2)) {
            I = l.I(fArr3, fArr2);
        } else {
            float[] a = xd7Var.a();
            float[] a2 = xd7Var2.a();
            xd7 xd7Var3 = dk7.e;
            I = l.I(l.y(xd7Var2, xd7Var3) ? fArr3 : l.F(l.I(l.u(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), eg5Var2.i)), l.y(xd7Var, xd7Var3) ? fArr2 : l.I(l.u(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = I;
    }

    @Override // defpackage.gx0
    public final long a(long j) {
        float h = xq0.h(j);
        float g = xq0.g(j);
        float e = xq0.e(j);
        float d = xq0.d(j);
        ag5 ag5Var = this.e.p;
        float a = (float) ag5Var.a(h);
        float a2 = (float) ag5Var.a(g);
        float a3 = (float) ag5Var.a(e);
        float[] fArr = this.g;
        float f = (fArr[6] * a3) + (fArr[3] * a2) + (fArr[0] * a);
        float f2 = (fArr[7] * a3) + (fArr[4] * a2) + (fArr[1] * a);
        float f3 = fArr[2] * a;
        float f4 = (fArr[8] * a3) + (fArr[5] * a2) + f3;
        eg5 eg5Var = this.f;
        ag5 ag5Var2 = eg5Var.m;
        return mh7.b((float) eg5Var.m.a(f), (float) ag5Var2.a(f2), (float) ag5Var2.a(f4), d, eg5Var);
    }
}
