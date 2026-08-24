package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ae  reason: default package */
/* loaded from: classes.dex */
public final class ae extends q60 {
    public final X509TrustManager p;
    public final X509TrustManagerExtensions q;

    public ae(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.p = x509TrustManager;
        this.q = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ae) && ((ae) obj).p == this.p) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.p);
    }

    @Override // defpackage.q60
    public final List q(String str, List list) {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> checkServerTrusted = this.q.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            checkServerTrusted.getClass();
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
