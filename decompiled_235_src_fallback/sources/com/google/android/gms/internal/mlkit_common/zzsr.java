package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzsr extends com.google.mlkit.common.sdkinternal.LazyInstanceMap {
    private zzsr() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public /* synthetic */ zzsr(com.google.android.gms.internal.mlkit_common.zzsq r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ java.lang.Object create(java.lang.Object r5) {
            r4 = this;
            com.google.android.gms.internal.mlkit_common.zzsb r5 = (com.google.android.gms.internal.mlkit_common.zzsb) r5
            com.google.android.gms.internal.mlkit_common.zzsh r4 = new com.google.android.gms.internal.mlkit_common.zzsh
            com.google.mlkit.common.sdkinternal.MlKitContext r0 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()
            com.google.android.gms.internal.mlkit_common.zzsc r1 = new com.google.android.gms.internal.mlkit_common.zzsc
            com.google.mlkit.common.sdkinternal.MlKitContext r2 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()
            android.content.Context r2 = r2.getApplicationContext()
            r1.<init>(r2, r5)
            java.lang.String r5 = r5.zzb()
            android.content.Context r2 = r0.getApplicationContext()
            java.lang.Class<com.google.mlkit.common.sdkinternal.SharedPrefManager> r3 = com.google.mlkit.common.sdkinternal.SharedPrefManager.class
            java.lang.Object r0 = r0.get(r3)
            com.google.mlkit.common.sdkinternal.SharedPrefManager r0 = (com.google.mlkit.common.sdkinternal.SharedPrefManager) r0
            r4.<init>(r2, r0, r1, r5)
            return r4
    }
}
