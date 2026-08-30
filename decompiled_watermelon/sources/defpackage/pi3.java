package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pi3  reason: default package */
/* loaded from: classes.dex */
public final class pi3 {
    public final int a;
    public final int b;

    public pi3(int i, int i2) {
        boolean z;
        this.a = i;
        this.b = i2;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            pz2.a("negative start index");
        }
        if (!(i2 >= i)) {
            pz2.a("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi3)) {
            return false;
        }
        pi3 pi3Var = (pi3) obj;
        if (this.a == pi3Var.a && this.b == pi3Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return ej6.g(sb, this.b, ')');
    }
}
