package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gc3  reason: default package */
/* loaded from: classes.dex */
public final class gc3 extends InputStream {
    public static final /* synthetic */ int f0 = 0;
    public InputStream A;
    public final ut B;
    public cc3 L;
    public final f45 R;
    public final fc3 X;
    public long d0;
    public boolean Y = false;
    public boolean Z = false;
    public final byte[] c0 = new byte[1];
    public IOException e0 = null;

    public gc3(InputStream inputStream, long j, byte b, int i) {
        ut utVar = ut.a;
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
                        this.B = utVar;
                        int d = d(i);
                        if (j >= 0 && d > j) {
                            d = d((int) j);
                        }
                        this.L = new cc3(d(d), utVar);
                        f45 f45Var = new f45(inputStream);
                        this.R = f45Var;
                        this.X = new fc3(this.L, f45Var, i7, i6, i4);
                        this.d0 = j;
                        return;
                    }
                    c44.r();
                    throw null;
                }
                throw new IOException("LZMA dictionary is too big for this implementation");
            }
            throw new IOException("Invalid LZMA properties byte");
        }
        throw new IOException("Uncompressed size is too big");
    }

    public static int d(int i) {
        if (i >= 0 && i <= 2147483632) {
            if (i < 4096) {
                i = 4096;
            }
            return (i + 15) & (-16);
        }
        i.i("LZMA dictionary is too big for this implementation");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A != null) {
            cc3 cc3Var = this.L;
            if (cc3Var != null) {
                this.B.b(cc3Var.a);
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
        f45 f45Var = this.R;
        fc3 fc3Var = this.X;
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) >= 0 && i3 <= bArr.length) {
            boolean z5 = false;
            if (i2 == 0) {
                return 0;
            }
            if (this.A != null) {
                IOException iOException = this.e0;
                if (iOException == null) {
                    if (this.Y) {
                        return -1;
                    }
                    int i5 = i;
                    int i6 = i2;
                    int i7 = 0;
                    while (i6 > 0) {
                        try {
                            long j2 = this.d0;
                            if (j2 >= 0 && j2 < i6) {
                                i4 = (int) j2;
                            } else {
                                i4 = i6;
                            }
                            cc3 cc3Var = this.L;
                            int i8 = cc3Var.b;
                            int i9 = cc3Var.d;
                            if (i8 - i9 <= i4) {
                                cc3Var.f = i8;
                            } else {
                                cc3Var.f = i9 + i4;
                            }
                            try {
                                fc3Var.a();
                                j = -1;
                            } catch (w31 e) {
                                j = -1;
                                if (this.d0 == -1) {
                                    if (fc3Var.b[0] == -1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        this.Y = true;
                                        f45Var.f();
                                    }
                                }
                                throw e;
                            }
                            cc3 cc3Var2 = this.L;
                            int i10 = cc3Var2.d;
                            int i11 = cc3Var2.c;
                            int i12 = i10 - i11;
                            if (i10 == cc3Var2.b) {
                                cc3Var2.d = 0;
                            }
                            System.arraycopy(cc3Var2.a, i11, bArr, i5, i12);
                            cc3Var2.c = cc3Var2.d;
                            i5 += i12;
                            i6 -= i12;
                            i7 += i12;
                            long j3 = this.d0;
                            if (j3 >= 0) {
                                long j4 = j3 - i12;
                                this.d0 = j4;
                                if (j4 == 0) {
                                    this.Y = true;
                                }
                            }
                            if (this.Y) {
                                cc3 cc3Var3 = this.L;
                                if (cc3Var3.g > 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    if (f45Var.c == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        if (this.d0 != j && this.Z) {
                                            int i13 = cc3Var3.b;
                                            int i14 = cc3Var3.d;
                                            if (i13 - i14 <= 1) {
                                                cc3Var3.f = i13;
                                            } else {
                                                cc3Var3.f = i14 + 1;
                                            }
                                            try {
                                                fc3Var.a();
                                            } catch (w31 e2) {
                                                if (fc3Var.b[0] == -1) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (z4) {
                                                    f45Var.f();
                                                    if (f45Var.c == 0) {
                                                        z5 = true;
                                                    }
                                                    if (z5) {
                                                    }
                                                } else {
                                                    throw e2;
                                                }
                                            }
                                            throw new w31();
                                        }
                                        throw new w31();
                                    }
                                    cc3 cc3Var4 = this.L;
                                    if (cc3Var4 != null) {
                                        this.B.b(cc3Var4.a);
                                        this.L = null;
                                    }
                                    if (i7 == 0) {
                                        return -1;
                                    }
                                    return i7;
                                }
                                throw new w31();
                            }
                        } catch (IOException e3) {
                            this.e0 = e3;
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
        byte[] bArr = this.c0;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
