package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Api.ApiOptions;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Api<O extends com.google.android.gms.common.api.Api.ApiOptions> {
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder zaa;
    private final com.google.android.gms.common.api.Api.ClientKey zab;
    private final java.lang.String zac;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static abstract class AbstractClientBuilder<T extends com.google.android.gms.common.api.Api.Client, O> extends com.google.android.gms.common.api.Api.BaseClientBuilder<T, O> {
        public AbstractClientBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        public T buildClient(android.content.Context r1, android.os.Looper r2, com.google.android.gms.common.internal.ClientSettings r3, O r4, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r5, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r6) {
                r0 = this;
                com.google.android.gms.common.api.Api$Client r0 = r0.buildClient(r1, r2, r3, r4, r5, r6)
                return r0
        }

        public T buildClient(android.content.Context r1, android.os.Looper r2, com.google.android.gms.common.internal.ClientSettings r3, O r4, com.google.android.gms.common.api.internal.ConnectionCallbacks r5, com.google.android.gms.common.api.internal.OnConnectionFailedListener r6) {
                r0 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "buildClient must be implemented"
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface AnyClient {
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class AnyClientKey<C extends com.google.android.gms.common.api.Api.AnyClient> {
        public AnyClientKey() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface ApiOptions {
        public static final com.google.android.gms.common.api.Api.ApiOptions.NoOptions NO_OPTIONS = null;

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* loaded from: classes.dex */
        public interface HasAccountOptions extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions, com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions {
            android.accounts.Account getAccount();
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* loaded from: classes.dex */
        public interface HasGoogleSignInAccountOptions extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions {
            com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleSignInAccount();
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* loaded from: classes.dex */
        public interface HasOptions extends com.google.android.gms.common.api.Api.ApiOptions {
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* loaded from: classes.dex */
        public static final class NoOptions implements com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions {
            private NoOptions() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ NoOptions(com.google.android.gms.common.api.zaa r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* loaded from: classes.dex */
        public interface NotRequiredOptions extends com.google.android.gms.common.api.Api.ApiOptions {
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* loaded from: classes.dex */
        public interface Optional extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions, com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions {
        }

        static {
                com.google.android.gms.common.api.Api$ApiOptions$NoOptions r0 = new com.google.android.gms.common.api.Api$ApiOptions$NoOptions
                r1 = 0
                r0.<init>(r1)
                com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS = r0
                return
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static abstract class BaseClientBuilder<T extends com.google.android.gms.common.api.Api.AnyClient, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public BaseClientBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.util.List<com.google.android.gms.common.api.Scope> getImpliedScopes(O r1) {
                r0 = this;
                java.util.List r0 = java.util.Collections.EMPTY_LIST
                return r0
        }

        public int getPriority() {
                r0 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface Client extends com.google.android.gms.common.api.Api.AnyClient {
        void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks r1);

        void disconnect();

        void disconnect(java.lang.String r1);

        void dump(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4);

        com.google.android.gms.common.Feature[] getAvailableFeatures();

        java.lang.String getEndpointPackageName();

        java.lang.String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor r1, java.util.Set<com.google.android.gms.common.api.Scope> r2);

        com.google.android.gms.common.Feature[] getRequiredFeatures();

        java.util.Set<com.google.android.gms.common.api.Scope> getScopesForConnectionlessNonSignIn();

        android.os.IBinder getServiceBrokerBinder();

        android.content.Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks r1);

        boolean providesSignIn();

        boolean requiresAccount();

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class ClientKey<C extends com.google.android.gms.common.api.Api.Client> extends com.google.android.gms.common.api.Api.AnyClientKey<C> {
        public ClientKey() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public <C extends com.google.android.gms.common.api.Api.Client> Api(java.lang.String r2, com.google.android.gms.common.api.Api.AbstractClientBuilder<C, O> r3, com.google.android.gms.common.api.Api.ClientKey<C> r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Cannot construct an Api with a null ClientBuilder"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            java.lang.String r0 = "Cannot construct an Api with a null ClientKey"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            r1.zac = r2
            r1.zaa = r3
            r1.zab = r4
            return
    }

    public final com.google.android.gms.common.api.Api.AbstractClientBuilder zaa() {
            r0 = this;
            com.google.android.gms.common.api.Api$AbstractClientBuilder r0 = r0.zaa
            return r0
    }

    public final com.google.android.gms.common.api.Api.AnyClientKey zab() {
            r0 = this;
            com.google.android.gms.common.api.Api$ClientKey r0 = r0.zab
            return r0
    }

    public final com.google.android.gms.common.api.Api.BaseClientBuilder zac() {
            r0 = this;
            com.google.android.gms.common.api.Api$AbstractClientBuilder r0 = r0.zaa
            return r0
    }

    public final java.lang.String zad() {
            r0 = this;
            java.lang.String r0 = r0.zac
            return r0
    }
}
