package b3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f1750a = new e(-1.0f);

    /* renamed from: b  reason: collision with root package name */
    public static final e f1751b = new e(1.0f);

    public static p a(p pVar, mc.q qVar) {
        return pVar.f(new k(qVar));
    }

    public static final p b(p pVar, n2.m mVar) {
        if (pVar.a(l.B)) {
            return pVar;
        }
        n2.r rVar = (n2.r) mVar;
        rVar.Y(1219399079);
        p pVar2 = (p) pVar.b(m.f1770a, new a5.f(3, rVar));
        rVar.p(false);
        return pVar2;
    }

    public static final p c(p pVar, n2.m mVar) {
        n2.r rVar = (n2.r) mVar;
        rVar.X(439770924);
        p b10 = b(pVar, rVar);
        rVar.p(false);
        return b10;
    }
}
