package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum zzmm implements zzba {
    UNKNOWN(0),
    TRANSLATE(1);
    
    private final int zzd;

    zzmm(int i) {
        this.zzd = i;
    }

    public static zzmm zzb(int i) {
        zzmm[] values;
        for (zzmm zzmmVar : values()) {
            if (zzmmVar.zzd == i) {
                return zzmmVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzba
    public final int zza() {
        return this.zzd;
    }
}
