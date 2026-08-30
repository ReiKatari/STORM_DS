package s;

import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {
    public c A;
    public c B;
    public final /* synthetic */ int L;

    public b(c cVar, c cVar2, int i2) {
        this.L = i2;
        this.A = cVar2;
        this.B = cVar;
    }

    @Override // s.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.A == cVar && cVar == this.B) {
            this.B = null;
            this.A = null;
        }
        c cVar4 = this.A;
        if (cVar4 == cVar) {
            switch (this.L) {
                case 0:
                    cVar2 = cVar4.R;
                    break;
                default:
                    cVar2 = cVar4.L;
                    break;
            }
            this.A = cVar2;
        }
        c cVar5 = this.B;
        if (cVar5 == cVar) {
            c cVar6 = this.A;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.B = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.L) {
            case 0:
                return cVar.L;
            default:
                return cVar.R;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.B != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.B;
        c cVar3 = this.A;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.B = cVar;
        return cVar2;
    }
}
