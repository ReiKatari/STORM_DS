package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaaa implements com.google.android.gms.common.api.internal.zaca {
    private final android.content.Context zaa;
    private final com.google.android.gms.common.api.internal.zabe zab;
    private final android.os.Looper zac;
    private final com.google.android.gms.common.api.internal.zabi zad;
    private final com.google.android.gms.common.api.internal.zabi zae;
    private final java.util.Map zaf;
    private final java.util.Set zag;
    private final com.google.android.gms.common.api.Api.Client zah;
    private android.os.Bundle zai;
    private com.google.android.gms.common.ConnectionResult zaj;
    private com.google.android.gms.common.ConnectionResult zak;
    private boolean zal;
    private final java.util.concurrent.locks.Lock zam;
    private int zan;

    private zaaa(android.content.Context r15, com.google.android.gms.common.api.internal.zabe r16, java.util.concurrent.locks.Lock r17, android.os.Looper r18, com.google.android.gms.common.GoogleApiAvailabilityLight r19, java.util.Map r20, java.util.Map r21, com.google.android.gms.common.internal.ClientSettings r22, com.google.android.gms.common.api.Api.AbstractClientBuilder r23, com.google.android.gms.common.api.Api.Client r24, java.util.ArrayList r25, java.util.ArrayList r26, java.util.Map r27, java.util.Map r28) {
            r14 = this;
            r14.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r14.zag = r0
            r0 = 0
            r14.zaj = r0
            r14.zak = r0
            r1 = 0
            r14.zal = r1
            r14.zan = r1
            r14.zaa = r15
            r4 = r16
            r14.zab = r4
            r5 = r17
            r14.zam = r5
            r6 = r18
            r14.zac = r6
            r2 = r24
            r14.zah = r2
            com.google.android.gms.common.api.internal.zabi r2 = new com.google.android.gms.common.api.internal.zabi
            com.google.android.gms.common.api.internal.zax r13 = new com.google.android.gms.common.api.internal.zax
            r13.<init>(r14, r0)
            r9 = 0
            r11 = 0
            r3 = r15
            r7 = r19
            r8 = r21
            r12 = r26
            r10 = r28
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.zad = r2
            com.google.android.gms.common.api.internal.zabi r2 = new com.google.android.gms.common.api.internal.zabi
            com.google.android.gms.common.api.internal.zaz r13 = new com.google.android.gms.common.api.internal.zaz
            r13.<init>(r14, r0)
            r8 = r20
            r9 = r22
            r11 = r23
            r12 = r25
            r10 = r27
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.zae = r2
            wu r15 = new wu
            r15.<init>(r1)
            java.util.Set r0 = r21.keySet()
            java.util.Iterator r0 = r0.iterator()
        L64:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.Api$AnyClientKey r1 = (com.google.android.gms.common.api.Api.AnyClientKey) r1
            com.google.android.gms.common.api.internal.zabi r2 = r14.zad
            r15.put(r1, r2)
            goto L64
        L76:
            java.util.Set r0 = r20.keySet()
            java.util.Iterator r0 = r0.iterator()
        L7e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L90
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.Api$AnyClientKey r1 = (com.google.android.gms.common.api.Api.AnyClientKey) r1
            com.google.android.gms.common.api.internal.zabi r2 = r14.zae
            r15.put(r1, r2)
            goto L7e
        L90:
            java.util.Map r15 = java.util.Collections.unmodifiableMap(r15)
            r14.zaf = r15
            return
    }

    private final void zaA(com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            int r0 = r2.zan
            r1 = 1
            if (r0 == r1) goto L1a
            r1 = 2
            if (r0 == r1) goto L15
            java.lang.Exception r3 = new java.lang.Exception
            r3.<init>()
            java.lang.String r0 = "CompositeGAC"
            java.lang.String r1 = "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor"
            android.util.Log.wtf(r0, r1, r3)
            goto L1d
        L15:
            com.google.android.gms.common.api.internal.zabe r0 = r2.zab
            r0.zaa(r3)
        L1a:
            r2.zaB()
        L1d:
            r3 = 0
            r2.zan = r3
            return
    }

    private final void zaB() {
            r2 = this;
            java.util.Set r0 = r2.zag
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.SignInConnectionListener r1 = (com.google.android.gms.common.api.internal.SignInConnectionListener) r1
            r1.onComplete()
            goto L6
        L16:
            java.util.Set r2 = r2.zag
            r2.clear()
            return
    }

    private final boolean zaC() {
            r1 = this;
            com.google.android.gms.common.ConnectionResult r1 = r1.zak
            if (r1 == 0) goto Ld
            int r1 = r1.getErrorCode()
            r0 = 4
            if (r1 != r0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    private final boolean zaD(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r2) {
            r1 = this;
            java.util.Map r0 = r1.zaf
            com.google.android.gms.common.api.Api$AnyClientKey r2 = r2.getClientKey()
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.common.api.internal.zabi r2 = (com.google.android.gms.common.api.internal.zabi) r2
            java.lang.String r0 = "GoogleApiClient is not configured to use the API required for this call."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.common.api.internal.zabi r1 = r1.zae
            boolean r1 = r2.equals(r1)
            return r1
    }

    private static boolean zaE(com.google.android.gms.common.ConnectionResult r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isSuccess()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.ConnectionResult zaa(com.google.android.gms.common.api.internal.zaaa r0) {
            com.google.android.gms.common.ConnectionResult r0 = r0.zak
            return r0
    }

    public static com.google.android.gms.common.api.internal.zaaa zag(android.content.Context r15, com.google.android.gms.common.api.internal.zabe r16, java.util.concurrent.locks.Lock r17, android.os.Looper r18, com.google.android.gms.common.GoogleApiAvailabilityLight r19, java.util.Map r20, com.google.android.gms.common.internal.ClientSettings r21, java.util.Map r22, com.google.android.gms.common.api.Api.AbstractClientBuilder r23, java.util.ArrayList r24) {
            r0 = r22
            wu r6 = new wu
            r1 = 0
            r6.<init>(r1)
            wu r7 = new wu
            r7.<init>(r1)
            java.util.Set r2 = r20.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r10 = r3
        L17:
            boolean r4 = r2.hasNext()
            r5 = 1
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r8 = r4.getValue()
            com.google.android.gms.common.api.Api$Client r8 = (com.google.android.gms.common.api.Api.Client) r8
            boolean r9 = r8.providesSignIn()
            if (r5 != r9) goto L31
            r10 = r8
        L31:
            boolean r5 = r8.requiresSignIn()
            if (r5 == 0) goto L41
            java.lang.Object r4 = r4.getKey()
            com.google.android.gms.common.api.Api$AnyClientKey r4 = (com.google.android.gms.common.api.Api.AnyClientKey) r4
            r6.put(r4, r8)
            goto L17
        L41:
            java.lang.Object r4 = r4.getKey()
            com.google.android.gms.common.api.Api$AnyClientKey r4 = (com.google.android.gms.common.api.Api.AnyClientKey) r4
            r7.put(r4, r8)
            goto L17
        L4b:
            boolean r2 = r6.isEmpty()
            r2 = r2 ^ r5
            java.lang.String r4 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r4)
            wu r13 = new wu
            r13.<init>(r1)
            wu r14 = new wu
            r14.<init>(r1)
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L67:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L9d
            java.lang.Object r4 = r2.next()
            com.google.android.gms.common.api.Api r4 = (com.google.android.gms.common.api.Api) r4
            com.google.android.gms.common.api.Api$AnyClientKey r5 = r4.zab()
            boolean r8 = r6.containsKey(r5)
            if (r8 == 0) goto L87
            java.lang.Object r5 = r0.get(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r13.put(r4, r5)
            goto L67
        L87:
            boolean r5 = r7.containsKey(r5)
            if (r5 == 0) goto L97
            java.lang.Object r5 = r0.get(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r14.put(r4, r5)
            goto L67
        L97:
            java.lang.String r15 = "Each API in the isOptionalMap must have a corresponding client in the clients map."
            defpackage.i.m(r15)
            return r3
        L9d:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            int r0 = r24.size()
        Lab:
            if (r1 >= r0) goto Ld5
            r2 = r24
            java.lang.Object r4 = r2.get(r1)
            com.google.android.gms.common.api.internal.zat r4 = (com.google.android.gms.common.api.internal.zat) r4
            com.google.android.gms.common.api.Api r5 = r4.zaa
            boolean r5 = r13.containsKey(r5)
            if (r5 == 0) goto Lc1
            r11.add(r4)
            goto Lcc
        Lc1:
            com.google.android.gms.common.api.Api r5 = r4.zaa
            boolean r5 = r14.containsKey(r5)
            if (r5 == 0) goto Lcf
            r12.add(r4)
        Lcc:
            int r1 = r1 + 1
            goto Lab
        Lcf:
            java.lang.String r15 = "Each ClientCallbacks must have a corresponding API in the isOptionalMap"
            defpackage.i.m(r15)
            return r3
        Ld5:
            com.google.android.gms.common.api.internal.zaaa r0 = new com.google.android.gms.common.api.internal.zaaa
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r8 = r21
            r9 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zabi zah(com.google.android.gms.common.api.internal.zaaa r0) {
            com.google.android.gms.common.api.internal.zabi r0 = r0.zad
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zabi zai(com.google.android.gms.common.api.internal.zaaa r0) {
            com.google.android.gms.common.api.internal.zabi r0 = r0.zae
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.concurrent.locks.Lock zaj(com.google.android.gms.common.api.internal.zaaa r0) {
            java.util.concurrent.locks.Lock r0 = r0.zam
            return r0
    }

    public static /* bridge */ /* synthetic */ void zak(com.google.android.gms.common.api.internal.zaaa r0, com.google.android.gms.common.ConnectionResult r1) {
            r0.zaj = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zal(com.google.android.gms.common.api.internal.zaaa r0, com.google.android.gms.common.ConnectionResult r1) {
            r0.zak = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zam(com.google.android.gms.common.api.internal.zaaa r0, boolean r1) {
            r0.zal = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zan(com.google.android.gms.common.api.internal.zaaa r1, int r2, boolean r3) {
            com.google.android.gms.common.api.internal.zabe r0 = r1.zab
            r0.zac(r2, r3)
            r2 = 0
            r1.zak = r2
            r1.zaj = r2
            return
    }

    public static /* bridge */ /* synthetic */ void zao(com.google.android.gms.common.api.internal.zaaa r1, android.os.Bundle r2) {
            android.os.Bundle r0 = r1.zai
            if (r0 != 0) goto L7
            r1.zai = r2
            return
        L7:
            if (r2 == 0) goto Lc
            r0.putAll(r2)
        Lc:
            return
    }

    public static /* bridge */ /* synthetic */ void zap(com.google.android.gms.common.api.internal.zaaa r4) {
            com.google.android.gms.common.ConnectionResult r0 = r4.zaj
            boolean r0 = zaE(r0)
            if (r0 == 0) goto L55
            com.google.android.gms.common.ConnectionResult r0 = r4.zak
            boolean r0 = zaE(r0)
            r1 = 1
            if (r0 != 0) goto L2d
            boolean r0 = r4.zaC()
            if (r0 == 0) goto L18
            goto L2d
        L18:
            com.google.android.gms.common.ConnectionResult r0 = r4.zak
            if (r0 == 0) goto L89
            int r2 = r4.zan
            if (r2 != r1) goto L24
            r4.zaB()
            return
        L24:
            r4.zaA(r0)
            com.google.android.gms.common.api.internal.zabi r4 = r4.zad
            r4.zar()
            return
        L2d:
            int r0 = r4.zan
            if (r0 == r1) goto L4e
            r1 = 2
            if (r0 == r1) goto L41
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            java.lang.String r1 = "CompositeGAC"
            java.lang.String r2 = "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor"
            android.util.Log.wtf(r1, r2, r0)
            goto L51
        L41:
            com.google.android.gms.common.api.internal.zabe r0 = r4.zab
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.api.internal.zabe r0 = (com.google.android.gms.common.api.internal.zabe) r0
            android.os.Bundle r1 = r4.zai
            r0.zab(r1)
        L4e:
            r4.zaB()
        L51:
            r0 = 0
            r4.zan = r0
            return
        L55:
            com.google.android.gms.common.ConnectionResult r0 = r4.zaj
            if (r0 == 0) goto L73
            com.google.android.gms.common.ConnectionResult r0 = r4.zak
            boolean r0 = zaE(r0)
            if (r0 != 0) goto L62
            goto L73
        L62:
            com.google.android.gms.common.api.internal.zabi r0 = r4.zae
            r0.zar()
            com.google.android.gms.common.ConnectionResult r0 = r4.zaj
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.ConnectionResult r0 = (com.google.android.gms.common.ConnectionResult) r0
            r4.zaA(r0)
            return
        L73:
            com.google.android.gms.common.ConnectionResult r0 = r4.zaj
            if (r0 == 0) goto L89
            com.google.android.gms.common.ConnectionResult r1 = r4.zak
            if (r1 == 0) goto L89
            com.google.android.gms.common.api.internal.zabi r2 = r4.zae
            com.google.android.gms.common.api.internal.zabi r3 = r4.zad
            int r2 = r2.zaf
            int r3 = r3.zaf
            if (r2 >= r3) goto L86
            r0 = r1
        L86:
            r4.zaA(r0)
        L89:
            return
    }

    public static /* bridge */ /* synthetic */ boolean zav(com.google.android.gms.common.api.internal.zaaa r0) {
            boolean r0 = r0.zal
            return r0
    }

    private final android.app.PendingIntent zaz() {
            r4 = this;
            com.google.android.gms.common.api.Api$Client r0 = r4.zah
            if (r0 != 0) goto L6
            r4 = 0
            return r4
        L6:
            android.content.Context r1 = r4.zaa
            com.google.android.gms.common.api.internal.zabe r4 = r4.zab
            int r4 = java.lang.System.identityHashCode(r4)
            android.content.Intent r0 = r0.getSignInIntent()
            int r2 = defpackage.a08.a
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r2 = r2 | r3
            android.app.PendingIntent r4 = android.app.PendingIntent.getActivity(r1, r4, r0, r2)
            return r4
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.ConnectionResult zab() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.ConnectionResult zac(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.ConnectionResult zad(com.google.android.gms.common.api.Api r3) {
            r2 = this;
            java.util.Map r0 = r2.zaf
            com.google.android.gms.common.api.Api$AnyClientKey r1 = r3.zab()
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabi r1 = r2.zae
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r1)
            if (r0 == 0) goto L2a
            boolean r0 = r2.zaC()
            if (r0 == 0) goto L23
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 4
            android.app.PendingIntent r2 = r2.zaz()
            r3.<init>(r0, r2)
            return r3
        L23:
            com.google.android.gms.common.api.internal.zabi r2 = r2.zae
            com.google.android.gms.common.ConnectionResult r2 = r2.zad(r3)
            return r2
        L2a:
            com.google.android.gms.common.api.internal.zabi r2 = r2.zad
            com.google.android.gms.common.ConnectionResult r2 = r2.zad(r3)
            return r2
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zae(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r4) {
            r3 = this;
            boolean r0 = r3.zaD(r4)
            if (r0 == 0) goto L21
            boolean r0 = r3.zaC()
            if (r0 == 0) goto L1b
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 0
            android.app.PendingIntent r3 = r3.zaz()
            r2 = 4
            r0.<init>(r2, r1, r3)
            r4.setFailedResult(r0)
            return r4
        L1b:
            com.google.android.gms.common.api.internal.zabi r3 = r3.zae
            r3.zae(r4)
            return r4
        L21:
            com.google.android.gms.common.api.internal.zabi r3 = r3.zad
            r3.zae(r4)
            return r4
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaf(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r4) {
            r3 = this;
            boolean r0 = r3.zaD(r4)
            if (r0 == 0) goto L22
            boolean r0 = r3.zaC()
            if (r0 == 0) goto L1b
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 0
            android.app.PendingIntent r3 = r3.zaz()
            r2 = 4
            r0.<init>(r2, r1, r3)
            r4.setFailedResult(r0)
            return r4
        L1b:
            com.google.android.gms.common.api.internal.zabi r3 = r3.zae
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r3 = r3.zaf(r4)
            return r3
        L22:
            com.google.android.gms.common.api.internal.zabi r3 = r3.zad
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r3 = r3.zaf(r4)
            return r3
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
            r1 = this;
            r0 = 2
            r1.zan = r0
            r0 = 0
            r1.zal = r0
            r0 = 0
            r1.zak = r0
            r1.zaj = r0
            com.google.android.gms.common.api.internal.zabi r0 = r1.zad
            r0.zaq()
            com.google.android.gms.common.api.internal.zabi r1 = r1.zae
            r1.zaq()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
            r1 = this;
            r0 = 0
            r1.zak = r0
            r1.zaj = r0
            r0 = 0
            r1.zan = r0
            com.google.android.gms.common.api.internal.zabi r0 = r1.zad
            r0.zar()
            com.google.android.gms.common.api.internal.zabi r0 = r1.zae
            r0.zar()
            r1.zaB()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
            r4 = this;
            java.io.PrintWriter r0 = r7.append(r5)
            java.lang.String r1 = "authClient"
            java.io.PrintWriter r0 = r0.append(r1)
            java.lang.String r1 = ":"
            r0.println(r1)
            java.lang.String r0 = java.lang.String.valueOf(r5)
            com.google.android.gms.common.api.internal.zabi r2 = r4.zae
            java.lang.String r3 = "  "
            java.lang.String r0 = r0.concat(r3)
            r2.zas(r0, r6, r7, r8)
            java.io.PrintWriter r0 = r7.append(r5)
            java.lang.String r2 = "anonClient"
            java.io.PrintWriter r0 = r0.append(r2)
            r0.println(r1)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            com.google.android.gms.common.api.internal.zabi r4 = r4.zad
            java.lang.String r5 = r5.concat(r3)
            r4.zas(r5, r6, r7, r8)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
            r1 = this;
            com.google.android.gms.common.api.internal.zabi r0 = r1.zad
            r0.zat()
            com.google.android.gms.common.api.internal.zabi r1 = r1.zae
            r1.zat()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zam
            r0.lock()
            boolean r0 = r3.zax()     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.common.api.internal.zabi r1 = r3.zae     // Catch: java.lang.Throwable -> L28
            r1.zar()     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult     // Catch: java.lang.Throwable -> L28
            r2 = 4
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L28
            r3.zak = r1     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L2a
            b08 r0 = new b08     // Catch: java.lang.Throwable -> L28
            android.os.Looper r1 = r3.zac     // Catch: java.lang.Throwable -> L28
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.common.api.internal.zav r1 = new com.google.android.gms.common.api.internal.zav     // Catch: java.lang.Throwable -> L28
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L28
            r0.post(r1)     // Catch: java.lang.Throwable -> L28
            goto L2d
        L28:
            r0 = move-exception
            goto L33
        L2a:
            r3.zaB()     // Catch: java.lang.Throwable -> L28
        L2d:
            java.util.concurrent.locks.Lock r3 = r3.zam
            r3.unlock()
            return
        L33:
            java.util.concurrent.locks.Lock r3 = r3.zam
            r3.unlock()
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zam
            r0.lock()
            com.google.android.gms.common.api.internal.zabi r0 = r3.zad     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 == 0) goto L25
            com.google.android.gms.common.api.internal.zabi r0 = r3.zae     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L23
            r2 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.zaC()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L21
            int r0 = r3.zan     // Catch: java.lang.Throwable -> L23
            if (r0 != r2) goto L25
        L21:
            r1 = r2
            goto L25
        L23:
            r0 = move-exception
            goto L2b
        L25:
            java.util.concurrent.locks.Lock r3 = r3.zam
            r3.unlock()
            return r1
        L2b:
            java.util.concurrent.locks.Lock r3 = r3.zam
            r3.unlock()
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.zam
            r0.lock()
            int r0 = r2.zan     // Catch: java.lang.Throwable -> L13
            r1 = 2
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.util.concurrent.locks.Lock r2 = r2.zam
            r2.unlock()
            return r0
        L13:
            r0 = move-exception
            java.util.concurrent.locks.Lock r2 = r2.zam
            r2.unlock()
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(com.google.android.gms.common.api.internal.SignInConnectionListener r3) {
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.zam
            r0.lock()
            boolean r0 = r2.zax()     // Catch: java.lang.Throwable -> L13
            r1 = 0
            if (r0 != 0) goto L15
            boolean r0 = r2.zaw()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L31
            goto L15
        L13:
            r3 = move-exception
            goto L37
        L15:
            com.google.android.gms.common.api.internal.zabi r0 = r2.zae     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L31
            java.util.Set r0 = r2.zag     // Catch: java.lang.Throwable -> L13
            r0.add(r3)     // Catch: java.lang.Throwable -> L13
            int r3 = r2.zan     // Catch: java.lang.Throwable -> L13
            r1 = 1
            if (r3 != 0) goto L29
            r2.zan = r1     // Catch: java.lang.Throwable -> L13
        L29:
            r3 = 0
            r2.zak = r3     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.common.api.internal.zabi r3 = r2.zae     // Catch: java.lang.Throwable -> L13
            r3.zaq()     // Catch: java.lang.Throwable -> L13
        L31:
            java.util.concurrent.locks.Lock r2 = r2.zam
            r2.unlock()
            return r1
        L37:
            java.util.concurrent.locks.Lock r2 = r2.zam
            r2.unlock()
            throw r3
    }
}
