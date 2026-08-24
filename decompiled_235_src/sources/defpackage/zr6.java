package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zr6  reason: default package */
/* loaded from: classes.dex */
public final class zr6 extends FilterInputStream {
    public final ByteBuffer A;
    public final ByteBuffer B;
    public final int L;
    public boolean R;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final byte[] d0;
    public int e0;
    public final mr6 f0;
    public final int g0;
    public final int h0;

    public zr6(og4 og4Var, InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.f0 = og4Var.g();
        this.L = og4Var.e();
        this.d0 = Arrays.copyOf(bArr, bArr.length);
        int d = og4Var.d();
        this.g0 = d;
        ByteBuffer allocate = ByteBuffer.allocate(d + 1);
        this.A = allocate;
        allocate.limit(0);
        this.h0 = d - og4Var.c();
        ByteBuffer allocate2 = ByteBuffer.allocate(og4Var.f() + 16);
        this.B = allocate2;
        allocate2.limit(0);
        this.R = false;
        this.X = false;
        this.Y = false;
        this.e0 = 0;
        this.Z = false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return this.B.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
    }

    public final void e() {
        byte b;
        while (!this.X && this.A.remaining() > 0) {
            int read = ((FilterInputStream) this).in.read(this.A.array(), this.A.position(), this.A.remaining());
            if (read > 0) {
                ByteBuffer byteBuffer = this.A;
                byteBuffer.position(byteBuffer.position() + read);
            } else if (read == -1) {
                this.X = true;
            } else if (read == 0) {
                e41.i("Could not read bytes from the ciphertext stream");
                return;
            }
        }
        if (!this.X) {
            ByteBuffer byteBuffer2 = this.A;
            b = byteBuffer2.get(byteBuffer2.position() - 1);
            ByteBuffer byteBuffer3 = this.A;
            byteBuffer3.position(byteBuffer3.position() - 1);
        } else {
            b = 0;
        }
        this.A.flip();
        this.B.clear();
        try {
            this.f0.d(this.A, this.e0, this.X, this.B);
            this.e0++;
            this.B.flip();
            this.A.clear();
            if (!this.X) {
                this.A.clear();
                this.A.limit(this.g0 + 1);
                this.A.put(b);
            }
        } catch (GeneralSecurityException e) {
            this.Z = true;
            this.B.limit(0);
            throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.e0 + " endOfCiphertext:" + this.X, e);
        }
    }

    public final void h() {
        if (!this.R) {
            ByteBuffer allocate = ByteBuffer.allocate(this.L);
            while (allocate.remaining() > 0) {
                int read = ((FilterInputStream) this).in.read(allocate.array(), allocate.position(), allocate.remaining());
                if (read != -1) {
                    if (read != 0) {
                        allocate.position(allocate.position() + read);
                    } else {
                        e41.i("Could not read bytes from the ciphertext stream");
                        return;
                    }
                } else {
                    this.Z = true;
                    this.B.limit(0);
                    e41.i("Ciphertext is too short");
                    return;
                }
            }
            allocate.flip();
            try {
                this.f0.c(allocate, this.d0);
                this.R = true;
                return;
            } catch (GeneralSecurityException e) {
                throw new IOException(e);
            }
        }
        this.Z = true;
        this.B.limit(0);
        e41.i("Decryption failed.");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        try {
            if (!this.Z) {
                if (!this.R) {
                    h();
                    this.A.clear();
                    this.A.limit(this.h0 + 1);
                }
                if (this.Y) {
                    return -1;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    }
                    if (this.B.remaining() == 0) {
                        if (this.X) {
                            this.Y = true;
                            break;
                        }
                        e();
                    }
                    int min = Math.min(this.B.remaining(), i2 - i3);
                    this.B.get(bArr, i3 + i, min);
                    i3 += min;
                }
                if (i3 == 0 && this.Y) {
                    return -1;
                }
                return i3;
            }
            throw new IOException("Decryption failed.");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int read;
        long j2 = this.g0;
        if (j <= 0) {
            return 0L;
        }
        int min = (int) Math.min(j2, j);
        byte[] bArr = new byte[min];
        long j3 = j;
        while (j3 > 0 && (read = read(bArr, 0, (int) Math.min(min, j3))) > 0) {
            j3 -= read;
        }
        return j - j3;
    }

    public final synchronized String toString() {
        return "StreamingAeadDecryptingStream\nsegmentNr:" + this.e0 + "\nciphertextSegmentSize:" + this.g0 + "\nheaderRead:" + this.R + "\nendOfCiphertext:" + this.X + "\nendOfPlaintext:" + this.Y + "\ndecryptionErrorOccured:" + this.Z + "\nciphertextSgement position:" + this.A.position() + " limit:" + this.A.limit() + "\nplaintextSegment position:" + this.B.position() + " limit:" + this.B.limit();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read == 1) {
            return bArr[0] & 255;
        }
        if (read == -1) {
            return read;
        }
        e41.i("Reading failed");
        return 0;
    }
}
