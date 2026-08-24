package com.google.mlkit.vision.text.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;
import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzp extends LazyInstanceMap {
    private final MlKitContext zza;

    public zzp(MlKitContext mlKitContext) {
        this.zza = mlKitContext;
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        zzm zzdVar;
        TextRecognizerOptionsInterface textRecognizerOptionsInterface = (TextRecognizerOptionsInterface) obj;
        zzuc zzb = zzun.zzb(textRecognizerOptionsInterface.getLoggingLibraryName());
        Context applicationContext = this.zza.getApplicationContext();
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(applicationContext) < 204700000 && !textRecognizerOptionsInterface.getIsThickClient()) {
            zzdVar = new zze(applicationContext);
        } else {
            zzdVar = new zzd(applicationContext, textRecognizerOptionsInterface, zzb);
        }
        return new TextRecognizerTaskWithResource(zzb, zzdVar, textRecognizerOptionsInterface);
    }
}
