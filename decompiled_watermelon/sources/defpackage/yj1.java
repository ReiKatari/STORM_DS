package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yj1  reason: default package */
/* loaded from: classes.dex */
public abstract class yj1 {
    public static final xj1 a = new xj1(3, 0, null);
    public static final xj1 b = new xj1(3, 1, null);

    public static zy3 a(zy3 zy3Var, ak1 ak1Var, jf4 jf4Var, boolean z, l14 l14Var, boolean z2, bj2 bj2Var, boolean z3) {
        return zy3Var.f(new wj1(ak1Var, jf4Var, z, l14Var, z2, a, bj2Var, z3));
    }

    public static final long b(long j) {
        float b2;
        boolean isNaN = Float.isNaN(p77.b(j));
        float f = RecyclerView.A1;
        if (isNaN) {
            b2 = 0.0f;
        } else {
            b2 = p77.b(j);
        }
        if (!Float.isNaN(p77.c(j))) {
            f = p77.c(j);
        }
        return nl2.n(b2, f);
    }
}
