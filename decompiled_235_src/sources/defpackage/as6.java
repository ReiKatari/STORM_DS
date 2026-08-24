package defpackage;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: as6  reason: default package */
/* loaded from: classes.dex */
public final class as6 extends FilterOutputStream {
    public final nr6 A;
    public final int B;
    public final ByteBuffer L;
    public final ByteBuffer R;
    public boolean X;

    public as6(og4 og4Var, FileOutputStream fileOutputStream, byte[] bArr) {
        super(fileOutputStream);
        nr6 h = og4Var.h(bArr);
        this.A = h;
        int f = og4Var.f();
        this.B = f;
        ByteBuffer allocate = ByteBuffer.allocate(f);
        this.L = allocate;
        this.R = ByteBuffer.allocate(og4Var.d());
        allocate.limit(f - og4Var.c());
        ByteBuffer i = h.i();
        byte[] bArr2 = new byte[i.remaining()];
        i.get(bArr2);
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
                        this.A.f(this.L, wrap, this.R);
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
