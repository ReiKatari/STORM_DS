package zb;

import a1.z0;
import java.util.ListIterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends z0 implements ListIterator {
    public final /* synthetic */ e R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i2) {
        super(8, eVar);
        this.R = eVar;
        int a10 = eVar.a();
        if (i2 >= 0 && i2 <= a10) {
            this.B = i2;
        } else {
            wa.b.f(kc.a.d(i2, a10, "index: ", ", size: "));
            throw null;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.B > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.B;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i2 = this.B - 1;
            this.B = i2;
            return this.R.get(i2);
        }
        fj.j.l();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.B - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
