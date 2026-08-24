package com.google.mlkit.common.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RemoteModelManager {
    private final java.util.Map zza;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class RemoteModelManagerRegistration {
        private final java.lang.Class zza;
        private final defpackage.o55 zzb;

        public <RemoteT extends com.google.mlkit.common.model.RemoteModel> RemoteModelManagerRegistration(java.lang.Class<RemoteT> r1, defpackage.o55 r2) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                r0.zzb = r2
                return
        }

        public final defpackage.o55 zza() {
                r0 = this;
                o55 r0 = r0.zzb
                return r0
        }

        public final java.lang.Class zzb() {
                r0 = this;
                java.lang.Class r0 = r0.zza
                return r0
        }
    }

    public RemoteModelManager(java.util.Set<com.google.mlkit.common.model.RemoteModelManager.RemoteModelManagerRegistration> r4) {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.zza = r0
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r4.next()
            com.google.mlkit.common.model.RemoteModelManager$RemoteModelManagerRegistration r0 = (com.google.mlkit.common.model.RemoteModelManager.RemoteModelManagerRegistration) r0
            java.util.Map r1 = r3.zza
            java.lang.Class r2 = r0.zzb()
            o55 r0 = r0.zza()
            r1.put(r2, r0)
            goto Le
        L28:
            return
    }

    public static synchronized com.google.mlkit.common.model.RemoteModelManager getInstance() {
            java.lang.Class<com.google.mlkit.common.model.RemoteModelManager> r0 = com.google.mlkit.common.model.RemoteModelManager.class
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()     // Catch: java.lang.Throwable -> L11
            java.lang.Class<com.google.mlkit.common.model.RemoteModelManager> r2 = com.google.mlkit.common.model.RemoteModelManager.class
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L11
            com.google.mlkit.common.model.RemoteModelManager r1 = (com.google.mlkit.common.model.RemoteModelManager) r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    private final com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface zza(java.lang.Class r1) {
            r0 = this;
            java.util.Map r0 = r0.zza
            java.lang.Object r0 = r0.get(r1)
            o55 r0 = (defpackage.o55) r0
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            o55 r0 = (defpackage.o55) r0
            java.lang.Object r0 = r0.get()
            com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface r0 = (com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface) r0
            return r0
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> deleteDownloadedModel(com.google.mlkit.common.model.RemoteModel r2) {
            r1 = this;
            java.lang.String r0 = "RemoteModel cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.Class r0 = r2.getClass()
            com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface r1 = r1.zza(r0)
            com.google.android.gms.tasks.Task r1 = r1.deleteDownloadedModel(r2)
            return r1
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> download(com.google.mlkit.common.model.RemoteModel r3, com.google.mlkit.common.model.DownloadConditions r4) {
            r2 = this;
            java.lang.String r0 = "RemoteModel cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            java.lang.String r0 = "DownloadConditions cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            java.util.Map r0 = r2.zza
            java.lang.Class r1 = r3.getClass()
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L23
            java.lang.Class r0 = r3.getClass()
            com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface r2 = r2.zza(r0)
            com.google.android.gms.tasks.Task r2 = r2.download(r3, r4)
            return r2
        L23:
            com.google.mlkit.common.MlKitException r2 = new com.google.mlkit.common.MlKitException
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.String r4 = "Feature model '"
            java.lang.String r0 = "' doesn't have a corresponding modelmanager registered."
            java.lang.String r3 = defpackage.lb1.A(r4, r3, r0)
            r4 = 13
            r2.<init>(r3, r4)
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.tasks.Tasks.forException(r2)
            return r2
    }

    public <T extends com.google.mlkit.common.model.RemoteModel> com.google.android.gms.tasks.Task<java.util.Set<T>> getDownloadedModels(java.lang.Class<T> r1) {
            r0 = this;
            java.util.Map r0 = r0.zza
            java.lang.Object r0 = r0.get(r1)
            o55 r0 = (defpackage.o55) r0
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            o55 r0 = (defpackage.o55) r0
            java.lang.Object r0 = r0.get()
            com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface r0 = (com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface) r0
            com.google.android.gms.tasks.Task r0 = r0.getDownloadedModels()
            return r0
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> isModelDownloaded(com.google.mlkit.common.model.RemoteModel r2) {
            r1 = this;
            java.lang.String r0 = "RemoteModel cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.Class r0 = r2.getClass()
            com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface r1 = r1.zza(r0)
            com.google.android.gms.tasks.Task r1 = r1.isModelDownloaded(r2)
            return r1
    }
}
