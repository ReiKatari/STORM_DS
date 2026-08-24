package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z0  reason: default package */
/* loaded from: classes.dex */
public abstract class z0 extends defpackage.l0 implements java.util.List {
    public z0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.List
    public final void add(int r1, java.lang.Object r2) {
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

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.List
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Collection r5 = (java.util.Collection) r5
            int r1 = r4.size()
            int r3 = r5.size()
            if (r1 == r3) goto L17
            goto L33
        L17:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r4 = r4.iterator()
        L1f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r4.next()
            java.lang.Object r3 = r5.next()
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1f
        L33:
            return r2
        L34:
            return r0
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
            r2 = this;
            java.util.Iterator r2 = r2.iterator()
            r0 = 1
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r2.next()
            int r0 = r0 * 31
            if (r1 == 0) goto L18
            int r1 = r1.hashCode()
            goto L19
        L18:
            r1 = 0
        L19:
            int r0 = r0 + r1
            goto L5
        L1b:
            return r0
    }

    public int indexOf(java.lang.Object r3) {
            r2 = this;
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r2.next()
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 == 0) goto L16
            return r0
        L16:
            int r0 = r0 + 1
            goto L5
        L19:
            r2 = -1
            return r2
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
            r2 = this;
            w0 r0 = new w0
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r0)
        L8:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.previous()
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 == 0) goto L8
            int r1 = r1.nextIndex()
            return r1
        L1d:
            r1 = -1
            return r1
    }

    public java.util.ListIterator listIterator() {
            r2 = this;
            x0 r0 = new x0
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.util.ListIterator listIterator(int r2) {
            r1 = this;
            x0 r0 = new x0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public final java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public java.util.List subList(int r2, int r3) {
            r1 = this;
            y0 r0 = new y0
            r0.<init>(r1, r2, r3)
            return r0
    }
}
