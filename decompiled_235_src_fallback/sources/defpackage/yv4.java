package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yv4  reason: default package */
/* loaded from: classes.dex */
public class yv4 implements java.util.Map, defpackage.zf3 {
    public static final defpackage.yv4 L = null;
    public final defpackage.ac7 A;
    public final int B;

    static {
            yv4 r0 = new yv4
            ac7 r1 = defpackage.ac7.e
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.yv4.L = r0
            return
    }

    public yv4(defpackage.ac7 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    public defpackage.aw4 a() {
            r1 = this;
            aw4 r0 = new aw4
            r0.<init>(r1)
            return r0
    }

    public /* bridge */ defpackage.aw4 b() {
            r0 = this;
            aw4 r0 = r0.a()
            return r0
    }

    public final defpackage.yv4 c(java.lang.Object r4, defpackage.ew3 r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L8
            int r1 = r4.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            ac7 r2 = r3.A
            zb r4 = r2.u(r4, r1, r0, r5)
            if (r4 != 0) goto L12
            return r3
        L12:
            yv4 r5 = new yv4
            java.lang.Object r0 = r4.L
            ac7 r0 = (defpackage.ac7) r0
            int r3 = r3.B
            int r4 = r4.B
            int r3 = r3 + r4
            r5.<init>(r0, r3)
            return r5
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
    public boolean containsKey(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L8
            int r1 = r3.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            ac7 r2 = r2.A
            boolean r2 = r2.d(r3, r1, r0)
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r3) {
            r2 = this;
            java.util.Set r2 = r2.entrySet()
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            boolean r0 = defpackage.nb3.k(r0, r3)
            if (r0 == 0) goto L10
            r2 = 1
            return r2
        L28:
            return r1
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            fw4 r0 = new fw4
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.util.Map
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Map r6 = (java.util.Map) r6
            int r1 = r6.size()
            int r3 = r5.B
            if (r3 == r1) goto L15
            return r2
        L15:
            java.util.Set r6 = r6.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L29
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L29
            return r0
        L29:
            java.util.Iterator r6 = r6.iterator()
        L2d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 != 0) goto L3c
            goto L57
        L3c:
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r4 = r5.get(r3)
            boolean r1 = defpackage.nb3.k(r1, r4)
            if (r1 != 0) goto L4f
            goto L57
        L4f:
            if (r4 != 0) goto L2d
            boolean r1 = r5.containsKey(r3)
            if (r1 != 0) goto L2d
        L57:
            return r2
        L58:
            return r0
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L8
            int r1 = r3.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            ac7 r2 = r2.A
            java.lang.Object r2 = r2.g(r3, r1, r0)
            return r2
    }

    @Override // java.util.Map
    public final int hashCode() {
            r0 = this;
            java.util.Set r0 = r0.entrySet()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
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

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r2 = this;
            fw4 r0 = new fw4
            r1 = 1
            r0.<init>(r2, r1)
            return r0
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
    public final java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final int size() {
            r0 = this;
            int r0 = r0.B
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.util.Set r0 = r6.entrySet()
            k0 r4 = new k0
            r1 = 1
            r4.<init>(r6, r1)
            r5 = 24
            java.lang.String r1 = ", "
            java.lang.String r2 = "{"
            java.lang.String r3 = "}"
            java.lang.String r6 = defpackage.gt0.P0(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r2 = this;
            m14 r0 = new m14
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }
}
