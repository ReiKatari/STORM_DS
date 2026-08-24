package defpackage;

import java.math.BigInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cm7  reason: default package */
/* loaded from: classes.dex */
public final class cm7 implements Comparable {
    public static final cm7 Y;
    public final int A;
    public final int B;
    public final int L;
    public final String R;
    public final ex6 X = new ex6(new t46(this, 20));

    static {
        new cm7(0, 0, 0, "");
        Y = new cm7(0, 1, 0, "");
        new cm7(1, 0, 0, "");
    }

    public cm7(int i, int i2, int i3, String str) {
        this.A = i;
        this.B = i2;
        this.L = i3;
        this.R = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        cm7 cm7Var = (cm7) obj;
        cm7Var.getClass();
        Object value = this.X.getValue();
        value.getClass();
        Object value2 = cm7Var.X.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cm7)) {
            return false;
        }
        cm7 cm7Var = (cm7) obj;
        if (this.A != cm7Var.A || this.B != cm7Var.B || this.L != cm7Var.L) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((527 + this.A) * 31) + this.B) * 31) + this.L;
    }

    public final String toString() {
        String str;
        String str2 = this.R;
        if (!qs6.v0(str2)) {
            str = "-".concat(str2);
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.A);
        sb.append('.');
        sb.append(this.B);
        sb.append('.');
        return lb1.o(sb, this.L, str);
    }
}
