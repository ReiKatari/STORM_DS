package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzgh implements defpackage.qh4 {
    static final com.google.android.gms.internal.mlkit_common.zzgh zza = null;
    private static final defpackage.na2 zzb = null;
    private static final defpackage.na2 zzc = null;
    private static final defpackage.na2 zzd = null;

    static {
            com.google.android.gms.internal.mlkit_common.zzgh r0 = new com.google.android.gms.internal.mlkit_common.zzgh
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzgh.zza = r0
            r0 = 1
            com.google.android.gms.internal.mlkit_common.zzbc r0 = defpackage.xg6.h(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "modelType"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_common.zzgh.zzb = r0
            r0 = 2
            com.google.android.gms.internal.mlkit_common.zzbc r0 = defpackage.xg6.h(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "isDownloaded"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_common.zzgh.zzc = r0
            r0 = 3
            com.google.android.gms.internal.mlkit_common.zzbc r0 = defpackage.xg6.h(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "modelName"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_common.zzgh.zzd = r0
            return
    }

    private zzgh() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzmj r2 = (com.google.android.gms.internal.mlkit_common.zzmj) r2
            rh4 r3 = (defpackage.rh4) r3
            na2 r1 = com.google.android.gms.internal.mlkit_common.zzgh.zzb
            com.google.android.gms.internal.mlkit_common.zzne r0 = r2.zza()
            r3.add(r1, r0)
            na2 r1 = com.google.android.gms.internal.mlkit_common.zzgh.zzc
            java.lang.Boolean r2 = r2.zzb()
            r3.add(r1, r2)
            na2 r1 = com.google.android.gms.internal.mlkit_common.zzgh.zzd
            r2 = 0
            r3.add(r1, r2)
            return
    }
}
