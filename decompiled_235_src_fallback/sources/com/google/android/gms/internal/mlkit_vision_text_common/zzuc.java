package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzuc {
    private static com.google.android.gms.internal.mlkit_vision_text_common.zzbk zza;
    private static final com.google.android.gms.internal.mlkit_vision_text_common.zzbm zzb = null;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.mlkit_vision_text_common.zzts zze;
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
            com.google.android.gms.internal.mlkit_vision_text_common.zzbm r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzbm.zzc(r0, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzuc.zzb = r0
            return
    }

    public zzuc(android.content.Context r2, com.google.mlkit.common.sdkinternal.SharedPrefManager r3, com.google.android.gms.internal.mlkit_vision_text_common.zzts r4, java.lang.String r5) {
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
            com.google.android.gms.internal.mlkit_vision_text_common.zzuo.zza()
            r1.zzi = r5
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r4 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance()
            com.google.android.gms.internal.mlkit_vision_text_common.zzty r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzty
            r0.<init>(r1)
            com.google.android.gms.tasks.Task r4 = r4.scheduleCallable(r0)
            r1.zzg = r4
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r4 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance()
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.mlkit_vision_text_common.zztz r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zztz
            r0.<init>(r3)
            com.google.android.gms.tasks.Task r3 = r4.scheduleCallable(r0)
            r1.zzh = r3
            com.google.android.gms.internal.mlkit_vision_text_common.zzbm r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzuc.zzb
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

    public static long zza(java.util.List r4, double r5) {
            int r0 = r4.size()
            double r0 = (double) r0
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 / r2
            double r5 = r5 * r0
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            int r5 = r5 + (-1)
            r6 = 0
            int r5 = java.lang.Math.max(r5, r6)
            java.lang.Object r4 = r4.get(r5)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            return r4
    }

    private static synchronized com.google.android.gms.internal.mlkit_vision_text_common.zzbk zzi() {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_common.zzuc> r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzuc.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_text_common.zzbk r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzuc.zza     // Catch: java.lang.Throwable -> L39
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
            com.google.android.gms.internal.mlkit_vision_text_common.zzbh r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzbh     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            r3 = 0
        L25:
            int r4 = r2.c()     // Catch: java.lang.Throwable -> L39
            if (r3 >= r4) goto L3b
            java.util.Locale r4 = r2.b(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = com.google.mlkit.common.sdkinternal.CommonUtils.languageTagFromLocale(r4)     // Catch: java.lang.Throwable -> L39
            r1.zza(r4)     // Catch: java.lang.Throwable -> L39
            int r3 = r3 + 1
            goto L25
        L39:
            r1 = move-exception
            goto L43
        L3b:
            com.google.android.gms.internal.mlkit_vision_text_common.zzbk r1 = r1.zzb()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.mlkit_vision_text_common.zzuc.zza = r1     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)
            return r1
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r1
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

    private final boolean zzk(com.google.android.gms.internal.mlkit_vision_text_common.zzov r1, long r2, long r4) {
            r0 = this;
            java.util.Map r4 = r0.zzk
            java.lang.Object r4 = r4.get(r1)
            r5 = 1
            if (r4 != 0) goto La
            return r5
        La:
            java.util.Map r0 = r0.zzk
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r2 = r2 - r0
            r0 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1e
            return r5
        L1e:
            r0 = 0
            return r0
    }

    public final /* synthetic */ java.lang.String zzb() {
            r1 = this;
            com.google.android.gms.common.internal.LibraryVersion r0 = com.google.android.gms.common.internal.LibraryVersion.getInstance()
            java.lang.String r1 = r1.zzi
            java.lang.String r1 = r0.getVersion(r1)
            return r1
    }

    public final /* synthetic */ void zzc(com.google.android.gms.internal.mlkit_vision_text_common.zztr r3, com.google.android.gms.internal.mlkit_vision_text_common.zzov r4, java.lang.String r5) {
            r2 = this;
            r3.zzb(r4)
            java.lang.String r4 = r3.zzd()
            com.google.android.gms.internal.mlkit_vision_text_common.zzsr r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzsr
            r0.<init>()
            java.lang.String r1 = r2.zzc
            r0.zzb(r1)
            java.lang.String r1 = r2.zzd
            r0.zzc(r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzbk r1 = zzi()
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
            r3.zzc(r0)
            com.google.android.gms.internal.mlkit_vision_text_common.zzts r2 = r2.zze
            r2.zza(r3)
            return
    }

    public final void zzd(com.google.android.gms.internal.mlkit_vision_text_common.zztr r2, com.google.android.gms.internal.mlkit_vision_text_common.zzov r3) {
            r1 = this;
            java.lang.String r0 = r1.zzj()
            r1.zze(r2, r3, r0)
            return
    }

    public final void zze(com.google.android.gms.internal.mlkit_vision_text_common.zztr r3, com.google.android.gms.internal.mlkit_vision_text_common.zzov r4, java.lang.String r5) {
            r2 = this;
            java.util.concurrent.Executor r0 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor()
            com.google.android.gms.internal.mlkit_vision_text_common.zztw r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zztw
            r1.<init>(r2, r3, r4, r5)
            r0.execute(r1)
            return
    }

    public final void zzf(com.google.android.gms.internal.mlkit_vision_text_common.zzub r7, com.google.android.gms.internal.mlkit_vision_text_common.zzov r8) {
            r6 = this;
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 30
            r0 = r6
            r1 = r8
            boolean r6 = r0.zzk(r1, r2, r4)
            if (r6 != 0) goto Lf
            return
        Lf:
            java.util.Map r6 = r0.zzk
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            r6.put(r1, r8)
            com.google.android.gms.internal.mlkit_vision_text_common.zztr r6 = r7.zza()
            java.lang.String r7 = r0.zzj()
            r0.zze(r6, r1, r7)
            return
    }

    public final /* synthetic */ void zzg(com.google.android.gms.internal.mlkit_vision_text_common.zzov r12, com.google.mlkit.vision.text.internal.zzr r13) {
            r11 = this;
            java.util.Map r0 = r11.zzl
            java.lang.Object r0 = r0.get(r12)
            com.google.android.gms.internal.mlkit_vision_text_common.zzbp r0 = (com.google.android.gms.internal.mlkit_vision_text_common.zzbp) r0
            if (r0 == 0) goto Laf
            java.util.Set r1 = r0.zzo()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r1.next()
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List r4 = r0.zzc(r2)
            r3.<init>(r4)
            java.util.Collections.sort(r3)
            com.google.android.gms.internal.mlkit_vision_text_common.zznu r4 = new com.google.android.gms.internal.mlkit_vision_text_common.zznu
            r4.<init>()
            int r5 = r3.size()
            r6 = 0
            r7 = 0
        L34:
            if (r6 >= r5) goto L44
            java.lang.Object r9 = r3.get(r6)
            int r6 = r6 + 1
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r7 = r7 + r9
            goto L34
        L44:
            int r5 = r3.size()
            long r5 = (long) r5
            long r7 = r7 / r5
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r4.zza(r5)
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            long r5 = zza(r3, r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.zzc(r5)
            r5 = 4634978072750194688(0x4052c00000000000, double:75.0)
            long r5 = zza(r3, r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.zzf(r5)
            r5 = 4632233691727265792(0x4049000000000000, double:50.0)
            long r5 = zza(r3, r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.zzd(r5)
            r5 = 4627730092099895296(0x4039000000000000, double:25.0)
            long r5 = zza(r3, r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.zzb(r5)
            r5 = 0
            long r5 = zza(r3, r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.zze(r5)
            com.google.android.gms.internal.mlkit_vision_text_common.zznw r4 = r4.zzg()
            int r3 = r3.size()
            com.google.android.gms.internal.mlkit_vision_text_common.zztr r2 = r13.zza(r2, r3, r4)
            java.lang.String r3 = r11.zzj()
            r11.zze(r2, r12, r3)
            goto L12
        Laa:
            java.util.Map r11 = r11.zzl
            r11.remove(r12)
        Laf:
            return
    }

    public final /* synthetic */ void zzh(com.google.android.gms.internal.mlkit_vision_text_common.zzov r8, java.lang.Object r9, long r10, com.google.mlkit.vision.text.internal.zzr r12) {
            r7 = this;
            java.util.Map r0 = r7.zzl
            boolean r0 = r0.containsKey(r8)
            if (r0 != 0) goto L11
            java.util.Map r0 = r7.zzl
            com.google.android.gms.internal.mlkit_vision_text_common.zzao r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzao.zzp()
            r0.put(r8, r1)
        L11:
            java.util.Map r0 = r7.zzl
            java.lang.Object r0 = r0.get(r8)
            com.google.android.gms.internal.mlkit_vision_text_common.zzbp r0 = (com.google.android.gms.internal.mlkit_vision_text_common.zzbp) r0
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r0.zzm(r9, r10)
            long r3 = android.os.SystemClock.elapsedRealtime()
            r5 = 30
            r1 = r7
            r2 = r8
            boolean r7 = r1.zzk(r2, r3, r5)
            if (r7 != 0) goto L2f
            return
        L2f:
            java.util.Map r7 = r1.zzk
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            r7.put(r2, r8)
            java.util.concurrent.Executor r7 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor()
            com.google.android.gms.internal.mlkit_vision_text_common.zztx r8 = new com.google.android.gms.internal.mlkit_vision_text_common.zztx
            r8.<init>(r1, r2, r12)
            r7.execute(r8)
            return
    }
}
