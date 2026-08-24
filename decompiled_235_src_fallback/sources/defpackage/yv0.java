package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yv0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yv0 extends defpackage.u9 implements defpackage.eo2 {
    public final /* synthetic */ int d0;

    public /* synthetic */ yv0(int r2, java.lang.Object r3, java.lang.Class r4, java.lang.String r5, java.lang.String r6, int r7, int r8) {
            r1 = this;
            r1.d0 = r8
            r0 = r5
            r5 = r3
            r3 = r7
            r7 = r6
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r23, java.lang.Object r24) {
            r22 = this;
            r0 = r22
            int r1 = r0.d0
            r2 = 2
            r3 = 0
            jg7 r4 = defpackage.jg7.a
            r5 = 3
            java.lang.Object r0 = r0.A
            switch(r1) {
                case 0: goto L279;
                case 1: goto L9e;
                case 2: goto L4a;
                case 3: goto L2c;
                default: goto Le;
            }
        Le:
            r1 = r23
            ol7 r1 = (defpackage.ol7) r1
            long r8 = r1.a
            r1 = r24
            r41 r1 = (defpackage.r41) r1
            r7 = r0
            e86 r7 = (defpackage.e86) r7
            eb r0 = r7.H0
            w61 r0 = r0.D()
            c86 r6 = new c86
            r11 = 1
            r10 = 0
            r6.<init>(r7, r8, r10, r11)
            defpackage.hv.L(r0, r10, r10, r6, r5)
            return r4
        L2c:
            r1 = r23
            ol7 r1 = (defpackage.ol7) r1
            long r8 = r1.a
            r1 = r24
            r41 r1 = (defpackage.r41) r1
            r7 = r0
            e86 r7 = (defpackage.e86) r7
            eb r0 = r7.H0
            w61 r0 = r0.D()
            c86 r6 = new c86
            r11 = 2
            r10 = 0
            r6.<init>(r7, r8, r10, r11)
            defpackage.hv.L(r0, r10, r10, r6, r5)
            return r4
        L4a:
            r1 = r23
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r4 = r24
            r41 r4 = (defpackage.r41) r4
            n65 r0 = (defpackage.n65) r0
            boolean r4 = r0.b()
            rs4 r6 = r0.f
            r7 = 0
            if (r4 == 0) goto L62
            goto L98
        L62:
            float r4 = r0.a()
            rs4 r8 = r0.g
            float r8 = r8.h()
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 <= 0) goto L7b
            qa4 r4 = r0.b
            java.lang.Object r4 = r4.getValue()
            on2 r4 = (defpackage.on2) r4
            r4.c()
        L7b:
            w61 r4 = r0.a
            qc r8 = new qc
            r8.<init>(r0, r7, r3, r2)
            defpackage.hv.L(r4, r3, r3, r8, r5)
            float r0 = r6.h()
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L8f
        L8d:
            r1 = r7
            goto L94
        L8f:
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L94
            goto L8d
        L94:
            r6.i(r7)
            r7 = r1
        L98:
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r7)
            return r0
        L9e:
            r1 = r23
            xc5 r1 = (defpackage.xc5) r1
            r6 = r24
            r41 r6 = (defpackage.r41) r6
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r0
            bt r6 = r0.V1
            ac r7 = r0.y1
            if (r7 == 0) goto Lb1
            r7.setOnDismissListener(r3)
        Lb1:
            ac r7 = r0.y1
            if (r7 == 0) goto Lb8
            r7.dismiss()
        Lb8:
            r0.y1 = r3
            ac r7 = r0.z1
            if (r7 == 0) goto Lc1
            r7.setOnDismissListener(r3)
        Lc1:
            ac r7 = r0.z1
            if (r7 == 0) goto Lc8
            r7.dismiss()
        Lc8:
            r0.z1 = r3
            ac r7 = r0.A1
            if (r7 == 0) goto Ld1
            r7.setOnDismissListener(r3)
        Ld1:
            ac r7 = r0.A1
            if (r7 == 0) goto Ld8
            r7.dismiss()
        Ld8:
            r0.A1 = r3
            ex1 r7 = defpackage.ex1.RA_PENDING_EXIT
            r6.T(r7)
            ex1 r8 = defpackage.ex1.RA_PENDING_SYNC
            r6.T(r8)
            uc5 r9 = defpackage.uc5.a
            boolean r9 = defpackage.nb3.k(r1, r9)
            if (r9 != 0) goto L277
            boolean r9 = r1 instanceof defpackage.tc5
            r10 = 0
            r11 = 1
            r12 = 2131952306(0x7f1302b2, float:1.9541051E38)
            if (r9 == 0) goto L17b
            tc5 r1 = (defpackage.tc5) r1
            long r8 = r1.a
            lc5 r3 = r1.b
            mc5 r1 = r1.c
            mc5 r5 = defpackage.mc5.RESUMABLE_SESSION
            if (r1 != r5) goto L103
            r1 = r11
            goto L104
        L103:
            r1 = r10
        L104:
            ac r5 = r0.y1
            if (r5 == 0) goto L10b
            r5.dismiss()
        L10b:
            r6.z(r7)
            zb r5 = new zb
            r5.<init>(r0)
            java.lang.Object r6 = r5.L
            wb r6 = (defpackage.wb) r6
            r7 = 2131952405(0x7f130315, float:1.9541252E38)
            java.lang.String r7 = r0.getString(r7)
            r6.d = r7
            int r7 = r3.a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r13 = r3.b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            int r3 = r3.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r7, r13, r3}
            r7 = 2131952404(0x7f130314, float:1.954125E38)
            java.lang.String r3 = r0.getString(r7, r3)
            r6.f = r3
            r6.m = r10
            dv1 r3 = new dv1
            r3.<init>(r0, r8, r10)
            r7 = 2131952409(0x7f130319, float:1.954126E38)
            r5.y(r7, r3)
            dv1 r3 = new dv1
            r3.<init>(r0, r8, r11)
            r7 = 2131952403(0x7f130313, float:1.9541248E38)
            r5.x(r7, r3)
            if (r1 == 0) goto L168
            dv1 r1 = new dv1
            r1.<init>(r0, r8, r2)
            android.view.ContextThemeWrapper r2 = r6.a
            java.lang.CharSequence r2 = r2.getText(r12)
            r6.k = r2
            r6.l = r1
        L168:
            ac r1 = r5.l()
            ev1 r2 = new ev1
            r2.<init>(r0, r1, r10)
            r1.setOnDismissListener(r2)
            r0.y1 = r1
            r1.show()
            goto L277
        L17b:
            boolean r7 = r1 instanceof defpackage.wc5
            if (r7 == 0) goto L1d7
            wc5 r1 = (defpackage.wc5) r1
            lc5 r1 = r1.b
            ac r2 = r0.A1
            if (r2 == 0) goto L18a
            r2.dismiss()
        L18a:
            ac r2 = r0.z1
            if (r2 == 0) goto L191
            r2.dismiss()
        L191:
            r6.z(r8)
            zb r2 = new zb
            r2.<init>(r0)
            r3 = 2131952415(0x7f13031f, float:1.9541272E38)
            r2.z(r3)
            int r3 = r1.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r5 = r1.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r1 = r1.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r5, r1}
            r3 = 2131952414(0x7f13031e, float:1.954127E38)
            java.lang.String r1 = r0.getString(r3, r1)
            java.lang.Object r3 = r2.L
            wb r3 = (defpackage.wb) r3
            r3.f = r1
            r3.m = r10
            ac r1 = r2.l()
            ev1 r2 = new ev1
            r2.<init>(r0, r1, r11)
            r1.setOnDismissListener(r2)
            r0.z1 = r1
            r1.show()
            goto L277
        L1d7:
            boolean r7 = r1 instanceof defpackage.vc5
            if (r7 == 0) goto L273
            vc5 r1 = (defpackage.vc5) r1
            long r13 = r1.a
            dd5 r7 = r1.b
            ed5 r1 = r1.c
            ac r9 = r0.z1
            if (r9 == 0) goto L1ea
            r9.dismiss()
        L1ea:
            r0.z1 = r3
            ac r9 = r0.A1
            if (r9 == 0) goto L1f3
            r9.dismiss()
        L1f3:
            r6.z(r8)
            zb r6 = new zb
            r6.<init>(r0)
            r8 = 2131952413(0x7f13031d, float:1.9541268E38)
            r6.z(r8)
            int r8 = r7.c
            lc5 r9 = r7.h
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            int r8 = r7.d
            java.lang.Integer r16 = java.lang.Integer.valueOf(r8)
            int r8 = r7.e
            java.lang.Integer r17 = java.lang.Integer.valueOf(r8)
            int r8 = r7.f
            java.lang.Integer r18 = java.lang.Integer.valueOf(r8)
            int r7 = r7.g
            java.lang.Integer r19 = java.lang.Integer.valueOf(r7)
            int r7 = r9.a
            java.lang.Integer r20 = java.lang.Integer.valueOf(r7)
            int r7 = r9.e
            java.lang.Integer r21 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r15, r16, r17, r18, r19, r20, r21}
            r8 = 2131952412(0x7f13031c, float:1.9541266E38)
            java.lang.String r7 = r0.getString(r8, r7)
            java.lang.Object r8 = r6.L
            wb r8 = (defpackage.wb) r8
            r8.f = r7
            r8.m = r10
            int[] r7 = me.magnum.melonds.ui.emulator.a.a
            int r8 = r1.ordinal()
            r7 = r7[r8]
            if (r7 == r11) goto L256
            if (r7 == r2) goto L259
            if (r7 != r5) goto L252
            r12 = 2131952407(0x7f130317, float:1.9541256E38)
            goto L259
        L252:
            defpackage.i.d()
            goto L278
        L256:
            r12 = 2131952366(0x7f1302ee, float:1.9541173E38)
        L259:
            hv1 r3 = new hv1
            r3.<init>(r0, r13, r1)
            r6.y(r12, r3)
            ac r1 = r6.l()
            ev1 r3 = new ev1
            r3.<init>(r0, r1, r2)
            r1.setOnDismissListener(r3)
            r0.A1 = r1
            r1.show()
            goto L277
        L273:
            defpackage.i.d()
            goto L278
        L277:
            r3 = r4
        L278:
            return r3
        L279:
            r1 = r23
            px0 r1 = (defpackage.px0) r1
            r2 = r24
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            zv0 r0 = (defpackage.zv0) r0
            r0.a(r1, r2)
            return r4
    }
}
