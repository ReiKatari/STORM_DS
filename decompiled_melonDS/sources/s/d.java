package s;

import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {
    public c A;
    public boolean B = true;
    public final /* synthetic */ f L;

    public d(f fVar) {
        this.L = fVar;
    }

    @Override // s.e
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.A;
        if (cVar == cVar2) {
            c cVar3 = cVar2.R;
            this.A = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.B = z10;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.B) {
            if (this.L.A != null) {
                return true;
            }
            return false;
        }
        c cVar = this.A;
        if (cVar != null && cVar.L != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        if (this.B) {
            this.B = false;
            this.A = this.L.A;
        } else {
            c cVar2 = this.A;
            if (cVar2 != null) {
                cVar = cVar2.L;
            } else {
                cVar = null;
            }
            this.A = cVar;
        }
        return this.A;
    }
}
