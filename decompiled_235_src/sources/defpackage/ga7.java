package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ga7  reason: default package */
/* loaded from: classes.dex */
public final class ga7 {
    public final gx0 a;
    public final ga7 b;
    public final String c;
    public final vs4 d;
    public final vs4 e;
    public final ts4 f = new ts4(0);
    public final ts4 g = new ts4(Long.MIN_VALUE);
    public final vs4 h;
    public final mm6 i;
    public final mm6 j;
    public final vs4 k;
    public final ii1 l;

    public ga7(gx0 gx0Var, ga7 ga7Var, String str) {
        this.a = gx0Var;
        this.b = ga7Var;
        this.c = str;
        this.d = np2.Y(gx0Var.f());
        this.e = np2.Y(new ba7(gx0Var.f(), gx0Var.f()));
        Boolean bool = Boolean.FALSE;
        this.h = np2.Y(bool);
        this.i = new mm6();
        this.j = new mm6();
        this.k = np2.Y(bool);
        this.l = np2.I(new s97(this, 1));
        gx0Var.m(this);
    }

    public final void a(Object obj, px0 px0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean h;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1493585151);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = xq2Var.f(obj);
            } else {
                h = xq2Var.h(obj);
            }
            if (h) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.f(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        boolean z3 = true;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            if (!g()) {
                xq2Var.b0(466062241);
                p(obj);
                int i5 = i2 & 112;
                if (i5 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object P = xq2Var.P();
                vs0 vs0Var = ox0.a;
                if (z2 || P == vs0Var) {
                    P = np2.I(new s97(this, 0));
                    xq2Var.l0(P);
                }
                if (((Boolean) ((pp6) P).getValue()).booleanValue()) {
                    xq2Var.b0(466470356);
                    Object P2 = xq2Var.P();
                    if (P2 == vs0Var) {
                        P2 = mb3.w(xq2Var);
                        xq2Var.l0(P2);
                    }
                    w61 w61Var = (w61) P2;
                    boolean h2 = xq2Var.h(w61Var);
                    if (i5 != 32) {
                        z3 = false;
                    }
                    boolean z4 = h2 | z3;
                    Object P3 = xq2Var.P();
                    if (z4 || P3 == vs0Var) {
                        P3 = new qk4(28, w61Var, this);
                        xq2Var.l0(P3);
                    }
                    mb3.e(w61Var, this, (qn2) P3, xq2Var);
                    xq2Var.p(false);
                } else {
                    xq2Var.b0(467712929);
                    xq2Var.p(false);
                }
                xq2Var.p(false);
            } else {
                xq2Var.b0(467722849);
                xq2Var.p(false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new hp(this, i, 14, obj);
        }
    }

    public final long b() {
        mm6 mm6Var = this.i;
        int size = mm6Var.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((ca7) mm6Var.get(i)).h0.h());
        }
        mm6 mm6Var2 = this.j;
        int size2 = mm6Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((ga7) mm6Var2.get(i2)).b());
        }
        return j;
    }

    public final void c() {
        mm6 mm6Var = this.i;
        int size = mm6Var.size();
        for (int i = 0; i < size; i++) {
            ca7 ca7Var = (ca7) mm6Var.get(i);
            ca7Var.Y = null;
            ca7Var.X = null;
            ca7Var.e0 = false;
        }
        mm6 mm6Var2 = this.j;
        int size2 = mm6Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ga7) mm6Var2.get(i2)).c();
        }
    }

    public final boolean d() {
        mm6 mm6Var = this.i;
        int size = mm6Var.size();
        for (int i = 0; i < size; i++) {
            if (((ca7) mm6Var.get(i)).X != null) {
                return true;
            }
        }
        mm6 mm6Var2 = this.j;
        int size2 = mm6Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((ga7) mm6Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        ga7 ga7Var = this.b;
        if (ga7Var != null) {
            return ga7Var.e();
        }
        return this.f.h();
    }

    public final aa7 f() {
        return (aa7) this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        long j2;
        ts4 ts4Var = this.g;
        int i = (ts4Var.h() > Long.MIN_VALUE ? 1 : (ts4Var.h() == Long.MIN_VALUE ? 0 : -1));
        gx0 gx0Var = this.a;
        if (i == 0) {
            ts4Var.i(j);
            ((vs4) gx0Var.a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((vs4) gx0Var.a).getValue()).booleanValue()) {
            ((vs4) gx0Var.a).setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        mm6 mm6Var = this.i;
        int size = mm6Var.size();
        boolean z2 = true;
        for (int i2 = 0; i2 < size; i2++) {
            ca7 ca7Var = (ca7) mm6Var.get(i2);
            vs4 vs4Var = ca7Var.Z;
            vs4 vs4Var2 = ca7Var.Z;
            if (!((Boolean) vs4Var.getValue()).booleanValue()) {
                if (z) {
                    j2 = ca7Var.a().b();
                } else {
                    j2 = j;
                }
                ca7Var.f(ca7Var.a().g(j2));
                ca7Var.g0 = ca7Var.a().d(j2);
                if (ca7Var.a().e(j2)) {
                    vs4Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) vs4Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        mm6 mm6Var2 = this.j;
        int size2 = mm6Var2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ga7 ga7Var = (ga7) mm6Var2.get(i3);
            vs4 vs4Var3 = ga7Var.d;
            gx0 gx0Var2 = ga7Var.a;
            if (!nb3.k(vs4Var3.getValue(), gx0Var2.f())) {
                ga7Var.h(j, z);
            }
            if (!nb3.k(ga7Var.d.getValue(), gx0Var2.f())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.g.i(Long.MIN_VALUE);
        gx0 gx0Var = this.a;
        if (gx0Var instanceof ta4) {
            ((ta4) gx0Var).l(this.d.getValue());
        }
        n(0L);
        ((vs4) gx0Var.a).setValue(Boolean.FALSE);
        mm6 mm6Var = this.j;
        int size = mm6Var.size();
        for (int i = 0; i < size; i++) {
            ((ga7) mm6Var.get(i)).i();
        }
    }

    public final void j(float f) {
        Object obj;
        mm6 mm6Var = this.i;
        int size = mm6Var.size();
        for (int i = 0; i < size; i++) {
            ca7 ca7Var = (ca7) mm6Var.get(i);
            ca7Var.getClass();
            int i2 = (f > (-4.0f) ? 1 : (f == (-4.0f) ? 0 : -1));
            if (i2 == 0 || f == -5.0f) {
                jz6 jz6Var = ca7Var.Y;
                if (jz6Var != null) {
                    ca7Var.a().f(jz6Var.L);
                    ca7Var.X = null;
                    ca7Var.Y = null;
                }
                if (i2 == 0) {
                    obj = ca7Var.a().R;
                } else {
                    obj = ca7Var.a().L;
                }
                ca7Var.a().f(obj);
                ca7Var.a().i(obj);
                ca7Var.f(obj);
                ca7Var.h0.i(ca7Var.a().b());
            } else {
                ca7Var.d0.i(f);
            }
        }
        mm6 mm6Var2 = this.j;
        int size2 = mm6Var2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ga7) mm6Var2.get(i3)).j(f);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.g.i(Long.MIN_VALUE);
        gx0 gx0Var = this.a;
        ((vs4) gx0Var.a).setValue(Boolean.FALSE);
        boolean g = g();
        vs4 vs4Var = this.d;
        if (!g || !nb3.k(gx0Var.f(), obj) || !nb3.k(vs4Var.getValue(), obj2)) {
            if (!nb3.k(gx0Var.f(), obj) && (gx0Var instanceof ta4)) {
                ((ta4) gx0Var).l(obj);
            }
            vs4Var.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new ba7(obj, obj2));
        }
        mm6 mm6Var = this.j;
        int size = mm6Var.size();
        for (int i = 0; i < size; i++) {
            ga7 ga7Var = (ga7) mm6Var.get(i);
            ga7Var.getClass();
            if (ga7Var.g()) {
                ga7Var.k(ga7Var.a.f(), ga7Var.d.getValue());
            }
        }
        mm6 mm6Var2 = this.i;
        int size2 = mm6Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ca7) mm6Var2.get(i2)).e(0L);
        }
    }

    public final void l(long j) {
        ts4 ts4Var = this.g;
        if (ts4Var.h() == Long.MIN_VALUE) {
            ts4Var.i(j);
        }
        n(j);
        this.h.setValue(Boolean.FALSE);
        mm6 mm6Var = this.i;
        int size = mm6Var.size();
        for (int i = 0; i < size; i++) {
            ((ca7) mm6Var.get(i)).e(j);
        }
        mm6 mm6Var2 = this.j;
        int size2 = mm6Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ga7 ga7Var = (ga7) mm6Var2.get(i2);
            if (!nb3.k(ga7Var.d.getValue(), ga7Var.a.f())) {
                ga7Var.l(j);
            }
        }
    }

    public final void m(g96 g96Var) {
        mm6 mm6Var = this.i;
        int size = mm6Var.size();
        for (int i = 0; i < size; i++) {
            ca7 ca7Var = (ca7) mm6Var.get(i);
            vs4 vs4Var = ca7Var.f0;
            if (!nb3.k(ca7Var.a().L, ca7Var.a().R)) {
                ca7Var.Y = ca7Var.a();
                ca7Var.X = g96Var;
            }
            ca7Var.R.setValue(new jz6(ca7Var.j0, ca7Var.A, vs4Var.getValue(), vs4Var.getValue(), ca7Var.g0.c()));
            ca7Var.h0.i(ca7Var.a().b());
            ca7Var.e0 = true;
        }
        mm6 mm6Var2 = this.j;
        int size2 = mm6Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ga7) mm6Var2.get(i2)).m(g96Var);
        }
    }

    public final void n(long j) {
        if (this.b == null) {
            this.f.i(j);
        }
    }

    public final void o() {
        jz6 jz6Var;
        mm6 mm6Var = this.i;
        int size = mm6Var.size();
        for (int i = 0; i < size; i++) {
            ca7 ca7Var = (ca7) mm6Var.get(i);
            g96 g96Var = ca7Var.X;
            if (g96Var != null && (jz6Var = ca7Var.Y) != null) {
                long F = u24.F(g96Var.g * g96Var.d);
                Object g = jz6Var.g(F);
                if (ca7Var.e0) {
                    ca7Var.a().i(g);
                }
                ca7Var.a().f(g);
                ca7Var.h0.i(ca7Var.a().b());
                if (ca7Var.d0.h() == -2.0f || ca7Var.e0) {
                    ca7Var.f(g);
                } else {
                    ca7Var.e(ca7Var.k0.e());
                }
                if (F >= g96Var.g) {
                    ca7Var.X = null;
                    ca7Var.Y = null;
                } else {
                    g96Var.c = false;
                }
            }
        }
        mm6 mm6Var2 = this.j;
        int size2 = mm6Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ga7) mm6Var2.get(i2)).o();
        }
    }

    public final void p(Object obj) {
        vs4 vs4Var = this.d;
        if (!nb3.k(vs4Var.getValue(), obj)) {
            this.e.setValue(new ba7(vs4Var.getValue(), obj));
            gx0 gx0Var = this.a;
            if (!nb3.k(gx0Var.f(), vs4Var.getValue())) {
                gx0Var.l(vs4Var.getValue());
            }
            vs4Var.setValue(obj);
            if (this.g.h() == Long.MIN_VALUE) {
                this.h.setValue(Boolean.TRUE);
            }
            mm6 mm6Var = this.i;
            int size = mm6Var.size();
            for (int i = 0; i < size; i++) {
                ((ca7) mm6Var.get(i)).d0.i(-2.0f);
            }
        }
    }

    public final String toString() {
        mm6 mm6Var;
        String str = "Transition animation values: ";
        for (int i = 0; i < this.i.size(); i++) {
            str = str + ((ca7) mm6Var.get(i)) + ", ";
        }
        return str;
    }
}
