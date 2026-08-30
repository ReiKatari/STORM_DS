package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tt6  reason: default package */
/* loaded from: classes.dex */
public final class tt6 {
    public static ut6 a(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return ut6.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return ut6.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return ut6.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return ut6.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return ut6.SSL_3_0;
        }
        i.i("Unexpected TLS version: ".concat(str));
        return null;
    }
}
