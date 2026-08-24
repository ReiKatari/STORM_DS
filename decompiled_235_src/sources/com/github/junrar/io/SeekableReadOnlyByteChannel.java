package com.github.junrar.io;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface SeekableReadOnlyByteChannel {
    void close();

    long getPosition();

    int read();

    int read(byte[] bArr, int i, int i2);

    int readFully(byte[] bArr, int i);

    void setPosition(long j);
}
