package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class NonGmsServiceBrokerClient implements com.google.android.gms.common.api.Api.Client, android.content.ServiceConnection {
    private static final java.lang.String zaa = "NonGmsServiceBrokerClient";
    private final java.lang.String zab;
    private final java.lang.String zac;
    private final android.content.ComponentName zad;
    private final android.content.Context zae;
    private final com.google.android.gms.common.api.internal.ConnectionCallbacks zaf;
    private final android.os.Handler zag;
    private final com.google.android.gms.common.api.internal.OnConnectionFailedListener zah;
    private android.os.IBinder zai;
    private boolean zaj;
    private java.lang.String zak;
    private java.lang.String zal;

    public NonGmsServiceBrokerClient(android.content.Context r9, android.os.Looper r10, android.content.ComponentName r11, com.google.android.gms.common.api.internal.ConnectionCallbacks r12, com.google.android.gms.common.api.internal.OnConnectionFailedListener r13) {
            r8 = this;
            r3 = 0
            r4 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private NonGmsServiceBrokerClient(android.content.Context r2, android.os.Looper r3, java.lang.String r4, java.lang.String r5, android.content.ComponentName r6, com.google.android.gms.common.api.internal.ConnectionCallbacks r7, com.google.android.gms.common.api.internal.OnConnectionFailedListener r8) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zaj = r0
            r0 = 0
            r1.zak = r0
            r1.zae = r2
            b08 r2 = new b08
            r2.<init>(r3)
            r1.zag = r2
            r1.zaf = r7
            r1.zah = r8
            if (r4 == 0) goto L1e
            if (r5 == 0) goto L1e
            if (r6 != 0) goto L27
            r6 = r0
            goto L20
        L1e:
            if (r6 == 0) goto L27
        L20:
            r1.zab = r4
            r1.zac = r5
            r1.zad = r6
            return
        L27:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "Must specify either package or component, but not both"
            r1.<init>(r2)
            throw r1
    }

    public NonGmsServiceBrokerClient(android.content.Context r9, android.os.Looper r10, java.lang.String r11, java.lang.String r12, com.google.android.gms.common.api.internal.ConnectionCallbacks r13, com.google.android.gms.common.api.internal.OnConnectionFailedListener r14) {
            r8 = this;
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private final void zad() {
            r1 = this;
            android.os.Handler r1 = r1.zag
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = r1.getLooper()
            java.lang.Thread r1 = r1.getThread()
            if (r0 != r1) goto L11
            return
        L11:
            java.lang.String r1 = "This method should only run on the NonGmsServiceBrokerClient's handler thread."
            defpackage.i.m(r1)
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks r4) {
            r3 = this;
            r3.zad()
            android.os.IBinder r4 = r3.zai
            java.lang.String.valueOf(r4)
            boolean r4 = r3.isConnected()
            if (r4 == 0) goto L13
            java.lang.String r4 = "connect() called when already connected"
            r3.disconnect(r4)     // Catch: java.lang.Exception -> L13
        L13:
            r4 = 0
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.SecurityException -> L21
            r0.<init>()     // Catch: java.lang.SecurityException -> L21
            android.content.ComponentName r1 = r3.zad     // Catch: java.lang.SecurityException -> L21
            if (r1 == 0) goto L23
            r0.setComponent(r1)     // Catch: java.lang.SecurityException -> L21
            goto L2e
        L21:
            r0 = move-exception
            goto L50
        L23:
            java.lang.String r1 = r3.zab     // Catch: java.lang.SecurityException -> L21
            android.content.Intent r1 = r0.setPackage(r1)     // Catch: java.lang.SecurityException -> L21
            java.lang.String r2 = r3.zac     // Catch: java.lang.SecurityException -> L21
            r1.setAction(r2)     // Catch: java.lang.SecurityException -> L21
        L2e:
            android.content.Context r1 = r3.zae     // Catch: java.lang.SecurityException -> L21
            int r2 = com.google.android.gms.common.internal.GmsClientSupervisor.getDefaultBindFlags()     // Catch: java.lang.SecurityException -> L21
            boolean r0 = r1.bindService(r0, r3, r2)     // Catch: java.lang.SecurityException -> L21
            r3.zaj = r0     // Catch: java.lang.SecurityException -> L21
            if (r0 != 0) goto L4a
            r3.zai = r4
            com.google.android.gms.common.api.internal.OnConnectionFailedListener r4 = r3.zah
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 16
            r0.<init>(r1)
            r4.onConnectionFailed(r0)
        L4a:
            android.os.IBinder r3 = r3.zai
            java.lang.String.valueOf(r3)
            return
        L50:
            r1 = 0
            r3.zaj = r1
            r3.zai = r4
            throw r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
            r1 = this;
            r1.zad()
            android.os.IBinder r0 = r1.zai
            java.lang.String.valueOf(r0)
            android.content.Context r0 = r1.zae     // Catch: java.lang.IllegalArgumentException -> Ld
            r0.unbindService(r1)     // Catch: java.lang.IllegalArgumentException -> Ld
        Ld:
            r0 = 0
            r1.zaj = r0
            r0 = 0
            r1.zai = r0
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void disconnect(java.lang.String r1) {
            r0 = this;
            r0.zad()
            r0.zak = r1
            r0.disconnect()
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void dump(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final com.google.android.gms.common.Feature[] getAvailableFeatures() {
            r0 = this;
            r0 = 0
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            return r0
    }

    public android.os.IBinder getBinder() {
            r0 = this;
            r0.zad()
            android.os.IBinder r0 = r0.zai
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final java.lang.String getEndpointPackageName() {
            r1 = this;
            java.lang.String r0 = r1.zab
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.ComponentName r0 = r1.zad
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.content.ComponentName r1 = r1.zad
            java.lang.String r1 = r1.getPackageName()
            return r1
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final java.lang.String getLastDisconnectMessage() {
            r0 = this;
            java.lang.String r0 = r0.zak
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor r1, java.util.Set<com.google.android.gms.common.api.Scope> r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final com.google.android.gms.common.Feature[] getRequiredFeatures() {
            r0 = this;
            r0 = 0
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final java.util.Set<com.google.android.gms.common.api.Scope> getScopesForConnectionlessNonSignIn() {
            r0 = this;
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final android.os.IBinder getServiceBrokerBinder() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final android.content.Intent getSignInIntent() {
            r0 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean isConnected() {
            r0 = this;
            r0.zad()
            android.os.IBinder r0 = r0.zai
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean isConnecting() {
            r0 = this;
            r0.zad()
            boolean r0 = r0.zaj
            return r0
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
            r0 = this;
            com.google.android.gms.common.api.internal.zacg r1 = new com.google.android.gms.common.api.internal.zacg
            r1.<init>(r0, r2)
            android.os.Handler r0 = r0.zag
            r0.post(r1)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.zacf r1 = new com.google.android.gms.common.api.internal.zacf
            r1.<init>(r0)
            android.os.Handler r0 = r0.zag
            r0.post(r1)
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final /* synthetic */ void zaa(android.os.IBinder r2) {
            r1 = this;
            r0 = 0
            r1.zaj = r0
            r1.zai = r2
            java.lang.String.valueOf(r2)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            com.google.android.gms.common.api.internal.ConnectionCallbacks r1 = r1.zaf
            r1.onConnected(r2)
            return
    }

    public final /* synthetic */ void zab() {
            r1 = this;
            r0 = 0
            r1.zaj = r0
            r0 = 0
            r1.zai = r0
            com.google.android.gms.common.api.internal.ConnectionCallbacks r1 = r1.zaf
            r0 = 1
            r1.onConnectionSuspended(r0)
            return
    }

    public final void zac(java.lang.String r1) {
            r0 = this;
            r0.zal = r1
            return
    }
}
