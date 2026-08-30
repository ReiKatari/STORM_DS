package ti;

import androidx.preference.Preference;
import fj.a0;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import p1.c1;
import pi.h0;
import pi.x;
import pi.z;
import wi.b0;
import wi.c0;
import wi.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends wi.n implements ui.d {

    /* renamed from: b  reason: collision with root package name */
    public final si.c f13229b;

    /* renamed from: c  reason: collision with root package name */
    public final h0 f13230c;

    /* renamed from: d  reason: collision with root package name */
    public final Socket f13231d;

    /* renamed from: e  reason: collision with root package name */
    public final Socket f13232e;

    /* renamed from: f  reason: collision with root package name */
    public final pi.p f13233f;

    /* renamed from: g  reason: collision with root package name */
    public final z f13234g;

    /* renamed from: h  reason: collision with root package name */
    public final c1 f13235h;

    /* renamed from: i  reason: collision with root package name */
    public wi.p f13236i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13237j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f13238k;

    /* renamed from: l  reason: collision with root package name */
    public int f13239l;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public int f13240n;

    /* renamed from: o  reason: collision with root package name */
    public int f13241o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f13242p;

    /* renamed from: q  reason: collision with root package name */
    public long f13243q;

    public o(si.c cVar, p pVar, h0 h0Var, Socket socket, Socket socket2, pi.p pVar2, z zVar, c1 c1Var) {
        cVar.getClass();
        pVar.getClass();
        h0Var.getClass();
        socket.getClass();
        socket2.getClass();
        zVar.getClass();
        c1Var.getClass();
        this.f13229b = cVar;
        this.f13230c = h0Var;
        this.f13231d = socket;
        this.f13232e = socket2;
        this.f13233f = pVar2;
        this.f13234g = zVar;
        this.f13235h = c1Var;
        this.f13241o = 1;
        this.f13242p = new ArrayList();
        this.f13243q = Long.MAX_VALUE;
    }

    public static void c(x xVar, h0 h0Var, IOException iOException) {
        xVar.getClass();
        h0Var.getClass();
        iOException.getClass();
        if (h0Var.f11726b.type() != Proxy.Type.DIRECT) {
            pi.a aVar = h0Var.f11725a;
            aVar.f11664g.connectFailed(aVar.f11665h.h(), h0Var.f11726b.address(), iOException);
        }
        rd.k kVar = xVar.f11851z;
        synchronized (kVar) {
            ((LinkedHashSet) kVar.B).add(h0Var);
        }
    }

    @Override // wi.n
    public final void a(wi.p pVar, b0 b0Var) {
        int i2;
        b0Var.getClass();
        synchronized (this) {
            if ((b0Var.f14224a & 8) != 0) {
                i2 = b0Var.f14225b[3];
            } else {
                i2 = Preference.DEFAULT_ORDER;
            }
            this.f13241o = i2;
        }
    }

    @Override // wi.n
    public final void b(wi.x xVar) {
        xVar.c(wi.c.REFUSED_STREAM, null);
    }

    @Override // ui.d
    public final void cancel() {
        qi.g.b(this.f13231d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
        if (dj.c.c(r5, (java.security.cert.X509Certificate) r10) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(pi.a r9, java.util.List r10) {
        /*
            r8 = this;
            pi.r r0 = r9.f11665h
            java.util.TimeZone r1 = qi.g.f12552a
            java.util.ArrayList r1 = r8.f13242p
            int r1 = r1.size()
            int r2 = r8.f13241o
            r3 = 0
            if (r1 >= r2) goto Ld6
            boolean r1 = r8.f13237j
            if (r1 == 0) goto L15
            goto Ld6
        L15:
            pi.h0 r1 = r8.f13230c
            pi.a r2 = r1.f11725a
            pi.a r4 = r1.f11725a
            boolean r2 = r2.a(r9)
            if (r2 != 0) goto L23
            goto Ld6
        L23:
            java.lang.String r2 = r0.f11784d
            java.lang.String r5 = r0.f11784d
            pi.r r6 = r4.f11665h
            java.lang.String r6 = r6.f11784d
            boolean r2 = nc.k.a(r2, r6)
            if (r2 == 0) goto L33
            goto Lcb
        L33:
            wi.p r2 = r8.f13236i
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
            pi.h0 r2 = (pi.h0) r2
            java.net.Proxy r6 = r2.f11726b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L47
            java.net.Proxy r6 = r1.f11726b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L47
            java.net.InetSocketAddress r6 = r1.f11727c
            java.net.InetSocketAddress r2 = r2.f11727c
            boolean r2 = nc.k.a(r6, r2)
            if (r2 == 0) goto L47
            javax.net.ssl.HostnameVerifier r10 = r9.f11661d
            dj.c r1 = dj.c.f4109a
            if (r10 == r1) goto L76
            goto Ld6
        L76:
            java.util.TimeZone r10 = qi.g.f12552a
            pi.r r10 = r4.f11665h
            int r0 = r0.f11785e
            int r1 = r10.f11785e
            if (r0 == r1) goto L81
            goto Ld6
        L81:
            java.lang.String r10 = r10.f11784d
            boolean r10 = nc.k.a(r5, r10)
            pi.p r0 = r8.f13233f
            if (r10 == 0) goto L8c
            goto Lab
        L8c:
            boolean r10 = r8.f13238k
            if (r10 != 0) goto Ld6
            if (r0 == 0) goto Ld6
            java.util.List r10 = r0.a()
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto Ld6
            java.lang.Object r10 = r10.get(r3)
            r10.getClass()
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = dj.c.c(r5, r10)
            if (r10 == 0) goto Ld6
        Lab:
            pi.i r9 = r9.f11662e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r9.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r0.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.List r10 = r0.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r5.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r10.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.Set r9 = r9.f11729a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.Iterator r9 = r9.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            boolean r10 = r9.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            if (r10 != 0) goto Lcd
        Lcb:
            r9 = 1
            return r9
        Lcd:
            java.lang.Object r9 = r9.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            w.d.A(r9)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r9 = 0
            throw r9     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
        Ld6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.o.d(pi.a, java.util.List):boolean");
    }

    @Override // ui.d
    public final h0 e() {
        return this.f13230c;
    }

    public final boolean f(boolean z10) {
        long j2;
        TimeZone timeZone = qi.g.f12552a;
        long nanoTime = System.nanoTime();
        if (this.f13231d.isClosed() || this.f13232e.isClosed() || this.f13232e.isInputShutdown() || this.f13232e.isOutputShutdown()) {
            return false;
        }
        wi.p pVar = this.f13236i;
        if (pVar != null) {
            synchronized (pVar) {
                if (pVar.Y) {
                    return false;
                }
                if (pVar.f14265h0 < pVar.f14264g0) {
                    if (nanoTime >= pVar.f14266i0) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f13243q;
        }
        if (j2 < 10000000000L || !z10) {
            return true;
        }
        Socket socket = this.f13232e;
        a0 a0Var = (a0) this.f13235h.B;
        socket.getClass();
        a0Var.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z11 = !a0Var.d();
            socket.setSoTimeout(soTimeout);
            return z11;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // ui.d
    public final void g(n nVar, IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                if (iOException instanceof c0) {
                    if (((c0) iOException).A == wi.c.REFUSED_STREAM) {
                        int i2 = this.f13240n + 1;
                        this.f13240n = i2;
                        if (i2 > 1) {
                            this.f13237j = true;
                            this.f13239l++;
                        }
                    } else if (((c0) iOException).A != wi.c.CANCEL || !nVar.f13226j0) {
                        this.f13237j = true;
                        this.f13239l++;
                    }
                } else {
                    if (this.f13236i != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 || (iOException instanceof wi.a)) {
                        this.f13237j = true;
                        if (this.m == 0) {
                            if (iOException != null) {
                                c(nVar.A, this.f13230c, iOException);
                            }
                            this.f13239l++;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ui.d
    public final void h() {
        synchronized (this) {
            this.f13237j = true;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [a7.v, java.lang.Object] */
    public final void i() {
        int i2;
        int a10;
        this.f13243q = System.nanoTime();
        z zVar = this.f13234g;
        if (zVar != z.HTTP_2 && zVar != z.H2_PRIOR_KNOWLEDGE) {
            return;
        }
        this.f13232e.setSoTimeout(0);
        wi.d dVar = wi.d.f14226a;
        si.c cVar = this.f13229b;
        cVar.getClass();
        ?? obj = new Object();
        obj.A = cVar;
        obj.R = wi.n.f14257a;
        obj.X = wi.d.f14226a;
        c1 c1Var = this.f13235h;
        String str = this.f13230c.f11725a.f11665h.f11784d;
        c1Var.getClass();
        str.getClass();
        obj.B = c1Var;
        obj.L = qi.g.f12553b + ' ' + str;
        obj.R = this;
        obj.X = dVar;
        wi.p pVar = new wi.p(obj);
        this.f13236i = pVar;
        b0 b0Var = wi.p.f14258t0;
        if ((b0Var.f14224a & 8) != 0) {
            i2 = b0Var.f14225b[3];
        } else {
            i2 = Preference.DEFAULT_ORDER;
        }
        this.f13241o = i2;
        y yVar = pVar.f14273q0;
        synchronized (yVar) {
            try {
                if (!yVar.R) {
                    Logger logger = y.Y;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(qi.g.c(">> CONNECTION " + wi.i.f14253a.e(), new Object[0]));
                    }
                    yVar.A.p(wi.i.f14253a);
                    yVar.A.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        y yVar2 = pVar.f14273q0;
        b0 b0Var2 = pVar.f14268k0;
        yVar2.getClass();
        b0Var2.getClass();
        synchronized (yVar2) {
            try {
                if (!yVar2.R) {
                    yVar2.m(0, Integer.bitCount(b0Var2.f14224a) * 6, 4, 0);
                    for (int i10 = 0; i10 < 10; i10++) {
                        boolean z10 = true;
                        if (((1 << i10) & b0Var2.f14224a) == 0) {
                            z10 = false;
                        }
                        if (z10) {
                            yVar2.A.writeShort(i10);
                            yVar2.A.writeInt(b0Var2.f14225b[i10]);
                        }
                    }
                    yVar2.A.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (pVar.f14268k0.a() != 65535) {
            pVar.f14273q0.B(0, a10 - 65535);
        }
        si.b.b(pVar.Z.d(), pVar.L, pVar.f14274r0);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        h0 h0Var = this.f13230c;
        sb2.append(h0Var.f11725a.f11665h.f11784d);
        sb2.append(':');
        sb2.append(h0Var.f11725a.f11665h.f11785e);
        sb2.append(", proxy=");
        sb2.append(h0Var.f11726b);
        sb2.append(" hostAddress=");
        sb2.append(h0Var.f11727c);
        sb2.append(" cipherSuite=");
        pi.p pVar = this.f13233f;
        if (pVar != null) {
            obj = pVar.f11778b;
        } else {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f13234g);
        sb2.append('}');
        return sb2.toString();
    }
}
