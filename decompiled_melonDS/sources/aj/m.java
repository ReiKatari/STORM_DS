package aj;

import java.util.List;
import javax.net.ssl.SSLSocket;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a  reason: collision with root package name */
    public final l f878a;

    /* renamed from: b  reason: collision with root package name */
    public n f879b;

    public m(l lVar) {
        this.f878a = lVar;
    }

    @Override // aj.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f878a.a(sSLSocket);
    }

    @Override // aj.n
    public final String b(SSLSocket sSLSocket) {
        n e6 = e(sSLSocket);
        if (e6 != null) {
            return e6.b(sSLSocket);
        }
        return null;
    }

    @Override // aj.n
    public final boolean c() {
        return true;
    }

    @Override // aj.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        n e6 = e(sSLSocket);
        if (e6 != null) {
            e6.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f879b == null && this.f878a.a(sSLSocket)) {
                this.f879b = this.f878a.b(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f879b;
    }
}
