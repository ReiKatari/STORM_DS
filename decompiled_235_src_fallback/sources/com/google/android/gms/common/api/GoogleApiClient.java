package com.google.android.gms.common.api;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class GoogleApiClient {
    public static final java.lang.String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    private static final java.util.Set zaa = null;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @java.lang.Deprecated
    /* loaded from: classes.dex */
    public static final class Builder {
        private android.accounts.Account zaa;
        private final java.util.Set zab;
        private final java.util.Set zac;
        private int zad;
        private android.view.View zae;
        private java.lang.String zaf;
        private java.lang.String zag;
        private final java.util.Map zah;
        private final android.content.Context zai;
        private final java.util.Map zaj;
        private com.google.android.gms.common.api.internal.LifecycleActivity zak;
        private int zal;
        private com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zam;
        private android.os.Looper zan;
        private com.google.android.gms.common.GoogleApiAvailability zao;
        private com.google.android.gms.common.api.Api.AbstractClientBuilder zap;
        private final java.util.ArrayList zaq;
        private final java.util.ArrayList zar;

        public Builder(android.content.Context r3) {
                r2 = this;
                r2.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r2.zab = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r2.zac = r0
                wu r0 = new wu
                r1 = 0
                r0.<init>(r1)
                r2.zah = r0
                wu r0 = new wu
                r0.<init>(r1)
                r2.zaj = r0
                r0 = -1
                r2.zal = r0
                com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
                r2.zao = r0
                ez7 r0 = defpackage.lz7.a
                r2.zap = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.zaq = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.zar = r0
                r2.zai = r3
                android.os.Looper r0 = r3.getMainLooper()
                r2.zan = r0
                java.lang.String r0 = r3.getPackageName()
                r2.zaf = r0
                java.lang.Class r3 = r3.getClass()
                java.lang.String r3 = r3.getName()
                r2.zag = r3
                return
        }

        public Builder(android.content.Context r1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r2, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r3) {
                r0 = this;
                r0.<init>(r1)
                java.lang.String r1 = "Must provide a connected listener"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r1)
                java.util.ArrayList r1 = r0.zaq
                r1.add(r2)
                java.lang.String r1 = "Must provide a connection failed listener"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r1)
                java.util.ArrayList r0 = r0.zar
                r0.add(r3)
                return
        }

        private final void zab(com.google.android.gms.common.api.Api r4, com.google.android.gms.common.api.Api.ApiOptions r5, com.google.android.gms.common.api.Scope... r6) {
                r3 = this;
                com.google.android.gms.common.api.Api$BaseClientBuilder r0 = r4.zac()
                java.lang.String r1 = "Base client builder must not be null"
                java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
                com.google.android.gms.common.api.Api$BaseClientBuilder r0 = (com.google.android.gms.common.api.Api.BaseClientBuilder) r0
                java.util.HashSet r1 = new java.util.HashSet
                java.util.List r5 = r0.getImpliedScopes(r5)
                r1.<init>(r5)
                int r5 = r6.length
                r0 = 0
            L17:
                if (r0 >= r5) goto L21
                r2 = r6[r0]
                r1.add(r2)
                int r0 = r0 + 1
                goto L17
            L21:
                java.util.Map r3 = r3.zah
                com.google.android.gms.common.internal.zab r5 = new com.google.android.gms.common.internal.zab
                r5.<init>(r1)
                r3.put(r4, r5)
                return
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addApi(com.google.android.gms.common.api.Api<? extends com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions> r3) {
                r2 = this;
                java.lang.String r0 = "Api must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                java.util.Map r0 = r2.zaj
                r1 = 0
                r0.put(r3, r1)
                com.google.android.gms.common.api.Api$BaseClientBuilder r3 = r3.zac()
                java.lang.String r0 = "Base client builder must not be null"
                java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                com.google.android.gms.common.api.Api$BaseClientBuilder r3 = (com.google.android.gms.common.api.Api.BaseClientBuilder) r3
                java.util.List r3 = r3.getImpliedScopes(r1)
                java.util.Set r0 = r2.zac
                r0.addAll(r3)
                java.util.Set r0 = r2.zab
                r0.addAll(r3)
                return r2
        }

        public <O extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions> com.google.android.gms.common.api.GoogleApiClient.Builder addApi(com.google.android.gms.common.api.Api<O> r2, O r3) {
                r1 = this;
                java.lang.String r0 = "Api must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                java.lang.String r0 = "Null options are not permitted for this Api"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                java.util.Map r0 = r1.zaj
                r0.put(r2, r3)
                com.google.android.gms.common.api.Api$BaseClientBuilder r2 = r2.zac()
                java.lang.String r0 = "Base client builder must not be null"
                java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                com.google.android.gms.common.api.Api$BaseClientBuilder r2 = (com.google.android.gms.common.api.Api.BaseClientBuilder) r2
                java.util.List r2 = r2.getImpliedScopes(r3)
                java.util.Set r3 = r1.zac
                r3.addAll(r2)
                java.util.Set r3 = r1.zab
                r3.addAll(r2)
                return r1
        }

        public <O extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions> com.google.android.gms.common.api.GoogleApiClient.Builder addApiIfAvailable(com.google.android.gms.common.api.Api<O> r2, O r3, com.google.android.gms.common.api.Scope... r4) {
                r1 = this;
                java.lang.String r0 = "Api must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                java.lang.String r0 = "Null options are not permitted for this Api"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                java.util.Map r0 = r1.zaj
                r0.put(r2, r3)
                r1.zab(r2, r3, r4)
                return r1
        }

        public <T extends com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions> com.google.android.gms.common.api.GoogleApiClient.Builder addApiIfAvailable(com.google.android.gms.common.api.Api<? extends com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions> r3, com.google.android.gms.common.api.Scope... r4) {
                r2 = this;
                java.lang.String r0 = "Api must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                java.util.Map r0 = r2.zaj
                r1 = 0
                r0.put(r3, r1)
                r2.zab(r3, r1, r4)
                return r2
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r2) {
                r1 = this;
                java.lang.String r0 = "Listener must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                java.util.ArrayList r0 = r1.zaq
                r0.add(r2)
                return r1
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addOnConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r2) {
                r1 = this;
                java.lang.String r0 = "Listener must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                java.util.ArrayList r0 = r1.zar
                r0.add(r2)
                return r1
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addScope(com.google.android.gms.common.api.Scope r2) {
                r1 = this;
                java.lang.String r0 = "Scope must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                java.util.Set r0 = r1.zab
                r0.add(r2)
                return r1
        }

        @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
        public com.google.android.gms.common.api.GoogleApiClient build() {
                r19 = this;
                r0 = r19
                java.util.Map r1 = r0.zaj
                boolean r1 = r1.isEmpty()
                r2 = 1
                r1 = r1 ^ r2
                java.lang.String r3 = "must call addApi() to add at least one API"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r3)
                com.google.android.gms.common.internal.ClientSettings r7 = r0.zaa()
                java.util.Map r1 = r7.zad()
                wu r11 = new wu
                r3 = 0
                r11.<init>(r3)
                wu r14 = new wu
                r14.<init>(r3)
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Map r4 = r0.zaj
                java.util.Set r4 = r4.keySet()
                java.util.Iterator r13 = r4.iterator()
                r15 = 0
                r17 = r3
                r16 = r15
            L36:
                boolean r4 = r13.hasNext()
                if (r4 == 0) goto La9
                java.lang.Object r4 = r13.next()
                com.google.android.gms.common.api.Api r4 = (com.google.android.gms.common.api.Api) r4
                java.util.Map r5 = r0.zaj
                java.lang.Object r8 = r5.get(r4)
                java.lang.Object r5 = r1.get(r4)
                if (r5 == 0) goto L50
                r5 = r2
                goto L51
            L50:
                r5 = r3
            L51:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
                r11.put(r4, r6)
                com.google.android.gms.common.api.internal.zat r9 = new com.google.android.gms.common.api.internal.zat
                r9.<init>(r4, r5)
                r12.add(r9)
                com.google.android.gms.common.api.Api$AbstractClientBuilder r5 = r4.zaa()
                java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
                com.google.android.gms.common.api.Api$AbstractClientBuilder r5 = (com.google.android.gms.common.api.Api.AbstractClientBuilder) r5
                r6 = r4
                r4 = r5
                android.content.Context r5 = r0.zai
                r10 = r6
                android.os.Looper r6 = r0.zan
                r18 = r10
                r10 = r9
                com.google.android.gms.common.api.Api$Client r5 = r4.buildClient(r5, r6, r7, r8, r9, r10)
                com.google.android.gms.common.api.Api$AnyClientKey r6 = r18.zab()
                r14.put(r6, r5)
                int r4 = r4.getPriority()
                if (r4 != r2) goto L8c
                if (r8 == 0) goto L8a
                r17 = r2
                goto L8c
            L8a:
                r17 = r3
            L8c:
                boolean r4 = r5.providesSignIn()
                if (r4 == 0) goto L36
                if (r16 != 0) goto L97
                r16 = r18
                goto L36
            L97:
                java.lang.String r0 = r18.zad()
                java.lang.String r1 = r16.zad()
                java.lang.String r2 = " cannot be used with "
                java.lang.String r0 = defpackage.lb1.m(r0, r2, r1)
                defpackage.i.m(r0)
                return r15
            La9:
                if (r16 == 0) goto Le5
                if (r17 != 0) goto Ld5
                android.accounts.Account r1 = r0.zaa
                if (r1 != 0) goto Lb2
                r3 = r2
            Lb2:
                java.lang.String r1 = r16.zad()
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r4 = "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead"
                com.google.android.gms.common.internal.Preconditions.checkState(r3, r4, r1)
                java.util.Set r1 = r0.zab
                java.util.Set r3 = r0.zac
                boolean r1 = r1.equals(r3)
                java.lang.String r3 = r16.zad()
                java.lang.Object[] r3 = new java.lang.Object[]{r3}
                java.lang.String r4 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
                com.google.android.gms.common.internal.Preconditions.checkState(r1, r4, r3)
                goto Le5
            Ld5:
                java.lang.String r0 = r16.zad()
                java.lang.String r1 = "With using "
                java.lang.String r2 = ", GamesOptions can only be specified within GoogleSignInOptions.Builder"
                java.lang.String r0 = defpackage.lb1.A(r1, r0, r2)
                defpackage.i.m(r0)
                return r15
            Le5:
                java.util.Collection r1 = r14.values()
                int r16 = com.google.android.gms.common.api.internal.zabe.zad(r1, r2)
                android.content.Context r5 = r0.zai
                com.google.android.gms.common.api.internal.zabe r4 = new com.google.android.gms.common.api.internal.zabe
                java.util.concurrent.locks.ReentrantLock r6 = new java.util.concurrent.locks.ReentrantLock
                r6.<init>()
                r8 = r7
                android.os.Looper r7 = r0.zan
                com.google.android.gms.common.GoogleApiAvailability r9 = r0.zao
                com.google.android.gms.common.api.Api$AbstractClientBuilder r10 = r0.zap
                r17 = r12
                java.util.ArrayList r12 = r0.zaq
                java.util.ArrayList r13 = r0.zar
                int r15 = r0.zal
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                java.util.Set r1 = com.google.android.gms.common.api.GoogleApiClient.zaq()
                monitor-enter(r1)
                java.util.Set r2 = com.google.android.gms.common.api.GoogleApiClient.zaq()     // Catch: java.lang.Throwable -> L127
                r2.add(r4)     // Catch: java.lang.Throwable -> L127
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L127
                int r1 = r0.zal
                if (r1 < 0) goto L126
                com.google.android.gms.common.api.internal.LifecycleActivity r1 = r0.zak
                com.google.android.gms.common.api.internal.zak r1 = com.google.android.gms.common.api.internal.zak.zaa(r1)
                int r2 = r0.zal
                com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r0 = r0.zam
                r1.zad(r2, r4, r0)
            L126:
                return r4
            L127:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L127
                throw r0
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder enableAutoManage(androidx.fragment.app.p r3, int r4, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r5) {
                r2 = this;
                com.google.android.gms.common.api.internal.LifecycleActivity r0 = new com.google.android.gms.common.api.internal.LifecycleActivity
                r0.<init>(r3)
                if (r4 < 0) goto L9
                r3 = 1
                goto La
            L9:
                r3 = 0
            La:
                java.lang.String r1 = "clientId must be non-negative"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r3, r1)
                r2.zal = r4
                r2.zam = r5
                r2.zak = r0
                return r2
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder enableAutoManage(androidx.fragment.app.p r2, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r3) {
                r1 = this;
                r0 = 0
                r1.enableAutoManage(r2, r0, r3)
                return r1
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder setAccountName(java.lang.String r3) {
                r2 = this;
                if (r3 != 0) goto L4
                r3 = 0
                goto Lc
            L4:
                android.accounts.Account r0 = new android.accounts.Account
                java.lang.String r1 = "com.google"
                r0.<init>(r3, r1)
                r3 = r0
            Lc:
                r2.zaa = r3
                return r2
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder setGravityForPopups(int r1) {
                r0 = this;
                r0.zad = r1
                return r0
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder setHandler(android.os.Handler r2) {
                r1 = this;
                java.lang.String r0 = "Handler must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                android.os.Looper r2 = r2.getLooper()
                r1.zan = r2
                return r1
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder setViewForPopups(android.view.View r2) {
                r1 = this;
                java.lang.String r0 = "View must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                r1.zae = r2
                return r1
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder useDefaultAccount() {
                r1 = this;
                java.lang.String r0 = "<<default account>>"
                r1.setAccountName(r0)
                return r1
        }

        public final com.google.android.gms.common.internal.ClientSettings zaa() {
                r11 = this;
                java.util.Map r0 = r11.zaj
                com.google.android.gms.common.api.Api r1 = defpackage.lz7.b
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L14
                java.util.Map r0 = r11.zaj
                java.lang.Object r0 = r0.get(r1)
                bi6 r0 = (defpackage.bi6) r0
            L12:
                r9 = r0
                goto L17
            L14:
                bi6 r0 = defpackage.bi6.a
                goto L12
            L17:
                com.google.android.gms.common.internal.ClientSettings r1 = new com.google.android.gms.common.internal.ClientSettings
                android.accounts.Account r2 = r11.zaa
                java.util.Set r3 = r11.zab
                java.util.Map r4 = r11.zah
                int r5 = r11.zad
                android.view.View r6 = r11.zae
                java.lang.String r7 = r11.zaf
                java.lang.String r8 = r11.zag
                r10 = 0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r1
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @java.lang.Deprecated
    /* loaded from: classes.dex */
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @java.lang.Deprecated
    /* loaded from: classes.dex */
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            com.google.android.gms.common.api.GoogleApiClient.zaa = r0
            return
    }

    public GoogleApiClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void dumpAll(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
            java.util.Set r0 = com.google.android.gms.common.api.GoogleApiClient.zaa
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            r1.append(r7)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "  "
            r1.append(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L39
            r3 = 0
        L19:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.api.GoogleApiClient r4 = (com.google.android.gms.common.api.GoogleApiClient) r4     // Catch: java.lang.Throwable -> L39
            java.io.PrintWriter r5 = r9.append(r7)     // Catch: java.lang.Throwable -> L39
            java.lang.String r6 = "GoogleApiClient#"
            java.io.PrintWriter r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L39
            int r6 = r3 + 1
            r5.println(r3)     // Catch: java.lang.Throwable -> L39
            r4.dump(r1, r8, r9, r10)     // Catch: java.lang.Throwable -> L39
            r3 = r6
            goto L19
        L39:
            r7 = move-exception
            goto L3d
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r7
    }

    public static java.util.Set<com.google.android.gms.common.api.GoogleApiClient> getAllClients() {
            java.util.Set r0 = com.google.android.gms.common.api.GoogleApiClient.zaa
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public static /* bridge */ /* synthetic */ java.util.Set zaq() {
            java.util.Set r0 = com.google.android.gms.common.api.GoogleApiClient.zaa
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public abstract com.google.android.gms.common.ConnectionResult blockingConnect();

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public abstract com.google.android.gms.common.ConnectionResult blockingConnect(long r1, java.util.concurrent.TimeUnit r3);

    public abstract com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public abstract void disconnect();

    public abstract void dump(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4);

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public <C extends com.google.android.gms.common.api.Api.Client> C getClient(com.google.android.gms.common.api.Api.AnyClientKey<C> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public abstract com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.Api<?> r1);

    public android.content.Context getContext() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public android.os.Looper getLooper() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public boolean hasApi(com.google.android.gms.common.api.Api<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public abstract boolean hasConnectedApi(com.google.android.gms.common.api.Api<?> r1);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r1);

    public abstract boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r1);

    public boolean maybeSignIn(com.google.android.gms.common.api.internal.SignInConnectionListener r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public void maybeSignOut() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r1);

    public abstract void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r1);

    public <L> com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener(L r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public abstract void stopAutoManage(androidx.fragment.app.p r1);

    public abstract void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r1);

    public abstract void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r1);

    public void zao(com.google.android.gms.common.api.internal.zada r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public void zap(com.google.android.gms.common.api.internal.zada r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
