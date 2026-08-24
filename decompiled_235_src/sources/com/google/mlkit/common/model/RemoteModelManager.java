package com.google.mlkit.common.model;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RemoteModelManager {
    private final Map zza = new HashMap();

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class RemoteModelManagerRegistration {
        private final Class zza;
        private final o55 zzb;

        public <RemoteT extends RemoteModel> RemoteModelManagerRegistration(Class<RemoteT> cls, o55 o55Var) {
            this.zza = cls;
            this.zzb = o55Var;
        }

        public final o55 zza() {
            return this.zzb;
        }

        public final Class zzb() {
            return this.zza;
        }
    }

    public RemoteModelManager(Set<RemoteModelManagerRegistration> set) {
        for (RemoteModelManagerRegistration remoteModelManagerRegistration : set) {
            this.zza.put(remoteModelManagerRegistration.zzb(), remoteModelManagerRegistration.zza());
        }
    }

    public static synchronized RemoteModelManager getInstance() {
        RemoteModelManager remoteModelManager;
        synchronized (RemoteModelManager.class) {
            remoteModelManager = (RemoteModelManager) MlKitContext.getInstance().get(RemoteModelManager.class);
        }
        return remoteModelManager;
    }

    private final RemoteModelManagerInterface zza(Class cls) {
        return (RemoteModelManagerInterface) ((o55) Preconditions.checkNotNull((o55) this.zza.get(cls))).get();
    }

    public Task<Void> deleteDownloadedModel(RemoteModel remoteModel) {
        Preconditions.checkNotNull(remoteModel, "RemoteModel cannot be null");
        return zza(remoteModel.getClass()).deleteDownloadedModel(remoteModel);
    }

    public Task<Void> download(RemoteModel remoteModel, DownloadConditions downloadConditions) {
        Preconditions.checkNotNull(remoteModel, "RemoteModel cannot be null");
        Preconditions.checkNotNull(downloadConditions, "DownloadConditions cannot be null");
        if (this.zza.containsKey(remoteModel.getClass())) {
            return zza(remoteModel.getClass()).download(remoteModel, downloadConditions);
        }
        return Tasks.forException(new MlKitException(lb1.A("Feature model '", remoteModel.getClass().getSimpleName(), "' doesn't have a corresponding modelmanager registered."), 13));
    }

    public <T extends RemoteModel> Task<Set<T>> getDownloadedModels(Class<T> cls) {
        return ((RemoteModelManagerInterface) ((o55) Preconditions.checkNotNull((o55) this.zza.get(cls))).get()).getDownloadedModels();
    }

    public Task<Boolean> isModelDownloaded(RemoteModel remoteModel) {
        Preconditions.checkNotNull(remoteModel, "RemoteModel cannot be null");
        return zza(remoteModel.getClass()).isModelDownloaded(remoteModel);
    }
}
