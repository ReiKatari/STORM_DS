package defpackage;

import androidx.preference.Preference;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mw0  reason: default package */
/* loaded from: classes.dex */
public final class mw0 implements or5, d22 {
    public final fn6 a;
    public final bo1 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final w45 h;
    public final h55 i;
    public final ir5 j;
    public final List k;
    public final ka l;
    public final int m;
    public final boolean n;
    public volatile boolean o;
    public Socket p;
    public Socket q;
    public op2 r;
    public dw4 s;
    public os t;
    public x45 u;

    public mw0(fn6 fn6Var, bo1 bo1Var, int i, int i2, int i3, int i4, boolean z, w45 w45Var, h55 h55Var, ir5 ir5Var, List list, ka kaVar, int i5, boolean z2) {
        fn6Var.getClass();
        bo1Var.getClass();
        ir5Var.getClass();
        this.a = fn6Var;
        this.b = bo1Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = w45Var;
        this.i = h55Var;
        this.j = ir5Var;
        this.k = list;
        this.l = kaVar;
        this.m = i5;
        this.n = z2;
    }

    @Override // defpackage.or5
    public final or5 a() {
        return new mw0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    @Override // defpackage.or5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nr5 c() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw0.c():nr5");
    }

    @Override // defpackage.or5, defpackage.d22
    public final void cancel() {
        this.o = true;
        Socket socket = this.p;
        if (socket != null) {
            ik7.b(socket);
        }
    }

    @Override // defpackage.or5
    public final x45 d() {
        qb5 qb5Var = this.h.A.z;
        ir5 ir5Var = this.j;
        synchronized (qb5Var) {
            ir5Var.getClass();
            qb5Var.b.remove(ir5Var);
        }
        x45 x45Var = this.u;
        x45Var.getClass();
        this.j.getClass();
        sf5 d = this.i.d(this, this.k);
        if (d != null) {
            return d.a;
        }
        synchronized (x45Var) {
            bo1 bo1Var = this.b;
            bo1Var.getClass();
            TimeZone timeZone = ik7.a;
            ((ConcurrentLinkedQueue) bo1Var.d).add(x45Var);
            ((en6) bo1Var.b).c((dg1) bo1Var.c, 0L);
            this.h.b(x45Var);
        }
        return x45Var;
    }

