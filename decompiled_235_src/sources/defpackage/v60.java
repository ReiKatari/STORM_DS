package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v60  reason: default package */
/* loaded from: classes.dex */
public final class v60 extends InputStream {
    public final ByteBuffer A;
    public final SeekableByteChannel B;
    public long L;

    public v60(SeekableByteChannel seekableByteChannel, long j) {
        int i;
        this.B = seekableByteChannel;
        this.L = j;
        if (j < 8192 && j > 0) {
            i = (int) j;
        } else {
            i = 8192;
        }
        this.A = ByteBuffer.allocate(i);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read;
        if (i2 == 0) {
            return 0;
        }
        long j = this.L;
        if (j <= 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        ByteBuffer byteBuffer = this.A;
        int capacity = byteBuffer.capacity();
        SeekableByteChannel seekableByteChannel = this.B;
        if (i2 <= capacity) {
            byteBuffer.rewind().limit(i2);
            read = seekableByteChannel.read(byteBuffer);
            byteBuffer.flip();
        } else {
            byteBuffer = ByteBuffer.allocate(i2);
            read = seekableByteChannel.read(byteBuffer);
            byteBuffer.flip();
        }
        if (read >= 0) {
            byteBuffer.get(bArr, i, read);
            this.L -= read;
        }
        return read;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.L;
        if (j > 0) {
            this.L = j - 1;
            ByteBuffer byteBuffer = this.A;
            byteBuffer.rewind().limit(1);
            int read = this.B.read(byteBuffer);
            byteBuffer.flip();
            return read < 0 ? read : byteBuffer.get() & 255;
        }
        return -1;
    }
}
