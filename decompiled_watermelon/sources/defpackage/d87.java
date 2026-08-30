package defpackage;

import java.math.BigInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d87  reason: default package */
/* loaded from: classes.dex */
public final class d87 implements Comparable {
    public static final d87 Y;
    public final int A;
    public final int B;
    public final int L;
    public final String R;
    public final il6 X = new il6(new t06(13, this));

    static {
        new d87("", 0, 0, 0);
        Y = new d87("", 0, 1, 0);
        new d87("", 1, 0, 0);
    }

    public d87(String str, int i, int i2, int i3) {
        this.A = i;
        this.B = i2;
        this.L = i3;
        this.R = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d87 d87Var = (d87) obj;
        d87Var.getClass();
        Object value = this.X.getValue();
        value.getClass();
        Object value2 = d87Var.X.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d87)) {
            return false;
        }
        d87 d87Var = (d87) obj;
        if (this.A != d87Var.A || this.B != d87Var.B || this.L != d87Var.L) {
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
        if (!zg6.B0(str2)) {
            str = "-".concat(str2);
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.A);
        sb.append('.');
        sb.append(this.B);
        sb.append('.');
        return wh1.m(sb, this.L, str);
    }
}
