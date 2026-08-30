package n3;

import a4.r0;
import cd.h1;
import d2.t;
import i3.l;
import nc.k;
import x4.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {
    public h1 A;
    public l B;
    public float L = 1.0f;
    public m R = m.Ltr;

    public abstract void d(float f8);

    public abstract void e(l lVar);

    public final void g(r0 r0Var, long j2, float f8, l lVar) {
        k3.b bVar = r0Var.A;
        if (this.L != f8) {
            d(f8);
            this.L = f8;
        }
        if (!k.a(this.B, lVar)) {
            e(lVar);
            this.B = lVar;
        }
        m layoutDirection = r0Var.getLayoutDirection();
        if (this.R != layoutDirection) {
            f(layoutDirection);
            this.R = layoutDirection;
        }
        int i2 = (int) (j2 >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (bVar.c() >> 32)) - Float.intBitsToFloat(i2);
        int i10 = (int) (j2 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.c() & 4294967295L)) - Float.intBitsToFloat(i10);
        ((t) bVar.B.B).z(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        int i11 = (f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            try {
                if (Float.intBitsToFloat(i2) > 0.0f && Float.intBitsToFloat(i10) > 0.0f) {
                    i(r0Var);
                }
            } finally {
                ((t) bVar.B.B).z(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long h();

    public abstract void i(r0 r0Var);

    public void f(m mVar) {
    }
}
