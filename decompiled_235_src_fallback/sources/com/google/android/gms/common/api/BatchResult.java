package com.google.android.gms.common.api;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class BatchResult implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zaa;
    private final com.google.android.gms.common.api.PendingResult[] zab;

    public BatchResult(com.google.android.gms.common.api.Status r1, com.google.android.gms.common.api.PendingResult[] r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
            r0 = this;
            com.google.android.gms.common.api.Status r0 = r0.zaa
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public <R extends com.google.android.gms.common.api.Result> R take(com.google.android.gms.common.api.BatchResultToken<R> r3) {
            r2 = this;
            com.google.android.gms.common.api.PendingResult[] r0 = r2.zab
            int r1 = r3.mId
            int r0 = r0.length
            if (r1 >= r0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r1 = "The result token does not belong to this batch"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            com.google.android.gms.common.api.PendingResult[] r2 = r2.zab
            int r3 = r3.mId
            r2 = r2[r3]
            r0 = 0
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.gms.common.api.Result r2 = r2.await(r0, r3)
            return r2
    }
}
