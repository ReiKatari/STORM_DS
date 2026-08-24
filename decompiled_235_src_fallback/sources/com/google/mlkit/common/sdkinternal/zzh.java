package com.google.mlkit.common.sdkinternal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
enum zzh extends java.lang.Enum implements java.util.concurrent.Executor {
    public static final com.google.mlkit.common.sdkinternal.zzh zza = null;
    private static final /* synthetic */ com.google.mlkit.common.sdkinternal.zzh[] zzb = null;

    static {
            com.google.mlkit.common.sdkinternal.zzh r0 = new com.google.mlkit.common.sdkinternal.zzh
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.zzh.zza = r0
            com.google.mlkit.common.sdkinternal.zzh[] r0 = new com.google.mlkit.common.sdkinternal.zzh[]{r0}
            com.google.mlkit.common.sdkinternal.zzh.zzb = r0
            return
    }

    zzh(java.lang.String r1, int r2) {
            r0 = this;
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public static com.google.mlkit.common.sdkinternal.zzh[] values() {
            com.google.mlkit.common.sdkinternal.zzh[] r0 = com.google.mlkit.common.sdkinternal.zzh.zzb
            java.lang.Object r0 = r0.clone()
            com.google.mlkit.common.sdkinternal.zzh[] r0 = (com.google.mlkit.common.sdkinternal.zzh[]) r0
            return r0
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r1) {
            r0 = this;
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance()
            android.os.Handler r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.zza(r0)
            r0.post(r1)
            return
    }
}
