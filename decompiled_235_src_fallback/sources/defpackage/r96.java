package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r96  reason: default package */
/* loaded from: classes.dex */
public abstract class r96 {
    public static final defpackage.o96 a = null;
    public static final int b = 0;
    public static final java.util.concurrent.atomic.AtomicReference[] c = null;

    static {
            o96 r0 = new o96
            r6 = 0
            byte[] r1 = new byte[r6]
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            defpackage.r96.a = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r0 = r0 * 2
            int r0 = r0 + (-1)
            int r0 = java.lang.Integer.highestOneBit(r0)
            defpackage.r96.b = r0
            java.util.concurrent.atomic.AtomicReference[] r1 = new java.util.concurrent.atomic.AtomicReference[r0]
        L22:
            if (r6 >= r0) goto L2e
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1[r6] = r2
            int r6 = r6 + 1
            goto L22
        L2e:
            defpackage.r96.c = r1
            return
    }

    public static final void a(defpackage.o96 r6) {
            r6.getClass()
            o96 r0 = r6.f
            if (r0 != 0) goto L4a
            o96 r0 = r6.g
            if (r0 != 0) goto L4a
            boolean r0 = r6.d
            if (r0 == 0) goto L10
            goto L2e
        L10:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            int r2 = defpackage.r96.b
            long r2 = (long) r2
            r4 = 1
            long r2 = r2 - r4
            long r0 = r0 & r2
            int r0 = (int) r0
            java.util.concurrent.atomic.AtomicReference[] r1 = defpackage.r96.c
            r0 = r1[r0]
            o96 r1 = defpackage.r96.a
            java.lang.Object r2 = r0.getAndSet(r1)
            o96 r2 = (defpackage.o96) r2
            if (r2 != r1) goto L2f
        L2e:
            return
        L2f:
            r1 = 0
            if (r2 == 0) goto L35
            int r3 = r2.c
            goto L36
        L35:
            r3 = r1
        L36:
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r3 < r4) goto L3e
            r0.set(r2)
            return
        L3e:
            r6.f = r2
            r6.b = r1
            int r3 = r3 + 8192
            r6.c = r3
            r0.set(r6)
            return
        L4a:
            java.lang.String r6 = "Failed requirement."
            defpackage.i.h(r6)
            return
    }

    public static final defpackage.o96 b() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            int r2 = defpackage.r96.b
            long r2 = (long) r2
            r4 = 1
            long r2 = r2 - r4
            long r0 = r0 & r2
            int r0 = (int) r0
            java.util.concurrent.atomic.AtomicReference[] r1 = defpackage.r96.c
            r0 = r1[r0]
            o96 r1 = defpackage.r96.a
            java.lang.Object r2 = r0.getAndSet(r1)
            o96 r2 = (defpackage.o96) r2
            if (r2 != r1) goto L24
            o96 r0 = new o96
            r0.<init>()
            return r0
        L24:
            r1 = 0
            if (r2 != 0) goto L30
            r0.set(r1)
            o96 r0 = new o96
            r0.<init>()
            return r0
        L30:
            o96 r3 = r2.f
            r0.set(r3)
            r2.f = r1
            r0 = 0
            r2.c = r0
            return r2
    }
}
