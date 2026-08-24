package me.magnum.melonds.ui.emulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RuntimeLayoutView extends defpackage.un3 implements defpackage.kr2 {
    public defpackage.mt R;
    public final boolean d0;
    public defpackage.u87 e0;
    public defpackage.w26 f0;
    public defpackage.fn2 g0;
    public defpackage.s03 h0;
    public boolean i0;
    public boolean j0;
    public defpackage.oz0 k0;
    public boolean l0;

    public RuntimeLayoutView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1, r2)
            boolean r1 = r0.isInEditMode()
            r2 = 1
            if (r1 != 0) goto L27
            boolean r1 = r0.d0
            if (r1 != 0) goto L27
            r0.d0 = r2
            java.lang.Object r1 = r0.c()
            z26 r1 = (defpackage.z26) r1
            tb1 r1 = (defpackage.tb1) r1
            sb1 r1 = r1.a
            m55 r1 = r1.R
            java.lang.Object r1 = r1.get()
            u87 r1 = (defpackage.u87) r1
            r0.e0 = r1
        L27:
            r0.i0 = r2
            nz0 r1 = defpackage.nz0.a
            r0.k0 = r1
            r0.setMotionEventSplittingEnabled(r2)
            r0.l0 = r2
            return
    }

    @Override // defpackage.jr2
    public final java.lang.Object c() {
            r1 = this;
            mt r0 = r1.R
            if (r0 != 0) goto Lb
            mt r0 = new mt
            r0.<init>(r1)
            r1.R = r0
        Lb:
            mt r1 = r1.R
            java.lang.Object r1 = r1.c()
            return r1
    }

    public final void g(int r6, boolean r7) {
            r5 = this;
            if (r7 != 0) goto L3
            goto L4f
        L3:
            int r7 = r5.getHeight()
            java.util.List r5 = r5.getLayoutComponentViews()
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r5.next()
            zj3 r0 = (defpackage.zj3) r0
            nj3 r1 = r0.b
            boolean r1 = r1.isScreen()
            if (r1 != 0) goto Lf
            android.view.View r0 = r0.a
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r2 == 0) goto L30
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            goto L31
        L30:
            r1 = 0
        L31:
            if (r1 == 0) goto Lf
            if (r7 <= 0) goto L3c
            int r2 = r1.height
            int r2 = r7 - r2
            int r2 = r2 + (-4)
            goto L3f
        L3c:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L3f:
            int r3 = r1.topMargin
            int r4 = r3 + r6
            if (r4 <= r2) goto L46
            goto L47
        L46:
            r2 = r4
        L47:
            if (r2 == r3) goto Lf
            r1.topMargin = r2
            r0.setLayoutParams(r1)
            goto Lf
        L4f:
            return
    }

    public final defpackage.u87 getTouchVibrator() {
            r0 = this;
            u87 r0 = r0.e0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "touchVibrator"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    public final void h(defpackage.nj3 r2, boolean r3) {
            r1 = this;
            r2.getClass()
            zj3 r1 = r1.d(r2)
            r2 = 0
            if (r1 == 0) goto Ld
            android.view.View r1 = r1.a
            goto Le
        Ld:
            r1 = r2
        Le:
            boolean r0 = r1 instanceof defpackage.w64
            if (r0 == 0) goto L15
            r2 = r1
            w64 r2 = (defpackage.w64) r2
        L15:
            if (r2 == 0) goto L1a
            r2.setToggleState(r3)
        L1a:
            return
    }

    public final void i() {
            r8 = this;
            w26 r0 = r8.f0
            r1 = 8
            if (r0 != 0) goto La
            r8.setVisibility(r1)
            return
        La:
            r2 = 0
            r8.setVisibility(r2)
            int r2 = r0.b
            float r2 = (float) r2
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            boolean r0 = r0.c
            s03 r3 = r8.h0
            if (r3 == 0) goto Lcf
            nj3 r4 = defpackage.nj3.DPAD
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L32
            android.view.View r4 = r4.a
            if (r4 == 0) goto L32
            vm1 r5 = new vm1
            u87 r6 = r8.getTouchVibrator()
            r5.<init>(r3, r0, r6)
            r4.setOnTouchListener(r5)
        L32:
            nj3 r4 = defpackage.nj3.BUTTONS
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L4d
            android.view.View r4 = r4.a
            if (r4 == 0) goto L4d
            o90 r5 = new o90
            u87 r6 = r8.getTouchVibrator()
            r6.getClass()
            r5.<init>(r3, r0, r6)
            r4.setOnTouchListener(r5)
        L4d:
            nj3 r4 = defpackage.nj3.BUTTON_L
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L67
            android.view.View r4 = r4.a
            if (r4 == 0) goto L67
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.L
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        L67:
            nj3 r4 = defpackage.nj3.BUTTON_R
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L81
            android.view.View r4 = r4.a
            if (r4 == 0) goto L81
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.R
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        L81:
            nj3 r4 = defpackage.nj3.BUTTON_SELECT
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L9b
            android.view.View r4 = r4.a
            if (r4 == 0) goto L9b
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.SELECT
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        L9b:
            nj3 r4 = defpackage.nj3.BUTTON_START
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto Lb5
            android.view.View r4 = r4.a
            if (r4 == 0) goto Lb5
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.START
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        Lb5:
            nj3 r4 = defpackage.nj3.BUTTON_HINGE
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto Lcf
            android.view.View r4 = r4.a
            if (r4 == 0) goto Lcf
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.HINGE
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        Lcf:
            fn2 r3 = r8.g0
            if (r3 == 0) goto L1f1
            nj3 r4 = defpackage.nj3.BUTTON_RESET
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto Led
            android.view.View r4 = r4.a
            if (r4 == 0) goto Led
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.RESET
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        Led:
            nj3 r4 = defpackage.nj3.BUTTON_PAUSE
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L107
            android.view.View r4 = r4.a
            if (r4 == 0) goto L107
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.PAUSE
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        L107:
            nj3 r4 = defpackage.nj3.BUTTON_FAST_FORWARD_TOGGLE
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L121
            android.view.View r4 = r4.a
            if (r4 == 0) goto L121
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.FAST_FORWARD
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        L121:
            nj3 r4 = defpackage.nj3.BUTTON_MICROPHONE_TOGGLE
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L13b
            android.view.View r4 = r4.a
            if (r4 == 0) goto L13b
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.MICROPHONE
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        L13b:
            nj3 r4 = defpackage.nj3.BUTTON_TOGGLE_SOFT_INPUT
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L155
            android.view.View r4 = r4.a
            if (r4 == 0) goto L155
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.TOGGLE_SOFT_INPUT
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        L155:
            nj3 r4 = defpackage.nj3.BUTTON_SWAP_SCREENS
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L16f
            android.view.View r4 = r4.a
            if (r4 == 0) goto L16f
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.SWAP_SCREENS
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        L16f:
            nj3 r4 = defpackage.nj3.BUTTON_QUICK_SAVE
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L189
            android.view.View r4 = r4.a
            if (r4 == 0) goto L189
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.QUICK_SAVE
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        L189:
            nj3 r4 = defpackage.nj3.BUTTON_QUICK_LOAD
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L1a3
            android.view.View r4 = r4.a
            if (r4 == 0) goto L1a3
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.QUICK_LOAD
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        L1a3:
            nj3 r4 = defpackage.nj3.BUTTON_REWIND
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L1bd
            android.view.View r4 = r4.a
            if (r4 == 0) goto L1bd
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.REWIND
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        L1bd:
            nj3 r4 = defpackage.nj3.BUTTON_TRANSLATE
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L1d7
            android.view.View r4 = r4.a
            if (r4 == 0) goto L1d7
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.TRANSLATE
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        L1d7:
            nj3 r4 = defpackage.nj3.BUTTON_TOGGLE_EXTRA_BUTTONS
            zj3 r4 = r8.d(r4)
            if (r4 == 0) goto L1f1
            android.view.View r4 = r4.a
            if (r4 == 0) goto L1f1
            gi6 r5 = new gi6
            b63 r6 = defpackage.b63.TOGGLE_EXTRA_BUTTONS
            u87 r7 = r8.getTouchVibrator()
            r5.<init>(r3, r6, r0, r7)
            r4.setOnTouchListener(r5)
        L1f1:
            java.util.List r0 = r8.getLayoutComponentViews()
            java.util.Iterator r0 = r0.iterator()
        L1f9:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L21b
            java.lang.Object r3 = r0.next()
            zj3 r3 = (defpackage.zj3) r3
            nj3 r4 = r3.b
            android.view.View r3 = r3.a
            nj3 r5 = defpackage.nj3.BUTTON_TRANSLATE
            if (r4 != r5) goto L211
            r3.setVisibility(r1)
            goto L1f9
        L211:
            boolean r4 = r4.isScreen()
            if (r4 != 0) goto L1f9
            r3.setAlpha(r2)
            goto L1f9
        L21b:
            r8.j()
            return
    }

    public final void j() {
            r5 = this;
            boolean r0 = r5.j0
            if (r0 == 0) goto Le
            nj3 r0 = defpackage.nj3.TOP_SCREEN
            nj3 r1 = defpackage.nj3.BOTTOM_SCREEN
            vr4 r2 = new vr4
            r2.<init>(r0, r1)
            goto L17
        Le:
            nj3 r0 = defpackage.nj3.BOTTOM_SCREEN
            nj3 r1 = defpackage.nj3.TOP_SCREEN
            vr4 r2 = new vr4
            r2.<init>(r0, r1)
        L17:
            java.lang.Object r0 = r2.A
            nj3 r0 = (defpackage.nj3) r0
            java.lang.Object r1 = r2.B
            nj3 r1 = (defpackage.nj3) r1
            s03 r2 = r5.h0
            if (r2 == 0) goto L4b
            zj3 r0 = r5.d(r0)
            if (r0 == 0) goto L36
            android.view.View r0 = r0.a
            if (r0 == 0) goto L36
            p03 r3 = new p03
            r4 = 1
            r3.<init>(r2, r4)
            r0.setOnTouchListener(r3)
        L36:
            nj3 r0 = defpackage.nj3.HYBRID_SCREEN
            zj3 r0 = r5.d(r0)
            if (r0 == 0) goto L4b
            android.view.View r0 = r0.a
            if (r0 == 0) goto L4b
            p03 r3 = new p03
            r4 = 0
            r3.<init>(r2, r4)
            r0.setOnTouchListener(r3)
        L4b:
            zj3 r5 = r5.d(r1)
            if (r5 == 0) goto L59
            android.view.View r5 = r5.a
            if (r5 == 0) goto L59
            r0 = 0
            r5.setOnTouchListener(r0)
        L59:
            return
    }

    public final void k() {
            r7 = this;
            oz0 r0 = r7.k0
            w26 r1 = r7.f0
            if (r1 == 0) goto L9
            um6 r1 = r1.a
            goto La
        L9:
            r1 = 0
        La:
            r2 = -1
            if (r1 != 0) goto Lf
            r1 = r2
            goto L17
        Lf:
            int[] r3 = defpackage.y26.a
            int r1 = r1.ordinal()
            r1 = r3[r1]
        L17:
            nz0 r3 = defpackage.nz0.a
            yt1 r4 = defpackage.yt1.A
            if (r1 == r2) goto L8e
            r2 = 1
            if (r1 == r2) goto Lad
            r2 = 2
            if (r1 == r2) goto L8e
            r2 = 3
            if (r1 == r2) goto L37
            r0 = 4
            if (r1 != r0) goto L33
            t52 r0 = defpackage.nj3.getEntries()
            java.util.List r4 = defpackage.gt0.k1(r0)
            goto Lad
        L33:
            defpackage.i.d()
            return
        L37:
            boolean r1 = defpackage.nb3.k(r0, r3)
            if (r1 == 0) goto L3f
            goto Lad
        L3f:
            boolean r1 = r0 instanceof defpackage.mz0
            if (r1 == 0) goto L8a
            t52 r1 = defpackage.nj3.getEntries()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L50:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r1.next()
            r3 = r2
            nj3 r3 = (defpackage.nj3) r3
            java.util.List r3 = r3.getMatchingInputs()
            if (r3 == 0) goto L6a
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L6a
            goto L86
        L6a:
            java.util.Iterator r3 = r3.iterator()
        L6e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L86
            java.lang.Object r5 = r3.next()
            b63 r5 = (defpackage.b63) r5
            r6 = r0
            mz0 r6 = (defpackage.mz0) r6
            java.util.ArrayList r6 = r6.a
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L6e
            goto L50
        L86:
            r4.add(r2)
            goto L50
        L8a:
            defpackage.i.d()
            return
        L8e:
            boolean r1 = defpackage.nb3.k(r0, r3)
            if (r1 == 0) goto L95
            goto Lad
        L95:
            boolean r0 = r0 instanceof defpackage.mz0
            if (r0 == 0) goto L159
            nj3 r1 = defpackage.nj3.BUTTONS
            nj3 r2 = defpackage.nj3.DPAD
            nj3 r3 = defpackage.nj3.BUTTON_L
            nj3 r4 = defpackage.nj3.BUTTON_R
            nj3 r5 = defpackage.nj3.BUTTON_START
            nj3 r6 = defpackage.nj3.BUTTON_SELECT
            nj3[] r0 = new defpackage.nj3[]{r1, r2, r3, r4, r5, r6}
            java.util.List r4 = defpackage.hf.c0(r0)
        Lad:
            boolean r0 = r7.i0
            if (r0 != 0) goto Lea
            nj3 r0 = defpackage.nj3.BUTTON_TOGGLE_SOFT_INPUT
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto Lc3
            t52 r0 = defpackage.nj3.getEntries()
            java.util.List r0 = defpackage.gt0.k1(r0)
            r4 = r0
            goto Lea
        Lc3:
            t52 r0 = defpackage.nj3.getEntries()
            java.util.List r0 = defpackage.gt0.k1(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld4:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Le9
            java.lang.Object r2 = r0.next()
            r3 = r2
            nj3 r3 = (defpackage.nj3) r3
            nj3 r4 = defpackage.nj3.BUTTON_TOGGLE_SOFT_INPUT
            if (r3 == r4) goto Ld4
            r1.add(r2)
            goto Ld4
        Le9:
            r4 = r1
        Lea:
            t52 r0 = defpackage.nj3.getEntries()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L10e
            java.lang.Object r2 = r0.next()
            r3 = r2
            nj3 r3 = (defpackage.nj3) r3
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto Lf7
            r1.add(r2)
            goto Lf7
        L10e:
            java.util.Iterator r0 = r4.iterator()
        L112:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L134
            java.lang.Object r2 = r0.next()
            nj3 r2 = (defpackage.nj3) r2
            boolean r3 = r2.isScreen()
            if (r3 != 0) goto L112
            zj3 r2 = r7.d(r2)
            if (r2 == 0) goto L112
            android.view.View r2 = r2.a
            if (r2 == 0) goto L112
            r3 = 8
            r2.setVisibility(r3)
            goto L112
        L134:
            int r0 = r1.size()
            r2 = 0
            r3 = r2
        L13a:
            if (r3 >= r0) goto L158
            java.lang.Object r4 = r1.get(r3)
            int r3 = r3 + 1
            nj3 r4 = (defpackage.nj3) r4
            boolean r5 = r4.isScreen()
            if (r5 != 0) goto L13a
            zj3 r4 = r7.d(r4)
            if (r4 == 0) goto L13a
            android.view.View r4 = r4.a
            if (r4 == 0) goto L13a
            r4.setVisibility(r2)
            goto L13a
        L158:
            return
        L159:
            defpackage.i.d()
            return
    }

    public final void setConnectedControllersState(defpackage.oz0 r1) {
            r0 = this;
            r1.getClass()
            r0.k0 = r1
            r0.k()
            return
    }

    public final void setFrontendInputHandler(defpackage.fn2 r1) {
            r0 = this;
            r1.getClass()
            r0.g0 = r1
            r0.i()
            return
    }

    public final void setSystemInputHandler(defpackage.s03 r1) {
            r0 = this;
            r1.getClass()
            r0.h0 = r1
            r0.i()
            return
    }

    public final void setTouchVibrator(defpackage.u87 r1) {
            r0 = this;
            r1.getClass()
            r0.e0 = r1
            return
    }
}
