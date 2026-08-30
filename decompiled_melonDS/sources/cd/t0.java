package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 extends ec.j implements mc.q {
    public final /* synthetic */ int X = 0;
    public int Y;
    public /* synthetic */ i Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object[] f2863b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ ec.j f2864c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(cc.c cVar, mc.t tVar) {
        super(3, cVar);
        this.f2864c0 = (ec.j) tVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ec.j, mc.t] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ec.j, mc.q] */
    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        i iVar = (i) obj;
        Object[] objArr = (Object[]) obj2;
        cc.c cVar = (cc.c) obj3;
        switch (this.X) {
            case 0:
                t0 t0Var = new t0(cVar, (mc.t) this.f2864c0);
                t0Var.Z = iVar;
                t0Var.f2863b0 = objArr;
                return t0Var.v(yb.y.f14813a);
            default:
                t0 t0Var2 = new t0((mc.q) this.f2864c0, cVar);
                t0Var2.Z = iVar;
                t0Var2.f2863b0 = objArr;
                return t0Var2.v(yb.y.f14813a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [ec.j, mc.q] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ec.j, mc.t] */
    @Override // ec.a
    public final Object v(Object obj) {
        i iVar;
        t0 t0Var;
        i iVar2;
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            p7.j.I(obj);
                            return yb.y.f14813a;
                        }
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iVar = this.Z;
                    p7.j.I(obj);
                    t0Var = this;
                } else {
                    p7.j.I(obj);
                    iVar = this.Z;
                    Object[] objArr = this.f2863b0;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.Z = iVar;
                    this.Y = 1;
                    t0Var = this;
                    obj = this.f2864c0.d(obj2, obj3, obj4, obj5, obj6, t0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                t0Var.Z = null;
                t0Var.Y = 2;
                if (iVar.a(obj, this) == aVar) {
                    return aVar;
                }
                return yb.y.f14813a;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            p7.j.I(obj);
                            return yb.y.f14813a;
                        }
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iVar2 = this.Z;
                    p7.j.I(obj);
                } else {
                    p7.j.I(obj);
                    iVar2 = this.Z;
                    Object[] objArr2 = this.f2863b0;
                    Object obj7 = objArr2[0];
                    Object obj8 = objArr2[1];
                    this.Z = iVar2;
                    this.Y = 1;
                    obj = this.f2864c0.i(obj7, obj8, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                this.Z = null;
                this.Y = 2;
                if (iVar2.a(obj, this) == aVar2) {
                    return aVar2;
                }
                return yb.y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(mc.q qVar, cc.c cVar) {
        super(3, cVar);
        this.f2864c0 = (ec.j) qVar;
    }
}
