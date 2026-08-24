package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: if4  reason: default package */
/* loaded from: classes.dex */
public final class if4 extends defpackage.a21 {
    public final android.net.ConnectivityManager g;
    public final java.lang.Object h;
    public volatile boolean i;
    public final defpackage.c53 j;

    public if4(android.content.Context r1, defpackage.ow7 r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.Object r1 = r0.c
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r2 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r2)
            r1.getClass()
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r0.g = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.h = r1
            c53 r1 = new c53
            r2 = 2
            r1.<init>(r0, r2)
            r0.j = r1
            return
    }

    @Override // defpackage.a21
    public final java.lang.Object d() {
            r1 = this;
            android.net.ConnectivityManager r0 = r1.g
            boolean r1 = r1.i
            gf4 r1 = defpackage.hf4.a(r0, r1)
            return r1
    }

    @Override // defpackage.a21
    public final void g() {
            r4 = this;
            java.lang.String r0 = "Received exception while registering network callback"
            ga0 r1 = defpackage.ga0.f()     // Catch: java.lang.SecurityException -> L1b java.lang.IllegalArgumentException -> L1d
            java.lang.String r2 = defpackage.hf4.a     // Catch: java.lang.SecurityException -> L1b java.lang.IllegalArgumentException -> L1d
            java.lang.String r3 = "Registering network callback"
            r1.b(r2, r3)     // Catch: java.lang.SecurityException -> L1b java.lang.IllegalArgumentException -> L1d
            android.net.ConnectivityManager r1 = r4.g     // Catch: java.lang.SecurityException -> L1b java.lang.IllegalArgumentException -> L1d
            c53 r4 = r4.j     // Catch: java.lang.SecurityException -> L1b java.lang.IllegalArgumentException -> L1d
            r1.getClass()     // Catch: java.lang.SecurityException -> L1b java.lang.IllegalArgumentException -> L1d
            r4.getClass()     // Catch: java.lang.SecurityException -> L1b java.lang.IllegalArgumentException -> L1d
            r1.registerDefaultNetworkCallback(r4)     // Catch: java.lang.SecurityException -> L1b java.lang.IllegalArgumentException -> L1d
            return
        L1b:
            r4 = move-exception
            goto L1f
        L1d:
            r4 = move-exception
            goto L29
        L1f:
            ga0 r1 = defpackage.ga0.f()
            java.lang.String r2 = defpackage.hf4.a
            r1.e(r2, r0, r4)
            goto L32
        L29:
            ga0 r1 = defpackage.ga0.f()
            java.lang.String r2 = defpackage.hf4.a
            r1.e(r2, r0, r4)
        L32:
            return
    }

    @Override // defpackage.a21
    public final void h() {
            r4 = this;
            java.lang.String r0 = "Received exception while unregistering network callback"
            ga0 r1 = defpackage.ga0.f()     // Catch: java.lang.SecurityException -> L15 java.lang.IllegalArgumentException -> L17
            java.lang.String r2 = defpackage.hf4.a     // Catch: java.lang.SecurityException -> L15 java.lang.IllegalArgumentException -> L17
            java.lang.String r3 = "Unregistering network callback"
            r1.b(r2, r3)     // Catch: java.lang.SecurityException -> L15 java.lang.IllegalArgumentException -> L17
            android.net.ConnectivityManager r1 = r4.g     // Catch: java.lang.SecurityException -> L15 java.lang.IllegalArgumentException -> L17
            c53 r4 = r4.j     // Catch: java.lang.SecurityException -> L15 java.lang.IllegalArgumentException -> L17
            r1.unregisterNetworkCallback(r4)     // Catch: java.lang.SecurityException -> L15 java.lang.IllegalArgumentException -> L17
            return
        L15:
            r4 = move-exception
            goto L19
        L17:
            r4 = move-exception
            goto L23
        L19:
            ga0 r1 = defpackage.ga0.f()
            java.lang.String r2 = defpackage.hf4.a
            r1.e(r2, r0, r4)
            goto L2c
        L23:
            ga0 r1 = defpackage.ga0.f()
            java.lang.String r2 = defpackage.hf4.a
            r1.e(r2, r0, r4)
        L2c:
            return
    }
}
