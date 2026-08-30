package pi;

import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements k0 {

    /* renamed from: b  reason: collision with root package name */
    public static final b f11671b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final b f11672c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final b f11673d = new Object();

    public static final k a(b bVar, String str) {
        k kVar = new k(str);
        k.f11733d.put(str, kVar);
        return kVar;
    }

    public static final void b(List list, StringBuilder sb2) {
        sc.b H = p7.j.H(p7.j.L(0, list.size()), 2);
        int i2 = H.A;
        int i10 = H.B;
        int i11 = H.L;
        if ((i11 <= 0 || i2 > i10) && (i11 >= 0 || i10 > i2)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i2);
            String str2 = (String) list.get(i2 + 1);
            if (i2 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
            if (i2 != i10) {
                i2 += i11;
            } else {
                return;
            }
        }
    }

    public synchronized k c(String str) {
        k kVar;
        String str2;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = k.f11733d;
            kVar = (k) linkedHashMap.get(str);
            if (kVar == null) {
                if (vc.o.V(str, "TLS_", false)) {
                    str2 = "SSL_".concat(str.substring(4));
                } else if (vc.o.V(str, "SSL_", false)) {
                    str2 = "TLS_".concat(str.substring(4));
                } else {
                    str2 = str;
                }
                kVar = (k) linkedHashMap.get(str2);
                if (kVar == null) {
                    kVar = new k(str);
                }
                linkedHashMap.put(str, kVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return kVar;
    }
}
