package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hw7  reason: default package */
/* loaded from: classes.dex */
public final class hw7 {
    public final long a;
    public final long b;

    public hw7(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hw7.class.equals(obj.getClass())) {
            hw7 hw7Var = (hw7) obj;
            if (hw7Var.a == this.a && hw7Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.a + ", flexIntervalMillis=" + this.b + '}';
    }
}
