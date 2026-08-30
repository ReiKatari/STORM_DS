package q1;

import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ a0 B;

    public /* synthetic */ c(a0 a0Var, int i2) {
        this.A = i2;
        this.B = a0Var;
    }

    @Override // mc.a
    public final Object b() {
        int n10;
        int k10;
        int k11;
        switch (this.A) {
            case 0:
                n10 = this.B.n();
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                n10 = this.B.n();
                break;
            case 2:
                a0 a0Var = this.B;
                if (a0Var.f12103k.b()) {
                    k10 = a0Var.f12111t.g();
                } else {
                    k10 = a0Var.k();
                }
                return Integer.valueOf(k10);
            case 3:
                a0 a0Var2 = this.B;
                boolean b10 = a0Var2.f12103k.b();
                c1 c1Var = a0Var2.f12110s;
                if (!b10) {
                    k11 = a0Var2.k();
                } else if (c1Var.g() != -1) {
                    k11 = c1Var.g();
                } else if (Math.abs(a0Var2.l()) >= Math.abs(Math.min(a0Var2.f12108q.v(d0.f12126a), a0Var2.o() / 2.0f) / a0Var2.o())) {
                    boolean booleanValue = ((Boolean) a0Var2.G.getValue()).booleanValue();
                    int i2 = a0Var2.f12097e;
                    if (booleanValue) {
                        k11 = i2 + 1;
                    } else {
                        k11 = i2;
                    }
                } else {
                    k11 = a0Var2.k();
                }
                n10 = a0Var2.j(k11);
                break;
            default:
                n10 = this.B.n();
                break;
        }
        return Integer.valueOf(n10);
    }
}
