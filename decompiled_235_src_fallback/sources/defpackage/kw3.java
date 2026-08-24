package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kw3  reason: default package */
/* loaded from: classes.dex */
public final class kw3 extends defpackage.d1 implements java.util.RandomAccess, java.io.Serializable {
    public static final defpackage.kw3 R = null;
    public java.lang.Object[] A;
    public int B;
    public boolean L;

    static {
            kw3 r0 = new kw3
            r1 = 0
            r0.<init>(r1)
            r1 = 1
            r0.L = r1
            defpackage.kw3.R = r0
            return
    }

    public kw3(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto La
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.A = r1
            return
        La:
            java.lang.String r0 = "capacity must be non-negative."
            defpackage.i.h(r0)
            r0 = 0
            throw r0
    }

    public static final /* synthetic */ int c(defpackage.kw3 r0) {
            int r0 = r0.modCount
            return r0
    }

    @Override // defpackage.d1
    public final int a() {
            r0 = this;
            int r0 = r0.B
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r3, java.lang.Object r4) {
            r2 = this;
            r2.g()
            int r0 = r2.B
            if (r3 < 0) goto L17
            if (r3 > r0) goto L17
            int r0 = r2.modCount
            r1 = 1
            int r0 = r0 + r1
            r2.modCount = r0
            r2.h(r3, r1)
            java.lang.Object[] r2 = r2.A
            r2[r3] = r4
            return
        L17:
            java.lang.String r2 = "index: "
            java.lang.String r4 = ", size: "
            java.lang.String r2 = defpackage.lb1.j(r2, r3, r0, r4)
            defpackage.e41.q(r2)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r4) {
            r3 = this;
            r3.g()
            int r0 = r3.B
            int r1 = r3.modCount
            r2 = 1
            int r1 = r1 + r2
            r3.modCount = r1
            r3.h(r0, r2)
            java.lang.Object[] r3 = r3.A
            r3[r0] = r4
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r3, java.util.Collection r4) {
            r2 = this;
            r4.getClass()
            r2.g()
            int r0 = r2.B
            r1 = 0
            if (r3 < 0) goto L19
            if (r3 > r0) goto L19
            int r0 = r4.size()
            r2.d(r3, r4, r0)
            if (r0 <= 0) goto L18
            r2 = 1
            return r2
        L18:
            return r1
        L19:
            java.lang.String r2 = "index: "
            java.lang.String r4 = ", size: "
            java.lang.String r2 = defpackage.lb1.j(r2, r3, r0, r4)
            defpackage.e41.q(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            r2.g()
            int r0 = r3.size()
            int r1 = r2.B
            r2.d(r1, r3, r0)
            if (r0 <= 0) goto L13
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // defpackage.d1
    public final java.lang.Object b(int r3) {
            r2 = this;
            r2.g()
            int r0 = r2.B
            if (r3 < 0) goto Le
            if (r3 >= r0) goto Le
            java.lang.Object r2 = r2.i(r3)
            return r2
        Le:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = defpackage.lb1.j(r2, r3, r0, r1)
            defpackage.e41.q(r2)
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r2 = this;
            r2.g()
            r0 = 0
            int r1 = r2.B
            r2.j(r0, r1)
            return
    }

    public final void d(int r5, java.util.Collection r6, int r7) {
            r4 = this;
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            r4.h(r5, r7)
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
        Le:
            if (r0 >= r7) goto L1d
            java.lang.Object[] r1 = r4.A
            int r2 = r5 + r0
            java.lang.Object r3 = r6.next()
            r1[r2] = r3
            int r0 = r0 + 1
            goto Le
        L1d:
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            if (r6 == r5) goto L28
            boolean r0 = r6 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L27
            java.util.List r6 = (java.util.List) r6
            java.lang.Object[] r0 = r5.A
            int r5 = r5.B
            int r2 = r6.size()
            if (r5 == r2) goto L14
            goto L27
        L14:
            r2 = r1
        L15:
            if (r2 >= r5) goto L28
            r3 = r0[r2]
            java.lang.Object r4 = r6.get(r2)
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L24
            goto L27
        L24:
            int r2 = r2 + 1
            goto L15
        L27:
            return r1
        L28:
            r5 = 1
            return r5
    }

    public final void f(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.modCount
            r1 = 1
            int r0 = r0 + r1
            r2.modCount = r0
            r2.h(r3, r1)
            java.lang.Object[] r2 = r2.A
            r2[r3] = r4
            return
    }

    public final void g() {
            r0 = this;
            boolean r0 = r0.L
            if (r0 != 0) goto L5
            return
        L5:
            defpackage.e41.t()
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.B
            if (r3 < 0) goto Lb
            if (r3 >= r0) goto Lb
            java.lang.Object[] r2 = r2.A
            r2 = r2[r3]
            return r2
        Lb:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = defpackage.lb1.j(r2, r3, r0, r1)
            defpackage.e41.q(r2)
            r2 = 0
            return r2
    }

    public final void h(int r6, int r7) {
            r5 = this;
            int r0 = r5.B
            int r0 = r0 + r7
            if (r0 < 0) goto L36
            java.lang.Object[] r1 = r5.A
            int r2 = r1.length
            if (r0 <= r2) goto L27
            int r2 = r1.length
            int r3 = r2 >> 1
            int r2 = r2 + r3
            int r3 = r2 - r0
            if (r3 >= 0) goto L13
            r2 = r0
        L13:
            r3 = 2147483639(0x7ffffff7, float:NaN)
            int r4 = r2 - r3
            if (r4 <= 0) goto L21
            if (r0 <= r3) goto L20
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L21
        L20:
            r2 = r3
        L21:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r2)
            r5.A = r0
        L27:
            java.lang.Object[] r0 = r5.A
            int r1 = r5.B
            int r2 = r6 + r7
            defpackage.fv.t0(r0, r0, r2, r6, r1)
            int r6 = r5.B
            int r6 = r6 + r7
            r5.B = r6
            return
        L36:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r5 = this;
            java.lang.Object[] r0 = r5.A
            int r5 = r5.B
            r1 = 1
            r2 = 0
            r3 = r2
        L7:
            if (r3 >= r5) goto L19
            r4 = r0[r3]
            int r1 = r1 * 31
            if (r4 == 0) goto L14
            int r4 = r4.hashCode()
            goto L15
        L14:
            r4 = r2
        L15:
            int r1 = r1 + r4
            int r3 = r3 + 1
            goto L7
        L19:
            return r1
    }

    public final java.lang.Object i(int r5) {
            r4 = this;
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            java.lang.Object[] r0 = r4.A
            r1 = r0[r5]
            int r2 = r5 + 1
            int r3 = r4.B
            defpackage.fv.t0(r0, r0, r5, r2, r3)
            java.lang.Object[] r5 = r4.A
            int r0 = r4.B
            int r0 = r0 + (-1)
            r5.getClass()
            r2 = 0
            r5[r0] = r2
            int r5 = r4.B
            int r5 = r5 + (-1)
            r4.B = r5
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.B
            if (r0 >= r1) goto L13
            java.lang.Object[] r1 = r2.A
            r1 = r1[r0]
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 == 0) goto L10
            return r0
        L10:
            int r0 = r0 + 1
            goto L1
        L13:
            r2 = -1
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.B
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r1 = r1.listIterator(r0)
            return r1
    }

