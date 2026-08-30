package zj;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends InputStream {
    public InputStream A;
    public final bk.a B;
    public IOException L = null;
    public final byte[] R = new byte[1];

    public h(InputStream inputStream, int i2) {
        inputStream.getClass();
        this.A = inputStream;
        this.B = new bk.a(i2, 0);
    }

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStream = this.A;
        if (inputStream != null) {
            IOException iOException = this.L;
            if (iOException == null) {
                return inputStream.available();
            }
            throw iOException;
        }
        throw new IOException("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.A;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.A = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i10) {
        if (i10 == 0) {
            return 0;
        }
        InputStream inputStream = this.A;
        if (inputStream != null) {
            IOException iOException = this.L;
            if (iOException == null) {
                try {
                    int read = inputStream.read(bArr, i2, i10);
                    if (read == -1) {
                        return -1;
                    }
                    bk.a aVar = this.B;
                    byte[] bArr2 = (byte[]) aVar.L;
                    int i11 = aVar.B;
                    int min = Math.min(read, i11);
                    int i12 = 0;
                    while (i12 < min) {
                        int i13 = i2 + i12;
                        bArr[i13] = (byte) (bArr[i13] + bArr2[i12]);
                        i12++;
                    }
                    while (i12 < read) {
                        int i14 = i2 + i12;
                        bArr[i14] = (byte) (bArr[i14] + bArr[i14 - i11]);
                        i12++;
                    }
                    if (read >= i11) {
                        System.arraycopy(bArr, (i2 + read) - i11, bArr2, 0, i11);
                        return read;
                    }
                    int i15 = i11 - i12;
                    System.arraycopy(bArr2, i12, bArr2, 0, i15);
                    System.arraycopy(bArr, i2, bArr2, i15, read);
                    return read;
                } catch (IOException e6) {
                    this.L = e6;
                    throw e6;
                }
            }
            throw iOException;
        }
        throw new IOException("Stream closed");
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.R;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
