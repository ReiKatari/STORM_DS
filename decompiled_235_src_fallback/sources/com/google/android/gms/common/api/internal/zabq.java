package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zabq implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.common.api.internal.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final java.util.Queue zab;
    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.api.Api.Client zac;
    private final com.google.android.gms.common.api.internal.ApiKey zad;
    private final com.google.android.gms.common.api.internal.zaad zae;
    private final java.util.Set zaf;
    private final java.util.Map zag;
    private final int zah;
    private final com.google.android.gms.common.api.internal.zact zai;
    private boolean zaj;
    private final java.util.List zak;
    private com.google.android.gms.common.ConnectionResult zal;
    private int zam;

    public zabq(com.google.android.gms.common.api.internal.GoogleApiManager r4, com.google.android.gms.common.api.GoogleApi r5) {
            r3 = this;
            r3.zaa = r4
            r3.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r3.zab = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.zaf = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.zag = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.zak = r0
            r0 = 0
            r3.zal = r0
            r1 = 0
            r3.zam = r1
            android.os.Handler r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r4)
            android.os.Looper r1 = r1.getLooper()
            com.google.android.gms.common.api.Api$Client r1 = r5.zab(r1, r3)
            r3.zac = r1
            com.google.android.gms.common.api.internal.ApiKey r2 = r5.getApiKey()
            r3.zad = r2
            com.google.android.gms.common.api.internal.zaad r2 = new com.google.android.gms.common.api.internal.zaad
            r2.<init>()
            r3.zae = r2
            int r2 = r5.zaa()
            r3.zah = r2
            boolean r1 = r1.requiresSignIn()
            if (r1 == 0) goto L5d
            android.content.Context r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac(r4)
            android.os.Handler r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r4)
            com.google.android.gms.common.api.internal.zact r4 = r5.zac(r0, r4)
            r3.zai = r4
            return
        L5d:
            r3.zai = r0
            return
    }

    private final com.google.android.gms.common.Feature zaC(com.google.android.gms.common.Feature[] r9) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L52
            int r1 = r9.length
            if (r1 != 0) goto L7
            goto L52
        L7:
            com.google.android.gms.common.api.Api$Client r8 = r8.zac
            com.google.android.gms.common.Feature[] r8 = r8.getAvailableFeatures()
            r1 = 0
            if (r8 != 0) goto L12
            com.google.android.gms.common.Feature[] r8 = new com.google.android.gms.common.Feature[r1]
        L12:
            wu r2 = new wu
            int r3 = r8.length
            r2.<init>(r3)
            r3 = r1
        L19:
            int r4 = r8.length
            if (r3 >= r4) goto L30
            r4 = r8[r3]
            java.lang.String r5 = r4.getName()
            long r6 = r4.getVersion()
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r2.put(r5, r4)
            int r3 = r3 + 1
            goto L19
        L30:
            int r8 = r9.length
        L31:
            if (r1 >= r8) goto L52
            r3 = r9[r1]
            java.lang.String r4 = r3.getName()
            java.lang.Object r4 = r2.get(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L51
            long r4 = r4.longValue()
            long r6 = r3.getVersion()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L4e
            goto L51
        L4e:
            int r1 = r1 + 1
            goto L31
        L51:
            return r3
        L52:
            return r0
    }

    private final void zaD(com.google.android.gms.common.ConnectionResult r5) {
            r4 = this;
            java.util.Set r0 = r4.zaf
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.zal r1 = (com.google.android.gms.common.api.internal.zal) r1
            com.google.android.gms.common.ConnectionResult r2 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r5, r2)
            if (r2 == 0) goto L21
            com.google.android.gms.common.api.Api$Client r2 = r4.zac
            java.lang.String r2 = r2.getEndpointPackageName()
            goto L22
        L21:
            r2 = 0
        L22:
            com.google.android.gms.common.api.internal.ApiKey r3 = r4.zad
            r1.zac(r3, r5, r2)
            goto L6
        L28:
            java.util.Set r4 = r4.zaf
            r4.clear()
            return
    }

    private final void zaE(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r2.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            r0 = 0
            r1 = 0
            r2.zaF(r3, r0, r1)
            return
    }

    private final void zaF(com.google.android.gms.common.api.Status r4, java.lang.Exception r5, boolean r6) {
            r3 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r3.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            r0 = 1
            r1 = 0
            if (r4 == 0) goto Lf
            r2 = r1
            goto L10
        Lf:
            r2 = r0
        L10:
            if (r5 == 0) goto L13
            r0 = r1
        L13:
            if (r2 == r0) goto L3c
            java.util.Queue r3 = r3.zab
            java.util.Iterator r3 = r3.iterator()
        L1b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r3.next()
            com.google.android.gms.common.api.internal.zai r0 = (com.google.android.gms.common.api.internal.zai) r0
            if (r6 == 0) goto L2e
            int r1 = r0.zac
            r2 = 2
            if (r1 != r2) goto L1b
        L2e:
            if (r4 == 0) goto L34
            r0.zad(r4)
            goto L37
        L34:
            r0.zae(r5)
        L37:
            r3.remove()
            goto L1b
        L3b:
            return
        L3c:
            java.lang.String r3 = "Status XOR exception should be null"
            defpackage.i.h(r3)
            return
    }

    private final void zaG() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Queue r1 = r5.zab
            r0.<init>(r1)
            int r1 = r0.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.common.api.internal.zai r3 = (com.google.android.gms.common.api.internal.zai) r3
            com.google.android.gms.common.api.Api$Client r4 = r5.zac
            boolean r4 = r4.isConnected()
            if (r4 != 0) goto L1d
            goto L2b
        L1d:
            boolean r4 = r5.zaM(r3)
            if (r4 == 0) goto L28
            java.util.Queue r4 = r5.zab
            r4.remove(r3)
        L28:
            int r2 = r2 + 1
            goto Lc
        L2b:
            return
    }

    private final void zaH() {
            r4 = this;
            r4.zan()
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            r4.zaD(r0)
            r4.zaL()
            java.util.Map r0 = r4.zag
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.zaci r1 = (com.google.android.gms.common.api.internal.zaci) r1
            com.google.android.gms.common.api.internal.RegisterListenerMethod r2 = r1.zaa
            com.google.android.gms.common.Feature[] r2 = r2.getRequiredFeatures()
            com.google.android.gms.common.Feature r2 = r4.zaC(r2)
            if (r2 == 0) goto L31
            r0.remove()
            goto L15
        L31:
            com.google.android.gms.common.api.internal.RegisterListenerMethod r1 = r1.zaa     // Catch: android.os.RemoteException -> L3e android.os.DeadObjectException -> L42
            com.google.android.gms.common.api.Api$Client r2 = r4.zac     // Catch: android.os.RemoteException -> L3e android.os.DeadObjectException -> L42
            com.google.android.gms.tasks.TaskCompletionSource r3 = new com.google.android.gms.tasks.TaskCompletionSource     // Catch: android.os.RemoteException -> L3e android.os.DeadObjectException -> L42
            r3.<init>()     // Catch: android.os.RemoteException -> L3e android.os.DeadObjectException -> L42
            r1.registerListener(r2, r3)     // Catch: android.os.RemoteException -> L3e android.os.DeadObjectException -> L42
            goto L15
        L3e:
            r0.remove()
            goto L15
        L42:
            r0 = 3
            r4.onConnectionSuspended(r0)
            com.google.android.gms.common.api.Api$Client r0 = r4.zac
            java.lang.String r1 = "DeadObjectException thrown while calling register listener method."
            r0.disconnect(r1)
        L4d:
            r4.zaG()
            r4.zaJ()
            return
    }

    private final void zaI(int r5) {
            r4 = this;
            r4.zan()
            r0 = 1
            r4.zaj = r0
            com.google.android.gms.common.api.Api$Client r0 = r4.zac
            java.lang.String r0 = r0.getLastDisconnectMessage()
            com.google.android.gms.common.api.internal.zaad r1 = r4.zae
            r1.zae(r5, r0)
            com.google.android.gms.common.api.internal.ApiKey r5 = r4.zad
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r4.zaa
            android.os.Handler r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            r2 = 9
            android.os.Message r5 = android.os.Message.obtain(r0, r2, r5)
            r2 = 5000(0x1388, double:2.4703E-320)
            r1.sendMessageDelayed(r5, r2)
            com.google.android.gms.common.api.internal.ApiKey r5 = r4.zad
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r4.zaa
            android.os.Handler r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            r2 = 11
            android.os.Message r5 = android.os.Message.obtain(r0, r2, r5)
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            r1.sendMessageDelayed(r5, r2)
            com.google.android.gms.common.api.internal.GoogleApiManager r5 = r4.zaa
            com.google.android.gms.common.internal.zal r5 = com.google.android.gms.common.api.internal.GoogleApiManager.zal(r5)
            r5.zac()
            java.util.Map r4 = r4.zag
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L53:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r4.next()
            com.google.android.gms.common.api.internal.zaci r5 = (com.google.android.gms.common.api.internal.zaci) r5
            java.lang.Runnable r5 = r5.zac
            r5.run()
            goto L53
        L65:
            return
    }

    private final void zaJ() {
            r4 = this;
            com.google.android.gms.common.api.internal.ApiKey r0 = r4.zad
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r4.zaa
            android.os.Handler r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r1)
            r2 = 12
            r1.removeMessages(r2, r0)
            com.google.android.gms.common.api.internal.ApiKey r0 = r4.zad
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r4.zaa
            android.os.Handler r3 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r1)
            android.os.Handler r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r1)
            android.os.Message r0 = r1.obtainMessage(r2, r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r4 = r4.zaa
            long r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zab(r4)
            r3.sendMessageDelayed(r0, r1)
            return
    }

    private final void zaK(com.google.android.gms.common.api.internal.zai r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.zaad r0 = r2.zae
            boolean r1 = r2.zaA()
            r3.zag(r0, r1)
            r3.zaf(r2)     // Catch: android.os.DeadObjectException -> Ld
            return
        Ld:
            r3 = 1
            r2.onConnectionSuspended(r3)
            com.google.android.gms.common.api.Api$Client r2 = r2.zac
            java.lang.String r3 = "DeadObjectException thrown while running ApiCallRunner."
            r2.disconnect(r3)
            return
    }

    private final void zaL() {
            r3 = this;
            boolean r0 = r3.zaj
            if (r0 == 0) goto L21
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r3.zaa
            com.google.android.gms.common.api.internal.ApiKey r1 = r3.zad
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            r2 = 11
            r0.removeMessages(r2, r1)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r3.zaa
            com.google.android.gms.common.api.internal.ApiKey r1 = r3.zad
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            r2 = 9
            r0.removeMessages(r2, r1)
            r0 = 0
            r3.zaj = r0
        L21:
            return
    }

    private final boolean zaM(com.google.android.gms.common.api.internal.zai r8) {
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.common.api.internal.zac
            r1 = 1
            if (r0 != 0) goto L9
            r7.zaK(r8)
            return r1
        L9:
            r0 = r8
            com.google.android.gms.common.api.internal.zac r0 = (com.google.android.gms.common.api.internal.zac) r0
            com.google.android.gms.common.Feature[] r2 = r0.zab(r7)
            com.google.android.gms.common.Feature r2 = r7.zaC(r2)
            if (r2 != 0) goto L1a
            r7.zaK(r8)
            return r1
        L1a:
            com.google.android.gms.common.api.Api$Client r8 = r7.zac
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r3 = r2.getName()
            long r4 = r2.getVersion()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r8 = " could not execute call because it requires feature ("
            r6.append(r8)
            r6.append(r3)
            java.lang.String r8 = ", "
            r6.append(r8)
            r6.append(r4)
            java.lang.String r8 = ")."
            r6.append(r8)
            java.lang.String r8 = r6.toString()
            java.lang.String r3 = "GoogleApiManager"
            android.util.Log.w(r3, r8)
            com.google.android.gms.common.api.internal.GoogleApiManager r8 = r7.zaa
            boolean r8 = com.google.android.gms.common.api.internal.GoogleApiManager.zaC(r8)
            if (r8 == 0) goto Ld6
            boolean r8 = r0.zaa(r7)
            if (r8 == 0) goto Ld6
            com.google.android.gms.common.api.internal.ApiKey r8 = r7.zad
            com.google.android.gms.common.api.internal.zabs r0 = new com.google.android.gms.common.api.internal.zabs
            r1 = 0
            r0.<init>(r8, r2, r1)
            java.util.List r8 = r7.zak
            int r8 = r8.indexOf(r0)
            java.util.List r2 = r7.zak
            r3 = 5000(0x1388, double:2.4703E-320)
            r5 = 15
            if (r8 < 0) goto L97
            java.lang.Object r8 = r2.get(r8)
            com.google.android.gms.common.api.internal.zabs r8 = (com.google.android.gms.common.api.internal.zabs) r8
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r7.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            r0.removeMessages(r5, r8)
            com.google.android.gms.common.api.internal.GoogleApiManager r7 = r7.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r7)
            android.os.Handler r7 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r7)
            android.os.Message r7 = android.os.Message.obtain(r7, r5, r8)
            r0.sendMessageDelayed(r7, r3)
            goto Ld4
        L97:
            r2.add(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r8 = r7.zaa
            android.os.Handler r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r8)
            android.os.Handler r8 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r8)
            android.os.Message r8 = android.os.Message.obtain(r8, r5, r0)
            r2.sendMessageDelayed(r8, r3)
            com.google.android.gms.common.api.internal.GoogleApiManager r8 = r7.zaa
            android.os.Handler r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r8)
            android.os.Handler r8 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r8)
            r3 = 16
            android.os.Message r8 = android.os.Message.obtain(r8, r3, r0)
            r3 = 120000(0x1d4c0, double:5.9288E-319)
            r2.sendMessageDelayed(r8, r3)
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r0 = 2
            r8.<init>(r0, r1)
            boolean r0 = r7.zaN(r8)
            if (r0 != 0) goto Ld4
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r7.zaa
            int r7 = r7.zah
            r0.zaE(r8, r7)
        Ld4:
            r7 = 0
            return r7
        Ld6:
            com.google.android.gms.common.api.UnsupportedApiCallException r7 = new com.google.android.gms.common.api.UnsupportedApiCallException
            r7.<init>(r2)
            r0.zae(r7)
            return r1
    }

    private final boolean zaN(com.google.android.gms.common.ConnectionResult r4) {
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaq()
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r3.zaa     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.common.api.internal.zaae r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zah(r1)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            java.util.Set r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zas(r1)     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.common.api.internal.ApiKey r2 = r3.zad     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L29
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r3.zaa     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.common.api.internal.zaae r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zah(r1)     // Catch: java.lang.Throwable -> L27
            int r3 = r3.zah     // Catch: java.lang.Throwable -> L27
            r1.zah(r4, r3)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            r3 = 1
            return r3
        L27:
            r3 = move-exception
            goto L2c
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            r3 = 0
            return r3
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
    }

    private final boolean zaO(boolean r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            com.google.android.gms.common.api.Api$Client r0 = r1.zac
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L30
            java.util.Map r0 = r1.zag
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L30
            com.google.android.gms.common.api.internal.zaad r0 = r1.zae
            boolean r0 = r0.zag()
            if (r0 == 0) goto L27
            if (r2 == 0) goto L30
            r1.zaJ()
            goto L30
        L27:
            com.google.android.gms.common.api.Api$Client r1 = r1.zac
            java.lang.String r2 = "Timing out service connection."
            r1.disconnect(r2)
            r1 = 1
            return r1
        L30:
            r1 = 0
            return r1
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Api.Client zae(com.google.android.gms.common.api.internal.zabq r0) {
            com.google.android.gms.common.api.Api$Client r0 = r0.zac
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.ApiKey zag(com.google.android.gms.common.api.internal.zabq r0) {
            com.google.android.gms.common.api.internal.ApiKey r0 = r0.zad
            return r0
    }

    public static /* bridge */ /* synthetic */ void zai(com.google.android.gms.common.api.internal.zabq r0, com.google.android.gms.common.api.Status r1) {
            r0.zaE(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void zaj(com.google.android.gms.common.api.internal.zabq r0) {
            r0.zaH()
            return
    }

    public static /* bridge */ /* synthetic */ void zak(com.google.android.gms.common.api.internal.zabq r0, int r1) {
            r0.zaI(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void zal(com.google.android.gms.common.api.internal.zabq r1, com.google.android.gms.common.api.internal.zabs r2) {
            java.util.List r0 = r1.zak
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L9
            goto L1c
        L9:
            boolean r2 = r1.zaj
            if (r2 != 0) goto L1c
            com.google.android.gms.common.api.Api$Client r2 = r1.zac
            boolean r2 = r2.isConnected()
            if (r2 != 0) goto L19
            r1.zao()
            return
        L19:
            r1.zaG()
        L1c:
            return
    }

    public static /* bridge */ /* synthetic */ void zam(com.google.android.gms.common.api.internal.zabq r5, com.google.android.gms.common.api.internal.zabs r6) {
            java.util.List r0 = r5.zak
            boolean r0 = r0.remove(r6)
            if (r0 == 0) goto L73
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            r1 = 15
            r0.removeMessages(r1, r6)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            r1 = 16
            r0.removeMessages(r1, r6)
            com.google.android.gms.common.Feature r6 = com.google.android.gms.common.api.internal.zabs.zaa(r6)
            java.util.Queue r0 = r5.zab
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0.size()
            r1.<init>(r0)
            java.util.Queue r0 = r5.zab
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r0.next()
            com.google.android.gms.common.api.internal.zai r2 = (com.google.android.gms.common.api.internal.zai) r2
            boolean r3 = r2 instanceof com.google.android.gms.common.api.internal.zac
            if (r3 == 0) goto L33
            r3 = r2
            com.google.android.gms.common.api.internal.zac r3 = (com.google.android.gms.common.api.internal.zac) r3
            com.google.android.gms.common.Feature[] r3 = r3.zab(r5)
            if (r3 == 0) goto L33
            boolean r3 = com.google.android.gms.common.util.ArrayUtils.contains(r3, r6)
            if (r3 == 0) goto L33
            r1.add(r2)
            goto L33
        L56:
            int r0 = r1.size()
            r2 = 0
        L5b:
            if (r2 >= r0) goto L73
            java.lang.Object r3 = r1.get(r2)
            com.google.android.gms.common.api.internal.zai r3 = (com.google.android.gms.common.api.internal.zai) r3
            java.util.Queue r4 = r5.zab
            r4.remove(r3)
            com.google.android.gms.common.api.UnsupportedApiCallException r4 = new com.google.android.gms.common.api.UnsupportedApiCallException
            r4.<init>(r6)
            r3.zae(r4)
            int r2 = r2 + 1
            goto L5b
        L73:
            return
    }

    public static /* bridge */ /* synthetic */ boolean zax(com.google.android.gms.common.api.internal.zabq r0) {
            boolean r0 = r0.zaj
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zay(com.google.android.gms.common.api.internal.zabq r0, boolean r1) {
            r1 = 0
            boolean r0 = r0.zaO(r1)
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = r1.zaa
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r2)
            android.os.Looper r2 = r2.getLooper()
            if (r0 != r2) goto L14
            r1.zaH()
            return
        L14:
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = r1.zaa
            android.os.Handler r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r2)
            com.google.android.gms.common.api.internal.zabm r0 = new com.google.android.gms.common.api.internal.zabm
            r0.<init>(r1)
            r2.post(r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            r0 = 0
            r1.zar(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r2.zaa
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            android.os.Looper r0 = r0.getLooper()
            if (r1 != r0) goto L14
            r2.zaI(r3)
            return
        L14:
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r2.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.api.internal.zabn r1 = new com.google.android.gms.common.api.internal.zabn
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    public final boolean zaA() {
            r0 = this;
            com.google.android.gms.common.api.Api$Client r0 = r0.zac
            boolean r0 = r0.requiresSignIn()
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean zaB() {
            r1 = this;
            r0 = 1
            boolean r1 = r1.zaO(r0)
            return r1
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(com.google.android.gms.common.ConnectionResult r1, com.google.android.gms.common.api.Api r2, boolean r3) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public final int zab() {
            r0 = this;
            int r0 = r0.zah
            return r0
    }

    public final int zac() {
            r0 = this;
            int r0 = r0.zam
            return r0
    }

    public final com.google.android.gms.common.ConnectionResult zad() {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            com.google.android.gms.common.ConnectionResult r1 = r1.zal
            return r1
    }

    public final com.google.android.gms.common.api.Api.Client zaf() {
            r0 = this;
            com.google.android.gms.common.api.Api$Client r0 = r0.zac
            return r0
    }

    public final java.util.Map zah() {
            r0 = this;
            java.util.Map r0 = r0.zag
            return r0
    }

    public final void zan() {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            r0 = 0
            r1.zal = r0
            return
    }

    public final void zao() {
            r8 = this;
            java.lang.String r0 = "The service for "
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r8.zaa
            android.os.Handler r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r1)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r1)
            com.google.android.gms.common.api.Api$Client r1 = r8.zac
            boolean r1 = r1.isConnected()
            if (r1 != 0) goto L98
            com.google.android.gms.common.api.Api$Client r1 = r8.zac
            boolean r1 = r1.isConnecting()
            if (r1 == 0) goto L1d
            goto L98
        L1d:
            r1 = 10
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = r8.zaa     // Catch: java.lang.IllegalStateException -> L62
            com.google.android.gms.common.internal.zal r3 = com.google.android.gms.common.api.internal.GoogleApiManager.zal(r2)     // Catch: java.lang.IllegalStateException -> L62
            android.content.Context r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zac(r2)     // Catch: java.lang.IllegalStateException -> L62
            com.google.android.gms.common.api.Api$Client r4 = r8.zac     // Catch: java.lang.IllegalStateException -> L62
            int r2 = r3.zab(r2, r4)     // Catch: java.lang.IllegalStateException -> L62
            if (r2 == 0) goto L64
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult     // Catch: java.lang.IllegalStateException -> L62
            r4 = 0
            r3.<init>(r2, r4)     // Catch: java.lang.IllegalStateException -> L62
            java.lang.String r2 = "GoogleApiManager"
            com.google.android.gms.common.api.Api$Client r5 = r8.zac     // Catch: java.lang.IllegalStateException -> L62
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.IllegalStateException -> L62
            java.lang.String r5 = r5.getName()     // Catch: java.lang.IllegalStateException -> L62
            java.lang.String r6 = r3.toString()     // Catch: java.lang.IllegalStateException -> L62
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L62
            r7.<init>(r0)     // Catch: java.lang.IllegalStateException -> L62
            r7.append(r5)     // Catch: java.lang.IllegalStateException -> L62
            java.lang.String r0 = " is not available: "
            r7.append(r0)     // Catch: java.lang.IllegalStateException -> L62
            r7.append(r6)     // Catch: java.lang.IllegalStateException -> L62
            java.lang.String r0 = r7.toString()     // Catch: java.lang.IllegalStateException -> L62
            android.util.Log.w(r2, r0)     // Catch: java.lang.IllegalStateException -> L62
            r8.zar(r3, r4)     // Catch: java.lang.IllegalStateException -> L62
            return
        L62:
            r0 = move-exception
            goto L90
        L64:
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r8.zaa
            com.google.android.gms.common.api.Api$Client r2 = r8.zac
            com.google.android.gms.common.api.internal.ApiKey r3 = r8.zad
            com.google.android.gms.common.api.internal.zabu r4 = new com.google.android.gms.common.api.internal.zabu
            r4.<init>(r0, r2, r3)
            boolean r0 = r2.requiresSignIn()
            if (r0 == 0) goto L80
            com.google.android.gms.common.api.internal.zact r0 = r8.zai
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.api.internal.zact r0 = (com.google.android.gms.common.api.internal.zact) r0
            r0.zae(r4)
        L80:
            com.google.android.gms.common.api.Api$Client r0 = r8.zac     // Catch: java.lang.SecurityException -> L86
            r0.connect(r4)     // Catch: java.lang.SecurityException -> L86
            return
        L86:
            r0 = move-exception
            com.google.android.gms.common.ConnectionResult r2 = new com.google.android.gms.common.ConnectionResult
            r2.<init>(r1)
            r8.zar(r2, r0)
            return
        L90:
            com.google.android.gms.common.ConnectionResult r2 = new com.google.android.gms.common.ConnectionResult
            r2.<init>(r1)
            r8.zar(r2, r0)
        L98:
            return
    }

    public final void zap(com.google.android.gms.common.api.internal.zai r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            com.google.android.gms.common.api.Api$Client r0 = r1.zac
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L21
            boolean r0 = r1.zaM(r2)
            if (r0 == 0) goto L1b
            r1.zaJ()
            return
        L1b:
            java.util.Queue r1 = r1.zab
            r1.add(r2)
            return
        L21:
            java.util.Queue r0 = r1.zab
            r0.add(r2)
            com.google.android.gms.common.ConnectionResult r2 = r1.zal
            if (r2 == 0) goto L37
            boolean r2 = r2.hasResolution()
            if (r2 == 0) goto L37
            com.google.android.gms.common.ConnectionResult r2 = r1.zal
            r0 = 0
            r1.zar(r2, r0)
            return
        L37:
            r1.zao()
            return
    }

    public final void zaq() {
            r1 = this;
            int r0 = r1.zam
            int r0 = r0 + 1
            r1.zam = r0
            return
    }

    public final void zar(com.google.android.gms.common.ConnectionResult r6, java.lang.Exception r7) {
            r5 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            com.google.android.gms.common.api.internal.zact r0 = r5.zai
            if (r0 == 0) goto L10
            r0.zaf()
        L10:
            r5.zan()
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            com.google.android.gms.common.internal.zal r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zal(r0)
            r0.zac()
            r5.zaD(r6)
            com.google.android.gms.common.api.Api$Client r0 = r5.zac
            boolean r0 = r0 instanceof com.google.android.gms.common.internal.service.zap
            r1 = 1
            if (r0 == 0) goto L49
            int r0 = r6.getErrorCode()
            r2 = 24
            if (r0 == r2) goto L49
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            com.google.android.gms.common.api.internal.GoogleApiManager.zat(r0, r1)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            android.os.Handler r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            r3 = 19
            android.os.Message r0 = r0.obtainMessage(r3)
            r3 = 300000(0x493e0, double:1.482197E-318)
            r2.sendMessageDelayed(r0, r3)
        L49:
            int r0 = r6.getErrorCode()
            r2 = 4
            if (r0 != r2) goto L58
            com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.internal.GoogleApiManager.zaf()
            r5.zaE(r6)
            return
        L58:
            java.util.Queue r0 = r5.zab
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L63
            r5.zal = r6
            return
        L63:
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            r2 = 0
            if (r7 == 0) goto L74
            android.os.Handler r6 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r6)
            r6 = 0
            r5.zaF(r2, r7, r6)
            return
        L74:
            boolean r7 = com.google.android.gms.common.api.internal.GoogleApiManager.zaC(r0)
            com.google.android.gms.common.api.internal.ApiKey r0 = r5.zad
            if (r7 == 0) goto Lcc
            com.google.android.gms.common.api.Status r7 = com.google.android.gms.common.api.internal.GoogleApiManager.zag(r0, r6)
            r5.zaF(r7, r2, r1)
            java.util.Queue r7 = r5.zab
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L8c
            goto Lcb
        L8c:
            boolean r7 = r5.zaN(r6)
            if (r7 != 0) goto Lcb
            com.google.android.gms.common.api.internal.GoogleApiManager r7 = r5.zaa
            int r0 = r5.zah
            boolean r7 = r7.zaE(r6, r0)
            if (r7 != 0) goto Lcb
            int r7 = r6.getErrorCode()
            r0 = 18
            if (r7 != r0) goto La6
            r5.zaj = r1
        La6:
            boolean r7 = r5.zaj
            if (r7 == 0) goto Lc2
            com.google.android.gms.common.api.internal.GoogleApiManager r6 = r5.zaa
            com.google.android.gms.common.api.internal.ApiKey r5 = r5.zad
            android.os.Handler r7 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r6)
            android.os.Handler r6 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r6)
            r0 = 9
            android.os.Message r5 = android.os.Message.obtain(r6, r0, r5)
            r0 = 5000(0x1388, double:2.4703E-320)
            r7.sendMessageDelayed(r5, r0)
            return
        Lc2:
            com.google.android.gms.common.api.internal.ApiKey r7 = r5.zad
            com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.internal.GoogleApiManager.zag(r7, r6)
            r5.zaE(r6)
        Lcb:
            return
        Lcc:
            com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.internal.GoogleApiManager.zag(r0, r6)
            r5.zaE(r6)
            return
    }

    public final void zas(com.google.android.gms.common.ConnectionResult r6) {
            r5 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r5.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            com.google.android.gms.common.api.Api$Client r0 = r5.zac
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "onSignInFailed for "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " with "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.disconnect(r1)
            r0 = 0
            r5.zar(r6, r0)
            return
    }

    public final void zat(com.google.android.gms.common.api.internal.zal r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            java.util.Set r1 = r1.zaf
            r1.add(r2)
            return
    }

    public final void zau() {
            r1 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            boolean r0 = r1.zaj
            if (r0 == 0) goto L10
            r1.zao()
        L10:
            return
    }

    public final void zav() {
            r6 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r6.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zaa
            r6.zaE(r0)
            com.google.android.gms.common.api.internal.zaad r0 = r6.zae
            r0.zaf()
            java.util.Map r0 = r6.zag
            java.util.Set r0 = r0.keySet()
            r1 = 0
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey[] r2 = new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey[] r0 = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey[]) r0
            int r2 = r0.length
        L23:
            if (r1 >= r2) goto L37
            r3 = r0[r1]
            com.google.android.gms.common.api.internal.zah r4 = new com.google.android.gms.common.api.internal.zah
            com.google.android.gms.tasks.TaskCompletionSource r5 = new com.google.android.gms.tasks.TaskCompletionSource
            r5.<init>()
            r4.<init>(r3, r5)
            r6.zap(r4)
            int r1 = r1 + 1
            goto L23
        L37:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 4
            r0.<init>(r1)
            r6.zaD(r0)
            com.google.android.gms.common.api.Api$Client r0 = r6.zac
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L52
            com.google.android.gms.common.api.Api$Client r0 = r6.zac
            com.google.android.gms.common.api.internal.zabp r1 = new com.google.android.gms.common.api.internal.zabp
            r1.<init>(r6)
            r0.onUserSignOut(r1)
        L52:
            return
    }

    public final void zaw() {
            r3 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r3.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r0)
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0)
            boolean r0 = r3.zaj
            if (r0 == 0) goto L3f
            r3.zaL()
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r3.zaa
            com.google.android.gms.common.GoogleApiAvailability r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zae(r0)
            android.content.Context r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac(r0)
            int r0 = r1.isGooglePlayServicesAvailable(r0)
            r1 = 18
            if (r0 != r1) goto L2c
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 21
            java.lang.String r2 = "Connection timed out waiting for Google Play services update to complete."
            r0.<init>(r1, r2)
            goto L35
        L2c:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 22
            java.lang.String r2 = "API failed to connect while resuming due to an unknown error."
            r0.<init>(r1, r2)
        L35:
            r3.zaE(r0)
            com.google.android.gms.common.api.Api$Client r3 = r3.zac
            java.lang.String r0 = "Timing out connection while resuming."
            r3.disconnect(r0)
        L3f:
            return
    }

    public final boolean zaz() {
            r0 = this;
            com.google.android.gms.common.api.Api$Client r0 = r0.zac
            boolean r0 = r0.isConnected()
            return r0
    }
}
