package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i2 {

    /* renamed from: a  reason: collision with root package name */
    public static final d1.a1 f2445a = d1.d.q(7, null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [d1.a1] */
    public static final n2.s2 a(long j2, d1.v1 v1Var, n2.m mVar, int i2, int i10) {
        d1.v1 v1Var2 = v1Var;
        if ((i10 & 2) != 0) {
            v1Var2 = f2445a;
        }
        d1.v1 v1Var3 = v1Var2;
        n2.r rVar = (n2.r) mVar;
        boolean f8 = rVar.f(i3.s.f(j2));
        Object L = rVar.L();
        if (f8 || L == n2.l.f9953a) {
            d1.w1 w1Var = new d1.w1(e.f2405b0, new g(3, i3.s.f(j2)));
            rVar.h0(w1Var);
            L = w1Var;
        }
        return d1.e.c(new i3.s(j2), (d1.w1) L, v1Var3, null, "ColorAnimation", rVar, (i2 << 3) & 896, 8);
    }
}
