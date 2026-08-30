package o2;

import java.util.List;
import n2.h2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends ek.a {

    /* renamed from: d  reason: collision with root package name */
    public static final g f10636d = new ek.a(0, 2, 1);

    @Override // ek.a
    public final void c(f2.s sVar, n2.c cVar, h2 h2Var, v2.i iVar, j0 j0Var) {
        int i2 = ((v2.d) sVar.f(0)).f13611a;
        List list = (List) sVar.f(1);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            int i11 = i2 + i10;
            cVar.d(i11, obj);
            cVar.g(i11, obj);
        }
    }
}
