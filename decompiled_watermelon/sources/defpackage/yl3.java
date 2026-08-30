package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yl3  reason: default package */
/* loaded from: classes.dex */
public final class yl3 {
    public long a;
    public long b;
    public long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl3)) {
            return false;
        }
        yl3 yl3Var = (yl3) obj;
        if (this.a == yl3Var.a && this.b == yl3Var.b && this.c == yl3Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + b31.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        StringBuilder q = wh1.q(j, "AttemptState(lastLoggedAtNanos=", ", updateCount=");
        q.append(j2);
        return wh1.p(q, ", suppressedUpdates=", j3, ")");
    }
}
