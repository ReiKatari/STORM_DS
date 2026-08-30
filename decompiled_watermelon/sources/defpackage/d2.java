package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d2  reason: default package */
/* loaded from: classes.dex */
public final class d2 extends b2 {
    public static d2 d;
    public static final rb5 e = rb5.Rtl;
    public static final rb5 f = rb5.Ltr;
    public lr6 c;

    @Override // defpackage.b2
    public final int[] f(int i) {
        int i2;
        if (j().length() > 0 && i < j().length()) {
            lr6 lr6Var = this.c;
            rb5 rb5Var = e;
            if (i < 0) {
                if (lr6Var != null) {
                    i2 = lr6Var.b.d(0);
                } else {
                    b53.g0("layoutResult");
                    throw null;
                }
            } else if (lr6Var != null) {
                int d2 = lr6Var.b.d(i);
                if (s(d2, rb5Var) == i) {
                    i2 = d2;
                } else {
                    i2 = d2 + 1;
                }
            } else {
                b53.g0("layoutResult");
                throw null;
            }
            lr6 lr6Var2 = this.c;
            if (lr6Var2 != null) {
                if (i2 < lr6Var2.b.f) {
                    return i(s(i2, rb5Var), s(i2, f) + 1);
                }
            } else {
                b53.g0("layoutResult");
                throw null;
            }
        }
        return null;
    }

    @Override // defpackage.b2
    public final int[] q(int i) {
        int i2;
        if (j().length() > 0 && i > 0) {
            int length = j().length();
            lr6 lr6Var = this.c;
            rb5 rb5Var = f;
            if (i > length) {
                if (lr6Var != null) {
                    i2 = lr6Var.b.d(j().length());
                } else {
                    b53.g0("layoutResult");
                    throw null;
                }
            } else if (lr6Var != null) {
                int d2 = lr6Var.b.d(i);
                if (s(d2, rb5Var) + 1 == i) {
                    i2 = d2;
                } else {
                    i2 = d2 - 1;
                }
            } else {
                b53.g0("layoutResult");
                throw null;
            }
            if (i2 >= 0) {
                return i(s(i2, e), s(i2, rb5Var) + 1);
            }
        }
        return null;
    }

    public final int s(int i, rb5 rb5Var) {
        lr6 lr6Var = this.c;
        if (lr6Var != null) {
            int g = lr6Var.g(i);
            lr6 lr6Var2 = this.c;
            if (lr6Var2 != null) {
                rb5 h = lr6Var2.h(g);
                lr6 lr6Var3 = this.c;
                if (rb5Var != h) {
                    if (lr6Var3 != null) {
                        return lr6Var3.g(i);
                    }
                    b53.g0("layoutResult");
                    throw null;
                } else if (lr6Var3 != null) {
                    return lr6Var3.b.c(i, false) - 1;
                } else {
                    b53.g0("layoutResult");
                    throw null;
                }
            }
            b53.g0("layoutResult");
            throw null;
        }
        b53.g0("layoutResult");
        throw null;
    }
}
