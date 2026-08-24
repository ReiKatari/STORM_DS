package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Api.ApiOptions;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class GoogleApi<O extends com.google.android.gms.common.api.Api.ApiOptions> implements com.google.android.gms.common.api.HasApiKey<O> {
    protected final com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final android.content.Context zab;
    private final java.lang.String zac;
    private final com.google.android.gms.common.api.Api zad;
    private final com.google.android.gms.common.api.Api.ApiOptions zae;
    private final com.google.android.gms.common.api.internal.ApiKey zaf;
    private final android.os.Looper zag;
    private final int zah;
    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.api.GoogleApiClient zai;
    private final com.google.android.gms.common.api.internal.StatusExceptionMapper zaj;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Settings {
        public static final com.google.android.gms.common.api.GoogleApi.Settings DEFAULT_SETTINGS = null;
        public final com.google.android.gms.common.api.internal.StatusExceptionMapper zaa;
        public final android.os.Looper zab;

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* loaded from: classes.dex */
        public static class Builder {
            private com.google.android.gms.common.api.internal.StatusExceptionMapper zaa;
            private android.os.Looper zab;

            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public com.google.android.gms.common.api.GoogleApi.Settings build() {
                    r3 = this;
                    com.google.android.gms.common.api.internal.StatusExceptionMapper r0 = r3.zaa
                    if (r0 != 0) goto Lb
                    com.google.android.gms.common.api.internal.ApiExceptionMapper r0 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
                    r0.<init>()
                    r3.zaa = r0
                Lb:
                    android.os.Looper r0 = r3.zab
                    if (r0 != 0) goto L15
                    android.os.Looper r0 = android.os.Looper.getMainLooper()
                    r3.zab = r0
                L15:
                    com.google.android.gms.common.api.GoogleApi$Settings r0 = new com.google.android.gms.common.api.GoogleApi$Settings
                    com.google.android.gms.common.api.internal.StatusExceptionMapper r1 = r3.zaa
                    android.os.Looper r3 = r3.zab
                    r2 = 0
                    r0.<init>(r1, r2, r3, r2)
                    return r0
            }

            public com.google.android.gms.common.api.GoogleApi.Settings.Builder setLooper(android.os.Looper r2) {
                    r1 = this;
                    java.lang.String r0 = "Looper must not be null."
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                    r1.zab = r2
                    return r1
            }

            public com.google.android.gms.common.api.GoogleApi.Settings.Builder setMapper(com.google.android.gms.common.api.internal.StatusExceptionMapper r2) {
                    r1 = this;
                    java.lang.String r0 = "StatusExceptionMapper must not be null."
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                    r1.zaa = r2
                    return r1
            }
        }

        static {
                com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
                r0.<init>()
                com.google.android.gms.common.api.GoogleApi$Settings r0 = r0.build()
                com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS = r0
                return
        }

        private Settings(com.google.android.gms.common.api.internal.StatusExceptionMapper r1, android.accounts.Account r2, android.os.Looper r3) {
                r0 = this;
                r0.<init>()
                r0.zaa = r1
                r0.zab = r3
                return
        }

        public /* synthetic */ Settings(com.google.android.gms.common.api.internal.StatusExceptionMapper r1, android.accounts.Account r2, android.os.Looper r3, com.google.android.gms.common.api.zae r4) {
                r0 = this;
                r2 = 0
                r0.<init>(r1, r2, r3)
                return
        }
    }

    public GoogleApi(android.app.Activity r7, com.google.android.gms.common.api.Api<O> r8, O r9, com.google.android.gms.common.api.GoogleApi.Settings r10) {
            r6 = this;
            r2 = r7
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public GoogleApi(android.app.Activity r2, com.google.android.gms.common.api.Api<O> r3, O r4, com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setMapper(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.setLooper(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
    }

    private GoogleApi(android.content.Context r4, android.app.Activity r5, com.google.android.gms.common.api.Api r6, com.google.android.gms.common.api.Api.ApiOptions r7, com.google.android.gms.common.api.GoogleApi.Settings r8) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "Null context is not permitted."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            java.lang.String r0 = "Api must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r0)
            java.lang.String r0 = "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8, r0)
            android.content.Context r0 = r4.getApplicationContext()
            java.lang.String r1 = "The provided context did not have an application context."
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            android.content.Context r0 = (android.content.Context) r0
            r3.zab = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L2b
            java.lang.String r4 = defpackage.m2.p(r4)
            goto L2f
        L2b:
            java.lang.String r4 = r3.getApiFallbackAttributionTag(r4)
        L2f:
            r3.zac = r4
            r3.zad = r6
            r3.zae = r7
            android.os.Looper r1 = r8.zab
            r3.zag = r1
            com.google.android.gms.common.api.internal.ApiKey r4 = com.google.android.gms.common.api.internal.ApiKey.getSharedApiKey(r6, r7, r4)
            r3.zaf = r4
            com.google.android.gms.common.api.internal.zabv r6 = new com.google.android.gms.common.api.internal.zabv
            r6.<init>(r3)
            r3.zai = r6
            com.google.android.gms.common.api.internal.GoogleApiManager r6 = com.google.android.gms.common.api.internal.GoogleApiManager.zak(r0)
            r3.zaa = r6
            int r7 = r6.zaa()
            r3.zah = r7
            com.google.android.gms.common.api.internal.StatusExceptionMapper r7 = r8.zaa
            r3.zaj = r7
            if (r5 == 0) goto L69
            boolean r7 = r5 instanceof com.google.android.gms.common.api.GoogleApiActivity
            if (r7 != 0) goto L69
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            if (r7 != r8) goto L69
            com.google.android.gms.common.api.internal.zaae.zad(r5, r6, r4)
        L69:
            r6.zaz(r3)
            return
    }

    @java.lang.Deprecated
    public GoogleApi(android.content.Context r2, com.google.android.gms.common.api.Api<O> r3, O r4, android.os.Looper r5, com.google.android.gms.common.api.internal.StatusExceptionMapper r6) {
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setLooper(r5)
            r0.setMapper(r6)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
    }

    public GoogleApi(android.content.Context r7, com.google.android.gms.common.api.Api<O> r8, O r9, com.google.android.gms.common.api.GoogleApi.Settings r10) {
            r6 = this;
            r2 = 0
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public GoogleApi(android.content.Context r2, com.google.android.gms.common.api.Api<O> r3, O r4, com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setMapper(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
    }

    private final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zad(int r2, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r3) {
            r1 = this;
            r3.zak()
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            r0.zau(r1, r2, r3)
            return r3
    }

    private final com.google.android.gms.tasks.Task zae(int r7, com.google.android.gms.common.api.internal.TaskApiCall r8) {
            r6 = this;
            com.google.android.gms.tasks.TaskCompletionSource r4 = new com.google.android.gms.tasks.TaskCompletionSource
            r4.<init>()
            com.google.android.gms.common.api.internal.StatusExceptionMapper r5 = r6.zaj
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r6.zaa
            r1 = r6
            r2 = r7
            r3 = r8
            r0.zav(r1, r2, r3, r4, r5)
            com.google.android.gms.tasks.Task r6 = r4.getTask()
            return r6
    }

    public com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient() {
            r0 = this;
            com.google.android.gms.common.api.GoogleApiClient r0 = r0.zai
            return r0
    }

    public com.google.android.gms.common.internal.ClientSettings.Builder createClientSettingsBuilder() {
            r4 = this;
            com.google.android.gms.common.internal.ClientSettings$Builder r0 = new com.google.android.gms.common.internal.ClientSettings$Builder
            r0.<init>()
            com.google.android.gms.common.api.Api$ApiOptions r1 = r4.zae
            boolean r2 = r1 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
            r3 = 0
            if (r2 == 0) goto L21
            com.google.android.gms.common.api.Api$ApiOptions$HasGoogleSignInAccountOptions r1 = (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.getGoogleSignInAccount()
            if (r1 == 0) goto L21
            java.lang.String r1 = r1.R
            if (r1 != 0) goto L19
            goto L2d
        L19:
            android.accounts.Account r3 = new android.accounts.Account
            java.lang.String r2 = "com.google"
            r3.<init>(r1, r2)
            goto L2d
        L21:
            com.google.android.gms.common.api.Api$ApiOptions r1 = r4.zae
            boolean r2 = r1 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions
            if (r2 == 0) goto L2d
            com.google.android.gms.common.api.Api$ApiOptions$HasAccountOptions r1 = (com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions) r1
            android.accounts.Account r3 = r1.getAccount()
        L2d:
            r0.zab(r3)
            com.google.android.gms.common.api.Api$ApiOptions r1 = r4.zae
            boolean r2 = r1 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
            if (r2 == 0) goto L46
            com.google.android.gms.common.api.Api$ApiOptions$HasGoogleSignInAccountOptions r1 = (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.getGoogleSignInAccount()
            if (r1 != 0) goto L41
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            goto L48
        L41:
            java.util.HashSet r1 = r1.e()
            goto L48
        L46:
            java.util.Set r1 = java.util.Collections.EMPTY_SET
        L48:
            r0.zaa(r1)
            android.content.Context r1 = r4.zab
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.zac(r1)
            android.content.Context r4 = r4.zab
            java.lang.String r4 = r4.getPackageName()
            r0.setRealClientPackageName(r4)
            return r0
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> disconnectService() {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            com.google.android.gms.tasks.Task r1 = r0.zan(r1)
            return r1
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doBestEffortWrite(T r2) {
            r1 = this;
            r0 = 2
            r1.zad(r0, r2)
            return r2
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doBestEffortWrite(com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> r2) {
            r1 = this;
            r0 = 2
            com.google.android.gms.tasks.Task r1 = r1.zae(r0, r2)
            return r1
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doRead(T r2) {
            r1 = this;
            r0 = 0
            r1.zad(r0, r2)
            return r2
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doRead(com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> r2) {
            r1 = this;
            r0 = 0
            com.google.android.gms.tasks.Task r1 = r1.zae(r0, r2)
            return r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.RegisterListenerMethod<A, ?>, U extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<A, ?>> com.google.android.gms.tasks.Task<java.lang.Void> doRegisterEventListener(T r3, U r4) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r3.getListenerKey()
            java.lang.String r1 = "Listener has already been released."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r4.getListenerKey()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r3.getListenerKey()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r1 = r4.getListenerKey()
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r1)
            java.lang.String r1 = "Listener registration and unregistration methods must be constructed with the same ListenerHolder."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            com.google.android.gms.common.api.zad r0 = com.google.android.gms.common.api.zad.zaa
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r2.zaa
            com.google.android.gms.tasks.Task r2 = r1.zao(r2, r3, r4, r0)
            return r2
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public <A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<java.lang.Void> doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods<A, ?> r4) {
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.common.api.internal.RegisterListenerMethod<A extends com.google.android.gms.common.api.Api$AnyClient, L> r0 = r4.register
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.getListenerKey()
            java.lang.String r1 = "Listener has already been released."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.api.internal.UnregisterListenerMethod r0 = r4.zaa
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.getListenerKey()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.api.internal.RegisterListenerMethod<A extends com.google.android.gms.common.api.Api$AnyClient, L> r0 = r4.register
            com.google.android.gms.common.api.internal.UnregisterListenerMethod r1 = r4.zaa
            java.lang.Runnable r4 = r4.zab
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = r3.zaa
            com.google.android.gms.tasks.Task r3 = r2.zao(r3, r0, r1, r4)
            return r3
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public com.google.android.gms.tasks.Task<java.lang.Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> r2) {
            r1 = this;
            r0 = 0
            com.google.android.gms.tasks.Task r1 = r1.doUnregisterEventListener(r2, r0)
            return r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public com.google.android.gms.tasks.Task<java.lang.Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "Listener key cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            com.google.android.gms.tasks.Task r1 = r0.zap(r1, r2, r3)
            return r1
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doWrite(T r2) {
            r1 = this;
            r0 = 1
            r1.zad(r0, r2)
            return r2
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doWrite(com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> r2) {
            r1 = this;
            r0 = 1
            com.google.android.gms.tasks.Task r1 = r1.zae(r0, r2)
            return r1
    }

    public java.lang.String getApiFallbackAttributionTag(android.content.Context r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    public final com.google.android.gms.common.api.internal.ApiKey<O> getApiKey() {
            r0 = this;
            com.google.android.gms.common.api.internal.ApiKey r0 = r0.zaf
            return r0
    }

    public O getApiOptions() {
            r0 = this;
            com.google.android.gms.common.api.Api$ApiOptions r0 = r0.zae
            return r0
    }

    public android.content.Context getApplicationContext() {
            r0 = this;
            android.content.Context r0 = r0.zab
            return r0
    }

    public java.lang.String getContextAttributionTag() {
            r0 = this;
            java.lang.String r0 = r0.zac
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getContextFeatureId() {
            r0 = this;
            java.lang.String r0 = r0.zac
            return r0
    }

    public android.os.Looper getLooper() {
            r0 = this;
            android.os.Looper r0 = r0.zag
            return r0
    }

    public <L> com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener(L r1, java.lang.String r2) {
            r0 = this;
            android.os.Looper r0 = r0.zag
            com.google.android.gms.common.api.internal.ListenerHolder r0 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(r1, r0, r2)
            return r0
    }

    public final int zaa() {
            r0 = this;
            int r0 = r0.zah
            return r0
    }

    public final com.google.android.gms.common.api.Api.Client zab(android.os.Looper r9, com.google.android.gms.common.api.internal.zabq r10) {
            r8 = this;
            com.google.android.gms.common.internal.ClientSettings$Builder r0 = r8.createClientSettingsBuilder()
            com.google.android.gms.common.internal.ClientSettings r4 = r0.build()
            com.google.android.gms.common.api.Api r0 = r8.zad
            com.google.android.gms.common.api.Api$AbstractClientBuilder r0 = r0.zaa()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r1 = r0
            com.google.android.gms.common.api.Api$AbstractClientBuilder r1 = (com.google.android.gms.common.api.Api.AbstractClientBuilder) r1
            com.google.android.gms.common.api.Api$ApiOptions r5 = r8.zae
            android.content.Context r2 = r8.zab
            r7 = r10
            r3 = r9
            r6 = r10
            com.google.android.gms.common.api.Api$Client r9 = r1.buildClient(r2, r3, r4, r5, r6, r7)
            java.lang.String r8 = r8.getContextAttributionTag()
            if (r8 == 0) goto L30
            boolean r10 = r9 instanceof com.google.android.gms.common.internal.BaseGmsClient
            if (r10 == 0) goto L30
            r10 = r9
            com.google.android.gms.common.internal.BaseGmsClient r10 = (com.google.android.gms.common.internal.BaseGmsClient) r10
            r10.setAttributionTag(r8)
        L30:
            if (r8 == 0) goto L3c
            boolean r10 = r9 instanceof com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient
            if (r10 == 0) goto L3c
            r10 = r9
            com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient r10 = (com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient) r10
            r10.zac(r8)
        L3c:
            return r9
    }

    public final com.google.android.gms.common.api.internal.zact zac(android.content.Context r2, android.os.Handler r3) {
            r1 = this;
            com.google.android.gms.common.api.internal.zact r0 = new com.google.android.gms.common.api.internal.zact
            com.google.android.gms.common.internal.ClientSettings$Builder r1 = r1.createClientSettingsBuilder()
            com.google.android.gms.common.internal.ClientSettings r1 = r1.build()
            r0.<init>(r2, r3, r1)
            return r0
    }
}
