package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: we0  reason: default package */
/* loaded from: classes.dex */
public final class we0 {
    public final tf0 a;
    public final np2 b;

    public we0(tf0 tf0Var, np2 np2Var) {
        this.a = tf0Var;
        this.b = np2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we0)) {
            return false;
        }
        we0 we0Var = (we0) obj;
        if (this.a == we0Var.a && this.b == we0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ListenerWrapper(listener=" + this.a + ", executor=" + this.b + ')';
    }
}
