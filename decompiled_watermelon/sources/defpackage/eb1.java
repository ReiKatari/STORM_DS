package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eb1  reason: default package */
/* loaded from: classes.dex */
public final class eb1 {
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

    public eb1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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

    public final k24 a(boolean z, boolean z2, tu0 tu0Var) {
        long j;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.X(-1491563694);
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
        return b31.g(j, sk2Var, false);
    }

    public final k24 b(boolean z, boolean z2, tu0 tu0Var) {
        long j;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.X(1575395620);
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
        return b31.g(j, sk2Var, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eb1.class != obj.getClass()) {
            return false;
        }
        eb1 eb1Var = (eb1) obj;
        if (xq0.c(this.a, eb1Var.a) && xq0.c(this.b, eb1Var.b) && xq0.c(this.c, eb1Var.c) && xq0.c(this.d, eb1Var.d) && xq0.c(this.e, eb1Var.e) && xq0.c(this.f, eb1Var.f) && xq0.c(this.g, eb1Var.g) && xq0.c(this.h, eb1Var.h) && xq0.c(this.i, eb1Var.i) && xq0.c(this.j, eb1Var.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = xq0.i;
        return Long.hashCode(this.j) + b31.c(this.i, b31.c(this.h, b31.c(this.g, b31.c(this.f, b31.c(this.e, b31.c(this.d, b31.c(this.c, b31.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
