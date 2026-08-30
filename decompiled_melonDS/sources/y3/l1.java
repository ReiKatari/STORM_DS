package y3;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l1 extends a4.j0 {

    /* renamed from: b  reason: collision with root package name */
    public static final l1 f14706b = new a4.j0("Undefined intrinsics block and it is required");

    @Override // y3.v0
    public final w0 a(x0 x0Var, List list, long j2) {
        int size = list.size();
        zb.r rVar = zb.r.A;
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i2 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < size2; i11++) {
                    i1 e6 = ((u0) list.get(i11)).e(j2);
                    i2 = Math.max(e6.A, i2);
                    i10 = Math.max(e6.B, i10);
                    arrayList.add(e6);
                }
                return x0Var.u0(x4.b.g(i2, j2), x4.b.f(i10, j2), rVar, new a5.h(2, arrayList));
            }
            i1 e10 = ((u0) list.get(0)).e(j2);
            return x0Var.u0(x4.b.g(e10.A, j2), x4.b.f(e10.B, j2), rVar, new a5.t(e10, 3));
        }
        return x0Var.u0(x4.a.j(j2), x4.a.i(j2), rVar, j1.R);
    }
}
