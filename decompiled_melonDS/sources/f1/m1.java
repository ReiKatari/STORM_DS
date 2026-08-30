package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a  reason: collision with root package name */
    public static final n2.b0 f4618a = new n2.b0(new d1.x1(15));

    public static final i a(n2.m mVar) {
        n2.r rVar = (n2.r) mVar;
        rVar.X(282942128);
        j jVar = (j) rVar.j(f4618a);
        if (jVar == null) {
            rVar.p(false);
            return null;
        }
        boolean f8 = rVar.f(jVar);
        Object L = rVar.L();
        if (f8 || L == n2.l.f9953a) {
            i iVar = new i(jVar.f4595a, jVar.f4596b, jVar.f4597c, jVar.f4598d);
            rVar.h0(iVar);
            L = iVar;
        }
        i iVar2 = (i) L;
        rVar.p(false);
        return iVar2;
    }
}
