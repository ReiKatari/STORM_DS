package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fi6  reason: default package */
/* loaded from: classes.dex */
public final class fi6 extends InputStream {
    public InputStream A;
    public final di6 B;
    public final byte[] L = new byte[4096];
    public int R = 0;
    public int X = 0;
    public int Y = 0;
    public boolean Z = false;
    public IOException d0 = null;
    public final byte[] e0 = new byte[1];

    public fi6(InputStream inputStream, di6 di6Var) {
        inputStream.getClass();
        this.A = inputStream;
        this.B = di6Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.A != null) {
            IOException iOException = this.d0;
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
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        byte[] bArr2 = this.L;
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) >= 0 && i3 <= bArr.length) {
            if (i2 == 0) {
                return 0;
            }
            if (this.A != null) {
                IOException iOException = this.d0;
                if (iOException == null) {
                    int i4 = 0;
                    while (true) {
                        try {
                            int min = Math.min(this.X, i2);
                            System.arraycopy(bArr2, this.R, bArr, i, min);
                            int i5 = this.R + min;
                            this.R = i5;
                            int i6 = this.X - min;
                            this.X = i6;
                            i += min;
                            i2 -= min;
                            i4 += min;
                            int i7 = this.Y;
                            if (i5 + i6 + i7 == 4096) {
                                System.arraycopy(bArr2, i5, bArr2, 0, i6 + i7);
                                this.R = 0;
                            }
                            if (i2 == 0 || this.Z) {
                                break;
                            }
                            int i8 = this.R + this.X + this.Y;
                            int read = this.A.read(bArr2, i8, 4096 - i8);
                            if (read == -1) {
                                this.Z = true;
                                this.X = this.Y;
                                this.Y = 0;
                            } else {
                                int i9 = this.Y + read;
                                this.Y = i9;
                                int a = this.B.a(bArr2, this.R, i9);
                                this.X = a;
                                this.Y -= a;
                            }
                        } catch (IOException e) {
                            this.d0 = e;
                            throw e;
                        }
                    }
                    if (i4 <= 0) {
                        return -1;
                    }
                    return i4;
                }
                throw iOException;
            }
            throw new IOException("Stream closed");
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.e0;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
