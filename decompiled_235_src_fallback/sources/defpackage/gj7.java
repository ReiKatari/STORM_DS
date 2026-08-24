package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gj7  reason: default package */
/* loaded from: classes.dex */
public final class gj7 {
    public final defpackage.tg0 a;
    public final defpackage.ze0 b;
    public final defpackage.u63 c;
    public final defpackage.sy7 d;
    public final defpackage.wz3 e;
    public final defpackage.sh0 f;
    public final defpackage.n55 g;
    public final defpackage.n55 h;
    public final defpackage.ij0 i;
    public final defpackage.pf0 j;
    public final java.lang.Object k;
    public final java.util.LinkedHashSet l;
    public final java.util.LinkedHashSet m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final java.util.LinkedHashSet q;
    public final defpackage.v54 r;
    public final defpackage.dv6 s;
    public final defpackage.ci t;
    public final defpackage.ro5 u;
    public volatile defpackage.ib1 v;
    public final java.util.ArrayList w;
    public final java.util.Set x;

    public gj7(defpackage.tg0 r1, defpackage.ze0 r2, defpackage.u63 r3, defpackage.sy7 r4, defpackage.wz3 r5, java.util.Set r6, defpackage.dc0 r7, defpackage.sh0 r8, defpackage.yg1 r9, defpackage.n55 r10, defpackage.n55 r11, defpackage.a42 r12, defpackage.sg0 r13, defpackage.ij0 r14, defpackage.pf0 r15, android.content.Context r16, defpackage.al1 r17) {
            r0 = this;
            r2.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r13.getClass()
            r15.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r8
            r0.g = r9
            r0.h = r11
            r0.i = r14
            r1 = r15
            r0.j = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.k = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.l = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.m = r1
            r1 = 1
            r0.o = r1
            r0.p = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.q = r1
            v54 r1 = new v54
            u54 r2 = new u54
            r2.<init>()
            r3 = r17
            r1.<init>(r13, r2, r3)
            r0.r = r1
            dv6 r1 = new dv6
            lg0 r2 = r13.b
            x31 r3 = defpackage.x92.k
            r5 = r16
            r1.<init>(r5, r2, r12, r3)
            r0.s = r1
            ci r1 = new ci
            r1.<init>(r2)
            r0.t = r1
            ro5 r1 = new ro5
            r2 = 25
            r1.<init>(r0, r2)
            r0.u = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.w = r1
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r1 = defpackage.gt0.o1(r6)
            r1.add(r7)
            r0.x = r1
            return
    }

