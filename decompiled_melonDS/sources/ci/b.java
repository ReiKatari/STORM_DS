package ci;

import androidx.lifecycle.s0;
import b4.g3;
import kf.o1;
import kf.u1;
import mc.p;
import q8.r;
import x8.s;
import yb.y;
import zc.q;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends ec.j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ d Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = dVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((b) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((b) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new b(this.Z, cVar, 0);
            default:
                return new b(this.Z, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                y yVar = y.f14813a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    d dVar = this.Z;
                    q8.p a10 = q8.p.a(((u1) ((gi.a) dVar.p0.getValue()).f5671b).f8270a);
                    a10.getClass();
                    x8.u w10 = a10.f12373c.w();
                    q qVar = a10.f12374d.f14970b;
                    w10.getClass();
                    qVar.getClass();
                    cd.h t5 = cd.q.t(cd.q.m(new o1(r.r(w10.f14444a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new s(w10, 0)), 1)), qVar);
                    g3 g3Var = new g3(3, dVar);
                    this.Y = 1;
                    Object c4 = t5.c(new a9.h(g3Var, 17), this);
                    if (c4 != aVar) {
                        c4 = yVar;
                    }
                    if (c4 == aVar) {
                        return aVar;
                    }
                }
                return yVar;
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
                    androidx.lifecycle.q qVar2 = androidx.lifecycle.q.STARTED;
                    d dVar2 = this.Z;
                    b bVar = new b(dVar2, null, 0);
                    this.Y = 1;
                    if (s0.j(dVar2, qVar2, bVar, this) == aVar2) {
                        return aVar2;
                    }
                }
                return y.f14813a;
        }
    }
}
