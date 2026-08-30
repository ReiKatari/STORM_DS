package a1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements Set, oc.a {
    public final /* synthetic */ int A;
    public final m0 B;

    public h(m0 m0Var, int i2) {
        this.A = i2;
        m0Var.getClass();
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B = m0Var;
                return;
            default:
                this.B = m0Var;
                return;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return nc.k.a(this.B.g(entry.getKey()), entry.getValue());
            default:
                return this.B.c(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i2 = this.A;
        collection.getClass();
        switch (i2) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                if (collection2.isEmpty()) {
                    return true;
                }
                for (Map.Entry entry : collection2) {
                    if (!nc.k.a(this.B.g(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection<Object> collection3 = collection;
                if (collection3.isEmpty()) {
                    return true;
                }
                for (Object obj : collection3) {
                    if (!this.B.c(obj)) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.A) {
            case 0:
                return this.B.i();
            default:
                return this.B.i();
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return p7.m.y(new g(0, null, this));
            default:
                return p7.m.y(new g(1, null, this));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.A) {
            case 0:
                return this.B.f71e;
            default:
                return this.B.f71e;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.A) {
            case 0:
                objArr.getClass();
                return nc.j.b(this, objArr);
            default:
                objArr.getClass();
                return nc.j.b(this, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.A) {
            case 0:
                return nc.j.a(this);
            default:
                return nc.j.a(this);
        }
    }
}
