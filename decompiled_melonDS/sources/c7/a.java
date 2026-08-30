package c7;

import f2.b1;
import g2.l0;
import g2.m0;
import g2.o0;
import g2.q0;
import i3.z;
import mc.p;
import mc.q;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.m;
import n2.r;
import n2.s;
import v2.h;
import yb.d;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;

    public /* synthetic */ a(b1 b1Var, boolean z10, int i2) {
        this.A = 3;
        this.L = b1Var;
        this.B = z10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        float f8;
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                ij.a.v(this.B, (p) this.L, (m) obj, s.F(1));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                q qVar = (q) this.L;
                m mVar = (m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    if (this.B) {
                        rVar.X(-1691869137);
                        long j2 = ((i3.s) rVar.j(q0.f5361a)).f6689a;
                        if (!((l0) rVar.j(m0.f5257a)).k() ? z.r(j2) < 0.5d : z.r(j2) > 0.5d) {
                            f8 = 1.0f;
                        } else {
                            f8 = 0.87f;
                        }
                        rVar.p(false);
                    } else {
                        rVar.X(-1691868397);
                        long j10 = ((i3.s) rVar.j(q0.f5361a)).f6689a;
                        if (((l0) rVar.j(m0.f5257a)).k()) {
                            z.r(j10);
                        } else {
                            z.r(j10);
                        }
                        rVar.p(false);
                        f8 = 0.38f;
                    }
                    s.a(o0.f5308a.a(Float.valueOf(f8)), h.c(-308149173, new g2.z(qVar, 1), rVar), rVar, 56);
                } else {
                    rVar.R();
                }
                return y.f14813a;
            case 2:
                ((Integer) obj2).getClass();
                ig.m.h(this.B, (mc.a) this.L, (m) obj, s.F(1));
                break;
            default:
                ((Integer) obj2).getClass();
                u1.l0.h((b1) this.L, this.B, (m) obj, s.F(1));
                break;
        }
        return y.f14813a;
    }

    public /* synthetic */ a(boolean z10, q qVar) {
        this.A = 1;
        this.B = z10;
        this.L = qVar;
    }

    public /* synthetic */ a(boolean z10, d dVar, int i2, int i10) {
        this.A = i10;
        this.B = z10;
        this.L = dVar;
    }
}
