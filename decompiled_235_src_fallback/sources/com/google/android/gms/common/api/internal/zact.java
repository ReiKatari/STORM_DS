package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zact extends defpackage.jz7 implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zaa = null;
    private final android.content.Context zab;
    private final android.os.Handler zac;
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder zad;
    private final java.util.Set zae;
    private final com.google.android.gms.common.internal.ClientSettings zaf;
    private defpackage.oz7 zag;
    private com.google.android.gms.common.api.internal.zacs zah;

    static {
            ez7 r0 = defpackage.lz7.a
            com.google.android.gms.common.api.internal.zact.zaa = r0
            return
    }

    public zact(android.content.Context r2, android.os.Handler r3, com.google.android.gms.common.internal.ClientSettings r4) {
            r1 = this;
            com.google.android.gms.common.api.Api$AbstractClientBuilder r0 = com.google.android.gms.common.api.internal.zact.zaa
            r1.<init>()
            r1.zab = r2
            r1.zac = r3
            java.lang.String r2 = "ClientSettings must not be null"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r2)
            com.google.android.gms.common.internal.ClientSettings r2 = (com.google.android.gms.common.internal.ClientSettings) r2
            r1.zaf = r2
            java.util.Set r2 = r4.getRequiredScopes()
            r1.zae = r2
            r1.zad = r0
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zacs zac(com.google.android.gms.common.api.internal.zact r0) {
            com.google.android.gms.common.api.internal.zacs r0 = r0.zah
            return r0
    }

    public static void zad(com.google.android.gms.common.api.internal.zact r4, defpackage.xz7 r5) {
            com.google.android.gms.common.ConnectionResult r0 = r5.B
            boolean r1 = r0.isSuccess()
            if (r1 == 0) goto L45
            com.google.android.gms.common.internal.zav r5 = r5.L
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.internal.zav r5 = (com.google.android.gms.common.internal.zav) r5
            com.google.android.gms.common.ConnectionResult r0 = r5.zaa()
            boolean r1 = r0.isSuccess()
            if (r1 != 0) goto L39
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r2 = "SignInCoordinator"
            java.lang.String r3 = "Sign-in succeeded with resolve account failure: "
            java.lang.String r5 = r3.concat(r5)
            android.util.Log.wtf(r2, r5, r1)
            com.google.android.gms.common.api.internal.zacs r5 = r4.zah
            r5.zae(r0)
            oz7 r4 = r4.zag
            r4.disconnect()
            return
        L39:
            com.google.android.gms.common.api.internal.zacs r0 = r4.zah
            com.google.android.gms.common.internal.IAccountAccessor r5 = r5.zab()
            java.util.Set r1 = r4.zae
            r0.zaf(r5, r1)
            goto L4a
        L45:
            com.google.android.gms.common.api.internal.zacs r5 = r4.zah
            r5.zae(r0)
        L4a:
            oz7 r4 = r4.zag
            r4.disconnect()
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle r1) {
            r0 = this;
            oz7 r1 = r0.zag
            r1.b(r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.zacs r0 = r0.zah
            r0.zae(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.zacs r0 = r0.zah
            r0.zag(r1)
            return
    }

    @Override // defpackage.mz7
    public final void zab(defpackage.xz7 r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zacr r0 = new com.google.android.gms.common.api.internal.zacr
            r0.<init>(r1, r2)
            android.os.Handler r1 = r1.zac
            r1.post(r0)
            return
    }

    public final void zae(com.google.android.gms.common.api.internal.zacs r10) {
            r9 = this;
            oz7 r0 = r9.zag
            if (r0 == 0) goto L7
            r0.disconnect()
        L7:
            com.google.android.gms.common.internal.ClientSettings r0 = r9.zaf
            int r1 = java.lang.System.identityHashCode(r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zae(r1)
            com.google.android.gms.common.api.Api$AbstractClientBuilder r2 = r9.zad
            android.content.Context r3 = r9.zab
            android.os.Handler r0 = r9.zac
            com.google.android.gms.common.internal.ClientSettings r5 = r9.zaf
            android.os.Looper r4 = r0.getLooper()
            bi6 r6 = r5.zaa()
            r8 = r9
            r7 = r9
            com.google.android.gms.common.api.Api$Client r9 = r2.buildClient(r3, r4, r5, r6, r7, r8)
            r7.zag = r9
            r7.zah = r10
            java.util.Set r9 = r7.zae
            if (r9 == 0) goto L3f
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L39
            goto L3f
        L39:
            oz7 r9 = r7.zag
            r9.zab()
            return
        L3f:
            android.os.Handler r9 = r7.zac
            com.google.android.gms.common.api.internal.zacq r10 = new com.google.android.gms.common.api.internal.zacq
            r10.<init>(r7)
            r9.post(r10)
            return
    }

    public final void zaf() {
            r0 = this;
            oz7 r0 = r0.zag
            if (r0 == 0) goto L7
            r0.disconnect()
        L7:
            return
    }
}
