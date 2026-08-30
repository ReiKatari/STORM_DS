package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: da  reason: default package */
/* loaded from: classes.dex */
public final class da {
    public final k45 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final zi0 e;
    public final k45 f;
    public final ProxySelector g;
    public final hu2 h;
    public final List i;
    public final List j;

    public da(String str, int i, k45 k45Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, ub4 ub4Var, zi0 zi0Var, k45 k45Var2, List list, List list2, ProxySelector proxySelector) {
        String str2;
        str.getClass();
        k45Var.getClass();
        socketFactory.getClass();
        k45Var2.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = k45Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = ub4Var;
        this.e = zi0Var;
        this.f = k45Var2;
        this.g = proxySelector;
        gu2 gu2Var = new gu2(0);
        if (sSLSocketFactory == null) {
            str2 = "http";
        } else {
            str2 = "https";
        }
        if (str2.equalsIgnoreCase("http")) {
            gu2Var.c = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            gu2Var.c = "https";
        } else {
            i.i("unexpected scheme: ".concat(str2));
            throw null;
        }
        String b = ek7.b(dk7.C(str, 0, 0, 7));
        if (b != null) {
            gu2Var.f = b;
            if (1 <= i && i < 65536) {
                gu2Var.b = i;
                this.h = gu2Var.b();
                this.i = ik7.i(list);
                this.j = ik7.i(list2);
                return;
            }
            i.g(wh1.g(i, "unexpected port: "));
            throw null;
        }
        i.i("unexpected host: ".concat(str));
        throw null;
    }

    public final boolean a(da daVar) {
        daVar.getClass();
        if (b53.x(this.a, daVar.a) && b53.x(this.f, daVar.f) && b53.x(this.i, daVar.i) && b53.x(this.j, daVar.j) && b53.x(this.g, daVar.g) && b53.x(this.c, daVar.c) && b53.x(this.d, daVar.d) && b53.x(this.e, daVar.e) && this.h.e == daVar.h.e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof da) {
            da daVar = (da) obj;
            if (b53.x(this.h, daVar.h) && a(daVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int b = ej6.b(527, 31, this.h.i);
        int b2 = b31.b(b31.b((this.f.hashCode() + ((this.a.hashCode() + b) * 31)) * 31, 31, this.i), 31, this.j);
        int hashCode = Objects.hashCode(this.c);
        int hashCode2 = Objects.hashCode(this.d);
        return Objects.hashCode(this.e) + ((hashCode2 + ((hashCode + ((this.g.hashCode() + b2) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        hu2 hu2Var = this.h;
        sb.append(hu2Var.d);
        sb.append(':');
        sb.append(hu2Var.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
