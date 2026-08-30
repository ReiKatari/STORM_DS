package defpackage;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jg6  reason: default package */
/* loaded from: classes.dex */
public final class jg6 extends FilterOutputStream {
    public final xf6 A;
    public final int B;
    public final ByteBuffer L;
    public final ByteBuffer R;
    public boolean X;

    public jg6(x74 x74Var, FileOutputStream fileOutputStream, byte[] bArr) {
        super(fileOutputStream);
        xf6 h = x74Var.h(bArr);
        this.A = h;
        int f = x74Var.f();
        this.B = f;
        ByteBuffer allocate = ByteBuffer.allocate(f);
        this.L = allocate;
        this.R = ByteBuffer.allocate(x74Var.d());
        allocate.limit(f - x74Var.c());
        ByteBuffer h2 = h.h();
        byte[] bArr2 = new byte[h2.remaining()];
        h2.get(bArr2);
        ((FilterOutputStream) this).out.write(bArr2);
        this.X = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.X) {
            return;
        }
        try {
            this.L.flip();
            this.R.clear();
            this.A.j(this.L, this.R);
            this.R.flip();
            ((FilterOutputStream) this).out.write(this.R.array(), this.R.position(), this.R.remaining());
            this.X = false;
            super.close();
        } catch (GeneralSecurityException e) {
            throw new IOException("ptBuffer.remaining():" + this.L.remaining() + " ctBuffer.remaining():" + this.R.remaining(), e);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            if (!this.X) {
                throw new IOException("Trying to write to closed stream");
            }
            while (true) {
                int remaining = this.L.remaining();
                ByteBuffer byteBuffer = this.L;
                if (i2 > remaining) {
                    int remaining2 = byteBuffer.remaining();
                    ByteBuffer wrap = ByteBuffer.wrap(bArr, i, remaining2);
                    i += remaining2;
                    i2 -= remaining2;
                    try {
                        this.L.flip();
                        this.R.clear();
                        this.A.b(this.L, wrap, this.R);
                        this.R.flip();
                        ((FilterOutputStream) this).out.write(this.R.array(), this.R.position(), this.R.remaining());
                        this.L.clear();
                        this.L.limit(this.B);
                    } catch (GeneralSecurityException e) {
                        throw new IOException(e);
                    }
                } else {
                    byteBuffer.put(bArr, i, i2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
