package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bd1  reason: default package */
/* loaded from: classes.dex */
public final class bd1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bd1(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bd1.class != obj.getClass()) {
            return false;
        }
        bd1 bd1Var = (bd1) obj;
        if (kt0.d(this.a, bd1Var.a) && kt0.d(this.b, bd1Var.b) && kt0.d(this.c, bd1Var.c) && kt0.d(this.d, bd1Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = kt0.i;
        return Long.hashCode(this.d) + i61.c(this.c, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
