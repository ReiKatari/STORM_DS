package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yf7  reason: default package */
/* loaded from: classes.dex */
public final class yf7 implements java.util.Collection, defpackage.zf3 {
    public final short[] A;

    public /* synthetic */ yf7(short[] r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof defpackage.xf7
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            xf7 r5 = (defpackage.xf7) r5
            short r5 = r5.A
            short[] r4 = r4.A
            int r0 = r4.length
            r2 = r1
        Le:
            if (r2 >= r0) goto L18
            short r3 = r4[r2]
            if (r5 != r3) goto L15
            goto L19
        L15:
            int r2 = r2 + 1
            goto Le
        L18:
            r2 = -1
        L19:
            if (r2 < 0) goto L1d
            r4 = 1
            return r4
        L1d:
            return r1
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection r7) {
            r6 = this;
            r7.getClass()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            goto L39
        Lf:
            java.util.Iterator r7 = r7.iterator()
        L13:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r7.next()
            boolean r1 = r0 instanceof defpackage.xf7
            r2 = 0
            if (r1 == 0) goto L38
            xf7 r0 = (defpackage.xf7) r0
            short r0 = r0.A
            short[] r1 = r6.A
            int r3 = r1.length
            r4 = r2
        L2a:
            if (r4 >= r3) goto L34
            short r5 = r1[r4]
            if (r0 != r5) goto L31
            goto L35
        L31:
            int r4 = r4 + 1
            goto L2a
        L34:
            r4 = -1
        L35:
            if (r4 < 0) goto L38
            goto L13
        L38:
            return r2
        L39:
            r6 = 1
            return r6
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.yf7
            if (r0 != 0) goto L5
            goto L11
        L5:
            yf7 r2 = (defpackage.yf7) r2
            short[] r2 = r2.A
            short[] r1 = r1.A
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    @Override // java.util.Collection
    public final int hashCode() {
            r0 = this;
            short[] r0 = r0.A
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            short[] r0 = r0.A
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            w0 r0 = new w0
            r1 = 9
            short[] r2 = r2.A
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final int size() {
            r0 = this;
            short[] r0 = r0.A
            int r0 = r0.length
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r0 = this;
            java.lang.Object[] r0 = defpackage.nb3.b0(r0)
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            r1.getClass()
            java.lang.Object[] r0 = defpackage.nb3.c0(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UShortArray(storage="
            r0.<init>(r1)
            short[] r2 = r2.A
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
