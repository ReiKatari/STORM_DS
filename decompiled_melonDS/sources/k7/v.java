package k7;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ mc.l f8084b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(mc.l lVar, cc.c cVar) {
        super(2, cVar);
        this.X = 0;
        this.f8084b0 = lVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((v) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((v) t((cc.c) obj2, (m7.k) obj)).v(yb.y.f14813a);
            default:
                return ((v) t((cc.c) obj2, (m7.k) obj)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                v vVar = new v(this.f8084b0, cVar);
                vVar.Z = obj;
                return vVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                v vVar2 = new v(1, cVar, this.f8084b0);
                vVar2.Z = obj;
                return vVar2;
            default:
                v vVar3 = new v(2, cVar, this.f8084b0);
                vVar3.Z = obj;
                return vVar3;
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                        return obj;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p7.j.I(obj);
                    if (((zc.u) this.Z).v().t(z.B) != null) {
                        this.Y = 1;
                        Object k10 = this.f8084b0.k(this);
                        if (k10 == aVar) {
                            return aVar;
                        }
                        return k10;
                    }
                    a0.j.p("Expected a TransactionElement in the CoroutineContext but none was found.");
                }
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                        return obj;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                m7.k kVar = (m7.k) this.Z;
                this.Y = 1;
                Object k11 = this.f8084b0.k(this);
                if (k11 == aVar2) {
                    return aVar2;
                }
                return k11;
            default:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p7.j.I(obj);
                        return obj;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                m7.k kVar2 = (m7.k) this.Z;
                this.Y = 1;
                Object k12 = this.f8084b0.k(this);
                if (k12 == aVar3) {
                    return aVar3;
                }
                return k12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i2, cc.c cVar, mc.l lVar) {
        super(2, cVar);
        this.X = i2;
        this.f8084b0 = lVar;
    }
}
