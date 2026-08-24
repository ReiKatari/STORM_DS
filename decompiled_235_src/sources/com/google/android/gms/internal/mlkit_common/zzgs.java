package com.google.android.gms.internal.mlkit_common;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzgs implements qh4 {
    static final zzgs zza = new zzgs();
    private static final na2 zzb;
    private static final na2 zzc;
    private static final na2 zzd;
    private static final na2 zze;

    static {
        zzbc h = xg6.h(1);
        HashMap hashMap = new HashMap();
        hashMap.put(h.annotationType(), h);
        zzb = new na2("modelInfo", xg6.u(hashMap));
        zzbc h2 = xg6.h(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(h2.annotationType(), h2);
        zzc = new na2("initialDownloadConditions", xg6.u(hashMap2));
        zzbc h3 = xg6.h(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(h3.annotationType(), h3);
        zzd = new na2("updateDownloadConditions", xg6.u(hashMap3));
        zzbc h4 = xg6.h(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(h4.annotationType(), h4);
        zze = new na2("isModelUpdateEnabled", xg6.u(hashMap4));
    }

    private zzgs() {
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(zzb, ((zznl) obj).zza());
        rh4Var.add(zzc, (Object) null);
        rh4Var.add(zzd, (Object) null);
        rh4Var.add(zze, (Object) null);
    }
}
