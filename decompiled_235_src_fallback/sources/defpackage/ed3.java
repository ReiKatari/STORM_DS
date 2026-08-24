package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed3  reason: default package */
/* loaded from: classes.dex */
public class ed3 implements defpackage.rc3 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater A = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater B = null;
    public static final /* synthetic */ long L = 0;
    public static final /* synthetic */ long R = 0;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    static {
            java.lang.Class<ed3> r0 = defpackage.ed3.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_state$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.ed3.A = r3
            sun.misc.Unsafe r3 = defpackage.v36.a
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)
            long r4 = r3.objectFieldOffset(r2)
            defpackage.ed3.R = r4
            java.lang.String r2 = "_parentHandle$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.ed3.B = r1
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)
            long r0 = r3.objectFieldOffset(r0)
            defpackage.ed3.L = r0
            return
    }

    public ed3(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            rt1 r1 = defpackage.fd3.g
            goto La
        L8:
            rt1 r1 = defpackage.fd3.f
        La:
            r0._state$volatile = r1
            return
    }

    public static defpackage.iq0 g0(defpackage.ky3 r1) {
        L0:
            boolean r0 = r1.m()
            if (r0 == 0) goto Lb
            ky3 r1 = r1.l()
            goto L0
        Lb:
            ky3 r1 = r1.k()
            boolean r0 = r1.m()
            if (r0 != 0) goto Lb
            boolean r0 = r1 instanceof defpackage.iq0
            if (r0 == 0) goto L1c
            iq0 r1 = (defpackage.iq0) r1
            return r1
        L1c:
            boolean r0 = r1 instanceof defpackage.gg4
            if (r0 == 0) goto Lb
            r1 = 0
            return r1
    }

    public static java.lang.String p0(java.lang.Object r2) {
            boolean r0 = r2 instanceof defpackage.yc3
            java.lang.String r1 = "Active"
            if (r0 == 0) goto L1e
            yc3 r2 = (defpackage.yc3) r2
            boolean r0 = r2.d()
            if (r0 == 0) goto L11
            java.lang.String r2 = "Cancelling"
            return r2
        L11:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.yc3.B
            int r2 = r0.get(r2)
            r0 = 1
            if (r2 != r0) goto L1d
            java.lang.String r2 = "Completing"
            return r2
        L1d:
            return r1
        L1e:
            boolean r0 = r2 instanceof defpackage.e43
            if (r0 == 0) goto L2e
            e43 r2 = (defpackage.e43) r2
            boolean r2 = r2.e()
            if (r2 == 0) goto L2b
            return r1
        L2b:
            java.lang.String r2 = "New"
            return r2
        L2e:
            boolean r2 = r2 instanceof defpackage.av0
            if (r2 == 0) goto L35
            java.lang.String r2 = "Cancelled"
            return r2
        L35:
            java.lang.String r2 = "Completed"
            return r2
    }

    public final boolean B(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r2.Y()
            if (r0 == 0) goto L7
            goto L1f
        L7:
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            hq0 r2 = r2.P()
            if (r2 == 0) goto L21
            lg4 r1 = defpackage.lg4.A
            if (r2 != r1) goto L14
            goto L21
        L14:
            boolean r2 = r2.a(r3)
            if (r2 != 0) goto L1f
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r2 = 0
            return r2
        L1f:
            r2 = 1
            return r2
        L21:
            return r0
    }

    public java.lang.String C() {
            r0 = this;
            java.lang.String r0 = "Job was cancelled"
            return r0
    }

    @Override // defpackage.l61
    public final defpackage.l61 D(defpackage.k61 r1) {
            r0 = this;
            l61 r0 = defpackage.jw2.w(r0, r1)
            return r0
    }

    public boolean E(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L5
            goto L11
        L5:
            boolean r2 = r1.s(r2)
            if (r2 == 0) goto L13
            boolean r1 = r1.L()
            if (r1 == 0) goto L13
        L11:
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    public final void G(defpackage.e43 r7, java.lang.Object r8) {
            r6 = this;
            hq0 r0 = r6.P()
            if (r0 == 0) goto Le
            r0.dispose()
            lg4 r0 = defpackage.lg4.A
            r6.n0(r0)
        Le:
            boolean r0 = r8 instanceof defpackage.av0
            r1 = 0
            if (r0 == 0) goto L16
            av0 r8 = (defpackage.av0) r8
            goto L17
        L16:
            r8 = r1
        L17:
            if (r8 == 0) goto L1c
            java.lang.Throwable r8 = r8.a
            goto L1d
        L1c:
            r8 = r1
        L1d:
            boolean r0 = r7 instanceof defpackage.uc3
            java.lang.String r2 = " for "
            java.lang.String r3 = "Exception in completion handler "
            if (r0 == 0) goto L48
            r0 = r7
            uc3 r0 = (defpackage.uc3) r0     // Catch: java.lang.Throwable -> L2c
            r0.r(r8)     // Catch: java.lang.Throwable -> L2c
            return
        L2c:
            r8 = move-exception
            ug r0 = new ug
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r7)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r8)
            r6.S(r0)
            goto L99
        L48:
            gg4 r7 = r7.f()
            if (r7 == 0) goto L99
            lw3 r0 = new lw3
            r4 = 1
            r0.<init>(r4)
            r7.b(r0, r4)
            java.lang.Object r0 = r7.j()
            r0.getClass()
            ky3 r0 = (defpackage.ky3) r0
        L60:
            boolean r4 = r0.equals(r7)
            if (r4 != 0) goto L94
            boolean r4 = r0 instanceof defpackage.uc3
            if (r4 == 0) goto L8f
            r4 = r0
            uc3 r4 = (defpackage.uc3) r4     // Catch: java.lang.Throwable -> L71
            r4.r(r8)     // Catch: java.lang.Throwable -> L71
            goto L8f
        L71:
            r4 = move-exception
            if (r1 == 0) goto L78
            defpackage.mb3.q(r1, r4)
            goto L8f
        L78:
            ug r1 = new ug
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r0)
            r5.append(r2)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r4)
        L8f:
            ky3 r0 = r0.k()
            goto L60
        L94:
            if (r1 == 0) goto L99
            r6.S(r1)
        L99:
            return
    }

    public final java.lang.Throwable H(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r0 = 1
            goto L6
        L4:
            boolean r0 = r4 instanceof java.lang.Throwable
        L6:
            r1 = 0
            if (r0 == 0) goto L17
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 != 0) goto L16
            sc3 r4 = new sc3
            java.lang.String r0 = r3.C()
            r4.<init>(r0, r1, r3)
        L16:
            return r4
        L17:
            r4.getClass()
            ed3 r4 = (defpackage.ed3) r4
            java.lang.Object r3 = r4.Q()
            boolean r0 = r3 instanceof defpackage.yc3
            if (r0 == 0) goto L2c
            r0 = r3
            yc3 r0 = (defpackage.yc3) r0
            java.lang.Throwable r0 = r0.c()
            goto L3b
        L2c:
            boolean r0 = r3 instanceof defpackage.av0
            if (r0 == 0) goto L36
            r0 = r3
            av0 r0 = (defpackage.av0) r0
            java.lang.Throwable r0 = r0.a
            goto L3b
        L36:
            boolean r0 = r3 instanceof defpackage.e43
            if (r0 != 0) goto L54
            r0 = r1
        L3b:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L42
            r1 = r0
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
        L42:
            if (r1 != 0) goto L53
            sc3 r1 = new sc3
            java.lang.String r3 = p0(r3)
            java.lang.String r2 = "Parent job is "
            java.lang.String r3 = r2.concat(r3)
            r1.<init>(r3, r0, r4)
        L53:
            return r1
        L54:
            java.lang.String r4 = "Cannot be cancelling child in this state: "
            defpackage.e41.h(r3, r4)
            return r1
    }

    public final java.lang.Object I(defpackage.yc3 r11, java.lang.Object r12) {
            r10 = this;
            boolean r0 = r12 instanceof defpackage.av0
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r12
            av0 r0 = (defpackage.av0) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto Le
            java.lang.Throwable r1 = r0.a
        Le:
            monitor-enter(r11)
            r11.d()     // Catch: java.lang.Throwable -> Lad
            java.util.ArrayList r0 = r11.g(r1)     // Catch: java.lang.Throwable -> Lad
            java.lang.Throwable r2 = r10.K(r11, r0)     // Catch: java.lang.Throwable -> Lad
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L57
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L53
            if (r5 > r4) goto L25
            goto L57
        L25:
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L53
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap     // Catch: java.lang.Throwable -> L53
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L53
            java.util.Set r5 = java.util.Collections.newSetFromMap(r6)     // Catch: java.lang.Throwable -> L53
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L53
            r7 = r3
        L37:
            if (r7 >= r6) goto L57
            java.lang.Object r8 = r0.get(r7)     // Catch: java.lang.Throwable -> L53
            int r7 = r7 + 1
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch: java.lang.Throwable -> L53
            if (r8 == r2) goto L37
            if (r8 == r2) goto L37
            boolean r9 = r8 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L53
            if (r9 != 0) goto L37
            boolean r9 = r5.add(r8)     // Catch: java.lang.Throwable -> L53
            if (r9 == 0) goto L37
            defpackage.mb3.q(r2, r8)     // Catch: java.lang.Throwable -> L53
            goto L37
        L53:
            r0 = move-exception
            r10 = r0
            r7 = r11
            goto Lb0
        L57:
            monitor-exit(r11)
            if (r2 != 0) goto L5b
            goto L63
        L5b:
            if (r2 != r1) goto L5e
            goto L63
        L5e:
            av0 r12 = new av0
            r12.<init>(r2, r3)
        L63:
            if (r2 == 0) goto L7c
            boolean r0 = r10.B(r2)
            if (r0 != 0) goto L71
            boolean r0 = r10.R(r2)
            if (r0 == 0) goto L7c
        L71:
            r12.getClass()
            r0 = r12
            av0 r0 = (defpackage.av0) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.av0.b
            r1.compareAndSet(r0, r3, r4)
        L7c:
            r10.i0(r12)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ed3.A
            boolean r1 = r12 instanceof defpackage.e43
            if (r1 == 0) goto L8f
            f43 r1 = new f43
            r2 = r12
            e43 r2 = (defpackage.e43) r2
            r1.<init>(r2)
            r8 = r1
            goto L90
        L8f:
            r8 = r12
        L90:
            r0.getClass()
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.ed3.R
            r4 = r10
            r7 = r11
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r10 == 0) goto La0
            goto La6
        La0:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r5)
            if (r10 == r7) goto Laa
        La6:
            r4.G(r7, r12)
            return r12
        Laa:
            r10 = r4
            r11 = r7
            goto L90
        Lad:
            r0 = move-exception
            r7 = r11
            r10 = r0
        Lb0:
            monitor-exit(r7)
            throw r10
    }

    public final java.lang.Object J() {
            r1 = this;
            java.lang.Object r1 = r1.Q()
            boolean r0 = r1 instanceof defpackage.e43
            if (r0 != 0) goto L16
            boolean r0 = r1 instanceof defpackage.av0
            if (r0 != 0) goto L11
            java.lang.Object r1 = defpackage.fd3.a(r1)
            return r1
        L11:
            av0 r1 = (defpackage.av0) r1
            java.lang.Throwable r1 = r1.a
            throw r1
        L16:
            java.lang.String r1 = "This job has not completed yet"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    public final java.lang.Throwable K(defpackage.yc3 r5, java.util.ArrayList r6) {
            r4 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L18
            boolean r5 = r5.d()
            if (r5 == 0) goto L17
            sc3 r5 = new sc3
            java.lang.String r6 = r4.C()
            r5.<init>(r6, r1, r4)
            return r5
        L17:
            return r1
        L18:
            int r4 = r6.size()
            r5 = 0
            r0 = r5
        L1e:
            if (r0 >= r4) goto L2e
            java.lang.Object r2 = r6.get(r0)
            int r0 = r0 + 1
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L1e
            goto L2f
        L2e:
            r2 = r1
        L2f:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L34
            return r2
        L34:
            java.lang.Object r4 = r6.get(r5)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r0 = r4 instanceof defpackage.c67
            if (r0 == 0) goto L59
            int r0 = r6.size()
        L42:
            if (r5 >= r0) goto L54
            java.lang.Object r2 = r6.get(r5)
            int r5 = r5 + 1
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == r4) goto L42
            boolean r3 = r3 instanceof defpackage.c67
            if (r3 == 0) goto L42
            r1 = r2
        L54:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L59
            return r1
        L59:
            return r4
    }

    public boolean L() {
            r0 = this;
            r0 = 1
            return r0
    }

    public boolean M() {
            r0 = this;
            boolean r0 = r0 instanceof defpackage.tu0
            return r0
    }

    @Override // defpackage.l61
    public final defpackage.l61 N(defpackage.l61 r1) {
            r0 = this;
            l61 r0 = defpackage.jw2.y(r0, r1)
            return r0
    }

    public final defpackage.gg4 O(defpackage.e43 r3) {
            r2 = this;
            gg4 r0 = r3.f()
            if (r0 != 0) goto L21
            boolean r0 = r3 instanceof defpackage.rt1
            if (r0 == 0) goto L10
            gg4 r2 = new gg4
            r2.<init>()
            return r2
        L10:
            boolean r0 = r3 instanceof defpackage.uc3
            r1 = 0
            if (r0 == 0) goto L1b
            uc3 r3 = (defpackage.uc3) r3
            r2.l0(r3)
            return r1
        L1b:
            java.lang.String r2 = "State should have list: "
            defpackage.e41.h(r3, r2)
            return r1
        L21:
            return r0
    }

    public final defpackage.hq0 P() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ed3.B
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ed3.L
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            hq0 r3 = (defpackage.hq0) r3
            return r3
    }

    public final java.lang.Object Q() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ed3.A
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ed3.R
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            return r3
    }

    public boolean R(java.lang.Throwable r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public void S(defpackage.ug r1) {
            r0 = this;
            throw r1
    }

    public final void T(defpackage.rc3 r3) {
            r2 = this;
            lg4 r0 = defpackage.lg4.A
            if (r3 != 0) goto L8
            r2.n0(r0)
            return
        L8:
            r3.start()
            hq0 r3 = r3.r(r2)
            r2.n0(r3)
            boolean r1 = r2.W()
            if (r1 == 0) goto L1e
            r3.dispose()
            r2.n0(r0)
        L1e:
            return
    }

    @Override // defpackage.rc3
    public final defpackage.m44 U() {
            r3 = this;
            m44 r0 = new m44
            dd3 r1 = defpackage.dd3.d0
            r2 = 3
            defpackage.ge7.p(r2, r1)
            r0.<init>(r3, r1)
            return r0
    }

    public final defpackage.il1 V(boolean r7, defpackage.uc3 r8) {
            r6 = this;
            r8.Z = r6
        L2:
            java.lang.Object r4 = r6.Q()
            boolean r0 = r4 instanceof defpackage.rt1
            if (r0 == 0) goto L33
            r0 = r4
            rt1 r0 = (defpackage.rt1) r0
            boolean r1 = r0.A
            if (r1 == 0) goto L2d
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ed3.A
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.ed3.R
            r1 = r6
            r5 = r8
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L23
            goto L74
        L23:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L2a
            goto L75
        L2a:
            r6 = r1
            r8 = r5
            goto L11
        L2d:
            r1 = r6
            r5 = r8
            r1.k0(r0)
            goto L75
        L33:
            r1 = r6
            r5 = r8
            boolean r6 = r4 instanceof defpackage.e43
            lg4 r8 = defpackage.lg4.A
            r0 = 0
            if (r6 == 0) goto L78
            r6 = r4
            e43 r6 = (defpackage.e43) r6
            gg4 r2 = r6.f()
            if (r2 != 0) goto L4b
            uc3 r4 = (defpackage.uc3) r4
            r1.l0(r4)
            goto L75
        L4b:
            boolean r3 = r5.q()
            if (r3 == 0) goto L6d
            boolean r3 = r6 instanceof defpackage.yc3
            if (r3 == 0) goto L58
            yc3 r6 = (defpackage.yc3) r6
            goto L59
        L58:
            r6 = r0
        L59:
            if (r6 == 0) goto L5f
            java.lang.Throwable r0 = r6.c()
        L5f:
            if (r0 != 0) goto L67
            r6 = 5
            boolean r6 = r2.b(r5, r6)
            goto L72
        L67:
            if (r7 == 0) goto L8d
            r5.r(r0)
            return r8
        L6d:
            r6 = 1
            boolean r6 = r2.b(r5, r6)
        L72:
            if (r6 == 0) goto L75
        L74:
            return r5
        L75:
            r6 = r1
            r8 = r5
            goto L2
        L78:
            if (r7 == 0) goto L8d
            java.lang.Object r6 = r1.Q()
            boolean r7 = r6 instanceof defpackage.av0
            if (r7 == 0) goto L85
            av0 r6 = (defpackage.av0) r6
            goto L86
        L85:
            r6 = r0
        L86:
            if (r6 == 0) goto L8a
            java.lang.Throwable r0 = r6.a
        L8a:
            r5.r(r0)
        L8d:
            return r8
    }

    public final boolean W() {
            r0 = this;
            java.lang.Object r0 = r0.Q()
            boolean r0 = r0 instanceof defpackage.e43
            r0 = r0 ^ 1
            return r0
    }

    public boolean Y() {
            r0 = this;
            boolean r0 = r0 instanceof defpackage.k50
            return r0
    }

    @Override // defpackage.l61
    public final defpackage.j61 Z(defpackage.k61 r1) {
            r0 = this;
            j61 r0 = defpackage.jw2.p(r0, r1)
            return r0
    }

    @Override // defpackage.rc3
    public final defpackage.il1 a0(defpackage.qn2 r2) {
            r1 = this;
            cc3 r0 = new cc3
            r0.<init>(r2)
            r2 = 1
            il1 r1 = r1.V(r2, r0)
            return r1
    }

    public final boolean b0(java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.Q()
            java.lang.Object r0 = r3.s0(r0, r4)
            gr1 r1 = defpackage.fd3.a
            if (r0 != r1) goto Le
            r3 = 0
            return r3
        Le:
            gr1 r1 = defpackage.fd3.b
            r2 = 1
            if (r0 != r1) goto L14
            return r2
        L14:
            gr1 r1 = defpackage.fd3.c
            if (r0 == r1) goto L0
            r3.d(r0)
            return r2
    }

    @Override // defpackage.rc3
    public final java.lang.Object c0(defpackage.s41 r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.Q()
            boolean r1 = r0 instanceof defpackage.e43
            jg7 r2 = defpackage.jg7.a
            if (r1 != 0) goto L12
            l61 r3 = r4.b()
            defpackage.yh2.o(r3)
            return r2
        L12:
            int r0 = r3.o0(r0)
            if (r0 < 0) goto L0
            rj0 r0 = new rj0
            r41 r4 = defpackage.np2.V(r4)
            r1 = 1
            r0.<init>(r1, r4)
            r0.v()
            jm5 r4 = new jm5
            r4.<init>(r0)
            il1 r3 = defpackage.yh2.y(r3, r1, r4)
            kj0 r4 = new kj0
            r1 = 2
            r4.<init>(r3, r1)
            r0.A(r4)
            java.lang.Object r3 = r0.s()
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L40
            goto L41
        L40:
            r3 = r2
        L41:
            if (r3 != r4) goto L44
            return r3
        L44:
            return r2
    }

    public void d(java.lang.Object r1) {
            r0 = this;
            return
    }

    public final java.lang.Object d0(java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.Q()
            java.lang.Object r0 = r3.s0(r0, r4)
            gr1 r1 = defpackage.fd3.a
            if (r0 != r1) goto L35
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Job "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " is already complete or completing, but is being completed with "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            boolean r1 = r4 instanceof defpackage.av0
            r2 = 0
            if (r1 == 0) goto L2c
            av0 r4 = (defpackage.av0) r4
            goto L2d
        L2c:
            r4 = r2
        L2d:
            if (r4 == 0) goto L31
            java.lang.Throwable r2 = r4.a
        L31:
            r0.<init>(r3, r2)
            throw r0
        L35:
            gr1 r1 = defpackage.fd3.c
            if (r0 == r1) goto L0
            return r0
    }

    @Override // defpackage.rc3
    public boolean e() {
            r1 = this;
            java.lang.Object r1 = r1.Q()
            boolean r0 = r1 instanceof defpackage.e43
            if (r0 == 0) goto L12
            e43 r1 = (defpackage.e43) r1
            boolean r1 = r1.e()
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    @Override // defpackage.rc3
    public final defpackage.il1 e0(boolean r1, boolean r2, defpackage.a0 r3) {
            r0 = this;
            if (r1 == 0) goto L8
            bc3 r1 = new bc3
            r1.<init>(r3)
            goto Ld
        L8:
            cc3 r1 = new cc3
            r1.<init>(r3)
        Ld:
            il1 r0 = r0.V(r2, r1)
            return r0
    }

    public java.lang.String f0() {
            r0 = this;
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    public void g(java.lang.Object r1) {
            r0 = this;
            r0.d(r1)
            return
    }

    @Override // defpackage.j61
    public final defpackage.k61 getKey() {
            r0 = this;
            vs0 r0 = defpackage.vs0.h0
            return r0
    }

    @Override // defpackage.rc3
    public void h(java.util.concurrent.CancellationException r3) {
            r2 = this;
            if (r3 != 0) goto Lc
            sc3 r3 = new sc3
            java.lang.String r0 = r2.C()
            r1 = 0
            r3.<init>(r0, r1, r2)
        Lc:
            r2.z(r3)
            return
    }

    public final void h0(defpackage.gg4 r6, java.lang.Throwable r7) {
            r5 = this;
            lw3 r0 = new lw3
            r1 = 4
            r0.<init>(r1)
            r6.b(r0, r1)
            java.lang.Object r0 = r6.j()
            r0.getClass()
            ky3 r0 = (defpackage.ky3) r0
            r1 = 0
        L13:
            boolean r2 = r0.equals(r6)
            if (r2 != 0) goto L54
            boolean r2 = r0 instanceof defpackage.uc3
            if (r2 == 0) goto L4f
            r2 = r0
            uc3 r2 = (defpackage.uc3) r2
            boolean r2 = r2.q()
            if (r2 == 0) goto L4f
            r2 = r0
            uc3 r2 = (defpackage.uc3) r2     // Catch: java.lang.Throwable -> L2d
            r2.r(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r2 = move-exception
            if (r1 == 0) goto L34
            defpackage.mb3.q(r1, r2)
            goto L4f
        L34:
            ug r1 = new ug
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception in completion handler "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " for "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3, r2)
        L4f:
            ky3 r0 = r0.k()
            goto L13
        L54:
            if (r1 == 0) goto L59
            r5.S(r1)
        L59:
            r5.B(r7)
            return
    }

    public void i0(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // defpackage.rc3
    public final boolean isCancelled() {
            r1 = this;
            java.lang.Object r1 = r1.Q()
            boolean r0 = r1 instanceof defpackage.av0
            if (r0 != 0) goto L17
            boolean r0 = r1 instanceof defpackage.yc3
            if (r0 == 0) goto L15
            yc3 r1 = (defpackage.yc3) r1
            boolean r1 = r1.d()
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = 0
            return r1
        L17:
            r1 = 1
            return r1
    }

    public void j0() {
            r0 = this;
            return
    }

    public java.lang.Object k() {
            r0 = this;
            java.lang.Object r0 = r0.J()
            return r0
    }

    public final void k0(defpackage.rt1 r9) {
            r8 = this;
            gg4 r0 = new gg4
            r0.<init>()
            boolean r1 = r9.A
            if (r1 == 0) goto Lb
            r7 = r0
            goto L11
        Lb:
            b43 r1 = new b43
            r1.<init>(r0)
            r7 = r1
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ed3.A
            r0.getClass()
            sun.misc.Unsafe r2 = defpackage.v36.a
            long r4 = defpackage.ed3.R
            r3 = r8
            r6 = r9
            boolean r8 = r2.compareAndSwapObject(r3, r4, r6, r7)
            if (r8 == 0) goto L23
            goto L29
        L23:
            java.lang.Object r8 = r2.getObjectVolatile(r3, r4)
            if (r8 == r6) goto L2a
        L29:
            return
        L2a:
            r8 = r3
            r9 = r6
            goto L11
    }

    public final void l0(defpackage.uc3 r8) {
            r7 = this;
            gg4 r0 = new gg4
            r0.<init>()
            r8.d(r0)
            ky3 r6 = r8.k()
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ed3.A
            r0.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r3 = defpackage.ed3.R
            r2 = r7
            r5 = r8
            boolean r7 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r7 == 0) goto L1e
            goto L24
        L1e:
            java.lang.Object r7 = r1.getObjectVolatile(r2, r3)
            if (r7 == r5) goto L25
        L24:
            return
        L25:
            r7 = r2
            r8 = r5
            goto Lc
    }

    public final void m0(defpackage.uc3 r7) {
            r6 = this;
        L0:
            java.lang.Object r4 = r6.Q()
            boolean r0 = r4 instanceof defpackage.uc3
            if (r0 == 0) goto L28
            if (r4 == r7) goto Lb
            goto L37
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ed3.A
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.ed3.R
            rt1 r5 = defpackage.fd3.g
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L1e
            goto L37
        L1e:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L26
            r6 = r1
            goto L0
        L26:
            r6 = r1
            goto Lb
        L28:
            boolean r6 = r4 instanceof defpackage.e43
            if (r6 == 0) goto L37
            e43 r4 = (defpackage.e43) r4
            gg4 r6 = r4.f()
            if (r6 == 0) goto L37
            r7.n()
        L37:
            return
    }

    public final void n0(defpackage.hq0 r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ed3.B
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ed3.L
            r0.putObjectVolatile(r3, r1, r4)
            return
    }

    public final int o0(java.lang.Object r13) {
            r12 = this;
            boolean r0 = r13 instanceof defpackage.rt1
            long r1 = defpackage.ed3.R
            r3 = 1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.ed3.A
            if (r0 == 0) goto L30
            r0 = r13
            rt1 r0 = (defpackage.rt1) r0
            boolean r0 = r0.A
            if (r0 == 0) goto L11
            goto L59
        L11:
            r4.getClass()
            sun.misc.Unsafe r5 = defpackage.v36.a
            long r7 = defpackage.ed3.R
            rt1 r10 = defpackage.fd3.g
            r6 = r12
            r9 = r13
            boolean r12 = r5.compareAndSwapObject(r6, r7, r9, r10)
            if (r12 == 0) goto L26
            r6.j0()
            return r3
        L26:
            java.lang.Object r12 = r5.getObjectVolatile(r6, r1)
            if (r12 == r9) goto L2d
            goto L57
        L2d:
            r12 = r6
            r13 = r9
            goto L11
        L30:
            r6 = r12
            r9 = r13
            boolean r12 = r9 instanceof defpackage.b43
            if (r12 == 0) goto L59
            r13 = r9
            b43 r13 = (defpackage.b43) r13
            gg4 r11 = r13.A
        L3b:
            r4.getClass()
            r7 = r6
            sun.misc.Unsafe r6 = defpackage.v36.a
            r10 = r9
            long r8 = defpackage.ed3.R
            boolean r12 = r6.compareAndSwapObject(r7, r8, r10, r11)
            r13 = r6
            r6 = r7
            r9 = r10
            if (r12 == 0) goto L51
            r6.j0()
            return r3
        L51:
            java.lang.Object r12 = r13.getObjectVolatile(r6, r1)
            if (r12 == r9) goto L3b
        L57:
            r12 = -1
            return r12
        L59:
            r12 = 0
            return r12
    }

    public final java.lang.Object q(defpackage.r41 r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.Q()
            boolean r1 = r0 instanceof defpackage.e43
            if (r1 != 0) goto L16
            boolean r2 = r0 instanceof defpackage.av0
            if (r2 != 0) goto L11
            java.lang.Object r2 = defpackage.fd3.a(r0)
            return r2
        L11:
            av0 r0 = (defpackage.av0) r0
            java.lang.Throwable r2 = r0.a
            throw r2
        L16:
            int r0 = r2.o0(r0)
            if (r0 < 0) goto L0
            wc3 r0 = new wc3
            r41 r3 = defpackage.np2.V(r3)
            r0.<init>(r3, r2)
            r0.v()
            im5 r3 = new im5
            r3.<init>(r0)
            r1 = 1
            il1 r2 = defpackage.yh2.y(r2, r1, r3)
            kj0 r3 = new kj0
            r1 = 2
            r3.<init>(r2, r1)
            r0.A(r3)
            java.lang.Object r2 = r0.s()
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            return r2
    }

    public final boolean q0(defpackage.e43 r9, java.lang.Object r10) {
            r8 = this;
            boolean r0 = r10 instanceof defpackage.e43
            if (r0 == 0) goto Le
            f43 r0 = new f43
            r1 = r10
            e43 r1 = (defpackage.e43) r1
            r0.<init>(r1)
            r7 = r0
            goto Lf
        Le:
            r7 = r10
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ed3.A
            r0.getClass()
            sun.misc.Unsafe r2 = defpackage.v36.a
            long r4 = defpackage.ed3.R
            r3 = r8
            r6 = r9
            boolean r8 = r2.compareAndSwapObject(r3, r4, r6, r7)
            if (r8 == 0) goto L28
            r3.i0(r10)
            r3.G(r6, r10)
            r8 = 1
            return r8
        L28:
            java.lang.Object r8 = r2.getObjectVolatile(r3, r4)
            if (r8 == r6) goto L30
            r8 = 0
            return r8
        L30:
            r8 = r3
            r9 = r6
            goto Lf
    }

    @Override // defpackage.rc3
    public final defpackage.hq0 r(defpackage.ed3 r7) {
            r6 = this;
            iq0 r5 = new iq0
            r5.<init>(r7)
            r5.Z = r6
        L7:
            java.lang.Object r4 = r6.Q()
            boolean r7 = r4 instanceof defpackage.rt1
            if (r7 == 0) goto L35
            r7 = r4
            rt1 r7 = (defpackage.rt1) r7
            boolean r0 = r7.A
            if (r0 == 0) goto L30
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.ed3.A
            r7.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.ed3.R
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L27
            goto L7a
        L27:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L2e
            goto L4b
        L2e:
            r6 = r1
            goto L16
        L30:
            r1 = r6
            r1.k0(r7)
            goto L4b
        L35:
            r1 = r6
            boolean r6 = r4 instanceof defpackage.e43
            lg4 r7 = defpackage.lg4.A
            r0 = 0
            if (r6 == 0) goto L7c
            r6 = r4
            e43 r6 = (defpackage.e43) r6
            gg4 r6 = r6.f()
            if (r6 != 0) goto L4d
            uc3 r4 = (defpackage.uc3) r4
            r1.l0(r4)
        L4b:
            r6 = r1
            goto L7
        L4d:
            r2 = 7
            boolean r2 = r6.b(r5, r2)
            if (r2 == 0) goto L55
            goto L7a
        L55:
            r2 = 3
            boolean r6 = r6.b(r5, r2)
            java.lang.Object r1 = r1.Q()
            boolean r2 = r1 instanceof defpackage.yc3
            if (r2 == 0) goto L69
            yc3 r1 = (defpackage.yc3) r1
            java.lang.Throwable r0 = r1.c()
            goto L75
        L69:
            boolean r2 = r1 instanceof defpackage.av0
            if (r2 == 0) goto L70
            av0 r1 = (defpackage.av0) r1
            goto L71
        L70:
            r1 = r0
        L71:
            if (r1 == 0) goto L75
            java.lang.Throwable r0 = r1.a
        L75:
            r5.r(r0)
            if (r6 == 0) goto L7b
        L7a:
            return r5
        L7b:
            return r7
        L7c:
            java.lang.Object r6 = r1.Q()
            boolean r1 = r6 instanceof defpackage.av0
            if (r1 == 0) goto L87
            av0 r6 = (defpackage.av0) r6
            goto L88
        L87:
            r6 = r0
        L88:
            if (r6 == 0) goto L8c
            java.lang.Throwable r0 = r6.a
        L8c:
            r5.r(r0)
            return r7
    }

    public final boolean r0(defpackage.e43 r8, java.lang.Throwable r9) {
            r7 = this;
            gg4 r0 = r7.O(r8)
            if (r0 != 0) goto L7
            goto L28
        L7:
            yc3 r6 = new yc3
            r6.<init>(r0, r9)
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.ed3.A
            r1.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r3 = defpackage.ed3.R
            r2 = r7
            r5 = r8
            boolean r7 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r7 == 0) goto L22
            r2.h0(r0, r9)
            r7 = 1
            return r7
        L22:
            java.lang.Object r7 = r1.getObjectVolatile(r2, r3)
            if (r7 == r5) goto L2a
        L28:
            r7 = 0
            return r7
        L2a:
            r7 = r2
            r8 = r5
            goto Lc
    }

    public final boolean s(java.lang.Object r8) {
            r7 = this;
            gr1 r0 = defpackage.fd3.a
            boolean r1 = r7.M()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3c
        La:
            java.lang.Object r0 = r7.Q()
            boolean r1 = r0 instanceof defpackage.e43
            if (r1 == 0) goto L34
            boolean r1 = r0 instanceof defpackage.yc3
            if (r1 == 0) goto L22
            r1 = r0
            yc3 r1 = (defpackage.yc3) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.yc3.B
            int r1 = r4.get(r1)
            if (r1 != r3) goto L22
            goto L34
        L22:
            av0 r1 = new av0
            java.lang.Throwable r4 = r7.H(r8)
            r1.<init>(r4, r2)
            java.lang.Object r0 = r7.s0(r0, r1)
            gr1 r1 = defpackage.fd3.c
            if (r0 == r1) goto La
            goto L36
        L34:
            gr1 r0 = defpackage.fd3.a
        L36:
            gr1 r1 = defpackage.fd3.b
            if (r0 != r1) goto L3c
            goto Lcf
        L3c:
            gr1 r1 = defpackage.fd3.a
            if (r0 != r1) goto Lc6
            r0 = 0
            r1 = r0
        L42:
            java.lang.Object r4 = r7.Q()
            boolean r5 = r4 instanceof defpackage.yc3
            if (r5 == 0) goto L8e
            monitor-enter(r4)
            r5 = r4
            yc3 r5 = (defpackage.yc3) r5     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L5c
            gr1 r6 = defpackage.fd3.e     // Catch: java.lang.Throwable -> L5c
            if (r5 != r6) goto L5e
            gr1 r8 = defpackage.fd3.d     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r4)
        L59:
            r0 = r8
            goto Lc6
        L5c:
            r7 = move-exception
            goto L8c
        L5e:
            r5 = r4
            yc3 r5 = (defpackage.yc3) r5     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r5.d()     // Catch: java.lang.Throwable -> L5c
            if (r8 != 0) goto L69
            if (r5 != 0) goto L75
        L69:
            if (r1 != 0) goto L6f
            java.lang.Throwable r1 = r7.H(r8)     // Catch: java.lang.Throwable -> L5c
        L6f:
            r8 = r4
            yc3 r8 = (defpackage.yc3) r8     // Catch: java.lang.Throwable -> L5c
            r8.a(r1)     // Catch: java.lang.Throwable -> L5c
        L75:
            r8 = r4
            yc3 r8 = (defpackage.yc3) r8     // Catch: java.lang.Throwable -> L5c
            java.lang.Throwable r8 = r8.c()     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L7f
            r0 = r8
        L7f:
            monitor-exit(r4)
            if (r0 == 0) goto L89
            yc3 r4 = (defpackage.yc3) r4
            gg4 r8 = r4.A
            r7.h0(r8, r0)
        L89:
            gr1 r8 = defpackage.fd3.a
            goto L59
        L8c:
            monitor-exit(r4)
            throw r7
        L8e:
            boolean r5 = r4 instanceof defpackage.e43
            if (r5 == 0) goto Lc3
            if (r1 != 0) goto L98
            java.lang.Throwable r1 = r7.H(r8)
        L98:
            r5 = r4
            e43 r5 = (defpackage.e43) r5
            boolean r6 = r5.e()
            if (r6 == 0) goto Laa
            boolean r4 = r7.r0(r5, r1)
            if (r4 == 0) goto L42
            gr1 r8 = defpackage.fd3.a
            goto L59
        Laa:
            av0 r5 = new av0
            r5.<init>(r1, r2)
            java.lang.Object r5 = r7.s0(r4, r5)
            gr1 r6 = defpackage.fd3.a
            if (r5 == r6) goto Lbd
            gr1 r4 = defpackage.fd3.c
            if (r5 == r4) goto L42
            r0 = r5
            goto Lc6
        Lbd:
            java.lang.String r7 = "Cannot happen in "
            defpackage.e41.h(r4, r7)
            return r2
        Lc3:
            gr1 r8 = defpackage.fd3.d
            goto L59
        Lc6:
            gr1 r8 = defpackage.fd3.a
            if (r0 != r8) goto Lcb
            goto Lcf
        Lcb:
            gr1 r8 = defpackage.fd3.b
            if (r0 != r8) goto Ld0
        Lcf:
            return r3
        Ld0:
            gr1 r8 = defpackage.fd3.d
            if (r0 != r8) goto Ld5
            return r2
        Ld5:
            r7.d(r0)
            return r3
    }

    public final java.lang.Object s0(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            boolean r0 = r7 instanceof defpackage.e43
            if (r0 != 0) goto L7
            gr1 r6 = defpackage.fd3.a
            return r6
        L7:
            boolean r0 = r7 instanceof defpackage.rt1
            if (r0 != 0) goto Lf
            boolean r0 = r7 instanceof defpackage.uc3
            if (r0 == 0) goto L23
        Lf:
            boolean r0 = r7 instanceof defpackage.iq0
            if (r0 != 0) goto L23
            boolean r0 = r8 instanceof defpackage.av0
            if (r0 != 0) goto L23
            e43 r7 = (defpackage.e43) r7
            boolean r6 = r6.q0(r7, r8)
            if (r6 == 0) goto L20
            return r8
        L20:
            gr1 r6 = defpackage.fd3.c
            return r6
        L23:
            e43 r7 = (defpackage.e43) r7
            gg4 r0 = r6.O(r7)
            if (r0 != 0) goto L2e
            gr1 r6 = defpackage.fd3.c
            return r6
        L2e:
            boolean r1 = r7 instanceof defpackage.yc3
            r2 = 0
            if (r1 == 0) goto L37
            r1 = r7
            yc3 r1 = (defpackage.yc3) r1
            goto L38
        L37:
            r1 = r2
        L38:
            if (r1 != 0) goto L3f
            yc3 r1 = new yc3
            r1.<init>(r0, r2)
        L3f:
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.yc3.B     // Catch: java.lang.Throwable -> L52
            int r4 = r3.get(r1)     // Catch: java.lang.Throwable -> L52
            r5 = 1
            if (r4 != r5) goto L4b
            r4 = r5
            goto L4c
        L4b:
            r4 = 0
        L4c:
            if (r4 == 0) goto L54
            gr1 r6 = defpackage.fd3.a     // Catch: java.lang.Throwable -> L52
            monitor-exit(r1)
            return r6
        L52:
            r6 = move-exception
            goto Lb9
        L54:
            r3.set(r1, r5)     // Catch: java.lang.Throwable -> L52
            if (r1 == r7) goto L6c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.ed3.A     // Catch: java.lang.Throwable -> L52
        L5b:
            boolean r4 = r3.compareAndSet(r6, r7, r1)     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L62
            goto L6c
        L62:
            java.lang.Object r4 = r3.get(r6)     // Catch: java.lang.Throwable -> L52
            if (r4 == r7) goto L5b
            gr1 r6 = defpackage.fd3.c     // Catch: java.lang.Throwable -> L52
            monitor-exit(r1)
            return r6
        L6c:
            boolean r7 = r1.d()     // Catch: java.lang.Throwable -> L52
            boolean r3 = r8 instanceof defpackage.av0     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L78
            r3 = r8
            av0 r3 = (defpackage.av0) r3     // Catch: java.lang.Throwable -> L52
            goto L79
        L78:
            r3 = r2
        L79:
            if (r3 == 0) goto L80
            java.lang.Throwable r3 = r3.a     // Catch: java.lang.Throwable -> L52
            r1.a(r3)     // Catch: java.lang.Throwable -> L52
        L80:
            java.lang.Throwable r3 = r1.c()     // Catch: java.lang.Throwable -> L52
            if (r7 != 0) goto L87
            r2 = r3
        L87:
            monitor-exit(r1)
            if (r2 == 0) goto L8d
            r6.h0(r0, r2)
        L8d:
            iq0 r7 = g0(r0)
            if (r7 == 0) goto L9c
            boolean r7 = r6.t0(r1, r7, r8)
            if (r7 == 0) goto L9c
            gr1 r6 = defpackage.fd3.b
            return r6
        L9c:
            lw3 r7 = new lw3
            r2 = 2
            r7.<init>(r2)
            r0.b(r7, r2)
            iq0 r7 = g0(r0)
            if (r7 == 0) goto Lb4
            boolean r7 = r6.t0(r1, r7, r8)
            if (r7 == 0) goto Lb4
            gr1 r6 = defpackage.fd3.b
            return r6
        Lb4:
            java.lang.Object r6 = r6.I(r1, r8)
            return r6
        Lb9:
            monitor-exit(r1)
            throw r6
    }

    @Override // defpackage.rc3
    public final boolean start() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.Q()
            int r0 = r2.o0(r0)
            if (r0 == 0) goto Lf
            r1 = 1
            if (r0 == r1) goto Le
            goto L0
        Le:
            return r1
        Lf:
            r2 = 0
            return r2
    }

    public final boolean t0(defpackage.yc3 r4, defpackage.iq0 r5, java.lang.Object r6) {
            r3 = this;
        L0:
            ed3 r0 = r5.d0
            xc3 r1 = new xc3
            r1.<init>(r3, r4, r5, r6)
            r2 = 0
            il1 r0 = defpackage.yh2.y(r0, r2, r1)
            lg4 r1 = defpackage.lg4.A
            if (r0 == r1) goto L12
            r3 = 1
            return r3
        L12:
            iq0 r5 = g0(r5)
            if (r5 != 0) goto L0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.f0()
            r1.append(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            java.lang.Object r2 = r3.Q()
            java.lang.String r2 = p0(r2)
            r1.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r3 = defpackage.nc1.P(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // defpackage.rc3
    public final java.util.concurrent.CancellationException v() {
            r4 = this;
            java.lang.Object r0 = r4.Q()
            boolean r1 = r0 instanceof defpackage.yc3
            java.lang.String r2 = "Job is still new or active: "
            r3 = 0
            if (r1 == 0) goto L35
            yc3 r0 = (defpackage.yc3) r0
            java.lang.Throwable r0 = r0.c()
            if (r0 == 0) goto L31
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " is cancelling"
            java.lang.String r1 = r1.concat(r2)
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L28
            r3 = r0
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L28:
            if (r3 != 0) goto L30
            sc3 r2 = new sc3
            r2.<init>(r1, r0, r4)
            return r2
        L30:
            return r3
        L31:
            defpackage.e41.h(r4, r2)
            return r3
        L35:
            boolean r1 = r0 instanceof defpackage.e43
            if (r1 != 0) goto L69
            boolean r1 = r0 instanceof defpackage.av0
            if (r1 == 0) goto L55
            av0 r0 = (defpackage.av0) r0
            java.lang.Throwable r0 = r0.a
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L48
            r3 = r0
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L48:
            if (r3 != 0) goto L54
            sc3 r1 = new sc3
            java.lang.String r2 = r4.C()
            r1.<init>(r2, r0, r4)
            return r1
        L54:
            return r3
        L55:
            sc3 r0 = new sc3
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " has completed normally"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1, r3, r4)
            return r0
        L69:
            defpackage.e41.h(r4, r2)
            return r3
    }

    @Override // defpackage.l61
    public final java.lang.Object x(defpackage.eo2 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r0 = r1.o(r2, r0)
            return r0
    }

    public void z(java.lang.Throwable r1) {
            r0 = this;
            r0.s(r1)
            return
    }
}
