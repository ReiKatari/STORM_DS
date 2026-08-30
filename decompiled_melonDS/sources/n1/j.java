package n1;

import c8.c0;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ p1.z L;

    public /* synthetic */ j(p1.z zVar, int i2, int i10) {
        this.A = i10;
        this.L = zVar;
        this.B = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.A) {
            case 0:
                k kVar = (k) this.L;
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    c0 c0Var = kVar.f9767b.f9765b;
                    int i2 = this.B;
                    p1.h d4 = c0Var.d(i2);
                    ((f) d4.f11214c).f9764c.r(kVar.f9768c, Integer.valueOf(i2 - d4.f11212a), rVar, 0);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                o1.h hVar = (o1.h) this.L;
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    c0 c0Var2 = hVar.f10513b.f10511c;
                    int i10 = this.B;
                    p1.h d10 = c0Var2.d(i10);
                    ((o1.f) d10.f11214c).f10508c.r(o1.i.f10515a, Integer.valueOf(i10 - d10.f11212a), rVar2, 6);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
            default:
                q1.q qVar = (q1.q) this.L;
                n2.m mVar3 = (n2.m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2.r rVar3 = (n2.r) mVar3;
                if (rVar3.O(intValue3 & 1, z12)) {
                    c0 k10 = qVar.f12161b.k();
                    int i11 = this.B;
                    p1.h d11 = k10.d(i11);
                    ((q1.l) d11.f11214c).f12153b.r(q1.t.f12193a, Integer.valueOf(i11 - d11.f11212a), rVar3, 0);
                } else {
                    rVar3.R();
                }
                return yb.y.f14813a;
        }
    }
}
