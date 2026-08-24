package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: om6  reason: default package */
/* loaded from: classes.dex */
public final class om6 implements defpackage.eq6, java.util.Map, defpackage.cg3 {
    public defpackage.nm6 A;
    public final defpackage.cm6 B;
    public final defpackage.cm6 L;
    public final defpackage.cm6 R;

    public om6() {
            r5 = this;
            r5.<init>()
            yv4 r0 = defpackage.yv4.L
            vl6 r1 = defpackage.bm6.j()
            nm6 r2 = new nm6
            long r3 = r1.g()
            r2.<init>(r3, r0)
            boolean r1 = r1 instanceof defpackage.os2
            if (r1 != 0) goto L1f
            nm6 r1 = new nm6
            r3 = 1
            r1.<init>(r3, r0)
            r2.b = r1
        L1f:
            r5.A = r2
            cm6 r0 = new cm6
            r1 = 0
            r0.<init>(r5, r1)
            r5.B = r0
            cm6 r0 = new cm6
            r1 = 1
            r0.<init>(r5, r1)
            r5.L = r0
            cm6 r0 = new cm6
            r1 = 2
            r0.<init>(r5, r1)
            r5.R = r0
            return
    }

    public static final boolean c(defpackage.om6 r1, defpackage.nm6 r2, int r3, defpackage.yv4 r4) {
            java.lang.Object r1 = defpackage.ak7.g
            monitor-enter(r1)
            int r0 = r2.d     // Catch: java.lang.Throwable -> Le
            if (r0 != r3) goto L10
            r2.c = r4     // Catch: java.lang.Throwable -> Le
            r3 = 1
            int r0 = r0 + r3
            r2.d = r0     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r2 = move-exception
            goto L13
        L10:
            r3 = 0
        L11:
            monitor-exit(r1)
            return r3
        L13:
            monitor-exit(r1)
            throw r2
    }

    @Override // defpackage.eq6
    public final defpackage.hq6 a() {
            r0 = this;
            nm6 r0 = r0.A
            return r0
    }

    @Override // java.util.Map
    public final void clear() {
            r5 = this;
            nm6 r0 = r5.A
            r0.getClass()
            hq6 r0 = defpackage.bm6.h(r0)
            nm6 r0 = (defpackage.nm6) r0
            yv4 r1 = defpackage.yv4.L
            yv4 r0 = r0.c
            if (r1 == r0) goto L3a
            nm6 r0 = r5.A
            r0.getClass()
            java.lang.Object r2 = defpackage.bm6.c
            monitor-enter(r2)
            vl6 r3 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L37
            hq6 r0 = defpackage.bm6.w(r0, r5, r3)     // Catch: java.lang.Throwable -> L37
            nm6 r0 = (defpackage.nm6) r0     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = defpackage.ak7.g     // Catch: java.lang.Throwable -> L37
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L37
            r0.c = r1     // Catch: java.lang.Throwable -> L34
            int r1 = r0.d     // Catch: java.lang.Throwable -> L34
            int r1 = r1 + 1
            r0.d = r1     // Catch: java.lang.Throwable -> L34
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            defpackage.bm6.n(r3, r5)
            return
        L34:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            throw r5     // Catch: java.lang.Throwable -> L37
        L37:
            r5 = move-exception
            monitor-exit(r2)
            throw r5
        L3a:
            return
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            nm6 r0 = r0.d()
            yv4 r0 = r0.c
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r1) {
            r0 = this;
            nm6 r0 = r0.d()
            yv4 r0 = r0.c
            boolean r0 = r0.containsValue(r1)
            return r0
    }

    public final defpackage.nm6 d() {
            r1 = this;
            nm6 r0 = r1.A
            r0.getClass()
            hq6 r1 = defpackage.bm6.t(r0, r1)
            nm6 r1 = (defpackage.nm6) r1
            return r1
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r0 = this;
            cm6 r0 = r0.B
            return r0
    }

