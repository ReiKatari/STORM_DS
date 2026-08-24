package com.google.android.gms.common.moduleinstall.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaz extends com.google.android.gms.common.internal.GmsClient {
    public zaz(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.common.api.internal.ConnectionCallbacks r11, com.google.android.gms.common.api.internal.OnConnectionFailedListener r12) {
            r7 = this;
            r3 = 308(0x134, float:4.32E-43)
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r1 = "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService"
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r0 = r1 instanceof com.google.android.gms.common.moduleinstall.internal.zaf
            if (r0 == 0) goto L11
            com.google.android.gms.common.moduleinstall.internal.zaf r1 = (com.google.android.gms.common.moduleinstall.internal.zaf) r1
            return r1
        L11:
            com.google.android.gms.common.moduleinstall.internal.zaf r1 = new com.google.android.gms.common.moduleinstall.internal.zaf
            r1.<init>(r2)
            return r1
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
            r0 = this;
            com.google.android.gms.common.Feature[] r0 = defpackage.c08.b
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r0 = this;
            r0 = 17895000(0x1110e58, float:2.6642585E-38)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
            r0 = this;
            java.lang.String r0 = "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
            r0 = this;
            java.lang.String r0 = "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean getUseDynamicLookup() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
            r0 = this;
            r0 = 1
            return r0
    }
}
