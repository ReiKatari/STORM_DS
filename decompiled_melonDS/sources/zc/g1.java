package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g1 extends l1 {
    public final cc.c R;

    public g1(cc.g gVar, mc.p pVar) {
        super(gVar, false);
        this.R = pc.a.q(pVar, this, this);
    }

    @Override // zc.f1
    public final void b0() {
        try {
            ed.b.h(pc.a.A(this.R), yb.y.f14813a);
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof c0) {
                th = ((c0) th).A;
            }
            h(p7.j.o(th));
            throw th;
        }
    }
}
