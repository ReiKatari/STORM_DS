package ah;

import java.util.UUID;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e1 extends ec.j implements mc.q {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ yb.j Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ h1 f757b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(h1 h1Var, cc.c cVar, int i2) {
        super(3, cVar);
        this.X = i2;
        this.f757b0 = h1Var;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        yb.j jVar = (yb.j) obj;
        yb.y yVar = (yb.y) obj2;
        cc.c cVar = (cc.c) obj3;
        switch (this.X) {
            case 0:
                e1 e1Var = new e1(this.f757b0, cVar, 0);
                e1Var.Z = jVar;
                return e1Var.v(yb.y.f14813a);
            default:
                e1 e1Var2 = new e1(this.f757b0, cVar, 1);
                e1Var2.Z = jVar;
                return e1Var2.v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        ve.n nVar;
        ve.n nVar2;
        switch (this.X) {
            case 0:
                yb.j jVar = this.Z;
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    if (jVar != null) {
                        nVar = (ve.n) jVar.B;
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        return oe.h0.f10933c;
                    }
                    ve.m mVar = nVar.f13821a;
                    UUID uuid = mVar.f13818a;
                    ve.a aVar2 = mVar.f13819b;
                    this.Z = null;
                    this.Y = 1;
                    obj = h1.h(this.f757b0, uuid, aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return (oe.h0) obj;
            default:
                yb.j jVar2 = this.Z;
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
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
                    if (jVar2 != null) {
                        nVar2 = (ve.n) jVar2.B;
                    } else {
                        nVar2 = null;
                    }
                    if (nVar2 == null) {
                        return oe.h0.f10933c;
                    }
                    ve.m mVar2 = nVar2.f13822b;
                    UUID uuid2 = mVar2.f13818a;
                    ve.a aVar4 = mVar2.f13819b;
                    this.Z = null;
                    this.Y = 1;
                    obj = h1.h(this.f757b0, uuid2, aVar4, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                }
                return (oe.h0) obj;
        }
    }
}
