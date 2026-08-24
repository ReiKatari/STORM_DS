package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Tasks {
    private Tasks() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <TResult> TResult await(com.google.android.gms.tasks.Task<TResult> r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread()
            com.google.android.gms.common.internal.Preconditions.checkNotGoogleApiHandlerThread()
            java.lang.String r0 = "Task must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            boolean r0 = r2.isComplete()
            if (r0 == 0) goto L16
            java.lang.Object r2 = zza(r2)
            return r2
        L16:
            com.google.android.gms.tasks.zzad r0 = new com.google.android.gms.tasks.zzad
            r1 = 0
            r0.<init>(r1)
            zzb(r2, r0)
            r0.zza()
            java.lang.Object r2 = zza(r2)
            return r2
    }

    public static <TResult> TResult await(com.google.android.gms.tasks.Task<TResult> r2, long r3, java.util.concurrent.TimeUnit r5) {
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread()
            com.google.android.gms.common.internal.Preconditions.checkNotGoogleApiHandlerThread()
            java.lang.String r0 = "Task must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "TimeUnit must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            boolean r0 = r2.isComplete()
            if (r0 == 0) goto L1b
            java.lang.Object r2 = zza(r2)
            return r2
        L1b:
            com.google.android.gms.tasks.zzad r0 = new com.google.android.gms.tasks.zzad
            r1 = 0
            r0.<init>(r1)
            zzb(r2, r0)
            boolean r3 = r0.zzb(r3, r5)
            if (r3 == 0) goto L2f
            java.lang.Object r2 = zza(r2)
            return r2
        L2f:
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = "Timed out waiting for Task"
            r2.<init>(r3)
            throw r2
    }

    @java.lang.Deprecated
    public static <TResult> com.google.android.gms.tasks.Task<TResult> call(java.util.concurrent.Callable<TResult> r1) {
            java.util.concurrent.Executor r0 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            com.google.android.gms.tasks.Task r1 = call(r0, r1)
            return r1
    }

    @java.lang.Deprecated
    public static <TResult> com.google.android.gms.tasks.Task<TResult> call(java.util.concurrent.Executor r2, java.util.concurrent.Callable<TResult> r3) {
            java.lang.String r0 = "Executor must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Callback must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            com.google.android.gms.tasks.zzz r1 = new com.google.android.gms.tasks.zzz
            r1.<init>(r0, r3)
            r2.execute(r1)
            return r0
    }

    public static <TResult> com.google.android.gms.tasks.Task<TResult> forCanceled() {
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            r0.zzc()
            return r0
    }

    public static <TResult> com.google.android.gms.tasks.Task<TResult> forException(java.lang.Exception r1) {
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            r0.zza(r1)
            return r0
    }

    public static <TResult> com.google.android.gms.tasks.Task<TResult> forResult(TResult r1) {
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            r0.zzb(r1)
            return r0
    }

    public static com.google.android.gms.tasks.Task<java.lang.Void> whenAll(java.util.Collection<? extends com.google.android.gms.tasks.Task<?>> r3) {
            r0 = 0
            if (r3 == 0) goto L46
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto La
            goto L46
        La:
            java.util.Iterator r1 = r3.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            com.google.android.gms.tasks.Task r2 = (com.google.android.gms.tasks.Task) r2
            if (r2 == 0) goto L1d
            goto Le
        L1d:
            java.lang.String r3 = "null tasks are not accepted"
            defpackage.u34.x(r3)
            return r0
        L23:
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            com.google.android.gms.tasks.zzaf r1 = new com.google.android.gms.tasks.zzaf
            int r2 = r3.size()
            r1.<init>(r2, r0)
            java.util.Iterator r3 = r3.iterator()
        L35:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r3.next()
            com.google.android.gms.tasks.Task r2 = (com.google.android.gms.tasks.Task) r2
            zzb(r2, r1)
            goto L35
        L45:
            return r0
        L46:
            com.google.android.gms.tasks.Task r3 = forResult(r0)
            return r3
    }

    public static com.google.android.gms.tasks.Task<java.lang.Void> whenAll(com.google.android.gms.tasks.Task<?>... r1) {
            if (r1 == 0) goto Lf
            int r0 = r1.length
            if (r0 != 0) goto L6
            goto Lf
        L6:
            java.util.List r1 = java.util.Arrays.asList(r1)
            com.google.android.gms.tasks.Task r1 = whenAll(r1)
            return r1
        Lf:
            r1 = 0
            com.google.android.gms.tasks.Task r1 = forResult(r1)
            return r1
    }

    public static com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tasks.Task<?>>> whenAllComplete(java.util.Collection<? extends com.google.android.gms.tasks.Task<?>> r1) {
            java.util.concurrent.Executor r0 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            com.google.android.gms.tasks.Task r1 = whenAllComplete(r0, r1)
            return r1
    }

    public static com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tasks.Task<?>>> whenAllComplete(java.util.concurrent.Executor r2, java.util.Collection<? extends com.google.android.gms.tasks.Task<?>> r3) {
            if (r3 == 0) goto L17
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            goto L17
        L9:
            com.google.android.gms.tasks.Task r0 = whenAll(r3)
            com.google.android.gms.tasks.zzab r1 = new com.google.android.gms.tasks.zzab
            r1.<init>(r3)
            com.google.android.gms.tasks.Task r2 = r0.continueWithTask(r2, r1)
            return r2
        L17:
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            com.google.android.gms.tasks.Task r2 = forResult(r2)
            return r2
    }

    public static com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tasks.Task<?>>> whenAllComplete(java.util.concurrent.Executor r1, com.google.android.gms.tasks.Task<?>... r2) {
            if (r2 == 0) goto Lf
            int r0 = r2.length
            if (r0 != 0) goto L6
            goto Lf
        L6:
            java.util.List r2 = java.util.Arrays.asList(r2)
            com.google.android.gms.tasks.Task r1 = whenAllComplete(r1, r2)
            return r1
        Lf:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            com.google.android.gms.tasks.Task r1 = forResult(r1)
            return r1
    }

    public static com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tasks.Task<?>>> whenAllComplete(com.google.android.gms.tasks.Task<?>... r1) {
            if (r1 == 0) goto Lf
            int r0 = r1.length
            if (r0 != 0) goto L6
            goto Lf
        L6:
            java.util.List r1 = java.util.Arrays.asList(r1)
            com.google.android.gms.tasks.Task r1 = whenAllComplete(r1)
            return r1
        Lf:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            com.google.android.gms.tasks.Task r1 = forResult(r1)
            return r1
    }

    public static <TResult> com.google.android.gms.tasks.Task<java.util.List<TResult>> whenAllSuccess(java.util.Collection<? extends com.google.android.gms.tasks.Task> r1) {
            java.util.concurrent.Executor r0 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            com.google.android.gms.tasks.Task r1 = whenAllSuccess(r0, r1)
            return r1
    }

    public static <TResult> com.google.android.gms.tasks.Task<java.util.List<TResult>> whenAllSuccess(java.util.concurrent.Executor r2, java.util.Collection<? extends com.google.android.gms.tasks.Task> r3) {
            if (r3 == 0) goto L17
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            goto L17
        L9:
            com.google.android.gms.tasks.Task r0 = whenAll(r3)
            com.google.android.gms.tasks.zzaa r1 = new com.google.android.gms.tasks.zzaa
            r1.<init>(r3)
            com.google.android.gms.tasks.Task r2 = r0.continueWith(r2, r1)
            return r2
        L17:
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            com.google.android.gms.tasks.Task r2 = forResult(r2)
            return r2
    }

    public static <TResult> com.google.android.gms.tasks.Task<java.util.List<TResult>> whenAllSuccess(java.util.concurrent.Executor r1, com.google.android.gms.tasks.Task... r2) {
            if (r2 == 0) goto Lf
            int r0 = r2.length
            if (r0 != 0) goto L6
            goto Lf
        L6:
            java.util.List r2 = java.util.Arrays.asList(r2)
            com.google.android.gms.tasks.Task r1 = whenAllSuccess(r1, r2)
            return r1
        Lf:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            com.google.android.gms.tasks.Task r1 = forResult(r1)
            return r1
    }

    public static <TResult> com.google.android.gms.tasks.Task<java.util.List<TResult>> whenAllSuccess(com.google.android.gms.tasks.Task... r1) {
            if (r1 == 0) goto Lf
            int r0 = r1.length
            if (r0 != 0) goto L6
            goto Lf
        L6:
            java.util.List r1 = java.util.Arrays.asList(r1)
            com.google.android.gms.tasks.Task r1 = whenAllSuccess(r1)
            return r1
        Lf:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            com.google.android.gms.tasks.Task r1 = forResult(r1)
            return r1
    }

    public static <T> com.google.android.gms.tasks.Task<T> withTimeout(com.google.android.gms.tasks.Task<T> r4, long r5, java.util.concurrent.TimeUnit r7) {
            java.lang.String r0 = "Task must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.String r1 = "Timeout must be positive"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            java.lang.String r0 = "TimeUnit must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7, r0)
            com.google.android.gms.tasks.zzb r0 = new com.google.android.gms.tasks.zzb
            r0.<init>()
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>(r0)
            n28 r2 = new n28
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            com.google.android.gms.tasks.zzx r3 = new com.google.android.gms.tasks.zzx
            r3.<init>(r1)
            long r5 = r7.toMillis(r5)
            r2.postDelayed(r3, r5)
            com.google.android.gms.tasks.zzy r5 = new com.google.android.gms.tasks.zzy
            r5.<init>(r2, r1, r0)
            r4.addOnCompleteListener(r5)
            com.google.android.gms.tasks.Task r4 = r1.getTask()
            return r4
    }

    private static java.lang.Object zza(com.google.android.gms.tasks.Task r1) {
            boolean r0 = r1.isSuccessful()
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r1.getResult()
            return r1
        Lb:
            boolean r0 = r1.isCanceled()
            if (r0 == 0) goto L19
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Task is already canceled"
            r1.<init>(r0)
            throw r1
        L19:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            java.lang.Exception r1 = r1.getException()
            r0.<init>(r1)
            throw r0
    }

    private static void zzb(com.google.android.gms.tasks.Task r1, com.google.android.gms.tasks.zzae r2) {
            java.util.concurrent.Executor r0 = com.google.android.gms.tasks.TaskExecutors.zza
            r1.addOnSuccessListener(r0, r2)
            r1.addOnFailureListener(r0, r2)
            r1.addOnCanceledListener(r0, r2)
            return
    }
}
