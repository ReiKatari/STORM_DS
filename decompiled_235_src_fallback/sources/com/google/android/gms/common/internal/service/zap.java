package com.google.android.gms.common.internal.service;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zap extends com.google.android.gms.common.internal.GmsClient {
    private final com.google.android.gms.common.internal.TelemetryLoggingOptions zaa;

    public zap(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.common.internal.TelemetryLoggingOptions r11, com.google.android.gms.common.api.internal.ConnectionCallbacks r12, com.google.android.gms.common.api.internal.OnConnectionFailedListener r13) {
            r7 = this;
            r3 = 270(0x10e, float:3.78E-43)
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.zaa = r11
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r1 = "com.google.android.gms.common.internal.service.IClientTelemetryService"
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r0 = r1 instanceof com.google.android.gms.common.internal.service.zai
            if (r0 == 0) goto L11
            com.google.android.gms.common.internal.service.zai r1 = (com.google.android.gms.common.internal.service.zai) r1
            return r1
        L11:
            com.google.android.gms.common.internal.service.zai r1 = new com.google.android.gms.common.internal.service.zai
            r1.<init>(r2)
            return r1
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
            r0 = this;
            com.google.android.gms.common.Feature[] r0 = defpackage.rz7.b
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.os.Bundle getGetServiceRequestExtraArgs() {
            r0 = this;
            com.google.android.gms.common.internal.TelemetryLoggingOptions r0 = r0.zaa
            android.os.Bundle r0 = r0.zaa()
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r0 = this;
            r0 = 203400000(0xc1fa340, float:1.2298041E-31)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
            r0 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.service.IClientTelemetryService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
            r0 = this;
            java.lang.String r0 = "com.google.android.gms.common.telemetry.service.START"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean getUseDynamicLookup() {
            r0 = this;
            r0 = 1
            return r0
    }
}
