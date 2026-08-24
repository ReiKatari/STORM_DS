package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gh0  reason: default package */
/* loaded from: classes.dex */
public final class gh0 {
    public final java.util.concurrent.Executor a;
    public final defpackage.ov2 b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public java.util.concurrent.ScheduledFuture e;
    public defpackage.if0 f;
    public defpackage.kh0 g;
    public defpackage.bx4 h;
    public defpackage.g60 i;
    public final defpackage.os0 j;
    public volatile java.util.List k;
    public final java.util.concurrent.atomic.AtomicBoolean l;
    public final java.util.concurrent.CopyOnWriteArrayList m;
    public final java.util.concurrent.CopyOnWriteArrayList n;
    public final java.util.LinkedHashMap o;

    public gh0(java.util.concurrent.Executor r1, defpackage.ov2 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.c = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.d = r1
            os0 r1 = new os0
            r2 = 18
            r1.<init>(r0, r2)
            r0.j = r1
            yt1 r1 = defpackage.yt1.A
            r0.k = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            r0.l = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.m = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.n = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.o = r1
            return
    }

    public final void a(java.lang.String r2) {
            r1 = this;
            kh0 r0 = r1.g
            if (r0 != 0) goto L5
            return
        L5:
            eg0 r0 = r0.b(r2)     // Catch: java.lang.IllegalArgumentException -> L14
            cg0 r0 = r0.q()     // Catch: java.lang.IllegalArgumentException -> L14
            r0.getClass()     // Catch: java.lang.IllegalArgumentException -> L14
            r1.e(r0)     // Catch: java.lang.IllegalArgumentException -> L14
            return
        L14:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "CameraInternal not found for "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r2 = ". Cannot setup state observer."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "CameraPresencePrvdr"
            defpackage.kj2.f0(r2, r1)
            return
    }

    public final void b(java.util.Set r7, java.util.Set r8) {
            r6 = this;
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            java.util.concurrent.CopyOnWriteArrayList r6 = r6.n
            java.lang.String r1 = "Notifying "
            java.lang.String r2 = "CameraPresencePrvdr"
            if (r0 != 0) goto L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            int r3 = r7.size()
            r0.append(r3)
            java.lang.String r3 = " cameras added."
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            defpackage.kj2.E(r2, r0)
            java.util.Iterator r0 = r6.iterator()
        L2b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r0.next()
            fh0 r3 = (defpackage.fh0) r3
            ov2 r4 = r3.b
            ge r5 = new ge
            r5.<init>(r3, r7)
            r4.execute(r5)
            goto L2b
        L42:
            r7 = r8
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L7f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            int r0 = r8.size()
            r7.append(r0)
            java.lang.String r0 = " cameras removed."
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            defpackage.kj2.E(r2, r7)
            java.util.Iterator r6 = r6.iterator()
        L67:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L7f
            java.lang.Object r7 = r6.next()
            fh0 r7 = (defpackage.fh0) r7
            ov2 r0 = r7.b
            mf r1 = new mf
            r2 = 4
            r1.<init>(r2, r7, r8)
            r0.execute(r1)
            goto L67
        L7f:
            return
    }

    public final void c(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "Removed state observer for: "
            java.lang.Object r1 = r6.c
            monitor-enter(r1)
            java.util.LinkedHashMap r2 = r6.o     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.remove(r7)     // Catch: java.lang.Throwable -> L36
            fi4 r2 = (defpackage.fi4) r2     // Catch: java.lang.Throwable -> L36
            kh0 r6 = r6.g     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L38
            if (r6 == 0) goto L38
            eg0 r6 = r6.b(r7)     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38
            ov2 r3 = defpackage.u24.x()     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38
            mf r4 = new mf     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38
            r5 = 5
            r4.<init>(r5, r6, r2)     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38
            r3.execute(r4)     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38
            java.lang.String r6 = "CameraPresencePrvdr"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38
            r2.append(r7)     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38
            defpackage.kj2.t(r6, r7)     // Catch: java.lang.Throwable -> L36 java.lang.IllegalArgumentException -> L38
            goto L38
        L36:
            r6 = move-exception
            goto L3a
        L38:
            monitor-exit(r1)
            return
        L3a:
            monitor-exit(r1)
            throw r6
    }

