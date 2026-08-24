package com.google.mlkit.vision.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzb {
    private final android.media.Image zza;

    public zzb(android.media.Image r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final android.media.Image zza() {
            r0 = this;
            android.media.Image r0 = r0.zza
            return r0
    }

    public final android.media.Image.Plane[] zzb() {
            r0 = this;
            android.media.Image r0 = r0.zza
            android.media.Image$Plane[] r0 = r0.getPlanes()
            return r0
    }
}
