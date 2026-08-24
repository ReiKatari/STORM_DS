package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzgj implements qh4 {
    static final zzgj zza = new zzgj();
    private static final na2 zzb;
    private static final na2 zzc;
    private static final na2 zzd;

    static {
        zzcx k = xg6.k(1);
        HashMap hashMap = new HashMap();
        hashMap.put(k.annotationType(), k);
        zzb = new na2("logEventKey", xg6.u(hashMap));
        zzcx k2 = xg6.k(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(k2.annotationType(), k2);
        zzc = new na2("eventCount", xg6.u(hashMap2));
        zzcx k3 = xg6.k(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(k3.annotationType(), k3);
        zzd = new na2("inferenceDurationStats", xg6.u(hashMap3));
    }

    private zzgj() {
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzeu zzeuVar = (zzeu) obj;
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(zzb, zzeuVar.zza());
        rh4Var.add(zzc, zzeuVar.zzc());
        rh4Var.add(zzd, zzeuVar.zzb());
    }
}
