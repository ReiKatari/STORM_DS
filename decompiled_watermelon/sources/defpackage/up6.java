package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: up6  reason: default package */
/* loaded from: classes.dex */
public final class up6 {
    public static final ci3 g = io2.X(new gu5(16), new d96(16));
    public final pj4 a;
    public final pj4 b = new pj4(RecyclerView.A1);
    public final qj4 c = new qj4(0);
    public y55 d = y55.e;
    public long e = vr6.b;
    public final tj4 f;

    public up6(jf4 jf4Var, float f) {
        this.a = new pj4(f);
        this.f = new tj4(jf4Var, k45.n0);
    }

    public final void a(jf4 jf4Var, y55 y55Var, int i, int i2) {
        boolean z;
        float f;
        int i3;
        float f2;
        float f3 = i2 - i;
        this.b.i(f3);
        float f4 = y55Var.a;
        float f5 = y55Var.b;
        y55 y55Var2 = this.d;
        int i4 = (f4 > y55Var2.a ? 1 : (f4 == y55Var2.a ? 0 : -1));
        pj4 pj4Var = this.a;
        if (i4 != 0 || f5 != y55Var2.b) {
            if (jf4Var == jf4.Vertical) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f4 = f5;
            }
            if (z) {
                f = y55Var.d;
            } else {
                f = y55Var.c;
            }
            float h = pj4Var.h();
            float f6 = i;
            float f7 = h + f6;
            if (f > f7 || (f4 < h && f - f4 > f6)) {
                f2 = f - f7;
            } else if (i3 < 0 && f - f4 <= f6) {
                f2 = f4 - h;
            } else {
                f2 = 0.0f;
            }
            pj4Var.i(pj4Var.h() + f2);
            this.d = y55Var;
        }
        pj4Var.i(io2.l(pj4Var.h(), RecyclerView.A1, f3));
        this.c.i(i);
    }
}
