package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends nc.l implements mc.q {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        super(3);
        this.B = i2;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
        this.Y = obj4;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        boolean h2;
        int i2;
        d1.q1 e6;
        switch (this.B) {
            case 0:
                f0 f0Var = (f0) obj;
                n2.m mVar = (n2.m) obj2;
                int intValue = ((Number) obj3).intValue();
                z2.p pVar = (z2.p) this.L;
                v vVar = (v) this.X;
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        h2 = ((n2.r) mVar).f(f0Var);
                    } else {
                        h2 = ((n2.r) mVar).h(f0Var);
                    }
                    if (h2) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    boolean f8 = rVar.f(pVar);
                    Object obj4 = this.R;
                    boolean h10 = f8 | rVar.h(obj4) | rVar.h(vVar);
                    Object L = rVar.L();
                    n2.e eVar = n2.l.f9953a;
                    if (h10 || L == eVar) {
                        L = new a4.q0(pVar, obj4, vVar, 1);
                        rVar.h0(L);
                    }
                    n2.s.d(f0Var, (mc.l) L, rVar);
                    a1.m0 m0Var = vVar.f2535d;
                    f0Var.getClass();
                    m0Var.m(obj4, ((g0) f0Var).f2424b);
                    Object L2 = rVar.L();
                    if (L2 == eVar) {
                        L2 = new p(f0Var);
                        rVar.h0(L2);
                    }
                    ((v2.c) this.Y).r((p) L2, obj4, rVar, 0);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                b3.p pVar2 = (b3.p) obj;
                ((Number) obj3).intValue();
                e eVar2 = e.f2413j0;
                d1.q1 q1Var = (d1.q1) this.R;
                n2.r rVar2 = (n2.r) ((n2.m) obj2);
                rVar2.X(-1539505585);
                w1 w1Var = (w1) this.L;
                String str = w1Var.f2543a;
                rVar2.V(-1996110529, str);
                y1 y1Var = (y1) this.X;
                Object L3 = rVar2.L();
                n2.e eVar3 = n2.l.f9953a;
                if (L3 == eVar3) {
                    z2.s sVar = y1Var.f2549b0;
                    p1 p1Var = (p1) sVar.get(str);
                    if (p1Var == null) {
                        p1Var = new p1(str, y1Var);
                        sVar.put(str, p1Var);
                    }
                    L3 = p1Var;
                    rVar2.h0(L3);
                }
                p1 p1Var2 = (p1) L3;
                rVar2.V(-1996106748, q1Var);
                if (q1Var != null) {
                    a3.b bVar = q1Var.f3649a;
                    rVar2.X(-1749734647);
                    String obj5 = str.toString();
                    boolean f10 = rVar2.f(q1Var);
                    Object L4 = rVar2.L();
                    if (f10 || L4 == eVar3) {
                        L4 = bVar.c();
                        rVar2.h0(L4);
                    }
                    if (q1Var.g()) {
                        L4 = bVar.c();
                    }
                    rVar2.X(1498260051);
                    rVar2.p(false);
                    Object value = q1Var.f3652d.getValue();
                    rVar2.X(1498260051);
                    rVar2.p(false);
                    e6 = d1.u1.b(q1Var, (Boolean) eVar2.k(L4), (Boolean) eVar2.k(value), obj5, rVar2, 0);
                    rVar2.p(false);
                } else {
                    rVar2.X(-1749482679);
                    boolean z11 = true;
                    nc.w.b(1, eVar2);
                    Boolean bool = (Boolean) eVar2.k(yb.y.f14813a);
                    boolean booleanValue = bool.booleanValue();
                    Object L5 = rVar2.L();
                    if (L5 == eVar3) {
                        if (p1Var2.f2501h.isEmpty()) {
                            z11 = booleanValue;
                        } else if (booleanValue) {
                            z11 = false;
                        }
                        L5 = new d1.i0(Boolean.valueOf(z11));
                        rVar2.h0(L5);
                    }
                    d1.i0 i0Var = (d1.i0) L5;
                    i0Var.f3596c.setValue(bool);
                    e6 = d1.u1.e(i0Var, null, rVar2, 0, 2);
                    rVar2.p(false);
                }
                d1.q1 q1Var2 = e6;
                rVar2.V(-1996043323, Boolean.valueOf(y1Var.b()));
                d1.k1 c4 = d1.u1.c(q1Var2, d1.d.f3552r, null, rVar2, 0, 2);
                rVar2.p(false);
                boolean f11 = rVar2.f(q1Var2);
                Object L6 = rVar2.L();
                if (f11 || L6 == eVar3) {
                    L6 = new i0(y1Var, q1Var2, c4, p1Var2.f2499f);
                    rVar2.h0(L6);
                }
                i0 i0Var2 = (i0) L6;
                if (!nc.k.a((d1.k1) i0Var2.f2440d.getValue(), c4)) {
                    i0Var2.f2440d.setValue(c4);
                    i0Var2.f2443g.setValue(null);
                    i0Var2.f2442f = j0.f2447a;
                }
                i0Var2.f2441e.setValue(e0.f2414a);
                rVar2.p(false);
                z1 z1Var = (z1) this.Y;
                Object L7 = rVar2.L();
                if (L7 == eVar3) {
                    L7 = new q1(p1Var2, i0Var2, z1Var, w1Var);
                    rVar2.h0(L7);
                }
                q1 q1Var3 = (q1) L7;
                w1Var.f2545c.setValue(q1Var3);
                q1Var3.R.setValue(p1Var2);
                n2.f1 f1Var = q1Var3.Z;
                Boolean bool2 = Boolean.TRUE;
                f1Var.setValue(bool2);
                q1Var3.X.setValue(i0Var2);
                q1Var3.Y.setValue(t1.f2526b);
                q1Var3.f2507b0.setValue(z1Var);
                q1Var3.B.h(0.0f);
                q1Var3.L.setValue(bool2);
                q1Var3.f2508c0.setValue(w1Var);
                rVar2.p(false);
                b3.p f12 = pVar2.f(new m1(q1Var3));
                rVar2.p(false);
                return f12;
        }
    }
}
