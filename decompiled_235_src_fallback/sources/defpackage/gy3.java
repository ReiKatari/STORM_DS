package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gy3  reason: default package */
/* loaded from: classes.dex */
public final class gy3 implements java.util.Collection, defpackage.zf3 {
    public static final defpackage.gy3 L = null;
    public final java.util.List A;
    public final int B;

    static {
            gy3 r0 = new gy3
            yt1 r1 = defpackage.yt1.A
            r0.<init>(r1)
            defpackage.gy3.L = r0
            return
    }

    public gy3(java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            int r1 = r1.size()
            r0.B = r1
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
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.fy3
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            fy3 r2 = (defpackage.fy3) r2
            java.util.List r1 = r1.A
            boolean r1 = r1.contains(r2)
            return r1
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection r1) {
            r0 = this;
            java.util.List r0 = r0.A
            boolean r0 = r0.containsAll(r1)
            return r0
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof defpackage.gy3
            if (r0 != 0) goto L8
            goto L14
        L8:
            gy3 r2 = (defpackage.gy3) r2
            java.util.List r2 = r2.A
            java.util.List r1 = r1.A
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    @Override // java.util.Collection
    public final int hashCode() {
            r0 = this;
            java.util.List r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            java.util.List r0 = r0.A
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r0 = this;
            java.util.List r0 = r0.A
            java.util.Iterator r0 = r0.iterator()
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
    public final boolean removeIf(java.util.function.Predicate r1) {
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
            int r0 = r0.B
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
            java.lang.Object[] r0 = defpackage.nb3.c0(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LocaleList(localeList="
            r0.<init>(r1)
            java.util.List r2 = r2.A
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
