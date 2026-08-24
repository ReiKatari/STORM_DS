package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v80  reason: default package */
/* loaded from: classes.dex */
public class v80 implements defpackage.ul0 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater R = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater X = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater Y = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater Z = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater d0 = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater e0 = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f0 = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater g0 = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater h0 = null;
    public static final /* synthetic */ long i0 = 0;
    public static final /* synthetic */ long j0 = 0;
    public static final /* synthetic */ long k0 = 0;
    public static final /* synthetic */ long l0 = 0;
    public static final /* synthetic */ long m0 = 0;
    public final int A;
    public final defpackage.qn2 B;
    public final defpackage.ov4 L;
    private volatile /* synthetic */ java.lang.Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ java.lang.Object bufferEndSegment$volatile;
    private volatile /* synthetic */ java.lang.Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ java.lang.Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ java.lang.Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
            java.lang.String r0 = "sendersAndCloseStatus$volatile"
            java.lang.Class<v80> r1 = defpackage.v80.class
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            defpackage.v80.R = r0
            java.lang.String r0 = "receivers$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            defpackage.v80.X = r0
            java.lang.String r0 = "bufferEnd$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            defpackage.v80.Y = r0
            java.lang.String r0 = "completedExpandBuffersAndPauseFlag$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            defpackage.v80.Z = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "sendSegment$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            defpackage.v80.d0 = r3
            sun.misc.Unsafe r3 = defpackage.v36.a
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r4 = r3.objectFieldOffset(r2)
            defpackage.v80.m0 = r4
            java.lang.String r2 = "receiveSegment$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            defpackage.v80.e0 = r4
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r4 = r3.objectFieldOffset(r2)
            defpackage.v80.l0 = r4
            java.lang.String r2 = "bufferEndSegment$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            defpackage.v80.f0 = r4
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r4 = r3.objectFieldOffset(r2)
            defpackage.v80.j0 = r4
            java.lang.String r2 = "_closeCause$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            defpackage.v80.g0 = r4
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r4 = r3.objectFieldOffset(r2)
            defpackage.v80.i0 = r4
            java.lang.String r2 = "closeHandler$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            defpackage.v80.h0 = r0
            java.lang.reflect.Field r0 = r1.getDeclaredField(r2)
            long r0 = r3.objectFieldOffset(r0)
            defpackage.v80.k0 = r0
            return
    }

    public v80(int r10, defpackage.qn2 r11) {
            r9 = this;
            r9.<init>()
            r9.A = r10
            r9.B = r11
            r0 = 0
            if (r10 < 0) goto L51
            hm0 r1 = defpackage.x80.a
            if (r10 == 0) goto L1b
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r10 == r1) goto L15
            long r1 = (long) r10
            goto L1d
        L15:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L1d
        L1b:
            r1 = 0
        L1d:
            r9.bufferEnd$volatile = r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = defpackage.v80.Y
            long r1 = r10.get(r9)
            r9.completedExpandBuffersAndPauseFlag$volatile = r1
            hm0 r3 = new hm0
            r6 = 0
            r8 = 3
            r4 = 0
            r7 = r9
            r3.<init>(r4, r6, r7, r8)
            r7.sendSegment$volatile = r3
            r7.receiveSegment$volatile = r3
            boolean r9 = r7.I()
            if (r9 == 0) goto L40
            hm0 r3 = defpackage.x80.a
            r3.getClass()
        L40:
            r7.bufferEndSegment$volatile = r3
            if (r11 == 0) goto L4a
            ov4 r0 = new ov4
            r9 = 3
            r0.<init>(r7, r9)
        L4a:
            r7.L = r0
            gr1 r9 = defpackage.x80.s
            r7._closeCause$volatile = r9
            return
        L51:
            java.lang.String r9 = "Invalid channel capacity: "
            java.lang.String r11 = ", should be >=0"
            java.lang.String r9 = defpackage.lb1.k(r9, r10, r11)
            defpackage.i.f(r9)
            throw r0
    }

    public static void B(defpackage.v80 r7) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.Z
            r1 = 1
            long r1 = r0.addAndGet(r7, r1)
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r1 = r1 & r3
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L1b
        L11:
            long r1 = r0.get(r7)
            long r1 = r1 & r3
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L1b
            goto L11
        L1b:
            return
    }

    public static java.lang.Object L(defpackage.v80 r13, defpackage.r41 r14) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.e0
            r0.getClass()
            r1 = 0
            if (r13 == 0) goto L11b
            sun.misc.Unsafe r2 = defpackage.v36.a
            long r3 = defpackage.v80.l0
            java.lang.Object r2 = r2.getObjectVolatile(r13, r3)
            hm0 r2 = (defpackage.hm0) r2
        L12:
            boolean r3 = r13.F()
            if (r3 != 0) goto L113
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.v80.X
            long r7 = r3.getAndIncrement(r13)
            int r4 = defpackage.x80.b
            long r4 = (long) r4
            long r9 = r7 / r4
            long r4 = r7 % r4
            int r6 = (int) r4
            long r4 = r2.X
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 == 0) goto L35
            hm0 r4 = r13.t(r9, r2)
            if (r4 != 0) goto L33
            goto L12
        L33:
            r5 = r4
            goto L36
        L35:
            r5 = r2
        L36:
            r9 = 0
            r4 = r13
            java.lang.Object r13 = r4.U(r5, r6, r7, r9)
            gr1 r2 = defpackage.x80.m
            java.lang.String r12 = "unexpected"
            if (r13 == r2) goto L10f
            gr1 r10 = defpackage.x80.o
            if (r13 != r10) goto L54
            long r2 = r4.z()
            int r13 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r13 >= 0) goto L51
            r5.a()
        L51:
            r13 = r4
            r2 = r5
            goto L12
        L54:
            gr1 r9 = defpackage.x80.n
            if (r13 != r9) goto L10b
            qn2 r13 = r4.B
            r41 r14 = defpackage.np2.V(r14)
            rj0 r9 = defpackage.n16.C(r14)
            java.lang.Object r14 = r4.U(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L6d
            if (r14 != r2) goto L71
            r9.a(r5, r6)     // Catch: java.lang.Throwable -> L6d
            goto L100
        L6d:
            r0 = move-exception
        L6e:
            r13 = r0
            goto L107
        L71:
            if (r14 != r10) goto Lf6
            long r10 = r4.z()     // Catch: java.lang.Throwable -> L6d
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r14 >= 0) goto L7e
            r5.a()     // Catch: java.lang.Throwable -> L6d
        L7e:
            java.lang.Object r14 = r0.get(r4)     // Catch: java.lang.Throwable -> L6d
            hm0 r14 = (defpackage.hm0) r14     // Catch: java.lang.Throwable -> L6d
        L84:
            boolean r0 = r4.F()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L98
            java.lang.Throwable r13 = r4.x()     // Catch: java.lang.Throwable -> L6d
            em5 r14 = new em5     // Catch: java.lang.Throwable -> L6d
            r14.<init>(r13)     // Catch: java.lang.Throwable -> L6d
            r9.i(r14)     // Catch: java.lang.Throwable -> L6d
            goto L100
        L98:
            r11 = r9
            long r9 = r3.getAndIncrement(r4)     // Catch: java.lang.Throwable -> Lf2
            int r0 = defpackage.x80.b     // Catch: java.lang.Throwable -> Lf2
            long r5 = (long) r0     // Catch: java.lang.Throwable -> Lf2
            long r7 = r9 / r5
            long r5 = r9 % r5
            int r0 = (int) r5     // Catch: java.lang.Throwable -> Lf2
            long r5 = r14.X     // Catch: java.lang.Throwable -> Lf2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto Lbb
            hm0 r2 = r4.t(r7, r14)     // Catch: java.lang.Throwable -> Lb7
            if (r2 != 0) goto Lb3
            r9 = r11
            goto L84
        Lb3:
            r7 = r2
        Lb4:
            r8 = r0
            r6 = r4
            goto Lbd
        Lb7:
            r0 = move-exception
            r13 = r0
            r9 = r11
            goto L107
        Lbb:
            r7 = r14
            goto Lb4
        Lbd:
            java.lang.Object r14 = r6.U(r7, r8, r9, r11)     // Catch: java.lang.Throwable -> Lf2
            r4 = r6
            r2 = r7
            r5 = r9
            r9 = r11
            gr1 r0 = defpackage.x80.m     // Catch: java.lang.Throwable -> L6d
            if (r14 != r0) goto Lcd
            r9.a(r2, r8)     // Catch: java.lang.Throwable -> L6d
            goto L100
        Lcd:
            gr1 r0 = defpackage.x80.o     // Catch: java.lang.Throwable -> L6d
            if (r14 != r0) goto Lde
            long r7 = r4.z()     // Catch: java.lang.Throwable -> L6d
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 >= 0) goto Ldc
            r2.a()     // Catch: java.lang.Throwable -> L6d
        Ldc:
            r14 = r2
            goto L84
        Lde:
            gr1 r0 = defpackage.x80.n     // Catch: java.lang.Throwable -> L6d
            if (r14 == r0) goto Lec
            r2.a()     // Catch: java.lang.Throwable -> L6d
            if (r13 == 0) goto Le8
            goto Lfb
        Le8:
            r9.t(r14, r1)     // Catch: java.lang.Throwable -> L6d
            goto L100
        Lec:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6d
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L6d
            throw r13     // Catch: java.lang.Throwable -> L6d
        Lf2:
            r0 = move-exception
            r9 = r11
            goto L6e
        Lf6:
            r5.a()     // Catch: java.lang.Throwable -> L6d
            if (r13 == 0) goto Le8
        Lfb:
            o80 r1 = r4.e()     // Catch: java.lang.Throwable -> L6d
            goto Le8
        L100:
            java.lang.Object r13 = r9.s()
            x61 r14 = defpackage.x61.COROUTINE_SUSPENDED
            return r13
        L107:
            r9.E()
            throw r13
        L10b:
            r5.a()
            return r13
        L10f:
            defpackage.i.m(r12)
            return r1
        L113:
            r4 = r13
            java.lang.Throwable r13 = r4.x()
            int r14 = defpackage.to6.a
            throw r13
        L11b:
            defpackage.u34.a()
            return r1
    }

    public static java.lang.Object M(defpackage.v80 r13, defpackage.s41 r14) {
            boolean r0 = r14 instanceof defpackage.t80
            if (r0 == 0) goto L14
            r0 = r14
            t80 r0 = (defpackage.t80) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            t80 r0 = new t80
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.R
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            defpackage.oi2.Y(r14)
            gm0 r14 = (defpackage.gm0) r14
            java.lang.Object r13 = r14.a
            return r13
        L2e:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            return r2
        L34:
            defpackage.oi2.Y(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = defpackage.v80.e0
            r14.getClass()
            sun.misc.Unsafe r14 = defpackage.v36.a
            long r4 = defpackage.v80.l0
            java.lang.Object r14 = r14.getObjectVolatile(r13, r4)
            hm0 r14 = (defpackage.hm0) r14
        L46:
            boolean r1 = r13.F()
            if (r1 == 0) goto L56
            java.lang.Throwable r13 = r13.v()
            em0 r14 = new em0
            r14.<init>(r13)
            return r14
        L56:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.v80.X
            long r4 = r1.getAndIncrement(r13)
            int r1 = defpackage.x80.b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r1 = (int) r7
            long r7 = r14.X
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L73
            hm0 r7 = r13.t(r9, r14)
            if (r7 != 0) goto L71
            goto L46
        L71:
            r8 = r7
            goto L74
        L73:
            r8 = r14
        L74:
            r12 = 0
            r7 = r13
            r9 = r1
            r10 = r4
            java.lang.Object r13 = r7.U(r8, r9, r10, r12)
            r1 = r7
            gr1 r14 = defpackage.x80.m
            if (r13 == r14) goto La7
            gr1 r14 = defpackage.x80.o
            if (r13 != r14) goto L93
            long r13 = r1.z()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L90
            r8.a()
        L90:
            r13 = r1
            r14 = r8
            goto L46
        L93:
            gr1 r14 = defpackage.x80.n
            if (r13 != r14) goto La3
            r6.Y = r3
            r2 = r8
            r3 = r9
            java.lang.Object r13 = r1.N(r2, r3, r4, r6)
            if (r13 != r0) goto La2
            return r0
        La2:
            return r13
        La3:
            r8.a()
            return r13
        La7:
            java.lang.String r13 = "unexpected"
            defpackage.i.m(r13)
            return r2
    }

    public static java.lang.Object Q(defpackage.v80 r25, java.lang.Object r26, defpackage.r41 r27) {
            r0 = r25
            r3 = r26
            r8 = r27
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = defpackage.v80.d0
            r9.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r4 = defpackage.v80.m0
            java.lang.Object r1 = r1.getObjectVolatile(r0, r4)
            hm0 r1 = (defpackage.hm0) r1
        L15:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = defpackage.v80.R
            long r4 = r10.getAndIncrement(r0)
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r6 = r4 & r11
            r13 = 0
            boolean r2 = r0.E(r4, r13)
            int r14 = defpackage.x80.b
            long r4 = (long) r14
            r15 = r11
            long r11 = r6 / r4
            long r4 = r6 % r4
            int r4 = (int) r4
            r18 = r14
            long r13 = r1.X
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            jg7 r13 = defpackage.jg7.a
            if (r5 == 0) goto L4c
            hm0 r5 = r0.u(r11, r1)
            if (r5 != 0) goto L4b
            if (r2 == 0) goto L15
            java.lang.Object r0 = r0.K(r8, r3)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L15d
            return r0
        L4b:
            r1 = r5
        L4c:
            r23 = r6
            r7 = r2
            r2 = r4
            r4 = r23
            r6 = 0
            int r6 = d(r0, r1, r2, r3, r4, r6, r7)
            if (r6 == 0) goto L15e
            r11 = 1
            if (r6 == r11) goto L15d
            r12 = 2
            if (r6 == r12) goto L14f
            java.util.concurrent.atomic.AtomicLongFieldUpdater r14 = defpackage.v80.X
            r7 = 5
            r19 = r15
            r15 = 4
            r12 = 3
            if (r6 == r12) goto L85
            if (r6 == r15) goto L71
            if (r6 == r7) goto L6d
            goto L15
        L6d:
            r1.a()
            goto L15
        L71:
            long r6 = r14.get(r0)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L7c
            r1.a()
        L7c:
            java.lang.Object r0 = r0.K(r8, r3)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L15d
            return r0
        L85:
            r41 r6 = defpackage.np2.V(r8)
            rj0 r6 = defpackage.n16.C(r6)
            r8 = r7
            r7 = 0
            int r7 = d(r0, r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> Ld3
            if (r7 == 0) goto L13a
            if (r7 == r11) goto L119
            r12 = 2
            if (r7 == r12) goto L134
            if (r7 == r15) goto L128
            java.lang.String r12 = "unexpected"
            if (r7 != r8) goto L121
            r1.a()     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r1 = r9.get(r0)     // Catch: java.lang.Throwable -> Ld3
            hm0 r1 = (defpackage.hm0) r1     // Catch: java.lang.Throwable -> Ld3
        La9:
            long r4 = r10.getAndIncrement(r0)     // Catch: java.lang.Throwable -> Ld3
            long r21 = r4 & r19
            r9 = 0
            boolean r7 = r0.E(r4, r9)     // Catch: java.lang.Throwable -> Ld3
            int r2 = defpackage.x80.b     // Catch: java.lang.Throwable -> Ld3
            long r4 = (long) r2     // Catch: java.lang.Throwable -> Ld3
            r17 = r10
            long r9 = r21 / r4
            long r4 = r21 % r4
            int r4 = (int) r4     // Catch: java.lang.Throwable -> Ld3
            r27 = r12
            long r11 = r1.X     // Catch: java.lang.Throwable -> Ld3
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 == 0) goto Ldd
            hm0 r5 = r0.u(r9, r1)     // Catch: java.lang.Throwable -> Ld3
            if (r5 != 0) goto Ldc
            if (r7 == 0) goto Ld6
        Lce:
            b(r0, r3, r6)     // Catch: java.lang.Throwable -> Ld3
            goto L13e
        Ld3:
            r0 = move-exception
            goto L14b
        Ld6:
            r12 = r27
            r10 = r17
            r11 = 1
            goto La9
        Ldc:
            r1 = r5
        Ldd:
            r9 = r2
            r2 = r4
            r4 = r21
            int r10 = d(r0, r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> Ld3
            if (r10 == 0) goto L11d
            r11 = 1
            if (r10 == r11) goto L119
            r12 = 2
            if (r10 == r12) goto L10d
            r11 = 3
            if (r10 == r11) goto L105
            if (r10 == r15) goto Lf9
            if (r10 == r8) goto Lf5
            goto Ld6
        Lf5:
            r1.a()     // Catch: java.lang.Throwable -> Ld3
            goto Ld6
        Lf9:
            long r7 = r14.get(r0)     // Catch: java.lang.Throwable -> Ld3
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 >= 0) goto Lce
            r1.a()     // Catch: java.lang.Throwable -> Ld3
            goto Lce
        L105:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld3
            r1 = r27
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld3
            throw r0     // Catch: java.lang.Throwable -> Ld3
        L10d:
            if (r7 == 0) goto L113
            r1.n()     // Catch: java.lang.Throwable -> Ld3
            goto Lce
        L113:
            int r4 = r2 + r9
            r6.a(r1, r4)     // Catch: java.lang.Throwable -> Ld3
            goto L13e
        L119:
            r6.i(r13)     // Catch: java.lang.Throwable -> Ld3
            goto L13e
        L11d:
            r1.a()     // Catch: java.lang.Throwable -> Ld3
            goto L119
        L121:
            r1 = r12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld3
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld3
            throw r0     // Catch: java.lang.Throwable -> Ld3
        L128:
            long r7 = r14.get(r0)     // Catch: java.lang.Throwable -> Ld3
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 >= 0) goto Lce
            r1.a()     // Catch: java.lang.Throwable -> Ld3
            goto Lce
        L134:
            int r4 = r2 + r18
            r6.a(r1, r4)     // Catch: java.lang.Throwable -> Ld3
            goto L13e
        L13a:
            r1.a()     // Catch: java.lang.Throwable -> Ld3
            goto L119
        L13e:
            java.lang.Object r0 = r6.s()
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L147
            goto L148
        L147:
            r0 = r13
        L148:
            if (r0 != r1) goto L15d
            return r0
        L14b:
            r6.E()
            throw r0
        L14f:
            if (r7 == 0) goto L15d
            r1.n()
            java.lang.Object r0 = r0.K(r8, r3)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L15d
            return r0
        L15d:
            return r13
        L15e:
            r1.a()
            return r13
    }

    public static final void b(defpackage.v80 r2, java.lang.Object r3, defpackage.rj0 r4) {
            qn2 r0 = r2.B
            if (r0 == 0) goto L9
            l61 r1 = r4.X
            defpackage.oi2.k(r0, r3, r1)
        L9:
            java.lang.Throwable r2 = r2.y()
            em5 r3 = new em5
            r3.<init>(r2)
            r4.i(r3)
            return
    }

    public static final int d(defpackage.v80 r4, defpackage.hm0 r5, int r6, java.lang.Object r7, long r8, java.lang.Object r10, boolean r11) {
            r5.s(r6, r7)
            if (r11 == 0) goto La
            int r4 = r4.V(r5, r6, r7, r8, r10, r11)
            return r4
        La:
            java.lang.Object r0 = r5.q(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2d
            boolean r0 = r4.g(r8)
            if (r0 == 0) goto L21
            gr1 r0 = defpackage.x80.d
            boolean r0 = r5.p(r6, r2, r0)
            if (r0 == 0) goto L53
            return r1
        L21:
            if (r10 != 0) goto L25
            r4 = 3
            return r4
        L25:
            boolean r0 = r5.p(r6, r2, r10)
            if (r0 == 0) goto L53
            r4 = 2
            return r4
        L2d:
            boolean r3 = r0 instanceof defpackage.zr7
            if (r3 == 0) goto L53
            r5.s(r6, r2)
            boolean r4 = r4.R(r0, r7)
            if (r4 == 0) goto L41
            gr1 r4 = defpackage.x80.i
            r5.t(r6, r4)
            r4 = 0
            return r4
        L41:
            gr1 r4 = defpackage.x80.k
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r5.d0
            int r8 = r6 * 2
            int r8 = r8 + r1
            java.lang.Object r7 = r7.getAndSet(r8, r4)
            if (r7 == r4) goto L51
            r5.r(r6, r1)
        L51:
            r4 = 5
            return r4
        L53:
            int r4 = r4.V(r5, r6, r7, r8, r10, r11)
            return r4
    }

    public final boolean A() {
            r13 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.e0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.v80.l0
            java.lang.Object r3 = r0.getObjectVolatile(r13, r1)
            hm0 r3 = (defpackage.hm0) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.v80.X
            long r7 = r4.get(r13)
            long r5 = r13.z()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L1e
            goto L3b
        L1e:
            int r5 = defpackage.x80.b
            long r5 = (long) r5
            long r9 = r7 / r5
            long r11 = r3.X
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L3d
            hm0 r3 = r13.t(r9, r3)
            if (r3 != 0) goto L3d
            java.lang.Object r0 = r0.getObjectVolatile(r13, r1)
            hm0 r0 = (defpackage.hm0) r0
            long r0 = r0.X
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 >= 0) goto L0
        L3b:
            r13 = 0
            return r13
        L3d:
            r3.a()
            long r0 = r7 % r5
            int r0 = (int) r0
        L43:
            java.lang.Object r1 = r3.q(r0)
            if (r1 == 0) goto L7b
            gr1 r2 = defpackage.x80.e
            if (r1 != r2) goto L4e
            goto L7b
        L4e:
            gr1 r0 = defpackage.x80.d
            if (r1 != r0) goto L53
            goto L79
        L53:
            gr1 r0 = defpackage.x80.j
            if (r1 != r0) goto L58
            goto L86
        L58:
            gr1 r0 = defpackage.x80.l
            if (r1 != r0) goto L5d
            goto L86
        L5d:
            gr1 r0 = defpackage.x80.i
            if (r1 != r0) goto L62
            goto L86
        L62:
            gr1 r0 = defpackage.x80.h
            if (r1 != r0) goto L67
            goto L86
        L67:
            gr1 r0 = defpackage.x80.g
            if (r1 != r0) goto L6c
            goto L79
        L6c:
            gr1 r0 = defpackage.x80.f
            if (r1 != r0) goto L71
            goto L86
        L71:
            long r0 = r4.get(r13)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L86
        L79:
            r13 = 1
            return r13
        L7b:
            gr1 r2 = defpackage.x80.h
            boolean r1 = r3.p(r0, r1, r2)
            if (r1 == 0) goto L43
            r13.r()
        L86:
            r0 = 1
            long r9 = r7 + r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = defpackage.v80.X
            r6 = r13
            r5.compareAndSet(r6, r7, r9)
            goto L0
    }

    public final void C() {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.h0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.v80.k0
            java.lang.Object r7 = r0.getObjectVolatile(r9, r1)
            if (r7 != 0) goto L13
            gr1 r0 = defpackage.x80.q
        L11:
            r8 = r0
            goto L16
        L13:
            gr1 r0 = defpackage.x80.r
            goto L11
        L16:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.v80.k0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L32
            if (r7 != 0) goto L24
            return
        L24:
            r9 = 1
            defpackage.ge7.p(r9, r7)
            qn2 r7 = (defpackage.qn2) r7
            java.lang.Throwable r9 = r4.v()
            r7.g(r9)
            return
        L32:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L3a
            r9 = r4
            goto L0
        L3a:
            r9 = r4
            goto L16
    }

    public final void D(defpackage.rp2 r11) {
            r10 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.h0
            r0.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r3 = defpackage.v80.k0
            r5 = 0
            r2 = r10
            r6 = r11
            boolean r10 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r10 == 0) goto L13
            return
        L13:
            long r8 = defpackage.v80.k0
            java.lang.Object r10 = r1.getObjectVolatile(r2, r8)
            if (r10 == 0) goto L53
        L1b:
            sun.misc.Unsafe r10 = defpackage.v36.a
            java.lang.Object r10 = r10.getObjectVolatile(r2, r8)
            gr1 r6 = defpackage.x80.q
            if (r10 != r6) goto L43
            gr1 r7 = defpackage.x80.r
        L27:
            r3 = r2
            sun.misc.Unsafe r2 = defpackage.v36.a
            long r4 = defpackage.v80.k0
            boolean r10 = r2.compareAndSwapObject(r3, r4, r6, r7)
            r0 = r2
            r2 = r3
            if (r10 == 0) goto L3c
            java.lang.Throwable r10 = r2.v()
            r11.g(r10)
            return
        L3c:
            java.lang.Object r10 = r0.getObjectVolatile(r2, r8)
            if (r10 == r6) goto L27
            goto L1b
        L43:
            gr1 r11 = defpackage.x80.r
            if (r10 != r11) goto L4d
            java.lang.String r10 = "Another handler was already registered and successfully invoked"
            defpackage.i.m(r10)
            return
        L4d:
            java.lang.String r11 = "Another handler is already registered: "
            defpackage.e41.h(r10, r11)
            return
        L53:
            r10 = r2
            goto L0
    }

    public final boolean E(long r13, boolean r15) {
            r12 = this;
            r0 = 60
            long r0 = r13 >> r0
            int r0 = (int) r0
            r1 = 0
            if (r0 == 0) goto L104
            r2 = 1
            if (r0 == r2) goto L104
            r3 = 2
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r0 == r3) goto Lf7
            r15 = 3
            if (r0 != r15) goto Led
            long r13 = r13 & r4
            hm0 r13 = r12.n(r13)
            r14 = 0
            r15 = r14
            r0 = r15
        L1e:
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r13.d0
            int r4 = defpackage.x80.b
            int r4 = r4 - r2
        L23:
            r5 = -1
            if (r5 >= r4) goto Lc0
            long r6 = r13.X
            int r8 = defpackage.x80.b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L2e:
            java.lang.Object r8 = r13.q(r4)
            gr1 r9 = defpackage.x80.i
            if (r8 == r9) goto Lc8
            gr1 r9 = defpackage.x80.d
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = defpackage.v80.X
            qn2 r11 = r12.B
            if (r8 != r9) goto L61
            long r9 = r10.get(r12)
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lc8
            gr1 r9 = defpackage.x80.l
            boolean r8 = r13.p(r4, r8, r9)
            if (r8 == 0) goto L2e
            if (r11 == 0) goto L5a
            int r5 = r4 * 2
            java.lang.Object r5 = r3.get(r5)
            ug r15 = defpackage.oi2.l(r11, r5, r15)
        L5a:
            r13.s(r4, r14)
            r13.n()
            goto Lbc
        L61:
            gr1 r9 = defpackage.x80.e
            if (r8 == r9) goto Lb1
            if (r8 != 0) goto L68
            goto Lb1
        L68:
            boolean r9 = r8 instanceof defpackage.zr7
            if (r9 != 0) goto L7d
            boolean r9 = r8 instanceof defpackage.as7
            if (r9 == 0) goto L71
            goto L7d
        L71:
            gr1 r9 = defpackage.x80.g
            if (r8 == r9) goto Lc8
            gr1 r10 = defpackage.x80.f
            if (r8 != r10) goto L7a
            goto Lc8
        L7a:
            if (r8 == r9) goto L2e
            goto Lbc
        L7d:
            long r9 = r10.get(r12)
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lc8
            boolean r9 = r8 instanceof defpackage.as7
            if (r9 == 0) goto L8f
            r9 = r8
            as7 r9 = (defpackage.as7) r9
            zr7 r9 = r9.a
            goto L92
        L8f:
            r9 = r8
            zr7 r9 = (defpackage.zr7) r9
        L92:
            gr1 r10 = defpackage.x80.l
            boolean r8 = r13.p(r4, r8, r10)
            if (r8 == 0) goto L2e
            if (r11 == 0) goto La6
            int r5 = r4 * 2
            java.lang.Object r5 = r3.get(r5)
            ug r15 = defpackage.oi2.l(r11, r5, r15)
        La6:
            java.lang.Object r0 = defpackage.ii2.M(r0, r9)
            r13.s(r4, r14)
            r13.n()
            goto Lbc
        Lb1:
            gr1 r9 = defpackage.x80.l
            boolean r8 = r13.p(r4, r8, r9)
            if (r8 == 0) goto L2e
            r13.n()
        Lbc:
            int r4 = r4 + (-1)
            goto L23
        Lc0:
            vy0 r13 = r13.f()
            hm0 r13 = (defpackage.hm0) r13
            if (r13 != 0) goto L1e
        Lc8:
            if (r0 == 0) goto Le9
            boolean r13 = r0 instanceof java.util.ArrayList
            if (r13 != 0) goto Ld4
            zr7 r0 = (defpackage.zr7) r0
            r12.P(r0, r1)
            goto Le9
        Ld4:
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r13 = r0.size()
            int r13 = r13 - r2
        Ldb:
            if (r5 >= r13) goto Le9
            java.lang.Object r14 = r0.get(r13)
            zr7 r14 = (defpackage.zr7) r14
            r12.P(r14, r1)
            int r13 = r13 + (-1)
            goto Ldb
        Le9:
            if (r15 != 0) goto Lec
            goto L103
        Lec:
            throw r15
        Led:
            java.lang.String r12 = "unexpected close status: "
            java.lang.String r12 = defpackage.lb1.g(r0, r12)
            defpackage.u34.f(r12)
            return r1
        Lf7:
            long r13 = r13 & r4
            r12.n(r13)
            if (r15 == 0) goto L103
            boolean r12 = r12.A()
            if (r12 != 0) goto L104
        L103:
            return r2
        L104:
            return r1
    }

    public final boolean F() {
            r3 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.R
            long r0 = r0.get(r3)
            r2 = 1
            boolean r3 = r3.E(r0, r2)
            return r3
    }

    public final boolean G() {
            r3 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.R
            long r0 = r0.get(r3)
            r2 = 0
            boolean r3 = r3.E(r0, r2)
            return r3
    }

    public boolean H() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final boolean I() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.Y
            long r0 = r0.get(r4)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
            goto L18
        L16:
            r4 = 0
            return r4
        L18:
            r4 = 1
            return r4
    }

    public final void J(long r7, defpackage.hm0 r9) {
            r6 = this;
        L0:
            long r0 = r9.X
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L11
            vy0 r0 = r9.d()
            hm0 r0 = (defpackage.hm0) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r9 = r0
            goto L0
        L11:
            r5 = r9
        L12:
            boolean r7 = r5.g()
            if (r7 == 0) goto L23
            vy0 r7 = r5.d()
            hm0 r7 = (defpackage.hm0) r7
            if (r7 != 0) goto L21
            goto L23
        L21:
            r5 = r7
            goto L12
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.v80.f0
            r7.getClass()
            sun.misc.Unsafe r7 = defpackage.v36.a
            long r8 = defpackage.v80.j0
            java.lang.Object r7 = r7.getObjectVolatile(r6, r8)
            r4 = r7
            p96 r4 = (defpackage.p96) r4
            long r0 = r4.X
            long r2 = r5.X
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L3c
            goto L58
        L3c:
            boolean r7 = r5.o()
            if (r7 != 0) goto L44
            r9 = r5
            goto L11
        L44:
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.v80.j0
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L59
            boolean r6 = r4.k()
            if (r6 == 0) goto L58
            r4.i()
        L58:
            return
        L59:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r8)
            if (r6 == r4) goto L6a
            boolean r6 = r5.k()
            if (r6 == 0) goto L68
            r5.i()
        L68:
            r6 = r1
            goto L23
        L6a:
            r6 = r1
            goto L44
    }

    public final java.lang.Object K(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            rj0 r0 = new rj0
            r41 r3 = defpackage.np2.V(r3)
            r1 = 1
            r0.<init>(r1, r3)
            r0.v()
            qn2 r3 = r2.B
            if (r3 == 0) goto L28
            r1 = 0
            ug r3 = defpackage.oi2.l(r3, r4, r1)
            if (r3 == 0) goto L28
            java.lang.Throwable r2 = r2.y()
            defpackage.mb3.q(r3, r2)
            em5 r2 = new em5
            r2.<init>(r3)
            r0.i(r2)
            goto L34
        L28:
            java.lang.Throwable r2 = r2.y()
            em5 r3 = new em5
            r3.<init>(r2)
            r0.i(r3)
        L34:
            java.lang.Object r2 = r0.s()
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            if (r2 != r3) goto L3d
            return r2
        L3d:
            jg7 r2 = defpackage.jg7.a
            return r2
    }

    public final java.lang.Object N(defpackage.hm0 r11, int r12, long r13, defpackage.s41 r15) {
            r10 = this;
            boolean r0 = r15 instanceof defpackage.u80
            if (r0 == 0) goto L13
            r0 = r15
            u80 r0 = (defpackage.u80) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            u80 r0 = new u80
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L29
            defpackage.oi2.Y(r15)
            goto Lf8
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r3
        L2f:
            defpackage.oi2.Y(r15)
            r0.Y = r4
            r41 r15 = defpackage.np2.V(r0)
            rj0 r15 = defpackage.n16.C(r15)
            bf5 r9 = new bf5     // Catch: java.lang.Throwable -> L52
            r9.<init>(r15)     // Catch: java.lang.Throwable -> L52
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r10 = r4.U(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L52
            gr1 r11 = defpackage.x80.m     // Catch: java.lang.Throwable -> L52
            if (r10 != r11) goto L56
            r9.a(r5, r6)     // Catch: java.lang.Throwable -> L52
            goto Lef
        L52:
            r0 = move-exception
            r10 = r0
            goto Lfd
        L56:
            gr1 r11 = defpackage.x80.o     // Catch: java.lang.Throwable -> L52
            qn2 r12 = r4.B
            if (r10 != r11) goto Le4
            long r10 = r4.z()     // Catch: java.lang.Throwable -> L52
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 >= 0) goto L67
            r5.a()     // Catch: java.lang.Throwable -> L52
        L67:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = defpackage.v80.e0     // Catch: java.lang.Throwable -> L52
            java.lang.Object r10 = r10.get(r4)     // Catch: java.lang.Throwable -> L52
            hm0 r10 = (defpackage.hm0) r10     // Catch: java.lang.Throwable -> L52
        L6f:
            boolean r11 = r4.F()     // Catch: java.lang.Throwable -> L52
            if (r11 == 0) goto L88
            java.lang.Throwable r10 = r4.v()     // Catch: java.lang.Throwable -> L52
            em0 r11 = new em0     // Catch: java.lang.Throwable -> L52
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L52
            gm0 r10 = new gm0     // Catch: java.lang.Throwable -> L52
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L52
            r15.i(r10)     // Catch: java.lang.Throwable -> L52
            goto Lef
        L88:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = defpackage.v80.X     // Catch: java.lang.Throwable -> L52
            long r7 = r11.getAndIncrement(r4)     // Catch: java.lang.Throwable -> L52
            int r11 = defpackage.x80.b     // Catch: java.lang.Throwable -> L52
            long r13 = (long) r11     // Catch: java.lang.Throwable -> L52
            long r5 = r7 / r13
            long r13 = r7 % r13
            int r11 = (int) r13     // Catch: java.lang.Throwable -> L52
            long r13 = r10.X     // Catch: java.lang.Throwable -> L52
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 == 0) goto La6
            hm0 r13 = r4.t(r5, r10)     // Catch: java.lang.Throwable -> L52
            if (r13 != 0) goto La3
            goto L6f
        La3:
            r5 = r13
        La4:
            r6 = r11
            goto La8
        La6:
            r5 = r10
            goto La4
        La8:
            java.lang.Object r10 = r4.U(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L52
            r13 = r5
            gr1 r11 = defpackage.x80.m     // Catch: java.lang.Throwable -> L52
            if (r10 != r11) goto Lb5
            r9.a(r13, r6)     // Catch: java.lang.Throwable -> L52
            goto Lef
        Lb5:
            gr1 r11 = defpackage.x80.o     // Catch: java.lang.Throwable -> L52
            if (r10 != r11) goto Lc6
            long r10 = r4.z()     // Catch: java.lang.Throwable -> L52
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 >= 0) goto Lc4
            r13.a()     // Catch: java.lang.Throwable -> L52
        Lc4:
            r10 = r13
            goto L6f
        Lc6:
            gr1 r11 = defpackage.x80.n     // Catch: java.lang.Throwable -> L52
            if (r10 == r11) goto Ldc
            r13.a()     // Catch: java.lang.Throwable -> L52
            gm0 r11 = new gm0     // Catch: java.lang.Throwable -> L52
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L52
            if (r12 == 0) goto Ld8
        Ld4:
            o80 r3 = r4.f()     // Catch: java.lang.Throwable -> L52
        Ld8:
            r15.t(r11, r3)     // Catch: java.lang.Throwable -> L52
            goto Lef
        Ldc:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "unexpected"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L52
            throw r10     // Catch: java.lang.Throwable -> L52
        Le4:
            r5.a()     // Catch: java.lang.Throwable -> L52
            gm0 r11 = new gm0     // Catch: java.lang.Throwable -> L52
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L52
            if (r12 == 0) goto Ld8
            goto Ld4
        Lef:
            java.lang.Object r15 = r15.s()
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            if (r15 != r1) goto Lf8
            return r1
        Lf8:
            gm0 r15 = (defpackage.gm0) r15
            java.lang.Object r10 = r15.a
            return r10
        Lfd:
            r15.E()
            throw r10
    }

    public final void O(defpackage.v96 r10) {
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.e0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.v80.l0
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            hm0 r0 = (defpackage.hm0) r0
        Lf:
            boolean r1 = r9.F()
            if (r1 == 0) goto L1a
            gr1 r9 = defpackage.x80.l
            r10.X = r9
            return
        L1a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.v80.X
            long r5 = r1.getAndIncrement(r9)
            int r1 = defpackage.x80.b
            long r1 = (long) r1
            long r3 = r5 / r1
            long r1 = r5 % r1
            int r1 = (int) r1
            long r7 = r0.X
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L3a
            hm0 r2 = r9.t(r3, r0)
            if (r2 != 0) goto L35
            goto Lf
        L35:
            r3 = r2
            r7 = r10
            r4 = r1
            r2 = r9
            goto L3e
        L3a:
            r3 = r0
            r2 = r9
            r7 = r10
            r4 = r1
        L3e:
            java.lang.Object r9 = r2.U(r3, r4, r5, r7)
            r0 = r3
            gr1 r10 = defpackage.x80.m
            if (r9 != r10) goto L53
            if (r7 == 0) goto L4b
            r10 = r7
            goto L4c
        L4b:
            r10 = 0
        L4c:
            if (r10 == 0) goto L52
            r10.L = r0
            r10.R = r4
        L52:
            return
        L53:
            gr1 r10 = defpackage.x80.o
            if (r9 != r10) goto L65
            long r9 = r2.z()
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 >= 0) goto L62
            r0.a()
        L62:
            r9 = r2
            r10 = r7
            goto Lf
        L65:
            gr1 r10 = defpackage.x80.n
            if (r9 == r10) goto L6f
            r0.a()
            r7.X = r9
            return
        L6f:
            java.lang.String r9 = "unexpected"
            defpackage.i.m(r9)
            return
    }

    public final void P(defpackage.zr7 r2, boolean r3) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.qj0
            if (r0 == 0) goto L1a
            r41 r2 = (defpackage.r41) r2
            if (r3 == 0) goto Ld
            java.lang.Throwable r1 = r1.x()
            goto L11
        Ld:
            java.lang.Throwable r1 = r1.y()
        L11:
            em5 r3 = new em5
            r3.<init>(r1)
            r2.i(r3)
            return
        L1a:
            boolean r3 = r2 instanceof defpackage.bf5
            if (r3 == 0) goto L34
            bf5 r2 = (defpackage.bf5) r2
            rj0 r2 = r2.A
            java.lang.Throwable r1 = r1.v()
            em0 r3 = new em0
            r3.<init>(r1)
            gm0 r1 = new gm0
            r1.<init>(r3)
            r2.i(r1)
            return
        L34:
            boolean r3 = r2 instanceof defpackage.n80
            if (r3 == 0) goto L5d
            n80 r2 = (defpackage.n80) r2
            rj0 r1 = r2.B
            r1.getClass()
            r3 = 0
            r2.B = r3
            gr1 r3 = defpackage.x80.l
            r2.A = r3
            v80 r2 = r2.L
            java.lang.Throwable r2 = r2.v()
            if (r2 != 0) goto L54
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.i(r2)
            return
        L54:
            em5 r3 = new em5
            r3.<init>(r2)
            r1.i(r3)
            return
        L5d:
            boolean r3 = r2 instanceof defpackage.v96
            if (r3 == 0) goto L69
            v96 r2 = (defpackage.v96) r2
            gr1 r3 = defpackage.x80.l
            r2.k(r1, r3)
            return
        L69:
            java.lang.String r1 = "Unexpected waiter: "
            defpackage.e41.h(r2, r1)
            return
    }

    public final boolean R(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.v96
            if (r0 == 0) goto Lb
            v96 r4 = (defpackage.v96) r4
            boolean r3 = r4.k(r3, r5)
            return r3
        Lb:
            boolean r0 = r4 instanceof defpackage.bf5
            qn2 r1 = r3.B
            r2 = 0
            if (r0 == 0) goto L26
            bf5 r4 = (defpackage.bf5) r4
            rj0 r4 = r4.A
            gm0 r0 = new gm0
            r0.<init>(r5)
            if (r1 == 0) goto L21
            o80 r2 = r3.f()
        L21:
            boolean r3 = defpackage.x80.a(r4, r0, r2)
            return r3
        L26:
            boolean r0 = r4 instanceof defpackage.n80
            if (r0 == 0) goto L48
            n80 r4 = (defpackage.n80) r4
            rj0 r3 = r4.B
            r3.getClass()
            r4.B = r2
            r4.A = r5
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            v80 r4 = r4.L
            qn2 r4 = r4.B
            if (r4 == 0) goto L43
            l4 r2 = new l4
            r1 = 2
            r2.<init>(r1, r4, r5)
        L43:
            boolean r3 = defpackage.x80.a(r3, r0, r2)
            return r3
        L48:
            boolean r0 = r4 instanceof defpackage.qj0
            if (r0 == 0) goto L59
            qj0 r4 = (defpackage.qj0) r4
            if (r1 == 0) goto L54
            o80 r2 = r3.e()
        L54:
            boolean r3 = defpackage.x80.a(r4, r5, r2)
            return r3
        L59:
            java.lang.String r3 = "Unexpected receiver type: "
            defpackage.e41.h(r4, r3)
            r3 = 0
            return r3
    }

    public final boolean S(java.lang.Object r5, defpackage.hm0 r6, int r7) {
            r4 = this;
            boolean r0 = r5 instanceof defpackage.qj0
            jg7 r1 = defpackage.jg7.a
            r2 = 0
            if (r0 == 0) goto Le
            qj0 r5 = (defpackage.qj0) r5
            boolean r4 = defpackage.x80.a(r5, r1, r2)
            return r4
        Le:
            boolean r0 = r5 instanceof defpackage.v96
            r3 = 0
            if (r0 == 0) goto L42
            v96 r5 = (defpackage.v96) r5
            int r4 = r5.l(r4, r1)
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 == r5) goto L30
            r0 = 2
            if (r4 == r0) goto L2d
            r0 = 3
            if (r4 != r0) goto L27
            rc7 r4 = defpackage.rc7.ALREADY_SELECTED
            goto L35
        L27:
            java.lang.String r5 = "Unexpected internal result: "
            defpackage.u34.e(r4, r5)
            return r3
        L2d:
            rc7 r4 = defpackage.rc7.CANCELLED
            goto L35
        L30:
            rc7 r4 = defpackage.rc7.REREGISTER
            goto L35
        L33:
            rc7 r4 = defpackage.rc7.SUCCESSFUL
        L35:
            rc7 r0 = defpackage.rc7.REREGISTER
            if (r4 != r0) goto L3c
            r6.s(r7, r2)
        L3c:
            rc7 r6 = defpackage.rc7.SUCCESSFUL
            if (r4 != r6) goto L41
            return r5
        L41:
            return r3
        L42:
            java.lang.String r4 = "Unexpected waiter: "
            defpackage.e41.h(r5, r4)
            return r3
    }

    public final java.lang.Object T(java.lang.Object r14) {
            r13 = this;
            gr1 r6 = defpackage.x80.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.v80.m0
            java.lang.Object r0 = r0.getObjectVolatile(r13, r1)
            hm0 r0 = (defpackage.hm0) r0
        L11:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.v80.R
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r1 & r3
            r3 = 0
            boolean r7 = r13.E(r1, r3)
            int r8 = defpackage.x80.b
            long r9 = (long) r8
            long r1 = r4 / r9
            long r11 = r4 % r9
            int r3 = (int) r11
            long r11 = r0.X
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 == 0) goto L47
            hm0 r1 = r13.u(r1, r0)
            if (r1 != 0) goto L43
            if (r7 == 0) goto L11
            java.lang.Throwable r13 = r13.y()
            em0 r14 = new em0
            r14.<init>(r13)
            return r14
        L43:
            r0 = r13
            r2 = r3
        L45:
            r3 = r14
            goto L4b
        L47:
            r1 = r0
            r2 = r3
            r0 = r13
            goto L45
        L4b:
            int r13 = d(r0, r1, r2, r3, r4, r6, r7)
            r14 = r0
            r0 = r1
            jg7 r1 = defpackage.jg7.a
            if (r13 == 0) goto Laf
            r11 = 1
            if (r13 == r11) goto Lae
            r11 = 2
            r12 = 0
            if (r13 == r11) goto L89
            r1 = 3
            if (r13 == r1) goto L83
            r1 = 4
            if (r13 == r1) goto L6c
            r1 = 5
            if (r13 == r1) goto L66
            goto L69
        L66:
            r0.a()
        L69:
            r13 = r14
            r14 = r3
            goto L11
        L6c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r13 = defpackage.v80.X
            long r1 = r13.get(r14)
            int r13 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r13 >= 0) goto L79
            r0.a()
        L79:
            java.lang.Throwable r13 = r14.y()
            em0 r14 = new em0
            r14.<init>(r13)
            return r14
        L83:
            java.lang.String r13 = "unexpected"
            defpackage.i.m(r13)
            return r12
        L89:
            if (r7 == 0) goto L98
            r0.n()
            java.lang.Throwable r13 = r14.y()
            em0 r14 = new em0
            r14.<init>(r13)
            return r14
        L98:
            boolean r13 = r6 instanceof defpackage.zr7
            if (r13 == 0) goto L9f
            r12 = r6
            zr7 r12 = (defpackage.zr7) r12
        L9f:
            if (r12 == 0) goto La6
            int r3 = r2 + r8
            r12.a(r0, r3)
        La6:
            long r3 = r0.X
            long r3 = r3 * r9
            long r5 = (long) r2
            long r3 = r3 + r5
            r14.q(r3)
        Lae:
            return r1
        Laf:
            r0.a()
            return r1
    }

    public final java.lang.Object U(defpackage.hm0 r9, int r10, long r11, java.lang.Object r13) {
            r8 = this;
            java.lang.Object r0 = r9.q(r10)
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r9.d0
            r2 = 0
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = defpackage.v80.R
            if (r0 != 0) goto L2a
            long r6 = r5.get(r8)
            long r6 = r6 & r3
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 < 0) goto L43
            if (r13 != 0) goto L1e
            gr1 r8 = defpackage.x80.n
            return r8
        L1e:
            boolean r0 = r9.p(r10, r0, r13)
            if (r0 == 0) goto L43
            r8.r()
            gr1 r8 = defpackage.x80.m
            return r8
        L2a:
            gr1 r6 = defpackage.x80.d
            if (r0 != r6) goto L43
            gr1 r6 = defpackage.x80.i
            boolean r0 = r9.p(r10, r0, r6)
            if (r0 == 0) goto L43
            r8.r()
            int r8 = r10 * 2
            java.lang.Object r8 = r1.get(r8)
            r9.s(r10, r2)
            return r8
        L43:
            java.lang.Object r0 = r9.q(r10)
            if (r0 == 0) goto Lb9
            gr1 r6 = defpackage.x80.e
            if (r0 != r6) goto L4e
            goto Lb9
        L4e:
            gr1 r6 = defpackage.x80.d
            if (r0 != r6) goto L67
            gr1 r6 = defpackage.x80.i
            boolean r0 = r9.p(r10, r0, r6)
            if (r0 == 0) goto L43
            r8.r()
            int r8 = r10 * 2
            java.lang.Object r8 = r1.get(r8)
            r9.s(r10, r2)
            return r8
        L67:
            gr1 r6 = defpackage.x80.j
            if (r0 != r6) goto L6e
            gr1 r8 = defpackage.x80.o
            return r8
        L6e:
            gr1 r7 = defpackage.x80.h
            if (r0 != r7) goto L75
            gr1 r8 = defpackage.x80.o
            return r8
        L75:
            gr1 r7 = defpackage.x80.l
            if (r0 != r7) goto L7f
            r8.r()
            gr1 r8 = defpackage.x80.o
            return r8
        L7f:
            gr1 r7 = defpackage.x80.g
            if (r0 == r7) goto L43
            gr1 r7 = defpackage.x80.f
            boolean r7 = r9.p(r10, r0, r7)
            if (r7 == 0) goto L43
            boolean r11 = r0 instanceof defpackage.as7
            if (r11 == 0) goto L93
            as7 r0 = (defpackage.as7) r0
            zr7 r0 = r0.a
        L93:
            boolean r12 = r8.S(r0, r9, r10)
            if (r12 == 0) goto Lab
            gr1 r11 = defpackage.x80.i
            r9.t(r10, r11)
            r8.r()
            int r8 = r10 * 2
            java.lang.Object r8 = r1.get(r8)
            r9.s(r10, r2)
            return r8
        Lab:
            r9.t(r10, r6)
            r9.n()
            if (r11 == 0) goto Lb6
            r8.r()
        Lb6:
            gr1 r8 = defpackage.x80.o
            return r8
        Lb9:
            long r6 = r5.get(r8)
            long r6 = r6 & r3
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 >= 0) goto Ld0
            gr1 r6 = defpackage.x80.h
            boolean r0 = r9.p(r10, r0, r6)
            if (r0 == 0) goto L43
            r8.r()
            gr1 r8 = defpackage.x80.o
            return r8
        Ld0:
            if (r13 != 0) goto Ld5
            gr1 r8 = defpackage.x80.n
            return r8
        Ld5:
            boolean r0 = r9.p(r10, r0, r13)
            if (r0 == 0) goto L43
            r8.r()
            gr1 r8 = defpackage.x80.m
            return r8
    }

    public final int V(defpackage.hm0 r6, int r7, java.lang.Object r8, long r9, java.lang.Object r11, boolean r12) {
            r5 = this;
        L0:
            java.lang.Object r0 = r6.q(r7)
            r1 = 4
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L34
            boolean r0 = r5.g(r9)
            if (r0 == 0) goto L1a
            if (r12 != 0) goto L1a
            gr1 r0 = defpackage.x80.d
            boolean r0 = r6.p(r7, r3, r0)
            if (r0 == 0) goto L0
            goto L40
        L1a:
            if (r12 == 0) goto L28
            gr1 r0 = defpackage.x80.j
            boolean r0 = r6.p(r7, r3, r0)
            if (r0 == 0) goto L0
            r6.n()
            return r1
        L28:
            if (r11 != 0) goto L2c
            r5 = 3
            return r5
        L2c:
            boolean r0 = r6.p(r7, r3, r11)
            if (r0 == 0) goto L0
            r5 = 2
            return r5
        L34:
            gr1 r4 = defpackage.x80.e
            if (r0 != r4) goto L41
            gr1 r1 = defpackage.x80.d
            boolean r0 = r6.p(r7, r0, r1)
            if (r0 == 0) goto L0
        L40:
            return r2
        L41:
            gr1 r9 = defpackage.x80.k
            r10 = 5
            if (r0 != r9) goto L4a
            r6.s(r7, r3)
            return r10
        L4a:
            gr1 r11 = defpackage.x80.h
            if (r0 != r11) goto L52
            r6.s(r7, r3)
            return r10
        L52:
            gr1 r11 = defpackage.x80.l
            if (r0 != r11) goto L5d
            r6.s(r7, r3)
            r5.G()
            return r1
        L5d:
            r6.s(r7, r3)
            boolean r11 = r0 instanceof defpackage.as7
            if (r11 == 0) goto L68
            as7 r0 = (defpackage.as7) r0
            zr7 r0 = r0.a
        L68:
            boolean r5 = r5.R(r0, r8)
            if (r5 == 0) goto L75
            gr1 r5 = defpackage.x80.i
            r6.t(r7, r5)
            r5 = 0
            return r5
        L75:
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r6.d0
            int r8 = r7 * 2
            int r8 = r8 + r2
            java.lang.Object r5 = r5.getAndSet(r8, r9)
            if (r5 == r9) goto L83
            r6.r(r7, r2)
        L83:
            return r10
    }

    public final void W(long r19) {
            r18 = this;
            r1 = r18
            boolean r0 = r1.I()
            if (r0 == 0) goto La
            goto L78
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.v80.Y
            long r2 = r6.get(r1)
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 <= 0) goto L8c
            int r0 = defpackage.x80.c
            r7 = 0
            r2 = r7
        L18:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.v80.Z
            r8 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r2 >= r0) goto L3a
            long r4 = r6.get(r1)
            long r10 = r3.get(r1)
            long r8 = r8 & r10
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 != 0) goto L37
            long r8 = r6.get(r1)
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 != 0) goto L37
            goto L78
        L37:
            int r2 = r2 + 1
            goto L18
        L3a:
            r0 = r3
        L3b:
            long r2 = r0.get(r1)
            long r4 = r2 & r8
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r4 = r4 + r10
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L89
        L4a:
            long r2 = r6.get(r1)
            r4 = r2
            long r2 = r0.get(r1)
            long r12 = r2 & r8
            long r14 = r2 & r10
            r16 = 0
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L5f
            r14 = 1
            goto L60
        L5f:
            r14 = r7
        L60:
            int r15 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r15 != 0) goto L7c
            long r15 = r6.get(r1)
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 != 0) goto L7c
        L6c:
            long r2 = r0.get(r1)
            long r4 = r2 & r8
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L79
        L78:
            return
        L79:
            r1 = r18
            goto L6c
        L7c:
            if (r14 != 0) goto L86
            long r4 = r10 + r12
            r1 = r18
            r0.compareAndSet(r1, r2, r4)
            goto L4a
        L86:
            r1 = r18
            goto L4a
        L89:
            r1 = r18
            goto L3b
        L8c:
            r1 = r18
            goto La
    }

    @Override // defpackage.ob6
    public java.lang.Object a(defpackage.r41 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r0 = Q(r0, r2, r1)
            return r0
    }

    @Override // defpackage.ob6
    public java.lang.Object c(java.lang.Object r16) {
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = defpackage.v80.R
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.E(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.g(r1)
            r1 = r1 ^ r10
        L1b:
            fm0 r13 = defpackage.gm0.b
            if (r1 == 0) goto L20
            return r13
        L20:
            gr1 r6 = defpackage.x80.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.v80.d0
            r1.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r2 = defpackage.v80.m0
            java.lang.Object r1 = r1.getObjectVolatile(r15, r2)
            hm0 r1 = (defpackage.hm0) r1
        L31:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.E(r2, r9)
            int r14 = defpackage.x80.b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.X
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L64
            hm0 r3 = r15.u(r11, r1)
            if (r3 != 0) goto L63
            if (r7 == 0) goto L5b
            java.lang.Throwable r0 = r15.y()
            em0 r1 = new em0
            r1.<init>(r0)
            return r1
        L5b:
            r9 = 0
            r10 = 1
        L5d:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L31
        L63:
            r1 = r3
        L64:
            r0 = r15
            r3 = r16
            int r9 = d(r0, r1, r2, r3, r4, r6, r7)
            jg7 r3 = defpackage.jg7.a
            if (r9 == 0) goto Lc3
            r10 = 1
            if (r9 == r10) goto Lc2
            r3 = 2
            r11 = 0
            if (r9 == r3) goto La2
            r2 = 3
            if (r9 == r2) goto L9c
            r2 = 4
            if (r9 == r2) goto L85
            r2 = 5
            if (r9 == r2) goto L80
            goto L83
        L80:
            r1.a()
        L83:
            r9 = 0
            goto L5d
        L85:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.v80.X
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L92
            r1.a()
        L92:
            java.lang.Throwable r0 = r15.y()
            em0 r1 = new em0
            r1.<init>(r0)
            return r1
        L9c:
            java.lang.String r0 = "unexpected"
            defpackage.i.m(r0)
            return r11
        La2:
            if (r7 == 0) goto Lb1
            r1.n()
            java.lang.Throwable r0 = r15.y()
            em0 r1 = new em0
            r1.<init>(r0)
            return r1
        Lb1:
            boolean r0 = r6 instanceof defpackage.zr7
            if (r0 == 0) goto Lb8
            r11 = r6
            zr7 r11 = (defpackage.zr7) r11
        Lb8:
            if (r11 == 0) goto Lbe
            int r2 = r2 + r14
            r11.a(r1, r2)
        Lbe:
            r1.n()
            return r13
        Lc2:
            return r3
        Lc3:
            r1.a()
            return r3
    }

    public final defpackage.o80 e() {
            r9 = this;
            o80 r0 = new o80
            r7 = 0
            r8 = 0
            r1 = 3
            java.lang.Class<v80> r3 = defpackage.v80.class
            java.lang.String r4 = "onCancellationImplDoNotCall"
            java.lang.String r5 = "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V"
            r6 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public final defpackage.o80 f() {
            r9 = this;
            o80 r0 = new o80
            r7 = 0
            r8 = 1
            r1 = 3
            java.lang.Class<v80> r3 = defpackage.v80.class
            java.lang.String r4 = "onCancellationChannelResultImplDoNotCall"
            java.lang.String r5 = "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V"
            r6 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public final boolean g(long r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.Y
            long r0 = r0.get(r4)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L1b
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.X
            long r0 = r0.get(r4)
            int r4 = r4.A
            long r2 = (long) r4
            long r0 = r0 + r2
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 >= 0) goto L19
            goto L1b
        L19:
            r4 = 0
            return r4
        L1b:
            r4 = 1
            return r4
    }

    @Override // defpackage.ul0
    public final void h(java.util.concurrent.CancellationException r2) {
            r1 = this;
            if (r2 != 0) goto L9
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Channel was cancelled"
            r2.<init>(r0)
        L9:
            r0 = 1
            r1.k(r2, r0)
            return
    }

    public final boolean i(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            boolean r1 = r1.k(r2, r0)
            return r1
    }

    @Override // defpackage.ul0
    public final defpackage.n80 iterator() {
            r1 = this;
            n80 r0 = new n80
            r0.<init>(r1)
            return r0
    }

    public final defpackage.hm0 j() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.f0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.v80.j0
            java.lang.Object r1 = r0.getObjectVolatile(r7, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.v80.d0
            r2.getClass()
            long r2 = defpackage.v80.m0
            java.lang.Object r2 = r0.getObjectVolatile(r7, r2)
            hm0 r2 = (defpackage.hm0) r2
            long r3 = r2.X
            r5 = r1
            hm0 r5 = (defpackage.hm0) r5
            long r5 = r5.X
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L26
            r1 = r2
        L26:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.v80.e0
            r2.getClass()
            long r2 = defpackage.v80.l0
            java.lang.Object r7 = r0.getObjectVolatile(r7, r2)
            hm0 r7 = (defpackage.hm0) r7
            long r2 = r7.X
            r0 = r1
            hm0 r0 = (defpackage.hm0) r0
            long r4 = r0.X
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L3f
            r1 = r7
        L3f:
            vy0 r1 = (defpackage.vy0) r1
        L41:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.vy0.A
            java.lang.Object r7 = r1.e()
            gr1 r0 = defpackage.uy0.a
            if (r7 != r0) goto L4c
            goto L56
        L4c:
            vy0 r7 = (defpackage.vy0) r7
            if (r7 != 0) goto L59
            boolean r7 = r1.h()
            if (r7 == 0) goto L41
        L56:
            hm0 r1 = (defpackage.hm0) r1
            return r1
        L59:
            r1 = r7
            goto L41
    }

    public final boolean k(java.lang.Throwable r14, boolean r15) {
            r13 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.v80.R
            if (r15 == 0) goto L25
        Lb:
            long r5 = r3.get(r13)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L25
            long r7 = r5 & r1
            hm0 r4 = defpackage.x80.a
            r9 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r7 = r7 + r9
            r4 = r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L23
            goto L26
        L23:
            r13 = r4
            goto Lb
        L25:
            r4 = r13
        L26:
            gr1 r8 = defpackage.x80.s
        L28:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = defpackage.v80.g0
            r13.getClass()
            r5 = r4
            sun.misc.Unsafe r4 = defpackage.v36.a
            long r6 = defpackage.v80.i0
            r9 = r14
            boolean r13 = r4.compareAndSwapObject(r5, r6, r8, r9)
            r14 = r4
            r4 = r5
            r10 = 1
            if (r13 == 0) goto L3e
            r13 = r10
            goto L45
        L3e:
            java.lang.Object r13 = r14.getObjectVolatile(r4, r6)
            if (r13 == r8) goto L7e
            r13 = 0
        L45:
            r11 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            if (r15 == 0) goto L58
        L49:
            long r5 = r3.get(r4)
            long r14 = r5 & r1
            long r7 = r11 + r14
            boolean r14 = r3.compareAndSet(r4, r5, r7)
            if (r14 == 0) goto L49
            goto L75
        L58:
            long r5 = r3.get(r4)
            long r14 = r5 >> r0
            int r14 = (int) r14
            if (r14 == 0) goto L69
            if (r14 == r10) goto L64
            goto L75
        L64:
            long r14 = r5 & r1
            long r14 = r14 + r11
        L67:
            r7 = r14
            goto L6f
        L69:
            long r14 = r5 & r1
            r7 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r14 = r14 + r7
            goto L67
        L6f:
            boolean r14 = r3.compareAndSet(r4, r5, r7)
            if (r14 == 0) goto L58
        L75:
            r4.G()
            if (r13 == 0) goto L7d
            r4.C()
        L7d:
            return r13
        L7e:
            r14 = r9
            goto L28
    }

    @Override // defpackage.ul0
    public final defpackage.eb l() {
            r6 = this;
            eb r0 = new eb
            r80 r2 = defpackage.r80.d0
            r1 = 3
            defpackage.ge7.p(r1, r2)
            s80 r3 = defpackage.s80.d0
            defpackage.ge7.p(r1, r3)
            ov4 r4 = r6.L
            r5 = 19
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // defpackage.ul0
    public final java.lang.Object m() {
            r11 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.X
            long r1 = r0.get(r11)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.v80.R
            long r3 = r3.get(r11)
            r5 = 1
            boolean r5 = r11.E(r3, r5)
            if (r5 == 0) goto L1d
            java.lang.Throwable r11 = r11.v()
            em0 r0 = new em0
            r0.<init>(r11)
            return r0
        L1d:
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r5
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            fm0 r2 = defpackage.gm0.b
            if (r1 < 0) goto L2a
            return r2
        L2a:
            gr1 r8 = defpackage.x80.k
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.v80.e0
            r1.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r3 = defpackage.v80.l0
            java.lang.Object r1 = r1.getObjectVolatile(r11, r3)
            hm0 r1 = (defpackage.hm0) r1
        L3b:
            boolean r3 = r11.F()
            if (r3 == 0) goto L4b
            java.lang.Throwable r11 = r11.v()
            em0 r0 = new em0
            r0.<init>(r11)
            return r0
        L4b:
            long r6 = r0.getAndIncrement(r11)
            int r3 = defpackage.x80.b
            long r3 = (long) r3
            long r9 = r6 / r3
            long r3 = r6 % r3
            int r5 = (int) r3
            long r3 = r1.X
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto L67
            hm0 r3 = r11.t(r9, r1)
            if (r3 != 0) goto L64
            goto L3b
        L64:
            r4 = r3
        L65:
            r3 = r11
            goto L69
        L67:
            r4 = r1
            goto L65
        L69:
            java.lang.Object r11 = r3.U(r4, r5, r6, r8)
            r1 = r4
            gr1 r4 = defpackage.x80.m
            r9 = 0
            if (r11 != r4) goto L86
            boolean r11 = r8 instanceof defpackage.zr7
            if (r11 == 0) goto L7a
            r9 = r8
            zr7 r9 = (defpackage.zr7) r9
        L7a:
            if (r9 == 0) goto L7f
            r9.a(r1, r5)
        L7f:
            r3.W(r6)
            r1.n()
            return r2
        L86:
            gr1 r4 = defpackage.x80.o
            if (r11 != r4) goto L97
            long r4 = r3.z()
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 >= 0) goto L95
            r1.a()
        L95:
            r11 = r3
            goto L3b
        L97:
            gr1 r0 = defpackage.x80.n
            if (r11 == r0) goto L9f
            r1.a()
            return r11
        L9f:
            java.lang.String r11 = "unexpected"
            defpackage.i.m(r11)
            return r9
    }

    public final defpackage.hm0 n(long r12) {
            r11 = this;
            hm0 r0 = r11.j()
            boolean r1 = r11.H()
            r2 = 1
            r3 = -1
            if (r1 == 0) goto L56
            r1 = r0
        Ld:
            int r4 = defpackage.x80.b
            int r4 = r4 - r2
        L10:
            r5 = -1
            if (r3 >= r4) goto L46
            long r7 = r1.X
            int r9 = defpackage.x80.b
            long r9 = (long) r9
            long r7 = r7 * r9
            long r9 = (long) r4
            long r7 = r7 + r9
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = defpackage.v80.X
            long r9 = r9.get(r11)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 >= 0) goto L28
        L26:
            r7 = r5
            goto L4f
        L28:
            java.lang.Object r9 = r1.q(r4)
            if (r9 == 0) goto L38
            gr1 r10 = defpackage.x80.e
            if (r9 != r10) goto L33
            goto L38
        L33:
            gr1 r10 = defpackage.x80.d
            if (r9 != r10) goto L43
            goto L4f
        L38:
            gr1 r10 = defpackage.x80.l
            boolean r9 = r1.p(r4, r9, r10)
            if (r9 == 0) goto L28
            r1.n()
        L43:
            int r4 = r4 + (-1)
            goto L10
        L46:
            vy0 r1 = r1.f()
            hm0 r1 = (defpackage.hm0) r1
            if (r1 != 0) goto Ld
            goto L26
        L4f:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L56
            r11.q(r7)
        L56:
            r1 = 0
            r4 = r0
        L58:
            if (r4 == 0) goto Lb7
            int r5 = defpackage.x80.b
            int r5 = r5 - r2
        L5d:
            if (r3 >= r5) goto Lb0
            long r6 = r4.X
            int r8 = defpackage.x80.b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r5
            long r6 = r6 + r8
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 < 0) goto Lb7
        L6b:
            java.lang.Object r6 = r4.q(r5)
            if (r6 == 0) goto La2
            gr1 r7 = defpackage.x80.e
            if (r6 != r7) goto L76
            goto La2
        L76:
            boolean r7 = r6 instanceof defpackage.as7
            if (r7 == 0) goto L8e
            gr1 r7 = defpackage.x80.l
            boolean r7 = r4.p(r5, r6, r7)
            if (r7 == 0) goto L6b
            as7 r6 = (defpackage.as7) r6
            zr7 r6 = r6.a
            java.lang.Object r1 = defpackage.ii2.M(r1, r6)
            r4.r(r5, r2)
            goto Lad
        L8e:
            boolean r7 = r6 instanceof defpackage.zr7
            if (r7 == 0) goto Lad
            gr1 r7 = defpackage.x80.l
            boolean r7 = r4.p(r5, r6, r7)
            if (r7 == 0) goto L6b
            java.lang.Object r1 = defpackage.ii2.M(r1, r6)
            r4.r(r5, r2)
            goto Lad
        La2:
            gr1 r7 = defpackage.x80.l
            boolean r6 = r4.p(r5, r6, r7)
            if (r6 == 0) goto L6b
            r4.n()
        Lad:
            int r5 = r5 + (-1)
            goto L5d
        Lb0:
            vy0 r4 = r4.f()
            hm0 r4 = (defpackage.hm0) r4
            goto L58
        Lb7:
            if (r1 == 0) goto Ld8
            boolean r12 = r1 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc3
            zr7 r1 = (defpackage.zr7) r1
            r11.P(r1, r2)
            return r0
        Lc3:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r12 = r1.size()
            int r12 = r12 - r2
        Lca:
            if (r3 >= r12) goto Ld8
            java.lang.Object r13 = r1.get(r12)
            zr7 r13 = (defpackage.zr7) r13
            r11.P(r13, r2)
            int r12 = r12 + (-1)
            goto Lca
        Ld8:
            return r0
    }

    @Override // defpackage.ul0
    public final java.lang.Object o(defpackage.hw6 r1) {
            r0 = this;
            java.lang.Object r0 = L(r0, r1)
            return r0
    }

    @Override // defpackage.ul0
    public final java.lang.Object p(defpackage.cu0 r1) {
            r0 = this;
            java.lang.Object r0 = M(r0, r1)
            return r0
    }

    public final void q(long r10) {
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.e0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.v80.l0
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            hm0 r0 = (defpackage.hm0) r0
        Lf:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.v80.X
            long r3 = r1.get(r9)
            int r2 = r9.A
            long r5 = (long) r2
            long r5 = r5 + r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.v80.Y
            long r7 = r2.get(r9)
            long r5 = java.lang.Math.max(r5, r7)
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto L28
            return
        L28:
            r5 = 1
            long r5 = r5 + r3
            r2 = r9
            boolean r9 = r1.compareAndSet(r2, r3, r5)
            if (r9 == 0) goto L73
            int r9 = defpackage.x80.b
            long r5 = (long) r9
            long r7 = r3 / r5
            long r5 = r3 % r5
            int r9 = (int) r5
            long r5 = r0.X
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L48
            hm0 r1 = r2.t(r7, r0)
            if (r1 != 0) goto L47
            goto L73
        L47:
            r0 = r1
        L48:
            r7 = 0
            r5 = r3
            r4 = r9
            r3 = r0
            java.lang.Object r9 = r2.U(r3, r4, r5, r7)
            gr1 r0 = defpackage.x80.o
            if (r9 != r0) goto L60
            long r0 = r2.z()
            int r9 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r9 >= 0) goto L70
            r3.a()
            goto L70
        L60:
            r3.a()
            qn2 r0 = r2.B
            if (r0 == 0) goto L70
            r1 = 0
            ug r9 = defpackage.oi2.l(r0, r9, r1)
            if (r9 != 0) goto L6f
            goto L70
        L6f:
            throw r9
        L70:
            r9 = r2
            r0 = r3
            goto Lf
        L73:
            r9 = r2
            goto Lf
    }

    public final void r() {
            r9 = this;
            boolean r0 = r9.I()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.f0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.v80.j0
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            hm0 r0 = (defpackage.hm0) r0
            r4 = r0
        L17:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.Y
            long r5 = r0.getAndIncrement(r9)
            int r0 = defpackage.x80.b
            long r7 = (long) r0
            long r2 = r5 / r7
            long r0 = r9.z()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L3d
            long r0 = r4.X
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L39
            vy0 r0 = r4.d()
            if (r0 == 0) goto L39
            r9.J(r2, r4)
        L39:
            B(r9)
            return
        L3d:
            long r0 = r4.X
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = r9
            if (r0 == 0) goto L4d
            hm0 r9 = r1.s(r2, r4, r5)
            if (r9 != 0) goto L4c
        L4a:
            r9 = r1
            goto L17
        L4c:
            r4 = r9
        L4d:
            long r2 = r5 % r7
            int r9 = (int) r2
            java.lang.Object r0 = r4.q(r9)
            boolean r2 = r0 instanceof defpackage.zr7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.v80.X
            if (r2 == 0) goto L80
            long r7 = r3.get(r1)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L80
            gr1 r2 = defpackage.x80.g
            boolean r2 = r4.p(r9, r0, r2)
            if (r2 == 0) goto L80
            boolean r0 = r1.S(r0, r4, r9)
            if (r0 == 0) goto L77
            gr1 r0 = defpackage.x80.d
            r4.t(r9, r0)
            goto Lf1
        L77:
            gr1 r0 = defpackage.x80.j
            r4.t(r9, r0)
            r4.n()
            goto Lc0
        L80:
            java.lang.Object r0 = r4.q(r9)
            boolean r2 = r0 instanceof defpackage.zr7
            if (r2 == 0) goto Lbc
            long r7 = r3.get(r1)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L9f
            as7 r2 = new as7
            r7 = r0
            zr7 r7 = (defpackage.zr7) r7
            r2.<init>(r7)
            boolean r0 = r4.p(r9, r0, r2)
            if (r0 == 0) goto L80
            goto Lf1
        L9f:
            gr1 r2 = defpackage.x80.g
            boolean r2 = r4.p(r9, r0, r2)
            if (r2 == 0) goto L80
            boolean r0 = r1.S(r0, r4, r9)
            if (r0 == 0) goto Lb3
            gr1 r0 = defpackage.x80.d
            r4.t(r9, r0)
            goto Lf1
        Lb3:
            gr1 r0 = defpackage.x80.j
            r4.t(r9, r0)
            r4.n()
            goto Lc0
        Lbc:
            gr1 r2 = defpackage.x80.j
            if (r0 != r2) goto Lc4
        Lc0:
            B(r1)
            goto L4a
        Lc4:
            if (r0 != 0) goto Lcf
            gr1 r2 = defpackage.x80.e
            boolean r0 = r4.p(r9, r0, r2)
            if (r0 == 0) goto L80
            goto Lf1
        Lcf:
            gr1 r2 = defpackage.x80.d
            if (r0 != r2) goto Ld4
            goto Lf1
        Ld4:
            gr1 r2 = defpackage.x80.h
            if (r0 == r2) goto Lf1
            gr1 r2 = defpackage.x80.i
            if (r0 == r2) goto Lf1
            gr1 r2 = defpackage.x80.k
            if (r0 != r2) goto Le1
            goto Lf1
        Le1:
            gr1 r2 = defpackage.x80.l
            if (r0 != r2) goto Le6
            goto Lf1
        Le6:
            gr1 r2 = defpackage.x80.f
            if (r0 != r2) goto Leb
            goto L80
        Leb:
            java.lang.String r9 = "Unexpected cell state: "
            defpackage.e41.h(r0, r9)
            return
        Lf1:
            B(r1)
            return
    }

    public final defpackage.hm0 s(long r18, defpackage.hm0 r20, long r21) {
            r17 = this;
            r1 = r17
            r6 = r18
            hm0 r0 = defpackage.x80.a
            w80 r8 = defpackage.w80.d0
            r9 = r20
        La:
            java.lang.Object r10 = defpackage.uy0.a(r9, r6, r8)
            boolean r0 = defpackage.oi2.J(r10)
            if (r0 != 0) goto L5c
            p96 r5 = defpackage.oi2.B(r10)
        L18:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.f0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r11 = defpackage.v80.j0
            java.lang.Object r0 = r0.getObjectVolatile(r1, r11)
            r4 = r0
            p96 r4 = (defpackage.p96) r4
            long r2 = r4.X
            long r13 = r5.X
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L31
            goto L5c
        L31:
            boolean r0 = r5.o()
            if (r0 != 0) goto L38
            goto La
        L38:
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.v80.j0
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L4c
            boolean r0 = r4.k()
            if (r0 == 0) goto L5c
            r4.i()
            goto L5c
        L4c:
            java.lang.Object r0 = r0.getObjectVolatile(r1, r11)
            if (r0 == r4) goto L38
            boolean r0 = r5.k()
            if (r0 == 0) goto L18
            r5.i()
            goto L18
        L5c:
            boolean r0 = defpackage.oi2.J(r10)
            r8 = 0
            if (r0 == 0) goto L6d
            r1.G()
            r17.J(r18, r20)
            B(r1)
            return r8
        L6d:
            p96 r0 = defpackage.oi2.B(r10)
            hm0 r0 = (defpackage.hm0) r0
            long r2 = r0.X
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto Lac
            r4 = 1
            long r4 = r21 + r4
            int r0 = defpackage.x80.b
            long r6 = (long) r0
            long r2 = r2 * r6
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.Y
            r15 = r4
            r4 = r2
            r2 = r15
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto La8
            long r2 = r4 - r21
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.Z
            long r2 = r0.addAndGet(r1, r2)
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r2 = r2 & r4
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto La7
        L9d:
            long r2 = r0.get(r1)
            long r2 = r2 & r4
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto La7
            goto L9d
        La7:
            return r8
        La8:
            B(r1)
            return r8
        Lac:
            return r0
    }

    public final defpackage.hm0 t(long r16, defpackage.hm0 r18) {
            r15 = this;
            r6 = r16
            r8 = r18
            hm0 r0 = defpackage.x80.a
            w80 r9 = defpackage.w80.d0
        L8:
            java.lang.Object r10 = defpackage.uy0.a(r8, r6, r9)
            boolean r0 = defpackage.oi2.J(r10)
            if (r0 != 0) goto L5b
            p96 r5 = defpackage.oi2.B(r10)
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.e0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r11 = defpackage.v80.l0
            java.lang.Object r0 = r0.getObjectVolatile(r15, r11)
            r4 = r0
            p96 r4 = (defpackage.p96) r4
            long r2 = r4.X
            long r13 = r5.X
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L2f
            goto L5b
        L2f:
            boolean r0 = r5.o()
            if (r0 != 0) goto L36
            goto L8
        L36:
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.v80.l0
            r1 = r15
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L4b
            boolean r0 = r4.k()
            if (r0 == 0) goto L5b
            r4.i()
            goto L5b
        L4b:
            java.lang.Object r0 = r0.getObjectVolatile(r15, r11)
            if (r0 == r4) goto L36
            boolean r0 = r5.k()
            if (r0 == 0) goto L16
            r5.i()
            goto L16
        L5b:
            boolean r0 = defpackage.oi2.J(r10)
            r9 = 0
            if (r0 == 0) goto L77
            r15.G()
            long r2 = r8.X
            int r0 = defpackage.x80.b
            long r4 = (long) r0
            long r2 = r2 * r4
            long r0 = r15.z()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L106
            r8.a()
            return r9
        L77:
            p96 r0 = defpackage.oi2.B(r10)
            r5 = r0
            hm0 r5 = (defpackage.hm0) r5
            long r10 = r5.X
            boolean r0 = r15.I()
            if (r0 != 0) goto Ld9
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.Y
            long r2 = r0.get(r15)
            int r0 = defpackage.x80.b
            long r12 = (long) r0
            long r2 = r2 / r12
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto Ld9
        L94:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.f0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r12 = defpackage.v80.j0
            java.lang.Object r0 = r0.getObjectVolatile(r15, r12)
            r4 = r0
            p96 r4 = (defpackage.p96) r4
            long r2 = r4.X
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 >= 0) goto Ld9
            boolean r0 = r5.o()
            if (r0 == 0) goto Ld9
        Lb0:
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.v80.j0
            r1 = r15
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            r8 = r5
            if (r2 == 0) goto Lc6
            boolean r0 = r4.k()
            if (r0 == 0) goto Lda
            r4.i()
            goto Lda
        Lc6:
            java.lang.Object r0 = r0.getObjectVolatile(r15, r12)
            if (r0 == r4) goto Ld7
            boolean r0 = r8.k()
            if (r0 == 0) goto Ld5
            r8.i()
        Ld5:
            r5 = r8
            goto L94
        Ld7:
            r5 = r8
            goto Lb0
        Ld9:
            r8 = r5
        Lda:
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 <= 0) goto L107
            int r0 = defpackage.x80.b
            long r2 = (long) r0
            long r4 = r10 * r2
        Le3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.X
            long r2 = r0.get(r15)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto Lee
            goto Lf7
        Lee:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.X
            r1 = r15
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto Le3
        Lf7:
            int r0 = defpackage.x80.b
            long r0 = (long) r0
            long r10 = r10 * r0
            long r0 = r15.z()
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L106
            r8.a()
        L106:
            return r9
        L107:
            return r8
    }

    public final java.lang.String toString() {
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.v80.R
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 3
            r4 = 2
            if (r2 == r4) goto L1e
            if (r2 == r3) goto L18
            goto L23
        L18:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L23
        L1e:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L23:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "capacity="
            r2.<init>(r5)
            int r5 = r0.A
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            hm0[] r2 = new defpackage.hm0[r3]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.v80.e0
            r3.getClass()
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r6 = defpackage.v80.l0
            java.lang.Object r6 = r3.getObjectVolatile(r0, r6)
            r7 = 0
            r2[r7] = r6
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = defpackage.v80.d0
            r6.getClass()
            long r8 = defpackage.v80.m0
            java.lang.Object r6 = r3.getObjectVolatile(r0, r8)
            r8 = 1
            r2[r8] = r6
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = defpackage.v80.f0
            r6.getClass()
            long r9 = defpackage.v80.j0
            java.lang.Object r3 = r3.getObjectVolatile(r0, r9)
            r2[r4] = r3
            java.util.List r2 = defpackage.hf.c0(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L7a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L8f
            java.lang.Object r4 = r2.next()
            r6 = r4
            hm0 r6 = (defpackage.hm0) r6
            hm0 r9 = defpackage.x80.a
            if (r6 == r9) goto L7a
            r3.add(r4)
            goto L7a
        L8f:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1eb
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto La4
            goto Lbe
        La4:
            r4 = r3
            hm0 r4 = (defpackage.hm0) r4
            long r9 = r4.X
        La9:
            java.lang.Object r4 = r2.next()
            r6 = r4
            hm0 r6 = (defpackage.hm0) r6
            long r11 = r6.X
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto Lb8
            r3 = r4
            r9 = r11
        Lb8:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto La9
        Lbe:
            hm0 r3 = (defpackage.hm0) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.v80.X
            long r11 = r2.get(r0)
            long r13 = r0.z()
        Lca:
            int r0 = defpackage.x80.b
            r2 = r7
        Lcd:
            if (r2 >= r0) goto L1c1
            long r9 = r3.X
            int r4 = defpackage.x80.b
            r15 = r8
            long r7 = (long) r4
            long r9 = r9 * r7
            long r7 = (long) r2
            long r9 = r9 + r7
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 < 0) goto Le0
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 >= 0) goto L1cb
        Le0:
            java.lang.Object r7 = r3.q(r2)
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r3.d0
            int r6 = r2 * 2
            java.lang.Object r6 = r8.get(r6)
            boolean r8 = r7 instanceof defpackage.qj0
            if (r8 == 0) goto L106
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 >= 0) goto Lfa
            if (r4 < 0) goto Lfa
            java.lang.String r4 = "receive"
            goto L18a
        Lfa:
            if (r4 >= 0) goto L102
            if (r7 < 0) goto L102
            java.lang.String r4 = "send"
            goto L18a
        L102:
            java.lang.String r4 = "cont"
            goto L18a
        L106:
            boolean r8 = r7 instanceof defpackage.v96
            if (r8 == 0) goto L120
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 >= 0) goto L114
            if (r4 < 0) goto L114
            java.lang.String r4 = "onReceive"
            goto L18a
        L114:
            if (r4 >= 0) goto L11c
            if (r7 < 0) goto L11c
            java.lang.String r4 = "onSend"
            goto L18a
        L11c:
            java.lang.String r4 = "select"
            goto L18a
        L120:
            boolean r4 = r7 instanceof defpackage.bf5
            if (r4 == 0) goto L127
            java.lang.String r4 = "receiveCatching"
            goto L18a
        L127:
            boolean r4 = r7 instanceof defpackage.as7
            if (r4 == 0) goto L13f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "EB("
            r4.<init>(r8)
            r4.append(r7)
            r7 = 41
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            goto L18a
        L13f:
            gr1 r4 = defpackage.x80.f
            boolean r4 = defpackage.nb3.k(r7, r4)
            if (r4 != 0) goto L188
            gr1 r4 = defpackage.x80.g
            boolean r4 = defpackage.nb3.k(r7, r4)
            if (r4 == 0) goto L150
            goto L188
        L150:
            if (r7 == 0) goto L1bb
            gr1 r4 = defpackage.x80.e
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L1bb
            gr1 r4 = defpackage.x80.i
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L1bb
            gr1 r4 = defpackage.x80.h
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L1bb
            gr1 r4 = defpackage.x80.k
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L1bb
            gr1 r4 = defpackage.x80.j
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L1bb
            gr1 r4 = defpackage.x80.l
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L183
            goto L1bb
        L183:
            java.lang.String r4 = r7.toString()
            goto L18a
        L188:
            java.lang.String r4 = "resuming_sender"
        L18a:
            if (r6 == 0) goto L1a9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "("
            r7.<init>(r8)
            r7.append(r4)
            r7.append(r5)
            r7.append(r6)
            java.lang.String r4 = "),"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r1.append(r4)
            goto L1bb
        L1a9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r1.append(r4)
        L1bb:
            int r2 = r2 + 1
            r8 = r15
            r7 = 0
            goto Lcd
        L1c1:
            r15 = r8
            vy0 r0 = r3.d()
            r3 = r0
            hm0 r3 = (defpackage.hm0) r3
            if (r3 != 0) goto L1e7
        L1cb:
            char r0 = defpackage.qs6.w0(r1)
            if (r0 != r5) goto L1dd
            int r0 = r1.length()
            int r0 = r0 - r15
            java.lang.StringBuilder r0 = r1.deleteCharAt(r0)
            r0.getClass()
        L1dd:
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L1e7:
            r8 = r15
            r7 = 0
            goto Lca
        L1eb:
            defpackage.fa6.c()
            r0 = 0
            return r0
    }

    public final defpackage.hm0 u(long r17, defpackage.hm0 r19) {
            r16 = this;
            r1 = r16
            r6 = r17
            r8 = r19
            hm0 r0 = defpackage.x80.a
            w80 r9 = defpackage.w80.d0
        La:
            java.lang.Object r10 = defpackage.uy0.a(r8, r6, r9)
            boolean r0 = defpackage.oi2.J(r10)
            if (r0 != 0) goto L5c
            p96 r5 = defpackage.oi2.B(r10)
        L18:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r11 = defpackage.v80.m0
            java.lang.Object r0 = r0.getObjectVolatile(r1, r11)
            r4 = r0
            p96 r4 = (defpackage.p96) r4
            long r2 = r4.X
            long r13 = r5.X
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L31
            goto L5c
        L31:
            boolean r0 = r5.o()
            if (r0 != 0) goto L38
            goto La
        L38:
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.v80.m0
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L4c
            boolean r0 = r4.k()
            if (r0 == 0) goto L5c
            r4.i()
            goto L5c
        L4c:
            java.lang.Object r0 = r0.getObjectVolatile(r1, r11)
            if (r0 == r4) goto L38
            boolean r0 = r5.k()
            if (r0 == 0) goto L18
            r5.i()
            goto L18
        L5c:
            boolean r0 = defpackage.oi2.J(r10)
            r9 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = defpackage.v80.X
            if (r0 == 0) goto L7a
            r1.G()
            long r2 = r8.X
            int r0 = defpackage.x80.b
            long r4 = (long) r0
            long r2 = r2 * r4
            long r0 = r11.get(r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lbc
            r8.a()
            return r9
        L7a:
            p96 r0 = defpackage.oi2.B(r10)
            r8 = r0
            hm0 r8 = (defpackage.hm0) r8
            long r12 = r8.X
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 <= 0) goto Lbd
            int r0 = defpackage.x80.b
            long r2 = (long) r0
            long r6 = r12 * r2
        L8c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.R
            long r2 = r0.get(r1)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L9d
            goto Lad
        L9d:
            r0 = 60
            long r14 = r2 >> r0
            int r10 = (int) r14
            long r14 = (long) r10
            long r14 = r14 << r0
            long r4 = r4 + r14
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.R
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L8c
        Lad:
            int r0 = defpackage.x80.b
            long r2 = (long) r0
            long r12 = r12 * r2
            long r0 = r11.get(r1)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lbc
            r8.a()
        Lbc:
            return r9
        Lbd:
            return r8
    }

    public final java.lang.Throwable v() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.g0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.v80.i0
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            return r3
    }

    public final defpackage.eb w() {
            r6 = this;
            eb r0 = new eb
            p80 r2 = defpackage.p80.d0
            r1 = 3
            defpackage.ge7.p(r1, r2)
            q80 r3 = defpackage.q80.d0
            defpackage.ge7.p(r1, r3)
            ov4 r4 = r6.L
            r5 = 19
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final java.lang.Throwable x() {
            r1 = this;
            java.lang.Throwable r1 = r1.v()
            if (r1 != 0) goto Ld
            es0 r1 = new es0
            java.lang.String r0 = "Channel was closed"
            r1.<init>(r0)
        Ld:
            return r1
    }

    public final java.lang.Throwable y() {
            r1 = this;
            java.lang.Throwable r1 = r1.v()
            if (r1 != 0) goto Ld
            fs0 r1 = new fs0
            java.lang.String r0 = "Channel was closed"
            r1.<init>(r0)
        Ld:
            return r1
    }

    public final long z() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v80.R
            long r0 = r0.get(r4)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r0 = r0 & r2
            return r0
    }
}
