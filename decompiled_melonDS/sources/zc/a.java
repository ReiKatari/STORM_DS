package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a extends f1 implements cc.c, u {
    public final cc.g L;

    public a(cc.g gVar, boolean z10) {
        super(z10);
        S((y0) gVar.t(r.B));
        this.L = gVar.H(this);
    }

    @Override // zc.f1
    public final String A() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // zc.f1
    public final void R(androidx.fragment.app.g0 g0Var) {
        x.q(this.L, g0Var);
    }

    @Override // zc.f1
    public final void a0(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            Throwable th2 = oVar.f15025a;
            boolean z10 = true;
            if (o.f15024b.get(oVar) != 1) {
                z10 = false;
            }
            i0(th2, z10);
            return;
        }
        j0(obj);
    }

    @Override // cc.c
    public final cc.g g() {
        return this.L;
    }

    @Override // cc.c
    public final void h(Object obj) {
        Throwable a10 = yb.l.a(obj);
        if (a10 != null) {
            obj = new o(a10, false);
        }
        Object W = W(obj);
        if (W == x.f15035e) {
            return;
        }
        q(W);
    }

    @Override // zc.u
    public final cc.g v() {
        return this.L;
    }

    public void j0(Object obj) {
    }

    public void i0(Throwable th2, boolean z10) {
    }
}
