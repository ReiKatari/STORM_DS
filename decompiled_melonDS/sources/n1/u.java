package n1;

import h1.u1;
import p1.t0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends ec.j implements mc.p {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ x Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ int f9842b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, int i2, cc.c cVar) {
        super(2, cVar);
        this.Z = xVar;
        this.f9842b0 = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((u) t((cc.c) obj2, (u1) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        u uVar = new u(this.Z, this.f9842b0, cVar);
        uVar.Y = obj;
        return uVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 == 1) {
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            x xVar = this.Z;
            s sVar = new s((u1) this.Y, xVar, 0);
            x4.c cVar = ((p) xVar.f9852f.getValue()).f9808i;
            this.X = 1;
            if (t0.a(sVar, this.f9842b0, 100, cVar, this) == aVar) {
                return aVar;
            }
        }
        return yb.y.f14813a;
    }
}
