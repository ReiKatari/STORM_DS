package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o76  reason: default package */
/* loaded from: classes.dex */
public abstract class o76 {
    public static final s72 a = new s72(sf1.Horizontal, 1.0f);
    public static final s72 b = new s72(sf1.Vertical, 1.0f);
    public static final s72 c;
    public static final wi7 d;
    public static final wi7 e;

    static {
        sf1 sf1Var = sf1.Both;
        c = new s72(sf1Var, 1.0f);
        j20 j20Var = y60.Z;
        d = new wi7(sf1Var, new bt5(13, j20Var), j20Var);
        j20 j20Var2 = y60.L;
        e = new wi7(sf1Var, new bt5(13, j20Var2), j20Var2);
    }

    public static final zy3 a(zy3 zy3Var, float f, float f2) {
        return zy3Var.f(new n37(f, f2));
    }

    public static final zy3 b(zy3 zy3Var, float f) {
        s72 s72Var;
        if (f == 1.0f) {
            s72Var = b;
        } else {
            s72Var = new s72(sf1.Vertical, f);
        }
        return zy3Var.f(s72Var);
    }

    public static final zy3 c(zy3 zy3Var, float f) {
        s72 s72Var;
        if (f == 1.0f) {
            s72Var = a;
        } else {
            s72Var = new s72(sf1.Horizontal, f);
        }
        return zy3Var.f(s72Var);
    }

    public static final zy3 d(zy3 zy3Var, float f) {
        return zy3Var.f(new n76((float) RecyclerView.A1, f, (float) RecyclerView.A1, f, 5));
    }

    public static zy3 e(float f, int i, zy3 zy3Var) {
        float f2;
        float f3 = Float.NaN;
        if ((i & 1) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        if ((i & 2) == 0) {
            f3 = 48.0f;
        }
        return zy3Var.f(new n76((float) RecyclerView.A1, f2, (float) RecyclerView.A1, f3, 5));
    }

    public static final zy3 f(zy3 zy3Var) {
        return zy3Var.f(new n76(20.0f, 20.0f, 20.0f, 20.0f, false));
    }

    public static zy3 g(zy3 zy3Var, float f, float f2, float f3, float f4, int i) {
        float f5;
        float f6;
        float f7;
        if ((i & 2) != 0) {
            f5 = Float.NaN;
        } else {
            f5 = f2;
        }
        if ((i & 4) != 0) {
            f6 = Float.NaN;
        } else {
            f6 = f3;
        }
        if ((i & 8) != 0) {
            f7 = Float.NaN;
        } else {
            f7 = f4;
        }
        return zy3Var.f(new n76(f, f5, f6, f7, false));
    }

    public static final zy3 h(zy3 zy3Var, float f) {
        return zy3Var.f(new n76(f, f, f, f, true));
    }

    public static final zy3 i(zy3 zy3Var, float f, float f2) {
        return zy3Var.f(new n76(f, f2, f, f2, true));
    }

    public static final zy3 j(zy3 zy3Var, float f, float f2, float f3, float f4) {
        return zy3Var.f(new n76(f, f2, f3, f4, true));
    }

    public static final zy3 k(zy3 zy3Var, float f) {
        return zy3Var.f(new n76(f, (float) RecyclerView.A1, f, (float) RecyclerView.A1, 10));
    }

    public static zy3 l(float f, int i, zy3 zy3Var) {
        float f2;
        float f3;
        if ((i & 1) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = 144.0f;
        }
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        } else {
            f3 = f;
        }
        return zy3Var.f(new n76(f2, (float) RecyclerView.A1, f3, (float) RecyclerView.A1, 10));
    }

    public static zy3 m(zy3 zy3Var, int i) {
        wi7 wi7Var;
        j20 j20Var = y60.Z;
        if (j20Var.equals(j20Var)) {
            wi7Var = d;
        } else if (j20Var.equals(y60.L)) {
            wi7Var = e;
        } else {
            wi7Var = new wi7(sf1.Both, new bt5(13, j20Var), j20Var);
        }
        return zy3Var.f(wi7Var);
    }
}
