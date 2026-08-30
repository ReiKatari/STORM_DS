package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s45  reason: default package */
/* loaded from: classes.dex */
public final class s45 implements u60 {
    public final sb6 A;
    public final f60 B;
    public boolean L;

    /* JADX WARN: Type inference failed for: r1v1, types: [f60, java.lang.Object] */
    public s45(sb6 sb6Var) {
        sb6Var.getClass();
        this.A = sb6Var;
        this.B = new Object();
    }

    public final short B() {
        b0(2L);
        return this.B.R();
    }

    public final String C(long j) {
        b0(j);
        return this.B.T(j, hk0.a);
    }

    @Override // defpackage.u60
    public final int H(cf4 cf4Var) {
        cf4Var.getClass();
        if (!this.L) {
            while (true) {
                f60 f60Var = this.B;
                int d = b.d(f60Var, cf4Var, true);
                if (d != -2) {
                    if (d != -1) {
                        f60Var.skip(cf4Var.A[d].d());
                        return d;
                    }
                } else if (this.A.L(f60Var, 8192L) == -1) {
                    break;
                }
            }
            return -1;
        }
        i.n("closed");
        return 0;
    }

    @Override // defpackage.sb6
    public final long L(f60 f60Var, long j) {
        f60Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.L) {
                f60 f60Var2 = this.B;
                if (f60Var2.B == 0) {
                    if (i == 0) {
                        return 0L;
                    }
                    if (this.A.L(f60Var2, 8192L) == -1) {
                        return -1L;
                    }
                }
                return f60Var2.L(f60Var, Math.min(j, f60Var2.B));
            }
            i.n("closed");
            return 0L;
        }
        i.g(wh1.h(j, "byteCount < 0: "));
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [f60, java.lang.Object] */
    @Override // defpackage.u60
    public final String O(long j) {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long i = i((byte) 10, 0L, j2);
            int i2 = (i > (-1L) ? 1 : (i == (-1L) ? 0 : -1));
            f60 f60Var = this.B;
            if (i2 != 0) {
                return b.c(f60Var, i);
            }
            if (j2 < Long.MAX_VALUE && u(j2) && f60Var.D(j2 - 1) == 13 && u(j2 + 1) && f60Var.D(j2) == 10) {
                return b.c(f60Var, j2);
            }
            ?? obj = new Object();
            f60Var.B(obj, 0L, Math.min(32L, f60Var.B));
            throw new EOFException("\\n not found: limit=" + Math.min(f60Var.B, j) + " content=" + obj.r(obj.B).e() + (char) 8230);
        }
        i.g(wh1.h(j, "limit < 0: "));
        return null;
    }

    @Override // defpackage.u60
    public final long S(t60 t60Var) {
        f60 f60Var;
        long j = 0;
        while (true) {
            sb6 sb6Var = this.A;
            f60Var = this.B;
            if (sb6Var.L(f60Var, 8192L) == -1) {
                break;
            }
            long x = f60Var.x();
            if (x > 0) {
                j += x;
                t60Var.l(f60Var, x);
            }
        }
        long j2 = f60Var.B;
        if (j2 > 0) {
            long j3 = j + j2;
            t60Var.l(f60Var, j2);
            return j3;
        }
        return j;
    }

    @Override // defpackage.u60, defpackage.t60
    public final f60 b() {
        return this.B;
    }

    @Override // defpackage.u60
    public final void b0(long j) {
        if (u(j)) {
            return;
        }
        i.l();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.L) {
            this.L = true;
            this.A.close();
            this.B.w();
        }
    }

    public final boolean d() {
        if (!this.L) {
            f60 f60Var = this.B;
            if (!f60Var.C() || this.A.L(f60Var, 8192L) != -1) {
                return false;
            }
            return true;
        }
        i.n("closed");
        return false;
    }

    @Override // defpackage.sb6
    public final kt6 f() {
        return this.A.f();
    }

    @Override // defpackage.u60
    public final String h0(Charset charset) {
        charset.getClass();
        sb6 sb6Var = this.A;
        f60 f60Var = this.B;
        f60Var.l0(sb6Var);
        return f60Var.T(f60Var.B, charset);
    }

    public final long i(byte b, long j, long j2) {
        if (!this.L) {
            if (0 <= j2) {
                long j3 = 0;
                while (j3 < j2) {
                    f60 f60Var = this.B;
                    byte b2 = b;
                    long j4 = j2;
                    long F = f60Var.F(b2, j3, j4);
                    if (F != -1) {
                        return F;
                    }
                    long j5 = f60Var.B;
                    if (j5 >= j4 || this.A.L(f60Var, 8192L) == -1) {
                        break;
                    }
                    j3 = Math.max(j3, j5);
                    b = b2;
                    j2 = j4;
                }
                return -1L;
            }
            i.g(wh1.h(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        i.n("closed");
        return 0L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.L;
    }

    public final boolean p(long j, w70 w70Var) {
        long a;
        boolean z;
        boolean z2;
        long j2;
        w70Var.getClass();
        int d = w70Var.d();
        if (!this.L) {
            if (d < 0 || j < 0 || d > w70Var.d()) {
                return false;
            }
            if (d == 0) {
                return true;
            }
            long j3 = 1;
            long j4 = j + 1;
            long j5 = d;
            a53.q(w70Var.d(), 0L, j5);
            if (!this.L) {
                long j6 = j;
                loop0: while (true) {
                    f60 f60Var = this.B;
                    a = b.a(f60Var, w70Var, j6, j4, d);
                    if (a != -1) {
                        z = false;
                        z2 = true;
                        break;
                    }
                    long j7 = f60Var.B;
                    z = false;
                    z2 = true;
                    long j8 = (j7 - j5) + j3;
                    if (j8 >= j4) {
                        break;
                    }
                    if (j7 < j4) {
                        j2 = j4;
                    } else {
                        int max = (int) Math.max(j3, (j7 - j4) + j3);
                        int min = ((int) Math.min(j5, (f60Var.B - j6) + j3)) - 1;
                        if (max > min) {
                            break;
                        }
                        while (true) {
                            j2 = j4;
                            if (!f60Var.J(f60Var.B - min, w70Var, min)) {
                                if (min == max) {
                                    break loop0;
                                }
                                min--;
                                j4 = j2;
                            } else {
                                break;
                            }
                        }
                    }
                    if (this.A.L(f60Var, 8192L) == -1) {
                        break;
                    }
                    j6 = Math.max(j6, j8);
                    j4 = j2;
                    j3 = 1;
                }
                a = -1;
                if (a != -1) {
                    return z2;
                }
                return z;
            }
            i.n("closed");
            return false;
        }
        i.n("closed");
        return false;
    }

    @Override // defpackage.u60
    public final w70 r(long j) {
        b0(j);
        return this.B.r(j);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        f60 f60Var = this.B;
        if (f60Var.B == 0 && this.A.L(f60Var, 8192L) == -1) {
            return -1;
        }
        return f60Var.read(byteBuffer);
    }

    @Override // defpackage.u60
    public final byte readByte() {
        b0(1L);
        return this.B.readByte();
    }

    @Override // defpackage.u60
    public final int readInt() {
        b0(4L);
        return this.B.readInt();
    }

    @Override // defpackage.u60
    public final short readShort() {
        b0(2L);
        return this.B.readShort();
    }

    @Override // defpackage.u60
    public final void skip(long j) {
        if (!this.L) {
            while (j > 0) {
                f60 f60Var = this.B;
                if (f60Var.B == 0 && this.A.L(f60Var, 8192L) == -1) {
                    i.l();
                    return;
                }
                long min = Math.min(j, f60Var.B);
                f60Var.skip(min);
                j -= min;
            }
            return;
        }
        i.n("closed");
    }

    public final String toString() {
        return "buffer(" + this.A + ')';
    }

    @Override // defpackage.u60
    public final boolean u(long j) {
        f60 f60Var;
        if (j >= 0) {
            if (!this.L) {
                do {
                    f60Var = this.B;
                    if (f60Var.B >= j) {
                        return true;
                    }
                } while (this.A.L(f60Var, 8192L) != -1);
                return false;
            }
            i.n("closed");
            return false;
        }
        i.g(wh1.h(j, "byteCount < 0: "));
        return false;
    }

    public final int w() {
        b0(4L);
        int readInt = this.B.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final long x() {
        char c;
        char c2;
        long j;
        b0(8L);
        f60 f60Var = this.B;
        if (f60Var.B >= 8) {
            cy5 cy5Var = f60Var.A;
            cy5Var.getClass();
            int i = cy5Var.b;
            int i2 = cy5Var.c;
            if (i2 - i < 8) {
                j = ((f60Var.readInt() & 4294967295L) << 32) | (4294967295L & f60Var.readInt());
                c = 24;
                c2 = '(';
            } else {
                byte[] bArr = cy5Var.a;
                c = 24;
                c2 = '(';
                long j2 = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48);
                int i3 = i + 7;
                int i4 = i + 8;
                long j3 = j2 | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i3] & 255);
                f60Var.B -= 8;
                if (i4 == i2) {
                    f60Var.A = cy5Var.a();
                    fy5.a(cy5Var);
                } else {
                    cy5Var.b = i4;
                }
                j = j3;
            }
            return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> c2) | ((280375465082880L & j) >>> c) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << c) | ((65280 & j) << c2);
        }
        i.l();
        return 0L;
    }
}
