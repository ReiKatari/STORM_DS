package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q52  reason: default package */
/* loaded from: classes.dex */
public final class q52 implements java.util.Set, defpackage.zf3 {
    public final /* synthetic */ int A;
    public final defpackage.ja4 B;

    public q52(defpackage.ja4 r1, int r2) {
            r0 = this;
            r0.A = r2
            r1.getClass()
            switch(r2) {
                case 1: goto Le;
                default: goto L8;
            }
        L8:
            r0.<init>()
            r0.B = r1
            return
        Le:
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r1 = this;
            int r1 = r1.A
            switch(r1) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
        Ld:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            ja4 r1 = r1.B
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r1 = r1.c(r2)
            return r1
        Lc:
            boolean r0 = r2 instanceof java.util.Map.Entry
            if (r0 != 0) goto L12
            r1 = 0
            goto L24
        L12:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r1 = r1.g(r0)
            java.lang.Object r2 = r2.getValue()
            boolean r1 = defpackage.nb3.k(r1, r2)
        L24:
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection r5) {
            r4 = this;
            int r0 = r4.A
            r1 = 0
            ja4 r4 = r4.B
            r2 = 1
            r5.getClass()
            switch(r0) {
                case 0: goto L2e;
                default: goto Lc;
            }
        Lc:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
        L17:
            r1 = r2
            goto L2d
        L19:
            java.util.Iterator r5 = r5.iterator()
        L1d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r5.next()
            boolean r0 = r4.c(r0)
            if (r0 != 0) goto L1d
        L2d:
            return r1
        L2e:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3b
        L39:
            r1 = r2
            goto L5d
        L3b:
            java.util.Iterator r5 = r5.iterator()
        L3f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r3 = r4.g(r3)
            java.lang.Object r0 = r0.getValue()
            boolean r0 = defpackage.nb3.k(r3, r0)
            if (r0 != 0) goto L3f
        L5d:
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            ja4 r1 = r1.B
            boolean r1 = r1.i()
            return r1
        Lc:
            ja4 r1 = r1.B
            boolean r1 = r1.i()
            return r1
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.A
            r1 = 0
            switch(r0) {
                case 0: goto L11;
                default: goto L6;
            }
        L6:
            p52 r0 = new p52
            r2 = 1
            r0.<init>(r3, r1, r2)
            rb6 r3 = defpackage.qo2.C(r0)
            return r3
        L11:
            p52 r0 = new p52
            r2 = 0
            r0.<init>(r3, r1, r2)
            rb6 r3 = defpackage.qo2.C(r0)
            return r3
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            ja4 r1 = r1.B
            int r1 = r1.e
            return r1
        La:
            ja4 r1 = r1.B
            int r1 = r1.e
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object[] r1 = defpackage.nb3.b0(r1)
            return r1
        La:
            java.lang.Object[] r1 = defpackage.nb3.b0(r1)
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            r2.getClass()
            java.lang.Object[] r1 = defpackage.nb3.c0(r1, r2)
            return r1
        Ld:
            r2.getClass()
            java.lang.Object[] r1 = defpackage.nb3.c0(r1, r2)
            return r1
    }
}
