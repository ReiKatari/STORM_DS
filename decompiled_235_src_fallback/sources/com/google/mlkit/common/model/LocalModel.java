package com.google.mlkit.common.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class LocalModel {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.net.Uri zzc;
    private final boolean zzd;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Builder {
        private java.lang.String zza;
        private java.lang.String zzb;
        private android.net.Uri zzc;
        private boolean zzd;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.zza = r0
                r1.zzb = r0
                r1.zzc = r0
                r0 = 0
                r1.zzd = r0
                return
        }

        public com.google.mlkit.common.model.LocalModel build() {
                r8 = this;
                java.lang.String r0 = r8.zza
                r1 = 1
                if (r0 == 0) goto Ld
                java.lang.String r2 = r8.zzb
                if (r2 != 0) goto Ld
                android.net.Uri r2 = r8.zzc
                if (r2 == 0) goto L24
            Ld:
                if (r0 != 0) goto L17
                java.lang.String r2 = r8.zzb
                if (r2 == 0) goto L17
                android.net.Uri r2 = r8.zzc
                if (r2 == 0) goto L24
            L17:
                r2 = 0
                if (r0 != 0) goto L23
                java.lang.String r0 = r8.zzb
                if (r0 != 0) goto L23
                android.net.Uri r0 = r8.zzc
                if (r0 == 0) goto L23
                goto L24
            L23:
                r1 = r2
            L24:
                java.lang.String r0 = "Set one of filePath, assetFilePath and URI."
                com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
                com.google.mlkit.common.model.LocalModel r2 = new com.google.mlkit.common.model.LocalModel
                java.lang.String r3 = r8.zza
                java.lang.String r4 = r8.zzb
                android.net.Uri r5 = r8.zzc
                boolean r6 = r8.zzd
                r7 = 0
                r2.<init>(r3, r4, r5, r6, r7)
                return r2
        }

        public com.google.mlkit.common.model.LocalModel.Builder setAbsoluteFilePath(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "Model Source file path can not be empty"
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3, r0)
                java.lang.String r0 = r2.zzb
                r1 = 0
                if (r0 != 0) goto L13
                android.net.Uri r0 = r2.zzc
                if (r0 != 0) goto L13
                boolean r0 = r2.zzd
                if (r0 != 0) goto L13
                r1 = 1
            L13:
                java.lang.String r0 = "A local model source is from absolute file path, asset file path or URI, you can only set one of them."
                com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
                r2.zza = r3
                return r2
        }

        public com.google.mlkit.common.model.LocalModel.Builder setAbsoluteManifestFilePath(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "Manifest file path can not be empty"
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4, r0)
                java.lang.String r0 = r3.zzb
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L18
                android.net.Uri r0 = r3.zzc
                if (r0 != 0) goto L18
                java.lang.String r0 = r3.zza
                if (r0 == 0) goto L17
                boolean r0 = r3.zzd
                if (r0 == 0) goto L18
            L17:
                r1 = r2
            L18:
                java.lang.String r0 = "A local model source is from absolute file path, asset file path or URI, you can only set one of them."
                com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
                r3.zza = r4
                r3.zzd = r2
                return r3
        }

        public com.google.mlkit.common.model.LocalModel.Builder setAssetFilePath(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "Model Source file path can not be empty"
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3, r0)
                java.lang.String r0 = r2.zza
                r1 = 0
                if (r0 != 0) goto L13
                android.net.Uri r0 = r2.zzc
                if (r0 != 0) goto L13
                boolean r0 = r2.zzd
                if (r0 != 0) goto L13
                r1 = 1
            L13:
                java.lang.String r0 = "A local model source is from absolute file path, asset file path or URI, you can only set one of them."
                com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
                r2.zzb = r3
                return r2
        }

        public com.google.mlkit.common.model.LocalModel.Builder setAssetManifestFilePath(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "Manifest file path can not be empty"
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4, r0)
                java.lang.String r0 = r3.zza
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L18
                android.net.Uri r0 = r3.zzc
                if (r0 != 0) goto L18
                java.lang.String r0 = r3.zzb
                if (r0 == 0) goto L17
                boolean r0 = r3.zzd
                if (r0 == 0) goto L18
            L17:
                r1 = r2
            L18:
                java.lang.String r0 = "A local model source is from absolute file path, asset file path or URI, you can only set one of them."
                com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
                r3.zzb = r4
                r3.zzd = r2
                return r3
        }

        public com.google.mlkit.common.model.LocalModel.Builder setUri(android.net.Uri r3) {
                r2 = this;
                java.lang.String r0 = r2.zza
                r1 = 0
                if (r0 != 0) goto La
                java.lang.String r0 = r2.zzb
                if (r0 != 0) goto La
                r1 = 1
            La:
                java.lang.String r0 = "A local model source is from absolute file path, asset file path or URI, you can only set one of them."
                com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
                r2.zzc = r3
                return r2
        }
    }

    public /* synthetic */ LocalModel(java.lang.String r1, java.lang.String r2, android.net.Uri r3, boolean r4, com.google.mlkit.common.model.zzc r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r5 != r4) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.mlkit.common.model.LocalModel
            if (r2 != 0) goto Ld
            return r0
        Ld:
            com.google.mlkit.common.model.LocalModel r5 = (com.google.mlkit.common.model.LocalModel) r5
            java.lang.String r2 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L34
            java.lang.String r2 = r4.zzb
            java.lang.String r3 = r5.zzb
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L34
            android.net.Uri r2 = r4.zzc
            android.net.Uri r3 = r5.zzc
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L34
            boolean r4 = r4.zzd
            boolean r5 = r5.zzd
            if (r4 != r5) goto L34
            return r1
        L34:
            return r0
    }

    public java.lang.String getAbsoluteFilePath() {
            r0 = this;
            java.lang.String r0 = r0.zza
            return r0
    }

    public java.lang.String getAssetFilePath() {
            r0 = this;
            java.lang.String r0 = r0.zzb
            return r0
    }

    public android.net.Uri getUri() {
            r0 = this;
            android.net.Uri r0 = r0.zzc
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zza
            java.lang.String r1 = r3.zzb
            android.net.Uri r2 = r3.zzc
            boolean r3 = r3.zzd
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r1, r2, r3}
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r3)
            return r3
    }

    public boolean isManifestFile() {
            r0 = this;
            boolean r0 = r0.zzd
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.android.gms.internal.mlkit_common.zzq r0 = com.google.android.gms.internal.mlkit_common.zzr.zza(r3)
            java.lang.String r1 = "absoluteFilePath"
            java.lang.String r2 = r3.zza
            r0.zza(r1, r2)
            java.lang.String r1 = "assetFilePath"
            java.lang.String r2 = r3.zzb
            r0.zza(r1, r2)
            java.lang.String r1 = "uri"
            android.net.Uri r2 = r3.zzc
            r0.zza(r1, r2)
            java.lang.String r1 = "isManifestFile"
            boolean r3 = r3.zzd
            r0.zzb(r1, r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
