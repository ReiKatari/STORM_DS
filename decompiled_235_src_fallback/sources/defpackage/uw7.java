package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uw7  reason: default package */
/* loaded from: classes.dex */
public final class uw7 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater b = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater c = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater d = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater e = null;
    public static final /* synthetic */ long f = 0;
    public final java.util.concurrent.atomic.AtomicReferenceArray a;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ java.lang.Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
            java.lang.Class<uw7> r0 = defpackage.uw7.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "lastScheduledTask$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.uw7.b = r1
            sun.misc.Unsafe r1 = defpackage.v36.a
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)
            long r1 = r1.objectFieldOffset(r2)
            defpackage.uw7.f = r1
            java.lang.String r1 = "producerIndex$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.uw7.c = r1
            java.lang.String r1 = "consumerIndex$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.uw7.d = r1
            java.lang.String r1 = "blockingTasksInBuffer$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.uw7.e = r0
            return
    }

    public uw7() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.a = r0
            return
    }

    public final defpackage.mz6 a(defpackage.mz6 r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L7
            mz6 r2 = r2.b(r3)
            return r2
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.uw7.b
            r4.getClass()
            sun.misc.Unsafe r4 = defpackage.v36.a
            long r0 = defpackage.uw7.f
            java.lang.Object r3 = r4.getAndSetObject(r2, r0, r3)
            mz6 r3 = (defpackage.mz6) r3
            if (r3 != 0) goto L1a
            r2 = 0
            return r2
        L1a:
            mz6 r2 = r2.b(r3)
            return r2
    }

    public final defpackage.mz6 b(defpackage.mz6 r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.uw7.c
            int r1 = r0.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.uw7.d
            int r2 = r2.get(r4)
            int r1 = r1 - r2
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 != r2) goto L12
            return r5
        L12:
            boolean r1 = r5.B
            if (r1 == 0) goto L1b
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.uw7.e
            r1.incrementAndGet(r4)
        L1b:
            int r1 = r0.get(r4)
            r1 = r1 & r2
        L20:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r4.a
            java.lang.Object r3 = r2.get(r1)
            if (r3 == 0) goto L2c
            java.lang.Thread.yield()
            goto L20
        L2c:
            r2.lazySet(r1, r5)
            r0.incrementAndGet(r4)
            r4 = 0
            return r4
    }

    public final int c() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.uw7.b
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.uw7.f
            java.lang.Object r0 = r0.getObjectVolatile(r3, r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.uw7.d
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.uw7.c
            if (r0 == 0) goto L1f
            int r0 = r2.get(r3)
            int r3 = r1.get(r3)
            int r0 = r0 - r3
            int r0 = r0 + 1
            return r0
        L1f:
            int r0 = r2.get(r3)
            int r3 = r1.get(r3)
            int r0 = r0 - r3
            return r0
    }

    public final void d(defpackage.ls2 r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.uw7.b
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.uw7.f
            r3 = 0
            java.lang.Object r0 = r0.getAndSetObject(r4, r1, r3)
            mz6 r0 = (defpackage.mz6) r0
            if (r0 == 0) goto L15
            r5.a(r0)
        L15:
            mz6 r0 = r4.f()
            if (r0 != 0) goto L1c
            return
        L1c:
            r5.a(r0)
            goto L15
    }

    public final defpackage.mz6 e() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.uw7.b
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.uw7.f
            r3 = 0
            java.lang.Object r0 = r0.getAndSetObject(r4, r1, r3)
            mz6 r0 = (defpackage.mz6) r0
            if (r0 != 0) goto L17
            mz6 r4 = r4.f()
            return r4
        L17:
            return r0
    }

    public final defpackage.mz6 f() {
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.uw7.d
            int r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.uw7.c
            int r2 = r2.get(r5)
            int r2 = r1 - r2
            r3 = 0
            if (r2 != 0) goto L12
            return r3
        L12:
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r1 + 1
            boolean r0 = r0.compareAndSet(r5, r1, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.a
            java.lang.Object r0 = r0.getAndSet(r2, r3)
            mz6 r0 = (defpackage.mz6) r0
            if (r0 != 0) goto L27
            goto L0
        L27:
            boolean r1 = r0.B
            if (r1 == 0) goto L30
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.uw7.e
            r1.decrementAndGet(r5)
        L30:
            return r0
    }

    public final defpackage.mz6 g() {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.uw7.b
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.uw7.f
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            mz6 r7 = (defpackage.mz6) r7
            r0 = 1
            if (r7 != 0) goto L15
        L13:
            r4 = r9
            goto L30
        L15:
            boolean r3 = r7.B
            if (r3 != r0) goto L13
        L19:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.uw7.f
            r8 = 0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L26
            return r7
        L26:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L2e
            r9 = r4
            goto L0
        L2e:
            r9 = r4
            goto L19
        L30:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = defpackage.uw7.d
            int r9 = r9.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.uw7.c
            int r1 = r1.get(r4)
        L3c:
            if (r9 == r1) goto L50
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.uw7.e
            int r2 = r2.get(r4)
            if (r2 != 0) goto L47
            goto L50
        L47:
            int r1 = r1 + (-1)
            mz6 r2 = r4.h(r1, r0)
            if (r2 == 0) goto L3c
            return r2
        L50:
            r9 = 0
            return r9
    }

    public final defpackage.mz6 h(int r5, boolean r6) {
            r4 = this;
            r5 = r5 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r4.a
            java.lang.Object r1 = r0.get(r5)
            mz6 r1 = (defpackage.mz6) r1
            r2 = 0
            if (r1 == 0) goto L25
            boolean r3 = r1.B
            if (r3 != r6) goto L25
        L11:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L1f
            if (r6 == 0) goto L1e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.uw7.e
            r5.decrementAndGet(r4)
        L1e:
            return r1
        L1f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L11
        L25:
            return r2
    }

    public final long i(int r10, defpackage.dh5 r11) {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.uw7.b
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.uw7.f
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            mz6 r7 = (defpackage.mz6) r7
            if (r7 != 0) goto L13
            goto L1d
        L13:
            boolean r0 = r7.B
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 2
        L1a:
            r0 = r0 & r10
            if (r0 != 0) goto L20
        L1d:
            r9 = -2
            return r9
        L20:
            xd5 r0 = defpackage.sz6.f
            r0.getClass()
            long r3 = java.lang.System.nanoTime()
            long r5 = r7.A
            long r3 = r3 - r5
            long r5 = defpackage.sz6.b
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L34
            long r5 = r5 - r3
            return r5
        L34:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.uw7.f
            r8 = 0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L45
            r11.A = r7
            r9 = -1
            return r9
        L45:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L4d
            r9 = r4
            goto L0
        L4d:
            r9 = r4
            goto L34
    }
}
