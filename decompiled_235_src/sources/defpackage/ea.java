package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ea  reason: default package */
/* loaded from: classes.dex */
public final class ea {
    public final d90 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final il0 e;
    public final xd5 f;
    public final ProxySelector g;
    public final i03 h;
    public final List i;
    public final List j;

    public ea(String str, int i, d90 d90Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, il0 il0Var, xd5 xd5Var, List list, List list2, ProxySelector proxySelector) {
        String str2;
        str.getClass();
        d90Var.getClass();
        socketFactory.getClass();
        xd5Var.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = d90Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = il0Var;
        this.f = xd5Var;
        this.g = proxySelector;
        h03 h03Var = new h03(0);
        if (sSLSocketFactory == null) {
            str2 = "http";
        } else {
            str2 = "https";
        }
        if (str2.equalsIgnoreCase("http")) {
            h03Var.c = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            h03Var.c = "https";
        } else {
            i.h("unexpected scheme: ".concat(str2));
            throw null;
        }
        String b = wy7.b(jw2.x(0, 0, 7, str));
        if (b != null) {
            h03Var.f = b;
            if (1 <= i && i < 65536) {
                h03Var.b = i;
                this.h = h03Var.b();
                this.i = az7.j(list);
                this.j = az7.j(list2);
                return;
            }
            i.f(lb1.g(i, "unexpected port: "));
            throw null;
        }
        i.h("unexpected host: ".concat(str));
        throw null;
    }

    public final boolean a(ea eaVar) {
        eaVar.getClass();
        if (nb3.k(this.a, eaVar.a) && nb3.k(this.f, eaVar.f) && nb3.k(this.i, eaVar.i) && nb3.k(this.j, eaVar.j) && nb3.k(this.g, eaVar.g) && nb3.k(this.c, eaVar.c) && nb3.k(this.d, eaVar.d) && nb3.k(this.e, eaVar.e) && this.h.e == eaVar.h.e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ea) {
            ea eaVar = (ea) obj;
            if (nb3.k(this.h, eaVar.h) && a(eaVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int d = xg6.d(527, 31, this.h.i);
        int b = i61.b(i61.b((this.f.hashCode() + ((this.a.hashCode() + d) * 31)) * 31, this.i, 31), this.j, 31);
        int hashCode = Objects.hashCode(this.c);
        int hashCode2 = Objects.hashCode(this.d);
        return Objects.hashCode(this.e) + ((hashCode2 + ((hashCode + ((this.g.hashCode() + b) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        i03 i03Var = this.h;
        sb.append(i03Var.d);
        sb.append(':');
        sb.append(i03Var.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
