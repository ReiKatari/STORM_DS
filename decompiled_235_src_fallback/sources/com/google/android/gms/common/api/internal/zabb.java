package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zabb implements com.google.android.gms.common.api.ResultCallback {
    final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zaa;
    final /* synthetic */ boolean zab;
    final /* synthetic */ com.google.android.gms.common.api.GoogleApiClient zac;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabe zad;

    public zabb(com.google.android.gms.common.api.internal.zabe r1, com.google.android.gms.common.api.internal.StatusPendingResult r2, boolean r3, com.google.android.gms.common.api.GoogleApiClient r4) {
            r0 = this;
            r0.zad = r1
            r0.zaa = r2
            r0.zab = r3
            r0.zac = r4
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(com.google.android.gms.common.api.Result r4) {
            r3 = this;
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            com.google.android.gms.common.api.internal.zabe r0 = r3.zad
            android.content.Context r0 = com.google.android.gms.common.api.internal.zabe.zae(r0)
            br6 r0 = defpackage.br6.a(r0)
            java.lang.String r1 = "defaultGoogleSignInAccount"
            java.lang.String r2 = r0.b(r1)
            r0.c(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L1c
            goto L2e
        L1c:
            java.lang.String r1 = "googleSignInAccount"
            java.lang.String r1 = defpackage.br6.d(r1, r2)
            r0.c(r1)
            java.lang.String r1 = "googleSignInOptions"
            java.lang.String r1 = defpackage.br6.d(r1, r2)
            r0.c(r1)
        L2e:
            boolean r0 = r4.isSuccess()
            if (r0 == 0) goto L44
            com.google.android.gms.common.api.internal.zabe r0 = r3.zad
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L44
            com.google.android.gms.common.api.internal.zabe r0 = r3.zad
            r0.disconnect()
            r0.connect()
        L44:
            com.google.android.gms.common.api.internal.StatusPendingResult r0 = r3.zaa
            r0.setResult(r4)
            boolean r4 = r3.zab
            if (r4 == 0) goto L52
            com.google.android.gms.common.api.GoogleApiClient r3 = r3.zac
            r3.disconnect()
        L52:
            return
    }
}
