package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6(with = defpackage.bf3.class)
/* renamed from: ye3  reason: default package */
/* loaded from: classes.dex */
public final class ye3 extends defpackage.de3 implements java.util.Map<java.lang.String, defpackage.de3>, defpackage.zf3 {
    public static final defpackage.xe3 Companion = null;
    public final java.util.Map A;

    static {
            xe3 r0 = new xe3
            r0.<init>()
            defpackage.ye3.Companion = r0
            return
    }

    public ye3(java.util.Map r1) {
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
    public final /* bridge */ /* synthetic */ defpackage.de3 compute(java.lang.String r1, java.util.function.BiFunction<? super java.lang.String, ? super defpackage.de3, ? extends defpackage.de3> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ defpackage.de3 computeIfAbsent(java.lang.String r1, java.util.function.Function<? super java.lang.String, ? extends defpackage.de3> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ defpackage.de3 computeIfPresent(java.lang.String r1, java.util.function.BiFunction<? super java.lang.String, ? super defpackage.de3, ? extends defpackage.de3> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r1 = r1.A
            boolean r1 = r1.containsKey(r2)
            return r1
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.de3
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            de3 r2 = (defpackage.de3) r2
            java.util.Map r1 = r1.A
            boolean r1 = r1.containsValue(r2)
            return r1
    }

    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<java.lang.String, defpackage.de3>> entrySet() {
            r0 = this;
            java.util.Map r0 = r0.A
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            java.util.Map r0 = r0.A
            boolean r0 = defpackage.nb3.k(r0, r1)
            return r0
    }

    @Override // java.util.Map
    public final defpackage.de3 get(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r1 = r1.A
            java.lang.Object r1 = r1.get(r2)
            de3 r1 = (defpackage.de3) r1
            return r1
    }

    @Override // java.util.Map
    public final int hashCode() {
            r0 = this;
            java.util.Map r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r0 = this;
            java.util.Map r0 = r0.A
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set<java.lang.String> keySet() {
            r0 = this;
            java.util.Map r0 = r0.A
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ defpackage.de3 merge(java.lang.String r1, defpackage.de3 r2, java.util.function.BiFunction<? super defpackage.de3, ? super defpackage.de3, ? extends defpackage.de3> r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ defpackage.de3 put(java.lang.String r1, defpackage.de3 r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends java.lang.String, ? extends defpackage.de3> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ defpackage.de3 putIfAbsent(java.lang.String r1, defpackage.de3 r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final defpackage.de3 remove(java.lang.Object r1) {
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
    public final /* bridge */ /* synthetic */ defpackage.de3 replace(java.lang.String r1, defpackage.de3 r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(java.lang.String r1, defpackage.de3 r2, defpackage.de3 r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final void replaceAll(java.util.function.BiFunction<? super java.lang.String, ? super defpackage.de3, ? extends defpackage.de3> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final int size() {
            r0 = this;
            java.util.Map r0 = r0.A
            int r0 = r0.size()
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.util.Map r6 = r6.A
            java.util.Set r6 = r6.entrySet()
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            v83 r4 = new v83
            r6 = 5
            r4.<init>(r6)
            r5 = 24
            java.lang.String r1 = ","
            java.lang.String r2 = "{"
            java.lang.String r3 = "}"
            java.lang.String r6 = defpackage.gt0.P0(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @Override // java.util.Map
    public final java.util.Collection<defpackage.de3> values() {
            r0 = this;
            java.util.Map r0 = r0.A
            java.util.Collection r0 = r0.values()
            return r0
    }
}
