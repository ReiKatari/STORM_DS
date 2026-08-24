package me.magnum.melonds.ui.layouteditor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b extends android.widget.FrameLayout {
    public final defpackage.sn3 A;
    public final defpackage.sw4 B;
    public final defpackage.nb1 L;
    public final defpackage.ex6 R;
    public defpackage.jl3 d0;
    public boolean e0;
    public boolean f0;
    public int g0;
    public float h0;
    public float i0;
    public boolean j0;
    public boolean k0;
    public defpackage.nj3 l0;
    public defpackage.kl3 m0;
    public defpackage.kl3 n0;
    public defpackage.kl3 o0;
    public boolean p0;
    public boolean q0;
    public final defpackage.vs4 r0;
    public final defpackage.vs4 s0;
    public final defpackage.vs4 t0;
    public final defpackage.vs4 u0;
    public defpackage.nj3 v0;
    public defpackage.nj3 w0;
    public defpackage.nj3 x0;
    public final defpackage.j37 y0;

    public b(defpackage.sn3 r55, defpackage.sw4 r56, defpackage.u66 r57, android.content.ContextWrapper r58) {
            r54 = this;
            r0 = r54
            r1 = r57
            r2 = r58
            r55.getClass()
            r3 = 0
            r0.<init>(r2, r3)
            r4 = r55
            r0.A = r4
            r4 = r56
            r0.B = r4
            yk3 r4 = new yk3
            r5 = 0
            r4.<init>(r0, r5)
            ex6 r6 = new ex6
            r6.<init>(r4)
            r0.R = r6
            r4 = 1
            r0.e0 = r4
            r0.f0 = r4
            kl3 r6 = defpackage.kl3.RATIO_4_3
            r0.m0 = r6
            r0.n0 = r6
            r0.o0 = r6
            if (r1 == 0) goto L34
            boolean r6 = r1.a
            goto L35
        L34:
            r6 = r5
        L35:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            vs4 r6 = defpackage.np2.Y(r6)
            r0.r0 = r6
            if (r1 == 0) goto L44
            boolean r1 = r1.b
            goto L45
        L44:
            r1 = r5
        L45:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            vs4 r1 = defpackage.np2.Y(r1)
            r0.s0 = r1
            vs4 r1 = defpackage.np2.Y(r3)
            r0.t0 = r1
            vs4 r1 = defpackage.np2.Y(r3)
            r0.u0 = r1
            j37 r1 = new j37
            r1.<init>()
            r0.y0 = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r2)
            r0.setFocusable(r5)
            r0.setFocusableInTouchMode(r5)
            r6 = 2131624096(0x7f0e00a0, float:1.8875362E38)
            android.view.View r1 = r1.inflate(r6, r3, r5)
            r6 = 2131427443(0x7f0b0073, float:1.8476502E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            androidx.constraintlayout.widget.Barrier r7 = (androidx.constraintlayout.widget.Barrier) r7
            if (r7 == 0) goto L3e6
            r6 = 2131427472(0x7f0b0090, float:1.8476561E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r10 = r7
            android.widget.Button r10 = (android.widget.Button) r10
            if (r10 == 0) goto L3e6
            r6 = 2131427473(0x7f0b0091, float:1.8476563E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r11 = r7
            android.widget.Button r11 = (android.widget.Button) r11
            if (r11 == 0) goto L3e6
            r6 = 2131427474(0x7f0b0092, float:1.8476565E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r12 = r7
            android.widget.Button r12 = (android.widget.Button) r12
            if (r12 == 0) goto L3e6
            r6 = 2131427475(0x7f0b0093, float:1.8476567E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r13 = r7
            android.widget.Button r13 = (android.widget.Button) r13
            if (r13 == 0) goto L3e6
            r6 = 2131427477(0x7f0b0095, float:1.8476571E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r14 = r7
            android.widget.Button r14 = (android.widget.Button) r14
            if (r14 == 0) goto L3e6
            r6 = 2131427478(0x7f0b0096, float:1.8476573E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r15 = r7
            android.widget.Button r15 = (android.widget.Button) r15
            if (r15 == 0) goto L3e6
            r6 = 2131427479(0x7f0b0097, float:1.8476575E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r16 = r7
            android.widget.ImageButton r16 = (android.widget.ImageButton) r16
            if (r16 == 0) goto L3e6
            r6 = 2131427480(0x7f0b0098, float:1.8476577E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r17 = r7
            android.widget.Button r17 = (android.widget.Button) r17
            if (r17 == 0) goto L3e6
            r6 = 2131427481(0x7f0b0099, float:1.847658E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r18 = r7
            android.widget.Button r18 = (android.widget.Button) r18
            if (r18 == 0) goto L3e6
            r6 = 2131427495(0x7f0b00a7, float:1.8476608E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r19 = r7
            android.widget.CheckBox r19 = (android.widget.CheckBox) r19
            if (r19 == 0) goto L3e6
            r6 = 2131427630(0x7f0b012e, float:1.8476882E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r20 = r7
            android.widget.ImageView r20 = (android.widget.ImageView) r20
            if (r20 == 0) goto L3e6
            r6 = 2131427658(0x7f0b014a, float:1.8476938E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r21 = r7
            android.widget.LinearLayout r21 = (android.widget.LinearLayout) r21
            if (r21 == 0) goto L3e6
            r6 = 2131427659(0x7f0b014b, float:1.847694E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r22 = r7
            android.widget.LinearLayout r22 = (android.widget.LinearLayout) r22
            if (r22 == 0) goto L3e6
            r6 = 2131427660(0x7f0b014c, float:1.8476943E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r23 = r7
            android.widget.LinearLayout r23 = (android.widget.LinearLayout) r23
            if (r23 == 0) goto L3e6
            r6 = 2131427662(0x7f0b014e, float:1.8476947E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r24 = r7
            android.widget.LinearLayout r24 = (android.widget.LinearLayout) r24
            if (r24 == 0) goto L3e6
            r6 = 2131427663(0x7f0b014f, float:1.8476949E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r25 = r7
            android.widget.LinearLayout r25 = (android.widget.LinearLayout) r25
            if (r25 == 0) goto L3e6
            r6 = 2131427669(0x7f0b0155, float:1.847696E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            if (r7 == 0) goto L3e6
            r6 = 2131427670(0x7f0b0156, float:1.8476963E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r26 = r7
            android.widget.ScrollView r26 = (android.widget.ScrollView) r26
            if (r26 == 0) goto L3e6
            r6 = 2131427671(0x7f0b0157, float:1.8476965E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r27 = r7
            android.widget.LinearLayout r27 = (android.widget.LinearLayout) r27
            if (r27 == 0) goto L3e6
            r6 = 2131427672(0x7f0b0158, float:1.8476967E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r28 = r7
            android.widget.LinearLayout r28 = (android.widget.LinearLayout) r28
            if (r28 == 0) goto L3e6
            r6 = 2131427673(0x7f0b0159, float:1.8476969E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r29 = r7
            android.widget.LinearLayout r29 = (android.widget.LinearLayout) r29
            if (r29 == 0) goto L3e6
            r6 = 2131427871(0x7f0b021f, float:1.847737E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r30 = r7
            android.widget.SeekBar r30 = (android.widget.SeekBar) r30
            if (r30 == 0) goto L3e6
            r6 = 2131427872(0x7f0b0220, float:1.8477373E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r31 = r7
            android.widget.SeekBar r31 = (android.widget.SeekBar) r31
            if (r31 == 0) goto L3e6
            r6 = 2131427873(0x7f0b0221, float:1.8477375E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r32 = r7
            android.widget.SeekBar r32 = (android.widget.SeekBar) r32
            if (r32 == 0) goto L3e6
            r6 = 2131427874(0x7f0b0222, float:1.8477377E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r33 = r7
            android.widget.SeekBar r33 = (android.widget.SeekBar) r33
            if (r33 == 0) goto L3e6
            r6 = 2131427875(0x7f0b0223, float:1.8477379E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r34 = r7
            android.widget.SeekBar r34 = (android.widget.SeekBar) r34
            if (r34 == 0) goto L3e6
            r6 = 2131427876(0x7f0b0224, float:1.847738E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r35 = r7
            android.widget.SeekBar r35 = (android.widget.SeekBar) r35
            if (r35 == 0) goto L3e6
            r6 = 2131427903(0x7f0b023f, float:1.8477435E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r36 = r7
            android.widget.Spinner r36 = (android.widget.Spinner) r36
            if (r36 == 0) goto L3e6
            r6 = 2131427988(0x7f0b0294, float:1.8477608E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r37 = r7
            android.widget.TextView r37 = (android.widget.TextView) r37
            if (r37 == 0) goto L3e6
            r6 = 2131427992(0x7f0b0298, float:1.8477616E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r38 = r7
            android.widget.TextView r38 = (android.widget.TextView) r38
            if (r38 == 0) goto L3e6
            r6 = 2131427998(0x7f0b029e, float:1.8477628E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r39 = r7
            android.widget.TextView r39 = (android.widget.TextView) r39
            if (r39 == 0) goto L3e6
            r6 = 2131428000(0x7f0b02a0, float:1.8477632E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r40 = r7
            android.widget.TextView r40 = (android.widget.TextView) r40
            if (r40 == 0) goto L3e6
            r6 = 2131428004(0x7f0b02a4, float:1.847764E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r41 = r7
            android.widget.TextView r41 = (android.widget.TextView) r41
            if (r41 == 0) goto L3e6
            r6 = 2131428069(0x7f0b02e5, float:1.8477772E38)
            android.view.View r7 = defpackage.gi2.B(r1, r6)
            r42 = r7
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r42 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r42
            if (r42 == 0) goto L3e6
            nb1 r8 = new nb1
            r9 = r1
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r4 = r8
            r53 = r9
            r7 = r16
            r1 = r17
            r6 = r18
            r8 = r19
            r9 = r25
            r43 = r27
            r44 = r29
            r45 = r30
            r46 = r31
            r47 = r32
            r48 = r33
            r49 = r34
            r50 = r35
            r51 = r36
            r52 = r42
            r0.L = r4
            androidx.compose.ui.platform.ComposeView r4 = new androidx.compose.ui.platform.ComposeView
            r5 = 6
            r4.<init>(r2, r3, r5)
            al3 r3 = new al3
            r5 = 0
            r3.<init>(r0, r5)
            zv0 r5 = new zv0
            r7 = 1040140390(0x3dff4866, float:0.12464981)
            r8 = 1
            r5.<init>(r7, r8, r3)
            r4.setContent(r5)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r5 = -1
            r3.<init>(r5, r5)
            r7 = r53
            r0.addView(r7, r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r5, r5)
            r0.addView(r4, r3)
            h61 r3 = new h61
            r4 = 11
            r3.<init>(r0, r4)
            java.util.WeakHashMap r5 = defpackage.ao7.a
            defpackage.sn7.c(r7, r3)
            zk3 r3 = new zk3
            r8 = 1
            r3.<init>(r0, r8)
            r11.setOnClickListener(r3)
            zk3 r3 = new zk3
            r5 = 2
            r3.<init>(r0, r5)
            r10.setOnClickListener(r3)
            zk3 r3 = new zk3
            r7 = 3
            r3.<init>(r0, r7)
            r1.setOnClickListener(r3)
            zk3 r1 = new zk3
            r3 = 4
            r1.<init>(r0, r3)
            r14.setOnClickListener(r1)
            zk3 r1 = new zk3
            r8 = 5
            r1.<init>(r0, r8)
            r6.setOnClickListener(r1)
            sp1 r1 = new sp1
            r8 = 1
            r1.<init>(r0, r8)
            r15.setOnTouchListener(r1)
            zk3 r1 = new zk3
            r6 = 6
            r1.<init>(r0, r6)
            r15.setOnClickListener(r1)
            zk3 r1 = new zk3
            r6 = 7
            r1.<init>(r0, r6)
            r12.setOnClickListener(r1)
            zk3 r1 = new zk3
            r6 = 8
            r1.<init>(r0, r6)
            r13.setOnClickListener(r1)
            fl3 r1 = new fl3
            r6 = 0
            r1.<init>(r0, r2, r6)
            r8 = r49
            r8.setOnSeekBarChangeListener(r1)
            fl3 r1 = new fl3
            r8 = 1
            r1.<init>(r0, r2, r8)
            r10 = r46
            r10.setOnSeekBarChangeListener(r1)
            wb1 r1 = new wb1
            r1.<init>(r8, r6)
            r6 = r52
            r6.setLayoutComponentViewBuilderFactory(r1)
            zk3 r1 = new zk3
            r8 = 9
            r1.<init>(r0, r8)
            r6.setOnClickListener(r1)
            el3 r1 = new el3
            r1.<init>(r0)
            r6.setOnViewSelectedListener(r1)
            dl3 r1 = new dl3
            r1.<init>(r0, r7)
            r6.setOnViewDeselectedListener(r1)
            dl3 r1 = new dl3
            r1.<init>(r0, r3)
            r6.setOnViewPositionEditRequestedListener(r1)
            zk3 r1 = new zk3
            r3 = 10
            r1.<init>(r0, r3)
            r3 = r43
            r3.setOnClickListener(r1)
            sp1 r1 = new sp1
            r8 = 1
            r1.<init>(r0, r8)
            r3.setOnTouchListener(r1)
            gl3 r1 = new gl3
            r6 = 0
            r1.<init>(r0, r6)
            r3 = r48
            r3.setOnSeekBarChangeListener(r1)
            zk3 r1 = new zk3
            r1.<init>(r0, r4)
            r3 = r44
            r3.setOnClickListener(r1)
            sp1 r1 = new sp1
            r1.<init>(r0, r8)
            r3.setOnTouchListener(r1)
            gl3 r1 = new gl3
            r1.<init>(r0, r8)
            r3 = r50
            r3.setOnSeekBarChangeListener(r1)
            zk3 r1 = new zk3
            r3 = 12
            r1.<init>(r0, r3)
            r9.setOnClickListener(r1)
            sp1 r1 = new sp1
            r1.<init>(r0, r8)
            r9.setOnTouchListener(r1)
            gl3 r1 = new gl3
            r1.<init>(r0, r5)
            r3 = r47
            r3.setOnSeekBarChangeListener(r1)
            gl3 r1 = new gl3
            r1.<init>(r0, r7)
            r7 = r45
            r7.setOnSeekBarChangeListener(r1)
            android.content.res.Resources r1 = r0.getResources()
            r3 = 2131951702(0x7f130056, float:1.9539826E38)
            java.lang.String r1 = r1.getString(r3)
            android.content.res.Resources r3 = r0.getResources()
            r4 = 2131951701(0x7f130055, float:1.9539824E38)
            java.lang.String r3 = r3.getString(r4)
            android.content.res.Resources r4 = r0.getResources()
            r6 = 2131951703(0x7f130057, float:1.9539828E38)
            java.lang.String r4 = r4.getString(r6)
            java.lang.String[] r1 = new java.lang.String[]{r1, r3, r4}
            java.util.List r1 = defpackage.hf.c0(r1)
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r2, r4, r1)
            r1 = 17367049(0x1090009, float:2.516295E-38)
            r3.setDropDownViewResource(r1)
            r7 = r51
            r7.setAdapter(r3)
            np1 r1 = new np1
            r8 = 1
            r1.<init>(r0, r8)
            r7.setOnItemSelectedListener(r1)
            jq0 r1 = new jq0
            r1.<init>(r0, r5)
            r8 = r19
            r8.setOnCheckedChangeListener(r1)
            zk3 r1 = new zk3
            r6 = 0
            r1.<init>(r0, r6)
            r7 = r16
            r7.setOnClickListener(r1)
            r0.u(r6)
            return
        L3e6:
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r0 = r0.getResourceName(r6)
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r0 = r1.concat(r0)
            defpackage.u34.x(r0)
            throw r3
    }

    public static void a(me.magnum.melonds.ui.layouteditor.b r5, java.lang.String r6) {
            r6.getClass()
            yl3 r0 = r5.getViewModel()
            r0.j(r6)
            jl3 r5 = r5.d0
            if (r5 == 0) goto L39
            s63 r5 = (defpackage.s63) r5
            java.lang.Object r5 = r5.B
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r5 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity) r5
            int r6 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.N0
            r5.B()
            yl3 r6 = r5.C()
            tp6 r0 = r6.i
            java.lang.Object r0 = r0.getValue()
            fk3 r0 = (defpackage.fk3) r0
            if (r0 == 0) goto L36
            as0 r1 = defpackage.to7.a(r6)
            wl3 r2 = new wl3
            r3 = 1
            r4 = 0
            r2.<init>(r6, r0, r4, r3)
            r6 = 3
            defpackage.hv.L(r1, r4, r4, r2, r6)
        L36:
            r5.finish()
        L39:
            return
    }

    public static void b(me.magnum.melonds.ui.layouteditor.b r11, java.lang.String r12, defpackage.ck3 r13, boolean r14, int r15) {
            r13.getClass()
            yl3 r0 = r11.getViewModel()
            r0.getClass()
            tp6 r0 = r0.i
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            fk3 r2 = (defpackage.fk3) r2
            if (r2 == 0) goto L26
            r9 = 0
            r10 = 69
            r3 = 0
            r5 = 0
            r4 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            fk3 r12 = defpackage.fk3.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13 = 0
            r0.m(r13, r12)
        L26:
            r12 = 0
            r11.setShowLayoutPropertiesDialog(r12)
            return
    }

    public static void c(me.magnum.melonds.ui.layouteditor.b r1) {
            r0 = 0
            r1.setShownEditablePropertyDialog(r0)
            r1.w0 = r0
            return
    }

    public static void d(me.magnum.melonds.ui.layouteditor.b r5) {
            yl3 r0 = r5.getViewModel()
            sn3 r1 = r5.A
            r0.getClass()
            r1.getClass()
            de5 r2 = r0.p
            rp6 r2 = r2.A
            java.lang.Object r2 = r2.getValue()
            w71 r2 = (defpackage.w71) r2
            r3 = 0
            if (r2 == 0) goto L1c
            ff7 r2 = r2.a
            goto L1d
        L1c:
            r2 = r3
        L1d:
            int[] r4 = defpackage.sl3.a
            int r1 = r1.ordinal()
            r1 = r4[r1]
            r4 = 1
            if (r1 == r4) goto L42
            r4 = 2
            if (r1 != r4) goto L3e
            tp6 r0 = r0.s
            if (r2 == 0) goto L3a
            lj3 r3 = new lj3
            z66 r1 = r2.b
            java.util.UUID r2 = r1.a
            me.magnum.melonds.domain.model.layout.BackgroundMode r1 = r1.b
            r3.<init>(r2, r1)
        L3a:
            r0.l(r3)
            goto L54
        L3e:
            defpackage.i.d()
            return
        L42:
            tp6 r0 = r0.q
            if (r2 == 0) goto L51
            lj3 r3 = new lj3
            z66 r1 = r2.a
            java.util.UUID r2 = r1.a
            me.magnum.melonds.domain.model.layout.BackgroundMode r1 = r1.b
            r3.<init>(r2, r1)
        L51:
            r0.l(r3)
        L54:
            r0 = 0
            r5.setShowBackgroundPropertiesDialog(r0)
            return
    }

    public static void e(me.magnum.melonds.ui.layouteditor.b r1, java.lang.String r2) {
            r2.getClass()
            yl3 r0 = r1.getViewModel()
            r0.j(r2)
            jl3 r1 = r1.d0
            if (r1 == 0) goto L13
            s63 r1 = (defpackage.s63) r1
            r1.w()
        L13:
            return
    }

    public static void f(me.magnum.melonds.ui.layouteditor.b r18) {
            r0 = r18
            yl3 r1 = r0.getViewModel()
            sn3 r2 = r0.A
            r1.getClass()
            r2.getClass()
            jf7 r3 = r1.h
            if (r3 != 0) goto L14
            goto Le3
        L14:
            int[] r4 = defpackage.sl3.a
            int r5 = r2.ordinal()
            r4 = r4[r5]
            r5 = 2
            r6 = 1
            if (r4 == r6) goto L2f
            if (r4 != r5) goto L2b
            tp6 r4 = r1.s
            java.lang.Object r4 = r4.getValue()
            lj3 r4 = (defpackage.lj3) r4
            goto L37
        L2b:
            defpackage.i.d()
            return
        L2f:
            tp6 r4 = r1.q
            java.lang.Object r4 = r4.getValue()
            lj3 r4 = (defpackage.lj3) r4
        L37:
            if (r4 != 0) goto L3b
            goto Le3
        L3b:
            java.util.UUID r7 = r4.a
            me.magnum.melonds.domain.model.layout.BackgroundMode r4 = r4.b
            tp6 r1 = r1.i
        L41:
            java.lang.Object r8 = r1.getValue()
            r9 = r8
            fk3 r9 = (defpackage.fk3) r9
            r10 = 0
            if (r9 == 0) goto Ldd
            java.util.Map r11 = r9.g
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>(r11)
            int[] r11 = defpackage.sl3.a
            int r13 = r2.ordinal()
            r11 = r11[r13]
            r13 = 4
            if (r11 == r6) goto L97
            if (r11 != r5) goto L93
            boolean r11 = r12.containsKey(r3)
            if (r11 == 0) goto L82
            java.lang.Object r11 = r12.get(r3)
            ff7 r11 = (defpackage.ff7) r11
            if (r11 == 0) goto Lca
            z66 r11 = r11.b
            if (r11 == 0) goto Lca
            z66 r11 = defpackage.z66.a(r11, r7, r4, r10, r13)
            java.lang.Object r13 = r12.get(r3)
            ff7 r13 = (defpackage.ff7) r13
            if (r13 == 0) goto Lca
            ff7 r10 = defpackage.ff7.b(r13, r10, r11, r6)
            goto Lca
        L82:
            ff7 r11 = new ff7
            z66 r13 = new z66
            r13.<init>(r10)
            z66 r14 = new z66
            r14.<init>(r7, r4, r10)
            r11.<init>(r13, r14)
        L91:
            r10 = r11
            goto Lca
        L93:
            defpackage.i.d()
            return
        L97:
            boolean r11 = r12.containsKey(r3)
            if (r11 == 0) goto Lba
            java.lang.Object r11 = r12.get(r3)
            ff7 r11 = (defpackage.ff7) r11
            if (r11 == 0) goto Lca
            z66 r11 = r11.a
            if (r11 == 0) goto Lca
            z66 r11 = defpackage.z66.a(r11, r7, r4, r10, r13)
            java.lang.Object r13 = r12.get(r3)
            ff7 r13 = (defpackage.ff7) r13
            if (r13 == 0) goto Lca
            ff7 r10 = defpackage.ff7.b(r13, r11, r10, r5)
            goto Lca
        Lba:
            ff7 r11 = new ff7
            z66 r13 = new z66
            r13.<init>(r7, r4, r10)
            z66 r14 = new z66
            r14.<init>(r10)
            r11.<init>(r13, r14)
            goto L91
        Lca:
            if (r10 == 0) goto Lcf
            r12.put(r3, r10)
        Lcf:
            r17 = 63
            r10 = 0
            r11 = 0
            r16 = r12
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            fk3 r10 = defpackage.fk3.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        Ldd:
            boolean r8 = r1.j(r8, r10)
            if (r8 == 0) goto L41
        Le3:
            r1 = 0
            r0.setShowBackgroundPropertiesDialog(r1)
            return
    }

    public static void g(me.magnum.melonds.ui.layouteditor.b r8, defpackage.oj3 r9, int r10) {
            nb1 r0 = r8.L
            nj3 r1 = r8.w0
            if (r1 != 0) goto L12
            java.lang.Object r1 = r0.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r1 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r1
            nj3 r1 = r1.getSelectedComponent()
            if (r1 != 0) goto L12
            goto Lce
        L12:
            r2 = 1
            r8.q0 = r2
            r3 = -1
            r4 = 0
            if (r9 != 0) goto L1b
            r5 = r3
            goto L23
        L1b:
            int[] r5 = me.magnum.melonds.ui.layouteditor.a.b     // Catch: java.lang.Throwable -> L47
            int r6 = r9.ordinal()     // Catch: java.lang.Throwable -> L47
            r5 = r5[r6]     // Catch: java.lang.Throwable -> L47
        L23:
            if (r5 == r3) goto Lcc
            r3 = 3
            r6 = 2
            if (r5 == r2) goto L6a
            if (r5 == r6) goto L50
            if (r5 != r3) goto L4a
            java.lang.Object r5 = r0.q     // Catch: java.lang.Throwable -> L47
            android.widget.SeekBar r5 = (android.widget.SeekBar) r5     // Catch: java.lang.Throwable -> L47
            int r7 = r8.g0     // Catch: java.lang.Throwable -> L47
            int r10 = r10 - r7
            int r7 = r5.getMax()     // Catch: java.lang.Throwable -> L47
            int r10 = defpackage.gi2.q(r10, r4, r7)     // Catch: java.lang.Throwable -> L47
            r5.setProgress(r10)     // Catch: java.lang.Throwable -> L47
            kl3 r10 = r8.m0     // Catch: java.lang.Throwable -> L47
            il3 r5 = defpackage.il3.HEIGHT     // Catch: java.lang.Throwable -> L47
            r8.q(r10, r5)     // Catch: java.lang.Throwable -> L47
            goto L7c
        L47:
            r9 = move-exception
            goto Ld5
        L4a:
            ug r9 = new ug     // Catch: java.lang.Throwable -> L47
            r9.<init>()     // Catch: java.lang.Throwable -> L47
            throw r9     // Catch: java.lang.Throwable -> L47
        L50:
            java.lang.Object r5 = r0.t     // Catch: java.lang.Throwable -> L47
            android.widget.SeekBar r5 = (android.widget.SeekBar) r5     // Catch: java.lang.Throwable -> L47
            int r7 = r8.g0     // Catch: java.lang.Throwable -> L47
            int r10 = r10 - r7
            int r7 = r5.getMax()     // Catch: java.lang.Throwable -> L47
            int r10 = defpackage.gi2.q(r10, r4, r7)     // Catch: java.lang.Throwable -> L47
            r5.setProgress(r10)     // Catch: java.lang.Throwable -> L47
            kl3 r10 = r8.m0     // Catch: java.lang.Throwable -> L47
            il3 r5 = defpackage.il3.WIDTH     // Catch: java.lang.Throwable -> L47
            r8.q(r10, r5)     // Catch: java.lang.Throwable -> L47
            goto L7c
        L6a:
            java.lang.Object r5 = r0.r     // Catch: java.lang.Throwable -> L47
            android.widget.SeekBar r5 = (android.widget.SeekBar) r5     // Catch: java.lang.Throwable -> L47
            int r7 = r8.g0     // Catch: java.lang.Throwable -> L47
            int r10 = r10 - r7
            int r7 = r5.getMax()     // Catch: java.lang.Throwable -> L47
            int r10 = defpackage.gi2.q(r10, r4, r7)     // Catch: java.lang.Throwable -> L47
            r5.setProgress(r10)     // Catch: java.lang.Throwable -> L47
        L7c:
            r8.q0 = r4
            int[] r10 = me.magnum.melonds.ui.layouteditor.a.b
            int r9 = r9.ordinal()
            r9 = r10[r9]
            if (r9 == r2) goto L9e
            if (r9 == r6) goto L91
            if (r9 != r3) goto L8d
            goto L91
        L8d:
            defpackage.i.d()
            return
        L91:
            java.lang.Object r9 = r0.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r9 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r9
            float r10 = r8.h0
            float r0 = r8.i0
            boolean r9 = r9.r(r1, r10, r0)
            goto Lbd
        L9e:
            java.lang.Object r9 = r0.r
            android.widget.SeekBar r9 = (android.widget.SeekBar) r9
            int r9 = r9.getMax()
            if (r9 >= r2) goto La9
            goto Laa
        La9:
            r2 = r9
        Laa:
            java.lang.Object r9 = r0.r
            android.widget.SeekBar r9 = (android.widget.SeekBar) r9
            int r9 = r9.getProgress()
            float r9 = (float) r9
            float r10 = (float) r2
            float r9 = r9 / r10
            java.lang.Object r10 = r0.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r10 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r10
            boolean r9 = r10.q(r1, r9)
        Lbd:
            if (r9 == 0) goto Lce
            jl3 r9 = r8.d0
            if (r9 == 0) goto Lc8
            s63 r9 = (defpackage.s63) r9
            r9.x()
        Lc8:
            r8.r(r1)
            goto Lce
        Lcc:
            r8.q0 = r4
        Lce:
            r9 = 0
            r8.setShownEditablePropertyDialog(r9)
            r8.w0 = r9
            return
        Ld5:
            r8.q0 = r4
            throw r9
    }

    private final java.util.List<me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a> getMenuOptions() {
            r2 = this;
            kw3 r0 = defpackage.hf.I()
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r1 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.PROPERTIES
            r0.add(r1)
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r1 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.BACKGROUNDS
            r0.add(r1)
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r1 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.REVERT
            r0.add(r1)
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r1 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.RESET
            r0.add(r1)
            yl3 r2 = r2.getViewModel()
            java.util.UUID r1 = r2.f
            if (r1 == 0) goto L2d
            tp6 r2 = r2.i
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L2d
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.SAVE_AS_NEW
            r0.add(r2)
        L2d:
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.SAVE_AND_EXIT
            r0.add(r2)
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a.EXIT_WITHOUT_SAVING
            r0.add(r2)
            kw3 r2 = defpackage.hf.A(r0)
            return r2
    }

    private final boolean getShowBackgroundPropertiesDialog() {
            r0 = this;
            vs4 r0 = r0.s0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    private final boolean getShowLayoutPropertiesDialog() {
            r0 = this;
            vs4 r0 = r0.r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    private final defpackage.oj3 getShownEditablePropertyDialog() {
            r0 = this;
            vs4 r0 = r0.t0
            java.lang.Object r0 = r0.getValue()
            oj3 r0 = (defpackage.oj3) r0
            return r0
    }

    private final defpackage.uj3 getShownPositionDialog() {
            r0 = this;
            vs4 r0 = r0.u0
            java.lang.Object r0 = r0.getValue()
            uj3 r0 = (defpackage.uj3) r0
            return r0
    }

    private final defpackage.yl3 getViewModel() {
            r0 = this;
            ex6 r0 = r0.R
            java.lang.Object r0 = r0.getValue()
            yl3 r0 = (defpackage.yl3) r0
            return r0
    }

    public static void h(me.magnum.melonds.ui.layouteditor.b r11, java.util.List r12, int r13) {
            j37 r0 = r11.y0
            java.lang.Object r12 = r12.get(r13)
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r12 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a) r12
            int[] r13 = me.magnum.melonds.ui.layouteditor.a.d
            int r12 = r12.ordinal()
            r12 = r13[r12]
            r13 = 2131951838(0x7f1300de, float:1.9540102E38)
            r1 = 0
            r2 = 1
            switch(r12) {
                case 1: goto Lda;
                case 2: goto Lcd;
                case 3: goto Lc1;
                case 4: goto L9a;
                case 5: goto L61;
                case 6: goto L2a;
                case 7: goto L1c;
                default: goto L18;
            }
        L18:
            defpackage.i.d()
            return
        L1c:
            jl3 r11 = r11.d0
            if (r11 == 0) goto Lc0
            s63 r11 = (defpackage.s63) r11
            java.lang.Object r11 = r11.B
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r11 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity) r11
            r11.finish()
            return
        L2a:
            yl3 r12 = r11.getViewModel()
            tp6 r12 = r12.i
            java.lang.Object r12 = r12.getValue()
            fk3 r12 = (defpackage.fk3) r12
            if (r12 == 0) goto L3a
            java.lang.String r1 = r12.b
        L3a:
            if (r1 == 0) goto L4d
            int r12 = r1.length()
            if (r12 != 0) goto L43
            goto L4d
        L43:
            jl3 r11 = r11.d0
            if (r11 == 0) goto Lc0
            s63 r11 = (defpackage.s63) r11
            r11.w()
            return
        L4d:
            android.content.res.Resources r12 = r11.getResources()
            java.lang.String r12 = r12.getString(r13)
            r12.getClass()
            dl3 r13 = new dl3
            r13.<init>(r11, r2)
            defpackage.j37.c(r0, r12, r13)
            return
        L61:
            yl3 r12 = r11.getViewModel()
            tp6 r12 = r12.i
            java.lang.Object r12 = r12.getValue()
            fk3 r12 = (defpackage.fk3) r12
            if (r12 == 0) goto L71
            java.lang.String r1 = r12.b
        L71:
            if (r1 == 0) goto L85
            boolean r12 = defpackage.qs6.v0(r1)
            if (r12 == 0) goto L90
            android.content.res.Resources r12 = r11.getResources()
            java.lang.String r1 = r12.getString(r13)
            r1.getClass()
            goto L90
        L85:
            android.content.res.Resources r12 = r11.getResources()
            java.lang.String r1 = r12.getString(r13)
            r1.getClass()
        L90:
            dl3 r12 = new dl3
            r13 = 0
            r12.<init>(r11, r13)
            defpackage.j37.c(r0, r1, r12)
            return
        L9a:
            yl3 r11 = r11.getViewModel()
            tp6 r12 = r11.i
        La0:
            java.lang.Object r11 = r12.getValue()
            r2 = r11
            fk3 r2 = (defpackage.fk3) r2
            if (r2 == 0) goto Lb9
            ck3 r6 = defpackage.ck3.FOLLOW_SYSTEM
            zt1 r9 = defpackage.zt1.A
            r10 = 7
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 50
            fk3 r13 = defpackage.fk3.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto Lba
        Lb9:
            r13 = r1
        Lba:
            boolean r11 = r12.j(r11, r13)
            if (r11 == 0) goto La0
        Lc0:
            return
        Lc1:
            yl3 r11 = r11.getViewModel()
            tp6 r12 = r11.i
            fk3 r11 = r11.g
            r12.l(r11)
            return
        Lcd:
            jl3 r12 = r11.d0
            if (r12 == 0) goto Ld6
            s63 r12 = (defpackage.s63) r12
            r12.x()
        Ld6:
            r11.setShowBackgroundPropertiesDialog(r2)
            return
        Lda:
            jl3 r12 = r11.d0
            if (r12 == 0) goto Le3
            s63 r12 = (defpackage.s63) r12
            r12.x()
        Le3:
            r11.setShowLayoutPropertiesDialog(r2)
            return
    }

    public static void i(me.magnum.melonds.ui.layouteditor.b r1, defpackage.uj3 r2) {
            r2.getClass()
            nj3 r0 = r2.a
            r1.x0 = r0
            r1.setShownPositionDialog(r2)
            return
    }

    public static void j(me.magnum.melonds.ui.layouteditor.b r16, defpackage.px0 r17, int r18) {
            r0 = r16
            r1 = r18 & 3
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == r4) goto Lb
            r1 = r2
            goto Lc
        Lb:
            r1 = r3
        Lc:
            r5 = r18 & 1
            r13 = r17
            xq2 r13 = (defpackage.xq2) r13
            boolean r1 = r13.S(r5, r1)
            if (r1 == 0) goto L29c
            boolean r1 = r0.getShowLayoutPropertiesDialog()
            nb1 r5 = r0.L
            vs0 r15 = defpackage.ox0.a
            r6 = 3
            if (r1 == 0) goto L81
            r1 = -233234850(0xfffffffff2191e5e, float:-3.0328268E30)
            r13.b0(r1)
            yl3 r1 = r0.getViewModel()
            de5 r1 = r1.j
            qa4 r1 = defpackage.nb3.n(r1, r13)
            java.lang.Object r1 = r1.getValue()
            fk3 r1 = (defpackage.fk3) r1
            if (r1 == 0) goto L74
            r7 = -232995282(0xfffffffff21cc62e, float:-3.1052317E30)
            r13.b0(r7)
            boolean r7 = r13.h(r0)
            java.lang.Object r8 = r13.P()
            if (r7 != 0) goto L4d
            if (r8 != r15) goto L55
        L4d:
            yk3 r8 = new yk3
            r8.<init>(r0, r2)
            r13.l0(r8)
        L55:
            on2 r8 = (defpackage.on2) r8
            boolean r7 = r13.h(r0)
            java.lang.Object r9 = r13.P()
            if (r7 != 0) goto L63
            if (r9 != r15) goto L6b
        L63:
            fj r9 = new fj
            r9.<init>(r0, r6)
            r13.l0(r9)
        L6b:
            go2 r9 = (defpackage.go2) r9
            defpackage.kn2.d(r1, r8, r9, r13, r3)
            r13.p(r3)
            goto L7d
        L74:
            r1 = -232424448(0xfffffffff2257c00, float:-3.2777557E30)
            r13.b0(r1)
            r13.p(r3)
        L7d:
            r13.p(r3)
            goto L8a
        L81:
            r1 = -232402624(0xfffffffff225d140, float:-3.2843516E30)
            r13.b0(r1)
            r13.p(r3)
        L8a:
            boolean r1 = r0.getShowBackgroundPropertiesDialog()
            if (r1 == 0) goto L187
            r1 = -232292140(0xfffffffff22780d4, float:-3.3177434E30)
            r13.b0(r1)
            sn3 r1 = r0.A
            int[] r7 = me.magnum.melonds.ui.layouteditor.a.a
            int r1 = r1.ordinal()
            r1 = r7[r1]
            if (r1 == r2) goto Lc6
            if (r1 != r4) goto Lbe
            r1 = 962346271(0x395c3d1f, float:2.1003604E-4)
            r13.b0(r1)
            yl3 r1 = r0.getViewModel()
            ex6 r1 = r1.t
            java.lang.Object r1 = r1.getValue()
            rp6 r1 = (defpackage.rp6) r1
            qa4 r1 = defpackage.nb3.n(r1, r13)
            r13.p(r3)
            goto Ldf
        Lbe:
            r0 = 962338361(0x395c1e39, float:2.0992094E-4)
            ug r0 = defpackage.xg6.f(r13, r0, r3)
            throw r0
        Lc6:
            r1 = 962341887(0x395c2bff, float:2.0997225E-4)
            r13.b0(r1)
            yl3 r1 = r0.getViewModel()
            ex6 r1 = r1.r
            java.lang.Object r1 = r1.getValue()
            rp6 r1 = (defpackage.rp6) r1
            qa4 r1 = defpackage.nb3.n(r1, r13)
            r13.p(r3)
        Ldf:
            java.lang.Object r1 = r1.getValue()
            lj3 r1 = (defpackage.lj3) r1
            if (r1 == 0) goto L179
            r7 = -231801751(0xfffffffff22efc69, float:-3.4659544E30)
            r13.b0(r7)
            java.util.UUID r7 = r1.a
            r8 = r7
            me.magnum.melonds.domain.model.layout.BackgroundMode r7 = r1.b
            boolean r9 = r13.h(r0)
            java.lang.Object r10 = r13.P()
            if (r9 != 0) goto Lfe
            if (r10 != r15) goto L109
        Lfe:
            xd1 r10 = new xd1
            r9 = 0
            r11 = 21
            r10.<init>(r0, r9, r11)
            r13.l0(r10)
        L109:
            eo2 r10 = (defpackage.eo2) r10
            boolean r9 = r13.h(r0)
            boolean r11 = r13.h(r1)
            r9 = r9 | r11
            java.lang.Object r11 = r13.P()
            if (r9 != 0) goto L11c
            if (r11 != r15) goto L126
        L11c:
            ci2 r11 = new ci2
            r9 = 8
            r11.<init>(r9, r0, r1)
            r13.l0(r11)
        L126:
            r9 = r11
            on2 r9 = (defpackage.on2) r9
            boolean r1 = r13.h(r0)
            java.lang.Object r11 = r13.P()
            if (r1 != 0) goto L135
            if (r11 != r15) goto L13d
        L135:
            dl3 r11 = new dl3
            r11.<init>(r0, r4)
            r13.l0(r11)
        L13d:
            qn2 r11 = (defpackage.qn2) r11
            boolean r1 = r13.h(r0)
            java.lang.Object r12 = r13.P()
            if (r1 != 0) goto L14b
            if (r12 != r15) goto L153
        L14b:
            yk3 r12 = new yk3
            r12.<init>(r0, r4)
            r13.l0(r12)
        L153:
            on2 r12 = (defpackage.on2) r12
            boolean r1 = r13.h(r0)
            java.lang.Object r14 = r13.P()
            if (r1 != 0) goto L161
            if (r14 != r15) goto L169
        L161:
            yk3 r14 = new yk3
            r14.<init>(r0, r6)
            r13.l0(r14)
        L169:
            on2 r14 = (defpackage.on2) r14
            r1 = r6
            r6 = r8
            r8 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            r14 = 0
            defpackage.gi2.d(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r13.p(r3)
            goto L183
        L179:
            r1 = r6
            r6 = -230672576(0xfffffffff2403740, float:-3.8072266E30)
            r13.b0(r6)
            r13.p(r3)
        L183:
            r13.p(r3)
            goto L191
        L187:
            r1 = r6
            r6 = -230650752(0xfffffffff2408c80, float:-3.8138225E30)
            r13.b0(r6)
            r13.p(r3)
        L191:
            oj3 r6 = r0.getShownEditablePropertyDialog()
            r7 = -1
            if (r6 != 0) goto L19a
            r8 = r7
            goto L1a2
        L19a:
            int[] r8 = me.magnum.melonds.ui.layouteditor.a.b
            int r9 = r6.ordinal()
            r8 = r8[r9]
        L1a2:
            if (r8 == r7) goto L1d0
            if (r8 == r2) goto L1c5
            if (r8 == r4) goto L1ba
            if (r8 != r1) goto L1b6
            java.lang.Object r8 = r5.q
            android.widget.SeekBar r8 = (android.widget.SeekBar) r8
            int r8 = r8.getProgress()
            int r9 = r0.g0
        L1b4:
            int r8 = r8 + r9
            goto L1d1
        L1b6:
            defpackage.i.d()
            return
        L1ba:
            java.lang.Object r8 = r5.t
            android.widget.SeekBar r8 = (android.widget.SeekBar) r8
            int r8 = r8.getProgress()
            int r9 = r0.g0
            goto L1b4
        L1c5:
            java.lang.Object r8 = r5.r
            android.widget.SeekBar r8 = (android.widget.SeekBar) r8
            int r8 = r8.getProgress()
            int r9 = r0.g0
            goto L1b4
        L1d0:
            r8 = r3
        L1d1:
            int r9 = r0.g0
            if (r6 != 0) goto L1d7
            r10 = r7
            goto L1df
        L1d7:
            int[] r10 = me.magnum.melonds.ui.layouteditor.a.b
            int r11 = r6.ordinal()
            r10 = r10[r11]
        L1df:
            if (r10 == r7) goto L20d
            if (r10 == r2) goto L202
            if (r10 == r4) goto L1f7
            if (r10 != r1) goto L1f3
            java.lang.Object r1 = r5.q
            android.widget.SeekBar r1 = (android.widget.SeekBar) r1
            int r1 = r1.getMax()
            int r2 = r0.g0
        L1f1:
            int r1 = r1 + r2
            goto L20f
        L1f3:
            defpackage.i.d()
            return
        L1f7:
            java.lang.Object r1 = r5.t
            android.widget.SeekBar r1 = (android.widget.SeekBar) r1
            int r1 = r1.getMax()
            int r2 = r0.g0
            goto L1f1
        L202:
            java.lang.Object r1 = r5.r
            android.widget.SeekBar r1 = (android.widget.SeekBar) r1
            int r1 = r1.getMax()
            int r2 = r0.g0
            goto L1f1
        L20d:
            int r1 = r0.g0
        L20f:
            boolean r2 = r13.h(r0)
            if (r6 != 0) goto L216
            goto L21a
        L216:
            int r7 = r6.ordinal()
        L21a:
            boolean r5 = r13.d(r7)
            r2 = r2 | r5
            java.lang.Object r5 = r13.P()
            if (r2 != 0) goto L227
            if (r5 != r15) goto L231
        L227:
            bi2 r5 = new bi2
            r2 = 11
            r5.<init>(r2, r0, r6)
            r13.l0(r5)
        L231:
            r10 = r5
            qn2 r10 = (defpackage.qn2) r10
            boolean r2 = r13.h(r0)
            java.lang.Object r5 = r13.P()
            if (r2 != 0) goto L240
            if (r5 != r15) goto L249
        L240:
            yk3 r5 = new yk3
            r2 = 4
            r5.<init>(r0, r2)
            r13.l0(r5)
        L249:
            r11 = r5
            on2 r11 = (defpackage.on2) r11
            r12 = r13
            r13 = 0
            r7 = r8
            r8 = r9
            r9 = r1
            defpackage.oi2.a(r6, r7, r8, r9, r10, r11, r12, r13)
            r13 = r12
            uj3 r1 = r0.getShownPositionDialog()
            boolean r2 = r13.h(r0)
            java.lang.Object r5 = r13.P()
            if (r2 != 0) goto L265
            if (r5 != r15) goto L26e
        L265:
            yk3 r5 = new yk3
            r2 = 5
            r5.<init>(r0, r2)
            r13.l0(r5)
        L26e:
            on2 r5 = (defpackage.on2) r5
            boolean r2 = r13.h(r0)
            java.lang.Object r6 = r13.P()
            if (r2 != 0) goto L27c
            if (r6 != r15) goto L284
        L27c:
            al3 r6 = new al3
            r6.<init>(r0, r4)
            r13.l0(r6)
        L284:
            eo2 r6 = (defpackage.eo2) r6
            defpackage.ii2.h(r1, r5, r6, r13, r3)
            r1 = 2131952135(0x7f130207, float:1.9540704E38)
            java.lang.String r6 = defpackage.yh2.O(r13, r1)
            j37 r7 = r0.y0
            r11 = 0
            r12 = 12
            r8 = 0
            r9 = 0
            r10 = r13
            defpackage.mp2.e(r6, r7, r8, r9, r10, r11, r12)
            goto L29f
        L29c:
            r13.V()
        L29f:
            return
    }

    public static void k(me.magnum.melonds.ui.layouteditor.b r8, int r9, int r10) {
            nj3 r0 = r8.x0
            r1 = 0
            if (r0 != 0) goto Lf
            uj3 r0 = r8.getShownPositionDialog()
            if (r0 == 0) goto Le
            nj3 r0 = r0.a
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L71
            nb1 r2 = r8.L
            java.lang.Object r2 = r2.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r2 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r2
            java.util.Map r3 = r2.getViews()
            java.lang.Object r3 = r3.get(r0)
            zj3 r3 = (defpackage.zj3) r3
            if (r3 != 0) goto L24
            goto L71
        L24:
            android.view.View r3 = r3.a
            int r4 = r2.getWidth()
            int r5 = r3.getWidth()
            int r4 = r4 - r5
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            int r6 = r2.getHeight()
            int r7 = r3.getHeight()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r5, r6)
            int r9 = defpackage.gi2.q(r9, r5, r4)
            int r10 = defpackage.gi2.q(r10, r5, r6)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            if (r4 == 0) goto L6b
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            r4.leftMargin = r9
            r4.topMargin = r10
            r3.setLayoutParams(r4)
            r9 = 1
            r2.j0 = r9
            r2.p()
            jl3 r9 = r8.d0
            if (r9 == 0) goto L67
            s63 r9 = (defpackage.s63) r9
            r9.x()
        L67:
            r8.r(r0)
            goto L71
        L6b:
            java.lang.String r8 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            defpackage.u34.x(r8)
            return
        L71:
            r8.setShownPositionDialog(r1)
            r8.x0 = r1
            return
    }

    public static void l(me.magnum.melonds.ui.layouteditor.b r1) {
            r0 = 0
            r1.setShowLayoutPropertiesDialog(r0)
            return
    }

    public static void m(me.magnum.melonds.ui.layouteditor.b r4, me.magnum.melonds.domain.model.layout.BackgroundMode r5) {
            r5.getClass()
            yl3 r0 = r4.getViewModel()
            sn3 r4 = r4.A
            r0.getClass()
            r4.getClass()
            int[] r1 = defpackage.sl3.a
            int r4 = r4.ordinal()
            r4 = r1[r4]
            r1 = 0
            r2 = 1
            if (r4 == r2) goto L3a
            r3 = 2
            if (r4 != r3) goto L36
            tp6 r4 = r0.s
        L20:
            java.lang.Object r0 = r4.getValue()
            r3 = r0
            lj3 r3 = (defpackage.lj3) r3
            if (r3 == 0) goto L2e
            lj3 r3 = defpackage.lj3.a(r3, r1, r5, r2)
            goto L2f
        L2e:
            r3 = r1
        L2f:
            boolean r0 = r4.j(r0, r3)
            if (r0 == 0) goto L20
            goto L51
        L36:
            defpackage.i.d()
            return
        L3a:
            tp6 r4 = r0.q
        L3c:
            java.lang.Object r0 = r4.getValue()
            r3 = r0
            lj3 r3 = (defpackage.lj3) r3
            if (r3 == 0) goto L4a
            lj3 r3 = defpackage.lj3.a(r3, r1, r5, r2)
            goto L4b
        L4a:
            r3 = r1
        L4b:
            boolean r0 = r4.j(r0, r3)
            if (r0 == 0) goto L3c
        L51:
            return
    }

    public static void n(me.magnum.melonds.ui.layouteditor.b r1) {
            r0 = 0
            r1.setShownPositionDialog(r0)
            r1.x0 = r0
            return
    }

    public static final /* synthetic */ defpackage.yl3 o(me.magnum.melonds.ui.layouteditor.b r0) {
            yl3 r0 = r0.getViewModel()
            return r0
    }

    private final void setShowBackgroundPropertiesDialog(boolean r1) {
            r0 = this;
            vs4 r0 = r0.s0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            return
    }

    private final void setShowLayoutPropertiesDialog(boolean r1) {
            r0 = this;
            vs4 r0 = r0.r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            return
    }

    private final void setShownEditablePropertyDialog(defpackage.oj3 r1) {
            r0 = this;
            vs4 r0 = r0.t0
            r0.setValue(r1)
            return
    }

    private final void setShownPositionDialog(defpackage.uj3 r1) {
            r0 = this;
            vs4 r0 = r0.u0
            r0.setValue(r1)
            return
    }

    public final defpackage.u66 A() {
            r2 = this;
            u66 r0 = new u66
            boolean r1 = r2.getShowLayoutPropertiesDialog()
            boolean r2 = r2.getShowBackgroundPropertiesDialog()
            r0.<init>(r1, r2)
            return r0
    }

    public final void B(defpackage.zb r3) {
            r2 = this;
            ac r3 = r3.l()
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L19
            r1 = 1003(0x3eb, float:1.406E-42)
            r0.setType(r1)
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            android.os.IBinder r2 = r2.getWindowToken()
            r0.token = r2
        L19:
            r3.show()
            return
    }

    public final void C(defpackage.t26 r9) {
            r8 = this;
            r9.getClass()
            n00 r0 = r9.a
            r1 = 0
            if (r0 == 0) goto Lb
            android.net.Uri r0 = r0.c
            goto Lc
        Lb:
            r0 = r1
        Lc:
            sw4 r3 = r8.B
            r3.getClass()
            sk5 r2 = new sk5
            r2.<init>(r3, r0)
            nb1 r0 = r8.L
            java.lang.Object r0 = r0.e
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            yc1 r7 = new yc1
            r7.<init>(r8, r9)
            ap3 r8 = r2.a
            java.lang.Object r9 = r8.B
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.System.nanoTime()
            java.lang.StringBuilder r0 = defpackage.ck7.a
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            if (r0 != r2) goto Lfa
            if (r9 != 0) goto L57
            r3.a(r4)
            int r8 = defpackage.tw4.e
            r4.setImageDrawable(r1)
            android.graphics.drawable.Drawable r8 = r4.getDrawable()
            boolean r8 = r8 instanceof android.graphics.drawable.Animatable
            if (r8 == 0) goto L56
            android.graphics.drawable.Drawable r8 = r4.getDrawable()
            android.graphics.drawable.Animatable r8 = (android.graphics.drawable.Animatable) r8
            r8.start()
        L56:
            return
        L57:
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.sk5.b
            r0.getAndIncrement()
            java.lang.Object r0 = r8.L
            rw4 r0 = (defpackage.rw4) r0
            if (r0 != 0) goto L66
            rw4 r0 = defpackage.rw4.NORMAL
            r8.L = r0
        L66:
            m44 r5 = new m44
            java.lang.Object r8 = r8.L
            rw4 r8 = (defpackage.rw4) r8
            r5.<init>(r9, r8)
            java.lang.StringBuilder r8 = defpackage.ck7.a
            java.lang.String r9 = r9.toString()
            int r0 = r9.length()
            int r0 = r0 + 50
            r8.ensureCapacity(r0)
            r8.append(r9)
            r9 = 10
            r8.append(r9)
            java.lang.String r6 = r8.toString()
            r9 = 0
            r8.setLength(r9)
            boolean r8 = defpackage.e44.shouldReadFromMemoryCache(r9)
            if (r8 == 0) goto Ldb
            s63 r8 = r3.d
            java.lang.Object r8 = r8.B
            nr1 r8 = (defpackage.nr1) r8
            java.lang.Object r8 = r8.get(r6)
            xz3 r8 = (defpackage.xz3) r8
            if (r8 == 0) goto La5
            android.graphics.Bitmap r8 = r8.a
            goto La6
        La5:
            r8 = r1
        La6:
            pq6 r0 = r3.e
            if (r8 == 0) goto Lb0
            sk1 r0 = r0.b
            r0.sendEmptyMessage(r9)
            goto Lb6
        Lb0:
            sk1 r9 = r0.b
            r0 = 1
            r9.sendEmptyMessage(r0)
        Lb6:
            if (r8 == 0) goto Ldb
            r3.a(r4)
            android.content.Context r9 = r3.b
            qw4 r0 = defpackage.qw4.MEMORY
            int r1 = defpackage.tw4.e
            android.graphics.drawable.Drawable r1 = r4.getDrawable()
            boolean r2 = r1 instanceof android.graphics.drawable.Animatable
            if (r2 == 0) goto Lcf
            r2 = r1
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
            r2.stop()
        Lcf:
            tw4 r2 = new tw4
            r2.<init>(r9, r8, r1, r0)
            r4.setImageDrawable(r2)
            r7.I()
            return
        Ldb:
            int r8 = defpackage.tw4.e
            r4.setImageDrawable(r1)
            android.graphics.drawable.Drawable r8 = r4.getDrawable()
            boolean r8 = r8 instanceof android.graphics.drawable.Animatable
            if (r8 == 0) goto Lf1
            android.graphics.drawable.Drawable r8 = r4.getDrawable()
            android.graphics.drawable.Animatable r8 = (android.graphics.drawable.Animatable) r8
            r8.start()
        Lf1:
            i33 r2 = new i33
            r2.<init>(r3, r4, r5, r6, r7)
            r3.c(r2)
            return
        Lfa:
            java.lang.String r8 = "Method call should happen from the main thread."
            defpackage.i.m(r8)
            return
    }

    public final android.widget.ImageView getImageBackground() {
            r0 = this;
            nb1 r0 = r0.L
            java.lang.Object r0 = r0.e
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            return r0
    }

    public final me.magnum.melonds.ui.layouteditor.LayoutEditorView getLayoutEditorView() {
            r0 = this;
            nb1 r0 = r0.L
            java.lang.Object r0 = r0.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r0 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r0
            return r0
    }

    public final defpackage.jl3 getListener() {
            r0 = this;
            jl3 r0 = r0.d0
            return r0
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            r3.getClass()
            boolean r0 = r1.t(r3)
            if (r0 == 0) goto Lb
            r1 = 1
            return r1
        Lb:
            boolean r1 = super.onKeyDown(r2, r3)
            return r1
    }

    public final void p(boolean r8) {
            r7 = this;
            nb1 r0 = r7.L
            java.lang.Object r1 = r0.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r1 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r1
            java.lang.Object r2 = r0.q
            android.widget.SeekBar r2 = (android.widget.SeekBar) r2
            java.lang.Object r3 = r0.t
            android.widget.SeekBar r3 = (android.widget.SeekBar) r3
            zj3 r1 = r1.h0
            if (r1 == 0) goto Lc6
            boolean r1 = r7.f0
            if (r1 != 0) goto L17
            return
        L17:
            r1 = 1
            if (r8 == 0) goto L1c
            r8 = r1
            goto L1d
        L1c:
            r8 = -1
        L1d:
            int r4 = r3.getMax()
            int r4 = r4 / 40
            if (r4 >= r1) goto L26
            r4 = r1
        L26:
            r7.q0 = r1
            r5 = 0
            int r6 = r3.getProgress()     // Catch: java.lang.Throwable -> L73
            int r4 = r4 * r8
            int r4 = r4 + r6
            int r6 = r3.getMax()     // Catch: java.lang.Throwable -> L73
            int r4 = defpackage.gi2.q(r4, r5, r6)     // Catch: java.lang.Throwable -> L73
            r3.setProgress(r4)     // Catch: java.lang.Throwable -> L73
            int r4 = r3.getProgress()     // Catch: java.lang.Throwable -> L73
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L73
            int r6 = r3.getMax()     // Catch: java.lang.Throwable -> L73
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L73
            float r4 = r4 / r6
            r7.h0 = r4     // Catch: java.lang.Throwable -> L73
            java.lang.Object r4 = r0.z     // Catch: java.lang.Throwable -> L73
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch: java.lang.Throwable -> L73
            int r3 = r3.getMax()     // Catch: java.lang.Throwable -> L73
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L73
            float r6 = r7.h0     // Catch: java.lang.Throwable -> L73
            float r3 = r3 * r6
            int r6 = r7.g0     // Catch: java.lang.Throwable -> L73
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L73
            float r3 = r3 + r6
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L73
            r4.setText(r3)     // Catch: java.lang.Throwable -> L73
            boolean r3 = r7.j0     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L75
            kl3 r3 = r7.m0     // Catch: java.lang.Throwable -> L73
            java.lang.Float r3 = r3.getRatio()     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L75
            kl3 r8 = r7.m0     // Catch: java.lang.Throwable -> L73
            il3 r1 = defpackage.il3.WIDTH     // Catch: java.lang.Throwable -> L73
            r7.q(r8, r1)     // Catch: java.lang.Throwable -> L73
            goto Lb5
        L73:
            r8 = move-exception
            goto Lc3
        L75:
            int r3 = r2.getMax()     // Catch: java.lang.Throwable -> L73
            int r3 = r3 / 40
            if (r3 >= r1) goto L7e
            goto L7f
        L7e:
            r1 = r3
        L7f:
            int r3 = r2.getProgress()     // Catch: java.lang.Throwable -> L73
            int r8 = r8 * r1
            int r8 = r8 + r3
            int r1 = r2.getMax()     // Catch: java.lang.Throwable -> L73
            int r8 = defpackage.gi2.q(r8, r5, r1)     // Catch: java.lang.Throwable -> L73
            r2.setProgress(r8)     // Catch: java.lang.Throwable -> L73
            int r8 = r2.getProgress()     // Catch: java.lang.Throwable -> L73
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L73
            int r1 = r2.getMax()     // Catch: java.lang.Throwable -> L73
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L73
            float r8 = r8 / r1
            r7.i0 = r8     // Catch: java.lang.Throwable -> L73
            java.lang.Object r8 = r0.w     // Catch: java.lang.Throwable -> L73
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch: java.lang.Throwable -> L73
            int r1 = r2.getMax()     // Catch: java.lang.Throwable -> L73
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L73
            float r2 = r7.i0     // Catch: java.lang.Throwable -> L73
            float r1 = r1 * r2
            int r2 = r7.g0     // Catch: java.lang.Throwable -> L73
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L73
            float r1 = r1 + r2
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L73
            r8.setText(r1)     // Catch: java.lang.Throwable -> L73
        Lb5:
            r7.q0 = r5
            java.lang.Object r8 = r0.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r8 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r8
            float r0 = r7.h0
            float r7 = r7.i0
            r8.u(r0, r7)
            return
        Lc3:
            r7.q0 = r5
            throw r8
        Lc6:
            return
    }

    public final void q(defpackage.kl3 r12, defpackage.il3 r13) {
            r11 = this;
            java.lang.Float r0 = r12.getRatio()
            if (r0 == 0) goto L111
            float r0 = r0.floatValue()
            nb1 r1 = r11.L
            java.lang.Object r2 = r1.t
            android.widget.SeekBar r2 = (android.widget.SeekBar) r2
            java.lang.Object r3 = r1.t
            android.widget.SeekBar r3 = (android.widget.SeekBar) r3
            java.lang.Object r4 = r1.q
            android.widget.SeekBar r4 = (android.widget.SeekBar) r4
            int r2 = r2.getMax()
            float r2 = (float) r2
            int r5 = r4.getMax()
            float r5 = (float) r5
            float r2 = r2 / r5
            int[] r5 = me.magnum.melonds.ui.layouteditor.a.e
            int r13 = r13.ordinal()
            r13 = r5[r13]
            r5 = 1
            if (r13 == r5) goto L41
            r5 = 2
            if (r13 != r5) goto L3d
            int r13 = r4.getProgress()
            float r13 = (float) r13
            int r5 = r11.g0
            float r5 = (float) r5
            float r13 = r13 + r5
            float r5 = r13 * r0
            goto L4c
        L3d:
            defpackage.i.d()
            return
        L41:
            int r13 = r3.getProgress()
            float r13 = (float) r13
            int r5 = r11.g0
            float r5 = (float) r5
            float r5 = r5 + r13
            float r13 = r5 / r0
        L4c:
            int r6 = r11.g0
            float r6 = (float) r6
            java.lang.Float r12 = r12.getRatio()
            float r12 = r12.floatValue()
            float r12 = r12 * r6
            int r6 = r11.g0
            float r6 = (float) r6
            int r7 = r3.getMax()
            float r7 = (float) r7
            int r8 = r11.g0
            float r8 = (float) r8
            float r7 = r7 + r8
            int r8 = r4.getMax()
            int r9 = r11.g0
            int r8 = r8 + r9
            float r8 = (float) r8
            float r8 = r8 * r0
            float r7 = java.lang.Math.min(r7, r8)
            int r8 = r4.getMax()
            float r8 = (float) r8
            int r9 = r11.g0
            float r9 = (float) r9
            float r8 = r8 + r9
            int r9 = r3.getMax()
            int r10 = r11.g0
            int r9 = r9 + r10
            float r9 = (float) r9
            float r9 = r9 / r0
            float r8 = java.lang.Math.min(r8, r9)
            int r9 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r9 >= 0) goto L8e
            float r13 = r12 / r0
            r5 = r12
        L8e:
            int r12 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r12 >= 0) goto L95
            float r5 = r6 * r0
            goto L96
        L95:
            r6 = r13
        L96:
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 <= 0) goto La1
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 <= 0) goto La8
            float r8 = r7 / r0
            goto Laa
        La1:
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 <= 0) goto La8
            float r7 = r8 * r0
            goto Laa
        La8:
            r7 = r5
            r8 = r6
        Laa:
            int r12 = r11.g0
            float r12 = (float) r12
            float r7 = r7 - r12
            int r12 = r3.getMax()
            float r12 = (float) r12
            float r7 = r7 / r12
            r12 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            float r0 = defpackage.gi2.p(r7, r12, r13)
            r11.h0 = r0
            int r2 = r3.getMax()
            float r2 = (float) r2
            float r0 = r0 * r2
            int r0 = (int) r0
            r3.setProgress(r0)
            java.lang.Object r0 = r1.z
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r2 = r3.getMax()
            float r2 = (float) r2
            float r3 = r11.h0
            float r2 = r2 * r3
            int r3 = r11.g0
            float r3 = (float) r3
            float r2 = r2 + r3
            int r2 = (int) r2
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.setText(r2)
            int r0 = r11.g0
            float r0 = (float) r0
            float r8 = r8 - r0
            int r0 = r4.getMax()
            float r0 = (float) r0
            float r8 = r8 / r0
            float r12 = defpackage.gi2.p(r8, r12, r13)
            r11.i0 = r12
            int r13 = r4.getMax()
            float r13 = (float) r13
            float r12 = r12 * r13
            int r12 = (int) r12
            r4.setProgress(r12)
            java.lang.Object r12 = r1.w
            android.widget.TextView r12 = (android.widget.TextView) r12
            int r13 = r4.getMax()
            float r13 = (float) r13
            float r0 = r11.i0
            float r13 = r13 * r0
            int r11 = r11.g0
            float r11 = (float) r11
            float r13 = r13 + r11
            int r11 = (int) r13
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r12.setText(r11)
        L111:
            return
    }

    public final void r(defpackage.nj3 r4) {
            r3 = this;
            nb1 r0 = r3.L
            java.lang.Object r0 = r0.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r0 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r0
            java.util.Map r1 = r0.getViews()
            java.lang.Object r4 = r1.get(r4)
            zj3 r4 = (defpackage.zj3) r4
            if (r4 == 0) goto L28
            zj3 r1 = r0.h0
            if (r4 == r1) goto L28
            android.view.View r1 = r4.a
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r2)
            r1 = 0
            r4.c(r1)
            qn2 r1 = r0.d0
            if (r1 == 0) goto L28
            r1.g(r4)
        L28:
            r0.n()
            r4 = 1
            r3.u(r4)
            return
    }

    public final void s() {
            r1 = this;
            boolean r0 = r1.f0
            if (r0 == 0) goto L9
            r0 = 1
            r1.u(r0)
            return
        L9:
            r1.x()
            return
    }

    public final void setListener(defpackage.jl3 r1) {
            r0 = this;
            r0.d0 = r1
            return
    }

    public final boolean t(android.view.KeyEvent r9) {
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            if (r0 == 0) goto L8
            goto L34
        L8:
            boolean r0 = r8.v()
            if (r0 == 0) goto Lf
            goto L34
        Lf:
            nb1 r0 = r8.L
            java.lang.Object r2 = r0.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r2 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r2
            int r3 = r9.getKeyCode()
            r4 = 66
            r5 = 1
            if (r3 == r4) goto L98
            r4 = 82
            if (r3 == r4) goto L94
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L94
            r4 = 96
            if (r3 == r4) goto L98
            r4 = 97
            if (r3 == r4) goto L88
            switch(r3) {
                case 19: goto L47;
                case 20: goto L47;
                case 21: goto L47;
                case 22: goto L47;
                case 23: goto L98;
                default: goto L31;
            }
        L31:
            switch(r3) {
                case 102: goto L42;
                case 103: goto L3d;
                case 104: goto L39;
                case 105: goto L35;
                default: goto L34;
            }
        L34:
            return r1
        L35:
            r8.p(r5)
            return r5
        L39:
            r8.p(r1)
            return r5
        L3d:
            boolean r8 = r2.l(r5)
            return r8
        L42:
            boolean r8 = r2.l(r1)
            return r8
        L47:
            zj3 r8 = r2.h0
            if (r8 == 0) goto L84
            if (r8 != 0) goto L4e
            goto L71
        L4e:
            int r0 = r2.getWidth()
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            r3 = 1077936128(0x40400000, float:3.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 >= 0) goto L5d
            r0 = r3
        L5d:
            int r4 = r2.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r1
            int r1 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r1 >= 0) goto L68
            goto L69
        L68:
            r3 = r4
        L69:
            int r9 = r9.getKeyCode()
            r1 = 0
            switch(r9) {
                case 19: goto L7f;
                case 20: goto L7b;
                case 21: goto L76;
                case 22: goto L72;
                default: goto L71;
            }
        L71:
            return r5
        L72:
            r2.o(r8, r0, r1)
            return r5
        L76:
            float r9 = -r0
            r2.o(r8, r9, r1)
            return r5
        L7b:
            r2.o(r8, r1, r3)
            return r5
        L7f:
            float r9 = -r3
            r2.o(r8, r1, r9)
            return r5
        L84:
            r2.l(r5)
            return r5
        L88:
            zj3 r9 = r2.h0
            if (r9 == 0) goto L90
            r2.n()
            return r5
        L90:
            r8.s()
            return r5
        L94:
            r8.x()
            return r5
        L98:
            zj3 r9 = r2.h0
            if (r9 == 0) goto L12c
            java.lang.Object r9 = r0.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r9 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r9
            zj3 r0 = r9.h0
            if (r0 == 0) goto L12b
            r0 = 2131952101(0x7f1301e5, float:1.9540635E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 2131952113(0x7f1301f1, float:1.954066E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2131951768(0x7f130098, float:1.953996E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2131951769(0x7f130099, float:1.9539962E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 2131951851(0x7f1300eb, float:1.9540128E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r2, r3, r4, r6}
            java.util.List r0 = defpackage.hf.c0(r0)
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            android.content.Context r3 = r8.getContext()
            r4 = 2132017163(0x7f14000b, float:1.9672597E38)
            r2.<init>(r3, r4)
            zb r3 = new zb
            r3.<init>(r2)
            r2 = 2131951924(0x7f130134, float:1.9540276E38)
            r3.z(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.ht0.v0(r0, r4)
            r2.<init>(r4)
            java.util.Iterator r4 = r0.iterator()
        Lf5:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L111
            java.lang.Object r6 = r4.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            android.content.res.Resources r7 = r8.getResources()
            java.lang.String r6 = r7.getString(r6)
            r2.add(r6)
            goto Lf5
        L111:
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            qu1 r2 = new qu1
            r2.<init>(r0, r8, r9, r5)
            r3.v(r1, r2)
            r9 = 2131951750(0x7f130086, float:1.9539923E38)
            r0 = 0
            r3.x(r9, r0)
            r8.B(r3)
        L12b:
            return r5
        L12c:
            r8.w()
            return r5
    }

    public final void u(boolean r3) {
            r2 = this;
            boolean r0 = r2.f0
            if (r0 != 0) goto L5
            return
        L5:
            nb1 r0 = r2.L
            java.lang.Object r1 = r0.k
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            java.lang.Object r0 = r0.k
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.cancel()
            r1 = 0
            if (r3 == 0) goto L22
            cl3 r3 = new cl3
            r3.<init>(r2, r1)
            r0.post(r3)
            goto L2e
        L22:
            int r3 = r0.getBottom()
            float r3 = (float) r3
            r0.setY(r3)
            r3 = 4
            r0.setVisibility(r3)
        L2e:
            r2.f0 = r1
            return
    }

    public final boolean v() {
            r1 = this;
            oj3 r0 = r1.getShownEditablePropertyDialog()
            if (r0 != 0) goto Lf
            uj3 r1 = r1.getShownPositionDialog()
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final void w() {
            r9 = this;
            nb1 r0 = r9.L
            java.lang.Object r1 = r0.i
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 0
            r1.setVisibility(r2)
            r1 = 1
            r9.e0 = r1
            t52 r3 = defpackage.nj3.getEntries()
            java.util.List r3 = defpackage.gt0.k1(r3)
            java.lang.Object r0 = r0.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r0 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r0
            java.util.List r0 = r0.getInstantiatedComponents()
            int r4 = r3.size()
            boolean[] r5 = new boolean[r4]
            r6 = r2
        L24:
            if (r6 >= r4) goto L33
            java.lang.Object r7 = r3.get(r6)
            boolean r7 = r0.contains(r7)
            r5[r6] = r7
            int r6 = r6 + 1
            goto L24
        L33:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r4 = r9.getContext()
            r6 = 2132017163(0x7f14000b, float:1.9672597E38)
            r0.<init>(r4, r6)
            zb r4 = new zb
            r4.<init>(r0)
            r0 = 2131951817(0x7f1300c9, float:1.954006E38)
            r4.z(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.ht0.v0(r3, r6)
            r0.<init>(r6)
            java.util.Iterator r6 = r3.iterator()
        L59:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L75
            java.lang.Object r7 = r6.next()
            nj3 r7 = (defpackage.nj3) r7
            android.content.res.Resources r8 = r9.getResources()
            int r7 = defpackage.xk2.n(r7)
            java.lang.String r7 = r8.getString(r7)
            r0.add(r7)
            goto L59
        L75:
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            bl3 r2 = new bl3
            r2.<init>(r3, r9)
            java.lang.Object r3 = r4.L
            wb r3 = (defpackage.wb) r3
            r3.q = r0
            r3.z = r2
            r3.v = r5
            r3.w = r1
            r0 = 2131952357(0x7f1302e5, float:1.9541154E38)
            r1 = 0
            r4.y(r0, r1)
            r9.B(r4)
            return
    }

    public final void x() {
            r6 = this;
            jl3 r0 = r6.d0
            if (r0 == 0) goto L9
            s63 r0 = (defpackage.s63) r0
            r0.x()
        L9:
            java.util.List r0 = r6.getMenuOptions()
            int r1 = r0.size()
            java.lang.String[] r2 = new java.lang.String[r1]
            r3 = 0
        L14:
            if (r3 >= r1) goto L2d
            android.content.res.Resources r4 = r6.getResources()
            java.lang.Object r5 = r0.get(r3)
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity$a r5 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.a) r5
            int r5 = r5.getStringRes()
            java.lang.String r4 = r4.getString(r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L14
        L2d:
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            android.content.Context r3 = r6.getContext()
            r4 = 2132017163(0x7f14000b, float:1.9672597E38)
            r1.<init>(r3, r4)
            zb r3 = new zb
            r3.<init>(r1)
            r1 = 2131952208(0x7f130250, float:1.9540852E38)
            r3.z(r1)
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
            nu1 r1 = new nu1
            r4 = 2
            r1.<init>(r4, r6, r0)
            r3.v(r2, r1)
            r0 = 2131951750(0x7f130086, float:1.9539923E38)
            r1 = 0
            r3.x(r0, r1)
            r6.B(r3)
            return
    }

    public final void y() {
            r4 = this;
            nj3 r0 = r4.v0
            nb1 r1 = r4.L
            if (r0 != 0) goto Le
            java.lang.Object r0 = r1.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r0 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r0
            nj3 r0 = r0.getSelectedComponent()
        Le:
            r2 = 0
            r4.v0 = r2
            if (r0 != 0) goto L14
            goto L2b
        L14:
            java.lang.Object r1 = r1.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r1 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r1
            java.util.Map r3 = r1.getViews()
            java.lang.Object r3 = r3.get(r0)
            zj3 r3 = (defpackage.zj3) r3
            if (r3 != 0) goto L25
            goto L29
        L25:
            uj3 r2 = r1.i(r3)
        L29:
            if (r2 != 0) goto L2c
        L2b:
            return
        L2c:
            r4.x0 = r0
            r4.setShownPositionDialog(r2)
            return
    }

    public final void z(defpackage.oj3 r3) {
            r2 = this;
            nj3 r0 = r2.v0
            if (r0 != 0) goto Le
            nb1 r0 = r2.L
            java.lang.Object r0 = r0.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r0 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r0
            nj3 r0 = r0.getSelectedComponent()
        Le:
            r1 = 0
            r2.v0 = r1
            if (r0 != 0) goto L14
            return
        L14:
            r2.w0 = r0
            r2.setShownEditablePropertyDialog(r3)
            return
    }
}
