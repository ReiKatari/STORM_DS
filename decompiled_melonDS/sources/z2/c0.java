package z2;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import n2.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 implements List, oc.b {
    public final p A;
    public final int B;
    public int L;
    public int R;

    public c0(p pVar, int i2, int i10) {
        this.A = pVar;
        this.B = i2;
        this.L = q.g(pVar);
        this.R = i10 - i2;
    }

    public final void a() {
        if (q.g(this.A) == this.L) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i2 = this.B + this.R;
        p pVar = this.A;
        pVar.add(i2, obj);
        this.R++;
        this.L = q.g(pVar);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        a();
        int i10 = i2 + this.B;
        p pVar = this.A;
        boolean addAll = pVar.addAll(i10, collection);
        if (addAll) {
            this.R = collection.size() + this.R;
            this.L = q.g(pVar);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.R > 0) {
            a();
            int i2 = this.R;
            int i10 = this.B;
            p pVar = this.A;
            pVar.d(i10, i2 + i10);
            this.R = 0;
            this.L = q.g(pVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection<Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        a();
        q.a(i2, this.R);
        return this.A.get(this.B + i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i2 = this.R;
        int i10 = this.B;
        Iterator it = p7.j.L(i10, i2 + i10).iterator();
        while (((sc.c) it).L) {
            int nextInt = ((zb.u) it).nextInt();
            if (nc.k.a(obj, this.A.get(nextInt))) {
                return nextInt - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.R == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i2 = this.R;
        int i10 = this.B;
        for (int i11 = (i2 + i10) - 1; i11 >= i10; i11--) {
            if (nc.k.a(obj, this.A.get(i11))) {
                return i11 - i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nc.r] */
    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        a();
        ?? obj = new Object();
        obj.A = i2 - 1;
        return new b0((nc.r) obj, this);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        a();
        int i10 = this.B + i2;
        p pVar = this.A;
        Object remove = pVar.remove(i10);
        this.R--;
        this.L = q.g(pVar);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        while (true) {
            boolean z10 = false;
            for (Object obj : collection) {
                if (remove(obj) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i2;
        r2.c cVar;
        f j2;
        boolean b10;
        a();
        p pVar = this.A;
        int i10 = this.B;
        int i11 = this.R + i10;
        int size = pVar.size();
        do {
            synchronized (q.f14929a) {
                v vVar = pVar.A;
                vVar.getClass();
                v vVar2 = (v) l.h(vVar);
                i2 = vVar2.f14956d;
                cVar = vVar2.f14955c;
            }
            cVar.getClass();
            r2.f e6 = cVar.e();
            e6.subList(i10, i11).retainAll(collection);
            r2.c c4 = e6.c();
            if (nc.k.a(c4, cVar)) {
                break;
            }
            v vVar3 = pVar.A;
            vVar3.getClass();
            synchronized (l.f14919c) {
                j2 = l.j();
                b10 = q.b((v) l.w(vVar3, pVar, j2), i2, c4, true);
            }
            l.n(j2, pVar);
        } while (!b10);
        int size2 = size - pVar.size();
        if (size2 > 0) {
            this.L = q.g(this.A);
            this.R -= size2;
        }
        if (size2 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        q.a(i2, this.R);
        a();
        int i10 = i2 + this.B;
        p pVar = this.A;
        Object obj2 = pVar.set(i10, obj);
        this.L = q.g(pVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.R;
    }

    @Override // java.util.List
    public final List subList(int i2, int i10) {
        if (i2 < 0 || i2 > i10 || i10 > this.R) {
            l1.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i11 = this.B;
        return new c0(this.A, i2 + i11, i10 + i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return nc.j.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return nc.j.b(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        a();
        int i10 = this.B + i2;
        p pVar = this.A;
        pVar.add(i10, obj);
        this.R++;
        this.L = q.g(pVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.R, collection);
    }
}