    public final void a(defpackage.di7 r3) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.k
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = r2.m     // Catch: java.lang.Throwable -> L12
            boolean r3 = r1.add(r3)     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L14
            r2.l()     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r2 = move-exception
            goto L16
        L14:
            monitor-exit(r0)
            return
        L16:
            monitor-exit(r0)
            throw r2
    }

    public final boolean b(java.util.LinkedHashSet r4) {
            r3 = this;
            ij0 r0 = r3.i
            go4 r0 = r0.A
            xx r1 = defpackage.ij0.h0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.b(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L16
            goto L2a
        L16:
            java.util.LinkedHashSet r0 = r3.l
            v54 r2 = r3.r
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L2a
            boolean r0 = r3.j(r4)
            if (r0 == 0) goto L2a
            r3.c()
            return r1
        L2a:
            v54 r0 = r3.r
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L64
            boolean r4 = r3.j(r4)
            if (r4 != 0) goto L64
            v54 r4 = r3.r
            r4.getClass()
            java.lang.Object r0 = r3.k
            monitor-enter(r0)
            java.util.LinkedHashSet r2 = r3.m     // Catch: java.lang.Throwable -> L4c
            boolean r2 = r2.remove(r4)     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L4e
            r3.l()     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r3 = move-exception
            goto L62
        L4e:
            monitor-exit(r0)
            java.util.List r0 = defpackage.hf.b0(r4)
            r3.g(r0)
            n55 r3 = r3.g
            java.lang.Object r3 = r3.get()
            eg0 r3 = (defpackage.eg0) r3
            r4.D(r3)
            return r1
        L62:
            monitor-exit(r0)
            throw r3
        L64:
            r3 = 0
            return r3
    }

    public final void c() {
            r3 = this;
            n55 r0 = r3.g
            java.lang.Object r0 = r0.get()
            eg0 r0 = (defpackage.eg0) r0
            v54 r1 = r3.r
            r2 = 0
            r1.b(r0, r2, r2, r2)
            android.util.Size r0 = defpackage.w54.a
            p87 r0 = defpackage.yy.a(r0)
            yy r0 = r0.a()
            r1.F(r0, r2)
            java.util.List r0 = defpackage.hf.b0(r1)
            r3.d(r0)
            r3.a(r1)
            return
    }

    public final void d(java.util.List r7) {
            r6 = this;
            java.lang.String r0 = "Attaching "
            java.lang.String r1 = "Attach [] from "
            java.lang.Object r2 = r6.k
            monitor-enter(r2)
            boolean r3 = r7.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2f
            boolean r7 = defpackage.kj2.L()     // Catch: java.lang.Throwable -> L2a
            if (r7 == 0) goto L2d
            java.lang.String r7 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            r0.append(r6)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = " (Ignored)"
            r0.append(r6)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L2a
            android.util.Log.w(r7, r6)     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r6 = move-exception
            goto Lcd
        L2d:
            monitor-exit(r2)
            return
        L2f:
            java.lang.String r1 = "CXCP"
            boolean r1 = defpackage.kj2.F(r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L50
            java.lang.String r1 = "CXCP"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            r3.append(r7)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = " from "
            r3.append(r0)     // Catch: java.lang.Throwable -> L2a
            r3.append(r6)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L2a
            android.util.Log.d(r1, r0)     // Catch: java.lang.Throwable -> L2a
        L50:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            r0.<init>()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r1 = r7.iterator()     // Catch: java.lang.Throwable -> L2a
        L59:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L72
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L2a
            r4 = r3
            di7 r4 = (defpackage.di7) r4     // Catch: java.lang.Throwable -> L2a
            java.util.LinkedHashSet r5 = r6.l     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r5.contains(r4)     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L59
            r0.add(r3)     // Catch: java.lang.Throwable -> L2a
            goto L59
        L72:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L2a
            r3 = 0
            r4 = r3
        L78:
            if (r4 >= r1) goto L86
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L2a
            int r4 = r4 + 1
            di7 r5 = (defpackage.di7) r5     // Catch: java.lang.Throwable -> L2a
            r5.w()     // Catch: java.lang.Throwable -> L2a
            goto L78
        L86:
            java.util.LinkedHashSet r1 = r6.l     // Catch: java.lang.Throwable -> L2a
            boolean r7 = r1.addAll(r7)     // Catch: java.lang.Throwable -> L2a
            if (r7 == 0) goto Laf
            java.util.LinkedHashSet r7 = r6.l     // Catch: java.lang.Throwable -> L2a
            java.util.LinkedHashSet r1 = r6.m     // Catch: java.lang.Throwable -> L2a
            java.util.LinkedHashSet r7 = defpackage.gt0.M0(r7, r1)     // Catch: java.lang.Throwable -> L2a
            boolean r7 = r6.b(r7)     // Catch: java.lang.Throwable -> L2a
            if (r7 != 0) goto Laf
            r6.n()     // Catch: java.lang.Throwable -> L2a
            wz3 r7 = r6.e     // Catch: java.lang.Throwable -> L2a
            java.util.LinkedHashSet r1 = r6.l     // Catch: java.lang.Throwable -> L2a
            java.util.List r1 = defpackage.gt0.k1(r1)     // Catch: java.lang.Throwable -> L2a
            r7.a(r1)     // Catch: java.lang.Throwable -> L2a
            java.util.LinkedHashSet r7 = r6.l     // Catch: java.lang.Throwable -> L2a
            r6.k(r7)     // Catch: java.lang.Throwable -> L2a
        Laf:
            boolean r7 = r6.o     // Catch: java.lang.Throwable -> L2a
            if (r7 != 0) goto Lb9
            java.util.LinkedHashSet r6 = r6.q     // Catch: java.lang.Throwable -> L2a
            r6.addAll(r0)     // Catch: java.lang.Throwable -> L2a
            goto Lcb
        Lb9:
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L2a
        Lbd:
            if (r3 >= r6) goto Lcb
            java.lang.Object r7 = r0.get(r3)     // Catch: java.lang.Throwable -> L2a
            int r3 = r3 + 1
            di7 r7 = (defpackage.di7) r7     // Catch: java.lang.Throwable -> L2a
            r7.u()     // Catch: java.lang.Throwable -> L2a
            goto Lbd
        Lcb:
            monitor-exit(r2)
            return
        Lcd:
            monitor-exit(r2)
            throw r6
    }

    public final java.lang.Object e(defpackage.hw6 r3) {
            r2 = this;
            java.lang.Object r0 = r2.k
            monitor-enter(r0)
            r2.f()     // Catch: java.lang.Throwable -> L1e
            v54 r1 = r2.r     // Catch: java.lang.Throwable -> L1e
            r1.A()     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList r2 = r2.w     // Catch: java.lang.Throwable -> L1e
            java.util.List r2 = defpackage.gt0.k1(r2)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            java.lang.Object r2 = defpackage.n16.F(r2, r3)
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            if (r2 != r3) goto L1b
            return r2
        L1b:
            jg7 r2 = defpackage.jg7.a
            return r2
        L1e:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public final void f() {
            r6 = this;
            ii7 r0 = r6.h()
            r1 = 0
            r6.v = r1
            ze0 r2 = r6.b
            n55 r3 = r6.h
            java.lang.Object r3 = r3.get()
            zf0 r3 = (defpackage.zf0) r3
            r2.getClass()
            r3.getClass()
            java.lang.Object r4 = r2.b
            monitor-enter(r4)
            boolean r5 = r2.f     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L4f
            java.util.ArrayList r2 = r2.d     // Catch: java.lang.Throwable -> L45
            java.lang.Class<lg0> r5 = defpackage.lg0.class
            ar0 r5 = defpackage.gh5.a(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.Object r3 = defpackage.jw2.H(r3, r5)     // Catch: java.lang.Throwable -> L45
            lg0 r3 = (defpackage.lg0) r3     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L33
            qc0 r3 = (defpackage.qc0) r3     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r3.A     // Catch: java.lang.Throwable -> L45
            goto L34
        L33:
            r3 = r1
        L34:
            if (r3 == 0) goto L3c
            xf0 r5 = new xf0     // Catch: java.lang.Throwable -> L45
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L45
            goto L3d
        L3c:
            r5 = r1
        L3d:
            if (r5 == 0) goto L47
            java.lang.String r3 = r5.a     // Catch: java.lang.Throwable -> L45
            r2.remove(r3)     // Catch: java.lang.Throwable -> L45
            goto L4f
        L45:
            r6 = move-exception
            goto L87
        L47:
            java.lang.String r6 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L45
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L4f:
            monitor-exit(r4)
            if (r0 == 0) goto L82
            sw r2 = r0.h
            boolean r2 = r2.a()
            if (r2 == 0) goto L6e
            li7 r2 = r0.c
            r2.close()
            kj7 r2 = r0.b
            o41 r2 = r2.f
            ns3 r3 = new ns3
            r3.<init>(r1, r0)
            r0 = 3
            ap6 r0 = defpackage.hv.L(r2, r1, r1, r3, r0)
            goto L74
        L6e:
            jg7 r0 = defpackage.jg7.a
            tu0 r0 = defpackage.u24.b(r0)
        L74:
            java.util.ArrayList r1 = r6.w
            r1.add(r0)
            ja7 r1 = new ja7
            r2 = 6
            r1.<init>(r2, r6, r0)
            r0.a0(r1)
        L82:
            java.lang.Object r6 = r6.k
            monitor-enter(r6)
            monitor-exit(r6)
            return
        L87:
            monitor-exit(r4)
            throw r6
    }

    public final void g(java.util.List r5) {
            r4 = this;
            java.lang.String r0 = "Detaching "
            java.lang.String r1 = "Detaching [] from "
            java.lang.Object r2 = r4.k
            monitor-enter(r2)
            boolean r3 = r5.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2f
            boolean r5 = defpackage.kj2.L()     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L2d
            java.lang.String r5 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            r0.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = " (Ignored)"
            r0.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L2a
            android.util.Log.w(r5, r4)     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r4 = move-exception
            goto Lb9
        L2d:
            monitor-exit(r2)
            return
        L2f:
            java.lang.String r1 = "CXCP"
            boolean r1 = defpackage.kj2.F(r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L50
            java.lang.String r1 = "CXCP"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            r3.append(r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = " from "
            r3.append(r0)     // Catch: java.lang.Throwable -> L2a
            r3.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L2a
            android.util.Log.d(r1, r0)     // Catch: java.lang.Throwable -> L2a
        L50:
            java.util.LinkedHashSet r0 = r4.m     // Catch: java.lang.Throwable -> L2a
            r0.removeAll(r5)     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r0 = r5.iterator()     // Catch: java.lang.Throwable -> L2a
        L59:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L71
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2a
            di7 r1 = (defpackage.di7) r1     // Catch: java.lang.Throwable -> L2a
            java.util.LinkedHashSet r3 = r4.l     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r3.contains(r1)     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L59
            r1.x()     // Catch: java.lang.Throwable -> L2a
            goto L59
        L71:
            java.util.LinkedHashSet r0 = r4.l     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r0.removeAll(r5)     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto Lb2
            java.util.LinkedHashSet r0 = r4.l     // Catch: java.lang.Throwable -> L2a
            java.util.LinkedHashSet r1 = r4.m     // Catch: java.lang.Throwable -> L2a
            java.util.LinkedHashSet r0 = defpackage.gt0.M0(r0, r1)     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r4.b(r0)     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L89
            monitor-exit(r2)
            return
        L89:
            java.util.LinkedHashSet r0 = r4.l     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L9f
            sy7 r0 = r4.d     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            r0.d(r1)     // Catch: java.lang.Throwable -> L2a
            wz3 r0 = r4.e     // Catch: java.lang.Throwable -> L2a
            yt1 r1 = defpackage.yt1.A     // Catch: java.lang.Throwable -> L2a
            r0.a(r1)     // Catch: java.lang.Throwable -> L2a
            goto Lad
        L9f:
            r4.n()     // Catch: java.lang.Throwable -> L2a
            wz3 r0 = r4.e     // Catch: java.lang.Throwable -> L2a
            java.util.LinkedHashSet r1 = r4.l     // Catch: java.lang.Throwable -> L2a
            java.util.List r1 = defpackage.gt0.k1(r1)     // Catch: java.lang.Throwable -> L2a
            r0.a(r1)     // Catch: java.lang.Throwable -> L2a
        Lad:
            java.util.LinkedHashSet r0 = r4.l     // Catch: java.lang.Throwable -> L2a
            r4.k(r0)     // Catch: java.lang.Throwable -> L2a
        Lb2:
            java.util.LinkedHashSet r4 = r4.q     // Catch: java.lang.Throwable -> L2a
            r4.removeAll(r5)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r2)
            return
        Lb9:
            monitor-exit(r2)
            throw r4
    }

    public final defpackage.ii7 h() {
            r0 = this;
            ib1 r0 = r0.v
            if (r0 == 0) goto Ld
            m55 r0 = r0.m
            java.lang.Object r0 = r0.get()
            ii7 r0 = (defpackage.ii7) r0
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public final int i() {
            r2 = this;
            java.lang.Object r0 = r2.k
            monitor-enter(r0)
            ze0 r2 = r2.b     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r2.b     // Catch: java.lang.Throwable -> L17
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L17
            int r2 = r2.e     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            r1 = 2
            if (r2 != r1) goto L11
            monitor-exit(r0)
            r2 = 1
            return r2
        L11:
            monitor-exit(r0)
            r2 = 0
            return r2
        L14:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public final boolean j(java.util.LinkedHashSet r35) {
            r34 = this;
            r0 = r34
            ij0 r1 = r0.i
            go4 r1 = r1.A
            xx r2 = defpackage.ij0.h0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.Object r1 = r1.b(r2, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L1a
        L16:
            r22 = 0
            goto L2f0
        L1a:
            boolean r1 = r35.isEmpty()
            if (r1 == 0) goto L21
            goto L16
        L21:
            java.util.Iterator r1 = r35.iterator()
        L25:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L16
            java.lang.Object r3 = r1.next()
            di7 r3 = (defpackage.di7) r3
            v54 r4 = r0.r
            boolean r5 = defpackage.nb3.k(r3, r4)
            if (r5 != 0) goto L2ec
            rc6 r3 = r3.o
            java.util.List r3 = r3.b()
            r3.getClass()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L2ec
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.LinkedHashSet r3 = r0.l
            java.util.Iterator r3 = r3.iterator()
        L53:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r3.next()
            r6 = r5
            di7 r6 = (defpackage.di7) r6
            boolean r6 = defpackage.nb3.k(r6, r4)
            if (r6 != 0) goto L53
            r1.add(r5)
            goto L53
        L6a:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L71
            goto L16
        L71:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L78
            goto L16
        L78:
            pc6 r3 = new pc6
            r3.<init>()
            int r5 = r1.size()
            r6 = 0
        L82:
            if (r6 >= r5) goto L92
            java.lang.Object r7 = r1.get(r6)
            int r6 = r6 + 1
            di7 r7 = (defpackage.di7) r7
            rc6 r7 = r7.o
            r3.a(r7)
            goto L82
        L92:
            rc6 r3 = r3.b()
            ek0 r5 = r3.g
            java.util.ArrayList r5 = r5.a
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            r5.getClass()
            java.util.List r3 = r3.b()
            r3.getClass()
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto Lb0
            goto L16
        Lb0:
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto Lb8
        Lb6:
            r3 = 1
            goto Ld3
        Lb8:
            java.util.Iterator r3 = r3.iterator()
        Lbc:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Lb6
            java.lang.Object r6 = r3.next()
            ig1 r6 = (defpackage.ig1) r6
            java.lang.Class r6 = r6.j
            java.lang.Class<android.media.MediaCodec> r8 = android.media.MediaCodec.class
            boolean r6 = defpackage.nb3.k(r6, r8)
            if (r6 != 0) goto Lbc
            r3 = 0
        Ld3:
            boolean r5 = r5.isEmpty()
            if (r3 != 0) goto Ldb
            if (r5 == 0) goto L16
        Ldb:
            android.util.Size r3 = r4.c()
            if (r3 != 0) goto Lef
            android.util.Size r3 = defpackage.w54.a
            p87 r3 = defpackage.yy.a(r3)
            yy r3 = r3.a()
            r5 = 0
            r4.F(r3, r5)
        Lef:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r5 = r1.size()
            r6 = 0
        Lf9:
            dv6 r8 = r0.s
            java.lang.String r9 = "CXCP"
            if (r6 >= r5) goto L1a2
            java.lang.Object r10 = r1.get(r6)
            int r6 = r6 + 1
            di7 r10 = (defpackage.di7) r10
            android.util.Size r14 = r10.c()
            yy r11 = r10.i
            if (r14 == 0) goto L111
            if (r11 != 0) goto L117
        L111:
            r35 = 1
            r22 = 0
            goto L193
        L117:
            int r9 = r0.i()
            zi7 r12 = r10.h
            int r12 = r12.q()
            zi7 r13 = r10.h
            tr6 r13 = r13.w()
            jv6 r12 = r8.p(r9, r12, r14, r13)
            zi7 r8 = r10.h
            int r13 = r8.q()
            yq1 r15 = r11.c
            boolean r8 = r10 instanceof defpackage.pr6
            if (r8 == 0) goto L14f
            r8 = r10
            pr6 r8 = (defpackage.pr6) r8
            zi7 r8 = r8.h
            r8.getClass()
            qr6 r8 = (defpackage.qr6) r8
            xx r9 = defpackage.qr6.B
            java.lang.Object r8 = r8.e(r9)
            java.util.List r8 = (java.util.List) r8
            r8.getClass()
        L14c:
            r16 = r8
            goto L15a
        L14f:
            zi7 r8 = r10.h
            bj7 r8 = r8.x()
            java.util.List r8 = defpackage.hf.b0(r8)
            goto L14c
        L15a:
            yy0 r8 = r11.f
            if (r8 != 0) goto L162
            da4 r8 = defpackage.da4.d()
        L162:
            r17 = r8
            int r8 = r11.d
            android.util.Range r9 = r11.e
            zi7 r11 = r10.h
            r22 = 0
            xx r2 = defpackage.zi7.O
            r35 = 1
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r11.b(r2, r7)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.util.Objects.requireNonNull(r2)
            boolean r20 = r2.booleanValue()
            zi7 r2 = r10.h
            int r21 = r2.A(r14)
            px r11 = new px
            r18 = r8
            r19 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3.add(r11)
            goto Lf9
        L193:
            boolean r2 = defpackage.kj2.L()
            if (r2 == 0) goto L19e
            java.lang.String r2 = "Invalid surface resolution or stream spec is found."
            android.util.Log.w(r9, r2)
        L19e:
            r3.clear()
            goto L1a6
        L1a2:
            r35 = 1
            r22 = 0
        L1a6:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L1b0
            r0 = r22
            goto L2e9
        L1b0:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r5 = r1.size()
            r6 = r22
        L1bb:
            if (r6 >= r5) goto L1fb
            java.lang.Object r7 = r1.get(r6)
            int r6 = r6 + 1
            di7 r7 = (defpackage.di7) r7
            rc6 r10 = r7.o
            java.util.List r10 = r10.b()
            r10.getClass()
            java.util.Iterator r10 = r10.iterator()
        L1d2:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L1bb
            java.lang.Object r11 = r10.next()
            ig1 r11 = (defpackage.ig1) r11
            int r12 = r0.i()
            zi7 r13 = r7.h
            int r13 = r13.q()
            android.util.Size r11 = r11.h
            r11.getClass()
            zi7 r14 = r7.h
            tr6 r14 = r14.w()
            jv6 r11 = r8.p(r12, r13, r11, r14)
            r2.add(r11)
            goto L1d2
        L1fb:
            bv6 r23 = new bv6
            int r24 = r0.i()
            zi7 r5 = r4.h
            java.util.List r5 = defpackage.hf.b0(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r22)
            java.util.List r6 = defpackage.hf.b0(r6)
            ci r7 = r0.t
            java.util.LinkedHashMap r3 = r7.o(r3, r5, r6)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L21d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L238
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            yq1 r5 = (defpackage.yq1) r5
            int r5 = r5.b
            r6 = 10
            if (r5 != r6) goto L21d
        L235:
            r25 = r6
            goto L23b
        L238:
            r6 = 8
            goto L235
        L23b:
            boolean r26 = defpackage.ej2.t(r1)
            h37 r3 = new h37
            r5 = 13
            r3.<init>(r5)
            in7 r27 = defpackage.ej2.I(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r5 = r1.size()
            r6 = r22
        L255:
            if (r6 >= r5) goto L265
            java.lang.Object r7 = r1.get(r6)
            int r6 = r6 + 1
            boolean r10 = r7 instanceof defpackage.d23
            if (r10 == 0) goto L255
            r3.add(r7)
            goto L255
        L265:
            java.lang.Object r1 = defpackage.gt0.J0(r3)
            d23 r1 = (defpackage.d23) r1
            if (r1 == 0) goto L27c
            zi7 r1 = r1.h
            if (r1 == 0) goto L27c
            int r1 = r1.q()
            r3 = 4101(0x1005, float:5.747E-42)
            if (r1 != r3) goto L27c
            r28 = r35
            goto L27e
        L27c:
            r28 = r22
        L27e:
            android.util.Range r32 = defpackage.yy.h
            r32.getClass()
            r33 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.addAll(r2)
            int r1 = r0.i()
            zi7 r3 = r4.h
            int r3 = r3.q()
            android.util.Size r5 = r4.c()
            r5.getClass()
            zi7 r6 = r4.h
            tr6 r6 = r6.w()
            jv6 r1 = r8.p(r1, r3, r5, r6)
            r14.add(r1)
            yt1 r16 = defpackage.yt1.A
            zt1 r15 = defpackage.zt1.A
            dv6 r12 = r0.s
            r17 = r16
            r13 = r23
            boolean r0 = r12.a(r13, r14, r15, r16, r17)
            boolean r1 = defpackage.kj2.F(r9)
            if (r1 == 0) goto L2e9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Combination of "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = " + "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " is supported: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r9, r1)
        L2e9:
            if (r0 == 0) goto L2f0
            return r35
        L2ec:
            r22 = 0
            goto L25
        L2f0:
            return r22
    }

    public final void k(java.util.LinkedHashSet r7) {
            r6 = this;
            r6.f()
            java.util.List r7 = defpackage.gt0.k1(r7)
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L28
            java.util.Set r6 = r6.x
            java.util.Iterator r6 = r6.iterator()
        L14:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L27
            java.lang.Object r7 = r6.next()
            gi7 r7 = (defpackage.gi7) r7
            r7.b(r1)
            r7.reset()
            goto L14
        L27:
            return
        L28:
            boolean r0 = r6.o
            if (r0 != 0) goto L42
            java.util.Set r0 = r6.x
            java.util.Iterator r0 = r0.iterator()
        L32:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r0.next()
            gi7 r2 = (defpackage.gi7) r2
            r2.b(r1)
            goto L32
        L42:
            qt2 r0 = new qt2
            sh0 r2 = r6.f
            r0.<init>(r2)
            java.lang.Object r2 = r6.k
            monitor-enter(r2)
            monitor-exit(r2)
            tc6 r2 = new tc6
            boolean r3 = r6.p
            r2.<init>(r7, r3)
            pf0 r7 = r6.j
            ro5 r3 = r6.u
            java.lang.Object r4 = r6.k
            monitor-enter(r4)
            monitor-exit(r4)
            r7.getClass()
            r3.getClass()
            u6 r4 = new u6
            r5 = 21
            r4.<init>(r2, r7, r0, r5)
            ex6 r7 = new ex6
            r7.<init>(r4)
            fi7 r4 = new fi7
            r4.<init>(r3, r0, r2, r7)
            boolean r7 = r6.o
            if (r7 != 0) goto Lc5
            ze0 r7 = r6.b
            n55 r6 = r6.h
            java.lang.Object r6 = r6.get()
            zf0 r6 = (defpackage.zf0) r6
            r7.getClass()
            r6.getClass()
            java.lang.Object r0 = r7.b
            monitor-enter(r0)
            boolean r2 = r7.f     // Catch: java.lang.Throwable -> Lb7
            if (r2 == 0) goto Lc1
            java.util.ArrayList r2 = r7.d     // Catch: java.lang.Throwable -> Lb7
            java.lang.Class<lg0> r3 = defpackage.lg0.class
            ar0 r3 = defpackage.gh5.a(r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r6 = defpackage.jw2.H(r6, r3)     // Catch: java.lang.Throwable -> Lb7
            lg0 r6 = (defpackage.lg0) r6     // Catch: java.lang.Throwable -> Lb7
            if (r6 == 0) goto La3
            qc0 r6 = (defpackage.qc0) r6     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r6 = r6.A     // Catch: java.lang.Throwable -> Lb7
            goto La4
        La3:
            r6 = r1
        La4:
            if (r6 == 0) goto Lab
            xf0 r1 = new xf0     // Catch: java.lang.Throwable -> Lb7
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Lb7
        Lab:
            if (r1 == 0) goto Lb9
            java.lang.String r6 = r1.a     // Catch: java.lang.Throwable -> Lb7
            r2.add(r6)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r6 = r7.b     // Catch: java.lang.Throwable -> Lb7
            monitor-enter(r6)     // Catch: java.lang.Throwable -> Lb7
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb7
            goto Lc1
        Lb7:
            r6 = move-exception
            goto Lc3
        Lb9:
            java.lang.String r6 = "Required value was null."
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb7
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Lb7
            throw r7     // Catch: java.lang.Throwable -> Lb7
        Lc1:
            monitor-exit(r0)
            return
        Lc3:
            monitor-exit(r0)
            throw r6
        Lc5:
            java.lang.String r7 = "CXCP"
            u63 r0 = r6.c
            ib1 r2 = new ib1
            java.lang.Object r3 = r0.B
            eb1 r3 = (defpackage.eb1) r3
            java.lang.Object r0 = r0.L
            gb1 r0 = (defpackage.gb1) r0
            r2.<init>(r3, r0, r4)
            r6.v = r2
            ii7 r0 = r6.h()
            if (r0 == 0) goto L158
            kj7 r2 = r0.b
            o41 r2 = r2.f
            y3 r3 = new y3
            r4 = 18
            r3.<init>(r1, r0, r4)
            r4 = 3
            defpackage.hv.L(r2, r1, r1, r3, r4)
            java.util.Set r2 = r6.x
            java.util.Iterator r2 = r2.iterator()
        Lf3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L105
            java.lang.Object r3 = r2.next()
            gi7 r3 = (defpackage.gi7) r3
            li7 r5 = r0.c
            r3.b(r5)
            goto Lf3
        L105:
            boolean r2 = r6.n
            kj7 r3 = r0.b
            o41 r3 = r3.f
            lo0 r5 = new lo0
            r5.<init>(r1, r0, r2)
            defpackage.hv.L(r3, r1, r1, r5, r4)
            java.util.LinkedHashSet r0 = r6.l
            java.util.LinkedHashSet r1 = r6.m
            java.util.LinkedHashSet r0 = defpackage.gt0.M0(r0, r1)
            r6.m(r0)
            boolean r0 = defpackage.kj2.F(r7)
            if (r0 == 0) goto L13c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Notifying "
            r0.<init>(r1)
            java.util.LinkedHashSet r1 = r6.q
            r0.append(r1)
            java.lang.String r1 = " camera control ready"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r7, r0)
        L13c:
            java.util.LinkedHashSet r7 = r6.q
            java.util.Iterator r7 = r7.iterator()
        L142:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L152
            java.lang.Object r0 = r7.next()
            di7 r0 = (defpackage.di7) r0
            r0.u()
            goto L142
        L152:
            java.util.LinkedHashSet r6 = r6.q
            r6.clear()
            return
        L158:
            java.lang.String r6 = "Required value was null."
            defpackage.i.m(r6)
            return
    }

    public final void l() {
            r4 = this;
            java.util.LinkedHashSet r0 = r4.l
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            java.util.LinkedHashSet r0 = r4.l
            java.util.LinkedHashSet r1 = r4.m
            java.util.LinkedHashSet r0 = defpackage.gt0.M0(r0, r1)
            ij0 r1 = r4.i
            go4 r1 = r1.A
            xx r2 = defpackage.ij0.h0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.Object r1 = r1.b(r2, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L26
            goto L3a
        L26:
            java.util.LinkedHashSet r1 = r4.l
            v54 r2 = r4.r
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L3a
            boolean r1 = r4.j(r0)
            if (r1 == 0) goto L3a
            r4.c()
            return
        L3a:
            v54 r1 = r4.r
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L74
            boolean r1 = r4.j(r0)
            if (r1 != 0) goto L74
            v54 r0 = r4.r
            r0.getClass()
            java.lang.Object r1 = r4.k
            monitor-enter(r1)
            java.util.LinkedHashSet r2 = r4.m     // Catch: java.lang.Throwable -> L5c
            boolean r2 = r2.remove(r0)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L5e
            r4.l()     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r4 = move-exception
            goto L72
        L5e:
            monitor-exit(r1)
            java.util.List r1 = defpackage.hf.b0(r0)
            r4.g(r1)
            n55 r4 = r4.g
            java.lang.Object r4 = r4.get()
            eg0 r4 = (defpackage.eg0) r4
            r0.D(r4)
            return
        L72:
            monitor-exit(r1)
            throw r4
        L74:
            r4.m(r0)
            return
    }

    public final void m(java.util.LinkedHashSet r3) {
            r2 = this;
            ii7 r0 = r2.h()
            if (r0 == 0) goto L29
            boolean r1 = r2.p
            li7 r0 = r0.c
            r0.g(r3, r1)
            java.util.Set r2 = r2.x
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r2.next()
            gi7 r0 = (defpackage.gi7) r0
            boolean r1 = r0 instanceof defpackage.fj7
            if (r1 == 0) goto L13
            fj7 r0 = (defpackage.fj7) r0
            r0.a(r3)
            goto L13
        L29:
            return
    }

    public final void n() {
            r5 = this;
            r0 = 0
            java.util.LinkedHashSet r1 = r5.l
            if (r1 == 0) goto Lc
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Lc
            goto L2f
        Lc:
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            di7 r2 = (defpackage.di7) r2
            zi7 r2 = r2.h
            xx r3 = defpackage.zi7.Q
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r2.b(r3, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L10
            r0 = 1
        L2f:
            sy7 r5 = r5.d
            r5.d(r0)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UseCaseManager<"
            r0.<init>(r1)
            pf0 r2 = r2.j
            r0.append(r2)
            r2 = 62
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
