package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fe3  reason: default package */
/* loaded from: classes.dex */
public abstract class fe3 {
    public static final defpackage.l53 a = null;

    static {
            java.lang.String r0 = "kotlinx.serialization.json.JsonUnquotedLiteral"
            ps6 r1 = defpackage.ps6.a
            l53 r0 = defpackage.hi2.a(r1, r0)
            defpackage.fe3.a = r0
            return
    }

    public static final defpackage.df3 a(java.lang.Integer r2) {
            if (r2 != 0) goto L5
            ue3 r2 = defpackage.ue3.INSTANCE
            return r2
        L5:
            qe3 r0 = new qe3
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static final defpackage.df3 b(java.lang.String r2) {
            if (r2 != 0) goto L5
            ue3 r2 = defpackage.ue3.INSTANCE
            return r2
        L5:
            qe3 r0 = new qe3
            r1 = 1
            r0.<init>(r1, r2)
            return r0
    }

    public static final void c(defpackage.de3 r3, java.lang.String r4) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Element "
            r1.<init>(r2)
            java.lang.Class r3 = r3.getClass()
            ar0 r3 = defpackage.gh5.a(r3)
            r1.append(r3)
            java.lang.String r3 = " is not a "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final java.lang.Boolean d(defpackage.df3 r1) {
            java.lang.String r1 = r1.a()
            java.lang.String[] r0 = defpackage.os6.a
            r1.getClass()
            java.lang.String r0 = "true"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L14
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L14:
            java.lang.String r0 = "false"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L1f
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L1f:
            r1 = 0
            return r1
    }

    public static final int e(defpackage.df3 r4) {
            long r0 = i(r4)     // Catch: defpackage.ae3 -> L2f
            r2 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L14
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L14
            int r4 = (int) r0
            return r4
        L14:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r4 = r4.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = " is not an Int"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2f:
            r4 = move-exception
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r4 = r4.A
            r0.<init>(r4)
            throw r0
    }

    public static final defpackage.nd3 f(defpackage.de3 r2) {
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.nd3
            r1 = 0
            if (r0 == 0) goto Lc
            r0 = r2
            nd3 r0 = (defpackage.nd3) r0
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.String r0 = "JsonArray"
            c(r2, r0)
            throw r1
    }

    public static final defpackage.ye3 g(defpackage.de3 r2) {
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.ye3
            r1 = 0
            if (r0 == 0) goto Lc
            r0 = r2
            ye3 r0 = (defpackage.ye3) r0
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.String r0 = "JsonObject"
            c(r2, r0)
            throw r1
    }

    public static final defpackage.df3 h(defpackage.de3 r2) {
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.df3
            r1 = 0
            if (r0 == 0) goto Lc
            r0 = r2
            df3 r0 = (defpackage.df3) r0
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.String r0 = "JsonPrimitive"
            c(r2, r0)
            throw r1
    }

    public static final long i(defpackage.df3 r5) {
            hd3 r0 = defpackage.id3.d
            java.lang.String r5 = r5.a()
            ns6 r5 = defpackage.np2.i(r0, r5)
            java.lang.String r0 = r5.Z
            long r1 = r5.j()
            byte r3 = r5.g()
            r4 = 10
            if (r3 == r4) goto L42
            int r1 = r5.B
            if (r1 <= 0) goto L1f
            int r2 = r1 + (-1)
            goto L20
        L1f:
            r2 = r1
        L20:
            int r3 = r0.length()
            if (r1 == r3) goto L32
            if (r2 >= 0) goto L29
            goto L32
        L29:
            char r0 = r0.charAt(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L34
        L32:
            java.lang.String r0 = "EOF"
        L34:
            java.lang.String r1 = "Expected input to contain a single valid number, but got '"
            java.lang.String r3 = "' after it"
            java.lang.String r0 = defpackage.lb1.A(r1, r0, r3)
            r1 = 4
            r3 = 0
            defpackage.u0.q(r5, r0, r2, r3, r1)
            throw r3
        L42:
            return r1
    }
}
