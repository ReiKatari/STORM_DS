package defpackage;

import com.github.junrar.unpack.vm.VMCmdFlags;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tz2  reason: default package */
/* loaded from: classes.dex */
public final class tz2 implements Closeable {
    public static final Logger R;
    public final z80 A;
    public final sz2 B;
    public final vy2 L;

    static {
        Logger logger = Logger.getLogger(iz2.class.getName());
        logger.getClass();
        R = logger;
    }

    public tz2(fe5 fe5Var) {
        fe5Var.getClass();
        this.A = fe5Var;
        sz2 sz2Var = new sz2(fe5Var);
        this.B = sz2Var;
        this.L = new vy2(sz2Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    public final boolean e(boolean z, i5 i5Var) {
        int o;
        int readInt;
        Object[] array;
        int i = 0;
        try {
            this.A.g0(9L);
            o = yy7.o(this.A);
        } catch (EOFException unused) {
        }
        if (o <= 16384) {
            int readByte = this.A.readByte() & 255;
            byte readByte2 = this.A.readByte();
            int i2 = readByte2 & 255;
            int readInt2 = this.A.readInt();
            int i3 = Integer.MAX_VALUE & readInt2;
            if (readByte != 8) {
                Logger logger = R;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(iz2.b(true, i3, o, readByte, i2));
                }
            }
            if (z && readByte != 4) {
                e41.x(iz2.a(readByte), "Expected a SETTINGS frame but was ");
                return false;
            }
            a62 a62Var = null;
            switch (readByte) {
                case 0:
                    h(i5Var, o, i2, i3);
                    return true;
                case 1:
                    n(i5Var, o, i2, i3);
                    return true;
                case 2:
                    if (o == 5) {
                        if (i3 != 0) {
                            z80 z80Var = this.A;
                            z80Var.readInt();
                            z80Var.readByte();
                            return true;
                        }
                        e41.i("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    e41.i(lb1.k("TYPE_PRIORITY length: ", o, " != 5"));
                    return false;
                case 3:
                    if (o == 4) {
                        if (i3 != 0) {
                            int readInt3 = this.A.readInt();
                            a62.Companion.getClass();
                            a62[] values = a62.values();
                            int length = values.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 < length) {
                                    a62 a62Var2 = values[i4];
                                    if (a62Var2.getHttpCode() == readInt3) {
                                        a62Var = a62Var2;
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                            if (a62Var != null) {
                                qz2 qz2Var = (qz2) i5Var.L;
                                if (i3 != 0 && (readInt2 & 1) == 0) {
                                    pz6.b(qz2Var.e0, qz2Var.L + '[' + i3 + "] onReset", 0L, new mz2(qz2Var, i3, a62Var), 6);
                                    return true;
                                }
                                xz2 k = qz2Var.k(i3);
                                if (k != null) {
                                    synchronized (k) {
                                        if (k.f() == null) {
                                            k.h0 = a62Var;
                                            k.notifyAll();
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                e41.i(lb1.g(readInt3, "TYPE_RST_STREAM unexpected error code: "));
                                return false;
                            }
                        } else {
                            e41.i("TYPE_RST_STREAM streamId == 0");
                            return false;
                        }
                    } else {
                        e41.i(lb1.k("TYPE_RST_STREAM length: ", o, " != 4"));
                        return false;
                    }
                    break;
                case 4:
                    z80 z80Var2 = this.A;
                    if (i3 == 0) {
                        if ((readByte2 & 1) != 0) {
                            if (o != 0) {
                                e41.i("FRAME_SIZE_ERROR ack frame should be empty!");
                                return false;
                            }
                        } else if (o % 6 == 0) {
                            fd6 fd6Var = new fd6();
                            j93 P = gi2.P(6, gi2.R(0, o));
                            int i5 = P.A;
                            int i6 = P.B;
                            int i7 = P.L;
                            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                                while (true) {
                                    short readShort = z80Var2.readShort();
                                    byte[] bArr = yy7.a;
                                    int i8 = readShort & 65535;
                                    readInt = z80Var2.readInt();
                                    if (i8 != 2) {
                                        if (i8 != 4) {
                                            if (i8 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                            }
                                        } else if (readInt < 0) {
                                            e41.i("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                            return false;
                                        }
                                    } else if (readInt != 0 && readInt != 1) {
                                        e41.i("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        return false;
                                    }
                                    fd6Var.b(i8, readInt);
                                    if (i5 != i6) {
                                        i5 += i7;
                                    }
                                }
                                e41.i(lb1.g(readInt, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                return false;
                            }
                            qz2 qz2Var2 = (qz2) i5Var.L;
                            pz6.b(qz2Var2.d0, i61.n(new StringBuilder(), qz2Var2.L, " applyAndAckSettings"), 0L, new ci2(4, i5Var, fd6Var), 6);
                            return true;
                        } else {
                            e41.i(lb1.g(o, "TYPE_SETTINGS length % 6 != 0: "));
                            return false;
                        }
                    } else {
                        e41.i("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    break;
                case 5:
                    r(i5Var, o, i2, i3);
                    return true;
                case 6:
                    if (o == 8) {
                        if (i3 == 0) {
                            final int readInt4 = this.A.readInt();
                            final int readInt5 = this.A.readInt();
                            if ((readByte2 & 1) != 0) {
                                i = 1;
                            }
                            qz2 qz2Var3 = (qz2) i5Var.L;
                            if (i != 0) {
                                synchronized (qz2Var3) {
                                    try {
                                        if (readInt4 != 1) {
                                            if (readInt4 != 2) {
                                                if (readInt4 == 3) {
                                                    qz2Var3.notifyAll();
                                                }
                                            } else {
                                                qz2Var3.j0++;
                                            }
                                        } else {
                                            qz2Var3.h0++;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                return true;
                            }
                            pz6 pz6Var = qz2Var3.d0;
                            String n = i61.n(new StringBuilder(), ((qz2) i5Var.L).L, " ping");
                            final qz2 qz2Var4 = (qz2) i5Var.L;
                            pz6.b(pz6Var, n, 0L, new on2() { // from class: pz2
                                @Override // defpackage.on2
                                public final Object c() {
                                    qz2 qz2Var5 = qz2.this;
                                    try {
                                        qz2Var5.s0.u(readInt4, true, readInt5);
                                    } catch (IOException e) {
                                        a62 a62Var3 = a62.PROTOCOL_ERROR;
                                        qz2Var5.e(a62Var3, a62Var3, e);
                                    }
                                    return jg7.a;
                                }
                            }, 6);
                            return true;
                        }
                        e41.i("TYPE_PING streamId != 0");
                        return false;
                    }
                    e41.i(lb1.g(o, "TYPE_PING length != 8: "));
                    return false;
                case 7:
                    if (o >= 8) {
                        if (i3 == 0) {
                            int readInt6 = this.A.readInt();
                            int readInt7 = this.A.readInt();
                            int i9 = o - 8;
                            a62.Companion.getClass();
                            a62[] values2 = a62.values();
                            int length2 = values2.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 < length2) {
                                    a62 a62Var3 = values2[i10];
                                    if (a62Var3.getHttpCode() == readInt7) {
                                        a62Var = a62Var3;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                            if (a62Var != null) {
                                da0 da0Var = da0.R;
                                if (i9 > 0) {
                                    da0Var = this.A.l(i9);
                                }
                                da0Var.getClass();
                                da0Var.d();
                                qz2 qz2Var5 = (qz2) i5Var.L;
                                synchronized (qz2Var5) {
                                    array = qz2Var5.B.values().toArray(new xz2[0]);
                                    qz2Var5.Y = true;
                                }
                                xz2[] xz2VarArr = (xz2[]) array;
                                int length3 = xz2VarArr.length;
                                while (i < length3) {
                                    xz2 xz2Var = xz2VarArr[i];
                                    if (xz2Var.A > readInt6 && xz2Var.g()) {
                                        a62 a62Var4 = a62.REFUSED_STREAM;
                                        a62Var4.getClass();
                                        synchronized (xz2Var) {
                                            if (xz2Var.f() == null) {
                                                xz2Var.h0 = a62Var4;
                                                xz2Var.notifyAll();
                                            }
                                        }
                                        ((qz2) i5Var.L).k(xz2Var.A);
                                    }
                                    i++;
                                }
                                break;
                            } else {
                                e41.i(lb1.g(readInt7, "TYPE_GOAWAY unexpected error code: "));
                                return false;
                            }
                        } else {
                            e41.i("TYPE_GOAWAY streamId != 0");
                            return false;
                        }
                    } else {
                        e41.i(lb1.g(o, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                case 8:
                    try {
                        if (o == 4) {
                            long readInt8 = this.A.readInt() & 2147483647L;
                            int i11 = (readInt8 > 0L ? 1 : (readInt8 == 0L ? 0 : -1));
                            if (i11 != 0) {
                                Logger logger2 = R;
                                if (logger2.isLoggable(Level.FINE)) {
                                    logger2.fine(iz2.c(true, i3, o, readInt8));
                                }
                                qz2 qz2Var6 = (qz2) i5Var.L;
                                if (i3 == 0) {
                                    synchronized (qz2Var6) {
                                        qz2Var6.q0 += readInt8;
                                        qz2Var6.notifyAll();
                                    }
                                    return true;
                                }
                                xz2 h = qz2Var6.h(i3);
                                if (h != null) {
                                    synchronized (h) {
                                        h.X += readInt8;
                                        if (i11 > 0) {
                                            h.notifyAll();
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                throw new IOException("windowSizeIncrement was 0");
                            }
                        } else {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + o);
                        }
                    } catch (Exception e) {
                        R.fine(iz2.b(true, i3, o, 8, i2));
                        throw e;
                    }
                    break;
                default:
                    this.A.skip(o);
                    return true;
            }
            return true;
        }
        e41.i(lb1.g(o, "FRAME_SIZE_ERROR: "));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17, types: [k80, java.lang.Object] */
    public final void h(i5 i5Var, int i, int i2, final int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (i3 != 0) {
            final boolean z6 = true;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = true;
                z6 = false;
            }
            if ((i2 & 32) == 0) {
                if ((i2 & 8) != 0) {
                    byte readByte = this.A.readByte();
                    byte[] bArr = yy7.a;
                    i4 = readByte & 255;
                } else {
                    i4 = 0;
                }
                final int G = hi2.G(i, i2, i4);
                z80 z80Var = this.A;
                z80Var.getClass();
                final qz2 qz2Var = (qz2) i5Var.L;
                if (i3 != 0 && (i3 & 1) == 0) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                if (z2) {
                    final ?? obj = new Object();
                    long j = G;
                    z80Var.g0(j);
                    z80Var.b0(obj, j);
                    pz6.b(qz2Var.e0, qz2Var.L + '[' + i3 + "] onData", 0L, new on2(i3, obj, G, z6) { // from class: kz2
                        public final /* synthetic */ int B;
                        public final /* synthetic */ k80 L;
                        public final /* synthetic */ int R;

                        @Override // defpackage.on2
                        public final Object c() {
                            qz2 qz2Var2 = qz2.this;
                            int i5 = this.B;
                            k80 k80Var = this.L;
                            int i6 = this.R;
                            try {
                                qz2Var2.g0.getClass();
                                k80Var.skip(i6);
                                qz2Var2.s0.v(i5, a62.CANCEL);
                                synchronized (qz2Var2) {
                                    qz2Var2.u0.remove(Integer.valueOf(i5));
                                }
                            } catch (IOException unused) {
                            }
                            return jg7.a;
                        }
                    }, 6);
                } else {
                    xz2 h = qz2Var.h(i3);
                    if (h == null) {
                        ((qz2) i5Var.L).v(i3, a62.PROTOCOL_ERROR);
                        long j2 = G;
                        ((qz2) i5Var.L).r(j2);
                        z80Var.skip(j2);
                    } else {
                        TimeZone timeZone = az7.a;
                        vz2 vz2Var = h.d0;
                        long j3 = G;
                        vz2Var.getClass();
                        long j4 = j3;
                        while (true) {
                            int i5 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                            xz2 xz2Var = vz2Var.Y;
                            if (i5 > 0) {
                                synchronized (xz2Var) {
                                    z3 = vz2Var.B;
                                    if (vz2Var.R.B + j4 > vz2Var.A) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                }
                                if (z4) {
                                    z80Var.skip(j4);
                                    vz2Var.Y.e(a62.FLOW_CONTROL_ERROR);
                                    break;
                                } else if (z3) {
                                    z80Var.skip(j4);
                                    break;
                                } else {
                                    long b0 = z80Var.b0(vz2Var.L, j4);
                                    if (b0 != -1) {
                                        j4 -= b0;
                                        xz2 xz2Var2 = vz2Var.Y;
                                        synchronized (xz2Var2) {
                                            try {
                                                if (vz2Var.X) {
                                                    vz2Var.L.e();
                                                } else {
                                                    k80 k80Var = vz2Var.R;
                                                    if (k80Var.B == 0) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    k80Var.m0(vz2Var.L);
                                                    if (z5) {
                                                        xz2Var2.notifyAll();
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    } else {
                                        i.n();
                                        return;
                                    }
                                }
                            } else {
                                TimeZone timeZone2 = az7.a;
                                xz2Var.B.r(j3);
                                vz2Var.Y.B.l0.getClass();
                                break;
                            }
                        }
                        if (z6) {
                            h.i(yw2.B, true);
                        }
                    }
                }
                this.A.skip(i4);
                return;
            }
            e41.i("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        e41.i("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    public final List k(int i, int i2, int i3, int i4) {
        sz2 sz2Var = this.B;
        sz2Var.X = i;
        sz2Var.B = i;
        sz2Var.Y = i2;
        sz2Var.L = i3;
        sz2Var.R = i4;
        vy2 vy2Var = this.L;
        fe5 fe5Var = vy2Var.c;
        ArrayList arrayList = vy2Var.b;
        while (!fe5Var.e()) {
            byte readByte = fe5Var.readByte();
            byte[] bArr = yy7.a;
            int i5 = readByte & 255;
            if (i5 != 128) {
                if ((readByte & 128) == 128) {
                    int e = vy2Var.e(i5, 127);
                    int i6 = e - 1;
                    if (i6 >= 0) {
                        uw2[] uw2VarArr = xy2.a;
                        if (i6 <= uw2VarArr.length - 1) {
                            arrayList.add(uw2VarArr[i6]);
                        }
                    }
                    int length = vy2Var.e + 1 + (i6 - xy2.a.length);
                    if (length >= 0) {
                        uw2[] uw2VarArr2 = vy2Var.d;
                        if (length < uw2VarArr2.length) {
                            uw2 uw2Var = uw2VarArr2[length];
                            uw2Var.getClass();
                            arrayList.add(uw2Var);
                        }
                    }
                    e41.i(lb1.g(e, "Header index too large "));
                    return null;
                } else if (i5 == 64) {
                    uw2[] uw2VarArr3 = xy2.a;
                    da0 d = vy2Var.d();
                    xy2.a(d);
                    vy2Var.c(new uw2(d, vy2Var.d()));
                } else if ((readByte & VMCmdFlags.VMCF_CHFLAGS) == 64) {
                    vy2Var.c(new uw2(vy2Var.b(vy2Var.e(i5, 63) - 1), vy2Var.d()));
                } else if ((readByte & VMCmdFlags.VMCF_USEFLAGS) == 32) {
                    int e2 = vy2Var.e(i5, 31);
                    vy2Var.a = e2;
                    if (e2 >= 0 && e2 <= 4096) {
                        int i7 = vy2Var.g;
                        if (e2 < i7) {
                            if (e2 == 0) {
                                fv.z0(0, r6.length, null, vy2Var.d);
                                vy2Var.e = vy2Var.d.length - 1;
                                vy2Var.f = 0;
                                vy2Var.g = 0;
                            } else {
                                vy2Var.a(i7 - e2);
                            }
                        }
                    } else {
                        throw new IOException("Invalid dynamic table size update " + vy2Var.a);
                    }
                } else if (i5 != 16 && i5 != 0) {
                    arrayList.add(new uw2(vy2Var.b(vy2Var.e(i5, 15) - 1), vy2Var.d()));
                } else {
                    uw2[] uw2VarArr4 = xy2.a;
                    da0 d2 = vy2Var.d();
                    xy2.a(d2);
                    arrayList.add(new uw2(d2, vy2Var.d()));
                }
            } else {
                e41.i("index == 0");
                return null;
            }
        }
        List k1 = gt0.k1(arrayList);
        arrayList.clear();
        return k1;
    }

    public final void n(i5 i5Var, int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        qz2 qz2Var;
        if (i3 != 0) {
            boolean z2 = false;
            boolean z3 = true;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if ((i2 & 8) != 0) {
                byte readByte = this.A.readByte();
                byte[] bArr = yy7.a;
                i4 = readByte & 255;
            } else {
                i4 = 0;
            }
            if ((i2 & 32) != 0) {
                z80 z80Var = this.A;
                z80Var.readInt();
                z80Var.readByte();
                byte[] bArr2 = yy7.a;
                i5 = i - 5;
            } else {
                i5 = i;
            }
            List k = k(hi2.G(i5, i2, i4), i4, i2, i3);
            qz2 qz2Var2 = (qz2) i5Var.L;
            if (i3 != 0 && (i3 & 1) == 0) {
                z2 = z;
            }
            if (z2) {
                pz6.b(qz2Var2.e0, qz2Var2.L + '[' + i3 + "] onHeaders", 0L, new lz2(qz2Var2, i3, k, z3), 6);
                return;
            }
            synchronized (qz2Var2) {
                try {
                    xz2 h = qz2Var2.h(i3);
                    if (h == null) {
                        if (qz2Var2.Y) {
                            return;
                        }
                        if (i3 <= qz2Var2.R) {
                            return;
                        }
                        if (i3 % 2 == qz2Var2.X % 2) {
                            return;
                        }
                        qz2Var = qz2Var2;
                        try {
                            xz2 xz2Var = new xz2(i3, qz2Var, false, z3, az7.h(k));
                            qz2Var.R = i3;
                            qz2Var.B.put(Integer.valueOf(i3), xz2Var);
                            pz6.b(qz2Var.Z.d(), qz2Var.L + '[' + i3 + "] onStream", 0L, new ci2(3, qz2Var, xz2Var), 6);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            throw th2;
                        }
                    }
                    h.i(az7.h(k), z3);
                } catch (Throwable th3) {
                    th = th3;
                    qz2Var = qz2Var2;
                }
            }
        } else {
            e41.i("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
    }

    public final void r(i5 i5Var, int i, int i2, int i3) {
        int i4;
        if (i3 != 0) {
            if ((i2 & 8) != 0) {
                byte readByte = this.A.readByte();
                byte[] bArr = yy7.a;
                i4 = readByte & 255;
            } else {
                i4 = 0;
            }
            int readInt = this.A.readInt() & Integer.MAX_VALUE;
            List k = k(hi2.G(i - 4, i2, i4), i4, i2, i3);
            qz2 qz2Var = (qz2) i5Var.L;
            synchronized (qz2Var) {
                if (qz2Var.u0.contains(Integer.valueOf(readInt))) {
                    qz2Var.v(readInt, a62.PROTOCOL_ERROR);
                    return;
                }
                qz2Var.u0.add(Integer.valueOf(readInt));
                pz6 pz6Var = qz2Var.e0;
                pz6.b(pz6Var, qz2Var.L + '[' + readInt + "] onRequest", 0L, new lz2(qz2Var, readInt, k), 6);
                return;
            }
        }
        e41.i("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
}
