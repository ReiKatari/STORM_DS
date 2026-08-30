package o3;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 implements Iterator, oc.a {
    public final /* synthetic */ int A = 0;
    public final Iterator B;

    public f0(s2.d dVar) {
        s2.l[] lVarArr = new s2.l[8];
        for (int i2 = 0; i2 < 8; i2++) {
            lVarArr[i2] = new s2.n(this);
        }
        this.B = new s2.e(dVar, lVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                return this.B.hasNext();
            default:
                return ((s2.e) this.B).L;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.A) {
            case 0:
                return (i0) this.B.next();
            default:
                return (Map.Entry) ((s2.e) this.B).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((s2.e) this.B).remove();
                return;
        }
    }

    public f0(g0 g0Var) {
        this.B = g0Var.f10743d0.iterator();
    }
}
