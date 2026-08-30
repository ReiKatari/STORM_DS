package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e2  reason: default package */
/* loaded from: classes.dex */
public final class e2 extends b2 {
    public static e2 e;
    public static final rb5 f = rb5.Rtl;
    public static final rb5 g = rb5.Ltr;
    public lr6 c;
    public iz5 d;

    @Override // defpackage.b2
    public final int[] f(int i) {
        int i2;
        if (j().length() > 0 && i < j().length()) {
            try {
                iz5 iz5Var = this.d;
                if (iz5Var != null) {
                    y55 g2 = iz5Var.g();
                    int round = Math.round(g2.d - g2.b);
                    if (i <= 0) {
                        i = 0;
                    }
                    lr6 lr6Var = this.c;
                    if (lr6Var != null) {
                        int d = lr6Var.b.d(i);
                        lr6 lr6Var2 = this.c;
                        if (lr6Var2 != null) {
                            float f2 = lr6Var2.b.f(d) + round;
                            lr6 lr6Var3 = this.c;
                            if (lr6Var3 != null) {
                                q04 q04Var = lr6Var3.b;
                                int i3 = (f2 > q04Var.f(q04Var.f - 1) ? 1 : (f2 == q04Var.f(q04Var.f - 1) ? 0 : -1));
                                lr6 lr6Var4 = this.c;
                                if (i3 < 0) {
                                    if (lr6Var4 != null) {
                                        i2 = lr6Var4.b.e(f2);
                                    } else {
                                        b53.g0("layoutResult");
                                        throw null;
                                    }
                                } else if (lr6Var4 != null) {
                                    i2 = lr6Var4.b.f;
                                } else {
                                    b53.g0("layoutResult");
                                    throw null;
                                }
                                return i(i, s(i2 - 1, g) + 1);
                            }
                            b53.g0("layoutResult");
                            throw null;
                        }
                        b53.g0("layoutResult");
                        throw null;
                    }
                    b53.g0("layoutResult");
                    throw null;
                }
                b53.g0("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.b2
    public final int[] q(int i) {
        int i2;
        if (j().length() > 0 && i > 0) {
            try {
                iz5 iz5Var = this.d;
                if (iz5Var != null) {
                    y55 g2 = iz5Var.g();
                    int round = Math.round(g2.d - g2.b);
                    int length = j().length();
                    if (length <= i) {
                        i = length;
                    }
                    lr6 lr6Var = this.c;
                    if (lr6Var != null) {
                        int d = lr6Var.b.d(i);
                        lr6 lr6Var2 = this.c;
                        if (lr6Var2 != null) {
                            float f2 = lr6Var2.b.f(d) - round;
                            if (f2 > RecyclerView.A1) {
                                lr6 lr6Var3 = this.c;
                                if (lr6Var3 != null) {
                                    i2 = lr6Var3.b.e(f2);
                                } else {
                                    b53.g0("layoutResult");
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
                        b53.g0("layoutResult");
                        throw null;
                    }
                    b53.g0("layoutResult");
                    throw null;
                }
                b53.g0("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int s(int i, rb5 rb5Var) {
        lr6 lr6Var = this.c;
        if (lr6Var != null) {
            int g2 = lr6Var.g(i);
            lr6 lr6Var2 = this.c;
            if (lr6Var2 != null) {
                rb5 h = lr6Var2.h(g2);
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
