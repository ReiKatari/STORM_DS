package com.github.junrar.io;

import java.io.File;
import java.io.RandomAccessFile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SeekableReadOnlyFile implements SeekableReadOnlyByteChannel {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final RandomAccessFile file;

    public SeekableReadOnlyFile(File file) {
        this.file = new RandomAccessFile(file, "r");
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public void close() {
        this.file.close();
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public long getPosition() {
        return this.file.getFilePointer();
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int read() {
        return this.file.read();
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int readFully(byte[] bArr, int i) {
        this.file.readFully(bArr, 0, i);
        return i;
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public void setPosition(long j) {
        this.file.seek(j);
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int read(byte[] bArr, int i, int i2) {
        return this.file.read(bArr, i, i2);
    }
}
