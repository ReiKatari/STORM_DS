package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zzsj {
    public static zzsi zzh() {
        zzrv zzrvVar = new zzrv();
        zzrvVar.zzg("NA");
        zzrvVar.zzf(false);
        zzrvVar.zze(false);
        zzrvVar.zzd(ModelType.UNKNOWN);
        zzrvVar.zzb(zzmu.NO_ERROR);
        zzrvVar.zza(zzna.UNKNOWN_STATUS);
        zzrvVar.zzc(0);
        return zzrvVar;
    }

    public abstract int zza();

    public abstract ModelType zzb();

    public abstract zzmu zzc();

    public abstract zzna zzd();

    public abstract String zze();

    public abstract boolean zzf();

    public abstract boolean zzg();
}
