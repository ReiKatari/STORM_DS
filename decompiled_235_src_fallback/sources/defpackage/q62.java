package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q62  reason: default package */
/* loaded from: classes.dex */
public abstract class q62 extends defpackage.l62 implements defpackage.ug1 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater Z = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater d0 = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater e0 = null;
    public static final /* synthetic */ long f0 = 0;
    public static final /* synthetic */ long g0 = 0;
    private volatile /* synthetic */ java.lang.Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ java.lang.Object _queue$volatile;

    static {
            java.lang.Class<q62> r0 = defpackage.q62.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_queue$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.q62.Z = r3
            sun.misc.Unsafe r3 = defpackage.v36.a
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)
            long r4 = r3.objectFieldOffset(r2)
            defpackage.q62.g0 = r4
            java.lang.String r2 = "_delayed$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.q62.d0 = r1
            java.lang.reflect.Field r1 = r0.getDeclaredField(r2)
            long r1 = r3.objectFieldOffset(r1)
            defpackage.q62.f0 = r1
            java.lang.String r1 = "_isCompleted$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.q62.e0 = r0
            return
    }

    @Override // defpackage.ug1
    public defpackage.il1 A(long r1, java.lang.Runnable r3, defpackage.l61 r4) {
            r0 = this;
            ug1 r0 = defpackage.td1.a
            il1 r0 = r0.A(r1, r3, r4)
            return r0
    }

    public void A0(long r1, defpackage.o62 r3) {
            r0 = this;
            sd1 r0 = defpackage.sd1.h0
            r0.D0(r1, r3)
            return
    }

    public final void B0() {
            r5 = this;
            long r0 = java.lang.System.nanoTime()
        L4:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.q62.d0
            r2.getClass()
            sun.misc.Unsafe r2 = defpackage.v36.a
            long r3 = defpackage.q62.f0
            java.lang.Object r2 = r2.getObjectVolatile(r5, r3)
            p62 r2 = (defpackage.p62) r2
            if (r2 == 0) goto L31
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.p57.b     // Catch: java.lang.Throwable -> L24
            int r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L24
            if (r3 <= 0) goto L26
            r3 = 0
            o62 r3 = r2.b(r3)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r5 = move-exception
            goto L2f
        L26:
            r3 = 0
        L27:
            monitor-exit(r2)
            if (r3 != 0) goto L2b
            goto L31
        L2b:
            r5.A0(r0, r3)
            goto L4
        L2f:
            monitor-exit(r2)
            throw r5
        L31:
            return
    }

    public final void C0() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q62.Z
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.q62.g0
            r3 = 0
            r0.putObjectVolatile(r4, r1, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.q62.d0
            r1.getClass()
            long r1 = defpackage.q62.f0
            r0.putObjectVolatile(r4, r1, r3)
            return
    }

    public final void D0(long r3, defpackage.o62 r5) {
            r2 = this;
            int r0 = r2.E0(r3, r5)
            if (r0 == 0) goto L17
            r1 = 1
            if (r0 == r1) goto L13
            r2 = 2
            if (r0 != r2) goto Ld
            goto L2a
        Ld:
            java.lang.String r2 = "unexpected result"
            defpackage.i.m(r2)
            return
        L13:
            r2.A0(r3, r5)
            return
        L17:
            boolean r3 = r2.F0(r5)
            if (r3 == 0) goto L2a
            java.lang.Thread r2 = r2.y0()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            if (r3 == r2) goto L2a
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L2a:
            return
    }

    public final int E0(long r10, defpackage.o62 r12) {
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.q62.e0
            int r0 = r0.get(r9)
            r1 = 1
            if (r0 != r1) goto La
            return r1
        La:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q62.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.q62.f0
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            p62 r0 = (defpackage.p62) r0
            if (r0 != 0) goto L42
            p62 r8 = new p62
            r8.<init>()
            r8.c = r10
        L22:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.q62.f0
            r7 = 0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L2f
            goto L35
        L2f:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == 0) goto L40
        L35:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            r9.getClass()
            r0 = r9
            p62 r0 = (defpackage.p62) r0
            goto L43
        L40:
            r9 = r4
            goto L22
        L42:
            r4 = r9
        L43:
            int r9 = r12.b(r10, r0, r4)
            return r9
    }

    public final boolean F0(defpackage.o62 r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q62.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.q62.f0
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            p62 r3 = (defpackage.p62) r3
            r0 = 0
            r1 = 0
            if (r3 == 0) goto L21
            monitor-enter(r3)
            o62[] r2 = r3.a     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            r0 = r2[r1]     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r4 = move-exception
            goto L1f
        L1d:
            monitor-exit(r3)
            goto L21
        L1f:
            monitor-exit(r3)
            throw r4
        L21:
            if (r0 != r4) goto L25
            r3 = 1
            return r3
        L25:
            return r1
    }

    @Override // defpackage.ug1
    public final void J(long r4, defpackage.rj0 r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            goto L1a
        L7:
            r0 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L16
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L1a
        L16:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r4
        L1a:
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L39
            long r4 = java.lang.System.nanoTime()
            m62 r2 = new m62
            long r0 = r0 + r4
            r2.<init>(r3, r0, r6)
            r3.D0(r4, r2)
            kj0 r3 = new kj0
            r4 = 2
            r3.<init>(r2, r4)
            r6.A(r3)
        L39:
            return
    }

    @Override // defpackage.n61
    public final void j0(defpackage.l61 r1, java.lang.Runnable r2) {
            r0 = this;
            r0.u0(r2)
            return
    }

    @Override // defpackage.l62
    public final long q0() {
            r3 = this;
            boolean r0 = r3.r0()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            r3.v0()
            java.lang.Runnable r0 = r3.t0()
            if (r0 == 0) goto L16
            r0.run()
            return r1
        L16:
            long r0 = r3.x0()
            return r0
    }

    public final void s0() {
            r14 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q62.Z
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.q62.g0
            java.lang.Object r7 = r0.getObjectVolatile(r14, r1)
            gr1 r13 = defpackage.r62.b
            if (r7 != 0) goto L28
        L11:
            sun.misc.Unsafe r8 = defpackage.v36.a
            long r10 = defpackage.q62.g0
            r12 = 0
            r9 = r14
            boolean r14 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r4 = r9
            if (r14 == 0) goto L1f
            goto L4e
        L1f:
            java.lang.Object r14 = r8.getObjectVolatile(r4, r1)
            if (r14 == 0) goto L26
            goto L55
        L26:
            r14 = r4
            goto L11
        L28:
            r4 = r14
            boolean r14 = r7 instanceof defpackage.ny3
            if (r14 == 0) goto L33
            ny3 r7 = (defpackage.ny3) r7
            r7.c()
            return
        L33:
            if (r7 != r13) goto L36
            goto L4e
        L36:
            ny3 r8 = new ny3
            r14 = 8
            r0 = 1
            r8.<init>(r14, r0)
            r14 = r7
            java.lang.Runnable r14 = (java.lang.Runnable) r14
            r8.a(r14)
        L44:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.q62.g0
            boolean r14 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r14 == 0) goto L4f
        L4e:
            return
        L4f:
            java.lang.Object r14 = r3.getObjectVolatile(r4, r1)
            if (r14 == r7) goto L44
        L55:
            r14 = r4
            goto L0
    }

    @Override // defpackage.l62
    public void shutdown() {
            r4 = this;
            java.lang.ThreadLocal r0 = defpackage.m57.a
            r1 = 0
            r0.set(r1)
            r0 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.q62.e0
            r1.set(r4, r0)
            r4.s0()
        Lf:
            long r0 = r4.q0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lf
            r4.B0()
            return
    }

    public final java.lang.Runnable t0() {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q62.Z
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.q62.g0
            java.lang.Object r7 = r0.getObjectVolatile(r9, r1)
            if (r7 != 0) goto L10
            goto L40
        L10:
            boolean r0 = r7 instanceof defpackage.ny3
            if (r0 == 0) goto L3b
            r0 = r7
            ny3 r0 = (defpackage.ny3) r0
            java.lang.Object r3 = r0.e()
            gr1 r4 = defpackage.ny3.g
            if (r3 == r4) goto L22
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            return r3
        L22:
            ny3 r8 = r0.d()
        L26:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.q62.g0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L32
            goto L56
        L32:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L39
            goto L56
        L39:
            r9 = r4
            goto L26
        L3b:
            r4 = r9
            gr1 r9 = defpackage.r62.b
            if (r7 != r9) goto L42
        L40:
            r9 = 0
            return r9
        L42:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.q62.g0
            r8 = 0
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L50
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            return r7
        L50:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L42
        L56:
            r9 = r4
            goto L0
    }

    public void u0(java.lang.Runnable r2) {
            r1 = this;
            r1.v0()
            boolean r0 = r1.w0(r2)
            if (r0 == 0) goto L17
            java.lang.Thread r1 = r1.y0()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            if (r2 == r1) goto L16
            java.util.concurrent.locks.LockSupport.unpark(r1)
        L16:
            return
        L17:
            sd1 r1 = defpackage.sd1.h0
            r1.u0(r2)
            return
    }

    public final void v0() {
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q62.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.q62.f0
            java.lang.Object r0 = r0.getObjectVolatile(r10, r1)
            p62 r0 = (defpackage.p62) r0
            if (r0 == 0) goto L4b
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.p57.b
            int r1 = r1.get(r0)
            if (r1 != 0) goto L1a
            return
        L1a:
            long r1 = java.lang.System.nanoTime()
        L1e:
            monitor-enter(r0)
            o62[] r3 = r0.a     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L28
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L3c
            goto L29
        L28:
            r3 = r4
        L29:
            if (r3 != 0) goto L2d
            monitor-exit(r0)
            goto L46
        L2d:
            long r6 = r3.A     // Catch: java.lang.Throwable -> L3c
            long r6 = r1 - r6
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L3e
            boolean r3 = r10.w0(r3)     // Catch: java.lang.Throwable -> L3c
            goto L3f
        L3c:
            r10 = move-exception
            goto L49
        L3e:
            r3 = r5
        L3f:
            if (r3 == 0) goto L45
            o62 r4 = r0.b(r5)     // Catch: java.lang.Throwable -> L3c
        L45:
            monitor-exit(r0)
        L46:
            if (r4 != 0) goto L1e
            goto L4b
        L49:
            monitor-exit(r0)
            throw r10
        L4b:
            return
    }

    public final boolean w0(java.lang.Runnable r10) {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q62.Z
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r6 = defpackage.q62.g0
            java.lang.Object r4 = r0.getObjectVolatile(r9, r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.q62.e0
            int r0 = r0.get(r9)
            r8 = 1
            if (r0 != r8) goto L17
            goto L5c
        L17:
            if (r4 != 0) goto L2e
        L19:
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.q62.g0
            r4 = 0
            r1 = r9
            r5 = r10
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L27
            goto L79
        L27:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == 0) goto L19
            goto L0
        L2e:
            boolean r0 = r4 instanceof defpackage.ny3
            if (r0 == 0) goto L58
            r0 = r4
            ny3 r0 = (defpackage.ny3) r0
            int r2 = r0.a(r10)
            if (r2 == 0) goto L79
            if (r2 == r8) goto L41
            r0 = 2
            if (r2 == r0) goto L5c
            goto L0
        L41:
            ny3 r5 = r0.d()
        L45:
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.q62.g0
            r1 = r9
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L51
            goto L0
        L51:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == r4) goto L45
            goto L0
        L58:
            gr1 r0 = defpackage.r62.b
            if (r4 != r0) goto L5e
        L5c:
            r0 = 0
            return r0
        L5e:
            ny3 r5 = new ny3
            r0 = 8
            r5.<init>(r0, r8)
            r0 = r4
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r5.a(r0)
            r5.a(r10)
        L6e:
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.q62.g0
            r1 = r9
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L7a
        L79:
            return r8
        L7a:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == r4) goto L6e
            goto L0
    }

    public final long x0() {
            r10 = this;
            pu r0 = r10.X
            r1 = 0
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto Ld
        Lb:
            r5 = r3
            goto L15
        Ld:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
            goto Lb
        L14:
            r5 = r1
        L15:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L1a
            goto L77
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q62.Z
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r5 = defpackage.q62.g0
            java.lang.Object r5 = r0.getObjectVolatile(r10, r5)
            if (r5 == 0) goto L4d
            boolean r6 = r5 instanceof defpackage.ny3
            if (r6 == 0) goto L48
            ny3 r5 = (defpackage.ny3) r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.ny3.f
            long r5 = r6.get(r5)
            r7 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r7 = r7 & r5
            int r7 = (int) r7
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r8
            r8 = 30
            long r5 = r5 >> r8
            int r5 = (int) r5
            if (r7 != r5) goto L47
            goto L4d
        L47:
            return r1
        L48:
            gr1 r10 = defpackage.r62.b
            if (r5 != r10) goto L77
            goto L7b
        L4d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.q62.d0
            r5.getClass()
            long r5 = defpackage.q62.f0
            java.lang.Object r10 = r0.getObjectVolatile(r10, r5)
            p62 r10 = (defpackage.p62) r10
            if (r10 == 0) goto L7b
            monitor-enter(r10)
            o62[] r0 = r10.a     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L67
            r5 = 0
            r0 = r0[r5]     // Catch: java.lang.Throwable -> L65
            goto L68
        L65:
            r0 = move-exception
            goto L79
        L67:
            r0 = 0
        L68:
            monitor-exit(r10)
            if (r0 != 0) goto L6c
            goto L7b
        L6c:
            long r3 = r0.A
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 >= 0) goto L78
        L77:
            return r1
        L78:
            return r3
        L79:
            monitor-exit(r10)
            throw r0
        L7b:
            return r3
    }

    public abstract java.lang.Thread y0();

    public final boolean z0() {
            r7 = this;
            pu r0 = r7.X
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L5c
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q62.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r3 = defpackage.q62.f0
            java.lang.Object r3 = r0.getObjectVolatile(r7, r3)
            p62 r3 = (defpackage.p62) r3
            if (r3 == 0) goto L2a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.p57.b
            int r3 = r4.get(r3)
            if (r3 != 0) goto L29
            goto L2a
        L29:
            return r2
        L2a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.q62.Z
            r3.getClass()
            long r3 = defpackage.q62.g0
            java.lang.Object r7 = r0.getObjectVolatile(r7, r3)
            if (r7 != 0) goto L38
            goto L5b
        L38:
            boolean r0 = r7 instanceof defpackage.ny3
            if (r0 == 0) goto L57
            ny3 r7 = (defpackage.ny3) r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ny3.f
            long r3 = r0.get(r7)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r7 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r0 = 30
            long r3 = r3 >> r0
            int r0 = (int) r3
            if (r7 != r0) goto L56
            return r1
        L56:
            return r2
        L57:
            gr1 r0 = defpackage.r62.b
            if (r7 != r0) goto L5c
        L5b:
            return r1
        L5c:
            return r2
    }
}
