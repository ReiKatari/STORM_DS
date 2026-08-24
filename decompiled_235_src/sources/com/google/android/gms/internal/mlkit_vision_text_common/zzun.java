package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzun {
    private static zzum zza;

    public static synchronized zzuc zza(zztu zztuVar) {
        zzuc zzucVar;
        synchronized (zzun.class) {
            try {
                if (zza == null) {
                    zza = new zzum(null);
                }
                zzucVar = (zzuc) zza.get(zztuVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzucVar;
    }

    public static synchronized zzuc zzb(String str) {
        zzuc zza2;
        synchronized (zzun.class) {
            zza2 = zza(zztu.zzd(str).zzd());
        }
        return zza2;
    }
}
