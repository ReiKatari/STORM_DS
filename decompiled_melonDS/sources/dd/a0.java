package dd;

import cd.e1;
import cd.o1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 extends e1 implements o1 {
    @Override // cd.o1
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f2824b0;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f2825c0 + ((int) ((q() + this.f2827e0) - this.f2825c0))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void x(int i2) {
        synchronized (this) {
            Object[] objArr = this.f2824b0;
            objArr.getClass();
            p(Integer.valueOf(((Number) objArr[((int) ((this.f2825c0 + ((int) ((q() + this.f2827e0) - this.f2825c0))) - 1)) & (objArr.length - 1)]).intValue() + i2));
        }
    }
}
