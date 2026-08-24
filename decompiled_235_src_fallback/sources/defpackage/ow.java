package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ow  reason: default package */
/* loaded from: classes.dex */
public final class ow extends java.lang.Thread {
    public final /* synthetic */ int A;

    public /* synthetic */ ow(java.lang.Runnable r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>(r2)
            return
    }

    public /* synthetic */ ow(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>(r2)
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            super.run()
            return
        Le:
            zb r2 = defpackage.pw.h     // Catch: java.lang.InterruptedException -> Le
            java.util.concurrent.locks.ReentrantLock r2 = defpackage.pw.j     // Catch: java.lang.InterruptedException -> Le
            r2.lock()     // Catch: java.lang.InterruptedException -> Le
            pw r0 = defpackage.cs1.o()     // Catch: java.lang.Throwable -> L24
            pw r1 = defpackage.pw.i     // Catch: java.lang.Throwable -> L24
            if (r0 != r1) goto L26
            r0 = 0
            defpackage.pw.i = r0     // Catch: java.lang.Throwable -> L24
            r2.unlock()     // Catch: java.lang.InterruptedException -> Le
            return
        L24:
            r0 = move-exception
            goto L2f
        L26:
            r2.unlock()     // Catch: java.lang.InterruptedException -> Le
            if (r0 == 0) goto Le
            r0.l()     // Catch: java.lang.InterruptedException -> Le
            goto Le
        L2f:
            r2.unlock()     // Catch: java.lang.InterruptedException -> Le
            throw r0     // Catch: java.lang.InterruptedException -> Le
    }
}
