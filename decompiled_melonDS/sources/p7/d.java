package p7;

import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends ec.j implements mc.p {
    public final /* synthetic */ int X = 1;
    public int Y;
    public final /* synthetic */ k7.t Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ boolean f11407b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ boolean f11408c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ mc.l f11409d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(cc.c cVar, k7.t tVar, boolean z10, boolean z11, mc.l lVar) {
        super(2, cVar);
        this.Z = tVar;
        this.f11407b0 = z10;
        this.f11408c0 = z11;
        this.f11409d0 = lVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((d) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((d) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new d(this.Z, this.f11407b0, this.f11408c0, this.f11409d0, cVar);
            default:
                return new d(cVar, this.Z, this.f11407b0, this.f11408c0, this.f11409d0);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        boolean z10;
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        j.I(obj);
                        return obj;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j.I(obj);
                k7.t tVar = this.Z;
                if ((!tVar.k() || !tVar.l()) && this.f11407b0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = this.f11408c0;
                k7.t tVar2 = this.Z;
                c cVar = new c(z10, z11, tVar2, null, this.f11409d0, 0);
                this.Y = 1;
                Object q10 = tVar2.q(z11, cVar, this);
                if (q10 == aVar) {
                    return aVar;
                }
                return q10;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        j.I(obj);
                        return obj;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j.I(obj);
                mc.l lVar = this.f11409d0;
                boolean z12 = this.f11408c0;
                boolean z13 = this.f11407b0;
                k7.t tVar3 = this.Z;
                c cVar2 = new c(z12, z13, tVar3, null, lVar, 1);
                this.Y = 1;
                Object q11 = tVar3.q(z13, cVar2, this);
                if (q11 == aVar2) {
                    return aVar2;
                }
                return q11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k7.t tVar, boolean z10, boolean z11, mc.l lVar, cc.c cVar) {
        super(2, cVar);
        this.Z = tVar;
        this.f11407b0 = z10;
        this.f11408c0 = z11;
        this.f11409d0 = lVar;
    }
}
