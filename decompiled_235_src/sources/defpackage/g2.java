package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g2  reason: default package */
/* loaded from: classes.dex */
public final class g2 extends d2 {
    public static g2 e;
    public static final jl5 f = jl5.Rtl;
    public static final jl5 g = jl5.Ltr;
    public a47 c;
    public xa6 d;

    @Override // defpackage.d2
    public final int[] f(int i) {
        int i2;
        if (j().length() > 0 && i < j().length()) {
            try {
                xa6 xa6Var = this.d;
                if (xa6Var != null) {
                    of5 g2 = xa6Var.g();
                    int round = Math.round(g2.d - g2.b);
                    if (i <= 0) {
                        i = 0;
                    }
                    a47 a47Var = this.c;
                    if (a47Var != null) {
                        int d = a47Var.b.d(i);
                        a47 a47Var2 = this.c;
                        if (a47Var2 != null) {
                            float f2 = a47Var2.b.f(d) + round;
                            a47 a47Var3 = this.c;
                            if (a47Var3 != null) {
                                v84 v84Var = a47Var3.b;
                                int i3 = (f2 > v84Var.f(v84Var.f - 1) ? 1 : (f2 == v84Var.f(v84Var.f - 1) ? 0 : -1));
                                a47 a47Var4 = this.c;
                                if (i3 < 0) {
                                    if (a47Var4 != null) {
                                        i2 = a47Var4.b.e(f2);
                                    } else {
                                        nb3.a0("layoutResult");
                                        throw null;
                                    }
                                } else if (a47Var4 != null) {
                                    i2 = a47Var4.b.f;
                                } else {
                                    nb3.a0("layoutResult");
                                    throw null;
                                }
                                return i(i, s(i2 - 1, g) + 1);
                            }
                            nb3.a0("layoutResult");
                            throw null;
                        }
                        nb3.a0("layoutResult");
                        throw null;
                    }
                    nb3.a0("layoutResult");
                    throw null;
                }
                nb3.a0("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.d2
    public final int[] q(int i) {
        int i2;
        if (j().length() > 0 && i > 0) {
            try {
                xa6 xa6Var = this.d;
                if (xa6Var != null) {
                    of5 g2 = xa6Var.g();
                    int round = Math.round(g2.d - g2.b);
                    int length = j().length();
                    if (length <= i) {
                        i = length;
                    }
                    a47 a47Var = this.c;
                    if (a47Var != null) {
                        int d = a47Var.b.d(i);
                        a47 a47Var2 = this.c;
                        if (a47Var2 != null) {
                            float f2 = a47Var2.b.f(d) - round;
                            if (f2 > RecyclerView.B1) {
                                a47 a47Var3 = this.c;
                                if (a47Var3 != null) {
                                    i2 = a47Var3.b.e(f2);
                                } else {
                                    nb3.a0("layoutResult");
                                    throw null;
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i == j().length() && i2 < d) {
                                i2++;
                            }
                            return i(s(i2, f), i);
                        }
                        nb3.a0("layoutResult");
                        throw null;
                    }
                    nb3.a0("layoutResult");
                    throw null;
                }
                nb3.a0("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int s(int i, jl5 jl5Var) {
        a47 a47Var = this.c;
        if (a47Var != null) {
            int g2 = a47Var.g(i);
            a47 a47Var2 = this.c;
            if (a47Var2 != null) {
                jl5 h = a47Var2.h(g2);
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
