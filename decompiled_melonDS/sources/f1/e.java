package f1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ g Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ j1.k f4541b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, j1.k kVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = gVar;
        this.f4541b0 = kVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((e) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((e) t(cVar, uVar)).v(yb.y.f14813a);
            case 2:
                return ((e) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((e) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new e(this.Z, this.f4541b0, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new e(this.Z, this.f4541b0, cVar, 1);
            case 2:
                return new e(this.Z, this.f4541b0, cVar, 2);
            default:
                return new e(this.Z, this.f4541b0, cVar, 3);
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
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    j1.i iVar = this.Z.f4547k0;
                    if (iVar != null) {
                        j1.j jVar = new j1.j(this.f4541b0);
                        this.Y = 1;
                        if (iVar.a(jVar, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
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
                    j1.i iVar2 = this.Z.f4547k0;
                    if (iVar2 != null) {
                        j1.j jVar2 = new j1.j(this.f4541b0);
                        this.Y = 1;
                        if (iVar2.a(jVar2, this) == aVar2) {
                            return aVar2;
                        }
                    }
                }
                return yb.y.f14813a;
            case 2:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    j1.i iVar3 = this.Z.f4547k0;
                    if (iVar3 != null) {
                        this.Y = 1;
                        if (iVar3.a(this.f4541b0, this) == aVar3) {
                            return aVar3;
                        }
                    }
                }
                return yb.y.f14813a;
            default:
                dc.a aVar4 = dc.a.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    j1.i iVar4 = this.Z.f4547k0;
                    if (iVar4 != null) {
                        j1.l lVar = new j1.l(this.f4541b0);
                        this.Y = 1;
                        if (iVar4.a(lVar, this) == aVar4) {
                            return aVar4;
                        }
                    }
                }
                return yb.y.f14813a;
        }
    }
}
