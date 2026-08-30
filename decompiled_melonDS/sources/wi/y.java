package wi;

import androidx.preference.Preference;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y implements Closeable {
    public static final Logger Y = Logger.getLogger(i.class.getName());
    public final fj.f A;
    public final fj.e B;
    public int L;
    public boolean R;
    public final g X;

    /* JADX WARN: Type inference failed for: r2v1, types: [fj.e, java.lang.Object] */
    public y(fj.z zVar) {
        zVar.getClass();
        this.A = zVar;
        ?? obj = new Object();
        this.B = obj;
        this.L = 16384;
        this.X = new g(obj);
    }

    public final void B(int i2, long j2) {
        synchronized (this) {
            try {
                if (!this.R) {
                    if (j2 != 0 && j2 <= 2147483647L) {
                        Logger logger = Y;
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(i.c(false, i2, 4, j2));
                        }
                        m(i2, 4, 8, 0);
                        this.A.writeInt((int) j2);
                        this.A.flush();
                    } else {
                        throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
                    }
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th2) {
                throw th2;
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

    public final void d(b0 b0Var) {
        int i2;
        b0Var.getClass();
        synchronized (this) {
            try {
                if (!this.R) {
                    int i10 = this.L;
                    int i11 = b0Var.f14224a;
                    if ((i11 & 32) != 0) {
                        i10 = b0Var.f14225b[5];
                    }
                    this.L = i10;
                    int i12 = -1;
                    if ((i11 & 2) != 0) {
                        i2 = b0Var.f14225b[1];
                    } else {
                        i2 = -1;
                    }
                    if (i2 != -1) {
                        g gVar = this.X;
                        if ((i11 & 2) != 0) {
                            i12 = b0Var.f14225b[1];
                        }
                        gVar.getClass();
                        int min = Math.min(i12, 16384);
                        int i13 = gVar.f14246d;
                        if (i13 != min) {
                            if (min < i13) {
                                gVar.f14244b = Math.min(gVar.f14244b, min);
                            }
                            gVar.f14245c = true;
                            gVar.f14246d = min;
                            int i14 = gVar.f14250h;
                            if (min < i14) {
                                if (min == 0) {
                                    e[] eVarArr = gVar.f14247e;
                                    zb.k.s(0, eVarArr.length, null, eVarArr);
                                    gVar.f14248f = gVar.f14247e.length - 1;
                                    gVar.f14249g = 0;
                                    gVar.f14250h = 0;
                                } else {
                                    gVar.a(i14 - min);
                                }
                            }
                        }
                    }
                    m(0, 0, 4, 1);
                    this.A.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th2) {
                throw th2;
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

    public final void i(boolean z10, int i2, fj.e eVar, int i10) {
        synchronized (this) {
            if (!this.R) {
                m(i2, i10, 0, z10 ? 1 : 0);
                if (i10 > 0) {
                    fj.f fVar = this.A;
                    eVar.getClass();
                    fVar.A(eVar, i10);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void m(int i2, int i10, int i11, int i12) {
        if (i11 != 8) {
            Level level = Level.FINE;
            Logger logger = Y;
            if (logger.isLoggable(level)) {
                logger.fine(i.b(false, i2, i10, i11, i12));
            }
        }
        if (i10 <= this.L) {
            if ((Integer.MIN_VALUE & i2) == 0) {
                byte[] bArr = qi.e.f12548a;
                fj.f fVar = this.A;
                fVar.getClass();
                fVar.writeByte((i10 >>> 16) & 255);
                fVar.writeByte((i10 >>> 8) & 255);
                fVar.writeByte(i10 & 255);
                fVar.writeByte(i11 & 255);
                fVar.writeByte(i12 & 255);
                fVar.writeInt(i2 & Preference.DEFAULT_ORDER);
                return;
            }
            a0.j.e(w.d.l(i2, "reserved bit set: "));
            return;
        }
        int i13 = this.L;
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + i13 + ": " + i10).toString());
    }

    public final void t(int i2, c cVar, byte[] bArr) {
        cVar.getClass();
        synchronized (this) {
            if (!this.R) {
                if (cVar.getHttpCode() != -1) {
                    m(0, bArr.length + 8, 7, 0);
                    this.A.writeInt(i2);
                    this.A.writeInt(cVar.getHttpCode());
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

    public final void v(boolean z10, int i2, ArrayList arrayList) {
        int i10;
        int i11;
        synchronized (this) {
            if (!this.R) {
                this.X.d(arrayList);
                long j2 = this.B.B;
                long min = Math.min(this.L, j2);
                int i12 = (j2 > min ? 1 : (j2 == min ? 0 : -1));
                if (i12 == 0) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                if (z10) {
                    i10 |= 1;
                }
                m(i2, (int) min, 1, i10);
                this.A.A(this.B, min);
                if (i12 > 0) {
                    long j10 = j2 - min;
                    while (j10 > 0) {
                        long min2 = Math.min(this.L, j10);
                        j10 -= min2;
                        int i13 = (int) min2;
                        if (j10 == 0) {
                            i11 = 4;
                        } else {
                            i11 = 0;
                        }
                        m(i2, i13, 9, i11);
                        this.A.A(this.B, min2);
                    }
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void w(int i2, boolean z10, int i10) {
        synchronized (this) {
            if (!this.R) {
                m(0, 8, 6, z10 ? 1 : 0);
                this.A.writeInt(i2);
                this.A.writeInt(i10);
                this.A.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void z(int i2, c cVar) {
        cVar.getClass();
        synchronized (this) {
            if (!this.R) {
                if (cVar.getHttpCode() != -1) {
                    m(i2, 4, 3, 0);
                    this.A.writeInt(cVar.getHttpCode());
                    this.A.flush();
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                throw new IOException("closed");
            }
        }
    }
}
