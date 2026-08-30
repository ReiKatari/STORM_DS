package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: be1  reason: default package */
/* loaded from: classes.dex */
public final class be1 {
    public static final be1 c = new be1(0, 0);
    public final long a;
    public final long b;

    public be1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof be1) {
            be1 be1Var = (be1) obj;
            if (i33.b(this.a, be1Var.a) && this.b == be1Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
