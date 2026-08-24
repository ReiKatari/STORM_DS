package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v91  reason: default package */
/* loaded from: classes.dex */
public final class v91 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ android.content.Context Z;

    public /* synthetic */ v91(android.content.Context r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L15;
                default: goto L7;
            }
        L7:
            y33 r3 = (defpackage.y33) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            v91 r2 = (defpackage.v91) r2
            r2.s(r1)
            return r1
        L15:
            t33 r3 = (defpackage.t33) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            v91 r2 = (defpackage.v91) r2
            r2.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            v91 r0 = new v91
            android.content.Context r2 = r2.Z
            r1 = 1
            r0.<init>(r2, r3, r1)
            r0.Y = r4
            return r0
        L10:
            v91 r0 = new v91
            android.content.Context r2 = r2.Z
            r1 = 0
            r0.<init>(r2, r3, r1)
            r0.Y = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.X
            r1 = 0
            jg7 r2 = defpackage.jg7.a
            android.content.Context r3 = r4.Z
            java.lang.Object r4 = r4.Y
            switch(r0) {
                case 0: goto L6c;
                default: goto Lc;
            }
        Lc:
            y33 r4 = (defpackage.y33) r4
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r5)
            boolean r5 = r4 instanceof defpackage.x33
            if (r5 == 0) goto L2a
            x33 r4 = (defpackage.x33) r4
            java.lang.String r4 = r4.a
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r5 = 2131951876(0x7f130104, float:1.9540179E38)
            java.lang.String r4 = r3.getString(r5, r4)
            r4.getClass()
            goto L5e
        L2a:
            boolean r5 = r4 instanceof defpackage.w33
            if (r5 == 0) goto L39
            r4 = 2131951875(0x7f130103, float:1.9540177E38)
            java.lang.String r4 = r3.getString(r4)
            r4.getClass()
            goto L5e
        L39:
            boolean r5 = r4 instanceof defpackage.v33
            if (r5 == 0) goto L50
            v33 r4 = (defpackage.v33) r4
            java.lang.String r4 = r4.a
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r5 = 2131951872(0x7f130100, float:1.954017E38)
            java.lang.String r4 = r3.getString(r5, r4)
            r4.getClass()
            goto L5e
        L50:
            boolean r4 = r4 instanceof defpackage.u33
            if (r4 == 0) goto L68
            r4 = 2131951871(0x7f1300ff, float:1.9540169E38)
            java.lang.String r4 = r3.getString(r4)
            r4.getClass()
        L5e:
            r5 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r5)
            r4.show()
            r1 = r2
            goto L6b
        L68:
            defpackage.i.d()
        L6b:
            return r1
        L6c:
            t33 r4 = (defpackage.t33) r4
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r5)
            int[] r5 = defpackage.aa1.b
            int r4 = r4.ordinal()
            r4 = r5[r4]
            switch(r4) {
                case 1: goto Le6;
                case 2: goto Ldb;
                case 3: goto Ld0;
                case 4: goto Lc5;
                case 5: goto Lba;
                case 6: goto Laf;
                case 7: goto La4;
                case 8: goto L99;
                case 9: goto L8e;
                case 10: goto L83;
                default: goto L7e;
            }
        L7e:
            defpackage.i.d()
            goto Lf1
        L83:
            r4 = 2131951885(0x7f13010d, float:1.9540197E38)
            java.lang.String r4 = r3.getString(r4)
            r4.getClass()
            goto Le8
        L8e:
            r4 = 2131951879(0x7f130107, float:1.9540185E38)
            java.lang.String r4 = r3.getString(r4)
            r4.getClass()
            goto Le8
        L99:
            r4 = 2131951878(0x7f130106, float:1.9540183E38)
            java.lang.String r4 = r3.getString(r4)
            r4.getClass()
            goto Le8
        La4:
            r4 = 2131951877(0x7f130105, float:1.954018E38)
            java.lang.String r4 = r3.getString(r4)
            r4.getClass()
            goto Le8
        Laf:
            r4 = 2131951884(0x7f13010c, float:1.9540195E38)
            java.lang.String r4 = r3.getString(r4)
            r4.getClass()
            goto Le8
        Lba:
            r4 = 2131951883(0x7f13010b, float:1.9540193E38)
            java.lang.String r4 = r3.getString(r4)
            r4.getClass()
            goto Le8
        Lc5:
            r4 = 2131951880(0x7f130108, float:1.9540187E38)
            java.lang.String r4 = r3.getString(r4)
            r4.getClass()
            goto Le8
        Ld0:
            r4 = 2131951881(0x7f130109, float:1.954019E38)
            java.lang.String r4 = r3.getString(r4)
            r4.getClass()
            goto Le8
        Ldb:
            r4 = 2131951882(0x7f13010a, float:1.9540191E38)
            java.lang.String r4 = r3.getString(r4)
            r4.getClass()
            goto Le8
        Le6:
            java.lang.String r4 = ""
        Le8:
            r5 = 1
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r5)
            r4.show()
            r1 = r2
        Lf1:
            return r1
    }
}
