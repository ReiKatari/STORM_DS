package pi;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final j0 f11777a;

    /* renamed from: b  reason: collision with root package name */
    public final k f11778b;

    /* renamed from: c  reason: collision with root package name */
    public final List f11779c;

    /* renamed from: d  reason: collision with root package name */
    public final yb.n f11780d;

    public p(j0 j0Var, k kVar, List list, mc.a aVar) {
        j0Var.getClass();
        this.f11777a = j0Var;
        this.f11778b = kVar;
        this.f11779c = list;
        this.f11780d = new yb.n(new lg.e(4, aVar));
    }

    public final List a() {
        return (List) this.f11780d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (pVar.f11777a == this.f11777a && pVar.f11778b.equals(this.f11778b) && nc.k.a(pVar.a(), a()) && pVar.f11779c.equals(this.f11779c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f11778b.hashCode();
        int hashCode2 = a().hashCode();
        return this.f11779c.hashCode() + ((hashCode2 + ((hashCode + ((this.f11777a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a10 = a();
        ArrayList arrayList = new ArrayList(zb.m.G(a10, 10));
        for (Certificate certificate : a10) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f11777a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f11778b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f11779c;
        ArrayList arrayList2 = new ArrayList(zb.m.G(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
