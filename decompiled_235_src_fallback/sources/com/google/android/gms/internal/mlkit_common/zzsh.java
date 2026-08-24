package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzsh {
    private static com.google.android.gms.internal.mlkit_common.zzaf zza;
    private static final com.google.android.gms.internal.mlkit_common.zzai zzb = null;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.mlkit_common.zzrz zze;
    private final com.google.mlkit.common.sdkinternal.SharedPrefManager zzf;
    private final com.google.android.gms.tasks.Task zzg;
    private final com.google.android.gms.tasks.Task zzh;
    private final java.lang.String zzi;
    private final int zzj;

    static {
            java.lang.String r0 = "optional-module-barcode"
            java.lang.String r1 = "com.google.android.gms.vision.barcode"
            com.google.android.gms.internal.mlkit_common.zzai r0 = com.google.android.gms.internal.mlkit_common.zzai.zzc(r0, r1)
            com.google.android.gms.internal.mlkit_common.zzsh.zzb = r0
            return
    }

    public zzsh(android.content.Context r2, com.google.mlkit.common.sdkinternal.SharedPrefManager r3, com.google.android.gms.internal.mlkit_common.zzrz r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r0 = r2.getPackageName()
            r1.zzc = r0
            java.lang.String r0 = com.google.mlkit.common.sdkinternal.CommonUtils.getAppVersion(r2)
            r1.zzd = r0
            r1.zzf = r3
            r1.zze = r4
            com.google.android.gms.internal.mlkit_common.zzsv.zza()
            r1.zzi = r5
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r4 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance()
            com.google.android.gms.internal.mlkit_common.zzse r0 = new com.google.android.gms.internal.mlkit_common.zzse
            r0.<init>(r1)
            com.google.android.gms.tasks.Task r4 = r4.scheduleCallable(r0)
            r1.zzg = r4
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r4 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance()
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.mlkit_common.zzsf r0 = new com.google.android.gms.internal.mlkit_common.zzsf
            r0.<init>(r3)
            com.google.android.gms.tasks.Task r3 = r4.scheduleCallable(r0)
            r1.zzh = r3
            com.google.android.gms.internal.mlkit_common.zzai r3 = com.google.android.gms.internal.mlkit_common.zzsh.zzb
            boolean r4 = r3.containsKey(r5)
            if (r4 == 0) goto L56
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            int r2 = com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(r2, r3)
            goto L57
        L56:
            r2 = -1
        L57:
            r1.zzj = r2
            return
    }

    private static synchronized com.google.android.gms.internal.mlkit_common.zzaf zzh() {
            java.lang.Class<com.google.android.gms.internal.mlkit_common.zzsh> r0 = com.google.android.gms.internal.mlkit_common.zzsh.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_common.zzaf r1 = com.google.android.gms.internal.mlkit_common.zzsh.zza     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return r1
        L9:
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()     // Catch: java.lang.Throwable -> L39
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L39
            android.os.LocaleList r1 = r1.getLocales()     // Catch: java.lang.Throwable -> L39
            hy3 r2 = new hy3     // Catch: java.lang.Throwable -> L39
            iy3 r3 = new iy3     // Catch: java.lang.Throwable -> L39
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L39
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.mlkit_common.zzac r1 = new com.google.android.gms.internal.mlkit_common.zzac     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            r3 = 0
        L25:
            int r4 = r2.c()     // Catch: java.lang.Throwable -> L39
            if (r3 >= r4) goto L3b
            java.util.Locale r4 = r2.b(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = com.google.mlkit.common.sdkinternal.CommonUtils.languageTagFromLocale(r4)     // Catch: java.lang.Throwable -> L39
            r1.zzb(r4)     // Catch: java.lang.Throwable -> L39
            int r3 = r3 + 1
            goto L25
        L39:
            r1 = move-exception
            goto L43
        L3b:
            com.google.android.gms.internal.mlkit_common.zzaf r1 = r1.zzc()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.mlkit_common.zzsh.zza = r1     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)
            return r1
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r1
    }

    private final com.google.android.gms.internal.mlkit_common.zzqt zzi(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.internal.mlkit_common.zzqt r0 = new com.google.android.gms.internal.mlkit_common.zzqt
            r0.<init>()
            java.lang.String r1 = r2.zzc
            r0.zzb(r1)
            java.lang.String r1 = r2.zzd
            r0.zzc(r1)
            com.google.android.gms.internal.mlkit_common.zzaf r1 = zzh()
            r0.zzh(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.zzg(r1)
            r0.zzl(r3)
            r0.zzj(r4)
            com.google.android.gms.tasks.Task r3 = r2.zzh
            boolean r3 = r3.isSuccessful()
            if (r3 == 0) goto L32
            com.google.android.gms.tasks.Task r3 = r2.zzh
            java.lang.Object r3 = r3.getResult()
            java.lang.String r3 = (java.lang.String) r3
            goto L38
        L32:
            com.google.mlkit.common.sdkinternal.SharedPrefManager r3 = r2.zzf
            java.lang.String r3 = r3.getMlSdkInstanceId()
        L38:
            r0.zzi(r3)
            r3 = 10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.zzd(r3)
            int r2 = r2.zzj
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.zzk(r2)
            return r0
    }

    private final java.lang.String zzj() {
            r1 = this;
            com.google.android.gms.tasks.Task r0 = r1.zzg
            boolean r0 = r0.isSuccessful()
            if (r0 == 0) goto L11
            com.google.android.gms.tasks.Task r1 = r1.zzg
            java.lang.Object r1 = r1.getResult()
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L11:
            java.lang.String r1 = r1.zzi
            com.google.android.gms.common.internal.LibraryVersion r0 = com.google.android.gms.common.internal.LibraryVersion.getInstance()
            java.lang.String r1 = r0.getVersion(r1)
            return r1
    }

    public final /* synthetic */ java.lang.String zza() {
            r1 = this;
            com.google.android.gms.common.internal.LibraryVersion r0 = com.google.android.gms.common.internal.LibraryVersion.getInstance()
            java.lang.String r1 = r1.zzi
            java.lang.String r1 = r0.getVersion(r1)
            return r1
    }

    public final /* synthetic */ void zzb(com.google.android.gms.internal.mlkit_common.zzry r1, com.google.android.gms.internal.mlkit_common.zzmv r2, java.lang.String r3) {
            r0 = this;
            r1.zza(r2)
            java.lang.String r2 = r1.zzd()
            com.google.android.gms.internal.mlkit_common.zzqt r2 = r0.zzi(r2, r3)
            r1.zzc(r2)
            com.google.android.gms.internal.mlkit_common.zzrz r0 = r0.zze
            r0.zza(r1)
            return
    }

    public final /* synthetic */ void zzc(com.google.android.gms.internal.mlkit_common.zzry r3, com.google.android.gms.internal.mlkit_common.zzsj r4, com.google.mlkit.common.model.RemoteModel r5) {
            r2 = this;
            com.google.android.gms.internal.mlkit_common.zzmv r0 = com.google.android.gms.internal.mlkit_common.zzmv.zzaW
            r3.zza(r0)
            java.lang.String r0 = r4.zze()
            java.lang.String r1 = r2.zzj()
            com.google.android.gms.internal.mlkit_common.zzqt r0 = r2.zzi(r0, r1)
            r3.zzc(r0)
            com.google.mlkit.common.sdkinternal.SharedPrefManager r0 = r2.zzf
            com.google.android.gms.internal.mlkit_common.zznc r4 = com.google.android.gms.internal.mlkit_common.zzst.zza(r5, r0, r4)
            r3.zzb(r4)
            com.google.android.gms.internal.mlkit_common.zzrz r2 = r2.zze
            r2.zza(r3)
            return
    }

    public final void zzd(com.google.android.gms.internal.mlkit_common.zzry r4, com.google.android.gms.internal.mlkit_common.zzmv r5) {
            r3 = this;
            java.lang.String r0 = r3.zzj()
            java.util.concurrent.Executor r1 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor()
            com.google.android.gms.internal.mlkit_common.zzsd r2 = new com.google.android.gms.internal.mlkit_common.zzsd
            r2.<init>(r3, r4, r5, r0)
            r1.execute(r2)
            return
    }

    public final void zze(com.google.android.gms.internal.mlkit_common.zzry r2, com.google.mlkit.common.model.RemoteModel r3, boolean r4, int r5) {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzsi r4 = com.google.android.gms.internal.mlkit_common.zzsj.zzh()
            r0 = 0
            r4.zzf(r0)
            com.google.mlkit.common.sdkinternal.ModelType r0 = r3.getModelType()
            r4.zzd(r0)
            com.google.android.gms.internal.mlkit_common.zzna r0 = com.google.android.gms.internal.mlkit_common.zzna.zzi
            r4.zza(r0)
            com.google.android.gms.internal.mlkit_common.zzmu r0 = com.google.android.gms.internal.mlkit_common.zzmu.zzo
            r4.zzb(r0)
            r4.zzc(r5)
            com.google.android.gms.internal.mlkit_common.zzsj r4 = r4.zzh()
            r1.zzg(r2, r3, r4)
            return
    }

    public final void zzf(com.google.android.gms.internal.mlkit_common.zzry r2, com.google.mlkit.common.model.RemoteModel r3, com.google.android.gms.internal.mlkit_common.zzmu r4, boolean r5, com.google.mlkit.common.sdkinternal.ModelType r6, com.google.android.gms.internal.mlkit_common.zzna r7) {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzsi r0 = com.google.android.gms.internal.mlkit_common.zzsj.zzh()
            r0.zzf(r5)
            r0.zzd(r6)
            r0.zzb(r4)
            r0.zza(r7)
            com.google.android.gms.internal.mlkit_common.zzsj r4 = r0.zzh()
            r1.zzg(r2, r3, r4)
            return
    }

    public final void zzg(com.google.android.gms.internal.mlkit_common.zzry r3, com.google.mlkit.common.model.RemoteModel r4, com.google.android.gms.internal.mlkit_common.zzsj r5) {
            r2 = this;
            java.util.concurrent.Executor r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor()
            com.google.android.gms.internal.mlkit_common.zzsg r1 = new com.google.android.gms.internal.mlkit_common.zzsg
            r1.<init>(r2, r3, r5, r4)
            r0.execute(r1)
            return
    }
}
