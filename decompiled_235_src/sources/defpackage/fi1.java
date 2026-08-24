package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fi1  reason: default package */
/* loaded from: classes.dex */
public final class fi1 {
    public static final fi1 c = new fi1(0, 0);
    public final long a;
    public final long b;

    public fi1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fi1) {
            fi1 fi1Var = (fi1) obj;
            if (q93.b(this.a, fi1Var.a) && this.b == fi1Var.b) {
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
