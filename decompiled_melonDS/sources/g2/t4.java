package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class t4 implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ w4 B;

    public /* synthetic */ t4(w4 w4Var, int i2) {
        this.A = i2;
        this.B = w4Var;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                zc.h hVar = this.B.f5452d;
                if (hVar.z()) {
                    hVar.h(f5.Dismissed);
                }
                return Boolean.TRUE;
            default:
                zc.h hVar2 = this.B.f5452d;
                if (hVar2.z()) {
                    hVar2.h(f5.ActionPerformed);
                }
                return yb.y.f14813a;
        }
    }
}
