package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qi4  reason: default package */
/* loaded from: classes.dex */
public abstract class qi4 {
    public oi A;
    public b30 B;
    public float L = 1.0f;
    public sd3 R = sd3.Ltr;

    public abstract void d(float f);

    public abstract void e(b30 b30Var);

    public final void g(xf3 xf3Var, long j, float f, b30 b30Var) {
        rh0 rh0Var = xf3Var.A;
        if (this.L != f) {
            d(f);
            this.L = f;
        }
        if (!b53.x(this.B, b30Var)) {
            e(b30Var);
            this.B = b30Var;
        }
        sd3 layoutDirection = xf3Var.getLayoutDirection();
        if (this.R != layoutDirection) {
            f(layoutDirection);
            this.R = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (rh0Var.d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (rh0Var.d() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((bq0) rh0Var.B.B).a0(RecyclerView.A1, RecyclerView.A1, intBitsToFloat, intBitsToFloat2);
        int i3 = (f > RecyclerView.A1 ? 1 : (f == RecyclerView.A1 ? 0 : -1));
        if (i3 > 0) {
            try {
                if (Float.intBitsToFloat(i) > RecyclerView.A1 && Float.intBitsToFloat(i2) > RecyclerView.A1) {
                    i(xf3Var);
                }
            } finally {
                ((bq0) rh0Var.B.B).a0(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long h();

    public abstract void i(xf3 xf3Var);

    public void f(sd3 sd3Var) {
    }
}
