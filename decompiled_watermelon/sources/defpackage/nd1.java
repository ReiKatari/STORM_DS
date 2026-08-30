package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nd1  reason: default package */
/* loaded from: classes.dex */
public final class nd1 extends InputStream {
    public InputStream A;
    public final sb B;
    public IOException L = null;
    public final byte[] R = new byte[1];

    public nd1(InputStream inputStream, int i) {
        inputStream.getClass();
        this.A = inputStream;
        this.B = new sb(i, 5);
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
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.A;
        if (inputStream != null) {
            IOException iOException = this.L;
            if (iOException == null) {
                try {
                    int read = inputStream.read(bArr, i, i2);
                    if (read == -1) {
                        return -1;
                    }
                    sb sbVar = this.B;
                    byte[] bArr2 = (byte[]) sbVar.L;
                    int i3 = sbVar.B;
                    int min = Math.min(read, i3);
                    int i4 = 0;
                    while (i4 < min) {
                        int i5 = i + i4;
                        bArr[i5] = (byte) (bArr[i5] + bArr2[i4]);
                        i4++;
                    }
                    while (i4 < read) {
                        int i6 = i + i4;
                        bArr[i6] = (byte) (bArr[i6] + bArr[i6 - i3]);
                        i4++;
                    }
                    if (read >= i3) {
                        System.arraycopy(bArr, (i + read) - i3, bArr2, 0, i3);
                        return read;
                    }
                    int i7 = i3 - i4;
                    System.arraycopy(bArr2, i4, bArr2, 0, i7);
                    System.arraycopy(bArr, i, bArr2, i7, read);
                    return read;
                } catch (IOException e) {
                    this.L = e;
                    throw e;
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
