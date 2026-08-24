package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: at3  reason: default package */
/* loaded from: classes.dex */
public final class at3 {
    public long a;
    public long b;
    public long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at3)) {
            return false;
        }
        at3 at3Var = (at3) obj;
        if (this.a == at3Var.a && this.b == at3Var.b && this.c == at3Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + i61.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        StringBuilder s = xg6.s(j, "AttemptState(lastLoggedAtNanos=", ", updateCount=");
        s.append(j2);
        return lb1.r(s, ", suppressedUpdates=", j3, ")");
    }
}
