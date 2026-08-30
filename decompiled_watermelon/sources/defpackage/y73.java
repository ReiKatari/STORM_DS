package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y73  reason: default package */
/* loaded from: classes.dex */
public final class y73 implements m93 {
    public static final y73 a = new Object();
    public static final vt4 b = oo2.j("kotlinx.serialization.json.JsonLiteral", tt4.p);

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        String str;
        f73 m = sn2.m(b91Var);
        k73 I = m.I();
        if (!(I instanceof x73)) {
            String str2 = "Unexpected JSON element, expected JsonLiteral, had " + q75.a(I.getClass());
            if (m.D().a.g) {
                str = io2.Z(-1, I.toString()).toString();
            } else {
                str = null;
            }
            throw new t73(io2.u(str2, null, -1, null, str));
        }
        return (x73) I;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // defpackage.m93
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.mz1 r3, java.lang.Object r4) {
        /*
            r2 = this;
            x73 r4 = (defpackage.x73) r4
            r4.getClass()
            java.lang.String r2 = r4.B
            defpackage.sn2.j(r3)
            boolean r4 = r4.A
            if (r4 == 0) goto L12
            r3.b0(r2)
            return
        L12:
            java.lang.Long r4 = defpackage.gh6.p0(r2)
            if (r4 == 0) goto L20
            long r0 = r4.longValue()
            r3.P(r0)
            return
        L20:
            w17 r4 = defpackage.nl2.e0(r2)
            if (r4 == 0) goto L32
            long r0 = r4.A
            iz2 r2 = defpackage.a27.b
            mz1 r2 = r3.x(r2)
            r2.P(r0)
            return
        L32:
            r4 = 0
            boolean r0 = defpackage.fh6.a0(r2)     // Catch: java.lang.NumberFormatException -> L42
            if (r0 == 0) goto L42
            double r0 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.NumberFormatException -> L42
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L42
            goto L43
        L42:
            r0 = r4
        L43:
            if (r0 == 0) goto L4d
            double r0 = r0.doubleValue()
            r3.o(r0)
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
            r3.w(r2)
            goto L6f
        L6c:
            r3.b0(r2)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y73.d(mz1, java.lang.Object):void");
    }

    @Override // defpackage.m93
    public final h06 e() {
        return b;
    }
}
