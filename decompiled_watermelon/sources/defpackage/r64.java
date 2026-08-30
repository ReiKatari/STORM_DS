package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r64  reason: default package */
/* loaded from: classes.dex */
public final class r64 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public r64(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r64)) {
            return false;
        }
        r64 r64Var = (r64) obj;
        if (this.a == r64Var.a && this.b == r64Var.b && this.c == r64Var.c && this.d == r64Var.d && this.e == r64Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ej6.c(ej6.c(ej6.c(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.a);
        sb.append(", isValidated=");
        sb.append(this.b);
        sb.append(", isMetered=");
        sb.append(this.c);
        sb.append(", isNotRoaming=");
        sb.append(this.d);
        sb.append(", isBlocked=");
        return ej6.h(sb, this.e, ')');
    }
}
