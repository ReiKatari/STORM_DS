package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class zzah implements java.util.Iterator {
    final java.util.Iterator zza;
    final java.util.Collection zzb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zzai zzc;

    public zzah(com.google.android.gms.internal.mlkit_vision_text_common.zzai r2) {
            r1 = this;
            r1.zzc = r2
            r1.<init>()
            java.util.Collection r2 = r2.zzb
            r1.zzb = r2
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L14
            java.util.List r2 = (java.util.List) r2
            java.util.ListIterator r2 = r2.listIterator()
            goto L18
        L14:
            java.util.Iterator r2 = r2.iterator()
        L18:
            r1.zza = r2
            return
    }

    public zzah(com.google.android.gms.internal.mlkit_vision_text_common.zzai r1, java.util.Iterator r2) {
            r0 = this;
            r0.zzc = r1
            r0.<init>()
            java.util.Collection r1 = r1.zzb
            r0.zzb = r1
            r0.zza = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            r0.zza()
            java.util.Iterator r0 = r0.zza
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r0 = this;
            r0.zza()
            java.util.Iterator r0 = r0.zza
            java.lang.Object r0 = r0.next()
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            java.util.Iterator r0 = r2.zza
            r0.remove()
            com.google.android.gms.internal.mlkit_vision_text_common.zzai r0 = r2.zzc
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r0 = r0.zze
            int r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzd(r0)
            int r1 = r1 + (-1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzj(r0, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzai r2 = r2.zzc
            r2.zzc()
            return
    }

    public final void zza() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzai r0 = r1.zzc
            r0.zzb()
            com.google.android.gms.internal.mlkit_vision_text_common.zzai r0 = r1.zzc
            java.util.Collection r0 = r0.zzb
            java.util.Collection r1 = r1.zzb
            if (r0 != r1) goto Le
            return
        Le:
            defpackage.i.l()
            return
    }
}
