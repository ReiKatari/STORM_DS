package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n34  reason: default package */
/* loaded from: classes.dex */
public final class n34 {
    public static final xh5 d = new xh5("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final xh5 e = new xh5(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String[] c;

    public n34(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.a = str;
        this.b = str2;
        this.c = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Charset a(n34 n34Var) {
        String str;
        String[] strArr = n34Var.c;
        int i = 0;
        int s = nj2.s(0, strArr.length - 1, 2);
        if (s >= 0) {
            while (!xs6.Z(strArr[i], "charset", true)) {
                if (i != s) {
                    i += 2;
                }
            }
            str = strArr[i + 1];
            if (str != null) {
                return null;
            }
            try {
                return Charset.forName(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof n34) && nb3.k(((n34) obj).a, this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
