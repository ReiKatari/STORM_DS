package com.google.mlkit.common.sdkinternal.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ModelFileHelper {
    public static final int INVALID_INDEX = -1;
    public static final java.lang.String zza = null;
    public static final java.lang.String zzb = null;
    static final java.lang.String zzc = null;
    private static final com.google.android.gms.common.internal.GmsLogger zzd = null;
    private final com.google.mlkit.common.sdkinternal.MlKitContext zze;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "ModelFileHelper"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzd = r0
            java.lang.String r0 = "com.google.mlkit.translate.models"
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zza = r0
            java.lang.String r0 = "com.google.mlkit.custom.models"
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzb = r0
            java.lang.String r0 = "com.google.mlkit.base.models"
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzc = r0
            return
    }

    public ModelFileHelper(com.google.mlkit.common.sdkinternal.MlKitContext r1) {
            r0 = this;
            r0.<init>()
            r0.zze = r1
            return
    }

    private final java.io.File zzc(java.lang.String r2, com.google.mlkit.common.sdkinternal.ModelType r3, boolean r4) {
            r1 = this;
            java.io.File r1 = r1.getModelDirUnsafe(r2, r3, r4)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L38
            com.google.android.gms.common.internal.GmsLogger r2 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzd
            java.lang.String r3 = r1.getAbsolutePath()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "ModelFileHelper"
            java.lang.String r0 = "model folder does not exist, creating one: "
            java.lang.String r3 = r0.concat(r3)
            r2.d(r4, r3)
            boolean r2 = r1.mkdirs()
            if (r2 == 0) goto L26
            goto L3e
        L26:
            com.google.mlkit.common.MlKitException r2 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Failed to create model folder: "
            java.lang.String r1 = r3.concat(r1)
            r3 = 13
            r2.<init>(r1, r3)
            throw r2
        L38:
            boolean r2 = r1.isDirectory()
            if (r2 == 0) goto L3f
        L3e:
            return r1
        L3f:
            com.google.mlkit.common.MlKitException r2 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Can not create model folder, since an existing file has the same name: "
            java.lang.String r1 = r3.concat(r1)
            r3 = 6
            r2.<init>(r1, r3)
            throw r2
    }

    public synchronized void deleteAllModels(com.google.mlkit.common.sdkinternal.ModelType r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            java.io.File r0 = r1.getModelDirUnsafe(r3, r2, r0)     // Catch: java.lang.Throwable -> L13
            r1.deleteRecursively(r0)     // Catch: java.lang.Throwable -> L13
            r0 = 1
            java.io.File r2 = r1.getModelDirUnsafe(r3, r2, r0)     // Catch: java.lang.Throwable -> L13
            r1.deleteRecursively(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    public boolean deleteRecursively(java.io.File r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            boolean r1 = r8.isDirectory()
            r2 = 1
            if (r1 == 0) goto L2c
            java.io.File[] r1 = r8.listFiles()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.io.File[] r1 = (java.io.File[]) r1
            int r3 = r1.length
            r4 = r0
            r5 = r2
        L18:
            if (r4 >= r3) goto L2a
            r6 = r1[r4]
            if (r5 == 0) goto L26
            boolean r5 = r7.deleteRecursively(r6)
            if (r5 == 0) goto L26
            r5 = r2
            goto L27
        L26:
            r5 = r0
        L27:
            int r4 = r4 + 1
            goto L18
        L2a:
            if (r5 == 0) goto L33
        L2c:
            boolean r7 = r8.delete()
            if (r7 == 0) goto L33
            return r2
        L33:
            return r0
    }

    public void deleteTempFilesInPrivateFolder(java.lang.String r2, com.google.mlkit.common.sdkinternal.ModelType r3) {
            r1 = this;
            r0 = 1
            java.io.File r2 = r1.zzc(r2, r3, r0)
            boolean r1 = r1.deleteRecursively(r2)
            if (r1 != 0) goto L24
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzd
            if (r2 == 0) goto L14
            java.lang.String r2 = r2.getAbsolutePath()
            goto L15
        L14:
            r2 = 0
        L15:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "ModelFileHelper"
            java.lang.String r0 = "Failed to delete the temp labels file directory: "
            java.lang.String r2 = r0.concat(r2)
            r1.e(r3, r2)
        L24:
            return
    }

    public int getLatestCachedModelVersion(java.io.File r7) {
            r6 = this;
            java.io.File[] r6 = r7.listFiles()
            r7 = -1
            if (r6 == 0) goto L34
            int r0 = r6.length
            if (r0 == 0) goto L34
            r1 = 0
        Lb:
            if (r1 >= r0) goto L34
            r2 = r6[r1]
            java.lang.String r3 = r2.getName()     // Catch: java.lang.NumberFormatException -> L1c
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L1c
            int r7 = java.lang.Math.max(r7, r3)     // Catch: java.lang.NumberFormatException -> L1c
            goto L31
        L1c:
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzd
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "ModelFileHelper"
            java.lang.String r5 = "Contains non-integer file name "
            java.lang.String r2 = r5.concat(r2)
            r3.d(r4, r2)
        L31:
            int r1 = r1 + 1
            goto Lb
        L34:
            return r7
    }

    public java.io.File getModelDir(java.lang.String r2, com.google.mlkit.common.sdkinternal.ModelType r3) {
            r1 = this;
            r0 = 0
            java.io.File r1 = r1.zzc(r2, r3, r0)
            return r1
    }

    public java.io.File getModelDirUnsafe(java.lang.String r3, com.google.mlkit.common.sdkinternal.ModelType r4, boolean r5) {
            r2 = this;
            com.google.mlkit.common.sdkinternal.ModelType r0 = com.google.mlkit.common.sdkinternal.ModelType.UNKNOWN
            int r0 = r4.ordinal()
            r1 = 1
            if (r0 == r1) goto L26
            r1 = 2
            if (r0 == r1) goto L23
            r1 = 4
            if (r0 != r1) goto L12
            java.lang.String r4 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzb
            goto L28
        L12:
            java.lang.String r2 = r4.name()
            java.lang.String r3 = "Unknown model type "
            java.lang.String r4 = ". Cannot find a dir to store the downloaded model."
            java.lang.String r2 = defpackage.lb1.A(r3, r2, r4)
            defpackage.i.h(r2)
            r2 = 0
            return r2
        L23:
            java.lang.String r4 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zza
            goto L28
        L26:
            java.lang.String r4 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzc
        L28:
            com.google.mlkit.common.sdkinternal.MlKitContext r2 = r2.zze
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r2.getApplicationContext()
            java.io.File r2 = r2.getNoBackupFilesDir()
            r0.<init>(r2, r4)
            if (r5 == 0) goto L41
            java.io.File r2 = new java.io.File
            java.lang.String r4 = "temp"
            r2.<init>(r0, r4)
            r0 = r2
        L41:
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r3)
            return r2
    }

    public java.io.File getModelTempDir(java.lang.String r2, com.google.mlkit.common.sdkinternal.ModelType r3) {
            r1 = this;
            r0 = 1
            java.io.File r1 = r1.zzc(r2, r3, r0)
            return r1
    }

    public java.io.File getTempFileInPrivateFolder(java.lang.String r4, com.google.mlkit.common.sdkinternal.ModelType r5, java.lang.String r6) {
            r3 = this;
            r0 = 1
            java.io.File r3 = r3.zzc(r4, r5, r0)
            boolean r4 = r3.exists()
            r5 = 13
            if (r4 == 0) goto L2e
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L2e
            boolean r4 = r3.delete()
            if (r4 == 0) goto L1a
            goto L2e
        L1a:
            com.google.mlkit.common.MlKitException r4 = new com.google.mlkit.common.MlKitException
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = "Failed to delete the temp labels file: "
            java.lang.String r3 = r6.concat(r3)
            r4.<init>(r3, r5)
            throw r4
        L2e:
            boolean r4 = r3.exists()
            if (r4 != 0) goto L58
            com.google.android.gms.common.internal.GmsLogger r4 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzd
            java.lang.String r0 = r3.getAbsolutePath()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "ModelFileHelper"
            java.lang.String r2 = "Temp labels folder does not exist, creating one: "
            java.lang.String r0 = r2.concat(r0)
            r4.d(r1, r0)
            boolean r4 = r3.mkdirs()
            if (r4 == 0) goto L50
            goto L58
        L50:
            com.google.mlkit.common.MlKitException r3 = new com.google.mlkit.common.MlKitException
            java.lang.String r4 = "Failed to create a directory to hold the AutoML model's labels file."
            r3.<init>(r4, r5)
            throw r3
        L58:
            java.io.File r4 = new java.io.File
            r4.<init>(r3, r6)
            return r4
    }

    public boolean modelExistsLocally(java.lang.String r3, com.google.mlkit.common.sdkinternal.ModelType r4) {
            r2 = this;
            com.google.mlkit.common.sdkinternal.ModelType r0 = com.google.mlkit.common.sdkinternal.ModelType.UNKNOWN
            if (r4 != r0) goto L5
            goto L37
        L5:
            java.lang.String r2 = r2.zzb(r3, r4)
            if (r2 == 0) goto L37
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r2 = r3.exists()
            if (r2 == 0) goto L37
            java.io.File r2 = new java.io.File
            java.lang.String r4 = "model.tflite"
            r2.<init>(r3, r4)
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.zzd
            java.lang.String r4 = r2.getAbsolutePath()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "ModelFileHelper"
            java.lang.String r1 = "Model file path: "
            java.lang.String r4 = r1.concat(r4)
            r3.i(r0, r4)
            boolean r2 = r2.exists()
            return r2
        L37:
            r2 = 0
            return r2
    }

    public final java.io.File zza(java.lang.String r2, com.google.mlkit.common.sdkinternal.ModelType r3) {
            r1 = this;
            r0 = 1
            java.io.File r1 = r1.zzc(r2, r3, r0)
            return r1
    }

    public final java.lang.String zzb(java.lang.String r1, com.google.mlkit.common.sdkinternal.ModelType r2) {
            r0 = this;
            java.io.File r1 = r0.getModelDir(r1, r2)
            int r0 = r0.getLatestCachedModelVersion(r1)
            r2 = -1
            if (r0 != r2) goto Ld
            r0 = 0
            return r0
        Ld:
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "/"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
