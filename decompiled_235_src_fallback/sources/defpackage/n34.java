package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n34  reason: default package */
/* loaded from: classes.dex */
public final class n34 {
    public static final defpackage.xh5 d = null;
    public static final defpackage.xh5 e = null;
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String[] c;

    static {
            xh5 r0 = new xh5
            java.lang.String r1 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)"
            r0.<init>(r1)
            defpackage.n34.d = r0
            xh5 r0 = new xh5
            java.lang.String r1 = ";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?"
            r0.<init>(r1)
            defpackage.n34.e = r0
            return
    }

    public n34(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            return
    }

    public static java.nio.charset.Charset a(defpackage.n34 r6) {
            java.lang.String[] r6 = r6.c
            int r0 = r6.length
            int r0 = r0 + (-1)
            r1 = 2
            r2 = 0
            int r0 = defpackage.nj2.s(r2, r0, r1)
            r1 = 0
            if (r0 < 0) goto L22
        Le:
            r3 = r6[r2]
            java.lang.String r4 = "charset"
            r5 = 1
            boolean r3 = defpackage.xs6.Z(r3, r4, r5)
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
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.n34
            if (r0 == 0) goto L12
            n34 r2 = (defpackage.n34) r2
            java.lang.String r2 = r2.a
            java.lang.String r1 = r1.a
            boolean r1 = defpackage.nb3.k(r2, r1)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.a
            return r0
    }
}
