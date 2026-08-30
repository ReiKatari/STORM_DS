package ah;

import cd.q1;
import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q0 extends ec.j implements mc.p {
    public int X;
    public final /* synthetic */ h1 Y;
    public final /* synthetic */ ConsoleType Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(h1 h1Var, ConsoleType consoleType, cc.c cVar) {
        super(2, cVar);
        this.Y = h1Var;
        this.Z = consoleType;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((q0) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new q0(this.Y, this.Z, cVar);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        h1 h1Var = this.Y;
        q1 q1Var = h1Var.f777q;
        h0 h0Var = h1Var.f775o;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.X;
        ConsoleType consoleType = this.Z;
        if (i2 != 0) {
            if (i2 == 1) {
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            zc.x.v(h0Var, null, null, new g0(h1Var, null, 8), 3);
            zc.x.v(h0Var, null, null, new g0(h1Var, null, 11), 3);
            zc.x.v(h0Var, null, null, new g0(h1Var, null, 10), 3);
            zc.x.v(h0Var, null, null, new g0(h1Var, null, 9), 3);
            h1Var.f779s.j(null);
            zc.x.v(h0Var, null, null, new g0(h1Var, null, 7), 3);
            zc.x.v(h0Var, null, null, new g0(h1Var, null, 6), 3);
            pf.j jVar = h1Var.f773l;
            this.X = 1;
            jVar.getClass();
            gd.f fVar = zc.g0.f15015a;
            obj = zc.x.F(gd.e.L, new pf.e(jVar, consoleType, null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        se.l lVar = (se.l) obj;
        if (lVar instanceof se.j) {
            hh.e eVar = new hh.e(((se.j) lVar).f12881a);
            q1Var.getClass();
            q1Var.k(null, eVar);
        } else if (nc.k.a(lVar, se.k.f12882a)) {
            hh.j jVar2 = new hh.j(consoleType);
            q1Var.getClass();
            q1Var.k(null, jVar2);
            zc.x.v(h0Var, null, null, new a5.o(11, null, h1Var), 3);
        } else {
            m9.o.o();
            return null;
        }
        return yb.y.f14813a;
    }
}
