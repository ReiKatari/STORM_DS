package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kb6  reason: default package */
/* loaded from: classes.dex */
public class kb6 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater L = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater R = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater X = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater Y = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater Z = null;
    public static final /* synthetic */ long d0 = 0;
    public static final /* synthetic */ long e0 = 0;
    public final int A;
    public final defpackage.ov4 B;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ java.lang.Object head$volatile;
    private volatile /* synthetic */ java.lang.Object tail$volatile;

    static {
            java.lang.Class<kb6> r0 = defpackage.kb6.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "head$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.kb6.L = r3
            sun.misc.Unsafe r3 = defpackage.v36.a
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)
            long r4 = r3.objectFieldOffset(r2)
            defpackage.kb6.d0 = r4
            java.lang.String r2 = "deqIdx$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r2)
            defpackage.kb6.R = r2
            java.lang.String r2 = "tail$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.kb6.X = r1
            java.lang.reflect.Field r1 = r0.getDeclaredField(r2)
            long r1 = r3.objectFieldOffset(r1)
            defpackage.kb6.e0 = r1
            java.lang.String r1 = "enqIdx$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            defpackage.kb6.Y = r1
            java.lang.String r1 = "_availablePermits$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.kb6.Z = r0
            return
    }

    public kb6(int r6) {
            r5 = this;
            r5.<init>()
            r5.A = r6
            if (r6 <= 0) goto L2d
            if (r6 < 0) goto L22
            nb6 r0 = new nb6
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r3, r1, r2)
            r5.head$volatile = r0
            r5.tail$volatile = r0
            r5._availablePermits$volatile = r6
            ov4 r6 = new ov4
            r0 = 13
            r6.<init>(r5, r0)
            r5.B = r6
            return
        L22:
            java.lang.String r5 = "The number of acquired permits should be in 0.."
            java.lang.String r5 = defpackage.lb1.g(r6, r5)
            defpackage.i.f(r5)
            r5 = 0
            throw r5
        L2d:
            java.lang.String r5 = "Semaphore should have at least 1 permit, but had "
            java.lang.String r5 = defpackage.lb1.g(r6, r5)
            defpackage.i.f(r5)
            r5 = 0
            throw r5
    }

    public final java.lang.Object a(defpackage.s41 r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.kb6.Z
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.A
            if (r1 > r2) goto L0
            jg7 r3 = defpackage.jg7.a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            r41 r5 = defpackage.np2.V(r5)
            rj0 r5 = defpackage.n16.C(r5)
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            ov4 r4 = r4.B     // Catch: java.lang.Throwable -> L3f
            r5.t(r3, r4)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r4 = r5.s()
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            if (r4 != r5) goto L3a
            goto L3b
        L3a:
            r4 = r3
        L3b:
            if (r4 != r5) goto L3e
            return r4
        L3e:
            return r3
        L3f:
            r4 = move-exception
            r5.E()
            throw r4
    }

    public final boolean b(defpackage.zr7 r17) {
            r16 = this;
            r1 = r16
            r6 = r17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.kb6.X
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r7 = defpackage.kb6.e0
            java.lang.Object r0 = r0.getObjectVolatile(r1, r7)
            r9 = r0
            nb6 r9 = (defpackage.nb6) r9
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.kb6.Y
            long r10 = r0.getAndIncrement(r1)
            ib6 r12 = defpackage.ib6.d0
            int r0 = defpackage.mb6.f
            long r2 = (long) r0
            long r13 = r10 / r2
        L21:
            java.lang.Object r15 = defpackage.uy0.a(r9, r13, r12)
            boolean r0 = defpackage.oi2.J(r15)
            if (r0 != 0) goto L72
            p96 r5 = defpackage.oi2.B(r15)
        L2f:
            sun.misc.Unsafe r0 = defpackage.v36.a
            java.lang.Object r0 = r0.getObjectVolatile(r1, r7)
            r4 = r0
            p96 r4 = (defpackage.p96) r4
            long r2 = r4.X
            long r0 = r5.X
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L43
            r1 = r16
            goto L72
        L43:
            boolean r0 = r5.o()
            if (r0 != 0) goto L4c
            r1 = r16
            goto L21
        L4c:
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.kb6.e0
            r1 = r16
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L62
            boolean r0 = r4.k()
            if (r0 == 0) goto L72
            r4.i()
            goto L72
        L62:
            java.lang.Object r0 = r0.getObjectVolatile(r1, r7)
            if (r0 == r4) goto L4c
            boolean r0 = r5.k()
            if (r0 == 0) goto L2f
            r5.i()
            goto L2f
        L72:
            p96 r0 = defpackage.oi2.B(r15)
            nb6 r0 = (defpackage.nb6) r0
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r0.Z
            int r3 = defpackage.mb6.f
            long r3 = (long) r3
            long r10 = r10 % r3
            int r3 = (int) r10
        L7f:
            r4 = 0
            boolean r4 = r2.compareAndSet(r3, r4, r6)
            r5 = 1
            if (r4 == 0) goto L8b
            r6.a(r0, r3)
            return r5
        L8b:
            java.lang.Object r4 = r2.get(r3)
            if (r4 == 0) goto L7f
            gr1 r4 = defpackage.mb6.b
            gr1 r7 = defpackage.mb6.c
        L95:
            boolean r0 = r2.compareAndSet(r3, r4, r7)
            if (r0 == 0) goto La6
            r0 = r6
            qj0 r0 = (defpackage.qj0) r0
            ov4 r1 = r1.B
            jg7 r2 = defpackage.jg7.a
            r0.t(r2, r1)
            return r5
        La6:
            java.lang.Object r0 = r2.get(r3)
            if (r0 == r4) goto L95
            r0 = 0
            return r0
    }

    public final void c() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.kb6.Z
            int r1 = r0.getAndIncrement(r3)
            int r2 = r3.A
            if (r1 >= r2) goto L14
            if (r1 < 0) goto Ld
            goto L13
        Ld:
            boolean r0 = r3.d()
            if (r0 == 0) goto L0
        L13:
            return
        L14:
            int r1 = r0.get(r3)
            if (r1 <= r2) goto L21
            boolean r1 = r0.compareAndSet(r3, r1, r2)
            if (r1 != 0) goto L21
            goto L14
        L21:
            java.lang.String r3 = "The number of released permits cannot be greater than "
            defpackage.u34.e(r2, r3)
            return
    }

    public final boolean d() {
            r15 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.kb6.L
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r6 = defpackage.kb6.d0
            java.lang.Object r0 = r0.getObjectVolatile(r15, r6)
            r8 = r0
            nb6 r8 = (defpackage.nb6) r8
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.kb6.R
            long r9 = r0.getAndIncrement(r15)
            int r0 = defpackage.mb6.f
            long r2 = (long) r0
            long r11 = r9 / r2
            jb6 r13 = defpackage.jb6.d0
        L1d:
            java.lang.Object r14 = defpackage.uy0.a(r8, r11, r13)
            boolean r0 = defpackage.oi2.J(r14)
            if (r0 != 0) goto L69
            p96 r5 = defpackage.oi2.B(r14)
        L2b:
            sun.misc.Unsafe r0 = defpackage.v36.a
            java.lang.Object r0 = r0.getObjectVolatile(r15, r6)
            r4 = r0
            p96 r4 = (defpackage.p96) r4
            long r2 = r4.X
            long r0 = r5.X
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L3d
            goto L69
        L3d:
            boolean r0 = r5.o()
            if (r0 != 0) goto L44
            goto L1d
        L44:
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.kb6.d0
            r1 = r15
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L59
            boolean r0 = r4.k()
            if (r0 == 0) goto L69
            r4.i()
            goto L69
        L59:
            java.lang.Object r0 = r0.getObjectVolatile(r15, r6)
            if (r0 == r4) goto L44
            boolean r0 = r5.k()
            if (r0 == 0) goto L2b
            r5.i()
            goto L2b
        L69:
            p96 r0 = defpackage.oi2.B(r14)
            nb6 r0 = (defpackage.nb6) r0
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r0.Z
            r0.a()
            long r3 = r0.X
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            r3 = 0
            if (r0 <= 0) goto L7c
            goto Lc9
        L7c:
            int r0 = defpackage.mb6.f
            long r4 = (long) r0
            long r9 = r9 % r4
            int r0 = (int) r9
            gr1 r4 = defpackage.mb6.b
            java.lang.Object r4 = r2.getAndSet(r0, r4)
            r5 = 1
            if (r4 != 0) goto Lb0
            int r1 = defpackage.mb6.a
            r4 = r3
        L8d:
            if (r4 >= r1) goto L9b
            java.lang.Object r6 = r2.get(r0)
            gr1 r7 = defpackage.mb6.c
            if (r6 != r7) goto L98
            return r5
        L98:
            int r4 = r4 + 1
            goto L8d
        L9b:
            gr1 r6 = defpackage.mb6.b
            gr1 r7 = defpackage.mb6.d
        L9f:
            boolean r1 = r2.compareAndSet(r0, r6, r7)
            if (r1 == 0) goto La7
            r3 = r5
            goto Lad
        La7:
            java.lang.Object r1 = r2.get(r0)
            if (r1 == r6) goto L9f
        Lad:
            r0 = r3 ^ 1
            return r0
        Lb0:
            gr1 r0 = defpackage.mb6.e
            if (r4 != r0) goto Lb5
            goto Lc9
        Lb5:
            boolean r0 = r4 instanceof defpackage.qj0
            jg7 r2 = defpackage.jg7.a
            if (r0 == 0) goto Lca
            qj0 r4 = (defpackage.qj0) r4
            ov4 r0 = r15.B
            gr1 r0 = r4.j(r2, r0)
            if (r0 == 0) goto Lc9
            r4.y(r0)
            return r5
        Lc9:
            return r3
        Lca:
            boolean r0 = r4 instanceof defpackage.v96
            if (r0 == 0) goto Ld5
            v96 r4 = (defpackage.v96) r4
            boolean r0 = r4.k(r15, r2)
            return r0
        Ld5:
            java.lang.String r0 = "unexpected: "
            defpackage.e41.h(r4, r0)
            return r3
    }
}
