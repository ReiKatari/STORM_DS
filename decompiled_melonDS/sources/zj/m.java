package zj;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends InputStream {
    public InputStream A;
    public final fk.b B;
    public final byte[] L = new byte[4096];
    public int R = 0;
    public int X = 0;
    public int Y = 0;
    public boolean Z = false;

    /* renamed from: b0  reason: collision with root package name */
    public IOException f15167b0 = null;

    /* renamed from: c0  reason: collision with root package name */
    public final byte[] f15168c0 = new byte[1];

    public m(InputStream inputStream, fk.b bVar) {
        inputStream.getClass();
        this.A = inputStream;
        this.B = bVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.A != null) {
            IOException iOException = this.f15167b0;
            if (iOException == null) {
                return this.X;
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
        int i11;
        byte[] bArr2 = this.L;
        if (i2 >= 0 && i10 >= 0 && (i11 = i2 + i10) >= 0 && i11 <= bArr.length) {
            if (i10 == 0) {
                return 0;
            }
            if (this.A != null) {
                IOException iOException = this.f15167b0;
                if (iOException == null) {
                    int i12 = 0;
                    while (true) {
                        try {
                            int min = Math.min(this.X, i10);
                            System.arraycopy(bArr2, this.R, bArr, i2, min);
                            int i13 = this.R + min;
                            this.R = i13;
                            int i14 = this.X - min;
                            this.X = i14;
                            i2 += min;
                            i10 -= min;
                            i12 += min;
                            int i15 = this.Y;
                            if (i13 + i14 + i15 == 4096) {
                                System.arraycopy(bArr2, i13, bArr2, 0, i14 + i15);
                                this.R = 0;
                            }
                            if (i10 == 0 || this.Z) {
                                break;
                            }
                            int i16 = this.R + this.X + this.Y;
                            int read = this.A.read(bArr2, i16, 4096 - i16);
                            if (read == -1) {
                                this.Z = true;
                                this.X = this.Y;
                                this.Y = 0;
                            } else {
                                int i17 = this.Y + read;
                                this.Y = i17;
                                int a10 = this.B.a(bArr2, this.R, i17);
                                this.X = a10;
                                this.Y -= a10;
                            }
                        } catch (IOException e6) {
                            this.f15167b0 = e6;
                            throw e6;
                        }
                    }
                    if (i12 <= 0) {
                        return -1;
                    }
                    return i12;
                }
                throw iOException;
            }
            throw new IOException("Stream closed");
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f15168c0;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
