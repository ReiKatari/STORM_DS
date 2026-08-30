package b4;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p2 implements a4.d2 {
    public final int A;
    public final List B;
    public Float L = null;
    public Float R = null;
    public i4.j X = null;
    public i4.j Y = null;

    public p2(int i2, ArrayList arrayList) {
        this.A = i2;
        this.B = arrayList;
    }

    @Override // a4.d2
    public final boolean w() {
        return this.B.contains(this);
    }
}
