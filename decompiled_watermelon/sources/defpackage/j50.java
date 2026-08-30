package defpackage;

import androidx.preference.Preference;
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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j50  reason: default package */
/* loaded from: classes.dex */
public final class j50 implements n33 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public j50(y60 y60Var) {
        y60Var.getClass();
        this.b = y60Var;
    }

    public static int d(ec5 ec5Var, int i) {
        String b = ec5Var.Y.b("Retry-After");
        if (b == null) {
            b = null;
        }
        if (b == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (compile.matcher(b).matches()) {
            Integer valueOf = Integer.valueOf(b);
            valueOf.getClass();
            return valueOf.intValue();
        }
        return Preference.DEFAULT_ORDER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0186, code lost:
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0776  */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, c80] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [xf1] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v9, types: [c80] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [xf1] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v25 */
    @Override // defpackage.n33
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ec5 a(defpackage.fi3 r44) {
        /*
            Method dump skipped, instructions count: 2270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j50.a(fi3):ec5");
    }

    public ka b(ec5 ec5Var, xf1 xf1Var) {
        ir5 ir5Var;
        gu2 gu2Var;
        hu2 hu2Var;
        ua5 ua5Var;
        ec5 ec5Var2;
        ua5 ua5Var2 = null;
        if (xf1Var != null) {
            ir5Var = xf1Var.j().c;
        } else {
            ir5Var = null;
        }
        int i = ec5Var.R;
        ka kaVar = ec5Var.A;
        String str = (String) kaVar.L;
        boolean z = false;
        if (i != 307 && i != 308) {
            if (i != 401) {
                if (i != 421) {
                    if (i != 503) {
                        if (i != 407) {
                            if (i != 408) {
                                switch (i) {
                                }
                            } else if (((zb4) this.b).e && (((ua5Var = (ua5) kaVar.X) == null || !ua5Var.c()) && (((ec5Var2 = ec5Var.f0) == null || ec5Var2.R != 408) && d(ec5Var, 0) <= 0))) {
                                return ec5Var.A;
                            }
                        } else {
                            ir5Var.getClass();
                            if (ir5Var.b.type() == Proxy.Type.HTTP) {
                                ((zb4) this.b).n.getClass();
                                return null;
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        ec5 ec5Var3 = ec5Var.f0;
                        if ((ec5Var3 == null || ec5Var3.R != 503) && d(ec5Var, Preference.DEFAULT_ORDER) == 0) {
                            return ec5Var.A;
                        }
                    }
                } else {
                    ua5 ua5Var3 = (ua5) kaVar.X;
                    if ((ua5Var3 == null || !ua5Var3.c()) && xf1Var != null && !b53.x(((f22) xf1Var.B).e().i.h.d, ((e22) xf1Var.R).f().f().a.h.d)) {
                        x45 j = xf1Var.j();
                        synchronized (j) {
                            j.k = true;
                        }
                        return ec5Var.A;
                    }
                }
                return null;
            }
            ((zb4) this.b).g.getClass();
            return null;
        }
        zb4 zb4Var = (zb4) this.b;
        if (zb4Var.h) {
            String b = ec5Var.Y.b("Location");
            if (b == null) {
                b = null;
            }
            ka kaVar2 = ec5Var.A;
            if (b != null) {
                hu2 hu2Var2 = (hu2) kaVar2.B;
                hu2Var2.getClass();
                try {
                    gu2Var = new gu2(0);
                    gu2Var.e(hu2Var2, b);
                } catch (IllegalArgumentException unused) {
                    gu2Var = null;
                }
                if (gu2Var != null) {
                    hu2Var = gu2Var.b();
                } else {
                    hu2Var = null;
                }
                if (hu2Var != null && (b53.x(hu2Var.a, ((hu2) kaVar2.B).a) || zb4Var.i)) {
                    r9 m = kaVar2.m();
                    if (sn2.K(str)) {
                        int i2 = ec5Var.R;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            z = true;
                        }
                        if (!str.equals("PROPFIND") && i2 != 308 && i2 != 307) {
                            m.D("GET", null);
                        } else {
                            if (z) {
                                ua5Var2 = (ua5) kaVar2.X;
                            }
                            m.D(str, ua5Var2);
                        }
                        if (!z) {
                            ((vq2) m.c).r("Transfer-Encoding");
                            ((vq2) m.c).r("Content-Length");
                            ((vq2) m.c).r("Content-Type");
                        }
                    }
                    if (!ik7.a((hu2) kaVar2.B, hu2Var)) {
                        ((vq2) m.c).r("Authorization");
                    }
                    m.a = hu2Var;
                    return new ka(m);
                }
            }
        }
        return null;
    }

    public boolean c(IOException iOException, w45 w45Var, ka kaVar) {
        x45 x45Var;
        ua5 ua5Var;
        boolean z = iOException instanceof yw0;
        if (((zb4) this.b).e) {
            if ((z || (((ua5Var = (ua5) kaVar.X) == null || !ua5Var.c()) && !(iOException instanceof FileNotFoundException))) && !(iOException instanceof ProtocolException)) {
                if (iOException instanceof InterruptedIOException) {
                    if (!(iOException instanceof SocketTimeoutException) || !z) {
                        return false;
                    }
                } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                    return false;
                }
                xf1 xf1Var = w45Var.l0;
                if (xf1Var != null && xf1Var.A) {
                    f22 f22Var = w45Var.Z;
                    f22Var.getClass();
                    h55 e = f22Var.e();
                    xf1 xf1Var2 = w45Var.l0;
                    if (xf1Var2 != null) {
                        x45Var = xf1Var2.j();
                    } else {
                        x45Var = null;
                    }
                    if (e.a(x45Var)) {
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

    public j50(d80 d80Var) {
        this.b = d80Var;
    }

    public j50(zb4 zb4Var) {
        zb4Var.getClass();
        this.b = zb4Var;
    }
}
