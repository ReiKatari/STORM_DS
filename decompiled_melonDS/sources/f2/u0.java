package f2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u0 extends ec.j implements mc.l {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i2, cc.c cVar, Object obj) {
        super(1, cVar);
        this.X = i2;
        this.Z = obj;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        cc.c cVar = (cc.c) obj;
        switch (this.X) {
            case 0:
                return new u0(0, cVar, (b1) this.Z).v(yb.y.f14813a);
            default:
                return new u0(1, cVar, (he.t) this.Z).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        yb.y yVar;
        switch (this.X) {
            case 0:
                b1 b1Var = (b1) this.Z;
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                yb.y yVar2 = yb.y.f14813a;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            p7.j.I(obj);
                            b1Var.B = true;
                            return yVar2;
                        }
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7.j.I(obj);
                } else {
                    p7.j.I(obj);
                    this.Y = 1;
                    if (b1Var.s(this) == aVar) {
                        return aVar;
                    }
                }
                yb.j a10 = b1.a(b1Var);
                if (a10 != null) {
                    String str = (String) a10.A;
                    long j2 = ((l4.q0) a10.B).f8885a;
                    p pVar = b1Var.f4715j;
                    if (pVar != null) {
                        this.Y = 2;
                        if (str.length() == 0 || l4.q0.c(j2)) {
                            yVar = yVar2;
                        } else {
                            yVar = zc.x.F(pVar.f4768a, new a9.d(pVar, new a2.j(j2, (cc.c) null, pVar, str), (cc.c) null), this);
                        }
                        if (yVar != aVar) {
                            yVar = yVar2;
                        }
                        if (yVar == aVar) {
                            return aVar;
                        }
                    }
                }
                b1Var.B = true;
                return yVar2;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    this.Y = 1;
                    if (he.n.d((he.t) this.Z, this) == aVar2) {
                        return aVar2;
                    }
                }
                return yb.y.f14813a;
        }
    }
}
