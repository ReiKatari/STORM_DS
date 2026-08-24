package com.google.mlkit.common.sdkinternal.model;

import android.app.DownloadManager;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Build;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.LongSparseArray;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzry;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelInfo;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RemoteModelDownloadManager {
    private static final GmsLogger zza = new GmsLogger("ModelDownloadManager", "");
    private static final Map zzb = new HashMap();
    private final LongSparseArray zzc = new LongSparseArray();
    private final LongSparseArray zzd = new LongSparseArray();
    private final MlKitContext zze;
    private final DownloadManager zzf;
    private final RemoteModel zzg;
    private final ModelType zzh;
    private final zzsh zzi;
    private final SharedPrefManager zzj;
    private final ModelFileHelper zzk;
    private final ModelInfoRetrieverInterop zzl;
    private final RemoteModelFileManager zzm;
    private DownloadConditions zzn;

    public RemoteModelDownloadManager(MlKitContext mlKitContext, RemoteModel remoteModel, ModelFileHelper modelFileHelper, RemoteModelFileManager remoteModelFileManager, ModelInfoRetrieverInterop modelInfoRetrieverInterop, zzsh zzshVar) {
        this.zze = mlKitContext;
        this.zzh = remoteModel.getModelType();
        this.zzg = remoteModel;
        DownloadManager downloadManager = (DownloadManager) mlKitContext.getApplicationContext().getSystemService("download");
        this.zzf = downloadManager;
        this.zzi = zzshVar;
        if (downloadManager == null) {
            zza.d("ModelDownloadManager", "Download manager service is not available in the service.");
        }
        this.zzk = modelFileHelper;
        this.zzj = SharedPrefManager.getInstance(mlKitContext);
        this.zzl = modelInfoRetrieverInterop;
        this.zzm = remoteModelFileManager;
    }

    public static synchronized RemoteModelDownloadManager getInstance(MlKitContext mlKitContext, RemoteModel remoteModel, ModelFileHelper modelFileHelper, RemoteModelFileManager remoteModelFileManager, ModelInfoRetrieverInterop modelInfoRetrieverInterop) {
        RemoteModel remoteModel2;
        RemoteModelDownloadManager remoteModelDownloadManager;
        synchronized (RemoteModelDownloadManager.class) {
            try {
                Map map = zzb;
                if (!map.containsKey(remoteModel)) {
                    remoteModel2 = remoteModel;
                    map.put(remoteModel2, new RemoteModelDownloadManager(mlKitContext, remoteModel2, modelFileHelper, remoteModelFileManager, modelInfoRetrieverInterop, zzss.zzb("common")));
                } else {
                    remoteModel2 = remoteModel;
                }
                remoteModelDownloadManager = (RemoteModelDownloadManager) map.get(remoteModel2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return remoteModelDownloadManager;
    }

    private final Task zzj(long j) {
        MlKitContext mlKitContext = this.zze;
        zzc zzm = zzm(j);
        Context applicationContext = mlKitContext.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
        Handler handler = MLTaskExecutor.getInstance().getHandler();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            pt0.n(applicationContext, zzm, intentFilter, handler);
        } else if (i >= 26) {
            pt0.m(applicationContext, zzm, intentFilter, handler);
        } else {
            applicationContext.registerReceiver(zzm, intentFilter, null, handler);
        }
        return zzk(j).getTask();
    }

    private final synchronized TaskCompletionSource zzk(long j) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zzd.get(j);
        if (taskCompletionSource == null) {
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            this.zzd.put(j, taskCompletionSource2);
            return taskCompletionSource2;
        }
        return taskCompletionSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MlKitException zzl(Long l) {
        DownloadManager downloadManager = this.zzf;
        Cursor cursor = null;
        if (downloadManager != null && l != null) {
            cursor = downloadManager.query(new DownloadManager.Query().setFilterById(l.longValue()));
        }
        int i = 13;
        String str = "Model downloading failed";
        if (cursor != null && cursor.moveToFirst()) {
            int i2 = cursor.getInt(cursor.getColumnIndex("reason"));
            if (i2 == 1006) {
                str = "Model downloading failed due to insufficient space on the device.";
                i = MlKitException.NOT_ENOUGH_SPACE;
            } else {
                str = lb1.k("Model downloading failed due to error code: ", i2, " from Android DownloadManager");
            }
        }
        return new MlKitException(str, i);
    }

    private final synchronized zzc zzm(long j) {
        try {
            try {
                zzc zzcVar = (zzc) this.zzc.get(j);
                if (zzcVar == null) {
                    zzc zzcVar2 = new zzc(this, j, zzk(j), null);
                    this.zzc.put(j, zzcVar2);
                    return zzcVar2;
                }
                return zzcVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final synchronized Long zzn(DownloadManager.Request request, ModelInfo modelInfo) {
        DownloadManager downloadManager = this.zzf;
        if (downloadManager == null) {
            return null;
        }
        long enqueue = downloadManager.enqueue(request);
        GmsLogger gmsLogger = zza;
        gmsLogger.d("ModelDownloadManager", "Schedule a new downloading task: " + enqueue);
        this.zzj.setDownloadingModelInfo(enqueue, modelInfo);
        this.zzi.zzf(zzsk.zzg(), this.zzg, zzmu.NO_ERROR, false, modelInfo.getModelType(), zzna.SCHEDULED);
        return Long.valueOf(enqueue);
    }

    private final synchronized Long zzo(ModelInfo modelInfo, DownloadConditions downloadConditions) {
        try {
            Preconditions.checkNotNull(downloadConditions, "DownloadConditions can not be null");
            String downloadingModelHash = this.zzj.getDownloadingModelHash(this.zzg);
            Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            if (downloadingModelHash != null && downloadingModelHash.equals(modelInfo.getModelHash()) && downloadingModelStatusCode != null) {
                Integer downloadingModelStatusCode2 = getDownloadingModelStatusCode();
                if (downloadingModelStatusCode2 != null) {
                    if (downloadingModelStatusCode2.intValue() != 8 && downloadingModelStatusCode2.intValue() != 16) {
                    }
                    zza.d("ModelDownloadManager", "New model is already in downloading, do nothing.");
                    return null;
                }
                zzsh zzshVar = this.zzi;
                RemoteModel remoteModel = this.zzg;
                zzshVar.zzf(zzsk.zzg(), remoteModel, zzmu.NO_ERROR, false, remoteModel.getModelType(), zzna.DOWNLOADING);
                zza.d("ModelDownloadManager", "New model is already in downloading, do nothing.");
                return null;
            }
            GmsLogger gmsLogger = zza;
            gmsLogger.d("ModelDownloadManager", "Need to download a new model.");
            removeOrCancelDownload();
            DownloadManager.Request request = new DownloadManager.Request(modelInfo.getModelUri());
            if (this.zzk.modelExistsLocally(modelInfo.getModelNameForPersist(), modelInfo.getModelType())) {
                gmsLogger.d("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
                this.zzi.zzf(zzsk.zzg(), this.zzg, zzmu.NO_ERROR, false, modelInfo.getModelType(), zzna.UPDATE_AVAILABLE);
            }
            request.setRequiresCharging(downloadConditions.isChargingRequired());
            if (downloadConditions.isWifiRequired()) {
                request.setAllowedNetworkTypes(2);
            }
            return zzn(request, modelInfo);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
        r0 = zzo(r0, r13.zzn);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
        return zzj(r0.longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
        com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza.i("ModelDownloadManager", "Didn't schedule download for the updated model");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Task<Void> ensureModelDownloaded() {
        MlKitException mlKitException;
        ModelInfo modelInfo;
        this.zzi.zzf(zzsk.zzg(), this.zzg, zzmu.NO_ERROR, false, ModelType.UNKNOWN, zzna.EXPLICITLY_REQUESTED);
        Long l = null;
        try {
            modelInfo = zzg();
            mlKitException = null;
        } catch (MlKitException e) {
            mlKitException = e;
            modelInfo = null;
        }
        try {
            Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            Long downloadingId = getDownloadingId();
            if (!modelExistsLocally() && (downloadingModelStatusCode == null || downloadingModelStatusCode.intValue() != 8)) {
                if (downloadingModelStatusCode != null && downloadingModelStatusCode.intValue() == 16) {
                    MlKitException zzl = zzl(downloadingId);
                    removeOrCancelDownload();
                    return Tasks.forException(zzl);
                } else if (downloadingModelStatusCode != null && ((downloadingModelStatusCode.intValue() == 4 || downloadingModelStatusCode.intValue() == 2 || downloadingModelStatusCode.intValue() == 1) && downloadingId != null && getDownloadingModelHash() != null)) {
                    zzsh zzshVar = this.zzi;
                    zzry zzg = zzsk.zzg();
                    RemoteModel remoteModel = this.zzg;
                    zzshVar.zzf(zzg, remoteModel, zzmu.NO_ERROR, false, remoteModel.getModelType(), zzna.DOWNLOADING);
                    return zzj(downloadingId.longValue());
                } else {
                    if (modelInfo != null) {
                        l = zzo(modelInfo, this.zzn);
                    }
                    if (l == null) {
                        return Tasks.forException(new MlKitException("Failed to schedule the download task", 13, mlKitException));
                    }
                    return zzj(l.longValue());
                }
            }
            return Tasks.forResult(null);
        } catch (MlKitException e2) {
            return Tasks.forException(new MlKitException("Failed to ensure the model is downloaded.", 13, e2));
        }
    }

    public synchronized ParcelFileDescriptor getDownloadedFile() {
        DownloadManager downloadManager = this.zzf;
        Long downloadingId = getDownloadingId();
        ParcelFileDescriptor parcelFileDescriptor = null;
        if (downloadManager == null || downloadingId == null) {
            return null;
        }
        try {
            parcelFileDescriptor = downloadManager.openDownloadedFile(downloadingId.longValue());
        } catch (FileNotFoundException unused) {
            zza.e("ModelDownloadManager", "Downloaded file is not found");
        }
        return parcelFileDescriptor;
    }

    public synchronized Long getDownloadingId() {
        return this.zzj.getDownloadingModelId(this.zzg);
    }

    public synchronized String getDownloadingModelHash() {
        return this.zzj.getDownloadingModelHash(this.zzg);
    }

    public synchronized Integer getDownloadingModelStatusCode() {
        Integer num;
        DownloadManager downloadManager = this.zzf;
        Long downloadingId = getDownloadingId();
        Integer num2 = null;
        if (downloadManager != null && downloadingId != null) {
            Cursor query = downloadManager.query(new DownloadManager.Query().setFilterById(downloadingId.longValue()));
            if (query != null && query.moveToFirst()) {
                num = Integer.valueOf(query.getInt(query.getColumnIndex("status")));
            } else {
                num = null;
            }
            if (num == null) {
                if (query != null) {
                    query.close();
                }
            } else {
                if (num.intValue() == 2 || num.intValue() == 4 || num.intValue() == 1 || num.intValue() == 8 || num.intValue() == 16) {
                    num2 = num;
                }
                query.close();
                return num2;
            }
        }
        return null;
    }

    public int getFailureReason(Long l) {
        int columnIndex;
        DownloadManager downloadManager = this.zzf;
        Cursor cursor = null;
        if (downloadManager != null && l != null) {
            cursor = downloadManager.query(new DownloadManager.Query().setFilterById(l.longValue()));
        }
        if (cursor == null || !cursor.moveToFirst() || (columnIndex = cursor.getColumnIndex("reason")) == -1) {
            return 0;
        }
        return cursor.getInt(columnIndex);
    }

    public boolean isModelDownloadedAndValid() {
        try {
            if (modelExistsLocally()) {
                return true;
            }
        } catch (MlKitException unused) {
            zza.d("ModelDownloadManager", "Failed to check if the model exist locally.");
        }
        Long downloadingId = getDownloadingId();
        String downloadingModelHash = getDownloadingModelHash();
        if (downloadingId != null && downloadingModelHash != null) {
            Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            zza.d("ModelDownloadManager", "Download Status code: ".concat(String.valueOf(downloadingModelStatusCode)));
            if (downloadingModelStatusCode == null) {
                removeOrCancelDownload();
                return false;
            } else if (Objects.equal(downloadingModelStatusCode, 8) && zzi(downloadingModelHash) != null) {
                return true;
            } else {
                return false;
            }
        }
        zza.d("ModelDownloadManager", "No new model is downloading.");
        removeOrCancelDownload();
        return false;
    }

    public boolean modelExistsLocally() {
        return this.zzk.modelExistsLocally(this.zzg.getUniqueModelNameForPersist(), this.zzh);
    }

    public synchronized void removeOrCancelDownload() {
        try {
            DownloadManager downloadManager = this.zzf;
            Long downloadingId = getDownloadingId();
            if (downloadManager != null && downloadingId != null) {
                zza.d("ModelDownloadManager", "Cancel or remove existing downloading task: ".concat(downloadingId.toString()));
                if (this.zzf.remove(downloadingId.longValue()) <= 0) {
                    if (getDownloadingModelStatusCode() == null) {
                    }
                }
                ModelFileHelper modelFileHelper = this.zzk;
                RemoteModel remoteModel = this.zzg;
                modelFileHelper.deleteTempFilesInPrivateFolder(remoteModel.getUniqueModelNameForPersist(), remoteModel.getModelType());
                this.zzj.clearDownloadingModelInfo(this.zzg);
            }
        } finally {
        }
    }

    public void setDownloadConditions(DownloadConditions downloadConditions) {
        Preconditions.checkNotNull(downloadConditions, "DownloadConditions can not be null");
        this.zzn = downloadConditions;
    }

    public synchronized void updateLatestModelHashAndType(String str) {
        this.zzj.setLatestModelHash(this.zzg, str);
        removeOrCancelDownload();
    }

    public final synchronized ModelInfo zzg() {
        try {
            boolean modelExistsLocally = modelExistsLocally();
            if (modelExistsLocally) {
                zzsh zzshVar = this.zzi;
                RemoteModel remoteModel = this.zzg;
                zzshVar.zzf(zzsk.zzg(), remoteModel, zzmu.NO_ERROR, false, remoteModel.getModelType(), zzna.LIVE);
            }
            ModelInfoRetrieverInterop modelInfoRetrieverInterop = this.zzl;
            if (modelInfoRetrieverInterop != null) {
                ModelInfo retrieveRemoteModelInfo = modelInfoRetrieverInterop.retrieveRemoteModelInfo(this.zzg);
                if (retrieveRemoteModelInfo == null) {
                    return null;
                }
                MlKitContext mlKitContext = this.zze;
                RemoteModel remoteModel2 = this.zzg;
                String modelHash = retrieveRemoteModelInfo.getModelHash();
                SharedPrefManager sharedPrefManager = SharedPrefManager.getInstance(mlKitContext);
                boolean equals = modelHash.equals(sharedPrefManager.getIncompatibleModelHash(remoteModel2));
                boolean z = false;
                boolean z2 = true;
                if (equals && CommonUtils.getAppVersion(mlKitContext.getApplicationContext()).equals(sharedPrefManager.getPreviousAppVersion())) {
                    zza.e("ModelDownloadManager", "The model is incompatible with TFLite and the app is not upgraded, do not download");
                    z2 = false;
                }
                if (!modelExistsLocally) {
                    this.zzj.clearLatestModelHash(this.zzg);
                }
                boolean equals2 = retrieveRemoteModelInfo.getModelHash().equals(SharedPrefManager.getInstance(this.zze).getLatestModelHash(this.zzg));
                boolean z3 = !equals2;
                if (z2) {
                    if (!modelExistsLocally || !equals2) {
                        return retrieveRemoteModelInfo;
                    }
                } else {
                    z = z3;
                }
                if (modelExistsLocally && (z ^ z2)) {
                    return null;
                }
                throw new MlKitException("The model " + this.zzg.getModelName() + " is incompatible with TFLite runtime", 100);
            }
            throw new MlKitException("Please include com.google.mlkit:linkfirebase sdk as your dependency when you try to download from Firebase.", 14);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final File zzi(String str) {
        GmsLogger gmsLogger = zza;
        gmsLogger.d("ModelDownloadManager", "Model downloaded successfully");
        this.zzi.zzf(zzsk.zzg(), this.zzg, zzmu.NO_ERROR, true, this.zzh, zzna.SUCCEEDED);
        ParcelFileDescriptor downloadedFile = getDownloadedFile();
        if (downloadedFile == null) {
            removeOrCancelDownload();
            return null;
        }
        gmsLogger.d("ModelDownloadManager", "moving downloaded model from external storage to private folder.");
        try {
            return this.zzm.moveModelToPrivateFolder(downloadedFile, str, this.zzg);
        } finally {
            removeOrCancelDownload();
        }
    }
}
