package com.google.mlkit.common.sdkinternal.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.LongSparseArray;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzry;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsi;
import com.google.android.gms.internal.mlkit_common.zzsj;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzc extends BroadcastReceiver {
    final /* synthetic */ RemoteModelDownloadManager zza;
    private final long zzb;
    private final TaskCompletionSource zzc;

    public /* synthetic */ zzc(RemoteModelDownloadManager remoteModelDownloadManager, long j, TaskCompletionSource taskCompletionSource, zzb zzbVar) {
        this.zza = remoteModelDownloadManager;
        this.zzb = j;
        this.zzc = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        GmsLogger gmsLogger;
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2;
        zzsh zzshVar;
        RemoteModel remoteModel;
        zzsh zzshVar2;
        RemoteModel remoteModel2;
        RemoteModel remoteModel3;
        zzsh zzshVar3;
        RemoteModel remoteModel4;
        MlKitException zzl;
        MlKitContext mlKitContext;
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        if (longExtra != this.zzb) {
            return;
        }
        RemoteModelDownloadManager remoteModelDownloadManager = this.zza;
        Integer downloadingModelStatusCode = remoteModelDownloadManager.getDownloadingModelStatusCode();
        synchronized (remoteModelDownloadManager) {
            try {
                mlKitContext = this.zza.zze;
                mlKitContext.getApplicationContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                gmsLogger = RemoteModelDownloadManager.zza;
                gmsLogger.w("ModelDownloadManager", "Exception thrown while trying to unregister the broadcast receiver for the download", e);
            }
            longSparseArray = this.zza.zzc;
            longSparseArray.remove(this.zzb);
            longSparseArray2 = this.zza.zzd;
            longSparseArray2.remove(this.zzb);
        }
        if (downloadingModelStatusCode != null) {
            if (downloadingModelStatusCode.intValue() == 16) {
                RemoteModelDownloadManager remoteModelDownloadManager2 = this.zza;
                zzshVar3 = remoteModelDownloadManager2.zzi;
                zzry zzg = zzsk.zzg();
                remoteModel4 = remoteModelDownloadManager2.zzg;
                Long valueOf = Long.valueOf(longExtra);
                zzshVar3.zze(zzg, remoteModel4, false, remoteModelDownloadManager2.getFailureReason(valueOf));
                TaskCompletionSource taskCompletionSource = this.zzc;
                zzl = this.zza.zzl(valueOf);
                taskCompletionSource.setException(zzl);
                return;
            } else if (downloadingModelStatusCode.intValue() == 8) {
                RemoteModelDownloadManager remoteModelDownloadManager3 = this.zza;
                zzshVar2 = remoteModelDownloadManager3.zzi;
                zzry zzg2 = zzsk.zzg();
                remoteModel2 = remoteModelDownloadManager3.zzg;
                zzsi zzh = zzsj.zzh();
                zzh.zzb(zzmu.NO_ERROR);
                zzh.zze(true);
                remoteModel3 = this.zza.zzg;
                zzh.zzd(remoteModel3.getModelType());
                zzh.zza(zzna.SUCCEEDED);
                zzshVar2.zzg(zzg2, remoteModel2, zzh.zzh());
                this.zzc.setResult(null);
                return;
            }
        }
        RemoteModelDownloadManager remoteModelDownloadManager4 = this.zza;
        zzshVar = remoteModelDownloadManager4.zzi;
        zzry zzg3 = zzsk.zzg();
        remoteModel = remoteModelDownloadManager4.zzg;
        zzshVar.zze(zzg3, remoteModel, false, 0);
        this.zzc.setException(new MlKitException("Model downloading failed", 13));
    }
}
