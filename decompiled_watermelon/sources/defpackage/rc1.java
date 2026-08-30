package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rc1  reason: default package */
/* loaded from: classes.dex */
public final class rc1 extends sv0 {
    public InputStream A;
    public mu2 B;
    public final byte[] L;

    public rc1(InputStream inputStream) {
        mu2 mu2Var = new mu2(inputStream);
        this.L = new byte[1];
        this.B = mu2Var;
        this.A = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        mu2 mu2Var = this.B;
        if (mu2Var != null) {
            return mu2Var.B.g();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            mu2 mu2Var = this.B;
            yu2 yu2Var = zu2.a;
            if (mu2Var != null) {
                try {
                    mu2Var.close();
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
        mu2 mu2Var = this.B;
        if (mu2Var == null) {
            return -1;
        }
        try {
            int i3 = mu2Var.i(bArr, i, i2);
            this.B.L.A.i();
            if (i3 == -1) {
                mu2 mu2Var2 = this.B;
                yu2 yu2Var = zu2.a;
                if (mu2Var2 != null) {
                    try {
                        mu2Var2.close();
                    } catch (IOException unused) {
                    }
                }
                this.B = null;
            }
            return i3;
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
        i.n(wh1.g(read, "Invalid return value from read: "));
        return 0;
    }
}
