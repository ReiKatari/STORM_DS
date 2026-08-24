package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zabi implements com.google.android.gms.common.api.internal.zaca, com.google.android.gms.common.api.internal.zau {
    final java.util.Map zaa;
    final java.util.Map zab;
    final com.google.android.gms.common.internal.ClientSettings zac;
    final java.util.Map zad;
    final com.google.android.gms.common.api.Api.AbstractClientBuilder zae;
    int zaf;
    final com.google.android.gms.common.api.internal.zabe zag;
    final com.google.android.gms.common.api.internal.zabz zah;
    private final java.util.concurrent.locks.Lock zai;
    private final java.util.concurrent.locks.Condition zaj;
    private final android.content.Context zak;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zal;
    private final com.google.android.gms.common.api.internal.zabh zam;
    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private volatile com.google.android.gms.common.api.internal.zabf zan;
    private com.google.android.gms.common.ConnectionResult zao;

    public zabi(android.content.Context r2, com.google.android.gms.common.api.internal.zabe r3, java.util.concurrent.locks.Lock r4, android.os.Looper r5, com.google.android.gms.common.GoogleApiAvailabilityLight r6, java.util.Map r7, com.google.android.gms.common.internal.ClientSettings r8, java.util.Map r9, com.google.android.gms.common.api.Api.AbstractClientBuilder r10, java.util.ArrayList r11, com.google.android.gms.common.api.internal.zabz r12) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zab = r0
            r0 = 0
            r1.zao = r0
            r1.zak = r2
            r1.zai = r4
            r1.zal = r6
            r1.zaa = r7
            r1.zac = r8
            r1.zad = r9
            r1.zae = r10
            r1.zag = r3
            r1.zah = r12
            int r2 = r11.size()
            r3 = 0
        L24:
            if (r3 >= r2) goto L32
            java.lang.Object r6 = r11.get(r3)
            com.google.android.gms.common.api.internal.zat r6 = (com.google.android.gms.common.api.internal.zat) r6
            r6.zaa(r1)
            int r3 = r3 + 1
            goto L24
        L32:
            com.google.android.gms.common.api.internal.zabh r2 = new com.google.android.gms.common.api.internal.zabh
            r2.<init>(r1, r5)
            r1.zam = r2
            java.util.concurrent.locks.Condition r2 = r4.newCondition()
            r1.zaj = r2
            com.google.android.gms.common.api.internal.zaax r2 = new com.google.android.gms.common.api.internal.zaax
            r2.<init>(r1)
            r1.zan = r2
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zabf zag(com.google.android.gms.common.api.internal.zabi r0) {
            com.google.android.gms.common.api.internal.zabf r0 = r0.zan
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.concurrent.locks.Lock zah(com.google.android.gms.common.api.internal.zabi r0) {
            java.util.concurrent.locks.Lock r0 = r0.zai
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.zai
            r0.lock()
            com.google.android.gms.common.api.internal.zabf r0 = r1.zan     // Catch: java.lang.Throwable -> L10
            r0.zag(r2)     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.locks.Lock r1 = r1.zai
            r1.unlock()
            return
        L10:
            r2 = move-exception
            java.util.concurrent.locks.Lock r1 = r1.zai
            r1.unlock()
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.zai
            r0.lock()
            com.google.android.gms.common.api.internal.zabf r0 = r1.zan     // Catch: java.lang.Throwable -> L10
            r0.zai(r2)     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.locks.Lock r1 = r1.zai
            r1.unlock()
            return
        L10:
            r2 = move-exception
            java.util.concurrent.locks.Lock r1 = r1.zai
            r1.unlock()
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(com.google.android.gms.common.ConnectionResult r2, com.google.android.gms.common.api.Api r3, boolean r4) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.zai
            r0.lock()
            com.google.android.gms.common.api.internal.zabf r0 = r1.zan     // Catch: java.lang.Throwable -> L10
            r0.zah(r2, r3, r4)     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.locks.Lock r1 = r1.zai
            r1.unlock()
            return
        L10:
            r2 = move-exception
            java.util.concurrent.locks.Lock r1 = r1.zai
            r1.unlock()
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.ConnectionResult zab() {
            r2 = this;
            r2.zaq()
        L3:
            com.google.android.gms.common.api.internal.zabf r0 = r2.zan
            boolean r0 = r0 instanceof com.google.android.gms.common.api.internal.zaaw
            r1 = 0
            if (r0 == 0) goto L1f
            java.util.concurrent.locks.Condition r0 = r2.zaj     // Catch: java.lang.InterruptedException -> L10
            r0.await()     // Catch: java.lang.InterruptedException -> L10
            goto L3
        L10:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            com.google.android.gms.common.ConnectionResult r2 = new com.google.android.gms.common.ConnectionResult
            r0 = 15
            r2.<init>(r0, r1)
            return r2
        L1f:
            com.google.android.gms.common.api.internal.zabf r0 = r2.zan
            boolean r0 = r0 instanceof com.google.android.gms.common.api.internal.zaaj
            if (r0 == 0) goto L28
            com.google.android.gms.common.ConnectionResult r2 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            return r2
        L28:
            com.google.android.gms.common.ConnectionResult r2 = r2.zao
            if (r2 == 0) goto L2d
            return r2
        L2d:
            com.google.android.gms.common.ConnectionResult r2 = new com.google.android.gms.common.ConnectionResult
            r0 = 13
            r2.<init>(r0, r1)
            return r2
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.ConnectionResult zac(long r4, java.util.concurrent.TimeUnit r6) {
            r3 = this;
            r3.zaq()
            long r4 = r6.toNanos(r4)
        L7:
            com.google.android.gms.common.api.internal.zabf r6 = r3.zan
            boolean r6 = r6 instanceof com.google.android.gms.common.api.internal.zaaw
            r0 = 0
            if (r6 == 0) goto L35
            r1 = 0
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 > 0) goto L1f
            r3.zar()     // Catch: java.lang.InterruptedException -> L26
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult     // Catch: java.lang.InterruptedException -> L26
            r4 = 14
            r3.<init>(r4, r0)     // Catch: java.lang.InterruptedException -> L26
            return r3
        L1f:
            java.util.concurrent.locks.Condition r6 = r3.zaj     // Catch: java.lang.InterruptedException -> L26
            long r4 = r6.awaitNanos(r4)     // Catch: java.lang.InterruptedException -> L26
            goto L7
        L26:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r4 = 15
            r3.<init>(r4, r0)
            return r3
        L35:
            com.google.android.gms.common.api.internal.zabf r4 = r3.zan
            boolean r4 = r4 instanceof com.google.android.gms.common.api.internal.zaaj
            if (r4 == 0) goto L3e
            com.google.android.gms.common.ConnectionResult r3 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            return r3
        L3e:
            com.google.android.gms.common.ConnectionResult r3 = r3.zao
            if (r3 == 0) goto L43
            return r3
        L43:
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r4 = 13
            r3.<init>(r4, r0)
            return r3
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.ConnectionResult zad(com.google.android.gms.common.api.Api r2) {
            r1 = this;
            java.util.Map r0 = r1.zaa
            com.google.android.gms.common.api.Api$AnyClientKey r2 = r2.zab()
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L2e
            java.util.Map r0 = r1.zaa
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.common.api.Api$Client r0 = (com.google.android.gms.common.api.Api.Client) r0
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L1d
            com.google.android.gms.common.ConnectionResult r1 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            return r1
        L1d:
            java.util.Map r0 = r1.zab
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L2e
            java.util.Map r1 = r1.zab
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.common.ConnectionResult r1 = (com.google.android.gms.common.ConnectionResult) r1
            return r1
        L2e:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zae(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r1) {
            r0 = this;
            r1.zak()
            com.google.android.gms.common.api.internal.zabf r0 = r0.zan
            r0.zaa(r1)
            return r1
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaf(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r1) {
            r0 = this;
            r1.zak()
            com.google.android.gms.common.api.internal.zabf r0 = r0.zan
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r0 = r0.zab(r1)
            return r0
    }

    public final void zai() {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.zai
            r0.lock()
            com.google.android.gms.common.api.internal.zabe r0 = r1.zag     // Catch: java.lang.Throwable -> L21
            r0.zak()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.common.api.internal.zaaj r0 = new com.google.android.gms.common.api.internal.zaaj     // Catch: java.lang.Throwable -> L21
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L21
            r1.zan = r0     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.common.api.internal.zabf r0 = r1.zan     // Catch: java.lang.Throwable -> L21
            r0.zad()     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.locks.Condition r0 = r1.zaj     // Catch: java.lang.Throwable -> L21
            r0.signalAll()     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.locks.Lock r1 = r1.zai
            r1.unlock()
            return
        L21:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r1.zai
            r1.unlock()
            throw r0
    }

    public final void zaj() {
            r9 = this;
            java.util.concurrent.locks.Lock r0 = r9.zai
            r0.lock()
            com.google.android.gms.common.api.internal.zaaw r1 = new com.google.android.gms.common.api.internal.zaaw     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.common.internal.ClientSettings r3 = r9.zac     // Catch: java.lang.Throwable -> L2c
            java.util.Map r4 = r9.zad     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.common.GoogleApiAvailabilityLight r5 = r9.zal     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.common.api.Api$AbstractClientBuilder r6 = r9.zae     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.locks.Lock r7 = r9.zai     // Catch: java.lang.Throwable -> L2c
            android.content.Context r8 = r9.zak     // Catch: java.lang.Throwable -> L2c
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L29
            r2.zan = r1     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.api.internal.zabf r9 = r2.zan     // Catch: java.lang.Throwable -> L29
            r9.zad()     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.locks.Condition r9 = r2.zaj     // Catch: java.lang.Throwable -> L29
            r9.signalAll()     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.locks.Lock r9 = r2.zai
            r9.unlock()
            return
        L29:
            r0 = move-exception
        L2a:
            r9 = r0
            goto L2f
        L2c:
            r0 = move-exception
            r2 = r9
            goto L2a
        L2f:
            java.util.concurrent.locks.Lock r0 = r2.zai
            r0.unlock()
            throw r9
    }

    public final void zak(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.zai
            r0.lock()
            r1.zao = r2     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.common.api.internal.zaax r2 = new com.google.android.gms.common.api.internal.zaax     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            r1.zan = r2     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.common.api.internal.zabf r2 = r1.zan     // Catch: java.lang.Throwable -> L1e
            r2.zad()     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.locks.Condition r2 = r1.zaj     // Catch: java.lang.Throwable -> L1e
            r2.signalAll()     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.locks.Lock r1 = r1.zai
            r1.unlock()
            return
        L1e:
            r2 = move-exception
            java.util.concurrent.locks.Lock r1 = r1.zai
            r1.unlock()
            throw r2
    }

    public final void zal(com.google.android.gms.common.api.internal.zabg r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zabh r1 = r1.zam
            r0 = 1
            android.os.Message r2 = r1.obtainMessage(r0, r2)
            r1.sendMessage(r2)
            return
    }

    public final void zam(java.lang.RuntimeException r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zabh r1 = r1.zam
            r0 = 2
            android.os.Message r2 = r1.obtainMessage(r0, r2)
            r1.sendMessage(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
            r0 = this;
            com.google.android.gms.common.api.internal.zabf r0 = r0.zan
            r0.zae()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
            r1 = this;
            com.google.android.gms.common.api.internal.zabf r0 = r1.zan
            boolean r0 = r0.zaj()
            if (r0 == 0) goto Ld
            java.util.Map r1 = r1.zab
            r1.clear()
        Ld:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
            r5 = this;
            java.io.PrintWriter r0 = r8.append(r6)
            java.lang.String r1 = "mState="
            java.io.PrintWriter r0 = r0.append(r1)
            com.google.android.gms.common.api.internal.zabf r1 = r5.zan
            r0.println(r1)
            java.util.Map r0 = r5.zad
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.Object r2 = r0.next()
            com.google.android.gms.common.api.Api r2 = (com.google.android.gms.common.api.Api) r2
            java.io.PrintWriter r3 = r8.append(r6)
            java.lang.String r4 = r2.zad()
            java.io.PrintWriter r3 = r3.append(r4)
            java.lang.String r4 = ":"
            r3.println(r4)
            java.util.Map r3 = r5.zaa
            com.google.android.gms.common.api.Api$AnyClientKey r2 = r2.zab()
            java.lang.Object r2 = r3.get(r2)
            com.google.android.gms.common.api.Api$Client r2 = (com.google.android.gms.common.api.Api.Client) r2
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.api.Api$Client r2 = (com.google.android.gms.common.api.Api.Client) r2
            java.lang.String r3 = "  "
            java.lang.String r1 = r1.concat(r3)
            r2.dump(r1, r7, r8, r9)
            goto L19
        L56:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
            r1 = this;
            com.google.android.gms.common.api.internal.zabf r0 = r1.zan
            boolean r0 = r0 instanceof com.google.android.gms.common.api.internal.zaaj
            if (r0 == 0) goto Ld
            com.google.android.gms.common.api.internal.zabf r1 = r1.zan
            com.google.android.gms.common.api.internal.zaaj r1 = (com.google.android.gms.common.api.internal.zaaj) r1
            r1.zaf()
        Ld:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
            r0 = this;
            com.google.android.gms.common.api.internal.zabf r0 = r0.zan
            boolean r0 = r0 instanceof com.google.android.gms.common.api.internal.zaaj
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
            r0 = this;
            com.google.android.gms.common.api.internal.zabf r0 = r0.zan
            boolean r0 = r0 instanceof com.google.android.gms.common.api.internal.zaaw
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(com.google.android.gms.common.api.internal.SignInConnectionListener r1) {
            r0 = this;
            r0 = 0
            return r0
    }
}
