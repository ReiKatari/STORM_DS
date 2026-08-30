package x8;

import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ u B;
    public final /* synthetic */ t7.a L;

    public /* synthetic */ t(u uVar, t7.a aVar, int i2) {
        this.A = i2;
        this.B = uVar;
        this.L = aVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        a1.e eVar = (a1.e) obj;
        switch (this.A) {
            case 0:
                eVar.getClass();
                this.B.a(this.L, eVar);
                break;
            default:
                eVar.getClass();
                this.B.b(this.L, eVar);
                break;
        }
        return y.f14813a;
    }
}
