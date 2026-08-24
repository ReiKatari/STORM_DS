package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nk1  reason: default package */
/* loaded from: classes.dex */
public final class nk1 extends defpackage.qk1 implements defpackage.y61, defpackage.r41 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater d0 = null;
    public static final /* synthetic */ long e0 = 0;
    public final defpackage.n61 R;
    public final defpackage.s41 X;
    public java.lang.Object Y;
    public final java.lang.Object Z;
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation$volatile;

    static {
            java.lang.Class<nk1> r0 = defpackage.nk1.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_reusableCancellableContinuation$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.nk1.d0 = r1
            sun.misc.Unsafe r1 = defpackage.v36.a
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)
            long r0 = r1.objectFieldOffset(r0)
            defpackage.nk1.e0 = r0
            return
    }

    public nk1(defpackage.n61 r2, defpackage.s41 r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            r1.R = r2
            r1.X = r3
            gr1 r2 = defpackage.ok1.a
            r1.Y = r2
            l61 r2 = r3.b()
            java.lang.Object r2 = defpackage.k57.b(r2)
            r1.Z = r2
            return
    }

    @Override // defpackage.r41
    public final defpackage.l61 b() {
            r0 = this;
            s41 r0 = r0.X
            l61 r0 = r0.b()
            return r0
    }

    @Override // defpackage.qk1
    public final defpackage.r41 d() {
            r0 = this;
            return r0
    }

    @Override // defpackage.y61
    public final defpackage.y61 f() {
            r0 = this;
            s41 r0 = r0.X
            return r0
    }

    @Override // defpackage.r41
    public final void i(java.lang.Object r9) {
            r8 = this;
            java.lang.Throwable r0 = defpackage.hm5.a(r9)
            r1 = 0
            if (r0 != 0) goto L9
            r2 = r9
            goto Le
        L9:
            av0 r2 = new av0
            r2.<init>(r0, r1)
        Le:
            s41 r0 = r8.X
            l61 r3 = r0.b()
            n61 r4 = r8.R
            boolean r3 = defpackage.ok1.c(r4, r3)
            if (r3 == 0) goto L28
            r8.Y = r2
            r8.L = r1
            l61 r9 = r0.b()
            defpackage.ok1.b(r4, r9, r8)
            return
        L28:
            l62 r3 = defpackage.m57.a()
            long r4 = r3.L
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L3f
            r8.Y = r2
            r8.L = r1
            r3.o0(r8)
            return
        L3f:
            r1 = 1
            r3.p0(r1)
            l61 r2 = r0.b()     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = r8.Z     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = defpackage.k57.c(r2, r4)     // Catch: java.lang.Throwable -> L5d
            r0.i(r9)     // Catch: java.lang.Throwable -> L5f
            defpackage.k57.a(r2, r4)     // Catch: java.lang.Throwable -> L5d
        L53:
            boolean r9 = r3.r0()     // Catch: java.lang.Throwable -> L5d
            if (r9 != 0) goto L53
        L59:
            r3.n0(r1)
            goto L68
        L5d:
            r9 = move-exception
            goto L64
        L5f:
            r9 = move-exception
            defpackage.k57.a(r2, r4)     // Catch: java.lang.Throwable -> L5d
            throw r9     // Catch: java.lang.Throwable -> L5d
        L64:
            r8.h(r9)     // Catch: java.lang.Throwable -> L69
            goto L59
        L68:
            return
        L69:
            r8 = move-exception
            r3.n0(r1)
            throw r8
    }

    @Override // defpackage.qk1
    public final java.lang.Object k() {
            r2 = this;
            java.lang.Object r0 = r2.Y
            gr1 r1 = defpackage.ok1.a
            r2.Y = r1
            return r0
    }

    public final void l() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.nk1.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.nk1.e0
            java.lang.Object r0 = r0.getObjectVolatile(r3, r1)
            gr1 r1 = defpackage.ok1.b
            if (r0 == r1) goto L0
            return
    }

    public final defpackage.rj0 m() {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.nk1.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.nk1.e0
            java.lang.Object r7 = r0.getObjectVolatile(r9, r1)
            r3 = 0
            gr1 r8 = defpackage.ok1.b
            if (r7 != 0) goto L16
            r0.putObjectVolatile(r9, r1, r8)
            return r3
        L16:
            boolean r0 = r7 instanceof defpackage.rj0
            if (r0 == 0) goto L31
        L1a:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.nk1.e0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L28
            rj0 r7 = (defpackage.rj0) r7
            return r7
        L28:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L2f
            goto L3f
        L2f:
            r9 = r4
            goto L1a
        L31:
            r4 = r9
            if (r7 == r8) goto L3f
            boolean r9 = r7 instanceof java.lang.Throwable
            if (r9 == 0) goto L39
            goto L3f
        L39:
            java.lang.String r9 = "Inconsistent state "
            defpackage.e41.h(r7, r9)
            return r3
        L3f:
            r9 = r4
            goto L0
    }

    public final defpackage.rj0 n() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.nk1.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.nk1.e0
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            boolean r0 = r3 instanceof defpackage.rj0
            if (r0 == 0) goto L14
            rj0 r3 = (defpackage.rj0) r3
            return r3
        L14:
            r3 = 0
            return r3
    }

    public final boolean o() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.nk1.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.nk1.e0
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            if (r3 == 0) goto L11
            r3 = 1
            return r3
        L11:
            r3 = 0
            return r3
    }

    public final boolean p(java.lang.Throwable r15) {
            r14 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.nk1.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.nk1.e0
            java.lang.Object r7 = r0.getObjectVolatile(r14, r1)
            gr1 r12 = defpackage.ok1.b
            boolean r0 = defpackage.nb3.k(r7, r12)
            if (r0 == 0) goto L2d
        L15:
            sun.misc.Unsafe r8 = defpackage.v36.a
            long r10 = defpackage.nk1.e0
            r9 = r14
            r13 = r15
            boolean r14 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r4 = r9
            if (r14 == 0) goto L23
            goto L33
        L23:
            java.lang.Object r14 = r8.getObjectVolatile(r4, r1)
            if (r14 == r12) goto L2a
            goto L48
        L2a:
            r14 = r4
            r15 = r13
            goto L15
        L2d:
            r4 = r14
            r13 = r15
            boolean r14 = r7 instanceof java.lang.Throwable
            if (r14 == 0) goto L35
        L33:
            r14 = 1
            return r14
        L35:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.nk1.e0
            r8 = 0
            boolean r14 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r14 == 0) goto L42
            r14 = 0
            return r14
        L42:
            java.lang.Object r14 = r3.getObjectVolatile(r4, r1)
            if (r14 == r7) goto L35
        L48:
            r14 = r4
            r15 = r13
            goto L0
    }

    public final java.lang.Throwable q(defpackage.rj0 r15) {
            r14 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.nk1.d0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.nk1.e0
            java.lang.Object r7 = r0.getObjectVolatile(r14, r1)
            r0 = 0
            gr1 r12 = defpackage.ok1.b
            if (r7 != r12) goto L2c
        L12:
            sun.misc.Unsafe r8 = defpackage.v36.a
            long r10 = defpackage.nk1.e0
            r9 = r14
            r13 = r15
            boolean r14 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r4 = r9
            if (r14 == 0) goto L20
            return r0
        L20:
            java.lang.Object r14 = r8.getObjectVolatile(r4, r1)
            if (r14 == r12) goto L29
            r14 = r4
            r15 = r13
            goto L0
        L29:
            r14 = r4
            r15 = r13
            goto L12
        L2c:
            r4 = r14
            boolean r14 = r7 instanceof java.lang.Throwable
            if (r14 == 0) goto L4c
        L31:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.nk1.e0
            r8 = 0
            boolean r14 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r14 == 0) goto L3f
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            return r7
        L3f:
            java.lang.Object r14 = r3.getObjectVolatile(r4, r1)
            if (r14 != r7) goto L46
            goto L31
        L46:
            java.lang.String r14 = "Failed requirement."
            defpackage.i.h(r14)
            return r0
        L4c:
            java.lang.String r14 = "Inconsistent state "
            defpackage.e41.h(r7, r14)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DispatchedContinuation["
            r0.<init>(r1)
            n61 r1 = r2.R
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            s41 r2 = r2.X
            java.lang.String r2 = defpackage.nc1.i0(r2)
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
