package com.github.junrar.io;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SeekableReadOnlyInputStream implements com.github.junrar.io.SeekableReadOnlyByteChannel {
    private final com.github.junrar.io.RandomAccessInputStream is;

    public SeekableReadOnlyInputStream(java.io.InputStream r3) {
            r2 = this;
            r2.<init>()
            com.github.junrar.io.RandomAccessInputStream r0 = new com.github.junrar.io.RandomAccessInputStream
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r1.<init>(r3)
            r0.<init>(r1)
            r2.is = r0
            return
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public void close() {
            r0 = this;
            com.github.junrar.io.RandomAccessInputStream r0 = r0.is
            r0.close()
            return
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public long getPosition() {
            r2 = this;
            com.github.junrar.io.RandomAccessInputStream r2 = r2.is
            long r0 = r2.getLongFilePointer()
            return r0
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int read() {
            r0 = this;
            com.github.junrar.io.RandomAccessInputStream r0 = r0.is
            int r0 = r0.read()
            return r0
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int read(byte[] r1, int r2, int r3) {
            r0 = this;
            com.github.junrar.io.RandomAccessInputStream r0 = r0.is
            int r0 = r0.read(r1, r2, r3)
            return r0
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int readFully(byte[] r1, int r2) {
            r0 = this;
            com.github.junrar.io.RandomAccessInputStream r0 = r0.is
            r0.readFully(r1, r2)
            return r2
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public void setPosition(long r1) {
            r0 = this;
            com.github.junrar.io.RandomAccessInputStream r0 = r0.is
            r0.seek(r1)
            return
    }
}
