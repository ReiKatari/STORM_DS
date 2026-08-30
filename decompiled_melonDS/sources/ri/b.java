package ri;

import a7.v;
import androidx.preference.Preference;
import j0.o1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import na.a0;
import nc.k;
import pi.b0;
import pi.d0;
import pi.h0;
import pi.r;
import pi.s;
import pi.x;
import ti.n;
import ti.o;
import ti.q;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12747a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f12748b;

    public b(pi.b bVar) {
        bVar.getClass();
        this.f12748b = bVar;
    }

    public static int d(d0 d0Var, int i2) {
        String a10 = d0Var.Y.a("Retry-After");
        if (a10 == null) {
            a10 = null;
        }
        if (a10 == null) {
            return i2;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (compile.matcher(a10).matches()) {
            Integer valueOf = Integer.valueOf(a10);
            valueOf.getClass();
            return valueOf.intValue();
        }
        return Preference.DEFAULT_ORDER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0186, code lost:
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0876  */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, l2.g] */
    /* JADX WARN: Type inference failed for: r15v4, types: [l2.g] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [e9.a] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [e9.a] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v23 */
    @Override // pi.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final pi.d0 a(ui.g r45) {
        /*
            Method dump skipped, instructions count: 2262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.b.a(ui.g):pi.d0");
    }

    public x0 b(d0 d0Var, e9.a aVar) {
        h0 h0Var;
        a0 a0Var;
        r rVar;
        b0 b0Var;
        d0 d0Var2;
        b0 b0Var2 = null;
        if (aVar != null) {
            h0Var = aVar.h().f13230c;
        } else {
            h0Var = null;
        }
        int i2 = d0Var.R;
        x0 x0Var = d0Var.A;
        String str = (String) x0Var.f14090c;
        boolean z10 = false;
        if (i2 != 307 && i2 != 308) {
            if (i2 != 401) {
                if (i2 != 421) {
                    if (i2 != 503) {
                        if (i2 != 407) {
                            if (i2 != 408) {
                                switch (i2) {
                                }
                            } else if (((x) this.f12748b).f11831e && (((b0Var = (b0) x0Var.f14092e) == null || !b0Var.c()) && (((d0Var2 = d0Var.f11704e0) == null || d0Var2.R != 408) && d(d0Var, 0) <= 0))) {
                                return d0Var.A;
                            }
                        } else {
                            h0Var.getClass();
                            if (h0Var.f11726b.type() == Proxy.Type.HTTP) {
                                ((x) this.f12748b).f11839n.getClass();
                                return null;
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        d0 d0Var3 = d0Var.f11704e0;
                        if ((d0Var3 == null || d0Var3.R != 503) && d(d0Var, Preference.DEFAULT_ORDER) == 0) {
                            return d0Var.A;
                        }
                    }
                } else {
                    b0 b0Var3 = (b0) x0Var.f14092e;
                    if ((b0Var3 == null || !b0Var3.c()) && aVar != null && !k.a(((ti.g) aVar.f4416c).g().f13256i.f11665h.f11784d, ((ui.e) aVar.f4417d).h().e().f11725a.f11665h.f11784d)) {
                        o h2 = aVar.h();
                        synchronized (h2) {
                            h2.f13238k = true;
                        }
                        return d0Var.A;
                    }
                }
                return null;
            }
            ((x) this.f12748b).f11833g.getClass();
            return null;
        }
        x xVar = (x) this.f12748b;
        if (xVar.f11834h) {
            String a10 = d0Var.Y.a("Location");
            if (a10 == null) {
                a10 = null;
            }
            x0 x0Var2 = d0Var.A;
            if (a10 != null) {
                r rVar2 = (r) x0Var2.f14089b;
                rVar2.getClass();
                try {
                    a0Var = new a0(1);
                    a0Var.e(rVar2, a10);
                } catch (IllegalArgumentException unused) {
                    a0Var = null;
                }
                if (a0Var != null) {
                    rVar = a0Var.b();
                } else {
                    rVar = null;
                }
                if (rVar != null && (k.a(rVar.f11781a, ((r) x0Var2.f14089b).f11781a) || xVar.f11835i)) {
                    v m = x0Var2.m();
                    if (zb.k.F(str)) {
                        int i10 = d0Var.R;
                        if (str.equals("PROPFIND") || i10 == 308 || i10 == 307) {
                            z10 = true;
                        }
                        if (!str.equals("PROPFIND") && i10 != 308 && i10 != 307) {
                            m.u("GET", null);
                        } else {
                            if (z10) {
                                b0Var2 = (b0) x0Var2.f14092e;
                            }
                            m.u(str, b0Var2);
                        }
                        if (!z10) {
                            ((o1) m.L).s("Transfer-Encoding");
                            ((o1) m.L).s("Content-Length");
                            ((o1) m.L).s("Content-Type");
                        }
                    }
                    if (!qi.g.a((r) x0Var2.f14089b, rVar)) {
                        ((o1) m.L).s("Authorization");
                    }
                    m.A = rVar;
                    return new x0(m);
                }
            }
        }
        return null;
    }

    public boolean c(IOException iOException, n nVar, x0 x0Var) {
        o oVar;
        b0 b0Var;
        boolean z10 = iOException instanceof wi.a;
        if (((x) this.f12748b).f11831e) {
            if ((z10 || (((b0Var = (b0) x0Var.f14092e) == null || !b0Var.c()) && !(iOException instanceof FileNotFoundException))) && !(iOException instanceof ProtocolException)) {
                if (iOException instanceof InterruptedIOException) {
                    if (!(iOException instanceof SocketTimeoutException) || !z10) {
                        return false;
                    }
                } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                    return false;
                }
                e9.a aVar = nVar.f13227k0;
                if (aVar != null && aVar.f4414a) {
                    ti.g gVar = nVar.Z;
                    gVar.getClass();
                    q g10 = gVar.g();
                    e9.a aVar2 = nVar.f13227k0;
                    if (aVar2 != null) {
                        oVar = aVar2.h();
                    } else {
                        oVar = null;
                    }
                    if (g10.a(oVar)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public b(pi.f fVar) {
        this.f12748b = fVar;
    }

    public b(x xVar) {
        xVar.getClass();
        this.f12748b = xVar;
    }
}
