package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zabv extends com.google.android.gms.common.api.internal.zaag {
    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.api.GoogleApi zaa;

    public zabv(com.google.android.gms.common.api.GoogleApi r2) {
            r1 = this;
            java.lang.String r0 = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method."
            r1.<init>(r0)
            r1.zaa = r2
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T r1) {
            r0 = this;
            com.google.android.gms.common.api.GoogleApi r0 = r0.zaa
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r0 = r0.doRead(r1)
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T r1) {
            r0 = this;
            com.google.android.gms.common.api.GoogleApi r0 = r0.zaa
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r0 = r0.doWrite(r1)
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.content.Context getContext() {
            r0 = this;
            com.google.android.gms.common.api.GoogleApi r0 = r0.zaa
            android.content.Context r0 = r0.getApplicationContext()
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final android.os.Looper getLooper() {
            r0 = this;
            com.google.android.gms.common.api.GoogleApi r0 = r0.zaa
            android.os.Looper r0 = r0.getLooper()
            return r0
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(com.google.android.gms.common.api.internal.zada r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(com.google.android.gms.common.api.internal.zada r1) {
            r0 = this;
            return
    }
}
