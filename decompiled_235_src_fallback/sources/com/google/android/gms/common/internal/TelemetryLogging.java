package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TelemetryLogging {
    private TelemetryLogging() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.common.internal.TelemetryLoggingClient getClient(android.content.Context r1) {
            com.google.android.gms.common.internal.TelemetryLoggingOptions r0 = com.google.android.gms.common.internal.TelemetryLoggingOptions.zaa
            com.google.android.gms.common.internal.TelemetryLoggingClient r1 = getClient(r1, r0)
            return r1
    }

    public static com.google.android.gms.common.internal.TelemetryLoggingClient getClient(android.content.Context r1, com.google.android.gms.common.internal.TelemetryLoggingOptions r2) {
            com.google.android.gms.common.internal.service.zao r0 = new com.google.android.gms.common.internal.service.zao
            r0.<init>(r1, r2)
            return r0
    }
}
