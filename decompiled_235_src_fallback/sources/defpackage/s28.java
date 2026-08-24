package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s28  reason: default package */
/* loaded from: classes.dex */
public abstract class s28 extends defpackage.p28 implements java.util.List, java.util.RandomAccess {
    public static final defpackage.q28 B = null;

    static {
            q28 r0 = new q28
            t28 r1 = defpackage.t28.X
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.s28.B = r0
            return
    }

    public static defpackage.t28 h(int r1, java.lang.Object[] r2) {
            if (r1 != 0) goto L5
            t28 r1 = defpackage.t28.X
            return r1
        L5:
            t28 r0 = new t28
            r0.<init>(r2, r1)
            return r0
    }

    public static defpackage.s28 i(java.lang.Iterable r4) {
            r4.getClass()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.Collection r4 = (java.util.Collection) r4
            s28 r4 = j(r4)
            return r4
        Le:
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L1b
            t28 r4 = defpackage.t28.X
            return r4
        L1b:
            java.lang.Object r0 = r4.next()
            boolean r1 = r4.hasNext()
            r2 = 1
            if (r1 != 0) goto L32
            java.lang.Object[] r4 = new java.lang.Object[]{r0}
            defpackage.kt7.b(r2, r4)
            t28 r4 = h(r2, r4)
            return r4
        L32:
            q r1 = new q
            r1.<init>()
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1.c = r3
            r3 = 0
            r1.a = r3
            r1.d(r0)
        L42:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r4.next()
            r1.d(r0)
            goto L42
        L50:
            r1.b = r2
            java.lang.Object r4 = r1.c
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r0 = r1.a
            t28 r4 = h(r0, r4)
            return r4
    }

    public static defpackage.s28 j(java.util.Collection r1) {
            boolean r0 = r1 instanceof defpackage.p28
            if (r0 == 0) goto L1a
            p28 r1 = (defpackage.p28) r1
            s28 r1 = (defpackage.s28) r1
            boolean r0 = r1.d()
            if (r0 == 0) goto L19
            java.lang.Object[] r0 = defpackage.p28.A
            java.lang.Object[] r1 = r1.toArray(r0)
            int r0 = r1.length
            t28 r1 = h(r0, r1)
        L19:
            return r1
        L1a:
            java.lang.Object[] r1 = r1.toArray()
            int r0 = r1.length
            defpackage.kt7.b(r0, r1)
            t28 r1 = h(r0, r1)
            return r1
    }

    @Override // defpackage.p28
    public int a(java.lang.Object[] r4) {
            r3 = this;
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L10
            java.lang.Object r2 = r3.get(r1)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L5
        L10:
            return r0
    }

    @Override // java.util.List
    public final void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.List
    public final boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            if (r6 != r5) goto L3
            goto L60
        L3:
            boolean r0 = r6 instanceof java.util.List
            r1 = 0
            if (r0 != 0) goto L9
            goto L62
        L9:
            java.util.List r6 = (java.util.List) r6
            int r0 = r5.size()
            int r2 = r6.size()
            if (r0 == r2) goto L16
            goto L62
        L16:
            boolean r2 = r6 instanceof java.util.RandomAccess
            if (r2 == 0) goto L32
            r2 = r1
        L1b:
            if (r2 >= r0) goto L60
            java.lang.Object r3 = r5.get(r2)
            java.lang.Object r4 = r6.get(r2)
            if (r3 == r4) goto L2f
            if (r3 == 0) goto L62
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L62
        L2f:
            int r2 = r2 + 1
            goto L1b
        L32:
            q28 r5 = r5.l(r1)
            java.util.Iterator r6 = r6.iterator()
        L3a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5a
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L47
            goto L62
        L47:
            java.lang.Object r0 = r5.next()
            java.lang.Object r2 = r6.next()
            if (r0 == r2) goto L3a
            if (r0 == 0) goto L62
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L62
            goto L3a
        L5a:
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L62
        L60:
            r5 = 1
            return r5
        L62:
            return r1
    }

    public defpackage.s28 g(int r2, int r3) {
            r1 = this;
            int r0 = r1.size()
            defpackage.su7.d(r2, r3, r0)
            int r3 = r3 - r2
            int r0 = r1.size()
            if (r3 != r0) goto Lf
            return r1
        Lf:
            if (r3 != 0) goto L14
            t28 r1 = defpackage.t28.X
            return r1
        L14:
            r28 r0 = new r28
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
            r2 = 1
        L6:
            if (r1 >= r0) goto L16
            int r2 = r2 * 31
            java.lang.Object r3 = r4.get(r1)
            int r3 = r3.hashCode()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L16:
            return r2
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            r0 = -1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L19
            java.lang.Object r3 = r4.get(r2)
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L16
            return r2
        L16:
            int r2 = r2 + 1
            goto L9
        L19:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            q28 r1 = r1.l(r0)
            return r1
    }

    public final defpackage.q28 l(int r2) {
            r1 = this;
            int r0 = r1.size()
            defpackage.su7.c(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L10
            q28 r1 = defpackage.s28.B
            return r1
        L10:
            q28 r0 = new q28
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.size()
            int r1 = r1 + r0
        L9:
            if (r1 < 0) goto L19
            java.lang.Object r2 = r3.get(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L16
            return r1
        L16:
            int r1 = r1 + (-1)
            goto L9
        L19:
            return r0
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            q28 r1 = r1.l(r0)
            return r1
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            q28 r0 = r0.l(r1)
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.List
    public final java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            s28 r0 = r0.g(r1, r2)
            return r0
    }
}
