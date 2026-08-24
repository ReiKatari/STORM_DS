package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pw  reason: default package */
/* loaded from: classes.dex */
public class pw extends defpackage.b67 {
    public static final defpackage.zb h = null;
    public static defpackage.pw i;
    public static final java.util.concurrent.locks.ReentrantLock j = null;
    public static final java.util.concurrent.locks.Condition k = null;
    public static final long l = 0;
    public static final long m = 0;
    public int e;
    public int f;
    public long g;

    static {
            zb r0 = new zb
            r1 = 11
            r2 = 0
            r0.<init>(r2, r1)
            r1 = 8
            pw[] r1 = new defpackage.pw[r1]
            r0.L = r1
            defpackage.pw.h = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            defpackage.pw.j = r0
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            r0.getClass()
            defpackage.pw.k = r0
            r0 = 60000(0xea60, double:2.9644E-319)
            defpackage.pw.l = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r2.toNanos(r0)
            defpackage.pw.m = r0
            return
    }

    public pw() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f = r0
            return
    }

    public final void i() {
            r5 = this;
            long r0 = r5.c
            boolean r2 = r5.a
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto Ld
            if (r2 != 0) goto Ld
            return
        Ld:
            java.util.concurrent.locks.ReentrantLock r0 = defpackage.pw.j
            r0.lock()
            int r1 = r5.e     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L22
            r1 = 1
            r5.e = r1     // Catch: java.lang.Throwable -> L20
            defpackage.cs1.n(r5)     // Catch: java.lang.Throwable -> L20
            r0.unlock()
            return
        L20:
            r5 = move-exception
            goto L2a
        L22:
            java.lang.String r5 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L20
        L2a:
            r0.unlock()
            throw r5
    }

    public final boolean j() {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = defpackage.pw.j
            r0.lock()
            int r1 = r4.e     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r4.e = r2     // Catch: java.lang.Throwable -> L16
            r3 = 1
            if (r1 != r3) goto L18
            zb r1 = defpackage.pw.h     // Catch: java.lang.Throwable -> L16
            r1.u(r4)     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            return r2
        L16:
            r4 = move-exception
            goto L20
        L18:
            r4 = 2
            if (r1 != r4) goto L1c
            r2 = r3
        L1c:
            r0.unlock()
            return r2
        L20:
            r0.unlock()
            throw r4
    }

    public java.io.IOException k(java.io.IOException r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public void l() {
            r0 = this;
            return
    }
}
