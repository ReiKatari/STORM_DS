package o2;

import n2.h2;
import n2.y1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends ek.a {

    /* renamed from: d  reason: collision with root package name */
    public static final e f10632d = new ek.a(0, 2, 1);

    @Override // ek.a
    public final void c(f2.s sVar, n2.c cVar, h2 h2Var, v2.i iVar, j0 j0Var) {
        n2.a aVar = (n2.a) sVar.f(0);
        Object f8 = sVar.f(1);
        if (f8 instanceof y1) {
            y1 y1Var = (y1) f8;
            iVar.f13618e.b(y1Var);
            iVar.f13617d.a(y1Var);
        }
        if (h2Var.f9916n != 0) {
            n2.t.a("Can only append a slot if not current inserting");
        }
        int i2 = h2Var.f9912i;
        int i10 = h2Var.f9913j;
        int c4 = h2Var.c(aVar);
        int g10 = h2Var.g(h2Var.f9905b, h2Var.r(c4 + 1));
        h2Var.f9912i = g10;
        h2Var.f9913j = g10;
        h2Var.x(1, c4);
        if (i2 >= g10) {
            i2++;
            i10++;
        }
        h2Var.f9906c[g10] = f8;
        h2Var.f9912i = i2;
        h2Var.f9913j = i10;
    }
}
