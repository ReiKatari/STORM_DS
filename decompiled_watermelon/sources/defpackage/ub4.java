package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ub4  reason: default package */
/* loaded from: classes.dex */
public final class ub4 implements HostnameVerifier {
    public static final ub4 a = new Object();

    public static List a(X509Certificate x509Certificate, int i) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames != null) {
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && b53.x(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        }
        return pp1.A;
    }

    public static boolean b(String str) {
        long j;
        char c;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            if (length2 <= str.length()) {
                long j2 = 0;
                int i = 0;
                while (i < length2) {
                    char charAt = str.charAt(i);
                    if (charAt < 128) {
                        j2++;
                    } else {
                        if (charAt < 2048) {
                            j = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i2 = i + 1;
                            if (i2 < length2) {
                                c = str.charAt(i2);
                            } else {
                                c = 0;
                            }
                            if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                j2 += 4;
                                i += 2;
                            } else {
                                j2++;
                                i = i2;
                            }
                        } else {
                            j = 3;
                        }
                        j2 += j;
                    }
                    i++;
                }
                if (length != ((int) j2)) {
                    return false;
                }
                return true;
            }
            StringBuilder s = wh1.s("endIndex > string.length: ", length2, " > ");
            s.append(str.length());
            throw new IllegalArgumentException(s.toString().toString());
        }
        i.g(wh1.j("endIndex < beginIndex: ", length2, " < 0"));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0118 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.String r9, java.security.cert.X509Certificate r10) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub4.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
                return false;
            }
        }
        return false;
    }
}
