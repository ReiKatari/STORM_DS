package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ai6  reason: default package */
/* loaded from: classes.dex */
public final class ai6 extends com.google.android.gms.common.internal.GmsClient implements defpackage.oz7 {
    public final boolean a;
    public final com.google.android.gms.common.internal.ClientSettings b;
    public final android.os.Bundle c;
    public final java.lang.Integer d;

    public ai6(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, android.os.Bundle r11, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r12, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r13) {
            r7 = this;
            r3 = 44
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7 = 1
            r0.a = r7
            r0.b = r4
            r0.c = r11
            java.lang.Integer r7 = r4.zab()
            r0.d = r7
            return
    }

    @Override // defpackage.oz7
    public final void a(com.google.android.gms.common.internal.IAccountAccessor r3, boolean r4) {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: android.os.RemoteException -> L25
            qz7 r0 = (defpackage.qz7) r0     // Catch: android.os.RemoteException -> L25
            java.lang.Integer r2 = r2.d     // Catch: android.os.RemoteException -> L25
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: android.os.RemoteException -> L25
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: android.os.RemoteException -> L25
            int r2 = r2.intValue()     // Catch: android.os.RemoteException -> L25
            android.os.Parcel r1 = r0.zaa()     // Catch: android.os.RemoteException -> L25
            defpackage.kz7.d(r1, r3)     // Catch: android.os.RemoteException -> L25
            r1.writeInt(r2)     // Catch: android.os.RemoteException -> L25
            r1.writeInt(r4)     // Catch: android.os.RemoteException -> L25
            r2 = 9
            r0.zac(r2, r1)     // Catch: android.os.RemoteException -> L25
            return
        L25:
            java.lang.String r2 = "SignInClientImpl"
            java.lang.String r3 = "Remote service probably died when saveDefaultAccount is called"
            android.util.Log.w(r2, r3)
            return
    }

