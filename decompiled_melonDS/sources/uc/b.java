package uc;

import java.util.Iterator;
import zb.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements Iterator, oc.a {
    public final /* synthetic */ int A = 1;
    public final Iterator B;
    public int L;

    public b(c cVar) {
        this.B = cVar.f13542a.iterator();
        this.L = cVar.f13543b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.A) {
            case 0:
                break;
            default:
                return this.B.hasNext();
        }
        while (true) {
            int i2 = this.L;
            it = this.B;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.L--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.A) {
            case 0:
                break;
            default:
                int i2 = this.L;
                this.L = i2 + 1;
                if (i2 >= 0) {
                    return new t(i2, this.B.next());
                }
                p7.t.F();
                throw null;
        }
        while (true) {
            int i10 = this.L;
            it = this.B;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.L--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(Iterator it) {
        it.getClass();
        this.B = it;
    }
}
