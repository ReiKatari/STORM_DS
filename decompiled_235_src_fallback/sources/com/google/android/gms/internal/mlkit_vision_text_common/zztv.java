package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zztv implements com.google.android.gms.internal.mlkit_vision_text_common.zzts {
    final java.util.List zza;

    public zztv(android.content.Context r2, com.google.android.gms.internal.mlkit_vision_text_common.zztu r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zza = r0
            boolean r1 = r3.zzc()
            if (r1 == 0) goto L18
            com.google.android.gms.internal.mlkit_vision_text_common.zzuk r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzuk
            r1.<init>(r2, r3)
            r0.add(r1)
        L18:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzts
    public final void zza(com.google.android.gms.internal.mlkit_vision_text_common.zztr r2) {
            r1 = this;
            java.util.List r1 = r1.zza
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            com.google.android.gms.internal.mlkit_vision_text_common.zzts r0 = (com.google.android.gms.internal.mlkit_vision_text_common.zzts) r0
            r0.zza(r2)
            goto L6
        L16:
            return
    }
}
