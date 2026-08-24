package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sg1  reason: default package */
/* loaded from: classes.dex */
public final class sg1 extends oy0 {
    public InputStream A;
    public n03 B;
    public final byte[] L;

    public sg1(InputStream inputStream) {
        n03 n03Var = new n03(inputStream);
        this.L = new byte[1];
        this.B = n03Var;
        this.A = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        n03 n03Var = this.B;
        if (n03Var != null) {
            return n03Var.B.j();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            n03 n03Var = this.B;
            a13 a13Var = b13.a;
            if (n03Var != null) {
                try {
                    n03Var.close();
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
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        n03 n03Var = this.B;
        if (n03Var == null) {
            return -1;
        }
        try {
            int h = n03Var.h(bArr, i, i2);
            this.B.L.A.h();
            if (h == -1) {
                n03 n03Var2 = this.B;
                a13 a13Var = b13.a;
                if (n03Var2 != null) {
                    try {
                        n03Var2.close();
                    } catch (IOException unused) {
                    }
                }
                this.B = null;
            }
            return h;
        } catch (RuntimeException e) {
            throw new IOException("Invalid Deflate64 input", e);
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
        i.m(lb1.g(read, "Invalid return value from read: "));
        return 0;
    }
}
