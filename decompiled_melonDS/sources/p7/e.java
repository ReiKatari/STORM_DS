package p7;

import yb.y;
import zc.u;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends ec.j implements mc.p {
    public int X;
    public final /* synthetic */ cc.g Y;
    public final /* synthetic */ k7.t Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ boolean f11410b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ boolean f11411c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ mc.l f11412d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(cc.g gVar, k7.t tVar, boolean z10, boolean z11, mc.l lVar, cc.c cVar) {
        super(2, cVar);
        this.Y = gVar;
        this.Z = tVar;
        this.f11410b0 = z10;
        this.f11411c0 = z11;
        this.f11412d0 = lVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((e) t((cc.c) obj2, (u) obj)).v(y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new e(this.Y, this.Z, this.f11410b0, this.f11411c0, this.f11412d0, cVar);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 == 1) {
                j.I(obj);
                return obj;
            }
            a0.j.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j.I(obj);
        d dVar = new d(this.Z, this.f11410b0, this.f11411c0, this.f11412d0, (cc.c) null);
        this.X = 1;
        Object F = x.F(this.Y, dVar, this);
        if (F == aVar) {
            return aVar;
        }
        return F;
    }
}
