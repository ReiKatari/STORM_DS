package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cf1  reason: default package */
/* loaded from: classes.dex */
public final class cf1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public cf1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final qa4 a(boolean z, boolean z2, px0 px0Var) {
        long j;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.b0(-1491563694);
        if (z) {
            if (z2) {
                j = this.g;
            } else {
                j = this.h;
            }
        } else if (z2) {
            j = this.i;
        } else {
            j = this.j;
        }
        return i61.g(j, xq2Var, false);
    }

    public final qa4 b(boolean z, boolean z2, px0 px0Var) {
        long j;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.b0(1575395620);
        if (z) {
            if (z2) {
                j = this.c;
            } else {
                j = this.d;
            }
        } else if (z2) {
            j = this.e;
        } else {
            j = this.f;
        }
        return i61.g(j, xq2Var, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cf1.class != obj.getClass()) {
            return false;
        }
        cf1 cf1Var = (cf1) obj;
        if (kt0.d(this.a, cf1Var.a) && kt0.d(this.b, cf1Var.b) && kt0.d(this.c, cf1Var.c) && kt0.d(this.d, cf1Var.d) && kt0.d(this.e, cf1Var.e) && kt0.d(this.f, cf1Var.f) && kt0.d(this.g, cf1Var.g) && kt0.d(this.h, cf1Var.h) && kt0.d(this.i, cf1Var.i) && kt0.d(this.j, cf1Var.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = kt0.i;
        return Long.hashCode(this.j) + i61.c(this.i, i61.c(this.h, i61.c(this.g, i61.c(this.f, i61.c(this.e, i61.c(this.d, i61.c(this.c, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
