package ti;

import androidx.preference.Preference;
import fj.a0;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import p1.c1;
import pi.c0;
import pi.d0;
import pi.h0;
import pi.y;
import pi.z;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements t, ui.d {

    /* renamed from: a  reason: collision with root package name */
    public final si.c f13190a;

    /* renamed from: b  reason: collision with root package name */
    public final p f13191b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13192c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13193d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13194e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13195f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13196g;

    /* renamed from: h  reason: collision with root package name */
    public final n f13197h;

    /* renamed from: i  reason: collision with root package name */
    public final q f13198i;

    /* renamed from: j  reason: collision with root package name */
    public final h0 f13199j;

    /* renamed from: k  reason: collision with root package name */
    public final List f13200k;

    /* renamed from: l  reason: collision with root package name */
    public final x0 f13201l;
    public final int m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f13202n;

    /* renamed from: o  reason: collision with root package name */
    public volatile boolean f13203o;

    /* renamed from: p  reason: collision with root package name */
    public Socket f13204p;

    /* renamed from: q  reason: collision with root package name */
    public Socket f13205q;

    /* renamed from: r  reason: collision with root package name */
    public pi.p f13206r;

    /* renamed from: s  reason: collision with root package name */
    public z f13207s;

    /* renamed from: t  reason: collision with root package name */
    public c1 f13208t;

    /* renamed from: u  reason: collision with root package name */
    public o f13209u;

    public c(si.c cVar, p pVar, int i2, int i10, int i11, int i12, boolean z10, n nVar, q qVar, h0 h0Var, List list, x0 x0Var, int i13, boolean z11) {
        cVar.getClass();
        pVar.getClass();
        h0Var.getClass();
        this.f13190a = cVar;
        this.f13191b = pVar;
        this.f13192c = i2;
        this.f13193d = i10;
        this.f13194e = i11;
        this.f13195f = i12;
        this.f13196g = z10;
        this.f13197h = nVar;
        this.f13198i = qVar;
        this.f13199j = h0Var;
        this.f13200k = list;
        this.f13201l = x0Var;
        this.m = i13;
        this.f13202n = z11;
    }

    @Override // ti.t
    public final t a() {
        return new c(this.f13190a, this.f13191b, this.f13192c, this.f13193d, this.f13194e, this.f13195f, this.f13196g, this.f13197h, this.f13198i, this.f13199j, this.f13200k, this.f13201l, this.m, this.f13202n);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    @Override // ti.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ti.s b() {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.c.b():ti.s");
    }

    @Override // ti.t
    public final o c() {
        rd.k kVar = this.f13197h.A.f11851z;
        h0 h0Var = this.f13199j;
        synchronized (kVar) {
            h0Var.getClass();
            ((LinkedHashSet) kVar.B).remove(h0Var);
        }
        o oVar = this.f13209u;
        oVar.getClass();
        this.f13199j.getClass();
        r d4 = this.f13198i.d(this, this.f13200k);
        if (d4 != null) {
            return d4.f13263a;
        }
        synchronized (oVar) {
            p pVar = this.f13191b;
            pVar.getClass();
            TimeZone timeZone = qi.g.f12552a;
            pVar.f13247d.add(oVar);
            pVar.f13245b.c(pVar.f13246c, 0L);
            this.f13197h.b(oVar);
        }
        return oVar;
    }

    @Override // ti.t, ui.d
    public final void cancel() {
        this.f13203o = true;
        Socket socket = this.f13204p;
        if (socket != null) {
            qi.g.b(socket);
        }
    }

    @Override // ti.t
    public final boolean d() {
        if (this.f13207s != null) {
            return true;
        }
        return false;
    }

    @Override // ui.d
    public final h0 e() {
        return this.f13199j;
    }

    @Override // ti.t
    public final s f() {
        Socket socket;
        Socket socket2;
        p pVar = this.f13191b;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13197h.f13228l0;
        h0 h0Var = this.f13199j;
        if (this.f13204p == null) {
            copyOnWriteArrayList.add(this);
            boolean z10 = false;
            try {
                try {
                    h0Var.f11727c.getClass();
                    pVar.getClass();
                    i();
                    z10 = true;
                    s sVar = new s(this, (Throwable) null, 6);
                    copyOnWriteArrayList.remove(this);
                    return sVar;
                } catch (IOException e6) {
                    pi.a aVar = h0Var.f11725a;
                    if (h0Var.f11726b.type() != Proxy.Type.DIRECT) {
                        pi.a aVar2 = h0Var.f11725a;
                        aVar2.f11664g.connectFailed(aVar2.f11665h.h(), h0Var.f11726b.address(), e6);
                    }
                    h0Var.f11727c.getClass();
                    pVar.getClass();
                    s sVar2 = new s(this, e6, 2);
                    copyOnWriteArrayList.remove(this);
                    if (!z10 && (socket2 = this.f13204p) != null) {
                        qi.g.b(socket2);
                    }
                    return sVar2;
                }
            } catch (Throwable th2) {
                copyOnWriteArrayList.remove(this);
                if (!z10 && (socket = this.f13204p) != null) {
                    qi.g.b(socket);
                }
                throw th2;
            }
        }
        a0.j.p("TCP already connected");
        return null;
    }

    public final void i() {
        int i2;
        Socket createSocket;
        Proxy.Type type = this.f13199j.f11726b.type();
        if (type == null) {
            i2 = -1;
        } else {
            i2 = b.f13189a[type.ordinal()];
        }
        if (i2 != 1 && i2 != 2) {
            createSocket = new Socket(this.f13199j.f11726b);
        } else {
            createSocket = this.f13199j.f11725a.f11659b.createSocket();
            createSocket.getClass();
        }
        this.f13204p = createSocket;
        if (!this.f13203o) {
            createSocket.setSoTimeout(this.f13195f);
            try {
                zi.f fVar = zi.f.f15151a;
                zi.f.f15151a.e(createSocket, this.f13199j.f11727c, this.f13194e);
                try {
                    this.f13208t = new c1(new b9.e(createSocket));
                    return;
                } catch (NullPointerException e6) {
                    if (!nc.k.a(e6.getMessage(), "throw with null exception")) {
                        return;
                    }
                    throw new IOException(e6);
                }
            } catch (ConnectException e10) {
                ConnectException connectException = new ConnectException("Failed to connect to " + this.f13199j.f11727c);
                connectException.initCause(e10);
                throw connectException;
            }
        }
        fj.j.h("canceled");
    }

    public final void j(SSLSocket sSLSocket, pi.m mVar) {
        z zVar;
        pi.a aVar = this.f13199j.f11725a;
        try {
            if (mVar.f11758b) {
                zi.f fVar = zi.f.f15151a;
                zi.f.f15151a.d(sSLSocket, aVar.f11665h.f11784d, aVar.f11666i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            pi.p l10 = p7.l.l(session);
            HostnameVerifier hostnameVerifier = aVar.f11661d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(aVar.f11665h.f11784d, session)) {
                List a10 = l10.a();
                if (!a10.isEmpty()) {
                    Object obj = a10.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb2 = new StringBuilder("\n            |Hostname ");
                    sb2.append(aVar.f11665h.f11784d);
                    sb2.append(" not verified:\n            |    certificate: ");
                    pi.i iVar = pi.i.f11728c;
                    StringBuilder sb3 = new StringBuilder("sha256/");
                    fj.h hVar = fj.h.R;
                    byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                    encoded.getClass();
                    sb3.append(na.f.j(encoded).c("SHA-256").a());
                    sb2.append(sb3.toString());
                    sb2.append("\n            |    DN: ");
                    sb2.append(x509Certificate.getSubjectDN().getName());
                    sb2.append("\n            |    subjectAltNames: ");
                    sb2.append(zb.l.e0(dj.c.a(x509Certificate, 7), dj.c.a(x509Certificate, 2)));
                    sb2.append("\n            ");
                    throw new SSLPeerUnverifiedException(vc.i.K(sb2.toString()));
                }
                throw new SSLPeerUnverifiedException("Hostname " + aVar.f11665h.f11784d + " not verified (no certificates)");
            }
            pi.i iVar2 = aVar.f11662e;
            iVar2.getClass();
            this.f13206r = new pi.p(l10.f11777a, l10.f11778b, l10.f11779c, new ai.p(iVar2, l10, aVar, 13));
            aVar.f11665h.f11784d.getClass();
            Iterator it = iVar2.f11729a.iterator();
            String str = null;
            if (!it.hasNext()) {
                if (mVar.f11758b) {
                    zi.f fVar2 = zi.f.f15151a;
                    str = zi.f.f15151a.f(sSLSocket);
                }
                this.f13205q = sSLSocket;
                this.f13208t = new c1(new b9.e(sSLSocket));
                if (str != null) {
                    z.Companion.getClass();
                    zVar = y.a(str);
                } else {
                    zVar = z.HTTP_1_1;
                }
                this.f13207s = zVar;
                zi.f fVar3 = zi.f.f15151a;
                zi.f.f15151a.getClass();
                return;
            }
            w.d.A(it.next());
            throw null;
        } catch (Throwable th2) {
            zi.f fVar4 = zi.f.f15151a;
            zi.f.f15151a.getClass();
            qi.g.b(sSLSocket);
            throw th2;
        }
    }

    public final s k() {
        x0 x0Var = this.f13201l;
        x0Var.getClass();
        h0 h0Var = this.f13199j;
        pi.r rVar = h0Var.f11725a.f11665h;
        String str = "CONNECT " + qi.g.h(rVar, true) + " HTTP/1.1";
        c1 c1Var = this.f13208t;
        if (c1Var != null) {
            vi.g gVar = new vi.g(null, this, c1Var);
            c1 c1Var2 = this.f13208t;
            if (c1Var2 != null) {
                ((a0) c1Var2.B).A.f().g(this.f13192c);
                c1 c1Var3 = this.f13208t;
                if (c1Var3 != null) {
                    ((fj.z) c1Var3.L).A.f().g(this.f13193d);
                    gVar.l((pi.q) x0Var.f14091d, str);
                    gVar.d();
                    c0 j2 = gVar.j(false);
                    j2.getClass();
                    j2.f11675a = x0Var;
                    d0 a10 = j2.a();
                    int i2 = a10.R;
                    long d4 = qi.g.d(a10);
                    if (d4 != -1) {
                        vi.d k10 = gVar.k((pi.r) a10.A.f14089b, d4);
                        qi.g.f(k10, Preference.DEFAULT_ORDER);
                        k10.close();
                    }
                    if (i2 != 200) {
                        if (i2 == 407) {
                            h0Var.f11725a.f11663f.getClass();
                            fj.j.h("Failed to authenticate with proxy");
                            return null;
                        }
                        fj.j.h(w.d.l(i2, "Unexpected response code for CONNECT: "));
                        return null;
                    }
                    return new s(this, (Throwable) null, 6);
                }
                nc.k.f("socket");
                throw null;
            }
            nc.k.f("socket");
            throw null;
        }
        nc.k.f("socket");
        throw null;
    }

    public final c l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        boolean z10;
        list.getClass();
        int i2 = this.m;
        int size = list.size();
        for (int i10 = i2 + 1; i10 < size; i10++) {
            pi.m mVar = (pi.m) list.get(i10);
            mVar.getClass();
            if (mVar.f11757a && (((strArr = mVar.f11760d) == null || qi.e.g(strArr, sSLSocket.getEnabledProtocols(), bc.b.f2160b)) && ((strArr2 = mVar.f11759c) == null || qi.e.g(strArr2, sSLSocket.getEnabledCipherSuites(), pi.k.f11732c)))) {
                if (i2 != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return new c(this.f13190a, this.f13191b, this.f13192c, this.f13193d, this.f13194e, this.f13195f, this.f13196g, this.f13197h, this.f13198i, this.f13199j, this.f13200k, this.f13201l, i10, z10);
            }
        }
        return null;
    }

    public final c m(List list, SSLSocket sSLSocket) {
        list.getClass();
        if (this.m != -1) {
            return this;
        }
        c l10 = l(list, sSLSocket);
        if (l10 != null) {
            return l10;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f13202n);
        sb2.append(", modes=");
        sb2.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String arrays = Arrays.toString(enabledProtocols);
        arrays.getClass();
        sb2.append(", supported protocols=");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    @Override // ui.d
    public final void h() {
    }

    @Override // ui.d
    public final void g(n nVar, IOException iOException) {
    }
}
