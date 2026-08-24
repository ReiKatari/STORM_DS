package com.google.android.gms.common.moduleinstall.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zay extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.common.moduleinstall.ModuleInstallClient {
    public static final /* synthetic */ int zab = 0;
    private static final com.google.android.gms.common.api.Api.ClientKey zac = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zad = null;
    private static final com.google.android.gms.common.api.Api zae = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.common.moduleinstall.internal.zay.zac = r0
            com.google.android.gms.common.moduleinstall.internal.zaq r1 = new com.google.android.gms.common.moduleinstall.internal.zaq
            r1.<init>()
            com.google.android.gms.common.moduleinstall.internal.zay.zad = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "ModuleInstall.API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.common.moduleinstall.internal.zay.zae = r2
            return
    }

    public zay(android.app.Activity r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.common.moduleinstall.internal.zay.zae
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public zay(android.content.Context r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.common.moduleinstall.internal.zay.zae
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public static final com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest zad(boolean r4, com.google.android.gms.common.api.OptionalModuleApi... r5) {
            java.lang.String r0 = "Requested APIs must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            int r0 = r5.length
            r1 = 0
            if (r0 <= 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = r1
        Lc:
            java.lang.String r3 = "Please provide at least one OptionalModuleApi."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r3)
        L11:
            if (r1 >= r0) goto L1d
            r2 = r5[r1]
            java.lang.String r3 = "Requested API must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r3)
            int r1 = r1 + 1
            goto L11
        L1d:
            java.util.List r5 = java.util.Arrays.asList(r5)
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r4 = com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.zaa(r5, r4)
            return r4
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse> areModulesAvailable(com.google.android.gms.common.api.OptionalModuleApi... r4) {
            r3 = this;
            r0 = 0
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r4 = zad(r0, r4)
            java.util.List r1 = r4.getApiFeatures()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1a
            com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse r3 = new com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse
            r4 = 1
            r3.<init>(r4, r0)
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forResult(r3)
            return r3
        L1a:
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r1 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.common.Feature r2 = defpackage.c08.a
            com.google.android.gms.common.Feature[] r2 = new com.google.android.gms.common.Feature[]{r2}
            r1.setFeatures(r2)
            r2 = 27301(0x6aa5, float:3.8257E-41)
            r1.setMethodKey(r2)
            r1.setAutoResolveMissingFeatures(r0)
            com.google.android.gms.common.moduleinstall.internal.zal r0 = new com.google.android.gms.common.moduleinstall.internal.zal
            r0.<init>(r3, r4)
            r1.run(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r4 = r1.build()
            com.google.android.gms.tasks.Task r3 = r3.doRead(r4)
            return r3
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredInstall(com.google.android.gms.common.api.OptionalModuleApi... r4) {
            r3 = this;
            r0 = 0
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r4 = zad(r0, r4)
            java.util.List r1 = r4.getApiFeatures()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L15
            r3 = 0
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forResult(r3)
            return r3
        L15:
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r1 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.common.Feature r2 = defpackage.c08.a
            com.google.android.gms.common.Feature[] r2 = new com.google.android.gms.common.Feature[]{r2}
            r1.setFeatures(r2)
            r2 = 27302(0x6aa6, float:3.8258E-41)
            r1.setMethodKey(r2)
            r1.setAutoResolveMissingFeatures(r0)
            com.google.android.gms.common.moduleinstall.internal.zap r0 = new com.google.android.gms.common.moduleinstall.internal.zap
            r0.<init>(r3, r4)
            r1.run(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r4 = r1.build()
            com.google.android.gms.tasks.Task r3 = r3.doRead(r4)
            return r3
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse> getInstallModulesIntent(com.google.android.gms.common.api.OptionalModuleApi... r3) {
            r2 = this;
            r0 = 1
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r3 = zad(r0, r3)
            java.util.List r0 = r3.getApiFeatures()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse r2 = new com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse
            r3 = 0
            r2.<init>(r3)
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.tasks.Tasks.forResult(r2)
            return r2
        L1a:
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.common.Feature r1 = defpackage.c08.a
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[]{r1}
            r0.setFeatures(r1)
            r1 = 27307(0x6aab, float:3.8265E-41)
            r0.setMethodKey(r1)
            com.google.android.gms.common.moduleinstall.internal.zan r1 = new com.google.android.gms.common.moduleinstall.internal.zan
            r1.<init>(r2, r3)
            r0.run(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r3 = r0.build()
            com.google.android.gms.tasks.Task r2 = r2.doRead(r3)
            return r2
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallResponse> installModules(com.google.android.gms.common.moduleinstall.ModuleInstallRequest r8) {
            r7 = this;
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r4 = com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.fromModuleInstallRequest(r8)
            com.google.android.gms.common.moduleinstall.InstallStatusListener r3 = r8.getListener()
            java.util.concurrent.Executor r8 = r8.getListenerExecutor()
            java.util.List r0 = r4.getApiFeatures()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L21
            com.google.android.gms.common.moduleinstall.ModuleInstallResponse r7 = new com.google.android.gms.common.moduleinstall.ModuleInstallResponse
            r8 = 0
            r7.<init>(r8)
            com.google.android.gms.tasks.Task r7 = com.google.android.gms.tasks.Tasks.forResult(r7)
            return r7
        L21:
            r6 = 1
            if (r3 != 0) goto L4a
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r8 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.common.Feature r0 = defpackage.c08.a
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[]{r0}
            r8.setFeatures(r0)
            r8.setAutoResolveMissingFeatures(r6)
            r0 = 27304(0x6aa8, float:3.8261E-41)
            r8.setMethodKey(r0)
            com.google.android.gms.common.moduleinstall.internal.zao r0 = new com.google.android.gms.common.moduleinstall.internal.zao
            r0.<init>(r7, r4)
            r8.run(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r8 = r8.build()
            com.google.android.gms.tasks.Task r7 = r7.doRead(r8)
            return r7
        L4a:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r0 = "InstallStatusListener"
            if (r8 != 0) goto L56
            com.google.android.gms.common.api.internal.ListenerHolder r8 = r7.registerListener(r3, r0)
            goto L5a
        L56:
            com.google.android.gms.common.api.internal.ListenerHolder r8 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(r3, r8, r0)
        L5a:
            com.google.android.gms.common.moduleinstall.internal.zaab r5 = new com.google.android.gms.common.moduleinstall.internal.zaab
            r5.<init>(r8)
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            com.google.android.gms.common.moduleinstall.internal.zai r0 = new com.google.android.gms.common.moduleinstall.internal.zai
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.common.moduleinstall.internal.zaj r7 = new com.google.android.gms.common.moduleinstall.internal.zaj
            r7.<init>(r1, r5)
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r3 = com.google.android.gms.common.api.internal.RegistrationMethods.builder()
            r3.withHolder(r8)
            com.google.android.gms.common.Feature r8 = defpackage.c08.a
            com.google.android.gms.common.Feature[] r8 = new com.google.android.gms.common.Feature[]{r8}
            r3.setFeatures(r8)
            r3.setAutoResolveMissingFeatures(r6)
            r3.register(r0)
            r3.unregister(r7)
            r7 = 27305(0x6aa9, float:3.8262E-41)
            r3.setMethodKey(r7)
            com.google.android.gms.common.api.internal.RegistrationMethods r7 = r3.build()
            com.google.android.gms.tasks.Task r7 = r1.doRegisterEventListener(r7)
            com.google.android.gms.common.moduleinstall.internal.zak r8 = new com.google.android.gms.common.moduleinstall.internal.zak
            r8.<init>(r2)
            com.google.android.gms.tasks.Task r7 = r7.onSuccessTask(r8)
            return r7
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> releaseModules(com.google.android.gms.common.api.OptionalModuleApi... r4) {
            r3 = this;
            r0 = 0
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r4 = zad(r0, r4)
            java.util.List r1 = r4.getApiFeatures()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L15
            r3 = 0
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forResult(r3)
            return r3
        L15:
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r1 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.common.Feature r2 = defpackage.c08.a
            com.google.android.gms.common.Feature[] r2 = new com.google.android.gms.common.Feature[]{r2}
            r1.setFeatures(r2)
            r2 = 27303(0x6aa7, float:3.826E-41)
            r1.setMethodKey(r2)
            r1.setAutoResolveMissingFeatures(r0)
            com.google.android.gms.common.moduleinstall.internal.zam r0 = new com.google.android.gms.common.moduleinstall.internal.zam
            r0.<init>(r3, r4)
            r1.run(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r4 = r1.build()
            com.google.android.gms.tasks.Task r3 = r3.doRead(r4)
            return r3
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> unregisterListener(com.google.android.gms.common.moduleinstall.InstallStatusListener r2) {
            r1 = this;
            java.lang.String r0 = "InstallStatusListener"
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r2 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(r2, r0)
            r0 = 27306(0x6aaa, float:3.8264E-41)
            com.google.android.gms.tasks.Task r1 = r1.doUnregisterEventListener(r2, r0)
            return r1
    }
}
