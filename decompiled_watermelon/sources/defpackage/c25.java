package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c25  reason: default package */
/* loaded from: classes.dex */
public final class c25 {
    public final String a;
    public final x15 b;

    public c25(String str, x15 x15Var) {
        str.getClass();
        x15Var.getClass();
        this.a = str;
        this.b = x15Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c25)) {
            return false;
        }
        c25 c25Var = (c25) obj;
        if (b53.x(this.a, c25Var.a) && b53.x(this.b, c25Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Lease(id=" + this.a + ", authentication=" + this.b + ")";
    }
}