    @Override // defpackage.or5
    public final boolean e() {
        if (this.s != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.d22
    public final ir5 f() {
        return this.j;
    }

    @Override // defpackage.or5
    public final nr5 g() {
        Socket socket;
        Socket socket2;
        bo1 bo1Var = this.b;
        CopyOnWriteArrayList copyOnWriteArrayList = this.h.m0;
        ir5 ir5Var = this.j;
        if (this.p == null) {
            copyOnWriteArrayList.add(this);
            boolean z = false;
            try {
                try {
                    ir5Var.c.getClass();
                    bo1Var.getClass();
                    i();
                    z = true;
                    nr5 nr5Var = new nr5(this, (Throwable) null, 6);
                    copyOnWriteArrayList.remove(this);
                    return nr5Var;
                } catch (IOException e) {
                    da daVar = ir5Var.a;
                    if (ir5Var.b.type() != Proxy.Type.DIRECT) {
                        da daVar2 = ir5Var.a;
                        daVar2.g.connectFailed(daVar2.h.h(), ir5Var.b.address(), e);
                    }
                    ir5Var.c.getClass();
                    bo1Var.getClass();
                    nr5 nr5Var2 = new nr5(this, e, 2);
                    copyOnWriteArrayList.remove(this);
                    if (!z && (socket2 = this.p) != null) {
                        ik7.b(socket2);
                    }
                    return nr5Var2;
                }
            } catch (Throwable th) {
                copyOnWriteArrayList.remove(this);
                if (!z && (socket = this.p) != null) {
                    ik7.b(socket);
                }
                throw th;
            }
        }
        i.n("TCP already connected");
        return null;
    }

    public final void i() {
        int i;
        Socket createSocket;
        Proxy.Type type = this.j.b.type();
        if (type == null) {
            i = -1;
        } else {
            i = lw0.a[type.ordinal()];
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
                fo4 fo4Var = fo4.a;
                fo4.a.e(createSocket, this.j.c, this.e);
                try {
                    this.t = new os(new q9(createSocket));
                    return;
                } catch (NullPointerException e) {
                    if (!b53.x(e.getMessage(), "throw with null exception")) {
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
        f81.j("canceled");
    }

    public final void j(SSLSocket sSLSocket, ax0 ax0Var) {
        dw4 dw4Var;
        da daVar = this.j.a;
        try {
            if (ax0Var.b) {
                fo4 fo4Var = fo4.a;
                fo4.a.d(sSLSocket, daVar.h.d, daVar.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            op2 z = ve2.z(session);
            HostnameVerifier hostnameVerifier = daVar.d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(daVar.h.d, session)) {
                List a = z.a();
                if (!a.isEmpty()) {
                    Object obj = a.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n            |Hostname ");
                    sb.append(daVar.h.d);
                    sb.append(" not verified:\n            |    certificate: ");
                    zi0 zi0Var = zi0.c;
                    StringBuilder sb2 = new StringBuilder("sha256/");
                    w70 w70Var = w70.R;
                    byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                    encoded.getClass();
                    sb2.append(iq0.t(encoded).c("SHA-256").a());
                    sb.append(sb2.toString());
                    sb.append("\n            |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n            |    subjectAltNames: ");
                    sb.append(tq0.X0(ub4.a(x509Certificate, 7), ub4.a(x509Certificate, 2)));
                    sb.append("\n            ");
                    throw new SSLPeerUnverifiedException(ah6.Z(sb.toString()));
                }
                throw new SSLPeerUnverifiedException("Hostname " + daVar.h.d + " not verified (no certificates)");
            }
            zi0 zi0Var2 = daVar.e;
            zi0Var2.getClass();
            this.r = new op2(z.a, z.b, z.c, new t6(zi0Var2, z, daVar, 4));
            daVar.h.d.getClass();
            Iterator it = zi0Var2.a.iterator();
            String str = null;
            if (!it.hasNext()) {
                if (ax0Var.b) {
                    fo4 fo4Var2 = fo4.a;
                    str = fo4.a.f(sSLSocket);
                }
                this.q = sSLSocket;
                this.t = new os(new q9(sSLSocket));
                if (str != null) {
                    dw4.Companion.getClass();
                    dw4Var = cw4.a(str);
                } else {
                    dw4Var = dw4.HTTP_1_1;
                }
                this.s = dw4Var;
                fo4 fo4Var3 = fo4.a;
                fo4.a.getClass();
                return;
            }
            ej6.j(it.next());
            throw null;
        } catch (Throwable th) {
            fo4 fo4Var4 = fo4.a;
            fo4.a.getClass();
            ik7.b(sSLSocket);
            throw th;
        }
    }

    public final nr5 k() {
        ka kaVar = this.l;
        kaVar.getClass();
        ir5 ir5Var = this.j;
        hu2 hu2Var = ir5Var.a.h;
        String str = "CONNECT " + ik7.h(hu2Var, true) + " HTTP/1.1";
        os osVar = this.t;
        if (osVar != null) {
            ht2 ht2Var = new ht2(null, this, osVar);
            os osVar2 = this.t;
            if (osVar2 != null) {
                ((s45) osVar2.L).A.f().g(this.c);
                os osVar3 = this.t;
                if (osVar3 != null) {
                    ((r45) osVar3.R).A.f().g(this.d);
                    ht2Var.l((xq2) kaVar.R, str);
                    ht2Var.b();
                    cc5 j = ht2Var.j(false);
                    j.getClass();
                    j.a = kaVar;
                    ec5 a = j.a();
                    int i = a.R;
                    long d = ik7.d(a);
                    if (d != -1) {
                        et2 k = ht2Var.k((hu2) a.A.B, d);
                        ik7.f(k, Preference.DEFAULT_ORDER);
                        k.close();
                    }
                    if (i != 200) {
                        if (i == 407) {
                            ir5Var.a.f.getClass();
                            f81.j("Failed to authenticate with proxy");
                            return null;
                        }
                        f81.j(wh1.g(i, "Unexpected response code for CONNECT: "));
                        return null;
                    }
                    return new nr5(this, (Throwable) null, 6);
                }
                b53.g0("socket");
                throw null;
            }
            b53.g0("socket");
            throw null;
        }
        b53.g0("socket");
        throw null;
    }

    public final mw0 l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        boolean z;
        list.getClass();
        int i = this.m;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ax0 ax0Var = (ax0) list.get(i2);
            ax0Var.getClass();
            if (ax0Var.a && (((strArr = ax0Var.d) == null || gk7.g(strArr, sSLSocket.getEnabledProtocols(), j34.b)) && ((strArr2 = ax0Var.c) == null || gk7.g(strArr2, sSLSocket.getEnabledCipherSuites(), ho0.c)))) {
                if (i != -1) {
                    z = true;
                } else {
                    z = false;
                }
                return new mw0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, i2, z);
            }
        }
        return null;
    }

    public final mw0 m(List list, SSLSocket sSLSocket) {
        list.getClass();
        if (this.m != -1) {
            return this;
        }
        mw0 l = l(list, sSLSocket);
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

    @Override // defpackage.d22
    public final void h() {
    }

    @Override // defpackage.d22
    public final void b(w45 w45Var, IOException iOException) {
    }
}
