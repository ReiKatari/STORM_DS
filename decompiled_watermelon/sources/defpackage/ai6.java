package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ai6  reason: default package */
/* loaded from: classes.dex */
public final class ai6 implements Collection, f93 {
    public final /* synthetic */ int A = 0;
    public final Object B;

    public ai6() {
        int i = hf4.a;
        this.B = new y14(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                return ((y14) this.B).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.A) {
            case 0:
                ((y14) this.B).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                return ((y14) this.B).c(obj);
            default:
                return ((d24) this.B).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                for (Object obj2 : collection) {
                    if (!((y14) obj).c(obj2)) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                Collection<Object> collection2 = collection;
                if (!collection2.isEmpty()) {
                    for (Object obj3 : collection2) {
                        if (!((d24) obj).d(obj3)) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.A) {
            case 0:
                if (((y14) this.B).g == 0) {
                    return true;
                }
                return false;
            default:
                return ((d24) this.B).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                y14 y14Var = (y14) this.B;
                y14Var.getClass();
                return new ll2(new a24(y14Var));
            default:
                return io2.W(new a12(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                return ((y14) this.B).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.A) {
            case 0:
                return ((y14) this.B).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.A) {
            case 0:
                return ((y14) this.B).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.A) {
            case 0:
                return ((y14) this.B).g;
            default:
                return ((d24) this.B).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.A) {
            case 0:
                return b53.i0(this, objArr);
            default:
                objArr.getClass();
                return b53.i0(this, objArr);
        }
    }

    public ai6(d24 d24Var) {
        d24Var.getClass();
        this.B = d24Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.A) {
            case 0:
                return b53.h0(this);
            default:
                return b53.h0(this);
        }
    }
}
