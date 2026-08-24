package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zada<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.TransformedResult<R> implements com.google.android.gms.common.api.ResultCallback<R> {
    private com.google.android.gms.common.api.ResultTransform zaa;
    private com.google.android.gms.common.api.internal.zada zab;
    private volatile com.google.android.gms.common.api.ResultCallbacks zac;
    private com.google.android.gms.common.api.PendingResult zad;
    private final java.lang.Object zae;
    private com.google.android.gms.common.api.Status zaf;
    private final java.lang.ref.WeakReference zag;
    private final com.google.android.gms.common.api.internal.zacz zah;
    private boolean zai;

    public zada(java.lang.ref.WeakReference r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zaa = r0
            r2.zab = r0
            r2.zac = r0
            r2.zad = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.zae = r1
            r2.zaf = r0
            r0 = 0
            r2.zai = r0
            java.lang.String r0 = "GoogleApiClient reference must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            r2.zag = r3
            java.lang.Object r3 = r3.get()
            com.google.android.gms.common.api.GoogleApiClient r3 = (com.google.android.gms.common.api.GoogleApiClient) r3
            com.google.android.gms.common.api.internal.zacz r0 = new com.google.android.gms.common.api.internal.zacz
            if (r3 == 0) goto L2e
            android.os.Looper r3 = r3.getLooper()
            goto L32
        L2e:
            android.os.Looper r3 = android.os.Looper.getMainLooper()
        L32:
            r0.<init>(r2, r3)
            r2.zah = r0
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.ResultTransform zaa(com.google.android.gms.common.api.internal.zada r0) {
            com.google.android.gms.common.api.ResultTransform r0 = r0.zaa
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zacz zab(com.google.android.gms.common.api.internal.zada r0) {
            com.google.android.gms.common.api.internal.zacz r0 = r0.zah
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zada zac(com.google.android.gms.common.api.internal.zada r0) {
            com.google.android.gms.common.api.internal.zada r0 = r0.zab
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zad(com.google.android.gms.common.api.internal.zada r0) {
            java.lang.Object r0 = r0.zae
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.ref.WeakReference zae(com.google.android.gms.common.api.internal.zada r0) {
            java.lang.ref.WeakReference r0 = r0.zag
            return r0
    }

    public static /* bridge */ /* synthetic */ void zaf(com.google.android.gms.common.api.internal.zada r0, com.google.android.gms.common.api.Result r1) {
            zan(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void zag(com.google.android.gms.common.api.internal.zada r0, com.google.android.gms.common.api.Status r1) {
            r0.zaj(r1)
            return
    }

    private final void zaj(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            java.lang.Object r0 = r1.zae
            monitor-enter(r0)
            r1.zaf = r2     // Catch: java.lang.Throwable -> La
            r1.zal(r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    private final void zak() {
            r2 = this;
            com.google.android.gms.common.api.ResultTransform r0 = r2.zaa
            if (r0 != 0) goto L8
            com.google.android.gms.common.api.ResultCallbacks r0 = r2.zac
            if (r0 == 0) goto L2f
        L8:
            java.lang.ref.WeakReference r0 = r2.zag
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.GoogleApiClient r0 = (com.google.android.gms.common.api.GoogleApiClient) r0
            boolean r1 = r2.zai
            if (r1 != 0) goto L20
            com.google.android.gms.common.api.ResultTransform r1 = r2.zaa
            if (r1 == 0) goto L20
            if (r0 == 0) goto L20
            r0.zao(r2)
            r0 = 1
            r2.zai = r0
        L20:
            com.google.android.gms.common.api.Status r0 = r2.zaf
            if (r0 == 0) goto L28
            r2.zal(r0)
            return
        L28:
            com.google.android.gms.common.api.PendingResult r0 = r2.zad
            if (r0 == 0) goto L2f
            r0.setResultCallback(r2)
        L2f:
            return
    }

    private final void zal(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            com.google.android.gms.common.api.ResultTransform r1 = r2.zaa     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            com.google.android.gms.common.api.Status r3 = r1.onFailure(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "onFailure must not return null"
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r1)     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.Status r3 = (com.google.android.gms.common.api.Status) r3     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.internal.zada r2 = r2.zab     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.internal.zada r2 = (com.google.android.gms.common.api.internal.zada) r2     // Catch: java.lang.Throwable -> L1f
            r2.zaj(r3)     // Catch: java.lang.Throwable -> L1f
            goto L32
        L1f:
            r2 = move-exception
            goto L34
        L21:
            boolean r1 = r2.zam()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L32
            com.google.android.gms.common.api.ResultCallbacks r2 = r2.zac     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.ResultCallbacks r2 = (com.google.android.gms.common.api.ResultCallbacks) r2     // Catch: java.lang.Throwable -> L1f
            r2.onFailure(r3)     // Catch: java.lang.Throwable -> L1f
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r2
    }

    private final boolean zam() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zag
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.GoogleApiClient r0 = (com.google.android.gms.common.api.GoogleApiClient) r0
            com.google.android.gms.common.api.ResultCallbacks r1 = r1.zac
            if (r1 == 0) goto L10
            if (r0 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    private static final void zan(com.google.android.gms.common.api.Result r3) {
            boolean r0 = r3 instanceof com.google.android.gms.common.api.Releasable
            if (r0 == 0) goto L1b
            r0 = r3
            com.google.android.gms.common.api.Releasable r0 = (com.google.android.gms.common.api.Releasable) r0     // Catch: java.lang.RuntimeException -> Lb
            r0.release()     // Catch: java.lang.RuntimeException -> Lb
            return
        Lb:
            r0 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "TransformedResultImpl"
            java.lang.String r2 = "Unable to release "
            java.lang.String r3 = r2.concat(r3)
            android.util.Log.w(r1, r3, r0)
        L1b:
            return
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final void andFinally(com.google.android.gms.common.api.ResultCallbacks<? super R> r6) {
            r5 = this;
            java.lang.Object r0 = r5.zae
            monitor-enter(r0)
            com.google.android.gms.common.api.ResultCallbacks r1 = r5.zac     // Catch: java.lang.Throwable -> L22
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lb
            r1 = r3
            goto Lc
        Lb:
            r1 = r2
        Lc:
            java.lang.String r4 = "Cannot call andFinally() twice."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r4)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.common.api.ResultTransform r1 = r5.zaa     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L16
            r2 = r3
        L16:
            java.lang.String r1 = "Cannot call then() and andFinally() on the same TransformedResult."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r1)     // Catch: java.lang.Throwable -> L22
            r5.zac = r6     // Catch: java.lang.Throwable -> L22
            r5.zak()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r5
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(com.google.android.gms.common.api.Result r4) {
            r3 = this;
            java.lang.Object r0 = r3.zae
            monitor-enter(r0)
            com.google.android.gms.common.api.Status r1 = r4.getStatus()     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r1.isSuccess()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L32
            com.google.android.gms.common.api.ResultTransform r1 = r3.zaa     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            java.util.concurrent.ExecutorService r1 = com.google.android.gms.common.api.internal.zaco.zaa()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.common.api.internal.zacy r2 = new com.google.android.gms.common.api.internal.zacy     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1e
            r1.submit(r2)     // Catch: java.lang.Throwable -> L1e
            goto L3c
        L1e:
            r3 = move-exception
            goto L3e
        L20:
            boolean r1 = r3.zam()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L3c
            com.google.android.gms.common.api.ResultCallbacks r3 = r3.zac     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.common.api.ResultCallbacks r3 = (com.google.android.gms.common.api.ResultCallbacks) r3     // Catch: java.lang.Throwable -> L1e
            r3.onSuccess(r4)     // Catch: java.lang.Throwable -> L1e
            goto L3c
        L32:
            com.google.android.gms.common.api.Status r1 = r4.getStatus()     // Catch: java.lang.Throwable -> L1e
            r3.zaj(r1)     // Catch: java.lang.Throwable -> L1e
            zan(r4)     // Catch: java.lang.Throwable -> L1e
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> r6) {
            r5 = this;
            java.lang.Object r0 = r5.zae
            monitor-enter(r0)
            com.google.android.gms.common.api.ResultTransform r1 = r5.zaa     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lb
            r1 = r3
            goto Lc
        Lb:
            r1 = r2
        Lc:
            java.lang.String r4 = "Cannot call then() twice."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r4)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.common.api.ResultCallbacks r1 = r5.zac     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L16
            r2 = r3
        L16:
            java.lang.String r1 = "Cannot call then() and andFinally() on the same TransformedResult."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r1)     // Catch: java.lang.Throwable -> L2b
            r5.zaa = r6     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.common.api.internal.zada r6 = new com.google.android.gms.common.api.internal.zada     // Catch: java.lang.Throwable -> L2b
            java.lang.ref.WeakReference r1 = r5.zag     // Catch: java.lang.Throwable -> L2b
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2b
            r5.zab = r6     // Catch: java.lang.Throwable -> L2b
            r5.zak()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return r6
        L2b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r5
    }

    public final void zah() {
            r1 = this;
            r0 = 0
            r1.zac = r0
            return
    }

    public final void zai(com.google.android.gms.common.api.PendingResult r2) {
            r1 = this;
            java.lang.Object r0 = r1.zae
            monitor-enter(r0)
            r1.zad = r2     // Catch: java.lang.Throwable -> La
            r1.zak()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }
}
