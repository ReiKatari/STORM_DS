package defpackage;

import androidx.preference.Preference;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x45  reason: default package */
/* loaded from: classes.dex */
public final class x45 extends nt2 implements d22 {
    public final fn6 b;
    public final ir5 c;
    public final Socket d;
    public final Socket e;
    public final op2 f;
    public final dw4 g;
    public final os h;
    public pt2 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public x45(fn6 fn6Var, bo1 bo1Var, ir5 ir5Var, Socket socket, Socket socket2, op2 op2Var, dw4 dw4Var, os osVar) {
        fn6Var.getClass();
        bo1Var.getClass();
        ir5Var.getClass();
        socket.getClass();
        socket2.getClass();
        dw4Var.getClass();
        osVar.getClass();
        this.b = fn6Var;
        this.c = ir5Var;
        this.d = socket;
        this.e = socket2;
        this.f = op2Var;
        this.g = dw4Var;
        this.h = osVar;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(zb4 zb4Var, ir5 ir5Var, IOException iOException) {
        zb4Var.getClass();
        ir5Var.getClass();
        iOException.getClass();
        if (ir5Var.b.type() != Proxy.Type.DIRECT) {
            da daVar = ir5Var.a;
            daVar.g.connectFailed(daVar.h.h(), ir5Var.b.address(), iOException);
        }
        qb5 qb5Var = zb4Var.z;
        synchronized (qb5Var) {
            qb5Var.b.add(ir5Var);
        }
    }

    @Override // defpackage.nt2
    public final void a(pt2 pt2Var, r16 r16Var) {
        int i;
        r16Var.getClass();
        synchronized (this) {
            if ((r16Var.a & 8) != 0) {
                i = r16Var.b[3];
            } else {
                i = Preference.DEFAULT_ORDER;
            }
            this.o = i;
        }
    }

    @Override // defpackage.d22
    public final void b(w45 w45Var, IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                if (iOException instanceof vf6) {
                    if (((vf6) iOException).A == l12.REFUSED_STREAM) {
                        int i = this.n + 1;
                        this.n = i;
                        if (i > 1) {
                            this.j = true;
                            this.l++;
                        }
                    } else if (((vf6) iOException).A != l12.CANCEL || !w45Var.k0) {
                        this.j = true;
                        this.l++;
                    }
                } else {
                    if (this.i != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || (iOException instanceof yw0)) {
                        this.j = true;
                        if (this.m == 0) {
                            if (iOException != null) {
                                d(w45Var.A, this.c, iOException);
                            }
                            this.l++;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.nt2
    public final void c(wt2 wt2Var) {
        wt2Var.c(l12.REFUSED_STREAM, null);
    }

    @Override // defpackage.d22
    public final void cancel() {
        ik7.b(this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
        if (defpackage.ub4.c(r5, (java.security.cert.X509Certificate) r8) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.da r9, java.util.List r10) {
        /*
            r8 = this;
            hu2 r0 = r9.h
            java.util.TimeZone r1 = defpackage.ik7.a
            java.util.ArrayList r1 = r8.p
            int r1 = r1.size()
            int r2 = r8.o
            r3 = 0
            if (r1 >= r2) goto Ld6
            boolean r1 = r8.j
            if (r1 == 0) goto L15
            goto Ld6
        L15:
            ir5 r1 = r8.c
            da r2 = r1.a
            da r4 = r1.a
            boolean r2 = r2.a(r9)
            if (r2 != 0) goto L23
            goto Ld6
        L23:
            java.lang.String r2 = r0.d
            java.lang.String r5 = r0.d
            hu2 r6 = r4.h
            java.lang.String r6 = r6.d
            boolean r2 = defpackage.b53.x(r2, r6)
            if (r2 == 0) goto L33
            goto Lcb
        L33:
            pt2 r2 = r8.i
            if (r2 != 0) goto L39
            goto Ld6
        L39:
            if (r10 == 0) goto Ld6
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L43
            goto Ld6
        L43:
            java.util.Iterator r10 = r10.iterator()
        L47:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Ld6
            java.lang.Object r2 = r10.next()
            ir5 r2 = (defpackage.ir5) r2
            java.net.Proxy r6 = r2.b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L47
            java.net.Proxy r6 = r1.b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L47
            java.net.InetSocketAddress r6 = r1.c
            java.net.InetSocketAddress r2 = r2.c
            boolean r2 = defpackage.b53.x(r6, r2)
            if (r2 == 0) goto L47
            javax.net.ssl.HostnameVerifier r10 = r9.d
            ub4 r1 = defpackage.ub4.a
            if (r10 == r1) goto L76
            goto Ld6
        L76:
            java.util.TimeZone r10 = defpackage.ik7.a
            hu2 r10 = r4.h
            int r0 = r0.e
            int r1 = r10.e
            if (r0 == r1) goto L81
            goto Ld6
        L81:
            java.lang.String r10 = r10.d
            boolean r10 = defpackage.b53.x(r5, r10)
            op2 r0 = r8.f
            if (r10 == 0) goto L8c
            goto Lab
        L8c:
            boolean r8 = r8.k
            if (r8 != 0) goto Ld6
            if (r0 == 0) goto Ld6
            java.util.List r8 = r0.a()
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto Ld6
            java.lang.Object r8 = r8.get(r3)
            r8.getClass()
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            boolean r8 = defpackage.ub4.c(r5, r8)
            if (r8 == 0) goto Ld6
        Lab:
            zi0 r8 = r9.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r8.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r0.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.List r9 = r0.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r5.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r9.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.Set r8 = r8.a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.Iterator r8 = r8.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            boolean r9 = r8.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            if (r9 != 0) goto Lcd
        Lcb:
            r8 = 1
            return r8
        Lcd:
            java.lang.Object r8 = r8.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            defpackage.ej6.j(r8)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r8 = 0
            throw r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
        Ld6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x45.e(da, java.util.List):boolean");
    }

    @Override // defpackage.d22
    public final ir5 f() {
        return this.c;
    }

    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = ik7.a;
        long nanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        pt2 pt2Var = this.i;
        if (pt2Var != null) {
            synchronized (pt2Var) {
                if (pt2Var.Y) {
                    return false;
                }
                if (pt2Var.i0 < pt2Var.h0) {
                    if (nanoTime >= pt2Var.j0) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        s45 s45Var = (s45) this.h.L;
        socket.getClass();
        s45Var.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z2 = !s45Var.d();
            socket.setSoTimeout(soTimeout);
            return z2;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // defpackage.d22
    public final void h() {
        synchronized (this) {
            this.j = true;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [r9, java.lang.Object] */
    public final void i() {
        int i;
        int a;
        this.q = System.nanoTime();
        dw4 dw4Var = this.g;
        if (dw4Var != dw4.HTTP_2 && dw4Var != dw4.H2_PRIOR_KNOWLEDGE) {
            return;
        }
        this.e.setSoTimeout(0);
        iq0 iq0Var = iq0.c0;
        x92 x92Var = x92.a;
        fn6 fn6Var = this.b;
        fn6Var.getClass();
        ?? obj = new Object();
        obj.a = fn6Var;
        obj.d = nt2.a;
        obj.e = x92.a;
        os osVar = this.h;
        String str = this.c.a.h.d;
        osVar.getClass();
        str.getClass();
        obj.b = osVar;
        obj.c = ik7.b + ' ' + str;
        obj.d = this;
        obj.e = x92Var;
        pt2 pt2Var = new pt2(obj);
        this.i = pt2Var;
        r16 r16Var = pt2.u0;
        if ((r16Var.a & 8) != 0) {
            i = r16Var.b[3];
        } else {
            i = Preference.DEFAULT_ORDER;
        }
        this.o = i;
        xt2 xt2Var = pt2Var.r0;
        synchronized (xt2Var) {
            try {
                if (!xt2Var.R) {
                    Logger logger = xt2.Y;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(ik7.c(">> CONNECTION " + it2.a.e(), new Object[0]));
                    }
                    xt2Var.A.n(it2.a);
                    xt2Var.A.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xt2 xt2Var2 = pt2Var.r0;
        r16 r16Var2 = pt2Var.l0;
        xt2Var2.getClass();
        r16Var2.getClass();
        synchronized (xt2Var2) {
            try {
                if (!xt2Var2.R) {
                    xt2Var2.p(0, Integer.bitCount(r16Var2.a) * 6, 4, 0);
                    for (int i2 = 0; i2 < 10; i2++) {
                        boolean z = true;
                        if (((1 << i2) & r16Var2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            xt2Var2.A.writeShort(i2);
                            xt2Var2.A.writeInt(r16Var2.b[i2]);
                        }
                    }
                    xt2Var2.A.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pt2Var.l0.a() != 65535) {
            pt2Var.r0.D(0, a - 65535);
        }
        en6.b(pt2Var.Z.d(), pt2Var.L, pt2Var.s0);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        ir5 ir5Var = this.c;
        sb.append(ir5Var.a.h.d);
        sb.append(':');
        sb.append(ir5Var.a.h.e);
        sb.append(", proxy=");
        sb.append(ir5Var.b);
        sb.append(" hostAddress=");
        sb.append(ir5Var.c);
        sb.append(" cipherSuite=");
        op2 op2Var = this.f;
        if (op2Var != null) {
            obj = op2Var.b;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
