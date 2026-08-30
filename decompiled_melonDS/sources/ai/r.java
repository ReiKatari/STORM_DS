package ai;

import d1.q1;
import g2.e7;
import g2.w4;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.o1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ r(int i2, Object obj, p1.z zVar) {
        this.A = 10;
        this.L = zVar;
        this.B = i2;
        this.R = obj;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                n.p((mc.a) this.L, (mc.p) this.R, (n2.m) obj, n2.s.F(this.B | 1));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Integer) obj2).intValue();
                ((q1) this.L).a(this.R, (n2.m) obj, n2.s.F(this.B | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                f1.n.a((b3.p) this.L, (mc.l) this.R, (n2.m) obj, n2.s.F(this.B | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                g2.n0.d((w4) this.L, (b3.p) this.R, (n2.m) obj, n2.s.F(this.B | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                e7.a((l4.r0) this.L, (mc.p) this.R, (n2.m) obj, n2.s.F(this.B | 1));
                break;
            case l1.c.f8511g /* 5 */:
                ((Integer) obj2).getClass();
                ((n1.k) this.L).e(this.B, this.R, (n2.m) obj, n2.s.F(1));
                break;
            case l1.c.f8509e /* 6 */:
                ((Integer) obj2).intValue();
                n2.s.a((o1) this.L, (mc.p) this.R, (n2.m) obj, n2.s.F(this.B | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                n2.s.b((o1[]) this.L, (mc.p) this.R, (n2.m) obj, n2.s.F(this.B | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((o1.h) this.L).e(this.B, this.R, (n2.m) obj, n2.s.F(1));
                break;
            case l1.c.f8508d /* 9 */:
                ((Integer) obj2).getClass();
                og.a.b((mc.a) this.L, (v2.c) this.R, (n2.m) obj, n2.s.F(this.B | 1));
                break;
            case l1.c.f8510f /* 10 */:
                p1.z zVar = (p1.z) this.L;
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    zVar.e(this.B, this.R, rVar, 0);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            case 11:
                ((Integer) obj2).getClass();
                ((q1.q) this.L).e(this.B, this.R, (n2.m) obj, n2.s.F(1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                u1.c.a((l4.h) this.L, (List) this.R, (n2.m) obj, n2.s.F(this.B | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((v2.c) this.L).h(this.R, (n2.m) obj, n2.s.F(this.B) | 1);
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ r(Object obj, Object obj2, int i2, int i10) {
        this.A = i10;
        this.L = obj;
        this.R = obj2;
        this.B = i2;
    }

    public /* synthetic */ r(p1.z zVar, int i2, Object obj, int i10, int i11) {
        this.A = i11;
        this.L = zVar;
        this.B = i2;
        this.R = obj;
    }
}
