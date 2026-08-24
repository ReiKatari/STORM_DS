package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j80  reason: default package */
/* loaded from: classes.dex */
public final class j80 extends InputStream {
    public final /* synthetic */ int A;
    public final /* synthetic */ z80 B;

    public /* synthetic */ j80(z80 z80Var, int i) {
        this.A = i;
        this.B = z80Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        int i = this.A;
        z80 z80Var = this.B;
        switch (i) {
            case 0:
                return (int) Math.min(((k80) z80Var).B, 2147483647L);
            default:
                fe5 fe5Var = (fe5) z80Var;
                if (!fe5Var.L) {
                    return (int) Math.min(fe5Var.B.B, 2147483647L);
                }
                e41.i("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.A) {
            case 0:
                return;
            default:
                ((fe5) this.B).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.A;
        z80 z80Var = this.B;
        switch (i) {
            case 0:
                k80 k80Var = (k80) z80Var;
                if (k80Var.B <= 0) {
                    return -1;
                }
                return k80Var.readByte() & 255;
            default:
                fe5 fe5Var = (fe5) z80Var;
                k80 k80Var2 = fe5Var.B;
                if (!fe5Var.L) {
                    if (k80Var2.B == 0 && fe5Var.A.b0(k80Var2, 8192L) == -1) {
                        return -1;
                    }
                    return k80Var2.readByte() & 255;
                }
                e41.i("closed");
                return 0;
        }
    }

    public final String toString() {
        int i = this.A;
        z80 z80Var = this.B;
        switch (i) {
            case 0:
                return ((k80) z80Var) + ".inputStream()";
            default:
                return ((fe5) z80Var) + ".inputStream()";
        }
    }

    public long transferTo(OutputStream outputStream) {
        switch (this.A) {
            case 1:
                outputStream.getClass();
                fe5 fe5Var = (fe5) this.B;
                k80 k80Var = fe5Var.B;
                if (!fe5Var.L) {
                    long j = 0;
                    while (true) {
                        if (k80Var.B == 0 && fe5Var.A.b0(k80Var, 8192L) == -1) {
                            return j;
                        }
                        long j2 = k80Var.B;
                        j += j2;
                        hf.D(j2, 0L, j2);
                        o96 o96Var = k80Var.A;
                        while (j2 > 0) {
                            o96Var.getClass();
                            int min = (int) Math.min(j2, o96Var.c - o96Var.b);
                            outputStream.write(o96Var.a, o96Var.b, min);
                            int i = o96Var.b + min;
                            o96Var.b = i;
                            long j3 = min;
                            k80Var.B -= j3;
                            j2 -= j3;
                            if (i == o96Var.c) {
                                o96 a = o96Var.a();
                                k80Var.A = a;
                                r96.a(o96Var);
                                o96Var = a;
                            }
                        }
                    }
                } else {
                    e41.i("closed");
                    return 0L;
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    private final void e() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.A;
        z80 z80Var = this.B;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((k80) z80Var).read(bArr, i, i2);
            default:
                fe5 fe5Var = (fe5) z80Var;
                k80 k80Var = fe5Var.B;
                if (!fe5Var.L) {
                    hf.D(bArr.length, i, i2);
                    if (k80Var.B == 0 && fe5Var.A.b0(k80Var, 8192L) == -1) {
                        return -1;
                    }
                    return k80Var.read(bArr, i, i2);
                }
                e41.i("closed");
                return 0;
        }
    }
}
