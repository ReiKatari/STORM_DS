package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hb4  reason: default package */
/* loaded from: classes.dex */
public final class hb4 extends defpackage.kb6 implements defpackage.fb4 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f0 = null;
    public static final /* synthetic */ long g0 = 0;
    private volatile /* synthetic */ java.lang.Object owner$volatile;

    static {
            java.lang.Class<hb4> r0 = defpackage.hb4.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "owner$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.hb4.f0 = r1
            sun.misc.Unsafe r1 = defpackage.v36.a
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)
            long r0 = r1.objectFieldOffset(r0)
            defpackage.hb4.g0 = r0
            return
    }

    public hb4() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            gr1 r0 = defpackage.ib4.a
            r1.owner$volatile = r0
            return
    }

    @Override // defpackage.fb4
    public final java.lang.Object e(defpackage.r41 r6) {
            r5 = this;
            boolean r0 = r5.g()
            jg7 r1 = defpackage.jg7.a
            if (r0 == 0) goto L9
            goto L4a
        L9:
            r41 r6 = defpackage.np2.V(r6)
            rj0 r6 = defpackage.n16.C(r6)
            gb4 r0 = new gb4     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4b
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.kb6.Z     // Catch: java.lang.Throwable -> L4b
            int r2 = r2.getAndDecrement(r5)     // Catch: java.lang.Throwable -> L4b
            int r3 = r5.A     // Catch: java.lang.Throwable -> L4b
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L37
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.hb4.f0     // Catch: java.lang.Throwable -> L4b
            hb4 r2 = r0.B     // Catch: java.lang.Throwable -> L4b
            r3 = 0
            r5.set(r2, r3)     // Catch: java.lang.Throwable -> L4b
            rj0 r5 = r0.A     // Catch: java.lang.Throwable -> L4b
            bg2 r3 = new bg2     // Catch: java.lang.Throwable -> L4b
            r4 = 13
            r3.<init>(r4, r2, r0)     // Catch: java.lang.Throwable -> L4b
            r5.G(r1, r3)     // Catch: java.lang.Throwable -> L4b
            goto L3d
        L37:
            boolean r2 = r5.b(r0)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L16
        L3d:
            java.lang.Object r5 = r6.s()
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            if (r5 != r6) goto L46
            goto L47
        L46:
            r5 = r1
        L47:
            if (r5 != r6) goto L4a
            return r5
        L4a:
            return r1
        L4b:
            r5 = move-exception
            r6.E()
            throw r5
    }

    public final boolean f() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.kb6.Z
            int r1 = r0.get(r1)
            r0 = 0
            int r1 = java.lang.Math.max(r1, r0)
            if (r1 != 0) goto Lf
            r1 = 1
            return r1
        Lf:
            return r0
    }

    public final boolean g() {
            r1 = this;
            int r1 = r1.i()
            r0 = 1
            if (r1 == 0) goto L1b
            if (r1 == r0) goto L19
            r0 = 2
            if (r1 == r0) goto L13
            java.lang.String r1 = "unexpected"
            defpackage.i.m(r1)
        L11:
            r1 = 0
            return r1
        L13:
            java.lang.String r1 = "This mutex is already locked by the specified owner: null"
            defpackage.u34.f(r1)
            goto L11
        L19:
            r1 = 0
            return r1
        L1b:
            return r0
    }

    @Override // defpackage.fb4
    public final void h(java.lang.Object r10) {
            r9 = this;
        L0:
            boolean r0 = r9.f()
            if (r0 == 0) goto L3f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.hb4.f0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.hb4.g0
            java.lang.Object r7 = r0.getObjectVolatile(r9, r1)
            gr1 r8 = defpackage.ib4.a
            if (r7 == r8) goto L0
            if (r7 == r10) goto L26
            if (r10 != 0) goto L1c
            goto L26
        L1c:
            java.lang.String r9 = ", but "
            java.lang.String r0 = " is expected"
            java.lang.String r1 = "This mutex is locked by "
            defpackage.u34.m(r1, r7, r9, r10, r0)
            return
        L26:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.hb4.g0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L35
            r4.c()
            return
        L35:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L3d
            r9 = r4
            goto L0
        L3d:
            r9 = r4
            goto L26
        L3f:
            java.lang.String r9 = "This mutex is not locked"
            defpackage.i.m(r9)
            return
    }

    public final int i() {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.kb6.Z
            int r1 = r0.get(r4)
            int r2 = r4.A
            if (r1 <= r2) goto L17
        La:
            int r1 = r0.get(r4)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r4, r1, r2)
            if (r1 == 0) goto La
            goto L0
        L17:
            if (r1 > 0) goto L1b
            r4 = 1
            return r4
        L1b:
            int r2 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r4, r1, r2)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.hb4.f0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.hb4.g0
            r3 = 0
            r0.putObjectVolatile(r4, r1, r3)
            r4 = 0
            return r4
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Mutex@"
            r0.<init>(r1)
            java.lang.String r1 = defpackage.nc1.P(r4)
            r0.append(r1)
            java.lang.String r1 = "[isLocked="
            r0.append(r1)
            boolean r1 = r4.f()
            r0.append(r1)
            java.lang.String r1 = ",owner="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.hb4.f0
            r1.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r2 = defpackage.hb4.g0
            java.lang.Object r4 = r1.getObjectVolatile(r4, r2)
            r0.append(r4)
            r4 = 93
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
