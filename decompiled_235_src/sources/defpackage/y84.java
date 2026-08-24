package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y84  reason: default package */
/* loaded from: classes.dex */
public final class y84 {
    public fp a;
    public ki2 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public k64 h;
    public qh1 j;
    public s47 k;
    public s9 l;
    public kk3 m;
    public a47 n;
    public long q;
    public long i = t53.a;
    public int o = -1;
    public int p = -1;

    public y84(fp fpVar, s47 s47Var, ki2 ki2Var, int i, boolean z, int i2, int i3, List list) {
        this.a = fpVar;
        this.b = ki2Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = s47Var;
    }

    public final int a(int i, kk3 kk3Var) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long a = s21.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            k64 k64Var = this.h;
            s47 s47Var = this.k;
            qh1 qh1Var = this.j;
            qh1Var.getClass();
            k64 s = yh2.s(k64Var, kk3Var, s47Var, qh1Var, this.b);
            this.h = s;
            a = s.a(this.f, a);
        }
        int q = ii2.q(b(a, kk3Var).e);
        int i4 = q21.i(a);
        if (q < i4) {
            q = i4;
        }
        this.o = i;
        this.p = q;
        return q;
    }

    public final v84 b(long j, kk3 kk3Var) {
        int i;
        s9 e = e(kk3Var);
        long v = mp2.v(j, this.d, this.c, e.c());
        boolean z = this.d;
        int i2 = this.c;
        int i3 = this.e;
        if ((!z && (i2 == 2 || i2 == 4 || i2 == 5)) || i3 < 1) {
            i = 1;
        } else {
            i = i3;
        }
        return new v84(e, v, i, i2);
    }

    public final boolean c(long j, kk3 kk3Var) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            k64 k64Var = this.h;
            s47 s47Var = this.k;
            qh1 qh1Var = this.j;
            qh1Var.getClass();
            k64 s = yh2.s(k64Var, kk3Var, s47Var, qh1Var, this.b);
            this.h = s;
            j = s.a(this.f, j);
        }
        a47 a47Var = this.n;
        if (a47Var != null) {
            v84 v84Var = a47Var.b;
            z37 z37Var = a47Var.a;
            if (!v84Var.a.a()) {
                kk3 kk3Var2 = z37Var.h;
                long j2 = z37Var.j;
                if (kk3Var == kk3Var2 && (q21.b(j, j2) || (q21.h(j) == q21.h(j2) && q21.j(j) == q21.j(j2) && q21.g(j) >= v84Var.e && !v84Var.c))) {
                    a47 a47Var2 = this.n;
                    a47Var2.getClass();
                    if (q21.b(j, a47Var2.a.j)) {
                        return false;
                    }
                    a47 a47Var3 = this.n;
                    a47Var3.getClass();
                    this.n = f(kk3Var, j, a47Var3.b);
                    return true;
                }
            }
        }
        this.n = f(kk3Var, j, b(j, kk3Var));
        return true;
    }

    public final void d(qh1 qh1Var) {
        long j;
        qh1 qh1Var2 = this.j;
        if (qh1Var != null) {
            int i = t53.b;
            j = t53.a(qh1Var.a(), qh1Var.Y());
        } else {
            j = t53.a;
        }
        if (qh1Var2 == null) {
            this.j = qh1Var;
            this.i = j;
        } else if (qh1Var != null && this.i == j) {
        } else {
            this.j = qh1Var;
            this.i = j;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final s9 e(kk3 kk3Var) {
        s9 s9Var = this.l;
        if (s9Var == null || kk3Var != this.m || s9Var.a()) {
            this.m = kk3Var;
            fp fpVar = this.a;
            s47 N = gi2.N(this.k, kk3Var);
            qh1 qh1Var = this.j;
            qh1Var.getClass();
            ki2 ki2Var = this.b;
            List list = this.g;
            if (list == null) {
                list = yt1.A;
            }
            s9Var = new s9(fpVar, N, list, qh1Var, ki2Var);
        }
        this.l = s9Var;
        return s9Var;
    }

    public final a47 f(kk3 kk3Var, long j, v84 v84Var) {
        float min = Math.min(v84Var.a.c(), v84Var.d);
        fp fpVar = this.a;
        s47 s47Var = this.k;
        List list = this.g;
        if (list == null) {
            list = yt1.A;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        qh1 qh1Var = this.j;
        qh1Var.getClass();
        return new a47(new z37(fpVar, s47Var, list, i, z, i2, qh1Var, kk3Var, this.b, j), v84Var, s21.d(j, (ii2.q(min) << 32) | (ii2.q(v84Var.e) & 4294967295L)));
    }

    public final String toString() {
        String str;
        z37 z37Var;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object obj = "null";
        if (this.n == null) {
            str = "null";
        } else {
            str = "<TextLayoutResult>";
        }
        sb.append(str);
        sb.append(", lastDensity=");
        sb.append((Object) t53.b(this.i));
        sb.append(", history=");
        sb.append(this.q);
        sb.append(", constraints=");
        a47 a47Var = this.n;
        if (a47Var != null && (z37Var = a47Var.a) != null) {
            obj = new q21(z37Var.j);
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
