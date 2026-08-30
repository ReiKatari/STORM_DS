package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ig6  reason: default package */
/* loaded from: classes.dex */
public final class ig6 extends FilterInputStream {
    public final ByteBuffer A;
    public final ByteBuffer B;
    public final int L;
    public boolean R;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final byte[] c0;
    public int d0;
    public final wf6 e0;
    public final int f0;
    public final int g0;

    public ig6(x74 x74Var, InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.e0 = x74Var.g();
        this.L = x74Var.e();
        this.c0 = Arrays.copyOf(bArr, bArr.length);
        int d = x74Var.d();
        this.f0 = d;
        ByteBuffer allocate = ByteBuffer.allocate(d + 1);
        this.A = allocate;
        allocate.limit(0);
        this.g0 = d - x74Var.c();
        ByteBuffer allocate2 = ByteBuffer.allocate(x74Var.f() + 16);
        this.B = allocate2;
        allocate2.limit(0);
        this.R = false;
        this.X = false;
        this.Y = false;
        this.d0 = 0;
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

    public final void d() {
        byte b;
        while (!this.X && this.A.remaining() > 0) {
            int read = ((FilterInputStream) this).in.read(this.A.array(), this.A.position(), this.A.remaining());
            if (read > 0) {
                ByteBuffer byteBuffer = this.A;
                byteBuffer.position(byteBuffer.position() + read);
            } else if (read == -1) {
                this.X = true;
            } else if (read == 0) {
                f81.j("Could not read bytes from the ciphertext stream");
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
            this.e0.d(this.A, this.d0, this.X, this.B);
            this.d0++;
            this.B.flip();
            this.A.clear();
            if (!this.X) {
                this.A.clear();
                this.A.limit(this.f0 + 1);
                this.A.put(b);
            }
        } catch (GeneralSecurityException e) {
            this.Z = true;
            this.B.limit(0);
            throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.d0 + " endOfCiphertext:" + this.X, e);
        }
    }

    public final void i() {
        if (!this.R) {
            ByteBuffer allocate = ByteBuffer.allocate(this.L);
            while (allocate.remaining() > 0) {
                int read = ((FilterInputStream) this).in.read(allocate.array(), allocate.position(), allocate.remaining());
                if (read != -1) {
                    if (read != 0) {
                        allocate.position(allocate.position() + read);
                    } else {
                        f81.j("Could not read bytes from the ciphertext stream");
                        return;
                    }
                } else {
                    this.Z = true;
                    this.B.limit(0);
                    f81.j("Ciphertext is too short");
                    return;
                }
            }
            allocate.flip();
            try {
                this.e0.c(allocate, this.c0);
                this.R = true;
                return;
            } catch (GeneralSecurityException e) {
                throw new IOException(e);
            }
        }
        this.Z = true;
        this.B.limit(0);
        f81.j("Decryption failed.");
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
                    i();
                    this.A.clear();
                    this.A.limit(this.g0 + 1);
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
                        d();
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
        long j2 = this.f0;
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
        return "StreamingAeadDecryptingStream\nsegmentNr:" + this.d0 + "\nciphertextSegmentSize:" + this.f0 + "\nheaderRead:" + this.R + "\nendOfCiphertext:" + this.X + "\nendOfPlaintext:" + this.Y + "\ndecryptionErrorOccured:" + this.Z + "\nciphertextSgement position:" + this.A.position() + " limit:" + this.A.limit() + "\nplaintextSegment position:" + this.B.position() + " limit:" + this.B.limit();
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
        f81.j("Reading failed");
        return 0;
    }
}
