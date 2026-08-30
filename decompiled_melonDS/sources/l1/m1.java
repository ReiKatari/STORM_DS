package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a  reason: collision with root package name */
    public static final o1 f8587a = new o1(i.f8571a, b3.c.f1755d0);

    public static final o1 a(f fVar, b3.g gVar, n2.m mVar, int i2) {
        boolean z10;
        if (nc.k.a(fVar, i.f8571a) && nc.k.a(gVar, b3.c.f1755d0)) {
            n2.r rVar = (n2.r) mVar;
            rVar.X(-1073830487);
            rVar.p(false);
            return f8587a;
        }
        n2.r rVar2 = (n2.r) mVar;
        rVar2.X(-1073779616);
        boolean z11 = true;
        if ((((i2 & 14) ^ 6) > 4 && rVar2.f(fVar)) || (i2 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((((i2 & 112) ^ 48) <= 32 || !rVar2.f(gVar)) && (i2 & 48) != 32) {
            z11 = false;
        }
        boolean z12 = z10 | z11;
        Object L = rVar2.L();
        if (z12 || L == n2.l.f9953a) {
            L = new o1(fVar, gVar);
            rVar2.h0(L);
        }
        o1 o1Var = (o1) L;
        rVar2.p(false);
        return o1Var;
    }
}
