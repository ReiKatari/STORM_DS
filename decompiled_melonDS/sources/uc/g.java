package uc;

import java.util.Iterator;
import java.util.NoSuchElementException;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements Iterator, cc.c, oc.a {
    public int A;
    public Object B;
    public Iterator L;
    public cc.c R;

    public final RuntimeException a() {
        int i2 = this.A;
        if (i2 != 4) {
            if (i2 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.A);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final dc.a b(cc.c cVar, Object obj) {
        this.B = obj;
        this.A = 3;
        this.R = cVar;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        cVar.getClass();
        return aVar;
    }

    @Override // cc.c
    public final cc.g g() {
        return cc.h.A;
    }

    @Override // cc.c
    public final void h(Object obj) {
        p7.j.I(obj);
        this.A = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i2 = this.A;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        return true;
                    }
                    if (i2 == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.L;
                it.getClass();
                if (it.hasNext()) {
                    this.A = 2;
                    return true;
                }
                this.L = null;
            }
            this.A = 5;
            cc.c cVar = this.R;
            cVar.getClass();
            this.R = null;
            cVar.h(y.f14813a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.A;
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.A = 0;
                    Object obj = this.B;
                    this.B = null;
                    return obj;
                }
                throw a();
            }
            this.A = 1;
            Iterator it = this.L;
            it.getClass();
            return it.next();
        } else if (hasNext()) {
            return next();
        } else {
            fj.j.l();
            return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
