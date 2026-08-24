package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzhz implements qh4 {
    static final zzhz zza = new zzhz();
    private static final na2 zzb;
    private static final na2 zzc;
    private static final na2 zzd;
    private static final na2 zze;

    static {
        zzcx k = xg6.k(1);
        HashMap hashMap = new HashMap();
        hashMap.put(k.annotationType(), k);
        zzb = new na2("imageFormat", xg6.u(hashMap));
        zzcx k2 = xg6.k(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(k2.annotationType(), k2);
        zzc = new na2("originalImageSize", xg6.u(hashMap2));
        zzcx k3 = xg6.k(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(k3.annotationType(), k3);
        zzd = new na2("compressedImageSize", xg6.u(hashMap3));
        zzcx k4 = xg6.k(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(k4.annotationType(), k4);
        zze = new na2("isOdmlImage", xg6.u(hashMap4));
    }

    private zzhz() {
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzod zzodVar = (zzod) obj;
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(zzb, zzodVar.zza());
        rh4Var.add(zzc, zzodVar.zzb());
        rh4Var.add(zzd, (Object) null);
        rh4Var.add(zze, (Object) null);
    }
}
