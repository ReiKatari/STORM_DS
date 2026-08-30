package pi;

import j0.o1;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: k  reason: collision with root package name */
    public static final String f11689k;

    /* renamed from: l  reason: collision with root package name */
    public static final String f11690l;

    /* renamed from: a  reason: collision with root package name */
    public final r f11691a;

    /* renamed from: b  reason: collision with root package name */
    public final q f11692b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11693c;

    /* renamed from: d  reason: collision with root package name */
    public final z f11694d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11695e;

    /* renamed from: f  reason: collision with root package name */
    public final String f11696f;

    /* renamed from: g  reason: collision with root package name */
    public final q f11697g;

    /* renamed from: h  reason: collision with root package name */
    public final p f11698h;

    /* renamed from: i  reason: collision with root package name */
    public final long f11699i;

    /* renamed from: j  reason: collision with root package name */
    public final long f11700j;

    static {
        zi.f fVar = zi.f.f15151a;
        zi.f.f15151a.getClass();
        f11689k = "OkHttp-Sent-Millis";
        zi.f.f15151a.getClass();
        f11690l = "OkHttp-Received-Millis";
    }

    public d(fj.g0 g0Var) {
        r rVar;
        long j2;
        j0 j0Var;
        g0Var.getClass();
        try {
            fj.a0 a0Var = new fj.a0(g0Var);
            String D = a0Var.D(Long.MAX_VALUE);
            try {
                na.a0 a0Var2 = new na.a0(1);
                a0Var2.e(null, D);
                rVar = a0Var2.b();
            } catch (IllegalArgumentException unused) {
                rVar = null;
            }
            if (rVar != null) {
                this.f11691a = rVar;
                this.f11693c = a0Var.D(Long.MAX_VALUE);
                o1 o1Var = new o1(3, false);
                int u4 = p7.a.u(a0Var);
                for (int i2 = 0; i2 < u4; i2++) {
                    o1Var.c(a0Var.D(Long.MAX_VALUE));
                }
                this.f11692b = o1Var.f();
                c8.c0 D2 = p7.t.D(a0Var.D(Long.MAX_VALUE));
                this.f11694d = (z) D2.f2625c;
                this.f11695e = D2.f2624b;
                this.f11696f = (String) D2.f2626d;
                o1 o1Var2 = new o1(3, false);
                int u10 = p7.a.u(a0Var);
                for (int i10 = 0; i10 < u10; i10++) {
                    o1Var2.c(a0Var.D(Long.MAX_VALUE));
                }
                String str = f11689k;
                String k10 = o1Var2.k(str);
                String str2 = f11690l;
                String k11 = o1Var2.k(str2);
                o1Var2.s(str);
                o1Var2.s(str2);
                if (k10 != null) {
                    j2 = Long.parseLong(k10);
                } else {
                    j2 = 0;
                }
                this.f11699i = j2;
                this.f11700j = k11 != null ? Long.parseLong(k11) : 0L;
                this.f11697g = o1Var2.f();
                if (this.f11691a.f()) {
                    String D3 = a0Var.D(Long.MAX_VALUE);
                    if (D3.length() <= 0) {
                        k c4 = k.f11731b.c(a0Var.D(Long.MAX_VALUE));
                        List a10 = a(a0Var);
                        List a11 = a(a0Var);
                        if (!a0Var.d()) {
                            i0 i0Var = j0.Companion;
                            String D4 = a0Var.D(Long.MAX_VALUE);
                            i0Var.getClass();
                            j0Var = i0.a(D4);
                        } else {
                            j0Var = j0.SSL_3_0;
                        }
                        j0Var.getClass();
                        this.f11698h = new p(j0Var, c4, qi.g.i(a11), new jd.i(3, qi.g.i(a10)));
                    } else {
                        throw new IOException("expected \"\" but was \"" + D3 + '\"');
                    }
                } else {
                    this.f11698h = null;
                }
                g0Var.close();
                return;
            }
            IOException iOException = new IOException("Cache corruption for ".concat(D));
            zi.f fVar = zi.f.f15151a;
            zi.f.f15151a.i("cache corruption", 5, iOException);
            throw iOException;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                l0.f.f(g0Var, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [fj.g, fj.e, java.lang.Object] */
    public static List a(fj.a0 a0Var) {
        int u4 = p7.a.u(a0Var);
        if (u4 == -1) {
            return zb.q.A;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(u4);
            for (int i2 = 0; i2 < u4; i2++) {
                String D = a0Var.D(Long.MAX_VALUE);
                ?? obj = new Object();
                fj.h hVar = fj.h.R;
                fj.h f8 = na.f.f(D);
                if (f8 != null) {
                    obj.c0(f8);
                    arrayList.add(certificateFactory.generateCertificate(new fj.d(obj, 0)));
                } else {
                    throw new IOException("Corrupt certificate in cache entry");
                }
            }
            return arrayList;
        } catch (CertificateException e6) {
            fj.j.h(e6.getMessage());
            return null;
        }
    }

    public static void b(fj.z zVar, List list) {
        try {
            zVar.Q(list.size());
            zVar.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                fj.h hVar = fj.h.R;
                encoded.getClass();
                zVar.P(na.f.j(encoded).a());
                zVar.writeByte(10);
            }
        } catch (CertificateEncodingException e6) {
            fj.j.h(e6.getMessage());
        }
    }

    public final void c(e9.a aVar) {
        r rVar = this.f11691a;
        p pVar = this.f11698h;
        q qVar = this.f11697g;
        q qVar2 = this.f11692b;
        fj.z zVar = new fj.z(aVar.i(0));
        try {
            zVar.P(rVar.f11789i);
            zVar.writeByte(10);
            zVar.P(this.f11693c);
            zVar.writeByte(10);
            zVar.Q(qVar2.size());
            zVar.writeByte(10);
            int size = qVar2.size();
            for (int i2 = 0; i2 < size; i2++) {
                zVar.P(qVar2.b(i2));
                zVar.P(": ");
                zVar.P(qVar2.d(i2));
                zVar.writeByte(10);
            }
            z zVar2 = this.f11694d;
            int i10 = this.f11695e;
            String str = this.f11696f;
            zVar2.getClass();
            str.getClass();
            StringBuilder sb2 = new StringBuilder();
            if (zVar2 == z.HTTP_1_0) {
                sb2.append("HTTP/1.0");
            } else {
                sb2.append("HTTP/1.1");
            }
            sb2.append(' ');
            sb2.append(i10);
            sb2.append(' ');
            sb2.append(str);
            zVar.P(sb2.toString());
            zVar.writeByte(10);
            zVar.Q(qVar.size() + 2);
            zVar.writeByte(10);
            int size2 = qVar.size();
            for (int i11 = 0; i11 < size2; i11++) {
                zVar.P(qVar.b(i11));
                zVar.P(": ");
                zVar.P(qVar.d(i11));
                zVar.writeByte(10);
            }
            zVar.P(f11689k);
            zVar.P(": ");
            zVar.Q(this.f11699i);
            zVar.writeByte(10);
            zVar.P(f11690l);
            zVar.P(": ");
            zVar.Q(this.f11700j);
            zVar.writeByte(10);
            if (rVar.f()) {
                zVar.writeByte(10);
                pVar.getClass();
                zVar.P(pVar.f11778b.f11749a);
                zVar.writeByte(10);
                b(zVar, pVar.a());
                b(zVar, pVar.f11779c);
                zVar.P(pVar.f11777a.javaName());
                zVar.writeByte(10);
            }
            zVar.close();
        } finally {
        }
    }

    public d(d0 d0Var) {
        q f8;
        x0 x0Var = d0Var.A;
        this.f11691a = (r) x0Var.f14089b;
        d0 d0Var2 = d0Var.f11702c0;
        d0Var2.getClass();
        q qVar = (q) d0Var2.A.f14091d;
        q qVar2 = d0Var.Y;
        Set C = p7.a.C(qVar2);
        if (C.isEmpty()) {
            f8 = q.B;
        } else {
            o1 o1Var = new o1(3, false);
            int size = qVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                String b10 = qVar.b(i2);
                if (C.contains(b10)) {
                    o1Var.b(b10, qVar.d(i2));
                }
            }
            f8 = o1Var.f();
        }
        this.f11692b = f8;
        this.f11693c = (String) x0Var.f14090c;
        this.f11694d = d0Var.B;
        this.f11695e = d0Var.R;
        this.f11696f = d0Var.L;
        this.f11697g = qVar2;
        this.f11698h = d0Var.X;
        this.f11699i = d0Var.f11705f0;
        this.f11700j = d0Var.f11706g0;
    }
}
