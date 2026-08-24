package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n36  reason: default package */
/* loaded from: classes.dex */
public final class n36 implements defpackage.r41, defpackage.y61 {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater B = null;
    public static final /* synthetic */ long L = 0;
    public final defpackage.r41 A;
    private volatile java.lang.Object result;

    static {
            java.lang.Class<n36> r0 = defpackage.n36.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "result"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.n36.B = r1
            sun.misc.Unsafe r1 = defpackage.v36.a
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)
            long r0 = r1.objectFieldOffset(r0)
            defpackage.n36.L = r0
            return
    }

    public n36(defpackage.r41 r1, defpackage.x61 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.result = r2
            return
    }

    public final java.lang.Object a() {
            r8 = this;
            java.lang.Object r0 = r8.result
            x61 r5 = defpackage.x61.UNDECIDED
            if (r0 != r5) goto L26
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.n36.B
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
        La:
            r7.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r3 = defpackage.n36.L
            r2 = r8
            boolean r8 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r8 == 0) goto L1b
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            return r8
        L1b:
            java.lang.Object r8 = r1.getObjectVolatile(r2, r3)
            if (r8 == r5) goto L24
            java.lang.Object r0 = r2.result
            goto L26
        L24:
            r8 = r2
            goto La
        L26:
            x61 r8 = defpackage.x61.RESUMED
            if (r0 != r8) goto L2d
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            return r8
        L2d:
            boolean r8 = r0 instanceof defpackage.em5
            if (r8 != 0) goto L32
            return r0
        L32:
            em5 r0 = (defpackage.em5) r0
            java.lang.Throwable r8 = r0.A
            throw r8
    }

    @Override // defpackage.r41
    public final defpackage.l61 b() {
            r0 = this;
            r41 r0 = r0.A
            l61 r0 = r0.b()
            return r0
    }

    @Override // defpackage.y61
    public final defpackage.y61 f() {
            r1 = this;
            r41 r1 = r1.A
            boolean r0 = r1 instanceof defpackage.y61
            if (r0 == 0) goto L9
            y61 r1 = (defpackage.y61) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // defpackage.r41
    public final void i(java.lang.Object r15) {
            r14 = this;
        L0:
            java.lang.Object r0 = r14.result
            x61 r5 = defpackage.x61.UNDECIDED
            if (r0 != r5) goto L24
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.n36.B
        L8:
            r7.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r3 = defpackage.n36.L
            r2 = r14
            r6 = r15
            boolean r14 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r14 == 0) goto L18
            return
        L18:
            java.lang.Object r14 = r1.getObjectVolatile(r2, r3)
            if (r14 == r5) goto L21
        L1e:
            r14 = r2
            r15 = r6
            goto L0
        L21:
            r14 = r2
            r15 = r6
            goto L8
        L24:
            r2 = r14
            r6 = r15
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r12) goto L49
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = defpackage.n36.B
            x61 r13 = defpackage.x61.RESUMED
        L2e:
            r14.getClass()
            sun.misc.Unsafe r8 = defpackage.v36.a
            long r10 = defpackage.n36.L
            r9 = r2
            boolean r15 = r8.compareAndSwapObject(r9, r10, r12, r13)
            if (r15 == 0) goto L42
            r41 r14 = r2.A
            r14.i(r6)
            return
        L42:
            java.lang.Object r15 = r8.getObjectVolatile(r2, r10)
            if (r15 == r12) goto L2e
            goto L1e
        L49:
            java.lang.String r14 = "Already resumed"
            defpackage.i.m(r14)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SafeContinuation for "
            r0.<init>(r1)
            r41 r2 = r2.A
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
