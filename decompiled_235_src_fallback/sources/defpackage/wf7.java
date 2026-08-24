package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wf7  reason: default package */
/* loaded from: classes.dex */
public final class wf7 extends defpackage.fd4 {
    public static final defpackage.wf7 r = null;
    public final /* synthetic */ int q;

    static {
            wf7 r0 = new wf7
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.wf7.r = r0
            return
    }

    public /* synthetic */ wf7(boolean r1, int r2) {
            r0 = this;
            r0.q = r2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.fd4
    public final java.lang.Object a(android.os.Bundle r8, java.lang.String r9) {
            r7 = this;
            int r7 = r7.q
            r0 = 1
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r4 = 0
            switch(r7) {
                case 0: goto L108;
                case 1: goto Lf7;
                case 2: goto Ld3;
                case 3: goto Lad;
                case 4: goto L8d;
                case 5: goto L63;
                case 6: goto L4e;
                case 7: goto L21;
                default: goto Ld;
            }
        Ld:
            boolean r7 = defpackage.i61.C(r8, r9, r9)
            if (r7 == 0) goto L1e
            boolean r7 = defpackage.uj2.X(r8, r9)
            if (r7 != 0) goto L1e
            java.lang.String r7 = defpackage.uj2.P(r8, r9)
            goto L20
        L1e:
            java.lang.String r7 = "null"
        L20:
            return r7
        L21:
            boolean r7 = defpackage.i61.C(r8, r9, r9)
            if (r7 == 0) goto L4d
            boolean r7 = defpackage.uj2.X(r8, r9)
            if (r7 != 0) goto L4d
            r0 = -9223372036854775808
            long r2 = r8.getLong(r9, r0)
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 != 0) goto L49
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r7 = r8.getLong(r9, r0)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 == 0) goto L45
            goto L49
        L45:
            defpackage.xk2.B(r9)
            throw r4
        L49:
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
        L4d:
            return r4
        L4e:
            boolean r7 = defpackage.i61.C(r8, r9, r9)
            if (r7 == 0) goto L62
            boolean r7 = defpackage.uj2.X(r8, r9)
            if (r7 != 0) goto L62
            int r7 = defpackage.uj2.I(r8, r9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
        L62:
            return r4
        L63:
            boolean r7 = defpackage.i61.C(r8, r9, r9)
            if (r7 == 0) goto L8c
            boolean r7 = defpackage.uj2.X(r8, r9)
            if (r7 != 0) goto L8c
            r7 = 1
            float r0 = r8.getFloat(r9, r7)
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 != 0) goto L88
            r7 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r8 = r8.getFloat(r9, r7)
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 == 0) goto L84
            goto L88
        L84:
            defpackage.xk2.B(r9)
            throw r4
        L88:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
        L8c:
            return r4
        L8d:
            r8.getClass()
            r9.getClass()
            double r5 = r8.getDouble(r9, r0)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 != 0) goto La8
            double r7 = r8.getDouble(r9, r2)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto La4
            goto La8
        La4:
            defpackage.xk2.B(r9)
            throw r4
        La8:
            java.lang.Double r7 = java.lang.Double.valueOf(r5)
            return r7
        Lad:
            boolean r7 = defpackage.i61.C(r8, r9, r9)
            if (r7 == 0) goto Ld2
            boolean r7 = defpackage.uj2.X(r8, r9)
            if (r7 != 0) goto Ld2
            double r5 = r8.getDouble(r9, r0)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 != 0) goto Lce
            double r7 = r8.getDouble(r9, r2)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto Lca
            goto Lce
        Lca:
            defpackage.xk2.B(r9)
            throw r4
        Lce:
            java.lang.Double r4 = java.lang.Double.valueOf(r5)
        Ld2:
            return r4
        Ld3:
            boolean r7 = defpackage.i61.C(r8, r9, r9)
            if (r7 == 0) goto Lf6
            boolean r7 = defpackage.uj2.X(r8, r9)
            if (r7 != 0) goto Lf6
            r7 = 0
            boolean r7 = r8.getBoolean(r9, r7)
            if (r7 != 0) goto Lf2
            r0 = 1
            boolean r8 = r8.getBoolean(r9, r0)
            if (r8 == r0) goto Lee
            goto Lf2
        Lee:
            defpackage.xk2.B(r9)
            throw r4
        Lf2:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
        Lf6:
            return r4
        Lf7:
            r8.getClass()
            r9.getClass()
            java.lang.Class<g10> r7 = defpackage.g10.class
            java.lang.Object r7 = defpackage.nc1.R(r8, r9, r7)
            android.os.Parcelable r7 = (android.os.Parcelable) r7
            g10 r7 = (defpackage.g10) r7
            return r7
        L108:
            r8.getClass()
            r9.getClass()
            return r4
    }

    @Override // defpackage.fd4
    public java.lang.String b() {
            r1 = this;
            int r0 = r1.q
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L5;
                case 2: goto L1c;
                case 3: goto L19;
                case 4: goto L16;
                case 5: goto L13;
                case 6: goto L10;
                case 7: goto Ld;
                case 8: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.b()
            return r1
        La:
            java.lang.String r1 = "string_non_nullable"
            return r1
        Ld:
            java.lang.String r1 = "long_nullable"
            return r1
        L10:
            java.lang.String r1 = "integer_nullable"
            return r1
        L13:
            java.lang.String r1 = "float_nullable"
            return r1
        L16:
            java.lang.String r1 = "double"
            return r1
        L19:
            java.lang.String r1 = "double_nullable"
            return r1
        L1c:
            java.lang.String r1 = "boolean_nullable"
            return r1
        L1f:
            java.lang.String r1 = "unknown"
            return r1
    }

    @Override // defpackage.fd4
    public final java.lang.Object d(java.lang.String r3) {
            r2 = this;
            int r2 = r2.q
            r0 = 0
            java.lang.String r1 = "null"
            switch(r2) {
                case 0: goto L79;
                case 1: goto L65;
                case 2: goto L54;
                case 3: goto L44;
                case 4: goto L3b;
                case 5: goto L2b;
                case 6: goto L1a;
                case 7: goto L9;
                default: goto L8;
            }
        L8:
            return r3
        L9:
            boolean r2 = r3.equals(r1)
            if (r2 == 0) goto L10
            goto L19
        L10:
            q50 r2 = defpackage.fd4.e
            java.lang.Object r2 = r2.d(r3)
            r0 = r2
            java.lang.Long r0 = (java.lang.Long) r0
        L19:
            return r0
        L1a:
            boolean r2 = r3.equals(r1)
            if (r2 == 0) goto L21
            goto L2a
        L21:
            q50 r2 = defpackage.fd4.b
            java.lang.Object r2 = r2.d(r3)
            r0 = r2
            java.lang.Integer r0 = (java.lang.Integer) r0
        L2a:
            return r0
        L2b:
            boolean r2 = r3.equals(r1)
            if (r2 == 0) goto L32
            goto L3a
        L32:
            float r2 = java.lang.Float.parseFloat(r3)
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
        L3a:
            return r0
        L3b:
            double r2 = java.lang.Double.parseDouble(r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        L44:
            boolean r2 = r3.equals(r1)
            if (r2 == 0) goto L4b
            goto L53
        L4b:
            double r2 = java.lang.Double.parseDouble(r3)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
        L53:
            return r0
        L54:
            boolean r2 = r3.equals(r1)
            if (r2 == 0) goto L5b
            goto L64
        L5b:
            q50 r2 = defpackage.fd4.k
            java.lang.Object r2 = r2.d(r3)
            r0 = r2
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L64:
            return r0
        L65:
            hd3 r2 = defpackage.id3.d
            r2.getClass()
            f10 r0 = defpackage.g10.Companion
            gg3 r0 = r0.serializer()
            gg3 r0 = (defpackage.gg3) r0
            java.lang.Object r2 = r2.a(r0, r3)
            g10 r2 = (defpackage.g10) r2
            return r2
        L79:
            return r1
    }

    @Override // defpackage.fd4
    public final void e(android.os.Bundle r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            int r2 = r2.q
            r0 = 0
            switch(r2) {
                case 0: goto L82;
                case 1: goto L76;
                case 2: goto L65;
                case 3: goto L52;
                case 4: goto L45;
                case 5: goto L34;
                case 6: goto L23;
                case 7: goto L12;
                default: goto L6;
            }
        L6:
            java.lang.String r5 = (java.lang.String) r5
            r4.getClass()
            r5.getClass()
            r3.putString(r4, r5)
            return
        L12:
            java.lang.Long r5 = (java.lang.Long) r5
            r4.getClass()
            if (r5 != 0) goto L1d
            r3.putString(r4, r0)
            goto L22
        L1d:
            q50 r2 = defpackage.fd4.e
            r2.e(r3, r4, r5)
        L22:
            return
        L23:
            java.lang.Integer r5 = (java.lang.Integer) r5
            r4.getClass()
            if (r5 != 0) goto L2e
            r3.putString(r4, r0)
            goto L33
        L2e:
            q50 r2 = defpackage.fd4.b
            r2.e(r3, r4, r5)
        L33:
            return
        L34:
            java.lang.Float r5 = (java.lang.Float) r5
            r4.getClass()
            if (r5 != 0) goto L3f
            r3.putString(r4, r0)
            goto L44
        L3f:
            q50 r2 = defpackage.fd4.h
            r2.e(r3, r4, r5)
        L44:
            return
        L45:
            java.lang.Number r5 = (java.lang.Number) r5
            double r0 = r5.doubleValue()
            r4.getClass()
            r3.putDouble(r4, r0)
            return
        L52:
            java.lang.Double r5 = (java.lang.Double) r5
            r4.getClass()
            if (r5 != 0) goto L5d
            r3.putString(r4, r0)
            goto L64
        L5d:
            double r0 = r5.doubleValue()
            r3.putDouble(r4, r0)
        L64:
            return
        L65:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r4.getClass()
            if (r5 != 0) goto L70
            r3.putString(r4, r0)
            goto L75
        L70:
            q50 r2 = defpackage.fd4.k
            r2.e(r3, r4, r5)
        L75:
            return
        L76:
            g10 r5 = (defpackage.g10) r5
            r4.getClass()
            r5.getClass()
            r3.putParcelable(r4, r5)
            return
        L82:
            java.lang.String r5 = (java.lang.String) r5
            r4.getClass()
            r5.getClass()
            return
    }

    @Override // defpackage.fd4
    public java.lang.String f(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.q
            switch(r0) {
                case 1: goto L18;
                case 8: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.f(r2)
            return r1
        La:
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            r1 = 0
            java.lang.String r1 = android.net.Uri.encode(r2, r1)
            r1.getClass()
            return r1
        L18:
            g10 r2 = (defpackage.g10) r2
            r2.getClass()
            hd3 r1 = defpackage.id3.d
            r1.getClass()
            f10 r0 = defpackage.g10.Companion
            gg3 r0 = r0.serializer()
            gg3 r0 = (defpackage.gg3) r0
            java.lang.String r1 = r1.b(r0, r2)
            java.lang.String r1 = android.net.Uri.encode(r1)
            r1.getClass()
            return r1
    }
}
