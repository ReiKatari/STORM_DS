package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: br6  reason: default package */
/* loaded from: classes.dex */
public final class br6 {
    public static final java.util.concurrent.locks.ReentrantLock c = null;
    public static defpackage.br6 d;
    public final java.util.concurrent.locks.ReentrantLock a;
    public final android.content.SharedPreferences b;

    static {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            defpackage.br6.c = r0
            return
    }

    public br6(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.a = r0
            java.lang.String r0 = "com.google.android.gms.signin"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r2.b = r3
            return
    }

    public static defpackage.br6 a(android.content.Context r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.concurrent.locks.ReentrantLock r0 = defpackage.br6.c
            r0.lock()
            br6 r1 = defpackage.br6.d     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            br6 r1 = new br6     // Catch: java.lang.Throwable -> L18
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            defpackage.br6.d = r1     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r2 = move-exception
            goto L20
        L1a:
            br6 r2 = defpackage.br6.d     // Catch: java.lang.Throwable -> L18
            r0.unlock()
            return r2
        L20:
            r0.unlock()
            throw r2
    }

    public static final java.lang.String d(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = ":"
            java.lang.String r1 = defpackage.lb1.m(r1, r0, r2)
            return r1
    }

    public final java.lang.String b(java.lang.String r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.a
            r0.lock()
            android.content.SharedPreferences r2 = r2.b     // Catch: java.lang.Throwable -> L10
            r1 = 0
            java.lang.String r2 = r2.getString(r3, r1)     // Catch: java.lang.Throwable -> L10
            r0.unlock()
            return r2
        L10:
            r2 = move-exception
            r0.unlock()
            throw r2
    }

    public final void c(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.a
            r0.lock()
            android.content.SharedPreferences r1 = r1.b     // Catch: java.lang.Throwable -> L16
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L16
            android.content.SharedPreferences$Editor r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L16
            r1.apply()     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            return
        L16:
            r1 = move-exception
            r0.unlock()
            throw r1
    }
}
