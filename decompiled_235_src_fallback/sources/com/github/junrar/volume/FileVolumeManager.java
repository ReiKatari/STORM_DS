package com.github.junrar.volume;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FileVolumeManager implements com.github.junrar.volume.VolumeManager {
    private final java.io.File firstVolume;

    public FileVolumeManager(java.io.File r1) {
            r0 = this;
            r0.<init>()
            r0.firstVolume = r1
            return
    }

    @Override // com.github.junrar.volume.VolumeManager
    public com.github.junrar.volume.Volume nextVolume(com.github.junrar.Archive r1, com.github.junrar.volume.Volume r2) {
            r0 = this;
            if (r2 != 0) goto La
            com.github.junrar.volume.FileVolume r2 = new com.github.junrar.volume.FileVolume
            java.io.File r0 = r0.firstVolume
            r2.<init>(r1, r0)
            return r2
        La:
            com.github.junrar.volume.FileVolume r2 = (com.github.junrar.volume.FileVolume) r2
            com.github.junrar.rarfile.MainHeader r0 = r1.getMainHeader()
            boolean r0 = r0.isNewNumbering()
            if (r0 == 0) goto L1f
            boolean r0 = r1.isOldFormat()
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            goto L20
        L1f:
            r0 = 1
        L20:
            java.io.File r2 = r2.getFile()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r0 = com.github.junrar.volume.VolumeHelper.nextVolumeName(r2, r0)
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            com.github.junrar.volume.FileVolume r0 = new com.github.junrar.volume.FileVolume
            r0.<init>(r1, r2)
            return r0
    }
}
