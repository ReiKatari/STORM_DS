package com.google.mlkit.common.sdkinternal.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class LegacyModelMigrator {
    protected final com.google.mlkit.common.sdkinternal.model.ModelFileHelper modelFileHelper;
    private final com.google.android.gms.tasks.TaskCompletionSource zza;
    private final android.content.Context zzb;
    private final java.util.concurrent.Executor zzc;

    public LegacyModelMigrator(android.content.Context r2, com.google.mlkit.common.sdkinternal.model.ModelFileHelper r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            r1.modelFileHelper = r3
            java.util.concurrent.Executor r2 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor()
            r1.zzc = r2
            return
    }

    public static void deleteIfEmpty(java.io.File r2) {
            java.io.File[] r0 = r2.listFiles()
            if (r0 == 0) goto L9
            int r0 = r0.length
            if (r0 != 0) goto L1e
        L9:
            boolean r0 = r2.delete()
            if (r0 != 0) goto L1e
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "MlKitLegacyMigration"
            java.lang.String r1 = "Error deleting model directory "
            java.lang.String r2 = r1.concat(r2)
            android.util.Log.e(r0, r2)
        L1e:
            return
    }

    public static boolean isValidFirebasePersistenceKey(java.lang.String r3) {
            java.lang.String r0 = "\\+"
            r1 = -1
            java.lang.String[] r3 = r3.split(r0, r1)
            int r0 = r3.length
            r1 = 2
            r2 = 0
            if (r0 == r1) goto Ld
            return r2
        Ld:
            r0 = r3[r2]     // Catch: java.lang.IllegalArgumentException -> L19
            com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(r0)     // Catch: java.lang.IllegalArgumentException -> L19
            r0 = 1
            r3 = r3[r0]     // Catch: java.lang.IllegalArgumentException -> L19
            com.google.android.gms.common.util.Base64Utils.decodeUrlSafeNoPadding(r3)     // Catch: java.lang.IllegalArgumentException -> L19
            return r0
        L19:
            return r2
    }

    public static void migrateFile(java.io.File r4, java.io.File r5) {
            boolean r0 = r4.exists()
            if (r0 != 0) goto L7
            goto L4f
        L7:
            boolean r0 = r5.exists()
            java.lang.String r1 = "MlKitLegacyMigration"
            if (r0 != 0) goto L36
            boolean r0 = r4.renameTo(r5)
            if (r0 != 0) goto L36
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error moving model file "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " to "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.e(r1, r5)
        L36:
            boolean r5 = r4.exists()
            if (r5 == 0) goto L4f
            boolean r5 = r4.delete()
            if (r5 != 0) goto L4f
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "Error deleting model file "
            java.lang.String r4 = r5.concat(r4)
            android.util.Log.e(r1, r4)
        L4f:
            return
    }

    public abstract java.lang.String getLegacyModelDirName();

    public java.io.File getLegacyRootDir() {
            r2 = this;
            android.content.Context r0 = r2.zzb
            java.lang.String r2 = r2.getLegacyModelDirName()
            java.io.File r1 = new java.io.File
            java.io.File r0 = r0.getNoBackupFilesDir()
            r1.<init>(r0, r2)
            return r1
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> getMigrationTask() {
            r0 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.zza
            com.google.android.gms.tasks.Task r0 = r0.getTask()
            return r0
    }

    public abstract void migrateAllModelDirs(java.io.File r1);

    public void start() {
            r1 = this;
            com.google.mlkit.common.sdkinternal.model.zza r0 = new com.google.mlkit.common.sdkinternal.model.zza
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r1.zzc
            r1.execute(r0)
            return
    }

    public final /* synthetic */ void zza() {
            r4 = this;
            java.io.File r0 = r4.getLegacyRootDir()
            java.io.File[] r1 = r0.listFiles()
            if (r1 == 0) goto L19
            r2 = 0
        Lb:
            int r3 = r1.length
            if (r2 >= r3) goto L16
            r3 = r1[r2]
            r4.migrateAllModelDirs(r3)
            int r2 = r2 + 1
            goto Lb
        L16:
            deleteIfEmpty(r0)
        L19:
            com.google.android.gms.tasks.TaskCompletionSource r4 = r4.zza
            r0 = 0
            r4.setResult(r0)
            return
    }
}
