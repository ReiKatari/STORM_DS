package com.google.mlkit.vision.text.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzn extends MobileVisionBase implements TextRecognizer {
    private final TextRecognizerOptionsInterface zzb;

    public zzn(TextRecognizerTaskWithResource textRecognizerTaskWithResource, Executor executor, zzuc zzucVar, TextRecognizerOptionsInterface textRecognizerOptionsInterface) {
        super(textRecognizerTaskWithResource, executor);
        zzot zzotVar;
        this.zzb = textRecognizerOptionsInterface;
        zzow zzowVar = new zzow();
        if (textRecognizerOptionsInterface.getIsThickClient()) {
            zzotVar = zzot.TYPE_THICK;
        } else {
            zzotVar = zzot.TYPE_THIN;
        }
        zzowVar.zze(zzotVar);
        zzrx zzrxVar = new zzrx();
        zzsa zzsaVar = new zzsa();
        zzsaVar.zza(LoggingUtils.zza(textRecognizerOptionsInterface.getLoggingLanguageOption()));
        zzrxVar.zze(zzsaVar.zzc());
        zzowVar.zzh(zzrxVar.zzf());
        zzucVar.zzd(zzuf.zzg(zzowVar, 1), zzov.ON_DEVICE_TEXT_CREATE);
    }

    @Override // com.google.mlkit.vision.interfaces.Detector
    public final int getDetectorType() {
        return 4;
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return TextOptionalModuleUtils.zza(this.zzb);
    }

    @Override // com.google.mlkit.vision.text.TextRecognizer
    public final Task<Text> process(p64 p64Var) {
        return super.processBase(p64Var);
    }

    @Override // com.google.mlkit.vision.text.TextRecognizer
    public final Task<Text> process(InputImage inputImage) {
        return super.processBase(inputImage);
    }
}
