package dj;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import nc.k;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends r {

    /* renamed from: b0  reason: collision with root package name */
    public final d f4107b0;

    public a(d dVar) {
        dVar.getClass();
        this.f4107b0 = dVar;
    }

    public static boolean W(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i2) {
        if (k.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) && x509Certificate2.getBasicConstraints() >= i2) {
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
        if ((obj instanceof a) && k.a(((a) obj).f4107b0, this.f4107b0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4107b0.hashCode();
    }

    @Override // q8.r
    public final List p(String str, List list) {
        list.getClass();
        str.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        removeFirst.getClass();
        arrayList.add(removeFirst);
        boolean z10 = false;
        for (int i2 = 0; i2 < 9; i2++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a10 = this.f4107b0.a(x509Certificate);
            if (a10 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(a10)) {
                    arrayList.add(a10);
                }
                if (!W(a10, a10, arrayList.size() - 2)) {
                    z10 = true;
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
                    if (W(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z10) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
