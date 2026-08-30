package rh;

import cd.q1;
import java.util.UUID;
import kf.r0;
import oe.h0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ e0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ UUID f12722b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ ve.a f12723c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(e0 e0Var, UUID uuid, ve.a aVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = e0Var;
        this.f12722b0 = uuid;
        this.f12723c0 = aVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((b0) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((b0) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new b0(this.Z, this.f12722b0, this.f12723c0, cVar, 0);
            default:
                return new b0(this.Z, this.f12722b0, this.f12723c0, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                e0 e0Var = this.Z;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    r0 r0Var = e0Var.f12727c;
                    this.Y = 1;
                    obj = r0Var.c(this.f12722b0, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                q1 q1Var = e0Var.f12733i;
                h0 h0Var = new h0((oe.a) obj, this.f12723c0);
                q1Var.getClass();
                q1Var.k(null, h0Var);
                return yb.y.f14813a;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                e0 e0Var2 = this.Z;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    r0 r0Var2 = e0Var2.f12727c;
                    this.Y = 1;
                    obj = r0Var2.c(this.f12722b0, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                q1 q1Var2 = e0Var2.f12735k;
                h0 h0Var2 = new h0((oe.a) obj, this.f12723c0);
                q1Var2.getClass();
                q1Var2.k(null, h0Var2);
                return yb.y.f14813a;
        }
    }
}
