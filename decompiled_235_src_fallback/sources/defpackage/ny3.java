package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ny3  reason: default package */
/* loaded from: classes.dex */
public final class ny3 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater e = null;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f = null;
    public static final defpackage.gr1 g = null;
    public static final /* synthetic */ long h = 0;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray d;

    static {
            java.lang.Class<ny3> r0 = defpackage.ny3.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_next$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.ny3.e = r1
            sun.misc.Unsafe r1 = defpackage.v36.a
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)
            long r1 = r1.objectFieldOffset(r2)
            defpackage.ny3.h = r1
            java.lang.String r1 = "_state$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            defpackage.ny3.f = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "REMOVE_FROZEN"
            r2 = 9
            r0.<init>(r1, r2)
            defpackage.ny3.g = r0
            return
    }

    public ny3(int r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            int r3 = r2 + (-1)
            r1.c = r3
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r2)
            r1.d = r0
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            java.lang.String r0 = "Check failed."
            if (r3 > r1) goto L23
            r1 = r2 & r3
            if (r1 != 0) goto L1e
            return
        L1e:
            defpackage.i.m(r0)
            r1 = 0
            throw r1
        L23:
            defpackage.i.m(r0)
            r1 = 0
            throw r1
    }

    public final int a(java.lang.Object r15) {
            r14 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ny3.f
            long r3 = r0.get(r14)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L18
            r14 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r14 = r14 & r3
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 == 0) goto L4f
            r14 = 2
            return r14
        L18:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r5 = r9 + 2
            int r10 = r14.c
            r5 = r5 & r10
            r6 = r1 & r10
            if (r5 != r6) goto L31
            goto L4f
        L31:
            boolean r5 = r14.b
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            java.util.concurrent.atomic.AtomicReferenceArray r11 = r14.d
            if (r5 != 0) goto L51
            r5 = r9 & r10
            java.lang.Object r5 = r11.get(r5)
            if (r5 == 0) goto L51
            r0 = 1024(0x400, float:1.435E-42)
            int r2 = r14.a
            if (r2 < r0) goto L4f
            int r9 = r9 - r1
            r0 = r9 & r6
            int r1 = r2 >> 1
            if (r0 <= r1) goto L0
        L4f:
            r14 = 1
            return r14
        L51:
            int r1 = r9 + 1
            r1 = r1 & r6
            r5 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r5 = r5 & r3
            long r12 = (long) r1
            long r1 = r12 << r2
            long r5 = r5 | r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.ny3.f
            r2 = r14
            boolean r14 = r1.compareAndSet(r2, r3, r5)
            if (r14 == 0) goto L98
            r14 = r9 & r10
            r11.set(r14, r15)
            r14 = r2
        L6d:
            long r1 = r0.get(r14)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L96
            ny3 r14 = r14.d()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r14.d
            int r2 = r14.c
            r2 = r2 & r9
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof defpackage.my3
            if (r4 == 0) goto L93
            my3 r3 = (defpackage.my3) r3
            int r3 = r3.a
            if (r3 != r9) goto L93
            r1.set(r2, r15)
            goto L94
        L93:
            r14 = 0
        L94:
            if (r14 != 0) goto L6d
        L96:
            r14 = 0
            return r14
        L98:
            r14 = r2
            goto L0
    }

    public final defpackage.ny3 b(long r10) {
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ny3.e
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.ny3.h
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            ny3 r0 = (defpackage.ny3) r0
            if (r0 == 0) goto L12
            return r0
        L12:
            ny3 r8 = new ny3
            int r0 = r9.a
            int r0 = r0 * 2
            boolean r3 = r9.b
            r8.<init>(r0, r3)
            r3 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r3 = r3 & r10
            int r0 = (int) r3
            r3 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r10
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
        L2c:
            int r4 = r9.c
            r5 = r0 & r4
            r4 = r4 & r3
            if (r5 == r4) goto L4b
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r9.d
            java.lang.Object r4 = r4.get(r5)
            if (r4 != 0) goto L40
            my3 r4 = new my3
            r4.<init>(r0)
        L40:
            int r5 = r8.c
            r5 = r5 & r0
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r8.d
            r6.set(r5, r4)
            int r0 = r0 + 1
            goto L2c
        L4b:
            r3 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r3 = r3 & r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ny3.f
            r0.set(r8, r3)
        L56:
            sun.misc.Unsafe r3 = defpackage.v36.a
            long r5 = defpackage.ny3.h
            r7 = 0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L63
            goto L69
        L63:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == 0) goto L6b
        L69:
            r9 = r4
            goto L0
        L6b:
            r9 = r4
            goto L56
    }

    public final boolean c() {
            r12 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ny3.f
            long r2 = r0.get(r12)
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r6 = r2 & r4
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r6 = 1
            if (r1 == 0) goto L12
            return r6
        L12:
            r10 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r10 = r10 & r2
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L1b
            r12 = 0
            return r12
        L1b:
            long r4 = r4 | r2
            r1 = r12
            boolean r12 = r0.compareAndSet(r1, r2, r4)
            if (r12 == 0) goto L24
            return r6
        L24:
            r12 = r1
            goto L0
    }

    public final defpackage.ny3 d() {
            r10 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ny3.f
            long r2 = r0.get(r10)
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r6 = r2 & r4
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L12
            r1 = r10
            goto L1b
        L12:
            long r4 = r4 | r2
            r1 = r10
            boolean r10 = r0.compareAndSet(r1, r2, r4)
            if (r10 == 0) goto L20
            r2 = r4
        L1b:
            ny3 r10 = r1.b(r2)
            return r10
        L20:
            r10 = r1
            goto L0
    }

    public final java.lang.Object e() {
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.ny3.f
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            gr1 r0 = defpackage.ny3.g
            return r0
        L15:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r13 = 30
            long r4 = r4 >> r13
            int r4 = (int) r4
            int r5 = r1.c
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.d
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.b
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof defpackage.my3
            if (r7 == 0) goto L42
        L41:
            return r14
        L42:
            int r0 = r0 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r7
            r7 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r7
            r20 = r7
            long r7 = (long) r0
            long r18 = r18 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ny3.f
            r28 = r18
            r18 = r4
            r19 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L66
            r15.set(r13, r14)
            return r18
        L66:
            r1 = r30
            if (r19 == 0) goto L2
        L6a:
            long r24 = r6.get(r1)
            long r2 = r24 & r11
            int r0 = (int) r2
            long r2 = r24 & r16
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L7d
            ny3 r0 = r1.d()
            r1 = r0
            goto L96
        L7d:
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = defpackage.ny3.f
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto L99
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.d
            int r2 = r2.c
            r0 = r0 & r2
            r1.set(r0, r14)
            r1 = r14
        L96:
            if (r1 != 0) goto L6a
            return r18
        L99:
            r1 = r2
            goto L6a
    }
}
