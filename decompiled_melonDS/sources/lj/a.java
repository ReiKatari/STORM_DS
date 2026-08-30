package lj;

import a0.j;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends jj.a {
    public InputStream A;
    public f B;
    public final byte[] L;

    public a(InputStream inputStream) {
        f fVar = new f(inputStream);
        this.L = new byte[1];
        this.B = fVar;
        this.A = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        f fVar = this.B;
        if (fVar != null) {
            return fVar.B.l();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            f fVar = this.B;
            nj.b bVar = nj.c.f10450a;
            if (fVar != null) {
                try {
                    fVar.close();
                } catch (IOException unused) {
                }
            }
            this.B = null;
        } finally {
            InputStream inputStream = this.A;
            if (inputStream != null) {
                inputStream.close();
                this.A = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i10) {
        if (i10 == 0) {
            return 0;
        }
        f fVar = this.B;
        if (fVar == null) {
            return -1;
        }
        try {
            int i11 = fVar.i(bArr, i2, i10);
            this.B.L.A.i();
            if (i11 == -1) {
                f fVar2 = this.B;
                nj.b bVar = nj.c.f10450a;
                if (fVar2 != null) {
                    try {
                        fVar2.close();
                    } catch (IOException unused) {
                    }
                }
                this.B = null;
            }
            return i11;
        } catch (RuntimeException e6) {
            throw new IOException("Invalid Deflate64 input", e6);
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr;
        int read;
        do {
            bArr = this.L;
            read = read(bArr);
            if (read == -1) {
                return -1;
            }
        } while (read == 0);
        if (read == 1) {
            return bArr[0] & 255;
        }
        j.p(w.d.l(read, "Invalid return value from read: "));
        return 0;
    }
}
