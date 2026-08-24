package com.google.mlkit.vision.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class zzd implements java.util.concurrent.Callable {
    public final /* synthetic */ com.google.mlkit.vision.common.internal.MobileVisionBase zza;
    public final /* synthetic */ defpackage.p64 zzb;

    public /* synthetic */ zzd(com.google.mlkit.vision.common.internal.MobileVisionBase r1, defpackage.p64 r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
            r1 = this;
            com.google.mlkit.vision.common.internal.MobileVisionBase r1 = r1.zza
            r0 = 0
            java.lang.Object r1 = r1.zzb(r0)
            return r1
    }
}
