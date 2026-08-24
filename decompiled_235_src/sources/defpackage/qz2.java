package defpackage;

import com.github.junrar.unpack.ppm.RangeCoder;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qz2  reason: default package */
/* loaded from: classes.dex */
public final class qz2 implements Closeable {
    public static final fd6 v0;
    public final oz2 A;
    public final LinkedHashMap B = new LinkedHashMap();
    public final String L;
    public int R;
    public int X;
    public boolean Y;
    public final qz6 Z;
    public final pz6 d0;
    public final pz6 e0;
    public final pz6 f0;
    public final d90 g0;
    public long h0;
    public long i0;
    public long j0;
    public long k0;
    public final oe2 l0;
    public final fd6 m0;
    public fd6 n0;
    public final tc7 o0;
    public long p0;
    public long q0;
    public final bt r0;
    public final yz2 s0;
    public final i5 t0;
    public final LinkedHashSet u0;

    static {
        fd6 fd6Var = new fd6();
        fd6Var.b(4, 65535);
        fd6Var.b(5, 16384);
        v0 = fd6Var;
    }

    public qz2(s9 s9Var) {
        this.A = (oz2) s9Var.d;
        String str = (String) s9Var.c;
        if (str != null) {
            this.L = str;
            this.X = 3;
            qz6 qz6Var = (qz6) s9Var.a;
            this.Z = qz6Var;
            this.d0 = qz6Var.d();
            this.e0 = qz6Var.d();
            this.f0 = qz6Var.d();
            this.g0 = d90.B0;
            this.l0 = (oe2) s9Var.e;
            fd6 fd6Var = new fd6();
            fd6Var.b(4, RangeCoder.TOP);
            this.m0 = fd6Var;
            fd6 fd6Var2 = v0;
            this.n0 = fd6Var2;
            this.o0 = new tc7(0);
            this.q0 = fd6Var2.a();
            bt btVar = (bt) s9Var.b;
            if (btVar != null) {
                this.r0 = btVar;
                this.s0 = new yz2((ee5) btVar.R);
                this.t0 = new i5(this, new tz2((fe5) btVar.L));
                this.u0 = new LinkedHashSet();
                return;
            }
            nb3.a0("socket");
            throw null;
        }
        nb3.a0("connectionName");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e(a62.NO_ERROR, a62.CANCEL, null);
    }

    public final void e(a62 a62Var, a62 a62Var2, IOException iOException) {
        int i;
        Object[] objArr;
        a62Var.getClass();
        a62Var2.getClass();
        TimeZone timeZone = az7.a;
        try {
            n(a62Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.B.isEmpty()) {
                objArr = this.B.values().toArray(new xz2[0]);
                this.B.clear();
            } else {
                objArr = null;
            }
        }
        xz2[] xz2VarArr = (xz2[]) objArr;
        if (xz2VarArr != null) {
            for (xz2 xz2Var : xz2VarArr) {
                try {
                    xz2Var.c(a62Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.s0.close();
        } catch (IOException unused3) {
        }
        try {
            this.r0.cancel();
        } catch (IOException unused4) {
        }
        this.d0.f();
        this.e0.f();
        this.f0.f();
    }

    public final void flush() {
        this.s0.flush();
    }

    public final xz2 h(int i) {
        xz2 xz2Var;
        synchronized (this) {
            xz2Var = (xz2) this.B.get(Integer.valueOf(i));
        }
        return xz2Var;
    }

    public final xz2 k(int i) {
        xz2 xz2Var;
        synchronized (this) {
            xz2Var = (xz2) this.B.remove(Integer.valueOf(i));
            notifyAll();
        }
        return xz2Var;
    }

    public final void n(a62 a62Var) {
        a62Var.getClass();
        synchronized (this.s0) {
            synchronized (this) {
                if (this.Y) {
                    return;
                }
                this.Y = true;
                this.s0.n(this.R, a62Var, yy7.a);
            }
        }
    }

    public final void r(long j) {
        synchronized (this) {
            try {
                tc7.c(this.o0, j, 0L, 2);
                long b = this.o0.b();
                if (b >= this.m0.a() / 2) {
                    x(0, b);
                    tc7.c(this.o0, 0L, b, 1);
                }
                oe2 oe2Var = this.l0;
                tc7 tc7Var = this.o0;
                oe2Var.getClass();
                tc7Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.s0.L);
        r6 = r2;
        r8.p0 += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(int i, boolean z, k80 k80Var, long j) {
        int min;
        long j2;
        boolean z2;
        if (j == 0) {
            this.s0.h(z, i, k80Var, 0);
            return;
        }
        loop0: while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.p0;
                            long j4 = this.q0;
                            if (j3 < j4) {
                                break;
                            } else if (!this.B.containsKey(Integer.valueOf(i))) {
                                break loop0;
                            } else {
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j2;
            yz2 yz2Var = this.s0;
            if (z && j == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            yz2Var.h(z2, i, k80Var, min);
        }
    }

    public final void v(int i, a62 a62Var) {
        a62Var.getClass();
        pz6.b(this.d0, this.L + '[' + i + "] writeSynReset", 0L, new r52(this, i, a62Var), 6);
    }

    public final void x(final int i, final long j) {
        pz6.b(this.d0, this.L + '[' + i + "] windowUpdate", 0L, new on2() { // from class: jz2
            @Override // defpackage.on2
            public final Object c() {
                qz2 qz2Var = qz2.this;
                try {
                    qz2Var.s0.x(i, j);
                } catch (IOException e) {
                    a62 a62Var = a62.PROTOCOL_ERROR;
                    qz2Var.e(a62Var, a62Var, e);
                }
                return jg7.a;
            }
        }, 6);
    }
}
