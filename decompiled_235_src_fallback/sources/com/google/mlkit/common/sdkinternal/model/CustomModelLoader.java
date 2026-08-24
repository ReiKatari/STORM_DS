package com.google.mlkit.common.sdkinternal.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CustomModelLoader {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;
    private static final java.util.Map zzb = null;
    private final com.google.mlkit.common.sdkinternal.MlKitContext zzc;
    private final com.google.mlkit.common.model.LocalModel zzd;
    private final com.google.mlkit.common.model.CustomRemoteModel zze;
    private final com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager zzf;
    private final com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager zzg;
    private final com.google.android.gms.internal.mlkit_common.zzsh zzh;
    private boolean zzi;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface CustomModelLoaderHelper {
        void logLoad();

        boolean tryLoad(com.google.mlkit.common.model.LocalModel r1);
    }

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "CustomModelLoader"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.model.CustomModelLoader.zza = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.mlkit.common.sdkinternal.model.CustomModelLoader.zzb = r0
            return
    }

    private CustomModelLoader(com.google.mlkit.common.sdkinternal.MlKitContext r7, com.google.mlkit.common.model.LocalModel r8, com.google.mlkit.common.model.CustomRemoteModel r9) {
            r6 = this;
            r6.<init>()
            if (r9 == 0) goto L34
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r0 = new com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r4 = new com.google.mlkit.common.sdkinternal.model.ModelFileHelper
            r4.<init>(r7)
            com.google.mlkit.common.internal.model.zza r5 = new com.google.mlkit.common.internal.model.zza
            java.lang.String r1 = r9.getUniqueModelNameForPersist()
            r5.<init>(r7, r1)
            r3 = 0
            r1 = r7
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.zzg = r0
            com.google.mlkit.common.sdkinternal.model.ModelFileHelper r7 = new com.google.mlkit.common.sdkinternal.model.ModelFileHelper
            r7.<init>(r1)
            java.lang.Class<com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop> r9 = com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop.class
            java.lang.Object r9 = r1.get(r9)
            com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop r9 = (com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop) r9
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r7 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.getInstance(r1, r2, r7, r0, r9)
            r6.zzf = r7
            r7 = 1
            r6.zzi = r7
            goto L3b
        L34:
            r1 = r7
            r2 = r9
            r7 = 0
            r6.zzg = r7
            r6.zzf = r7
        L3b:
            r6.zzc = r1
            r6.zzd = r8
            r6.zze = r2
            java.lang.String r7 = "common"
            com.google.android.gms.internal.mlkit_common.zzsh r7 = com.google.android.gms.internal.mlkit_common.zzss.zzb(r7)
            r6.zzh = r7
            return
    }

    public static synchronized com.google.mlkit.common.sdkinternal.model.CustomModelLoader getInstance(com.google.mlkit.common.sdkinternal.MlKitContext r4, com.google.mlkit.common.model.LocalModel r5, com.google.mlkit.common.model.CustomRemoteModel r6) {
            java.lang.Class<com.google.mlkit.common.sdkinternal.model.CustomModelLoader> r0 = com.google.mlkit.common.sdkinternal.model.CustomModelLoader.class
            monitor-enter(r0)
            if (r6 != 0) goto L12
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch: java.lang.Throwable -> L10
            com.google.mlkit.common.model.LocalModel r1 = (com.google.mlkit.common.model.LocalModel) r1     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r4 = move-exception
            goto L2e
        L12:
            java.lang.String r1 = r6.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L10
        L16:
            java.util.Map r2 = com.google.mlkit.common.sdkinternal.model.CustomModelLoader.zzb     // Catch: java.lang.Throwable -> L10
            boolean r3 = r2.containsKey(r1)     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L26
            com.google.mlkit.common.sdkinternal.model.CustomModelLoader r3 = new com.google.mlkit.common.sdkinternal.model.CustomModelLoader     // Catch: java.lang.Throwable -> L10
            r3.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L10
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L10
        L26:
            java.lang.Object r4 = r2.get(r1)     // Catch: java.lang.Throwable -> L10
            com.google.mlkit.common.sdkinternal.model.CustomModelLoader r4 = (com.google.mlkit.common.sdkinternal.model.CustomModelLoader) r4     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r4
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r4
    }

    private final java.io.File zza() {
            r3 = this;
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r3 = r3.zzg
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r3 = (com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager) r3
            java.lang.String r3 = r3.zzb()
            if (r3 != 0) goto L19
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.mlkit.common.sdkinternal.model.CustomModelLoader.zza
            java.lang.String r0 = "CustomModelLoader"
            java.lang.String r1 = "No existing model file"
            r3.d(r0, r1)
            r3 = 0
            return r3
        L19:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            java.io.File[] r3 = r0.listFiles()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.io.File[] r1 = (java.io.File[]) r1
            int r1 = r1.length
            r2 = 1
            if (r1 != r2) goto L30
            r0 = 0
            r3 = r3[r0]
            return r3
        L30:
            return r0
    }

    private final void zzb() {
            r0 = this;
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0 = r0.zzf
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0 = (com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager) r0
            r0.removeOrCancelDownload()
            return
    }

    private static final com.google.mlkit.common.model.LocalModel zzc(java.io.File r3) {
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L22
            com.google.mlkit.common.model.LocalModel$Builder r0 = new com.google.mlkit.common.model.LocalModel$Builder
            r0.<init>()
            java.io.File r1 = new java.io.File
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r2 = "manifest.json"
            r1.<init>(r3, r2)
            java.lang.String r3 = r1.toString()
            r0.setAbsoluteManifestFilePath(r3)
            com.google.mlkit.common.model.LocalModel r3 = r0.build()
            return r3
        L22:
            com.google.mlkit.common.model.LocalModel$Builder r0 = new com.google.mlkit.common.model.LocalModel$Builder
            r0.<init>()
            java.lang.String r3 = r3.getAbsolutePath()
            r0.setAbsoluteFilePath(r3)
            com.google.mlkit.common.model.LocalModel r3 = r0.build()
            return r3
    }

    public synchronized com.google.mlkit.common.model.LocalModel createLocalModelByLatestExistingModel() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.sdkinternal.model.CustomModelLoader.zza     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "CustomModelLoader"
            java.lang.String r2 = "Try to get the latest existing model file."
            r0.d(r1, r2)     // Catch: java.lang.Throwable -> L19
            java.io.File r0 = r3.zza()     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L13
            monitor-exit(r3)
            r3 = 0
            return r3
        L13:
            com.google.mlkit.common.model.LocalModel r0 = zzc(r0)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r3)
            return r0
        L19:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    public synchronized com.google.mlkit.common.model.LocalModel createLocalModelByNewlyDownloadedModel() {
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.sdkinternal.model.CustomModelLoader.zza     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "CustomModelLoader"
            java.lang.String r2 = "Try to get newly downloaded model file."
            r0.d(r1, r2)     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = r7.zzf     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = (com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager) r1     // Catch: java.lang.Throwable -> L2f
            java.lang.Long r1 = r1.getDownloadingId()     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r2 = r7.zzf     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r2.getDownloadingModelHash()     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            if (r1 == 0) goto L8f
            if (r2 != 0) goto L22
            goto L8f
        L22:
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r4 = r7.zzf     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r4 = r4.getDownloadingModelStatusCode()     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L32
            r7.zzb()     // Catch: java.lang.Throwable -> L2f
        L2d:
            r1 = r3
            goto L9a
        L2f:
            r0 = move-exception
            goto La4
        L32:
            java.lang.String r5 = "Download Status code: "
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = "CustomModelLoader"
            r0.d(r6, r5)     // Catch: java.lang.Throwable -> L2f
            int r5 = r4.intValue()     // Catch: java.lang.Throwable -> L2f
            r6 = 8
            if (r5 != r6) goto L6b
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = r7.zzf     // Catch: java.lang.Throwable -> L2f
            java.io.File r1 = r1.zzi(r2)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L52
            goto L2d
        L52:
            java.lang.String r4 = r1.getParent()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = "Moved the downloaded model to private folder successfully: "
            java.lang.String r6 = "CustomModelLoader"
            java.lang.String r4 = r5.concat(r4)     // Catch: java.lang.Throwable -> L2f
            r0.d(r6, r4)     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0 = r7.zzf     // Catch: java.lang.Throwable -> L2f
            r0.updateLatestModelHashAndType(r2)     // Catch: java.lang.Throwable -> L2f
            goto L9a
        L6b:
            int r0 = r4.intValue()     // Catch: java.lang.Throwable -> L2f
            r2 = 16
            if (r0 != r2) goto L2d
            com.google.android.gms.internal.mlkit_common.zzsh r0 = r7.zzh     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.model.CustomRemoteModel r2 = r7.zze     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.mlkit_common.zzry r4 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.model.RemoteModel r2 = (com.google.mlkit.common.model.RemoteModel) r2     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r5 = r7.zzf     // Catch: java.lang.Throwable -> L2f
            int r1 = r5.getFailureReason(r1)     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            r0.zze(r4, r2, r5, r1)     // Catch: java.lang.Throwable -> L2f
            r7.zzb()     // Catch: java.lang.Throwable -> L2f
            goto L2d
        L8f:
            java.lang.String r1 = "CustomModelLoader"
            java.lang.String r2 = "No new model is downloading."
            r0.d(r1, r2)     // Catch: java.lang.Throwable -> L2f
            r7.zzb()     // Catch: java.lang.Throwable -> L2f
            goto L2d
        L9a:
            if (r1 != 0) goto L9e
            monitor-exit(r7)
            return r3
        L9e:
            com.google.mlkit.common.model.LocalModel r0 = zzc(r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r7)
            return r0
        La4:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2f
            throw r0
    }

    public void deleteLatestExistingModel() {
            r2 = this;
            java.io.File r0 = r2.zza()
            if (r0 == 0) goto L22
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r1 = r2.zzg
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r1 = (com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager) r1
            r1.zzc(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r0 = r2.zzc
            com.google.mlkit.common.model.CustomRemoteModel r2 = r2.zze
            com.google.mlkit.common.sdkinternal.SharedPrefManager r0 = com.google.mlkit.common.sdkinternal.SharedPrefManager.getInstance(r0)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.mlkit.common.model.RemoteModel r2 = (com.google.mlkit.common.model.RemoteModel) r2
            r0.clearLatestModelHash(r2)
        L22:
            return
    }

    public void deleteOldModels(com.google.mlkit.common.model.LocalModel r4) {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r4 = r4.getAbsoluteFilePath()
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.<init>(r4)
            java.io.File r4 = r0.getParentFile()
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r0 = r3.zzg
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r0 = (com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager) r0
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.io.File r1 = (java.io.File) r1
            boolean r0 = r0.zzd(r1)
            java.lang.String r1 = "CustomModelLoader"
            if (r0 == 0) goto L36
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.sdkinternal.model.CustomModelLoader.zza
            java.lang.String r2 = "All old models are deleted."
            r0.d(r1, r2)
            com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager r3 = r3.zzg
            r3.zza(r4)
            return
        L36:
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.mlkit.common.sdkinternal.model.CustomModelLoader.zza
            java.lang.String r4 = "Failed to delete old models"
            r3.e(r1, r4)
            return
    }

    public synchronized void load(com.google.mlkit.common.sdkinternal.model.CustomModelLoader.CustomModelLoaderHelper r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.mlkit.common.model.LocalModel r0 = r3.zzd     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto Lc
            com.google.mlkit.common.model.LocalModel r0 = r3.createLocalModelByNewlyDownloadedModel()     // Catch: java.lang.Throwable -> La
            goto Lc
        La:
            r4 = move-exception
            goto L4f
        Lc:
            if (r0 != 0) goto L12
            com.google.mlkit.common.model.LocalModel r0 = r3.createLocalModelByLatestExistingModel()     // Catch: java.lang.Throwable -> La
        L12:
            if (r0 == 0) goto L45
        L14:
            boolean r1 = r4.tryLoad(r0)     // Catch: java.lang.Throwable -> La
            com.google.mlkit.common.model.CustomRemoteModel r2 = r3.zze
            if (r1 != 0) goto L2e
            if (r2 == 0) goto L26
            r3.deleteLatestExistingModel()     // Catch: java.lang.Throwable -> La
            com.google.mlkit.common.model.LocalModel r0 = r3.createLocalModelByLatestExistingModel()     // Catch: java.lang.Throwable -> La
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 != 0) goto L14
            r4.logLoad()     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L2e:
            if (r2 == 0) goto L40
            boolean r1 = r3.zzi     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto L40
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> La
            com.google.mlkit.common.model.LocalModel r0 = (com.google.mlkit.common.model.LocalModel) r0     // Catch: java.lang.Throwable -> La
            r3.deleteOldModels(r0)     // Catch: java.lang.Throwable -> La
            r0 = 0
            r3.zzi = r0     // Catch: java.lang.Throwable -> La
        L40:
            r4.logLoad()     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L45:
            com.google.mlkit.common.MlKitException r4 = new com.google.mlkit.common.MlKitException     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = "Model is not available."
            r1 = 14
            r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> La
            throw r4     // Catch: java.lang.Throwable -> La
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La
            throw r4
    }
}
