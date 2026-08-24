package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzmu {
    public static void zza(zzmj zzmjVar, int i, int i2, long j, int i3, int i4, int i5, int i6) {
        zzmjVar.zzc(zzc(i, i2, j, i3, i4, i5, i6), zziv.INPUT_IMAGE_CONSTRUCTION);
    }

    public static void zzb(zzmj zzmjVar, int i, int i2, long j, int i3, int i4, int i5, int i6) {
        zzmjVar.zzc(zzc(i, i2, j, i3, i4, i5, i6), zziv.ODML_IMAGE);
    }

    private static zzmt zzc(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        return new zzmt(i, i2, i5, i3, i4, SystemClock.elapsedRealtime() - j, i6);
    }
}