    public final void d(int r5, java.util.List r6) {
            r4 = this;
            if (r5 <= 0) goto L24
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.l
            boolean r0 = r0.get()
            if (r0 != 0) goto Lb
            goto L24
        Lb:
            r0 = 3
            if (r5 != r0) goto L11
            r0 = 0
            goto L13
        L11:
            r0 = 400(0x190, double:1.976E-321)
        L13:
            dh0 r2 = new dh0
            r3 = 0
            r2.<init>(r4, r6, r5, r3)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            ov2 r6 = r4.b
            java.util.concurrent.ScheduledFuture r5 = r6.schedule(r2, r0, r5)
            r4.e = r5
            return
        L24:
            if (r5 > 0) goto L2d
            java.lang.String r4 = "CameraPresencePrvdr"
            java.lang.String r5 = "Exhausted all retries for camera list refresh."
            defpackage.kj2.f0(r4, r5)
        L2d:
            return
    }

    public final void e(defpackage.cg0 r8) {
            r7 = this;
            java.lang.String r0 = "Registered state observer for camera: "
            java.lang.String r1 = r8.d()
            r1.getClass()
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.l
            boolean r2 = r2.get()
            if (r2 != 0) goto L12
            return
        L12:
            java.lang.Object r2 = r7.c
            monitor-enter(r2)
            java.util.LinkedHashMap r3 = r7.o     // Catch: java.lang.Throwable -> L41
            boolean r3 = r3.containsKey(r1)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L1f
            monitor-exit(r2)
            return
        L1f:
            eh0 r3 = new eh0     // Catch: java.lang.Throwable -> L41
            r3.<init>(r7, r1)     // Catch: java.lang.Throwable -> L41
            ov2 r4 = defpackage.u24.x()     // Catch: java.lang.Throwable -> L41
            mf r5 = new mf     // Catch: java.lang.Throwable -> L41
            r6 = 6
            r5.<init>(r6, r8, r3)     // Catch: java.lang.Throwable -> L41
            r4.execute(r5)     // Catch: java.lang.Throwable -> L41
            java.util.LinkedHashMap r7 = r7.o     // Catch: java.lang.Throwable -> L41
            r7.put(r1, r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = "CameraPresencePrvdr"
            java.lang.String r8 = r0.concat(r1)     // Catch: java.lang.Throwable -> L41
            defpackage.kj2.t(r7, r8)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r2)
            return
        L41:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
    }

    public final void f() {
            r8 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.l
            r1 = 0
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L11
            java.lang.String r8 = "CameraPresencePrvdr"
            java.lang.String r0 = "Shutdown called when not monitoring. Ignoring."
            defpackage.kj2.t(r8, r0)
            return
        L11:
            java.lang.String r0 = "CameraPresencePrvdr"
            java.lang.String r2 = "Shutting down CameraPresenceProvider monitoring."
            defpackage.kj2.E(r0, r2)
            java.lang.Object r0 = r8.d
            monitor-enter(r0)
            java.util.concurrent.ScheduledFuture r2 = r8.e     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L26
            r2.cancel(r1)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r8 = move-exception
            goto L133
        L26:
            r2 = 0
            r8.e = r2     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            bx4 r0 = r8.h
            if (r0 == 0) goto L8c
            os0 r3 = r8.j
            java.util.concurrent.CopyOnWriteArrayList r4 = r0.b
            java.util.Iterator r4 = r4.iterator()
        L36:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r4.next()
            w r5 = (defpackage.w) r5
            bi4 r6 = r5.b
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L36
            goto L4c
        L4b:
            r5 = r2
        L4c:
            if (r5 == 0) goto L53
            java.util.concurrent.CopyOnWriteArrayList r3 = r0.b
            r3.remove(r5)
        L53:
            java.lang.Object r3 = r0.a
            monitor-enter(r3)
            boolean r4 = r0.e     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L88
            java.util.concurrent.CopyOnWriteArrayList r4 = r0.b     // Catch: java.lang.Throwable -> L86
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L88
            java.lang.String r4 = "CameraPresenceSrc"
            java.lang.String r5 = "Last observer removed. Stopping monitoring."
            android.util.Log.i(r4, r5)     // Catch: java.lang.Throwable -> L86
            r0.e = r1     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "PipePresenceSrc"
            java.lang.String r5 = "Stopping camera ID flow collection."
            android.util.Log.i(r4, r5)     // Catch: java.lang.Throwable -> L86
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.h     // Catch: java.lang.Throwable -> L86
            r5 = 1
            boolean r1 = r4.compareAndSet(r5, r1)     // Catch: java.lang.Throwable -> L86
            if (r1 != 0) goto L7c
            goto L88
        L7c:
            ap6 r1 = r0.i     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L83
            r1.h(r2)     // Catch: java.lang.Throwable -> L86
        L83:
            r0.i = r2     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r8 = move-exception
            goto L8a
        L88:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
            goto L8c
        L8a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
            throw r8
        L8c:
            java.lang.Object r0 = r8.c
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r8.o     // Catch: java.lang.Throwable -> L130
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L130
            if (r1 == 0) goto L9a
            monitor-exit(r0)
            goto L11b
        L9a:
            java.util.LinkedHashMap r1 = r8.o     // Catch: java.lang.Throwable -> L130
            java.util.Map r1 = defpackage.c14.s0(r1)     // Catch: java.lang.Throwable -> L130
            java.util.LinkedHashMap r3 = r8.o     // Catch: java.lang.Throwable -> L130
            r3.clear()     // Catch: java.lang.Throwable -> L130
            monitor-exit(r0)
            kh0 r0 = r8.g
            if (r0 == 0) goto L11b
            java.util.LinkedHashSet r0 = r0.c()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lb7:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Ld1
            java.lang.Object r4 = r0.next()
            eg0 r4 = (defpackage.eg0) r4
            if (r4 == 0) goto Lca
            cg0 r4 = r4.q()
            goto Lcb
        Lca:
            r4 = r2
        Lcb:
            if (r4 == 0) goto Lb7
            r3.add(r4)
            goto Lb7
        Ld1:
            java.lang.String r0 = "CameraPresencePrvdr"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Clearing all "
            r4.<init>(r5)
            int r5 = r1.size()
            r4.append(r5)
            java.lang.String r5 = " state observers."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            defpackage.kj2.t(r0, r4)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lf5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L11b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.getValue()
            fi4 r1 = (defpackage.fi4) r1
            ov2 r5 = defpackage.u24.x()
            v r6 = new v
            r7 = 6
            r6.<init>(r3, r1, r4, r7)
            r5.execute(r6)
            goto Lf5
        L11b:
            r8.i = r2
            java.util.concurrent.CopyOnWriteArrayList r0 = r8.m
            r0.clear()
            java.util.concurrent.CopyOnWriteArrayList r0 = r8.n
            r0.clear()
            yt1 r0 = defpackage.yt1.A
            r8.k = r0
            r8.f = r2
            r8.g = r2
            return
        L130:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L133:
            monitor-exit(r0)
            throw r8
    }

