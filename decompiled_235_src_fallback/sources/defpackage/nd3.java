package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6(with = defpackage.qd3.class)
/* renamed from: nd3  reason: default package */
/* loaded from: classes.dex */
public final class nd3 extends defpackage.de3 implements java.util.List<defpackage.de3>, defpackage.zf3 {
    public static final defpackage.md3 Companion = null;
    public final java.util.List A;

    static {
            md3 r0 = new md3
            r0.<init>()
            defpackage.nd3.Companion = r0
            return
    }

    public nd3(java.util.List r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int r1, defpackage.de3 r2) {
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
    public final boolean addAll(int r1, java.util.Collection<? extends defpackage.de3> r2) {
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

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.de3
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            de3 r2 = (defpackage.de3) r2
            java.util.List r1 = r1.A
            boolean r1 = r1.contains(r2)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r1) {
            r0 = this;
            r1.getClass()
            java.util.List r0 = r0.A
            boolean r0 = r0.containsAll(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            java.util.List r0 = r0.A
            boolean r0 = defpackage.nb3.k(r0, r1)
            return r0
    }

    @Override // java.util.List
    public final defpackage.de3 get(int r1) {
            r0 = this;
            java.util.List r0 = r0.A
            java.lang.Object r0 = r0.get(r1)
            de3 r0 = (defpackage.de3) r0
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
            r0 = this;
            java.util.List r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.de3
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            de3 r2 = (defpackage.de3) r2
            java.util.List r1 = r1.A
            int r1 = r1.indexOf(r2)
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            java.util.List r0 = r0.A
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r0 = this;
            java.util.List r0 = r0.A
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.de3
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            de3 r2 = (defpackage.de3) r2
            java.util.List r1 = r1.A
            int r1 = r1.lastIndexOf(r2)
            return r1
    }

    @Override // java.util.List
    public final java.util.ListIterator<defpackage.de3> listIterator() {
            r0 = this;
            java.util.List r0 = r0.A
            java.util.ListIterator r0 = r0.listIterator()
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator<defpackage.de3> listIterator(int r1) {
            r0 = this;
            java.util.List r0 = r0.A
            java.util.ListIterator r0 = r0.listIterator(r1)
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ defpackage.de3 remove(int r1) {
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

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator<defpackage.de3> r1) {
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
    public final /* bridge */ /* synthetic */ defpackage.de3 set(int r1, defpackage.de3 r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r0 = this;
            java.util.List r0 = r0.A
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator<? super defpackage.de3> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public final java.util.List<defpackage.de3> subList(int r1, int r2) {
            r0 = this;
            java.util.List r0 = r0.A
            java.util.List r0 = r0.subList(r1, r2)
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
            r1.getClass()
            java.lang.Object[] r0 = defpackage.nb3.c0(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            r4 = 0
            r5 = 56
            java.util.List r0 = r6.A
            java.lang.String r1 = ","
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            java.lang.String r6 = defpackage.gt0.P0(r0, r1, r2, r3, r4, r5)
            return r6
    }
}
