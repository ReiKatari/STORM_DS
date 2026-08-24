package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q50  reason: default package */
/* loaded from: classes.dex */
public final class q50 extends defpackage.fd4 {
    public final /* synthetic */ int q;

    public /* synthetic */ q50(boolean r1, int r2) {
            r0 = this;
            r0.q = r2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.fd4
    public final java.lang.Object a(android.os.Bundle r6, java.lang.String r7) {
            r5 = this;
            int r5 = r5.q
            r0 = 0
            switch(r5) {
                case 0: goto L72;
                case 1: goto L4e;
                case 2: goto L3f;
                case 3: goto L18;
                default: goto L6;
            }
        L6:
            boolean r5 = defpackage.i61.C(r6, r7, r7)
            if (r5 == 0) goto L17
            boolean r5 = defpackage.uj2.X(r6, r7)
            if (r5 == 0) goto L13
            goto L17
        L13:
            java.lang.String r0 = defpackage.uj2.P(r6, r7)
        L17:
            return r0
        L18:
            r6.getClass()
            r7.getClass()
            r1 = -9223372036854775808
            long r3 = r6.getLong(r7, r1)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L3a
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r5 = r6.getLong(r7, r1)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto L36
            goto L3a
        L36:
            defpackage.xk2.B(r7)
            throw r0
        L3a:
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            return r5
        L3f:
            r6.getClass()
            r7.getClass()
            int r5 = defpackage.uj2.I(r6, r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L4e:
            r6.getClass()
            r7.getClass()
            r5 = 1
            float r1 = r6.getFloat(r7, r5)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L6d
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r6 = r6.getFloat(r7, r5)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 == 0) goto L69
            goto L6d
        L69:
            defpackage.xk2.B(r7)
            throw r0
        L6d:
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            return r5
        L72:
            boolean r5 = defpackage.i61.C(r6, r7, r7)
            if (r5 == 0) goto L96
            boolean r5 = defpackage.uj2.X(r6, r7)
            if (r5 == 0) goto L7f
            goto L96
        L7f:
            r5 = 0
            boolean r5 = r6.getBoolean(r7, r5)
            if (r5 != 0) goto L92
            r1 = 1
            boolean r6 = r6.getBoolean(r7, r1)
            if (r6 == r1) goto L8e
            goto L92
        L8e:
            defpackage.xk2.B(r7)
            throw r0
        L92:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
        L96:
            return r0
    }

    @Override // defpackage.fd4
    public final java.lang.String b() {
            r0 = this;
            int r0 = r0.q
            switch(r0) {
                case 0: goto L11;
                case 1: goto Le;
                case 2: goto Lb;
                case 3: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "string"
            return r0
        L8:
            java.lang.String r0 = "long"
            return r0
        Lb:
            java.lang.String r0 = "integer"
            return r0
        Le:
            java.lang.String r0 = "float"
            return r0
        L11:
            java.lang.String r0 = "boolean"
            return r0
    }

    @Override // defpackage.fd4
    public final java.lang.Object d(java.lang.String r7) {
            r6 = this;
            int r6 = r6.q
            r0 = 16
            java.lang.String r1 = "0x"
            r2 = 1
            r3 = 2
            r4 = 0
            r5 = 0
            switch(r6) {
                case 0: goto L6c;
                case 1: goto L63;
                case 2: goto L48;
                case 3: goto L1a;
                default: goto Ld;
            }
        Ld:
            r7.getClass()
            java.lang.String r6 = "null"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L19
            r7 = r4
        L19:
            return r7
        L1a:
            java.lang.String r6 = "L"
            boolean r6 = defpackage.xs6.Y(r7, r6, r5)
            if (r6 == 0) goto L2c
            int r6 = r7.length()
            int r6 = r6 - r2
            java.lang.String r6 = r7.substring(r5, r6)
            goto L2d
        L2c:
            r6 = r7
        L2d:
            boolean r7 = defpackage.xs6.g0(r7, r1, r5)
            if (r7 == 0) goto L3f
            java.lang.String r6 = r6.substring(r3)
            defpackage.g04.y(r0)
            long r6 = java.lang.Long.parseLong(r6, r0)
            goto L43
        L3f:
            long r6 = java.lang.Long.parseLong(r6)
        L43:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            return r6
        L48:
            boolean r6 = defpackage.xs6.g0(r7, r1, r5)
            if (r6 == 0) goto L5a
            java.lang.String r6 = r7.substring(r3)
            defpackage.g04.y(r0)
            int r6 = java.lang.Integer.parseInt(r6, r0)
            goto L5e
        L5a:
            int r6 = java.lang.Integer.parseInt(r7)
        L5e:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L63:
            float r6 = java.lang.Float.parseFloat(r7)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            return r6
        L6c:
            java.lang.String r6 = "true"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L75
            goto L7e
        L75:
            java.lang.String r6 = "false"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L83
            r2 = r5
        L7e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            goto L88
        L83:
            java.lang.String r6 = "A boolean NavType only accepts \"true\" or \"false\" values."
            defpackage.i.h(r6)
        L88:
            return r4
    }

    @Override // defpackage.fd4
    public final void e(android.os.Bundle r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            int r2 = r2.q
            switch(r2) {
                case 0: goto L3c;
                case 1: goto L2f;
                case 2: goto L22;
                case 3: goto L15;
                default: goto L5;
            }
        L5:
            java.lang.String r5 = (java.lang.String) r5
            r4.getClass()
            if (r5 == 0) goto L10
            r3.putString(r4, r5)
            goto L14
        L10:
            r2 = 0
            r3.putString(r4, r2)
        L14:
            return
        L15:
            java.lang.Number r5 = (java.lang.Number) r5
            long r0 = r5.longValue()
            r4.getClass()
            r3.putLong(r4, r0)
            return
        L22:
            java.lang.Number r5 = (java.lang.Number) r5
            int r2 = r5.intValue()
            r4.getClass()
            r3.putInt(r4, r2)
            return
        L2f:
            java.lang.Number r5 = (java.lang.Number) r5
            float r2 = r5.floatValue()
            r4.getClass()
            r3.putFloat(r4, r2)
            return
        L3c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r2 = r5.booleanValue()
            r4.getClass()
            r3.putBoolean(r4, r2)
            return
    }

    @Override // defpackage.fd4
    public java.lang.String f(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.q
            switch(r0) {
                case 4: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.f(r2)
            return r1
        La:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L17
            r1 = 0
            java.lang.String r1 = android.net.Uri.encode(r2, r1)
            r1.getClass()
            goto L19
        L17:
            java.lang.String r1 = "null"
        L19:
            return r1
    }
}
