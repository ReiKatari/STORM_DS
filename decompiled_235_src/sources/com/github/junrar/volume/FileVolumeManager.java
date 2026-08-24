package com.github.junrar.volume;

import com.github.junrar.Archive;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FileVolumeManager implements VolumeManager {
    private final File firstVolume;

    public FileVolumeManager(File file) {
        this.firstVolume = file;
    }

    @Override // com.github.junrar.volume.VolumeManager
    public Volume nextVolume(Archive archive, Volume volume) {
        boolean z;
        if (volume == null) {
            return new FileVolume(archive, this.firstVolume);
        }
        FileVolume fileVolume = (FileVolume) volume;
        if (archive.getMainHeader().isNewNumbering() && !archive.isOldFormat()) {
            z = false;
        } else {
            z = true;
        }
        return new FileVolume(archive, new File(VolumeHelper.nextVolumeName(fileVolume.getFile().getAbsolutePath(), z)));
    }
}
