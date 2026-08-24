package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zztv implements zzts {
    final List zza;

    public zztv(Context context, zztu zztuVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zztuVar.zzc()) {
            arrayList.add(new zzuk(context, zztuVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzts
    public final void zza(zztr zztrVar) {
        for (zzts zztsVar : this.zza) {
            zztsVar.zza(zztrVar);
        }
    }
}
