package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzto extends com.google.android.gms.internal.mlkit_vision_text_common.zztt {
    private java.lang.String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    public zzto() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final com.google.android.gms.internal.mlkit_vision_text_common.zztt zza(boolean r2) {
            r1 = this;
            r2 = 1
            r1.zzb = r2
            byte r0 = r1.zzd
            r2 = r2 | r0
            byte r2 = (byte) r2
            r1.zzd = r2
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final com.google.android.gms.internal.mlkit_vision_text_common.zztt zzb(int r1) {
            r0 = this;
            r1 = 1
            r0.zzc = r1
            byte r1 = r0.zzd
            r1 = r1 | 2
            byte r1 = (byte) r1
            r0.zzd = r1
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_text_common.zztt zzc(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.zza = r1
            return r0
        L5:
            java.lang.String r0 = "Null libraryName"
            defpackage.u34.x(r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final com.google.android.gms.internal.mlkit_vision_text_common.zztu zzd() {
            r4 = this;
            byte r0 = r4.zzd
            r1 = 3
            r2 = 0
            if (r0 != r1) goto L15
            java.lang.String r0 = r4.zza
            if (r0 != 0) goto Lb
            goto L15
        Lb:
            com.google.android.gms.internal.mlkit_vision_text_common.zztq r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zztq
            boolean r3 = r4.zzb
            int r4 = r4.zzc
            r1.<init>(r0, r3, r4, r2)
            return r1
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.zza
            if (r1 != 0) goto L23
            java.lang.String r1 = " libraryName"
            r0.append(r1)
        L23:
            byte r1 = r4.zzd
            r1 = r1 & 1
            if (r1 != 0) goto L2e
            java.lang.String r1 = " enableFirelog"
            r0.append(r1)
        L2e:
            byte r4 = r4.zzd
            r4 = r4 & 2
            if (r4 != 0) goto L39
            java.lang.String r4 = " firelogEventType"
            r0.append(r4)
        L39:
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "Missing required properties:"
            java.lang.String r4 = r0.concat(r4)
            defpackage.i.m(r4)
            return r2
    }
}
