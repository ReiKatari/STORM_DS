package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzuc {
    private static zzbk zza;
    private static final zzbm zzb = zzbm.zzc("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
    private final String zzc;
    private final String zzd;
    private final zzts zze;
    private final SharedPrefManager zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzuc(Context context, final SharedPrefManager sharedPrefManager, zzts zztsVar, String str) {
        int i;
        this.zzc = context.getPackageName();
        this.zzd = CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zztsVar;
        zzuo.zza();
        this.zzi = str;
        this.zzg = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzty
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzuc.this.zzb();
            }
        });
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        Objects.requireNonNull(sharedPrefManager);
        this.zzh = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SharedPrefManager.this.getMlSdkInstanceId();
            }
        });
        zzbm zzbmVar = zzb;
        if (zzbmVar.containsKey(str)) {
            i = DynamiteModule.getRemoteVersion(context, (String) zzbmVar.get(str));
        } else {
            i = -1;
        }
        this.zzj = i;
    }

    public static long zza(List list, double d) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    private static synchronized zzbk zzi() {
        synchronized (zzuc.class) {
            try {
                zzbk zzbkVar = zza;
                if (zzbkVar != null) {
                    return zzbkVar;
                }
                hy3 hy3Var = new hy3(new iy3(Resources.getSystem().getConfiguration().getLocales()));
                zzbh zzbhVar = new zzbh();
                for (int i = 0; i < hy3Var.c(); i++) {
                    zzbhVar.zza(CommonUtils.languageTagFromLocale(hy3Var.b(i)));
                }
                zzbk zzb2 = zzbhVar.zzb();
                zza = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    private final boolean zzk(zzov zzovVar, long j, long j2) {
        if (this.zzk.get(zzovVar) == null || j - ((Long) this.zzk.get(zzovVar)).longValue() > 30000) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ String zzb() {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ void zzc(zztr zztrVar, zzov zzovVar, String str) {
        String mlSdkInstanceId;
        zztrVar.zzb(zzovVar);
        String zzd = zztrVar.zzd();
        zzsr zzsrVar = new zzsr();
        zzsrVar.zzb(this.zzc);
        zzsrVar.zzc(this.zzd);
        zzsrVar.zzh(zzi());
        zzsrVar.zzg(Boolean.TRUE);
        zzsrVar.zzl(zzd);
        zzsrVar.zzj(str);
        if (this.zzh.isSuccessful()) {
            mlSdkInstanceId = (String) this.zzh.getResult();
        } else {
            mlSdkInstanceId = this.zzf.getMlSdkInstanceId();
        }
        zzsrVar.zzi(mlSdkInstanceId);
        zzsrVar.zzd(10);
        zzsrVar.zzk(Integer.valueOf(this.zzj));
        zztrVar.zzc(zzsrVar);
        this.zze.zza(zztrVar);
    }

    public final void zzd(zztr zztrVar, zzov zzovVar) {
        zze(zztrVar, zzovVar, zzj());
    }

    public final void zze(final zztr zztrVar, final zzov zzovVar, final String str) {
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztw
            @Override // java.lang.Runnable
            public final void run() {
                zzuc.this.zzc(zztrVar, zzovVar, str);
            }
        });
    }

    public final void zzf(zzub zzubVar, zzov zzovVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!zzk(zzovVar, elapsedRealtime, 30L)) {
            return;
        }
        this.zzk.put(zzovVar, Long.valueOf(elapsedRealtime));
        zze(zzubVar.zza(), zzovVar, zzj());
    }

    public final /* synthetic */ void zzg(zzov zzovVar, com.google.mlkit.vision.text.internal.zzr zzrVar) {
        zzbp zzbpVar = (zzbp) this.zzl.get(zzovVar);
        if (zzbpVar != null) {
            for (Object obj : zzbpVar.zzo()) {
                ArrayList arrayList = new ArrayList(zzbpVar.zzc(obj));
                Collections.sort(arrayList);
                zznu zznuVar = new zznu();
                int size = arrayList.size();
                int i = 0;
                long j = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    j += ((Long) obj2).longValue();
                }
                zznuVar.zza(Long.valueOf(j / arrayList.size()));
                zznuVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zznuVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zznuVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zznuVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zznuVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zze(zzrVar.zza(obj, arrayList.size(), zznuVar.zzg()), zzovVar, zzj());
            }
            this.zzl.remove(zzovVar);
        }
    }

    public final /* synthetic */ void zzh(final zzov zzovVar, Object obj, long j, final com.google.mlkit.vision.text.internal.zzr zzrVar) {
        if (!this.zzl.containsKey(zzovVar)) {
            this.zzl.put(zzovVar, zzao.zzp());
        }
        ((zzbp) this.zzl.get(zzovVar)).zzm(obj, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!zzk(zzovVar, elapsedRealtime, 30L)) {
            return;
        }
        this.zzk.put(zzovVar, Long.valueOf(elapsedRealtime));
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztx
            @Override // java.lang.Runnable
            public final void run() {
                zzuc.this.zzg(zzovVar, zzrVar);
            }
        });
    }
}
