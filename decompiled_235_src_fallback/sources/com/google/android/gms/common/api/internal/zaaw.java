package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaaw implements com.google.android.gms.common.api.internal.zabf {
    private final com.google.android.gms.common.api.internal.zabi zaa;
    private final java.util.concurrent.locks.Lock zab;
    private final android.content.Context zac;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zad;
    private com.google.android.gms.common.ConnectionResult zae;
    private int zaf;
    private int zag;
    private int zah;
    private final android.os.Bundle zai;
    private final java.util.Set zaj;
    private defpackage.oz7 zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private com.google.android.gms.common.internal.IAccountAccessor zao;
    private boolean zap;
    private boolean zaq;
    private final com.google.android.gms.common.internal.ClientSettings zar;
    private final java.util.Map zas;
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder zat;
    private final java.util.ArrayList zau;

    public zaaw(com.google.android.gms.common.api.internal.zabi r2, com.google.android.gms.common.internal.ClientSettings r3, java.util.Map r4, com.google.android.gms.common.GoogleApiAvailabilityLight r5, com.google.android.gms.common.api.Api.AbstractClientBuilder r6, java.util.concurrent.locks.Lock r7, android.content.Context r8) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zag = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.zai = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zaj = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zau = r0
            r1.zaa = r2
            r1.zar = r3
            r1.zas = r4
            r1.zad = r5
            r1.zat = r6
            r1.zab = r7
            r1.zac = r8
            return
    }

    private final void zaA() {
            r6 = this;
            r0 = 0
            r6.zam = r0
            com.google.android.gms.common.api.internal.zabi r0 = r6.zaa
            com.google.android.gms.common.api.internal.zabe r0 = r0.zag
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            r0.zad = r1
            java.util.Set r0 = r6.zaj
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.Api$AnyClientKey r1 = (com.google.android.gms.common.api.Api.AnyClientKey) r1
            com.google.android.gms.common.api.internal.zabi r2 = r6.zaa
            java.util.Map r2 = r2.zab
            boolean r2 = r2.containsKey(r1)
            if (r2 != 0) goto L11
            com.google.android.gms.common.api.internal.zabi r2 = r6.zaa
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r4 = 17
            r5 = 0
            r3.<init>(r4, r5)
            java.util.Map r2 = r2.zab
            r2.put(r1, r3)
            goto L11
        L37:
            return
    }

    private final void zaB(boolean r3) {
            r2 = this;
            oz7 r0 = r2.zak
            if (r0 == 0) goto L1d
            boolean r1 = r0.isConnected()
            if (r1 == 0) goto Lf
            if (r3 == 0) goto Lf
            r0.zaa()
        Lf:
            r0.disconnect()
            com.google.android.gms.common.internal.ClientSettings r3 = r2.zar
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.internal.ClientSettings r3 = (com.google.android.gms.common.internal.ClientSettings) r3
            r3 = 0
            r2.zao = r3
        L1d:
            return
    }

    private final void zaC() {
            r3 = this;
            com.google.android.gms.common.api.internal.zabi r0 = r3.zaa
            r0.zai()
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.common.api.internal.zabj.zaa()
            com.google.android.gms.common.api.internal.zaak r1 = new com.google.android.gms.common.api.internal.zaak
            r1.<init>(r3)
            r0.execute(r1)
            oz7 r0 = r3.zak
            if (r0 == 0) goto L2a
            boolean r1 = r3.zap
            if (r1 == 0) goto L26
            com.google.android.gms.common.internal.IAccountAccessor r1 = r3.zao
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.common.internal.IAccountAccessor r1 = (com.google.android.gms.common.internal.IAccountAccessor) r1
            boolean r2 = r3.zaq
            r0.a(r1, r2)
        L26:
            r0 = 0
            r3.zaB(r0)
        L2a:
            com.google.android.gms.common.api.internal.zabi r0 = r3.zaa
            java.util.Map r0 = r0.zab
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.Api$AnyClientKey r1 = (com.google.android.gms.common.api.Api.AnyClientKey) r1
            com.google.android.gms.common.api.internal.zabi r2 = r3.zaa
            java.util.Map r2 = r2.zaa
            java.lang.Object r1 = r2.get(r1)
            com.google.android.gms.common.api.Api$Client r1 = (com.google.android.gms.common.api.Api.Client) r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.common.api.Api$Client r1 = (com.google.android.gms.common.api.Api.Client) r1
            r1.disconnect()
            goto L36
        L56:
            android.os.Bundle r0 = r3.zai
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L60
            r0 = 0
            goto L62
        L60:
            android.os.Bundle r0 = r3.zai
        L62:
            com.google.android.gms.common.api.internal.zabi r3 = r3.zaa
            com.google.android.gms.common.api.internal.zabz r3 = r3.zah
            r3.zab(r0)
            return
    }

    private final void zaD(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            r1.zaz()
            boolean r0 = r2.hasResolution()
            r0 = r0 ^ 1
            r1.zaB(r0)
            com.google.android.gms.common.api.internal.zabi r0 = r1.zaa
            r0.zak(r2)
            com.google.android.gms.common.api.internal.zabi r1 = r1.zaa
            com.google.android.gms.common.api.internal.zabz r1 = r1.zah
            r1.zaa(r2)
            return
    }

    private final void zaE(com.google.android.gms.common.ConnectionResult r3, com.google.android.gms.common.api.Api r4, boolean r5) {
            r2 = this;
            com.google.android.gms.common.api.Api$BaseClientBuilder r0 = r4.zac()
            int r0 = r0.getPriority()
            if (r5 == 0) goto L1d
            boolean r5 = r3.hasResolution()
            if (r5 == 0) goto L11
            goto L1d
        L11:
            com.google.android.gms.common.GoogleApiAvailabilityLight r5 = r2.zad
            int r1 = r3.getErrorCode()
            android.content.Intent r5 = r5.getErrorResolutionIntent(r1)
            if (r5 == 0) goto L29
        L1d:
            com.google.android.gms.common.ConnectionResult r5 = r2.zae
            if (r5 == 0) goto L25
            int r5 = r2.zaf
            if (r0 >= r5) goto L29
        L25:
            r2.zae = r3
            r2.zaf = r0
        L29:
            com.google.android.gms.common.api.internal.zabi r2 = r2.zaa
            com.google.android.gms.common.api.Api$AnyClientKey r4 = r4.zab()
            java.util.Map r2 = r2.zab
            r2.put(r4, r3)
            return
    }

    private final void zaF() {
            r4 = this;
            int r0 = r4.zah
            if (r0 == 0) goto L5
            goto L71
        L5:
            boolean r0 = r4.zam
            if (r0 == 0) goto Ld
            boolean r0 = r4.zan
            if (r0 == 0) goto L71
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r4.zag = r1
            com.google.android.gms.common.api.internal.zabi r1 = r4.zaa
            java.util.Map r1 = r1.zaa
            int r1 = r1.size()
            r4.zah = r1
            com.google.android.gms.common.api.internal.zabi r1 = r4.zaa
            java.util.Map r1 = r1.zaa
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.Api$AnyClientKey r2 = (com.google.android.gms.common.api.Api.AnyClientKey) r2
            com.google.android.gms.common.api.internal.zabi r3 = r4.zaa
            java.util.Map r3 = r3.zab
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L4b
            boolean r2 = r4.zaH()
            if (r2 == 0) goto L2b
            r4.zaC()
            goto L2b
        L4b:
            com.google.android.gms.common.api.internal.zabi r3 = r4.zaa
            java.util.Map r3 = r3.zaa
            java.lang.Object r2 = r3.get(r2)
            com.google.android.gms.common.api.Api$Client r2 = (com.google.android.gms.common.api.Api.Client) r2
            r0.add(r2)
            goto L2b
        L59:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L71
            java.util.ArrayList r1 = r4.zau
            java.util.concurrent.ExecutorService r2 = com.google.android.gms.common.api.internal.zabj.zaa()
            com.google.android.gms.common.api.internal.zaap r3 = new com.google.android.gms.common.api.internal.zaap
            r3.<init>(r4, r0)
            java.util.concurrent.Future r4 = r2.submit(r3)
            r1.add(r4)
        L71:
            return
    }

    private final boolean zaG(int r5) {
            r4 = this;
            int r0 = r4.zag
            if (r0 == r5) goto L5f
            com.google.android.gms.common.api.internal.zabi r0 = r4.zaa
            com.google.android.gms.common.api.internal.zabe r0 = r0.zag
            java.lang.String r0 = r0.zaf()
            java.lang.String r1 = "GACConnecting"
            android.util.Log.w(r1, r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = "Unexpected callback in "
            java.lang.String r0 = r2.concat(r0)
            android.util.Log.w(r1, r0)
            int r0 = r4.zah
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mRemainingConnections="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r1, r0)
            int r0 = r4.zag
            java.lang.String r0 = zaJ(r0)
            java.lang.String r2 = "GoogleApiClient connecting is in step "
            java.lang.String r3 = " but received callback for step "
            java.lang.StringBuilder r0 = defpackage.i61.t(r2, r0, r3)
            java.lang.String r5 = zaJ(r5)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            android.util.Log.e(r1, r5, r0)
            com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r1 = 0
            r5.<init>(r0, r1)
            r4.zaD(r5)
            r4 = 0
            return r4
        L5f:
            r4 = 1
            return r4
    }

    private final boolean zaH() {
            r4 = this;
            int r0 = r4.zah
            int r0 = r0 + (-1)
            r4.zah = r0
            r1 = 0
            if (r0 <= 0) goto La
            return r1
        La:
            if (r0 >= 0) goto L2f
            com.google.android.gms.common.api.internal.zabi r0 = r4.zaa
            com.google.android.gms.common.api.internal.zabe r0 = r0.zag
            java.lang.String r0 = r0.zaf()
            java.lang.String r2 = "GACConnecting"
            android.util.Log.w(r2, r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r3 = "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect."
            android.util.Log.wtf(r2, r3, r0)
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r2 = 8
            r3 = 0
            r0.<init>(r2, r3)
            r4.zaD(r0)
            return r1
        L2f:
            com.google.android.gms.common.ConnectionResult r0 = r4.zae
            if (r0 == 0) goto L3d
            com.google.android.gms.common.api.internal.zabi r2 = r4.zaa
            int r3 = r4.zaf
            r2.zaf = r3
            r4.zaD(r0)
            return r1
        L3d:
            r4 = 1
            return r4
    }

    private final boolean zaI(com.google.android.gms.common.ConnectionResult r1) {
            r0 = this;
            boolean r0 = r0.zal
            if (r0 == 0) goto Lc
            boolean r0 = r1.hasResolution()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private static final java.lang.String zaJ(int r0) {
            if (r0 == 0) goto L5
            java.lang.String r0 = "STEP_GETTING_REMOTE_SERVICE"
            return r0
        L5:
            java.lang.String r0 = "STEP_SERVICE_BINDINGS_AND_SIGN_IN"
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.Context zac(com.google.android.gms.common.api.internal.zaaw r0) {
            android.content.Context r0 = r0.zac
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.GoogleApiAvailabilityLight zaf(com.google.android.gms.common.api.internal.zaaw r0) {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = r0.zad
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zabi zak(com.google.android.gms.common.api.internal.zaaw r0) {
            com.google.android.gms.common.api.internal.zabi r0 = r0.zaa
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.ClientSettings zal(com.google.android.gms.common.api.internal.zaaw r0) {
            com.google.android.gms.common.internal.ClientSettings r0 = r0.zar
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.IAccountAccessor zam(com.google.android.gms.common.api.internal.zaaw r0) {
            com.google.android.gms.common.internal.IAccountAccessor r0 = r0.zao
            return r0
    }

    public static /* bridge */ /* synthetic */ defpackage.oz7 zan(com.google.android.gms.common.api.internal.zaaw r0) {
            oz7 r0 = r0.zak
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Set zao(com.google.android.gms.common.api.internal.zaaw r6) {
            com.google.android.gms.common.internal.ClientSettings r0 = r6.zar
            if (r0 != 0) goto L7
            java.util.Set r6 = java.util.Collections.EMPTY_SET
            return r6
        L7:
            java.util.HashSet r1 = new java.util.HashSet
            java.util.Set r0 = r0.getRequiredScopes()
            r1.<init>(r0)
            com.google.android.gms.common.internal.ClientSettings r0 = r6.zar
            java.util.Map r0 = r0.zad()
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()
            com.google.android.gms.common.api.Api r3 = (com.google.android.gms.common.api.Api) r3
            com.google.android.gms.common.api.internal.zabi r4 = r6.zaa
            com.google.android.gms.common.api.Api$AnyClientKey r5 = r3.zab()
            java.util.Map r4 = r4.zab
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L1e
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.common.internal.zab r3 = (com.google.android.gms.common.internal.zab) r3
            java.util.Set r3 = r3.zaa
            r1.addAll(r3)
            goto L1e
        L44:
            return r1
    }

    public static /* bridge */ /* synthetic */ java.util.concurrent.locks.Lock zap(com.google.android.gms.common.api.internal.zaaw r0) {
            java.util.concurrent.locks.Lock r0 = r0.zab
            return r0
    }

    public static /* bridge */ /* synthetic */ void zaq(com.google.android.gms.common.api.internal.zaaw r0) {
            r0.zaA()
            return
    }

    public static void zar(com.google.android.gms.common.api.internal.zaaw r4, defpackage.xz7 r5) {
            r0 = 0
            boolean r0 = r4.zaG(r0)
            if (r0 != 0) goto L8
            return
        L8:
            com.google.android.gms.common.ConnectionResult r0 = r5.B
            boolean r1 = r0.isSuccess()
            if (r1 == 0) goto L59
            com.google.android.gms.common.internal.zav r5 = r5.L
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.internal.zav r5 = (com.google.android.gms.common.internal.zav) r5
            com.google.android.gms.common.ConnectionResult r0 = r5.zaa()
            boolean r1 = r0.isSuccess()
            if (r1 != 0) goto L3a
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r2 = "GACConnecting"
            java.lang.String r3 = "Sign-in succeeded with resolve account failure: "
            java.lang.String r5 = r3.concat(r5)
            android.util.Log.wtf(r2, r5, r1)
            r4.zaD(r0)
            return
        L3a:
            r0 = 1
            r4.zan = r0
            com.google.android.gms.common.internal.IAccountAccessor r0 = r5.zab()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.internal.IAccountAccessor r0 = (com.google.android.gms.common.internal.IAccountAccessor) r0
            r4.zao = r0
            boolean r0 = r5.zac()
            r4.zap = r0
            boolean r5 = r5.zad()
            r4.zaq = r5
            r4.zaF()
            return
        L59:
            boolean r5 = r4.zaI(r0)
            if (r5 == 0) goto L66
            r4.zaA()
            r4.zaF()
            return
        L66:
            r4.zaD(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void zas(com.google.android.gms.common.api.internal.zaaw r0, com.google.android.gms.common.ConnectionResult r1) {
            r0.zaD(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void zat(com.google.android.gms.common.api.internal.zaaw r0, com.google.android.gms.common.ConnectionResult r1, com.google.android.gms.common.api.Api r2, boolean r3) {
            r0.zaE(r1, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void zau(com.google.android.gms.common.api.internal.zaaw r0) {
            r0.zaF()
            return
    }

    public static /* bridge */ /* synthetic */ boolean zav(com.google.android.gms.common.api.internal.zaaw r0) {
            boolean r0 = r0.zam
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zaw(com.google.android.gms.common.api.internal.zaaw r0, int r1) {
            r1 = 0
            boolean r0 = r0.zaG(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zax(com.google.android.gms.common.api.internal.zaaw r0) {
            boolean r0 = r0.zaH()
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zay(com.google.android.gms.common.api.internal.zaaw r0, com.google.android.gms.common.ConnectionResult r1) {
            boolean r0 = r0.zaI(r1)
            return r0
    }

    private final void zaz() {
            r5 = this;
            java.util.ArrayList r0 = r5.zau
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L16
            java.lang.Object r3 = r0.get(r2)
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            r4 = 1
            r3.cancel(r4)
            int r2 = r2 + 1
            goto L7
        L16:
            java.util.ArrayList r5 = r5.zau
            r5.clear()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaa(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.zabi r0 = r0.zaa
            com.google.android.gms.common.api.internal.zabe r0 = r0.zag
            java.util.Queue r0 = r0.zaa
            r0.add(r1)
            return r1
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zab(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r1) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "GoogleApiClient is not connected yet."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
            r11 = this;
            com.google.android.gms.common.api.internal.zabi r0 = r11.zaa
            java.util.Map r0 = r0.zab
            r0.clear()
            r0 = 0
            r11.zam = r0
            r1 = 0
            r11.zae = r1
            r11.zag = r0
            r2 = 1
            r11.zal = r2
            r11.zan = r0
            r11.zap = r0
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Map r4 = r11.zas
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
            r5 = r0
        L26:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L7f
            java.lang.Object r6 = r4.next()
            com.google.android.gms.common.api.Api r6 = (com.google.android.gms.common.api.Api) r6
            com.google.android.gms.common.api.internal.zabi r7 = r11.zaa
            com.google.android.gms.common.api.Api$AnyClientKey r8 = r6.zab()
            java.util.Map r7 = r7.zaa
            java.lang.Object r7 = r7.get(r8)
            com.google.android.gms.common.api.Api$Client r7 = (com.google.android.gms.common.api.Api.Client) r7
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            com.google.android.gms.common.api.Api$Client r7 = (com.google.android.gms.common.api.Api.Client) r7
            com.google.android.gms.common.api.Api$BaseClientBuilder r8 = r6.zac()
            int r8 = r8.getPriority()
            if (r8 != r2) goto L52
            r8 = r2
            goto L53
        L52:
            r8 = r0
        L53:
            r5 = r5 | r8
            java.util.Map r8 = r11.zas
            java.lang.Object r8 = r8.get(r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            boolean r9 = r7.requiresSignIn()
            if (r9 == 0) goto L76
            r11.zam = r2
            if (r8 == 0) goto L74
            java.util.Set r9 = r11.zaj
            com.google.android.gms.common.api.Api$AnyClientKey r10 = r6.zab()
            r9.add(r10)
            goto L76
        L74:
            r11.zal = r0
        L76:
            com.google.android.gms.common.api.internal.zaal r9 = new com.google.android.gms.common.api.internal.zaal
            r9.<init>(r11, r6, r8)
            r3.put(r7, r9)
            goto L26
        L7f:
            if (r5 == 0) goto L83
            r11.zam = r0
        L83:
            boolean r0 = r11.zam
            if (r0 == 0) goto Lc0
            com.google.android.gms.common.internal.ClientSettings r0 = r11.zar
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.api.Api$AbstractClientBuilder r0 = r11.zat
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.internal.ClientSettings r0 = r11.zar
            com.google.android.gms.common.api.internal.zabi r2 = r11.zaa
            com.google.android.gms.common.api.internal.zabe r2 = r2.zag
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.zae(r2)
            com.google.android.gms.common.api.internal.zaat r9 = new com.google.android.gms.common.api.internal.zaat
            r9.<init>(r11, r1)
            com.google.android.gms.common.api.Api$AbstractClientBuilder r4 = r11.zat
            android.content.Context r5 = r11.zac
            com.google.android.gms.common.api.internal.zabi r0 = r11.zaa
            com.google.android.gms.common.internal.ClientSettings r7 = r11.zar
            com.google.android.gms.common.api.internal.zabe r0 = r0.zag
            android.os.Looper r6 = r0.getLooper()
            bi6 r8 = r7.zaa()
            r10 = r9
            com.google.android.gms.common.api.Api$Client r0 = r4.buildClient(r5, r6, r7, r8, r9, r10)
            r11.zak = r0
        Lc0:
            com.google.android.gms.common.api.internal.zabi r0 = r11.zaa
            java.util.Map r0 = r0.zaa
            int r0 = r0.size()
            r11.zah = r0
            java.util.ArrayList r0 = r11.zau
            java.util.concurrent.ExecutorService r1 = com.google.android.gms.common.api.internal.zabj.zaa()
            com.google.android.gms.common.api.internal.zaao r2 = new com.google.android.gms.common.api.internal.zaao
            r2.<init>(r11, r3)
            java.util.concurrent.Future r11 = r1.submit(r2)
            r0.add(r11)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(android.os.Bundle r2) {
            r1 = this;
            r0 = 1
            boolean r0 = r1.zaG(r0)
            if (r0 != 0) goto L8
            goto L18
        L8:
            if (r2 == 0) goto Lf
            android.os.Bundle r0 = r1.zai
            r0.putAll(r2)
        Lf:
            boolean r2 = r1.zaH()
            if (r2 == 0) goto L18
            r1.zaC()
        L18:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(com.google.android.gms.common.ConnectionResult r2, com.google.android.gms.common.api.Api r3, boolean r4) {
            r1 = this;
            r0 = 1
            boolean r0 = r1.zaG(r0)
            if (r0 != 0) goto L8
            goto L14
        L8:
            r1.zaE(r2, r3, r4)
            boolean r2 = r1.zaH()
            if (r2 == 0) goto L14
            r1.zaC()
        L14:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int r3) {
            r2 = this;
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r1 = 0
            r3.<init>(r0, r1)
            r2.zaD(r3)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
            r2 = this;
            r2.zaz()
            r0 = 1
            r2.zaB(r0)
            com.google.android.gms.common.api.internal.zabi r2 = r2.zaa
            r1 = 0
            r2.zak(r1)
            return r0
    }
}
