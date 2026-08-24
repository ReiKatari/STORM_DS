package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rs1  reason: default package */
/* loaded from: classes.dex */
public final class rs1 extends defpackage.hv {
    public final /* synthetic */ defpackage.ss1 p;

    public rs1(defpackage.ss1 r1) {
            r0 = this;
            r0.<init>()
            r0.p = r1
            return
    }

    @Override // defpackage.hv
    public final void O(java.lang.Throwable r1) {
            r0 = this;
            ss1 r0 = r0.p
            ws1 r0 = r0.a
            r0.f(r1)
            return
    }

    @Override // defpackage.hv
    public final void P(defpackage.eb r6) {
            r5 = this;
            ss1 r5 = r5.p
            r5.c = r6
            bt r6 = new bt
            eb r0 = r5.c
            ws1 r1 = r5.a
            x31 r2 = r1.g
            ae1 r1 = r1.i
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r3 < r4) goto L19
            java.util.Set r3 = defpackage.bt1.a()
            goto L1d
        L19:
            java.util.Set r3 = defpackage.nc1.O()
        L1d:
            r6.<init>(r0, r2, r1, r3)
            r5.b = r6
            ws1 r5 = r5.a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            r0 = 1
            r5.c = r0     // Catch: java.lang.Throwable -> L56
            zu r0 = r5.b     // Catch: java.lang.Throwable -> L56
            r6.addAll(r0)     // Catch: java.lang.Throwable -> L56
            zu r0 = r5.b     // Catch: java.lang.Throwable -> L56
            r0.clear()     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            android.os.Handler r0 = r5.d
            ub0 r1 = new ub0
            int r5 = r5.c
            r2 = 0
            r1.<init>(r6, r5, r2)
            r0.post(r1)
            return
        L56:
            r6 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r5.a
            java.util.concurrent.locks.Lock r5 = r5.writeLock()
            r5.unlock()
            throw r6
    }
}
