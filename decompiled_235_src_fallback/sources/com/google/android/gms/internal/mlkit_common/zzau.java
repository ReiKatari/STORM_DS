package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
enum zzau extends java.lang.Enum implements java.util.concurrent.Executor {
    public static final com.google.android.gms.internal.mlkit_common.zzau zza = null;
    private static final /* synthetic */ com.google.android.gms.internal.mlkit_common.zzau[] zzb = null;

    static {
            com.google.android.gms.internal.mlkit_common.zzau r0 = new com.google.android.gms.internal.mlkit_common.zzau
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.internal.mlkit_common.zzau.zza = r0
            com.google.android.gms.internal.mlkit_common.zzau[] r0 = new com.google.android.gms.internal.mlkit_common.zzau[]{r0}
            com.google.android.gms.internal.mlkit_common.zzau.zzb = r0
            return
    }

    zzau(java.lang.String r1, int r2) {
            r0 = this;
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public static com.google.android.gms.internal.mlkit_common.zzau[] values() {
            com.google.android.gms.internal.mlkit_common.zzau[] r0 = com.google.android.gms.internal.mlkit_common.zzau.zzb
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.mlkit_common.zzau[] r0 = (com.google.android.gms.internal.mlkit_common.zzau[]) r0
            return r0
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r1) {
            r0 = this;
            r1.run()
            return
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "MoreExecutors.directExecutor()"
            return r0
    }
}
