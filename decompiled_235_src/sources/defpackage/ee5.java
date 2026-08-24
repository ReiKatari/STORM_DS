package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ee5  reason: default package */
/* loaded from: classes.dex */
public final class ee5 implements y80 {
    public final ui6 A;
    public final k80 B;
    public boolean L;

    /* JADX WARN: Type inference failed for: r1v1, types: [k80, java.lang.Object] */
    public ee5(ui6 ui6Var) {
        ui6Var.getClass();
        this.A = ui6Var;
        this.B = new Object();
    }

    @Override // defpackage.y80
    public final y80 B(byte[] bArr, int i) {
        if (!this.L) {
            this.B.l0(bArr, i);
            e();
            return this;
        }
        i.m("closed");
        return null;
    }

    @Override // defpackage.y80
    public final y80 H(String str) {
        str.getClass();
        if (!this.L) {
            this.B.t0(str);
            e();
            return this;
        }
        i.m("closed");
        return null;
    }

    @Override // defpackage.ui6
    public final void O(k80 k80Var, long j) {
        k80Var.getClass();
        if (!this.L) {
            this.B.O(k80Var, j);
            e();
            return;
        }
        i.m("closed");
    }

    @Override // defpackage.y80
    public final y80 P(da0 da0Var) {
        da0Var.getClass();
        if (!this.L) {
            this.B.k0(da0Var);
            e();
            return this;
        }
        i.m("closed");
        return null;
    }

    @Override // defpackage.y80
    public final k80 a() {
        return this.B;
    }

    @Override // defpackage.ui6
    public final b67 b() {
        return this.A.b();
    }

    @Override // defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ui6 ui6Var = this.A;
        if (!this.L) {
            try {
                k80 k80Var = this.B;
                long j = k80Var.B;
                if (j > 0) {
                    ui6Var.O(k80Var, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                ui6Var.close();
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

    public final y80 e() {
        if (!this.L) {
            k80 k80Var = this.B;
            long k = k80Var.k();
            if (k > 0) {
                this.A.O(k80Var, k);
            }
            return this;
        }
        i.m("closed");
        return null;
    }

    @Override // defpackage.y80, defpackage.ui6, java.io.Flushable
    public final void flush() {
        if (!this.L) {
            k80 k80Var = this.B;
            long j = k80Var.B;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            ui6 ui6Var = this.A;
            if (i > 0) {
                ui6Var.O(k80Var, j);
            }
            ui6Var.flush();
            return;
        }
        i.m("closed");
    }

    @Override // defpackage.y80
    public final y80 h0(long j) {
        if (!this.L) {
            this.B.o0(j);
            e();
            return this;
        }
        i.m("closed");
        return null;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.L;
    }

    public final String toString() {
        return "buffer(" + this.A + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.L) {
            int write = this.B.write(byteBuffer);
            e();
            return write;
        }
        i.m("closed");
        return 0;
    }

    @Override // defpackage.y80
    public final y80 writeByte(int i) {
        if (!this.L) {
            this.B.n0(i);
            e();
            return this;
        }
        i.m("closed");
        return null;
    }

    @Override // defpackage.y80
    public final y80 writeInt(int i) {
        if (!this.L) {
            this.B.q0(i);
            e();
            return this;
        }
        i.m("closed");
        return null;
    }

    @Override // defpackage.y80
    public final y80 writeShort(int i) {
        if (!this.L) {
            this.B.r0(i);
            e();
            return this;
        }
        i.m("closed");
        return null;
    }

    @Override // defpackage.y80
    public final y80 write(byte[] bArr) {
        bArr.getClass();
        if (!this.L) {
            this.B.l0(bArr, bArr.length);
            e();
            return this;
        }
        i.m("closed");
        return null;
    }
}
