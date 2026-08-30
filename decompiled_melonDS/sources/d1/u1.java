package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a7.a f3682a = new a7.a(16);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f3683b = p7.a.s(yb.h.NONE, new a3.g(10));

    public static final void a(q1 q1Var, n1 n1Var, Object obj, Object obj2, x xVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        boolean h2;
        int i11;
        boolean h10;
        int i12;
        boolean h11;
        int i13;
        int i14;
        int i15;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(867041821);
        if ((i2 & 6) == 0) {
            if (rVar.f(q1Var)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i15 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.f(n1Var)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 |= i14;
        }
        if ((i2 & 384) == 0) {
            if ((i2 & 512) == 0) {
                h11 = rVar.f(obj);
            } else {
                h11 = rVar.h(obj);
            }
            if (h11) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i2 & 3072) == 0) {
            if ((i2 & 4096) == 0) {
                h10 = rVar.f(obj2);
            } else {
                h10 = rVar.h(obj2);
            }
            if (h10) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i10 |= i12;
        }
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0) {
                h2 = rVar.f(xVar);
            } else {
                h2 = rVar.h(xVar);
            }
            if (h2) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i10 |= i11;
        }
        if ((i10 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            if (q1Var.g()) {
                n1Var.g(obj, obj2, xVar);
            } else {
                n1Var.h(obj2, xVar);
            }
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new r1(q1Var, n1Var, obj, obj2, xVar, i2, 0);
        }
    }

    public static final q1 b(q1 q1Var, Object obj, Object obj2, String str, n2.m mVar, int i2) {
        boolean z10;
        int i10 = (i2 & 14) ^ 6;
        boolean z11 = true;
        if ((i10 > 4 && ((n2.r) mVar).f(q1Var)) || (i2 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        n2.r rVar = (n2.r) mVar;
        Object L = rVar.L();
        n2.e eVar = n2.l.f9953a;
        if (z10 || L == eVar) {
            L = new q1(new i0(obj), q1Var, q1Var.f3651c + " > " + str);
            rVar.h0(L);
        }
        q1 q1Var2 = (q1) L;
        if ((i10 <= 4 || !rVar.f(q1Var)) && (i2 & 6) != 4) {
            z11 = false;
        }
        boolean f8 = rVar.f(q1Var2) | z11;
        Object L2 = rVar.L();
        if (f8 || L2 == eVar) {
            L2 = new a7.l(11, q1Var, q1Var2);
            rVar.h0(L2);
        }
        n2.s.d(q1Var2, (mc.l) L2, rVar);
        if (q1Var.g()) {
            q1Var2.k(obj, obj2);
            return q1Var2;
        }
        q1Var2.p(obj2);
        q1Var2.f3659k.setValue(Boolean.FALSE);
        return q1Var2;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [nc.l, mc.l] */
    /* JADX WARN: Type inference failed for: r5v7, types: [nc.l, mc.l] */
    public static final k1 c(q1 q1Var, w1 w1Var, String str, n2.m mVar, int i2, int i10) {
        j1 j1Var;
        if ((i10 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean f8 = ((n2.r) mVar).f(q1Var);
        n2.r rVar = (n2.r) mVar;
        Object L = rVar.L();
        n2.e eVar = n2.l.f9953a;
        if (f8 || L == eVar) {
            L = new k1(q1Var, w1Var, str);
            rVar.h0(L);
        }
        k1 k1Var = (k1) L;
        boolean f10 = rVar.f(q1Var) | rVar.h(k1Var);
        Object L2 = rVar.L();
        if (f10 || L2 == eVar) {
            L2 = new a7.l(12, q1Var, k1Var);
            rVar.h0(L2);
        }
        n2.s.d(k1Var, (mc.l) L2, rVar);
        if (q1Var.g() && (j1Var = (j1) k1Var.f3598b.getValue()) != null) {
            q1 q1Var2 = k1Var.f3599c;
            j1Var.A.g(j1Var.L.k(q1Var2.f().a()), j1Var.L.k(q1Var2.f().c()), (x) j1Var.B.k(q1Var2.f()));
        }
        return k1Var;
    }

    public static final n1 d(q1 q1Var, Object obj, Object obj2, x xVar, w1 w1Var, n2.m mVar, int i2) {
        mc.l lVar;
        boolean f8 = ((n2.r) mVar).f(q1Var);
        n2.r rVar = (n2.r) mVar;
        Object L = rVar.L();
        n2.e eVar = n2.l.f9953a;
        if (f8 || L == eVar) {
            z2.f e6 = z2.q.e();
            if (e6 != null) {
                lVar = e6.e();
            } else {
                lVar = null;
            }
            z2.f h2 = z2.q.h(e6);
            try {
                p pVar = (p) w1Var.f3690a.k(obj2);
                pVar.d();
                n1 n1Var = new n1(q1Var, obj, pVar, w1Var);
                z2.q.k(e6, h2, lVar);
                rVar.h0(n1Var);
                L = n1Var;
            } catch (Throwable th2) {
                z2.q.k(e6, h2, lVar);
                throw th2;
            }
        }
        n1 n1Var2 = (n1) L;
        a(q1Var, n1Var2, obj, obj2, xVar, rVar, 0);
        boolean f10 = rVar.f(q1Var) | rVar.f(n1Var2);
        Object L2 = rVar.L();
        if (f10 || L2 == eVar) {
            L2 = new a7.l(10, q1Var, n1Var2);
            rVar.h0(L2);
        }
        n2.s.d(n1Var2, (mc.l) L2, rVar);
        return n1Var2;
    }

    public static final q1 e(a3.b bVar, String str, n2.m mVar, int i2, int i10) {
        boolean z10;
        mc.l lVar;
        if ((i10 & 2) != 0) {
            str = null;
        }
        int i11 = (i2 & 14) ^ 6;
        boolean z11 = true;
        if ((i11 > 4 && ((n2.r) mVar).f(bVar)) || (i2 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        n2.r rVar = (n2.r) mVar;
        Object L = rVar.L();
        Object obj = n2.l.f9953a;
        if (z10 || L == obj) {
            z2.f e6 = z2.q.e();
            if (e6 != null) {
                lVar = e6.e();
            } else {
                lVar = null;
            }
            z2.f h2 = z2.q.h(e6);
            try {
                Object q1Var = new q1(bVar, null, str);
                z2.q.k(e6, h2, lVar);
                rVar.h0(q1Var);
                L = q1Var;
            } catch (Throwable th2) {
                z2.q.k(e6, h2, lVar);
                throw th2;
            }
        }
        q1 q1Var2 = (q1) L;
        if (bVar instanceof x0) {
            rVar.X(-1357607479);
            x0 x0Var = (x0) bVar;
            Object value = x0Var.f3695c.getValue();
            Object value2 = x0Var.f3694b.getValue();
            if ((i11 <= 4 || !rVar.f(bVar)) && (i2 & 6) != 4) {
                z11 = false;
            }
            Object L2 = rVar.L();
            if (z11 || L2 == obj) {
                L2 = new a2.o(11, (cc.c) null, bVar);
                rVar.h0(L2);
            }
            n2.s.f(value, value2, (mc.p) L2, rVar);
            rVar.p(false);
        } else {
            rVar.X(-1357145920);
            q1Var2.a(bVar.e(), rVar, 0);
            rVar.p(false);
        }
        boolean f8 = rVar.f(q1Var2);
        Object L3 = rVar.L();
        if (f8 || L3 == obj) {
            L3 = new s1(q1Var2, 0);
            rVar.h0(L3);
        }
        n2.s.d(q1Var2, (mc.l) L3, rVar);
        return q1Var2;
    }

    public static final q1 f(Object obj, String str, n2.m mVar, int i2, int i10) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        n2.r rVar = (n2.r) mVar;
        Object L = rVar.L();
        n2.e eVar = n2.l.f9953a;
        if (L == eVar) {
            L = new q1(new i0(obj), null, str);
            rVar.h0(L);
        }
        q1 q1Var = (q1) L;
        q1Var.a(obj, rVar, (i2 & 8) | 48 | (i2 & 14));
        Object L2 = rVar.L();
        if (L2 == eVar) {
            L2 = new s1(q1Var, 1);
            rVar.h0(L2);
        }
        n2.s.d(q1Var, (mc.l) L2, rVar);
        return q1Var;
    }
}
