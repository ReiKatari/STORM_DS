package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pt2  reason: default package */
/* loaded from: classes.dex */
public final class pt2 implements Closeable {
    public static final r16 u0;
    public final nt2 A;
    public final LinkedHashMap B = new LinkedHashMap();
    public final String L;
    public int R;
    public int X;
    public boolean Y;
    public final fn6 Z;
    public final en6 c0;
    public final en6 d0;
    public final en6 e0;
    public final iq0 f0;
    public long g0;
    public long h0;
    public long i0;
    public long j0;
    public final x92 k0;
    public final r16 l0;
    public r16 m0;
    public final yy6 n0;
    public long o0;
    public long p0;
    public final os q0;
    public final xt2 r0;
    public final j5 s0;
    public final LinkedHashSet t0;

    static {
        r16 r16Var = new r16();
        r16Var.b(4, 65535);
        r16Var.b(5, 16384);
        u0 = r16Var;
    }

    public pt2(r9 r9Var) {
        this.A = (nt2) r9Var.d;
        String str = (String) r9Var.c;
        if (str != null) {
            this.L = str;
            this.X = 3;
            fn6 fn6Var = (fn6) r9Var.a;
            this.Z = fn6Var;
            this.c0 = fn6Var.d();
            this.d0 = fn6Var.d();
            this.e0 = fn6Var.d();
            this.f0 = iq0.m0;
            this.k0 = (x92) r9Var.e;
            r16 r16Var = new r16();
            r16Var.b(4, 16777216);
            this.l0 = r16Var;
            r16 r16Var2 = u0;
            this.m0 = r16Var2;
            this.n0 = new yy6(0);
            this.p0 = r16Var2.a();
            os osVar = (os) r9Var.b;
            if (osVar != null) {
                this.q0 = osVar;
                this.r0 = new xt2((r45) osVar.R);
                this.s0 = new j5(this, new st2((s45) osVar.L));
                this.t0 = new LinkedHashSet();
                return;
            }
            b53.g0("socket");
            throw null;
        }
        b53.g0("connectionName");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.r0.L);
        r6 = r2;
        r8.o0 += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(int r9, boolean r10, defpackage.f60 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            xt2 r8 = r8.r0
            r8.i(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.o0     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.p0     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.B     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            xt2 r4 = r8.r0     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.L     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.o0     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.o0 = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            xt2 r4 = r8.r0
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.i(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt2.B(int, boolean, f60, long):void");
    }

    public final void C(int i, l12 l12Var) {
        l12Var.getClass();
        en6.b(this.c0, this.L + '[' + i + "] writeSynReset", new c12(this, i, l12Var));
    }

    public final void D(final int i, final long j) {
        en6.b(this.c0, this.L + '[' + i + "] windowUpdate", new ki2() { // from class: jt2
            @Override // defpackage.ki2
            public final Object c() {
                pt2 pt2Var = pt2.this;
                try {
                    pt2Var.r0.D(i, j);
                } catch (IOException e) {
                    l12 l12Var = l12.PROTOCOL_ERROR;
                    pt2Var.d(l12Var, l12Var, e);
                }
                return o27.a;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d(l12.NO_ERROR, l12.CANCEL, null);
    }

    public final void d(l12 l12Var, l12 l12Var2, IOException iOException) {
        int i;
        Object[] objArr;
        l12Var.getClass();
        l12Var2.getClass();
        TimeZone timeZone = ik7.a;
        try {
            w(l12Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.B.isEmpty()) {
                objArr = this.B.values().toArray(new wt2[0]);
                this.B.clear();
            } else {
                objArr = null;
            }
        }
        wt2[] wt2VarArr = (wt2[]) objArr;
        if (wt2VarArr != null) {
            for (wt2 wt2Var : wt2VarArr) {
                try {
                    wt2Var.c(l12Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.r0.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((q9) this.q0.B).B).close();
        } catch (IOException unused4) {
        }
        this.c0.f();
        this.d0.f();
        this.e0.f();
    }

    public final void flush() {
        this.r0.flush();
    }

    public final wt2 i(int i) {
        wt2 wt2Var;
        synchronized (this) {
            wt2Var = (wt2) this.B.get(Integer.valueOf(i));
        }
        return wt2Var;
    }

    public final wt2 p(int i) {
        wt2 wt2Var;
        synchronized (this) {
            wt2Var = (wt2) this.B.remove(Integer.valueOf(i));
            notifyAll();
        }
        return wt2Var;
    }

    public final void w(l12 l12Var) {
        l12Var.getClass();
        synchronized (this.r0) {
            synchronized (this) {
                if (this.Y) {
                    return;
                }
                this.Y = true;
                this.r0.w(this.R, l12Var, gk7.a);
            }
        }
    }

    public final void x(long j) {
        synchronized (this) {
            try {
                yy6.c(this.n0, j, 0L, 2);
                long b = this.n0.b();
                if (b >= this.l0.a() / 2) {
                    D(0, b);
                    yy6.c(this.n0, 0L, b, 1);
                }
                x92 x92Var = this.k0;
                yy6 yy6Var = this.n0;
                x92Var.getClass();
                yy6Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
