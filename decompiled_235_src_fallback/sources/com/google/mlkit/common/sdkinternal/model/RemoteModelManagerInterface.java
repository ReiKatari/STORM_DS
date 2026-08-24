package com.google.mlkit.common.sdkinternal.model;

import com.google.mlkit.common.model.RemoteModel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface RemoteModelManagerInterface<RemoteT extends com.google.mlkit.common.model.RemoteModel> {
    com.google.android.gms.tasks.Task<java.lang.Void> deleteDownloadedModel(RemoteT r1);

    com.google.android.gms.tasks.Task<java.lang.Void> download(RemoteT r1, com.google.mlkit.common.model.DownloadConditions r2);

    com.google.android.gms.tasks.Task<java.util.Set<RemoteT>> getDownloadedModels();

    com.google.android.gms.tasks.Task<java.lang.Boolean> isModelDownloaded(RemoteT r1);
}
