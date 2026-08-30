package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kx6  reason: default package */
/* loaded from: classes.dex */
public final class kx6 {
    public final ku0 a;
    public final kx6 b;
    public final String c;
    public final tj4 d;
    public final tj4 e;
    public final rj4 f = new rj4(0);
    public final rj4 g = new rj4(Long.MIN_VALUE);
    public final tj4 h;
    public final xa6 i;
    public final xa6 j;
    public final tj4 k;
    public final ee1 l;

    public kx6(ku0 ku0Var, kx6 kx6Var, String str) {
        this.a = ku0Var;
        this.b = kx6Var;
        this.c = str;
        this.d = me2.G(ku0Var.f());
        this.e = me2.G(new fx6(ku0Var.f(), ku0Var.f()));
        Boolean bool = Boolean.FALSE;
        this.h = me2.G(bool);
        this.i = new xa6();
        this.j = new xa6();
        this.k = me2.G(bool);
        this.l = me2.q(new ww6(this, 1));
        ku0Var.m(this);
    }

    public final void a(Object obj, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean h;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1493585151);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = sk2Var.f(obj);
            } else {
                h = sk2Var.h(obj);
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
            if (sk2Var.f(this)) {
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
        if (sk2Var.O(i2 & 1, z)) {
            if (!g()) {
                sk2Var.X(466062241);
                p(obj);
                int i5 = i2 & 112;
                if (i5 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object L = sk2Var.L();
                sn1 sn1Var = su0.a;
                if (z2 || L == sn1Var) {
                    L = me2.q(new ww6(this, 0));
                    sk2Var.h0(L);
                }
                if (((Boolean) ((ae6) L).getValue()).booleanValue()) {
                    sk2Var.X(466470356);
                    Object L2 = sk2Var.L();
                    if (L2 == sn1Var) {
                        L2 = l.A(sk2Var);
                        sk2Var.h0(L2);
                    }
                    o31 o31Var = (o31) L2;
                    boolean h2 = sk2Var.h(o31Var);
                    if (i5 != 32) {
                        z3 = false;
                    }
                    boolean z4 = h2 | z3;
                    Object L3 = sk2Var.L();
                    if (z4 || L3 == sn1Var) {
                        L3 = new zr4(22, o31Var, this);
                        sk2Var.h0(L3);
                    }
                    l.e(o31Var, this, (mi2) L3, sk2Var);
                    sk2Var.p(false);
                } else {
                    sk2Var.X(467712929);
                    sk2Var.p(false);
                }
                sk2Var.p(false);
            } else {
                sk2Var.X(467722849);
                sk2Var.p(false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new vo(i, 13, this, obj);
        }
    }

    public final long b() {
        xa6 xa6Var = this.i;
        int size = xa6Var.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((gx6) xa6Var.get(i)).g0.h());
        }
        xa6 xa6Var2 = this.j;
        int size2 = xa6Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((kx6) xa6Var2.get(i2)).b());
        }
        return j;
    }

    public final void c() {
        xa6 xa6Var = this.i;
        int size = xa6Var.size();
        for (int i = 0; i < size; i++) {
            gx6 gx6Var = (gx6) xa6Var.get(i);
            gx6Var.Y = null;
            gx6Var.X = null;
            gx6Var.d0 = false;
        }
        xa6 xa6Var2 = this.j;
        int size2 = xa6Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((kx6) xa6Var2.get(i2)).c();
        }
    }

    public final boolean d() {
        xa6 xa6Var = this.i;
        int size = xa6Var.size();
        for (int i = 0; i < size; i++) {
            if (((gx6) xa6Var.get(i)).X != null) {
                return true;
            }
        }
        xa6 xa6Var2 = this.j;
        int size2 = xa6Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((kx6) xa6Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        kx6 kx6Var = this.b;
        if (kx6Var != null) {
            return kx6Var.e();
        }
        return this.f.h();
    }

    public final ex6 f() {
        return (ex6) this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        long j2;
        rj4 rj4Var = this.g;
        int i = (rj4Var.h() > Long.MIN_VALUE ? 1 : (rj4Var.h() == Long.MIN_VALUE ? 0 : -1));
        ku0 ku0Var = this.a;
        if (i == 0) {
            rj4Var.i(j);
            ((tj4) ku0Var.a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((tj4) ku0Var.a).getValue()).booleanValue()) {
            ((tj4) ku0Var.a).setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        xa6 xa6Var = this.i;
        int size = xa6Var.size();
        boolean z2 = true;
        for (int i2 = 0; i2 < size; i2++) {
            gx6 gx6Var = (gx6) xa6Var.get(i2);
            tj4 tj4Var = gx6Var.Z;
            tj4 tj4Var2 = gx6Var.Z;
            if (!((Boolean) tj4Var.getValue()).booleanValue()) {
                if (z) {
                    j2 = gx6Var.b().d();
                } else {
                    j2 = j;
                }
                gx6Var.f(gx6Var.b().c(j2));
                gx6Var.f0 = gx6Var.b().g(j2);
                if (gx6Var.b().i(j2)) {
                    tj4Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) tj4Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        xa6 xa6Var2 = this.j;
        int size2 = xa6Var2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            kx6 kx6Var = (kx6) xa6Var2.get(i3);
            tj4 tj4Var3 = kx6Var.d;
            ku0 ku0Var2 = kx6Var.a;
            if (!b53.x(tj4Var3.getValue(), ku0Var2.f())) {
                kx6Var.h(j, z);
            }
            if (!b53.x(kx6Var.d.getValue(), ku0Var2.f())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.g.i(Long.MIN_VALUE);
        ku0 ku0Var = this.a;
        if (ku0Var instanceof n24) {
            ((n24) ku0Var).l(this.d.getValue());
        }
        n(0L);
        ((tj4) ku0Var.a).setValue(Boolean.FALSE);
        xa6 xa6Var = this.j;
        int size = xa6Var.size();
        for (int i = 0; i < size; i++) {
            ((kx6) xa6Var.get(i)).i();
        }
    }

    public final void j(float f) {
        Object obj;
        xa6 xa6Var = this.i;
        int size = xa6Var.size();
        for (int i = 0; i < size; i++) {
            gx6 gx6Var = (gx6) xa6Var.get(i);
            gx6Var.getClass();
            int i2 = (f > (-4.0f) ? 1 : (f == (-4.0f) ? 0 : -1));
            if (i2 == 0 || f == -5.0f) {
                zm6 zm6Var = gx6Var.Y;
                if (zm6Var != null) {
                    gx6Var.b().b(zm6Var.L);
                    gx6Var.X = null;
                    gx6Var.Y = null;
                }
                if (i2 == 0) {
                    obj = gx6Var.b().R;
                } else {
                    obj = gx6Var.b().L;
                }
                gx6Var.b().b(obj);
                gx6Var.b().h(obj);
                gx6Var.f(obj);
                gx6Var.g0.i(gx6Var.b().d());
            } else {
                gx6Var.c0.i(f);
            }
        }
        xa6 xa6Var2 = this.j;
        int size2 = xa6Var2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((kx6) xa6Var2.get(i3)).j(f);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.g.i(Long.MIN_VALUE);
        ku0 ku0Var = this.a;
        ((tj4) ku0Var.a).setValue(Boolean.FALSE);
        boolean g = g();
        tj4 tj4Var = this.d;
        if (!g || !b53.x(ku0Var.f(), obj) || !b53.x(tj4Var.getValue(), obj2)) {
            if (!b53.x(ku0Var.f(), obj) && (ku0Var instanceof n24)) {
                ((n24) ku0Var).l(obj);
            }
            tj4Var.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new fx6(obj, obj2));
        }
        xa6 xa6Var = this.j;
        int size = xa6Var.size();
        for (int i = 0; i < size; i++) {
            kx6 kx6Var = (kx6) xa6Var.get(i);
            kx6Var.getClass();
            if (kx6Var.g()) {
                kx6Var.k(kx6Var.a.f(), kx6Var.d.getValue());
            }
        }
        xa6 xa6Var2 = this.i;
        int size2 = xa6Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((gx6) xa6Var2.get(i2)).d(0L);
        }
    }

    public final void l(long j) {
        rj4 rj4Var = this.g;
        if (rj4Var.h() == Long.MIN_VALUE) {
            rj4Var.i(j);
        }
        n(j);
        this.h.setValue(Boolean.FALSE);
        xa6 xa6Var = this.i;
        int size = xa6Var.size();
        for (int i = 0; i < size; i++) {
            ((gx6) xa6Var.get(i)).d(j);
        }
        xa6 xa6Var2 = this.j;
        int size2 = xa6Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            kx6 kx6Var = (kx6) xa6Var2.get(i2);
            if (!b53.x(kx6Var.d.getValue(), kx6Var.a.f())) {
                kx6Var.l(j);
            }
        }
    }

    public final void m(ux5 ux5Var) {
        xa6 xa6Var = this.i;
        int size = xa6Var.size();
        for (int i = 0; i < size; i++) {
            gx6 gx6Var = (gx6) xa6Var.get(i);
            tj4 tj4Var = gx6Var.e0;
            if (!b53.x(gx6Var.b().L, gx6Var.b().R)) {
                gx6Var.Y = gx6Var.b();
                gx6Var.X = ux5Var;
            }
            gx6Var.R.setValue(new zm6(gx6Var.i0, gx6Var.A, tj4Var.getValue(), tj4Var.getValue(), gx6Var.f0.c()));
            gx6Var.g0.i(gx6Var.b().d());
            gx6Var.d0 = true;
        }
        xa6 xa6Var2 = this.j;
        int size2 = xa6Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((kx6) xa6Var2.get(i2)).m(ux5Var);
        }
    }

    public final void n(long j) {
        if (this.b == null) {
            this.f.i(j);
        }
    }

    public final void o() {
        zm6 zm6Var;
        xa6 xa6Var = this.i;
        int size = xa6Var.size();
        for (int i = 0; i < size; i++) {
            gx6 gx6Var = (gx6) xa6Var.get(i);
            ux5 ux5Var = gx6Var.X;
            if (ux5Var != null && (zm6Var = gx6Var.Y) != null) {
                long Y = jv3.Y(ux5Var.g * ux5Var.d);
                Object c = zm6Var.c(Y);
                if (gx6Var.d0) {
                    gx6Var.b().h(c);
                }
                gx6Var.b().b(c);
                gx6Var.g0.i(gx6Var.b().d());
                if (gx6Var.c0.h() == -2.0f || gx6Var.d0) {
                    gx6Var.f(c);
                } else {
                    gx6Var.d(gx6Var.j0.e());
                }
                if (Y >= ux5Var.g) {
                    gx6Var.X = null;
                    gx6Var.Y = null;
                } else {
                    ux5Var.c = false;
                }
            }
        }
        xa6 xa6Var2 = this.j;
        int size2 = xa6Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((kx6) xa6Var2.get(i2)).o();
        }
    }

    public final void p(Object obj) {
        tj4 tj4Var = this.d;
        if (!b53.x(tj4Var.getValue(), obj)) {
            this.e.setValue(new fx6(tj4Var.getValue(), obj));
            ku0 ku0Var = this.a;
            if (!b53.x(ku0Var.f(), tj4Var.getValue())) {
                ku0Var.l(tj4Var.getValue());
            }
            tj4Var.setValue(obj);
            if (this.g.h() == Long.MIN_VALUE) {
                this.h.setValue(Boolean.TRUE);
            }
            xa6 xa6Var = this.i;
            int size = xa6Var.size();
            for (int i = 0; i < size; i++) {
                ((gx6) xa6Var.get(i)).c0.i(-2.0f);
            }
        }
    }

    public final String toString() {
        xa6 xa6Var;
        String str = "Transition animation values: ";
        for (int i = 0; i < this.i.size(); i++) {
            str = str + ((gx6) xa6Var.get(i)) + ", ";
        }
        return str;
    }
}
