package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzut;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzux;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuy;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzd implements zzm {
    private final Context zza;
    private final TextRecognizerOptionsInterface zzb;
    private boolean zzc;
    private boolean zzd;
    private final zzuc zze;
    private zzuv zzf;

    public zzd(Context context, TextRecognizerOptionsInterface textRecognizerOptionsInterface, zzuc zzucVar) {
        this.zza = context;
        this.zzb = textRecognizerOptionsInterface;
        this.zze = zzucVar;
    }

    private static zzvh zzd(TextRecognizerOptionsInterface textRecognizerOptionsInterface, String str) {
        boolean z;
        int i = 1;
        if ((textRecognizerOptionsInterface instanceof zzc) && ((zzc) textRecognizerOptionsInterface).zza()) {
            z = true;
        } else {
            z = false;
        }
        String configLabel = textRecognizerOptionsInterface.getConfigLabel();
        String loggingLibraryNameForOptionalModule = textRecognizerOptionsInterface.getLoggingLibraryNameForOptionalModule();
        switch (textRecognizerOptionsInterface.getLoggingLanguageOption()) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 9;
                break;
        }
        return new zzvh(configLabel, loggingLibraryNameForOptionalModule, str, true, i - 1, textRecognizerOptionsInterface.getLanguageHint(), z);
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final Text zza(InputImage inputImage) {
        if (this.zzf == null) {
            zzb();
        }
        zzuv zzuvVar = (zzuv) Preconditions.checkNotNull(this.zzf);
        if (!this.zzc) {
            try {
                zzuvVar.zze();
                this.zzc = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init text recognizer ".concat(String.valueOf(this.zzb.getLoggingLibraryName())), 13, e);
            }
        }
        try {
            return new Text(zzuvVar.zzd(ImageUtils.getInstance().getImageDataWrapper(inputImage), new zzuq(inputImage.getFormat(), inputImage.getWidth(), inputImage.getHeight(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()), SystemClock.elapsedRealtime())), inputImage.getCoordinatesMatrix());
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run text recognizer ".concat(String.valueOf(this.zzb.getLoggingLibraryName())), 13, e2);
        }
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final void zzb() {
        String str;
        zzuv zze;
        if (this.zzf != null) {
            return;
        }
        try {
            TextRecognizerOptionsInterface textRecognizerOptionsInterface = this.zzb;
            boolean z = textRecognizerOptionsInterface instanceof zzb;
            if (z) {
                str = ((zzb) textRecognizerOptionsInterface).zza();
            } else {
                str = null;
            }
            if (this.zzb.getIsThickClient()) {
                Log.d("DecoupledTextDelegate", "Start loading thick OCR module.");
                zze = zzux.zza(DynamiteModule.load(this.zza, DynamiteModule.PREFER_LOCAL, this.zzb.getModuleId()).instantiate("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).zze(new zh4(this.zza), zzd(this.zzb, str));
            } else if (z) {
                Log.d("DecoupledTextDelegate", "Start loading custom OCR module.");
                zze = zzut.zza(DynamiteModule.load(this.zza, DynamiteModule.PREFER_REMOTE, this.zzb.getModuleId()).instantiate("com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator")).zzd(new zh4(this.zza), null, zzd(this.zzb, str));
            } else {
                Log.d("DecoupledTextDelegate", "Start loading thin OCR module.");
                zzuy zza = zzux.zza(DynamiteModule.load(this.zza, DynamiteModule.PREFER_REMOTE, this.zzb.getModuleId()).instantiate("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"));
                int loggingLanguageOption = this.zzb.getLoggingLanguageOption();
                Context context = this.zza;
                if (loggingLanguageOption == 1) {
                    zze = zza.zzd(new zh4(context));
                } else {
                    zze = zza.zze(new zh4(context), zzd(this.zzb, str));
                }
            }
            this.zzf = zze;
            LoggingUtils.zzb(this.zze, this.zzb.getIsThickClient(), zzou.NO_ERROR);
        } catch (RemoteException e) {
            LoggingUtils.zzb(this.zze, this.zzb.getIsThickClient(), zzou.OPTIONAL_MODULE_INIT_ERROR);
            throw new MlKitException("Failed to create text recognizer ".concat(String.valueOf(this.zzb.getLoggingLibraryName())), 13, e);
        } catch (DynamiteModule.LoadingException e2) {
            LoggingUtils.zzb(this.zze, this.zzb.getIsThickClient(), zzou.OPTIONAL_MODULE_NOT_AVAILABLE);
            if (!this.zzb.getIsThickClient()) {
                if (!this.zzd) {
                    OptionalModuleUtils.requestDownload(this.zza, TextOptionalModuleUtils.zza(this.zzb));
                    this.zzd = true;
                }
                throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
            }
            throw new MlKitException("Failed to load text module " + this.zzb.getLoggingLibraryName() + ". " + e2.getMessage(), 13, e2);
        }
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final void zzc() {
        zzuv zzuvVar = this.zzf;
        if (zzuvVar != null) {
            try {
                zzuvVar.zzf();
            } catch (RemoteException e) {
                Log.e("DecoupledTextDelegate", "Failed to release text recognizer ".concat(String.valueOf(this.zzb.getLoggingLibraryName())), e);
            }
            this.zzf = null;
        }
        this.zzc = false;
    }
}
