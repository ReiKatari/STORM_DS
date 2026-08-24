package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jw3  reason: default package */
/* loaded from: classes.dex */
public final class jw3 extends defpackage.d1 implements java.util.RandomAccess, java.io.Serializable {
    public java.lang.Object[] A;
    public final int B;
    public int L;
    public final defpackage.jw3 R;
    public final defpackage.kw3 X;

    public jw3(java.lang.Object[] r1, int r2, int r3, defpackage.jw3 r4, defpackage.kw3 r5) {
            r0 = this;
            r1.getClass()
            r5.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            int r1 = defpackage.kw3.c(r5)
            r0.modCount = r1
            return
    }

    public static final /* synthetic */ int c(defpackage.jw3 r0) {
            int r0 = r0.modCount
            return r0
    }

    @Override // defpackage.d1
    public final int a() {
            r0 = this;
            r0.g()
            int r0 = r0.L
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r2, java.lang.Object r3) {
            r1 = this;
            r1.h()
            r1.g()
            int r0 = r1.L
            if (r2 < 0) goto L13
            if (r2 > r0) goto L13
            int r0 = r1.B
            int r0 = r0 + r2
            r1.f(r0, r3)
            return
        L13:
            java.lang.String r1 = "index: "
            java.lang.String r3 = ", size: "
            java.lang.String r1 = defpackage.lb1.j(r1, r2, r0, r3)
            defpackage.e41.q(r1)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r3) {
            r2 = this;
            r2.h()
            r2.g()
            int r0 = r2.B
            int r1 = r2.L
            int r0 = r0 + r1
            r2.f(r0, r3)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r4, java.util.Collection r5) {
            r3 = this;
            r5.getClass()
            r3.h()
            r3.g()
            int r0 = r3.L
            r1 = 0
            if (r4 < 0) goto L1f
            if (r4 > r0) goto L1f
            int r0 = r5.size()
            int r2 = r3.B
            int r2 = r2 + r4
            r3.d(r2, r5, r0)
            if (r0 <= 0) goto L1e
            r3 = 1
            return r3
        L1e:
            return r1
        L1f:
            java.lang.String r3 = "index: "
            java.lang.String r5 = ", size: "
            java.lang.String r3 = defpackage.lb1.j(r3, r4, r0, r5)
            defpackage.e41.q(r3)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            r3.h()
            r3.g()
            int r0 = r4.size()
            int r1 = r3.B
            int r2 = r3.L
            int r1 = r1 + r2
            r3.d(r1, r4, r0)
            if (r0 <= 0) goto L19
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    @Override // defpackage.d1
    public final java.lang.Object b(int r3) {
            r2 = this;
            r2.h()
            r2.g()
            int r0 = r2.L
            if (r3 < 0) goto L14
            if (r3 >= r0) goto L14
            int r0 = r2.B
            int r0 = r0 + r3
            java.lang.Object r2 = r2.i(r0)
            return r2
        L14:
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
            r2.h()
            r2.g()
            int r0 = r2.B
            int r1 = r2.L
            r2.j(r0, r1)
            return
    }

    public final void d(int r3, java.util.Collection r4, int r5) {
            r2 = this;
            int r0 = r2.modCount
            int r0 = r0 + 1
            r2.modCount = r0
            kw3 r0 = r2.X
            jw3 r1 = r2.R
            if (r1 == 0) goto L10
            r1.d(r3, r4, r5)
            goto L15
        L10:
            kw3 r1 = defpackage.kw3.R
            r0.d(r3, r4, r5)
        L15:
            java.lang.Object[] r3 = r0.A
            r2.A = r3
            int r3 = r2.L
            int r3 = r3 + r5
            r2.L = r3
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r6.g()
            if (r7 == r6) goto L2e
            boolean r0 = r7 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L2d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object[] r0 = r6.A
            int r2 = r6.L
            int r3 = r7.size()
            if (r2 == r3) goto L17
            goto L2d
        L17:
            r3 = r1
        L18:
            if (r3 >= r2) goto L2e
            int r4 = r6.B
            int r4 = r4 + r3
            r4 = r0[r4]
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L2a
            goto L2d
        L2a:
            int r3 = r3 + 1
            goto L18
        L2d:
            return r1
        L2e:
            r6 = 1
            return r6
    }

    public final void f(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.modCount
            int r0 = r0 + 1
            r2.modCount = r0
            kw3 r0 = r2.X
            jw3 r1 = r2.R
            if (r1 == 0) goto L10
            r1.f(r3, r4)
            goto L15
        L10:
            kw3 r1 = defpackage.kw3.R
            r0.f(r3, r4)
        L15:
            java.lang.Object[] r3 = r0.A
            r2.A = r3
            int r3 = r2.L
            int r3 = r3 + 1
            r2.L = r3
            return
    }

    public final void g() {
            r1 = this;
            kw3 r0 = r1.X
            int r0 = defpackage.kw3.c(r0)
            int r1 = r1.modCount
            if (r0 != r1) goto Lb
            return
        Lb:
            defpackage.i.l()
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            r2.g()
            int r0 = r2.L
            if (r3 < 0) goto L11
            if (r3 >= r0) goto L11
            java.lang.Object[] r0 = r2.A
            int r2 = r2.B
            int r2 = r2 + r3
            r2 = r0[r2]
            return r2
        L11:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = defpackage.lb1.j(r2, r3, r0, r1)
            defpackage.e41.q(r2)
            r2 = 0
            return r2
    }

    public final void h() {
            r0 = this;
            kw3 r0 = r0.X
            boolean r0 = r0.L
            if (r0 != 0) goto L7
            return
        L7:
            defpackage.e41.t()
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r6 = this;
            r6.g()
            java.lang.Object[] r0 = r6.A
            int r1 = r6.L
            r2 = 1
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r1) goto L1f
            int r5 = r6.B
            int r5 = r5 + r4
            r5 = r0[r5]
            int r2 = r2 * 31
            if (r5 == 0) goto L1a
            int r5 = r5.hashCode()
            goto L1b
        L1a:
            r5 = r3
        L1b:
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto La
        L1f:
            return r2
    }

