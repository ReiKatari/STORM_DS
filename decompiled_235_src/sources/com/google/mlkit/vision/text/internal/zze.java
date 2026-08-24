package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.text.Text;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zze implements zzm {
    private final Context zza;
    private final com.google.android.gms.internal.mlkit_vision_text_common.zzp zzb = new com.google.android.gms.internal.mlkit_vision_text_common.zzp(null);
    private boolean zzc;
    private com.google.android.gms.internal.mlkit_vision_text_common.zzh zzd;

    public zze(Context context) {
        this.zza = context;
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final Text zza(InputImage inputImage) {
        Bitmap convertToUpRightBitmap;
        int i;
        if (this.zzd == null) {
            zzb();
        }
        if (this.zzd != null) {
            if (inputImage.getFormat() == -1) {
                convertToUpRightBitmap = inputImage.getBitmapInternal();
                i = CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees());
            } else {
                convertToUpRightBitmap = ImageConvertUtils.getInstance().convertToUpRightBitmap(inputImage);
                i = 0;
            }
            int i2 = i;
            try {
                return zzk.zza(((com.google.android.gms.internal.mlkit_vision_text_common.zzh) Preconditions.checkNotNull(this.zzd)).zze(new zh4(convertToUpRightBitmap), new com.google.android.gms.internal.mlkit_vision_text_common.zzd(inputImage.getWidth(), inputImage.getHeight(), 0, 0L, i2)), inputImage.getCoordinatesMatrix());
            } catch (RemoteException e) {
                throw new MlKitException("Failed to run legacy text recognizer.", 13, e);
            }
        }
        throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final void zzb() {
        if (this.zzd == null) {
            try {
                com.google.android.gms.internal.mlkit_vision_text_common.zzh zzd = com.google.android.gms.internal.mlkit_vision_text_common.zzj.zza(DynamiteModule.load(this.zza, DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.DEPRECATED_DYNAMITE_MODULE_ID).instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).zzd(new zh4(this.zza), this.zzb);
                this.zzd = zzd;
                if (zzd == null && !this.zzc) {
                    Log.d("LegacyTextDelegate", "Request OCR optional module download.");
                    OptionalModuleUtils.requestDownload(this.zza, OptionalModuleUtils.OCR);
                    this.zzc = true;
                }
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create legacy text recognizer.", 13, e);
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
            }
        }
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final void zzc() {
        com.google.android.gms.internal.mlkit_vision_text_common.zzh zzhVar = this.zzd;
        if (zzhVar != null) {
            try {
                zzhVar.zzd();
            } catch (RemoteException e) {
                Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e);
            }
            this.zzd = null;
        }
    }
}
