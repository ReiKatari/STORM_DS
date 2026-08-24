package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ru1 implements android.view.View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ ru1(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.A
            java.lang.String r2 = "handler"
            r3 = 3
            r4 = 0
            java.lang.Object r5 = r0.R
            java.lang.Object r6 = r0.L
            java.lang.Object r0 = r0.B
            switch(r1) {
                case 0: goto L16e;
                case 1: goto L14f;
                default: goto L11;
            }
        L11:
            me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference r0 = (me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference) r0
            dz0 r6 = (defpackage.dz0) r6
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.content.Context r0 = r0.getContext()
            r0.getClass()
            vr4[] r1 = r6.d
            r1.getClass()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r6 = 2131623985(0x7f0e0031, float:1.8875137E38)
            r7 = 0
            android.view.View r2 = r2.inflate(r6, r4, r7)
            r6 = 2131427653(0x7f0b0145, float:1.8476928E38)
            android.view.View r8 = defpackage.gi2.B(r2, r6)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            java.lang.String r9 = "Missing required view with ID: "
            if (r8 == 0) goto L13f
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.widget.PopupWindow r6 = new android.widget.PopupWindow
            r10 = -2
            r6.<init>(r2, r10, r10)
            r2 = 1
            r6.setOutsideTouchable(r2)
            int r10 = r1.length
            r11 = r7
        L4a:
            r12 = 2
            if (r11 >= r10) goto Lf1
            r13 = r1[r11]
            android.view.LayoutInflater r14 = android.view.LayoutInflater.from(r0)
            r15 = 2131624004(0x7f0e0044, float:1.8875175E38)
            android.view.View r14 = r14.inflate(r15, r4, r7)
            r15 = 2131427628(0x7f0b012c, float:1.8476878E38)
            android.view.View r16 = defpackage.gi2.B(r14, r15)
            r19 = r4
            r4 = r16
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto Le1
            r15 = 2131427964(0x7f0b027c, float:1.847756E38)
            android.view.View r16 = defpackage.gi2.B(r14, r15)
            r15 = r16
            android.widget.TextView r15 = (android.widget.TextView) r15
            if (r15 == 0) goto Lde
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            java.lang.Object r7 = r13.B
            bz0 r7 = (defpackage.bz0) r7
            int[] r17 = defpackage.cb2.a
            int r7 = r7.ordinal()
            r7 = r17[r7]
            if (r7 == r2) goto Lb9
            if (r7 == r12) goto La4
            if (r7 != r3) goto L9f
            r7 = 2131230978(0x7f080102, float:1.8078024E38)
            r4.setImageResource(r7)
            r7 = 2131100621(0x7f0603cd, float:1.7813629E38)
            int r7 = r0.getColor(r7)
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
            r4.setImageTintList(r7)
            goto Lcd
        L9f:
            defpackage.i.d()
            goto L14e
        La4:
            r7 = 2131230980(0x7f080104, float:1.8078028E38)
            r4.setImageResource(r7)
            r7 = 2131100623(0x7f0603cf, float:1.7813633E38)
            int r7 = r0.getColor(r7)
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
            r4.setImageTintList(r7)
            goto Lcd
        Lb9:
            r7 = 2131230979(0x7f080103, float:1.8078026E38)
            r4.setImageResource(r7)
            r7 = 2131100622(0x7f0603ce, float:1.781363E38)
            int r7 = r0.getColor(r7)
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
            r4.setImageTintList(r7)
        Lcd:
            java.lang.Object r4 = r13.A
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r15.setText(r4)
            r8.addView(r14)
            int r11 = r11 + 1
            r4 = r19
            r7 = 0
            goto L4a
        Lde:
            r15 = 2131427964(0x7f0b027c, float:1.847756E38)
        Le1:
            android.content.res.Resources r0 = r14.getResources()
            java.lang.String r0 = r0.getResourceName(r15)
            java.lang.String r0 = r9.concat(r0)
            defpackage.u34.x(r0)
            goto L14e
        Lf1:
            r5.getClass()
            android.view.View r0 = r6.getContentView()
            r1 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            r0.measure(r3, r4)
            int[] r0 = new int[r12]
            r5.getLocationOnScreen(r0)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1 = r0[r1]
            r3.left = r1
            r4 = r0[r2]
            r3.top = r4
            int r4 = r5.getWidth()
            int r4 = r4 + r1
            r3.right = r4
            r0 = r0[r2]
            int r1 = r5.getHeight()
            int r1 = r1 + r0
            r3.bottom = r1
            int r0 = r3.right
            android.view.View r1 = r6.getContentView()
            int r1 = r1.getMeasuredWidth()
            int r0 = r0 - r1
            int r1 = r3.top
            int r2 = r3.height()
            int r2 = r2 + r1
            r1 = 8388659(0x800033, float:1.1755015E-38)
            r6.showAtLocation(r5, r1, r0, r2)
            goto L14e
        L13f:
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r0 = r0.getResourceName(r6)
            java.lang.String r0 = r9.concat(r0)
            defpackage.u34.x(r0)
        L14e:
            return
        L14f:
            r19 = r4
            ac r0 = (defpackage.ac) r0
            me.magnum.melonds.ui.emulator.EmulatorActivity r6 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r6
            on2 r5 = (defpackage.on2) r5
            int r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r0.dismiss()
            android.os.Handler r0 = r6.N0
            if (r0 == 0) goto L16a
            fe r1 = new fe
            r2 = 4
            r1.<init>(r2, r5)
            r0.post(r1)
            return
        L16a:
            defpackage.nb3.a0(r2)
            throw r19
        L16e:
            r19 = r4
            ac r0 = (defpackage.ac) r0
            me.magnum.melonds.ui.emulator.EmulatorActivity r6 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r6
            on2 r5 = (defpackage.on2) r5
            int r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r0.dismiss()
            android.os.Handler r0 = r6.N0
            if (r0 == 0) goto L188
            fe r1 = new fe
            r1.<init>(r3, r5)
            r0.post(r1)
            return
        L188:
            defpackage.nb3.a0(r2)
            throw r19
    }
}
