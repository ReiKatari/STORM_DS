package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ez7  reason: default package */
/* loaded from: classes.dex */
public final class ez7 extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final com.google.android.gms.common.api.Api.Client buildClient(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, java.lang.Object r11, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r12, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r13) {
            r7 = this;
            bi6 r11 = (defpackage.bi6) r11
            ai6 r0 = new ai6
            r10.zaa()
            java.lang.Integer r7 = r10.zab()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r11 = "com.google.android.gms.signin.internal.clientRequestedAccount"
            android.accounts.Account r1 = r10.getAccount()
            r4.putParcelable(r11, r1)
            if (r7 == 0) goto L24
            java.lang.String r11 = "com.google.android.gms.common.internal.ClientSettings.sessionId"
            int r7 = r7.intValue()
            r4.putInt(r11, r7)
        L24:
            java.lang.String r7 = "com.google.android.gms.signin.internal.offlineAccessRequested"
            r11 = 0
            r4.putBoolean(r7, r11)
            java.lang.String r7 = "com.google.android.gms.signin.internal.idTokenRequested"
            r4.putBoolean(r7, r11)
            java.lang.String r7 = "com.google.android.gms.signin.internal.serverClientId"
            r1 = 0
            r4.putString(r7, r1)
            java.lang.String r7 = "com.google.android.gms.signin.internal.usePromptModeForAuthCode"
            r2 = 1
            r4.putBoolean(r7, r2)
            java.lang.String r7 = "com.google.android.gms.signin.internal.forceCodeForRefreshToken"
            r4.putBoolean(r7, r11)
            java.lang.String r7 = "com.google.android.gms.signin.internal.hostedDomain"
            r4.putString(r7, r1)
            java.lang.String r7 = "com.google.android.gms.signin.internal.logSessionId"
            r4.putString(r7, r1)
            java.lang.String r7 = "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"
            r4.putBoolean(r7, r11)
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }
}
