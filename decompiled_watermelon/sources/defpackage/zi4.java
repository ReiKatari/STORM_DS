package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zi4  reason: default package */
/* loaded from: classes.dex */
public final class zi4 {
    public String a;
    public ds6 b;
    public od2 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public od1 i;
    public qi j;
    public boolean k;
    public ry3 m;
    public yi4 n;
    public sd3 o;
    public long s;
    public long h = qz2.a;
    public long l = 0;
    public long p = nz0.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public zi4(String str, ds6 ds6Var, od2 od2Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = ds6Var;
        this.c = od2Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public static long g(zi4 zi4Var, long j, sd3 sd3Var) {
        ds6 ds6Var = zi4Var.b;
        ry3 ry3Var = zi4Var.m;
        od1 od1Var = zi4Var.i;
        od1Var.getClass();
        ry3 K = nl2.K(ry3Var, sd3Var, ds6Var, od1Var, zi4Var.c);
        zi4Var.m = K;
        return K.a(zi4Var.g, j);
    }

    public final int a(int i, sd3 sd3Var) {
        int i2;
        int i3 = this.q;
        int i4 = this.r;
        if (i == i3 && i3 != -1) {
            return i4;
        }
        long a = nz0.a(0, i, 0, Preference.DEFAULT_ORDER);
        if (this.g > 1) {
            a = g(this, a, sd3Var);
        }
        yi4 e = e(sd3Var);
        long w = nk2.w(a, this.e, this.d, e.c());
        boolean z = this.e;
        int i5 = this.d;
        int i6 = this.f;
        if ((!z && (i5 == 2 || i5 == 4 || i5 == 5)) || i6 < 1) {
            i2 = 1;
        } else {
            i2 = i6;
        }
        int f = hi2.f(new qi((ui) e, i2, i5, w).b());
        int i7 = lz0.i(a);
        if (f < i7) {
            f = i7;
        }
        this.q = i;
        this.r = f;
        return f;
    }

    public final boolean b(long j, sd3 sd3Var) {
        long j2;
        int i;
        long d;
        yi4 yi4Var;
        long d2;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        if (this.g > 1) {
            j2 = g(this, j, sd3Var);
        } else {
            j2 = j;
        }
        qi qiVar = this.j;
        boolean z2 = false;
        if (qiVar != null && (yi4Var = this.n) != null && !yi4Var.b() && sd3Var == this.o && (lz0.b(j2, this.p) || (lz0.h(j2) == lz0.h(this.p) && lz0.j(j2) == lz0.j(this.p) && lz0.g(j2) >= qiVar.b() && !qiVar.d.d))) {
            if (!lz0.b(j2, this.p)) {
                qi qiVar2 = this.j;
                qiVar2.getClass();
                this.l = nz0.d(j2, (hi2.f(Math.min(qiVar2.a.i.c(), qiVar2.d())) << 32) | (hi2.f(qiVar2.b()) & 4294967295L));
                if (this.d == 3 || (((int) (d2 >> 32)) >= qiVar2.d() && ((int) (4294967295L & d2)) >= qiVar2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = j2;
            }
            return false;
        }
        yi4 e = e(sd3Var);
        long w = nk2.w(j2, this.e, this.d, e.c());
        boolean z3 = this.e;
        int i2 = this.d;
        int i3 = this.f;
        if ((!z3 && (i2 == 2 || i2 == 4 || i2 == 5)) || i3 < 1) {
            i = 1;
        } else {
            i = i3;
        }
        qi qiVar3 = new qi((ui) e, i, i2, w);
        this.p = j2;
        this.l = nz0.d(j2, (hi2.f(qiVar3.b()) & 4294967295L) | (hi2.f(qiVar3.d()) << 32));
        if (this.d != 3 && (((int) (d >> 32)) < qiVar3.d() || ((int) (d & 4294967295L)) < qiVar3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = qiVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = nz0.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(od1 od1Var) {
        long j;
        od1 od1Var2 = this.i;
        if (od1Var != null) {
            int i = qz2.b;
            j = qz2.a(od1Var.b(), od1Var.o());
        } else {
            j = qz2.a;
        }
        if (od1Var2 == null) {
            this.i = od1Var;
            this.h = j;
        } else if (od1Var != null && this.h == j) {
        } else {
            this.i = od1Var;
            this.h = j;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final yi4 e(sd3 sd3Var) {
        yi4 yi4Var = this.n;
        if (yi4Var == null || sd3Var != this.o || yi4Var.b()) {
            this.o = sd3Var;
            String str = this.a;
            ds6 T = cg2.T(this.b, sd3Var);
            od1 od1Var = this.i;
            od1Var.getClass();
            od2 od2Var = this.c;
            pp1 pp1Var = pp1.A;
            yi4Var = new ui(str, T, pp1Var, pp1Var, od2Var, od1Var);
        }
        this.n = yi4Var;
        return yi4Var;
    }

    public final void f(String str, ds6 ds6Var, od2 od2Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = ds6Var;
        this.c = od2Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.s = (this.s << 2) | 2;
        c();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        if (this.j != null) {
            str = "<paragraph>";
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", lastDensity=");
        sb.append((Object) qz2.b(this.h));
        sb.append(", history=");
        return wh1.n(sb, this.s, ", constraints=$)");
    }
}
