package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rh7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rh7 implements java.lang.Runnable {
    public final defpackage.p87 A;
    public final defpackage.fz B;
    public final int L;
    public final java.lang.Runnable R;

    public rh7(defpackage.p87 r1, defpackage.fz r2, int r3, java.lang.Runnable r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            p87 r0 = r7.A
            java.lang.Object r1 = r0.f
            i36 r1 = (defpackage.i36) r1
            fz r2 = r7.B
            int r3 = r7.L
            java.lang.Runnable r7 = r7.R
            java.lang.Object r4 = r0.c     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            i36 r4 = (defpackage.i36) r4     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            r4.getClass()     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            j97 r5 = new j97     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            r6 = 3
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            r1.n(r5)     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            java.lang.Object r4 = r0.a     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            android.content.Context r4 = (android.content.Context) r4     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            java.lang.String r5 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r5)     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            if (r4 == 0) goto L3a
            boolean r4 = r4.isConnected()     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            if (r4 == 0) goto L3a
            r0.p(r2, r3)     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            goto L44
        L38:
            r0 = move-exception
            goto L56
        L3a:
            ei r4 = new ei     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            r5 = 9
            r4.<init>(r0, r3, r5, r2)     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
            r1.n(r4)     // Catch: java.lang.Throwable -> L38 defpackage.cx6 -> L48
        L44:
            r7.run()
            return
        L48:
            java.lang.Object r0 = r0.d     // Catch: java.lang.Throwable -> L38
            bt r0 = (defpackage.bt) r0     // Catch: java.lang.Throwable -> L38
            int r3 = r3 + 1
            r1 = 0
            r0.U(r2, r3, r1)     // Catch: java.lang.Throwable -> L38
            r7.run()
            return
        L56:
            r7.run()
            throw r0
    }
}
