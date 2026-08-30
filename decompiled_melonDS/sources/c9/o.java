package c9;

import me.magnum.melonds.common.camera.DSiCameraSource;
import y3.h1;
import y3.i1;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ i1 B;

    public /* synthetic */ o(i1 i1Var, int i2) {
        this.A = i2;
        this.B = i1Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        h1 h1Var = (h1) obj;
        switch (this.A) {
            case 0:
                h1.k(h1Var, this.B, 0, 0);
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                h1.n(h1Var, this.B, 0, 0);
                break;
            case 2:
                h1.k(h1Var, this.B, 0, 0);
                break;
            case 3:
                h1.k(h1Var, this.B, 0, 0);
                break;
            case 4:
                h1.n(h1Var, this.B, 0, 0);
                break;
            case l1.c.f8511g /* 5 */:
                h1.n(h1Var, this.B, 0, 0);
                break;
            case l1.c.f8509e /* 6 */:
                x4.m g10 = h1Var.g();
                x4.m mVar = x4.m.Ltr;
                i1 i1Var = this.B;
                if (g10 != mVar && h1Var.h() != 0) {
                    int h2 = h1Var.h() - i1Var.A;
                    int i2 = (int) 0;
                    h1.a(h1Var, i1Var);
                    i1Var.q0(x4.j.c((i2 & 4294967295L) | ((h2 - i2) << 32), i1Var.X), 0.0f, null);
                } else {
                    h1.a(h1Var, i1Var);
                    i1Var.q0(x4.j.c(0L, i1Var.X), 0.0f, null);
                }
                return y.f14813a;
            case 7:
                h1.n(h1Var, this.B, 0, 0);
                break;
            case 8:
                h1.n(h1Var, this.B, 0, 0);
                break;
            case l1.c.f8508d /* 9 */:
                h1.k(h1Var, this.B, 0, 0);
                break;
            default:
                h1.n(h1Var, this.B, 0, 0);
                break;
        }
        return y.f14813a;
    }
}
