package s2;

import o3.f0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends l {
    public final f0 R;

    public n(f0 f0Var) {
        this.R = f0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.L;
        this.L = i2 + 2;
        Object[] objArr = this.A;
        return new a(this.R, objArr[i2], objArr[i2 + 1]);
    }
}
