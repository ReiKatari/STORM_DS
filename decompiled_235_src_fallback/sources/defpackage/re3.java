package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: re3  reason: default package */
/* loaded from: classes.dex */
public final class re3 implements defpackage.gg3 {
    public static final defpackage.re3 a = null;
    public static final defpackage.x25 b = null;

    static {
            re3 r0 = new re3
            r0.<init>()
            defpackage.re3.a = r0
            java.lang.String r0 = "kotlinx.serialization.json.JsonLiteral"
            v25 r1 = defpackage.v25.m
            x25 r0 = defpackage.mp2.b(r0, r1)
            defpackage.re3.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r4) {
            r3 = this;
            yd3 r3 = defpackage.gi2.l(r4)
            de3 r4 = r3.y()
            boolean r0 = r4 instanceof defpackage.qe3
            if (r0 != 0) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected JSON element, expected JsonLiteral, had "
            r0.<init>(r1)
            java.lang.Class r1 = r4.getClass()
            ar0 r1 = defpackage.gh5.a(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            id3 r3 = r3.S()
            td3 r3 = r3.a
            boolean r3 = r3.g
            r1 = -1
            r2 = 0
            if (r3 == 0) goto L3b
            java.lang.String r3 = r4.toString()
            java.lang.CharSequence r3 = defpackage.hi2.H(r1, r3)
            java.lang.String r3 = r3.toString()
            goto L3c
        L3b:
            r3 = r2
        L3c:
            ae3 r4 = new ae3
            java.lang.String r3 = defpackage.hi2.x(r0, r2, r1, r2, r3)
            r4.<init>(r3)
            throw r4
        L46:
            qe3 r4 = (defpackage.qe3) r4
            return r4
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r3, java.lang.Object r4) {
            r2 = this;
            qe3 r4 = (defpackage.qe3) r4
            r4.getClass()
            java.lang.String r2 = r4.B
            defpackage.gi2.j(r3)
            boolean r4 = r4.A
            if (r4 == 0) goto L12
            r3.d0(r2)
            return
        L12:
            java.lang.Long r4 = defpackage.xs6.i0(r2)
            if (r4 == 0) goto L20
            long r0 = r4.longValue()
            r3.X(r0)
            return
        L20:
            rf7 r4 = defpackage.qo2.V(r2)
            if (r4 == 0) goto L32
            long r0 = r4.A
            l53 r2 = defpackage.vf7.b
            x32 r2 = r3.s(r2)
            r2.X(r0)
            return
        L32:
            r4 = 0
            boolean r0 = defpackage.ws6.T(r2)     // Catch: java.lang.NumberFormatException -> L42
            if (r0 == 0) goto L42
            double r0 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.NumberFormatException -> L42
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L42
            goto L43
        L42:
            r0 = r4
        L43:
            if (r0 == 0) goto L4d
            double r0 = r0.doubleValue()
            r3.l(r0)
            goto L6f
        L4d:
            java.lang.String r0 = "true"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L58
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto L62
        L58:
            java.lang.String r0 = "false"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L62
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L62:
            if (r4 == 0) goto L6c
            boolean r2 = r4.booleanValue()
            r3.r(r2)
            goto L6f
        L6c:
            r3.d0(r2)
        L6f:
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            x25 r0 = defpackage.re3.b
            return r0
    }
}
