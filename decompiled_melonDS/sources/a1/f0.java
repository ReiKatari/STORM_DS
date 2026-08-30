package a1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 implements List, oc.b {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ f0(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        int i10;
        switch (this.A) {
            case 0:
                h0 h0Var = (h0) this.B;
                if (i2 >= 0 && i2 <= (i10 = h0Var.f45b)) {
                    int i11 = i10 + 1;
                    Object[] objArr = h0Var.f44a;
                    if (objArr.length < i11) {
                        h0Var.m(i11, objArr);
                    }
                    Object[] objArr2 = h0Var.f44a;
                    int i12 = h0Var.f45b;
                    if (i2 != i12) {
                        zb.k.i(objArr2, objArr2, i2 + 1, i2, i12);
                    }
                    objArr2[i2] = obj;
                    h0Var.f45b++;
                    return;
                }
                h0Var.o(i2);
                throw null;
            default:
                ((p2.b) this.B).a(i2, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                h0 h0Var = (h0) this.B;
                if (i2 >= 0 && i2 <= h0Var.f45b) {
                    int i10 = 0;
                    if (collection.isEmpty()) {
                        return false;
                    }
                    int size = collection.size() + h0Var.f45b;
                    Object[] objArr = h0Var.f44a;
                    if (objArr.length < size) {
                        h0Var.m(size, objArr);
                    }
                    Object[] objArr2 = h0Var.f44a;
                    if (i2 != h0Var.f45b) {
                        zb.k.i(objArr2, objArr2, collection.size() + i2, i2, h0Var.f45b);
                    }
                    for (Object obj : collection) {
                        int i11 = i10 + 1;
                        if (i10 >= 0) {
                            objArr2[i10 + i2] = obj;
                            i10 = i11;
                        } else {
                            p7.t.F();
                            throw null;
                        }
                    }
                    h0Var.f45b = collection.size() + h0Var.f45b;
                    return true;
                }
                h0Var.o(i2);
                throw null;
            default:
                return ((p2.b) this.B).e(i2, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.A) {
            case 0:
                ((h0) this.B).d();
                return;
            default:
                ((p2.b) this.B).g();
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                if (((h0) this.B).g(obj) >= 0) {
                    return true;
                }
                return false;
            default:
                return ((p2.b) this.B).h(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                h0 h0Var = (h0) this.B;
                for (Object obj : collection) {
                    if (h0Var.g(obj) < 0) {
                        return false;
                    }
                }
                return true;
            default:
                p2.b bVar = (p2.b) this.B;
                for (Object obj2 : collection) {
                    if (!bVar.h(obj2)) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i2) {
        switch (this.A) {
            case 0:
                s0.a(i2, this);
                return ((h0) this.B).f(i2);
            default:
                p2.c.a(i2, this);
                return ((p2.b) this.B).A[i2];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.A) {
            case 0:
                return ((h0) this.B).g(obj);
            default:
                return ((p2.b) this.B).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.A) {
            case 0:
                return ((h0) this.B).h();
            default:
                if (((p2.b) this.B).L == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new e0(this, 0, 0);
            default:
                return new e0(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i2;
        switch (this.A) {
            case 0:
                h0 h0Var = (h0) this.B;
                Object[] objArr = h0Var.f44a;
                int i10 = h0Var.f45b;
                if (obj == null) {
                    i2 = i10 - 1;
                    while (-1 < i2) {
                        if (objArr[i2] != null) {
                            i2--;
                        }
                    }
                    return -1;
                }
                i2 = i10 - 1;
                while (-1 < i2) {
                    if (!obj.equals(objArr[i2])) {
                        i2--;
                    }
                }
                return -1;
                return i2;
            default:
                p2.b bVar = (p2.b) this.B;
                Object[] objArr2 = bVar.A;
                for (int i11 = bVar.L - 1; i11 >= 0; i11--) {
                    if (nc.k.a(obj, objArr2[i11])) {
                        return i11;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.A) {
            case 0:
                return new e0(this, 0, 0);
            default:
                return new e0(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        switch (this.A) {
            case 0:
                s0.a(i2, this);
                return ((h0) this.B).k(i2);
            default:
                p2.c.a(i2, this);
                return ((p2.b) this.B).k(i2);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                h0 h0Var = (h0) this.B;
                int i2 = h0Var.f45b;
                for (Object obj : collection) {
                    h0Var.j(obj);
                }
                if (i2 != h0Var.f45b) {
                    return true;
                }
                return false;
            default:
                p2.b bVar = (p2.b) this.B;
                if (!collection.isEmpty()) {
                    int i10 = bVar.L;
                    for (Object obj2 : collection) {
                        bVar.j(obj2);
                    }
                    if (i10 != bVar.L) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                h0 h0Var = (h0) this.B;
                int i2 = h0Var.f45b;
                Object[] objArr = h0Var.f44a;
                for (int i10 = i2 - 1; -1 < i10; i10--) {
                    if (!collection.contains(objArr[i10])) {
                        h0Var.k(i10);
                    }
                }
                if (i2 != h0Var.f45b) {
                    return true;
                }
                return false;
            default:
                p2.b bVar = (p2.b) this.B;
                int i11 = bVar.L;
                for (int i12 = i11 - 1; -1 < i12; i12--) {
                    if (!collection.contains(bVar.A[i12])) {
                        bVar.k(i12);
                    }
                }
                if (i11 != bVar.L) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        switch (this.A) {
            case 0:
                s0.a(i2, this);
                h0 h0Var = (h0) this.B;
                if (i2 >= 0 && i2 < h0Var.f45b) {
                    Object[] objArr = h0Var.f44a;
                    Object obj2 = objArr[i2];
                    objArr[i2] = obj;
                    return obj2;
                }
                h0Var.n(i2);
                throw null;
            default:
                p2.c.a(i2, this);
                Object[] objArr2 = ((p2.b) this.B).A;
                Object obj3 = objArr2[i2];
                objArr2[i2] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.A) {
            case 0:
                return ((h0) this.B).f45b;
            default:
                return ((p2.b) this.B).L;
        }
    }

    @Override // java.util.List
    public final List subList(int i2, int i10) {
        switch (this.A) {
            case 0:
                s0.b(this, i2, i10);
                return new g0(this, i2, i10, 0);
            default:
                p2.c.b(this, i2, i10);
                return new g0(this, i2, i10, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.A) {
            case 0:
                objArr.getClass();
                return nc.j.b(this, objArr);
            default:
                return nc.j.b(this, objArr);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.A) {
            case 0:
                return nc.j.a(this);
            default:
                return nc.j.a(this);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        switch (this.A) {
            case 0:
                return new e0(this, i2, 0);
            default:
                return new e0(this, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                return ((h0) this.B).j(obj);
            default:
                return ((p2.b) this.B).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                ((h0) this.B).a(obj);
                return true;
            default:
                ((p2.b) this.B).b(obj);
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                h0 h0Var = (h0) this.B;
                int i2 = h0Var.f45b;
                for (Object obj : collection) {
                    h0Var.a(obj);
                }
                return i2 != h0Var.f45b;
            default:
                p2.b bVar = (p2.b) this.B;
                return bVar.e(bVar.L, collection);
        }
    }
}
