package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s13  reason: default package */
/* loaded from: classes.dex */
public final class s13 extends InputStream {
    public boolean A;
    public InputStream B;
    public InputStream L;
    public os R;
    public byte[] X;

    @Override // java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream = this.B;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.L.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.B;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        } else if (!this.A) {
            this.A = true;
            List<wt4> list = (List) ((ConcurrentHashMap) this.R.B).get(new xt4(iq2.f));
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            for (wt4 wt4Var : list) {
                try {
                    try {
                        InputStream a = ((gg6) wt4Var.a).a(this.L, this.X);
                        int read = a.read(bArr, i, i2);
                        if (read != 0) {
                            this.B = a;
                            this.L.mark(0);
                            return read;
                        }
                        throw new IOException("Could not read bytes from the ciphertext stream");
                    } catch (IOException unused) {
                        this.L.reset();
                    }
                } catch (GeneralSecurityException unused2) {
                    this.L.reset();
                }
            }
            throw new IOException("No matching key found for the ciphertext in the stream.");
        } else {
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) == 1) {
            return bArr[0];
        }
        return -1;
    }
}
