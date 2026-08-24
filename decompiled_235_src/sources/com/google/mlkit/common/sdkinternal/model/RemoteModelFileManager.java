package com.google.mlkit.common.sdkinternal.model;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.internal.model.ModelUtils;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.common.sdkinternal.model.ModelValidator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RemoteModelFileManager {
    private static final GmsLogger zza = new GmsLogger("RemoteModelFileManager", "");
    private final MlKitContext zzb;
    private final String zzc;
    private final ModelType zzd;
    private final ModelValidator zze;
    private final RemoteModelFileMover zzf;
    private final SharedPrefManager zzg;
    private final ModelFileHelper zzh;

    public RemoteModelFileManager(MlKitContext mlKitContext, RemoteModel remoteModel, ModelValidator modelValidator, ModelFileHelper modelFileHelper, RemoteModelFileMover remoteModelFileMover) {
        String uniqueModelNameForPersist;
        this.zzb = mlKitContext;
        ModelType modelType = remoteModel.getModelType();
        this.zzd = modelType;
        if (modelType == ModelType.TRANSLATE) {
            uniqueModelNameForPersist = remoteModel.getModelNameForBackend();
        } else {
            uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
        }
        this.zzc = uniqueModelNameForPersist;
        this.zze = modelValidator;
        this.zzg = SharedPrefManager.getInstance(mlKitContext);
        this.zzh = modelFileHelper;
        this.zzf = remoteModelFileMover;
    }

    public File getModelDirUnsafe(boolean z) {
        return this.zzh.getModelDirUnsafe(this.zzc, this.zzd, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
        com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.zza.d("RemoteModelFileManager", "Hash does not match with expected: ".concat(java.lang.String.valueOf(r12)));
        com.google.android.gms.internal.mlkit_common.zzss.zzb("common").zzf(com.google.android.gms.internal.mlkit_common.zzsk.zzg(), r13, com.google.android.gms.internal.mlkit_common.zzmu.MODEL_HASH_MISMATCH, true, r10.zzd, com.google.android.gms.internal.mlkit_common.zzna.SUCCEEDED);
        r11 = new com.google.mlkit.common.MlKitException("Hash does not match with expected", com.google.mlkit.common.MlKitException.MODEL_HASH_MISMATCH);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized File moveModelToPrivateFolder(ParcelFileDescriptor parcelFileDescriptor, String str, RemoteModel remoteModel) {
        File file;
        ModelValidator modelValidator;
        try {
            file = new File(this.zzh.zza(this.zzc, this.zzd), "to_be_validated_model.tmp");
            ModelValidator.ValidationResult validationResult = null;
            try {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = autoCloseInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.getFD().sync();
                    fileOutputStream.close();
                    autoCloseInputStream.close();
                    boolean zza2 = ModelUtils.zza(file, str);
                    if (zza2 && (modelValidator = this.zze) != null) {
                        validationResult = modelValidator.validateModel(file, remoteModel);
                        if (validationResult.getErrorCode().equals(ModelValidator.ValidationResult.ErrorCode.TFLITE_VERSION_INCOMPATIBLE)) {
                            String appVersion = CommonUtils.getAppVersion(this.zzb.getApplicationContext());
                            this.zzg.setIncompatibleModelInfo(remoteModel, str, appVersion);
                            String valueOf = String.valueOf(str);
                            GmsLogger gmsLogger = zza;
                            gmsLogger.d("RemoteModelFileManager", "Model is not compatible. Model hash: ".concat(valueOf));
                            gmsLogger.d("RemoteModelFileManager", "The current app version is: ".concat(String.valueOf(appVersion)));
                        }
                    }
                    if (zza2 && (validationResult == null || validationResult.isValid())) {
                    }
                    MlKitException mlKitException = new MlKitException("Model is not compatible with TFLite run time", 100);
                    if (!file.delete()) {
                        zza.d("RemoteModelFileManager", "Failed to delete the temp file: ".concat(String.valueOf(file.getAbsolutePath())));
                    }
                    throw mlKitException;
                } catch (Throwable th) {
                    try {
                        autoCloseInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                zza.e("RemoteModelFileManager", "Failed to copy downloaded model file to private folder: ".concat(e.toString()));
                return null;
            }
        } finally {
        }
        return this.zzf.moveAllFilesFromPrivateTempToPrivateDestination(file);
    }

    public final synchronized File zza(File file) {
        File file2 = new File(String.valueOf(this.zzh.getModelDir(this.zzc, this.zzd).getAbsolutePath()).concat("/0"));
        if (file2.exists()) {
            return file;
        }
        if (file.renameTo(file2)) {
            return file2;
        }
        return file;
    }

    public final synchronized String zzb() {
        return this.zzh.zzb(this.zzc, this.zzd);
    }

    public final synchronized void zzc(File file) {
        File[] listFiles;
        File modelDirUnsafe = getModelDirUnsafe(false);
        if (modelDirUnsafe.exists() && (listFiles = modelDirUnsafe.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.equals(file)) {
                    this.zzh.deleteRecursively(file);
                    return;
                }
            }
        }
    }

    public final synchronized boolean zzd(File file) {
        File modelDir = this.zzh.getModelDir(this.zzc, this.zzd);
        if (!modelDir.exists()) {
            return false;
        }
        File[] listFiles = modelDir.listFiles();
        boolean z = true;
        if (listFiles == null) {
            return true;
        }
        for (File file2 : listFiles) {
            if (!file2.equals(file) && !this.zzh.deleteRecursively(file2)) {
                z = false;
            }
        }
        return z;
    }
}
