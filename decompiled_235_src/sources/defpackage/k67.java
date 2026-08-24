package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k67  reason: default package */
/* loaded from: classes.dex */
public final class k67 {
    public static l67 a(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return l67.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return l67.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return l67.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return l67.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return l67.SSL_3_0;
        }
        i.h("Unexpected TLS version: ".concat(str));
        return null;
    }
}
