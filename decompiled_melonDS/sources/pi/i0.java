package pi;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 {
    public static j0 a(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return j0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return j0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return j0.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return j0.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return j0.SSL_3_0;
        }
        a0.j.h("Unexpected TLS version: ".concat(str));
        return null;
    }
}
