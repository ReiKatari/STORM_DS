package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zx2  reason: default package */
/* loaded from: classes.dex */
public final class zx2 implements java.util.List, defpackage.zf3 {
    public final defpackage.ca4 A;
    public final defpackage.t94 B;
    public int L;

    public zx2() {
            r2 = this;
            r2.<init>()
            ca4 r0 = new ca4
            r1 = 16
            r0.<init>(r1)
            r2.A = r0
            t94 r0 = new t94
            r0.<init>(r1)
            r2.B = r0
            r0 = -1
            r2.L = r0
            return
    }

    public final long a() {
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = defpackage.yh2.a(r0, r1, r1)
            int r2 = r7.L
            int r2 = r2 + 1
            ca4 r3 = r7.A
            int r3 = r3.b
            int r3 = r3 + (-1)
            if (r2 > r3) goto L46
        L13:
            t94 r4 = r7.B
            if (r2 < 0) goto L3c
            int r5 = r4.b
            if (r2 >= r5) goto L3f
            long[] r4 = r4.a
            r5 = r4[r2]
            int r4 = defpackage.vy7.U(r5, r0)
            if (r4 >= 0) goto L26
            r0 = r5
        L26:
            float r4 = defpackage.vy7.m0(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L36
            boolean r4 = defpackage.vy7.o0(r0)
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
            defpackage.e41.q(r7)
            r0 = 0
        L46:
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public final boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public final /* bridge */ /* synthetic */ void addFirst(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public final /* bridge */ /* synthetic */ void addLast(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public final void b(int r3, int r4) {
            r2 = this;
            if (r3 < r4) goto L3
            goto L25
        L3:
            ca4 r0 = r2.A
            r0.l(r3, r4)
            t94 r2 = r2.B
            if (r3 < 0) goto L2c
            int r0 = r2.b
            if (r3 > r0) goto L2f
            if (r4 < 0) goto L2f
            if (r4 > r0) goto L2f
            if (r4 < r3) goto L26
            if (r4 == r3) goto L25
            if (r4 >= r0) goto L1f
            long[] r1 = r2.a
            defpackage.fv.s0(r1, r1, r3, r4, r0)
        L1f:
            int r0 = r2.b
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.b = r0
        L25:
            return
        L26:
            java.lang.String r2 = "The end index must be < start index"
            defpackage.i.h(r2)
            return
        L2c:
            r2.getClass()
        L2f:
            java.lang.String r2 = "Index must be between 0 and size"
            defpackage.e41.q(r2)
            return
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r1 = this;
            r0 = -1
            r1.L = r0
            ca4 r0 = r1.A
            r0.d()
            t94 r1 = r1.B
            r0 = 0
            r1.b = r0
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.z64
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            z64 r3 = (defpackage.z64) r3
            int r2 = r2.indexOf(r3)
            r3 = -1
            if (r2 == r3) goto L11
            r2 = 1
            return r2
        L11:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
            z64 r0 = (defpackage.z64) r0
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L1a:
            r1 = 1
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r1) {
            r0 = this;
            ca4 r0 = r0.A
            java.lang.Object r0 = r0.f(r1)
            r0.getClass()
            z64 r0 = (defpackage.z64) r0
            return r0
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof defpackage.z64
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            z64 r5 = (defpackage.z64) r5
            int r0 = r4.size()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L23
            r2 = 0
        L11:
            ca4 r3 = r4.A
            java.lang.Object r3 = r3.f(r2)
            boolean r3 = defpackage.nb3.k(r3, r5)
            if (r3 == 0) goto L1e
            return r2
        L1e:
            if (r2 == r0) goto L23
            int r2 = r2 + 1
            goto L11
        L23:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            ca4 r0 = r0.A
            boolean r0 = r0.h()
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            xx2 r0 = new xx2
            r1 = 0
            r2 = 7
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.z64
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            z64 r4 = (defpackage.z64) r4
            int r0 = r3.size()
            int r0 = r0 + (-1)
        Le:
            if (r1 >= r0) goto L20
            ca4 r2 = r3.A
            java.lang.Object r2 = r2.f(r0)
            boolean r2 = defpackage.nb3.k(r2, r4)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            int r0 = r0 + (-1)
            goto Le
        L20:
            return r1
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r3 = this;
            xx2 r0 = new xx2
            r1 = 0
            r2 = 7
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            xx2 r0 = new xx2
            r1 = 6
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public final /* bridge */ /* synthetic */ java.lang.Object removeFirst() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    public final /* bridge */ /* synthetic */ java.lang.Object removeLast() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r0 = this;
            ca4 r0 = r0.A
            int r0 = r0.b
            return r0
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public final java.util.List subList(int r2, int r3) {
            r1 = this;
            yx2 r0 = new yx2
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
            r0 = this;
            java.lang.Object[] r0 = defpackage.nb3.b0(r0)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Object[] r0 = defpackage.nb3.c0(r0, r1)
            return r0
    }
}
