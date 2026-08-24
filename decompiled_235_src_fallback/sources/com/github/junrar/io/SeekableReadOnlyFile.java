package com.github.junrar.io;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SeekableReadOnlyFile implements com.github.junrar.io.SeekableReadOnlyByteChannel {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final java.io.RandomAccessFile file;

    public SeekableReadOnlyFile(java.io.File r3) {
            r2 = this;
            r2.<init>()
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r3, r1)
            r2.file = r0
            return
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public void close() {
            r0 = this;
            java.io.RandomAccessFile r0 = r0.file
            r0.close()
            return
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public long getPosition() {
            r2 = this;
            java.io.RandomAccessFile r2 = r2.file
            long r0 = r2.getFilePointer()
            return r0
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int read() {
            r0 = this;
            java.io.RandomAccessFile r0 = r0.file
            int r0 = r0.read()
            return r0
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int read(byte[] r1, int r2, int r3) {
            r0 = this;
            java.io.RandomAccessFile r0 = r0.file
            int r0 = r0.read(r1, r2, r3)
            return r0
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int readFully(byte[] r2, int r3) {
            r1 = this;
            java.io.RandomAccessFile r1 = r1.file
            r0 = 0
            r1.readFully(r2, r0, r3)
            return r3
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public void setPosition(long r1) {
            r0 = this;
            java.io.RandomAccessFile r0 = r0.file
            r0.seek(r1)
            return
    }
}
