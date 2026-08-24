package com.github.junrar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface UnrarCallback {
    boolean isNextVolumeReady(com.github.junrar.volume.Volume r1);

    void volumeProgressChanged(long r1, long r3);
}
