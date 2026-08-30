package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: am0  reason: default package */
/* loaded from: classes.dex */
public final class am0 {
    public final long a;
    public final boolean b;

    public am0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am0)) {
            return false;
        }
        am0 am0Var = (am0) obj;
        if (this.a == am0Var.a && this.b == am0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CheatStatusUpdate(id=" + this.a + ", enabled=" + this.b + ")";
    }
}