    public final void g(defpackage.g60 r6, defpackage.if0 r7, defpackage.kh0 r8) {
            r5 = this;
            r7.getClass()
            r8.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.l
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L12
            goto Lac
        L12:
            java.lang.String r0 = "CameraPresencePrvdr"
            java.lang.String r3 = "Starting CameraPresenceProvider monitoring."
            defpackage.kj2.E(r0, r3)
            r5.i = r6
            java.util.Set r6 = r7.e()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.ht0.v0(r6, r3)
            r0.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
        L30:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r6.next()
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            r4 = 0
            yf0 r3 = defpackage.nc1.J(r3, r4, r4)
            r0.add(r3)
            goto L30
        L48:
            r5.k = r0
            r5.f = r7
            r5.g = r8
            java.lang.Object r6 = r7.h
            bx4 r6 = (defpackage.bx4) r6
            r5.h = r6
            java.util.concurrent.Executor r6 = r5.a
            ch0 r7 = new ch0
            r7.<init>(r5, r2)
            r6.execute(r7)
            bx4 r6 = r5.h
            if (r6 == 0) goto Lac
            java.util.concurrent.Executor r7 = r5.a
            vb6 r8 = new vb6
            r8.<init>(r7)
            os0 r5 = r5.j
            java.util.concurrent.CopyOnWriteArrayList r7 = r6.b
            w r0 = new w
            r0.<init>(r8, r5)
            r7.add(r0)
            java.lang.Object r7 = r6.a
            monitor-enter(r7)
            boolean r0 = r6.e     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L93
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.b     // Catch: java.lang.Throwable -> L91
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L93
            java.lang.String r0 = "CameraPresenceSrc"
            java.lang.String r3 = "First observer added. Starting monitoring."
            android.util.Log.i(r0, r3)     // Catch: java.lang.Throwable -> L91
            r6.e = r2     // Catch: java.lang.Throwable -> L91
            r6.b()     // Catch: java.lang.Throwable -> L91
            goto L93
        L91:
            r5 = move-exception
            goto Laa
        L93:
            java.util.List r0 = r6.c     // Catch: java.lang.Throwable -> L91
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> L91
            java.lang.Throwable r6 = r6.d     // Catch: java.lang.Throwable -> L91
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L91
            w r7 = new w
            r7.<init>(r8, r5)
            v r5 = new v
            r5.<init>(r6, r7, r0, r1)
            r8.execute(r5)
            return
        Laa:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L91
            throw r5
        Lac:
            return
    }
}
