package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yr2  reason: default package */
/* loaded from: classes.dex */
public final class yr2 implements List, f93 {
    public final w14 A = new w14(16);
    public final n14 B = new n14(16);
    public int L = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = defpackage.nk2.e(r0, r1, r1)
            int r2 = r7.L
            int r2 = r2 + 1
            w14 r3 = r7.A
            int r3 = r3.b
            int r3 = r3 + (-1)
            if (r2 > r3) goto L46
        L13:
            n14 r4 = r7.B
            if (r2 < 0) goto L3c
            int r5 = r4.b
            if (r2 >= r5) goto L3f
            long[] r4 = r4.a
            r5 = r4[r2]
            int r4 = defpackage.f34.y(r5, r0)
            if (r4 >= 0) goto L26
            r0 = r5
        L26:
            float r4 = defpackage.f34.G(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L36
            boolean r4 = defpackage.f34.J(r0)
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
            java.lang.String r7 = "Index must be between 0 and size"
            defpackage.f81.q(r7)
            r0 = 0
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr2.b():long");
    }

    public final void c(int i, int i2) {
        if (i < i2) {
            this.A.l(i, i2);
            n14 n14Var = this.B;
            if (i >= 0) {
                int i3 = n14Var.b;
                if (i <= i3 && i2 >= 0 && i2 <= i3) {
                    if (i2 >= i) {
                        if (i2 != i) {
                            if (i2 < i3) {
                                long[] jArr = n14Var.a;
                                nu.e0(jArr, jArr, i, i2, i3);
                            }
                            n14Var.b -= i2 - i;
                            return;
                        }
                        return;
                    }
                    i.i("The end index must be < start index");
                    return;
                }
            } else {
                n14Var.getClass();
            }
            f81.q("Index must be between 0 and size");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.L = -1;
        this.A.d();
        this.B.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof yy3) || indexOf((yy3) obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((yy3) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object f = this.A.f(i);
        f.getClass();
        return (yy3) f;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof yy3)) {
            return -1;
        }
        yy3 yy3Var = (yy3) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!b53.x(this.A.f(i), yy3Var)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.A.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new wr2(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof yy3)) {
            return -1;
        }
        yy3 yy3Var = (yy3) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (b53.x(this.A.f(size), yy3Var)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new wr2(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
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
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.A.b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new xr2(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return b53.h0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return b53.i0(this, objArr);
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
    public final ListIterator listIterator(int i) {
        return new wr2(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
