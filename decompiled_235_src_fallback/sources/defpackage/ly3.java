package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly3  reason: default package */
/* loaded from: classes.dex */
public class ly3 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = null;
    public static final /* synthetic */ long b = 0;
    private volatile /* synthetic */ java.lang.Object _cur$volatile;

    static {
            java.lang.Class<ly3> r0 = defpackage.ly3.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_cur$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.ly3.a = r1
            sun.misc.Unsafe r1 = defpackage.v36.a
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)
            long r0 = r1.objectFieldOffset(r0)
            defpackage.ly3.b = r0
            return
    }

    public ly3() {
            r3 = this;
            r3.<init>()
            ny3 r0 = new ny3
            r1 = 8
            r2 = 0
            r0.<init>(r1, r2)
            r3._cur$volatile = r0
            return
    }

    public final boolean a(java.lang.Runnable r10) {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ly3.a
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ly3.b
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            ny3 r7 = (defpackage.ny3) r7
            int r0 = r7.a(r10)
            r3 = 1
            if (r0 == 0) goto L3a
            if (r0 == r3) goto L20
            r1 = 2
            if (r0 == r1) goto L1e
            r4 = r9
            goto L36
        L1e:
            r9 = 0
            return r9
        L20:
            ny3 r8 = r7.d()
        L24:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.ly3.b
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L30
            goto L36
        L30:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L38
        L36:
            r9 = r4
            goto L0
        L38:
            r9 = r4
            goto L24
        L3a:
            return r3
    }

    public final void b() {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ly3.a
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ly3.b
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            ny3 r7 = (defpackage.ny3) r7
            boolean r0 = r7.c()
            if (r0 == 0) goto L17
            return
        L17:
            ny3 r8 = r7.d()
        L1b:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.ly3.b
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L27
            goto L2d
        L27:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L2f
        L2d:
            r9 = r4
            goto L0
        L2f:
            r9 = r4
            goto L1b
    }

    public final int c() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ly3.a
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ly3.b
            java.lang.Object r4 = r0.getObjectVolatile(r4, r1)
            ny3 r4 = (defpackage.ny3) r4
            r4.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ny3.f
            long r0 = r0.get(r4)
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r0
            int r4 = (int) r2
            r2 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r2
            r2 = 30
            long r0 = r0 >> r2
            int r0 = (int) r0
            int r0 = r0 - r4
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            r4 = r4 & r0
            return r4
    }

    public final java.lang.Object d() {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ly3.a
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ly3.b
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            ny3 r7 = (defpackage.ny3) r7
            java.lang.Object r0 = r7.e()
            gr1 r3 = defpackage.ny3.g
            if (r0 == r3) goto L19
            return r0
        L19:
            ny3 r8 = r7.d()
        L1d:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.ly3.b
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L29
            goto L2f
        L29:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L31
        L2f:
            r9 = r4
            goto L0
        L31:
            r9 = r4
            goto L1d
    }
}
