package com.google.android.gms.common.internal.service;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zao extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.common.internal.TelemetryLoggingClient {
    public static final /* synthetic */ int zab = 0;
    private static final com.google.android.gms.common.api.Api.ClientKey zac = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zad = null;
    private static final com.google.android.gms.common.api.Api zae = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.common.internal.service.zao.zac = r0
            com.google.android.gms.common.internal.service.zan r1 = new com.google.android.gms.common.internal.service.zan
            r1.<init>()
            com.google.android.gms.common.internal.service.zao.zad = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "ClientTelemetry.API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.common.internal.service.zao.zae = r2
            return
    }

    public zao(android.content.Context r3, com.google.android.gms.common.internal.TelemetryLoggingOptions r4) {
            r2 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.common.internal.service.zao.zae
            com.google.android.gms.common.api.GoogleApi$Settings r1 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r2.<init>(r3, r0, r4, r1)
            return
    }

    @Override // com.google.android.gms.common.internal.TelemetryLoggingClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> log(com.google.android.gms.common.internal.TelemetryData r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.common.Feature r1 = defpackage.rz7.a
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[]{r1}
            r0.setFeatures(r1)
            r1 = 0
            r0.setAutoResolveMissingFeatures(r1)
            com.google.android.gms.common.internal.service.zam r1 = new com.google.android.gms.common.internal.service.zam
            r1.<init>(r3)
            r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r0.build()
            com.google.android.gms.tasks.Task r2 = r2.doBestEffortWrite(r3)
            return r2
    }
}
