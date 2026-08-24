package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.PendingResult<R> {
    static final java.lang.ThreadLocal zaa = null;
    public static final /* synthetic */ int zad = 0;
    private com.google.android.gms.common.api.internal.zas resultGuardian;
    protected final com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler zab;
    protected final java.lang.ref.WeakReference zac;
    private final java.lang.Object zae;
    private final java.util.concurrent.CountDownLatch zaf;
    private final java.util.ArrayList zag;
    private com.google.android.gms.common.api.ResultCallback zah;
    private final java.util.concurrent.atomic.AtomicReference zai;
    private com.google.android.gms.common.api.Result zaj;
    private com.google.android.gms.common.api.Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private com.google.android.gms.common.internal.ICancelToken zao;
    private volatile com.google.android.gms.common.api.internal.zada zap;
    private boolean zaq;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class CallbackHandler<R extends com.google.android.gms.common.api.Result> extends defpackage.b08 {
        public CallbackHandler() {
                r1 = this;
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
                return
        }

        public CallbackHandler(android.os.Looper r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r2) {
                r1 = this;
                int r1 = r2.what
                r0 = 1
                if (r1 == r0) goto L23
                r0 = 2
                if (r1 == r0) goto L19
                java.lang.String r2 = "Don't know how to handle message: "
                java.lang.String r1 = defpackage.lb1.g(r1, r2)
                java.lang.Exception r2 = new java.lang.Exception
                r2.<init>()
                java.lang.String r0 = "BasePendingResult"
                android.util.Log.wtf(r0, r1, r2)
                return
            L19:
                java.lang.Object r1 = r2.obj
                com.google.android.gms.common.api.internal.BasePendingResult r1 = (com.google.android.gms.common.api.internal.BasePendingResult) r1
                com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.RESULT_TIMEOUT
                r1.forceFailureUnlessReady(r2)
                return
            L23:
                java.lang.Object r1 = r2.obj
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r2 = r1.first
                com.google.android.gms.common.api.ResultCallback r2 = (com.google.android.gms.common.api.ResultCallback) r2
                java.lang.Object r1 = r1.second
                com.google.android.gms.common.api.Result r1 = (com.google.android.gms.common.api.Result) r1
                r2.onResult(r1)     // Catch: java.lang.RuntimeException -> L33
                return
            L33:
                r2 = move-exception
                com.google.android.gms.common.api.internal.BasePendingResult.zal(r1)
                throw r2
        }

        public final void zaa(com.google.android.gms.common.api.ResultCallback r2, com.google.android.gms.common.api.Result r3) {
                r1 = this;
                int r0 = com.google.android.gms.common.api.internal.BasePendingResult.zad
                java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
                com.google.android.gms.common.api.ResultCallback r2 = (com.google.android.gms.common.api.ResultCallback) r2
                android.util.Pair r0 = new android.util.Pair
                r0.<init>(r2, r3)
                r2 = 1
                android.os.Message r2 = r1.obtainMessage(r2, r0)
                r1.sendMessage(r2)
                return
        }
    }

    static {
            com.google.android.gms.common.api.internal.zaq r0 = new com.google.android.gms.common.api.internal.zaq
            r0.<init>()
            com.google.android.gms.common.api.internal.BasePendingResult.zaa = r0
            return
    }

    @java.lang.Deprecated
    public BasePendingResult() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zae = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.zaf = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zag = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.zai = r0
            r0 = 0
            r2.zaq = r0
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r0 = new com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.zab = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r2.zac = r0
            return
    }

    @java.lang.Deprecated
    public BasePendingResult(android.os.Looper r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zae = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.zaf = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zag = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.zai = r0
            r0 = 0
            r2.zaq = r0
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r0 = new com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler
            r0.<init>(r3)
            r2.zab = r0
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r0 = 0
            r3.<init>(r0)
            r2.zac = r3
            return
    }

    public BasePendingResult(com.google.android.gms.common.api.GoogleApiClient r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zae = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.zaf = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zag = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.zai = r0
            r0 = 0
            r2.zaq = r0
            if (r3 == 0) goto L2a
            android.os.Looper r0 = r3.getLooper()
            goto L2e
        L2a:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L2e:
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r1 = new com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler
            r1.<init>(r0)
            r2.zab = r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.zac = r0
            return
    }

    public BasePendingResult(com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<R> r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zae = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.zaf = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zag = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.zai = r0
            r0 = 0
            r2.zaq = r0
            java.lang.String r0 = "CallbackHandler must not be null"
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r3 = (com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler) r3
            r2.zab = r3
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r0 = 0
            r3.<init>(r0)
            r2.zac = r3
            return
    }

    private final com.google.android.gms.common.api.Result zaa() {
            r4 = this;
            java.lang.Object r0 = r4.zae
            monitor-enter(r0)
            boolean r1 = r4.zal     // Catch: java.lang.Throwable -> L37
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r3)     // Catch: java.lang.Throwable -> L37
            boolean r1 = r4.isReady()     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "Result is not ready."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r3)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.common.api.Result r1 = r4.zaj     // Catch: java.lang.Throwable -> L37
            r3 = 0
            r4.zaj = r3     // Catch: java.lang.Throwable -> L37
            r4.zah = r3     // Catch: java.lang.Throwable -> L37
            r4.zal = r2     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.atomic.AtomicReference r0 = r4.zai
            java.lang.Object r0 = r0.getAndSet(r3)
            com.google.android.gms.common.api.internal.zadb r0 = (com.google.android.gms.common.api.internal.zadb) r0
            if (r0 == 0) goto L30
            com.google.android.gms.common.api.internal.zadc r0 = r0.zaa
            java.util.Set r0 = r0.zab
            r0.remove(r4)
        L30:
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.common.api.Result r4 = (com.google.android.gms.common.api.Result) r4
            return r4
        L37:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r4
    }

    private final void zab(com.google.android.gms.common.api.Result r5) {
            r4 = this;
            r4.zaj = r5
            com.google.android.gms.common.api.Status r5 = r5.getStatus()
            r4.zak = r5
            r5 = 0
            r4.zao = r5
            java.util.concurrent.CountDownLatch r0 = r4.zaf
            r0.countDown()
            boolean r0 = r4.zam
            if (r0 == 0) goto L17
            r4.zah = r5
            goto L38
        L17:
            com.google.android.gms.common.api.ResultCallback r0 = r4.zah
            if (r0 != 0) goto L29
            com.google.android.gms.common.api.Result r0 = r4.zaj
            boolean r0 = r0 instanceof com.google.android.gms.common.api.Releasable
            if (r0 == 0) goto L38
            com.google.android.gms.common.api.internal.zas r0 = new com.google.android.gms.common.api.internal.zas
            r0.<init>(r4, r5)
            r4.resultGuardian = r0
            goto L38
        L29:
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r5 = r4.zab
            r1 = 2
            r5.removeMessages(r1)
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r5 = r4.zab
            com.google.android.gms.common.api.Result r1 = r4.zaa()
            r5.zaa(r0, r1)
        L38:
            java.util.ArrayList r5 = r4.zag
            int r0 = r5.size()
            r1 = 0
        L3f:
            if (r1 >= r0) goto L4f
            java.lang.Object r2 = r5.get(r1)
            com.google.android.gms.common.api.PendingResult$StatusListener r2 = (com.google.android.gms.common.api.PendingResult.StatusListener) r2
            com.google.android.gms.common.api.Status r3 = r4.zak
            r2.onComplete(r3)
            int r1 = r1 + 1
            goto L3f
        L4f:
            java.util.ArrayList r4 = r4.zag
            r4.clear()
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result zaj(com.google.android.gms.common.api.internal.BasePendingResult r0) {
            com.google.android.gms.common.api.Result r0 = r0.zaj
            return r0
    }

    public static void zal(com.google.android.gms.common.api.Result r3) {
            boolean r0 = r3 instanceof com.google.android.gms.common.api.Releasable
            if (r0 == 0) goto L1b
            r0 = r3
            com.google.android.gms.common.api.Releasable r0 = (com.google.android.gms.common.api.Releasable) r0     // Catch: java.lang.RuntimeException -> Lb
            r0.release()     // Catch: java.lang.RuntimeException -> Lb
            return
        Lb:
            r0 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "BasePendingResult"
            java.lang.String r2 = "Unable to release "
            java.lang.String r3 = r2.concat(r3)
            android.util.Log.w(r1, r3, r0)
        L1b:
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(com.google.android.gms.common.api.PendingResult.StatusListener r3) {
            r2 = this;
            if (r3 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "Callback cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            boolean r1 = r2.isReady()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            com.google.android.gms.common.api.Status r2 = r2.zak     // Catch: java.lang.Throwable -> L19
            r3.onComplete(r2)     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r2 = move-exception
            goto L22
        L1b:
            java.util.ArrayList r2 = r2.zag     // Catch: java.lang.Throwable -> L19
            r2.add(r3)     // Catch: java.lang.Throwable -> L19
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r2
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final R await() {
            r3 = this;
            java.lang.String r0 = "await must not be called on the UI thread"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
            boolean r0 = r3.zal
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Result has already been consumed"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r2)
            com.google.android.gms.common.api.internal.zada r0 = r3.zap
            if (r0 != 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            java.lang.String r0 = "Cannot await if then() has been called."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r0)
            java.util.concurrent.CountDownLatch r0 = r3.zaf     // Catch: java.lang.InterruptedException -> L1f
            r0.await()     // Catch: java.lang.InterruptedException -> L1f
            goto L24
        L1f:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_INTERRUPTED
            r3.forceFailureUnlessReady(r0)
        L24:
            boolean r0 = r3.isReady()
            java.lang.String r1 = "Result is not ready."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            com.google.android.gms.common.api.Result r3 = r3.zaa()
            return r3
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final R await(long r4, java.util.concurrent.TimeUnit r6) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lb
            java.lang.String r0 = "await must not be called on the UI thread when time is greater than zero."
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
        Lb:
            boolean r0 = r3.zal
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r2)
            com.google.android.gms.common.api.internal.zada r0 = r3.zap
            if (r0 != 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            java.lang.String r0 = "Cannot await if then() has been called."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r0)
            java.util.concurrent.CountDownLatch r0 = r3.zaf     // Catch: java.lang.InterruptedException -> L2d
            boolean r4 = r0.await(r4, r6)     // Catch: java.lang.InterruptedException -> L2d
            if (r4 != 0) goto L32
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.RESULT_TIMEOUT     // Catch: java.lang.InterruptedException -> L2d
            r3.forceFailureUnlessReady(r4)     // Catch: java.lang.InterruptedException -> L2d
            goto L32
        L2d:
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.RESULT_INTERRUPTED
            r3.forceFailureUnlessReady(r4)
        L32:
            boolean r4 = r3.isReady()
            java.lang.String r5 = "Result is not ready."
            com.google.android.gms.common.internal.Preconditions.checkState(r4, r5)
            com.google.android.gms.common.api.Result r3 = r3.zaa()
            return r3
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public void cancel() {
            r2 = this;
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            boolean r1 = r2.zam     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L29
            boolean r1 = r2.zal     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto Lc
            goto L29
        Lc:
            com.google.android.gms.common.internal.ICancelToken r1 = r2.zao     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            r1.cancel()     // Catch: java.lang.Throwable -> L14 android.os.RemoteException -> L16
            goto L16
        L14:
            r2 = move-exception
            goto L2b
        L16:
            com.google.android.gms.common.api.Result r1 = r2.zaj     // Catch: java.lang.Throwable -> L14
            zal(r1)     // Catch: java.lang.Throwable -> L14
            r1 = 1
            r2.zam = r1     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_CANCELED     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.common.api.Result r1 = r2.createFailedResult(r1)     // Catch: java.lang.Throwable -> L14
            r2.zab(r1)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    public abstract R createFailedResult(com.google.android.gms.common.api.Status r1);

    @java.lang.Deprecated
    public final void forceFailureUnlessReady(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            boolean r1 = r2.isReady()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            com.google.android.gms.common.api.Result r3 = r2.createFailedResult(r3)     // Catch: java.lang.Throwable -> L14
            r2.setResult(r3)     // Catch: java.lang.Throwable -> L14
            r3 = 1
            r2.zan = r3     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
            r1 = this;
            java.lang.Object r0 = r1.zae
            monitor-enter(r0)
            boolean r1 = r1.zam     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final boolean isReady() {
            r4 = this;
            java.util.concurrent.CountDownLatch r4 = r4.zaf
            long r0 = r4.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            r4 = 1
            return r4
        Le:
            r4 = 0
            return r4
    }

    public final void setCancelToken(com.google.android.gms.common.internal.ICancelToken r2) {
            r1 = this;
            java.lang.Object r0 = r1.zae
            monitor-enter(r0)
            r1.zao = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final void setResult(R r4) {
            r3 = this;
            java.lang.Object r0 = r3.zae
            monitor-enter(r0)
            boolean r1 = r3.zan     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            boolean r1 = r3.zam     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            r3.isReady()     // Catch: java.lang.Throwable -> L27
            boolean r1 = r3.isReady()     // Catch: java.lang.Throwable -> L27
            r1 = r1 ^ 1
            java.lang.String r2 = "Results have already been set"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L27
            boolean r1 = r3.zal     // Catch: java.lang.Throwable -> L27
            r1 = r1 ^ 1
            java.lang.String r2 = "Result has already been consumed"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L27
            r3.zab(r4)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r3 = move-exception
            goto L2e
        L29:
            zal(r4)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r5) {
            r4 = this;
            java.lang.Object r0 = r4.zae
            monitor-enter(r0)
            if (r5 != 0) goto Lc
            r5 = 0
            r4.zah = r5     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r4 = move-exception
            goto L3c
        Lc:
            boolean r1 = r4.zal     // Catch: java.lang.Throwable -> La
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r3)     // Catch: java.lang.Throwable -> La
            com.google.android.gms.common.api.internal.zada r1 = r4.zap     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto L1a
            goto L1b
        L1a:
            r2 = 0
        L1b:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r1)     // Catch: java.lang.Throwable -> La
            boolean r1 = r4.isCanceled()     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        L28:
            boolean r1 = r4.isReady()     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L38
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r1 = r4.zab     // Catch: java.lang.Throwable -> La
            com.google.android.gms.common.api.Result r4 = r4.zaa()     // Catch: java.lang.Throwable -> La
            r1.zaa(r5, r4)     // Catch: java.lang.Throwable -> La
            goto L3a
        L38:
            r4.zah = r5     // Catch: java.lang.Throwable -> La
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r4
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r5, long r6, java.util.concurrent.TimeUnit r8) {
            r4 = this;
            java.lang.Object r0 = r4.zae
            monitor-enter(r0)
            if (r5 != 0) goto Lc
            r5 = 0
            r4.zah = r5     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r4 = move-exception
            goto L4a
        Lc:
            boolean r1 = r4.zal     // Catch: java.lang.Throwable -> La
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r3)     // Catch: java.lang.Throwable -> La
            com.google.android.gms.common.api.internal.zada r1 = r4.zap     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto L1a
            goto L1b
        L1a:
            r2 = 0
        L1b:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r1)     // Catch: java.lang.Throwable -> La
            boolean r1 = r4.isCanceled()     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        L28:
            boolean r1 = r4.isReady()     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L38
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r6 = r4.zab     // Catch: java.lang.Throwable -> La
            com.google.android.gms.common.api.Result r4 = r4.zaa()     // Catch: java.lang.Throwable -> La
            r6.zaa(r5, r4)     // Catch: java.lang.Throwable -> La
            goto L48
        L38:
            r4.zah = r5     // Catch: java.lang.Throwable -> La
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r5 = r4.zab     // Catch: java.lang.Throwable -> La
            long r6 = r8.toMillis(r6)     // Catch: java.lang.Throwable -> La
            r8 = 2
            android.os.Message r4 = r5.obtainMessage(r8, r4)     // Catch: java.lang.Throwable -> La
            r5.sendMessageDelayed(r4, r6)     // Catch: java.lang.Throwable -> La
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r4
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> r6) {
            r5 = this;
            boolean r0 = r5.zal
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r2)
            java.lang.Object r0 = r5.zae
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.zada r2 = r5.zap     // Catch: java.lang.Throwable -> L4e
            r3 = 0
            if (r2 != 0) goto L13
            r2 = r1
            goto L14
        L13:
            r2 = r3
        L14:
            java.lang.String r4 = "Cannot call then() twice."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r4)     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.common.api.ResultCallback r2 = r5.zah     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L1e
            r3 = r1
        L1e:
            java.lang.String r2 = "Cannot call then() if callbacks are set."
            com.google.android.gms.common.internal.Preconditions.checkState(r3, r2)     // Catch: java.lang.Throwable -> L4e
            boolean r2 = r5.zam     // Catch: java.lang.Throwable -> L4e
            r2 = r2 ^ r1
            java.lang.String r3 = "Cannot call then() if result was canceled."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r3)     // Catch: java.lang.Throwable -> L4e
            r5.zaq = r1     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.common.api.internal.zada r1 = new com.google.android.gms.common.api.internal.zada     // Catch: java.lang.Throwable -> L4e
            java.lang.ref.WeakReference r2 = r5.zac     // Catch: java.lang.Throwable -> L4e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4e
            r5.zap = r1     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.common.api.internal.zada r1 = r5.zap     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.common.api.TransformedResult r6 = r1.then(r6)     // Catch: java.lang.Throwable -> L4e
            boolean r1 = r5.isReady()     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L50
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r1 = r5.zab     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.common.api.internal.zada r2 = r5.zap     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.common.api.Result r5 = r5.zaa()     // Catch: java.lang.Throwable -> L4e
            r1.zaa(r2, r5)     // Catch: java.lang.Throwable -> L4e
            goto L54
        L4e:
            r5 = move-exception
            goto L56
        L50:
            com.google.android.gms.common.api.internal.zada r1 = r5.zap     // Catch: java.lang.Throwable -> L4e
            r5.zah = r1     // Catch: java.lang.Throwable -> L4e
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            return r6
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r5
    }

    public final void zak() {
            r2 = this;
            boolean r0 = r2.zaq
            r1 = 1
            if (r0 != 0) goto L15
            java.lang.ThreadLocal r0 = com.google.android.gms.common.api.internal.BasePendingResult.zaa
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r2.zaq = r1
            return
    }

    public final boolean zam() {
            r2 = this;
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            java.lang.ref.WeakReference r1 = r2.zac     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.common.api.GoogleApiClient r1 = (com.google.android.gms.common.api.GoogleApiClient) r1     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            boolean r1 = r2.zaq     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L17
            goto L14
        L12:
            r2 = move-exception
            goto L1d
        L14:
            r2.cancel()     // Catch: java.lang.Throwable -> L12
        L17:
            boolean r2 = r2.isCanceled()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r2
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    public final void zan(com.google.android.gms.common.api.internal.zadb r1) {
            r0 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r0.zai
            r0.set(r1)
            return
    }
}
