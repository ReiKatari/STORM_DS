package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r45  reason: default package */
/* loaded from: classes.dex */
public final class r45 implements t60 {
    public final g76 A;
    public final f60 B;
    public boolean L;

    /* JADX WARN: Type inference failed for: r1v1, types: [f60, java.lang.Object] */
    public r45(g76 g76Var) {
        g76Var.getClass();
        this.A = g76Var;
        this.B = new Object();
    }

    @Override // defpackage.t60
    public final t60 Y(int i, byte[] bArr) {
        if (!this.L) {
            this.B.j0(i, bArr);
            d();
            return this;
        }
        i.n("closed");
        return null;
    }

    @Override // defpackage.t60
    public final f60 b() {
        return this.B;
    }

    @Override // defpackage.t60
    public final t60 c0(String str) {
        str.getClass();
        if (!this.L) {
            this.B.s0(str);
            d();
            return this;
        }
        i.n("closed");
        return null;
    }

    @Override // defpackage.g76, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g76 g76Var = this.A;
        if (!this.L) {
            try {
                f60 f60Var = this.B;
                long j = f60Var.B;
                if (j > 0) {
                    g76Var.l(f60Var, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                g76Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.L = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final t60 d() {
        if (!this.L) {
            f60 f60Var = this.B;
            long x = f60Var.x();
            if (x > 0) {
                this.A.l(f60Var, x);
            }
            return this;
        }
        i.n("closed");
        return null;
    }

    @Override // defpackage.t60
    public final t60 d0(long j) {
        if (!this.L) {
            this.B.n0(j);
            d();
            return this;
        }
        i.n("closed");
        return null;
    }

    @Override // defpackage.g76
    public final kt6 f() {
        return this.A.f();
    }

    @Override // defpackage.t60, defpackage.g76, java.io.Flushable
    public final void flush() {
        if (!this.L) {
            f60 f60Var = this.B;
            long j = f60Var.B;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            g76 g76Var = this.A;
            if (i > 0) {
                g76Var.l(f60Var, j);
            }
            g76Var.flush();
            return;
        }
        i.n("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.L;
    }

    @Override // defpackage.g76
    public final void l(f60 f60Var, long j) {
        f60Var.getClass();
        if (!this.L) {
            this.B.l(f60Var, j);
            d();
            return;
        }
        i.n("closed");
    }

    @Override // defpackage.t60
    public final t60 n(w70 w70Var) {
        w70Var.getClass();
        if (!this.L) {
            this.B.k0(w70Var);
            d();
            return this;
        }
        i.n("closed");
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
        i.n("closed");
        return 0;
    }

    @Override // defpackage.t60
    public final t60 writeByte(int i) {
        if (!this.L) {
            this.B.m0(i);
            d();
            return this;
        }
        i.n("closed");
        return null;
    }

    @Override // defpackage.t60
    public final t60 writeInt(int i) {
        if (!this.L) {
            this.B.p0(i);
            d();
            return this;
        }
        i.n("closed");
        return null;
    }

    @Override // defpackage.t60
    public final t60 writeShort(int i) {
        if (!this.L) {
            this.B.q0(i);
            d();
            return this;
        }
        i.n("closed");
        return null;
    }

    @Override // defpackage.t60
    public final t60 write(byte[] bArr) {
        bArr.getClass();
        if (!this.L) {
            this.B.j0(bArr.length, bArr);
            d();
            return this;
        }
        i.n("closed");
        return null;
    }
}
