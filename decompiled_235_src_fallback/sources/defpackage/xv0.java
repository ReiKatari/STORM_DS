package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xv0  reason: default package */
/* loaded from: classes.dex */
public final class xv0 extends defpackage.ak7 {
    public final java.util.HashMap l;
    public final java.util.HashMap m;
    public final java.util.HashMap n;
    public final defpackage.j62 o;
    public final java.util.concurrent.atomic.AtomicReference p;

    public xv0(java.util.concurrent.Executor r6, java.util.ArrayList r7, java.util.List r8) {
            r5 = this;
            r5.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.l = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.m = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.n = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r5.p = r0
            j62 r0 = new j62
            r0.<init>(r6)
            r5.o = r0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Class<j62> r1 = defpackage.j62.class
            java.lang.Class<xt6> r2 = defpackage.xt6.class
            java.lang.Class<g65> r3 = defpackage.g65.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3}
            bv0 r0 = defpackage.bv0.b(r0, r1, r2)
            r6.add(r0)
            java.lang.Class<xv0> r0 = defpackage.xv0.class
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            bv0 r0 = defpackage.bv0.b(r5, r0, r2)
            r6.add(r0)
            java.util.Iterator r8 = r8.iterator()
        L4c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r8.next()
            bv0 r0 = (defpackage.bv0) r0
            if (r0 == 0) goto L4c
            r6.add(r0)
            goto L4c
        L5e:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r0 = r7.size()
            r2 = r1
        L68:
            if (r2 >= r0) goto L74
            java.lang.Object r3 = r7.get(r2)
            int r2 = r2 + 1
            r8.add(r3)
            goto L68
        L74:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            monitor-enter(r5)
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L9d
        L7e:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L9d
            o55 r0 = (defpackage.o55) r0     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L9d defpackage.vb3 -> La0
            tv0 r0 = (defpackage.tv0) r0     // Catch: java.lang.Throwable -> L9d defpackage.vb3 -> La0
            if (r0 == 0) goto L7e
            java.util.List r0 = r0.getComponents()     // Catch: java.lang.Throwable -> L9d defpackage.vb3 -> La0
            r6.addAll(r0)     // Catch: java.lang.Throwable -> L9d defpackage.vb3 -> La0
            r8.remove()     // Catch: java.lang.Throwable -> L9d defpackage.vb3 -> La0
            goto L7e
        L9d:
            r6 = move-exception
            goto L120
        La0:
            r0 = move-exception
            r8.remove()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "ComponentDiscovery"
            java.lang.String r3 = "Invalid component registrar."
            android.util.Log.w(r2, r3, r0)     // Catch: java.lang.Throwable -> L9d
            goto L7e
        Lac:
            java.util.HashMap r8 = r5.l     // Catch: java.lang.Throwable -> L9d
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L9d
            if (r8 == 0) goto Lb8
            defpackage.hf.L(r6)     // Catch: java.lang.Throwable -> L9d
            goto Lc9
        Lb8:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9d
            java.util.HashMap r0 = r5.l     // Catch: java.lang.Throwable -> L9d
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L9d
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L9d
            r8.addAll(r6)     // Catch: java.lang.Throwable -> L9d
            defpackage.hf.L(r8)     // Catch: java.lang.Throwable -> L9d
        Lc9:
            int r8 = r6.size()     // Catch: java.lang.Throwable -> L9d
            r0 = r1
        Lce:
            if (r0 >= r8) goto Le8
            java.lang.Object r2 = r6.get(r0)     // Catch: java.lang.Throwable -> L9d
            int r0 = r0 + 1
            bv0 r2 = (defpackage.bv0) r2     // Catch: java.lang.Throwable -> L9d
            ho3 r3 = new ho3     // Catch: java.lang.Throwable -> L9d
            vv0 r4 = new vv0     // Catch: java.lang.Throwable -> L9d
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L9d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9d
            java.util.HashMap r4 = r5.l     // Catch: java.lang.Throwable -> L9d
            r4.put(r2, r3)     // Catch: java.lang.Throwable -> L9d
            goto Lce
        Le8:
            java.util.ArrayList r6 = r5.O0(r6)     // Catch: java.lang.Throwable -> L9d
            r7.addAll(r6)     // Catch: java.lang.Throwable -> L9d
            java.util.ArrayList r6 = r5.P0()     // Catch: java.lang.Throwable -> L9d
            r7.addAll(r6)     // Catch: java.lang.Throwable -> L9d
            r5.N0()     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9d
            int r6 = r7.size()
        Lfe:
            if (r1 >= r6) goto L10c
            java.lang.Object r8 = r7.get(r1)
            int r1 = r1 + 1
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            r8.run()
            goto Lfe
        L10c:
            java.util.concurrent.atomic.AtomicReference r6 = r5.p
            java.lang.Object r6 = r6.get()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L11f
            java.util.HashMap r7 = r5.l
            boolean r6 = r6.booleanValue()
            r5.L0(r7, r6)
        L11f:
            return
        L120:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9d
            throw r6
    }

    public final void L0(java.util.HashMap r2, boolean r3) {
            r1 = this;
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            bv0 r0 = (defpackage.bv0) r0
            java.lang.Object r3 = r3.getValue()
            o55 r3 = (defpackage.o55) r3
            r0.getClass()
            goto L8
        L24:
            j62 r1 = r1.o
            monitor-enter(r1)
            java.util.ArrayDeque r2 = r1.a     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            if (r2 == 0) goto L31
            r1.a = r3     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r2 = move-exception
            goto L46
        L31:
            r2 = r3
        L32:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L45
            java.util.Iterator r1 = r2.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L40
            goto L45
        L40:
            java.lang.ClassCastException r1 = defpackage.i61.j(r1)
            throw r1
        L45:
            return
        L46:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r2
    }

    public final void M0() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r3.p
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
        L4:
            r2 = 0
            boolean r2 = r0.compareAndSet(r2, r1)
            if (r2 == 0) goto L1c
            monitor-enter(r3)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L19
            java.util.HashMap r1 = r3.l     // Catch: java.lang.Throwable -> L19
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            r1 = 1
            r3.L0(r0, r1)
            return
        L19:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            throw r0
        L1c:
            java.lang.Object r2 = r0.get()
            if (r2 == 0) goto L4
            return
    }

    public final void N0() {
            r8 = this;
            java.util.HashMap r0 = r8.l
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La0
            java.lang.Object r1 = r0.next()
            bv0 r1 = (defpackage.bv0) r1
            java.util.Set r2 = r1.b
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()
            wh1 r3 = (defpackage.wh1) r3
            int r4 = r3.b
            r5 = 2
            if (r4 != r5) goto L5b
            java.util.HashMap r4 = r8.n
            java.lang.Class r6 = r3.a
            boolean r4 = r4.containsKey(r6)
            if (r4 != 0) goto L5b
            java.util.HashMap r4 = r8.n
            java.lang.Class r3 = r3.a
            java.util.Set r5 = java.util.Collections.EMPTY_SET
            java.util.Set r5 = (java.util.Set) r5
            tr3 r6 = new tr3
            r6.<init>()
            r7 = 0
            r6.b = r7
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            java.util.Set r7 = java.util.Collections.newSetFromMap(r7)
            r6.a = r7
            java.util.Set r7 = r6.a
            r7.addAll(r5)
            r4.put(r3, r6)
            goto L1c
        L5b:
            java.util.HashMap r4 = r8.m
            java.lang.Class r6 = r3.a
            boolean r4 = r4.containsKey(r6)
            if (r4 != 0) goto L1c
            int r4 = r3.b
            r6 = 1
            if (r4 == r6) goto L82
            if (r4 != r5) goto L6d
            goto L1c
        L6d:
            java.util.HashMap r4 = r8.m
            java.lang.Class r3 = r3.a
            do4 r5 = new do4
            d90 r6 = defpackage.d90.A0
            wv0 r7 = defpackage.wv0.c
            r5.<init>()
            r5.a = r6
            r5.b = r7
            r4.put(r3, r5)
            goto L1c
        L82:
            yh1 r8 = new yh1
            java.lang.Class r0 = r3.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsatisfied dependency for component "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ": "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r8.<init>(r0)
            throw r8
        La0:
            return
    }

    public final java.util.ArrayList O0(java.util.ArrayList r9) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r9.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L50
            java.lang.Object r3 = r9.get(r2)
            int r2 = r2 + 1
            bv0 r3 = (defpackage.bv0) r3
            int r4 = r3.c
            if (r4 != 0) goto La
            java.util.HashMap r4 = r8.l
            java.lang.Object r4 = r4.get(r3)
            o55 r4 = (defpackage.o55) r4
            java.util.Set r3 = r3.a
            java.util.Iterator r3 = r3.iterator()
        L26:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto La
            java.lang.Object r5 = r3.next()
            java.lang.Class r5 = (java.lang.Class) r5
            java.util.HashMap r6 = r8.m
            boolean r7 = r6.containsKey(r5)
            if (r7 != 0) goto L3e
            r6.put(r5, r4)
            goto L26
        L3e:
            java.lang.Object r5 = r6.get(r5)
            o55 r5 = (defpackage.o55) r5
            do4 r5 = (defpackage.do4) r5
            uo2 r6 = new uo2
            r7 = 7
            r6.<init>(r7, r5, r4)
            r0.add(r6)
            goto L26
        L50:
            return r0
    }

    public final java.util.ArrayList P0() {
            r7 = this;
            java.util.HashMap r0 = r7.n
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r7 = r7.l
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L16:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            bv0 r4 = (defpackage.bv0) r4
            int r5 = r4.c
            if (r5 != 0) goto L2d
            goto L16
        L2d:
            java.lang.Object r3 = r3.getValue()
            o55 r3 = (defpackage.o55) r3
            java.util.Set r4 = r4.a
            java.util.Iterator r4 = r4.iterator()
        L39:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L16
            java.lang.Object r5 = r4.next()
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r6 = r2.containsKey(r5)
            if (r6 != 0) goto L53
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r2.put(r5, r6)
        L53:
            java.lang.Object r5 = r2.get(r5)
            java.util.Set r5 = (java.util.Set) r5
            r5.add(r3)
            goto L39
        L5d:
            java.util.Set r7 = r2.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L65:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Ld0
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto La5
            java.lang.Object r3 = r2.getKey()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Object r2 = r2.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Set r2 = (java.util.Set) r2
            tr3 r4 = new tr3
            r4.<init>()
            r5 = 0
            r4.b = r5
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap
            r5.<init>()
            java.util.Set r5 = java.util.Collections.newSetFromMap(r5)
            r4.a = r5
            java.util.Set r5 = r4.a
            r5.addAll(r2)
            r0.put(r3, r4)
            goto L65
        La5:
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r3 = r0.get(r3)
            tr3 r3 = (defpackage.tr3) r3
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        Lb9:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r2.next()
            o55 r4 = (defpackage.o55) r4
            uo2 r5 = new uo2
            r6 = 8
            r5.<init>(r6, r3, r4)
            r1.add(r5)
            goto Lb9
        Ld0:
            return r1
    }

    @Override // defpackage.ov0
    public final synchronized defpackage.o55 b(java.lang.Class r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "Null interface requested."
            defpackage.ln2.k(r2, r0)     // Catch: java.lang.Throwable -> L10
            java.util.HashMap r0 = r1.m     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L10
            o55 r2 = (defpackage.o55) r2     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    @Override // defpackage.ov0
    public final synchronized defpackage.o55 c(java.lang.Class r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap r0 = r1.n     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L11
            tr3 r2 = (defpackage.tr3) r2     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto Ld
            monitor-exit(r1)
            return r2
        Ld:
            wv0 r2 = defpackage.wv0.b     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r2
        L11:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }
}
