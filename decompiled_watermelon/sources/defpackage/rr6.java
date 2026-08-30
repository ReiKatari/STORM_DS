package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rr6  reason: default package */
/* loaded from: classes.dex */
public final class rr6 {
    public final xb6 a;
    public final xb6 b;
    public final xb6 c;
    public final xb6 d;

    public rr6(xb6 xb6Var, xb6 xb6Var2, xb6 xb6Var3, xb6 xb6Var4) {
        this.a = xb6Var;
        this.b = xb6Var2;
        this.c = xb6Var3;
        this.d = xb6Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rr6)) {
            return false;
        }
        rr6 rr6Var = (rr6) obj;
        if (b53.x(this.a, rr6Var.a) && b53.x(this.b, rr6Var.b) && b53.x(this.c, rr6Var.c) && b53.x(this.d, rr6Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        xb6 xb6Var = this.a;
        if (xb6Var != null) {
            i = xb6Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        xb6 xb6Var2 = this.b;
        if (xb6Var2 != null) {
            i2 = xb6Var2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        xb6 xb6Var3 = this.c;
        if (xb6Var3 != null) {
            i3 = xb6Var3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        xb6 xb6Var4 = this.d;
        if (xb6Var4 != null) {
            i4 = xb6Var4.hashCode();
        }
        return i7 + i4;
    }
}
