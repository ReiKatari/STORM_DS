package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rf1  reason: default package */
/* loaded from: classes.dex */
public final class rf1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public rf1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rf1.class != obj.getClass()) {
            return false;
        }
        rf1 rf1Var = (rf1) obj;
        if (kt0.d(this.a, rf1Var.a) && kt0.d(this.b, rf1Var.b) && kt0.d(this.c, rf1Var.c) && kt0.d(this.d, rf1Var.d) && kt0.d(this.e, rf1Var.e) && kt0.d(this.f, rf1Var.f) && kt0.d(this.g, rf1Var.g) && kt0.d(this.h, rf1Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = kt0.i;
        return Long.hashCode(this.h) + i61.c(this.g, i61.c(this.f, i61.c(this.e, i61.c(this.d, i61.c(this.c, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
