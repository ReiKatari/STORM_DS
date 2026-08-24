package com.google.mlkit.common.sdkinternal.model;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface RemoteModelManagerInterface<RemoteT extends RemoteModel> {
    Task<Void> deleteDownloadedModel(RemoteT remotet);

    Task<Void> download(RemoteT remotet, DownloadConditions downloadConditions);

    Task<Set<RemoteT>> getDownloadedModels();

    Task<Boolean> isModelDownloaded(RemoteT remotet);
}
