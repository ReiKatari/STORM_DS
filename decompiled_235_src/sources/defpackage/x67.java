package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x67  reason: default package */
/* loaded from: classes.dex */
public final class x67 extends x77 {
    public final int a;
    public final int b;

    public x67(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x67)) {
            return false;
        }
        x67 x67Var = (x67) obj;
        if (this.a == x67Var.a && this.b == x67Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xg6.m(this.a, this.b, "HardcoreQueueSyncResult(submittedCount=", ", remainingCount=", ")");
    }
}