    public final void j(int r4, int r5) {
            r3 = this;
            if (r5 <= 0) goto L8
            int r0 = r3.modCount
            int r0 = r0 + 1
            r3.modCount = r0
        L8:
            java.lang.Object[] r0 = r3.A
            int r1 = r4 + r5
            int r2 = r3.B
            defpackage.fv.t0(r0, r0, r4, r1, r2)
            java.lang.Object[] r4 = r3.A
            int r0 = r3.B
            int r1 = r0 - r5
            defpackage.qo2.L(r4, r1, r0)
            int r4 = r3.B
            int r4 = r4 - r5
            r3.B = r4
            return
    }

    public final int l(int r6, int r7, java.util.Collection r8, boolean r9) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object[] r2 = r5.A
            if (r0 >= r7) goto L20
            int r3 = r6 + r0
            r2 = r2[r3]
            boolean r2 = r8.contains(r2)
            if (r2 != r9) goto L1d
            java.lang.Object[] r2 = r5.A
            int r4 = r1 + 1
            int r1 = r1 + r6
            int r0 = r0 + 1
            r3 = r2[r3]
            r2[r1] = r3
            r1 = r4
            goto L2
        L1d:
            int r0 = r0 + 1
            goto L2
        L20:
            int r8 = r7 - r1
            int r7 = r7 + r6
            int r9 = r5.B
            int r6 = r6 + r1
            defpackage.fv.t0(r2, r2, r6, r7, r9)
            java.lang.Object[] r6 = r5.A
            int r7 = r5.B
            int r9 = r7 - r8
            defpackage.qo2.L(r6, r9, r7)
            if (r8 <= 0) goto L3a
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
        L3a:
            int r6 = r5.B
            int r6 = r6 - r8
            r5.B = r6
            return r8
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.B
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L14
            java.lang.Object[] r1 = r2.A
            r1 = r1[r0]
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 == 0) goto L11
            return r0
        L11:
            int r0 = r0 + (-1)
            goto L4
        L14:
            r2 = -1
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r1 = r1.listIterator(r0)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            int r0 = r2.B
            if (r3 < 0) goto Lc
            if (r3 > r0) goto Lc
            xx2 r0 = new xx2
            r0.<init>(r2, r3)
            return r0
        Lc:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = defpackage.lb1.j(r2, r3, r0, r1)
            defpackage.e41.q(r2)
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            r0.g()
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lc
            r0.b(r1)
        Lc:
            if (r1 < 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            r2.g()
            int r0 = r2.B
            r1 = 0
            int r2 = r2.l(r1, r0, r3, r1)
            if (r2 <= 0) goto L11
            r2 = 1
            return r2
        L11:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            r3.g()
            int r0 = r3.B
            r1 = 0
            r2 = 1
            int r3 = r3.l(r1, r0, r4, r2)
            if (r3 <= 0) goto L11
            return r2
        L11:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            r1.g()
            int r0 = r1.B
            if (r2 < 0) goto L10
            if (r2 >= r0) goto L10
            java.lang.Object[] r1 = r1.A
            r0 = r1[r2]
            r1[r2] = r3
            return r0
        L10:
            java.lang.String r1 = "index: "
            java.lang.String r3 = ", size: "
            java.lang.String r1 = defpackage.lb1.j(r1, r2, r0, r3)
            defpackage.e41.q(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int r8, int r9) {
            r7 = this;
            int r0 = r7.B
            defpackage.hf.E(r8, r9, r0)
            jw3 r1 = new jw3
            java.lang.Object[] r2 = r7.A
            int r4 = r9 - r8
            r5 = 0
            r6 = r7
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
            r2 = this;
            java.lang.Object[] r0 = r2.A
            r1 = 0
            int r2 = r2.B
            java.lang.Object[] r2 = defpackage.fv.y0(r0, r1, r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r5) {
            r4 = this;
            r5.getClass()
            int r0 = r5.length
            int r1 = r4.B
            java.lang.Object[] r2 = r4.A
            r3 = 0
            if (r0 >= r1) goto L17
            java.lang.Class r4 = r5.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r2, r3, r1, r4)
            r4.getClass()
            return r4
        L17:
            defpackage.fv.t0(r2, r5, r3, r3, r1)
            int r4 = r4.B
            int r0 = r5.length
            if (r4 >= r0) goto L22
            r0 = 0
            r5[r4] = r0
        L22:
            return r5
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object[] r0 = r3.A
            r1 = 0
            int r2 = r3.B
            java.lang.String r3 = defpackage.qo2.l(r0, r1, r2, r3)
            return r3
    }
}
