package defpackage;

import androidx.work.OverwritingInputMerger;
import com.github.junrar.unpack.ppm.RangeCoder;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yw7  reason: default package */
/* loaded from: classes.dex */
public final class yw7 {
    public static final fa6 z;
    public final String a;
    public iw7 b;
    public final String c;
    public final String d;
    public xb1 e;
    public final xb1 f;
    public final long g;
    public final long h;
    public final long i;
    public p21 j;
    public final int k;
    public w10 l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public oo4 r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;
    public final Boolean y;

    static {
        ga0.h("WorkSpec");
        z = new fa6(19);
    }

    public /* synthetic */ yw7(String str, iw7 iw7Var, String str2, String str3, xb1 xb1Var, xb1 xb1Var2, long j, long j2, long j3, p21 p21Var, int i, w10 w10Var, long j4, long j5, long j6, long j7, boolean z2, oo4 oo4Var, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? iw7.ENQUEUED : iw7Var, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? xb1.b : xb1Var, (i5 & 32) != 0 ? xb1.b : xb1Var2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? p21.j : p21Var, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? w10.EXPONENTIAL : w10Var, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? oo4.RUN_AS_NON_EXPEDITED_WORK_REQUEST : oo4Var, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & RangeCoder.TOP) != 0 ? Boolean.FALSE : bool);
    }

    public static yw7 b(yw7 yw7Var, String str, xb1 xb1Var) {
        String str2 = yw7Var.a;
        iw7 iw7Var = yw7Var.b;
        String str3 = yw7Var.d;
        xb1 xb1Var2 = yw7Var.f;
        long j = yw7Var.g;
        long j2 = yw7Var.h;
        long j3 = yw7Var.i;
        p21 p21Var = yw7Var.j;
        int i = yw7Var.k;
        w10 w10Var = yw7Var.l;
        long j4 = yw7Var.m;
        long j5 = yw7Var.n;
        long j6 = yw7Var.o;
        long j7 = yw7Var.p;
        boolean z2 = yw7Var.q;
        oo4 oo4Var = yw7Var.r;
        int i2 = yw7Var.s;
        int i3 = yw7Var.t;
        long j8 = yw7Var.u;
        int i4 = yw7Var.v;
        int i5 = yw7Var.w;
        String str4 = yw7Var.x;
        Boolean bool = yw7Var.y;
        yw7Var.getClass();
        str2.getClass();
        iw7Var.getClass();
        str3.getClass();
        xb1Var2.getClass();
        p21Var.getClass();
        w10Var.getClass();
        oo4Var.getClass();
        return new yw7(str2, iw7Var, str, str3, xb1Var, xb1Var2, j, j2, j3, p21Var, i, w10Var, j4, j5, j6, j7, z2, oo4Var, i2, i3, j8, i4, i5, str4, bool);
    }

    public final long a() {
        boolean z2;
        if (this.b == iw7.ENQUEUED && this.k > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return vw7.c(z2, this.k, this.l, this.m, this.n, this.s, c(), this.g, this.i, this.h, this.u);
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
        if (!(obj instanceof yw7)) {
            return false;
        }
        yw7 yw7Var = (yw7) obj;
        if (nb3.k(this.a, yw7Var.a) && this.b == yw7Var.b && nb3.k(this.c, yw7Var.c) && nb3.k(this.d, yw7Var.d) && nb3.k(this.e, yw7Var.e) && nb3.k(this.f, yw7Var.f) && this.g == yw7Var.g && this.h == yw7Var.h && this.i == yw7Var.i && nb3.k(this.j, yw7Var.j) && this.k == yw7Var.k && this.l == yw7Var.l && this.m == yw7Var.m && this.n == yw7Var.n && this.o == yw7Var.o && this.p == yw7Var.p && this.q == yw7Var.q && this.r == yw7Var.r && this.s == yw7Var.s && this.t == yw7Var.t && this.u == yw7Var.u && this.v == yw7Var.v && this.w == yw7Var.w && nb3.k(this.x, yw7Var.x) && nb3.k(this.y, yw7Var.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int d = xg6.d(xg6.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        int a = lb1.a(this.w, lb1.a(this.v, i61.c(this.u, lb1.a(this.t, lb1.a(this.s, (this.r.hashCode() + xg6.e(i61.c(this.p, i61.c(this.o, i61.c(this.n, i61.c(this.m, (this.l.hashCode() + lb1.a(this.k, (this.j.hashCode() + i61.c(this.i, i61.c(this.h, i61.c(this.g, (this.f.hashCode() + ((this.e.hashCode() + d) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), this.q, 31)) * 31, 31), 31), 31), 31), 31);
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
        return lb1.q(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public yw7(String str, iw7 iw7Var, String str2, String str3, xb1 xb1Var, xb1 xb1Var2, long j, long j2, long j3, p21 p21Var, int i, w10 w10Var, long j4, long j5, long j6, long j7, boolean z2, oo4 oo4Var, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        iw7Var.getClass();
        str2.getClass();
        str3.getClass();
        xb1Var.getClass();
        xb1Var2.getClass();
        p21Var.getClass();
        w10Var.getClass();
        oo4Var.getClass();
        this.a = str;
        this.b = iw7Var;
        this.c = str2;
        this.d = str3;
        this.e = xb1Var;
        this.f = xb1Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = p21Var;
        this.k = i;
        this.l = w10Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = oo4Var;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
