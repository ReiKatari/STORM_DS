package defpackage;

import androidx.work.OverwritingInputMerger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xh7  reason: default package */
/* loaded from: classes.dex */
public final class xh7 {
    public static final vd6 z;
    public final String a;
    public ih7 b;
    public final String c;
    public final String d;
    public g81 e;
    public final g81 f;
    public final long g;
    public final long h;
    public final long i;
    public kz0 j;
    public final int k;
    public f00 l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public mf4 r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;
    public final Boolean y;

    static {
        y70.h("WorkSpec");
        z = new vd6(18);
    }

    public /* synthetic */ xh7(String str, ih7 ih7Var, String str2, String str3, g81 g81Var, g81 g81Var2, long j, long j2, long j3, kz0 kz0Var, int i, f00 f00Var, long j4, long j5, long j6, long j7, boolean z2, mf4 mf4Var, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? ih7.ENQUEUED : ih7Var, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? g81.b : g81Var, (i5 & 32) != 0 ? g81.b : g81Var2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? kz0.j : kz0Var, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? f00.EXPONENTIAL : f00Var, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? mf4.RUN_AS_NON_EXPEDITED_WORK_REQUEST : mf4Var, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static xh7 b(xh7 xh7Var, String str, g81 g81Var) {
        String str2 = xh7Var.a;
        ih7 ih7Var = xh7Var.b;
        String str3 = xh7Var.d;
        g81 g81Var2 = xh7Var.f;
        long j = xh7Var.g;
        long j2 = xh7Var.h;
        long j3 = xh7Var.i;
        kz0 kz0Var = xh7Var.j;
        int i = xh7Var.k;
        f00 f00Var = xh7Var.l;
        long j4 = xh7Var.m;
        long j5 = xh7Var.n;
        long j6 = xh7Var.o;
        long j7 = xh7Var.p;
        boolean z2 = xh7Var.q;
        mf4 mf4Var = xh7Var.r;
        int i2 = xh7Var.s;
        int i3 = xh7Var.t;
        long j8 = xh7Var.u;
        int i4 = xh7Var.v;
        int i5 = xh7Var.w;
        String str4 = xh7Var.x;
        Boolean bool = xh7Var.y;
        xh7Var.getClass();
        str2.getClass();
        ih7Var.getClass();
        str3.getClass();
        g81Var2.getClass();
        kz0Var.getClass();
        f00Var.getClass();
        mf4Var.getClass();
        return new xh7(str2, ih7Var, str, str3, g81Var, g81Var2, j, j2, j3, kz0Var, i, f00Var, j4, j5, j6, j7, z2, mf4Var, i2, i3, j8, i4, i5, str4, bool);
    }

    public final long a() {
        boolean z2;
        if (this.b == ih7.ENQUEUED && this.k > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return uh7.c(z2, this.k, this.l, this.m, this.n, this.s, c(), this.g, this.i, this.h, this.u);
    }

    public final boolean c() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh7)) {
            return false;
        }
        xh7 xh7Var = (xh7) obj;
        if (b53.x(this.a, xh7Var.a) && this.b == xh7Var.b && b53.x(this.c, xh7Var.c) && b53.x(this.d, xh7Var.d) && b53.x(this.e, xh7Var.e) && b53.x(this.f, xh7Var.f) && this.g == xh7Var.g && this.h == xh7Var.h && this.i == xh7Var.i && b53.x(this.j, xh7Var.j) && this.k == xh7Var.k && this.l == xh7Var.l && this.m == xh7Var.m && this.n == xh7Var.n && this.o == xh7Var.o && this.p == xh7Var.p && this.q == xh7Var.q && this.r == xh7Var.r && this.s == xh7Var.s && this.t == xh7Var.t && this.u == xh7Var.u && this.v == xh7Var.v && this.w == xh7Var.w && b53.x(this.x, xh7Var.x) && b53.x(this.y, xh7Var.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = ej6.b(ej6.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        int a = wh1.a(this.w, wh1.a(this.v, b31.c(this.u, wh1.a(this.t, wh1.a(this.s, (this.r.hashCode() + ej6.c(b31.c(this.p, b31.c(this.o, b31.c(this.n, b31.c(this.m, (this.l.hashCode() + wh1.a(this.k, (this.j.hashCode() + b31.c(this.i, b31.c(this.h, b31.c(this.g, (this.f.hashCode() + ((this.e.hashCode() + b) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), this.q, 31)) * 31, 31), 31), 31), 31), 31);
        String str = this.x;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        Boolean bool = this.y;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return wh1.o(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public xh7(String str, ih7 ih7Var, String str2, String str3, g81 g81Var, g81 g81Var2, long j, long j2, long j3, kz0 kz0Var, int i, f00 f00Var, long j4, long j5, long j6, long j7, boolean z2, mf4 mf4Var, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        ih7Var.getClass();
        str2.getClass();
        str3.getClass();
        g81Var.getClass();
        g81Var2.getClass();
        kz0Var.getClass();
        f00Var.getClass();
        mf4Var.getClass();
        this.a = str;
        this.b = ih7Var;
        this.c = str2;
        this.d = str3;
        this.e = g81Var;
        this.f = g81Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = kz0Var;
        this.k = i;
        this.l = f00Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = mf4Var;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
