package com.github.junrar.io;

import java.io.BufferedInputStream;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SeekableReadOnlyInputStream implements SeekableReadOnlyByteChannel {
    private final RandomAccessInputStream is;

    public SeekableReadOnlyInputStream(InputStream inputStream) {
        this.is = new RandomAccessInputStream(new BufferedInputStream(inputStream));
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public void close() {
        this.is.close();
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public long getPosition() {
        return this.is.getLongFilePointer();
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int read() {
        return this.is.read();
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int readFully(byte[] bArr, int i) {
        this.is.readFully(bArr, i);
        return i;
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public void setPosition(long j) {
        this.is.seek(j);
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int read(byte[] bArr, int i, int i2) {
        return this.is.read(bArr, i, i2);
    }
}
