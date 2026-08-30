package fj;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p implements g0 {
    public byte A;
    public final a0 B;
    public final Inflater L;
    public final q R;
    public final CRC32 X;

    public p(g gVar) {
        gVar.getClass();
        a0 a0Var = new a0(gVar);
        this.B = a0Var;
        Inflater inflater = new Inflater(true);
        this.L = inflater;
        this.R = new q(a0Var, inflater);
        this.X = new CRC32();
    }

    public static void d(int i2, int i10, String str) {
        if (i10 == i2) {
            return;
        }
        String o02 = vc.h.o0(8, d0.d.i0(i10));
        String o03 = vc.h.o0(8, d0.d.i0(i2));
        throw new IOException(str + ": actual 0x" + o02 + " != expected 0x" + o03);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.R.close();
    }

    @Override // fj.g0
    public final i0 f() {
        return this.B.A.f();
    }

    public final void i(e eVar, long j2, long j10) {
        int i2;
        b0 b0Var = eVar.A;
        b0Var.getClass();
        while (true) {
            int i10 = b0Var.f4978c;
            int i11 = b0Var.f4977b;
            if (j2 < i10 - i11) {
                break;
            }
            j2 -= i10 - i11;
            b0Var = b0Var.f4981f;
            b0Var.getClass();
        }
        while (j10 > 0) {
            int min = (int) Math.min(b0Var.f4978c - i2, j10);
            this.X.update(b0Var.f4976a, (int) (b0Var.f4977b + j2), min);
            j10 -= min;
            b0Var = b0Var.f4981f;
            b0Var.getClass();
            j2 = 0;
        }
    }

    @Override // fj.g0
    public final long k(e eVar, long j2) {
        boolean z10;
        p pVar = this;
        eVar.getClass();
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 >= 0) {
            if (i2 == 0) {
                return 0L;
            }
            byte b10 = pVar.A;
            CRC32 crc32 = pVar.X;
            a0 a0Var = pVar.B;
            if (b10 == 0) {
                a0Var.O(10L);
                e eVar2 = a0Var.B;
                byte B = eVar2.B(3L);
                if (((B >> 1) & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    pVar.i(eVar2, 0L, 10L);
                }
                d(8075, a0Var.readShort(), "ID1ID2");
                a0Var.skip(8L);
                if (((B >> 2) & 1) == 1) {
                    a0Var.O(2L);
                    if (z10) {
                        i(eVar2, 0L, 2L);
                    }
                    long L = eVar2.L() & 65535;
                    a0Var.O(L);
                    if (z10) {
                        i(eVar2, 0L, L);
                    }
                    a0Var.skip(L);
                }
                if (((B >> 3) & 1) == 1) {
                    long i10 = a0Var.i((byte) 0, 0L, Long.MAX_VALUE);
                    if (i10 != -1) {
                        if (z10) {
                            i(eVar2, 0L, i10 + 1);
                        }
                        a0Var.skip(i10 + 1);
                    } else {
                        a0.j.c();
                        return 0L;
                    }
                }
                if (((B >> 4) & 1) == 1) {
                    long i11 = a0Var.i((byte) 0, 0L, Long.MAX_VALUE);
                    if (i11 != -1) {
                        if (z10) {
                            pVar = this;
                            pVar.i(eVar2, 0L, i11 + 1);
                        } else {
                            pVar = this;
                        }
                        a0Var.skip(i11 + 1);
                    } else {
                        a0.j.c();
                        return 0L;
                    }
                } else {
                    pVar = this;
                }
                if (z10) {
                    d(a0Var.w(), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                pVar.A = (byte) 1;
            }
            if (pVar.A == 1) {
                long j10 = eVar.B;
                long k10 = pVar.R.k(eVar, j2);
                if (k10 != -1) {
                    pVar.i(eVar, j10, k10);
                    return k10;
                }
                pVar.A = (byte) 2;
            }
            if (pVar.A == 2) {
                d(a0Var.t(), (int) crc32.getValue(), "CRC");
                d(a0Var.t(), (int) pVar.L.getBytesWritten(), "ISIZE");
                pVar.A = (byte) 3;
                if (!a0Var.d()) {
                    j.h("gzip finished without exhausting source");
                    return 0L;
                }
            }
            return -1L;
        }
        a0.j.e(kc.a.e(j2, "byteCount < 0: "));
        return 0L;
    }
}
