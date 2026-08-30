package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gu6  reason: default package */
/* loaded from: classes.dex */
public final class gu6 extends gv6 {
    public final int a;
    public final int b;

    public gu6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu6)) {
            return false;
        }
        gu6 gu6Var = (gu6) obj;
        if (this.a == gu6Var.a && this.b == gu6Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HardcoreQueueSyncResult(submittedCount=" + this.a + ", remainingCount=" + this.b + ")";
    }
}
