package d1;

import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public final a3.b f3649a;

    /* renamed from: b  reason: collision with root package name */
    public final q1 f3650b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3651c;

    /* renamed from: d  reason: collision with root package name */
    public final n2.f1 f3652d;

    /* renamed from: e  reason: collision with root package name */
    public final n2.f1 f3653e;

    /* renamed from: f  reason: collision with root package name */
    public final n2.d1 f3654f = new n2.d1(0);

    /* renamed from: g  reason: collision with root package name */
    public final n2.d1 f3655g = new n2.d1(Long.MIN_VALUE);

    /* renamed from: h  reason: collision with root package name */
    public final n2.f1 f3656h;

    /* renamed from: i  reason: collision with root package name */
    public final z2.p f3657i;

    /* renamed from: j  reason: collision with root package name */
    public final z2.p f3658j;

    /* renamed from: k  reason: collision with root package name */
    public final n2.f1 f3659k;

    /* renamed from: l  reason: collision with root package name */
    public final n2.e0 f3660l;

    public q1(a3.b bVar, q1 q1Var, String str) {
        this.f3649a = bVar;
        this.f3650b = q1Var;
        this.f3651c = str;
        this.f3652d = n2.s.w(bVar.c());
        this.f3653e = n2.s.w(new m1(bVar.c(), bVar.c()));
        Boolean bool = Boolean.FALSE;
        this.f3656h = n2.s.w(bool);
        this.f3657i = new z2.p();
        this.f3658j = new z2.p();
        this.f3659k = n2.s.w(bool);
        this.f3660l = n2.s.q(new i1(this, 1));
        bVar.h(this);
    }

    public final void a(Object obj, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        boolean h2;
        int i12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1493585151);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = rVar.f(obj);
            } else {
                h2 = rVar.h(obj);
            }
            if (h2) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.f(this)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        boolean z12 = true;
        if ((i10 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            if (!g()) {
                rVar.X(466062241);
                p(obj);
                int i13 = i10 & 112;
                if (i13 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object L = rVar.L();
                n2.e eVar = n2.l.f9953a;
                if (z11 || L == eVar) {
                    L = n2.s.q(new i1(this, 0));
                    rVar.h0(L);
                }
                if (((Boolean) ((s2) L).getValue()).booleanValue()) {
                    rVar.X(466470356);
                    Object L2 = rVar.L();
                    if (L2 == eVar) {
                        L2 = n2.s.o(rVar);
                        rVar.h0(L2);
                    }
                    zc.u uVar = (zc.u) L2;
                    boolean h10 = rVar.h(uVar);
                    if (i13 != 32) {
                        z12 = false;
                    }
                    boolean z13 = h10 | z12;
                    Object L3 = rVar.L();
                    if (z13 || L3 == eVar) {
                        L3 = new a7.l(9, uVar, this);
                        rVar.h0(L3);
                    }
                    n2.s.c(uVar, this, (mc.l) L3, rVar);
                } else {
                    rVar.X(416369985);
                }
                rVar.p(false);
            } else {
                rVar.X(416369985);
            }
            rVar.p(false);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.r(this, obj, i2, 1);
        }
    }

    public final long b() {
        z2.p pVar = this.f3657i;
        int size = pVar.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = Math.max(j2, ((n1) pVar.get(i2)).f3616f0.g());
        }
        z2.p pVar2 = this.f3658j;
        int size2 = pVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            j2 = Math.max(j2, ((q1) pVar2.get(i10)).b());
        }
        return j2;
    }

    public final void c() {
        z2.p pVar = this.f3657i;
        int size = pVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            n1 n1Var = (n1) pVar.get(i2);
            n1Var.Y = null;
            n1Var.X = null;
            n1Var.f3613c0 = false;
        }
        z2.p pVar2 = this.f3658j;
        int size2 = pVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((q1) pVar2.get(i10)).c();
        }
    }

    public final boolean d() {
        z2.p pVar = this.f3657i;
        int size = pVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((n1) pVar.get(i2)).X != null) {
                return true;
            }
        }
        z2.p pVar2 = this.f3658j;
        int size2 = pVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            if (((q1) pVar2.get(i10)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        q1 q1Var = this.f3650b;
        if (q1Var != null) {
            return q1Var.e();
        }
        return this.f3654f.g();
    }

    public final l1 f() {
        return (l1) this.f3653e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f3659k.getValue()).booleanValue();
    }

    public final void h(long j2, boolean z10) {
        long j10;
        n2.d1 d1Var = this.f3655g;
        int i2 = (d1Var.g() > Long.MIN_VALUE ? 1 : (d1Var.g() == Long.MIN_VALUE ? 0 : -1));
        a3.b bVar = this.f3649a;
        if (i2 == 0) {
            d1Var.h(j2);
            ((n2.f1) bVar.f147a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((n2.f1) bVar.f147a).getValue()).booleanValue()) {
            ((n2.f1) bVar.f147a).setValue(Boolean.TRUE);
        }
        this.f3656h.setValue(Boolean.FALSE);
        z2.p pVar = this.f3657i;
        int size = pVar.size();
        boolean z11 = true;
        for (int i10 = 0; i10 < size; i10++) {
            n1 n1Var = (n1) pVar.get(i10);
            n2.f1 f1Var = n1Var.Z;
            n2.f1 f1Var2 = n1Var.Z;
            if (!((Boolean) f1Var.getValue()).booleanValue()) {
                if (z10) {
                    j10 = n1Var.a().c();
                } else {
                    j10 = j2;
                }
                n1Var.e(n1Var.a().b(j10));
                n1Var.f3615e0 = n1Var.a().f(j10);
                if (n1Var.a().g(j10)) {
                    f1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) f1Var2.getValue()).booleanValue()) {
                z11 = false;
            }
        }
        z2.p pVar2 = this.f3658j;
        int size2 = pVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            q1 q1Var = (q1) pVar2.get(i11);
            n2.f1 f1Var3 = q1Var.f3652d;
            a3.b bVar2 = q1Var.f3649a;
            if (!nc.k.a(f1Var3.getValue(), bVar2.c())) {
                q1Var.h(j2, z10);
            }
            if (!nc.k.a(q1Var.f3652d.getValue(), bVar2.c())) {
                z11 = false;
            }
        }
        if (z11) {
            i();
        }
    }

    public final void i() {
        this.f3655g.h(Long.MIN_VALUE);
        a3.b bVar = this.f3649a;
        if (bVar instanceof i0) {
            ((i0) bVar).g(this.f3652d.getValue());
        }
        n(0L);
        ((n2.f1) bVar.f147a).setValue(Boolean.FALSE);
        z2.p pVar = this.f3658j;
        int size = pVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((q1) pVar.get(i2)).i();
        }
    }

    public final void j(float f8) {
        Object obj;
        z2.p pVar = this.f3657i;
        int size = pVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            n1 n1Var = (n1) pVar.get(i2);
            n1Var.getClass();
            int i10 = (f8 > (-4.0f) ? 1 : (f8 == (-4.0f) ? 0 : -1));
            if (i10 == 0 || f8 == -5.0f) {
                h1 h1Var = n1Var.Y;
                if (h1Var != null) {
                    n1Var.a().h(h1Var.f3577c);
                    n1Var.X = null;
                    n1Var.Y = null;
                }
                if (i10 == 0) {
                    obj = n1Var.a().f3578d;
                } else {
                    obj = n1Var.a().f3577c;
                }
                n1Var.a().h(obj);
                n1Var.a().i(obj);
                n1Var.e(obj);
                n1Var.f3616f0.h(n1Var.a().c());
            } else {
                n1Var.f3612b0.h(f8);
            }
        }
        z2.p pVar2 = this.f3658j;
        int size2 = pVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((q1) pVar2.get(i11)).j(f8);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.f3655g.h(Long.MIN_VALUE);
        a3.b bVar = this.f3649a;
        ((n2.f1) bVar.f147a).setValue(Boolean.FALSE);
        boolean g10 = g();
        n2.f1 f1Var = this.f3652d;
        if (!g10 || !nc.k.a(bVar.c(), obj) || !nc.k.a(f1Var.getValue(), obj2)) {
            if (!nc.k.a(bVar.c(), obj) && (bVar instanceof i0)) {
                ((i0) bVar).g(obj);
            }
            f1Var.setValue(obj2);
            this.f3659k.setValue(Boolean.TRUE);
            this.f3653e.setValue(new m1(obj, obj2));
        }
        z2.p pVar = this.f3658j;
        int size = pVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            q1 q1Var = (q1) pVar.get(i2);
            q1Var.getClass();
            if (q1Var.g()) {
                q1Var.k(q1Var.f3649a.c(), q1Var.f3652d.getValue());
            }
        }
        z2.p pVar2 = this.f3657i;
        int size2 = pVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((n1) pVar2.get(i10)).c(0L);
        }
    }

    public final void l(long j2) {
        n2.d1 d1Var = this.f3655g;
        if (d1Var.g() == Long.MIN_VALUE) {
            d1Var.h(j2);
        }
        n(j2);
        this.f3656h.setValue(Boolean.FALSE);
        z2.p pVar = this.f3657i;
        int size = pVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((n1) pVar.get(i2)).c(j2);
        }
        z2.p pVar2 = this.f3658j;
        int size2 = pVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            q1 q1Var = (q1) pVar2.get(i10);
            if (!nc.k.a(q1Var.f3652d.getValue(), q1Var.f3649a.c())) {
                q1Var.l(j2);
            }
        }
    }

    public final void m(q0 q0Var) {
        z2.p pVar = this.f3657i;
        int size = pVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            n1 n1Var = (n1) pVar.get(i2);
            n2.f1 f1Var = n1Var.f3614d0;
            if (!nc.k.a(n1Var.a().f3577c, n1Var.a().f3578d)) {
                n1Var.Y = n1Var.a();
                n1Var.X = q0Var;
            }
            n1Var.R.setValue(new h1(n1Var.f3618h0, n1Var.A, f1Var.getValue(), f1Var.getValue(), n1Var.f3615e0.c()));
            n1Var.f3616f0.h(n1Var.a().c());
            n1Var.f3613c0 = true;
        }
        z2.p pVar2 = this.f3658j;
        int size2 = pVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((q1) pVar2.get(i10)).m(q0Var);
        }
    }

    public final void n(long j2) {
        if (this.f3650b == null) {
            this.f3654f.h(j2);
        }
    }

    public final void o() {
        h1 h1Var;
        z2.p pVar = this.f3657i;
        int size = pVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            n1 n1Var = (n1) pVar.get(i2);
            q0 q0Var = n1Var.X;
            if (q0Var != null && (h1Var = n1Var.Y) != null) {
                long N = pc.a.N(q0Var.f3647g * q0Var.f3644d);
                Object b10 = h1Var.b(N);
                if (n1Var.f3613c0) {
                    n1Var.a().i(b10);
                }
                n1Var.a().h(b10);
                n1Var.f3616f0.h(n1Var.a().c());
                if (n1Var.f3612b0.g() == -2.0f || n1Var.f3613c0) {
                    n1Var.e(b10);
                } else {
                    n1Var.c(n1Var.f3619i0.e());
                }
                if (N >= q0Var.f3647g) {
                    n1Var.X = null;
                    n1Var.Y = null;
                } else {
                    q0Var.f3643c = false;
                }
            }
        }
        z2.p pVar2 = this.f3658j;
        int size2 = pVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((q1) pVar2.get(i10)).o();
        }
    }

    public final void p(Object obj) {
        n2.f1 f1Var = this.f3652d;
        if (!nc.k.a(f1Var.getValue(), obj)) {
            this.f3653e.setValue(new m1(f1Var.getValue(), obj));
            a3.b bVar = this.f3649a;
            if (!nc.k.a(bVar.c(), f1Var.getValue())) {
                bVar.g(f1Var.getValue());
            }
            f1Var.setValue(obj);
            if (this.f3655g.g() == Long.MIN_VALUE) {
                this.f3656h.setValue(Boolean.TRUE);
            }
            z2.p pVar = this.f3657i;
            int size = pVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((n1) pVar.get(i2)).f3612b0.h(-2.0f);
            }
        }
    }

    public final String toString() {
        z2.p pVar;
        String str = "Transition animation values: ";
        for (int i2 = 0; i2 < this.f3657i.size(); i2++) {
            str = str + ((n1) pVar.get(i2)) + ", ";
        }
        return str;
    }
}
