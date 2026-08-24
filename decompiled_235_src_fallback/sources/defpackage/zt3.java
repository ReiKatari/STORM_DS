package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zt3  reason: default package */
/* loaded from: classes.dex */
public final class zt3 {
    public final java.lang.Object a;
    public final java.util.HashMap b;
    public final java.util.HashMap c;
    public final java.util.ArrayDeque d;
    public defpackage.ze0 e;

    public zt3() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.d = r0
            return
    }

    public final void a(defpackage.vt3 r6, defpackage.qi1 r7, defpackage.ze0 r8) {
            r5 = this;
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            java.lang.Object r1 = r7.g     // Catch: java.lang.Throwable -> L21
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L21
            r1 = r1 ^ 1
            defpackage.np2.t(r1)     // Catch: java.lang.Throwable -> L21
            r5.e = r8     // Catch: java.lang.Throwable -> L21
            hu3 r8 = r6.d()     // Catch: java.lang.Throwable -> L21
            r5.e(r8)     // Catch: java.lang.Throwable -> L21
            yt3 r1 = r5.c(r8)     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r5 = move-exception
            goto La8
        L24:
            java.util.HashMap r2 = r5.c     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L21
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L21
            ze0 r2 = r5.e     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L3d
            java.lang.Object r3 = r2.b     // Catch: java.lang.Throwable -> L21
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L21
            int r2 = r2.e     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            r3 = 2
            if (r2 == r3) goto L89
            goto L3d
        L3a:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r5     // Catch: java.lang.Throwable -> L21
        L3d:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        L41:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L89
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            my r2 = (defpackage.my) r2     // Catch: java.lang.Throwable -> L21
            java.util.HashMap r3 = r5.b     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L21
            vt3 r2 = (defpackage.vt3) r2     // Catch: java.lang.Throwable -> L21
            r2.getClass()     // Catch: java.lang.Throwable -> L21
            boolean r3 = r2.equals(r6)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L41
            java.util.List r3 = r2.g()     // Catch: java.lang.Throwable -> L21
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L41
            java.lang.Object r3 = r2.A     // Catch: java.lang.Throwable -> L21
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L21
            qi1 r4 = r2.X     // Catch: java.lang.Throwable -> L86
            if (r4 != 0) goto L71
            r4 = 0
            goto L73
        L71:
            boolean r4 = r4.b     // Catch: java.lang.Throwable -> L86
        L73:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
            if (r4 != 0) goto L7e
            boolean r3 = r7.b     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L7e
            r2.s()     // Catch: java.lang.Throwable -> L21
            goto L41
        L7e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L21
            throw r5     // Catch: java.lang.Throwable -> L21
        L86:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
            throw r5     // Catch: java.lang.Throwable -> L21
        L89:
            r6.b(r7)     // Catch: java.lang.Throwable -> L21 defpackage.si0 -> La1
            ut3 r6 = r8.getLifecycle()     // Catch: java.lang.Throwable -> L21
            tt3 r6 = r6.b()     // Catch: java.lang.Throwable -> L21
            tt3 r7 = defpackage.tt3.STARTED     // Catch: java.lang.Throwable -> L21
            boolean r6 = r6.isAtLeast(r7)     // Catch: java.lang.Throwable -> L21
            if (r6 == 0) goto L9f
            r5.g(r8)     // Catch: java.lang.Throwable -> L21
        L9f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        La1:
            r5 = move-exception
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L21
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L21
            throw r6     // Catch: java.lang.Throwable -> L21
        La8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r5
    }

    public final defpackage.vt3 b(defpackage.hu3 r5, defpackage.zi0 r6, defpackage.t16 r7) {
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            yf0 r1 = r6.R     // Catch: java.lang.Throwable -> L33
            my r2 = new my     // Catch: java.lang.Throwable -> L33
            int r3 = java.lang.System.identityHashCode(r5)     // Catch: java.lang.Throwable -> L33
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L33
            java.util.HashMap r1 = r4.b     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            java.lang.String r2 = "LifecycleCamera already exists for the given LifecycleOwner and set of cameras"
            defpackage.np2.s(r2, r1)     // Catch: java.lang.Throwable -> L33
            vt3 r1 = new vt3     // Catch: java.lang.Throwable -> L33
            r1.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L33
            java.util.List r6 = r6.z()     // Catch: java.lang.Throwable -> L33
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L33
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L35
            r1.r()     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r4 = move-exception
            goto L48
        L35:
            ut3 r5 = r5.getLifecycle()     // Catch: java.lang.Throwable -> L33
            tt3 r5 = r5.b()     // Catch: java.lang.Throwable -> L33
            tt3 r6 = defpackage.tt3.DESTROYED     // Catch: java.lang.Throwable -> L33
            if (r5 != r6) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r1
        L43:
            r4.f(r1)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r1
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r4
    }

    public final defpackage.yt3 c(defpackage.hu3 r4) {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            java.util.HashMap r3 = r3.c     // Catch: java.lang.Throwable -> L23
            java.util.Set r3 = r3.keySet()     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L23
        Ld:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L23
            yt3 r1 = (defpackage.yt3) r1     // Catch: java.lang.Throwable -> L23
            hu3 r2 = r1.B     // Catch: java.lang.Throwable -> L23
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r1
        L23:
            r3 = move-exception
            goto L28
        L25:
            r3 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return r3
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    public final boolean d(defpackage.hu3 r5) {
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            yt3 r5 = r4.c(r5)     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            if (r5 != 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r4 = move-exception
            goto L40
        Le:
            java.util.HashMap r2 = r4.c     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r5 = r2.get(r5)     // Catch: java.lang.Throwable -> Lc
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> Lc
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lc
        L1a:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> Lc
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> Lc
            my r2 = (defpackage.my) r2     // Catch: java.lang.Throwable -> Lc
            java.util.HashMap r3 = r4.b     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> Lc
            vt3 r2 = (defpackage.vt3) r2     // Catch: java.lang.Throwable -> Lc
            r2.getClass()     // Catch: java.lang.Throwable -> Lc
            java.util.List r2 = r2.g()     // Catch: java.lang.Throwable -> Lc
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lc
            if (r2 != 0) goto L1a
            r4 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r4
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r4
    }

    public final void e(defpackage.hu3 r5) {
            r4 = this;
            yt3 r5 = r4.c(r5)
            if (r5 != 0) goto L8
            goto L8f
        L8:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashMap r1 = r4.c
            java.lang.Object r5 = r1.get(r5)
            java.util.Set r5 = (java.util.Set) r5
            java.util.Objects.requireNonNull(r5)
            java.util.Set r5 = (java.util.Set) r5
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r1 = r5.hasNext()
            java.util.HashMap r2 = r4.b
            if (r1 == 0) goto L50
            java.lang.Object r1 = r5.next()
            my r1 = (defpackage.my) r1
            java.lang.Object r2 = r2.get(r1)
            vt3 r2 = (defpackage.vt3) r2
            if (r2 == 0) goto L1e
            zi0 r2 = r2.L
            x9 r3 = r2.A
            eg0 r3 = r3.A
            boolean r3 = r3.k()
            if (r3 != 0) goto L4c
            x9 r2 = r2.B
            if (r2 == 0) goto L1e
            eg0 r2 = r2.A
            boolean r2 = r2.k()
            if (r2 == 0) goto L1e
        L4c:
            r0.add(r1)
            goto L1e
        L50:
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L8f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Removing "
            r5.<init>(r1)
            int r1 = r0.size()
            r5.append(r1)
            java.lang.String r1 = " stale LifecycleCamera(s)."
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "LifecycleCameraRepository"
            defpackage.kj2.f0(r1, r5)
            java.util.Iterator r5 = r0.iterator()
        L76:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r5.next()
            my r0 = (defpackage.my) r0
            java.lang.Object r0 = r2.get(r0)
            vt3 r0 = (defpackage.vt3) r0
            java.util.Objects.requireNonNull(r0)
            r4.k(r0)
            goto L76
        L8f:
            return
    }

    public final void f(defpackage.vt3 r7) {
            r6 = this;
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            hu3 r1 = r7.d()     // Catch: java.lang.Throwable -> L23
            zi0 r2 = r7.L     // Catch: java.lang.Throwable -> L23
            yf0 r2 = r2.R     // Catch: java.lang.Throwable -> L23
            my r3 = new my     // Catch: java.lang.Throwable -> L23
            int r4 = java.lang.System.identityHashCode(r1)     // Catch: java.lang.Throwable -> L23
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L23
            yt3 r2 = r6.c(r1)     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            java.util.HashMap r4 = r6.c     // Catch: java.lang.Throwable -> L23
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L23
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            r6 = move-exception
            goto L47
        L25:
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L23
            r4.<init>()     // Catch: java.lang.Throwable -> L23
        L2a:
            r4.add(r3)     // Catch: java.lang.Throwable -> L23
            java.util.HashMap r5 = r6.b     // Catch: java.lang.Throwable -> L23
            r5.put(r3, r7)     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L45
            yt3 r7 = new yt3     // Catch: java.lang.Throwable -> L23
            r7.<init>(r1, r6)     // Catch: java.lang.Throwable -> L23
            java.util.HashMap r6 = r6.c     // Catch: java.lang.Throwable -> L23
            r6.put(r7, r4)     // Catch: java.lang.Throwable -> L23
            ut3 r6 = r1.getLifecycle()     // Catch: java.lang.Throwable -> L23
            r6.a(r7)     // Catch: java.lang.Throwable -> L23
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r6
    }

    public final void g(defpackage.hu3 r4) {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            boolean r1 = r3.d(r4)     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r3 = move-exception
            goto L4c
        Ld:
            java.util.ArrayDeque r1 = r3.d     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L1b
            java.util.ArrayDeque r1 = r3.d     // Catch: java.lang.Throwable -> Lb
            r1.push(r4)     // Catch: java.lang.Throwable -> Lb
            goto L47
        L1b:
            ze0 r1 = r3.e     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L2c
            java.lang.Object r2 = r1.b     // Catch: java.lang.Throwable -> Lb
            monitor-enter(r2)     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.e     // Catch: java.lang.Throwable -> L29
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            r2 = 2
            if (r1 == r2) goto L47
            goto L2c
        L29:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r3     // Catch: java.lang.Throwable -> Lb
        L2c:
            java.util.ArrayDeque r1 = r3.d     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r1 = r1.peek()     // Catch: java.lang.Throwable -> Lb
            hu3 r1 = (defpackage.hu3) r1     // Catch: java.lang.Throwable -> Lb
            boolean r2 = r4.equals(r1)     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto L47
            r3.i(r1)     // Catch: java.lang.Throwable -> Lb
            java.util.ArrayDeque r1 = r3.d     // Catch: java.lang.Throwable -> Lb
            r1.remove(r4)     // Catch: java.lang.Throwable -> Lb
            java.util.ArrayDeque r1 = r3.d     // Catch: java.lang.Throwable -> Lb
            r1.push(r4)     // Catch: java.lang.Throwable -> Lb
        L47:
            r3.m(r4)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    public final void h(defpackage.hu3 r3) {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r2.d     // Catch: java.lang.Throwable -> L1f
            r1.remove(r3)     // Catch: java.lang.Throwable -> L1f
            r2.i(r3)     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayDeque r3 = r2.d     // Catch: java.lang.Throwable -> L1f
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L1f
            if (r3 != 0) goto L21
            java.util.ArrayDeque r3 = r2.d     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r3.peek()     // Catch: java.lang.Throwable -> L1f
            hu3 r3 = (defpackage.hu3) r3     // Catch: java.lang.Throwable -> L1f
            r2.m(r3)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r2 = move-exception
            goto L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r2
    }

    public final void i(defpackage.hu3 r4) {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            yt3 r4 = r3.c(r4)     // Catch: java.lang.Throwable -> Lb
            if (r4 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r3 = move-exception
            goto L36
        Ld:
            java.util.HashMap r1 = r3.c     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> Lb
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lb
        L19:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L34
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> Lb
            my r1 = (defpackage.my) r1     // Catch: java.lang.Throwable -> Lb
            java.util.HashMap r2 = r3.b     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> Lb
            vt3 r1 = (defpackage.vt3) r1     // Catch: java.lang.Throwable -> Lb
            r1.getClass()     // Catch: java.lang.Throwable -> Lb
            r1.r()     // Catch: java.lang.Throwable -> Lb
            goto L19
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    public final void j(java.util.HashSet r4) {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            if (r4 != 0) goto Le
            java.util.HashMap r4 = r3.b     // Catch: java.lang.Throwable -> Lc
            java.util.Set r4 = r4.keySet()     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r3 = move-exception
            goto L35
        Le:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lc
        L12:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L33
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> Lc
            my r1 = (defpackage.my) r1     // Catch: java.lang.Throwable -> Lc
            java.util.HashMap r2 = r3.b     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> Lc
            vt3 r1 = (defpackage.vt3) r1     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L12
            r1.s()     // Catch: java.lang.Throwable -> Lc
            hu3 r1 = r1.d()     // Catch: java.lang.Throwable -> Lc
            r3.h(r1)     // Catch: java.lang.Throwable -> Lc
            goto L12
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    public final void k(defpackage.vt3 r7) {
            r6 = this;
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            hu3 r1 = r7.d()     // Catch: java.lang.Throwable -> L53
            zi0 r7 = r7.L     // Catch: java.lang.Throwable -> L53
            yf0 r7 = r7.R     // Catch: java.lang.Throwable -> L53
            my r2 = new my     // Catch: java.lang.Throwable -> L53
            int r3 = java.lang.System.identityHashCode(r1)     // Catch: java.lang.Throwable -> L53
            r2.<init>(r3, r7)     // Catch: java.lang.Throwable -> L53
            java.util.HashMap r7 = r6.b     // Catch: java.lang.Throwable -> L53
            r7.remove(r2)     // Catch: java.lang.Throwable -> L53
            java.util.HashSet r7 = new java.util.HashSet     // Catch: java.lang.Throwable -> L53
            r7.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.HashMap r3 = r6.c     // Catch: java.lang.Throwable -> L53
            java.util.Set r3 = r3.keySet()     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L53
        L28:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L55
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L53
            yt3 r4 = (defpackage.yt3) r4     // Catch: java.lang.Throwable -> L53
            hu3 r5 = r4.B     // Catch: java.lang.Throwable -> L53
            boolean r5 = r1.equals(r5)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L28
            java.util.HashMap r5 = r6.c     // Catch: java.lang.Throwable -> L53
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Throwable -> L53
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L53
            r5.remove(r2)     // Catch: java.lang.Throwable -> L53
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L28
            hu3 r4 = r4.B     // Catch: java.lang.Throwable -> L53
            r7.add(r4)     // Catch: java.lang.Throwable -> L53
            goto L28
        L53:
            r6 = move-exception
            goto L6b
        L55:
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L53
        L59:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L69
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L53
            hu3 r1 = (defpackage.hu3) r1     // Catch: java.lang.Throwable -> L53
            r6.l(r1)     // Catch: java.lang.Throwable -> L53
            goto L59
        L69:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            return
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            throw r6
    }

    public final void l(defpackage.hu3 r5) {
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            yt3 r1 = r4.c(r5)     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r4 = move-exception
            goto L3e
        Ld:
            r4.h(r5)     // Catch: java.lang.Throwable -> Lb
            java.util.HashMap r5 = r4.c     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> Lb
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> Lb
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lb
        L1c:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> Lb
            my r2 = (defpackage.my) r2     // Catch: java.lang.Throwable -> Lb
            java.util.HashMap r3 = r4.b     // Catch: java.lang.Throwable -> Lb
            r3.remove(r2)     // Catch: java.lang.Throwable -> Lb
            goto L1c
        L2e:
            java.util.HashMap r4 = r4.c     // Catch: java.lang.Throwable -> Lb
            r4.remove(r1)     // Catch: java.lang.Throwable -> Lb
            hu3 r4 = r1.B     // Catch: java.lang.Throwable -> Lb
            ut3 r4 = r4.getLifecycle()     // Catch: java.lang.Throwable -> Lb
            r4.c(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r4
    }

    public final void m(defpackage.hu3 r4) {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            yt3 r4 = r3.c(r4)     // Catch: java.lang.Throwable -> L38
            java.util.HashMap r1 = r3.c     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L38
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L38
        L13:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L38
            my r1 = (defpackage.my) r1     // Catch: java.lang.Throwable -> L38
            java.util.HashMap r2 = r3.b     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L38
            vt3 r1 = (defpackage.vt3) r1     // Catch: java.lang.Throwable -> L38
            r1.getClass()     // Catch: java.lang.Throwable -> L38
            java.util.List r2 = r1.g()     // Catch: java.lang.Throwable -> L38
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r2 != 0) goto L13
            r1.t()     // Catch: java.lang.Throwable -> L38
            goto L13
        L38:
            r3 = move-exception
            goto L3c
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r3
    }
}
