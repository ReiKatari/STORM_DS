package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sr4  reason: default package */
/* loaded from: classes.dex */
public abstract class sr4 {
    public aj A;
    public z40 B;
    public float L = 1.0f;
    public kk3 R = kk3.Ltr;

    public abstract void d(float f);

    public abstract void e(z40 z40Var);

    public final void g(um3 um3Var, long j, float f, z40 z40Var) {
        zj0 zj0Var = um3Var.A;
        if (this.L != f) {
            d(f);
            this.L = f;
        }
        if (!nb3.k(this.B, z40Var)) {
            e(z40Var);
            this.B = z40Var;
        }
        kk3 layoutDirection = um3Var.getLayoutDirection();
        if (this.R != layoutDirection) {
            f(layoutDirection);
            this.R = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (zj0Var.e() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (zj0Var.e() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((os0) zj0Var.B.B).c0(RecyclerView.B1, RecyclerView.B1, intBitsToFloat, intBitsToFloat2);
        int i3 = (f > RecyclerView.B1 ? 1 : (f == RecyclerView.B1 ? 0 : -1));
        if (i3 > 0) {
            try {
                if (Float.intBitsToFloat(i) > RecyclerView.B1 && Float.intBitsToFloat(i2) > RecyclerView.B1) {
                    i(um3Var);
                }
            } finally {
                ((os0) zj0Var.B.B).c0(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long h();

    public abstract void i(um3 um3Var);

    public void f(kk3 kk3Var) {
    }
}
