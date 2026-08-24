package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class StatusCallback extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder;

    public StatusCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> r1) {
            r0 = this;
            r0.<init>()
            r0.resultHolder = r1
            return
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public void onResult(com.google.android.gms.common.api.Status r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder<com.google.android.gms.common.api.Status> r0 = r0.resultHolder
            r0.setResult(r1)
            return
    }
}
