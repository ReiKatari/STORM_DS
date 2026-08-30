package androidx.lifecycle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 implements v {
    public final /* synthetic */ p A;
    public final /* synthetic */ nc.t B;
    public final /* synthetic */ zc.u L;
    public final /* synthetic */ p R;
    public final /* synthetic */ zc.h X;
    public final /* synthetic */ id.c Y;
    public final /* synthetic */ ec.j Z;

    public l0(p pVar, nc.t tVar, zc.u uVar, p pVar2, zc.h hVar, id.c cVar, mc.p pVar3) {
        this.A = pVar;
        this.B = tVar;
        this.L = uVar;
        this.R = pVar2;
        this.X = hVar;
        this.Y = cVar;
        this.Z = (ec.j) pVar3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ec.j, mc.p] */
    @Override // androidx.lifecycle.v
    public final void d(x xVar, p pVar) {
        p pVar2 = this.A;
        nc.t tVar = this.B;
        if (pVar == pVar2) {
            tVar.A = zc.x.v(this.L, null, null, new a9.d(this.Y, (mc.p) this.Z, (cc.c) null), 3);
            return;
        }
        if (pVar == this.R) {
            zc.y0 y0Var = (zc.y0) tVar.A;
            if (y0Var != null) {
                y0Var.i(null);
            }
            tVar.A = null;
        }
        if (pVar == p.ON_DESTROY) {
            this.X.h(yb.y.f14813a);
        }
    }
}
