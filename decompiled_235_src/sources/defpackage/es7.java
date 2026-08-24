package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: es7  reason: default package */
/* loaded from: classes.dex */
public final class es7 {
    public static final long p = hv.c(4292124695L);
    public static final long q = hv.c(4294955583L);
    public static final long r = hv.c(4278190080L);
    public static final long s = hv.c(4278190080L);
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;

    public es7(boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.i = j8;
        this.j = j9;
        this.k = j10;
        this.l = j11;
        this.m = j12;
        this.n = j13;
        this.o = j14;
    }

    public final long a() {
        return this.l;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.e;
    }

    public final long d() {
        return this.g;
    }

    public final long e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof es7) {
                es7 es7Var = (es7) obj;
                if (this.a != es7Var.a || !kt0.d(this.b, es7Var.b) || !kt0.d(this.c, es7Var.c) || !kt0.d(this.d, es7Var.d) || !kt0.d(this.e, es7Var.e) || !kt0.d(this.f, es7Var.f) || !kt0.d(this.g, es7Var.g) || !kt0.d(this.h, es7Var.h) || !kt0.d(this.i, es7Var.i) || !kt0.d(this.j, es7Var.j) || !kt0.d(this.k, es7Var.k) || !kt0.d(this.l, es7Var.l) || !kt0.d(this.m, es7Var.m) || !kt0.d(this.n, es7Var.n) || !kt0.d(this.o, es7Var.o)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final long f() {
        return this.i;
    }

    public final int hashCode() {
        int i = kt0.i;
        return Long.hashCode(this.o) + i61.c(this.n, i61.c(this.m, i61.c(this.l, i61.c(this.k, i61.c(this.j, i61.c(this.i, i61.c(this.h, i61.c(this.g, i61.c(this.f, i61.c(this.e, i61.c(this.d, i61.c(this.c, i61.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String j = kt0.j(this.b);
        String j2 = kt0.j(this.c);
        String j3 = kt0.j(this.d);
        String j4 = kt0.j(this.e);
        String j5 = kt0.j(this.f);
        String j6 = kt0.j(this.g);
        String j7 = kt0.j(this.h);
        String j8 = kt0.j(this.i);
        String j9 = kt0.j(this.j);
        String j10 = kt0.j(this.k);
        String j11 = kt0.j(this.l);
        String j12 = kt0.j(this.m);
        String j13 = kt0.j(this.n);
        String j14 = kt0.j(this.o);
        StringBuilder sb = new StringBuilder("WatermelonColors(isDark=");
        sb.append(this.a);
        sb.append(", bg=");
        sb.append(j);
        sb.append(", surface=");
        i61.B(sb, j2, ", surface2=", j3, ", surface3=");
        i61.B(sb, j4, ", line=", j5, ", text=");
        i61.B(sb, j6, ", text2=", j7, ", text3=");
        i61.B(sb, j8, ", red=", j9, ", redGlow=");
        i61.B(sb, j10, ", green=", j11, ", greenDim=");
        i61.B(sb, j12, ", switchOff=", j13, ", shadow=");
        return i61.n(sb, j14, ")");
    }
}
