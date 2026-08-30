package xg;

import android.net.Uri;
import cd.q1;
import mc.p;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.DSiWareTitle;
import yb.y;
import yg.l;
import yg.m;
import yg.n;
import zc.g0;
import zc.u;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends ec.j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ h Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ DSiWareTitle f14603b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ re.a f14604c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ Uri f14605d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, DSiWareTitle dSiWareTitle, re.a aVar, Uri uri, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = hVar;
        this.f14603b0 = dSiWareTitle;
        this.f14604c0 = aVar;
        this.f14605d0 = uri;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((e) t(cVar, uVar)).v(y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((e) t(cVar, uVar)).v(y.f14813a);
            case 2:
                return ((e) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((e) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new e(this.Z, this.f14603b0, this.f14604c0, this.f14605d0, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new e(this.Z, this.f14603b0, this.f14604c0, this.f14605d0, cVar, 1);
            case 2:
                return new e(this.Z, this.f14603b0, this.f14604c0, this.f14605d0, cVar, 2);
            default:
                return new e(this.Z, this.f14603b0, this.f14604c0, this.f14605d0, cVar, 3);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                re.a aVar2 = this.f14604c0;
                h hVar = this.Z;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    kf.g gVar = hVar.f14607b;
                    this.Y = 1;
                    obj = gVar.c(this.f14603b0, aVar2, this.f14605d0, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    hVar.f14616k.p(new l(aVar2.getFileName()));
                } else {
                    hVar.f14616k.p(yg.k.f14826a);
                }
                q1 q1Var = hVar.f14612g;
                Boolean bool = Boolean.FALSE;
                q1Var.getClass();
                q1Var.k(null, bool);
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
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
                    gd.f fVar = g0.f15015a;
                    e eVar = new e(this.Z, this.f14603b0, this.f14604c0, this.f14605d0, null, 0);
                    this.Y = 1;
                    if (x.F(fVar, eVar, this) == aVar3) {
                        return aVar3;
                    }
                }
                return y.f14813a;
            case 2:
                dc.a aVar4 = dc.a.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                re.a aVar5 = this.f14604c0;
                h hVar2 = this.Z;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    kf.g gVar2 = hVar2.f14607b;
                    this.Y = 1;
                    obj = gVar2.e(this.f14603b0, aVar5, this.f14605d0, this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    hVar2.f14616k.p(new n(aVar5.getFileName()));
                } else {
                    hVar2.f14616k.p(m.f14828a);
                }
                q1 q1Var2 = hVar2.f14612g;
                Boolean bool2 = Boolean.FALSE;
                q1Var2.getClass();
                q1Var2.k(null, bool2);
                return y.f14813a;
            default:
                dc.a aVar6 = dc.a.COROUTINE_SUSPENDED;
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
                    gd.f fVar2 = g0.f15015a;
                    e eVar2 = new e(this.Z, this.f14603b0, this.f14604c0, this.f14605d0, null, 2);
                    this.Y = 1;
                    if (x.F(fVar2, eVar2, this) == aVar6) {
                        return aVar6;
                    }
                }
                return y.f14813a;
        }
    }
}
