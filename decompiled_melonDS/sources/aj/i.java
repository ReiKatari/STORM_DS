package aj;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements l {
    @Override // aj.l
    public final boolean a(SSLSocket sSLSocket) {
        if (k.f877b && Conscrypt.isConscrypt(sSLSocket)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aj.n, java.lang.Object] */
    @Override // aj.l
    public final n b(SSLSocket sSLSocket) {
        return new Object();
    }
}
