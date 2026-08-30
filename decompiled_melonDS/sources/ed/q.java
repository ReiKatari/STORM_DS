package ed;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class q extends zc.a implements ec.d {
    public final cc.c R;

    public q(cc.c cVar, cc.g gVar) {
        super(gVar, true);
        this.R = cVar;
    }

    @Override // zc.f1
    public final boolean U() {
        return true;
    }

    @Override // zc.f1
    public void c(Object obj) {
        b.h(pc.a.A(this.R), zc.x.x(obj));
    }

    @Override // ec.d
    public final ec.d f() {
        cc.c cVar = this.R;
        if (cVar instanceof ec.d) {
            return (ec.d) cVar;
        }
        return null;
    }

    @Override // zc.f1
    public void q(Object obj) {
        this.R.h(zc.x.x(obj));
    }

    public void k0() {
    }
}
