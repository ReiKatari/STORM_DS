package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zzan implements zzcc {
    private transient Set zza;
    private transient Map zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcc)) {
            return false;
        }
        return zzn().equals(((zzcc) obj).zzn());
    }

    public final int hashCode() {
        return zzn().hashCode();
    }

    public final String toString() {
        return zzn().toString();
    }

    public abstract Map zzh();

    public abstract Set zzi();

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public boolean zzm(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final Map zzn() {
        Map map = this.zzb;
        if (map == null) {
            Map zzh = zzh();
            this.zzb = zzh;
            return zzh;
        }
        return map;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final Set zzo() {
        Set set = this.zza;
        if (set == null) {
            Set zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return set;
    }
}
