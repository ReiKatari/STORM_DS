package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzac implements java.util.Iterator {
    final java.util.Iterator zza;
    java.util.Collection zzb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zzad zzc;

    public zzac(com.google.android.gms.internal.mlkit_vision_text_common.zzad r1) {
            r0 = this;
            r0.zzc = r1
            r0.<init>()
            java.util.Map r1 = r1.zza
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r0.zza = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            java.util.Iterator r0 = r0.zza
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r2 = this;
            java.util.Iterator r0 = r2.zza
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            r2.zzb = r1
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            com.google.android.gms.internal.mlkit_vision_text_common.zzad r2 = r2.zzc
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r2 = r2.zzb
            java.util.Collection r2 = r2.zzb(r1, r0)
            com.google.android.gms.internal.mlkit_vision_text_common.zzbg r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzbg
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            java.util.Collection r0 = r3.zzb
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.String r1 = "no calls to next() since the last call to remove()"
            com.google.android.gms.internal.mlkit_vision_text_common.zzx.zzd(r0, r1)
            java.util.Iterator r0 = r3.zza
            r0.remove()
            com.google.android.gms.internal.mlkit_vision_text_common.zzad r0 = r3.zzc
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r0 = r0.zzb
            int r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzd(r0)
            java.util.Collection r2 = r3.zzb
            int r2 = r2.size()
            int r1 = r1 - r2
            com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzj(r0, r1)
            java.util.Collection r0 = r3.zzb
            r0.clear()
            r0 = 0
            r3.zzb = r0
            return
    }
}
