package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bm7  reason: default package */
/* loaded from: classes.dex */
public final class bm7 implements Comparable {
    public static final bm7 Z = new bm7(wl7.NIGHTLY, -1, -1, -1, 0, 48, 0);
    public static final xh5 d0;
    public static final xh5 e0;
    public final wl7 A;
    public final int B;
    public final int L;
    public final int R;
    public final int X;
    public final int Y;

    static {
        yh5 yh5Var = yh5.IGNORE_CASE;
        d0 = new xh5("^v?(\\d+)\\.(\\d+)\\.(\\d+)(?:[-.](alpha|beta|rc)(?:[-.]?(\\d+))?)?(?:[-.]fix(\\d*))?$", yh5Var);
        e0 = new xh5("^(alpha|beta|rc)-v?(\\d+)\\.(\\d+)\\.(\\d+)(?:[-.]?(\\d+))?$", yh5Var);
    }

    public bm7(wl7 wl7Var, int i, int i2, int i3, int i4, int i5) {
        wl7Var.getClass();
        this.A = wl7Var;
        this.B = i;
        this.L = i2;
        this.R = i3;
        this.X = i4;
        this.Y = i5;
    }

    public static int c(wl7 wl7Var) {
        int i = xl7.a[wl7Var.ordinal()];
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
                i.d();
                return 0;
            }
            return 0;
        }
        return -1;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(bm7 bm7Var) {
        bm7Var.getClass();
        wl7 wl7Var = bm7Var.A;
        wl7 wl7Var2 = wl7.NIGHTLY;
        int i = 0;
        wl7 wl7Var3 = this.A;
        if (wl7Var3 != wl7Var2 && wl7Var != wl7Var2) {
            qn2[] qn2VarArr = {yl7.d0, zl7.d0, am7.d0};
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    break;
                }
                qn2 qn2Var = qn2VarArr[i2];
                int z = g04.z((Comparable) qn2Var.g(this), (Comparable) qn2Var.g(bm7Var));
                if (z != 0) {
                    i = z;
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
            int p = nb3.p(c(wl7Var3), c(wl7Var));
            if (p != 0) {
                return p;
            }
            int p2 = nb3.p(this.X, bm7Var.X);
            if (p2 != 0) {
                return p2;
            }
            return nb3.p(this.Y, bm7Var.Y);
        } else if (wl7Var3 == wl7Var) {
            return 0;
        } else {
            if (wl7Var3 != wl7Var2) {
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
            return lb1.g(i, ".fix");
        }
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm7)) {
            return false;
        }
        bm7 bm7Var = (bm7) obj;
        if (this.A == bm7Var.A && this.B == bm7Var.B && this.L == bm7Var.L && this.R == bm7Var.R && this.X == bm7Var.X && this.Y == bm7Var.Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.Y) + lb1.a(this.X, lb1.a(this.R, lb1.a(this.L, lb1.a(this.B, this.A.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        int i = xl7.a[this.A.ordinal()];
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
                        i.d();
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

    public /* synthetic */ bm7(wl7 wl7Var, int i, int i2, int i3, int i4, int i5, int i6) {
        this(wl7Var, i, i2, i3, (i5 & 16) != 0 ? 0 : i4, 0);
    }
}