    @Override // defpackage.eq6
    public final void f(defpackage.hq6 r1) {
            r0 = this;
            r1.getClass()
            nm6 r1 = (defpackage.nm6) r1
            r0.A = r1
            return
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            nm6 r0 = r0.d()
            yv4 r0 = r0.c
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r0 = this;
            nm6 r0 = r0.d()
            yv4 r0 = r0.c
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r0 = this;
            cm6 r0 = r0.L
            return r0
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
        L0:
            java.lang.Object r0 = defpackage.ak7.g
            monitor-enter(r0)
            nm6 r1 = r6.A     // Catch: java.lang.Throwable -> L49
            r1.getClass()     // Catch: java.lang.Throwable -> L49
            hq6 r1 = defpackage.bm6.h(r1)     // Catch: java.lang.Throwable -> L49
            nm6 r1 = (defpackage.nm6) r1     // Catch: java.lang.Throwable -> L49
            yv4 r2 = r1.c     // Catch: java.lang.Throwable -> L49
            int r1 = r1.d     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)
            r2.getClass()
            aw4 r0 = r2.b()
            java.lang.Object r3 = r0.put(r7, r8)
            yv4 r0 = r0.b()
            boolean r2 = defpackage.nb3.k(r0, r2)
            if (r2 != 0) goto L48
            nm6 r2 = r6.A
            r2.getClass()
            java.lang.Object r4 = defpackage.bm6.c
            monitor-enter(r4)
            vl6 r5 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L45
            hq6 r2 = defpackage.bm6.w(r2, r6, r5)     // Catch: java.lang.Throwable -> L45
            nm6 r2 = (defpackage.nm6) r2     // Catch: java.lang.Throwable -> L45
            boolean r0 = c(r6, r2, r1, r0)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r4)
            defpackage.bm6.n(r5, r6)
            if (r0 == 0) goto L0
            goto L48
        L45:
            r6 = move-exception
            monitor-exit(r4)
            throw r6
        L48:
            return r3
        L49:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r6) {
            r5 = this;
        L0:
            java.lang.Object r0 = defpackage.ak7.g
            monitor-enter(r0)
            nm6 r1 = r5.A     // Catch: java.lang.Throwable -> L48
            r1.getClass()     // Catch: java.lang.Throwable -> L48
            hq6 r1 = defpackage.bm6.h(r1)     // Catch: java.lang.Throwable -> L48
            nm6 r1 = (defpackage.nm6) r1     // Catch: java.lang.Throwable -> L48
            yv4 r2 = r1.c     // Catch: java.lang.Throwable -> L48
            int r1 = r1.d     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)
            r2.getClass()
            aw4 r0 = r2.b()
            r0.putAll(r6)
            yv4 r0 = r0.b()
            boolean r2 = defpackage.nb3.k(r0, r2)
            if (r2 != 0) goto L47
            nm6 r2 = r5.A
            r2.getClass()
            java.lang.Object r3 = defpackage.bm6.c
            monitor-enter(r3)
            vl6 r4 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L44
            hq6 r2 = defpackage.bm6.w(r2, r5, r4)     // Catch: java.lang.Throwable -> L44
            nm6 r2 = (defpackage.nm6) r2     // Catch: java.lang.Throwable -> L44
            boolean r0 = c(r5, r2, r1, r0)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            defpackage.bm6.n(r4, r5)
            if (r0 == 0) goto L0
            goto L47
        L44:
            r5 = move-exception
            monitor-exit(r3)
            throw r5
        L47:
            return
        L48:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = defpackage.ak7.g
            monitor-enter(r0)
            nm6 r1 = r6.A     // Catch: java.lang.Throwable -> L49
            r1.getClass()     // Catch: java.lang.Throwable -> L49
            hq6 r1 = defpackage.bm6.h(r1)     // Catch: java.lang.Throwable -> L49
            nm6 r1 = (defpackage.nm6) r1     // Catch: java.lang.Throwable -> L49
            yv4 r2 = r1.c     // Catch: java.lang.Throwable -> L49
            int r1 = r1.d     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)
            r2.getClass()
            aw4 r0 = r2.b()
            java.lang.Object r3 = r0.remove(r7)
            yv4 r0 = r0.b()
            boolean r2 = defpackage.nb3.k(r0, r2)
            if (r2 != 0) goto L48
            nm6 r2 = r6.A
            r2.getClass()
            java.lang.Object r4 = defpackage.bm6.c
            monitor-enter(r4)
            vl6 r5 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L45
            hq6 r2 = defpackage.bm6.w(r2, r6, r5)     // Catch: java.lang.Throwable -> L45
            nm6 r2 = (defpackage.nm6) r2     // Catch: java.lang.Throwable -> L45
            boolean r0 = c(r6, r2, r1, r0)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r4)
            defpackage.bm6.n(r5, r6)
            if (r0 == 0) goto L0
            goto L48
        L45:
            r6 = move-exception
            monitor-exit(r4)
            throw r6
        L48:
            return r3
        L49:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    @Override // java.util.Map
    public final int size() {
            r0 = this;
            nm6 r0 = r0.d()
            yv4 r0 = r0.c
            r0.getClass()
            int r0 = r0.B
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            nm6 r0 = r3.A
            r0.getClass()
            hq6 r0 = defpackage.bm6.h(r0)
            nm6 r0 = (defpackage.nm6) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SnapshotStateMap(value="
            r1.<init>(r2)
            yv4 r0 = r0.c
            r1.append(r0)
            java.lang.String r0 = ")@"
            r1.append(r0)
            int r3 = r3.hashCode()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r0 = this;
            cm6 r0 = r0.R
            return r0
    }
}
