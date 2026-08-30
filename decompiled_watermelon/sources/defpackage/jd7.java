package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jd7  reason: default package */
/* loaded from: classes.dex */
public final class jd7 {
    public static final long p = mh7.d(4292124695L);
    public static final long q = mh7.d(4294955583L);
    public static final long r = mh7.d(4278913549L);
    public static final long s = mh7.d(4279374102L);
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

    public jd7(boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
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

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jd7) {
                jd7 jd7Var = (jd7) obj;
                if (this.a != jd7Var.a || !xq0.c(this.b, jd7Var.b) || !xq0.c(this.c, jd7Var.c) || !xq0.c(this.d, jd7Var.d) || !xq0.c(this.e, jd7Var.e) || !xq0.c(this.f, jd7Var.f) || !xq0.c(this.g, jd7Var.g) || !xq0.c(this.h, jd7Var.h) || !xq0.c(this.i, jd7Var.i) || !xq0.c(this.j, jd7Var.j) || !xq0.c(this.k, jd7Var.k) || !xq0.c(this.l, jd7Var.l) || !xq0.c(this.m, jd7Var.m) || !xq0.c(this.n, jd7Var.n) || !xq0.c(this.o, jd7Var.o)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = xq0.i;
        return Long.hashCode(this.o) + b31.c(this.n, b31.c(this.m, b31.c(this.l, b31.c(this.k, b31.c(this.j, b31.c(this.i, b31.c(this.h, b31.c(this.g, b31.c(this.f, b31.c(this.e, b31.c(this.d, b31.c(this.c, b31.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String i = xq0.i(this.b);
        String i2 = xq0.i(this.c);
        String i3 = xq0.i(this.d);
        String i4 = xq0.i(this.e);
        String i5 = xq0.i(this.f);
        String i6 = xq0.i(this.g);
        String i7 = xq0.i(this.h);
        String i8 = xq0.i(this.i);
        String i9 = xq0.i(this.j);
        String i10 = xq0.i(this.k);
        String i11 = xq0.i(this.l);
        String i12 = xq0.i(this.m);
        String i13 = xq0.i(this.n);
        String i14 = xq0.i(this.o);
        StringBuilder sb = new StringBuilder("WatermelonColors(isDark=");
        sb.append(this.a);
        sb.append(", bg=");
        sb.append(i);
        sb.append(", surface=");
        b31.B(sb, i2, ", surface2=", i3, ", surface3=");
        b31.B(sb, i4, ", line=", i5, ", text=");
        b31.B(sb, i6, ", text2=", i7, ", text3=");
        b31.B(sb, i8, ", red=", i9, ", redGlow=");
        b31.B(sb, i10, ", green=", i11, ", greenDim=");
        b31.B(sb, i12, ", switchOff=", i13, ", shadow=");
        return b31.q(sb, i14, ")");
    }
}
