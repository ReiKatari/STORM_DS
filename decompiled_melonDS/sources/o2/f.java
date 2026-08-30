package o2;

import d1.g2;
import n2.h2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends ek.a {

    /* renamed from: d  reason: collision with root package name */
    public static final f f10634d = new ek.a(0, 2, 1);

    @Override // ek.a
    public final void c(f2.s sVar, n2.c cVar, h2 h2Var, v2.i iVar, j0 j0Var) {
        int i2;
        jb.c cVar2;
        v2.d dVar = (v2.d) sVar.f(1);
        if (dVar != null) {
            i2 = dVar.f13611a;
        } else {
            i2 = 0;
        }
        a aVar = (a) sVar.f(0);
        if (i2 > 0) {
            cVar = new g2(cVar, i2);
        }
        if (j0Var != null) {
            cVar2 = new jb.c(26, j0Var, h2Var);
        } else {
            cVar2 = null;
        }
        aVar.R(cVar, h2Var, iVar, cVar2);
    }
}
