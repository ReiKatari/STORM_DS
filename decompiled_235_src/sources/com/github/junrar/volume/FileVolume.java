package com.github.junrar.volume;

import com.github.junrar.Archive;
import com.github.junrar.io.SeekableReadOnlyByteChannel;
import com.github.junrar.io.SeekableReadOnlyFile;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FileVolume implements Volume {
    private final Archive archive;
    private final File file;

    public FileVolume(Archive archive, File file) {
        this.archive = archive;
        this.file = file;
    }

    @Override // com.github.junrar.volume.Volume
    public Archive getArchive() {
        return this.archive;
    }

    @Override // com.github.junrar.volume.Volume
    public SeekableReadOnlyByteChannel getChannel() {
        return new SeekableReadOnlyFile(this.file);
    }

    public File getFile() {
        return this.file;
    }

    @Override // com.github.junrar.volume.Volume
    public long getLength() {
        return this.file.length();
    }
}
