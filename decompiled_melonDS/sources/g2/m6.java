package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class m6 implements mc.p {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ Float B;
    public final /* synthetic */ mc.p L;
    public final /* synthetic */ long R;

    public /* synthetic */ m6(long j2, Float f8, mc.p pVar) {
        this.R = j2;
        this.B = f8;
        this.L = pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        int i2 = this.A;
        n2.m mVar = (n2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    n2.b0 b0Var = q0.f5361a;
                    long j2 = this.R;
                    n2.s.a(b0Var.a(new i3.s(j2)), v2.h.c(-1624601445, new m6(this.B, this.L, j2), rVar), rVar, 56);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                if ((intValue & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar;
                if (rVar2.O(intValue & 1, z11)) {
                    Float f8 = this.B;
                    mc.p pVar = this.L;
                    if (f8 != null) {
                        rVar2.X(1484860324);
                        n2.s.a(o0.f5308a.a(f8), pVar, rVar2, 8);
                        rVar2.p(false);
                    } else {
                        rVar2.X(1485059902);
                        n2.s.a(o0.f5308a.a(Float.valueOf(i3.s.d(this.R))), pVar, rVar2, 8);
                        rVar2.p(false);
                    }
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
        }
    }

    public /* synthetic */ m6(Float f8, mc.p pVar, long j2) {
        this.B = f8;
        this.L = pVar;
        this.R = j2;
    }
}
