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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a80  reason: default package */
/* loaded from: classes.dex */
public final class a80 {
    public static final String k;
    public static final String l;
    public final hu2 a;
    public final xq2 b;
    public final String c;
    public final dw4 d;
    public final int e;
    public final String f;
    public final xq2 g;
    public final op2 h;
    public final long i;
    public final long j;

    static {
        fo4 fo4Var = fo4.a;
        fo4.a.getClass();
        k = "OkHttp-Sent-Millis";
        fo4.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public a80(sb6 sb6Var) {
        hu2 hu2Var;
        long j;
        ut6 ut6Var;
        sb6Var.getClass();
        try {
            s45 s45Var = new s45(sb6Var);
            String O = s45Var.O(Long.MAX_VALUE);
            try {
                gu2 gu2Var = new gu2(0);
                gu2Var.e(null, O);
                hu2Var = gu2Var.b();
            } catch (IllegalArgumentException unused) {
                hu2Var = null;
            }
            if (hu2Var != null) {
                this.a = hu2Var;
                this.c = s45Var.O(Long.MAX_VALUE);
                vq2 vq2Var = new vq2(0, (byte) 0);
                int c0 = n40.c0(s45Var);
                for (int i = 0; i < c0; i++) {
                    vq2Var.c(s45Var.O(Long.MAX_VALUE));
                }
                this.b = vq2Var.f();
                sh L = ln2.L(s45Var.O(Long.MAX_VALUE));
                this.d = (dw4) L.c;
                this.e = L.b;
                this.f = (String) L.d;
                vq2 vq2Var2 = new vq2(0, (byte) 0);
                int c02 = n40.c0(s45Var);
                for (int i2 = 0; i2 < c02; i2++) {
                    vq2Var2.c(s45Var.O(Long.MAX_VALUE));
                }
                String str = k;
                String j2 = vq2Var2.j(str);
                String str2 = l;
                String j3 = vq2Var2.j(str2);
                vq2Var2.r(str);
                vq2Var2.r(str2);
                if (j2 != null) {
                    j = Long.parseLong(j2);
                } else {
                    j = 0;
                }
                this.i = j;
                this.j = j3 != null ? Long.parseLong(j3) : 0L;
                this.g = vq2Var2.f();
                if (this.a.f()) {
                    String O2 = s45Var.O(Long.MAX_VALUE);
                    if (O2.length() <= 0) {
                        ho0 o = ho0.b.o(s45Var.O(Long.MAX_VALUE));
                        List a = a(s45Var);
                        List a2 = a(s45Var);
                        if (!s45Var.d()) {
                            tt6 tt6Var = ut6.Companion;
                            String O3 = s45Var.O(Long.MAX_VALUE);
                            tt6Var.getClass();
                            ut6Var = tt6.a(O3);
                        } else {
                            ut6Var = ut6.SSL_3_0;
                        }
                        ut6Var.getClass();
                        this.h = new op2(ut6Var, o, ik7.i(a2), new c5(2, ik7.i(a)));
                    } else {
                        throw new IOException("expected \"\" but was \"" + O2 + '\"');
                    }
                } else {
                    this.h = null;
                }
                sb6Var.close();
                return;
            }
            IOException iOException = new IOException("Cache corruption for ".concat(O));
            fo4 fo4Var = fo4.a;
            fo4.a.i(5, "cache corruption", iOException);
            throw iOException;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                dt3.W(sb6Var, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [f60, java.lang.Object, u60] */
    public static List a(s45 s45Var) {
        int c0 = n40.c0(s45Var);
        if (c0 == -1) {
            return pp1.A;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(c0);
            for (int i = 0; i < c0; i++) {
                String O = s45Var.O(Long.MAX_VALUE);
                ?? obj = new Object();
                w70 w70Var = w70.R;
                w70 n = iq0.n(O);
                if (n != null) {
                    obj.k0(n);
                    arrayList.add(certificateFactory.generateCertificate(new e60(obj, 0)));
                } else {
                    throw new IOException("Corrupt certificate in cache entry");
                }
            }
            return arrayList;
        } catch (CertificateException e) {
            f81.j(e.getMessage());
            return null;
        }
    }

    public static void b(r45 r45Var, List list) {
        try {
            r45Var.d0(list.size());
            r45Var.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                w70 w70Var = w70.R;
                encoded.getClass();
                r45Var.c0(iq0.t(encoded).a());
                r45Var.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            f81.j(e.getMessage());
        }
    }

    public final void c(xf1 xf1Var) {
        hu2 hu2Var = this.a;
        op2 op2Var = this.h;
        xq2 xq2Var = this.g;
        xq2 xq2Var2 = this.b;
        r45 r45Var = new r45(xf1Var.l(0));
        try {
            r45Var.c0(hu2Var.i);
            r45Var.writeByte(10);
            r45Var.c0(this.c);
            r45Var.writeByte(10);
            r45Var.d0(xq2Var2.size());
            r45Var.writeByte(10);
            int size = xq2Var2.size();
            for (int i = 0; i < size; i++) {
                r45Var.c0(xq2Var2.c(i));
                r45Var.c0(": ");
                r45Var.c0(xq2Var2.i(i));
                r45Var.writeByte(10);
            }
            dw4 dw4Var = this.d;
            int i2 = this.e;
            String str = this.f;
            dw4Var.getClass();
            str.getClass();
            StringBuilder sb = new StringBuilder();
            if (dw4Var == dw4.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str);
            r45Var.c0(sb.toString());
            r45Var.writeByte(10);
            r45Var.d0(xq2Var.size() + 2);
            r45Var.writeByte(10);
            int size2 = xq2Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                r45Var.c0(xq2Var.c(i3));
                r45Var.c0(": ");
                r45Var.c0(xq2Var.i(i3));
                r45Var.writeByte(10);
            }
            r45Var.c0(k);
            r45Var.c0(": ");
            r45Var.d0(this.i);
            r45Var.writeByte(10);
            r45Var.c0(l);
            r45Var.c0(": ");
            r45Var.d0(this.j);
            r45Var.writeByte(10);
            if (hu2Var.f()) {
                r45Var.writeByte(10);
                op2Var.getClass();
                r45Var.c0(op2Var.b.a);
                r45Var.writeByte(10);
                b(r45Var, op2Var.a());
                b(r45Var, op2Var.c);
                r45Var.c0(op2Var.a.javaName());
                r45Var.writeByte(10);
            }
            r45Var.close();
        } finally {
        }
    }

    public a80(ec5 ec5Var) {
        xq2 f;
        ka kaVar = ec5Var.A;
        this.a = (hu2) kaVar.B;
        ec5 ec5Var2 = ec5Var.d0;
        ec5Var2.getClass();
        xq2 xq2Var = (xq2) ec5Var2.A.R;
        xq2 xq2Var2 = ec5Var.Y;
        Set e0 = n40.e0(xq2Var2);
        if (e0.isEmpty()) {
            f = xq2.B;
        } else {
            vq2 vq2Var = new vq2(0, (byte) 0);
            int size = xq2Var.size();
            for (int i = 0; i < size; i++) {
                String c = xq2Var.c(i);
                if (e0.contains(c)) {
                    vq2Var.b(c, xq2Var.i(i));
                }
            }
            f = vq2Var.f();
        }
        this.b = f;
        this.c = (String) kaVar.L;
        this.d = ec5Var.B;
        this.e = ec5Var.R;
        this.f = ec5Var.L;
        this.g = xq2Var2;
        this.h = ec5Var.X;
        this.i = ec5Var.g0;
        this.j = ec5Var.h0;
    }
}
