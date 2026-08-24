package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cv2  reason: default package */
/* loaded from: classes.dex */
public final class cv2 implements in6 {
    public byte A;
    public final fe5 B;
    public final Inflater L;
    public final h53 R;
    public final CRC32 X;

    public cv2(z80 z80Var) {
        z80Var.getClass();
        fe5 fe5Var = new fe5(z80Var);
        this.B = fe5Var;
        Inflater inflater = new Inflater(true);
        this.L = inflater;
        this.R = new h53(fe5Var, inflater);
        this.X = new CRC32();
    }

    public static void e(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        StringBuilder r = i61.r(str, ": actual 0x");
        r.append(qs6.B0(8, hf.t0(i2)));
        r.append(" != expected 0x");
        r.append(qs6.B0(8, hf.t0(i)));
        throw new IOException(r.toString());
    }

    @Override // defpackage.in6
    public final b67 b() {
        return this.B.A.b();
    }

    @Override // defpackage.in6
    public final long b0(k80 k80Var, long j) {
        boolean z;
        cv2 cv2Var = this;
        k80Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return 0L;
            }
            byte b = cv2Var.A;
            CRC32 crc32 = cv2Var.X;
            fe5 fe5Var = cv2Var.B;
            if (b == 0) {
                fe5Var.g0(10L);
                k80 k80Var2 = fe5Var.B;
                byte v = k80Var2.v(3L);
                if (((v >> 1) & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    cv2Var.h(k80Var2, 0L, 10L);
                }
                e(8075, fe5Var.readShort(), "ID1ID2");
                fe5Var.skip(8L);
                if (((v >> 2) & 1) == 1) {
                    fe5Var.g0(2L);
                    if (z) {
                        h(k80Var2, 0L, 2L);
                    }
                    long Z = k80Var2.Z() & 65535;
                    fe5Var.g0(Z);
                    if (z) {
                        h(k80Var2, 0L, Z);
                    }
                    fe5Var.skip(Z);
                }
                if (((v >> 3) & 1) == 1) {
                    long h = fe5Var.h((byte) 0, 0L, Long.MAX_VALUE);
                    if (h != -1) {
                        if (z) {
                            h(k80Var2, 0L, h + 1);
                        }
                        fe5Var.skip(h + 1);
                    } else {
                        i.n();
                        return 0L;
                    }
                }
                if (((v >> 4) & 1) == 1) {
                    long h2 = fe5Var.h((byte) 0, 0L, Long.MAX_VALUE);
                    if (h2 != -1) {
                        if (z) {
                            cv2Var = this;
                            cv2Var.h(k80Var2, 0L, h2 + 1);
                        } else {
                            cv2Var = this;
                        }
                        fe5Var.skip(h2 + 1);
                    } else {
                        i.n();
                        return 0L;
                    }
                } else {
                    cv2Var = this;
                }
                if (z) {
                    e(fe5Var.u(), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                cv2Var.A = (byte) 1;
            }
            if (cv2Var.A == 1) {
                long j2 = k80Var.B;
                long b0 = cv2Var.R.b0(k80Var, j);
                if (b0 != -1) {
                    cv2Var.h(k80Var, j2, b0);
                    return b0;
                }
                cv2Var.A = (byte) 2;
            }
            if (cv2Var.A == 2) {
                e(fe5Var.n(), (int) crc32.getValue(), "CRC");
                e(fe5Var.n(), (int) cv2Var.L.getBytesWritten(), "ISIZE");
                cv2Var.A = (byte) 3;
                if (!fe5Var.e()) {
                    e41.i("gzip finished without exhausting source");
                    return 0L;
                }
            }
            return -1L;
        }
        i.f(lb1.h(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.R.close();
    }

    public final void h(k80 k80Var, long j, long j2) {
        int i;
        o96 o96Var = k80Var.A;
        o96Var.getClass();
        while (true) {
            int i2 = o96Var.c;
            int i3 = o96Var.b;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            o96Var = o96Var.f;
            o96Var.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(o96Var.c - i, j2);
            this.X.update(o96Var.a, (int) (o96Var.b + j), min);
            j2 -= min;
            o96Var = o96Var.f;
            o96Var.getClass();
            j = 0;
        }
    }
}
