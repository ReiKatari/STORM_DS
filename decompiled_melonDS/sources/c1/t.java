package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ u L;
    public final /* synthetic */ long R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, long j2, int i2) {
        super(1);
        this.B = i2;
        this.L = uVar;
        this.R = j2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        long j2;
        d1.x xVar;
        long j10;
        switch (this.B) {
            case 0:
                d1.l1 l1Var = (d1.l1) obj;
                Object a10 = l1Var.a();
                u uVar = this.L;
                long j11 = 0;
                if (nc.k.a(a10, uVar.f2529l0.a())) {
                    if (x4.l.b(uVar.f2530m0, m.f2469a)) {
                        j2 = this.R;
                    } else {
                        j2 = uVar.f2530m0;
                    }
                } else {
                    n2.s2 s2Var = (n2.s2) uVar.f2529l0.f2535d.g(l1Var.a());
                    if (s2Var != null) {
                        j2 = ((x4.l) s2Var.getValue()).f14346a;
                    } else {
                        j2 = 0;
                    }
                }
                n2.s2 s2Var2 = (n2.s2) uVar.f2529l0.f2535d.g(l1Var.c());
                if (s2Var2 != null) {
                    j11 = ((x4.l) s2Var2.getValue()).f14346a;
                }
                o2 o2Var = (o2) uVar.f2528k0.getValue();
                if (o2Var == null || (xVar = (d1.x) o2Var.f2492a.j(new x4.l(j2), new x4.l(j11))) == null) {
                    return d1.d.q(5, null);
                }
                return xVar;
            default:
                u uVar2 = this.L;
                if (nc.k.a(obj, uVar2.f2529l0.a())) {
                    if (x4.l.b(uVar2.f2530m0, m.f2469a)) {
                        j10 = this.R;
                    } else {
                        j10 = uVar2.f2530m0;
                    }
                } else {
                    n2.s2 s2Var3 = (n2.s2) uVar2.f2529l0.f2535d.g(obj);
                    if (s2Var3 != null) {
                        j10 = ((x4.l) s2Var3.getValue()).f14346a;
                    } else {
                        j10 = 0;
                    }
                }
                return new x4.l(j10);
        }
    }
}
