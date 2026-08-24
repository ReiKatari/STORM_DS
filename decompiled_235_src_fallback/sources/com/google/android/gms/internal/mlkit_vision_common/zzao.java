package com.google.android.gms.internal.mlkit_vision_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzao implements defpackage.mk7 {
    private boolean zza;
    private boolean zzb;
    private defpackage.na2 zzc;
    private final com.google.android.gms.internal.mlkit_vision_common.zzak zzd;

    public zzao(com.google.android.gms.internal.mlkit_vision_common.zzak r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            r1.zzb = r0
            r1.zzd = r2
            return
    }

    private final void zzb() {
            r1 = this;
            boolean r0 = r1.zza
            if (r0 != 0) goto L8
            r0 = 1
            r1.zza = r0
            return
        L8:
            d42 r1 = new d42
            java.lang.String r0 = "Cannot encode a second value in the ValueEncoderContext"
            r1.<init>(r0)
            throw r1
    }

    public final defpackage.mk7 add(double r4) {
            r3 = this;
            r3.zzb()
            com.google.android.gms.internal.mlkit_vision_common.zzak r0 = r3.zzd
            na2 r1 = r3.zzc
            boolean r2 = r3.zzb
            r0.zza(r1, r4, r2)
            return r3
    }

    public final defpackage.mk7 add(float r4) {
            r3 = this;
            r3.zzb()
            com.google.android.gms.internal.mlkit_vision_common.zzak r0 = r3.zzd
            na2 r1 = r3.zzc
            boolean r2 = r3.zzb
            r0.zzb(r1, r4, r2)
            return r3
    }

    public final defpackage.mk7 add(int r4) {
            r3 = this;
            r3.zzb()
            com.google.android.gms.internal.mlkit_vision_common.zzak r0 = r3.zzd
            na2 r1 = r3.zzc
            boolean r2 = r3.zzb
            r0.zzd(r1, r4, r2)
            return r3
    }

    public final defpackage.mk7 add(long r4) {
            r3 = this;
            r3.zzb()
            com.google.android.gms.internal.mlkit_vision_common.zzak r0 = r3.zzd
            na2 r1 = r3.zzc
            boolean r2 = r3.zzb
            r0.zze(r1, r4, r2)
            return r3
    }

    @Override // defpackage.mk7
    public final defpackage.mk7 add(java.lang.String r4) {
            r3 = this;
            r3.zzb()
            com.google.android.gms.internal.mlkit_vision_common.zzak r0 = r3.zzd
            na2 r1 = r3.zzc
            boolean r2 = r3.zzb
            r0.zzc(r1, r4, r2)
            return r3
    }

    @Override // defpackage.mk7
    public final defpackage.mk7 add(boolean r4) {
            r3 = this;
            r3.zzb()
            com.google.android.gms.internal.mlkit_vision_common.zzak r0 = r3.zzd
            na2 r1 = r3.zzc
            boolean r2 = r3.zzb
            r0.zzd(r1, r4, r2)
            return r3
    }

    public final defpackage.mk7 add(byte[] r4) {
            r3 = this;
            r3.zzb()
            com.google.android.gms.internal.mlkit_vision_common.zzak r0 = r3.zzd
            na2 r1 = r3.zzc
            boolean r2 = r3.zzb
            r0.zzc(r1, r4, r2)
            return r3
    }

    public final void zza(defpackage.na2 r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.zza = r0
            r1.zzc = r2
            r1.zzb = r3
            return
    }
}
