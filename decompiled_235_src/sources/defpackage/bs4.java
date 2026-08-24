package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bs4  reason: default package */
/* loaded from: classes.dex */
public final class bs4 {
    public String a;
    public s47 b;
    public ki2 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public qh1 i;
    public cj j;
    public boolean k;
    public k64 m;
    public as4 n;
    public kk3 o;
    public long s;
    public long h = t53.a;
    public long l = 0;
    public long p = s21.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public bs4(String str, s47 s47Var, ki2 ki2Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = s47Var;
        this.c = ki2Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public static long g(bs4 bs4Var, long j, kk3 kk3Var) {
        s47 s47Var = bs4Var.b;
        k64 k64Var = bs4Var.m;
        qh1 qh1Var = bs4Var.i;
        qh1Var.getClass();
        k64 s = yh2.s(k64Var, kk3Var, s47Var, qh1Var, bs4Var.c);
        bs4Var.m = s;
        return s.a(bs4Var.g, j);
    }

    public final int a(int i, kk3 kk3Var) {
        int i2;
        int i3 = this.q;
        int i4 = this.r;
        if (i == i3 && i3 != -1) {
            return i4;
        }
        long a = s21.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            a = g(this, a, kk3Var);
        }
        as4 e = e(kk3Var);
        long v = mp2.v(a, this.e, this.d, e.c());
        boolean z = this.e;
        int i5 = this.d;
        int i6 = this.f;
        if ((!z && (i5 == 2 || i5 == 4 || i5 == 5)) || i6 < 1) {
            i2 = 1;
        } else {
            i2 = i6;
        }
        int q = ii2.q(new cj((gj) e, i2, i5, v).b());
        int i7 = q21.i(a);
        if (q < i7) {
            q = i7;
        }
        this.q = i;
        this.r = q;
        return q;
    }

    public final boolean b(long j, kk3 kk3Var) {
        long j2;
        int i;
        long d;
        as4 as4Var;
        long d2;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        if (this.g > 1) {
            j2 = g(this, j, kk3Var);
        } else {
            j2 = j;
        }
        cj cjVar = this.j;
        boolean z2 = false;
        if (cjVar != null && (as4Var = this.n) != null && !as4Var.a() && kk3Var == this.o && (q21.b(j2, this.p) || (q21.h(j2) == q21.h(this.p) && q21.j(j2) == q21.j(this.p) && q21.g(j2) >= cjVar.b() && !cjVar.d.d))) {
            if (!q21.b(j2, this.p)) {
                cj cjVar2 = this.j;
                cjVar2.getClass();
                this.l = s21.d(j2, (ii2.q(Math.min(cjVar2.a.i.c(), cjVar2.d())) << 32) | (ii2.q(cjVar2.b()) & 4294967295L));
                if (this.d == 3 || (((int) (d2 >> 32)) >= cjVar2.d() && ((int) (4294967295L & d2)) >= cjVar2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = j2;
            }
            return false;
        }
        as4 e = e(kk3Var);
        long v = mp2.v(j2, this.e, this.d, e.c());
        boolean z3 = this.e;
        int i2 = this.d;
        int i3 = this.f;
        if ((!z3 && (i2 == 2 || i2 == 4 || i2 == 5)) || i3 < 1) {
            i = 1;
        } else {
            i = i3;
        }
        cj cjVar3 = new cj((gj) e, i, i2, v);
        this.p = j2;
        this.l = s21.d(j2, (ii2.q(cjVar3.b()) & 4294967295L) | (ii2.q(cjVar3.d()) << 32));
        if (this.d != 3 && (((int) (d >> 32)) < cjVar3.d() || ((int) (d & 4294967295L)) < cjVar3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = cjVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = s21.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(qh1 qh1Var) {
        long j;
        qh1 qh1Var2 = this.i;
        if (qh1Var != null) {
            int i = t53.b;
            j = t53.a(qh1Var.a(), qh1Var.Y());
        } else {
            j = t53.a;
        }
        if (qh1Var2 == null) {
            this.i = qh1Var;
            this.h = j;
        } else if (qh1Var != null && this.h == j) {
        } else {
            this.i = qh1Var;
            this.h = j;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final as4 e(kk3 kk3Var) {
        as4 as4Var = this.n;
        if (as4Var == null || kk3Var != this.o || as4Var.a()) {
            this.o = kk3Var;
            String str = this.a;
            s47 N = gi2.N(this.b, kk3Var);
            qh1 qh1Var = this.i;
            qh1Var.getClass();
            ki2 ki2Var = this.c;
            yt1 yt1Var = yt1.A;
            as4Var = new gj(str, N, yt1Var, yt1Var, ki2Var, qh1Var);
        }
        this.n = as4Var;
        return as4Var;
    }

    public final void f(String str, s47 s47Var, ki2 ki2Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = s47Var;
        this.c = ki2Var;
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
        sb.append((Object) t53.b(this.h));
        sb.append(", history=");
        return lb1.p(sb, this.s, ", constraints=$)");
    }
}
