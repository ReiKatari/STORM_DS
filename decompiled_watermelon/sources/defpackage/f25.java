package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f25  reason: default package */
/* loaded from: classes.dex */
public final class f25 implements j25 {
    public final int a;
    public final boolean b;

    public f25(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f25)) {
            return false;
        }
        f25 f25Var = (f25) obj;
        if (this.a == f25Var.a && this.b == f25Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PendingChanged(pendingTotal=" + this.a + ", networkAvailable=" + this.b + ")";
    }
}
