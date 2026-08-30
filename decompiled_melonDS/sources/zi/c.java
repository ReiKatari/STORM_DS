package zi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements dj.d {

    /* renamed from: a  reason: collision with root package name */
    public final X509TrustManager f15146a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f15147b;

    public c(X509TrustManager x509TrustManager, Method method) {
        this.f15146a = x509TrustManager;
        this.f15147b = method;
    }

    @Override // dj.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f15147b.invoke(this.f15146a, x509Certificate);
            invoke.getClass();
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e6) {
            throw new AssertionError("unable to get issues and signature", e6);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!this.f15146a.equals(cVar.f15146a) || !this.f15147b.equals(cVar.f15147b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15147b.hashCode() + (this.f15146a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f15146a + ", findByIssuerAndSignatureMethod=" + this.f15147b + ')';
    }
}
