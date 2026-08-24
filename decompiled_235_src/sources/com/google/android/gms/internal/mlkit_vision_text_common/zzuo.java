package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzuo {
    private static zzuo zza;

    private zzuo() {
    }

    public static synchronized zzuo zza() {
        zzuo zzuoVar;
        synchronized (zzuo.class) {
            try {
                if (zza == null) {
                    zza = new zzuo();
                }
                zzuoVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzuoVar;
    }
}
