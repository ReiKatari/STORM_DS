package defpackage;

import androidx.preference.Preference;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xt2  reason: default package */
/* loaded from: classes.dex */
public final class xt2 implements Closeable {
    public static final Logger Y = Logger.getLogger(it2.class.getName());
    public final t60 A;
    public final f60 B;
    public int L;
    public boolean R;
    public final vs2 X;

    /* JADX WARN: Type inference failed for: r2v1, types: [f60, java.lang.Object] */
    public xt2(r45 r45Var) {
        r45Var.getClass();
        this.A = r45Var;
        ?? obj = new Object();
        this.B = obj;
        this.L = 16384;
        this.X = new vs2(obj);
    }

    public final void B(int i, boolean z, int i2) {
        synchronized (this) {
            if (!this.R) {
                p(0, 8, 6, z ? 1 : 0);
                this.A.writeInt(i);
                this.A.writeInt(i2);
                this.A.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void C(int i, l12 l12Var) {
        l12Var.getClass();
        synchronized (this) {
            if (!this.R) {
                if (l12Var.getHttpCode() != -1) {
                    p(i, 4, 3, 0);
                    this.A.writeInt(l12Var.getHttpCode());
                    this.A.flush();
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void D(int i, long j) {
        synchronized (this) {
            try {
                if (!this.R) {
                    if (j != 0 && j <= 2147483647L) {
                        Logger logger = Y;
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(it2.c(false, i, 4, j));
                        }
                        p(i, 4, 8, 0);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.R = true;
            this.A.close();
        }
    }

    public final void d(r16 r16Var) {
        int i;
        r16Var.getClass();
        synchronized (this) {
            try {
                if (!this.R) {
                    int i2 = this.L;
                    int i3 = r16Var.a;
                    if ((i3 & 32) != 0) {
                        i2 = r16Var.b[5];
                    }
                    this.L = i2;
                    int i4 = -1;
                    if ((i3 & 2) != 0) {
                        i = r16Var.b[1];
                    } else {
                        i = -1;
                    }
                    if (i != -1) {
                        vs2 vs2Var = this.X;
                        if ((i3 & 2) != 0) {
                            i4 = r16Var.b[1];
                        }
                        vs2Var.getClass();
                        int min = Math.min(i4, 16384);
                        int i5 = vs2Var.d;
                        if (i5 != min) {
                            if (min < i5) {
                                vs2Var.b = Math.min(vs2Var.b, min);
                            }
                            vs2Var.c = true;
                            vs2Var.d = min;
                            int i6 = vs2Var.h;
                            if (min < i6) {
                                if (min == 0) {
                                    tq2[] tq2VarArr = vs2Var.e;
                                    nu.l0(0, tq2VarArr.length, null, tq2VarArr);
                                    vs2Var.f = vs2Var.e.length - 1;
                                    vs2Var.g = 0;
                                    vs2Var.h = 0;
                                } else {
                                    vs2Var.a(i6 - min);
                                }
                            }
                        }
                    }
                    p(0, 0, 4, 1);
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

    public final void i(boolean z, int i, f60 f60Var, int i2) {
        synchronized (this) {
            if (!this.R) {
                p(i, i2, 0, z ? 1 : 0);
                if (i2 > 0) {
                    t60 t60Var = this.A;
                    f60Var.getClass();
                    t60Var.l(f60Var, i2);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void p(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = Y;
            if (logger.isLoggable(level)) {
                logger.fine(it2.b(false, i, i2, i3, i4));
            }
        }
        if (i2 <= this.L) {
            if ((Integer.MIN_VALUE & i) == 0) {
                byte[] bArr = gk7.a;
                t60 t60Var = this.A;
                t60Var.getClass();
                t60Var.writeByte((i2 >>> 16) & 255);
                t60Var.writeByte((i2 >>> 8) & 255);
                t60Var.writeByte(i2 & 255);
                t60Var.writeByte(i3 & 255);
                t60Var.writeByte(i4 & 255);
                t60Var.writeInt(i & Preference.DEFAULT_ORDER);
                return;
            }
            i.g(wh1.g(i, "reserved bit set: "));
            return;
        }
        int i5 = this.L;
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + i5 + ": " + i2).toString());
    }

    public final void w(int i, l12 l12Var, byte[] bArr) {
        l12Var.getClass();
        synchronized (this) {
            if (!this.R) {
                if (l12Var.getHttpCode() != -1) {
                    p(0, bArr.length + 8, 7, 0);
                    this.A.writeInt(i);
                    this.A.writeInt(l12Var.getHttpCode());
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

    public final void x(boolean z, int i, ArrayList arrayList) {
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
                p(i, (int) min, 1, i2);
                this.A.l(this.B, min);
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
                        p(i, i5, 9, i3);
                        this.A.l(this.B, min2);
                    }
                }
            } else {
                throw new IOException("closed");
            }
        }
    }
}
