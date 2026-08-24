package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TaskUtil {
    public TaskUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setResultOrApiException(com.google.android.gms.common.api.Status r1, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r2) {
            r0 = 0
            setResultOrApiException(r1, r0, r2)
            return
    }

    public static <ResultT> void setResultOrApiException(com.google.android.gms.common.api.Status r1, ResultT r2, com.google.android.gms.tasks.TaskCompletionSource<ResultT> r3) {
            boolean r0 = r1.isSuccess()
            if (r0 == 0) goto La
            r3.setResult(r2)
            return
        La:
            com.google.android.gms.common.api.ApiException r1 = com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(r1)
            r3.setException(r1)
            return
    }

    @java.lang.Deprecated
    public static com.google.android.gms.tasks.Task<java.lang.Void> toVoidTaskThatFailsOnFalse(com.google.android.gms.tasks.Task<java.lang.Boolean> r1) {
            com.google.android.gms.common.api.internal.zacx r0 = new com.google.android.gms.common.api.internal.zacx
            r0.<init>()
            com.google.android.gms.tasks.Task r1 = r1.continueWith(r0)
            return r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static <ResultT> boolean trySetResultOrApiException(com.google.android.gms.common.api.Status r1, ResultT r2, com.google.android.gms.tasks.TaskCompletionSource<ResultT> r3) {
            boolean r0 = r1.isSuccess()
            if (r0 == 0) goto Lb
            boolean r1 = r3.trySetResult(r2)
            return r1
        Lb:
            com.google.android.gms.common.api.ApiException r1 = com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(r1)
            boolean r1 = r3.trySetException(r1)
            return r1
    }
}
