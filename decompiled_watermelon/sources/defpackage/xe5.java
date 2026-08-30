package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xe5  reason: default package */
/* loaded from: classes.dex */
public final class xe5 implements ze5 {
    public final int a;
    public final int b;

    public xe5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe5)) {
            return false;
        }
        xe5 xe5Var = (xe5) obj;
        if (this.a == xe5Var.a && this.b == xe5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Extracting(entriesDone=" + this.a + ", entriesTotal=" + this.b + ")";
    }
}
