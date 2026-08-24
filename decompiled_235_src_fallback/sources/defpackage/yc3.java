package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yc3  reason: default package */
/* loaded from: classes.dex */
public final class yc3 implements defpackage.e43 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater B = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater L = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater R = null;
    public static final /* synthetic */ long X = 0;
    public static final /* synthetic */ long Y = 0;
    public final defpackage.gg4 A;
    private volatile /* synthetic */ java.lang.Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile;
    private volatile /* synthetic */ java.lang.Object _rootCause$volatile;

    static {
            java.lang.String r0 = "_isCompleting$volatile"
            java.lang.Class<yc3> r1 = defpackage.yc3.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            defpackage.yc3.B = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "_rootCause$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            defpackage.yc3.L = r3
            sun.misc.Unsafe r3 = defpackage.v36.a
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r4 = r3.objectFieldOffset(r2)
            defpackage.yc3.Y = r4
            java.lang.String r2 = "_exceptionsHolder$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            defpackage.yc3.R = r0
            java.lang.reflect.Field r0 = r1.getDeclaredField(r2)
            long r0 = r3.objectFieldOffset(r0)
            defpackage.yc3.X = r0
            return
    }

    public yc3(defpackage.gg4 r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r1 = 0
            r0._isCompleting$volatile = r1
            r0._rootCause$volatile = r2
            return
    }

    public final void a(java.lang.Throwable r4) {
            r3 = this;
            java.lang.Throwable r0 = r3.c()
            if (r0 != 0) goto La
            r3.i(r4)
            return
        La:
            if (r4 != r0) goto Ld
            goto L1d
        Ld:
            java.lang.Object r0 = r3.b()
            if (r0 != 0) goto L17
            r3.h(r4)
            return
        L17:
            boolean r1 = r0 instanceof java.lang.Throwable
            if (r1 == 0) goto L2e
            if (r4 != r0) goto L1e
        L1d:
            return
        L1e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 4
            r1.<init>(r2)
            r1.add(r0)
            r1.add(r4)
            r3.h(r1)
            return
        L2e:
            boolean r3 = r0 instanceof java.util.ArrayList
            if (r3 == 0) goto L38
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r4)
            return
        L38:
            java.lang.String r3 = "State is "
            defpackage.e41.h(r0, r3)
            return
    }

    public final java.lang.Object b() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.yc3.R
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.yc3.X
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            return r3
    }

    public final java.lang.Throwable c() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.yc3.L
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.yc3.Y
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            return r3
    }

    public final boolean d() {
            r0 = this;
            java.lang.Throwable r0 = r0.c()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // defpackage.e43
    public final boolean e() {
            r0 = this;
            java.lang.Throwable r0 = r0.c()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // defpackage.e43
    public final defpackage.gg4 f() {
            r0 = this;
            gg4 r0 = r0.A
            return r0
    }

    public final java.util.ArrayList g(java.lang.Throwable r4) {
            r3 = this;
            java.lang.Object r0 = r3.b()
            r1 = 4
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            goto L21
        Ld:
            boolean r2 = r0 instanceof java.lang.Throwable
            if (r2 == 0) goto L1b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r2.add(r0)
            r0 = r2
            goto L21
        L1b:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L3c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
        L21:
            java.lang.Throwable r1 = r3.c()
            if (r1 == 0) goto L2b
            r2 = 0
            r0.add(r2, r1)
        L2b:
            if (r4 == 0) goto L36
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L36
            r0.add(r4)
        L36:
            gr1 r4 = defpackage.fd3.e
            r3.h(r4)
            return r0
        L3c:
            java.lang.String r3 = "State is "
            defpackage.e41.h(r0, r3)
            r3 = 0
            return r3
    }

    public final void h(java.lang.Object r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.yc3.R
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.yc3.X
            r0.putObjectVolatile(r3, r1, r4)
            return
    }

    public final void i(java.lang.Throwable r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.yc3.L
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.yc3.Y
            r0.putObjectVolatile(r3, r1, r4)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Finishing[cancelling="
            r0.<init>(r1)
            boolean r1 = r3.d()
            r0.append(r1)
            java.lang.String r1 = ", completing="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.yc3.B
            int r1 = r1.get(r3)
            r2 = 1
            if (r1 != r2) goto L1d
            goto L1e
        L1d:
            r2 = 0
        L1e:
            r0.append(r2)
            java.lang.String r1 = ", rootCause="
            r0.append(r1)
            java.lang.Throwable r1 = r3.c()
            r0.append(r1)
            java.lang.String r1 = ", exceptions="
            r0.append(r1)
            java.lang.Object r1 = r3.b()
            r0.append(r1)
            java.lang.String r1 = ", list="
            r0.append(r1)
            gg4 r3 = r3.A
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
