package com.google.android.gms.internal.mlkit_vision_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzmj {
    private static com.google.android.gms.internal.mlkit_vision_common.zzp zza;
    private static final com.google.android.gms.internal.mlkit_vision_common.zzr zzb = null;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.mlkit_vision_common.zzmc zze;
    private final com.google.mlkit.common.sdkinternal.SharedPrefManager zzf;
    private final com.google.android.gms.tasks.Task zzg;
    private final com.google.android.gms.tasks.Task zzh;
    private final java.lang.String zzi;
    private final int zzj;
    private final java.util.Map zzk;
    private final java.util.Map zzl;

    static {
            java.lang.String r0 = "optional-module-barcode"
            java.lang.String r1 = "com.google.android.gms.vision.barcode"
            com.google.android.gms.internal.mlkit_vision_common.zzr r0 = com.google.android.gms.internal.mlkit_vision_common.zzr.zzc(r0, r1)
            com.google.android.gms.internal.mlkit_vision_common.zzmj.zzb = r0
            return
    }

    public zzmj(android.content.Context r2, com.google.mlkit.common.sdkinternal.SharedPrefManager r3, com.google.android.gms.internal.mlkit_vision_common.zzmc r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzk = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzl = r0
            java.lang.String r0 = r2.getPackageName()
            r1.zzc = r0
            java.lang.String r0 = com.google.mlkit.common.sdkinternal.CommonUtils.getAppVersion(r2)
            r1.zzd = r0
            r1.zzf = r3
            r1.zze = r4
            com.google.android.gms.internal.mlkit_vision_common.zzmw.zza()
            r1.zzi = r5
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r4 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance()
            com.google.android.gms.internal.mlkit_vision_common.zzmg r0 = new com.google.android.gms.internal.mlkit_vision_common.zzmg
            r0.<init>(r1)
            com.google.android.gms.tasks.Task r4 = r4.scheduleCallable(r0)
            r1.zzg = r4
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r4 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance()
            r3.getClass()
            com.google.android.gms.internal.mlkit_vision_common.zzmh r0 = new com.google.android.gms.internal.mlkit_vision_common.zzmh
            r0.<init>(r3)
            com.google.android.gms.tasks.Task r3 = r4.scheduleCallable(r0)
            r1.zzh = r3
            com.google.android.gms.internal.mlkit_vision_common.zzr r3 = com.google.android.gms.internal.mlkit_vision_common.zzmj.zzb
            boolean r4 = r3.containsKey(r5)
            if (r4 == 0) goto L5a
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            int r2 = com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(r2, r3)
            goto L5b
        L5a:
            r2 = -1
        L5b:
            r1.zzj = r2
            return
    }

    private static synchronized com.google.android.gms.internal.mlkit_vision_common.zzp zzd() {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_common.zzmj> r0 = com.google.android.gms.internal.mlkit_vision_common.zzmj.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzp r1 = com.google.android.gms.internal.mlkit_vision_common.zzmj.zza     // Catch: java.lang.Throwable -> L39
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
            com.google.android.gms.internal.mlkit_vision_common.zzm r1 = new com.google.android.gms.internal.mlkit_vision_common.zzm     // Catch: java.lang.Throwable -> L39
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
            com.google.android.gms.internal.mlkit_vision_common.zzp r1 = r1.zzc()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.mlkit_vision_common.zzmj.zza = r1     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)
            return r1
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r1
    }

    public final /* synthetic */ java.lang.String zza() {
            r1 = this;
            com.google.android.gms.common.internal.LibraryVersion r0 = com.google.android.gms.common.internal.LibraryVersion.getInstance()
            java.lang.String r1 = r1.zzi
            java.lang.String r1 = r0.getVersion(r1)
            return r1
    }

    public final /* synthetic */ void zzb(com.google.android.gms.internal.mlkit_vision_common.zzmb r3, com.google.android.gms.internal.mlkit_vision_common.zziv r4, java.lang.String r5) {
            r2 = this;
            r3.zza(r4)
            java.lang.String r4 = r3.zzc()
            com.google.android.gms.internal.mlkit_vision_common.zzky r0 = new com.google.android.gms.internal.mlkit_vision_common.zzky
            r0.<init>()
            java.lang.String r1 = r2.zzc
            r0.zzb(r1)
            java.lang.String r1 = r2.zzd
            r0.zzc(r1)
            com.google.android.gms.internal.mlkit_vision_common.zzp r1 = zzd()
            r0.zzh(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.zzg(r1)
            r0.zzl(r4)
            r0.zzj(r5)
            com.google.android.gms.tasks.Task r4 = r2.zzh
            boolean r4 = r4.isSuccessful()
            if (r4 == 0) goto L39
            com.google.android.gms.tasks.Task r4 = r2.zzh
            java.lang.Object r4 = r4.getResult()
            java.lang.String r4 = (java.lang.String) r4
            goto L3f
        L39:
            com.google.mlkit.common.sdkinternal.SharedPrefManager r4 = r2.zzf
            java.lang.String r4 = r4.getMlSdkInstanceId()
        L3f:
            r0.zzi(r4)
            r4 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.zzd(r4)
            int r4 = r2.zzj
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.zzk(r4)
            r3.zzb(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzmc r2 = r2.zze
            r2.zza(r3)
            return
    }

    public final void zzc(com.google.android.gms.internal.mlkit_vision_common.zzmt r10, com.google.android.gms.internal.mlkit_vision_common.zziv r11) {
            r9 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.Map r2 = r9.zzk
            java.lang.Object r2 = r2.get(r11)
            if (r2 != 0) goto Ld
            goto L22
        Ld:
            java.util.Map r2 = r9.zzk
            java.lang.Object r2 = r2.get(r11)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r2 = r0 - r2
            r4 = 30000(0x7530, double:1.4822E-319)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L22
            return
        L22:
            java.util.Map r2 = r9.zzk
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r11, r0)
            int r0 = r10.zza
            int r1 = r10.zzb
            int r2 = r10.zzc
            int r3 = r10.zzd
            int r4 = r10.zze
            long r5 = r10.zzf
            int r10 = r10.zzg
            com.google.android.gms.internal.mlkit_vision_common.zzin r7 = new com.google.android.gms.internal.mlkit_vision_common.zzin
            r7.<init>()
            r8 = -1
            if (r0 == r8) goto L61
            r8 = 35
            if (r0 == r8) goto L5e
            r8 = 842094169(0x32315659, float:1.0322389E-8)
            if (r0 == r8) goto L5b
            r8 = 16
            if (r0 == r8) goto L58
            r8 = 17
            if (r0 == r8) goto L55
            com.google.android.gms.internal.mlkit_vision_common.zzii r0 = com.google.android.gms.internal.mlkit_vision_common.zzii.zza
            goto L63
        L55:
            com.google.android.gms.internal.mlkit_vision_common.zzii r0 = com.google.android.gms.internal.mlkit_vision_common.zzii.zzc
            goto L63
        L58:
            com.google.android.gms.internal.mlkit_vision_common.zzii r0 = com.google.android.gms.internal.mlkit_vision_common.zzii.zzb
            goto L63
        L5b:
            com.google.android.gms.internal.mlkit_vision_common.zzii r0 = com.google.android.gms.internal.mlkit_vision_common.zzii.zzd
            goto L63
        L5e:
            com.google.android.gms.internal.mlkit_vision_common.zzii r0 = com.google.android.gms.internal.mlkit_vision_common.zzii.zze
            goto L63
        L61:
            com.google.android.gms.internal.mlkit_vision_common.zzii r0 = com.google.android.gms.internal.mlkit_vision_common.zzii.zzg
        L63:
            r7.zzd(r0)
            r0 = 1
            if (r1 == r0) goto L7e
            r0 = 2
            if (r1 == r0) goto L7b
            r0 = 3
            if (r1 == r0) goto L78
            r0 = 4
            if (r1 == r0) goto L75
            com.google.android.gms.internal.mlkit_vision_common.zzio r0 = com.google.android.gms.internal.mlkit_vision_common.zzio.zzf
            goto L80
        L75:
            com.google.android.gms.internal.mlkit_vision_common.zzio r0 = com.google.android.gms.internal.mlkit_vision_common.zzio.zze
            goto L80
        L78:
            com.google.android.gms.internal.mlkit_vision_common.zzio r0 = com.google.android.gms.internal.mlkit_vision_common.zzio.zzd
            goto L80
        L7b:
            com.google.android.gms.internal.mlkit_vision_common.zzio r0 = com.google.android.gms.internal.mlkit_vision_common.zzio.zzc
            goto L80
        L7e:
            com.google.android.gms.internal.mlkit_vision_common.zzio r0 = com.google.android.gms.internal.mlkit_vision_common.zzio.zzb
        L80:
            r7.zzf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r7.zzc(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r7.zze(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r7.zzg(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r7.zzb(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7.zzh(r10)
            com.google.android.gms.internal.mlkit_vision_common.zziq r10 = r7.zzj()
            com.google.android.gms.internal.mlkit_vision_common.zziw r0 = new com.google.android.gms.internal.mlkit_vision_common.zziw
            r0.<init>()
            r0.zzd(r10)
            com.google.android.gms.internal.mlkit_vision_common.zzmb r10 = com.google.android.gms.internal.mlkit_vision_common.zzmk.zze(r0)
            com.google.android.gms.tasks.Task r0 = r9.zzg
            boolean r0 = r0.isSuccessful()
            if (r0 == 0) goto Lc7
            com.google.android.gms.tasks.Task r0 = r9.zzg
            java.lang.Object r0 = r0.getResult()
            java.lang.String r0 = (java.lang.String) r0
            goto Ld1
        Lc7:
            com.google.android.gms.common.internal.LibraryVersion r0 = com.google.android.gms.common.internal.LibraryVersion.getInstance()
            java.lang.String r1 = r9.zzi
            java.lang.String r0 = r0.getVersion(r1)
        Ld1:
            java.util.concurrent.Executor r1 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor()
            com.google.android.gms.internal.mlkit_vision_common.zzmi r2 = new com.google.android.gms.internal.mlkit_vision_common.zzmi
            r2.<init>(r9, r10, r11, r0)
            r1.execute(r2)
            return
    }
}
