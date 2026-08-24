package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vu  reason: default package */
/* loaded from: classes.dex */
public final class vu implements java.util.Collection {
    public final /* synthetic */ defpackage.wu A;

    public vu(defpackage.wu r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection
    public final void clear() {
            r0 = this;
            wu r0 = r0.A
            r0.clear()
            return
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            wu r0 = r0.A
            int r0 = r0.a(r1)
            if (r0 < 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L4
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            wu r0 = r0.A
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            su r0 = new su
            wu r2 = r2.A
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            wu r0 = r0.A
            int r1 = r0.a(r1)
            if (r1 < 0) goto Ld
            r0.g(r1)
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection r6) {
            r5 = this;
            wu r5 = r5.A
            int r0 = r5.L
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L1d
            java.lang.Object r3 = r5.i(r1)
            boolean r3 = r6.contains(r3)
            r4 = 1
            if (r3 == 0) goto L1b
            r5.g(r1)
            int r1 = r1 + (-1)
            int r0 = r0 + (-1)
            r2 = r4
        L1b:
            int r1 = r1 + r4
            goto L6
        L1d:
            return r2
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection r6) {
            r5 = this;
            wu r5 = r5.A
            int r0 = r5.L
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L1d
            java.lang.Object r3 = r5.i(r1)
            boolean r3 = r6.contains(r3)
            r4 = 1
            if (r3 != 0) goto L1b
            r5.g(r1)
            int r1 = r1 + (-1)
            int r0 = r0 + (-1)
            r2 = r4
        L1b:
            int r1 = r1 + r4
            goto L6
        L1d:
            return r2
    }

    @Override // java.util.Collection
    public final int size() {
            r0 = this;
            wu r0 = r0.A
            int r0 = r0.L
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r4 = this;
            wu r4 = r4.A
            int r0 = r4.L
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L12
            java.lang.Object r3 = r4.i(r2)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L12:
            return r1
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r4) {
            r3 = this;
            wu r3 = r3.A
            int r0 = r3.L
            int r1 = r4.length
            if (r1 >= r0) goto L15
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L15:
            r1 = 0
        L16:
            if (r1 >= r0) goto L21
            java.lang.Object r2 = r3.i(r1)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L16
        L21:
            int r3 = r4.length
            if (r3 <= r0) goto L27
            r3 = 0
            r4[r0] = r3
        L27:
            return r4
    }
}
