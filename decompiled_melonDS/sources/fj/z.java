package fj;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z implements f {
    public final e0 A;
    public final e B;
    public boolean L;

    /* JADX WARN: Type inference failed for: r1v1, types: [fj.e, java.lang.Object] */
    public z(e0 e0Var) {
        e0Var.getClass();
        this.A = e0Var;
        this.B = new Object();
    }

    @Override // fj.e0
    public final void A(e eVar, long j2) {
        eVar.getClass();
        if (!this.L) {
            this.B.A(eVar, j2);
            d();
            return;
        }
        a0.j.p("closed");
    }

    @Override // fj.f
    public final f M(int i2, byte[] bArr) {
        if (!this.L) {
            this.B.b0(i2, bArr);
            d();
            return this;
        }
        a0.j.p("closed");
        return null;
    }

    @Override // fj.f
    public final f P(String str) {
        str.getClass();
        if (!this.L) {
            this.B.k0(str);
            d();
            return this;
        }
        a0.j.p("closed");
        return null;
    }

    @Override // fj.f
    public final f Q(long j2) {
        if (!this.L) {
            this.B.f0(j2);
            d();
            return this;
        }
        a0.j.p("closed");
        return null;
    }

    @Override // fj.f
    public final e b() {
        return this.B;
    }

    @Override // fj.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e0 e0Var = this.A;
        if (!this.L) {
            try {
                e eVar = this.B;
                long j2 = eVar.B;
                if (j2 > 0) {
                    e0Var.A(eVar, j2);
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                e0Var.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.L = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final f d() {
        if (!this.L) {
            e eVar = this.B;
            long v10 = eVar.v();
            if (v10 > 0) {
                this.A.A(eVar, v10);
            }
            return this;
        }
        a0.j.p("closed");
        return null;
    }

    @Override // fj.e0
    public final i0 f() {
        return this.A.f();
    }

    @Override // fj.f, fj.e0, java.io.Flushable
    public final void flush() {
        if (!this.L) {
            e eVar = this.B;
            long j2 = eVar.B;
            int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            e0 e0Var = this.A;
            if (i2 > 0) {
                e0Var.A(eVar, j2);
            }
            e0Var.flush();
            return;
        }
        a0.j.p("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.L;
    }

    @Override // fj.f
    public final f p(h hVar) {
        hVar.getClass();
        if (!this.L) {
            this.B.c0(hVar);
            d();
            return this;
        }
        a0.j.p("closed");
        return null;
    }

    public final String toString() {
        return "buffer(" + this.A + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.L) {
            int write = this.B.write(byteBuffer);
            d();
            return write;
        }
        a0.j.p("closed");
        return 0;
    }

    @Override // fj.f
    public final f writeByte(int i2) {
        if (!this.L) {
            this.B.e0(i2);
            d();
            return this;
        }
        a0.j.p("closed");
        return null;
    }

    @Override // fj.f
    public final f writeInt(int i2) {
        if (!this.L) {
            this.B.h0(i2);
            d();
            return this;
        }
        a0.j.p("closed");
        return null;
    }

    @Override // fj.f
    public final f writeShort(int i2) {
        if (!this.L) {
            this.B.i0(i2);
            d();
            return this;
        }
        a0.j.p("closed");
        return null;
    }

    @Override // fj.f
    public final f write(byte[] bArr) {
        bArr.getClass();
        if (!this.L) {
            this.B.b0(bArr.length, bArr);
            d();
            return this;
        }
        a0.j.p("closed");
        return null;
    }
}
