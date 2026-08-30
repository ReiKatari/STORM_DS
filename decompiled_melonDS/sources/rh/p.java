package rh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

    public /* synthetic */ p(me.magnum.melonds.ui.layouteditor.b bVar, int i2) {
        this.A = i2;
        this.B = bVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        int i2 = this.A;
        n2.m mVar = (n2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                me.magnum.melonds.ui.layouteditor.b.h(this.B, mVar, intValue);
                return yb.y.f14813a;
            default:
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    ij.a.u(false, v2.h.c(1815524482, new p(this.B, 0), rVar), rVar, 48, 1);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
        }
    }
}
