package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzes {
    private final zzou zza;
    private final Boolean zzb;
    private final Boolean zzc;
    private final zzod zzd;
    private final zzsd zze;

    public /* synthetic */ zzes(zzeq zzeqVar, zzer zzerVar) {
        zzou zzouVar;
        Boolean bool;
        zzsd zzsdVar;
        zzouVar = zzeqVar.zza;
        this.zza = zzouVar;
        this.zzb = null;
        bool = zzeqVar.zzb;
        this.zzc = bool;
        this.zzd = null;
        zzsdVar = zzeqVar.zzc;
        this.zze = zzsdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzes)) {
            return false;
        }
        zzes zzesVar = (zzes) obj;
        if (Objects.equal(this.zza, zzesVar.zza) && Objects.equal(null, null) && Objects.equal(this.zzc, zzesVar.zzc) && Objects.equal(null, null) && Objects.equal(this.zze, zzesVar.zze)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, this.zzc, null, this.zze);
    }

    public final zzou zza() {
        return this.zza;
    }

    public final zzsd zzb() {
        return this.zze;
    }

    public final Boolean zzc() {
        return this.zzc;
    }
}
