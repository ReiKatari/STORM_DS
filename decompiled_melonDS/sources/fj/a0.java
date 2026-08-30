package fj;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 implements g {
    public final g0 A;
    public final e B;
    public boolean L;

    /* JADX WARN: Type inference failed for: r1v1, types: [fj.e, java.lang.Object] */
    public a0(g0 g0Var) {
        g0Var.getClass();
        this.A = g0Var;
        this.B = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [fj.e, java.lang.Object] */
    @Override // fj.g
    public final String D(long j2) {
        long j10;
        if (j2 >= 0) {
            if (j2 == Long.MAX_VALUE) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j2 + 1;
            }
            long i2 = i((byte) 10, 0L, j10);
            int i10 = (i2 > (-1L) ? 1 : (i2 == (-1L) ? 0 : -1));
            e eVar = this.B;
            if (i10 != 0) {
                return gj.a.c(eVar, i2);
            }
            if (j10 < Long.MAX_VALUE && s(j10) && eVar.B(j10 - 1) == 13 && s(j10 + 1) && eVar.B(j10) == 10) {
                return gj.a.c(eVar, j10);
            }
            ?? obj = new Object();
            eVar.w(obj, 0L, Math.min(32, eVar.B));
            throw new EOFException("\\n not found: limit=" + Math.min(eVar.B, j2) + " content=" + obj.o(obj.B).e() + (char) 8230);
        }
        a0.j.e(kc.a.e(j2, "limit < 0: "));
        return null;
    }

    @Override // fj.g
    public final void O(long j2) {
        if (s(j2)) {
            return;
        }
        a0.j.c();
    }

    @Override // fj.g
    public final String S(Charset charset) {
        charset.getClass();
        g0 g0Var = this.A;
        e eVar = this.B;
        eVar.d0(g0Var);
        return eVar.X(eVar.B, charset);
    }

    @Override // fj.g
    public final InputStream U() {
        return new d(this, 1);
    }

    @Override // fj.g
    public final int V(v vVar) {
        vVar.getClass();
        if (!this.L) {
            while (true) {
                e eVar = this.B;
                int d4 = gj.a.d(eVar, vVar, true);
                if (d4 != -2) {
                    if (d4 != -1) {
                        eVar.skip(vVar.A[d4].d());
                        return d4;
                    }
                } else if (this.A.k(eVar, 8192L) == -1) {
                    break;
                }
            }
            return -1;
        }
        a0.j.p("closed");
        return 0;
    }

    @Override // fj.g
    public final long W(f fVar) {
        e eVar;
        long j2 = 0;
        while (true) {
            g0 g0Var = this.A;
            eVar = this.B;
            if (g0Var.k(eVar, 8192L) == -1) {
                break;
            }
            long v10 = eVar.v();
            if (v10 > 0) {
                j2 += v10;
                fVar.A(eVar, v10);
            }
        }
        long j10 = eVar.B;
        if (j10 > 0) {
            long j11 = j2 + j10;
            fVar.A(eVar, j10);
            return j11;
        }
        return j2;
    }

    @Override // fj.g
    public final e b() {
        return this.B;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.L) {
            this.L = true;
            this.A.close();
            this.B.t();
        }
    }

    public final boolean d() {
        if (!this.L) {
            e eVar = this.B;
            if (eVar.z() && this.A.k(eVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        a0.j.p("closed");
        return false;
    }

    @Override // fj.g0
    public final i0 f() {
        return this.A.f();
    }

    public final long i(byte b10, long j2, long j10) {
        if (!this.L) {
            if (0 <= j10) {
                long j11 = 0;
                while (j11 < j10) {
                    e eVar = this.B;
                    byte b11 = b10;
                    long j12 = j10;
                    long F = eVar.F(b11, j11, j12);
                    if (F != -1) {
                        return F;
                    }
                    long j13 = eVar.B;
                    if (j13 >= j12 || this.A.k(eVar, 8192L) == -1) {
                        break;
                    }
                    j11 = Math.max(j11, j13);
                    b10 = b11;
                    j10 = j12;
                }
                return -1L;
            }
            a0.j.e(kc.a.e(j10, "fromIndex=0 toIndex="));
            return 0L;
        }
        a0.j.p("closed");
        return 0L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.L;
    }

    @Override // fj.g0
    public final long k(e eVar, long j2) {
        eVar.getClass();
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 >= 0) {
            if (!this.L) {
                e eVar2 = this.B;
                if (eVar2.B == 0) {
                    if (i2 == 0) {
                        return 0L;
                    }
                    if (this.A.k(eVar2, 8192L) == -1) {
                        return -1L;
                    }
                }
                return eVar2.k(eVar, Math.min(j2, eVar2.B));
            }
            a0.j.p("closed");
            return 0L;
        }
        a0.j.e(kc.a.e(j2, "byteCount < 0: "));
        return 0L;
    }

    public final boolean m(long j2, h hVar) {
        long a10;
        boolean z10;
        boolean z11;
        long j10;
        hVar.getClass();
        int d4 = hVar.d();
        if (!this.L) {
            boolean z12 = false;
            if (d4 < 0 || j2 < 0 || d4 > hVar.d()) {
                return false;
            }
            if (d4 == 0) {
                return true;
            }
            long j11 = 1;
            long j12 = j2 + 1;
            long j13 = d4;
            d0.d.K(hVar.d(), 0, j13);
            if (!this.L) {
                long j14 = j2;
                loop0: while (true) {
                    e eVar = this.B;
                    a10 = gj.a.a(eVar, hVar, j14, j12, d4);
                    if (a10 != -1) {
                        z10 = z12;
                        z11 = true;
                        break;
                    }
                    long j15 = eVar.B;
                    z10 = z12;
                    z11 = true;
                    long j16 = (j15 - j13) + j11;
                    if (j16 >= j12) {
                        break;
                    }
                    if (j15 < j12) {
                        j10 = j12;
                    } else {
                        int max = (int) Math.max(j11, (j15 - j12) + j11);
                        int min = ((int) Math.min(j13, (eVar.B - j14) + j11)) - 1;
                        if (max > min) {
                            break;
                        }
                        while (true) {
                            j10 = j12;
                            if (!eVar.H(eVar.B - min, hVar, min)) {
                                if (min == max) {
                                    break loop0;
                                }
                                min--;
                                j12 = j10;
                            } else {
                                break;
                            }
                        }
                    }
                    if (this.A.k(eVar, 8192L) == -1) {
                        break;
                    }
                    j14 = Math.max(j14, j16);
                    j12 = j10;
                    z12 = z10;
                    j11 = 1;
                }
                a10 = -1;
                if (a10 != -1) {
                    return z11;
                }
                return z10;
            }
            a0.j.p("closed");
            return false;
        }
        a0.j.p("closed");
        return false;
    }

    @Override // fj.g
    public final h o(long j2) {
        O(j2);
        return this.B.o(j2);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        e eVar = this.B;
        if (eVar.B == 0 && this.A.k(eVar, 8192L) == -1) {
            return -1;
        }
        return eVar.read(byteBuffer);
    }

    @Override // fj.g
    public final byte readByte() {
        O(1L);
        return this.B.readByte();
    }

    @Override // fj.g
    public final int readInt() {
        O(4L);
        return this.B.readInt();
    }

    @Override // fj.g
    public final short readShort() {
        O(2L);
        return this.B.readShort();
    }

    @Override // fj.g
    public final boolean s(long j2) {
        e eVar;
        if (j2 >= 0) {
            if (!this.L) {
                do {
                    eVar = this.B;
                    if (eVar.B >= j2) {
                        return true;
                    }
                } while (this.A.k(eVar, 8192L) != -1);
                return false;
            }
            a0.j.p("closed");
            return false;
        }
        a0.j.e(kc.a.e(j2, "byteCount < 0: "));
        return false;
    }

    @Override // fj.g
    public final void skip(long j2) {
        if (!this.L) {
            while (j2 > 0) {
                e eVar = this.B;
                if (eVar.B == 0 && this.A.k(eVar, 8192L) == -1) {
                    a0.j.c();
                    return;
                }
                long min = Math.min(j2, eVar.B);
                eVar.skip(min);
                j2 -= min;
            }
            return;
        }
        a0.j.p("closed");
    }

    public final int t() {
        O(4L);
        int readInt = this.B.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final String toString() {
        return "buffer(" + this.A + ')';
    }

    public final long v() {
        char c4;
        char c10;
        char c11;
        char c12;
        long j2;
        O(8L);
        e eVar = this.B;
        if (eVar.B >= 8) {
            b0 b0Var = eVar.A;
            b0Var.getClass();
            int i2 = b0Var.f4977b;
            int i10 = b0Var.f4978c;
            if (i10 - i2 < 8) {
                j2 = ((eVar.readInt() & 4294967295L) << 32) | (4294967295L & eVar.readInt());
                c11 = '8';
                c12 = '\b';
                c4 = 24;
                c10 = '(';
            } else {
                byte[] bArr = b0Var.f4976a;
                c4 = 24;
                c10 = '(';
                c11 = '8';
                c12 = '\b';
                long j10 = ((bArr[i2] & 255) << 56) | ((bArr[i2 + 1] & 255) << 48) | ((bArr[i2 + 2] & 255) << 40) | ((bArr[i2 + 3] & 255) << 32) | ((bArr[i2 + 4] & 255) << 24);
                int i11 = i2 + 7;
                int i12 = i2 + 8;
                long j11 = j10 | ((bArr[i2 + 5] & 255) << 16) | ((bArr[i2 + 6] & 255) << 8) | (bArr[i11] & 255);
                eVar.B -= 8;
                if (i12 == i10) {
                    eVar.A = b0Var.a();
                    c0.a(b0Var);
                } else {
                    b0Var.f4977b = i12;
                }
                j2 = j11;
            }
            return ((j2 & 255) << c11) | (((-72057594037927936L) & j2) >>> c11) | ((71776119061217280L & j2) >>> c10) | ((280375465082880L & j2) >>> c4) | ((1095216660480L & j2) >>> c12) | ((4278190080L & j2) << c12) | ((16711680 & j2) << c4) | ((65280 & j2) << c10);
        }
        a0.j.c();
        return 0L;
    }

    public final short w() {
        O(2L);
        return this.B.L();
    }

    public final String z(long j2) {
        O(j2);
        return this.B.X(j2, vc.a.f13781a);
    }
}
