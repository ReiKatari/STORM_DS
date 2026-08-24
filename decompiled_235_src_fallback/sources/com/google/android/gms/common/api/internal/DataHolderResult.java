package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class DataHolderResult implements com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Releasable {
    protected final com.google.android.gms.common.data.DataHolder mDataHolder;
    protected final com.google.android.gms.common.api.Status mStatus;

    public DataHolderResult(com.google.android.gms.common.data.DataHolder r3) {
            r2 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            int r1 = r3.getStatusCode()
            r0.<init>(r1)
            r2.<init>(r3, r0)
            return
    }

    public DataHolderResult(com.google.android.gms.common.data.DataHolder r1, com.google.android.gms.common.api.Status r2) {
            r0 = this;
            r0.<init>()
            r0.mStatus = r2
            r0.mDataHolder = r1
            return
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
            r0 = this;
            com.google.android.gms.common.api.Status r0 = r0.mStatus
            return r0
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
            r0 = this;
            com.google.android.gms.common.data.DataHolder r0 = r0.mDataHolder
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }
}
