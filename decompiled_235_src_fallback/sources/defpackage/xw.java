package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xw  reason: default package */
/* loaded from: classes.dex */
public final class xw {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater b = null;
    public static final /* synthetic */ long c = 0;
    public volatile java.lang.Object a;

    static {
            java.lang.Class<xw> r0 = defpackage.xw.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.xw.b = r1
            sun.misc.Unsafe r1 = defpackage.v36.a
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)
            long r0 = r1.objectFieldOffset(r0)
            defpackage.xw.c = r0
            return
    }

    public final boolean a(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.xw.b
            r0.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r3 = defpackage.xw.c
            r2 = r7
            r5 = r8
            r6 = r9
            boolean r7 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r7 == 0) goto L14
            r7 = 1
            goto L1b
        L14:
            java.lang.Object r7 = r1.getObjectVolatile(r2, r3)
            if (r7 == r5) goto L1c
            r7 = 0
        L1b:
            return r7
        L1c:
            r7 = r2
            r8 = r5
            r9 = r6
            goto L0
    }

    public final java.lang.Object b(java.lang.Object r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.xw.b
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.xw.c
            java.lang.Object r3 = r0.getAndSetObject(r3, r1, r4)
            return r3
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.Object r0 = r0.a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