    public final java.lang.Object i(int r2) {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            jw3 r0 = r1.R
            if (r0 == 0) goto Lf
            java.lang.Object r2 = r0.i(r2)
            goto L17
        Lf:
            kw3 r0 = defpackage.kw3.R
            kw3 r0 = r1.X
            java.lang.Object r2 = r0.i(r2)
        L17:
            int r0 = r1.L
            int r0 = r0 + (-1)
            r1.L = r0
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r4) {
            r3 = this;
            r3.g()
            r0 = 0
        L4:
            int r1 = r3.L
            if (r0 >= r1) goto L19
            java.lang.Object[] r1 = r3.A
            int r2 = r3.B
            int r2 = r2 + r0
            r1 = r1[r2]
            boolean r1 = defpackage.nb3.k(r1, r4)
            if (r1 == 0) goto L16
            return r0
        L16:
            int r0 = r0 + 1
            goto L4
        L19:
            r3 = -1
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r0 = this;
            r0.g()
            int r0 = r0.L
            if (r0 != 0) goto L9
            r0 = 1
            return r0
        L9:
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

    public final void j(int r2, int r3) {
            r1 = this;
            if (r3 <= 0) goto L8
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
        L8:
            jw3 r0 = r1.R
            if (r0 == 0) goto L10
            r0.j(r2, r3)
            goto L17
        L10:
            kw3 r0 = defpackage.kw3.R
            kw3 r0 = r1.X
            r0.j(r2, r3)
        L17:
            int r2 = r1.L
            int r2 = r2 - r3
            r1.L = r2
            return
    }

    public final int l(int r2, int r3, java.util.Collection r4, boolean r5) {
            r1 = this;
            jw3 r0 = r1.R
            if (r0 == 0) goto L9
            int r2 = r0.l(r2, r3, r4, r5)
            goto L11
        L9:
            kw3 r0 = defpackage.kw3.R
            kw3 r0 = r1.X
            int r2 = r0.l(r2, r3, r4, r5)
        L11:
            if (r2 <= 0) goto L19
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
        L19:
            int r3 = r1.L
            int r3 = r3 - r2
            r1.L = r3
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            r3.g()
            int r0 = r3.L
            int r0 = r0 + (-1)
        L7:
            if (r0 < 0) goto L1a
            java.lang.Object[] r1 = r3.A
            int r2 = r3.B
            int r2 = r2 + r0
            r1 = r1[r2]
            boolean r1 = defpackage.nb3.k(r1, r4)
            if (r1 == 0) goto L17
            return r0
        L17:
            int r0 = r0 + (-1)
            goto L7
        L1a:
            r3 = -1
            return r3
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
            r2.g()
            int r0 = r2.L
            if (r3 < 0) goto Lf
            if (r3 > r0) goto Lf
            xx2 r0 = new xx2
            r0.<init>(r2, r3)
            return r0
        Lf:
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
            r0.h()
            r0.g()
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lf
            r0.b(r1)
        Lf:
            if (r1 < 0) goto L13
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            r3.h()
            r3.g()
            int r0 = r3.L
            int r1 = r3.B
            r2 = 0
            int r3 = r3.l(r1, r0, r4, r2)
            if (r3 <= 0) goto L16
            r3 = 1
            return r3
        L16:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            r3.h()
            r3.g()
            int r0 = r3.L
            int r1 = r3.B
            r2 = 1
            int r3 = r3.l(r1, r0, r4, r2)
            if (r3 <= 0) goto L15
            return r2
        L15:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            r2.h()
            r2.g()
            int r0 = r2.L
            if (r3 < 0) goto L18
            if (r3 >= r0) goto L18
            java.lang.Object[] r0 = r2.A
            int r2 = r2.B
            int r1 = r2 + r3
            r1 = r0[r1]
            int r2 = r2 + r3
            r0[r2] = r4
            return r1
        L18:
            java.lang.String r2 = "index: "
            java.lang.String r4 = ", size: "
            java.lang.String r2 = defpackage.lb1.j(r2, r3, r0, r4)
            defpackage.e41.q(r2)
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int r8, int r9) {
            r7 = this;
            int r0 = r7.L
            defpackage.hf.E(r8, r9, r0)
            jw3 r1 = new jw3
            java.lang.Object[] r2 = r7.A
            int r0 = r7.B
            int r3 = r0 + r8
            int r4 = r9 - r8
            kw3 r6 = r7.X
            r5 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
            r2 = this;
            r2.g()
            java.lang.Object[] r0 = r2.A
            int r1 = r2.L
            int r2 = r2.B
            int r1 = r1 + r2
            java.lang.Object[] r2 = defpackage.fv.y0(r0, r2, r1)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r5) {
            r4 = this;
            r5.getClass()
            r4.g()
            int r0 = r5.length
            int r1 = r4.L
            java.lang.Object[] r2 = r4.A
            int r3 = r4.B
            if (r0 >= r1) goto L1c
            int r1 = r1 + r3
            java.lang.Class r4 = r5.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r2, r3, r1, r4)
            r4.getClass()
            return r4
        L1c:
            r0 = 0
            int r1 = r1 + r3
            defpackage.fv.t0(r2, r5, r0, r3, r1)
            int r4 = r4.L
            int r0 = r5.length
            if (r4 >= r0) goto L29
            r0 = 0
            r5[r4] = r0
        L29:
            return r5
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
            r3 = this;
            r3.g()
            java.lang.Object[] r0 = r3.A
            int r1 = r3.B
            int r2 = r3.L
            java.lang.String r3 = defpackage.qo2.l(r0, r1, r2, r3)
            return r3
    }
}
