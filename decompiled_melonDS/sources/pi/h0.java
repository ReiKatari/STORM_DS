package pi;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f11725a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f11726b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f11727c;

    public h0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.f11725a = aVar;
        this.f11726b = proxy;
        this.f11727c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            if (h0Var.f11725a.equals(this.f11725a) && h0Var.f11726b.equals(this.f11726b) && nc.k.a(h0Var.f11727c, this.f11727c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f11726b.hashCode();
        return this.f11727c.hashCode() + ((hashCode + ((this.f11725a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String str;
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        r rVar = this.f11725a.f11665h;
        String str2 = rVar.f11784d;
        InetSocketAddress inetSocketAddress = this.f11727c;
        InetAddress address = inetSocketAddress.getAddress();
        if (address != null && (hostAddress = address.getHostAddress()) != null) {
            str = qi.d.b(hostAddress);
        } else {
            str = null;
        }
        if (vc.h.Z(str2, ':')) {
            sb2.append("[");
            sb2.append(str2);
            sb2.append("]");
        } else {
            sb2.append(str2);
        }
        if (rVar.f11785e != inetSocketAddress.getPort() || str2.equals(str)) {
            sb2.append(":");
            sb2.append(rVar.f11785e);
        }
        if (!str2.equals(str)) {
            if (this.f11726b.equals(Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (str == null) {
                sb2.append("<unresolved>");
            } else if (vc.h.Z(str, ':')) {
                sb2.append("[");
                sb2.append(str);
                sb2.append("]");
            } else {
                sb2.append(str);
            }
            sb2.append(":");
            sb2.append(inetSocketAddress.getPort());
        }
        return sb2.toString();
    }
}
