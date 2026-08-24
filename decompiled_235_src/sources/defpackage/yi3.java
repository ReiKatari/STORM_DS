package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yi3  reason: default package */
/* loaded from: classes.dex */
public final class yi3 extends InputStream {
    public static final /* synthetic */ int g0 = 0;
    public InputStream A;
    public final mu B;
    public ui3 L;
    public final pd5 R;
    public final xi3 X;
    public long e0;
    public boolean Y = false;
    public boolean Z = false;
    public final byte[] d0 = new byte[1];
    public IOException f0 = null;

    public yi3(InputStream inputStream, long j, byte b, int i) {
        mu muVar = mu.a;
        int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (i2 >= 0) {
            int i3 = b & 255;
            if (i3 <= 224) {
                int i4 = i3 / 45;
                int i5 = i3 - (i4 * 45);
                int i6 = i5 / 9;
                int i7 = i5 - (i6 * 9);
                if (i >= 0 && i <= 2147483632) {
                    if (i2 >= 0 && i7 >= 0 && i7 <= 8 && i6 >= 0 && i6 <= 4 && i4 >= 0 && i4 <= 4) {
                        this.A = inputStream;
                        this.B = muVar;
                        int e = e(i);
                        if (j >= 0 && e > j) {
                            e = e((int) j);
                        }
                        this.L = new ui3(e(e), muVar);
                        pd5 pd5Var = new pd5(inputStream);
                        this.R = pd5Var;
                        this.X = new xi3(this.L, pd5Var, i7, i6, i4);
                        this.e0 = j;
                        return;
                    }
                    u34.t();
                    throw null;
                }
                throw new IOException("LZMA dictionary is too big for this implementation");
            }
            throw new IOException("Invalid LZMA properties byte");
        }
        throw new IOException("Uncompressed size is too big");
    }

    public static int e(int i) {
        if (i >= 0 && i <= 2147483632) {
            if (i < 4096) {
                i = 4096;
            }
            return (i + 15) & (-16);
        }
        i.h("LZMA dictionary is too big for this implementation");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A != null) {
            ui3 ui3Var = this.L;
            if (ui3Var != null) {
                this.B.b(ui3Var.a);
                this.L = null;
            }
            try {
                this.A.close();
            } finally {
                this.A = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        pd5 pd5Var = this.R;
        xi3 xi3Var = this.X;
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) >= 0 && i3 <= bArr.length) {
            boolean z5 = false;
            if (i2 == 0) {
                return 0;
            }
            if (this.A != null) {
                IOException iOException = this.f0;
                if (iOException == null) {
                    if (this.Y) {
                        return -1;
                    }
                    int i5 = i;
                    int i6 = i2;
                    int i7 = 0;
                    while (i6 > 0) {
                        try {
                            long j2 = this.e0;
                            if (j2 >= 0 && j2 < i6) {
                                i4 = (int) j2;
                            } else {
                                i4 = i6;
                            }
                            ui3 ui3Var = this.L;
                            int i8 = ui3Var.b;
                            int i9 = ui3Var.d;
                            if (i8 - i9 <= i4) {
                                ui3Var.f = i8;
                            } else {
                                ui3Var.f = i9 + i4;
                            }
                            try {
                                xi3Var.a();
                                j = -1;
                            } catch (e71 e) {
                                j = -1;
                                if (this.e0 == -1) {
                                    if (xi3Var.b[0] == -1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        this.Y = true;
                                        pd5Var.f();
                                    }
                                }
                                throw e;
                            }
                            ui3 ui3Var2 = this.L;
                            int i10 = ui3Var2.d;
                            int i11 = ui3Var2.c;
                            int i12 = i10 - i11;
                            if (i10 == ui3Var2.b) {
                                ui3Var2.d = 0;
                            }
                            System.arraycopy(ui3Var2.a, i11, bArr, i5, i12);
                            ui3Var2.c = ui3Var2.d;
                            i5 += i12;
                            i6 -= i12;
                            i7 += i12;
                            long j3 = this.e0;
                            if (j3 >= 0) {
                                long j4 = j3 - i12;
                                this.e0 = j4;
                                if (j4 == 0) {
                                    this.Y = true;
                                }
                            }
                            if (this.Y) {
                                ui3 ui3Var3 = this.L;
                                if (ui3Var3.g > 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    if (pd5Var.c == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        if (this.e0 != j && this.Z) {
                                            int i13 = ui3Var3.b;
                                            int i14 = ui3Var3.d;
                                            if (i13 - i14 <= 1) {
                                                ui3Var3.f = i13;
                                            } else {
                                                ui3Var3.f = i14 + 1;
                                            }
                                            try {
                                                xi3Var.a();
                                            } catch (e71 e2) {
                                                if (xi3Var.b[0] == -1) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (z4) {
                                                    pd5Var.f();
                                                    if (pd5Var.c == 0) {
                                                        z5 = true;
                                                    }
                                                    if (z5) {
                                                    }
                                                } else {
                                                    throw e2;
                                                }
                                            }
                                            throw new e71();
                                        }
                                        throw new e71();
                                    }
                                    ui3 ui3Var4 = this.L;
                                    if (ui3Var4 != null) {
                                        this.B.b(ui3Var4.a);
                                        this.L = null;
                                    }
                                    if (i7 == 0) {
                                        return -1;
                                    }
                                    return i7;
                                }
                                throw new e71();
                            }
                        } catch (IOException e3) {
                            this.f0 = e3;
                            throw e3;
                        }
                    }
                    return i7;
                }
                throw iOException;
            }
            throw new IOException("Stream closed");
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.d0;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
