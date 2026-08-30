package s2;

import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l implements Iterator, oc.a {
    public Object[] A = k.f12817e.f12821d;
    public int B;
    public int L;

    public final void a(Object[] objArr, int i2, int i10) {
        this.A = objArr;
        this.B = i2;
        this.L = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.L < this.B) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
