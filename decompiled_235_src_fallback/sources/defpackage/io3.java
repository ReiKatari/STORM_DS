package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: io3  reason: default package */
/* loaded from: classes.dex */
public final class io3 implements java.util.Map {
    public final java.util.Map A;

    public io3(java.util.Map r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.util.Map
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Dagger map bindings are immutable"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 == 0) goto L11
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.getName()
            java.util.Map r1 = r1.A
            boolean r1 = r1.containsKey(r2)
            return r1
        L11:
            java.lang.String r1 = "Key must be a class"
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r1) {
            r0 = this;
            java.util.Map r0 = r0.A
            boolean r0 = r0.containsValue(r1)
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead."
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 == 0) goto L11
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.getName()
            java.util.Map r1 = r1.A
            java.lang.Object r1 = r1.get(r2)
            return r1
        L11:
            java.lang.String r1 = "Key must be a class"
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r0 = this;
            java.util.Map r0 = r0.A
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead."
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Dagger map bindings are immutable"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Dagger map bindings are immutable"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Dagger map bindings are immutable"
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

    @Override // java.util.Map
    public final java.util.Collection values() {
            r0 = this;
            java.util.Map r0 = r0.A
            java.util.Collection r0 = r0.values()
            return r0
    }
}
