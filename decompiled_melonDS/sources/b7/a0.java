package b7;

import d1.m0;
import d1.o1;
import d1.q1;
import d1.r0;
import d1.x0;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 extends ec.j implements mc.p {
    public final /* synthetic */ int X = 0;
    public float Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f2083b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Object f2084c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(float f8, x0 x0Var, a7.i iVar, cc.c cVar) {
        super(2, cVar);
        this.Y = f8;
        this.f2083b0 = x0Var;
        this.f2084c0 = iVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((a0) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((a0) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((a0) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new a0(this.Y, (x0) this.f2083b0, (a7.i) this.f2084c0, cVar);
            case DSiCameraSource.FrontCamera /* 1 */:
                a0 a0Var = new a0((q1) this.f2084c0, cVar);
                a0Var.f2083b0 = obj;
                return a0Var;
            default:
                return new a0((l2.g) this.f2083b0, this.Y, (d1.j) this.f2084c0, cVar);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        Object a10;
        float n10;
        zc.u uVar;
        switch (this.X) {
            case 0:
                x0 x0Var = (x0) this.f2083b0;
                float f8 = this.Y;
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Z;
                yb.y yVar = yb.y.f14813a;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            p7.j.I(obj);
                            return yVar;
                        }
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7.j.I(obj);
                } else {
                    p7.j.I(obj);
                    if (f8 > 0.0f) {
                        this.Z = 1;
                        if (x0Var.q(f8, x0Var.f3694b.getValue(), this) == aVar) {
                            return aVar;
                        }
                    }
                }
                if (f8 == 0.0f) {
                    a7.i iVar = (a7.i) this.f2084c0;
                    this.Z = 2;
                    q1 q1Var = x0Var.f3697e;
                    if (q1Var == null || ((nc.k.a(x0Var.f3695c.getValue(), iVar) && nc.k.a(x0Var.f3694b.getValue(), iVar)) || (a10 = m0.a(x0Var.f3703k, new r0(x0Var, iVar, q1Var, (cc.c) null), this)) != aVar)) {
                        a10 = yVar;
                    }
                    if (a10 == aVar) {
                        return aVar;
                    }
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Z;
                if (i10 != 0) {
                    if (i10 == 1) {
                        n10 = this.Y;
                        uVar = (zc.u) this.f2083b0;
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    zc.u uVar2 = (zc.u) this.f2083b0;
                    n10 = d1.d.n(uVar2.v());
                    uVar = uVar2;
                }
                while (zc.x.t(uVar)) {
                    o1 o1Var = new o1((q1) this.f2084c0, n10);
                    this.f2083b0 = uVar;
                    this.Y = n10;
                    this.Z = 1;
                    cc.g gVar = this.B;
                    gVar.getClass();
                    if (n2.s.t(gVar).a(o1Var, this) == aVar2) {
                        return aVar2;
                    }
                }
                return yb.y.f14813a;
            default:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                int i11 = this.Z;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    this.Z = 1;
                    if (d1.c.d((d1.c) ((l2.g) this.f2083b0).f8679c, new Float(this.Y), (d1.j) this.f2084c0, null, this, 12) == aVar3) {
                        return aVar3;
                    }
                }
                return yb.y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(q1 q1Var, cc.c cVar) {
        super(2, cVar);
        this.f2084c0 = q1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(l2.g gVar, float f8, d1.j jVar, cc.c cVar) {
        super(2, cVar);
        this.f2083b0 = gVar;
        this.Y = f8;
        this.f2084c0 = jVar;
    }
}
