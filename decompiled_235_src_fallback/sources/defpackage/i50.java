package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i50  reason: default package */
/* loaded from: classes.dex */
public final class i50 {
    public final /* synthetic */ int a;

    public /* synthetic */ i50(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public final java.lang.Object a(defpackage.d14 r6, defpackage.ng3 r7) {
            r5 = this;
            int r5 = r5.a
            r0 = 1
            r1 = 0
            switch(r5) {
                case 0: goto Lbf;
                case 1: goto Lb7;
                case 2: goto Laf;
                case 3: goto La9;
                case 4: goto L95;
                case 5: goto L5c;
                case 6: goto L4a;
                case 7: goto L15;
                case 8: goto Lf;
                default: goto L7;
            }
        L7:
            h50 r5 = new h50
            f14 r6 = r6.a
            r5.<init>(r6, r0)
            return r5
        Lf:
            qt1 r5 = new qt1
            r5.<init>(r0)
            return r5
        L15:
            f14 r5 = r6.a
            n51 r6 = defpackage.n51.BULLET
            h45 r0 = defpackage.u24.d
            java.lang.Object r0 = r0.a(r7)
            if (r6 != r0) goto L33
            i90 r6 = new i90
            h45 r0 = defpackage.u24.e
            java.lang.Object r7 = r0.a(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.<init>(r5, r7)
            goto L49
        L33:
            h45 r6 = defpackage.u24.f
            java.lang.Object r6 = r6.a(r7)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = ". "
            java.lang.String r6 = r6.concat(r7)
            io4 r7 = new io4
            r7.<init>(r5, r6)
            r6 = r7
        L49:
            return r6
        L4a:
            uv3 r5 = new uv3
            f14 r0 = r6.a
            h45 r1 = defpackage.u24.h
            java.lang.Object r7 = r1.a(r7)
            java.lang.String r7 = (java.lang.String) r7
            w31 r6 = r6.d
            r5.<init>(r0, r7, r6)
            return r5
        L5c:
            xv r5 = new xv
            f14 r0 = r6.a
            vv r1 = new vv
            h45 r2 = defpackage.mb3.s
            java.lang.Object r2 = r2.a(r7)
            java.lang.String r2 = (java.lang.String) r2
            nb3 r3 = r6.b
            w31 r6 = r6.f
            h45 r4 = defpackage.mb3.u
            java.util.HashMap r7 = r7.A
            java.lang.Object r4 = r7.get(r4)
            if (r4 != 0) goto L90
            r1.<init>(r2, r3, r6)
            h45 r6 = defpackage.mb3.t
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r6 = r7.get(r6)
            if (r6 == 0) goto L86
            r2 = r6
        L86:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r6 = r2.booleanValue()
            r5.<init>(r0, r1, r6)
            goto L94
        L90:
            defpackage.u34.a()
            r5 = 0
        L94:
            return r5
        L95:
            bx2 r5 = new bx2
            f14 r6 = r6.a
            h45 r0 = defpackage.u24.g
            java.lang.Object r7 = r0.a(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.<init>(r6, r7)
            return r5
        La9:
            qt1 r5 = new qt1
            r5.<init>(r1)
            return r5
        Laf:
            js0 r5 = new js0
            f14 r6 = r6.a
            r5.<init>(r6, r1)
            return r5
        Lb7:
            is0 r5 = new is0
            f14 r6 = r6.a
            r5.<init>(r6)
            return r5
        Lbf:
            h50 r5 = new h50
            f14 r6 = r6.a
            r5.<init>(r6, r1)
            return r5
    }
}
