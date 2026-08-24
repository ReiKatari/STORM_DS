package defpackage;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xk4  reason: default package */
/* loaded from: classes.dex */
public final class xk4 {
    public static final List E = az7.k(new k55[]{k55.HTTP_2, k55.HTTP_1_1});
    public static final List F = az7.k(new xz0[]{xz0.g, xz0.h});
    public final long A;
    public final il5 B;
    public final qz6 C;
    public final os0 D;
    public final eb a;
    public final List b;
    public final List c;
    public final fa6 d;
    public final boolean e;
    public final boolean f;
    public final xd5 g;
    public final boolean h;
    public final boolean i;
    public final vs0 j;
    public final la0 k;
    public final d90 l;
    public final ProxySelector m;
    public final xd5 n;
    public final SocketFactory o;
    public final SSLSocketFactory p;
    public final X509TrustManager q;
    public final List r;
    public final List s;
    public final sk4 t;
    public final il0 u;
    public final q60 v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX WARN: Removed duplicated region for block: B:52:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xk4(wk4 wk4Var) {
        List list;
        this.a = wk4Var.a;
        this.b = az7.j(wk4Var.c);
        this.c = az7.j(wk4Var.d);
        this.d = wk4Var.e;
        this.e = wk4Var.f;
        this.f = wk4Var.g;
        this.g = wk4Var.h;
        this.h = wk4Var.i;
        this.i = wk4Var.j;
        this.j = wk4Var.k;
        this.k = wk4Var.l;
        this.l = wk4Var.m;
        ProxySelector proxySelector = wk4Var.n;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = dh4.a;
        }
        this.m = proxySelector;
        this.n = wk4Var.o;
        this.o = wk4Var.p;
        List<xz0> list2 = wk4Var.s;
        this.r = list2;
        this.s = wk4Var.t;
        this.t = wk4Var.u;
        this.w = wk4Var.x;
        this.x = wk4Var.y;
        this.y = wk4Var.z;
        this.z = wk4Var.A;
        this.A = wk4Var.B;
        il5 il5Var = wk4Var.C;
        this.B = il5Var == null ? new il5() : il5Var;
        qz6 qz6Var = wk4Var.D;
        this.C = qz6Var == null ? qz6.l : qz6Var;
        os0 os0Var = wk4Var.b;
        if (os0Var == null) {
            os0Var = new os0(27);
            wk4Var.b = os0Var;
        }
        this.D = os0Var;
        if (list2 == null || !list2.isEmpty()) {
            for (xz0 xz0Var : list2) {
                if (xz0Var.a) {
                    SSLSocketFactory sSLSocketFactory = wk4Var.q;
                    if (sSLSocketFactory != null) {
                        this.p = sSLSocketFactory;
                        q60 q60Var = wk4Var.w;
                        q60Var.getClass();
                        this.v = q60Var;
                        X509TrustManager x509TrustManager = wk4Var.r;
                        x509TrustManager.getClass();
                        this.q = x509TrustManager;
                        il0 il0Var = wk4Var.v;
                        il0Var.getClass();
                        this.u = nb3.k(il0Var.b, q60Var) ? il0Var : new il0(il0Var.a, q60Var);
                    } else {
                        kx4 kx4Var = kx4.a;
                        kx4.a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager2 = (X509TrustManager) trustManager;
                                this.q = x509TrustManager2;
                                kx4 kx4Var2 = kx4.a;
                                kx4Var2.getClass();
                                try {
                                    SSLContext k = kx4Var2.k();
                                    k.init(null, new TrustManager[]{x509TrustManager2}, null);
                                    SSLSocketFactory socketFactory = k.getSocketFactory();
                                    socketFactory.getClass();
                                    this.p = socketFactory;
                                    q60 c = kx4.a.c(x509TrustManager2);
                                    this.v = c;
                                    il0 il0Var2 = wk4Var.v;
                                    il0Var2.getClass();
                                    this.u = nb3.k(il0Var2.b, c) ? il0Var2 : new il0(il0Var2.a, c);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String arrays = Arrays.toString(trustManagers);
                        arrays.getClass();
                        u34.f("Unexpected default trust managers: ".concat(arrays));
                        throw null;
                    }
                    X509TrustManager x509TrustManager3 = this.q;
                    q60 q60Var2 = this.v;
                    SSLSocketFactory sSLSocketFactory2 = this.p;
                    List list3 = this.c;
                    list = this.b;
                    list.getClass();
                    if (list.contains(null)) {
                        list3.getClass();
                        if (!list3.contains(null)) {
                            List<xz0> list4 = this.r;
                            if (list4 == null || !list4.isEmpty()) {
                                for (xz0 xz0Var2 : list4) {
                                    if (xz0Var2.a) {
                                        if (sSLSocketFactory2 != null) {
                                            if (q60Var2 != null) {
                                                if (x509TrustManager3 == null) {
                                                    i.m("x509TrustManager == null");
                                                    throw null;
                                                }
                                                return;
                                            }
                                            i.m("certificateChainCleaner == null");
                                            throw null;
                                        }
                                        i.m("sslSocketFactory == null");
                                        throw null;
                                    }
                                }
                            }
                            if (sSLSocketFactory2 == null) {
                                if (q60Var2 == null) {
                                    if (x509TrustManager3 == null) {
                                        if (nb3.k(this.u, il0.c)) {
                                            return;
                                        }
                                        i.m("Check failed.");
                                        throw null;
                                    }
                                    i.m("Check failed.");
                                    throw null;
                                }
                                i.m("Check failed.");
                                throw null;
                            }
                            i.m("Check failed.");
                            throw null;
                        }
                        u34.i(list3, "Null network interceptor: ");
                        throw null;
                    }
                    u34.i(list, "Null interceptor: ");
                    throw null;
                }
            }
        }
        this.p = null;
        this.v = null;
        this.q = null;
        this.u = il0.c;
        X509TrustManager x509TrustManager32 = this.q;
        q60 q60Var22 = this.v;
        SSLSocketFactory sSLSocketFactory22 = this.p;
        List list32 = this.c;
        list = this.b;
        list.getClass();
        if (list.contains(null)) {
        }
    }

    public xk4() {
        this(new wk4());
    }
}
