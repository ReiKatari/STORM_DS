package com.google.android.gms.common.moduleinstall;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ModuleInstallRequest {
    private final java.util.List zaa;
    private final com.google.android.gms.common.moduleinstall.InstallStatusListener zab;
    private final java.util.concurrent.Executor zac;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Builder {
        private final java.util.List zaa;
        private com.google.android.gms.common.moduleinstall.InstallStatusListener zab;
        private java.util.concurrent.Executor zac;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zaa = r0
                return
        }

        public com.google.android.gms.common.moduleinstall.ModuleInstallRequest.Builder addApi(com.google.android.gms.common.api.OptionalModuleApi r2) {
                r1 = this;
                java.util.List r0 = r1.zaa
                r0.add(r2)
                return r1
        }

        public com.google.android.gms.common.moduleinstall.ModuleInstallRequest build() {
                r6 = this;
                com.google.android.gms.common.moduleinstall.ModuleInstallRequest r0 = new com.google.android.gms.common.moduleinstall.ModuleInstallRequest
                java.util.List r1 = r6.zaa
                com.google.android.gms.common.moduleinstall.InstallStatusListener r2 = r6.zab
                java.util.concurrent.Executor r3 = r6.zac
                r4 = 1
                r5 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public com.google.android.gms.common.moduleinstall.ModuleInstallRequest.Builder setListener(com.google.android.gms.common.moduleinstall.InstallStatusListener r2) {
                r1 = this;
                r0 = 0
                com.google.android.gms.common.moduleinstall.ModuleInstallRequest$Builder r1 = r1.setListener(r2, r0)
                return r1
        }

        public com.google.android.gms.common.moduleinstall.ModuleInstallRequest.Builder setListener(com.google.android.gms.common.moduleinstall.InstallStatusListener r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.zab = r1
                r0.zac = r2
                return r0
        }
    }

    public /* synthetic */ ModuleInstallRequest(java.util.List r1, com.google.android.gms.common.moduleinstall.InstallStatusListener r2, java.util.concurrent.Executor r3, boolean r4, com.google.android.gms.common.moduleinstall.zac r5) {
            r0 = this;
            r0.<init>()
            java.lang.String r4 = "APIs must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r4)
            boolean r4 = r1.isEmpty()
            r4 = r4 ^ 1
            java.lang.String r5 = "APIs must not be empty."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4, r5)
            if (r3 == 0) goto L1a
            java.lang.String r4 = "Listener must not be null when listener executor is set."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r4)
        L1a:
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            return
    }

    public static com.google.android.gms.common.moduleinstall.ModuleInstallRequest.Builder newBuilder() {
            com.google.android.gms.common.moduleinstall.ModuleInstallRequest$Builder r0 = new com.google.android.gms.common.moduleinstall.ModuleInstallRequest$Builder
            r0.<init>()
            return r0
    }

    public java.util.List<com.google.android.gms.common.api.OptionalModuleApi> getApis() {
            r0 = this;
            java.util.List r0 = r0.zaa
            return r0
    }

    public com.google.android.gms.common.moduleinstall.InstallStatusListener getListener() {
            r0 = this;
            com.google.android.gms.common.moduleinstall.InstallStatusListener r0 = r0.zab
            return r0
    }

    public java.util.concurrent.Executor getListenerExecutor() {
            r0 = this;
            java.util.concurrent.Executor r0 = r0.zac
            return r0
    }
}
