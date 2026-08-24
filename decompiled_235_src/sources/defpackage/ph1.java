package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ph1  reason: default package */
/* loaded from: classes.dex */
public final class ph1 extends InputStream {
    public InputStream A;
    public final zb B;
    public IOException L = null;
    public final byte[] R = new byte[1];

    public ph1(InputStream inputStream, int i) {
        inputStream.getClass();
        this.A = inputStream;
        this.B = new zb(i, 5);
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
                    zb zbVar = this.B;
                    byte[] bArr2 = (byte[]) zbVar.L;
                    int i3 = zbVar.B;
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
