package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rj0  reason: default package */
/* loaded from: classes.dex */
public class rj0 extends defpackage.qk1 implements defpackage.qj0, defpackage.y61, defpackage.zr7 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater Y = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater Z = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater d0 = null;
    public static final /* synthetic */ long e0 = 0;
    public static final /* synthetic */ long f0 = 0;
    public final defpackage.r41 R;
    public final defpackage.l61 X;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    static {
            java.lang.String r0 = "_decisionAndIndex$volatile"
            java.lang.Class<rj0> r1 = defpackage.rj0.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            defpackage.rj0.Y = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "_state$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            defpackage.rj0.Z = r3
            sun.misc.Unsafe r3 = defpackage.v36.a
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r4 = r3.objectFieldOffset(r2)
            defpackage.rj0.f0 = r4
            java.lang.String r2 = "_parentHandle$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            defpackage.rj0.d0 = r0
            java.lang.reflect.Field r0 = r1.getDeclaredField(r2)
            long r0 = r3.objectFieldOffset(r0)
            defpackage.rj0.e0 = r0
            return
    }

    public rj0(int r1, defpackage.r41 r2) {
            r0 = this;
            r0.<init>(r1)
            r0.R = r2
            l61 r1 = r2.b()
            r0.X = r1
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r0._decisionAndIndex$volatile = r1
            l8 r1 = defpackage.l8.A
            r0._state$volatile = r1
            return
    }

    public static void C(java.lang.Object r3, java.lang.Object r4) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "It's prohibited to register multiple handlers, tried to register "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ", already has "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static java.lang.Object J(defpackage.sg4 r6, java.lang.Object r7, int r8, defpackage.fo2 r9) {
            boolean r0 = r7 instanceof defpackage.av0
            if (r0 == 0) goto L5
            return r7
        L5:
            r0 = 1
            if (r8 == r0) goto Ld
            r0 = 2
            if (r8 != r0) goto Lc
            goto Ld
        Lc:
            return r7
        Ld:
            if (r9 != 0) goto L14
            boolean r8 = r6 instanceof defpackage.lj0
            if (r8 != 0) goto L14
            return r7
        L14:
            yu0 r0 = new yu0
            boolean r8 = r6 instanceof defpackage.lj0
            if (r8 == 0) goto L1e
            lj0 r6 = (defpackage.lj0) r6
        L1c:
            r2 = r6
            goto L20
        L1e:
            r6 = 0
            goto L1c
        L20:
            r4 = 0
            r5 = 16
            r1 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final void A(defpackage.sg4 r11) {
            r10 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.rj0.Z
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.rj0.f0
            java.lang.Object r7 = r0.getObjectVolatile(r10, r1)
            boolean r0 = r7 instanceof defpackage.l8
            if (r0 == 0) goto L29
        L11:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.rj0.f0
            r4 = r10
            r8 = r11
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r10 == 0) goto L1f
            goto Lc2
        L1f:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r1)
            if (r10 == r7) goto L27
            goto Lc9
        L27:
            r10 = r4
            goto L11
        L29:
            r4 = r10
            boolean r10 = r7 instanceof defpackage.lj0
            r0 = 0
            if (r10 != 0) goto Lce
            boolean r10 = r7 instanceof defpackage.p96
            if (r10 != 0) goto Lce
            boolean r10 = r7 instanceof defpackage.av0
            if (r10 == 0) goto L61
            r10 = r7
            av0 r10 = (defpackage.av0) r10
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.av0.b
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r10, r2, r3)
            if (r1 == 0) goto L5d
            boolean r0 = r7 instanceof defpackage.vj0
            if (r0 == 0) goto Lc2
            java.lang.Throwable r10 = r10.a
            boolean r0 = r11 instanceof defpackage.lj0
            if (r0 == 0) goto L54
            lj0 r11 = (defpackage.lj0) r11
            r4.l(r11, r10)
            return
        L54:
            r11.getClass()
            p96 r11 = (defpackage.p96) r11
            r4.n(r11, r10)
            return
        L5d:
            C(r11, r7)
            throw r0
        L61:
            boolean r10 = r7 instanceof defpackage.yu0
            if (r10 == 0) goto L9d
            r10 = r7
            yu0 r10 = (defpackage.yu0) r10
            lj0 r3 = r10.b
            if (r3 != 0) goto L99
            boolean r3 = r11 instanceof defpackage.p96
            if (r3 == 0) goto L71
            return
        L71:
            r11.getClass()
            r3 = r11
            lj0 r3 = (defpackage.lj0) r3
            java.lang.Throwable r5 = r10.e
            if (r5 == 0) goto L7f
            r4.l(r3, r5)
            return
        L7f:
            r5 = 29
            yu0 r8 = defpackage.yu0.a(r10, r3, r0, r5)
        L85:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.rj0.f0
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r9 = r4
            if (r10 == 0) goto L91
            goto Lc2
        L91:
            java.lang.Object r10 = r3.getObjectVolatile(r9, r1)
            r4 = r9
            if (r10 == r7) goto L85
            goto Lc9
        L99:
            C(r11, r7)
            throw r0
        L9d:
            r9 = r4
            boolean r10 = r11 instanceof defpackage.p96
            if (r10 == 0) goto La3
            return
        La3:
            r11.getClass()
            r5 = r11
            lj0 r5 = (defpackage.lj0) r5
            yu0 r3 = new yu0
            r4 = r7
            r7 = 0
            r8 = 28
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r7 = r4
        Lb4:
            r8 = r3
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.rj0.f0
            r4 = r9
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r0 = r3
            r3 = r8
            if (r10 == 0) goto Lc3
        Lc2:
            return
        Lc3:
            java.lang.Object r10 = r0.getObjectVolatile(r4, r1)
            if (r10 == r7) goto Lcc
        Lc9:
            r10 = r4
            goto L0
        Lcc:
            r9 = r4
            goto Lb4
        Lce:
            C(r11, r7)
            throw r0
    }

    public final boolean B() {
            r2 = this;
            int r0 = r2.L
            r1 = 2
            if (r0 != r1) goto L11
            r41 r2 = r2.R
            nk1 r2 = (defpackage.nk1) r2
            boolean r2 = r2.o()
            if (r2 == 0) goto L11
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    public java.lang.String D() {
            r0 = this;
            java.lang.String r0 = "CancellableContinuation"
            return r0
    }

    public final void E() {
            r2 = this;
            r41 r0 = r2.R
            boolean r1 = r0 instanceof defpackage.nk1
            if (r1 == 0) goto L9
            nk1 r0 = (defpackage.nk1) r0
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L19
            java.lang.Throwable r0 = r0.q(r2)
            if (r0 != 0) goto L13
            goto L19
        L13:
            r2.o()
            r2.w(r0)
        L19:
            return
    }

    public final boolean F() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.rj0.Z
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.rj0.f0
            java.lang.Object r3 = r0.getObjectVolatile(r5, r1)
            boolean r4 = r3 instanceof defpackage.yu0
            if (r4 == 0) goto L1c
            yu0 r3 = (defpackage.yu0) r3
            java.lang.Object r3 = r3.d
            if (r3 == 0) goto L1c
            r5.o()
            r5 = 0
            return r5
        L1c:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.rj0.Y
            r4 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3.set(r5, r4)
            l8 r3 = defpackage.l8.A
            r0.putObjectVolatile(r5, r1, r3)
            r5 = 1
            return r5
    }

    public final void G(java.lang.Object r4, defpackage.qn2 r5) {
            r3 = this;
            int r0 = r3.L
            if (r5 == 0) goto Lb
            ov4 r1 = new ov4
            r2 = 4
            r1.<init>(r5, r2)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r3.H(r4, r0, r1)
            return
    }

    public final void H(java.lang.Object r10, int r11, defpackage.fo2 r12) {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.rj0.Z
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.rj0.f0
            java.lang.Object r7 = r0.getObjectVolatile(r9, r1)
            boolean r0 = r7 instanceof defpackage.sg4
            if (r0 == 0) goto L3a
            r0 = r7
            sg4 r0 = (defpackage.sg4) r0
            java.lang.Object r8 = J(r0, r10, r11, r12)
        L18:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.rj0.f0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L30
            boolean r9 = r4.B()
            if (r9 != 0) goto L2c
            r4.o()
        L2c:
            r4.p(r11)
            return
        L30:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L38
            r9 = r4
            goto L0
        L38:
            r9 = r4
            goto L18
        L3a:
            r4 = r9
            boolean r9 = r7 instanceof defpackage.vj0
            if (r9 == 0) goto L53
            vj0 r7 = (defpackage.vj0) r7
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = defpackage.vj0.c
            r11 = 0
            r0 = 1
            boolean r9 = r9.compareAndSet(r7, r11, r0)
            if (r9 == 0) goto L53
            if (r12 == 0) goto L52
            java.lang.Throwable r9 = r7.a
            r4.m(r12, r9, r10)
        L52:
            return
        L53:
            java.lang.String r9 = "Already resumed, but proposed with update "
            defpackage.e41.h(r10, r9)
            return
    }

    public final void I(defpackage.n61 r4, java.lang.Object r5) {
            r3 = this;
            r41 r0 = r3.R
            boolean r1 = r0 instanceof defpackage.nk1
            r2 = 0
            if (r1 == 0) goto La
            nk1 r0 = (defpackage.nk1) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L10
            n61 r0 = r0.R
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 != r4) goto L15
            r4 = 4
            goto L17
        L15:
            int r4 = r3.L
        L17:
            r3.H(r5, r4, r2)
            return
    }

    public final defpackage.gr1 K(java.lang.Object r10, defpackage.fo2 r11) {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.rj0.Z
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.rj0.f0
            java.lang.Object r7 = r0.getObjectVolatile(r9, r1)
            boolean r0 = r7 instanceof defpackage.sg4
            if (r0 == 0) goto L3b
            r0 = r7
            sg4 r0 = (defpackage.sg4) r0
            int r3 = r9.L
            java.lang.Object r8 = J(r0, r10, r3, r11)
        L1a:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.rj0.f0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L31
            boolean r9 = r4.B()
            gr1 r10 = defpackage.sj0.a
            if (r9 != 0) goto L30
            r4.o()
        L30:
            return r10
        L31:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L39
            r9 = r4
            goto L0
        L39:
            r9 = r4
            goto L1a
        L3b:
            r9 = 0
            return r9
    }

    @Override // defpackage.zr7
    public final void a(defpackage.p96 r5, int r6) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.rj0.Y
            int r1 = r0.get(r4)
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r1 & r2
            if (r3 != r2) goto L1c
            int r2 = r1 >> 29
            int r2 = r2 << 29
            int r2 = r2 + r6
            boolean r0 = r0.compareAndSet(r4, r1, r2)
            if (r0 == 0) goto L0
            r4.A(r5)
            return
        L1c:
            java.lang.String r4 = "invokeOnCancellation should be called at most once"
            defpackage.i.m(r4)
            return
    }

    @Override // defpackage.r41
    public final defpackage.l61 b() {
            r0 = this;
            l61 r0 = r0.X
            return r0
    }

    @Override // defpackage.qk1
    public final void c(java.util.concurrent.CancellationException r11) {
            r10 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.rj0.Z
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.rj0.f0
            java.lang.Object r7 = r0.getObjectVolatile(r10, r1)
            boolean r0 = r7 instanceof defpackage.sg4
            if (r0 != 0) goto L7f
            boolean r0 = r7 instanceof defpackage.av0
            if (r0 == 0) goto L17
            goto L73
        L17:
            boolean r0 = r7 instanceof defpackage.yu0
            if (r0 == 0) goto L57
            r0 = r7
            yu0 r0 = (defpackage.yu0) r0
            java.lang.Throwable r3 = r0.e
            if (r3 != 0) goto L51
            r3 = 0
            r4 = 15
            yu0 r8 = defpackage.yu0.a(r0, r3, r11, r4)
        L29:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.rj0.f0
            r4 = r10
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r9 = r4
            if (r10 == 0) goto L46
            lj0 r10 = r0.b
            if (r10 == 0) goto L3c
            r9.l(r10, r11)
        L3c:
            fo2 r10 = r0.c
            if (r10 == 0) goto L73
            java.lang.Object r0 = r0.a
            r9.m(r10, r11, r0)
            return
        L46:
            java.lang.Object r10 = r3.getObjectVolatile(r9, r1)
            if (r10 == r7) goto L4f
            r10 = r11
            r4 = r9
            goto L7a
        L4f:
            r10 = r9
            goto L29
        L51:
            java.lang.String r10 = "Must be called at most once"
            defpackage.i.m(r10)
            return
        L57:
            r9 = r10
            yu0 r3 = new yu0
            r6 = 0
            r8 = 14
            r5 = 0
            r4 = r7
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = r7
            r7 = r4
        L65:
            r8 = r3
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.rj0.f0
            r4 = r9
            boolean r11 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r0 = r3
            r3 = r8
            if (r11 == 0) goto L74
        L73:
            return
        L74:
            java.lang.Object r11 = r0.getObjectVolatile(r4, r1)
            if (r11 == r7) goto L7d
        L7a:
            r11 = r10
            r10 = r4
            goto L0
        L7d:
            r9 = r4
            goto L65
        L7f:
            java.lang.String r10 = "Not completed"
            defpackage.i.m(r10)
            return
    }

    @Override // defpackage.qk1
    public final defpackage.r41 d() {
            r0 = this;
            r41 r0 = r0.R
            return r0
    }

    @Override // defpackage.qk1
    public final java.lang.Throwable e(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r0 = super.e(r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // defpackage.y61
    public final defpackage.y61 f() {
            r1 = this;
            r41 r1 = r1.R
            boolean r0 = r1 instanceof defpackage.y61
            if (r0 == 0) goto L9
            y61 r1 = (defpackage.y61) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // defpackage.qk1
    public final java.lang.Object g(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.yu0
            if (r0 == 0) goto L9
            yu0 r1 = (defpackage.yu0) r1
            java.lang.Object r0 = r1.a
            return r0
        L9:
            return r1
    }

    @Override // defpackage.r41
    public final void i(java.lang.Object r3) {
            r2 = this;
            java.lang.Throwable r0 = defpackage.hm5.a(r3)
            if (r0 != 0) goto L7
            goto Ld
        L7:
            av0 r3 = new av0
            r1 = 0
            r3.<init>(r0, r1)
        Ld:
            int r0 = r2.L
            r1 = 0
            r2.H(r3, r0, r1)
            return
    }

    @Override // defpackage.qj0
    public final defpackage.gr1 j(java.lang.Object r1, defpackage.fo2 r2) {
            r0 = this;
            gr1 r0 = r0.K(r1, r2)
            return r0
    }

    @Override // defpackage.qk1
    public final java.lang.Object k() {
            r0 = this;
            java.lang.Object r0 = r0.u()
            return r0
    }

    public final void l(defpackage.lj0 r3, java.lang.Throwable r4) {
            r2 = this;
            r3.b(r4)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r3 = move-exception
            ug r4 = new ug
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception in invokeOnCancellation handler for "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r3)
            l61 r2 = r2.X
            defpackage.f04.H(r2, r4)
            return
    }

    public final void m(defpackage.fo2 r3, java.lang.Throwable r4, java.lang.Object r5) {
            r2 = this;
            l61 r0 = r2.X
            r3.e(r4, r5, r0)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r3 = move-exception
            ug r4 = new ug
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception in resume onCancellation handler for "
            r5.<init>(r1)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2, r3)
            defpackage.f04.H(r0, r4)
            return
    }

    public final void n(defpackage.p96 r4, java.lang.Throwable r5) {
            r3 = this;
            l61 r5 = r3.X
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.rj0.Y
            int r0 = r0.get(r3)
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r0 = r0 & r1
            if (r0 == r1) goto L2a
            r4.m(r0, r5)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r4 = move-exception
            ug r0 = new ug
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Exception in invokeOnCancellation handler for "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4)
            defpackage.f04.H(r5, r0)
            return
        L2a:
            java.lang.String r3 = "The index for Segment.onCancellation(..) is broken"
            defpackage.i.m(r3)
            return
    }

    public final void o() {
            r4 = this;
            il1 r0 = r4.r()
            if (r0 != 0) goto L7
            return
        L7:
            r0.dispose()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.rj0.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.rj0.e0
            lg4 r3 = defpackage.lg4.A
            r0.putObjectVolatile(r4, r1, r3)
            return
    }

    public final void p(int r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.rj0.Y
            int r1 = r0.get(r6)
            int r2 = r1 >> 29
            if (r2 == 0) goto L7a
            r0 = 1
            if (r2 != r0) goto L74
            r1 = 4
            r2 = 0
            if (r7 != r1) goto L13
            r1 = r0
            goto L14
        L13:
            r1 = r2
        L14:
            r41 r3 = r6.R
            if (r1 != 0) goto L70
            boolean r4 = r3 instanceof defpackage.nk1
            if (r4 == 0) goto L70
            r4 = 2
            if (r7 == r0) goto L24
            if (r7 != r4) goto L22
            goto L24
        L22:
            r7 = r2
            goto L25
        L24:
            r7 = r0
        L25:
            int r5 = r6.L
            if (r5 == r0) goto L2b
            if (r5 != r4) goto L2c
        L2b:
            r2 = r0
        L2c:
            if (r7 != r2) goto L70
            r7 = r3
            nk1 r7 = (defpackage.nk1) r7
            n61 r1 = r7.R
            s41 r7 = r7.X
            l61 r7 = r7.b()
            boolean r2 = defpackage.ok1.c(r1, r7)
            if (r2 == 0) goto L43
            defpackage.ok1.b(r1, r7, r6)
            return
        L43:
            l62 r7 = defpackage.m57.a()
            long r1 = r7.L
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L56
            r7.o0(r6)
            return
        L56:
            r7.p0(r0)
            defpackage.ak7.z0(r6, r3, r0)     // Catch: java.lang.Throwable -> L66
        L5c:
            boolean r1 = r7.r0()     // Catch: java.lang.Throwable -> L66
            if (r1 != 0) goto L5c
        L62:
            r7.n0(r0)
            goto L87
        L66:
            r1 = move-exception
            r6.h(r1)     // Catch: java.lang.Throwable -> L6b
            goto L62
        L6b:
            r6 = move-exception
            r7.n0(r0)
            throw r6
        L70:
            defpackage.ak7.z0(r6, r3, r1)
            return
        L74:
            java.lang.String r6 = "Already resumed"
            defpackage.i.m(r6)
            return
        L7a:
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r2 = r2 & r1
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = r3 + r2
            boolean r0 = r0.compareAndSet(r6, r1, r3)
            if (r0 == 0) goto L0
        L87:
            return
    }

    public java.lang.Throwable q(defpackage.ed3 r1) {
            r0 = this;
            java.util.concurrent.CancellationException r0 = r1.v()
            return r0
    }

    public final defpackage.il1 r() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.rj0.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.rj0.e0
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            il1 r3 = (defpackage.il1) r3
            return r3
    }

    public final java.lang.Object s() {
            r5 = this;
            boolean r0 = r5.B()
        L4:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.rj0.Y
            int r2 = r1.get(r5)
            int r3 = r2 >> 29
            if (r3 == 0) goto L51
            r1 = 2
            if (r3 != r1) goto L4a
            if (r0 == 0) goto L16
            r5.E()
        L16:
            java.lang.Object r0 = r5.u()
            boolean r2 = r0 instanceof defpackage.av0
            if (r2 != 0) goto L45
            int r2 = r5.L
            r3 = 1
            if (r2 == r3) goto L25
            if (r2 != r1) goto L40
        L25:
            l61 r1 = r5.X
            vs0 r2 = defpackage.vs0.h0
            j61 r1 = r1.Z(r2)
            rc3 r1 = (defpackage.rc3) r1
            if (r1 == 0) goto L40
            boolean r2 = r1.e()
            if (r2 == 0) goto L38
            goto L40
        L38:
            java.util.concurrent.CancellationException r0 = r1.v()
            r5.c(r0)
            throw r0
        L40:
            java.lang.Object r5 = r5.g(r0)
            return r5
        L45:
            av0 r0 = (defpackage.av0) r0
            java.lang.Throwable r5 = r0.a
            throw r5
        L4a:
            java.lang.String r5 = "Already suspended"
            defpackage.i.m(r5)
            r5 = 0
            return r5
        L51:
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r3 & r2
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            int r4 = r4 + r3
            boolean r1 = r1.compareAndSet(r5, r2, r4)
            if (r1 == 0) goto L4
            il1 r1 = r5.r()
            if (r1 != 0) goto L67
            r5.x()
        L67:
            if (r0 == 0) goto L6c
            r5.E()
        L6c:
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            return r5
    }

    @Override // defpackage.qj0
    public final void t(java.lang.Object r2, defpackage.fo2 r3) {
            r1 = this;
            int r0 = r1.L
            r1.H(r2, r0, r3)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.D()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            r41 r1 = r3.R
            java.lang.String r1 = defpackage.nc1.i0(r1)
            r0.append(r1)
            java.lang.String r1 = "){"
            r0.append(r1)
            java.lang.Object r1 = r3.u()
            boolean r2 = r1 instanceof defpackage.sg4
            if (r2 == 0) goto L2a
            java.lang.String r1 = "Active"
            goto L33
        L2a:
            boolean r1 = r1 instanceof defpackage.vj0
            if (r1 == 0) goto L31
            java.lang.String r1 = "Cancelled"
            goto L33
        L31:
            java.lang.String r1 = "Completed"
        L33:
            r0.append(r1)
            java.lang.String r1 = "}@"
            r0.append(r1)
            java.lang.String r3 = defpackage.nc1.P(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public final java.lang.Object u() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.rj0.Z
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.rj0.f0
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            return r3
    }

    public final void v() {
            r4 = this;
            il1 r0 = r4.x()
            if (r0 != 0) goto L7
            goto L20
        L7:
            java.lang.Object r1 = r4.u()
            boolean r1 = r1 instanceof defpackage.sg4
            if (r1 != 0) goto L20
            r0.dispose()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.rj0.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.rj0.e0
            lg4 r3 = defpackage.lg4.A
            r0.putObjectVolatile(r4, r1, r3)
        L20:
            return
    }

    @Override // defpackage.qj0
    public final boolean w(java.lang.Throwable r11) {
            r10 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.rj0.Z
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.rj0.f0
            java.lang.Object r7 = r0.getObjectVolatile(r10, r1)
            boolean r0 = r7 instanceof defpackage.sg4
            r3 = 0
            if (r0 != 0) goto L13
            return r3
        L13:
            vj0 r8 = new vj0
            boolean r0 = r7 instanceof defpackage.lj0
            r9 = 1
            if (r0 != 0) goto L1e
            boolean r0 = r7 instanceof defpackage.p96
            if (r0 == 0) goto L1f
        L1e:
            r3 = r9
        L1f:
            if (r11 != 0) goto L3a
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Continuation "
            r4.<init>(r5)
            r4.append(r10)
            java.lang.String r5 = " was cancelled normally"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            goto L3b
        L3a:
            r0 = r11
        L3b:
            r8.<init>(r0, r3)
        L3e:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.rj0.f0
            r4 = r10
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r10 == 0) goto L6e
            r10 = r7
            sg4 r10 = (defpackage.sg4) r10
            boolean r0 = r10 instanceof defpackage.lj0
            if (r0 == 0) goto L56
            lj0 r7 = (defpackage.lj0) r7
            r4.l(r7, r11)
            goto L5f
        L56:
            boolean r10 = r10 instanceof defpackage.p96
            if (r10 == 0) goto L5f
            p96 r7 = (defpackage.p96) r7
            r4.n(r7, r11)
        L5f:
            boolean r10 = r4.B()
            if (r10 != 0) goto L68
            r4.o()
        L68:
            int r10 = r4.L
            r4.p(r10)
            return r9
        L6e:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r1)
            if (r10 == r7) goto L76
            r10 = r4
            goto L0
        L76:
            r10 = r4
            goto L3e
    }

    public final defpackage.il1 x() {
            r9 = this;
            l61 r0 = r9.X
            vs0 r1 = defpackage.vs0.h0
            j61 r0 = r0.Z(r1)
            rc3 r0 = (defpackage.rc3) r0
            if (r0 != 0) goto Le
            r9 = 0
            return r9
        Le:
            gq0 r1 = new gq0
            r1.<init>(r9)
            r2 = 1
            il1 r8 = defpackage.yh2.y(r0, r2, r1)
        L18:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.rj0.d0
            r0.getClass()
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.rj0.e0
            r7 = 0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L2a
            goto L30
        L2a:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r5)
            if (r9 == 0) goto L31
        L30:
            return r8
        L31:
            r9 = r4
            goto L18
    }

    @Override // defpackage.qj0
    public final void y(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.L
            r0.p(r1)
            return
    }

    public final void z(defpackage.qn2 r3) {
            r2 = this;
            kj0 r0 = new kj0
            r1 = 1
            r0.<init>(r3, r1)
            r2.A(r0)
            return
    }
}
