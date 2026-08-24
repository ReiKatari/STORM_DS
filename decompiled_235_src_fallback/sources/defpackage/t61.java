package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t61  reason: default package */
/* loaded from: classes.dex */
public final class t61 extends java.lang.Thread {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater e0 = null;
    public final defpackage.uw7 A;
    public final defpackage.dh5 B;
    public defpackage.u61 L;
    public long R;
    public long X;
    public int Y;
    public boolean Z;
    public final /* synthetic */ defpackage.v61 d0;
    private volatile int indexInArray;
    private volatile java.lang.Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    static {
            java.lang.Class<t61> r0 = defpackage.t61.class
            java.lang.String r1 = "workerCtl$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.t61.e0 = r0
            return
    }

    public t61(defpackage.v61 r3, int r4) {
            r2 = this;
            r2.d0 = r3
            r2.<init>()
            r3 = 1
            r2.setDaemon(r3)
            java.lang.Class<v61> r3 = defpackage.v61.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r2.setContextClassLoader(r3)
            uw7 r3 = new uw7
            r3.<init>()
            r2.A = r3
            dh5 r3 = new dh5
            r3.<init>()
            r2.B = r3
            u61 r3 = defpackage.u61.DORMANT
            r2.L = r3
            gr1 r3 = defpackage.v61.g0
            r2.nextParkedWorker = r3
            long r0 = java.lang.System.nanoTime()
            int r3 = (int) r0
            if (r3 == 0) goto L30
            goto L32
        L30:
            r3 = 42
        L32:
            r2.Y = r3
            r2.f(r4)
            return
    }

    public final defpackage.mz6 a(boolean r11) {
            r10 = this;
            u61 r0 = r10.L
            u61 r1 = defpackage.u61.CPU_ACQUIRED
            v61 r3 = r10.d0
            r8 = 1
            uw7 r9 = r10.A
            if (r0 != r1) goto Lc
            goto L47
        Lc:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v61.e0
        Le:
            long r4 = r0.get(r3)
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r4
            r6 = 42
            long r1 = r1 >> r6
            int r1 = (int) r1
            if (r1 != 0) goto L34
            mz6 r11 = r9.g()
            if (r11 != 0) goto L33
            ls2 r11 = r3.Y
            java.lang.Object r11 = r11.d()
            mz6 r11 = (defpackage.mz6) r11
            if (r11 != 0) goto L33
            mz6 r10 = r10.i(r8)
            return r10
        L33:
            return r11
        L34:
            r1 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r6 = r4 - r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.v61.e0
            boolean r1 = r2.compareAndSet(r3, r4, r6)
            if (r1 == 0) goto Le
            u61 r0 = defpackage.u61.CPU_ACQUIRED
            r10.L = r0
        L47:
            if (r11 == 0) goto L6e
            int r11 = r3.A
            int r11 = r11 * 2
            int r11 = r10.d(r11)
            if (r11 != 0) goto L54
            goto L55
        L54:
            r8 = 0
        L55:
            if (r8 == 0) goto L5e
            mz6 r11 = r10.e()
            if (r11 == 0) goto L5e
            return r11
        L5e:
            mz6 r11 = r9.e()
            if (r11 == 0) goto L65
            return r11
        L65:
            if (r8 != 0) goto L75
            mz6 r11 = r10.e()
            if (r11 == 0) goto L75
            return r11
        L6e:
            mz6 r11 = r10.e()
            if (r11 == 0) goto L75
            return r11
        L75:
            r11 = 3
            mz6 r10 = r10.i(r11)
            return r10
    }

    public final int b() {
            r0 = this;
            int r0 = r0.indexInArray
            return r0
    }

    public final java.lang.Object c() {
            r0 = this;
            java.lang.Object r0 = r0.nextParkedWorker
            return r0
    }

    public final int d(int r3) {
            r2 = this;
            int r0 = r2.Y
            int r1 = r0 << 13
            r0 = r0 ^ r1
            int r1 = r0 >> 17
            r0 = r0 ^ r1
            int r1 = r0 << 5
            r0 = r0 ^ r1
            r2.Y = r0
            int r2 = r3 + (-1)
            r1 = r2 & r3
            if (r1 != 0) goto L15
            r2 = r2 & r0
            return r2
        L15:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r0
            int r2 = r2 % r3
            return r2
    }

