package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzep {
    private zzes zza;
    private Integer zzb;
    private zznw zzc;

    public final zzep zza(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzep zzb(zznw zznwVar) {
        this.zzc = zznwVar;
        return this;
    }

    public final zzep zzc(zzes zzesVar) {
        this.zza = zzesVar;
        return this;
    }

    public final zzeu zze() {
        return new zzeu(this, null);
    }
}
