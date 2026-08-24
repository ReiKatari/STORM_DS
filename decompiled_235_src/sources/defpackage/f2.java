package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f2  reason: default package */
/* loaded from: classes.dex */
public final class f2 extends d2 {
    public static f2 d;
    public static final jl5 e = jl5.Rtl;
    public static final jl5 f = jl5.Ltr;
    public a47 c;

    @Override // defpackage.d2
    public final int[] f(int i) {
        int i2;
        if (j().length() > 0 && i < j().length()) {
            a47 a47Var = this.c;
            jl5 jl5Var = e;
            if (i < 0) {
                if (a47Var != null) {
                    i2 = a47Var.b.d(0);
                } else {
                    nb3.a0("layoutResult");
                    throw null;
                }
            } else if (a47Var != null) {
                int d2 = a47Var.b.d(i);
                if (s(d2, jl5Var) == i) {
                    i2 = d2;
                } else {
                    i2 = d2 + 1;
                }
            } else {
                nb3.a0("layoutResult");
                throw null;
            }
            a47 a47Var2 = this.c;
            if (a47Var2 != null) {
                if (i2 < a47Var2.b.f) {
                    return i(s(i2, jl5Var), s(i2, f) + 1);
                }
            } else {
                nb3.a0("layoutResult");
                throw null;
            }
        }
        return null;
    }

    @Override // defpackage.d2
    public final int[] q(int i) {
        int i2;
        if (j().length() > 0 && i > 0) {
            int length = j().length();
            a47 a47Var = this.c;
            jl5 jl5Var = f;
            if (i > length) {
                if (a47Var != null) {
                    i2 = a47Var.b.d(j().length());
                } else {
                    nb3.a0("layoutResult");
                    throw null;
                }
            } else if (a47Var != null) {
                int d2 = a47Var.b.d(i);
                if (s(d2, jl5Var) + 1 == i) {
                    i2 = d2;
                } else {
                    i2 = d2 - 1;
                }
            } else {
                nb3.a0("layoutResult");
                throw null;
            }
            if (i2 >= 0) {
                return i(s(i2, e), s(i2, jl5Var) + 1);
            }
        }
        return null;
    }

    public final int s(int i, jl5 jl5Var) {
        a47 a47Var = this.c;
        if (a47Var != null) {
            int g = a47Var.g(i);
            a47 a47Var2 = this.c;
            if (a47Var2 != null) {
                jl5 h = a47Var2.h(g);
                a47 a47Var3 = this.c;
                if (jl5Var != h) {
                    if (a47Var3 != null) {
                        return a47Var3.g(i);
                    }
                    nb3.a0("layoutResult");
                    throw null;
                } else if (a47Var3 != null) {
                    return a47Var3.b.c(i, false) - 1;
                } else {
                    nb3.a0("layoutResult");
                    throw null;
                }
            }
            nb3.a0("layoutResult");
            throw null;
        }
        nb3.a0("layoutResult");
        throw null;
    }
}
