package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j10  reason: default package */
/* loaded from: classes.dex */
public final class j10 extends dk7 {
    public final vy6 r;

    public j10(vy6 vy6Var) {
        vy6Var.getClass();
        this.r = vy6Var;
    }

    public static boolean L(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i) {
        if (b53.x(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) && x509Certificate2.getBasicConstraints() >= i) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return true;
            } catch (GeneralSecurityException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof j10) && b53.x(((j10) obj).r, this.r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    @Override // defpackage.dk7
    public final List o(String str, List list) {
        list.getClass();
        str.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        removeFirst.getClass();
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a = this.r.a(x509Certificate);
            if (a != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(a)) {
                    arrayList.add(a);
                }
                if (!L(a, a, arrayList.size() - 2)) {
                    z = true;
                } else {
                    return arrayList;
                }
            } else {
                Iterator it = arrayDeque.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (L(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
