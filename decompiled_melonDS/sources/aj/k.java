package aj;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final i f876a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f877b;

    /* JADX WARN: Type inference failed for: r0v0, types: [aj.i, java.lang.Object] */
    static {
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, j.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (j.a()) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f877b = z10;
    }

    @Override // aj.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // aj.n
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // aj.n
    public final boolean c() {
        return f877b;
    }

    @Override // aj.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            zi.f fVar = zi.f.f15151a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) l7.a.e(list).toArray(new String[0]));
        }
    }
}
