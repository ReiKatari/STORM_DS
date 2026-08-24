package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vy0  reason: default package */
/* loaded from: classes.dex */
public abstract class vy0 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater A = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater B = null;
    public static final /* synthetic */ long L = 0;
    public static final /* synthetic */ long R = 0;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;

    static {
            java.lang.Class<vy0> r0 = defpackage.vy0.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_next$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.vy0.A = r3
            sun.misc.Unsafe r3 = defpackage.v36.a
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)
            long r4 = r3.objectFieldOffset(r2)
            defpackage.vy0.L = r4
            java.lang.String r2 = "_prev$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.vy0.B = r1
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)
            long r0 = r3.objectFieldOffset(r0)
            defpackage.vy0.R = r0
            return
    }

    public vy0(defpackage.p96 r1) {
            r0 = this;
            r0.<init>()
            r0._prev$volatile = r1
            return
    }

    public final void a() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.vy0.B
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.vy0.R
            r3 = 0
            r0.putObjectVolatile(r4, r1, r3)
            return
    }

    public final defpackage.vy0 c() {
            r3 = this;
            vy0 r3 = r3.f()
        L4:
            if (r3 == 0) goto L1c
            boolean r0 = r3.g()
            if (r0 == 0) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.vy0.B
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.vy0.R
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            vy0 r3 = (defpackage.vy0) r3
            goto L4
        L1c:
            return r3
    }

    public final defpackage.vy0 d() {
            r1 = this;
            java.lang.Object r1 = r1.e()
            gr1 r0 = defpackage.uy0.a
            if (r1 != r0) goto La
            r1 = 0
            return r1
        La:
            vy0 r1 = (defpackage.vy0) r1
            return r1
    }

    public final java.lang.Object e() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.vy0.A
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.vy0.L
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            return r3
    }

    public final defpackage.vy0 f() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.vy0.B
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.vy0.R
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            vy0 r3 = (defpackage.vy0) r3
            return r3
    }

    public abstract boolean g();

    public final boolean h() {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.vy0.A
            r0.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r3 = defpackage.vy0.L
            r5 = 0
            gr1 r6 = defpackage.uy0.a
            r2 = r7
            boolean r7 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r7 == 0) goto L15
            r7 = 1
            return r7
        L15:
            java.lang.Object r7 = r1.getObjectVolatile(r2, r3)
            if (r7 == 0) goto L1d
            r7 = 0
            return r7
        L1d:
            r7 = r2
            goto L0
    }

    public final void i() {
            r10 = this;
            vy0 r0 = r10.d()
            if (r0 != 0) goto L7
            return
        L7:
            vy0 r0 = r10.c()
            vy0 r1 = r10.d()
            r1.getClass()
        L12:
            r3 = r1
            boolean r1 = r3.g()
            if (r1 == 0) goto L1f
            vy0 r1 = r3.d()
            if (r1 != 0) goto L12
        L1f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.vy0.B
            r1.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r8 = defpackage.vy0.R
            java.lang.Object r6 = r1.getObjectVolatile(r3, r8)
            r1 = r6
            vy0 r1 = (defpackage.vy0) r1
            if (r1 != 0) goto L34
            r1 = 0
            r7 = r1
            goto L35
        L34:
            r7 = r0
        L35:
            sun.misc.Unsafe r2 = defpackage.v36.a
            long r4 = defpackage.vy0.R
            boolean r1 = r2.compareAndSwapObject(r3, r4, r6, r7)
            if (r1 == 0) goto L60
            if (r0 == 0) goto L4b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.vy0.A
            r1.getClass()
            long r4 = defpackage.vy0.L
            r2.putObjectVolatile(r0, r4, r3)
        L4b:
            boolean r1 = r3.g()
            if (r1 == 0) goto L57
            vy0 r1 = r3.d()
            if (r1 != 0) goto L7
        L57:
            if (r0 == 0) goto L5f
            boolean r0 = r0.g()
            if (r0 != 0) goto L7
        L5f:
            return
        L60:
            java.lang.Object r1 = r2.getObjectVolatile(r3, r8)
            if (r1 == r6) goto L35
            goto L1f
    }

    public final boolean j(defpackage.p96 r8) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.vy0.A
            r0.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r3 = defpackage.vy0.L
            r5 = 0
            r2 = r7
            r6 = r8
            boolean r7 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r7 == 0) goto L14
            r7 = 1
            return r7
        L14:
            java.lang.Object r7 = r1.getObjectVolatile(r2, r3)
            if (r7 == 0) goto L1c
            r7 = 0
            return r7
        L1c:
            r7 = r2
            r8 = r6
            goto L0
    }
}
