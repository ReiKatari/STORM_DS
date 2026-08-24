package com.google.mlkit.common.sdkinternal.model;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RemoteModelLoader {
    private static final GmsLogger zza = new GmsLogger("RemoteModelLoader", "");
    private static final Map zzb = new HashMap();
    private final MlKitContext zzc;
    private final RemoteModel zzd;
    private final RemoteModelDownloadManager zze;
    private final RemoteModelFileManager zzf;
    private final RemoteModelLoaderHelper zzg;
    private final zzsh zzh;
    private boolean zzi;

    private RemoteModelLoader(MlKitContext mlKitContext, RemoteModel remoteModel, ModelValidator modelValidator, RemoteModelLoaderHelper remoteModelLoaderHelper, RemoteModelFileMover remoteModelFileMover) {
        RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(mlKitContext, remoteModel, modelValidator, new ModelFileHelper(mlKitContext), remoteModelFileMover);
        this.zzf = remoteModelFileManager;
        this.zzi = true;
        this.zze = RemoteModelDownloadManager.getInstance(mlKitContext, remoteModel, new ModelFileHelper(mlKitContext), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext.get(ModelInfoRetrieverInterop.class));
        this.zzg = remoteModelLoaderHelper;
        this.zzc = mlKitContext;
        this.zzd = remoteModel;
        this.zzh = zzss.zzb("common");
    }

    public static synchronized RemoteModelLoader getInstance(MlKitContext mlKitContext, RemoteModel remoteModel, ModelValidator modelValidator, RemoteModelLoaderHelper remoteModelLoaderHelper, RemoteModelFileMover remoteModelFileMover) {
        RemoteModelLoader remoteModelLoader;
        synchronized (RemoteModelLoader.class) {
            try {
                String uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
                Map map = zzb;
                if (!map.containsKey(uniqueModelNameForPersist)) {
                    map.put(uniqueModelNameForPersist, new RemoteModelLoader(mlKitContext, remoteModel, modelValidator, remoteModelLoaderHelper, remoteModelFileMover));
                }
                remoteModelLoader = (RemoteModelLoader) map.get(uniqueModelNameForPersist);
            } catch (Throwable th) {
                throw th;
            }
        }
        return remoteModelLoader;
    }

    private final MappedByteBuffer zza(String str) {
        return this.zzg.loadModelAtPath(str);
    }

    private final MappedByteBuffer zzb(File file) {
        try {
            return zza(file.getAbsolutePath());
        } catch (Exception e) {
            this.zzf.zzc(file);
            throw new MlKitException("Failed to load newly downloaded model.", 14, e);
        }
    }

    public RemoteModel getRemoteModel() {
        return this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:7:0x001e, B:9:0x0026, B:28:0x00b8, B:30:0x00c7, B:32:0x00cf, B:35:0x00d5, B:36:0x00f3, B:37:0x00f4, B:13:0x0031, B:15:0x0048, B:18:0x0051, B:20:0x006f, B:22:0x0077, B:23:0x0089, B:25:0x0091, B:26:0x00a8), top: B:45:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:7:0x001e, B:9:0x0026, B:28:0x00b8, B:30:0x00c7, B:32:0x00cf, B:35:0x00d5, B:36:0x00f3, B:37:0x00f4, B:13:0x0031, B:15:0x0048, B:18:0x0051, B:20:0x006f, B:22:0x0077, B:23:0x0089, B:25:0x0091, B:26:0x00a8), top: B:45:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized MappedByteBuffer load() {
        MappedByteBuffer mappedByteBuffer;
        MappedByteBuffer mappedByteBuffer2;
        try {
            GmsLogger gmsLogger = zza;
            gmsLogger.d("RemoteModelLoader", "Try to load newly downloaded model file.");
            RemoteModelDownloadManager remoteModelDownloadManager = this.zze;
            boolean z = this.zzi;
            Long downloadingId = remoteModelDownloadManager.getDownloadingId();
            String downloadingModelHash = remoteModelDownloadManager.getDownloadingModelHash();
            mappedByteBuffer = null;
            if (downloadingId != null && downloadingModelHash != null) {
                Integer downloadingModelStatusCode = this.zze.getDownloadingModelStatusCode();
                if (downloadingModelStatusCode == null) {
                    this.zze.removeOrCancelDownload();
                } else {
                    gmsLogger.d("RemoteModelLoader", "Download Status code: ".concat(downloadingModelStatusCode.toString()));
                    if (downloadingModelStatusCode.intValue() == 8) {
                        File zzi = this.zze.zzi(downloadingModelHash);
                        if (zzi != null) {
                            mappedByteBuffer2 = zzb(zzi);
                            gmsLogger.d("RemoteModelLoader", "Moved the downloaded model to private folder successfully: ".concat(String.valueOf(zzi.getParent())));
                            this.zze.updateLatestModelHashAndType(downloadingModelHash);
                            if (z && this.zzf.zzd(zzi)) {
                                gmsLogger.d("RemoteModelLoader", "All old models are deleted.");
                                mappedByteBuffer2 = zzb(this.zzf.zza(zzi));
                            }
                            if (mappedByteBuffer2 == null) {
                                gmsLogger.d("RemoteModelLoader", "Loading existing model file.");
                                String zzb2 = this.zzf.zzb();
                                if (zzb2 == null) {
                                    gmsLogger.d("RemoteModelLoader", "No existing model file");
                                } else {
                                    try {
                                        mappedByteBuffer = zza(zzb2);
                                    } catch (Exception e) {
                                        this.zzf.zzc(new File(zzb2));
                                        SharedPrefManager.getInstance(this.zzc).clearLatestModelHash(this.zzd);
                                        throw new MlKitException("Failed to load an already downloaded model.", 14, e);
                                    }
                                }
                            } else {
                                this.zzi = false;
                                mappedByteBuffer = mappedByteBuffer2;
                            }
                        }
                    } else if (downloadingModelStatusCode.intValue() == 16) {
                        this.zzh.zze(zzsk.zzg(), this.zzd, false, this.zze.getFailureReason(downloadingId));
                        this.zze.removeOrCancelDownload();
                    }
                }
                mappedByteBuffer2 = null;
                if (mappedByteBuffer2 == null) {
                }
            }
            gmsLogger.d("RemoteModelLoader", "No new model is downloading.");
            this.zze.removeOrCancelDownload();
            mappedByteBuffer2 = null;
            if (mappedByteBuffer2 == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return mappedByteBuffer;
    }
}
