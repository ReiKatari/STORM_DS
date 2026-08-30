package a1;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a1 implements Collection, oc.a {
    public final /* synthetic */ int A = 1;
    public final Object B;

    public a1() {
        int i2 = t0.f102a;
        this.B = new i0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((i0) this.B).a(obj);
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
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((i0) this.B).b();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                return ((m0) this.B).d(obj);
            default:
                return ((i0) this.B).c(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                Collection<Object> collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                for (Object obj : collection2) {
                    if (!((m0) this.B).d(obj)) {
                        return false;
                    }
                }
                return true;
            default:
                for (Object obj2 : collection) {
                    if (!((i0) this.B).c(obj2)) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.A) {
            case 0:
                return ((m0) this.B).i();
            default:
                if (((i0) this.B).f54g == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return p7.m.y(new g(2, null, this));
            default:
                i0 i0Var = (i0) this.B;
                i0Var.getClass();
                return new k0(new l0(i0Var));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((i0) this.B).g(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((i0) this.B).g(collection);
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
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((i0) this.B).i(collection);
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.A) {
            case 0:
                return ((m0) this.B).f71e;
            default:
                return ((i0) this.B).f54g;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.A) {
            case 0:
                objArr.getClass();
                return nc.j.b(this, objArr);
            default:
                return nc.j.b(this, objArr);
        }
    }

    public a1(m0 m0Var) {
        m0Var.getClass();
        this.B = m0Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.A) {
            case 0:
                return nc.j.a(this);
            default:
                return nc.j.a(this);
        }
    }
}
