package defpackage;

import android.util.Range;
import android.util.Rational;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h62  reason: default package */
/* loaded from: classes.dex */
public final class h62 {
    public final boolean a;
    public final int b;
    public final Range c;
    public final Rational d;

    public h62(boolean z, int i, Range range, Rational rational) {
        range.getClass();
        rational.getClass();
        this.a = z;
        this.b = i;
        this.c = range;
        this.d = rational;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h62)) {
            return false;
        }
        h62 h62Var = (h62) obj;
        if (this.a == h62Var.a && this.b == h62Var.b && nb3.k(this.c, h62Var.c) && nb3.k(this.d, h62Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int a = lb1.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        return this.d.hashCode() + ((this.c.hashCode() + a) * 31);
    }

    public final String toString() {
        return "EvCompValue(supported=" + this.a + ", index=" + this.b + ", range=" + this.c + ", step=" + this.d + ')';
    }
}
