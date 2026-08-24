package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ve1  reason: default package */
/* loaded from: classes.dex */
public final class ve1 {
    public final long a;
    public final long b;
    public final long c;

    public ve1(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ve1.class != obj.getClass()) {
            return false;
        }
        ve1 ve1Var = (ve1) obj;
        if (kt0.d(this.a, ve1Var.a) && kt0.d(this.b, ve1Var.b) && kt0.d(this.c, ve1Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = kt0.i;
        return Long.hashCode(this.c) + i61.c(this.b, Long.hashCode(this.a) * 31, 31);
    }
}
