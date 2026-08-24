package com.google.android.gms.internal.mlkit_common;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzfk implements qh4 {
    static final zzfk zza = new zzfk();
    private static final na2 zzb;
    private static final na2 zzc;
    private static final na2 zzd;

    static {
        zzbc h = xg6.h(1);
        HashMap hashMap = new HashMap();
        hashMap.put(h.annotationType(), h);
        zzb = new na2("modelType", xg6.u(hashMap));
        zzbc h2 = xg6.h(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(h2.annotationType(), h2);
        zzc = new na2("isSuccessful", xg6.u(hashMap2));
        zzbc h3 = xg6.h(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(h3.annotationType(), h3);
        zzd = new na2("modelName", xg6.u(hashMap3));
    }

    private zzfk() {
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlo zzloVar = (zzlo) obj;
        rh4 rh4Var = (rh4) obj2;
        rh4Var.add(zzb, zzloVar.zza());
        rh4Var.add(zzc, zzloVar.zzb());
        rh4Var.add(zzd, (Object) null);
    }
}
