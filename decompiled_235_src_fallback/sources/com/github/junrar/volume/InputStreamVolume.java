package com.github.junrar.volume;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class InputStreamVolume implements com.github.junrar.volume.Volume {
    private final com.github.junrar.Archive archive;
    private final java.io.InputStream inputStream;
    private final int position;

    public InputStreamVolume(com.github.junrar.Archive r1, java.io.InputStream r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.archive = r1
            r0.inputStream = r2
            r0.position = r3
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
            com.github.junrar.io.SeekableReadOnlyInputStream r0 = new com.github.junrar.io.SeekableReadOnlyInputStream
            java.io.InputStream r1 = r1.inputStream
            r0.<init>(r1)
            return r0
    }

    @Override // com.github.junrar.volume.Volume
    public long getLength() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
    }

    public int getPosition() {
            r0 = this;
            int r0 = r0.position
            return r0
    }
}
