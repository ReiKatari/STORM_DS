package p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f11238a;

    /* renamed from: c  reason: collision with root package name */
    public e9.a f11240c;

    /* renamed from: f  reason: collision with root package name */
    public int f11243f;

    /* renamed from: b  reason: collision with root package name */
    public final c1 f11239b = new c1(0);

    /* renamed from: d  reason: collision with root package name */
    public int f11241d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f11242e = -1;

    public o0(mc.l lVar) {
        this.f11238a = lVar;
    }

    public final n0 a(int i2, long j2, boolean z10, mc.l lVar) {
        e9.a aVar = this.f11240c;
        if (aVar != null) {
            d1 d1Var = (d1) aVar.f4417d;
            boolean z11 = d1Var instanceof a;
            b1 b1Var = new b1(aVar, i2, this.f11239b, lVar);
            b1Var.f11190d = new x4.a(j2);
            if (z11) {
                if (z10) {
                    a aVar2 = (a) d1Var;
                    aVar2.B.add(new g1(1, b1Var));
                    if (!aVar2.L) {
                        aVar2.L = true;
                        aVar2.A.post(aVar2);
                    }
                } else {
                    a aVar3 = (a) d1Var;
                    aVar3.B.add(new g1(0, b1Var));
                    if (!aVar3.L) {
                        aVar3.L = true;
                        aVar3.A.post(aVar3);
                    }
                }
            } else {
                d1Var.a(b1Var);
            }
            p7.k.y(i2, "compose:lazy:schedule_prefetch:index");
            return b1Var;
        }
        return g.f11209a;
    }
}
