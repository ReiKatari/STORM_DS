package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fe5  reason: default package */
/* loaded from: classes.dex */
public final class fe5 implements z80 {
    public final in6 A;
    public final k80 B;
    public boolean L;

    /* JADX WARN: Type inference failed for: r1v1, types: [k80, java.lang.Object] */
    public fe5(in6 in6Var) {
        in6Var.getClass();
        this.A = in6Var;
        this.B = new Object();
    }

    @Override // defpackage.z80
    public final long C(y80 y80Var) {
        k80 k80Var;
        long j = 0;
        while (true) {
            in6 in6Var = this.A;
            k80Var = this.B;
            if (in6Var.b0(k80Var, 8192L) == -1) {
                break;
            }
            long k = k80Var.k();
            if (k > 0) {
                j += k;
                y80Var.O(k80Var, k);
            }
        }
        long j2 = k80Var.B;
        if (j2 > 0) {
            long j3 = j + j2;
            y80Var.O(k80Var, j2);
            return j3;
        }
        return j;
    }

    @Override // defpackage.z80
    public final void K(k80 k80Var, long j) {
        k80 k80Var2 = this.B;
        try {
            g0(j);
            k80Var2.K(k80Var, j);
        } catch (EOFException e) {
            k80Var.m0(k80Var2);
            throw e;
        }
    }

    @Override // defpackage.z80
    public final String M(Charset charset) {
        charset.getClass();
        in6 in6Var = this.A;
        k80 k80Var = this.B;
        k80Var.m0(in6Var);
        return k80Var.a0(k80Var.B, charset);
    }

    @Override // defpackage.z80
    public final boolean T(long j) {
        k80 k80Var;
        if (j >= 0) {
            if (!this.L) {
                do {
                    k80Var = this.B;
                    if (k80Var.B >= j) {
                        return true;
                    }
                } while (this.A.b0(k80Var, 8192L) != -1);
                return false;
            }
            i.m("closed");
            return false;
        }
        i.f(lb1.h(j, "byteCount < 0: "));
        return false;
    }

    @Override // defpackage.z80
    public final k80 a() {
        return this.B;
    }

    @Override // defpackage.in6
    public final b67 b() {
        return this.A.b();
    }

