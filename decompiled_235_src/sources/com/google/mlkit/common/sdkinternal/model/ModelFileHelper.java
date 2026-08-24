package com.google.mlkit.common.sdkinternal.model;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.Constants;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ModelFileHelper {
    public static final int INVALID_INDEX = -1;
    private final MlKitContext zze;
    private static final GmsLogger zzd = new GmsLogger("ModelFileHelper", "");
    public static final String zza = "com.google.mlkit.translate.models";
    public static final String zzb = "com.google.mlkit.custom.models";
    static final String zzc = "com.google.mlkit.base.models";

    public ModelFileHelper(MlKitContext mlKitContext) {
        this.zze = mlKitContext;
    }

    private final File zzc(String str, ModelType modelType, boolean z) {
        File modelDirUnsafe = getModelDirUnsafe(str, modelType, z);
        if (!modelDirUnsafe.exists()) {
            zzd.d("ModelFileHelper", "model folder does not exist, creating one: ".concat(String.valueOf(modelDirUnsafe.getAbsolutePath())));
            if (!modelDirUnsafe.mkdirs()) {
                throw new MlKitException("Failed to create model folder: ".concat(String.valueOf(modelDirUnsafe)), 13);
            }
        } else if (!modelDirUnsafe.isDirectory()) {
            throw new MlKitException("Can not create model folder, since an existing file has the same name: ".concat(String.valueOf(modelDirUnsafe)), 6);
        }
        return modelDirUnsafe;
    }

    public synchronized void deleteAllModels(ModelType modelType, String str) {
        deleteRecursively(getModelDirUnsafe(str, modelType, false));
        deleteRecursively(getModelDirUnsafe(str, modelType, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r5 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean deleteRecursively(File file) {
        File[] fileArr;
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            boolean z = true;
            for (File file2 : (File[]) Preconditions.checkNotNull(file.listFiles())) {
                if (z && deleteRecursively(file2)) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (!file.delete()) {
            return false;
        }
        return true;
    }

    public void deleteTempFilesInPrivateFolder(String str, ModelType modelType) {
        String str2;
        File zzc2 = zzc(str, modelType, true);
        if (!deleteRecursively(zzc2)) {
            GmsLogger gmsLogger = zzd;
            if (zzc2 != null) {
                str2 = zzc2.getAbsolutePath();
            } else {
                str2 = null;
            }
            gmsLogger.e("ModelFileHelper", "Failed to delete the temp labels file directory: ".concat(String.valueOf(str2)));
        }
    }

    public int getLatestCachedModelVersion(File file) {
        File[] listFiles = file.listFiles();
        int i = -1;
        if (listFiles != null && (r0 = listFiles.length) != 0) {
            for (File file2 : listFiles) {
                try {
                    i = Math.max(i, Integer.parseInt(file2.getName()));
                } catch (NumberFormatException unused) {
                    zzd.d("ModelFileHelper", "Contains non-integer file name ".concat(String.valueOf(file2.getName())));
                }
            }
        }
        return i;
    }

    public File getModelDir(String str, ModelType modelType) {
        return zzc(str, modelType, false);
    }

    public File getModelDirUnsafe(String str, ModelType modelType, boolean z) {
        String str2;
        ModelType modelType2 = ModelType.UNKNOWN;
        int ordinal = modelType.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    str2 = zzb;
                } else {
                    i.h(lb1.A("Unknown model type ", modelType.name(), ". Cannot find a dir to store the downloaded model."));
                    return null;
                }
            } else {
                str2 = zza;
            }
        } else {
            str2 = zzc;
        }
        File file = new File(this.zze.getApplicationContext().getNoBackupFilesDir(), str2);
        if (z) {
            file = new File(file, "temp");
        }
        return new File(file, str);
    }

    public File getModelTempDir(String str, ModelType modelType) {
        return zzc(str, modelType, true);
    }

    public File getTempFileInPrivateFolder(String str, ModelType modelType, String str2) {
        File zzc2 = zzc(str, modelType, true);
        if (zzc2.exists() && zzc2.isFile() && !zzc2.delete()) {
            throw new MlKitException("Failed to delete the temp labels file: ".concat(String.valueOf(zzc2.getAbsolutePath())), 13);
        }
        if (!zzc2.exists()) {
            zzd.d("ModelFileHelper", "Temp labels folder does not exist, creating one: ".concat(String.valueOf(zzc2.getAbsolutePath())));
            if (!zzc2.mkdirs()) {
                throw new MlKitException("Failed to create a directory to hold the AutoML model's labels file.", 13);
            }
        }
        return new File(zzc2, str2);
    }

    public boolean modelExistsLocally(String str, ModelType modelType) {
        String zzb2;
        if (modelType != ModelType.UNKNOWN && (zzb2 = zzb(str, modelType)) != null) {
            File file = new File(zzb2);
            if (file.exists()) {
                File file2 = new File(file, Constants.MODEL_FILE_NAME);
                zzd.i("ModelFileHelper", "Model file path: ".concat(String.valueOf(file2.getAbsolutePath())));
                return file2.exists();
            }
            return false;
        }
        return false;
    }

    public final File zza(String str, ModelType modelType) {
        return zzc(str, modelType, true);
    }

    public final String zzb(String str, ModelType modelType) {
        File modelDir = getModelDir(str, modelType);
        int latestCachedModelVersion = getLatestCachedModelVersion(modelDir);
        if (latestCachedModelVersion == -1) {
            return null;
        }
        String absolutePath = modelDir.getAbsolutePath();
        return absolutePath + "/" + latestCachedModelVersion;
    }
}
