package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y6  reason: default package */
/* loaded from: classes.dex */
public final class y6 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ y6(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r27, defpackage.r41 r28) {
            r26 = this;
            r0 = r26
            r1 = r28
            int r2 = r0.A
            r3 = 2
            r4 = 5
            r5 = 6
            r6 = -1
            r7 = 4
            r8 = 3
            r9 = 0
            r10 = 1
            r11 = 0
            switch(r2) {
                case 0: goto L443;
                case 1: goto L427;
                case 2: goto L409;
                case 3: goto L3d9;
                case 4: goto L358;
                case 5: goto L311;
                case 6: goto L1a3;
                case 7: goto L183;
                case 8: goto L13a;
                case 9: goto Lc0;
                case 10: goto Lb0;
                case 11: goto L87;
                case 12: goto L73;
                case 13: goto L55;
                case 14: goto L42;
                default: goto L12;
            }
        L12:
            r1 = r27
            oh0 r1 = (defpackage.oh0) r1
            java.lang.Object r0 = r0.B
            pq7 r0 = (defpackage.pq7) r0
            java.lang.Object r2 = r0.e
            monitor-enter(r2)
            boolean r3 = r1 instanceof defpackage.vh0     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L39
            kq7 r3 = new kq7     // Catch: java.lang.Throwable -> L37
            vh0 r1 = (defpackage.vh0) r1     // Catch: java.lang.Throwable -> L37
            bf0 r1 = r1.a     // Catch: java.lang.Throwable -> L37
            rd r1 = (defpackage.rd) r1     // Catch: java.lang.Throwable -> L37
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L37
            r0.g = r3     // Catch: java.lang.Throwable -> L37
            vh0 r1 = new vh0     // Catch: java.lang.Throwable -> L37
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L37
            r0.b(r1)     // Catch: java.lang.Throwable -> L37
            goto L3c
        L37:
            r0 = move-exception
            goto L40
        L39:
            r0.b(r1)     // Catch: java.lang.Throwable -> L37
        L3c:
            monitor-exit(r2)
            jg7 r0 = defpackage.jg7.a
            return r0
        L40:
            monitor-exit(r2)
            throw r0
        L42:
            r1 = r27
            zt5 r1 = (defpackage.zt5) r1
            java.lang.Object r0 = r0.B
            tp6 r0 = (defpackage.tp6) r0
            bu5 r2 = new bu5
            r2.<init>(r1)
            r0.m(r11, r2)
            jg7 r0 = defpackage.jg7.a
            return r0
        L55:
            r1 = r27
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.B
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r0 = (me.magnum.melonds.ui.romdetails.RomDetailsActivity) r0
            int r2 = me.magnum.melonds.ui.romdetails.RomDetailsActivity.J0
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r2.setData(r1)
            r0.startActivity(r2)
            jg7 r0 = defpackage.jg7.a
            return r0
        L73:
            r1 = r27
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Object r0 = r0.B
            o74 r0 = (defpackage.o74) r0
            rs4 r0 = r0.L
            r0.i(r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L87:
            r1 = r27
            ba6 r1 = (defpackage.ba6) r1
            java.lang.Object r0 = r0.B
            me.magnum.melonds.ui.layouts.LayoutSelectorActivity r0 = (me.magnum.melonds.ui.layouts.LayoutSelectorActivity) r0
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "selected_layout_id"
            java.util.UUID r4 = r1.a
            if (r4 == 0) goto L9e
            java.lang.String r11 = r4.toString()
        L9e:
            r2.putExtra(r3, r11)
            r0.setResult(r6, r2)
            aa6 r1 = r1.b
            aa6 r2 = defpackage.aa6.SELECTED_BY_USER
            if (r1 != r2) goto Lad
            r0.finish()
        Lad:
            jg7 r0 = defpackage.jg7.a
            return r0
        Lb0:
            r1 = r27
            b63 r1 = (defpackage.b63) r1
            java.lang.Object r0 = r0.B
            ah2 r0 = (defpackage.ah2) r0
            eh2 r0 = (defpackage.eh2) r0
            r0.g(r5, r10)
            jg7 r0 = defpackage.jg7.a
            return r0
        Lc0:
            r1 = r27
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.B
            me.magnum.melonds.ui.inputsetup.InputSetupActivity r0 = (me.magnum.melonds.ui.inputsetup.InputSetupActivity) r0
            java.util.LinkedHashMap r0 = r0.C0
            if (r1 == 0) goto L137
            r0.clear()
            int[] r1 = android.view.InputDevice.getDeviceIds()
            r1.getClass()
            int r2 = r1.length
        Ldb:
            if (r9 >= r2) goto L137
            r3 = r1[r9]
            android.view.InputDevice r4 = android.view.InputDevice.getDevice(r3)
            if (r4 == 0) goto L134
            java.util.List r4 = r4.getMotionRanges()
            if (r4 == 0) goto L134
            java.util.Iterator r4 = r4.iterator()
        Lef:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L134
            java.lang.Object r5 = r4.next()
            android.view.InputDevice$MotionRange r5 = (android.view.InputDevice.MotionRange) r5
            r5.getClass()
            r6 = 16
            boolean r6 = r5.isFromSource(r6)
            if (r6 != 0) goto L117
            r6 = 16777232(0x1000010, float:2.3509932E-38)
            boolean r6 = r5.isFromSource(r6)
            if (r6 != 0) goto L117
            r6 = 1025(0x401, float:1.436E-42)
            boolean r6 = r5.isFromSource(r6)
            if (r6 == 0) goto Lef
        L117:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r3)
            int r5 = r5.getAxis()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r5)
            vr4 r5 = new vr4
            r5.<init>(r6, r7)
            java.lang.Float r6 = new java.lang.Float
            r7 = 0
            r6.<init>(r7)
            r0.put(r5, r6)
            goto Lef
        L134:
            int r9 = r9 + 1
            goto Ldb
        L137:
            jg7 r0 = defpackage.jg7.a
            return r0
        L13a:
            boolean r2 = r1 instanceof defpackage.te2
            if (r2 == 0) goto L14d
            r2 = r1
            te2 r2 = (defpackage.te2) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14d
            int r3 = r3 - r4
            r2.Y = r3
            goto L152
        L14d:
            te2 r2 = new te2
            r2.<init>(r0, r1)
        L152:
            java.lang.Object r1 = r2.R
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.Y
            if (r4 == 0) goto L166
            if (r4 != r10) goto L160
            defpackage.oi2.Y(r1)
            goto L180
        L160:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L182
        L166:
            defpackage.oi2.Y(r1)
            java.lang.Object r0 = r0.B
            r35 r0 = (defpackage.r35) r0
            if (r27 != 0) goto L172
            gr1 r1 = defpackage.fh4.a
            goto L174
        L172:
            r1 = r27
        L174:
            r2.Y = r10
            v80 r0 = r0.Y
            java.lang.Object r0 = r0.a(r2, r1)
            if (r0 != r3) goto L180
            r11 = r3
            goto L182
        L180:
            jg7 r11 = defpackage.jg7.a
        L182:
            return r11
        L183:
            r1 = r27
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.B
            bt r0 = (defpackage.bt) r0
            java.lang.Object r0 = r0.R
            op r0 = (defpackage.op) r0
            if (r1 == 0) goto L19b
            if (r0 == 0) goto L1a0
            r0.a()
            goto L1a0
        L19b:
            if (r0 == 0) goto L1a0
            r0.b()
        L1a0:
            jg7 r0 = defpackage.jg7.a
            return r0
        L1a3:
            r1 = r27
            hj3 r1 = (defpackage.hj3) r1
            java.lang.Object r0 = r0.B
            s9 r0 = (defpackage.s9) r0
            java.lang.Object r2 = r0.b
            ax1 r2 = (defpackage.ax1) r2
            java.lang.Object r6 = r0.a
            jq r6 = (defpackage.jq) r6
            boolean r9 = r1 instanceof defpackage.fj3
            r12 = 2131952616(0x7f1303e8, float:1.954168E38)
            r13 = 2131951750(0x7f130086, float:1.9539923E38)
            if (r9 == 0) goto L235
            fj3 r1 = (defpackage.fj3) r1
            yc2 r1 = r1.a
            boolean r3 = r1 instanceof defpackage.xc2
            if (r3 == 0) goto L1ce
            xc2 r1 = (defpackage.xc2) r1
            me.magnum.melonds.domain.model.ConsoleType r0 = r1.a
            r2.k(r0)
            goto L306
        L1ce:
            boolean r2 = r1 instanceof defpackage.uc2
            if (r2 == 0) goto L216
            zb r1 = new zb
            r1.<init>(r6)
            java.lang.Object r2 = r1.L
            wb r2 = (defpackage.wb) r2
            r3 = 2131951995(0x7f13017b, float:1.954042E38)
            r1.z(r3)
            r3 = 2131951994(0x7f13017a, float:1.9540418E38)
            r1.w(r3)
            xw1 r3 = new xw1
            r3.<init>(r0, r4)
            r1.y(r12, r3)
            xw1 r3 = new xw1
            r3.<init>(r0, r5)
            android.view.ContextThemeWrapper r4 = r2.a
            r5 = 2131951852(0x7f1300ec, float:1.954013E38)
            java.lang.CharSequence r4 = r4.getText(r5)
            r2.k = r4
            r2.l = r3
            xw1 r3 = new xw1
            r4 = 7
            r3.<init>(r0, r4)
            r1.x(r13, r3)
            yw1 r3 = new yw1
            r3.<init>(r0, r8)
            r2.n = r3
            r1.B()
            goto L306
        L216:
            boolean r2 = r1 instanceof defpackage.wc2
            if (r2 == 0) goto L223
            wc2 r1 = (defpackage.wc2) r1
            me.magnum.melonds.domain.model.VideoRenderer r1 = r1.a
            defpackage.s9.f(r0, r1)
            goto L306
        L223:
            boolean r2 = r1 instanceof defpackage.vc2
            if (r2 == 0) goto L230
            vc2 r1 = (defpackage.vc2) r1
            me.magnum.melonds.domain.model.VideoRenderer r1 = r1.a
            defpackage.s9.e(r0, r1)
            goto L306
        L230:
            defpackage.i.d()
            goto L310
        L235:
            boolean r4 = r1 instanceof defpackage.gj3
            if (r4 == 0) goto L30d
            gj3 r1 = (defpackage.gj3) r1
            wx5 r1 = r1.a
            boolean r4 = r1 instanceof defpackage.vx5
            if (r4 == 0) goto L24a
            vx5 r1 = (defpackage.vx5) r1
            pq5 r0 = r1.a
            r2.e(r0)
            goto L306
        L24a:
            boolean r2 = r1 instanceof defpackage.sx5
            if (r2 == 0) goto L2bb
            sx5 r1 = (defpackage.sx5) r1
            oi2 r1 = r1.a
            rx5 r2 = defpackage.rx5.e
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L262
            r1 = 2131951976(0x7f130168, float:1.9540382E38)
            java.lang.String r1 = r6.getString(r1)
            goto L281
        L262:
            rx5 r2 = defpackage.rx5.f
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L272
            r1 = 2131951978(0x7f13016a, float:1.9540386E38)
            java.lang.String r1 = r6.getString(r1)
            goto L281
        L272:
            rx5 r2 = defpackage.rx5.g
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2b7
            r1 = 2131951977(0x7f130169, float:1.9540384E38)
            java.lang.String r1 = r6.getString(r1)
        L281:
            r1.getClass()
            zb r2 = new zb
            r2.<init>(r6)
            java.lang.Object r3 = r2.L
            wb r3 = (defpackage.wb) r3
            r4 = 2131951975(0x7f130167, float:1.954038E38)
            r2.z(r4)
            r3.f = r1
            xw1 r1 = new xw1
            r4 = 8
            r1.<init>(r0, r4)
            r4 = 2131951869(0x7f1300fd, float:1.9540165E38)
            r2.y(r4, r1)
            xw1 r1 = new xw1
            r4 = 9
            r1.<init>(r0, r4)
            r2.x(r13, r1)
            yw1 r1 = new yw1
            r1.<init>(r0, r7)
            r3.n = r1
            r2.B()
            goto L306
        L2b7:
            defpackage.i.d()
            goto L310
        L2bb:
            boolean r2 = r1 instanceof defpackage.qx5
            if (r2 == 0) goto L2ef
            zb r1 = new zb
            r1.<init>(r6)
            r2 = 2131952552(0x7f1303a8, float:1.954155E38)
            r1.z(r2)
            r2 = 2131952551(0x7f1303a7, float:1.9541548E38)
            r1.w(r2)
            xw1 r2 = new xw1
            r2.<init>(r0, r10)
            r1.y(r12, r2)
            xw1 r2 = new xw1
            r2.<init>(r0, r3)
            r1.x(r13, r2)
            yw1 r2 = new yw1
            r2.<init>(r0, r10)
            java.lang.Object r0 = r1.L
            wb r0 = (defpackage.wb) r0
            r0.n = r2
            r1.B()
            goto L306
        L2ef:
            boolean r2 = r1 instanceof defpackage.ux5
            if (r2 == 0) goto L2fb
            ux5 r1 = (defpackage.ux5) r1
            me.magnum.melonds.domain.model.VideoRenderer r1 = r1.a
            defpackage.s9.f(r0, r1)
            goto L306
        L2fb:
            boolean r2 = r1 instanceof defpackage.tx5
            if (r2 == 0) goto L309
            tx5 r1 = (defpackage.tx5) r1
            me.magnum.melonds.domain.model.VideoRenderer r1 = r1.a
            defpackage.s9.e(r0, r1)
        L306:
            jg7 r11 = defpackage.jg7.a
            goto L310
        L309:
            defpackage.i.d()
            goto L310
        L30d:
            defpackage.i.d()
        L310:
            return r11
        L311:
            r1 = r27
            h91 r1 = (defpackage.h91) r1
            java.lang.Object r0 = r0.B
            g91 r0 = (defpackage.g91) r0
            nc1 r2 = r0.e
            java.util.Map r3 = r0.a
            boolean r4 = r2 instanceof defpackage.e91
            if (r4 == 0) goto L32d
            me.magnum.melonds.common.camera.DSiCameraSource r5 = r0.d
            if (r5 == 0) goto L32d
            r6 = r2
            e91 r6 = (defpackage.e91) r6
            int r6 = r6.t
            r5.stopCamera(r6)
        L32d:
            java.lang.Object r1 = r3.get(r1)
            me.magnum.melonds.common.camera.DSiCameraSource r1 = (me.magnum.melonds.common.camera.DSiCameraSource) r1
            if (r1 == 0) goto L33f
            boolean r5 = r1.isAvailable()
            if (r5 == 0) goto L33c
            goto L33d
        L33c:
            r1 = r11
        L33d:
            if (r1 != 0) goto L347
        L33f:
            h91 r1 = defpackage.h91.BLACK_SCREEN
            java.lang.Object r1 = r3.get(r1)
            me.magnum.melonds.common.camera.DSiCameraSource r1 = (me.magnum.melonds.common.camera.DSiCameraSource) r1
        L347:
            if (r1 == 0) goto L353
            if (r4 == 0) goto L352
            e91 r2 = (defpackage.e91) r2
            int r2 = r2.t
            r1.startCamera(r2)
        L352:
            r11 = r1
        L353:
            r0.d = r11
            jg7 r0 = defpackage.jg7.a
            return r0
        L358:
            r1 = r27
            zn0 r1 = (defpackage.zn0) r1
            java.lang.String r2 = "binding"
            java.lang.Object r0 = r0.B
            uo0 r0 = (defpackage.uo0) r0
            yn0 r5 = r1.a
            int[] r6 = defpackage.ro0.a
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 == r10) goto L3b5
            if (r5 == r3) goto L37f
            if (r5 == r8) goto L37b
            if (r5 == r7) goto L37b
            if (r5 != r4) goto L377
            goto L37b
        L377:
            defpackage.i.d()
            goto L3d0
        L37b:
            r0.dismiss()
            goto L3ce
        L37f:
            bt r3 = r0.Z
            if (r3 == 0) goto L3b1
            java.lang.Object r3 = r3.L
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            r3.setIndeterminate(r9)
            bt r3 = r0.Z
            if (r3 == 0) goto L3ad
            java.lang.Object r3 = r3.L
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            float r4 = r1.b
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.setProgress(r4)
            bt r0 = r0.Z
            if (r0 == 0) goto L3a9
            java.lang.Object r0 = r0.R
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r1.c
            r0.setText(r1)
            goto L3ce
        L3a9:
            defpackage.nb3.a0(r2)
            throw r11
        L3ad:
            defpackage.nb3.a0(r2)
            throw r11
        L3b1:
            defpackage.nb3.a0(r2)
            throw r11
        L3b5:
            bt r1 = r0.Z
            if (r1 == 0) goto L3d5
            java.lang.Object r1 = r1.L
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r1.setIndeterminate(r10)
            bt r0 = r0.Z
            if (r0 == 0) goto L3d1
            java.lang.Object r0 = r0.R
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131952685(0x7f13042d, float:1.954182E38)
            r0.setText(r1)
        L3ce:
            jg7 r11 = defpackage.jg7.a
        L3d0:
            return r11
        L3d1:
            defpackage.nb3.a0(r2)
            throw r11
        L3d5:
            defpackage.nb3.a0(r2)
            throw r11
        L3d9:
            r2 = r27
            ii0 r2 = (defpackage.ii0) r2
            java.lang.Object r0 = r0.B
            sc0 r0 = (defpackage.sc0) r0
            tp6 r3 = r0.Y
            jg7 r4 = defpackage.jg7.a
            boolean r5 = r2 instanceof defpackage.ei0
            if (r5 == 0) goto L3ef
            r3.a(r2, r1)
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            goto L408
        L3ef:
            boolean r5 = r2 instanceof defpackage.gi0
            if (r5 == 0) goto L3f9
            r3.a(r2, r1)
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            goto L408
        L3f9:
            boolean r2 = r2 instanceof defpackage.fi0
            if (r2 == 0) goto L408
            of6 r0 = r0.d0
            java.lang.Object r0 = r0.a(r4, r1)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L408
            r4 = r0
        L408:
            return r4
        L409:
            r1 = r27
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.B
            v10 r0 = (defpackage.v10) r0
            tp6 r0 = r0.d
            kw3 r2 = defpackage.hf.I()
            r2.add(r11)
            r2.addAll(r1)
            kw3 r1 = defpackage.hf.A(r2)
            r0.l(r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L427:
            r1 = r27
            jg7 r1 = (defpackage.jg7) r1
            java.lang.Object r0 = r0.B
            u63 r0 = (defpackage.u63) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L440
            android.view.inputmethod.InputMethodManager r1 = r0.n()
            java.lang.Object r0 = r0.B
            android.view.View r0 = (android.view.View) r0
            defpackage.o2.u(r1, r0)
        L440:
            jg7 r0 = defpackage.jg7.a
            return r0
        L443:
            r1 = r27
            ca5 r1 = (defpackage.ca5) r1
            java.lang.Object r0 = r0.B
            w6 r0 = (defpackage.w6) r0
            java.util.LinkedHashSet r2 = r0.b
            mm6 r3 = r0.a
            r1.getClass()
            ba5 r4 = defpackage.ba5.a
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L483
            r2.clear()
            java.util.ListIterator r0 = r3.listIterator()
        L461:
            r1 = r0
            xx2 r1 = (defpackage.xx2) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La25
            java.lang.Object r1 = r1.next()
            v3 r1 = (defpackage.v3) r1
            boolean r2 = r1 instanceof defpackage.u3
            if (r2 == 0) goto L47b
            r2 = r1
            u3 r2 = (defpackage.u3) r2
            boolean r2 = r2.b
            if (r2 != 0) goto L461
        L47b:
            bt r1 = r1.a()
            r1.E()
            goto L461
        L483:
            boolean r4 = r1 instanceof defpackage.m95
            if (r4 == 0) goto L4e9
            m95 r1 = (defpackage.m95) r1
            o75 r2 = r1.a
            java.util.ListIterator r4 = r3.listIterator()
            r5 = r9
        L490:
            r7 = r4
            xx2 r7 = (defpackage.xx2) r7
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L4b7
            java.lang.Object r7 = r7.next()
            v3 r7 = (defpackage.v3) r7
            boolean r8 = r7 instanceof defpackage.k3
            if (r8 == 0) goto L4a6
            k3 r7 = (defpackage.k3) r7
            goto L4a7
        L4a6:
            r7 = r11
        L4a7:
            if (r7 == 0) goto L4b4
            o75 r7 = r7.a
            long r7 = r7.a
            long r12 = r2.a
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 != 0) goto L4b4
            goto L4b8
        L4b4:
            int r5 = r5 + 1
            goto L490
        L4b7:
            r5 = r6
        L4b8:
            if (r5 == r6) goto L4d1
            java.lang.Object r0 = r3.get(r5)
            v3 r0 = (defpackage.v3) r0
            bt r0 = r0.a()
            java.lang.Object r0 = r0.L
            ta4 r0 = (defpackage.ta4) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            vs4 r0 = r0.c
            r0.setValue(r1)
            goto La25
        L4d1:
            bt r4 = new bt
            q6 r5 = new q6
            r5.<init>(r9, r0, r1)
            r4.<init>(r5)
            k3 r1 = new k3
            long r5 = r0.f()
            r1.<init>(r2, r4, r5)
            r3.add(r9, r1)
            goto La25
        L4e9:
            boolean r4 = r1 instanceof defpackage.r95
            if (r4 == 0) goto L547
            r95 r1 = (defpackage.r95) r1
            o75 r1 = r1.a
            long r4 = r1.a
            java.util.ListIterator r3 = r3.listIterator()
        L4f7:
            r6 = r3
            xx2 r6 = (defpackage.xx2) r6
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L51a
            java.lang.Object r6 = r6.next()
            r7 = r6
            v3 r7 = (defpackage.v3) r7
            boolean r8 = r7 instanceof defpackage.k3
            if (r8 == 0) goto L50e
            k3 r7 = (defpackage.k3) r7
            goto L50f
        L50e:
            r7 = r11
        L50f:
            if (r7 == 0) goto L4f7
            o75 r7 = r7.a
            long r7 = r7.a
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 != 0) goto L4f7
            r11 = r6
        L51a:
            v3 r11 = (defpackage.v3) r11
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            boolean r2 = r2.remove(r3)
            if (r2 == 0) goto L533
            if (r11 == 0) goto La25
            bt r0 = r11.a()
            if (r0 == 0) goto La25
            r0.E()
            goto La25
        L533:
            if (r11 == 0) goto L53e
            bt r2 = r11.a()
            if (r2 == 0) goto L53e
            r2.E()
        L53e:
            if (r11 == 0) goto La25
            n3 r2 = defpackage.n3.FAILURE
            r0.a(r1, r2)
            goto La25
        L547:
            boolean r4 = r1 instanceof defpackage.q95
            if (r4 == 0) goto L593
            q95 r1 = (defpackage.q95) r1
            o75 r1 = r1.a
            java.util.ListIterator r3 = r3.listIterator()
        L553:
            r4 = r3
            xx2 r4 = (defpackage.xx2) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L578
            java.lang.Object r4 = r4.next()
            r5 = r4
            v3 r5 = (defpackage.v3) r5
            boolean r6 = r5 instanceof defpackage.k3
            if (r6 == 0) goto L56a
            k3 r5 = (defpackage.k3) r5
            goto L56b
        L56a:
            r5 = r11
        L56b:
            if (r5 == 0) goto L553
            o75 r5 = r5.a
            long r5 = r5.a
            long r7 = r1.a
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L553
            r11 = r4
        L578:
            v3 r11 = (defpackage.v3) r11
            if (r11 == 0) goto La25
            long r3 = r1.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.add(r3)
            bt r2 = r11.a()
            r2.E()
            n3 r2 = defpackage.n3.SUCCESS
            r0.a(r1, r2)
            goto La25
        L593:
            boolean r2 = r1 instanceof defpackage.p95
            if (r2 == 0) goto L5df
            p95 r1 = (defpackage.p95) r1
            java.util.ListIterator r2 = r3.listIterator()
            r4 = r9
        L59e:
            r5 = r2
            xx2 r5 = (defpackage.xx2) r5
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L5b6
            java.lang.Object r5 = r5.next()
            v3 r5 = (defpackage.v3) r5
            boolean r5 = r5 instanceof defpackage.u3
            if (r5 == 0) goto L5b3
            r6 = r4
            goto L5b6
        L5b3:
            int r4 = r4 + 1
            goto L59e
        L5b6:
            s3 r12 = new s3
            o75 r1 = r1.a
            long r1 = r1.a
            r12.<init>(r1)
            if (r6 >= 0) goto L5da
            bt r14 = new bt
            v6 r1 = new v6
            r1.<init>(r0, r10)
            r14.<init>(r1)
            u3 r11 = new u3
            r13 = 1
            long r15 = r0.f()
            r11.<init>(r12, r13, r14, r15)
            r3.add(r9, r11)
            goto La25
        L5da:
            r0.d(r6, r12, r10)
            goto La25
        L5df:
            boolean r2 = r1 instanceof defpackage.o95
            if (r2 == 0) goto L643
            o95 r1 = (defpackage.o95) r1
            java.util.ListIterator r2 = r3.listIterator()
            r4 = r9
        L5ea:
            r5 = r2
            xx2 r5 = (defpackage.xx2) r5
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L613
            java.lang.Object r5 = r5.next()
            v3 r5 = (defpackage.v3) r5
            boolean r7 = r5 instanceof defpackage.l3
            if (r7 == 0) goto L600
            l3 r5 = (defpackage.l3) r5
            goto L601
        L600:
            r5 = r11
        L601:
            if (r5 == 0) goto L610
            o75 r5 = r5.a
            long r7 = r5.a
            o75 r5 = r1.a
            long r12 = r5.a
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 != 0) goto L610
            goto L614
        L610:
            int r4 = r4 + 1
            goto L5ea
        L613:
            r4 = r6
        L614:
            if (r4 == r6) goto L61b
            r0.e(r4, r1)
            goto La25
        L61b:
            java.util.ListIterator r2 = r3.listIterator()
        L61f:
            r3 = r2
            xx2 r3 = (defpackage.xx2) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L636
            java.lang.Object r3 = r3.next()
            v3 r3 = (defpackage.v3) r3
            boolean r3 = r3 instanceof defpackage.l3
            if (r3 == 0) goto L633
            goto L637
        L633:
            int r9 = r9 + 1
            goto L61f
        L636:
            r9 = r6
        L637:
            if (r9 == r6) goto L63e
            r0.e(r9, r1)
            goto La25
        L63e:
            r0.c(r1)
            goto La25
        L643:
            boolean r2 = r1 instanceof defpackage.n95
            if (r2 == 0) goto L681
            n95 r1 = (defpackage.n95) r1
            java.util.ListIterator r0 = r3.listIterator()
        L64d:
            r2 = r0
            xx2 r2 = (defpackage.xx2) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L672
            java.lang.Object r2 = r2.next()
            r3 = r2
            v3 r3 = (defpackage.v3) r3
            boolean r4 = r3 instanceof defpackage.l3
            if (r4 == 0) goto L664
            l3 r3 = (defpackage.l3) r3
            goto L665
        L664:
            r3 = r11
        L665:
            if (r3 == 0) goto L64d
            o75 r3 = r3.a
            long r3 = r3.a
            long r5 = r1.a
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L64d
            r11 = r2
        L672:
            v3 r11 = (defpackage.v3) r11
            if (r11 == 0) goto La25
            bt r0 = r11.a()
            if (r0 == 0) goto La25
            r0.E()
            goto La25
        L681:
            boolean r2 = r1 instanceof defpackage.u95
            if (r2 == 0) goto L6b1
            u95 r1 = (defpackage.u95) r1
            r6 r2 = new r6
            r2.<init>(r1, r10)
            defpackage.gt0.W0(r3, r2)
            bt r2 = new bt
            q6 r4 = new q6
            r4.<init>(r7, r0, r1)
            r2.<init>(r4)
            o3 r11 = new o3
            ls3 r12 = r1.a
            ta5 r13 = r1.b
            java.net.URL r14 = r1.c
            java.lang.String r15 = ""
            long r17 = r0.f()
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r3.add(r9, r11)
            goto La25
        L6b1:
            boolean r2 = r1 instanceof defpackage.v95
            if (r2 == 0) goto L70e
            v95 r1 = (defpackage.v95) r1
            java.util.ListIterator r0 = r3.listIterator()
        L6bb:
            r2 = r0
            xx2 r2 = (defpackage.xx2) r2
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L6e4
            java.lang.Object r2 = r2.next()
            v3 r2 = (defpackage.v3) r2
            boolean r4 = r2 instanceof defpackage.o3
            if (r4 == 0) goto L6d1
            o3 r2 = (defpackage.o3) r2
            goto L6d2
        L6d1:
            r2 = r11
        L6d2:
            if (r2 == 0) goto L6d7
            ls3 r2 = r2.a
            goto L6d8
        L6d7:
            r2 = r11
        L6d8:
            ls3 r4 = r1.a
            boolean r2 = defpackage.nb3.k(r2, r4)
            if (r2 == 0) goto L6e1
            goto L6e5
        L6e1:
            int r9 = r9 + 1
            goto L6bb
        L6e4:
            r9 = r6
        L6e5:
            if (r9 == r6) goto La25
            java.lang.Object r0 = r3.get(r9)
            r0.getClass()
            o3 r0 = (defpackage.o3) r0
            java.lang.String r14 = r1.b
            ls3 r11 = r0.a
            ta5 r12 = r0.b
            java.net.URL r13 = r0.c
            bt r15 = r0.e
            long r0 = r0.f
            r11.getClass()
            r12.getClass()
            o3 r10 = new o3
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r3.set(r9, r10)
            goto La25
        L70e:
            boolean r2 = r1 instanceof defpackage.y95
            if (r2 == 0) goto L780
            y95 r1 = (defpackage.y95) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ListIterator r4 = r3.listIterator()
        L71d:
            r5 = r4
            xx2 r5 = (defpackage.xx2) r5
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L732
            java.lang.Object r5 = r5.next()
            boolean r6 = r5 instanceof defpackage.o3
            if (r6 == 0) goto L71d
            r2.add(r5)
            goto L71d
        L732:
            int r4 = r2.size()
            r5 = r9
        L737:
            if (r5 >= r4) goto L74d
            java.lang.Object r6 = r2.get(r5)
            int r5 = r5 + 1
            r7 = r6
            o3 r7 = (defpackage.o3) r7
            ls3 r7 = r7.a
            ls3 r12 = r1.a
            boolean r7 = defpackage.nb3.k(r7, r12)
            if (r7 == 0) goto L737
            r11 = r6
        L74d:
            o3 r11 = (defpackage.o3) r11
            if (r11 == 0) goto L756
            bt r2 = r11.e
            r2.E()
        L756:
            t6 r2 = new t6
            r2.<init>(r1, r10)
            defpackage.gt0.W0(r3, r2)
            bt r2 = new bt
            q6 r4 = new q6
            r4.<init>(r8, r0, r1)
            r2.<init>(r4)
            r3 r11 = new r3
            ls3 r12 = r1.a
            java.lang.String r13 = r1.b
            java.net.URL r14 = r1.c
            java.lang.String r15 = r1.d
            long r17 = r0.f()
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r3.add(r9, r11)
            goto La25
        L780:
            boolean r2 = r1 instanceof defpackage.x95
            if (r2 == 0) goto L840
            x95 r1 = (defpackage.x95) r1
            long r4 = r1.a
            ls3 r2 = r1.b
            java.util.ListIterator r6 = r3.listIterator()
        L78e:
            r7 = r6
            xx2 r7 = (defpackage.xx2) r7
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L7bd
            java.lang.Object r7 = r7.next()
            r8 = r7
            v3 r8 = (defpackage.v3) r8
            boolean r12 = r8 instanceof defpackage.o3
            if (r12 == 0) goto L7a5
            o3 r8 = (defpackage.o3) r8
            goto L7a6
        L7a5:
            r8 = r11
        L7a6:
            if (r8 == 0) goto L78e
            ls3 r8 = r8.a
            if (r2 == 0) goto L7b1
            boolean r8 = r2.equals(r8)
            goto L7ba
        L7b1:
            long r12 = r8.a
            int r8 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r8 != 0) goto L7b9
            r8 = r10
            goto L7ba
        L7b9:
            r8 = r9
        L7ba:
            if (r8 == 0) goto L78e
            goto L7be
        L7bd:
            r7 = r11
        L7be:
            v3 r7 = (defpackage.v3) r7
            if (r7 == 0) goto L7cb
            bt r6 = r7.a()
            if (r6 == 0) goto L7cb
            r6.E()
        L7cb:
            java.util.ListIterator r6 = r3.listIterator()
        L7cf:
            r7 = r6
            xx2 r7 = (defpackage.xx2) r7
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L7fe
            java.lang.Object r7 = r7.next()
            r8 = r7
            v3 r8 = (defpackage.v3) r8
            boolean r12 = r8 instanceof defpackage.r3
            if (r12 == 0) goto L7e6
            r3 r8 = (defpackage.r3) r8
            goto L7e7
        L7e6:
            r8 = r11
        L7e7:
            if (r8 == 0) goto L7cf
            ls3 r8 = r8.a
            if (r2 == 0) goto L7f2
            boolean r8 = r2.equals(r8)
            goto L7fb
        L7f2:
            long r12 = r8.a
            int r8 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r8 != 0) goto L7fa
            r8 = r10
            goto L7fb
        L7fa:
            r8 = r9
        L7fb:
            if (r8 == 0) goto L7cf
            r11 = r7
        L7fe:
            v3 r11 = (defpackage.v3) r11
            if (r11 == 0) goto L80b
            bt r2 = r11.a()
            if (r2 == 0) goto L80b
            r2.E()
        L80b:
            bt r2 = new bt
            q6 r4 = new q6
            r4.<init>(r10, r0, r1)
            r2.<init>(r4)
            q3 r11 = new q3
            long r12 = r1.a
            ls3 r14 = r1.b
            java.lang.String r15 = r1.c
            java.net.URL r4 = r1.d
            java.lang.String r5 = r1.e
            java.lang.String r6 = r1.f
            long r7 = r1.g
            long r9 = r1.h
            long r24 = r0.f()
            r23 = r2
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r21 = r9
            r11.<init>(r12, r14, r15, r16, r17, r18, r19, r21, r23, r24)
            r0 = 0
            r3.add(r0, r11)
            goto La25
        L840:
            boolean r2 = r1 instanceof defpackage.w95
            if (r2 == 0) goto L91a
            w95 r1 = (defpackage.w95) r1
            ls3 r2 = r1.b
            long r4 = r1.a
            java.util.ListIterator r7 = r3.listIterator()
        L84e:
            r8 = r7
            xx2 r8 = (defpackage.xx2) r8
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L87d
            java.lang.Object r8 = r8.next()
            r9 = r8
            v3 r9 = (defpackage.v3) r9
            boolean r12 = r9 instanceof defpackage.o3
            if (r12 == 0) goto L865
            o3 r9 = (defpackage.o3) r9
            goto L866
        L865:
            r9 = r11
        L866:
            if (r9 == 0) goto L84e
            ls3 r9 = r9.a
            if (r2 == 0) goto L871
            boolean r9 = r2.equals(r9)
            goto L87a
        L871:
            long r12 = r9.a
            int r9 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r9 != 0) goto L879
            r9 = r10
            goto L87a
        L879:
            r9 = 0
        L87a:
            if (r9 == 0) goto L84e
            goto L87e
        L87d:
            r8 = r11
        L87e:
            boolean r7 = r8 instanceof defpackage.o3
            if (r7 == 0) goto L885
            o3 r8 = (defpackage.o3) r8
            goto L886
        L885:
            r8 = r11
        L886:
            if (r8 == 0) goto L88d
            bt r7 = r8.e
            r7.E()
        L88d:
            java.util.ListIterator r7 = r3.listIterator()
        L891:
            r9 = r7
            xx2 r9 = (defpackage.xx2) r9
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L8c0
            java.lang.Object r9 = r9.next()
            r12 = r9
            v3 r12 = (defpackage.v3) r12
            boolean r13 = r12 instanceof defpackage.r3
            if (r13 == 0) goto L8a8
            r3 r12 = (defpackage.r3) r12
            goto L8a9
        L8a8:
            r12 = r11
        L8a9:
            if (r12 == 0) goto L891
            ls3 r12 = r12.a
            if (r2 == 0) goto L8b4
            boolean r12 = r2.equals(r12)
            goto L8bd
        L8b4:
            long r12 = r12.a
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 != 0) goto L8bc
            r12 = r10
            goto L8bd
        L8bc:
            r12 = 0
        L8bd:
            if (r12 == 0) goto L891
            r11 = r9
        L8c0:
            v3 r11 = (defpackage.v3) r11
            if (r11 == 0) goto L8cd
            bt r2 = r11.a()
            if (r2 == 0) goto L8cd
            r2.E()
        L8cd:
            if (r8 == 0) goto L8d4
            n3 r2 = defpackage.n3.FAILURE
            r0.b(r8, r2)
        L8d4:
            java.util.ListIterator r2 = r3.listIterator()
            r7 = 0
        L8d9:
            r8 = r2
            xx2 r8 = (defpackage.xx2) r8
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L8f1
            java.lang.Object r8 = r8.next()
            v3 r8 = (defpackage.v3) r8
            boolean r8 = r8 instanceof defpackage.u3
            if (r8 == 0) goto L8ee
            r6 = r7
            goto L8f1
        L8ee:
            int r7 = r7 + 1
            goto L8d9
        L8f1:
            t3 r8 = new t3
            r8.<init>(r4)
            if (r6 >= 0) goto L913
            bt r10 = new bt
            v6 r2 = new v6
            r4 = 0
            r2.<init>(r0, r4)
            r10.<init>(r2)
            u3 r7 = new u3
            boolean r9 = r1.c
            long r11 = r0.f()
            r7.<init>(r8, r9, r10, r11)
            r3.add(r4, r7)
            goto La25
        L913:
            boolean r1 = r1.c
            r0.d(r6, r8, r1)
            goto La25
        L91a:
            r4 = 0
            boolean r2 = r1 instanceof defpackage.t95
            if (r2 == 0) goto L9b3
            t95 r1 = (defpackage.t95) r1
            long r5 = r1.a
            ls3 r1 = r1.b
            java.util.ListIterator r2 = r3.listIterator()
        L929:
            r7 = r2
            xx2 r7 = (defpackage.xx2) r7
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L95a
            java.lang.Object r7 = r7.next()
            r8 = r7
            v3 r8 = (defpackage.v3) r8
            boolean r9 = r8 instanceof defpackage.o3
            if (r9 == 0) goto L940
            o3 r8 = (defpackage.o3) r8
            goto L941
        L940:
            r8 = r11
        L941:
            if (r8 == 0) goto L929
            if (r1 == 0) goto L94c
            ls3 r8 = r8.a
            boolean r8 = defpackage.nb3.k(r8, r1)
            goto L957
        L94c:
            ta5 r8 = r8.b
            long r8 = r8.a
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L956
            r8 = r10
            goto L957
        L956:
            r8 = r4
        L957:
            if (r8 == 0) goto L929
            goto L95b
        L95a:
            r7 = r11
        L95b:
            boolean r2 = r7 instanceof defpackage.o3
            if (r2 == 0) goto L962
            o3 r7 = (defpackage.o3) r7
            goto L963
        L962:
            r7 = r11
        L963:
            if (r7 == 0) goto L96a
            bt r2 = r7.e
            r2.E()
        L96a:
            java.util.ListIterator r2 = r3.listIterator()
        L96e:
            r3 = r2
            xx2 r3 = (defpackage.xx2) r3
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L99d
            java.lang.Object r3 = r3.next()
            r8 = r3
            v3 r8 = (defpackage.v3) r8
            boolean r9 = r8 instanceof defpackage.r3
            if (r9 == 0) goto L985
            r3 r8 = (defpackage.r3) r8
            goto L986
        L985:
            r8 = r11
        L986:
            if (r8 == 0) goto L96e
            ls3 r8 = r8.a
            if (r1 == 0) goto L991
            boolean r8 = defpackage.nb3.k(r8, r1)
            goto L99a
        L991:
            long r8 = r8.a
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L999
            r8 = r10
            goto L99a
        L999:
            r8 = r4
        L99a:
            if (r8 == 0) goto L96e
            r11 = r3
        L99d:
            v3 r11 = (defpackage.v3) r11
            if (r11 == 0) goto L9aa
            bt r1 = r11.a()
            if (r1 == 0) goto L9aa
            r1.E()
        L9aa:
            if (r7 == 0) goto La25
            n3 r1 = defpackage.n3.FAILURE
            r0.b(r7, r1)
            goto La25
        L9b3:
            boolean r0 = r1 instanceof defpackage.z95
            if (r0 == 0) goto L9f2
            z95 r1 = (defpackage.z95) r1
            java.util.ListIterator r0 = r3.listIterator()
        L9bd:
            r2 = r0
            xx2 r2 = (defpackage.xx2) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9e4
            java.lang.Object r2 = r2.next()
            r3 = r2
            v3 r3 = (defpackage.v3) r3
            boolean r4 = r3 instanceof defpackage.o3
            if (r4 == 0) goto L9d4
            o3 r3 = (defpackage.o3) r3
            goto L9d5
        L9d4:
            r3 = r11
        L9d5:
            if (r3 == 0) goto L9da
            ls3 r3 = r3.a
            goto L9db
        L9da:
            r3 = r11
        L9db:
            ls3 r4 = r1.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 == 0) goto L9bd
            r11 = r2
        L9e4:
            v3 r11 = (defpackage.v3) r11
            if (r11 == 0) goto La25
            bt r0 = r11.a()
            if (r0 == 0) goto La25
            r0.E()
            goto La25
        L9f2:
            aa5 r0 = defpackage.aa5.a
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La21
            java.util.ListIterator r0 = r3.listIterator()
        L9fe:
            r1 = r0
            xx2 r1 = (defpackage.xx2) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La13
            java.lang.Object r1 = r1.next()
            r2 = r1
            v3 r2 = (defpackage.v3) r2
            boolean r2 = r2 instanceof defpackage.u3
            if (r2 == 0) goto L9fe
            r11 = r1
        La13:
            v3 r11 = (defpackage.v3) r11
            if (r11 == 0) goto La25
            bt r0 = r11.a()
            if (r0 == 0) goto La25
            r0.E()
            goto La25
        La21:
            boolean r0 = r1 instanceof defpackage.s95
            if (r0 == 0) goto La28
        La25:
            jg7 r11 = defpackage.jg7.a
            goto La2b
        La28:
            defpackage.i.d()
        La2b:
            return r11
    }
}
