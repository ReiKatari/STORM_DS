package o2;

import a1.m0;
import java.util.ArrayList;
import n2.h2;
import n2.p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends ek.a {

    /* renamed from: d  reason: collision with root package name */
    public static final o f10653d = new ek.a(0, 1, 1);

    @Override // ek.a
    public final void c(f2.s sVar, n2.c cVar, h2 h2Var, v2.i iVar, j0 j0Var) {
        p2.b bVar;
        p1 p1Var = (p1) sVar.f(0);
        m0 m0Var = iVar.f13622i;
        if (m0Var != null && ((v2.e) m0Var.g(p1Var)) != null) {
            ArrayList arrayList = iVar.f13623j;
            if (arrayList != null && (bVar = (p2.b) arrayList.remove(arrayList.size() - 1)) != null) {
                iVar.f13618e = bVar;
            }
            m0Var.k(p1Var);
        }
    }
}
