package u1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ o1 B;

    public /* synthetic */ m(o1 o1Var, int i2) {
        this.A = i2;
        this.B = o1Var;
    }

    @Override // mc.a
    public final Object b() {
        boolean z10;
        boolean z11;
        l4.h hVar;
        l4.n0 n0Var;
        switch (this.A) {
            case 0:
                o1 o1Var = this.B;
                if (o1Var != null) {
                    z10 = ((Boolean) new m(o1Var, 2).b()).booleanValue();
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case DSiCameraSource.FrontCamera /* 1 */:
                o1 o1Var2 = this.B;
                if (o1Var2 != null) {
                    z11 = ((Boolean) new m(o1Var2, 2).b()).booleanValue();
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            default:
                o1 o1Var3 = this.B;
                l4.h hVar2 = o1Var3.f13377b;
                l4.o0 o0Var = (l4.o0) o1Var3.f13376a.getValue();
                if (o0Var != null && (n0Var = o0Var.f8865a) != null) {
                    hVar = n0Var.f8853a;
                } else {
                    hVar = null;
                }
                return Boolean.valueOf(nc.k.a(hVar2, hVar));
        }
    }
}