    public final defpackage.mz6 e() {
            r2 = this;
            r0 = 2
            int r0 = r2.d(r0)
            v61 r2 = r2.d0
            ls2 r1 = r2.Y
            ls2 r2 = r2.X
            if (r0 != 0) goto L1d
            java.lang.Object r2 = r2.d()
            mz6 r2 = (defpackage.mz6) r2
            if (r2 == 0) goto L16
            return r2
        L16:
            java.lang.Object r2 = r1.d()
            mz6 r2 = (defpackage.mz6) r2
            return r2
        L1d:
            java.lang.Object r0 = r1.d()
            mz6 r0 = (defpackage.mz6) r0
            if (r0 == 0) goto L26
            return r0
        L26:
            java.lang.Object r2 = r2.d()
            mz6 r2 = (defpackage.mz6) r2
            return r2
    }

    public final void f(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            v61 r1 = r2.d0
            java.lang.String r1 = r1.R
            r0.append(r1)
            java.lang.String r1 = "-worker-"
            r0.append(r1)
            if (r3 != 0) goto L16
            java.lang.String r1 = "TERMINATED"
            goto L1a
        L16:
            java.lang.String r1 = java.lang.String.valueOf(r3)
        L1a:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.setName(r0)
            r2.indexInArray = r3
            return
    }

    public final void g(java.lang.Object r1) {
            r0 = this;
            r0.nextParkedWorker = r1
            return
    }

