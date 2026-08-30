package pi;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f11658a;

    /* renamed from: b  reason: collision with root package name */
    public final SocketFactory f11659b;

    /* renamed from: c  reason: collision with root package name */
    public final SSLSocketFactory f11660c;

    /* renamed from: d  reason: collision with root package name */
    public final HostnameVerifier f11661d;

    /* renamed from: e  reason: collision with root package name */
    public final i f11662e;

    /* renamed from: f  reason: collision with root package name */
    public final b f11663f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f11664g;

    /* renamed from: h  reason: collision with root package name */
    public final r f11665h;

    /* renamed from: i  reason: collision with root package name */
    public final List f11666i;

    /* renamed from: j  reason: collision with root package name */
    public final List f11667j;

    public a(String str, int i2, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, dj.c cVar, i iVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        String str2;
        str.getClass();
        bVar.getClass();
        socketFactory.getClass();
        bVar2.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.f11658a = bVar;
        this.f11659b = socketFactory;
        this.f11660c = sSLSocketFactory;
        this.f11661d = cVar;
        this.f11662e = iVar;
        this.f11663f = bVar2;
        this.f11664g = proxySelector;
        na.a0 a0Var = new na.a0(1);
        if (sSLSocketFactory == null) {
            str2 = "http";
        } else {
            str2 = "https";
        }
        if (str2.equalsIgnoreCase("http")) {
            a0Var.f10119c = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            a0Var.f10119c = "https";
        } else {
            a0.j.h("unexpected scheme: ".concat(str2));
            throw null;
        }
        String b10 = qi.d.b(ej.a.d(str, 0, 0, 7));
        if (b10 != null) {
            a0Var.f10122f = b10;
            if (1 <= i2 && i2 < 65536) {
                a0Var.f10118b = i2;
                this.f11665h = a0Var.b();
                this.f11666i = qi.g.i(list);
                this.f11667j = qi.g.i(list2);
                return;
            }
            a0.j.e(w.d.l(i2, "unexpected port: "));
            throw null;
        }
        a0.j.h("unexpected host: ".concat(str));
        throw null;
    }

    public final boolean a(a aVar) {
        aVar.getClass();
        if (nc.k.a(this.f11658a, aVar.f11658a) && nc.k.a(this.f11663f, aVar.f11663f) && nc.k.a(this.f11666i, aVar.f11666i) && nc.k.a(this.f11667j, aVar.f11667j) && nc.k.a(this.f11664g, aVar.f11664g) && nc.k.a(this.f11660c, aVar.f11660c) && nc.k.a(this.f11661d, aVar.f11661d) && nc.k.a(this.f11662e, aVar.f11662e) && this.f11665h.f11785e == aVar.f11665h.f11785e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (nc.k.a(this.f11665h, aVar.f11665h) && a(aVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int d4 = w.d.d(527, 31, this.f11665h.f11789i);
        int hashCode = this.f11663f.hashCode();
        int hashCode2 = this.f11666i.hashCode();
        int hashCode3 = this.f11667j.hashCode();
        int hashCode4 = this.f11664g.hashCode();
        int hashCode5 = Objects.hashCode(this.f11660c);
        int hashCode6 = Objects.hashCode(this.f11661d);
        return Objects.hashCode(this.f11662e) + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f11658a.hashCode() + d4) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        r rVar = this.f11665h;
        sb2.append(rVar.f11784d);
        sb2.append(':');
        sb2.append(rVar.f11785e);
        sb2.append(", ");
        sb2.append("proxySelector=" + this.f11664g);
        sb2.append('}');
        return sb2.toString();
    }
}
