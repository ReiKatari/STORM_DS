package com.github.junrar;

import com.github.junrar.Archive;
import java.util.concurrent.ThreadFactory;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread lambda$static$0;
        lambda$static$0 = Archive.ExtractorExecutorHolder.lambda$static$0(runnable);
        return lambda$static$0;
    }
}
