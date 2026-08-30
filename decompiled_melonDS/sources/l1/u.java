package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final w f8630a = new w(i.f8573c, b3.c.f1758g0);

    public static final w a(h hVar, b3.f fVar, n2.m mVar, int i2) {
        boolean z10;
        if (nc.k.a(hVar, i.f8573c) && fVar.equals(b3.c.f1758g0)) {
            n2.r rVar = (n2.r) mVar;
            rVar.X(-1446604504);
            rVar.p(false);
            return f8630a;
        }
        n2.r rVar2 = (n2.r) mVar;
        rVar2.X(-1446550657);
        boolean z11 = true;
        if ((((i2 & 14) ^ 6) > 4 && rVar2.f(hVar)) || (i2 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((((i2 & 112) ^ 48) <= 32 || !rVar2.f(fVar)) && (i2 & 48) != 32) {
            z11 = false;
        }
        boolean z12 = z10 | z11;
        Object L = rVar2.L();
        if (z12 || L == n2.l.f9953a) {
            L = new w(hVar, fVar);
            rVar2.h0(L);
        }
        w wVar = (w) L;
        rVar2.p(false);
        return wVar;
    }
}
