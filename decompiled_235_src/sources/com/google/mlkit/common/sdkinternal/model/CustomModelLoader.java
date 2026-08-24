package com.google.mlkit.common.sdkinternal.model;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.Constants;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CustomModelLoader {
    private static final GmsLogger zza = new GmsLogger("CustomModelLoader", "");
    private static final Map zzb = new HashMap();
    private final MlKitContext zzc;
    private final LocalModel zzd;
    private final CustomRemoteModel zze;
    private final RemoteModelDownloadManager zzf;
    private final RemoteModelFileManager zzg;
    private final zzsh zzh;
    private boolean zzi;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface CustomModelLoaderHelper {
        void logLoad();

        boolean tryLoad(LocalModel localModel);
    }

    private CustomModelLoader(MlKitContext mlKitContext, LocalModel localModel, CustomRemoteModel customRemoteModel) {
        MlKitContext mlKitContext2;
        CustomRemoteModel customRemoteModel2;
        if (customRemoteModel != null) {
            mlKitContext2 = mlKitContext;
            customRemoteModel2 = customRemoteModel;
            RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(mlKitContext2, customRemoteModel2, null, new ModelFileHelper(mlKitContext), new com.google.mlkit.common.internal.model.zza(mlKitContext, customRemoteModel.getUniqueModelNameForPersist()));
            this.zzg = remoteModelFileManager;
            this.zzf = RemoteModelDownloadManager.getInstance(mlKitContext2, customRemoteModel2, new ModelFileHelper(mlKitContext2), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext2.get(ModelInfoRetrieverInterop.class));
            this.zzi = true;
        } else {
            mlKitContext2 = mlKitContext;
            customRemoteModel2 = customRemoteModel;
            this.zzg = null;
            this.zzf = null;
        }
        this.zzc = mlKitContext2;
        this.zzd = localModel;
        this.zze = customRemoteModel2;
        this.zzh = zzss.zzb("common");
    }

    public static synchronized CustomModelLoader getInstance(MlKitContext mlKitContext, LocalModel localModel, CustomRemoteModel customRemoteModel) {
        String uniqueModelNameForPersist;
        CustomModelLoader customModelLoader;
        synchronized (CustomModelLoader.class) {
            try {
                if (customRemoteModel == null) {
                    uniqueModelNameForPersist = ((LocalModel) Preconditions.checkNotNull(localModel)).toString();
                } else {
                    uniqueModelNameForPersist = customRemoteModel.getUniqueModelNameForPersist();
                }
                Map map = zzb;
                if (!map.containsKey(uniqueModelNameForPersist)) {
                    map.put(uniqueModelNameForPersist, new CustomModelLoader(mlKitContext, localModel, customRemoteModel));
                }
                customModelLoader = (CustomModelLoader) map.get(uniqueModelNameForPersist);
            } catch (Throwable th) {
                throw th;
            }
        }
        return customModelLoader;
    }

    private final File zza() {
        String zzb2 = ((RemoteModelFileManager) Preconditions.checkNotNull(this.zzg)).zzb();
        if (zzb2 == null) {
            zza.d("CustomModelLoader", "No existing model file");
            return null;
        }
        File file = new File(zzb2);
        File[] listFiles = file.listFiles();
        if (((File[]) Preconditions.checkNotNull(listFiles)).length == 1) {
            return listFiles[0];
        }
        return file;
    }

    private final void zzb() {
        ((RemoteModelDownloadManager) Preconditions.checkNotNull(this.zzf)).removeOrCancelDownload();
    }

    private static final LocalModel zzc(File file) {
        if (file.isDirectory()) {
            LocalModel.Builder builder = new LocalModel.Builder();
            builder.setAbsoluteManifestFilePath(new File(file.getAbsolutePath(), Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME).toString());
            return builder.build();
        }
        LocalModel.Builder builder2 = new LocalModel.Builder();
        builder2.setAbsoluteFilePath(file.getAbsolutePath());
        return builder2.build();
    }

    public synchronized LocalModel createLocalModelByLatestExistingModel() {
        zza.d("CustomModelLoader", "Try to get the latest existing model file.");
        File zza2 = zza();
        if (zza2 == null) {
            return null;
        }
        return zzc(zza2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[Catch: all -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:7:0x0022, B:9:0x002a, B:27:0x009e, B:13:0x0032, B:15:0x0049, B:18:0x0052, B:19:0x006b, B:21:0x0073, B:22:0x008f), top: B:32:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized LocalModel createLocalModelByNewlyDownloadedModel() {
        File file;
        try {
            GmsLogger gmsLogger = zza;
            gmsLogger.d("CustomModelLoader", "Try to get newly downloaded model file.");
            Long downloadingId = ((RemoteModelDownloadManager) Preconditions.checkNotNull(this.zzf)).getDownloadingId();
            String downloadingModelHash = this.zzf.getDownloadingModelHash();
            if (downloadingId != null && downloadingModelHash != null) {
                Integer downloadingModelStatusCode = this.zzf.getDownloadingModelStatusCode();
                if (downloadingModelStatusCode == null) {
                    zzb();
                } else {
                    gmsLogger.d("CustomModelLoader", "Download Status code: ".concat(downloadingModelStatusCode.toString()));
                    if (downloadingModelStatusCode.intValue() == 8) {
                        file = this.zzf.zzi(downloadingModelHash);
                        if (file != null) {
                            gmsLogger.d("CustomModelLoader", "Moved the downloaded model to private folder successfully: ".concat(String.valueOf(file.getParent())));
                            this.zzf.updateLatestModelHashAndType(downloadingModelHash);
                            if (file == null) {
                                return null;
                            }
                            return zzc(file);
                        }
                    } else if (downloadingModelStatusCode.intValue() == 16) {
                        this.zzh.zze(zzsk.zzg(), (RemoteModel) Preconditions.checkNotNull(this.zze), false, this.zzf.getFailureReason(downloadingId));
                        zzb();
                    }
                }
                file = null;
                if (file == null) {
                }
            }
            gmsLogger.d("CustomModelLoader", "No new model is downloading.");
            zzb();
            file = null;
            if (file == null) {
            }
        } finally {
        }
    }

    public void deleteLatestExistingModel() {
        File zza2 = zza();
        if (zza2 != null) {
            ((RemoteModelFileManager) Preconditions.checkNotNull(this.zzg)).zzc(zza2);
            SharedPrefManager.getInstance(this.zzc).clearLatestModelHash((RemoteModel) Preconditions.checkNotNull(this.zze));
        }
    }

    public void deleteOldModels(LocalModel localModel) {
        File parentFile = new File((String) Preconditions.checkNotNull(localModel.getAbsoluteFilePath())).getParentFile();
        if (((RemoteModelFileManager) Preconditions.checkNotNull(this.zzg)).zzd((File) Preconditions.checkNotNull(parentFile))) {
            zza.d("CustomModelLoader", "All old models are deleted.");
            this.zzg.zza(parentFile);
            return;
        }
        zza.e("CustomModelLoader", "Failed to delete old models");
    }

    public synchronized void load(CustomModelLoaderHelper customModelLoaderHelper) {
        try {
            LocalModel localModel = this.zzd;
            if (localModel == null) {
                localModel = createLocalModelByNewlyDownloadedModel();
            }
            if (localModel == null) {
                localModel = createLocalModelByLatestExistingModel();
            }
            if (localModel != null) {
                do {
                    boolean tryLoad = customModelLoaderHelper.tryLoad(localModel);
                    CustomRemoteModel customRemoteModel = this.zze;
                    if (!tryLoad) {
                        if (customRemoteModel != null) {
                            deleteLatestExistingModel();
                            localModel = createLocalModelByLatestExistingModel();
                            continue;
                        } else {
                            localModel = null;
                            continue;
                        }
                    } else {
                        if (customRemoteModel != null && this.zzi) {
                            deleteOldModels((LocalModel) Preconditions.checkNotNull(localModel));
                            this.zzi = false;
                        }
                        customModelLoaderHelper.logLoad();
                        return;
                    }
                } while (localModel != null);
                customModelLoaderHelper.logLoad();
                return;
            }
            throw new MlKitException("Model is not available.", 14);
        } catch (Throwable th) {
            throw th;
        }
    }
}
