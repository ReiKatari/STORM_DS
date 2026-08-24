package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rt6  reason: default package */
/* loaded from: classes.dex */
public final class rt6 implements java.util.Collection, defpackage.zf3 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    public rt6() {
            r2 = this;
            r0 = 0
            r2.A = r0
            int r0 = defpackage.jo4.a
            ea4 r0 = new ea4
            r1 = 6
            r0.<init>(r1)
            r2.<init>()
            r2.B = r0
            return
    }

    public rt6(defpackage.ja4 r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.B = r2
            return
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
        Ld:
            java.lang.Object r1 = r1.B
            ea4 r1 = (defpackage.ea4) r1
            boolean r1 = r1.a(r2)
            return r1
    }

    @Override // java.util.Collection
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

    @Override // java.util.Collection
    public final void clear() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
        Ld:
            java.lang.Object r1 = r1.B
            ea4 r1 = (defpackage.ea4) r1
            r1.b()
            return
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.B
            ja4 r1 = (defpackage.ja4) r1
            boolean r1 = r1.d(r2)
            return r1
        Le:
            java.lang.Object r1 = r1.B
            ea4 r1 = (defpackage.ea4) r1
            boolean r1 = r1.c(r2)
            return r1
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection r5) {
            r4 = this;
            int r0 = r4.A
            r1 = 0
            java.lang.Object r4 = r4.B
            r2 = 1
            switch(r0) {
                case 0: goto L31;
                default: goto L9;
            }
        L9:
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L19
        L17:
            r1 = r2
            goto L30
        L19:
            java.util.Iterator r5 = r5.iterator()
        L1d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r5.next()
            r3 = r4
            ja4 r3 = (defpackage.ja4) r3
            boolean r0 = r3.d(r0)
            if (r0 != 0) goto L1d
        L30:
            return r1
        L31:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L37:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r5.next()
            r3 = r4
            ea4 r3 = (defpackage.ea4) r3
            boolean r0 = r3.c(r0)
            if (r0 != 0) goto L37
            goto L4c
        L4b:
            r1 = r2
        L4c:
            return r1
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.B
            ja4 r1 = (defpackage.ja4) r1
            boolean r1 = r1.i()
            return r1
        Le:
            java.lang.Object r1 = r1.B
            ea4 r1 = (defpackage.ea4) r1
            int r1 = r1.g
            if (r1 != 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            return r1
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.A
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            p52 r0 = new p52
            r1 = 0
            r2 = 3
            r0.<init>(r3, r1, r2)
            rb6 r3 = defpackage.qo2.C(r0)
            return r3
        L11:
            java.lang.Object r3 = r3.B
            ea4 r3 = (defpackage.ea4) r3
            r3.getClass()
            ga4 r0 = new ga4
            r0.<init>(r3)
            rr2 r3 = new rr2
            r3.<init>(r0)
            return r3
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
        Ld:
            java.lang.Object r1 = r1.B
            ea4 r1 = (defpackage.ea4) r1
            boolean r1 = r1.g(r2)
            return r1
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
        Ld:
            java.lang.Object r1 = r1.B
            ea4 r1 = (defpackage.ea4) r1
            boolean r1 = r1.g(r2)
            return r1
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate r1) {
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

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
        Ld:
            java.lang.Object r1 = r1.B
            ea4 r1 = (defpackage.ea4) r1
            boolean r1 = r1.i(r2)
            return r1
    }

    @Override // java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.B
            ja4 r1 = (defpackage.ja4) r1
            int r1 = r1.e
            return r1
        Lc:
            java.lang.Object r1 = r1.B
            ea4 r1 = (defpackage.ea4) r1
            int r1 = r1.g
            return r1
    }

    @Override // java.util.Collection
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

    @Override // java.util.Collection
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
            java.lang.Object[] r1 = defpackage.nb3.c0(r1, r2)
            return r1
    }
}
