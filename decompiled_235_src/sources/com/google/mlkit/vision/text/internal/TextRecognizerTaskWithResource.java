package com.google.mlkit.vision.text.internal;

import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_text_common.zzep;
import com.google.android.gms.internal.mlkit_vision_text_common.zzeq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzes;
import com.google.android.gms.internal.mlkit_vision_text_common.zznw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzob;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zztr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzub;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzue;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.TaskQueue;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TextRecognizerTaskWithResource extends MLTask<Text, InputImage> {
    static boolean zza = true;
    private final zzm zzc;
    private final zzuc zzd;
    private final zzue zze;
    private final TextRecognizerOptionsInterface zzf;
    private static final ImageUtils zzb = ImageUtils.getInstance();
    private static final TaskQueue taskQueue = new TaskQueue();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextRecognizerTaskWithResource(zzuc zzucVar, zzm zzmVar, TextRecognizerOptionsInterface textRecognizerOptionsInterface) {
        super(r0);
        TaskQueue taskQueue2;
        if (textRecognizerOptionsInterface.getLoggingLanguageOption() != 8 && textRecognizerOptionsInterface.getLoggingLanguageOption() != 7) {
            taskQueue2 = taskQueue;
        } else {
            taskQueue2 = new TaskQueue();
        }
        this.zzd = zzucVar;
        this.zzc = zzmVar;
        this.zze = zzue.zza(MlKitContext.getInstance().getApplicationContext());
        this.zzf = textRecognizerOptionsInterface;
    }

    private final void zzf(final zzou zzouVar, long j, final InputImage inputImage) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.zzd.zzf(new zzub() { // from class: com.google.mlkit.vision.text.internal.zzq
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzub
            public final zztr zza() {
                return TextRecognizerTaskWithResource.this.zzc(elapsedRealtime, zzouVar, inputImage);
            }
        }, zzov.ON_DEVICE_TEXT_DETECT);
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzouVar);
        zzeqVar.zzb(Boolean.valueOf(zza));
        zzsa zzsaVar = new zzsa();
        zzsaVar.zza(LoggingUtils.zza(this.zzf.getLoggingLanguageOption()));
        zzeqVar.zzc(zzsaVar.zzc());
        final zzes zzd = zzeqVar.zzd();
        final zzr zzrVar = new zzr(this);
        final zzov zzovVar = zzov.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
        Executor workerThreadExecutor = MLTaskExecutor.workerThreadExecutor();
        final zzuc zzucVar = this.zzd;
        workerThreadExecutor.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzua
            @Override // java.lang.Runnable
            public final void run() {
                zzuc.this.zzh(zzovVar, zzd, elapsedRealtime, zzrVar);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        this.zze.zzc(this.zzf.getLoggingEventId(), zzouVar.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void load() {
        this.zzc.zzb();
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void release() {
        zza = true;
        this.zzc.zzc();
    }

    public final /* synthetic */ zztr zzc(long j, zzou zzouVar, InputImage inputImage) {
        zzob zzobVar;
        zzot zzotVar;
        zzrx zzrxVar = new zzrx();
        zzoh zzohVar = new zzoh();
        zzohVar.zzc(Long.valueOf(j));
        zzohVar.zzd(zzouVar);
        zzohVar.zze(Boolean.valueOf(zza));
        Boolean bool = Boolean.TRUE;
        zzohVar.zza(bool);
        zzohVar.zzb(bool);
        zzrxVar.zzd(zzohVar.zzf());
        ImageUtils imageUtils = zzb;
        int mobileVisionImageFormat = imageUtils.getMobileVisionImageFormat(inputImage);
        int mobileVisionImageSize = imageUtils.getMobileVisionImageSize(inputImage);
        zzoa zzoaVar = new zzoa();
        if (mobileVisionImageFormat != -1) {
            if (mobileVisionImageFormat != 35) {
                if (mobileVisionImageFormat != 842094169) {
                    if (mobileVisionImageFormat != 16) {
                        if (mobileVisionImageFormat != 17) {
                            zzobVar = zzob.UNKNOWN_FORMAT;
                        } else {
                            zzobVar = zzob.NV21;
                        }
                    } else {
                        zzobVar = zzob.NV16;
                    }
                } else {
                    zzobVar = zzob.YV12;
                }
            } else {
                zzobVar = zzob.YUV_420_888;
            }
        } else {
            zzobVar = zzob.BITMAP;
        }
        zzoaVar.zza(zzobVar);
        zzoaVar.zzb(Integer.valueOf(mobileVisionImageSize));
        zzrxVar.zzc(zzoaVar.zzd());
        zzsa zzsaVar = new zzsa();
        zzsaVar.zza(LoggingUtils.zza(this.zzf.getLoggingLanguageOption()));
        zzrxVar.zze(zzsaVar.zzc());
        zzrz zzf = zzrxVar.zzf();
        zzow zzowVar = new zzow();
        if (this.zzf.getIsThickClient()) {
            zzotVar = zzot.TYPE_THICK;
        } else {
            zzotVar = zzot.TYPE_THIN;
        }
        zzowVar.zze(zzotVar);
        zzowVar.zzh(zzf);
        return zzuf.zzf(zzowVar);
    }

    public final /* synthetic */ zztr zzd(zzes zzesVar, int i, zznw zznwVar) {
        zzot zzotVar;
        zzow zzowVar = new zzow();
        if (this.zzf.getIsThickClient()) {
            zzotVar = zzot.TYPE_THICK;
        } else {
            zzotVar = zzot.TYPE_THIN;
        }
        zzowVar.zze(zzotVar);
        zzep zzepVar = new zzep();
        zzepVar.zza(Integer.valueOf(i));
        zzepVar.zzc(zzesVar);
        zzepVar.zzb(zznwVar);
        zzowVar.zzd(zzepVar.zze());
        return zzuf.zzf(zzowVar);
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    /* renamed from: zze */
    public final synchronized Text run(InputImage inputImage) {
        zzou zzouVar;
        Text zza2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            zza2 = this.zzc.zza(inputImage);
            zzf(zzou.NO_ERROR, elapsedRealtime, inputImage);
            zza = false;
        } catch (MlKitException e) {
            if (e.getErrorCode() == 14) {
                zzouVar = zzou.MODEL_NOT_DOWNLOADED;
            } else {
                zzouVar = zzou.UNKNOWN_ERROR;
            }
            zzf(zzouVar, elapsedRealtime, inputImage);
            throw e;
        }
        return zza2;
    }
}
