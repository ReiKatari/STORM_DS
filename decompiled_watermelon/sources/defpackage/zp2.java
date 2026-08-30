package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zp2  reason: default package */
/* loaded from: classes.dex */
public final class zp2 {
    public final int a;
    public final int b;

    public zp2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp2)) {
            return false;
        }
        zp2 zp2Var = (zp2) obj;
        if (this.a == zp2Var.a && this.b == zp2Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DrainResult(submittedCount=" + this.a + ", remainingCount=" + this.b + ")";
    }
}
