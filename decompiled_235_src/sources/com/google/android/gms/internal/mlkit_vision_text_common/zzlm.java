package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzlm implements qh4 {
    static final zzlm zza = new zzlm();
    private static final na2 zzb;

    static {
        zzcx k = xg6.k(1);
        HashMap hashMap = new HashMap();
        hashMap.put(k.annotationType(), k);
        zzb = new na2("errorCode", xg6.u(hashMap));
    }

    private zzlm() {
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((rh4) obj2).add(zzb, ((zzrw) obj).zza());
    }
}
