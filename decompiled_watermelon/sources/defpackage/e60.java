package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e60  reason: default package */
/* loaded from: classes.dex */
public final class e60 extends InputStream {
    public final /* synthetic */ int A;
    public final /* synthetic */ u60 B;

    public /* synthetic */ e60(u60 u60Var, int i) {
        this.A = i;
        this.B = u60Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        int i = this.A;
        u60 u60Var = this.B;
        switch (i) {
            case 0:
                return (int) Math.min(((f60) u60Var).B, 2147483647L);
            default:
                s45 s45Var = (s45) u60Var;
                if (!s45Var.L) {
                    return (int) Math.min(s45Var.B.B, 2147483647L);
                }
                f81.j("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.A) {
            case 0:
                return;
            default:
                ((s45) this.B).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.A;
        u60 u60Var = this.B;
        switch (i) {
            case 0:
                f60 f60Var = (f60) u60Var;
                if (f60Var.B <= 0) {
                    return -1;
                }
                return f60Var.readByte() & 255;
            default:
                s45 s45Var = (s45) u60Var;
                f60 f60Var2 = s45Var.B;
                if (!s45Var.L) {
                    if (f60Var2.B == 0 && s45Var.A.L(f60Var2, 8192L) == -1) {
                        return -1;
                    }
                    return f60Var2.readByte() & 255;
                }
                f81.j("closed");
                return 0;
        }
    }

    public final String toString() {
        int i = this.A;
        u60 u60Var = this.B;
        switch (i) {
            case 0:
                return ((f60) u60Var) + ".inputStream()";
            default:
                return ((s45) u60Var) + ".inputStream()";
        }
    }

    public long transferTo(OutputStream outputStream) {
        switch (this.A) {
            case 1:
                outputStream.getClass();
                s45 s45Var = (s45) this.B;
                f60 f60Var = s45Var.B;
                if (!s45Var.L) {
                    long j = 0;
                    while (true) {
                        if (f60Var.B == 0 && s45Var.A.L(f60Var, 8192L) == -1) {
                            return j;
                        }
                        long j2 = f60Var.B;
                        j += j2;
                        a53.q(j2, 0L, j2);
                        cy5 cy5Var = f60Var.A;
                        while (j2 > 0) {
                            cy5Var.getClass();
                            int min = (int) Math.min(j2, cy5Var.c - cy5Var.b);
                            outputStream.write(cy5Var.a, cy5Var.b, min);
                            int i = cy5Var.b + min;
                            cy5Var.b = i;
                            long j3 = min;
                            f60Var.B -= j3;
                            j2 -= j3;
                            if (i == cy5Var.c) {
                                cy5 a = cy5Var.a();
                                f60Var.A = a;
                                fy5.a(cy5Var);
                                cy5Var = a;
                            }
                        }
                    }
                } else {
                    f81.j("closed");
                    return 0L;
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    private final void d() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.A;
        u60 u60Var = this.B;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((f60) u60Var).read(bArr, i, i2);
            default:
                s45 s45Var = (s45) u60Var;
                f60 f60Var = s45Var.B;
                if (!s45Var.L) {
                    a53.q(bArr.length, i, i2);
                    if (f60Var.B == 0 && s45Var.A.L(f60Var, 8192L) == -1) {
                        return -1;
                    }
                    return f60Var.read(bArr, i, i2);
                }
                f81.j("closed");
                return 0;
        }
    }
}
