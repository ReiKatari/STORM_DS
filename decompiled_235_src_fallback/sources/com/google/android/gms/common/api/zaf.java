package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaf<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BasePendingResult<R> {
    private final com.google.android.gms.common.api.Result zae;

    public zaf(com.google.android.gms.common.api.Result r2) {
            r1 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0)
            r1.zae = r2
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.common.api.Result r0 = r1.zae
            int r2 = r2.getStatusCode()
            com.google.android.gms.common.api.Status r0 = r0.getStatus()
            int r0 = r0.getStatusCode()
            if (r2 != r0) goto L13
            com.google.android.gms.common.api.Result r1 = r1.zae
            return r1
        L13:
            java.lang.String r1 = "Creating failed results is not supported"
            defpackage.fa6.h(r1)
            r1 = 0
            return r1
    }
}
