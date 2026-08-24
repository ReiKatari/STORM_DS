package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zzaw implements java.util.Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zzba zze;

    public /* synthetic */ zzaw(com.google.android.gms.internal.mlkit_vision_text_common.zzba r1, com.google.android.gms.internal.mlkit_vision_text_common.zzav r2) {
            r0 = this;
            r0.zze = r1
            r0.<init>()
            int r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zza(r1)
            r0.zzb = r2
            int r1 = r1.zze()
            r0.zzc = r1
            r1 = -1
            r0.zzd = r1
            return
    }

    private final void zzb() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r1.zze
            int r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zza(r0)
            int r1 = r1.zzb
            if (r0 != r1) goto Lb
            return
        Lb:
            defpackage.i.l()
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            int r0 = r0.zzc
            if (r0 < 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            r3.zzb()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1c
            int r0 = r3.zzc
            r3.zzd = r0
            java.lang.Object r0 = r3.zza(r0)
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r1 = r3.zze
            int r2 = r3.zzc
            int r1 = r1.zzf(r2)
            r3.zzc = r1
            return r0
        L1c:
            defpackage.fa6.c()
            r3 = 0
            return r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            r2.zzb()
            int r0 = r2.zzd
            if (r0 < 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r1 = "no calls to next() since the last call to remove()"
            com.google.android.gms.internal.mlkit_vision_text_common.zzx.zzd(r0, r1)
            int r0 = r2.zzb
            int r0 = r0 + 32
            r2.zzb = r0
            int r0 = r2.zzd
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r1 = r2.zze
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzg(r1, r0)
            r1.remove(r0)
            int r0 = r2.zzc
            r1 = -1
            int r0 = r0 + r1
            r2.zzc = r0
            r2.zzd = r1
            return
    }

    public abstract java.lang.Object zza(int r1);
}
