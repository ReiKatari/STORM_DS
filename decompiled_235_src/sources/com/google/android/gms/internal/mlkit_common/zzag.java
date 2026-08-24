package com.google.android.gms.internal.mlkit_common;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzag {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzag(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(obj3);
        String valueOf4 = String.valueOf(obj);
        StringBuilder u = i61.u("Multiple entries with same key: ", valueOf, "=", valueOf2, " and ");
        u.append(valueOf3);
        u.append("=");
        u.append(valueOf4);
        return new IllegalArgumentException(u.toString());
    }
}
