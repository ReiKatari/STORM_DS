package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends nc.l implements mc.p {
    public final /* synthetic */ int B = 1;
    public final /* synthetic */ v2.c L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f2446b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d1.i0 i0Var, b3.p pVar, c1 c1Var, d1 d1Var, String str, v2.c cVar, int i2) {
        super(2);
        this.R = i0Var;
        this.X = pVar;
        this.Y = c1Var;
        this.Z = d1Var;
        this.f2446b0 = str;
        this.L = cVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        Object obj3;
        switch (this.B) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Number) obj2).intValue();
                mc.l lVar = (mc.l) this.Y;
                v vVar = (v) this.Z;
                d1.q1 q1Var = (d1.q1) this.R;
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    Object L = rVar.L();
                    Object obj4 = n2.l.f9953a;
                    if (L == obj4) {
                        L = (l0) lVar.k(vVar);
                        rVar.h0(L);
                    }
                    l0 l0Var = (l0) L;
                    d1.l1 f8 = q1Var.f();
                    n2.f1 f1Var = q1Var.f3652d;
                    Object c4 = f8.c();
                    Object obj5 = this.X;
                    boolean g10 = rVar.g(nc.k.a(c4, obj5));
                    Object L2 = rVar.L();
                    if (g10 || L2 == obj4) {
                        if (nc.k.a(q1Var.f().c(), obj5)) {
                            obj3 = d1.f2401b;
                        } else {
                            obj3 = ((l0) lVar.k(vVar)).f2459b;
                        }
                        L2 = obj3;
                        rVar.h0(L2);
                    }
                    d1 d1Var = (d1) L2;
                    Object L3 = rVar.L();
                    if (L3 == obj4) {
                        L3 = new q(nc.k.a(obj5, f1Var.getValue()));
                        rVar.h0(L3);
                    }
                    q qVar = (q) L3;
                    c1 c1Var = l0Var.f2458a;
                    boolean h2 = rVar.h(l0Var);
                    Object L4 = rVar.L();
                    if (h2 || L4 == obj4) {
                        L4 = new b2(1, l0Var);
                        rVar.h0(L4);
                    }
                    b3.p l10 = y3.c0.l(b3.m.f1770a, (mc.q) L4);
                    qVar.f2505a.setValue(Boolean.valueOf(nc.k.a(obj5, f1Var.getValue())));
                    b3.p f10 = l10.f(qVar);
                    d1.q1 q1Var2 = (d1.q1) this.R;
                    boolean h10 = rVar.h(obj5);
                    Object L5 = rVar.L();
                    if (h10 || L5 == obj4) {
                        L5 = new g(0, obj5);
                        rVar.h0(L5);
                    }
                    mc.l lVar2 = (mc.l) L5;
                    boolean f11 = rVar.f(d1Var);
                    Object L6 = rVar.L();
                    if (f11 || L6 == obj4) {
                        L6 = new h(d1Var);
                        rVar.h0(L6);
                    }
                    e0.a(q1Var2, lVar2, f10, c1Var, d1Var, (mc.p) L6, v2.h.c(-143346359, new i((z2.p) this.f2446b0, obj5, vVar, this.L, 0), rVar), rVar, 12582912);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                ((Number) obj2).intValue();
                e0.b((d1.i0) this.R, (b3.p) this.X, (c1) this.Y, (d1) this.Z, (String) this.f2446b0, this.L, (n2.m) obj, n2.s.F(199681));
                return yb.y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d1.q1 q1Var, Object obj, mc.l lVar, v vVar, z2.p pVar, v2.c cVar) {
        super(2);
        this.R = q1Var;
        this.X = obj;
        this.Y = lVar;
        this.Z = vVar;
        this.f2446b0 = pVar;
        this.L = cVar;
    }
}
