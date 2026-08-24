package com.google.android.gms.internal.mlkit_common;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzkh implements qh4 {
    static final zzkh zza = new zzkh();
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
        zzbc h = xg6.h(1);
        HashMap hashMap = new HashMap();
        hashMap.put(h.annotationType(), h);
        zzb = new na2("appId", xg6.u(hashMap));
        zzbc h2 = xg6.h(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(h2.annotationType(), h2);
        zzc = new na2("appVersion", xg6.u(hashMap2));
        zzbc h3 = xg6.h(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(h3.annotationType(), h3);
        zzd = new na2("firebaseProjectId", xg6.u(hashMap3));
        zzbc h4 = xg6.h(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(h4.annotationType(), h4);
        zze = new na2("mlSdkVersion", xg6.u(hashMap4));
        zzbc h5 = xg6.h(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(h5.annotationType(), h5);
        zzf = new na2("tfliteSchemaVersion", xg6.u(hashMap5));
        zzbc h6 = xg6.h(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(h6.annotationType(), h6);
        zzg = new na2("gcmSenderId", xg6.u(hashMap6));
        zzbc h7 = xg6.h(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(h7.annotationType(), h7);
        zzh = new na2("apiKey", xg6.u(hashMap7));
        zzbc h8 = xg6.h(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(h8.annotationType(), h8);
        zzi = new na2("languages", xg6.u(hashMap8));
        zzbc h9 = xg6.h(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(h9.annotationType(), h9);
        zzj = new na2("mlSdkInstanceId", xg6.u(hashMap9));
        zzbc h10 = xg6.h(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(h10.annotationType(), h10);
        zzk = new na2("isClearcutClient", xg6.u(hashMap10));
        zzbc h11 = xg6.h(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(h11.annotationType(), h11);
        zzl = new na2("isStandaloneMlkit", xg6.u(hashMap11));
        zzbc h12 = xg6.h(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(h12.annotationType(), h12);
        zzm = new na2("isJsonLogging", xg6.u(hashMap12));
        zzbc h13 = xg6.h(13);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(h13.annotationType(), h13);
        zzn = new na2("buildLevel", xg6.u(hashMap13));
        zzbc h14 = xg6.h(14);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(h14.annotationType(), h14);
        zzo = new na2("optionalModuleVersion", xg6.u(hashMap14));
    }

    private zzkh() {
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqv zzqvVar = (zzqv) obj;
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(zzb, zzqvVar.zzg());
        rh4Var.add(zzc, zzqvVar.zzh());
        rh4Var.add(zzd, (Object) null);
        rh4Var.add(zze, zzqvVar.zzj());
        rh4Var.add(zzf, zzqvVar.zzk());
        rh4Var.add(zzg, (Object) null);
        rh4Var.add(zzh, (Object) null);
        rh4Var.add(zzi, zzqvVar.zza());
        rh4Var.add(zzj, zzqvVar.zzi());
        rh4Var.add(zzk, zzqvVar.zzb());
        rh4Var.add(zzl, zzqvVar.zzd());
        rh4Var.add(zzm, zzqvVar.zzc());
        rh4Var.add(zzn, zzqvVar.zze());
        rh4Var.add(zzo, zzqvVar.zzf());
    }
}
