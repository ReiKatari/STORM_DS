package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: av1  reason: default package */
/* loaded from: classes.dex */
public final class av1 {
    public final long a;
    public final gs0 b;

    public av1(long j, gs0 gs0Var) {
        this.a = j;
        this.b = gs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof av1) {
            av1 av1Var = (av1) obj;
            if (this.a == av1Var.a && this.b == av1Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HardcoreExitChoiceWaiter(requestId=" + this.a + ", deferred=" + this.b + ")";
    }
}
