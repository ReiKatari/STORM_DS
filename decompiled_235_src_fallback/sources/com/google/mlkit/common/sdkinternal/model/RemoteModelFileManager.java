package com.google.mlkit.common.sdkinternal.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RemoteModelFileManager {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;
    private final com.google.mlkit.common.sdkinternal.MlKitContext zzb;
    private final java.lang.String zzc;
    private final com.google.mlkit.common.sdkinternal.ModelType zzd;
    private final com.google.mlkit.common.sdkinternal.model.ModelValidator zze;
    private final com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover zzf;
    private final com.google.mlkit.common.sdkinternal.SharedPrefManager zzg;
    private final com.google.mlkit.common.sdkinternal.model.ModelFileHelper zzh;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "RemoteModelFileManager"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.zza = r0
            return
    }

    public RemoteModelFileManager(com.google.mlkit.common.sdkinternal.MlKitContext r3, com.google.mlkit.common.model.RemoteModel r4, com.google.mlkit.common.sdkinternal.model.ModelValidator r5, com.google.mlkit.common.sdkinternal.model.ModelFileHelper r6, com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover r7) {
            r2 = this;
            r2.<init>()
            r2.zzb = r3
            com.google.mlkit.common.sdkinternal.ModelType r0 = r4.getModelType()
            r2.zzd = r0
            com.google.mlkit.common.sdkinternal.ModelType r1 = com.google.mlkit.common.sdkinternal.ModelType.TRANSLATE
            if (r0 != r1) goto L14
            java.lang.String r4 = r4.getModelNameForBackend()
            goto L18
        L14:
            java.lang.String r4 = r4.getUniqueModelNameForPersist()
        L18:
            r2.zzc = r4
            r2.zze = r5
            com.google.mlkit.common.sdkinternal.SharedPrefManager r3 = com.google.mlkit.common.sdkinternal.SharedPrefManager.getInstance(r3)
            r2.zzg = r3
            r2.zzh = r6
            r2.zzf = r7
            return
    }

    public java.io.File getModelDirUnsafe(boolean r3) {
            r2 = this;
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r0 = r2.zzh
            java.lang.String r1 = r2.zzc
            com.google.mlkit.common.sdkinternal.ModelType r2 = r2.zzd
            java.io.File r2 = r0.getModelDirUnsafe(r1, r2, r3)
            return r2
    }

    public synchronized java.io.File moveModelToPrivateFolder(android.os.ParcelFileDescriptor r11, java.lang.String r12, com.google.mlkit.common.model.RemoteModel r13) {
            r10 = this;
            monitor-enter(r10)
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r0 = r10.zzh     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = r10.zzc     // Catch: java.lang.Throwable -> L88
            com.google.mlkit.common.sdkinternal.ModelType r2 = r10.zzd     // Catch: java.lang.Throwable -> L88
            java.io.File r0 = r0.zza(r1, r2)     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = "to_be_validated_model.tmp"
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L88
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L88
            r1 = 0
            android.os.ParcelFileDescriptor$AutoCloseInputStream r3 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch: java.lang.Throwable -> L88 java.io.IOException -> Lf6
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> Lf6
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lf9
            r11.<init>(r2)     // Catch: java.lang.Throwable -> Lf9
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L2d
        L21:
            int r4 = r3.read(r0)     // Catch: java.lang.Throwable -> L2d
            r5 = -1
            if (r4 == r5) goto L31
            r5 = 0
            r11.write(r0, r5, r4)     // Catch: java.lang.Throwable -> L2d
            goto L21
        L2d:
            r0 = move-exception
            r12 = r0
            goto Lfc
        L31:
            java.io.FileDescriptor r0 = r11.getFD()     // Catch: java.lang.Throwable -> L2d
            r0.sync()     // Catch: java.lang.Throwable -> L2d
            r11.close()     // Catch: java.lang.Throwable -> Lf9
            r3.close()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> Lf6
            boolean r11 = com.google.mlkit.common.internal.model.ModelUtils.zza(r2, r12)     // Catch: java.lang.Throwable -> L88
            if (r11 == 0) goto L8c
            com.google.mlkit.common.sdkinternal.model.ModelValidator r0 = r10.zze     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L8c
            com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult r1 = r0.validateModel(r2, r13)     // Catch: java.lang.Throwable -> L88
            com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r0 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L88
            com.google.mlkit.common.sdkinternal.model.ModelValidator$ValidationResult$ErrorCode r3 = com.google.mlkit.common.sdkinternal.model.ModelValidator.ValidationResult.ErrorCode.TFLITE_VERSION_INCOMPATIBLE     // Catch: java.lang.Throwable -> L88
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L8c
            com.google.mlkit.common.sdkinternal.MlKitContext r0 = r10.zzb     // Catch: java.lang.Throwable -> L88
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = com.google.mlkit.common.sdkinternal.CommonUtils.getAppVersion(r0)     // Catch: java.lang.Throwable -> L88
            com.google.mlkit.common.sdkinternal.SharedPrefManager r3 = r10.zzg     // Catch: java.lang.Throwable -> L88
            r3.setIncompatibleModelInfo(r13, r12, r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r3 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = "Model is not compatible. Model hash: "
            com.google.android.gms.common.internal.GmsLogger r5 = com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.zza     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = "RemoteModelFileManager"
            java.lang.String r3 = r4.concat(r3)     // Catch: java.lang.Throwable -> L88
            r5.d(r6, r3)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r3 = "The current app version is: "
            java.lang.String r4 = "RemoteModelFileManager"
            java.lang.String r0 = r3.concat(r0)     // Catch: java.lang.Throwable -> L88
            r5.d(r4, r0)     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r0 = move-exception
            r11 = r0
            goto L123
        L8c:
            if (r11 == 0) goto L9f
            if (r1 == 0) goto L97
            boolean r0 = r1.isValid()     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L97
            goto L9f
        L97:
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover r11 = r10.zzf     // Catch: java.lang.Throwable -> L88
            java.io.File r11 = r11.moveAllFilesFromPrivateTempToPrivateDestination(r2)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r10)
            return r11
        L9f:
            if (r11 != 0) goto Ld1
            java.lang.String r11 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L88
            java.lang.String r12 = "Hash does not match with expected: "
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.zza     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = "RemoteModelFileManager"
            java.lang.String r11 = r12.concat(r11)     // Catch: java.lang.Throwable -> L88
            r0.d(r1, r11)     // Catch: java.lang.Throwable -> L88
            com.google.mlkit.common.sdkinternal.ModelType r8 = r10.zzd     // Catch: java.lang.Throwable -> L88
            java.lang.String r11 = "common"
            com.google.android.gms.internal.mlkit_common.zzsh r3 = com.google.android.gms.internal.mlkit_common.zzss.zzb(r11)     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.mlkit_common.zzry r4 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.mlkit_common.zzmu r6 = com.google.android.gms.internal.mlkit_common.zzmu.zzA     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.mlkit_common.zzna r9 = com.google.android.gms.internal.mlkit_common.zzna.zzh     // Catch: java.lang.Throwable -> L88
            r7 = 1
            r5 = r13
            r3.zzf(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L88
            com.google.mlkit.common.MlKitException r11 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> L88
            java.lang.String r12 = "Hash does not match with expected"
            r13 = 102(0x66, float:1.43E-43)
            r11.<init>(r12, r13)     // Catch: java.lang.Throwable -> L88
            goto Lda
        Ld1:
            com.google.mlkit.common.MlKitException r11 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> L88
            java.lang.String r12 = "Model is not compatible with TFLite run time"
            r13 = 100
            r11.<init>(r12, r13)     // Catch: java.lang.Throwable -> L88
        Lda:
            boolean r12 = r2.delete()     // Catch: java.lang.Throwable -> L88
            if (r12 != 0) goto Lf5
            com.google.android.gms.common.internal.GmsLogger r12 = com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.zza     // Catch: java.lang.Throwable -> L88
            java.lang.String r13 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L88
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "Failed to delete the temp file: "
            java.lang.String r1 = "RemoteModelFileManager"
            java.lang.String r13 = r0.concat(r13)     // Catch: java.lang.Throwable -> L88
            r12.d(r1, r13)     // Catch: java.lang.Throwable -> L88
        Lf5:
            throw r11     // Catch: java.lang.Throwable -> L88
        Lf6:
            r0 = move-exception
            r11 = r0
            goto L110
        Lf9:
            r0 = move-exception
            r11 = r0
            goto L106
        Lfc:
            r11.close()     // Catch: java.lang.Throwable -> L100
            goto L105
        L100:
            r0 = move-exception
            r11 = r0
            r12.addSuppressed(r11)     // Catch: java.lang.Throwable -> Lf9
        L105:
            throw r12     // Catch: java.lang.Throwable -> Lf9
        L106:
            r3.close()     // Catch: java.lang.Throwable -> L10a
            goto L10f
        L10a:
            r0 = move-exception
            r12 = r0
            r11.addSuppressed(r12)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> Lf6
        L10f:
            throw r11     // Catch: java.lang.Throwable -> L88 java.io.IOException -> Lf6
        L110:
            java.lang.String r12 = "Failed to copy downloaded model file to private folder: "
            com.google.android.gms.common.internal.GmsLogger r13 = com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.zza     // Catch: java.lang.Throwable -> L88
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.String r11 = r12.concat(r11)     // Catch: java.lang.Throwable -> L88
            java.lang.String r12 = "RemoteModelFileManager"
            r13.e(r12, r11)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r10)
            return r1
        L123:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L88
            throw r11
    }

    public final synchronized java.io.File zza(java.io.File r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r0 = r3.zzh     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r3.zzc     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.ModelType r2 = r3.zzd     // Catch: java.lang.Throwable -> L2f
            java.io.File r0 = r0.getModelDir(r1, r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L2f
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "/0"
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L26
            monitor-exit(r3)
            return r4
        L26:
            boolean r0 = r4.renameTo(r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)
            if (r0 == 0) goto L2e
            return r1
        L2e:
            return r4
        L2f:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r4
    }

    public final synchronized java.lang.String zzb() {
            r3 = this;
            monitor-enter(r3)
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r0 = r3.zzh     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = r3.zzc     // Catch: java.lang.Throwable -> Ld
            com.google.mlkit.common.sdkinternal.ModelType r2 = r3.zzd     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.zzb(r1, r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    public final synchronized void zzc(java.io.File r4) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            java.io.File r1 = r3.getModelDirUnsafe(r0)     // Catch: java.lang.Throwable -> L25
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto Ld
            goto L2a
        Ld:
            java.io.File[] r1 = r1.listFiles()     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L2a
        L13:
            int r2 = r1.length     // Catch: java.lang.Throwable -> L25
            if (r0 >= r2) goto L2a
            r2 = r1[r0]     // Catch: java.lang.Throwable -> L25
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r0 = r3.zzh     // Catch: java.lang.Throwable -> L25
            r0.deleteRecursively(r4)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)
            return
        L25:
            r4 = move-exception
            goto L2c
        L27:
            int r0 = r0 + 1
            goto L13
        L2a:
            monitor-exit(r3)
            return
        L2c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r4
    }

    public final synchronized boolean zzd(java.io.File r7) {
            r6 = this;
            monitor-enter(r6)
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r0 = r6.zzh     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r6.zzc     // Catch: java.lang.Throwable -> L31
            com.google.mlkit.common.sdkinternal.ModelType r2 = r6.zzd     // Catch: java.lang.Throwable -> L31
            java.io.File r0 = r0.getModelDir(r1, r2)     // Catch: java.lang.Throwable -> L31
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L31
            r2 = 0
            if (r1 != 0) goto L14
            monitor-exit(r6)
            return r2
        L14:
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L31
            r1 = 1
            if (r0 == 0) goto L38
            r3 = r2
        L1c:
            int r4 = r0.length     // Catch: java.lang.Throwable -> L31
            if (r3 >= r4) goto L36
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L31
            boolean r5 = r4.equals(r7)     // Catch: java.lang.Throwable -> L31
            if (r5 != 0) goto L33
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r5 = r6.zzh     // Catch: java.lang.Throwable -> L31
            boolean r4 = r5.deleteRecursively(r4)     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L33
            r1 = r2
            goto L33
        L31:
            r7 = move-exception
            goto L3a
        L33:
            int r3 = r3 + 1
            goto L1c
        L36:
            monitor-exit(r6)
            return r1
        L38:
            monitor-exit(r6)
            return r1
        L3a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L31
            throw r7
    }
}
