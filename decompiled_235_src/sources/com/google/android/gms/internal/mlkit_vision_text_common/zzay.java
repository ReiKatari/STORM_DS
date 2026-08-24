package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzay extends zzam {
    final /* synthetic */ zzba zza;
    private final Object zzb;
    private int zzc;

    public zzay(zzba zzbaVar, int i) {
        this.zza = zzbaVar;
        this.zzb = zzba.zzg(zzbaVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int zzw;
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzw.zza(this.zzb, zzba.zzg(this.zza, this.zzc))) {
            zzw = this.zza.zzw(this.zzb);
            this.zzc = zzw;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzba.zzj(this.zza, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        zzba zzbaVar = this.zza;
        if (i == -1) {
            zzbaVar.put(this.zzb, obj);
            return null;
        }
        Object zzj = zzba.zzj(zzbaVar, i);
        zzba.zzn(zzbaVar, this.zzc, obj);
        return zzj;
    }
}
