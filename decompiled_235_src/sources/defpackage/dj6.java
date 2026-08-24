package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dj6 */
/* loaded from: classes.dex */
public abstract class dj6 {
    public static final lc2 a = new lc2(wj1.Horizontal, 1.0f);
    public static final lc2 b = new lc2(wj1.Vertical, 1.0f);
    public static final lc2 c;
    public static final tx7 d;
    public static final tx7 e;

    static {
        wj1 wj1Var = wj1.Both;
        c = new lc2(wj1Var, 1.0f);
        e40 e40Var = d90.Z;
        d = new tx7(wj1Var, new y36(e40Var, 14), e40Var);
        e40 e40Var2 = d90.L;
        e = new tx7(wj1Var, new y36(e40Var2, 14), e40Var2);
    }

    public static final a74 a(a74 a74Var, float f, float f2) {
        return a74Var.d(new ih7(f, f2));
    }

    public static final a74 b(a74 a74Var, float f) {
        lc2 lc2Var;
        if (f == 1.0f) {
            lc2Var = b;
        } else {
            lc2Var = new lc2(wj1.Vertical, f);
        }
        return a74Var.d(lc2Var);
    }

    public static final a74 c(a74 a74Var, float f) {
        lc2 lc2Var;
        if (f == 1.0f) {
            lc2Var = a;
        } else {
            lc2Var = new lc2(wj1.Horizontal, f);
        }
        return a74Var.d(lc2Var);
    }

    public static /* synthetic */ a74 d(a74 a74Var) {
        return c(a74Var, 1.0f);
    }

    public static final a74 e(a74 a74Var, float f) {
        return a74Var.d(new cj6((float) RecyclerView.B1, f, (float) RecyclerView.B1, f, 5));
    }

    public static a74 f(a74 a74Var, float f, float f2, int i) {
        float f3;
        float f4;
        if ((i & 1) != 0) {
            f3 = Float.NaN;
        } else {
            f3 = f;
        }
        if ((i & 2) != 0) {
            f4 = Float.NaN;
        } else {
            f4 = f2;
        }
        return a74Var.d(new cj6((float) RecyclerView.B1, f3, (float) RecyclerView.B1, f4, 5));
    }

    public static final a74 g(a74 a74Var) {
        return a74Var.d(new cj6(20.0f, 20.0f, 20.0f, 20.0f, false));
    }

    public static a74 h(a74 a74Var, float f, float f2, float f3, float f4, int i) {
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
        return a74Var.d(new cj6(f, f5, f6, f7, false));
    }

    public static final a74 i(a74 a74Var, float f) {
        return a74Var.d(new cj6(f, f, f, f, true));
    }

    public static final a74 j(a74 a74Var, float f, float f2) {
        return a74Var.d(new cj6(f, f2, f, f2, true));
    }

    public static final a74 k(a74 a74Var, float f, float f2, float f3, float f4) {
        return a74Var.d(new cj6(f, f2, f3, f4, true));
    }

    public static final a74 l(a74 a74Var, float f) {
        return a74Var.d(new cj6(f, (float) RecyclerView.B1, f, (float) RecyclerView.B1, 10));
    }

    public static a74 m(float f, int i, a74 a74Var) {
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
        return a74Var.d(new cj6(f2, (float) RecyclerView.B1, f3, (float) RecyclerView.B1, 10));
    }

    public static a74 n(a74 a74Var, e40 e40Var, int i) {
        tx7 tx7Var;
        e40 e40Var2 = d90.Z;
        if ((i & 1) != 0) {
            e40Var = e40Var2;
        }
        if (e40Var.equals(e40Var2)) {
            tx7Var = d;
        } else if (e40Var.equals(d90.L)) {
            tx7Var = e;
        } else {
            tx7Var = new tx7(wj1.Both, new y36(e40Var, 14), e40Var);
        }
        return a74Var.d(tx7Var);
    }
}
