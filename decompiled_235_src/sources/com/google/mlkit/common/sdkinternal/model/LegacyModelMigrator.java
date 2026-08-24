package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import java.io.File;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class LegacyModelMigrator {
    protected final ModelFileHelper modelFileHelper;
    private final Context zzb;
    private final TaskCompletionSource zza = new TaskCompletionSource();
    private final Executor zzc = MLTaskExecutor.workerThreadExecutor();

    public LegacyModelMigrator(Context context, ModelFileHelper modelFileHelper) {
        this.zzb = context;
        this.modelFileHelper = modelFileHelper;
    }

    public static void deleteIfEmpty(File file) {
        File[] listFiles = file.listFiles();
        if ((listFiles == null || listFiles.length == 0) && !file.delete()) {
            Log.e("MlKitLegacyMigration", "Error deleting model directory ".concat(String.valueOf(file)));
        }
    }

    public static boolean isValidFirebasePersistenceKey(String str) {
        String[] split = str.split("\\+", -1);
        if (split.length != 2) {
            return false;
        }
        try {
            Base64Utils.decodeUrlSafeNoPadding(split[0]);
            Base64Utils.decodeUrlSafeNoPadding(split[1]);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static void migrateFile(File file, File file2) {
        if (file.exists()) {
            if (!file2.exists() && !file.renameTo(file2)) {
                String valueOf = String.valueOf(file);
                String valueOf2 = String.valueOf(file2);
                Log.e("MlKitLegacyMigration", "Error moving model file " + valueOf + " to " + valueOf2);
            }
            if (file.exists() && !file.delete()) {
                Log.e("MlKitLegacyMigration", "Error deleting model file ".concat(String.valueOf(file)));
            }
        }
    }

    public abstract String getLegacyModelDirName();

    public File getLegacyRootDir() {
        Context context = this.zzb;
        return new File(context.getNoBackupFilesDir(), getLegacyModelDirName());
    }

    public Task<Void> getMigrationTask() {
        return this.zza.getTask();
    }

    public abstract void migrateAllModelDirs(File file);

    public void start() {
        this.zzc.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.model.zza
            @Override // java.lang.Runnable
            public final void run() {
                LegacyModelMigrator.this.zza();
            }
        });
    }

    public final /* synthetic */ void zza() {
        File legacyRootDir = getLegacyRootDir();
        File[] listFiles = legacyRootDir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                migrateAllModelDirs(file);
            }
            deleteIfEmpty(legacyRootDir);
        }
        this.zza.setResult(null);
    }
}
