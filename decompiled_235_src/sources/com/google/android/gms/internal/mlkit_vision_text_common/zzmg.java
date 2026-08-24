package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzmg implements qh4 {
    static final zzmg zza = new zzmg();
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
    private static final na2 zzl;
    private static final na2 zzm;
    private static final na2 zzn;
    private static final na2 zzo;

    static {
        zzcx k = xg6.k(1);
        HashMap hashMap = new HashMap();
        hashMap.put(k.annotationType(), k);
        zzb = new na2("appId", xg6.u(hashMap));
        zzcx k2 = xg6.k(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(k2.annotationType(), k2);
        zzc = new na2("appVersion", xg6.u(hashMap2));
        zzcx k3 = xg6.k(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(k3.annotationType(), k3);
        zzd = new na2("firebaseProjectId", xg6.u(hashMap3));
        zzcx k4 = xg6.k(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(k4.annotationType(), k4);
        zze = new na2("mlSdkVersion", xg6.u(hashMap4));
        zzcx k5 = xg6.k(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(k5.annotationType(), k5);
        zzf = new na2("tfliteSchemaVersion", xg6.u(hashMap5));
        zzcx k6 = xg6.k(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(k6.annotationType(), k6);
        zzg = new na2("gcmSenderId", xg6.u(hashMap6));
        zzcx k7 = xg6.k(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(k7.annotationType(), k7);
        zzh = new na2("apiKey", xg6.u(hashMap7));
        zzcx k8 = xg6.k(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(k8.annotationType(), k8);
        zzi = new na2("languages", xg6.u(hashMap8));
        zzcx k9 = xg6.k(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(k9.annotationType(), k9);
        zzj = new na2("mlSdkInstanceId", xg6.u(hashMap9));
        zzcx k10 = xg6.k(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(k10.annotationType(), k10);
        zzk = new na2("isClearcutClient", xg6.u(hashMap10));
        zzcx k11 = xg6.k(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(k11.annotationType(), k11);
        zzl = new na2("isStandaloneMlkit", xg6.u(hashMap11));
        zzcx k12 = xg6.k(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(k12.annotationType(), k12);
        zzm = new na2("isJsonLogging", xg6.u(hashMap12));
        zzcx k13 = xg6.k(13);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(k13.annotationType(), k13);
        zzn = new na2("buildLevel", xg6.u(hashMap13));
        zzcx k14 = xg6.k(14);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(k14.annotationType(), k14);
        zzo = new na2("optionalModuleVersion", xg6.u(hashMap14));
    }

    private zzmg() {
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzst zzstVar = (zzst) obj;
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(zzb, zzstVar.zzg());
        rh4Var.add(zzc, zzstVar.zzh());
        rh4Var.add(zzd, (Object) null);
        rh4Var.add(zze, zzstVar.zzj());
        rh4Var.add(zzf, zzstVar.zzk());
        rh4Var.add(zzg, (Object) null);
        rh4Var.add(zzh, (Object) null);
        rh4Var.add(zzi, zzstVar.zza());
        rh4Var.add(zzj, zzstVar.zzi());
        rh4Var.add(zzk, zzstVar.zzb());
        rh4Var.add(zzl, zzstVar.zzd());
        rh4Var.add(zzm, zzstVar.zzc());
        rh4Var.add(zzn, zzstVar.zze());
        rh4Var.add(zzo, zzstVar.zzf());
    }
}
