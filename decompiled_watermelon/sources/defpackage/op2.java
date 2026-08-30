package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: op2  reason: default package */
/* loaded from: classes.dex */
public final class op2 {
    public final ut6 a;
    public final ho0 b;
    public final List c;
    public final il6 d;

    public op2(ut6 ut6Var, ho0 ho0Var, List list, ki2 ki2Var) {
        ut6Var.getClass();
        this.a = ut6Var;
        this.b = ho0Var;
        this.c = list;
        this.d = new il6(new w7(10, ki2Var));
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof op2) {
            op2 op2Var = (op2) obj;
            if (op2Var.a == this.a && op2Var.b == this.b && b53.x(op2Var.a(), a()) && op2Var.c.equals(this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = a().hashCode();
        return this.c.hashCode() + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a = a();
        ArrayList arrayList = new ArrayList(uq0.y0(a, 10));
        for (Certificate certificate : a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(uq0.y0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
