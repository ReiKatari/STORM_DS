package defpackage;

import android.util.Range;
import android.util.Rational;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s12  reason: default package */
/* loaded from: classes.dex */
public final class s12 {
    public final boolean a;
    public final int b;
    public final Range c;
    public final Rational d;

    public s12(boolean z, int i, Range range, Rational rational) {
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
        if (!(obj instanceof s12)) {
            return false;
        }
        s12 s12Var = (s12) obj;
        if (this.a == s12Var.a && this.b == s12Var.b && b53.x(this.c, s12Var.c) && b53.x(this.d, s12Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int a = wh1.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        return this.d.hashCode() + ((this.c.hashCode() + a) * 31);
    }

    public final String toString() {
        return "EvCompValue(supported=" + this.a + ", index=" + this.b + ", range=" + this.c + ", step=" + this.d + ')';
    }
}
