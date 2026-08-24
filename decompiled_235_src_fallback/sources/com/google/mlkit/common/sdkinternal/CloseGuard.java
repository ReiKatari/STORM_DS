package com.google.mlkit.common.sdkinternal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CloseGuard implements java.io.Closeable {
    public static final int API_TRANSLATE = 1;
    private final java.util.concurrent.atomic.AtomicBoolean zza;
    private final java.lang.String zzb;
    private final com.google.mlkit.common.sdkinternal.Cleaner.Cleanable zzc;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Factory {
        private final com.google.mlkit.common.sdkinternal.Cleaner zza;

        public Factory(com.google.mlkit.common.sdkinternal.Cleaner r1) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                return
        }

        public com.google.mlkit.common.sdkinternal.CloseGuard create(java.lang.Object r7, int r8, java.lang.Runnable r9) {
                r6 = this;
                com.google.mlkit.common.sdkinternal.Cleaner r3 = r6.zza
                java.lang.String r6 = "common"
                com.google.android.gms.internal.mlkit_common.zzsh r5 = com.google.android.gms.internal.mlkit_common.zzss.zzb(r6)
                com.google.mlkit.common.sdkinternal.CloseGuard r0 = new com.google.mlkit.common.sdkinternal.CloseGuard
                r1 = r7
                r2 = r8
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }
    }

    public CloseGuard(java.lang.Object r2, int r3, com.google.mlkit.common.sdkinternal.Cleaner r4, java.lang.Runnable r5, com.google.android.gms.internal.mlkit_common.zzsh r6) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.zza = r0
            java.lang.String r0 = r2.toString()
            r1.zzb = r0
            com.google.mlkit.common.sdkinternal.zze r0 = new com.google.mlkit.common.sdkinternal.zze
            r0.<init>(r1, r3, r6, r5)
            com.google.mlkit.common.sdkinternal.Cleaner$Cleanable r2 = r4.register(r2, r0)
            r1.zzc = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zza
            r1 = 1
            r0.set(r1)
            com.google.mlkit.common.sdkinternal.Cleaner$Cleanable r2 = r2.zzc
            r2.clean()
            return
    }

    public final /* synthetic */ void zza(int r2, com.google.android.gms.internal.mlkit_common.zzsh r3, java.lang.Runnable r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.zza
            boolean r0 = r0.get()
            if (r0 != 0) goto L43
            java.lang.String r1 = r1.zzb
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " has not been closed"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "MlKitCloseGuard"
            android.util.Log.e(r0, r1)
            com.google.android.gms.internal.mlkit_common.zzmw r1 = new com.google.android.gms.internal.mlkit_common.zzmw
            r1.<init>()
            com.google.android.gms.internal.mlkit_common.zzmn r0 = new com.google.android.gms.internal.mlkit_common.zzmn
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzmm r2 = com.google.android.gms.internal.mlkit_common.zzmm.zzb(r2)
            r0.zzb(r2)
            com.google.android.gms.internal.mlkit_common.zzmp r2 = r0.zzc()
            r1.zzh(r2)
            com.google.android.gms.internal.mlkit_common.zzry r1 = com.google.android.gms.internal.mlkit_common.zzsk.zzf(r1)
            com.google.android.gms.internal.mlkit_common.zzmv r2 = com.google.android.gms.internal.mlkit_common.zzmv.zzbH
            r3.zzd(r1, r2)
        L43:
            r4.run()
            return
    }
}
