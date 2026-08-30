package oe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 implements Comparable {
    public static final t0 X = new t0(r0.NIGHTLY, -1, -1, -1);
    public final r0 A;
    public final int B;
    public final int L;
    public final int R;

    public t0(r0 r0Var, int i2, int i10, int i11) {
        r0Var.getClass();
        this.A = r0Var;
        this.B = i2;
        this.L = i10;
        this.R = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(t0 t0Var) {
        t0Var.getClass();
        int[] iArr = {this.A.ordinal(), this.B, this.L, this.R};
        int[] iArr2 = {t0Var.A.ordinal(), t0Var.B, t0Var.L, t0Var.R};
        for (int i2 = 0; i2 < 4; i2++) {
            int i10 = iArr[i2] - iArr2[i2];
            if (i10 != 0) {
                return i10;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.A == t0Var.A && this.B == t0Var.B && this.L == t0Var.L && this.R == t0Var.R) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R) + w.d.c(this.L, w.d.c(this.B, this.A.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str;
        int i2 = s0.f10955a[this.A.ordinal()];
        String str2 = "";
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str = "";
                } else if (i2 == 4) {
                    return "nightly";
                } else {
                    m9.o.o();
                    return null;
                }
            } else {
                str = "beta";
            }
        } else {
            str = "alpha";
        }
        if (str.length() != 0) {
            str2 = "-";
        }
        return str + str2 + this.B + "." + this.L + "." + this.R;
    }
}
