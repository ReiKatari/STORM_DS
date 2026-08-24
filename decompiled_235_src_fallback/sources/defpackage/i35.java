package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i35  reason: default package */
/* loaded from: classes.dex */
public final class i35 {
    public static final java.util.HashMap e = null;
    public final boolean a;
    public final java.io.File b;
    public final java.util.concurrent.locks.Lock c;
    public java.nio.channels.FileChannel d;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            defpackage.i35.e = r0
            return
    }

    public i35(java.io.File r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r1.a = r4
            if (r2 == 0) goto L13
            java.io.File r4 = new java.io.File
            java.lang.String r0 = ".lck"
            java.lang.String r0 = r3.concat(r0)
            r4.<init>(r2, r0)
            goto L14
        L13:
            r4 = 0
        L14:
            r1.b = r4
            java.util.HashMap r2 = defpackage.i35.e
            monitor-enter(r2)
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto L2a
            java.util.concurrent.locks.ReentrantLock r4 = new java.util.concurrent.locks.ReentrantLock     // Catch: java.lang.Throwable -> L28
            r4.<init>()     // Catch: java.lang.Throwable -> L28
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r1 = move-exception
            goto L30
        L2a:
            java.util.concurrent.locks.Lock r4 = (java.util.concurrent.locks.Lock) r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r2)
            r1.c = r4
            return
        L30:
            monitor-exit(r2)
            throw r1
    }

    public final void a(boolean r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.c
            r0.lock()
            if (r2 == 0) goto L38
            java.io.File r2 = r1.b
            if (r2 == 0) goto L26
            java.io.File r0 = r2.getParentFile()     // Catch: java.io.IOException -> L15
            if (r0 == 0) goto L17
            r0.mkdirs()     // Catch: java.io.IOException -> L15
            goto L17
        L15:
            r2 = move-exception
            goto L2e
        L17:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L15
            r0.<init>(r2)     // Catch: java.io.IOException -> L15
            java.nio.channels.FileChannel r2 = r0.getChannel()     // Catch: java.io.IOException -> L15
            r2.lock()     // Catch: java.io.IOException -> L15
            r1.d = r2     // Catch: java.io.IOException -> L15
            return
        L26:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.io.IOException -> L15
            java.lang.String r0 = "No lock directory was provided."
            r2.<init>(r0)     // Catch: java.io.IOException -> L15
            throw r2     // Catch: java.io.IOException -> L15
        L2e:
            r0 = 0
            r1.d = r0
            java.lang.String r1 = "SupportSQLiteLock"
            java.lang.String r0 = "Unable to grab file lock."
            android.util.Log.w(r1, r0, r2)
        L38:
            return
    }

    public final void b() {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.d     // Catch: java.io.IOException -> L7
            if (r0 == 0) goto L7
            r0.close()     // Catch: java.io.IOException -> L7
        L7:
            java.util.concurrent.locks.Lock r1 = r1.c
            r1.unlock()
            return
    }
}
