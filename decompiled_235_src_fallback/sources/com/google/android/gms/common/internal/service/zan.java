package com.google.android.gms.common.internal.service;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zan extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    public zan() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context r1, android.os.Looper r2, com.google.android.gms.common.internal.ClientSettings r3, java.lang.Object r4, com.google.android.gms.common.api.internal.ConnectionCallbacks r5, com.google.android.gms.common.api.internal.OnConnectionFailedListener r6) {
            r0 = this;
            com.google.android.gms.common.internal.TelemetryLoggingOptions r4 = (com.google.android.gms.common.internal.TelemetryLoggingOptions) r4
            com.google.android.gms.common.internal.service.zap r0 = new com.google.android.gms.common.internal.service.zap
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }
}