    @Override // defpackage.in6
    public final long b0(k80 k80Var, long j) {
        k80Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.L) {
                k80 k80Var2 = this.B;
                if (k80Var2.B == 0) {
                    if (i == 0) {
                        return 0L;
                    }
                    if (this.A.b0(k80Var2, 8192L) == -1) {
                        return -1L;
                    }
                }
                return k80Var2.b0(k80Var, Math.min(j, k80Var2.B));
            }
            i.m("closed");
            return 0L;
        }
        i.f(lb1.h(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.L) {
            this.L = true;
            this.A.close();
            this.B.e();
        }
    }

    public final boolean e() {
        if (!this.L) {
            k80 k80Var = this.B;
            if (!k80Var.u() || this.A.b0(k80Var, 8192L) != -1) {
                return false;
            }
            return true;
        }
        i.m("closed");
        return false;
    }

    @Override // defpackage.z80
    public final void g0(long j) {
        if (T(j)) {
            return;
        }
        i.n();
    }

    public final long h(byte b, long j, long j2) {
        if (!this.L) {
            if (0 <= j2) {
                long j3 = 0;
                while (j3 < j2) {
                    k80 k80Var = this.B;
                    byte b2 = b;
                    long j4 = j2;
                    long A = k80Var.A(b2, j3, j4);
                    if (A != -1) {
                        return A;
                    }
                    long j5 = k80Var.B;
                    if (j5 >= j4 || this.A.b0(k80Var, 8192L) == -1) {
                        break;
                    }
                    j3 = Math.max(j3, j5);
                    b = b2;
                    j2 = j4;
                }
                return -1L;
            }
            i.f(lb1.h(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        i.m("closed");
        return 0L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.L;
    }

    public final boolean k(long j, da0 da0Var) {
        long a;
        boolean z;
        boolean z2;
        long j2;
        da0Var.getClass();
        int d = da0Var.d();
        if (!this.L) {
            if (d < 0 || j < 0 || d > da0Var.d()) {
                return false;
            }
            if (d == 0) {
                return true;
            }
            long j3 = 1;
            long j4 = j + 1;
            long j5 = d;
            hf.D(da0Var.d(), 0L, j5);
            if (!this.L) {
                long j6 = j;
                loop0: while (true) {
                    k80 k80Var = this.B;
                    a = b.a(k80Var, da0Var, j6, j4, d);
                    if (a != -1) {
                        z = false;
                        z2 = true;
                        break;
                    }
                    long j7 = k80Var.B;
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
                        int min = ((int) Math.min(j5, (k80Var.B - j6) + j3)) - 1;
                        if (max > min) {
                            break;
                        }
                        while (true) {
                            j2 = j4;
                            if (!k80Var.F(min, k80Var.B - min, da0Var)) {
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
                    if (this.A.b0(k80Var, 8192L) == -1) {
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
            i.m("closed");
            return false;
        }
        i.m("closed");
        return false;
    }

    @Override // defpackage.z80
    public final da0 l(long j) {
        g0(j);
        return this.B.l(j);
    }

    public final int n() {
        g0(4L);
        int readInt = this.B.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // defpackage.z80
    public final byte[] q() {
        in6 in6Var = this.A;
        k80 k80Var = this.B;
        k80Var.m0(in6Var);
        return k80Var.N(k80Var.B);
    }

    public final long r() {
        g0(8L);
        long readLong = this.B.readLong();
        return ((readLong & 255) << 56) | (((-72057594037927936L) & readLong) >>> 56) | ((71776119061217280L & readLong) >>> 40) | ((280375465082880L & readLong) >>> 24) | ((1095216660480L & readLong) >>> 8) | ((4278190080L & readLong) << 8) | ((16711680 & readLong) << 24) | ((65280 & readLong) << 40);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        k80 k80Var = this.B;
        if (k80Var.B == 0 && this.A.b0(k80Var, 8192L) == -1) {
            return -1;
        }
        return k80Var.read(byteBuffer);
    }

    @Override // defpackage.z80
    public final byte readByte() {
        g0(1L);
        return this.B.readByte();
    }

    @Override // defpackage.z80
    public final void readFully(byte[] bArr) {
        k80 k80Var = this.B;
        bArr.getClass();
        try {
            g0(bArr.length);
            k80Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = k80Var.B;
                if (j > 0) {
                    int read = k80Var.read(bArr, i, (int) j);
                    if (read != -1) {
                        i += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.z80
    public final int readInt() {
        g0(4L);
        return this.B.readInt();
    }

    @Override // defpackage.z80
    public final long readLong() {
        g0(8L);
        return this.B.readLong();
    }

    @Override // defpackage.z80
    public final short readShort() {
        g0(2L);
        return this.B.readShort();
    }

    @Override // defpackage.z80
    public final void skip(long j) {
        if (!this.L) {
            while (j > 0) {
                k80 k80Var = this.B;
                if (k80Var.B == 0 && this.A.b0(k80Var, 8192L) == -1) {
                    i.n();
                    return;
                }
                long min = Math.min(j, k80Var.B);
                k80Var.skip(min);
                j -= min;
            }
            return;
        }
        i.m("closed");
    }

    @Override // defpackage.z80
    public final int t(eo4 eo4Var) {
        eo4Var.getClass();
        if (!this.L) {
            while (true) {
                k80 k80Var = this.B;
                int d = b.d(k80Var, eo4Var, true);
                if (d != -2) {
                    if (d != -1) {
                        k80Var.skip(eo4Var.A[d].d());
                        return d;
                    }
                } else if (this.A.b0(k80Var, 8192L) == -1) {
                    break;
                }
            }
            return -1;
        }
        i.m("closed");
        return 0;
    }

    public final String toString() {
        return "buffer(" + this.A + ')';
    }

    public final short u() {
        g0(2L);
        return this.B.Z();
    }

    public final String v(long j) {
        g0(j);
        return this.B.a0(j, qm0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [k80, java.lang.Object] */
    @Override // defpackage.z80
    public final String y(long j) {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long h = h((byte) 10, 0L, j2);
            int i = (h > (-1L) ? 1 : (h == (-1L) ? 0 : -1));
            k80 k80Var = this.B;
            if (i != 0) {
                return b.c(k80Var, h);
            }
            if (j2 < Long.MAX_VALUE && T(j2) && k80Var.v(j2 - 1) == 13 && T(j2 + 1) && k80Var.v(j2) == 10) {
                return b.c(k80Var, j2);
            }
            ?? obj = new Object();
            k80Var.n(obj, 0L, Math.min(32L, k80Var.B));
            throw new EOFException("\\n not found: limit=" + Math.min(k80Var.B, j) + " content=" + obj.l(obj.B).e() + (char) 8230);
        }
        i.f(lb1.h(j, "limit < 0: "));
        return null;
    }
}
