package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f5194a = 56;

    /* renamed from: b  reason: collision with root package name */
    public static final float f5195b = 400;

    /* renamed from: c  reason: collision with root package name */
    public static final d1.v1 f5196c = new d1.v1(256, (d1.v) null, 6);

    public static final k1 a(l1 l1Var, n2.m mVar) {
        n2.r rVar = (n2.r) mVar;
        Object L = rVar.L();
        n2.e eVar = n2.l.f9953a;
        if (L == eVar) {
            L = new d1.x1(23);
            rVar.h0(L);
        }
        mc.l lVar = (mc.l) L;
        Object[] objArr = new Object[0];
        p1.a0 a0Var = new p1.a0(28, new ai.l(22), new ai.w(lVar, 8));
        boolean f8 = ((n2.r) mVar).f(lVar);
        n2.r rVar2 = (n2.r) mVar;
        Object L2 = rVar2.L();
        if (f8 || L2 == eVar) {
            L2 = new a3.e(12, l1Var, lVar);
            rVar2.h0(L2);
        }
        return (k1) y2.k.d(objArr, a0Var, (mc.a) L2, rVar2, 0);
    }
}
