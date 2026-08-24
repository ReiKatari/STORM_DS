package com.google.android.gms.common.internal;

import android.os.IInterface;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class GmsClient<T extends android.os.IInterface> extends com.google.android.gms.common.internal.BaseGmsClient<T> implements com.google.android.gms.common.api.Api.Client, com.google.android.gms.common.internal.zaj {
    private static volatile java.util.concurrent.Executor zaa;
    private final com.google.android.gms.common.internal.ClientSettings zab;
    private final java.util.Set zac;
    private final android.accounts.Account zad;

    public GmsClient(android.content.Context r9, android.os.Handler r10, int r11, com.google.android.gms.common.internal.ClientSettings r12) {
            r8 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r9)
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            com.google.android.gms.common.internal.ClientSettings r8 = (com.google.android.gms.common.internal.ClientSettings) r8
            r0.zab = r8
            android.accounts.Account r8 = r12.getAccount()
            r0.zad = r8
            java.util.Set r8 = r12.getAllRequestedScopes()
            java.util.Set r8 = r0.zaa(r8)
            r0.zac = r8
            return
    }

    public GmsClient(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.ClientSettings r13) {
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r7 = 0
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @java.lang.Deprecated
    public GmsClient(android.content.Context r1, android.os.Looper r2, int r3, com.google.android.gms.common.internal.ClientSettings r4, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r5, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public GmsClient(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.ClientSettings r13, com.google.android.gms.common.api.internal.ConnectionCallbacks r14, com.google.android.gms.common.api.internal.OnConnectionFailedListener r15) {
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            java.lang.Object r14 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            r7 = r14
            com.google.android.gms.common.api.internal.ConnectionCallbacks r7 = (com.google.android.gms.common.api.internal.ConnectionCallbacks) r7
            java.lang.Object r14 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r15)
            r8 = r14
            com.google.android.gms.common.api.internal.OnConnectionFailedListener r8 = (com.google.android.gms.common.api.internal.OnConnectionFailedListener) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public GmsClient(android.content.Context r10, android.os.Looper r11, com.google.android.gms.common.internal.GmsClientSupervisor r12, com.google.android.gms.common.GoogleApiAvailability r13, int r14, com.google.android.gms.common.internal.ClientSettings r15, com.google.android.gms.common.api.internal.ConnectionCallbacks r16, com.google.android.gms.common.api.internal.OnConnectionFailedListener r17) {
            r9 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            if (r0 != 0) goto L9
            r6 = r2
            goto Lf
        L9:
            com.google.android.gms.common.internal.zah r3 = new com.google.android.gms.common.internal.zah
            r3.<init>(r0)
            r6 = r3
        Lf:
            if (r1 != 0) goto L13
        L11:
            r7 = r2
            goto L19
        L13:
            com.google.android.gms.common.internal.zai r2 = new com.google.android.gms.common.internal.zai
            r2.<init>(r1)
            goto L11
        L19:
            java.lang.String r8 = r15.zac()
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.zab = r15
            android.accounts.Account r2 = r15.getAccount()
            r9.zad = r2
            java.util.Set r1 = r15.getAllRequestedScopes()
            java.util.Set r1 = r9.zaa(r1)
            r9.zac = r1
            return
    }

    private final java.util.Set zaa(java.util.Set r3) {
            r2 = this;
            java.util.Set r2 = r2.validateScopes(r3)
            java.util.Iterator r0 = r2.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.Scope r1 = (com.google.android.gms.common.api.Scope) r1
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L1b
            goto L8
        L1b:
            java.lang.String r2 = "Expanding scopes is not permitted, use implied scopes instead"
            defpackage.i.m(r2)
            r2 = 0
        L21:
            return r2
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.accounts.Account getAccount() {
            r0 = this;
            android.accounts.Account r0 = r0.zad
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public java.util.concurrent.Executor getBindServiceExecutor() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final com.google.android.gms.common.internal.ClientSettings getClientSettings() {
            r0 = this;
            com.google.android.gms.common.internal.ClientSettings r0 = r0.zab
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public com.google.android.gms.common.Feature[] getRequiredFeatures() {
            r0 = this;
            r0 = 0
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
            r0 = this;
            java.util.Set r0 = r0.zac
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public java.util.Set<com.google.android.gms.common.api.Scope> getScopesForConnectionlessNonSignIn() {
            r1 = this;
            boolean r0 = r1.requiresSignIn()
            if (r0 == 0) goto L9
            java.util.Set r1 = r1.zac
            return r1
        L9:
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            return r1
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> validateScopes(java.util.Set<com.google.android.gms.common.api.Scope> r1) {
            r0 = this;
            return r1
    }
}
