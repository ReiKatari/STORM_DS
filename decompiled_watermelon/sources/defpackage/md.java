package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: md  reason: default package */
/* loaded from: classes.dex */
public final class md extends dk7 {
    public final X509TrustManager r;
    public final X509TrustManagerExtensions s;

    public md(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.r = x509TrustManager;
        this.s = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof md) && ((md) obj).r == this.r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.r);
    }

    @Override // defpackage.dk7
    public final List o(String str, List list) {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> checkServerTrusted = this.s.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            checkServerTrusted.getClass();
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
