package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u36  reason: default package */
/* loaded from: classes.dex */
public final class u36 implements defpackage.go3, java.io.Serializable {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater L = null;
    public static final /* synthetic */ long R = 0;
    public volatile defpackage.on2 A;
    public volatile java.lang.Object B;

    static {
            java.lang.Class<u36> r0 = defpackage.u36.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "B"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.u36.L = r1
            sun.misc.Unsafe r1 = defpackage.v36.a
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)
            long r0 = r1.objectFieldOffset(r0)
            defpackage.u36.R = r0
            return
    }

    @Override // defpackage.go3
    public final java.lang.Object getValue() {
            r7 = this;
            java.lang.Object r0 = r7.B
            xd5 r5 = defpackage.xd5.u0
            if (r0 == r5) goto L7
            return r0
        L7:
            on2 r0 = r7.A
            if (r0 == 0) goto L2c
            java.lang.Object r6 = r0.c()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.u36.L
        L11:
            r0.getClass()
            sun.misc.Unsafe r1 = defpackage.v36.a
            long r3 = defpackage.u36.R
            r2 = r7
            boolean r7 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r7 == 0) goto L23
            r7 = 0
            r2.A = r7
            return r6
        L23:
            java.lang.Object r7 = r1.getObjectVolatile(r2, r3)
            if (r7 == r5) goto L2a
            goto L2d
        L2a:
            r7 = r2
            goto L11
        L2c:
            r2 = r7
        L2d:
            java.lang.Object r7 = r2.B
            return r7
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.B
            xd5 r1 = defpackage.xd5.u0
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L14
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        L14:
            java.lang.String r2 = "Lazy value not initialized yet."
            return r2
    }
}
