package com.google.android.gms.internal.mlkit_common;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzgq implements qh4 {
    static final zzgq zza = new zzgq();
    private static final na2 zzb;
    private static final na2 zzc;
    private static final na2 zzd;
    private static final na2 zze;
    private static final na2 zzf;
    private static final na2 zzg;
    private static final na2 zzh;

    static {
        zzbc h = xg6.h(1);
        HashMap hashMap = new HashMap();
        hashMap.put(h.annotationType(), h);
        zzb = new na2("options", xg6.u(hashMap));
        zzbc h2 = xg6.h(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(h2.annotationType(), h2);
        zzc = new na2("roughDownloadDurationMs", xg6.u(hashMap2));
        zzbc h3 = xg6.h(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(h3.annotationType(), h3);
        zzd = new na2("errorCode", xg6.u(hashMap3));
        zzbc h4 = xg6.h(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(h4.annotationType(), h4);
        zze = new na2("exactDownloadDurationMs", xg6.u(hashMap4));
        zzbc h5 = xg6.h(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(h5.annotationType(), h5);
        zzf = new na2("downloadStatus", xg6.u(hashMap5));
        zzbc h6 = xg6.h(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(h6.annotationType(), h6);
        zzg = new na2("downloadFailureStatus", xg6.u(hashMap6));
        zzbc h7 = xg6.h(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(h7.annotationType(), h7);
        zzh = new na2("mddDownloadErrorCodes", xg6.u(hashMap7));
    }

    private zzgq() {
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznc zzncVar = (zznc) obj;
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(zzb, zzncVar.zzc());
        rh4Var.add(zzc, zzncVar.zzf());
        rh4Var.add(zzd, zzncVar.zza());
        rh4Var.add(zze, zzncVar.zze());
        rh4Var.add(zzf, zzncVar.zzb());
        rh4Var.add(zzg, zzncVar.zzd());
        rh4Var.add(zzh, (Object) null);
    }
}
