package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zznl {
    private final zznh zza;
    private final zznj zzb;
    private final zznj zzc;
    private final Boolean zzd;

    public /* synthetic */ zznl(zzni zzniVar, zznk zznkVar) {
        zznh zznhVar;
        zznhVar = zzniVar.zza;
        this.zza = zznhVar;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zznl) && Objects.equal(this.zza, ((zznl) obj).zza) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, null, null);
    }

    public final zznh zza() {
        return this.zza;
    }
}
