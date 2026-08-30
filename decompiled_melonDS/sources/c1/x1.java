package c1;

import java.util.Comparator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float g10;
        q1 q1Var = (q1) obj;
        float f8 = -1.0f;
        if (q1Var.B.g() == 0.0f && q1Var.f2510e0 == null) {
            g10 = -1.0f;
        } else {
            g10 = q1Var.B.g();
        }
        Float valueOf = Float.valueOf(g10);
        q1 q1Var2 = (q1) obj2;
        if (q1Var2.B.g() != 0.0f || q1Var2.f2510e0 != null) {
            f8 = q1Var2.B.g();
        }
        return d0.d.M(valueOf, Float.valueOf(f8));
    }
}
