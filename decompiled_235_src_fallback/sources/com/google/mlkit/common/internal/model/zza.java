package com.google.mlkit.common.internal.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zza implements com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;
    private final java.lang.String zzb;
    private final com.google.mlkit.common.sdkinternal.model.ModelFileHelper zzc;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "CustomModelFileMover"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.common.internal.model.zza.zza = r0
            return
    }

    public zza(com.google.mlkit.common.sdkinternal.MlKitContext r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r2
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r2 = new com.google.mlkit.common.sdkinternal.model.ModelFileHelper
            r2.<init>(r1)
            r0.zzc = r2
            return
    }

    private static boolean zza(java.io.File r7, java.io.File r8) {
            java.lang.String r0 = r7.getAbsolutePath()
            java.lang.String r1 = r8.getAbsolutePath()
            boolean r2 = r7.renameTo(r8)
            r3 = 0
            java.lang.String r4 = "CustomModelFileMover"
            if (r2 == 0) goto L28
            com.google.android.gms.common.internal.GmsLogger r7 = com.google.mlkit.common.internal.model.zza.zza
            java.lang.String r2 = " to "
            java.lang.String r5 = " successfully"
            java.lang.String r6 = "Moved file from "
            java.lang.String r0 = defpackage.lb1.n(r6, r0, r2, r1, r5)
            r7.d(r4, r0)
            r8.setExecutable(r3)
            r8.setWritable(r3)
            r7 = 1
            return r7
        L28:
            com.google.android.gms.common.internal.GmsLogger r8 = com.google.mlkit.common.internal.model.zza.zza
            java.lang.String r2 = " failed, remove the temp file "
            java.lang.String r5 = "."
            java.lang.String r6 = "Move file to "
            java.lang.String r1 = defpackage.lb1.n(r6, r1, r2, r0, r5)
            r8.d(r4, r1)
            boolean r7 = r7.delete()
            if (r7 != 0) goto L4a
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Failed to delete the temp file: "
            java.lang.String r7 = r0.concat(r7)
            r8.d(r4, r7)
        L4a:
            return r3
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover
    public final java.io.File getModelFileDestination() {
            r3 = this;
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r0 = r3.zzc
            java.lang.String r1 = r3.zzb
            com.google.mlkit.common.sdkinternal.ModelType r2 = com.google.mlkit.common.sdkinternal.ModelType.CUSTOM
            java.io.File r0 = r0.getModelDir(r1, r2)
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r3 = r3.zzc
            int r3 = r3.getLatestCachedModelVersion(r0)
            int r3 = r3 + 1
            java.io.File r1 = new java.io.File
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r0, r3)
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "model.tflite"
            r3.<init>(r1, r0)
            return r3
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover
    public final java.io.File moveAllFilesFromPrivateTempToPrivateDestination(java.io.File r7) {
            r6 = this;
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r0 = r6.zzc
            java.lang.String r1 = r6.zzb
            com.google.mlkit.common.sdkinternal.ModelType r2 = com.google.mlkit.common.sdkinternal.ModelType.CUSTOM
            java.io.File r0 = r0.getModelDir(r1, r2)
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r1 = r6.zzc
            int r1 = r1.getLatestCachedModelVersion(r0)
            int r1 = r1 + 1
            java.io.File r3 = new java.io.File
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r0, r1)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "model.tflite"
            r0.<init>(r3, r1)
            java.io.File r1 = r0.getParentFile()
            if (r1 == 0) goto L37
            boolean r3 = r1.exists()
            if (r3 != 0) goto L37
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.io.File r3 = (java.io.File) r3
            r3.mkdirs()
        L37:
            boolean r7 = zza(r7, r0)
            r3 = 0
            if (r7 != 0) goto L3f
            return r3
        L3f:
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r7 = r6.zzc
            java.lang.String r4 = r6.zzb
            java.lang.String r5 = "labels.txt"
            java.io.File r7 = r7.getTempFileInPrivateFolder(r4, r2, r5)
            boolean r4 = r7.exists()
            if (r4 == 0) goto L5c
            java.io.File r4 = new java.io.File
            r4.<init>(r1, r5)
            boolean r7 = zza(r7, r4)
            if (r7 == 0) goto L5b
            goto L5d
        L5b:
            return r3
        L5c:
            r4 = r3
        L5d:
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r7 = r6.zzc
            java.lang.String r6 = r6.zzb
            java.lang.String r5 = "manifest.json"
            java.io.File r6 = r7.getTempFileInPrivateFolder(r6, r2, r5)
            boolean r7 = r6.exists()
            if (r7 == 0) goto L7b
            java.io.File r7 = new java.io.File
            r7.<init>(r1, r5)
            boolean r6 = zza(r6, r7)
            if (r6 == 0) goto L7a
            r3 = r7
            goto L7b
        L7a:
            return r3
        L7b:
            if (r4 != 0) goto L80
            if (r3 != 0) goto L80
            return r0
        L80:
            return r1
    }
}
