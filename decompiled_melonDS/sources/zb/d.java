package zb;

import java.util.List;
import java.util.RandomAccess;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends e implements RandomAccess {
    public final e A;
    public final int B;
    public final int L;

    public d(e eVar, int i2, int i10) {
        this.A = eVar;
        this.B = i2;
        p7.o.d(i2, i10, eVar.a());
        this.L = i10 - i2;
    }

    @Override // zb.b
    public final int a() {
        return this.L;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        int i10 = this.L;
        if (i2 >= 0 && i2 < i10) {
            return this.A.get(this.B + i2);
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
        return null;
    }

    @Override // zb.e, java.util.List
    public final List subList(int i2, int i10) {
        p7.o.d(i2, i10, this.L);
        int i11 = this.B;
        return new d(this.A, i2 + i11, i11 + i10);
    }
}
