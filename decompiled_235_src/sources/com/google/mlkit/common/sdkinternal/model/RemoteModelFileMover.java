package com.google.mlkit.common.sdkinternal.model;

import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface RemoteModelFileMover {
    File getModelFileDestination();

    File moveAllFilesFromPrivateTempToPrivateDestination(File file);
}
