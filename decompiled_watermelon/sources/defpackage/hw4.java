package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hw4  reason: default package */
/* loaded from: classes.dex */
public abstract class hw4 extends FilterInputStream {
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return super.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = ((FilterInputStream) this).in;
        yu2 yu2Var = zu2.a;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((FilterInputStream) this).in.read();
        int i = -1;
        if (read != -1) {
            i = 1;
        }
        d(i);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        return ((FilterInputStream) this).in.skip(j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        yu2 yu2Var = zu2.a;
        int read = ((FilterInputStream) this).in.read(bArr);
        d(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        d(read);
        return read;
    }

    public void d(int i) {
    }
}
