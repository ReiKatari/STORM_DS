package dj;

import a0.j;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import nc.k;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final c f4109a = new Object();

    public static List a(X509Certificate x509Certificate, int i2) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames != null) {
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && k.a(list.get(0), Integer.valueOf(i2)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        }
        return q.A;
    }

    public static boolean b(String str) {
        int i2;
        char c4;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            if (length2 <= str.length()) {
                long j2 = 0;
                int i10 = 0;
                while (i10 < length2) {
                    char charAt = str.charAt(i10);
                    if (charAt < 128) {
                        j2++;
                    } else {
                        if (charAt < 2048) {
                            i2 = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i11 = i10 + 1;
                            if (i11 < length2) {
                                c4 = str.charAt(i11);
                            } else {
                                c4 = 0;
                            }
                            if (charAt <= 56319 && c4 >= 56320 && c4 <= 57343) {
                                j2 += 4;
                                i10 += 2;
                            } else {
                                j2++;
                                i10 = i11;
                            }
                        } else {
                            i2 = 3;
                        }
                        j2 += i2;
                    }
                    i10++;
                }
                if (length != ((int) j2)) {
                    return false;
                }
                return true;
            }
            StringBuilder i12 = kc.a.i("endIndex > string.length: ", length2, " > ");
            i12.append(str.length());
            throw new IllegalArgumentException(i12.toString().toString());
        }
        j.e(w.d.m("endIndex < beginIndex: ", length2, " < 0"));
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
        throw new UnsupportedOperationException("Method not decompiled: dj.c.c(java.lang.String, java.security.cert.X509Certificate):boolean");
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
