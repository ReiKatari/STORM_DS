package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v47  reason: default package */
/* loaded from: classes.dex */
public final class v47 {
    public final int a;
    public final gs0 b;

    public v47(int i, gs0 gs0Var) {
        gs0Var.getClass();
        this.a = i;
        this.b = gs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v47)) {
            return false;
        }
        v47 v47Var = (v47) obj;
        if (this.a == v47Var.a && b53.x(this.b, v47Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RequestSignal(requestNo=" + this.a + ", signal=" + this.b + ')';
    }
}
