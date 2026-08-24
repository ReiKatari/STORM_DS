package com.github.junrar.volume;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FileVolume implements com.github.junrar.volume.Volume {
    private final com.github.junrar.Archive archive;
    private final java.io.File file;

    public FileVolume(com.github.junrar.Archive r1, java.io.File r2) {
            r0 = this;
            r0.<init>()
            r0.archive = r1
            r0.file = r2
            return
    }

    @Override // com.github.junrar.volume.Volume
    public com.github.junrar.Archive getArchive() {
            r0 = this;
            com.github.junrar.Archive r0 = r0.archive
            return r0
    }

    @Override // com.github.junrar.volume.Volume
    public com.github.junrar.io.SeekableReadOnlyByteChannel getChannel() {
            r1 = this;
            com.github.junrar.io.SeekableReadOnlyFile r0 = new com.github.junrar.io.SeekableReadOnlyFile
            java.io.File r1 = r1.file
            r0.<init>(r1)
            return r0
    }

    public java.io.File getFile() {
            r0 = this;
            java.io.File r0 = r0.file
            return r0
    }

    @Override // com.github.junrar.volume.Volume
    public long getLength() {
            r2 = this;
            java.io.File r2 = r2.file
            long r0 = r2.length()
            return r0
    }
}
