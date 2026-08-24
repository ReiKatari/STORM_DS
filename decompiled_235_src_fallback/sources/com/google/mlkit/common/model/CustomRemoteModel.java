package com.google.mlkit.common.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CustomRemoteModel extends com.google.mlkit.common.model.RemoteModel {
    private final com.google.mlkit.common.model.RemoteModelSource zzb;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Builder {
        private final com.google.mlkit.common.model.RemoteModelSource zza;

        public Builder(com.google.mlkit.common.model.RemoteModelSource r1) {
                r0 = this;
                r0.<init>()
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                r0.zza = r1
                return
        }

        public com.google.mlkit.common.model.CustomRemoteModel build() {
                r2 = this;
                com.google.mlkit.common.model.CustomRemoteModel r0 = new com.google.mlkit.common.model.CustomRemoteModel
                com.google.mlkit.common.model.RemoteModelSource r2 = r2.zza
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }
    }

    public /* synthetic */ CustomRemoteModel(com.google.mlkit.common.model.RemoteModelSource r3, com.google.mlkit.common.model.zza r4) {
            r2 = this;
            java.lang.String r4 = r3.zza()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto Ld
            java.lang.String r4 = "no_model_name"
            goto L11
        Ld:
            java.lang.String r4 = r3.zza()
        L11:
            r0 = 0
            com.google.mlkit.common.sdkinternal.ModelType r1 = com.google.mlkit.common.sdkinternal.ModelType.CUSTOM
            r2.<init>(r4, r0, r1)
            r2.zzb = r3
            return
    }

    public com.google.mlkit.common.model.RemoteModelSource getRemoteModelSource() {
            r0 = this;
            com.google.mlkit.common.model.RemoteModelSource r0 = r0.zzb
            return r0
    }
}
