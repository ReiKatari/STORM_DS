package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ir5  reason: default package */
/* loaded from: classes.dex */
public final class ir5 {
    public final da a;
    public final Proxy b;
    public final InetSocketAddress c;

    public ir5(da daVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.a = daVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ir5) {
            ir5 ir5Var = (ir5) obj;
            if (ir5Var.a.equals(this.a) && ir5Var.b.equals(this.b) && b53.x(ir5Var.c, this.c)) {
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
        hu2 hu2Var = this.a.h;
        String str2 = hu2Var.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address = inetSocketAddress.getAddress();
        if (address != null && (hostAddress = address.getHostAddress()) != null) {
            str = ek7.b(hostAddress);
        } else {
            str = null;
        }
        if (zg6.r0(str2, ':')) {
            sb.append("[");
            sb.append(str2);
            sb.append("]");
        } else {
            sb.append(str2);
        }
        if (hu2Var.e != inetSocketAddress.getPort() || str2.equals(str)) {
            sb.append(":");
            sb.append(hu2Var.e);
        }
        if (!str2.equals(str)) {
            if (this.b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (str == null) {
                sb.append("<unresolved>");
            } else if (zg6.r0(str, ':')) {
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
