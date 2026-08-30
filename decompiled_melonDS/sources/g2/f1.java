package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f1 implements i3.t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5134a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5135b;

    public /* synthetic */ f1(int i2, Object obj) {
        this.f5134a = i2;
        this.f5135b = obj;
    }

    @Override // i3.t
    public final long a() {
        switch (this.f5134a) {
            case 0:
                g1 g1Var = (g1) this.f5135b;
                long a10 = g1Var.f5157n0.a();
                if (a10 == 16) {
                    i3 i3Var = (i3) a4.l.h(g1Var, j3.f5198a);
                    if (i3Var != null) {
                        long j2 = i3Var.f5178a;
                        if (j2 != 16) {
                            return j2;
                        }
                    }
                    long j10 = ((i3.s) a4.l.h(g1Var, q0.f5361a)).f6689a;
                    boolean k10 = ((l0) a4.l.h(g1Var, m0.f5257a)).k();
                    float r5 = i3.z.r(j10);
                    if (!k10 && r5 < 0.5d) {
                        return i3.s.f6683d;
                    }
                    return j10;
                }
                return a10;
            default:
                return ((k3) this.f5135b).f5218c;
        }
    }
}
