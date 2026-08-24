package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rt6  reason: default package */
/* loaded from: classes.dex */
public final class rt6 implements Collection, zf3 {
    public final /* synthetic */ int A = 0;
    public final Object B;

    public rt6() {
        int i = jo4.a;
        this.B = new ea4(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                return ((ea4) this.B).a(obj);
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
                ((ea4) this.B).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                return ((ea4) this.B).c(obj);
            default:
                return ((ja4) this.B).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                for (Object obj2 : collection) {
                    if (!((ea4) obj).c(obj2)) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                Collection<Object> collection2 = collection;
                if (!collection2.isEmpty()) {
                    for (Object obj3 : collection2) {
                        if (!((ja4) obj).d(obj3)) {
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
                if (((ea4) this.B).g == 0) {
                    return true;
                }
                return false;
            default:
                return ((ja4) this.B).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                ea4 ea4Var = (ea4) this.B;
                ea4Var.getClass();
                return new rr2(new ga4(ea4Var));
            default:
                return qo2.C(new p52(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                return ((ea4) this.B).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.A) {
            case 0:
                return ((ea4) this.B).g(collection);
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
                return ((ea4) this.B).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.A) {
            case 0:
                return ((ea4) this.B).g;
            default:
                return ((ja4) this.B).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.A) {
            case 0:
                return nb3.c0(this, objArr);
            default:
                objArr.getClass();
                return nb3.c0(this, objArr);
        }
    }

    public rt6(ja4 ja4Var) {
        ja4Var.getClass();
        this.B = ja4Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.A) {
            case 0:
                return nb3.b0(this);
            default:
                return nb3.b0(this);
        }
    }
}
