package aj;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends r {

    /* renamed from: b0  reason: collision with root package name */
    public final X509TrustManager f853b0;

    /* renamed from: c0  reason: collision with root package name */
    public final X509TrustManagerExtensions f854c0;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f853b0 = x509TrustManager;
        this.f854c0 = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b) && ((b) obj).f853b0 == this.f853b0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f853b0);
    }

    @Override // q8.r
    public final List p(String str, List list) {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> checkServerTrusted = this.f854c0.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            checkServerTrusted.getClass();
            return checkServerTrusted;
        } catch (CertificateException e6) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e6.getMessage());
            sSLPeerUnverifiedException.initCause(e6);
            throw sSLPeerUnverifiedException;
        }
    }
}
