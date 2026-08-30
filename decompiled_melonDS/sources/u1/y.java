package u1;

import g2.v3;
import h1.b3;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ v3.w Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ v0 f13463b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(v3.w wVar, v0 v0Var, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = wVar;
        this.f13463b0 = v0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((y) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((y) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((y) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new y(this.Z, this.f13463b0, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new y(this.Z, this.f13463b0, cVar, 1);
            default:
                return new y(this.Z, this.f13463b0, cVar, 2);
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [nc.s, java.lang.Object] */
    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        v0 v0Var = this.f13463b0;
        v3.w wVar = this.Z;
        Object obj2 = yb.y.f14813a;
        switch (i2) {
            case 0:
                Object obj3 = dc.a.COROUTINE_SUSPENDED;
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
                this.Y = 1;
                Object g10 = zc.x.g(new b7.p(wVar, v0Var, (cc.c) null, 2), this);
                if (g10 != obj3) {
                    g10 = obj2;
                }
                if (g10 == obj3) {
                    return obj3;
                }
                return obj2;
            case DSiCameraSource.FrontCamera /* 1 */:
                Object obj4 = dc.a.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p7.j.I(obj);
                        return obj2;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                this.Y = 1;
                Object e6 = b3.e(wVar, new h1.s0(3, (cc.c) null, v0Var), this);
                if (e6 != obj4) {
                    e6 = obj2;
                }
                if (e6 == obj4) {
                    return obj4;
                }
                return obj2;
            default:
                Object obj5 = dc.a.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        p7.j.I(obj);
                        return obj2;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                this.Y = 1;
                f2.z zVar = new f2.z(v0Var, 2);
                r0 r0Var = new r0(v0Var, 0);
                r0 r0Var2 = new r0(v0Var, 1);
                ai.s0 s0Var = new ai.s0(26, v0Var);
                ai.q0 q0Var = new ai.q0(7, zVar);
                a2.c cVar = new a2.c(19, r0Var);
                v3 v3Var = new v3(6);
                float f8 = h1.e0.f5886a;
                Object e10 = b3.e(wVar, new h1.c0(v3Var, new Object(), null, q0Var, s0Var, r0Var2, cVar, null), this);
                Object obj6 = e10;
                if (e10 != obj5) {
                    obj6 = obj2;
                }
                if (obj6 != obj5) {
                    obj6 = obj2;
                }
                if (obj6 != obj5) {
                    obj6 = obj2;
                }
                if (obj6 == obj5) {
                    return obj5;
                }
                return obj2;
        }
    }
}
