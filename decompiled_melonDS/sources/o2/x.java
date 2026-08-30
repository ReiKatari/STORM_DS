package o2;

import a1.m0;
import a1.u0;
import java.util.Set;
import n2.h2;
import n2.p1;
import n2.y1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x extends ek.a {

    /* renamed from: d  reason: collision with root package name */
    public static final x f10666d = new ek.a(0, 1, 1);

    @Override // ek.a
    public final void c(f2.s sVar, n2.c cVar, h2 h2Var, v2.i iVar, j0 j0Var) {
        p1 p1Var = (p1) sVar.f(0);
        Set set = iVar.f13614a;
        if (set == null) {
            return;
        }
        v2.e eVar = new v2.e(set);
        m0 m0Var = iVar.f13622i;
        if (m0Var == null) {
            long[] jArr = u0.f103a;
            m0Var = new m0();
            iVar.f13622i = m0Var;
        }
        m0Var.m(p1Var, eVar);
        iVar.f13618e.b(new y1(eVar, -1));
    }
}
