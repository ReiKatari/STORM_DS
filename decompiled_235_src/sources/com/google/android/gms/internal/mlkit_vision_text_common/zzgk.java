package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzgk implements qh4 {
    static final zzgk zza = new zzgk();
    private static final na2 zzb;
    private static final na2 zzc;
    private static final na2 zzd;
    private static final na2 zze;
    private static final na2 zzf;

    static {
        zzcx k = xg6.k(1);
        HashMap hashMap = new HashMap();
        hashMap.put(k.annotationType(), k);
        zzb = new na2("errorCode", xg6.u(hashMap));
        zzcx k2 = xg6.k(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(k2.annotationType(), k2);
        zzc = new na2("hasResult", xg6.u(hashMap2));
        zzcx k3 = xg6.k(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(k3.annotationType(), k3);
        zzd = new na2("isColdCall", xg6.u(hashMap3));
        zzcx k4 = xg6.k(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(k4.annotationType(), k4);
        zze = new na2("imageInfo", xg6.u(hashMap4));
        zzcx k5 = xg6.k(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(k5.annotationType(), k5);
        zzf = new na2("recognizerOptions", xg6.u(hashMap5));
    }

    private zzgk() {
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzes zzesVar = (zzes) obj;
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(zzb, zzesVar.zza());
        rh4Var.add(zzc, (Object) null);
        rh4Var.add(zzd, zzesVar.zzc());
        rh4Var.add(zze, (Object) null);
        rh4Var.add(zzf, zzesVar.zzb());
    }
}
