package i1;

import h1.u1;
import java.util.concurrent.CancellationException;
import mc.l;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.f1;
import nc.q;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements l {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ l X;

    public /* synthetic */ g(sc.a aVar, float f8, l lVar, mc.a aVar2) {
        this.A = 2;
        this.L = aVar;
        this.B = f8;
        this.X = lVar;
        this.R = aVar2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        float f8;
        boolean z10;
        switch (this.A) {
            case 0:
                q qVar = (q) this.L;
                u1 u1Var = (u1) this.R;
                d1.i iVar = (d1.i) obj;
                float abs = Math.abs(((Number) iVar.f3590e.getValue()).floatValue());
                float f10 = this.B;
                int i2 = (abs > Math.abs(f10) ? 1 : (abs == Math.abs(f10) ? 0 : -1));
                f1 f1Var = iVar.f3590e;
                l lVar = this.X;
                if (i2 >= 0) {
                    float d4 = j.d(((Number) f1Var.getValue()).floatValue(), f10);
                    j.c(iVar, u1Var, lVar, d4 - qVar.A);
                    iVar.a();
                    qVar.A = d4;
                } else {
                    j.c(iVar, u1Var, lVar, ((Number) f1Var.getValue()).floatValue() - qVar.A);
                    qVar.A = ((Number) f1Var.getValue()).floatValue();
                }
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                q qVar2 = (q) this.L;
                u1 u1Var2 = (u1) this.R;
                d1.i iVar2 = (d1.i) obj;
                float d10 = j.d(((Number) iVar2.f3590e.getValue()).floatValue(), this.B);
                float f11 = d10 - qVar2.A;
                try {
                    f8 = u1Var2.a(f11);
                } catch (CancellationException unused) {
                    iVar2.a();
                    f8 = 0.0f;
                }
                this.X.k(Float.valueOf(f8));
                if (Math.abs(f11 - f8) > 0.5f || d10 != ((Number) iVar2.f3590e.getValue()).floatValue()) {
                    iVar2.a();
                }
                qVar2.A += f8;
                return y.f14813a;
            default:
                sc.a aVar = (sc.a) this.L;
                mc.a aVar2 = (mc.a) this.R;
                float f12 = p7.j.f(((Float) obj).floatValue(), aVar.f12863a, aVar.f12864b);
                if (f12 == this.B) {
                    z10 = false;
                } else {
                    this.X.k(Float.valueOf(f12));
                    z10 = true;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                }
                return Boolean.valueOf(z10);
        }
    }

    public /* synthetic */ g(float f8, q qVar, u1 u1Var, l lVar, int i2) {
        this.A = i2;
        this.B = f8;
        this.L = qVar;
        this.R = u1Var;
        this.X = lVar;
    }
}
