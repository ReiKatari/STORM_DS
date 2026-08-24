package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzmf implements zzmc {
    final List zza;

    public zzmf(Context context, zzme zzmeVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzmeVar.zzc()) {
            arrayList.add(new zzmp(context, zzmeVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zzmb zzmbVar) {
        for (zzmc zzmcVar : this.zza) {
            zzmcVar.zza(zzmbVar);
        }
    }
}
