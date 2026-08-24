package com.google.mlkit.common.sdkinternal.model;

import android.net.Uri;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ModelLoader {
    private static final GmsLogger zza = new GmsLogger("ModelLoader", "");
    public final LocalModelLoader localModelLoader;
    protected ModelLoadingState modelLoadingState = ModelLoadingState.NO_MODEL_LOADED;
    public final RemoteModelLoader remoteModelLoader;
    private final ModelLoadingLogger zzb;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface ModelContentHandler {
        void constructModel(MappedByteBuffer mappedByteBuffer);
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface ModelLoadingLogger {
        void logErrorCodes(List<Integer> list);
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public enum ModelLoadingState {
        NO_MODEL_LOADED,
        REMOTE_MODEL_LOADED,
        LOCAL_MODEL_LOADED
    }

    public ModelLoader(RemoteModelLoader remoteModelLoader, LocalModelLoader localModelLoader, ModelLoadingLogger modelLoadingLogger) {
        boolean z = true;
        if (remoteModelLoader == null && localModelLoader == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "At least one of RemoteModelLoader or LocalModelLoader must be non-null.");
        Preconditions.checkNotNull(modelLoadingLogger);
        this.remoteModelLoader = remoteModelLoader;
        this.localModelLoader = localModelLoader;
        this.zzb = modelLoadingLogger;
    }

    private final String zza() {
        String uniqueModelNameForPersist;
        LocalModelLoader localModelLoader = this.localModelLoader;
        String str = null;
        if (localModelLoader != null) {
            String assetFilePath = localModelLoader.getLocalModel().getAssetFilePath();
            LocalModelLoader localModelLoader2 = this.localModelLoader;
            if (assetFilePath != null) {
                str = localModelLoader2.getLocalModel().getAssetFilePath();
            } else {
                String absoluteFilePath = localModelLoader2.getLocalModel().getAbsoluteFilePath();
                LocalModelLoader localModelLoader3 = this.localModelLoader;
                if (absoluteFilePath != null) {
                    str = localModelLoader3.getLocalModel().getAbsoluteFilePath();
                } else if (localModelLoader3.getLocalModel().getUri() != null) {
                    str = ((Uri) Preconditions.checkNotNull(this.localModelLoader.getLocalModel().getUri())).toString();
                }
            }
        }
        RemoteModelLoader remoteModelLoader = this.remoteModelLoader;
        if (remoteModelLoader == null) {
            uniqueModelNameForPersist = "unspecified";
        } else {
            uniqueModelNameForPersist = remoteModelLoader.getRemoteModel().getUniqueModelNameForPersist();
        }
        return lb1.n("Local model path: ", str, ". Remote model name: ", uniqueModelNameForPersist, ". ");
    }

    private final synchronized boolean zzb(ModelContentHandler modelContentHandler, List list) {
        MappedByteBuffer load;
        LocalModelLoader localModelLoader = this.localModelLoader;
        if (localModelLoader != null && (load = localModelLoader.load()) != null) {
            try {
                modelContentHandler.constructModel(load);
                zza.d("ModelLoader", "Local model source is loaded successfully");
                return true;
            } catch (RuntimeException e) {
                list.add(18);
                throw e;
            }
        }
        return false;
    }

    private final synchronized boolean zzc(ModelContentHandler modelContentHandler, List list) {
        RemoteModelLoader remoteModelLoader = this.remoteModelLoader;
        if (remoteModelLoader != null) {
            try {
                MappedByteBuffer load = remoteModelLoader.load();
                if (load != null) {
                    try {
                        modelContentHandler.constructModel(load);
                        zza.d("ModelLoader", "Remote model source is loaded successfully");
                        return true;
                    } catch (RuntimeException e) {
                        list.add(19);
                        throw e;
                    }
                }
                zza.d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                list.add(21);
            } catch (MlKitException e2) {
                zza.d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                list.add(20);
                throw e2;
            }
        }
        return false;
    }

    public synchronized boolean isRemoteModelLoaded() {
        if (this.modelLoadingState == ModelLoadingState.REMOTE_MODEL_LOADED) {
            return true;
        }
        return false;
    }

    public synchronized void loadWithModelContentHandler(ModelContentHandler modelContentHandler) {
        Exception exc;
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        Exception e = null;
        try {
            z = zzc(modelContentHandler, arrayList);
            exc = null;
        } catch (Exception e2) {
            exc = e2;
            z = false;
        }
        if (z) {
            this.zzb.logErrorCodes(arrayList);
            this.modelLoadingState = ModelLoadingState.REMOTE_MODEL_LOADED;
            return;
        }
        try {
            z2 = zzb(modelContentHandler, arrayList);
        } catch (Exception e3) {
            e = e3;
        }
        if (z2) {
            this.zzb.logErrorCodes(arrayList);
            this.modelLoadingState = ModelLoadingState.LOCAL_MODEL_LOADED;
            return;
        }
        arrayList.add(17);
        this.zzb.logErrorCodes(arrayList);
        this.modelLoadingState = ModelLoadingState.NO_MODEL_LOADED;
        if (exc == null) {
            if (e != null) {
                throw new MlKitException("Local model load failed with the model options: ".concat(String.valueOf(zza())), 14, e);
            }
            throw new MlKitException("Cannot load any model with the model options: ".concat(String.valueOf(zza())), 14);
        }
        throw new MlKitException("Remote model load failed with the model options: ".concat(String.valueOf(zza())), 14, exc);
    }
}
