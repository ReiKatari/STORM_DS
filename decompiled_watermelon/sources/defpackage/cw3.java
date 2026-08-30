package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cw3  reason: default package */
/* loaded from: classes.dex */
public final class cw3 {
    public static final h85 d = new h85("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final h85 e = new h85(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String[] c;

    public cw3(String str, String str2, String str3, String[] strArr) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.charset.Charset a(defpackage.cw3 r6) {
        /*
            java.lang.String[] r6 = r6.c
            int r0 = r6.length
            int r0 = r0 + (-1)
            r1 = 2
            r2 = 0
            int r0 = defpackage.cg2.E(r2, r0, r1)
            r1 = 0
            if (r0 < 0) goto L22
        Le:
            r3 = r6[r2]
            java.lang.String r4 = "charset"
            r5 = 1
            boolean r3 = defpackage.gh6.g0(r3, r4, r5)
            if (r3 == 0) goto L1d
            int r2 = r2 + r5
            r6 = r6[r2]
            goto L23
        L1d:
            if (r2 == r0) goto L22
            int r2 = r2 + 2
            goto Le
        L22:
            r6 = r1
        L23:
            if (r6 != 0) goto L26
            return r1
        L26:
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.IllegalArgumentException -> L2b
            return r6
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw3.a(cw3):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cw3) && b53.x(((cw3) obj).a, this.a)) {
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
