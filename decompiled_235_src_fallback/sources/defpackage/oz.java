package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oz  reason: default package */
/* loaded from: classes.dex */
public final class oz extends defpackage.uc3 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater g0 = null;
    public static final /* synthetic */ long h0 = 0;
    private volatile /* synthetic */ java.lang.Object _disposer$volatile;
    public final defpackage.rj0 d0;
    public defpackage.il1 e0;
    public final /* synthetic */ defpackage.qz f0;

    static {
            java.lang.Class<oz> r0 = defpackage.oz.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_disposer$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.oz.g0 = r1
            sun.misc.Unsafe r1 = defpackage.v36.a
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)
            long r0 = r1.objectFieldOffset(r0)
            defpackage.oz.h0 = r0
            return
    }

    public oz(defpackage.qz r1, defpackage.rj0 r2) {
            r0 = this;
            r0.f0 = r1
            r0.<init>()
            r0.d0 = r2
            return
    }

    @Override // defpackage.uc3
    public final boolean q() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.uc3
    public final void r(java.lang.Throwable r5) {
            r4 = this;
            r0 = 0
            rj0 r1 = r4.d0
            if (r5 == 0) goto L1e
            av0 r2 = new av0
            r2.<init>(r5, r0)
            r5 = 0
            gr1 r5 = r1.K(r2, r5)
            if (r5 == 0) goto L42
            r1.y(r5)
            pz r4 = r4.s()
            if (r4 == 0) goto L42
            r4.a()
            return
        L1e:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.qz.b
            qz r4 = r4.f0
            int r5 = r5.decrementAndGet(r4)
            if (r5 != 0) goto L42
            jg1[] r4 = r4.a
            java.util.ArrayList r5 = new java.util.ArrayList
            int r2 = r4.length
            r5.<init>(r2)
            int r2 = r4.length
        L31:
            if (r0 >= r2) goto L3f
            r3 = r4[r0]
            java.lang.Object r3 = r3.k()
            r5.add(r3)
            int r0 = r0 + 1
            goto L31
        L3f:
            r1.i(r5)
        L42:
            return
    }

    public final defpackage.pz s() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.oz.g0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.oz.h0
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            pz r3 = (defpackage.pz) r3
            return r3
    }

    public final void t(defpackage.pz r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.oz.g0
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.oz.h0
            r0.putObjectVolatile(r3, r1, r4)
            return
    }
}
