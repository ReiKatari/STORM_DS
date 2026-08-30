package ij;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends InputStream {
    public final ByteBuffer A;
    public final SeekableByteChannel B;
    public long L;

    public e(SeekableByteChannel seekableByteChannel, long j2) {
        int i2;
        this.B = seekableByteChannel;
        this.L = j2;
        if (j2 < 8192 && j2 > 0) {
            i2 = (int) j2;
        } else {
            i2 = 8192;
        }
        this.A = ByteBuffer.allocate(i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i10) {
        int read;
        if (i10 == 0) {
            return 0;
        }
        long j2 = this.L;
        if (j2 <= 0) {
            return -1;
        }
        if (i10 > j2) {
            i10 = (int) j2;
        }
        ByteBuffer byteBuffer = this.A;
        int capacity = byteBuffer.capacity();
        SeekableByteChannel seekableByteChannel = this.B;
        if (i10 <= capacity) {
            byteBuffer.rewind().limit(i10);
            read = seekableByteChannel.read(byteBuffer);
            byteBuffer.flip();
        } else {
            byteBuffer = ByteBuffer.allocate(i10);
            read = seekableByteChannel.read(byteBuffer);
            byteBuffer.flip();
        }
        if (read >= 0) {
            byteBuffer.get(bArr, i2, read);
            this.L -= read;
        }
        return read;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read() {
        long j2 = this.L;
        if (j2 > 0) {
            this.L = j2 - 1;
            ByteBuffer byteBuffer = this.A;
            byteBuffer.rewind().limit(1);
            int read = this.B.read(byteBuffer);
            byteBuffer.flip();
            return read < 0 ? read : byteBuffer.get() & 255;
        }
        return -1;
    }
}
