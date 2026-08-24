package com.google.mlkit.common.sdkinternal.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RemoteModelDownloadManager {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;
    private static final java.util.Map zzb = null;
    private final android.util.LongSparseArray zzc;
    private final android.util.LongSparseArray zzd;
    private final com.google.mlkit.common.sdkinternal.MlKitContext zze;
    private final android.app.DownloadManager zzf;
    private final com.google.mlkit.common.model.RemoteModel zzg;
    private final com.google.mlkit.common.sdkinternal.ModelType zzh;
    private final com.google.android.gms.internal.mlkit_common.zzsh zzi;
    private final com.google.mlkit.common.sdkinternal.SharedPrefManager zzj;
    private final com.google.mlkit.common.sdkinternal.model.ModelFileHelper zzk;
    private final com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop zzl;
    private final com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager zzm;
    private com.google.mlkit.common.model.DownloadConditions zzn;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "ModelDownloadManager"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zzb = r0
            return
    }

    public RemoteModelDownloadManager(com.google.mlkit.common.sdkinternal.MlKitContext r2, com.google.mlkit.common.model.RemoteModel r3, com.google.mlkit.common.sdkinternal.model.ModelFileHelper r4, com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r5, com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop r6, com.google.android.gms.internal.mlkit_common.zzsh r7) {
            r1 = this;
            r1.<init>()
            android.util.LongSparseArray r0 = new android.util.LongSparseArray
            r0.<init>()
            r1.zzc = r0
            android.util.LongSparseArray r0 = new android.util.LongSparseArray
            r0.<init>()
            r1.zzd = r0
            r1.zze = r2
            com.google.mlkit.common.sdkinternal.ModelType r0 = r3.getModelType()
            r1.zzh = r0
            r1.zzg = r3
            android.content.Context r3 = r2.getApplicationContext()
            java.lang.String r0 = "download"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.app.DownloadManager r3 = (android.app.DownloadManager) r3
            r1.zzf = r3
            r1.zzi = r7
            if (r3 != 0) goto L36
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza
            java.lang.String r7 = "ModelDownloadManager"
            java.lang.String r0 = "Download manager service is not available in the service."
            r3.d(r7, r0)
        L36:
            r1.zzk = r4
            com.google.mlkit.common.sdkinternal.SharedPrefManager r2 = com.google.mlkit.common.sdkinternal.SharedPrefManager.getInstance(r2)
            r1.zzj = r2
            r1.zzl = r6
            r1.zzm = r5
            return
    }

    public static synchronized com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager getInstance(com.google.mlkit.common.sdkinternal.MlKitContext r10, com.google.mlkit.common.model.RemoteModel r11, com.google.mlkit.common.sdkinternal.model.ModelFileHelper r12, com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r13, com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop r14) {
            java.lang.Class<com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager> r1 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.class
            monitor-enter(r1)
            java.util.Map r0 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zzb     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r0.containsKey(r11)     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L22
            java.lang.String r2 = "common"
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r3 = new com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.internal.mlkit_common.zzsh r9 = com.google.android.gms.internal.mlkit_common.zzss.zzb(r2)     // Catch: java.lang.Throwable -> L1f
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1f
            r0.put(r5, r3)     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r0 = move-exception
            r10 = r0
            goto L2b
        L22:
            r5 = r11
        L23:
            java.lang.Object r10 = r0.get(r5)     // Catch: java.lang.Throwable -> L1f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r10 = (com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager) r10     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            return r10
        L2b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r10
    }

    public static /* bridge */ /* synthetic */ android.util.LongSparseArray zza(com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0) {
            android.util.LongSparseArray r0 = r0.zzc
            return r0
    }

    public static /* bridge */ /* synthetic */ android.util.LongSparseArray zzb(com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0) {
            android.util.LongSparseArray r0 = r0.zzd
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.GmsLogger zzc() {
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.mlkit.common.MlKitException zzd(com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0, java.lang.Long r1) {
            com.google.mlkit.common.MlKitException r0 = r0.zzl(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.mlkit.common.model.RemoteModel zze(com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0) {
            com.google.mlkit.common.model.RemoteModel r0 = r0.zzg
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.mlkit.common.sdkinternal.MlKitContext zzf(com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0) {
            com.google.mlkit.common.sdkinternal.MlKitContext r0 = r0.zze
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_common.zzsh zzh(com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0) {
            com.google.android.gms.internal.mlkit_common.zzsh r0 = r0.zzi
            return r0
    }

    private final com.google.android.gms.tasks.Task zzj(long r7) {
            r6 = this;
            com.google.mlkit.common.sdkinternal.MlKitContext r0 = r6.zze
            com.google.mlkit.common.sdkinternal.model.zzc r1 = r6.zzm(r7)
            android.content.Context r0 = r0.getApplicationContext()
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.DOWNLOAD_COMPLETE"
            r2.<init>(r3)
            com.google.mlkit.common.sdkinternal.MLTaskExecutor r3 = com.google.mlkit.common.sdkinternal.MLTaskExecutor.getInstance()
            android.os.Handler r3 = r3.getHandler()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L23
            defpackage.pt0.n(r0, r1, r2, r3)
            goto L2f
        L23:
            r5 = 26
            if (r4 < r5) goto L2b
            defpackage.pt0.m(r0, r1, r2, r3)
            goto L2f
        L2b:
            r4 = 0
            r0.registerReceiver(r1, r2, r4, r3)
        L2f:
            com.google.android.gms.tasks.TaskCompletionSource r6 = r6.zzk(r7)
            com.google.android.gms.tasks.Task r6 = r6.getTask()
            return r6
    }

    private final synchronized com.google.android.gms.tasks.TaskCompletionSource zzk(long r3) {
            r2 = this;
            monitor-enter(r2)
            android.util.LongSparseArray r0 = r2.zzd     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
            android.util.LongSparseArray r1 = r2.zzd     // Catch: java.lang.Throwable -> L17
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return r0
        L17:
            r3 = move-exception
            goto L1b
        L19:
            monitor-exit(r2)
            return r0
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    private final com.google.mlkit.common.MlKitException zzl(java.lang.Long r5) {
            r4 = this;
            android.app.DownloadManager r4 = r4.zzf
            r0 = 0
            if (r4 == 0) goto L1f
            if (r5 != 0) goto L8
            goto L1f
        L8:
            android.app.DownloadManager$Query r0 = new android.app.DownloadManager$Query
            r0.<init>()
            long r1 = r5.longValue()
            r5 = 1
            long[] r5 = new long[r5]
            r3 = 0
            r5[r3] = r1
            android.app.DownloadManager$Query r5 = r0.setFilterById(r5)
            android.database.Cursor r0 = r4.query(r5)
        L1f:
            r4 = 13
            java.lang.String r5 = "Model downloading failed"
            if (r0 == 0) goto L46
            boolean r1 = r0.moveToFirst()
            if (r1 == 0) goto L46
            java.lang.String r5 = "reason"
            int r5 = r0.getColumnIndex(r5)
            int r5 = r0.getInt(r5)
            r0 = 1006(0x3ee, float:1.41E-42)
            if (r5 != r0) goto L3e
            java.lang.String r5 = "Model downloading failed due to insufficient space on the device."
            r4 = 101(0x65, float:1.42E-43)
            goto L46
        L3e:
            java.lang.String r0 = "Model downloading failed due to error code: "
            java.lang.String r1 = " from Android DownloadManager"
            java.lang.String r5 = defpackage.lb1.k(r0, r5, r1)
        L46:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            r0.<init>(r5, r4)
            return r0
    }

    private final synchronized com.google.mlkit.common.sdkinternal.model.zzc zzm(long r8) {
            r7 = this;
            monitor-enter(r7)
            android.util.LongSparseArray r0 = r7.zzc     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L21
            com.google.mlkit.common.sdkinternal.model.zzc r0 = (com.google.mlkit.common.sdkinternal.model.zzc) r0     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L24
            com.google.mlkit.common.sdkinternal.model.zzc r1 = new com.google.mlkit.common.sdkinternal.model.zzc     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.tasks.TaskCompletionSource r5 = r7.zzk(r8)     // Catch: java.lang.Throwable -> L21
            r6 = 0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L1e
            android.util.LongSparseArray r7 = r2.zzc     // Catch: java.lang.Throwable -> L1e
            r7.put(r3, r1)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)
            return r1
        L1e:
            r0 = move-exception
        L1f:
            r7 = r0
            goto L27
        L21:
            r0 = move-exception
            r2 = r7
            goto L1f
        L24:
            r2 = r7
            monitor-exit(r2)
            return r0
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r7
    }

    private final synchronized java.lang.Long zzn(android.app.DownloadManager.Request r11, com.google.mlkit.common.sdkinternal.ModelInfo r12) {
            r10 = this;
            java.lang.String r0 = "Schedule a new downloading task: "
            monitor-enter(r10)
            android.app.DownloadManager r1 = r10.zzf     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto La
            monitor-exit(r10)
            r10 = 0
            return r10
        La:
            long r1 = r1.enqueue(r11)     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.common.internal.GmsLogger r11 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L40
            r3.append(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "ModelDownloadManager"
            r11.d(r3, r0)     // Catch: java.lang.Throwable -> L40
            com.google.mlkit.common.sdkinternal.SharedPrefManager r11 = r10.zzj     // Catch: java.lang.Throwable -> L40
            r11.setDownloadingModelInfo(r1, r12)     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.mlkit_common.zzsh r3 = r10.zzi     // Catch: java.lang.Throwable -> L40
            com.google.mlkit.common.model.RemoteModel r5 = r10.zzg     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.mlkit_common.zzry r4 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.mlkit_common.zzmu r6 = com.google.android.gms.internal.mlkit_common.zzmu.zza     // Catch: java.lang.Throwable -> L40
            com.google.mlkit.common.sdkinternal.ModelType r8 = r12.getModelType()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.mlkit_common.zzna r9 = com.google.android.gms.internal.mlkit_common.zzna.zzf     // Catch: java.lang.Throwable -> L40
            r7 = 0
            r3.zzf(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L40
            java.lang.Long r11 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r10)
            return r11
        L40:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L40
            throw r11
    }

    private final synchronized java.lang.Long zzo(com.google.mlkit.common.sdkinternal.ModelInfo r12, com.google.mlkit.common.model.DownloadConditions r13) {
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "DownloadConditions can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13, r0)     // Catch: java.lang.Throwable -> L37
            com.google.mlkit.common.sdkinternal.SharedPrefManager r0 = r11.zzj     // Catch: java.lang.Throwable -> L37
            com.google.mlkit.common.model.RemoteModel r1 = r11.zzg     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r0.getDownloadingModelHash(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r1 = r11.getDownloadingModelStatusCode()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L5a
            java.lang.String r2 = r12.getModelHash()     // Catch: java.lang.Throwable -> L37
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L5a
            if (r1 == 0) goto L5a
            java.lang.Integer r12 = r11.getDownloadingModelStatusCode()     // Catch: java.lang.Throwable -> L37
            if (r12 == 0) goto L3a
            int r13 = r12.intValue()     // Catch: java.lang.Throwable -> L37
            r0 = 8
            if (r13 == r0) goto L4e
            int r12 = r12.intValue()     // Catch: java.lang.Throwable -> L37
            r13 = 16
            if (r12 == r13) goto L4e
            goto L3a
        L37:
            r0 = move-exception
            r12 = r0
            goto Lb1
        L3a:
            com.google.android.gms.internal.mlkit_common.zzsh r0 = r11.zzi     // Catch: java.lang.Throwable -> L37
            com.google.mlkit.common.model.RemoteModel r2 = r11.zzg     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.mlkit_common.zzry r1 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.mlkit_common.zzmu r3 = com.google.android.gms.internal.mlkit_common.zzmu.zza     // Catch: java.lang.Throwable -> L37
            com.google.mlkit.common.sdkinternal.ModelType r5 = r2.getModelType()     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.mlkit_common.zzna r6 = com.google.android.gms.internal.mlkit_common.zzna.zzg     // Catch: java.lang.Throwable -> L37
            r4 = 0
            r0.zzf(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L37
        L4e:
            com.google.android.gms.common.internal.GmsLogger r12 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza     // Catch: java.lang.Throwable -> L37
            java.lang.String r13 = "ModelDownloadManager"
            java.lang.String r0 = "New model is already in downloading, do nothing."
            r12.d(r13, r0)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r11)
            r11 = 0
            return r11
        L5a:
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "ModelDownloadManager"
            java.lang.String r2 = "Need to download a new model."
            r0.d(r1, r2)     // Catch: java.lang.Throwable -> L37
            r11.removeOrCancelDownload()     // Catch: java.lang.Throwable -> L37
            android.app.DownloadManager$Request r1 = new android.app.DownloadManager$Request     // Catch: java.lang.Throwable -> L37
            android.net.Uri r2 = r12.getModelUri()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r2 = r11.zzk     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = r12.getModelNameForPersist()     // Catch: java.lang.Throwable -> L37
            com.google.mlkit.common.sdkinternal.ModelType r4 = r12.getModelType()     // Catch: java.lang.Throwable -> L37
            boolean r2 = r2.modelExistsLocally(r3, r4)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L9a
            java.lang.String r2 = "ModelDownloadManager"
            java.lang.String r3 = "Model update is enabled and have a previous downloaded model, use download condition"
            r0.d(r2, r3)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.mlkit_common.zzsh r4 = r11.zzi     // Catch: java.lang.Throwable -> L37
            com.google.mlkit.common.model.RemoteModel r6 = r11.zzg     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.mlkit_common.zzry r5 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.mlkit_common.zzmu r7 = com.google.android.gms.internal.mlkit_common.zzmu.zza     // Catch: java.lang.Throwable -> L37
            com.google.mlkit.common.sdkinternal.ModelType r9 = r12.getModelType()     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.mlkit_common.zzna r10 = com.google.android.gms.internal.mlkit_common.zzna.zzk     // Catch: java.lang.Throwable -> L37
            r8 = 0
            r4.zzf(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L37
        L9a:
            boolean r0 = r13.isChargingRequired()     // Catch: java.lang.Throwable -> L37
            r1.setRequiresCharging(r0)     // Catch: java.lang.Throwable -> L37
            boolean r13 = r13.isWifiRequired()     // Catch: java.lang.Throwable -> L37
            if (r13 == 0) goto Lab
            r13 = 2
            r1.setAllowedNetworkTypes(r13)     // Catch: java.lang.Throwable -> L37
        Lab:
            java.lang.Long r12 = r11.zzn(r1, r12)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r11)
            return r12
        Lb1:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L37
            throw r12
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> ensureModelDownloaded() {
            r13 = this;
            com.google.android.gms.internal.mlkit_common.zzsh r0 = r13.zzi
            com.google.android.gms.internal.mlkit_common.zzry r1 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()
            com.google.mlkit.common.model.RemoteModel r2 = r13.zzg
            com.google.android.gms.internal.mlkit_common.zzmu r3 = com.google.android.gms.internal.mlkit_common.zzmu.zza
            com.google.mlkit.common.sdkinternal.ModelType r5 = com.google.mlkit.common.sdkinternal.ModelType.UNKNOWN
            com.google.android.gms.internal.mlkit_common.zzna r6 = com.google.android.gms.internal.mlkit_common.zzna.zzb
            r4 = 0
            r0.zzf(r1, r2, r3, r4, r5, r6)
            r1 = 0
            com.google.mlkit.common.sdkinternal.ModelInfo r0 = r13.zzg()     // Catch: com.google.mlkit.common.MlKitException -> L19
            r2 = r1
            goto L1c
        L19:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L1c:
            r3 = 13
            java.lang.Integer r4 = r13.getDownloadingModelStatusCode()     // Catch: com.google.mlkit.common.MlKitException -> L38
            java.lang.Long r5 = r13.getDownloadingId()     // Catch: com.google.mlkit.common.MlKitException -> L38
            boolean r6 = r13.modelExistsLocally()     // Catch: com.google.mlkit.common.MlKitException -> L38
            if (r6 != 0) goto Lae
            if (r4 == 0) goto L3c
            int r6 = r4.intValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            r7 = 8
            if (r6 != r7) goto L3c
            goto Lae
        L38:
            r0 = move-exception
            r13 = r0
            goto Lcf
        L3c:
            if (r4 == 0) goto L52
            int r6 = r4.intValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            r7 = 16
            if (r6 != r7) goto L52
            com.google.mlkit.common.MlKitException r0 = r13.zzl(r5)     // Catch: com.google.mlkit.common.MlKitException -> L38
            r13.removeOrCancelDownload()     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.tasks.Task r13 = com.google.android.gms.tasks.Tasks.forException(r0)     // Catch: com.google.mlkit.common.MlKitException -> L38
            return r13
        L52:
            if (r4 == 0) goto L8e
            int r6 = r4.intValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            r7 = 4
            if (r6 == r7) goto L69
            int r6 = r4.intValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            r7 = 2
            if (r6 == r7) goto L69
            int r4 = r4.intValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            r6 = 1
            if (r4 != r6) goto L8e
        L69:
            if (r5 == 0) goto L8e
            java.lang.String r4 = r13.getDownloadingModelHash()     // Catch: com.google.mlkit.common.MlKitException -> L38
            if (r4 == 0) goto L8e
            com.google.android.gms.internal.mlkit_common.zzsh r6 = r13.zzi     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.internal.mlkit_common.zzry r7 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.mlkit.common.model.RemoteModel r8 = r13.zzg     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.internal.mlkit_common.zzmu r9 = com.google.android.gms.internal.mlkit_common.zzmu.zza     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.mlkit.common.sdkinternal.ModelType r11 = r8.getModelType()     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.internal.mlkit_common.zzna r12 = com.google.android.gms.internal.mlkit_common.zzna.zzg     // Catch: com.google.mlkit.common.MlKitException -> L38
            r10 = 0
            r6.zzf(r7, r8, r9, r10, r11, r12)     // Catch: com.google.mlkit.common.MlKitException -> L38
            long r0 = r5.longValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.tasks.Task r13 = r13.zzj(r0)     // Catch: com.google.mlkit.common.MlKitException -> L38
            return r13
        L8e:
            if (r0 != 0) goto L91
            goto L97
        L91:
            com.google.mlkit.common.model.DownloadConditions r1 = r13.zzn     // Catch: com.google.mlkit.common.MlKitException -> L38
            java.lang.Long r1 = r13.zzo(r0, r1)     // Catch: com.google.mlkit.common.MlKitException -> L38
        L97:
            if (r1 != 0) goto La5
            com.google.mlkit.common.MlKitException r13 = new com.google.mlkit.common.MlKitException     // Catch: com.google.mlkit.common.MlKitException -> L38
            java.lang.String r0 = "Failed to schedule the download task"
            r13.<init>(r0, r3, r2)     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.tasks.Task r13 = com.google.android.gms.tasks.Tasks.forException(r13)     // Catch: com.google.mlkit.common.MlKitException -> L38
            return r13
        La5:
            long r0 = r1.longValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.tasks.Task r13 = r13.zzj(r0)     // Catch: com.google.mlkit.common.MlKitException -> L38
            return r13
        Lae:
            if (r0 == 0) goto Lca
            com.google.mlkit.common.model.DownloadConditions r2 = r13.zzn     // Catch: com.google.mlkit.common.MlKitException -> L38
            java.lang.Long r0 = r13.zzo(r0, r2)     // Catch: com.google.mlkit.common.MlKitException -> L38
            if (r0 == 0) goto Lc1
            long r0 = r0.longValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.tasks.Task r13 = r13.zzj(r0)     // Catch: com.google.mlkit.common.MlKitException -> L38
            return r13
        Lc1:
            com.google.android.gms.common.internal.GmsLogger r13 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza     // Catch: com.google.mlkit.common.MlKitException -> L38
            java.lang.String r0 = "ModelDownloadManager"
            java.lang.String r2 = "Didn't schedule download for the updated model"
            r13.i(r0, r2)     // Catch: com.google.mlkit.common.MlKitException -> L38
        Lca:
            com.google.android.gms.tasks.Task r13 = com.google.android.gms.tasks.Tasks.forResult(r1)     // Catch: com.google.mlkit.common.MlKitException -> L38
            return r13
        Lcf:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "Failed to ensure the model is downloaded."
            r0.<init>(r1, r3, r13)
            com.google.android.gms.tasks.Task r13 = com.google.android.gms.tasks.Tasks.forException(r0)
            return r13
    }

    public synchronized android.os.ParcelFileDescriptor getDownloadedFile() {
            r5 = this;
            monitor-enter(r5)
            android.app.DownloadManager r0 = r5.zzf     // Catch: java.lang.Throwable -> L15
            java.lang.Long r1 = r5.getDownloadingId()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r0 == 0) goto L22
            if (r1 == 0) goto L22
            long r3 = r1.longValue()     // Catch: java.lang.Throwable -> L15 java.io.FileNotFoundException -> L17
            android.os.ParcelFileDescriptor r2 = r0.openDownloadedFile(r3)     // Catch: java.lang.Throwable -> L15 java.io.FileNotFoundException -> L17
            goto L20
        L15:
            r0 = move-exception
            goto L24
        L17:
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "ModelDownloadManager"
            java.lang.String r3 = "Downloaded file is not found"
            r0.e(r1, r3)     // Catch: java.lang.Throwable -> L15
        L20:
            monitor-exit(r5)
            return r2
        L22:
            monitor-exit(r5)
            return r2
        L24:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    public synchronized java.lang.Long getDownloadingId() {
            r2 = this;
            monitor-enter(r2)
            com.google.mlkit.common.sdkinternal.SharedPrefManager r0 = r2.zzj     // Catch: java.lang.Throwable -> Lb
            com.google.mlkit.common.model.RemoteModel r1 = r2.zzg     // Catch: java.lang.Throwable -> Lb
            java.lang.Long r0 = r0.getDownloadingModelId(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public synchronized java.lang.String getDownloadingModelHash() {
            r2 = this;
            monitor-enter(r2)
            com.google.mlkit.common.sdkinternal.SharedPrefManager r0 = r2.zzj     // Catch: java.lang.Throwable -> Lb
            com.google.mlkit.common.model.RemoteModel r1 = r2.zzg     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = r0.getDownloadingModelHash(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public synchronized java.lang.Integer getDownloadingModelStatusCode() {
            r8 = this;
            monitor-enter(r8)
            android.app.DownloadManager r0 = r8.zzf     // Catch: java.lang.Throwable -> L47
            java.lang.Long r1 = r8.getDownloadingId()     // Catch: java.lang.Throwable -> L47
            r2 = 0
            if (r0 == 0) goto L7d
            if (r1 != 0) goto Le
            goto L7d
        Le:
            android.app.DownloadManager$Query r3 = new android.app.DownloadManager$Query     // Catch: java.lang.Throwable -> L47
            r3.<init>()     // Catch: java.lang.Throwable -> L47
            long r4 = r1.longValue()     // Catch: java.lang.Throwable -> L47
            r1 = 1
            long[] r6 = new long[r1]     // Catch: java.lang.Throwable -> L47
            r7 = 0
            r6[r7] = r4     // Catch: java.lang.Throwable -> L47
            android.app.DownloadManager$Query r3 = r3.setFilterById(r6)     // Catch: java.lang.Throwable -> L47
            android.database.Cursor r0 = r0.query(r3)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L3e
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L3e
            java.lang.String r3 = "status"
            int r3 = r0.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L3c
            int r3 = r0.getInt(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3c
            goto L3f
        L3c:
            r1 = move-exception
            goto L74
        L3e:
            r3 = r2
        L3f:
            if (r3 != 0) goto L49
            if (r0 == 0) goto L7d
            r0.close()     // Catch: java.lang.Throwable -> L47
            goto L7d
        L47:
            r0 = move-exception
            goto L7f
        L49:
            int r4 = r3.intValue()     // Catch: java.lang.Throwable -> L3c
            r5 = 2
            if (r4 == r5) goto L6e
            int r4 = r3.intValue()     // Catch: java.lang.Throwable -> L3c
            r5 = 4
            if (r4 == r5) goto L6e
            int r4 = r3.intValue()     // Catch: java.lang.Throwable -> L3c
            if (r4 == r1) goto L6e
            int r1 = r3.intValue()     // Catch: java.lang.Throwable -> L3c
            r4 = 8
            if (r1 == r4) goto L6e
            int r1 = r3.intValue()     // Catch: java.lang.Throwable -> L3c
            r4 = 16
            if (r1 == r4) goto L6e
            goto L6f
        L6e:
            r2 = r3
        L6f:
            r0.close()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r8)
            return r2
        L74:
            r0.close()     // Catch: java.lang.Throwable -> L78
            goto L7c
        L78:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L47
        L7c:
            throw r1     // Catch: java.lang.Throwable -> L47
        L7d:
            monitor-exit(r8)
            return r2
        L7f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L47
            throw r0
    }

    public int getFailureReason(java.lang.Long r5) {
            r4 = this;
            android.app.DownloadManager r4 = r4.zzf
            r0 = 0
            r1 = 0
            if (r4 == 0) goto L1f
            if (r5 != 0) goto L9
            goto L1f
        L9:
            android.app.DownloadManager$Query r1 = new android.app.DownloadManager$Query
            r1.<init>()
            long r2 = r5.longValue()
            r5 = 1
            long[] r5 = new long[r5]
            r5[r0] = r2
            android.app.DownloadManager$Query r5 = r1.setFilterById(r5)
            android.database.Cursor r1 = r4.query(r5)
        L1f:
            if (r1 == 0) goto L35
            boolean r4 = r1.moveToFirst()
            if (r4 == 0) goto L35
            java.lang.String r4 = "reason"
            int r4 = r1.getColumnIndex(r4)
            r5 = -1
            if (r4 == r5) goto L35
            int r4 = r1.getInt(r4)
            return r4
        L35:
            return r0
    }

    public boolean isModelDownloadedAndValid() {
            r8 = this;
            java.lang.String r0 = "ModelDownloadManager"
            r1 = 1
            boolean r2 = r8.modelExistsLocally()     // Catch: com.google.mlkit.common.MlKitException -> Lb
            if (r2 != 0) goto La
            goto L12
        La:
            return r1
        Lb:
            com.google.android.gms.common.internal.GmsLogger r2 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza
            java.lang.String r3 = "Failed to check if the model exist locally."
            r2.d(r0, r3)
        L12:
            java.lang.Long r2 = r8.getDownloadingId()
            java.lang.String r3 = r8.getDownloadingModelHash()
            r4 = 0
            if (r2 == 0) goto L4d
            if (r3 != 0) goto L20
            goto L4d
        L20:
            java.lang.Integer r2 = r8.getDownloadingModelStatusCode()
            com.google.android.gms.common.internal.GmsLogger r5 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza
            java.lang.String r6 = "Download Status code: "
            java.lang.String r7 = java.lang.String.valueOf(r2)
            java.lang.String r6 = r6.concat(r7)
            r5.d(r0, r6)
            if (r2 != 0) goto L39
            r8.removeOrCancelDownload()
            return r4
        L39:
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r2, r0)
            if (r0 == 0) goto L4c
            java.io.File r8 = r8.zzi(r3)
            if (r8 == 0) goto L4c
            return r1
        L4c:
            return r4
        L4d:
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza
            java.lang.String r2 = "No new model is downloading."
            r1.d(r0, r2)
            r8.removeOrCancelDownload()
            return r4
    }

    public boolean modelExistsLocally() {
            r2 = this;
            com.google.mlkit.common.model.RemoteModel r0 = r2.zzg
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r1 = r2.zzk
            java.lang.String r0 = r0.getUniqueModelNameForPersist()
            com.google.mlkit.common.sdkinternal.ModelType r2 = r2.zzh
            boolean r2 = r1.modelExistsLocally(r0, r2)
            return r2
    }

    public synchronized void removeOrCancelDownload() {
            r5 = this;
            monitor-enter(r5)
            android.app.DownloadManager r0 = r5.zzf     // Catch: java.lang.Throwable -> L36
            java.lang.Long r1 = r5.getDownloadingId()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L50
            if (r1 != 0) goto Lc
            goto L50
        Lc:
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "Cancel or remove existing downloading task: "
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "ModelDownloadManager"
            r0.d(r3, r2)     // Catch: java.lang.Throwable -> L36
            android.app.DownloadManager r0 = r5.zzf     // Catch: java.lang.Throwable -> L36
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L36
            r3 = 1
            long[] r3 = new long[r3]     // Catch: java.lang.Throwable -> L36
            r4 = 0
            r3[r4] = r1     // Catch: java.lang.Throwable -> L36
            int r0 = r0.remove(r3)     // Catch: java.lang.Throwable -> L36
            if (r0 > 0) goto L38
            java.lang.Integer r0 = r5.getDownloadingModelStatusCode()     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L50
            goto L38
        L36:
            r0 = move-exception
            goto L52
        L38:
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r0 = r5.zzk     // Catch: java.lang.Throwable -> L36
            com.google.mlkit.common.model.RemoteModel r1 = r5.zzg     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r1.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L36
            com.google.mlkit.common.sdkinternal.ModelType r1 = r1.getModelType()     // Catch: java.lang.Throwable -> L36
            r0.deleteTempFilesInPrivateFolder(r2, r1)     // Catch: java.lang.Throwable -> L36
            com.google.mlkit.common.sdkinternal.SharedPrefManager r0 = r5.zzj     // Catch: java.lang.Throwable -> L36
            com.google.mlkit.common.model.RemoteModel r1 = r5.zzg     // Catch: java.lang.Throwable -> L36
            r0.clearDownloadingModelInfo(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r5)
            return
        L50:
            monitor-exit(r5)
            return
        L52:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L36
            throw r0
    }

    public void setDownloadConditions(com.google.mlkit.common.model.DownloadConditions r2) {
            r1 = this;
            java.lang.String r0 = "DownloadConditions can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zzn = r2
            return
    }

    public synchronized void updateLatestModelHashAndType(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.mlkit.common.sdkinternal.SharedPrefManager r0 = r2.zzj     // Catch: java.lang.Throwable -> Ld
            com.google.mlkit.common.model.RemoteModel r1 = r2.zzg     // Catch: java.lang.Throwable -> Ld
            r0.setLatestModelHash(r1, r3)     // Catch: java.lang.Throwable -> Ld
            r2.removeOrCancelDownload()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    public final synchronized com.google.mlkit.common.sdkinternal.ModelInfo zzg() {
            r9 = this;
            java.lang.String r0 = "The model "
            monitor-enter(r9)
            boolean r1 = r9.modelExistsLocally()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L21
            com.google.android.gms.internal.mlkit_common.zzsh r2 = r9.zzi     // Catch: java.lang.Throwable -> L1e
            com.google.mlkit.common.model.RemoteModel r4 = r9.zzg     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.mlkit_common.zzry r3 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.mlkit_common.zzmu r5 = com.google.android.gms.internal.mlkit_common.zzmu.zza     // Catch: java.lang.Throwable -> L1e
            com.google.mlkit.common.sdkinternal.ModelType r7 = r4.getModelType()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.mlkit_common.zzna r8 = com.google.android.gms.internal.mlkit_common.zzna.zzj     // Catch: java.lang.Throwable -> L1e
            r6 = 0
            r2.zzf(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r0 = move-exception
            goto Lbe
        L21:
            com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop r2 = r9.zzl     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto Lb4
            com.google.mlkit.common.model.RemoteModel r3 = r9.zzg     // Catch: java.lang.Throwable -> L1e
            com.google.mlkit.common.sdkinternal.ModelInfo r2 = r2.retrieveRemoteModelInfo(r3)     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            if (r2 != 0) goto L30
            monitor-exit(r9)
            return r3
        L30:
            com.google.mlkit.common.sdkinternal.MlKitContext r4 = r9.zze     // Catch: java.lang.Throwable -> L1e
            com.google.mlkit.common.model.RemoteModel r5 = r9.zzg     // Catch: java.lang.Throwable -> L1e
            java.lang.String r6 = r2.getModelHash()     // Catch: java.lang.Throwable -> L1e
            com.google.mlkit.common.sdkinternal.SharedPrefManager r7 = com.google.mlkit.common.sdkinternal.SharedPrefManager.getInstance(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = r7.getIncompatibleModelHash(r5)     // Catch: java.lang.Throwable -> L1e
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Throwable -> L1e
            r6 = 0
            r8 = 1
            if (r5 == 0) goto L64
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = com.google.mlkit.common.sdkinternal.CommonUtils.getAppVersion(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = r7.getPreviousAppVersion()     // Catch: java.lang.Throwable -> L1e
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L64
            com.google.android.gms.common.internal.GmsLogger r4 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = "ModelDownloadManager"
            java.lang.String r7 = "The model is incompatible with TFLite and the app is not upgraded, do not download"
            r4.e(r5, r7)     // Catch: java.lang.Throwable -> L1e
            r8 = r6
        L64:
            if (r1 != 0) goto L6d
            com.google.mlkit.common.sdkinternal.SharedPrefManager r4 = r9.zzj     // Catch: java.lang.Throwable -> L1e
            com.google.mlkit.common.model.RemoteModel r5 = r9.zzg     // Catch: java.lang.Throwable -> L1e
            r4.clearLatestModelHash(r5)     // Catch: java.lang.Throwable -> L1e
        L6d:
            com.google.mlkit.common.sdkinternal.MlKitContext r4 = r9.zze     // Catch: java.lang.Throwable -> L1e
            com.google.mlkit.common.model.RemoteModel r5 = r9.zzg     // Catch: java.lang.Throwable -> L1e
            java.lang.String r7 = r2.getModelHash()     // Catch: java.lang.Throwable -> L1e
            com.google.mlkit.common.sdkinternal.SharedPrefManager r4 = com.google.mlkit.common.sdkinternal.SharedPrefManager.getInstance(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = r4.getLatestModelHash(r5)     // Catch: java.lang.Throwable -> L1e
            boolean r4 = r7.equals(r4)     // Catch: java.lang.Throwable -> L1e
            r5 = r4 ^ 1
            if (r8 == 0) goto L8c
            if (r1 == 0) goto L8a
            if (r4 == 0) goto L8a
            goto L8d
        L8a:
            monitor-exit(r9)
            return r2
        L8c:
            r6 = r5
        L8d:
            if (r1 == 0) goto L95
            r1 = r6 ^ r8
            if (r1 == 0) goto L95
            monitor-exit(r9)
            return r3
        L95:
            com.google.mlkit.common.model.RemoteModel r1 = r9.zzg     // Catch: java.lang.Throwable -> L1e
            com.google.mlkit.common.MlKitException r2 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r1.getModelName()     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1e
            r3.append(r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = " is incompatible with TFLite runtime"
            r3.append(r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L1e
            r1 = 100
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1e
            throw r2     // Catch: java.lang.Throwable -> L1e
        Lb4:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "Please include com.google.mlkit:linkfirebase sdk as your dependency when you try to download from Firebase."
            r2 = 14
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L1e
            throw r0     // Catch: java.lang.Throwable -> L1e
        Lbe:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L1e
            throw r0
    }

    public final java.io.File zzi(java.lang.String r11) {
            r10 = this;
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.zza
            java.lang.String r1 = "Model downloaded successfully"
            java.lang.String r2 = "ModelDownloadManager"
            r0.d(r2, r1)
            com.google.android.gms.internal.mlkit_common.zzsh r3 = r10.zzi
            com.google.android.gms.internal.mlkit_common.zzry r4 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()
            com.google.mlkit.common.model.RemoteModel r5 = r10.zzg
            com.google.android.gms.internal.mlkit_common.zzmu r6 = com.google.android.gms.internal.mlkit_common.zzmu.zza
            com.google.mlkit.common.sdkinternal.ModelType r8 = r10.zzh
            com.google.android.gms.internal.mlkit_common.zzna r9 = com.google.android.gms.internal.mlkit_common.zzna.zzh
            r7 = 1
            r3.zzf(r4, r5, r6, r7, r8, r9)
            android.os.ParcelFileDescriptor r1 = r10.getDownloadedFile()
            if (r1 != 0) goto L26
            r10.removeOrCancelDownload()
            r10 = 0
            return r10
        L26:
            java.lang.String r3 = "moving downloaded model from external storage to private folder."
            r0.d(r2, r3)
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r0 = r10.zzm     // Catch: java.lang.Throwable -> L37
            com.google.mlkit.common.model.RemoteModel r2 = r10.zzg     // Catch: java.lang.Throwable -> L37
            java.io.File r11 = r0.moveModelToPrivateFolder(r1, r11, r2)     // Catch: java.lang.Throwable -> L37
            r10.removeOrCancelDownload()
            return r11
        L37:
            r0 = move-exception
            r11 = r0
            r10.removeOrCancelDownload()
            throw r11
    }
}
