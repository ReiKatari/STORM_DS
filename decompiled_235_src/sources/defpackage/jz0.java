package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jz0  reason: default package */
/* loaded from: classes.dex */
public final class jz0 implements h26, u62 {
    public final qz6 a;
    public final ls1 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final je5 h;
    public final ue5 i;
    public final b26 j;
    public final List k;
    public final pa l;
    public final int m;
    public final boolean n;
    public volatile boolean o;
    public Socket p;
    public Socket q;
    public pv2 r;
    public k55 s;
    public bt t;
    public ke5 u;

    public jz0(qz6 qz6Var, ls1 ls1Var, int i, int i2, int i3, int i4, boolean z, je5 je5Var, ue5 ue5Var, b26 b26Var, List list, pa paVar, int i5, boolean z2) {
        qz6Var.getClass();
        ls1Var.getClass();
        b26Var.getClass();
        this.a = qz6Var;
        this.b = ls1Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = je5Var;
        this.i = ue5Var;
        this.j = b26Var;
        this.k = list;
        this.l = paVar;
        this.m = i5;
        this.n = z2;
    }

    @Override // defpackage.h26
    public final h26 a() {
        return new jz0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    @Override // defpackage.h26
    public final ke5 b() {
        il5 il5Var = this.h.A.B;
        b26 b26Var = this.j;
        synchronized (il5Var) {
            b26Var.getClass();
            il5Var.b.remove(b26Var);
        }
        ke5 ke5Var = this.u;
        ke5Var.getClass();
        this.j.getClass();
        pp5 d = this.i.d(this, this.k);
        if (d != null) {
            return d.a;
        }
        synchronized (ke5Var) {
            ls1 ls1Var = this.b;
            ls1Var.getClass();
            TimeZone timeZone = az7.a;
            ((ConcurrentLinkedQueue) ls1Var.d).add(ke5Var);
            ((pz6) ls1Var.b).c((hk1) ls1Var.c, 0L);
            this.h.b(ke5Var);
        }
        return ke5Var;
    }

    @Override // defpackage.h26
    public final boolean c() {
        if (this.s != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.h26, defpackage.u62
    public final void cancel() {
        this.o = true;
        Socket socket = this.p;
        if (socket != null) {
            az7.c(socket);
        }
    }

    @Override // defpackage.h26
    public final g26 d() {
        Socket socket;
        Socket socket2;
        ls1 ls1Var = this.b;
        b26 b26Var = this.j;
        CopyOnWriteArrayList copyOnWriteArrayList = this.h.o0;
        if (this.p == null) {
            copyOnWriteArrayList.add(this);
            boolean z = false;
            try {
                try {
                    b26Var.c.getClass();
                    ls1Var.getClass();
                    i();
                    z = true;
                    g26 g26Var = new g26(this, (Throwable) null, 6);
                    copyOnWriteArrayList.remove(this);
                    return g26Var;
                } catch (IOException e) {
                    ea eaVar = b26Var.a;
                    if (b26Var.b.type() != Proxy.Type.DIRECT) {
                        ea eaVar2 = b26Var.a;
                        eaVar2.g.connectFailed(eaVar2.h.h(), b26Var.b.address(), e);
                    }
                    b26Var.c.getClass();
                    ls1Var.getClass();
                    g26 g26Var2 = new g26(this, e, 2);
                    copyOnWriteArrayList.remove(this);
                    if (!z && (socket2 = this.p) != null) {
                        az7.c(socket2);
                    }
                    return g26Var2;
                }
            } catch (Throwable th) {
                copyOnWriteArrayList.remove(this);
                if (!z && (socket = this.p) != null) {
                    az7.c(socket);
                }
                throw th;
            }
        }
        i.m("TCP already connected");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    @Override // defpackage.h26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g26 g() {
        jz0 jz0Var;
        jz0 jz0Var2;
        ls1 ls1Var = this.b;
        CopyOnWriteArrayList copyOnWriteArrayList = this.h.o0;
        Socket socket = this.p;
        jz0 jz0Var3 = null;
        if (socket != null) {
            if (!c()) {
                b26 b26Var = this.j;
                ea eaVar = b26Var.a;
                InetSocketAddress inetSocketAddress = b26Var.c;
                ea eaVar2 = b26Var.a;
                List list = eaVar.j;
                copyOnWriteArrayList.add(this);
                boolean z = false;
                try {
                    try {
                        if (this.l != null) {
                            g26 k = k();
                            if (k.c != null) {
                                copyOnWriteArrayList.remove(this);
                                Socket socket2 = this.q;
                                if (socket2 != null) {
                                    az7.c(socket2);
                                }
                                az7.c(socket);
                                return k;
                            }
                        }
                        if (eaVar2.c != null) {
                            bt btVar = this.t;
                            if (btVar != null) {
                                if (((fe5) btVar.L).B.u()) {
                                    bt btVar2 = this.t;
                                    if (btVar2 != null) {
                                        if (((ee5) btVar2.R).B.u()) {
                                            SSLSocketFactory sSLSocketFactory = eaVar2.c;
                                            i03 i03Var = eaVar2.h;
                                            Socket createSocket = sSLSocketFactory.createSocket(socket, i03Var.d, i03Var.e, true);
                                            createSocket.getClass();
                                            SSLSocket sSLSocket = (SSLSocket) createSocket;
                                            jz0 m = m(list, sSLSocket);
                                            xz0 xz0Var = (xz0) list.get(m.m);
                                            jz0Var = m.l(list, sSLSocket);
                                            try {
                                                xz0Var.a(sSLSocket, m.n);
                                                j(sSLSocket, xz0Var);
                                                jz0Var2 = jz0Var;
                                            } catch (IOException e) {
                                                e = e;
                                                inetSocketAddress.getClass();
                                                ls1Var.getClass();
                                                if (this.g && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                                    jz0Var3 = jz0Var;
                                                }
                                                g26 g26Var = new g26(this, jz0Var3, e);
                                                copyOnWriteArrayList.remove(this);
                                                if (!z) {
                                                    Socket socket3 = this.q;
                                                    if (socket3 != null) {
                                                        az7.c(socket3);
                                                    }
                                                    az7.c(socket);
                                                }
                                                return g26Var;
                                            }
                                        }
                                    } else {
                                        nb3.a0("socket");
                                        throw null;
                                    }
                                }
                                throw new IOException("TLS tunnel buffered too many bytes!");
                            }
                            nb3.a0("socket");
                            throw null;
                        }
                        this.q = socket;
                        List list2 = eaVar2.i;
                        k55 k55Var = k55.H2_PRIOR_KNOWLEDGE;
                        if (!list2.contains(k55Var)) {
                            k55Var = k55.HTTP_1_1;
                        }
                        this.s = k55Var;
                        jz0Var2 = null;
                        try {
                            qz6 qz6Var = this.a;
                            ls1 ls1Var2 = this.b;
                            b26 b26Var2 = this.j;
                            Socket socket4 = this.q;
                            socket4.getClass();
                            pv2 pv2Var = this.r;
                            k55 k55Var2 = this.s;
                            k55Var2.getClass();
                            bt btVar3 = this.t;
                            if (btVar3 != null) {
                                ls1Var.getClass();
                                ke5 ke5Var = new ke5(qz6Var, ls1Var2, b26Var2, socket, socket4, pv2Var, k55Var2, btVar3);
                                this.u = ke5Var;
                                ke5Var.i();
                                inetSocketAddress.getClass();
                                try {
                                    g26 g26Var2 = new g26(this, (Throwable) null, 6);
                                    copyOnWriteArrayList.remove(this);
                                    return g26Var2;
                                } catch (IOException e2) {
                                    e = e2;
                                    jz0Var = jz0Var2;
                                    z = true;
                                    inetSocketAddress.getClass();
                                    ls1Var.getClass();
                                    if (this.g) {
                                        jz0Var3 = jz0Var;
                                    }
                                    g26 g26Var3 = new g26(this, jz0Var3, e);
                                    copyOnWriteArrayList.remove(this);
                                    if (!z) {
                                    }
                                    return g26Var3;
                                } catch (Throwable th) {
                                    th = th;
                                    z = true;
                                    copyOnWriteArrayList.remove(this);
                                    if (!z) {
                                        Socket socket5 = this.q;
                                        if (socket5 != null) {
                                            az7.c(socket5);
                                        }
                                        az7.c(socket);
                                    }
                                    throw th;
                                }
                            }
                            nb3.a0("socket");
                            throw null;
                        } catch (IOException e3) {
                            e = e3;
                            jz0Var = jz0Var2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e4) {
                    e = e4;
                    jz0Var = null;
                }
            } else {
                i.m("already connected");
                return null;
            }
        } else {
            i.h("TCP not connected");
            return null;
        }
    }

    @Override // defpackage.u62
    public final b26 h() {
        return this.j;
    }

    public final void i() {
        int i;
        Socket createSocket;
        Proxy.Type type = this.j.b.type();
        if (type == null) {
            i = -1;
        } else {
            i = iz0.a[type.ordinal()];
        }
        if (i != 1 && i != 2) {
            createSocket = new Socket(this.j.b);
        } else {
            createSocket = this.j.a.b.createSocket();
            createSocket.getClass();
        }
        this.p = createSocket;
        if (!this.o) {
            createSocket.setSoTimeout(this.f);
            try {
                kx4 kx4Var = kx4.a;
                kx4.a.e(createSocket, this.j.c, this.e);
                try {
                    this.t = new bt(new eb(createSocket));
                    return;
                } catch (NullPointerException e) {
                    if (!nb3.k(e.getMessage(), "throw with null exception")) {
                        return;
                    }
                    throw new IOException(e);
                }
            } catch (ConnectException e2) {
                ConnectException connectException = new ConnectException("Failed to connect to " + this.j.c);
                connectException.initCause(e2);
                throw connectException;
            }
        }
        e41.i("canceled");
    }

    public final void j(SSLSocket sSLSocket, xz0 xz0Var) {
        k55 k55Var;
        ea eaVar = this.j.a;
        try {
            if (xz0Var.b) {
                kx4 kx4Var = kx4.a;
                kx4.a.d(sSLSocket, eaVar.h.d, eaVar.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            pv2 j = xk2.j(session);
            HostnameVerifier hostnameVerifier = eaVar.d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(eaVar.h.d, session)) {
                List a = j.a();
                if (!a.isEmpty()) {
                    Object obj = a.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n            |Hostname ");
                    sb.append(eaVar.h.d);
                    sb.append(" not verified:\n            |    certificate: ");
                    il0 il0Var = il0.c;
                    StringBuilder sb2 = new StringBuilder("sha256/");
                    da0 da0Var = da0.R;
                    byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                    encoded.getClass();
                    sb2.append(xd5.t(encoded).c("SHA-256").a());
                    sb.append(sb2.toString());
                    sb.append("\n            |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n            |    subjectAltNames: ");
                    sb.append(gt0.V0(sk4.a(x509Certificate, 7), sk4.a(x509Certificate, 2)));
                    sb.append("\n            ");
                    throw new SSLPeerUnverifiedException(rs6.S(sb.toString()));
                }
                throw new SSLPeerUnverifiedException("Hostname " + eaVar.h.d + " not verified (no certificates)");
            }
            il0 il0Var2 = eaVar.e;
            il0Var2.getClass();
            this.r = new pv2(j.a, j.b, j.c, new u6(il0Var2, j, eaVar, 4));
            eaVar.h.d.getClass();
            Iterator it = il0Var2.a.iterator();
            String str = null;
            if (!it.hasNext()) {
                if (xz0Var.b) {
                    kx4 kx4Var2 = kx4.a;
                    str = kx4.a.f(sSLSocket);
                }
                this.q = sSLSocket;
                this.t = new bt(new eb(sSLSocket));
                if (str != null) {
                    k55.Companion.getClass();
                    k55Var = j55.a(str);
                } else {
                    k55Var = k55.HTTP_1_1;
                }
                this.s = k55Var;
                kx4 kx4Var3 = kx4.a;
                kx4.a.getClass();
                return;
            }
            xg6.A(it.next());
            throw null;
        } catch (Throwable th) {
            kx4 kx4Var4 = kx4.a;
            kx4.a.getClass();
            az7.c(sSLSocket);
            throw th;
        }
    }

    public final g26 k() {
        pa paVar = this.l;
        paVar.getClass();
        b26 b26Var = this.j;
        i03 i03Var = b26Var.a.h;
        String str = "CONNECT " + az7.i(i03Var, true) + " HTTP/1.1";
        bt btVar = this.t;
        if (btVar != null) {
            hz2 hz2Var = new hz2(null, this, btVar);
            bt btVar2 = this.t;
            if (btVar2 != null) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ((fe5) btVar2.L).A.b().g(this.c, timeUnit);
                bt btVar3 = this.t;
                if (btVar3 != null) {
                    ((ee5) btVar3.R).A.b().g(this.d, timeUnit);
                    hz2Var.l((yw2) paVar.R, str);
                    hz2Var.b();
                    ul5 f = hz2Var.f(false);
                    f.getClass();
                    f.a = paVar;
                    wl5 a = f.a();
                    int i = a.R;
                    long e = az7.e(a);
                    if (e != -1) {
                        fz2 k = hz2Var.k((i03) a.A.B, e);
                        az7.g(k, Integer.MAX_VALUE);
                        k.close();
                    }
                    if (i != 200) {
                        if (i == 407) {
                            b26Var.a.f.getClass();
                            e41.i("Failed to authenticate with proxy");
                            return null;
                        }
                        e41.i(lb1.g(i, "Unexpected response code for CONNECT: "));
                        return null;
                    }
                    return new g26(this, (Throwable) null, 6);
                }
                nb3.a0("socket");
                throw null;
            }
            nb3.a0("socket");
            throw null;
        }
        nb3.a0("socket");
        throw null;
    }

    public final jz0 l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        boolean z;
        list.getClass();
        int i = this.m;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            xz0 xz0Var = (xz0) list.get(i2);
            xz0Var.getClass();
            if (xz0Var.a && (((strArr = xz0Var.d) == null || yy7.h(strArr, sSLSocket.getEnabledProtocols(), qb4.b)) && ((strArr2 = xz0Var.c) == null || yy7.h(strArr2, sSLSocket.getEnabledCipherSuites(), rq0.c)))) {
                if (i != -1) {
                    z = true;
                } else {
                    z = false;
                }
                return new jz0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, i2, z);
            }
        }
        return null;
    }

    public final jz0 m(List list, SSLSocket sSLSocket) {
        list.getClass();
        if (this.m != -1) {
            return this;
        }
        jz0 l = l(list, sSLSocket);
        if (l != null) {
            return l;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.n);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String arrays = Arrays.toString(enabledProtocols);
        arrays.getClass();
        sb.append(", supported protocols=");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // defpackage.u62
    public final void e() {
    }

    @Override // defpackage.u62
    public final void f(je5 je5Var, IOException iOException) {
    }
}
