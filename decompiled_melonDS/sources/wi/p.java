package wi;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import l.f0;
import p1.c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p implements Closeable {

    /* renamed from: t0  reason: collision with root package name */
    public static final b0 f14258t0;
    public final n A;
    public final LinkedHashMap B = new LinkedHashMap();
    public final String L;
    public int R;
    public int X;
    public boolean Y;
    public final si.c Z;

    /* renamed from: b0  reason: collision with root package name */
    public final si.b f14259b0;

    /* renamed from: c0  reason: collision with root package name */
    public final si.b f14260c0;

    /* renamed from: d0  reason: collision with root package name */
    public final si.b f14261d0;

    /* renamed from: e0  reason: collision with root package name */
    public final a0 f14262e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f14263f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f14264g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f14265h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f14266i0;

    /* renamed from: j0  reason: collision with root package name */
    public final d f14267j0;

    /* renamed from: k0  reason: collision with root package name */
    public final b0 f14268k0;

    /* renamed from: l0  reason: collision with root package name */
    public b0 f14269l0;

    /* renamed from: m0  reason: collision with root package name */
    public final f0 f14270m0;

    /* renamed from: n0  reason: collision with root package name */
    public long f14271n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f14272o0;
    public final c1 p0;

    /* renamed from: q0  reason: collision with root package name */
    public final y f14273q0;

    /* renamed from: r0  reason: collision with root package name */
    public final ai.i f14274r0;

    /* renamed from: s0  reason: collision with root package name */
    public final LinkedHashSet f14275s0;

    static {
        b0 b0Var = new b0();
        b0Var.b(4, 65535);
        b0Var.b(5, 16384);
        f14258t0 = b0Var;
    }

    public p(a7.v vVar) {
        this.A = (n) vVar.R;
        String str = (String) vVar.L;
        if (str != null) {
            this.L = str;
            this.X = 3;
            si.c cVar = (si.c) vVar.A;
            this.Z = cVar;
            this.f14259b0 = cVar.d();
            this.f14260c0 = cVar.d();
            this.f14261d0 = cVar.d();
            this.f14262e0 = a0.f14223a;
            this.f14267j0 = (d) vVar.X;
            b0 b0Var = new b0();
            b0Var.b(4, 16777216);
            this.f14268k0 = b0Var;
            b0 b0Var2 = f14258t0;
            this.f14269l0 = b0Var2;
            this.f14270m0 = new f0(0);
            this.f14272o0 = b0Var2.a();
            c1 c1Var = (c1) vVar.B;
            if (c1Var != null) {
                this.p0 = c1Var;
                this.f14273q0 = new y((fj.z) c1Var.L);
                this.f14274r0 = new ai.i(this, new t((fj.a0) c1Var.B));
                this.f14275s0 = new LinkedHashSet();
                return;
            }
            nc.k.f("socket");
            throw null;
        }
        nc.k.f("connectionName");
        throw null;
    }

    public final void B(final int i2, final long j2) {
        si.b.b(this.f14259b0, this.L + '[' + i2 + "] windowUpdate", new mc.a() { // from class: wi.j
            @Override // mc.a
            public final Object b() {
                p pVar = p.this;
                try {
                    pVar.f14273q0.B(i2, j2);
                } catch (IOException e6) {
                    c cVar = c.PROTOCOL_ERROR;
                    pVar.d(cVar, cVar, e6);
                }
                return yb.y.f14813a;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d(c.NO_ERROR, c.CANCEL, null);
    }

    public final void d(c cVar, c cVar2, IOException iOException) {
        int i2;
        Object[] objArr;
        cVar.getClass();
        cVar2.getClass();
        TimeZone timeZone = qi.g.f12552a;
        try {
            t(cVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.B.isEmpty()) {
                objArr = this.B.values().toArray(new x[0]);
                this.B.clear();
            } else {
                objArr = null;
            }
        }
        x[] xVarArr = (x[]) objArr;
        if (xVarArr != null) {
            for (x xVar : xVarArr) {
                try {
                    xVar.c(cVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f14273q0.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((b9.e) this.p0.A).B).close();
        } catch (IOException unused4) {
        }
        this.f14259b0.f();
        this.f14260c0.f();
        this.f14261d0.f();
    }

    public final void flush() {
        this.f14273q0.flush();
    }

    public final x i(int i2) {
        x xVar;
        synchronized (this) {
            xVar = (x) this.B.get(Integer.valueOf(i2));
        }
        return xVar;
    }

    public final x m(int i2) {
        x xVar;
        synchronized (this) {
            xVar = (x) this.B.remove(Integer.valueOf(i2));
            notifyAll();
        }
        return xVar;
    }

    public final void t(c cVar) {
        cVar.getClass();
        synchronized (this.f14273q0) {
            synchronized (this) {
                if (this.Y) {
                    return;
                }
                this.Y = true;
                this.f14273q0.t(this.R, cVar, qi.e.f12548a);
            }
        }
    }

    public final void v(long j2) {
        synchronized (this) {
            try {
                f0.c(this.f14270m0, j2, 0L, 2);
                long b10 = this.f14270m0.b();
                if (b10 >= this.f14268k0.a() / 2) {
                    B(0, b10);
                    f0.c(this.f14270m0, 0L, b10, 1);
                }
                d dVar = this.f14267j0;
                f0 f0Var = this.f14270m0;
                dVar.getClass();
                f0Var.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f14273q0.L);
        r6 = r2;
        r8.f14271n0 += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(int r9, boolean r10, fj.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            wi.y r12 = r8.f14273q0
            r12.i(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f14271n0     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f14272o0     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
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
            wi.y r4 = r8.f14273q0     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.L     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f14271n0     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f14271n0 = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            wi.y r4 = r8.f14273q0
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
        throw new UnsupportedOperationException("Method not decompiled: wi.p.w(int, boolean, fj.e, long):void");
    }

    public final void z(int i2, c cVar) {
        cVar.getClass();
        si.b.b(this.f14259b0, this.L + '[' + i2 + "] writeSynReset", new nd.x(this, i2, cVar));
    }
}
