package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yx2  reason: default package */
/* loaded from: classes.dex */
public final class yx2 implements java.util.List, defpackage.zf3 {
    public final int A;
    public final int B;
    public final /* synthetic */ defpackage.zx2 L;

    public yx2(defpackage.zx2 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            r0.A = r2
            r0.B = r3
            return
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

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
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
    public final java.lang.Object get(int r2) {
            r1 = this;
            zx2 r0 = r1.L
            ca4 r0 = r0.A
            int r1 = r1.A
            int r2 = r2 + r1
            java.lang.Object r1 = r0.f(r2)
            r1.getClass()
            z64 r1 = (defpackage.z64) r1
            return r1
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof defpackage.z64
            if (r0 != 0) goto L5
            goto L23
        L5:
            z64 r5 = (defpackage.z64) r5
            int r0 = r4.A
            int r1 = r4.B
            if (r0 > r1) goto L23
            r2 = r0
        Le:
            zx2 r3 = r4.L
            ca4 r3 = r3.A
            java.lang.Object r3 = r3.f(r2)
            boolean r3 = defpackage.nb3.k(r3, r5)
            if (r3 == 0) goto L1e
            int r2 = r2 - r0
            return r2
        L1e:
            if (r2 == r1) goto L23
            int r2 = r2 + 1
            goto Le
        L23:
            r4 = -1
            return r4
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            xx2 r0 = new xx2
            int r1 = r3.A
            int r2 = r3.B
            zx2 r3 = r3.L
            r0.<init>(r3, r1, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.z64
            if (r0 != 0) goto L5
            goto L22
        L5:
            z64 r4 = (defpackage.z64) r4
            int r0 = r3.B
            int r1 = r3.A
            if (r1 > r0) goto L22
        Ld:
            zx2 r2 = r3.L
            ca4 r2 = r2.A
            java.lang.Object r2 = r2.f(r0)
            boolean r2 = defpackage.nb3.k(r2, r4)
            if (r2 == 0) goto L1d
            int r0 = r0 - r1
            return r0
        L1d:
            if (r0 == r1) goto L22
            int r0 = r0 + (-1)
            goto Ld
        L22:
            r3 = -1
            return r3
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r3 = this;
            xx2 r0 = new xx2
            int r1 = r3.A
            int r2 = r3.B
            zx2 r3 = r3.L
            r0.<init>(r3, r1, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r4) {
            r3 = this;
            xx2 r0 = new xx2
            int r1 = r3.A
            int r4 = r4 + r1
            int r2 = r3.B
            zx2 r3 = r3.L
            r0.<init>(r3, r4, r1, r2)
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
            r1 = this;
            int r0 = r1.B
            int r1 = r1.A
            int r0 = r0 - r1
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
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            yx2 r0 = new yx2
            int r1 = r2.A
            int r3 = r3 + r1
            int r1 = r1 + r4
            zx2 r2 = r2.L
            r0.<init>(r2, r3, r1)
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
