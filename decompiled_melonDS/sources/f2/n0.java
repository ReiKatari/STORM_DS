package f2;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 implements y3.v0 {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f4758a = new Object();

    @Override // y3.v0
    public final y3.w0 a(y3.x0 x0Var, List list, long j2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            y3.i1 e6 = ((y3.u0) list.get(i11)).e(j2);
            i2 = Math.max(i2, e6.A);
            i10 = Math.max(i10, e6.B);
            arrayList.add(e6);
        }
        return x0Var.u0(i2, i10, zb.r.A, new m0(0, arrayList));
    }
}
