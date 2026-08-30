package xa;

import java.net.InetAddress;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class q0 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        return InetAddress.getByName(aVar.b0());
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        String hostAddress;
        InetAddress inetAddress = (InetAddress) obj;
        if (inetAddress == null) {
            hostAddress = null;
        } else {
            hostAddress = inetAddress.getHostAddress();
        }
        cVar.Y(hostAddress);
    }
}
