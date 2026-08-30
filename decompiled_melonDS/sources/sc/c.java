package sc;

import fj.j;
import zb.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends u {
    public final int A;
    public final int B;
    public boolean L;
    public int R;

    public c(int i2, int i10, int i11) {
        this.A = i11;
        this.B = i10;
        boolean z10 = false;
        if (i11 <= 0 ? i2 >= i10 : i2 <= i10) {
            z10 = true;
        }
        this.L = z10;
        this.R = z10 ? i2 : i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.L;
    }

    @Override // zb.u
    public final int nextInt() {
        int i2 = this.R;
        if (i2 == this.B) {
            if (this.L) {
                this.L = false;
                return i2;
            }
            j.l();
            return 0;
        }
        this.R = this.A + i2;
        return i2;
    }
}
