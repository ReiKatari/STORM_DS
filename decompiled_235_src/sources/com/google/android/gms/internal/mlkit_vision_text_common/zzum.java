package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzum extends LazyInstanceMap {
    public /* synthetic */ zzum(zzul zzulVar) {
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        zztu zztuVar = (zztu) obj;
        MlKitContext mlKitContext = MlKitContext.getInstance();
        return new zzuc(mlKitContext.getApplicationContext(), (SharedPrefManager) mlKitContext.get(SharedPrefManager.class), new zztv(MlKitContext.getInstance().getApplicationContext(), zztuVar), zztuVar.zzb());
    }

    private zzum() {
        throw null;
    }
}
