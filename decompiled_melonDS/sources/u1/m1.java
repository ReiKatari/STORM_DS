package u1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.g3;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m1 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(int i2, cc.c cVar, Object obj) {
        super(2, cVar);
        this.X = i2;
        this.Z = obj;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((m1) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((m1) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((m1) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new m1(0, cVar, (q0) this.Z);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new m1(1, cVar, (v3.h0) this.Z);
            default:
                return new m1(2, cVar, (RomDetailsActivity) this.Z);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        Object obj2 = yb.y.f14813a;
        Object obj3 = this.Z;
        switch (i2) {
            case 0:
                Object obj4 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                        return obj2;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                q0 q0Var = (q0) obj3;
                this.Y = 1;
                q0Var.getClass();
                a1.h0 h0Var = new a1.h0();
                cd.e1 e1Var = q0Var.f13415a.f7335a;
                cd.a0 a0Var = new cd.a0(17, h0Var, q0Var);
                e1Var.getClass();
                Object k10 = cd.e1.k(e1Var, a0Var, this);
                if (k10 != obj4) {
                    k10 = obj2;
                }
                if (k10 == obj4) {
                    return obj4;
                }
                return obj2;
            case DSiCameraSource.FrontCamera /* 1 */:
                v3.h0 h0Var2 = (v3.h0) obj3;
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1 || i11 == 2) {
                        p7.j.I(obj);
                        return obj2;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                PointerInputEventHandler pointerInputEventHandler = h0Var2.f13661l0;
                this.Y = 2;
                if (pointerInputEventHandler.invoke(h0Var2, this) == aVar) {
                    return aVar;
                }
                return obj2;
            default:
                RomDetailsActivity romDetailsActivity = (RomDetailsActivity) obj3;
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 != 1) {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7.j.I(obj);
                } else {
                    p7.j.I(obj);
                    int i13 = RomDetailsActivity.f9566z0;
                    cd.x0 x0Var = ((yh.e) romDetailsActivity.f9571y0.getValue()).f12536g;
                    g3 g3Var = new g3(13, romDetailsActivity);
                    this.Y = 1;
                    if (x0Var.A.c(g3Var, this) == aVar2) {
                        return aVar2;
                    }
                }
                wa.b.a();
                return null;
        }
    }
}
