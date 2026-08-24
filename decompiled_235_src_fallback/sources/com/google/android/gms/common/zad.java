package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zad extends defpackage.b08 {
    final /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zaa;
    private final android.content.Context zab;

    public zad(com.google.android.gms.common.GoogleApiAvailability r1, android.content.Context r2) {
            r0 = this;
            r0.zaa = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.zab = r1
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r2) {
            r1 = this;
            int r2 = r2.what
            r0 = 1
            if (r2 == r0) goto L19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Don't know how to handle this message: "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "GoogleApiAvailability"
            android.util.Log.w(r2, r1)
            return
        L19:
            com.google.android.gms.common.GoogleApiAvailability r2 = r1.zaa
            android.content.Context r0 = r1.zab
            int r0 = r2.isGooglePlayServicesAvailable(r0)
            boolean r2 = r2.isUserResolvableError(r0)
            if (r2 == 0) goto L2e
            com.google.android.gms.common.GoogleApiAvailability r2 = r1.zaa
            android.content.Context r1 = r1.zab
            r2.showErrorNotification(r1, r0)
        L2e:
            return
    }
}