    public final boolean h(defpackage.u61 r7) {
            r6 = this;
            u61 r0 = r6.L
            u61 r1 = defpackage.u61.CPU_ACQUIRED
            if (r0 != r1) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r1 == 0) goto L17
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.v61.e0
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            v61 r5 = r6.d0
            r2.addAndGet(r5, r3)
        L17:
            if (r0 == r7) goto L1b
            r6.L = r7
        L1b:
            return r1
    }

    public final defpackage.mz6 i(int r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.v61.e0
            v61 r3 = r0.d0
            long r4 = r2.get(r3)
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r2 = (int) r4
            r4 = 2
            r5 = 0
            if (r2 >= r4) goto L16
            return r5
        L16:
            int r4 = r0.d(r2)
            r9 = 0
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L20:
            r12 = 0
            if (r9 >= r2) goto La3
            r14 = 1
            int r4 = r4 + r14
            if (r4 <= r2) goto L29
            r4 = r14
        L29:
            dl5 r15 = r3.Z
            java.lang.Object r15 = r15.b(r4)
            t61 r15 = (defpackage.t61) r15
            if (r15 == 0) goto L9a
            if (r15 == r0) goto L9a
            uw7 r15 = r15.A
            r6 = 3
            if (r1 != r6) goto L44
            mz6 r6 = r15.f()
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L74
        L44:
            r15.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = defpackage.uw7.d
            int r6 = r6.get(r15)
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = defpackage.uw7.c
            int r7 = r7.get(r15)
            if (r1 != r14) goto L5b
            goto L5c
        L5b:
            r14 = 0
        L5c:
            if (r6 == r7) goto L68
            if (r14 == 0) goto L6a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = defpackage.uw7.e
            int r8 = r8.get(r15)
            if (r8 != 0) goto L6a
        L68:
            r6 = r5
            goto L74
        L6a:
            int r8 = r6 + 1
            mz6 r6 = r15.h(r6, r14)
            if (r6 != 0) goto L74
            r6 = r8
            goto L5c
        L74:
            dh5 r14 = r0.B
            if (r6 == 0) goto L7f
            r14.A = r6
            r7 = -1
        L7c:
            r20 = -1
            goto L86
        L7f:
            long r18 = r15.i(r1, r14)
            r7 = r18
            goto L7c
        L86:
            int r6 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r6 != 0) goto L91
            java.lang.Object r0 = r14.A
            mz6 r0 = (defpackage.mz6) r0
            r14.A = r5
            return r0
        L91:
            int r6 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r6 <= 0) goto L9f
            long r10 = java.lang.Math.min(r10, r7)
            goto L9f
        L9a:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L9f:
            int r9 = r9 + 1
            goto L20
        La3:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 == 0) goto Lad
            goto Lae
        Lad:
            r10 = r12
        Lae:
            r0.X = r10
            return r5
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r23 = this;
            r1 = r23
            r2 = 0
        L3:
            r0 = r2
        L4:
            v61 r3 = r1.d0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.v61.f0
            int r3 = r4.get(r3)
            r4 = 1
            if (r3 != r4) goto L11
            goto L19b
        L11:
            u61 r3 = r1.L
            u61 r5 = defpackage.u61.TERMINATED
            if (r3 == r5) goto L19b
            boolean r3 = r1.Z
            mz6 r3 = r1.a(r3)
            r6 = -2097152(0xffffffffffe00000, double:NaN)
            r8 = 0
            if (r3 == 0) goto L87
            r1.X = r8
            v61 r4 = r1.d0
            r1.R = r8
            u61 r0 = r1.L
            u61 r8 = defpackage.u61.PARKING
            if (r0 != r8) goto L34
            u61 r0 = defpackage.u61.BLOCKING
            r1.L = r0
        L34:
            boolean r0 = r3.B
            if (r0 == 0) goto L75
            u61 r0 = defpackage.u61.BLOCKING
            boolean r0 = r1.h(r0)
            if (r0 == 0) goto L57
            boolean r0 = r4.u()
            if (r0 == 0) goto L47
            goto L57
        L47:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v61.e0
            long r8 = r0.get(r4)
            boolean r0 = r4.r(r8)
            if (r0 == 0) goto L54
            goto L57
        L54:
            r4.u()
        L57:
            r3.run()     // Catch: java.lang.Throwable -> L5b
            goto L67
        L5b:
            r0 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r8 = r3.getUncaughtExceptionHandler()
            r8.uncaughtException(r3, r0)
        L67:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.v61.e0
            r0.addAndGet(r4, r6)
            u61 r0 = r1.L
            if (r0 == r5) goto L3
            u61 r0 = defpackage.u61.DORMANT
            r1.L = r0
            goto L3
        L75:
            r3.run()     // Catch: java.lang.Throwable -> L79
            goto L3
        L79:
            r0 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r0)
            goto L3
        L87:
            r1.Z = r2
            long r10 = r1.X
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 == 0) goto La5
            if (r0 != 0) goto L94
            r0 = r4
            goto L4
        L94:
            u61 r0 = defpackage.u61.PARKING
            r1.h(r0)
            java.lang.Thread.interrupted()
            long r3 = r1.X
            java.util.concurrent.locks.LockSupport.parkNanos(r3)
            r1.X = r8
            goto L3
        La5:
            java.lang.Object r3 = r1.nextParkedWorker
            gr1 r5 = defpackage.v61.g0
            if (r3 == r5) goto L165
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.t61.e0
            r5 = -1
            r3.set(r1, r5)
        Lb1:
            java.lang.Object r3 = r1.nextParkedWorker
            gr1 r6 = defpackage.v61.g0
            if (r3 == r6) goto L4
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.t61.e0
            int r6 = r3.get(r1)
            if (r6 != r5) goto L4
            v61 r6 = r1.d0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = defpackage.v61.f0
            int r6 = r7.get(r6)
            if (r6 != r4) goto Lcb
            goto L4
        Lcb:
            u61 r6 = r1.L
            u61 r12 = defpackage.u61.TERMINATED
            if (r6 != r12) goto Ld3
            goto L4
        Ld3:
            u61 r6 = defpackage.u61.PARKING
            r1.h(r6)
            java.lang.Thread.interrupted()
            long r13 = r1.R
            int r6 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r6 != 0) goto Lf0
            long r13 = java.lang.System.nanoTime()
            v61 r6 = r1.d0
            r15 = 2097151(0x1fffff, double:1.0361303E-317)
            long r10 = r6.L
            long r13 = r13 + r10
            r1.R = r13
            goto Lf3
        Lf0:
            r15 = 2097151(0x1fffff, double:1.0361303E-317)
        Lf3:
            v61 r6 = r1.d0
            long r10 = r6.L
            java.util.concurrent.locks.LockSupport.parkNanos(r10)
            long r10 = java.lang.System.nanoTime()
            long r13 = r1.R
            long r10 = r10 - r13
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 < 0) goto Lb1
            r1.R = r8
            v61 r6 = r1.d0
            dl5 r10 = r6.Z
            monitor-enter(r10)
            int r7 = r7.get(r6)     // Catch: java.lang.Throwable -> L156
            if (r7 != r4) goto L114
            r7 = r4
            goto L115
        L114:
            r7 = r2
        L115:
            if (r7 == 0) goto L119
            monitor-exit(r10)
            goto Lb1
        L119:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = defpackage.v61.e0     // Catch: java.lang.Throwable -> L156
            long r13 = r7.get(r6)     // Catch: java.lang.Throwable -> L156
            long r13 = r13 & r15
            int r11 = (int) r13     // Catch: java.lang.Throwable -> L156
            int r13 = r6.A     // Catch: java.lang.Throwable -> L156
            if (r11 > r13) goto L127
            monitor-exit(r10)
            goto Lb1
        L127:
            boolean r3 = r3.compareAndSet(r1, r5, r4)     // Catch: java.lang.Throwable -> L156
            if (r3 != 0) goto L12f
            monitor-exit(r10)
            goto Lb1
        L12f:
            int r3 = r1.indexInArray     // Catch: java.lang.Throwable -> L156
            r1.f(r2)     // Catch: java.lang.Throwable -> L156
            r6.n(r1, r3, r2)     // Catch: java.lang.Throwable -> L156
            long r13 = r7.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L156
            long r13 = r13 & r15
            int r7 = (int) r13     // Catch: java.lang.Throwable -> L156
            if (r7 == r3) goto L158
            dl5 r11 = r6.Z     // Catch: java.lang.Throwable -> L156
            java.lang.Object r11 = r11.b(r7)     // Catch: java.lang.Throwable -> L156
            r11.getClass()     // Catch: java.lang.Throwable -> L156
            t61 r11 = (defpackage.t61) r11     // Catch: java.lang.Throwable -> L156
            dl5 r13 = r6.Z     // Catch: java.lang.Throwable -> L156
            r13.c(r3, r11)     // Catch: java.lang.Throwable -> L156
            r11.f(r3)     // Catch: java.lang.Throwable -> L156
            r6.n(r11, r7, r3)     // Catch: java.lang.Throwable -> L156
            goto L158
        L156:
            r0 = move-exception
            goto L163
        L158:
            dl5 r3 = r6.Z     // Catch: java.lang.Throwable -> L156
            r6 = 0
            r3.c(r7, r6)     // Catch: java.lang.Throwable -> L156
            monitor-exit(r10)
            r1.L = r12
            goto Lb1
        L163:
            monitor-exit(r10)
            throw r0
        L165:
            r15 = 2097151(0x1fffff, double:1.0361303E-317)
            v61 r3 = r1.d0
            java.lang.Object r4 = r1.nextParkedWorker
            if (r4 == r5) goto L170
            goto L4
        L170:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.v61.d0
        L172:
            long r19 = r4.get(r3)
            long r8 = r19 & r15
            int r5 = (int) r8
            r8 = 2097152(0x200000, double:1.036131E-317)
            long r8 = r19 + r8
            long r8 = r8 & r6
            int r10 = r1.indexInArray
            dl5 r11 = r3.Z
            java.lang.Object r5 = r11.b(r5)
            r1.nextParkedWorker = r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r17 = defpackage.v61.d0
            long r10 = (long) r10
            long r21 = r8 | r10
            r18 = r3
            boolean r3 = r17.compareAndSet(r18, r19, r21)
            if (r3 == 0) goto L198
            goto L4
        L198:
            r3 = r18
            goto L172
        L19b:
            u61 r0 = defpackage.u61.TERMINATED
            r1.h(r0)
            return
    }
}
