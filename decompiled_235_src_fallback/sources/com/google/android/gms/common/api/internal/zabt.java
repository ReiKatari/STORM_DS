package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zabt implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.ConnectionResult zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabu zab;

    public zabt(com.google.android.gms.common.api.internal.zabu r1, com.google.android.gms.common.ConnectionResult r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            com.google.android.gms.common.api.internal.zabu r0 = r5.zab
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r0.zaa
            java.util.Map r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zar(r1)
            com.google.android.gms.common.api.internal.ApiKey r0 = com.google.android.gms.common.api.internal.zabu.zab(r0)
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 != 0) goto L15
            return
        L15:
            com.google.android.gms.common.ConnectionResult r1 = r5.zaa
            boolean r1 = r1.isSuccess()
            r2 = 0
            if (r1 == 0) goto L64
            com.google.android.gms.common.api.internal.zabu r1 = r5.zab
            r3 = 1
            com.google.android.gms.common.api.internal.zabu.zac(r1, r3)
            com.google.android.gms.common.api.internal.zabu r1 = r5.zab
            com.google.android.gms.common.api.Api$Client r1 = com.google.android.gms.common.api.internal.zabu.zaa(r1)
            boolean r1 = r1.requiresSignIn()
            com.google.android.gms.common.api.internal.zabu r3 = r5.zab
            if (r1 == 0) goto L36
            com.google.android.gms.common.api.internal.zabu.zad(r3)
            return
        L36:
            com.google.android.gms.common.api.Api$Client r1 = com.google.android.gms.common.api.internal.zabu.zaa(r3)     // Catch: java.lang.SecurityException -> L46
            com.google.android.gms.common.api.Api$Client r3 = com.google.android.gms.common.api.internal.zabu.zaa(r3)     // Catch: java.lang.SecurityException -> L46
            java.util.Set r3 = r3.getScopesForConnectionlessNonSignIn()     // Catch: java.lang.SecurityException -> L46
            r1.getRemoteService(r2, r3)     // Catch: java.lang.SecurityException -> L46
            return
        L46:
            r1 = move-exception
            java.lang.String r3 = "GoogleApiManager"
            java.lang.String r4 = "Failed to get service from broker. "
            android.util.Log.e(r3, r4, r1)
            com.google.android.gms.common.api.internal.zabu r5 = r5.zab
            com.google.android.gms.common.api.Api$Client r5 = com.google.android.gms.common.api.internal.zabu.zaa(r5)
            java.lang.String r1 = "Failed to get service from broker."
            r5.disconnect(r1)
            com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
            r1 = 10
            r5.<init>(r1)
            r0.zar(r5, r2)
            return
        L64:
            com.google.android.gms.common.ConnectionResult r5 = r5.zaa
            r0.zar(r5, r2)
            return
    }
}
