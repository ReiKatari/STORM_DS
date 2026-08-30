package q2;

import java.util.List;
import p7.m;
import r2.c;
import zb.e;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends e {
    public final c A;
    public final int B;
    public final int L;

    public a(c cVar, int i2, int i10) {
        this.A = cVar;
        this.B = i2;
        m.n(i2, i10, cVar.a());
        this.L = i10 - i2;
    }

    @Override // zb.b
    public final int a() {
        return this.L;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        m.k(i2, this.L);
        return this.A.get(this.B + i2);
    }

    @Override // zb.e, java.util.List
    public final List subList(int i2, int i10) {
        m.n(i2, i10, this.L);
        int i11 = this.B;
        return new a(this.A, i2 + i11, i11 + i10);
    }
}
