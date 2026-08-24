package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzsd {
    private final zzsb zza;
    private final Boolean zzb;
    private final String zzc;

    public /* synthetic */ zzsd(zzsa zzsaVar, zzsc zzscVar) {
        zzsb zzsbVar;
        zzsbVar = zzsaVar.zza;
        this.zza = zzsbVar;
        this.zzb = null;
        this.zzc = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzsd) && Objects.equal(this.zza, ((zzsd) obj).zza) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, null);
    }

    public final zzsb zza() {
        return this.zza;
    }
}