    @Override // defpackage.oz7
    public final void b(defpackage.jz7 r7) {
            r6 = this;
            java.lang.String r0 = "Expecting a valid ISignInCallbacks"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7, r0)
            r0 = 1
            r1 = 0
            com.google.android.gms.common.internal.ClientSettings r2 = r6.b     // Catch: android.os.RemoteException -> L3d
            android.accounts.Account r2 = r2.getAccountOrDefault()     // Catch: android.os.RemoteException -> L3d
            java.lang.String r3 = "<<default account>>"
            java.lang.String r4 = r2.name     // Catch: android.os.RemoteException -> L3d
            boolean r3 = r3.equals(r4)     // Catch: android.os.RemoteException -> L3d
            if (r3 == 0) goto L3f
            android.content.Context r3 = r6.getContext()     // Catch: android.os.RemoteException -> L3d
            br6 r3 = defpackage.br6.a(r3)     // Catch: android.os.RemoteException -> L3d
            java.lang.String r4 = "defaultGoogleSignInAccount"
            java.lang.String r4 = r3.b(r4)     // Catch: android.os.RemoteException -> L3d
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: android.os.RemoteException -> L3d
            if (r5 == 0) goto L2c
            goto L3f
        L2c:
            java.lang.String r5 = "googleSignInAccount"
            java.lang.String r4 = defpackage.br6.d(r5, r4)     // Catch: android.os.RemoteException -> L3d
            java.lang.String r3 = r3.b(r4)     // Catch: android.os.RemoteException -> L3d
            if (r3 == 0) goto L3f
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.h(r3)     // Catch: android.os.RemoteException -> L3d org.json.JSONException -> L3f
            goto L40
        L3d:
            r6 = move-exception
            goto L6c
        L3f:
            r3 = r1
        L40:
            com.google.android.gms.common.internal.zat r4 = new com.google.android.gms.common.internal.zat     // Catch: android.os.RemoteException -> L3d
            java.lang.Integer r5 = r6.d     // Catch: android.os.RemoteException -> L3d
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch: android.os.RemoteException -> L3d
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: android.os.RemoteException -> L3d
            int r5 = r5.intValue()     // Catch: android.os.RemoteException -> L3d
            r4.<init>(r2, r5, r3)     // Catch: android.os.RemoteException -> L3d
            android.os.IInterface r6 = r6.getService()     // Catch: android.os.RemoteException -> L3d
            qz7 r6 = (defpackage.qz7) r6     // Catch: android.os.RemoteException -> L3d
            uz7 r2 = new uz7     // Catch: android.os.RemoteException -> L3d
            r2.<init>(r0, r4)     // Catch: android.os.RemoteException -> L3d
            android.os.Parcel r3 = r6.zaa()     // Catch: android.os.RemoteException -> L3d
            defpackage.kz7.c(r3, r2)     // Catch: android.os.RemoteException -> L3d
            defpackage.kz7.d(r3, r7)     // Catch: android.os.RemoteException -> L3d
            r2 = 12
            r6.zac(r2, r3)     // Catch: android.os.RemoteException -> L3d
            goto L82
        L6c:
            java.lang.String r2 = "Remote service probably died when signIn is called"
            java.lang.String r3 = "SignInClientImpl"
            android.util.Log.w(r3, r2)
            xz7 r2 = new xz7     // Catch: android.os.RemoteException -> L83
            com.google.android.gms.common.ConnectionResult r4 = new com.google.android.gms.common.ConnectionResult     // Catch: android.os.RemoteException -> L83
            r5 = 8
            r4.<init>(r5, r1)     // Catch: android.os.RemoteException -> L83
            r2.<init>(r0, r4, r1)     // Catch: android.os.RemoteException -> L83
            r7.zab(r2)     // Catch: android.os.RemoteException -> L83
        L82:
            return
        L83:
            java.lang.String r7 = "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException."
            android.util.Log.wtf(r3, r7, r6)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.os.IInterface createServiceInterface(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r2 = "com.google.android.gms.signin.internal.ISignInService"
            android.os.IInterface r0 = r3.queryLocalInterface(r2)
            boolean r1 = r0 instanceof defpackage.qz7
            if (r1 == 0) goto L11
            qz7 r0 = (defpackage.qz7) r0
            return r0
        L11:
            qz7 r0 = new qz7
            r0.<init>(r3, r2)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.os.Bundle getGetServiceRequestExtraArgs() {
            r3 = this;
            com.google.android.gms.common.internal.ClientSettings r0 = r3.b
            java.lang.String r1 = r0.getRealClientPackageName()
            android.content.Context r2 = r3.getContext()
            java.lang.String r2 = r2.getPackageName()
            boolean r1 = r2.equals(r1)
            android.os.Bundle r3 = r3.c
            if (r1 != 0) goto L1f
            java.lang.String r1 = "com.google.android.gms.signin.internal.realClientPackageName"
            java.lang.String r0 = r0.getRealClientPackageName()
            r3.putString(r1, r0)
        L1f:
            return r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r0 = this;
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
            r0 = this;
            java.lang.String r0 = "com.google.android.gms.signin.internal.ISignInService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
            r0 = this;
            java.lang.String r0 = "com.google.android.gms.signin.service.START"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
            r0 = this;
            boolean r0 = r0.a
            return r0
    }

    @Override // defpackage.oz7
    public final void zaa() {
            r2 = this;
            android.os.IInterface r0 = r2.getService()     // Catch: android.os.RemoteException -> L1e
            qz7 r0 = (defpackage.qz7) r0     // Catch: android.os.RemoteException -> L1e
            java.lang.Integer r2 = r2.d     // Catch: android.os.RemoteException -> L1e
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: android.os.RemoteException -> L1e
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: android.os.RemoteException -> L1e
            int r2 = r2.intValue()     // Catch: android.os.RemoteException -> L1e
            android.os.Parcel r1 = r0.zaa()     // Catch: android.os.RemoteException -> L1e
            r1.writeInt(r2)     // Catch: android.os.RemoteException -> L1e
            r2 = 7
            r0.zac(r2, r1)     // Catch: android.os.RemoteException -> L1e
            return
        L1e:
            java.lang.String r2 = "SignInClientImpl"
            java.lang.String r0 = "Remote service probably died when clearAccountFromSessionStore is called"
            android.util.Log.w(r2, r0)
            return
    }

    @Override // defpackage.oz7
    public final void zab() {
            r1 = this;
            com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter r0 = new com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter
            r0.<init>(r1)
            r1.connect(r0)
            return
    }
}
