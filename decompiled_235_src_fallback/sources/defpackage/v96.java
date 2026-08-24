package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v96  reason: default package */
/* loaded from: classes.dex */
public final class v96 implements defpackage.lj0, defpackage.zr7 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater Y = null;
    public static final /* synthetic */ long Z = 0;
    public final defpackage.l61 A;
    public java.util.ArrayList B;
    public java.lang.Object L;
    public int R;
    public java.lang.Object X;
    private volatile /* synthetic */ java.lang.Object state$volatile;

    static {
            java.lang.Class<v96> r0 = defpackage.v96.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "state$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.v96.Y = r1
            sun.misc.Unsafe r1 = defpackage.v36.a
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)
            long r0 = r1.objectFieldOffset(r0)
            defpackage.v96.Z = r0
            return
    }

    public v96(defpackage.l61 r2) {
            r1 = this;
            r1.<init>()
            r1.A = r2
            gr1 r2 = defpackage.w96.a
            r1.state$volatile = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 2
            r2.<init>(r0)
            r1.B = r2
            r2 = -1
            r1.R = r2
            gr1 r2 = defpackage.w96.d
            r1.X = r2
            return
    }

    @Override // defpackage.zr7
    public final void a(defpackage.p96 r1, int r2) {
            r0 = this;
            r0.L = r1
            r0.R = r2
            return
    }

    @Override // defpackage.lj0
    public final void b(java.lang.Throwable r9) {
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = defpackage.v96.Y
            r9.getClass()
            sun.misc.Unsafe r9 = defpackage.v36.a
            long r0 = defpackage.v96.Z
            java.lang.Object r6 = r9.getObjectVolatile(r8, r0)
            gr1 r9 = defpackage.w96.b
            if (r6 != r9) goto L12
            goto L23
        L12:
            sun.misc.Unsafe r2 = defpackage.v36.a
            long r4 = defpackage.v96.Z
            gr1 r7 = defpackage.w96.c
            r3 = r8
            boolean r8 = r2.compareAndSwapObject(r3, r4, r6, r7)
            if (r8 == 0) goto L3f
            java.util.ArrayList r8 = r3.B
            if (r8 != 0) goto L24
        L23:
            return
        L24:
            int r9 = r8.size()
            r0 = 0
        L29:
            if (r0 >= r9) goto L37
            java.lang.Object r1 = r8.get(r0)
            int r0 = r0 + 1
            t96 r1 = (defpackage.t96) r1
            r1.a()
            goto L29
        L37:
            gr1 r8 = defpackage.w96.d
            r3.X = r8
            r8 = 0
            r3.B = r8
            return
        L3f:
            java.lang.Object r8 = r2.getObjectVolatile(r3, r0)
            if (r8 == r6) goto L47
            r8 = r3
            goto L0
        L47:
            r8 = r3
            goto L12
    }

    public final void c(defpackage.t96 r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.B
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r0.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L1a
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            t96 r3 = (defpackage.t96) r3
            if (r3 == r5) goto La
            r3.a()
            goto La
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.v96.Y
            r5.getClass()
            sun.misc.Unsafe r5 = defpackage.v36.a
            long r0 = defpackage.v96.Z
            gr1 r2 = defpackage.w96.b
            r5.putObjectVolatile(r4, r0, r2)
            gr1 r5 = defpackage.w96.d
            r4.X = r5
            r5 = 0
            r4.B = r5
            return
    }

    public final java.lang.Object d(defpackage.s41 r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v96.Y
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.v96.Z
            java.lang.Object r0 = r0.getObjectVolatile(r4, r1)
            r0.getClass()
            t96 r0 = (defpackage.t96) r0
            java.lang.Object r1 = r4.X
            r4.c(r0)
            fo2 r4 = r0.c
            java.lang.Object r2 = r0.a
            java.lang.Object r3 = r0.d
            java.lang.Object r4 = r4.e(r2, r3, r1)
            hw6 r0 = r0.e
            gr1 r1 = defpackage.w96.e
            if (r3 != r1) goto L2e
            qn2 r0 = (defpackage.qn2) r0
            java.lang.Object r4 = r0.g(r5)
            return r4
        L2e:
            eo2 r0 = (defpackage.eo2) r0
            java.lang.Object r4 = r0.o(r4, r5)
            return r4
    }

    public final java.lang.Object e(defpackage.hw6 r2) {
            r1 = this;
            boolean r0 = r1.i()
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r1.d(r2)
            return r1
        Lb:
            java.lang.Object r1 = r1.f(r2)
            return r1
    }

    public final java.lang.Object f(defpackage.s41 r7) {
            r6 = this;
            boolean r0 = r7 instanceof defpackage.u96
            if (r0 == 0) goto L13
            r0 = r7
            u96 r0 = (defpackage.u96) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            u96 r0 = new u96
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.oi2.Y(r7)
            return r7
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L31:
            v96 r6 = r0.R
            defpackage.oi2.Y(r7)
            goto L45
        L37:
            defpackage.oi2.Y(r7)
            r0.R = r6
            r0.Z = r5
            java.lang.Object r7 = r6.m(r0)
            if (r7 != r1) goto L45
            goto L4f
        L45:
            r0.R = r3
            r0.Z = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L50
        L4f:
            return r1
        L50:
            return r6
    }

    public final defpackage.t96 g(java.lang.Object r6) {
            r5 = this;
            java.util.ArrayList r5 = r5.B
            r0 = 0
            if (r5 != 0) goto L6
            return r0
        L6:
            int r1 = r5.size()
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1b
            java.lang.Object r3 = r5.get(r2)
            int r2 = r2 + 1
            r4 = r3
            t96 r4 = (defpackage.t96) r4
            java.lang.Object r4 = r4.a
            if (r4 != r6) goto Lb
            r0 = r3
        L1b:
            t96 r0 = (defpackage.t96) r0
            if (r0 == 0) goto L20
            return r0
        L20:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Clause with object "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " is not found"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public final void h(defpackage.eb r9, defpackage.eo2 r10) {
            r8 = this;
            t96 r0 = new t96
            java.lang.Object r2 = r9.B
            java.lang.Object r1 = r9.L
            r3 = r1
            fo2 r3 = (defpackage.fo2) r3
            java.lang.Object r1 = r9.R
            r4 = r1
            fo2 r4 = (defpackage.fo2) r4
            java.lang.Object r9 = r9.X
            r7 = r9
            fo2 r7 = (defpackage.fo2) r7
            r6 = r10
            hw6 r6 = (defpackage.hw6) r6
            r5 = 0
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8 = 0
            r1.j(r0, r8)
            return
    }

    public final boolean i() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v96.Y
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.v96.Z
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            boolean r3 = r3 instanceof defpackage.t96
            return r3
    }

    public final void j(defpackage.t96 r8, boolean r9) {
            r7 = this;
            java.lang.Object r0 = r8.a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.v96.Y
            r1.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r2 = defpackage.v96.Z
            java.lang.Object r1 = r1.getObjectVolatile(r7, r2)
            boolean r1 = r1 instanceof defpackage.t96
            if (r1 == 0) goto L14
            return
        L14:
            if (r9 != 0) goto L3c
            java.util.ArrayList r1 = r7.B
            r1.getClass()
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L22
            goto L3c
        L22:
            int r4 = r1.size()
            r5 = 0
        L27:
            if (r5 >= r4) goto L3c
            java.lang.Object r6 = r1.get(r5)
            int r5 = r5 + 1
            t96 r6 = (defpackage.t96) r6
            java.lang.Object r6 = r6.a
            if (r6 == r0) goto L36
            goto L27
        L36:
            java.lang.String r7 = "Cannot use select clauses on the same object: "
            defpackage.u34.i(r0, r7)
            return
        L3c:
            fo2 r1 = r8.b
            java.lang.Object r4 = r8.d
            r1.e(r0, r7, r4)
            java.lang.Object r0 = r7.X
            gr1 r1 = defpackage.w96.d
            if (r0 != r1) goto L62
            if (r9 != 0) goto L53
            java.util.ArrayList r9 = r7.B
            r9.getClass()
            r9.add(r8)
        L53:
            java.lang.Object r9 = r7.L
            r8.g = r9
            int r9 = r7.R
            r8.h = r9
            r8 = 0
            r7.L = r8
            r8 = -1
            r7.R = r8
            return
        L62:
            sun.misc.Unsafe r9 = defpackage.v36.a
            r9.putObjectVolatile(r7, r2, r8)
            return
    }

    public final boolean k(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r0 = r0.l(r1, r2)
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final int l(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v96.Y
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.v96.Z
            java.lang.Object r7 = r0.getObjectVolatile(r11, r1)
            boolean r0 = r7 instanceof defpackage.qj0
            r9 = 0
            r10 = 2
            if (r0 == 0) goto L52
            t96 r8 = r11.g(r12)
            if (r8 != 0) goto L1a
            goto L0
        L1a:
            fo2 r0 = r8.f
            if (r0 == 0) goto L27
            java.lang.Object r3 = r8.d
            java.lang.Object r0 = r0.e(r11, r3, r13)
            fo2 r0 = (defpackage.fo2) r0
            goto L28
        L27:
            r0 = 0
        L28:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.v96.Z
            r4 = r11
            boolean r11 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r11 == 0) goto L48
            qj0 r7 = (defpackage.qj0) r7
            r4.X = r13
            jg7 r11 = defpackage.jg7.a
            gr1 r11 = r7.j(r11, r0)
            if (r11 != 0) goto L44
            gr1 r11 = defpackage.w96.d
            r4.X = r11
            return r10
        L44:
            r7.y(r11)
            return r9
        L48:
            java.lang.Object r11 = r3.getObjectVolatile(r4, r1)
            if (r11 == r7) goto L50
        L4e:
            r11 = r4
            goto L0
        L50:
            r11 = r4
            goto L28
        L52:
            r4 = r11
            gr1 r11 = defpackage.w96.b
            boolean r11 = defpackage.nb3.k(r7, r11)
            if (r11 != 0) goto Lab
            boolean r11 = r7 instanceof defpackage.t96
            if (r11 == 0) goto L60
            goto Lab
        L60:
            gr1 r11 = defpackage.w96.c
            boolean r11 = defpackage.nb3.k(r7, r11)
            if (r11 == 0) goto L69
            return r10
        L69:
            gr1 r11 = defpackage.w96.a
            boolean r11 = defpackage.nb3.k(r7, r11)
            if (r11 == 0) goto L87
            java.util.List r8 = defpackage.hf.b0(r12)
        L75:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.v96.Z
            boolean r11 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r11 == 0) goto L80
            goto L9c
        L80:
            java.lang.Object r11 = r3.getObjectVolatile(r4, r1)
            if (r11 == r7) goto L75
            goto L4e
        L87:
            boolean r11 = r7 instanceof java.util.List
            if (r11 == 0) goto La5
            r11 = r7
            java.util.Collection r11 = (java.util.Collection) r11
            java.util.ArrayList r8 = defpackage.gt0.U0(r12, r11)
        L92:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.v96.Z
            boolean r11 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r11 == 0) goto L9e
        L9c:
            r11 = 1
            return r11
        L9e:
            java.lang.Object r11 = r3.getObjectVolatile(r4, r1)
            if (r11 == r7) goto L92
            goto L4e
        La5:
            java.lang.String r11 = "Unexpected state: "
            defpackage.e41.h(r7, r11)
            return r9
        Lab:
            r11 = 3
            return r11
    }

    public final java.lang.Object m(defpackage.u96 r13) {
            r12 = this;
            rj0 r5 = new rj0
            r41 r0 = defpackage.np2.V(r13)
            r6 = 1
            r5.<init>(r6, r0)
            r5.v()
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v96.Y
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r7 = defpackage.v96.Z
            java.lang.Object r4 = r0.getObjectVolatile(r12, r7)
            jg7 r9 = defpackage.jg7.a
            r0 = r5
            gr1 r5 = defpackage.w96.a
            if (r4 != r5) goto L3b
            r5 = r0
        L22:
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.v96.Z
            r1 = r12
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            r10 = r5
            if (r2 == 0) goto L32
            r10.A(r12)
            goto L8c
        L32:
            java.lang.Object r0 = r0.getObjectVolatile(r12, r7)
            if (r0 == r4) goto L39
            goto L72
        L39:
            r5 = r10
            goto L22
        L3b:
            r10 = r0
            boolean r0 = r4 instanceof java.util.List
            r11 = 0
            if (r0 == 0) goto L74
        L41:
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r2 = defpackage.v96.Z
            r1 = r12
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L6c
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r0 = r4.iterator()
        L52:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r0.next()
            t96 r2 = r12.g(r2)
            r2.getClass()
            r2.g = r11
            r3 = -1
            r2.h = r3
            r12.j(r2, r6)
            goto L52
        L6c:
            java.lang.Object r0 = r0.getObjectVolatile(r12, r7)
            if (r0 == r4) goto L41
        L72:
            r5 = r10
            goto Ld
        L74:
            boolean r0 = r4 instanceof defpackage.t96
            if (r0 == 0) goto L96
            t96 r4 = (defpackage.t96) r4
            java.lang.Object r0 = r12.X
            fo2 r2 = r4.f
            if (r2 == 0) goto L89
            java.lang.Object r3 = r4.d
            java.lang.Object r0 = r2.e(r12, r3, r0)
            r11 = r0
            fo2 r11 = (defpackage.fo2) r11
        L89:
            r10.t(r9, r11)
        L8c:
            java.lang.Object r0 = r10.s()
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L95
            return r0
        L95:
            return r9
        L96:
            java.lang.String r0 = "unexpected state: "
            defpackage.e41.h(r4, r0)
            return r11
    }
}
