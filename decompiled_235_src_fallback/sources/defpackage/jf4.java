package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jf4  reason: default package */
/* loaded from: classes.dex */
public final class jf4 {
    public final android.content.Context a;

    public jf4(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean a() {
            r1 = this;
            android.content.Context r1 = r1.a
            java.lang.Class<android.net.ConnectivityManager> r0 = android.net.ConnectivityManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            if (r1 != 0) goto Ld
            goto L13
        Ld:
            android.net.Network r0 = r1.getActiveNetwork()
            if (r0 != 0) goto L15
        L13:
            r1 = 0
            goto L19
        L15:
            android.net.NetworkCapabilities r1 = r1.getNetworkCapabilities(r0)
        L19:
            if (r1 != 0) goto L1d
            r1 = 0
            return r1
        L1d:
            r0 = 12
            boolean r1 = r1.hasCapability(r0)
            return r1
    }

    public final boolean b() {
            r1 = this;
            android.content.Context r1 = r1.a
            java.lang.Class<android.net.ConnectivityManager> r0 = android.net.ConnectivityManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            if (r1 != 0) goto Ld
            goto L13
        Ld:
            android.net.Network r0 = r1.getActiveNetwork()
            if (r0 != 0) goto L15
        L13:
            r1 = 0
            goto L19
        L15:
            android.net.NetworkCapabilities r1 = r1.getNetworkCapabilities(r0)
        L19:
            if (r1 != 0) goto L1c
            goto L2e
        L1c:
            r0 = 12
            boolean r0 = r1.hasCapability(r0)
            if (r0 == 0) goto L2e
            r0 = 16
            boolean r1 = r1.hasCapability(r0)
            if (r1 == 0) goto L2e
            r1 = 1
            return r1
        L2e:
            r1 = 0
            return r1
    }
}
