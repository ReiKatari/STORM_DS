package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sk4  reason: default package */
/* loaded from: classes.dex */
public final class sk4 implements HostnameVerifier {
    public static final sk4 a = new Object();

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
                if (list != null && list.size() >= 2 && nb3.k(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        }
        return yt1.A;
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
            StringBuilder t = xg6.t("endIndex > string.length: ", length2, " > ");
            t.append(str.length());
            throw new IllegalArgumentException(t.toString().toString());
        }
        i.f(lb1.k("endIndex < beginIndex: ", length2, " < 0"));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0118 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean z;
        String str2;
        int length;
        str.getClass();
        if (wy7.a.d(str)) {
            String b = wy7.b(str);
            List<String> a2 = a(x509Certificate, 7);
            if (!a2.isEmpty()) {
                for (String str3 : a2) {
                    if (nb3.k(b, wy7.b(str3))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            str = str.toLowerCase(locale);
            str.getClass();
        }
        List<String> a3 = a(x509Certificate, 2);
        if (!a3.isEmpty()) {
            for (String str4 : a3) {
                if (str.length() != 0 && !xs6.g0(str, ".", false) && !xs6.Y(str, "..", false) && str4 != null && str4.length() != 0 && !xs6.g0(str4, ".", false) && !xs6.Y(str4, "..", false)) {
                    if (!xs6.Y(str, ".", false)) {
                        str2 = str.concat(".");
                    } else {
                        str2 = str;
                    }
                    if (!xs6.Y(str4, ".", false)) {
                        str4 = str4.concat(".");
                    }
                    if (b(str4)) {
                        Locale locale2 = Locale.US;
                        locale2.getClass();
                        str4 = str4.toLowerCase(locale2);
                        str4.getClass();
                    }
                    if (!qs6.j0(str4, "*", false)) {
                        z = str2.equals(str4);
                        continue;
                    } else if (xs6.g0(str4, "*.", false) && qs6.s0('*', 1, 4, str4) == -1 && str2.length() >= str4.length() && !"*.".equals(str4)) {
                        String substring = str4.substring(1);
                        if (xs6.Y(str2, substring, false) && ((length = str2.length() - substring.length()) <= 0 || qs6.x0('.', length - 1, 4, str2) == -1)) {
                            z = true;
                            continue;
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
                z = false;
                continue;
                if (z) {
                }
            }
        }
        return false;
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
