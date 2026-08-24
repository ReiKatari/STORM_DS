package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ky3  reason: default package */
/* loaded from: classes.dex */
public class ky3 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater A = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater B = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater L = null;
    public static final /* synthetic */ long R = 0;
    public static final /* synthetic */ long X = 0;
    public static final /* synthetic */ long Y = 0;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;
    private volatile /* synthetic */ java.lang.Object _removedRef$volatile;

    static {
            java.lang.Class<ky3> r0 = defpackage.ky3.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_next$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.ky3.A = r3
            sun.misc.Unsafe r3 = defpackage.v36.a
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)
            long r4 = r3.objectFieldOffset(r2)
            defpackage.ky3.R = r4
            java.lang.String r2 = "_prev$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.ky3.B = r4
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)
            long r4 = r3.objectFieldOffset(r2)
            defpackage.ky3.X = r4
            java.lang.String r2 = "_removedRef$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.ky3.L = r1
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)
            long r0 = r3.objectFieldOffset(r0)
            defpackage.ky3.Y = r0
            return
    }

    public ky3() {
            r0 = this;
            r0.<init>()
            r0._next$volatile = r0
            r0._prev$volatile = r0
            return
    }

    public static defpackage.ky3 h(defpackage.ky3 r3) {
        L0:
            boolean r0 = r3.m()
            if (r0 != 0) goto L7
            return r3
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ky3.B
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ky3.X
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            ky3 r3 = (defpackage.ky3) r3
            goto L0
    }

    public final boolean b(defpackage.ky3 r3, int r4) {
            r2 = this;
        L0:
            ky3 r0 = r2.l()
            boolean r1 = r0 instanceof defpackage.lw3
            if (r1 == 0) goto L19
            r2 = r0
            lw3 r2 = (defpackage.lw3) r2
            int r2 = r2.Z
            r2 = r2 & r4
            if (r2 != 0) goto L17
            boolean r2 = r0.b(r3, r4)
            if (r2 == 0) goto L17
            goto L1f
        L17:
            r2 = 0
            return r2
        L19:
            boolean r0 = r0.c(r3, r2)
            if (r0 == 0) goto L0
        L1f:
            r2 = 1
            return r2
    }

    public final boolean c(defpackage.ky3 r10, defpackage.ky3 r11) {
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ky3.B
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ky3.X
            r0.putObjectVolatile(r10, r1, r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.ky3.A
            r1.getClass()
            long r1 = defpackage.ky3.R
            r0.putObjectVolatile(r10, r1, r11)
        L16:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.ky3.R
            r4 = r9
            r8 = r10
            r7 = r11
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L28
            r8.i(r7)
            r9 = 1
            return r9
        L28:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L30
            r9 = 0
            return r9
        L30:
            r9 = r4
            r11 = r7
            r10 = r8
            goto L16
    }

    public final void d(defpackage.gg4 r10) {
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ky3.B
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ky3.X
            r0.putObjectVolatile(r10, r1, r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.ky3.A
            r1.getClass()
            long r1 = defpackage.ky3.R
            r0.putObjectVolatile(r10, r1, r9)
        L16:
            java.lang.Object r0 = r9.j()
            if (r0 == r9) goto L1d
            return
        L1d:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.ky3.R
            r7 = r9
            r4 = r9
            r8 = r10
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L2e
            r8.i(r4)
            return
        L2e:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r4) goto L37
            r9 = r4
            r10 = r8
            goto L16
        L37:
            r9 = r4
            r10 = r8
            goto L1d
    }

    public final defpackage.ky3 g() {
            r15 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ky3.B
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ky3.X
            java.lang.Object r0 = r0.getObjectVolatile(r15, r1)
            r7 = r0
            ky3 r7 = (defpackage.ky3) r7
            r0 = 0
            r9 = r0
            r8 = r7
        L13:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.ky3.A
            r3.getClass()
            if (r8 == 0) goto L85
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r4 = defpackage.ky3.R
            java.lang.Object r6 = r3.getObjectVolatile(r8, r4)
            if (r6 != r15) goto L40
            if (r7 != r8) goto L27
            goto L34
        L27:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.ky3.X
            r4 = r15
            boolean r15 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r14 = r7
            r7 = r4
            if (r15 == 0) goto L35
        L34:
            return r8
        L35:
            java.lang.Object r15 = r3.getObjectVolatile(r7, r1)
            if (r15 == r14) goto L3d
        L3b:
            r15 = r7
            goto L0
        L3d:
            r15 = r7
            r7 = r14
            goto L27
        L40:
            r14 = r7
            r7 = r15
            boolean r15 = r7.m()
            if (r15 == 0) goto L49
            return r0
        L49:
            boolean r15 = r6 instanceof defpackage.hj5
            if (r15 == 0) goto L7c
            if (r9 == 0) goto L6c
            hj5 r6 = (defpackage.hj5) r6
            ky3 r13 = r6.a
        L53:
            r12 = r8
            sun.misc.Unsafe r8 = defpackage.v36.a
            long r10 = defpackage.ky3.R
            boolean r15 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r3 = r8
            r8 = r12
            if (r15 == 0) goto L65
            r15 = r7
            r8 = r9
            r7 = r14
            r9 = r0
            goto L13
        L65:
            java.lang.Object r15 = r3.getObjectVolatile(r9, r4)
            if (r15 == r8) goto L53
            goto L3b
        L6c:
            if (r8 == 0) goto L78
            java.lang.Object r15 = r3.getObjectVolatile(r8, r1)
            r8 = r15
            ky3 r8 = (defpackage.ky3) r8
        L75:
            r15 = r7
            r7 = r14
            goto L13
        L78:
            defpackage.u34.a()
            return r0
        L7c:
            r6.getClass()
            r15 = r6
            ky3 r15 = (defpackage.ky3) r15
            r9 = r8
            r8 = r15
            goto L75
        L85:
            defpackage.u34.a()
            return r0
    }

    public final void i(defpackage.ky3 r10) {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ky3.B
            r0.getClass()
            if (r10 == 0) goto L46
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ky3.X
            java.lang.Object r0 = r0.getObjectVolatile(r10, r1)
            r7 = r0
            ky3 r7 = (defpackage.ky3) r7
            java.lang.Object r0 = r9.j()
            if (r0 == r10) goto L19
            goto L30
        L19:
            if (r10 == 0) goto L42
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.ky3.X
            r8 = r9
            r4 = r10
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L31
            boolean r9 = r8.m()
            if (r9 == 0) goto L30
            r4.g()
        L30:
            return
        L31:
            if (r4 == 0) goto L3e
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            r10 = r4
            if (r9 == r7) goto L3c
            r9 = r8
            goto L0
        L3c:
            r9 = r8
            goto L19
        L3e:
            defpackage.u34.a()
            return
        L42:
            defpackage.u34.a()
            return
        L46:
            defpackage.u34.a()
            return
    }

    public final java.lang.Object j() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ky3.A
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ky3.R
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            return r3
    }

    public final defpackage.ky3 k() {
            r1 = this;
            java.lang.Object r1 = r1.j()
            boolean r0 = r1 instanceof defpackage.hj5
            if (r0 == 0) goto Lc
            r0 = r1
            hj5 r0 = (defpackage.hj5) r0
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L12
            ky3 r1 = r0.a
            return r1
        L12:
            r1.getClass()
            ky3 r1 = (defpackage.ky3) r1
            return r1
    }

    public final defpackage.ky3 l() {
            r3 = this;
            ky3 r0 = r3.g()
            if (r0 != 0) goto L1a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ky3.B
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ky3.X
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            ky3 r3 = (defpackage.ky3) r3
            ky3 r3 = h(r3)
            return r3
        L1a:
            return r0
    }

    public boolean m() {
            r0 = this;
            java.lang.Object r0 = r0.j()
            boolean r0 = r0 instanceof defpackage.hj5
            return r0
    }

    public final defpackage.ky3 n() {
            r7 = this;
        L0:
            java.lang.Object r4 = r7.j()
            boolean r0 = r4 instanceof defpackage.hj5
            if (r0 == 0) goto Ld
            hj5 r4 = (defpackage.hj5) r4
            ky3 r7 = r4.a
            return r7
        Ld:
            if (r4 != r7) goto L12
            ky3 r4 = (defpackage.ky3) r4
            return r4
        L12:
            r4.getClass()
            r6 = r4
            ky3 r6 = (defpackage.ky3) r6
            hj5 r5 = r6.o()
        L1c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ky3.A
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.ky3.R
            r1 = r7
            boolean r7 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r7 == 0) goto L31
            r6.g()
            r7 = 0
            return r7
        L31:
            java.lang.Object r7 = r0.getObjectVolatile(r1, r2)
            if (r7 == r4) goto L39
            r7 = r1
            goto L0
        L39:
            r7 = r1
            goto L1c
    }

    public final defpackage.hj5 o() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ky3.L
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ky3.Y
            java.lang.Object r3 = r0.getObjectVolatile(r4, r1)
            hj5 r3 = (defpackage.hj5) r3
            if (r3 != 0) goto L19
            hj5 r3 = new hj5
            r3.<init>(r4)
            r0.putObjectVolatile(r4, r1, r3)
        L19:
            return r3
    }

    public java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            qo3 r1 = new qo3
            r2 = 1
            r3 = 3
            java.lang.Class<nc1> r4 = defpackage.nc1.class
            java.lang.String r6 = "classSimpleName"
            java.lang.String r7 = "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.append(r1)
            r8 = 64
            r0.append(r8)
            java.lang.String r8 = defpackage.nc1.P(r5)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            return r8
    }
}
