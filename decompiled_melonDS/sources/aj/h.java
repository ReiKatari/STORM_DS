package aj;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final f f874a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f875b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, aj.f] */
    static {
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, g.class.getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f875b = z10;
    }

    @Override // aj.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // aj.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && !applicationProtocol.equals("")) {
            return applicationProtocol;
        }
        return null;
    }

    @Override // aj.n
    public final boolean c() {
        return f875b;
    }

    @Override // aj.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            zi.f fVar = zi.f.f15151a;
            parameters.setApplicationProtocols((String[]) l7.a.e(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
