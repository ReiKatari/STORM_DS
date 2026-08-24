package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cm6  reason: default package */
/* loaded from: classes.dex */
public final class cm6 implements java.util.Set, defpackage.dg3 {
    public final defpackage.om6 A;
    public final /* synthetic */ int B;

    public cm6(defpackage.om6 r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.<init>()
            r0.A = r1
            return
    }

    private final boolean a(java.util.Collection r8) {
            r7 = this;
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Set r8 = defpackage.gt0.p1(r8)
            om6 r7 = r7.A
            r0 = 0
        L9:
            java.lang.Object r1 = defpackage.ak7.g
            monitor-enter(r1)
            nm6 r2 = r7.A     // Catch: java.lang.Throwable -> L79
            r2.getClass()     // Catch: java.lang.Throwable -> L79
            hq6 r2 = defpackage.bm6.h(r2)     // Catch: java.lang.Throwable -> L79
            nm6 r2 = (defpackage.nm6) r2     // Catch: java.lang.Throwable -> L79
            yv4 r3 = r2.c     // Catch: java.lang.Throwable -> L79
            int r2 = r2.d     // Catch: java.lang.Throwable -> L79
            monitor-exit(r1)
            r3.getClass()
            aw4 r1 = r3.b()
            cm6 r4 = r7.B
            java.util.Iterator r4 = r4.iterator()
        L29:
            r5 = r4
            u0 r5 = (defpackage.u0) r5
            boolean r5 = r5.hasNext()
            if (r5 == 0) goto L4e
            r5 = r4
            dq6 r5 = (defpackage.dq6) r5
            java.lang.Object r5 = r5.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            boolean r6 = r8.contains(r6)
            if (r6 != 0) goto L29
            java.lang.Object r0 = r5.getKey()
            r1.remove(r0)
            r0 = 1
            goto L29
        L4e:
            yv4 r1 = r1.b()
            boolean r3 = defpackage.nb3.k(r1, r3)
            if (r3 != 0) goto L78
            nm6 r3 = r7.A
            r3.getClass()
            java.lang.Object r4 = defpackage.bm6.c
            monitor-enter(r4)
            vl6 r5 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L75
            hq6 r3 = defpackage.bm6.w(r3, r7, r5)     // Catch: java.lang.Throwable -> L75
            nm6 r3 = (defpackage.nm6) r3     // Catch: java.lang.Throwable -> L75
            boolean r1 = defpackage.om6.c(r7, r3, r2, r1)     // Catch: java.lang.Throwable -> L75
            monitor-exit(r4)
            defpackage.bm6.n(r5, r7)
            if (r1 == 0) goto L9
            goto L78
        L75:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L78:
            return r0
        L79:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.B
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            defpackage.ak7.K0()
            r0 = 0
            throw r0
        La:
            defpackage.ak7.K0()
            r0 = 0
            throw r0
        Lf:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            defpackage.ak7.K0()
            r0 = 0
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            int r0 = r0.B
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            defpackage.ak7.K0()
            r0 = 0
            throw r0
        La:
            defpackage.ak7.K0()
            r0 = 0
            throw r0
        Lf:
            defpackage.ak7.K0()
            r0 = 0
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r0 = this;
            om6 r0 = r0.A
            r0.clear()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.B
            om6 r1 = r1.A
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r1 = r1.containsValue(r2)
            return r1
        Lc:
            boolean r1 = r1.containsKey(r2)
            return r1
        L11:
            boolean r0 = r2 instanceof java.util.Map.Entry
            if (r0 == 0) goto L30
            boolean r0 = r2 instanceof defpackage.zf3
            if (r0 == 0) goto L1d
            boolean r0 = r2 instanceof defpackage.bg3
            if (r0 == 0) goto L30
        L1d:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r1 = r1.get(r0)
            java.lang.Object r2 = r2.getValue()
            boolean r1 = defpackage.nb3.k(r1, r2)
            goto L31
        L30:
            r1 = 0
        L31:
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection r5) {
            r4 = this;
            int r0 = r4.B
            om6 r1 = r4.A
            r2 = 0
            r3 = 1
            switch(r0) {
                case 0: goto L57;
                case 1: goto L30;
                default: goto L9;
            }
        L9:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r4 = r5 instanceof java.util.Collection
            if (r4 == 0) goto L19
            r4 = r5
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L19
            goto L2e
        L19:
            java.util.Iterator r4 = r5.iterator()
        L1d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2e
            java.lang.Object r5 = r4.next()
            boolean r5 = r1.containsValue(r5)
            if (r5 != 0) goto L1d
            goto L2f
        L2e:
            r2 = r3
        L2f:
            return r2
        L30:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r4 = r5 instanceof java.util.Collection
            if (r4 == 0) goto L40
            r4 = r5
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L40
            goto L55
        L40:
            java.util.Iterator r4 = r5.iterator()
        L44:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            boolean r5 = r1.containsKey(r5)
            if (r5 != 0) goto L44
            goto L56
        L55:
            r2 = r3
        L56:
            return r2
        L57:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L68
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L68
        L66:
            r2 = r3
            goto L7e
        L68:
            java.util.Iterator r5 = r5.iterator()
        L6c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L6c
        L7e:
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            om6 r0 = r0.A
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.B
            om6 r3 = r3.A
            switch(r0) {
                case 0: goto L35;
                case 1: goto L1e;
                default: goto L7;
            }
        L7:
            dq6 r0 = new dq6
            nm6 r1 = r3.d()
            yv4 r1 = r1.c
            java.util.Set r1 = r1.entrySet()
            s33 r1 = (defpackage.s33) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = 2
            r0.<init>(r3, r1, r2)
            return r0
        L1e:
            dq6 r0 = new dq6
            nm6 r1 = r3.d()
            yv4 r1 = r1.c
            java.util.Set r1 = r1.entrySet()
            s33 r1 = (defpackage.s33) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
            r0.<init>(r3, r1, r2)
            return r0
        L35:
            dq6 r0 = new dq6
            nm6 r1 = r3.d()
            yv4 r1 = r1.c
            java.util.Set r1 = r1.entrySet()
            s33 r1 = (defpackage.s33) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.B
            r1 = 0
            r2 = 1
            om6 r5 = r5.A
            switch(r0) {
                case 0: goto L43;
                case 1: goto L3b;
                default: goto L9;
            }
        L9:
            cm6 r0 = r5.B
            java.util.Iterator r0 = r0.iterator()
        Lf:
            r3 = r0
            u0 r3 = (defpackage.u0) r3
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L2d
            r3 = r0
            dq6 r3 = (defpackage.dq6) r3
            java.lang.Object r3 = r3.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            boolean r4 = defpackage.nb3.k(r4, r6)
            if (r4 == 0) goto Lf
            goto L2e
        L2d:
            r3 = 0
        L2e:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L3a
            java.lang.Object r6 = r3.getKey()
            r5.remove(r6)
            r1 = r2
        L3a:
            return r1
        L3b:
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L42
            r1 = r2
        L42:
            return r1
        L43:
            boolean r0 = r6 instanceof java.util.Map.Entry
            if (r0 == 0) goto L5c
            boolean r0 = r6 instanceof defpackage.zf3
            if (r0 == 0) goto L4f
            boolean r0 = r6 instanceof defpackage.bg3
            if (r0 == 0) goto L5c
        L4f:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L5c
            r1 = r2
        L5c:
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r9) {
            r8 = this;
            int r0 = r8.B
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto La0;
                case 1: goto L82;
                default: goto L7;
            }
        L7:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Set r9 = defpackage.gt0.p1(r9)
            om6 r8 = r8.A
        Lf:
            java.lang.Object r0 = defpackage.ak7.g
            monitor-enter(r0)
            nm6 r3 = r8.A     // Catch: java.lang.Throwable -> L7f
            r3.getClass()     // Catch: java.lang.Throwable -> L7f
            hq6 r3 = defpackage.bm6.h(r3)     // Catch: java.lang.Throwable -> L7f
            nm6 r3 = (defpackage.nm6) r3     // Catch: java.lang.Throwable -> L7f
            yv4 r4 = r3.c     // Catch: java.lang.Throwable -> L7f
            int r3 = r3.d     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r0)
            r4.getClass()
            aw4 r0 = r4.b()
            cm6 r5 = r8.B
            java.util.Iterator r5 = r5.iterator()
        L2f:
            r6 = r5
            u0 r6 = (defpackage.u0) r6
            boolean r6 = r6.hasNext()
            if (r6 == 0) goto L54
            r6 = r5
            dq6 r6 = (defpackage.dq6) r6
            java.lang.Object r6 = r6.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            boolean r7 = r9.contains(r7)
            if (r7 == 0) goto L2f
            java.lang.Object r2 = r6.getKey()
            r0.remove(r2)
            r2 = r1
            goto L2f
        L54:
            yv4 r0 = r0.b()
            boolean r4 = defpackage.nb3.k(r0, r4)
            if (r4 != 0) goto L7e
            nm6 r4 = r8.A
            r4.getClass()
            java.lang.Object r5 = defpackage.bm6.c
            monitor-enter(r5)
            vl6 r6 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L7b
            hq6 r4 = defpackage.bm6.w(r4, r8, r6)     // Catch: java.lang.Throwable -> L7b
            nm6 r4 = (defpackage.nm6) r4     // Catch: java.lang.Throwable -> L7b
            boolean r0 = defpackage.om6.c(r8, r4, r3, r0)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r5)
            defpackage.bm6.n(r6, r8)
            if (r0 == 0) goto Lf
            goto L7e
        L7b:
            r8 = move-exception
            monitor-exit(r5)
            throw r8
        L7e:
            return r2
        L7f:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L82:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L88:
            r0 = r2
        L89:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r9.next()
            om6 r4 = r8.A
            java.lang.Object r3 = r4.remove(r3)
            if (r3 != 0) goto L9d
            if (r0 == 0) goto L88
        L9d:
            r0 = r1
            goto L89
        L9f:
            return r0
        La0:
            java.util.Iterator r9 = r9.iterator()
        La4:
            r0 = r2
        La5:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto Lc1
            java.lang.Object r3 = r9.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            om6 r4 = r8.A
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r4.remove(r3)
            if (r3 != 0) goto Lbf
            if (r0 == 0) goto La4
        Lbf:
            r0 = r1
            goto La5
        Lc1:
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r10) {
            r9 = this;
            int r0 = r9.B
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L87;
                case 1: goto L82;
                default: goto L7;
            }
        L7:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Set r10 = defpackage.gt0.p1(r10)
            om6 r9 = r9.A
        Lf:
            java.lang.Object r0 = defpackage.ak7.g
            monitor-enter(r0)
            nm6 r3 = r9.A     // Catch: java.lang.Throwable -> L7f
            r3.getClass()     // Catch: java.lang.Throwable -> L7f
            hq6 r3 = defpackage.bm6.h(r3)     // Catch: java.lang.Throwable -> L7f
            nm6 r3 = (defpackage.nm6) r3     // Catch: java.lang.Throwable -> L7f
            yv4 r4 = r3.c     // Catch: java.lang.Throwable -> L7f
            int r3 = r3.d     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r0)
            r4.getClass()
            aw4 r0 = r4.b()
            cm6 r5 = r9.B
            java.util.Iterator r5 = r5.iterator()
        L2f:
            r6 = r5
            u0 r6 = (defpackage.u0) r6
            boolean r6 = r6.hasNext()
            if (r6 == 0) goto L54
            r6 = r5
            dq6 r6 = (defpackage.dq6) r6
            java.lang.Object r6 = r6.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            boolean r7 = r10.contains(r7)
            if (r7 != 0) goto L2f
            java.lang.Object r2 = r6.getKey()
            r0.remove(r2)
            r2 = r1
            goto L2f
        L54:
            yv4 r0 = r0.b()
            boolean r4 = defpackage.nb3.k(r0, r4)
            if (r4 != 0) goto L7e
            nm6 r4 = r9.A
            r4.getClass()
            java.lang.Object r5 = defpackage.bm6.c
            monitor-enter(r5)
            vl6 r6 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L7b
            hq6 r4 = defpackage.bm6.w(r4, r9, r6)     // Catch: java.lang.Throwable -> L7b
            nm6 r4 = (defpackage.nm6) r4     // Catch: java.lang.Throwable -> L7b
            boolean r0 = defpackage.om6.c(r9, r4, r3, r0)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r5)
            defpackage.bm6.n(r6, r9)
            if (r0 == 0) goto Lf
            goto L7e
        L7b:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        L7e:
            return r2
        L7f:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L82:
            boolean r9 = r9.a(r10)
            return r9
        L87:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r0 = 10
            int r0 = defpackage.ht0.v0(r10, r0)
            int r0 = defpackage.c14.k0(r0)
            r3 = 16
            if (r0 >= r3) goto L98
            r0 = r3
        L98:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        La1:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lb9
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r3.put(r4, r0)
            goto La1
        Lb9:
            om6 r9 = r9.A
        Lbb:
            java.lang.Object r10 = defpackage.ak7.g
            monitor-enter(r10)
            nm6 r0 = r9.A     // Catch: java.lang.Throwable -> L13d
            r0.getClass()     // Catch: java.lang.Throwable -> L13d
            hq6 r0 = defpackage.bm6.h(r0)     // Catch: java.lang.Throwable -> L13d
            nm6 r0 = (defpackage.nm6) r0     // Catch: java.lang.Throwable -> L13d
            yv4 r4 = r0.c     // Catch: java.lang.Throwable -> L13d
            int r0 = r0.d     // Catch: java.lang.Throwable -> L13d
            monitor-exit(r10)
            r4.getClass()
            aw4 r10 = r4.b()
            cm6 r5 = r9.B
            java.util.Iterator r5 = r5.iterator()
        Ldb:
            r6 = r5
            u0 r6 = (defpackage.u0) r6
            boolean r6 = r6.hasNext()
            if (r6 == 0) goto L112
            r6 = r5
            dq6 r6 = (defpackage.dq6) r6
            java.lang.Object r6 = r6.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            boolean r7 = r3.containsKey(r7)
            if (r7 == 0) goto L109
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r7 = r3.get(r7)
            java.lang.Object r8 = r6.getValue()
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto Ldb
        L109:
            java.lang.Object r2 = r6.getKey()
            r10.remove(r2)
            r2 = r1
            goto Ldb
        L112:
            yv4 r10 = r10.b()
            boolean r4 = defpackage.nb3.k(r10, r4)
            if (r4 != 0) goto L13c
            nm6 r4 = r9.A
            r4.getClass()
            java.lang.Object r5 = defpackage.bm6.c
            monitor-enter(r5)
            vl6 r6 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L139
            hq6 r4 = defpackage.bm6.w(r4, r9, r6)     // Catch: java.lang.Throwable -> L139
            nm6 r4 = (defpackage.nm6) r4     // Catch: java.lang.Throwable -> L139
            boolean r10 = defpackage.om6.c(r9, r4, r0, r10)     // Catch: java.lang.Throwable -> L139
            monitor-exit(r5)
            defpackage.bm6.n(r6, r9)
            if (r10 == 0) goto Lbb
            goto L13c
        L139:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        L13c:
            return r2
        L13d:
            r9 = move-exception
            monitor-exit(r10)
            throw r9
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
            r0 = this;
            om6 r0 = r0.A
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
            r0 = this;
            java.lang.Object[] r0 = defpackage.nb3.b0(r0)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Object[] r0 = defpackage.nb3.c0(r0, r1)
            return r0
    }
}
