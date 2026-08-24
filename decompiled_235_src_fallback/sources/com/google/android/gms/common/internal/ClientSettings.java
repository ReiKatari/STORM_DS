package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ClientSettings {
    private final android.accounts.Account zaa;
    private final java.util.Set zab;
    private final java.util.Set zac;
    private final java.util.Map zad;
    private final int zae;
    private final android.view.View zaf;
    private final java.lang.String zag;
    private final java.lang.String zah;
    private final defpackage.bi6 zai;
    private java.lang.Integer zaj;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class Builder {
        private android.accounts.Account zaa;
        private defpackage.zu zab;
        private java.lang.String zac;
        private java.lang.String zad;
        private final defpackage.bi6 zae;

        public Builder() {
                r1 = this;
                r1.<init>()
                bi6 r0 = defpackage.bi6.a
                r1.zae = r0
                return
        }

        public com.google.android.gms.common.internal.ClientSettings build() {
                r10 = this;
                com.google.android.gms.common.internal.ClientSettings r0 = new com.google.android.gms.common.internal.ClientSettings
                android.accounts.Account r1 = r10.zaa
                zu r2 = r10.zab
                java.lang.String r6 = r10.zac
                java.lang.String r7 = r10.zad
                bi6 r8 = r10.zae
                r9 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r0
        }

        public com.google.android.gms.common.internal.ClientSettings.Builder setRealClientPackageName(java.lang.String r1) {
                r0 = this;
                r0.zac = r1
                return r0
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder zaa(java.util.Collection r3) {
                r2 = this;
                zu r0 = r2.zab
                if (r0 != 0) goto Lc
                zu r0 = new zu
                r1 = 0
                r0.<init>(r1)
                r2.zab = r0
            Lc:
                zu r0 = r2.zab
                r0.addAll(r3)
                return r2
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder zab(android.accounts.Account r1) {
                r0 = this;
                r0.zaa = r1
                return r0
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder zac(java.lang.String r1) {
                r0 = this;
                r0.zad = r1
                return r0
        }
    }

    public ClientSettings(android.accounts.Account r11, java.util.Set<com.google.android.gms.common.api.Scope> r12, java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.zab> r13, int r14, android.view.View r15, java.lang.String r16, java.lang.String r17, defpackage.bi6 r18) {
            r10 = this;
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public ClientSettings(android.accounts.Account r1, java.util.Set r2, java.util.Map r3, int r4, android.view.View r5, java.lang.String r6, java.lang.String r7, defpackage.bi6 r8, boolean r9) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            if (r2 != 0) goto La
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            goto Le
        La:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r2)
        Le:
            r0.zab = r1
            if (r3 != 0) goto L14
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
        L14:
            r0.zad = r3
            r0.zaf = r5
            r0.zae = r4
            r0.zag = r6
            r0.zah = r7
            if (r8 != 0) goto L22
            bi6 r8 = defpackage.bi6.a
        L22:
            r0.zai = r8
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r1)
            java.util.Collection r1 = r3.values()
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L43
            java.lang.Object r3 = r1.next()
            com.google.android.gms.common.internal.zab r3 = (com.google.android.gms.common.internal.zab) r3
            java.util.Set r3 = r3.zaa
            r2.addAll(r3)
            goto L31
        L43:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r2)
            r0.zac = r1
            return
    }

    public static com.google.android.gms.common.internal.ClientSettings createDefault(android.content.Context r1) {
            com.google.android.gms.common.api.GoogleApiClient$Builder r0 = new com.google.android.gms.common.api.GoogleApiClient$Builder
            r0.<init>(r1)
            com.google.android.gms.common.internal.ClientSettings r1 = r0.zaa()
            return r1
    }

    public android.accounts.Account getAccount() {
            r0 = this;
            android.accounts.Account r0 = r0.zaa
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getAccountName() {
            r0 = this;
            android.accounts.Account r0 = r0.zaa
            if (r0 == 0) goto L7
            java.lang.String r0 = r0.name
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.accounts.Account getAccountOrDefault() {
            r2 = this;
            android.accounts.Account r2 = r2.zaa
            if (r2 == 0) goto L5
            return r2
        L5:
            android.accounts.Account r2 = new android.accounts.Account
            java.lang.String r0 = "<<default account>>"
            java.lang.String r1 = "com.google"
            r2.<init>(r0, r1)
            return r2
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getAllRequestedScopes() {
            r0 = this;
            java.util.Set r0 = r0.zac
            return r0
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getApplicableScopes(com.google.android.gms.common.api.Api<?> r2) {
            r1 = this;
            java.util.Map r0 = r1.zad
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.common.internal.zab r2 = (com.google.android.gms.common.internal.zab) r2
            if (r2 == 0) goto L20
            java.util.Set r0 = r2.zaa
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            goto L20
        L13:
            java.util.Set r1 = r1.zab
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            java.util.Set r1 = r2.zaa
            r0.addAll(r1)
            return r0
        L20:
            java.util.Set r1 = r1.zab
            return r1
    }

    public int getGravityForPopups() {
            r0 = this;
            int r0 = r0.zae
            return r0
    }

    public java.lang.String getRealClientPackageName() {
            r0 = this;
            java.lang.String r0 = r0.zag
            return r0
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getRequiredScopes() {
            r0 = this;
            java.util.Set r0 = r0.zab
            return r0
    }

    public android.view.View getViewForPopups() {
            r0 = this;
            android.view.View r0 = r0.zaf
            return r0
    }

    public final defpackage.bi6 zaa() {
            r0 = this;
            bi6 r0 = r0.zai
            return r0
    }

    public final java.lang.Integer zab() {
            r0 = this;
            java.lang.Integer r0 = r0.zaj
            return r0
    }

    public final java.lang.String zac() {
            r0 = this;
            java.lang.String r0 = r0.zah
            return r0
    }

    public final java.util.Map zad() {
            r0 = this;
            java.util.Map r0 = r0.zad
            return r0
    }

    public final void zae(java.lang.Integer r1) {
            r0 = this;
            r0.zaj = r1
            return
    }
}
