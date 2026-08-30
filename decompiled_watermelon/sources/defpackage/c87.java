package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c87  reason: default package */
/* loaded from: classes.dex */
public final class c87 implements Comparable {
    public static final c87 Z = new c87(x77.NIGHTLY, -1, -1, -1, 0, 48, 0);
    public static final h85 c0;
    public static final h85 d0;
    public final x77 A;
    public final int B;
    public final int L;
    public final int R;
    public final int X;
    public final int Y;

    static {
        i85 i85Var = i85.IGNORE_CASE;
        c0 = new h85("^v?(\\d+)\\.(\\d+)\\.(\\d+)(?:[-.](alpha|beta|rc)(?:[-.]?(\\d+))?)?(?:[-.]fix(\\d*))?$", i85Var);
        d0 = new h85("^(alpha|beta|rc)-v?(\\d+)\\.(\\d+)\\.(\\d+)(?:[-.]?(\\d+))?$", i85Var);
    }

    public c87(x77 x77Var, int i, int i2, int i3, int i4, int i5) {
        x77Var.getClass();
        this.A = x77Var;
        this.B = i;
        this.L = i2;
        this.R = i3;
        this.X = i4;
        this.Y = i5;
    }

    public static int c(x77 x77Var) {
        int i = y77.a[x77Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            if (i != 3) {
                if (i == 4) {
                    return 1;
                }
                if (i == 5) {
                    return 2;
                }
                i.c();
                return 0;
            }
            return 0;
        }
        return -1;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(c87 c87Var) {
        c87Var.getClass();
        x77 x77Var = c87Var.A;
        x77 x77Var2 = x77.NIGHTLY;
        int i = 0;
        x77 x77Var3 = this.A;
        if (x77Var3 != x77Var2 && x77Var != x77Var2) {
            mi2[] mi2VarArr = {z77.c0, a87.c0, b87.c0};
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    break;
                }
                mi2 mi2Var = mi2VarArr[i2];
                int i3 = iq2.i((Comparable) mi2Var.n(this), (Comparable) mi2Var.n(c87Var));
                if (i3 != 0) {
                    i = i3;
                    break;
                }
                i2++;
            }
            Integer valueOf = Integer.valueOf(i);
            if (i == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
            int E = b53.E(c(x77Var3), c(x77Var));
            if (E != 0) {
                return E;
            }
            int E2 = b53.E(this.X, c87Var.X);
            if (E2 != 0) {
                return E2;
            }
            return b53.E(this.Y, c87Var.Y);
        } else if (x77Var3 == x77Var) {
            return 0;
        } else {
            if (x77Var3 != x77Var2) {
                return 1;
            }
            return -1;
        }
    }

    public final String b(String str) {
        int i = this.R;
        int i2 = this.L;
        int i3 = this.X;
        int i4 = this.B;
        if (i3 == 0) {
            return str + "-" + i4 + "." + i2 + "." + i;
        }
        return i4 + "." + i2 + "." + i + "-" + str + i3;
    }

    public final String d() {
        int i = this.Y;
        if (i != 0) {
            if (i == 1) {
                return ".fix";
            }
            return wh1.g(i, ".fix");
        }
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c87)) {
            return false;
        }
        c87 c87Var = (c87) obj;
        if (this.A == c87Var.A && this.B == c87Var.B && this.L == c87Var.L && this.R == c87Var.R && this.X == c87Var.X && this.Y == c87Var.Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.Y) + wh1.a(this.X, wh1.a(this.R, wh1.a(this.L, wh1.a(this.B, this.A.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        int i = y77.a[this.A.ordinal()];
        if (i != 1) {
            int i2 = this.R;
            int i3 = this.L;
            int i4 = this.B;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            String d = d();
                            return i4 + "." + i3 + "." + i2 + "-rc" + this.X + d;
                        }
                        i.c();
                        return null;
                    }
                    return b("beta").concat(d());
                }
                return b("alpha").concat(d());
            }
            return i4 + "." + i3 + "." + i2;
        }
        return "nightly";
    }

    public /* synthetic */ c87(x77 x77Var, int i, int i2, int i3, int i4, int i5, int i6) {
        this(x77Var, i, i2, i3, (i5 & 16) != 0 ? 0 : i4, 0);
    }
}
