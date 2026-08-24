package com.github.junrar.volume;

import com.github.junrar.Archive;
import com.github.junrar.io.SeekableReadOnlyByteChannel;
import com.github.junrar.io.SeekableReadOnlyInputStream;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class InputStreamVolume implements Volume {
    private final Archive archive;
    private final InputStream inputStream;
    private final int position;

    public InputStreamVolume(Archive archive, InputStream inputStream, int i) {
        this.archive = archive;
        this.inputStream = inputStream;
        this.position = i;
    }

    @Override // com.github.junrar.volume.Volume
    public Archive getArchive() {
        return this.archive;
    }

    @Override // com.github.junrar.volume.Volume
    public SeekableReadOnlyByteChannel getChannel() {
        return new SeekableReadOnlyInputStream(this.inputStream);
    }

    @Override // com.github.junrar.volume.Volume
    public long getLength() {
        return Long.MAX_VALUE;
    }

    public int getPosition() {
        return this.position;
    }
}
