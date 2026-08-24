package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zzca extends java.util.AbstractMap {
    private transient java.util.Set zza;
    private transient java.util.Set zzb;
    private transient java.util.Collection zzc;

    public zzca() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r1 = this;
            java.util.Set r0 = r1.zza
            if (r0 != 0) goto La
            java.util.Set r0 = r1.zza()
            r1.zza = r0
        La:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
            r1 = this;
            java.util.Set r0 = r1.zzb
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.mlkit_vision_text_common.zzby r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzby
            r0.<init>(r1)
            r1.zzb = r0
        Lb:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
            r1 = this;
            java.util.Collection r0 = r1.zzc
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.mlkit_vision_text_common.zzbz r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzbz
            r0.<init>(r1)
            r1.zzc = r0
        Lb:
            return r0
    }

    public abstract java.util.Set zza();
}
