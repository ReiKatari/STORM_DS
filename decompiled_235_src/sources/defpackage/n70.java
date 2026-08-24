package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n70  reason: default package */
/* loaded from: classes.dex */
public final class n70 implements v93 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public n70(vs0 vs0Var) {
        vs0Var.getClass();
        this.b = vs0Var;
    }

    public static int d(wl5 wl5Var, int i) {
        String a = wl5Var.Y.a("Retry-After");
        if (a == null) {
            a = null;
        }
        if (a == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (compile.matcher(a).matches()) {
            Integer valueOf = Integer.valueOf(a);
            valueOf.getClass();
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
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
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, ka0] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [bk1] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v9, types: [ka0] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [bk1] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v25 */
    @Override // defpackage.v93
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wl5 a(dp3 dp3Var) {
        boolean z;
        boolean z2;
        yl5 yl5Var;
        String str;
        wl5 wl5Var;
        int i;
        long j;
        long j2;
        Date date;
        Date date2;
        Date date3;
        String str2;
        String str3;
        String str4;
        wl5 wl5Var2;
        int i2;
        u63 u63Var;
        String str5;
        String str6;
        long j3;
        long j4;
        long j5;
        long j6;
        String sb;
        int i3;
        int i4;
        long j7;
        long j8;
        long j9;
        String str7;
        String str8;
        int i5;
        wl5 wl5Var3;
        ?? r15;
        String str9;
        wl5 a;
        bk1 bk1Var;
        bk1 bk1Var2;
        wl5 wl5Var4;
        fk1 n;
        String str10;
        yw2 yw2Var;
        i03 i03Var;
        pa paVar;
        String str11;
        jd1 jd1Var;
        k55 k55Var;
        int i6;
        String str12;
        ww2 c;
        ha0 ha0Var;
        pv2 pv2Var;
        long j10;
        long j11;
        je5 je5Var;
        pa paVar2;
        List<Exception> list;
        wl5 wl5Var5;
        wl5 a2;
        pa b;
        boolean z3;
        pa paVar3;
        SSLSocketFactory sSLSocketFactory;
        sk4 sk4Var;
        il0 il0Var;
        w62 s35Var;
        switch (this.a) {
            case 0:
                vs0 vs0Var = (vs0) this.b;
                pa paVar4 = (pa) dp3Var.i;
                s9 o = paVar4.o();
                i03 i03Var2 = (i03) paVar4.B;
                yw2 yw2Var2 = (yw2) paVar4.R;
                mk5 mk5Var = (mk5) paVar4.X;
                if (mk5Var != null) {
                    n34 b2 = mk5Var.b();
                    if (b2 != null) {
                        o.B("Content-Type", b2.a);
                    }
                    long a3 = mk5Var.a();
                    if (a3 != -1) {
                        o.B("Content-Length", String.valueOf(a3));
                        ((ww2) o.c).r("Transfer-Encoding");
                    } else {
                        o.B("Transfer-Encoding", "chunked");
                        ((ww2) o.c).r("Content-Length");
                    }
                }
                if (yw2Var2.a("Host") == null) {
                    z = false;
                    o.B("Host", az7.i(i03Var2, false));
                } else {
                    z = false;
                }
                if (yw2Var2.a("Connection") == null) {
                    o.B("Connection", "Keep-Alive");
                }
                if (yw2Var2.a("Accept-Encoding") == null && yw2Var2.a("Range") == null) {
                    o.B("Accept-Encoding", "gzip");
                    z2 = true;
                } else {
                    z2 = z;
                }
                vs0Var.getClass();
                i03Var2.getClass();
                if (yw2Var2.a("User-Agent") == null) {
                    o.B("User-Agent", "okhttp/5.3.2");
                }
                pa paVar5 = new pa(o);
                wl5 f = dp3Var.f(paVar5);
                yw2 yw2Var3 = f.Y;
                zz2.b(vs0Var, (i03) paVar5.B, yw2Var3);
                ul5 h = f.h();
                h.a = paVar5;
                if (z2) {
                    String a4 = yw2Var3.a("Content-Encoding");
                    if (a4 == null) {
                        a4 = null;
                    }
                    if ("gzip".equalsIgnoreCase(a4) && zz2.a(f) && (yl5Var = f.Z) != null) {
                        cv2 cv2Var = new cv2(yl5Var.n());
                        ww2 c2 = yw2Var3.c();
                        c2.r("Content-Encoding");
                        c2.r("Content-Length");
                        h.f = c2.f().c();
                        String a5 = yw2Var3.a("Content-Type");
                        if (a5 == null) {
                            str = null;
                        } else {
                            str = a5;
                        }
                        h.g = new te5(str, -1L, new fe5(cv2Var));
                    }
                }
                return h.a();
            case 1:
                la0 la0Var = (la0) this.b;
                if (la0Var != null) {
                    pa paVar6 = (pa) dp3Var.i;
                    paVar6.getClass();
                    i03 i03Var3 = (i03) paVar6.B;
                    try {
                        n = la0Var.A.n(g04.K(i03Var3));
                    } catch (IOException unused) {
                    }
                    if (n != null) {
                        try {
                            ia0 ia0Var = new ia0((in6) n.L.get(0));
                            str10 = ia0Var.c;
                            yw2Var = ia0Var.b;
                            i03Var = ia0Var.a;
                            yw2 yw2Var4 = ia0Var.g;
                            String a6 = yw2Var4.a("Content-Type");
                            String a7 = yw2Var4.a("Content-Length");
                            i03Var.getClass();
                            yw2Var.getClass();
                            str10.getClass();
                            s9 s9Var = new s9(13);
                            s9Var.a = i03Var;
                            s9Var.c = yw2Var.c();
                            if (!str10.equals("\u0000")) {
                                str11 = str10;
                            } else {
                                str11 = "GET";
                            }
                            s9Var.D(str11, null);
                            paVar = new pa(s9Var);
                            xl5 xl5Var = yl5.A;
                            jd1Var = a97.F;
                            new ArrayList(20);
                            k55Var = ia0Var.d;
                            k55Var.getClass();
                            i6 = ia0Var.e;
                            str12 = ia0Var.f;
                            str12.getClass();
                            c = yw2Var4.c();
                            ha0Var = new ha0(n, a6, a7);
                            pv2Var = ia0Var.h;
                            j10 = ia0Var.i;
                            j11 = ia0Var.j;
                        } catch (IOException unused2) {
                            yy7.b(n);
                        }
                        if (i6 >= 0) {
                            yw2 f2 = c.f();
                            wl5Var4 = new wl5(paVar, k55Var, str12, i6, pv2Var, f2, ha0Var, null, null, null, null, j10, j11, null, jd1Var);
                            if (i03Var.equals(i03Var3) && str10.equals((String) paVar6.L)) {
                                Set<String> X = g04.X(f2);
                                if (!(X instanceof Collection) || !X.isEmpty()) {
                                    for (String str13 : X) {
                                        if (!yw2Var.f(str13).equals(((yw2) paVar6.R).f(str13))) {
                                            yy7.b(wl5Var4.Z);
                                        }
                                    }
                                }
                                wl5Var = wl5Var4;
                            } else {
                                yy7.b(wl5Var4.Z);
                            }
                        } else {
                            u34.f(lb1.g(i6, "code < 0: "));
                            return null;
                        }
                    }
                    wl5Var4 = null;
                    wl5Var = wl5Var4;
                } else {
                    wl5Var = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                pa paVar7 = (pa) dp3Var.i;
                paVar7.getClass();
                if (wl5Var != null) {
                    j = wl5Var.h0;
                    j2 = wl5Var.i0;
                    yw2 yw2Var5 = wl5Var.Y;
                    int size = yw2Var5.size();
                    int i7 = 0;
                    i = -1;
                    date = null;
                    date2 = null;
                    date3 = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    while (i7 < size) {
                        String b3 = yw2Var5.b(i7);
                        long j12 = currentTimeMillis;
                        String d = yw2Var5.d(i7);
                        if (b3.equalsIgnoreCase("Date")) {
                            str4 = d;
                            date3 = cc1.a(d);
                        } else if (b3.equalsIgnoreCase("Expires")) {
                            date = cc1.a(d);
                        } else if (b3.equalsIgnoreCase("Last-Modified")) {
                            str3 = d;
                            date2 = cc1.a(d);
                        } else if (b3.equalsIgnoreCase("ETag")) {
                            str2 = d;
                        } else if (b3.equalsIgnoreCase("Age")) {
                            i = yy7.p(-1, d);
                        }
                        i7++;
                        currentTimeMillis = j12;
                    }
                } else {
                    i = -1;
                    j = 0;
                    j2 = 0;
                    date = null;
                    date2 = null;
                    date3 = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                long j13 = currentTimeMillis;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (wl5Var == null) {
                    wl5Var2 = null;
                    u63Var = new u63(12, paVar7, null);
                    i2 = 12;
                } else {
                    wl5Var2 = null;
                    yw2 yw2Var6 = (yw2) paVar7.R;
                    if (((i03) paVar7.B).f() && wl5Var.X == null) {
                        i2 = 12;
                        u63Var = new u63(12, paVar7, null);
                    } else {
                        i2 = 12;
                        if (!n16.D(wl5Var, paVar7)) {
                            u63Var = new u63(12, paVar7, null);
                        } else {
                            ma0 h2 = paVar7.h();
                            if (!h2.a && yw2Var6.a("If-Modified-Since") == null && yw2Var6.a("If-None-Match") == null) {
                                ma0 e = wl5Var.e();
                                if (date3 != null) {
                                    str5 = "If-None-Match";
                                    str6 = "If-Modified-Since";
                                    j3 = j;
                                    j4 = Math.max(0L, j2 - date3.getTime());
                                } else {
                                    str5 = "If-None-Match";
                                    str6 = "If-Modified-Since";
                                    j3 = j;
                                    j4 = 0;
                                }
                                if (i != -1) {
                                    j4 = Math.max(j4, timeUnit.toMillis(i));
                                }
                                long max = j4 + Math.max(0L, j2 - j3) + Math.max(0L, j13 - j2);
                                int i8 = wl5Var.e().c;
                                if (i8 != -1) {
                                    j6 = timeUnit.toMillis(i8);
                                } else if (date != null) {
                                    if (date3 != null) {
                                        j2 = date3.getTime();
                                    }
                                    j6 = date.getTime() - j2;
                                    if (j6 <= 0) {
                                        j6 = 0;
                                    }
                                } else {
                                    if (date2 != null) {
                                        List list2 = ((i03) wl5Var.A.B).g;
                                        if (list2 == null) {
                                            sb = null;
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            x31.o(list2, sb2);
                                            sb = sb2.toString();
                                        }
                                        if (sb == null) {
                                            if (date3 != null) {
                                                j3 = date3.getTime();
                                            }
                                            long time = j3 - date2.getTime();
                                            j5 = 0;
                                            if (time > 0) {
                                                j6 = time / 10;
                                                i3 = h2.c;
                                                if (i3 != -1) {
                                                    j6 = Math.min(j6, timeUnit.toMillis(i3));
                                                }
                                                i4 = h2.i;
                                                if (i4 == -1) {
                                                    j7 = timeUnit.toMillis(i4);
                                                } else {
                                                    j7 = j5;
                                                }
                                                if (e.g && (i5 = h2.h) != -1) {
                                                    j8 = max;
                                                    j9 = timeUnit.toMillis(i5);
                                                } else {
                                                    j8 = max;
                                                    j9 = j5;
                                                }
                                                if (!e.a) {
                                                    long j14 = j8 + j7;
                                                    if (j14 < j9 + j6) {
                                                        ul5 h3 = wl5Var.h();
                                                        if (j14 >= j6) {
                                                            h3.f.b("Warning", "110 HttpURLConnection \"Response is stale\"");
                                                        }
                                                        if (j8 > 86400000 && wl5Var.e().c == -1 && date == null) {
                                                            h3.f.b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                                        }
                                                        wl5Var2 = null;
                                                        i2 = 12;
                                                        u63Var = new u63(12, null, h3.a());
                                                    }
                                                }
                                                if (str2 == null) {
                                                    str7 = str2;
                                                    str8 = str5;
                                                } else {
                                                    if (date2 != null) {
                                                        str7 = str3;
                                                    } else if (date3 != null) {
                                                        str7 = str4;
                                                    } else {
                                                        i2 = 12;
                                                        wl5Var2 = null;
                                                        u63Var = new u63(12, paVar7, null);
                                                    }
                                                    str8 = str6;
                                                }
                                                ww2 c3 = yw2Var6.c();
                                                str7.getClass();
                                                ft7.a(c3, str8, str7);
                                                s9 o2 = paVar7.o();
                                                o2.c = c3.f().c();
                                                i2 = 12;
                                                u63Var = new u63(12, new pa(o2), wl5Var);
                                                wl5Var2 = null;
                                            }
                                            j6 = j5;
                                            i3 = h2.c;
                                            if (i3 != -1) {
                                            }
                                            i4 = h2.i;
                                            if (i4 == -1) {
                                            }
                                            if (e.g) {
                                            }
                                            j8 = max;
                                            j9 = j5;
                                            if (!e.a) {
                                            }
                                            if (str2 == null) {
                                            }
                                            ww2 c32 = yw2Var6.c();
                                            str7.getClass();
                                            ft7.a(c32, str8, str7);
                                            s9 o22 = paVar7.o();
                                            o22.c = c32.f().c();
                                            i2 = 12;
                                            u63Var = new u63(12, new pa(o22), wl5Var);
                                            wl5Var2 = null;
                                        }
                                    }
                                    j5 = 0;
                                    j6 = j5;
                                    i3 = h2.c;
                                    if (i3 != -1) {
                                    }
                                    i4 = h2.i;
                                    if (i4 == -1) {
                                    }
                                    if (e.g) {
                                    }
                                    j8 = max;
                                    j9 = j5;
                                    if (!e.a) {
                                    }
                                    if (str2 == null) {
                                    }
                                    ww2 c322 = yw2Var6.c();
                                    str7.getClass();
                                    ft7.a(c322, str8, str7);
                                    s9 o222 = paVar7.o();
                                    o222.c = c322.f().c();
                                    i2 = 12;
                                    u63Var = new u63(12, new pa(o222), wl5Var);
                                    wl5Var2 = null;
                                }
                                j5 = 0;
                                i3 = h2.c;
                                if (i3 != -1) {
                                }
                                i4 = h2.i;
                                if (i4 == -1) {
                                }
                                if (e.g) {
                                }
                                j8 = max;
                                j9 = j5;
                                if (!e.a) {
                                }
                                if (str2 == null) {
                                }
                                ww2 c3222 = yw2Var6.c();
                                str7.getClass();
                                ft7.a(c3222, str8, str7);
                                s9 o2222 = paVar7.o();
                                o2222.c = c3222.f().c();
                                i2 = 12;
                                u63Var = new u63(12, new pa(o2222), wl5Var);
                                wl5Var2 = null;
                            } else {
                                wl5Var2 = null;
                                i2 = 12;
                                u63Var = new u63(12, paVar7, null);
                            }
                        }
                    }
                }
                if (((pa) u63Var.B) != null && paVar7.h().j) {
                    u63Var = new u63(i2, wl5Var2, wl5Var2);
                }
                pa paVar8 = (pa) u63Var.B;
                wl5 wl5Var6 = (wl5) u63Var.L;
                la0 la0Var2 = (la0) this.b;
                if (la0Var2 != null) {
                    synchronized (la0Var2) {
                    }
                }
                if (wl5Var != null && wl5Var6 == null) {
                    yy7.b(wl5Var.Z);
                }
                if (paVar8 == null && wl5Var6 == null) {
                    xl5 xl5Var2 = yl5.A;
                    jd1 jd1Var2 = a97.F;
                    ArrayList arrayList = new ArrayList(20);
                    pa paVar9 = (pa) dp3Var.i;
                    paVar9.getClass();
                    k55 k55Var2 = k55.HTTP_1_1;
                    k55Var2.getClass();
                    return new wl5(paVar9, k55Var2, "Unsatisfiable Request (only-if-cached)", 504, null, new yw2((String[]) arrayList.toArray(new String[0])), xl5Var2, null, null, null, null, -1L, System.currentTimeMillis(), null, jd1Var2);
                } else if (paVar8 == null) {
                    wl5Var6.getClass();
                    ul5 h4 = wl5Var6.h();
                    wl5 g0 = np2.g0(wl5Var6);
                    ul5.b("cacheResponse", g0);
                    h4.j = g0;
                    return h4.a();
                } else {
                    try {
                        wl5 f3 = dp3Var.f(paVar8);
                        if (wl5Var6 != null) {
                            if (f3.R == 304) {
                                ul5 h5 = wl5Var6.h();
                                yw2 yw2Var7 = wl5Var6.Y;
                                yw2 yw2Var8 = f3.Y;
                                ArrayList arrayList2 = new ArrayList(20);
                                int size2 = yw2Var7.size();
                                for (int i9 = 0; i9 < size2; i9++) {
                                    String b4 = yw2Var7.b(i9);
                                    String d2 = yw2Var7.d(i9);
                                    if ((!"Warning".equalsIgnoreCase(b4) || !xs6.g0(d2, "1", false)) && ("Content-Length".equalsIgnoreCase(b4) || "Content-Encoding".equalsIgnoreCase(b4) || "Content-Type".equalsIgnoreCase(b4) || !lb4.B(b4) || yw2Var8.a(b4) == null)) {
                                        arrayList2.add(b4);
                                        arrayList2.add(qs6.T0(d2).toString());
                                    }
                                }
                                int size3 = yw2Var8.size();
                                for (int i10 = 0; i10 < size3; i10++) {
                                    String b5 = yw2Var8.b(i10);
                                    if (!"Content-Length".equalsIgnoreCase(b5) && !"Content-Encoding".equalsIgnoreCase(b5) && !"Content-Type".equalsIgnoreCase(b5) && lb4.B(b5)) {
                                        String d3 = yw2Var8.d(i10);
                                        arrayList2.add(b5);
                                        arrayList2.add(qs6.T0(d3).toString());
                                    }
                                }
                                h5.f = new yw2((String[]) arrayList2.toArray(new String[0])).c();
                                h5.l = f3.h0;
                                h5.m = f3.i0;
                                wl5 g02 = np2.g0(wl5Var6);
                                ul5.b("cacheResponse", g02);
                                h5.j = g02;
                                wl5 g03 = np2.g0(f3);
                                ul5.b("networkResponse", g03);
                                h5.i = g03;
                                a = h5.a();
                                f3.Z.close();
                                la0 la0Var3 = (la0) this.b;
                                la0Var3.getClass();
                                synchronized (la0Var3) {
                                }
                                ((la0) this.b).getClass();
                                ia0 ia0Var2 = new ia0(a);
                                yl5 yl5Var2 = wl5Var6.Z;
                                yl5Var2.getClass();
                                fk1 fk1Var = ((ha0) yl5Var2).B;
                                try {
                                    bk1Var2 = fk1Var.R.k(fk1Var.B, fk1Var.A);
                                    if (bk1Var2 != null) {
                                        try {
                                            ia0Var2.c(bk1Var2);
                                            bk1Var2.d();
                                        } catch (IOException unused3) {
                                            if (bk1Var2 != 0) {
                                                try {
                                                    bk1Var2.a();
                                                } catch (IOException unused4) {
                                                }
                                            }
                                            return a;
                                        }
                                    }
                                } catch (IOException unused5) {
                                    bk1Var2 = wl5Var2;
                                }
                                return a;
                            }
                            yy7.b(wl5Var6.Z);
                        }
                        ul5 h6 = f3.h();
                        if (wl5Var6 != null) {
                            wl5Var3 = np2.g0(wl5Var6);
                        } else {
                            wl5Var3 = wl5Var2;
                        }
                        ul5.b("cacheResponse", wl5Var3);
                        h6.j = wl5Var3;
                        wl5 g04 = np2.g0(f3);
                        ul5.b("networkResponse", g04);
                        h6.i = g04;
                        wl5 a8 = h6.a();
                        if (((la0) this.b) != null) {
                            if (zz2.a(a8) && n16.D(a8, paVar8)) {
                                la0 la0Var4 = (la0) this.b;
                                ul5 h7 = a8.h();
                                h7.a = paVar8;
                                wl5 a9 = h7.a();
                                la0Var4.getClass();
                                pa paVar10 = a9.A;
                                String str14 = (String) paVar10.L;
                                if (ii2.C(str14)) {
                                    la0Var4.e(paVar10);
                                } else {
                                    if (str14.equals("GET") && !g04.X(a9.Y).contains("*")) {
                                        ia0 ia0Var3 = new ia0(a9);
                                        try {
                                            kk1 kk1Var = la0Var4.A;
                                            String K = g04.K((i03) paVar10.B);
                                            xh5 xh5Var = kk1.p0;
                                            bk1Var = kk1Var.k(-1L, K);
                                        } catch (IOException unused6) {
                                            bk1Var = wl5Var2;
                                        }
                                        if (bk1Var != null) {
                                            try {
                                                ia0Var3.c(bk1Var);
                                                ?? obj = new Object();
                                                obj.e = la0Var4;
                                                obj.b = bk1Var;
                                                ui6 l = bk1Var.l(1);
                                                obj.c = l;
                                                obj.d = new ja0(la0Var4, obj, l);
                                                r15 = obj;
                                            } catch (IOException unused7) {
                                                if (bk1Var != 0) {
                                                    bk1Var.a();
                                                }
                                                r15 = wl5Var2;
                                                if (r15 != 0) {
                                                }
                                                return a8;
                                            }
                                            if (r15 != 0) {
                                                qa0 qa0Var = new qa0(a8.Z.n(), r15, hi2.t((ja0) r15.d));
                                                String a10 = a8.Y.a("Content-Type");
                                                if (a10 == null) {
                                                    str9 = wl5Var2;
                                                } else {
                                                    str9 = a10;
                                                }
                                                long h8 = a8.Z.h();
                                                ul5 h9 = a8.h();
                                                h9.g = new te5(str9, h8, new fe5(qa0Var));
                                                a = h9.a();
                                                return a;
                                            }
                                        }
                                    }
                                    r15 = wl5Var2;
                                    if (r15 != 0) {
                                    }
                                }
                                r15 = wl5Var2;
                                if (r15 != 0) {
                                }
                            } else if (ii2.C((String) paVar8.L)) {
                                try {
                                    ((la0) this.b).e(paVar8);
                                } catch (IOException unused8) {
                                }
                            }
                        }
                        return a8;
                    } catch (Throwable th) {
                        if (wl5Var != null) {
                            yy7.b(wl5Var.Z);
                        }
                        throw th;
                    }
                }
            default:
                je5 je5Var2 = (je5) dp3Var.g;
                List list3 = yt1.A;
                wl5 wl5Var7 = null;
                int i11 = 0;
                pa paVar11 = (pa) dp3Var.i;
                boolean z4 = true;
                while (true) {
                    paVar11.getClass();
                    if (je5Var2.g0 == null) {
                        synchronized (je5Var2) {
                            try {
                                try {
                                    if (!je5Var2.i0) {
                                        if (je5Var2.h0 || je5Var2.k0 || je5Var2.j0) {
                                        }
                                    } else {
                                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                je5Var = je5Var2;
                            }
                        }
                        if (z4) {
                            List list4 = list3;
                            xk4 xk4Var = je5Var2.A;
                            qz6 qz6Var = xk4Var.C;
                            ls1 ls1Var = je5Var2.R;
                            int i12 = xk4Var.x;
                            int i13 = xk4Var.y;
                            int i14 = dp3Var.c;
                            int i15 = dp3Var.d;
                            boolean z5 = xk4Var.e;
                            boolean z6 = xk4Var.f;
                            i03 i03Var4 = (i03) paVar11.B;
                            i03Var4.getClass();
                            if (i03Var4.f()) {
                                SSLSocketFactory sSLSocketFactory2 = xk4Var.p;
                                if (sSLSocketFactory2 != null) {
                                    paVar3 = paVar11;
                                    sk4 sk4Var2 = xk4Var.t;
                                    il0Var = xk4Var.u;
                                    sSLSocketFactory = sSLSocketFactory2;
                                    sk4Var = sk4Var2;
                                } else {
                                    i.m("CLEARTEXT-only client");
                                    break;
                                }
                            } else {
                                paVar3 = paVar11;
                                sSLSocketFactory = null;
                                sk4Var = null;
                                il0Var = null;
                            }
                            je5 je5Var3 = je5Var2;
                            list = list4;
                            ue5 ue5Var = new ue5(qz6Var, ls1Var, i12, i13, i14, i15, z5, z6, new ea(i03Var4.d, i03Var4.e, xk4Var.l, xk4Var.o, sSLSocketFactory, sk4Var, il0Var, xk4Var.n, xk4Var.s, xk4Var.r, xk4Var.m), je5Var2.A.B, je5Var3, paVar3);
                            je5Var = je5Var3;
                            paVar2 = paVar3;
                            xk4 xk4Var2 = je5Var.A;
                            if (xk4Var2.f) {
                                s35Var = new fb(ue5Var, xk4Var2.C);
                            } else {
                                s35Var = new s35(ue5Var);
                            }
                            je5Var.d0 = s35Var;
                        } else {
                            je5Var = je5Var2;
                            paVar2 = paVar11;
                            list = list3;
                        }
                        try {
                            if (!je5Var.m0) {
                                try {
                                    ul5 h10 = dp3Var.f(paVar2).h();
                                    h10.a = paVar2;
                                    if (wl5Var7 != null) {
                                        wl5Var5 = np2.g0(wl5Var7);
                                    } else {
                                        wl5Var5 = null;
                                    }
                                    h10.k = wl5Var5;
                                    a2 = h10.a();
                                    b = b(a2, je5Var.g0);
                                } catch (IOException e2) {
                                    if (!c(e2, je5Var, paVar2)) {
                                        byte[] bArr = yy7.a;
                                        for (Exception exc : list) {
                                            mb3.q(e2, exc);
                                        }
                                        throw e2;
                                    }
                                    list3 = gt0.U0(e2, list);
                                    je5Var.f(true);
                                    paVar11 = paVar2;
                                    je5Var2 = je5Var;
                                    z4 = false;
                                }
                                if (b == null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                    mk5 mk5Var2 = (mk5) b.X;
                                    if (mk5Var2 == null || !mk5Var2.c()) {
                                        yy7.b(a2.Z);
                                        int i16 = i11 + 1;
                                        if (i16 <= 20) {
                                            je5Var.f(true);
                                            wl5Var7 = a2;
                                            list3 = list;
                                            i11 = i16;
                                            z4 = true;
                                            paVar11 = b;
                                            je5Var2 = je5Var;
                                        } else {
                                            throw new ProtocolException("Too many follow-up requests: " + i16);
                                        }
                                    }
                                }
                            } else {
                                throw new IOException("Canceled");
                            }
                        } catch (Throwable th4) {
                            je5Var.f(true);
                            throw th4;
                        }
                    } else {
                        i.m("Check failed.");
                        break;
                    }
                }
                je5Var.f(z3);
                return a2;
        }
    }

    public pa b(wl5 wl5Var, bk1 bk1Var) {
        b26 b26Var;
        h03 h03Var;
        i03 i03Var;
        mk5 mk5Var;
        wl5 wl5Var2;
        mk5 mk5Var2 = null;
        if (bk1Var != null) {
            b26Var = bk1Var.j().c;
        } else {
            b26Var = null;
        }
        int i = wl5Var.R;
        pa paVar = wl5Var.A;
        String str = (String) paVar.L;
        boolean z = false;
        if (i != 307 && i != 308) {
            if (i != 401) {
                if (i != 421) {
                    if (i != 503) {
                        if (i != 407) {
                            if (i != 408) {
                                switch (i) {
                                }
                            } else if (((xk4) this.b).e && (((mk5Var = (mk5) paVar.X) == null || !mk5Var.c()) && (((wl5Var2 = wl5Var.g0) == null || wl5Var2.R != 408) && d(wl5Var, 0) <= 0))) {
                                return wl5Var.A;
                            }
                        } else {
                            b26Var.getClass();
                            if (b26Var.b.type() == Proxy.Type.HTTP) {
                                ((xk4) this.b).n.getClass();
                                return null;
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        wl5 wl5Var3 = wl5Var.g0;
                        if ((wl5Var3 == null || wl5Var3.R != 503) && d(wl5Var, Integer.MAX_VALUE) == 0) {
                            return wl5Var.A;
                        }
                    }
                } else {
                    mk5 mk5Var3 = (mk5) paVar.X;
                    if ((mk5Var3 == null || !mk5Var3.c()) && bk1Var != null && !nb3.k(((w62) bk1Var.B).b().i.h.d, ((v62) bk1Var.R).i().h().a.h.d)) {
                        ke5 j = bk1Var.j();
                        synchronized (j) {
                            j.k = true;
                        }
                        return wl5Var.A;
                    }
                }
                return null;
            }
            ((xk4) this.b).g.getClass();
            return null;
        }
        xk4 xk4Var = (xk4) this.b;
        if (xk4Var.h) {
            String a = wl5Var.Y.a("Location");
            if (a == null) {
                a = null;
            }
            pa paVar2 = wl5Var.A;
            if (a != null) {
                i03 i03Var2 = (i03) paVar2.B;
                i03Var2.getClass();
                try {
                    h03Var = new h03(0);
                    h03Var.e(i03Var2, a);
                } catch (IllegalArgumentException unused) {
                    h03Var = null;
                }
                if (h03Var != null) {
                    i03Var = h03Var.b();
                } else {
                    i03Var = null;
                }
                if (i03Var != null && (nb3.k(i03Var.a, ((i03) paVar2.B).a) || xk4Var.i)) {
                    s9 o = paVar2.o();
                    if (ii2.J(str)) {
                        int i2 = wl5Var.R;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            z = true;
                        }
                        if (!str.equals("PROPFIND") && i2 != 308 && i2 != 307) {
                            o.D("GET", null);
                        } else {
                            if (z) {
                                mk5Var2 = (mk5) paVar2.X;
                            }
                            o.D(str, mk5Var2);
                        }
                        if (!z) {
                            ((ww2) o.c).r("Transfer-Encoding");
                            ((ww2) o.c).r("Content-Length");
                            ((ww2) o.c).r("Content-Type");
                        }
                    }
                    if (!az7.a((i03) paVar2.B, i03Var)) {
                        ((ww2) o.c).r("Authorization");
                    }
                    o.a = i03Var;
                    return new pa(o);
                }
            }
        }
        return null;
    }

    public boolean c(IOException iOException, je5 je5Var, pa paVar) {
        ke5 ke5Var;
        mk5 mk5Var;
        boolean z = iOException instanceof vz0;
        if (((xk4) this.b).e) {
            if ((z || (((mk5Var = (mk5) paVar.X) == null || !mk5Var.c()) && !(iOException instanceof FileNotFoundException))) && !(iOException instanceof ProtocolException)) {
                if (iOException instanceof InterruptedIOException) {
                    if (!(iOException instanceof SocketTimeoutException) || !z) {
                        return false;
                    }
                } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                    return false;
                }
                bk1 bk1Var = je5Var.n0;
                if (bk1Var != null && bk1Var.A) {
                    w62 w62Var = je5Var.d0;
                    w62Var.getClass();
                    ue5 b = w62Var.b();
                    bk1 bk1Var2 = je5Var.n0;
                    if (bk1Var2 != null) {
                        ke5Var = bk1Var2.j();
                    } else {
                        ke5Var = null;
                    }
                    if (b.a(ke5Var)) {
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

    public n70(la0 la0Var) {
        this.b = la0Var;
    }

    public n70(xk4 xk4Var) {
        xk4Var.getClass();
        this.b = xk4Var;
    }
}
