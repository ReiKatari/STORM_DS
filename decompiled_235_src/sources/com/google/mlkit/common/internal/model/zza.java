package com.google.mlkit.common.internal.model;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.Constants;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zza implements RemoteModelFileMover {
    private static final GmsLogger zza = new GmsLogger("CustomModelFileMover", "");
    private final String zzb;
    private final ModelFileHelper zzc;

    public zza(MlKitContext mlKitContext, String str) {
        this.zzb = str;
        this.zzc = new ModelFileHelper(mlKitContext);
    }

    private static boolean zza(File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        if (file.renameTo(file2)) {
            zza.d("CustomModelFileMover", lb1.n("Moved file from ", absolutePath, " to ", absolutePath2, " successfully"));
            file2.setExecutable(false);
            file2.setWritable(false);
            return true;
        }
        GmsLogger gmsLogger = zza;
        gmsLogger.d("CustomModelFileMover", lb1.n("Move file to ", absolutePath2, " failed, remove the temp file ", absolutePath, "."));
        if (!file.delete()) {
            gmsLogger.d("CustomModelFileMover", "Failed to delete the temp file: ".concat(String.valueOf(absolutePath)));
        }
        return false;
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover
    public final File getModelFileDestination() {
        File modelDir = this.zzc.getModelDir(this.zzb, ModelType.CUSTOM);
        return new File(new File(modelDir, String.valueOf(this.zzc.getLatestCachedModelVersion(modelDir) + 1)), Constants.MODEL_FILE_NAME);
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover
    public final File moveAllFilesFromPrivateTempToPrivateDestination(File file) {
        File file2;
        ModelFileHelper modelFileHelper = this.zzc;
        String str = this.zzb;
        ModelType modelType = ModelType.CUSTOM;
        File modelDir = modelFileHelper.getModelDir(str, modelType);
        File file3 = new File(new File(modelDir, String.valueOf(this.zzc.getLatestCachedModelVersion(modelDir) + 1)), Constants.MODEL_FILE_NAME);
        File parentFile = file3.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            ((File) Preconditions.checkNotNull(parentFile)).mkdirs();
        }
        File file4 = null;
        if (!zza(file, file3)) {
            return null;
        }
        File tempFileInPrivateFolder = this.zzc.getTempFileInPrivateFolder(this.zzb, modelType, Constants.AUTOML_IMAGE_LABELING_LABELS_FILE_NAME);
        if (tempFileInPrivateFolder.exists()) {
            file2 = new File(parentFile, Constants.AUTOML_IMAGE_LABELING_LABELS_FILE_NAME);
            if (!zza(tempFileInPrivateFolder, file2)) {
                return null;
            }
        } else {
            file2 = null;
        }
        File tempFileInPrivateFolder2 = this.zzc.getTempFileInPrivateFolder(this.zzb, modelType, Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME);
        if (tempFileInPrivateFolder2.exists()) {
            File file5 = new File(parentFile, Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME);
            if (!zza(tempFileInPrivateFolder2, file5)) {
                return null;
            }
            file4 = file5;
        }
        if (file2 == null && file4 == null) {
            return file3;
        }
        return parentFile;
    }
}
