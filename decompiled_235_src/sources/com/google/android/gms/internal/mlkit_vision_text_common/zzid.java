package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzid implements qh4 {
    static final zzid zza = new zzid();
    private static final na2 zzb;
    private static final na2 zzc;
    private static final na2 zzd;
    private static final na2 zze;
    private static final na2 zzf;
    private static final na2 zzg;
    private static final na2 zzh;
    private static final na2 zzi;
    private static final na2 zzj;
    private static final na2 zzk;

    static {
        zzcx k = xg6.k(1);
        HashMap hashMap = new HashMap();
        hashMap.put(k.annotationType(), k);
        zzb = new na2("durationMs", xg6.u(hashMap));
        zzcx k2 = xg6.k(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(k2.annotationType(), k2);
        zzc = new na2("errorCode", xg6.u(hashMap2));
        zzcx k3 = xg6.k(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(k3.annotationType(), k3);
        zzd = new na2("isColdCall", xg6.u(hashMap3));
        zzcx k4 = xg6.k(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(k4.annotationType(), k4);
        zze = new na2("autoManageModelOnBackground", xg6.u(hashMap4));
        zzcx k5 = xg6.k(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(k5.annotationType(), k5);
        zzf = new na2("autoManageModelOnLowMemory", xg6.u(hashMap5));
        zzcx k6 = xg6.k(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(k6.annotationType(), k6);
        zzg = new na2("isNnApiEnabled", xg6.u(hashMap6));
        zzcx k7 = xg6.k(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(k7.annotationType(), k7);
        zzh = new na2("eventsCount", xg6.u(hashMap7));
        zzcx k8 = xg6.k(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(k8.annotationType(), k8);
        zzi = new na2("otherErrors", xg6.u(hashMap8));
        zzcx k9 = xg6.k(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(k9.annotationType(), k9);
        zzj = new na2("remoteConfigValueForAcceleration", xg6.u(hashMap9));
        zzcx k10 = xg6.k(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(k10.annotationType(), k10);
        zzk = new na2("isAccelerated", xg6.u(hashMap10));
    }

    private zzid() {
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzoj zzojVar = (zzoj) obj;
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(zzb, zzojVar.zze());
        rh4Var.add(zzc, zzojVar.zza());
        rh4Var.add(zzd, zzojVar.zzd());
        rh4Var.add(zze, zzojVar.zzb());
        rh4Var.add(zzf, zzojVar.zzc());
        rh4Var.add(zzg, (Object) null);
        rh4Var.add(zzh, (Object) null);
        rh4Var.add(zzi, (Object) null);
        rh4Var.add(zzj, (Object) null);
        rh4Var.add(zzk, (Object) null);
    }
}
