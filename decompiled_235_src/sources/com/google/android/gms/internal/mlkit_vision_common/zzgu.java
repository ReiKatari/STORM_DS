package com.google.android.gms.internal.mlkit_vision_common;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzgu implements qh4 {
    static final zzgu zza = new zzgu();
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
        zzai j = xg6.j(1);
        HashMap hashMap = new HashMap();
        hashMap.put(j.annotationType(), j);
        zzb = new na2("appId", xg6.u(hashMap));
        zzai j2 = xg6.j(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(j2.annotationType(), j2);
        zzc = new na2("appVersion", xg6.u(hashMap2));
        zzai j3 = xg6.j(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(j3.annotationType(), j3);
        zzd = new na2("firebaseProjectId", xg6.u(hashMap3));
        zzai j4 = xg6.j(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(j4.annotationType(), j4);
        zze = new na2("mlSdkVersion", xg6.u(hashMap4));
        zzai j5 = xg6.j(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(j5.annotationType(), j5);
        zzf = new na2("tfliteSchemaVersion", xg6.u(hashMap5));
        zzai j6 = xg6.j(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(j6.annotationType(), j6);
        zzg = new na2("gcmSenderId", xg6.u(hashMap6));
        zzai j7 = xg6.j(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(j7.annotationType(), j7);
        zzh = new na2("apiKey", xg6.u(hashMap7));
        zzai j8 = xg6.j(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(j8.annotationType(), j8);
        zzi = new na2("languages", xg6.u(hashMap8));
        zzai j9 = xg6.j(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(j9.annotationType(), j9);
        zzj = new na2("mlSdkInstanceId", xg6.u(hashMap9));
        zzai j10 = xg6.j(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(j10.annotationType(), j10);
        zzk = new na2("isClearcutClient", xg6.u(hashMap10));
        zzai j11 = xg6.j(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(j11.annotationType(), j11);
        zzl = new na2("isStandaloneMlkit", xg6.u(hashMap11));
        zzai j12 = xg6.j(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(j12.annotationType(), j12);
        zzm = new na2("isJsonLogging", xg6.u(hashMap12));
        zzai j13 = xg6.j(13);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(j13.annotationType(), j13);
        zzn = new na2("buildLevel", xg6.u(hashMap13));
        zzai j14 = xg6.j(14);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(j14.annotationType(), j14);
        zzo = new na2("optionalModuleVersion", xg6.u(hashMap14));
    }

    private zzgu() {
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzla zzlaVar = (zzla) obj;
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(zzb, zzlaVar.zzg());
        rh4Var.add(zzc, zzlaVar.zzh());
        rh4Var.add(zzd, (Object) null);
        rh4Var.add(zze, zzlaVar.zzj());
        rh4Var.add(zzf, zzlaVar.zzk());
        rh4Var.add(zzg, (Object) null);
        rh4Var.add(zzh, (Object) null);
        rh4Var.add(zzi, zzlaVar.zza());
        rh4Var.add(zzj, zzlaVar.zzi());
        rh4Var.add(zzk, zzlaVar.zzb());
        rh4Var.add(zzl, zzlaVar.zzd());
        rh4Var.add(zzm, zzlaVar.zzc());
        rh4Var.add(zzn, zzlaVar.zze());
        rh4Var.add(zzo, zzlaVar.zzf());
    }
}
