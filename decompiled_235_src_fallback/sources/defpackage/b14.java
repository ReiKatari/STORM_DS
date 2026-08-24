package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b14  reason: default package */
/* loaded from: classes.dex */
public final class b14 implements java.util.Map, defpackage.zf3 {
    public final defpackage.ja4 A;
    public defpackage.q52 B;
    public defpackage.q52 L;
    public defpackage.rt6 R;

    public b14(defpackage.ja4 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.util.Map
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Map
    public final java.lang.Object compute(java.lang.Object r1, java.util.function.BiFunction r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfAbsent(java.lang.Object r1, java.util.function.Function r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object r1, java.util.function.BiFunction r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            ja4 r0 = r0.A
            boolean r0 = r0.c(r1)
            return r0
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r1) {
            r0 = this;
            ja4 r0 = r0.A
            boolean r0 = r0.d(r1)
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r3 = this;
            q52 r0 = r3.B
            if (r0 == 0) goto L5
            return r0
        L5:
            q52 r0 = new q52
            ja4 r1 = r3.A
            r2 = 0
            r0.<init>(r1, r2)
            r3.B = r0
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<b14> r0 = defpackage.b14.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            b14 r3 = (defpackage.b14) r3
            ja4 r2 = r2.A
            ja4 r3 = r3.A
            boolean r2 = defpackage.nb3.k(r2, r3)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            ja4 r0 = r0.A
            java.lang.Object r0 = r0.g(r1)
            return r0
    }

    @Override // java.util.Map
    public final int hashCode() {
            r0 = this;
            ja4 r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r0 = this;
            ja4 r0 = r0.A
            boolean r0 = r0.i()
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r3 = this;
            q52 r0 = r3.L
            if (r0 == 0) goto L5
            return r0
        L5:
            q52 r0 = new q52
            ja4 r1 = r3.A
            r2 = 1
            r0.<init>(r1, r2)
            r3.L = r0
            return r0
    }

    @Override // java.util.Map
    public final java.lang.Object merge(java.lang.Object r1, java.lang.Object r2, java.util.function.BiFunction r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object replace(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final boolean replace(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final void replaceAll(java.util.function.BiFunction r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final int size() {
            r0 = this;
            ja4 r0 = r0.A
            int r0 = r0.e
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            ja4 r0 = r0.A
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r2 = this;
            rt6 r0 = r2.R
            if (r0 == 0) goto L5
            return r0
        L5:
            rt6 r0 = new rt6
            ja4 r1 = r2.A
            r0.<init>(r1)
            r2.R = r0
            return r0
    }
}
