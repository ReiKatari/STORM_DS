package com.google.android.gms.common.api;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ResolvableApiException extends com.google.android.gms.common.api.ApiException {
    public ResolvableApiException(com.google.android.gms.common.api.Status r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public android.app.PendingIntent getResolution() {
            r0 = this;
            com.google.android.gms.common.api.Status r0 = r0.getStatus()
            android.app.PendingIntent r0 = r0.getResolution()
            return r0
    }

    public void startResolutionForResult(android.app.Activity r1, int r2) {
            r0 = this;
            com.google.android.gms.common.api.Status r0 = r0.getStatus()
            r0.startResolutionForResult(r1, r2)
            return
    }
}
