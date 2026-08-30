package xg;

import android.net.Uri;
import cd.q1;
import java.util.List;
import mc.p;
import yb.y;
import zc.g0;
import zc.u;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends ec.j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ h Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Uri f14606b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, Uri uri, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = hVar;
        this.f14606b0 = uri;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((f) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((f) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new f(this.Z, this.f14606b0, cVar, 0);
            default:
                return new f(this.Z, this.f14606b0, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                h hVar = this.Z;
                kf.g gVar = hVar.f14607b;
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            p7.j.I(obj);
                            q1 q1Var = hVar.f14610e;
                            yg.e eVar = new yg.e((List) obj);
                            q1Var.getClass();
                            q1Var.k(null, eVar);
                            q1 q1Var2 = hVar.f14612g;
                            Boolean bool = Boolean.FALSE;
                            q1Var2.getClass();
                            q1Var2.k(null, bool);
                            return y.f14813a;
                        }
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7.j.I(obj);
                } else {
                    p7.j.I(obj);
                    this.Y = 1;
                    obj = gVar.d(this.f14606b0, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                re.b bVar = (re.b) obj;
                if (bVar == re.b.SUCCESS) {
                    this.Y = 2;
                    obj = gVar.f(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    q1 q1Var3 = hVar.f14610e;
                    yg.e eVar2 = new yg.e((List) obj);
                    q1Var3.getClass();
                    q1Var3.k(null, eVar2);
                    q1 q1Var22 = hVar.f14612g;
                    Boolean bool2 = Boolean.FALSE;
                    q1Var22.getClass();
                    q1Var22.k(null, bool2);
                    return y.f14813a;
                }
                hVar.f14614i.p(bVar);
                q1 q1Var222 = hVar.f14612g;
                Boolean bool22 = Boolean.FALSE;
                q1Var222.getClass();
                q1Var222.k(null, bool22);
                return y.f14813a;
            default:
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
                    gd.f fVar = g0.f15015a;
                    f fVar2 = new f(this.Z, this.f14606b0, null, 0);
                    this.Y = 1;
                    if (x.F(fVar, fVar2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return y.f14813a;
        }
    }
}
