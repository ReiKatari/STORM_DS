package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ap2  reason: default package */
/* loaded from: classes.dex */
public final class ap2 implements sb6 {
    public byte A;
    public final s45 B;
    public final Inflater L;
    public final ez2 R;
    public final CRC32 X;

    public ap2(u60 u60Var) {
        u60Var.getClass();
        s45 s45Var = new s45(u60Var);
        this.B = s45Var;
        Inflater inflater = new Inflater(true);
        this.L = inflater;
        this.R = new ez2(s45Var, inflater);
        this.X = new CRC32();
    }

    public static void d(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        StringBuilder t = b31.t(str, ": actual 0x");
        t.append(zg6.H0(8, a53.T(i2)));
        t.append(" != expected 0x");
        t.append(zg6.H0(8, a53.T(i)));
        throw new IOException(t.toString());
    }

    @Override // defpackage.sb6
    public final long L(f60 f60Var, long j) {
        boolean z;
        ap2 ap2Var = this;
        f60Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return 0L;
            }
            byte b = ap2Var.A;
            CRC32 crc32 = ap2Var.X;
            s45 s45Var = ap2Var.B;
            if (b == 0) {
                s45Var.b0(10L);
                f60 f60Var2 = s45Var.B;
                byte D = f60Var2.D(3L);
                if (((D >> 1) & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ap2Var.i(f60Var2, 0L, 10L);
                }
                d(8075, s45Var.readShort(), "ID1ID2");
                s45Var.skip(8L);
                if (((D >> 2) & 1) == 1) {
                    s45Var.b0(2L);
                    if (z) {
                        i(f60Var2, 0L, 2L);
                    }
                    long R = f60Var2.R() & 65535;
                    s45Var.b0(R);
                    if (z) {
                        i(f60Var2, 0L, R);
                    }
                    s45Var.skip(R);
                }
                if (((D >> 3) & 1) == 1) {
                    long i2 = s45Var.i((byte) 0, 0L, Long.MAX_VALUE);
                    if (i2 != -1) {
                        if (z) {
                            i(f60Var2, 0L, i2 + 1);
                        }
                        s45Var.skip(i2 + 1);
                    } else {
                        i.l();
                        return 0L;
                    }
                }
                if (((D >> 4) & 1) == 1) {
                    long i3 = s45Var.i((byte) 0, 0L, Long.MAX_VALUE);
                    if (i3 != -1) {
                        if (z) {
                            ap2Var = this;
                            ap2Var.i(f60Var2, 0L, i3 + 1);
                        } else {
                            ap2Var = this;
                        }
                        s45Var.skip(i3 + 1);
                    } else {
                        i.l();
                        return 0L;
                    }
                } else {
                    ap2Var = this;
                }
                if (z) {
                    d(s45Var.B(), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                ap2Var.A = (byte) 1;
            }
            if (ap2Var.A == 1) {
                long j2 = f60Var.B;
                long L = ap2Var.R.L(f60Var, j);
                if (L != -1) {
                    ap2Var.i(f60Var, j2, L);
                    return L;
                }
                ap2Var.A = (byte) 2;
            }
            if (ap2Var.A == 2) {
                d(s45Var.w(), (int) crc32.getValue(), "CRC");
                d(s45Var.w(), (int) ap2Var.L.getBytesWritten(), "ISIZE");
                ap2Var.A = (byte) 3;
                if (!s45Var.d()) {
                    f81.j("gzip finished without exhausting source");
                    return 0L;
                }
            }
            return -1L;
        }
        i.g(wh1.h(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.R.close();
    }

    @Override // defpackage.sb6
    public final kt6 f() {
        return this.B.A.f();
    }

    public final void i(f60 f60Var, long j, long j2) {
        int i;
        cy5 cy5Var = f60Var.A;
        cy5Var.getClass();
        while (true) {
            int i2 = cy5Var.c;
            int i3 = cy5Var.b;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            cy5Var = cy5Var.f;
            cy5Var.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(cy5Var.c - i, j2);
            this.X.update(cy5Var.a, (int) (cy5Var.b + j), min);
            j2 -= min;
            cy5Var = cy5Var.f;
            cy5Var.getClass();
            j = 0;
        }
    }
}
