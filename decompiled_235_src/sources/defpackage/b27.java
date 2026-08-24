package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b27  reason: default package */
/* loaded from: classes.dex */
public final class b27 {
    public final fp a;
    public final long b;
    public final a47 c;
    public final mk4 d;
    public final j47 e;
    public long f;
    public final fp g;
    public final c37 h;
    public final b47 i;

    public b27(c37 c37Var, mk4 mk4Var, b47 b47Var, j47 j47Var) {
        a47 a47Var;
        fp fpVar = c37Var.a;
        long j = c37Var.b;
        if (b47Var != null) {
            a47Var = b47Var.a;
        } else {
            a47Var = null;
        }
        this.a = fpVar;
        this.b = j;
        this.c = a47Var;
        this.d = mk4Var;
        this.e = j47Var;
        this.f = j;
        this.g = fpVar;
        this.h = c37Var;
        this.i = b47Var;
    }

    public final List a(qn2 qn2Var) {
        if (k47.c(this.f)) {
            ds1 ds1Var = (ds1) qn2Var.g(this);
            if (ds1Var != null) {
                return hf.b0(ds1Var);
            }
            return null;
        }
        return hf.c0(new pu0("", 0), new dd6(k47.f(this.f), k47.f(this.f)));
    }

    public final Integer b() {
        a47 a47Var = this.c;
        if (a47Var != null) {
            v84 v84Var = a47Var.b;
            int e = k47.e(this.f);
            mk4 mk4Var = this.d;
            return Integer.valueOf(mk4Var.i(v84Var.c(v84Var.d(mk4Var.s(e)), true)));
        }
        return null;
    }

    public final Integer c() {
        a47 a47Var = this.c;
        if (a47Var != null) {
            int f = k47.f(this.f);
            mk4 mk4Var = this.d;
            return Integer.valueOf(mk4Var.i(a47Var.g(a47Var.b.d(mk4Var.s(f)))));
        }
        return null;
    }

    public final Integer d() {
        int length;
        a47 a47Var = this.c;
        if (a47Var != null) {
            int r = r();
            while (true) {
                fp fpVar = this.a;
                if (r >= fpVar.B.length()) {
                    length = fpVar.B.length();
                    break;
                }
                int length2 = this.g.B.length() - 1;
                if (r <= length2) {
                    length2 = r;
                }
                long j = a47Var.j(length2);
                int i = k47.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 <= r) {
                    r++;
                } else {
                    length = this.d.i(i2);
                    break;
                }
            }
            return Integer.valueOf(length);
        }
        return null;
    }

    public final Integer e() {
        int i;
        a47 a47Var = this.c;
        if (a47Var != null) {
            int r = r();
            while (true) {
                if (r <= 0) {
                    i = 0;
                    break;
                }
                int length = this.g.B.length() - 1;
                if (r <= length) {
                    length = r;
                }
                long j = a47Var.j(length);
                int i2 = k47.c;
                int i3 = (int) (j >> 32);
                if (i3 >= r) {
                    r--;
                } else {
                    i = this.d.i(i3);
                    break;
                }
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public final boolean f() {
        jl5 jl5Var;
        a47 a47Var = this.c;
        if (a47Var != null) {
            jl5Var = a47Var.h(r());
        } else {
            jl5Var = null;
        }
        if (jl5Var != jl5.Rtl) {
            return true;
        }
        return false;
    }

    public final int g(a47 a47Var, int i) {
        int r = r();
        j47 j47Var = this.e;
        if (j47Var.a == null) {
            j47Var.a = Float.valueOf(a47Var.c(r).a);
        }
        v84 v84Var = a47Var.b;
        int d = v84Var.d(r) + i;
        if (d < 0) {
            return 0;
        }
        if (d >= v84Var.f) {
            return this.g.B.length();
        }
        float b = v84Var.b(d) - 1.0f;
        Float f = j47Var.a;
        f.getClass();
        float floatValue = f.floatValue();
        if ((f() && floatValue >= a47Var.f(d)) || (!f() && floatValue <= a47Var.e(d))) {
            return v84Var.c(d, true);
        }
        return this.d.i(v84Var.g((Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r9 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(b47 b47Var, int i) {
        of5 of5Var;
        jk3 jk3Var = b47Var.b;
        a47 a47Var = b47Var.a;
        if (jk3Var != null) {
            jk3 jk3Var2 = b47Var.c;
            if (jk3Var2 != null) {
                of5Var = jk3Var2.O(jk3Var, true);
            } else {
                of5Var = null;
            }
        }
        of5Var = of5.e;
        long j = this.h.b;
        int i2 = k47.c;
        mk4 mk4Var = this.d;
        of5 c = a47Var.c(mk4Var.s((int) (j & 4294967295L)));
        float f = c.a;
        long floatToRawIntBits = Float.floatToRawIntBits((Float.intBitsToFloat((int) (of5Var.c() & 4294967295L)) * i) + c.b) & 4294967295L;
        return mk4Var.i(a47Var.b.g(floatToRawIntBits | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void i() {
        j47 j47Var = this.e;
        j47Var.a = null;
        fp fpVar = this.g;
        if (fpVar.B.length() > 0) {
            if (f()) {
                k();
                return;
            }
            j47Var.a = null;
            if (fpVar.B.length() > 0) {
                String str = fpVar.B;
                long j = this.f;
                int i = k47.c;
                int w = mp2.w((int) (j & 4294967295L), str);
                if (w != -1) {
                    q(w, w);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        fp fpVar = this.g;
        String str = fpVar.B;
        String str2 = fpVar.B;
        if (str.length() > 0) {
            int w = qo2.w(k47.e(this.f), str2);
            if (w == k47.e(this.f) && w != str2.length()) {
                w = qo2.w(w + 1, str2);
            }
            q(w, w);
        }
    }

    public final void k() {
        this.e.a = null;
        fp fpVar = this.g;
        if (fpVar.B.length() > 0) {
            String str = fpVar.B;
            long j = this.f;
            int i = k47.c;
            int x = mp2.x((int) (j & 4294967295L), str);
            if (x != -1) {
                q(x, x);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        fp fpVar = this.g;
        String str = fpVar.B;
        String str2 = fpVar.B;
        if (str.length() > 0) {
            int x = qo2.x(k47.f(this.f), str2);
            if (x == k47.f(this.f) && x != 0) {
                x = qo2.x(x - 1, str2);
            }
            q(x, x);
        }
    }

    public final void m() {
        j47 j47Var = this.e;
        j47Var.a = null;
        fp fpVar = this.g;
        if (fpVar.B.length() > 0) {
            if (f()) {
                j47Var.a = null;
                if (fpVar.B.length() > 0) {
                    String str = fpVar.B;
                    long j = this.f;
                    int i = k47.c;
                    int w = mp2.w((int) (j & 4294967295L), str);
                    if (w != -1) {
                        q(w, w);
                        return;
                    }
                    return;
                }
                return;
            }
            k();
        }
    }

    public final void n() {
        Integer b;
        this.e.a = null;
        if (this.g.B.length() > 0 && (b = b()) != null) {
            int intValue = b.intValue();
            q(intValue, intValue);
        }
    }

    public final void o() {
        Integer c;
        this.e.a = null;
        if (this.g.B.length() > 0 && (c = c()) != null) {
            int intValue = c.intValue();
            q(intValue, intValue);
        }
    }

    public final void p() {
        if (this.g.B.length() > 0) {
            int i = k47.c;
            this.f = jx2.f((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = jx2.f(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = k47.c;
        return this.d.s((int) (j & 4294967295L));
    }
}
