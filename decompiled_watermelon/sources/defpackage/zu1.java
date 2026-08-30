package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zu1  reason: default package */
/* loaded from: classes.dex */
public final class zu1 {
    public final long a;
    public final xp2 b;

    public zu1(long j, xp2 xp2Var) {
        xp2Var.getClass();
        this.a = j;
        this.b = xp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu1)) {
            return false;
        }
        zu1 zu1Var = (zu1) obj;
        if (this.a == zu1Var.a && this.b == zu1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HardcoreExitChoiceResponse(requestId=" + this.a + ", choice=" + this.b + ")";
    }
}
