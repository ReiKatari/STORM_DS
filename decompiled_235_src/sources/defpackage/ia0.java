package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ia0  reason: default package */
/* loaded from: classes.dex */
public final class ia0 {
    public static final String k;
    public static final String l;
    public final i03 a;
    public final yw2 b;
    public final String c;
    public final k55 d;
    public final int e;
    public final String f;
    public final yw2 g;
    public final pv2 h;
    public final long i;
    public final long j;

    static {
        kx4 kx4Var = kx4.a;
        kx4.a.getClass();
        k = "OkHttp-Sent-Millis";
        kx4.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public ia0(in6 in6Var) {
        i03 i03Var;
        long j;
        l67 l67Var;
        in6Var.getClass();
        try {
            fe5 fe5Var = new fe5(in6Var);
            String y = fe5Var.y(Long.MAX_VALUE);
            try {
                h03 h03Var = new h03(0);
                h03Var.e(null, y);
                i03Var = h03Var.b();
            } catch (IllegalArgumentException unused) {
                i03Var = null;
            }
            if (i03Var != null) {
                this.a = i03Var;
                this.c = fe5Var.y(Long.MAX_VALUE);
                ww2 ww2Var = new ww2(0, (byte) 0);
                int N = g04.N(fe5Var);
                for (int i = 0; i < N; i++) {
                    ww2Var.c(fe5Var.y(Long.MAX_VALUE));
                }
                this.b = ww2Var.f();
                ei E = xk2.E(fe5Var.y(Long.MAX_VALUE));
                this.d = (k55) E.L;
                this.e = E.B;
                this.f = (String) E.R;
                ww2 ww2Var2 = new ww2(0, (byte) 0);
                int N2 = g04.N(fe5Var);
                for (int i2 = 0; i2 < N2; i2++) {
                    ww2Var2.c(fe5Var.y(Long.MAX_VALUE));
                }
                String str = k;
                String j2 = ww2Var2.j(str);
                String str2 = l;
                String j3 = ww2Var2.j(str2);
                ww2Var2.r(str);
                ww2Var2.r(str2);
                if (j2 != null) {
                    j = Long.parseLong(j2);
                } else {
                    j = 0;
                }
                this.i = j;
                this.j = j3 != null ? Long.parseLong(j3) : 0L;
                this.g = ww2Var2.f();
                if (this.a.f()) {
                    String y2 = fe5Var.y(Long.MAX_VALUE);
                    if (y2.length() <= 0) {
                        rq0 r = rq0.b.r(fe5Var.y(Long.MAX_VALUE));
                        List a = a(fe5Var);
                        List a2 = a(fe5Var);
                        if (!fe5Var.e()) {
                            k67 k67Var = l67.Companion;
                            String y3 = fe5Var.y(Long.MAX_VALUE);
                            k67Var.getClass();
                            l67Var = k67.a(y3);
                        } else {
                            l67Var = l67.SSL_3_0;
                        }
                        l67Var.getClass();
                        this.h = new pv2(l67Var, r, az7.j(a2), new b5(2, az7.j(a)));
                    } else {
                        throw new IOException("expected \"\" but was \"" + y2 + '\"');
                    }
                } else {
                    this.h = null;
                }
                in6Var.close();
                return;
            }
            IOException iOException = new IOException("Cache corruption for ".concat(y));
            kx4 kx4Var = kx4.a;
            kx4.a.i("cache corruption", 5, iOException);
            throw iOException;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ge7.t(in6Var, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [k80, z80, java.lang.Object] */
    public static List a(fe5 fe5Var) {
        int N = g04.N(fe5Var);
        if (N == -1) {
            return yt1.A;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(N);
            for (int i = 0; i < N; i++) {
                String y = fe5Var.y(Long.MAX_VALUE);
                ?? obj = new Object();
                da0 da0Var = da0.R;
                da0 m = xd5.m(y);
                if (m != null) {
                    obj.k0(m);
                    arrayList.add(certificateFactory.generateCertificate(new j80(obj, 0)));
                } else {
                    throw new IOException("Corrupt certificate in cache entry");
                }
            }
            return arrayList;
        } catch (CertificateException e) {
            e41.i(e.getMessage());
            return null;
        }
    }

    public static void b(ee5 ee5Var, List list) {
        try {
            ee5Var.h0(list.size());
            ee5Var.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                da0 da0Var = da0.R;
                encoded.getClass();
                ee5Var.H(xd5.t(encoded).a());
                ee5Var.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            e41.i(e.getMessage());
        }
    }

    public final void c(bk1 bk1Var) {
        i03 i03Var = this.a;
        pv2 pv2Var = this.h;
        yw2 yw2Var = this.g;
        yw2 yw2Var2 = this.b;
        ee5 ee5Var = new ee5(bk1Var.l(0));
        try {
            ee5Var.H(i03Var.i);
            ee5Var.writeByte(10);
            ee5Var.H(this.c);
            ee5Var.writeByte(10);
            ee5Var.h0(yw2Var2.size());
            ee5Var.writeByte(10);
            int size = yw2Var2.size();
            for (int i = 0; i < size; i++) {
                ee5Var.H(yw2Var2.b(i));
                ee5Var.H(": ");
                ee5Var.H(yw2Var2.d(i));
                ee5Var.writeByte(10);
            }
            k55 k55Var = this.d;
            int i2 = this.e;
            String str = this.f;
            k55Var.getClass();
            str.getClass();
            StringBuilder sb = new StringBuilder();
            if (k55Var == k55.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str);
            ee5Var.H(sb.toString());
            ee5Var.writeByte(10);
            ee5Var.h0(yw2Var.size() + 2);
            ee5Var.writeByte(10);
            int size2 = yw2Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ee5Var.H(yw2Var.b(i3));
                ee5Var.H(": ");
                ee5Var.H(yw2Var.d(i3));
                ee5Var.writeByte(10);
            }
            ee5Var.H(k);
            ee5Var.H(": ");
            ee5Var.h0(this.i);
            ee5Var.writeByte(10);
            ee5Var.H(l);
            ee5Var.H(": ");
            ee5Var.h0(this.j);
            ee5Var.writeByte(10);
            if (i03Var.f()) {
                ee5Var.writeByte(10);
                pv2Var.getClass();
                ee5Var.H(pv2Var.b.a);
                ee5Var.writeByte(10);
                b(ee5Var, pv2Var.a());
                b(ee5Var, pv2Var.c);
                ee5Var.H(pv2Var.a.javaName());
                ee5Var.writeByte(10);
            }
            ee5Var.close();
        } finally {
        }
    }

    public ia0(wl5 wl5Var) {
        yw2 f;
        pa paVar = wl5Var.A;
        this.a = (i03) paVar.B;
        wl5 wl5Var2 = wl5Var.e0;
        wl5Var2.getClass();
        yw2 yw2Var = (yw2) wl5Var2.A.R;
        yw2 yw2Var2 = wl5Var.Y;
        Set X = g04.X(yw2Var2);
        if (X.isEmpty()) {
            f = yw2.B;
        } else {
            ww2 ww2Var = new ww2(0, (byte) 0);
            int size = yw2Var.size();
            for (int i = 0; i < size; i++) {
                String b = yw2Var.b(i);
                if (X.contains(b)) {
                    ww2Var.b(b, yw2Var.d(i));
                }
            }
            f = ww2Var.f();
        }
        this.b = f;
        this.c = (String) paVar.L;
        this.d = wl5Var.B;
        this.e = wl5Var.R;
        this.f = wl5Var.L;
        this.g = yw2Var2;
        this.h = wl5Var.X;
        this.i = wl5Var.h0;
        this.j = wl5Var.i0;
    }
}
