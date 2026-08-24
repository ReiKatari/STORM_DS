package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly5  reason: default package */
/* loaded from: classes.dex */
public final class ly5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ me.magnum.melonds.ui.romlist.RomListActivity Z;

    public /* synthetic */ ly5(me.magnum.melonds.ui.romlist.RomListActivity r1, defpackage.r41 r2, int r3) {
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
            mm1 r3 = (defpackage.mm1) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ly5 r2 = (defpackage.ly5) r2
            r2.s(r1)
            return r1
        L15:
            kt r3 = (defpackage.kt) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ly5 r2 = (defpackage.ly5) r2
            r2.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            me.magnum.melonds.ui.romlist.RomListActivity r2 = r2.Z
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            ly5 r0 = new ly5
            r1 = 1
            r0.<init>(r2, r3, r1)
            r0.Y = r4
            return r0
        L10:
            ly5 r0 = new ly5
            r1 = 0
            r0.<init>(r2, r3, r1)
            r0.Y = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r24) {
            r23 = this;
            r0 = r23
            int r1 = r0.X
            jg7 r2 = defpackage.jg7.a
            me.magnum.melonds.ui.romlist.RomListActivity r3 = r0.Z
            r4 = 1
            r5 = 0
            r6 = 0
            java.lang.Object r0 = r0.Y
            switch(r1) {
                case 0: goto L8b;
                default: goto L10;
            }
        L10:
            mm1 r0 = (defpackage.mm1) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r24)
            ac r1 = r3.F0
            if (r1 == 0) goto L8a
            boolean r7 = r0 instanceof defpackage.lm1
            if (r7 == 0) goto L68
            r4 = 2131427817(0x7f0b01e9, float:1.847726E38)
            android.view.View r4 = r1.findViewById(r4)
            r4.getClass()
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            r6 = 2131427991(0x7f0b0297, float:1.8477614E38)
            android.view.View r1 = r1.findViewById(r6)
            r1.getClass()
            android.widget.TextView r1 = (android.widget.TextView) r1
            lm1 r0 = (defpackage.lm1) r0
            long r6 = r0.b
            double r6 = (double) r6
            long r8 = r0.a
            double r8 = (double) r8
            double r10 = r6 / r8
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r10 = r10 * r12
            r12 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r6 = r6 / r12
            double r6 = r6 / r12
            double r8 = r8 / r12
            double r8 = r8 / r12
            r4.setIndeterminate(r5)
            int r0 = (int) r10
            r4.setProgress(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r6)
            java.lang.Double r4 = java.lang.Double.valueOf(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4}
            r4 = 2131951854(0x7f1300ee, float:1.9540134E38)
            java.lang.String r0 = r3.getString(r4, r0)
            r1.setText(r0)
            goto L8a
        L68:
            boolean r5 = r0 instanceof defpackage.jm1
            if (r5 == 0) goto L72
            r1.dismiss()
            r3.F0 = r6
            goto L8a
        L72:
            boolean r0 = r0 instanceof defpackage.km1
            if (r0 == 0) goto L86
            r1.dismiss()
            r3.F0 = r6
            r0 = 2131952784(0x7f130490, float:1.954202E38)
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r4)
            r0.show()
            goto L8a
        L86:
            defpackage.i.d()
            r2 = r6
        L8a:
            return r2
        L8b:
            r1 = r0
            kt r1 = (defpackage.kt) r1
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r24)
            jt r0 = r1.a
            int[] r7 = defpackage.ky5.a
            int r0 = r0.ordinal()
            r0 = r7[r0]
            r7 = 2
            if (r0 == r4) goto Le0
            if (r0 != r7) goto Lda
            int r0 = me.magnum.melonds.ui.romlist.RomListActivity.K0
            zb r0 = new zb
            r0.<init>(r3)
            r6 = 2131952289(0x7f1302a1, float:1.9541017E38)
            java.lang.String r6 = r3.getString(r6)
            java.lang.Object r7 = r0.L
            wb r7 = (defpackage.wb) r7
            r7.d = r6
            r6 = 2131952290(0x7f1302a2, float:1.9541019E38)
            java.lang.String r6 = r3.getString(r6)
            r7.f = r6
            dy5 r6 = new dy5
            r6.<init>(r3, r1, r5)
            r5 = 2131952779(0x7f13048b, float:1.954201E38)
            r0.y(r5, r6)
            dy5 r5 = new dy5
            r5.<init>(r3, r1, r4)
            r1 = 2131952429(0x7f13032d, float:1.95413E38)
            r0.x(r1, r5)
            r0.B()
            goto L383
        Lda:
            defpackage.i.d()
        Ldd:
            r2 = r6
            goto L383
        Le0:
            int r0 = me.magnum.melonds.ui.romlist.RomListActivity.K0
            java.lang.String r8 = "1.0.0"
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r9 = r3.getPackageName()     // Catch: java.lang.Throwable -> Lf6
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r9, r5)     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Throwable -> Lf6
            if (r0 != 0) goto Lfd
            r0 = r8
            goto Lfd
        Lf6:
            r0 = move-exception
            em5 r9 = new em5
            r9.<init>(r0)
            r0 = r9
        Lfd:
            boolean r9 = r0 instanceof defpackage.em5
            if (r9 == 0) goto L103
            goto L104
        L103:
            r8 = r0
        L104:
            java.lang.String r8 = (java.lang.String) r8
            bm7 r0 = r1.d
            wl7 r9 = r0.A
            int[] r10 = defpackage.gy5.b
            int r9 = r9.ordinal()
            r9 = r10[r9]
            r10 = 5
            r11 = 3
            java.lang.String r12 = ""
            if (r9 == r4) goto L142
            if (r9 == r7) goto L13a
            if (r9 == r11) goto L132
            r7 = 4
            if (r9 == r7) goto L130
            if (r9 != r10) goto L12c
            r0 = 2131952794(0x7f13049a, float:1.954204E38)
            java.lang.String r0 = r3.getString(r0)
            r0.getClass()
            goto L17b
        L12c:
            defpackage.i.d()
            goto Ldd
        L130:
            r7 = r12
            goto L149
        L132:
            r7 = 2131952795(0x7f13049b, float:1.9542043E38)
            java.lang.String r7 = r3.getString(r7)
            goto L149
        L13a:
            r7 = 2131952793(0x7f130499, float:1.9542039E38)
            java.lang.String r7 = r3.getString(r7)
            goto L149
        L142:
            r7 = 2131952792(0x7f130498, float:1.9542037E38)
            java.lang.String r7 = r3.getString(r7)
        L149:
            r7.getClass()
            int r9 = r7.length()
            if (r9 != 0) goto L153
            goto L155
        L153:
            java.lang.String r12 = " "
        L155:
            int r9 = r0.B
            int r13 = r0.L
            int r0 = r0.R
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r7)
            r14.append(r12)
            r14.append(r9)
            java.lang.String r7 = "."
            r14.append(r7)
            r14.append(r13)
            r14.append(r7)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
        L17b:
            e14 r7 = r3.B0
            if (r7 == 0) goto L384
            java.lang.String r9 = r1.e
            java.util.List r12 = r7.c
            java.util.Iterator r13 = r12.iterator()
        L187:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L197
            java.lang.Object r14 = r13.next()
            b1 r14 = (defpackage.b1) r14
            r14.getClass()
            goto L187
        L197:
            eb r13 = r7.a
            if (r9 == 0) goto L37d
            am1 r14 = new am1
            java.lang.Object r15 = r13.B
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.lang.Object r10 = r13.R
            q61 r10 = (defpackage.q61) r10
            java.lang.Object r4 = r13.L
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r14.<init>(r15, r10, r4)
            r4 = r5
        L1ad:
            int r10 = r9.length()
            r15 = r4
        L1b2:
            r6 = 13
            r11 = 10
            if (r15 >= r10) goto L1c7
            char r5 = r9.charAt(r15)
            if (r5 == r11) goto L1c5
            if (r5 == r6) goto L1c5
            int r15 = r15 + 1
            r6 = 0
            r11 = 3
            goto L1b2
        L1c5:
            r5 = -1
            goto L1c9
        L1c7:
            r15 = -1
            goto L1c5
        L1c9:
            if (r15 == r5) goto L1ed
            java.lang.String r4 = r9.substring(r4, r15)
            r14.i(r4)
            int r4 = r15 + 1
            int r5 = r9.length()
            if (r4 >= r5) goto L1e9
            char r5 = r9.charAt(r15)
            if (r5 != r6) goto L1e9
            char r5 = r9.charAt(r4)
            if (r5 != r11) goto L1e9
            int r15 = r15 + 2
            r4 = r15
        L1e9:
            r5 = 0
            r6 = 0
            r11 = 3
            goto L1ad
        L1ed:
            int r5 = r9.length()
            if (r5 <= 0) goto L202
            if (r4 == 0) goto L1fb
            int r5 = r9.length()
            if (r4 >= r5) goto L202
        L1fb:
            java.lang.String r4 = r9.substring(r4)
            r14.i(r4)
        L202:
            java.util.ArrayList r4 = r14.n
            r14.f(r4)
            yc1 r4 = new yc1
            java.util.List r5 = r14.k
            java.util.LinkedHashMap r6 = r14.m
            r4.<init>(r5, r6)
            q61 r5 = r14.j
            r5.getClass()
            v53 r5 = new v53
            r5.<init>(r4)
            java.util.LinkedHashSet r4 = r14.o
            java.util.Iterator r4 = r4.iterator()
        L220:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L230
            java.lang.Object r6 = r4.next()
            u r6 = (defpackage.u) r6
            r6.f(r5)
            goto L220
        L230:
            yl1 r4 = r14.l
            a50 r4 = r4.b
            zy2 r4 = (defpackage.zy2) r4
            java.lang.Object r5 = r13.X
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L378
            java.util.Iterator r5 = r12.iterator()
        L248:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L258
            java.lang.Object r6 = r5.next()
            b1 r6 = (defpackage.b1) r6
            r6.getClass()
            goto L248
        L258:
            ap3 r5 = r7.b
            java.lang.Object r6 = r5.B
            ng3 r6 = (defpackage.ng3) r6
            java.lang.Object r5 = r5.L
            r18 = r5
            d14 r18 = (defpackage.d14) r18
            ng3 r5 = new ng3
            r7 = 3
            r5.<init>(r7)
            xd5 r7 = new xd5
            r10 = 24
            r7.<init>(r10)
            eb r17 = new eb
            sn6 r20 = new sn6
            r20.<init>()
            java.util.HashMap r6 = r6.A
            java.util.Map r21 = java.util.Collections.unmodifiableMap(r6)
            r19 = r5
            r22 = r7
            r17.<init>(r18, r19, r20, r21, r22)
            r5 = r17
            r5.P(r4)
            java.util.Iterator r4 = r12.iterator()
        L28e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L29e
            java.lang.Object r6 = r4.next()
            b1 r6 = (defpackage.b1) r6
            r6.getClass()
            goto L28e
        L29e:
            java.lang.Object r4 = r5.R
            sn6 r4 = (defpackage.sn6) r4
            qn6 r5 = new qn6
            java.lang.StringBuilder r6 = r4.A
            r5.<init>(r6)
            java.util.ArrayDeque r4 = r4.B
            java.util.Iterator r4 = r4.iterator()
        L2af:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L2c7
            java.lang.Object r6 = r4.next()
            pn6 r6 = (defpackage.pn6) r6
            java.lang.Object r7 = r6.a
            int r10 = r6.b
            int r11 = r6.c
            int r6 = r6.d
            r5.setSpan(r7, r10, r11, r6)
            goto L2af
        L2c7:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L2d8
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 != 0) goto L2d8
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r9)
        L2d8:
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r3)
            r6 = 2131623997(0x7f0e003d, float:1.8875161E38)
            r7 = 0
            r9 = 0
            android.view.View r4 = r4.inflate(r6, r9, r7)
            r6 = 2131428034(0x7f0b02c2, float:1.8477701E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131428035(0x7f0b02c3, float:1.8477703E38)
            android.view.View r7 = r4.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r9 = 2131428033(0x7f0b02c1, float:1.84777E38)
            android.view.View r9 = r4.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131427461(0x7f0b0085, float:1.8476539E38)
            android.view.View r10 = r4.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            r11 = 2131427460(0x7f0b0084, float:1.8476537E38)
            android.view.View r11 = r4.findViewById(r11)
            android.widget.Button r11 = (android.widget.Button) r11
            r12 = 2131427456(0x7f0b0080, float:1.8476529E38)
            android.view.View r12 = r4.findViewById(r12)
            android.widget.Button r12 = (android.widget.Button) r12
            java.lang.String r13 = "v"
            if (r6 == 0) goto L326
            java.lang.String r8 = r13.concat(r8)
            r6.setText(r8)
        L326:
            if (r7 == 0) goto L32f
            java.lang.String r0 = r13.concat(r0)
            r7.setText(r0)
        L32f:
            if (r9 == 0) goto L334
            r9.setText(r5)
        L334:
            zb r0 = new zb
            r0.<init>(r3)
            r0.A(r4)
            java.lang.Object r4 = r0.L
            wb r4 = (defpackage.wb) r4
            r5 = 1
            r4.m = r5
            ac r0 = r0.l()
            android.view.Window r4 = r0.getWindow()
            if (r4 == 0) goto L353
            r5 = 17170445(0x106000d, float:2.461195E-38)
            r4.setBackgroundDrawableResource(r5)
        L353:
            if (r10 == 0) goto L35e
            fy5 r4 = new fy5
            r7 = 0
            r4.<init>(r0, r3, r1, r7)
            r10.setOnClickListener(r4)
        L35e:
            if (r11 == 0) goto L369
            hr0 r4 = new hr0
            r5 = 5
            r4.<init>(r0, r5)
            r11.setOnClickListener(r4)
        L369:
            if (r12 == 0) goto L374
            fy5 r4 = new fy5
            r5 = 1
            r4.<init>(r0, r3, r1, r5)
            r12.setOnClickListener(r4)
        L374:
            r0.show()
            goto L383
        L378:
            java.lang.ClassCastException r0 = defpackage.i61.j(r5)
            throw r0
        L37d:
            java.lang.String r0 = "input must not be null"
            defpackage.u34.x(r0)
            r2 = 0
        L383:
            return r2
        L384:
            java.lang.String r0 = "markwon"
            defpackage.nb3.a0(r0)
            r16 = 0
            throw r16
    }
}
