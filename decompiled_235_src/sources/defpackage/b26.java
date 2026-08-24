package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b26  reason: default package */
/* loaded from: classes.dex */
public final class b26 {
    public final ea a;
    public final Proxy b;
    public final InetSocketAddress c;

    public b26(ea eaVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.a = eaVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b26) {
            b26 b26Var = (b26) obj;
            if (b26Var.a.equals(this.a) && b26Var.b.equals(this.b) && nb3.k(b26Var.c, this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String str;
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        i03 i03Var = this.a.h;
        String str2 = i03Var.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address = inetSocketAddress.getAddress();
        if (address != null && (hostAddress = address.getHostAddress()) != null) {
            str = wy7.b(hostAddress);
        } else {
            str = null;
        }
        if (qs6.k0(str2, ':')) {
            sb.append("[");
            sb.append(str2);
            sb.append("]");
        } else {
            sb.append(str2);
        }
        if (i03Var.e != inetSocketAddress.getPort() || str2.equals(str)) {
            sb.append(":");
            sb.append(i03Var.e);
        }
        if (!str2.equals(str)) {
            if (this.b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (str == null) {
                sb.append("<unresolved>");
            } else if (qs6.k0(str, ':')) {
                sb.append("[");
                sb.append(str);
                sb.append("]");
            } else {
                sb.append(str);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
