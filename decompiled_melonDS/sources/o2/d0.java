package o2;

import a1.m0;
import java.util.ArrayList;
import n2.h2;
import n2.p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends ek.a {

    /* renamed from: d  reason: collision with root package name */
    public static final d0 f10631d = new ek.a(0, 1, 1);

    @Override // ek.a
    public final void c(f2.s sVar, n2.c cVar, h2 h2Var, v2.i iVar, j0 j0Var) {
        v2.e eVar;
        p1 p1Var = (p1) sVar.f(0);
        m0 m0Var = iVar.f13622i;
        if (m0Var != null) {
            eVar = (v2.e) m0Var.g(p1Var);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            ArrayList arrayList = iVar.f13623j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                iVar.f13623j = arrayList;
            }
            arrayList.add(iVar.f13618e);
            iVar.f13618e = eVar.B;
        }
    }
}
