package com.google.android.gms.internal.mlkit_vision_common;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzbu implements qh4 {
    static final zzbu zza = new zzbu();
    private static final na2 zzb;
    private static final na2 zzc;
    private static final na2 zzd;

    static {
        zzai j = xg6.j(1);
        HashMap hashMap = new HashMap();
        hashMap.put(j.annotationType(), j);
        zzb = new na2("logEventKey", xg6.u(hashMap));
        zzai j2 = xg6.j(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(j2.annotationType(), j2);
        zzc = new na2("eventCount", xg6.u(hashMap2));
        zzai j3 = xg6.j(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(j3.annotationType(), j3);
        zzd = new na2("inferenceDurationStats", xg6.u(hashMap3));
    }

    private zzbu() {
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzar zzarVar = (zzar) obj;
        rh4 rh4Var = (rh4) obj2;
        throw null;
    }
}
