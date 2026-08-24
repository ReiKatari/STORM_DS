package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yz2  reason: default package */
/* loaded from: classes.dex */
public final class yz2 implements Closeable {
    public static final Logger Y = Logger.getLogger(iz2.class.getName());
    public final y80 A;
    public final k80 B;
    public int L;
    public boolean R;
    public final wy2 X;

    /* JADX WARN: Type inference failed for: r2v1, types: [k80, java.lang.Object] */
    public yz2(ee5 ee5Var) {
        ee5Var.getClass();
        this.A = ee5Var;
        ?? obj = new Object();
        this.B = obj;
        this.L = 16384;
        this.X = new wy2(obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.R = true;
            this.A.close();
        }
    }

    public final void e(fd6 fd6Var) {
        int i;
        fd6Var.getClass();
        synchronized (this) {
            try {
                if (!this.R) {
                    int i2 = this.L;
                    int i3 = fd6Var.a;
                    if ((i3 & 32) != 0) {
                        i2 = fd6Var.b[5];
                    }
                    this.L = i2;
                    int i4 = -1;
                    if ((i3 & 2) != 0) {
                        i = fd6Var.b[1];
                    } else {
                        i = -1;
                    }
                    if (i != -1) {
                        wy2 wy2Var = this.X;
                        if ((i3 & 2) != 0) {
                            i4 = fd6Var.b[1];
                        }
                        wy2Var.getClass();
                        int min = Math.min(i4, 16384);
                        int i5 = wy2Var.d;
                        if (i5 != min) {
                            if (min < i5) {
                                wy2Var.b = Math.min(wy2Var.b, min);
                            }
                            wy2Var.c = true;
                            wy2Var.d = min;
                            int i6 = wy2Var.h;
                            if (min < i6) {
                                if (min == 0) {
                                    uw2[] uw2VarArr = wy2Var.e;
                                    fv.z0(0, uw2VarArr.length, null, uw2VarArr);
                                    wy2Var.f = wy2Var.e.length - 1;
                                    wy2Var.g = 0;
                                    wy2Var.h = 0;
                                } else {
                                    wy2Var.a(i6 - min);
                                }
                            }
                        }
                    }
                    k(0, 0, 4, 1);
                    this.A.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void flush() {
        synchronized (this) {
            if (!this.R) {
                this.A.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void h(boolean z, int i, k80 k80Var, int i2) {
        synchronized (this) {
            if (!this.R) {
                k(i, i2, 0, z ? 1 : 0);
                if (i2 > 0) {
                    y80 y80Var = this.A;
                    k80Var.getClass();
                    y80Var.O(k80Var, i2);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void k(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = Y;
            if (logger.isLoggable(level)) {
                logger.fine(iz2.b(false, i, i2, i3, i4));
            }
        }
        if (i2 <= this.L) {
            if ((Integer.MIN_VALUE & i) == 0) {
                byte[] bArr = yy7.a;
                y80 y80Var = this.A;
                y80Var.getClass();
                y80Var.writeByte((i2 >>> 16) & 255);
                y80Var.writeByte((i2 >>> 8) & 255);
                y80Var.writeByte(i2 & 255);
                y80Var.writeByte(i3 & 255);
                y80Var.writeByte(i4 & 255);
                y80Var.writeInt(i & Integer.MAX_VALUE);
                return;
            }
            i.f(lb1.g(i, "reserved bit set: "));
            return;
        }
        int i5 = this.L;
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + i5 + ": " + i2).toString());
    }

    public final void n(int i, a62 a62Var, byte[] bArr) {
        a62Var.getClass();
        synchronized (this) {
            if (!this.R) {
                if (a62Var.getHttpCode() != -1) {
                    k(0, bArr.length + 8, 7, 0);
                    this.A.writeInt(i);
                    this.A.writeInt(a62Var.getHttpCode());
                    if (bArr.length != 0) {
                        this.A.write(bArr);
                    }
                    this.A.flush();
                } else {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void r(boolean z, int i, ArrayList arrayList) {
        int i2;
        int i3;
        synchronized (this) {
            if (!this.R) {
                this.X.d(arrayList);
                long j = this.B.B;
                long min = Math.min(this.L, j);
                int i4 = (j > min ? 1 : (j == min ? 0 : -1));
                if (i4 == 0) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                if (z) {
                    i2 |= 1;
                }
                k(i, (int) min, 1, i2);
                this.A.O(this.B, min);
                if (i4 > 0) {
                    long j2 = j - min;
                    while (j2 > 0) {
                        long min2 = Math.min(this.L, j2);
                        j2 -= min2;
                        int i5 = (int) min2;
                        if (j2 == 0) {
                            i3 = 4;
                        } else {
                            i3 = 0;
                        }
                        k(i, i5, 9, i3);
                        this.A.O(this.B, min2);
                    }
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void u(int i, boolean z, int i2) {
        synchronized (this) {
            if (!this.R) {
                k(0, 8, 6, z ? 1 : 0);
                this.A.writeInt(i);
                this.A.writeInt(i2);
                this.A.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void v(int i, a62 a62Var) {
        a62Var.getClass();
        synchronized (this) {
            if (!this.R) {
                if (a62Var.getHttpCode() != -1) {
                    k(i, 4, 3, 0);
                    this.A.writeInt(a62Var.getHttpCode());
                    this.A.flush();
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void x(int i, long j) {
        synchronized (this) {
            try {
                if (!this.R) {
                    if (j != 0 && j <= 2147483647L) {
                        Logger logger = Y;
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(iz2.c(false, i, 4, j));
                        }
                        k(i, 4, 8, 0);
                        this.A.writeInt((int) j);
                        this.A.flush();
                    } else {
                        throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                    }
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
