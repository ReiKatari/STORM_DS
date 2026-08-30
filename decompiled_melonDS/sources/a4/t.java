package a4;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t implements List, oc.a {
    public final a1.h0 A = new a1.h0(16);
    public final a1.z B = new a1.z(16);
    public int L = -1;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = a4.l.a(r0, r1, r1)
            int r2 = r7.L
            int r2 = r2 + 1
            a1.h0 r3 = r7.A
            int r3 = r3.f45b
            int r3 = r3 + (-1)
            if (r2 > r3) goto L46
        L13:
            a1.z r4 = r7.B
            if (r2 < 0) goto L3c
            int r5 = r4.f120b
            if (r2 >= r5) goto L3f
            long[] r4 = r4.f119a
            r5 = r4[r2]
            int r4 = a4.l.g(r5, r0)
            if (r4 >= 0) goto L26
            r0 = r5
        L26:
            float r4 = a4.l.i(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L36
            boolean r4 = a4.l.n(r0)
            if (r4 == 0) goto L36
            goto L3b
        L36:
            if (r2 == r3) goto L3b
            int r2 = r2 + 1
            goto L13
        L3b:
            return r0
        L3c:
            r4.getClass()
        L3f:
            java.lang.String r0 = "Index must be between 0 and size"
            wa.b.f(r0)
            r0 = 0
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.t.a():long");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(int i2, int i10) {
        if (i2 < i10) {
            this.A.l(i2, i10);
            a1.z zVar = this.B;
            if (i2 >= 0) {
                int i11 = zVar.f120b;
                if (i2 <= i11 && i10 >= 0 && i10 <= i11) {
                    if (i10 >= i2) {
                        if (i10 != i2) {
                            if (i10 < i11) {
                                long[] jArr = zVar.f119a;
                                zb.k.h(jArr, jArr, i2, i10, i11);
                            }
                            zVar.f120b -= i10 - i2;
                            return;
                        }
                        return;
                    }
                    a0.j.h("The end index must be < start index");
                    return;
                }
            } else {
                zVar.getClass();
            }
            wa.b.f("Index must be between 0 and size");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.L = -1;
        this.A.d();
        this.B.f120b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof b3.o) || indexOf((b3.o) obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((b3.o) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Object f8 = this.A.f(i2);
        f8.getClass();
        return (b3.o) f8;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof b3.o)) {
            return -1;
        }
        b3.o oVar = (b3.o) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (!nc.k.a(this.A.f(i2), oVar)) {
                if (i2 != size) {
                    i2++;
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.A.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new r(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof b3.o)) {
            return -1;
        }
        b3.o oVar = (b3.o) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (nc.k.a(this.A.f(size), oVar)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new r(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.A.f45b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i2, int i10) {
        return new s(this, i2, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return nc.j.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return nc.j.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return new r(this, i2, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
