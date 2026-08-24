package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c92  reason: default package */
/* loaded from: classes.dex */
public final class c92 extends android.app.Presentation {
    public static final /* synthetic */ int f0 = 0;
    public final defpackage.om2 A;
    public boolean B;
    public final me.magnum.melonds.ui.emulator.RuntimeLayoutView L;
    public final android.view.View R;
    public final defpackage.vs4 X;
    public final defpackage.c91 Y;
    public final me.magnum.melonds.ui.emulator.EmulatorSurfaceView Z;
    public defpackage.t26 d0;
    public defpackage.b36 e0;

    public c92(me.magnum.melonds.ui.emulator.EmulatorActivity r9, android.view.Display r10, defpackage.om2 r11, boolean r12) {
            r8 = this;
            r11.getClass()
            r8.<init>(r9, r10)
            r8.A = r11
            r8.B = r12
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r10 = new me.magnum.melonds.ui.emulator.RuntimeLayoutView
            r12 = 0
            r10.<init>(r9, r12)
            r8.L = r10
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r9)
            android.view.View r1 = new android.view.View
            r1.<init>(r9)
            r8.R = r1
            vs4 r2 = defpackage.np2.Y(r12)
            r8.X = r2
            androidx.compose.ui.platform.ComposeView r2 = new androidx.compose.ui.platform.ComposeView
            r3 = 6
            r2.<init>(r9, r12, r3)
            android.view.Window r3 = r8.getWindow()
            if (r3 == 0) goto L35
            r4 = 40
            r3.setFlags(r4, r4)
        L35:
            al0 r3 = new al0
            r4 = 2
            r3.<init>(r8, r4)
            r0.addOnLayoutChangeListener(r3)
            r10.addOnLayoutChangeListener(r3)
            c91 r3 = new c91
            r3.<init>(r9)
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r4 = new me.magnum.melonds.ui.emulator.EmulatorSurfaceView
            android.content.Context r5 = r8.getContext()
            r5.getClass()
            r4.<init>(r5, r12)
            r4.setRenderer(r3)
            r12 = 0
            r4.setFocusable(r12)
            r4.setFocusableInTouchMode(r12)
            r8.Z = r4
            r8.Y = r3
            b36 r3 = r8.e0
            fx1 r5 = r4.f0
            r6 = 1
            if (r5 == 0) goto L75
            c91 r5 = (defpackage.c91) r5
            java.lang.Object r7 = r5.b
            monitor-enter(r7)
            r5.c = r3     // Catch: java.lang.Throwable -> L72
            r5.d = r6     // Catch: java.lang.Throwable -> L72
            monitor-exit(r7)
            goto L75
        L72:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L75:
            r0.addView(r4)
            r0.addView(r10)
            r0.addView(r1)
            r0.addView(r2)
            vs0 r10 = defpackage.vs0.y0
            r2.setViewCompositionStrategy(r10)
            a92 r10 = new a92
            r10.<init>(r8, r12)
            zv0 r12 = new zv0
            r3 = -1002894128(0xffffffffc4390cd0, float:-740.2002)
            r12.<init>(r3, r6, r10)
            r2.setContent(r12)
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setBackgroundColor(r10)
            r10 = 1058642330(0x3f19999a, float:0.6)
            r1.setAlpha(r10)
            r10 = 8
            r1.setVisibility(r10)
            b92 r10 = new b92
            r10.<init>()
            r1.setOnClickListener(r10)
            r11.c(r4)
            r10 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            r0.setTag(r10, r9)
            android.view.Window r11 = r8.getWindow()
            if (r11 == 0) goto Lc6
            android.view.View r11 = r11.getDecorView()
            if (r11 == 0) goto Lc6
            r11.setTag(r10, r9)
        Lc6:
            r10 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            r0.setTag(r10, r9)
            android.view.Window r11 = r8.getWindow()
            if (r11 == 0) goto Ldb
            android.view.View r11 = r11.getDecorView()
            if (r11 == 0) goto Ldb
            r11.setTag(r10, r9)
        Ldb:
            r10 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            r0.setTag(r10, r9)
            android.view.Window r11 = r8.getWindow()
            if (r11 == 0) goto Lf0
            android.view.View r11 = r11.getDecorView()
            if (r11 == 0) goto Lf0
            r11.setTag(r10, r9)
        Lf0:
            r8.setContentView(r0)
            return
    }

    public final void a(defpackage.zv0 r1) {
            r0 = this;
            vs4 r0 = r0.X
            r0.setValue(r1)
            return
    }

    public final void b() {
            r36 = this;
            r0 = r36
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r1 = r0.L
            boolean r2 = r1.j0
            if (r2 == 0) goto L12
            nj3 r2 = defpackage.nj3.BOTTOM_SCREEN
            nj3 r3 = defpackage.nj3.TOP_SCREEN
            vr4 r4 = new vr4
            r4.<init>(r2, r3)
            goto L1b
        L12:
            nj3 r2 = defpackage.nj3.TOP_SCREEN
            nj3 r3 = defpackage.nj3.BOTTOM_SCREEN
            vr4 r4 = new vr4
            r4.<init>(r2, r3)
        L1b:
            java.lang.Object r2 = r4.A
            nj3 r2 = (defpackage.nj3) r2
            java.lang.Object r3 = r4.B
            nj3 r3 = (defpackage.nj3) r3
            zj3 r2 = r1.d(r2)
            zj3 r3 = r1.d(r3)
            nj3 r4 = defpackage.nj3.HYBRID_SCREEN
            zj3 r4 = r1.d(r4)
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L75
            me.magnum.melonds.domain.model.Rect r7 = r4.b()
            int r8 = r7.getHeight()
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r5, r8)
            int r9 = r7.getHeight()
            int r9 = r9 - r8
            int r9 = java.lang.Math.max(r5, r9)
            me.magnum.melonds.domain.model.Rect r10 = new me.magnum.melonds.domain.model.Rect
            int r11 = r7.getX()
            int r12 = r7.getY()
            int r13 = r7.getWidth()
            r10.<init>(r11, r12, r13, r8)
            me.magnum.melonds.domain.model.Rect r11 = new me.magnum.melonds.domain.model.Rect
            int r12 = r7.getX()
            int r13 = r7.getY()
            int r13 = r13 + r8
            int r7 = r7.getWidth()
            r11.<init>(r12, r13, r7, r9)
            vr4 r7 = new vr4
            r7.<init>(r10, r11)
            goto L7a
        L75:
            vr4 r7 = new vr4
            r7.<init>(r6, r6)
        L7a:
            java.lang.Object r8 = r7.A
            r15 = r8
            me.magnum.melonds.domain.model.Rect r15 = (me.magnum.melonds.domain.model.Rect) r15
            java.lang.Object r7 = r7.B
            r16 = r7
            me.magnum.melonds.domain.model.Rect r16 = (me.magnum.melonds.domain.model.Rect) r16
            if (r2 == 0) goto L8d
            me.magnum.melonds.domain.model.Rect r7 = r2.b()
            r10 = r7
            goto L8e
        L8d:
            r10 = r6
        L8e:
            if (r3 == 0) goto L96
            me.magnum.melonds.domain.model.Rect r7 = r3.b()
            r11 = r7
            goto L97
        L96:
            r11 = r6
        L97:
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto La0
            float r8 = r2.c
            r20 = r8
            goto La2
        La0:
            r20 = r7
        La2:
            if (r3 == 0) goto La9
            float r8 = r3.c
            r21 = r8
            goto Lab
        La9:
            r21 = r7
        Lab:
            r8 = 0
            if (r2 == 0) goto Lb3
            boolean r2 = r2.d
            r22 = r2
            goto Lb5
        Lb3:
            r22 = r8
        Lb5:
            if (r3 == 0) goto Lbc
            boolean r2 = r3.d
            r23 = r2
            goto Lbe
        Lbc:
            r23 = r8
        Lbe:
            if (r4 == 0) goto Lc2
            float r7 = r4.c
        Lc2:
            r17 = r7
            if (r4 == 0) goto Lcb
            boolean r2 = r4.d
            r18 = r2
            goto Lcd
        Lcb:
            r18 = r8
        Lcd:
            c91 r9 = r0.Y
            r12 = r20
            r13 = r21
            r14 = r23
            r9.e(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = r16
            b36 r3 = r0.e0
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r4 = r0.Z
            if (r3 != 0) goto Le3
        Le0:
            r3 = r6
            goto L1b9
        Le3:
            po5 r7 = r3.d
            me.magnum.melonds.domain.model.VideoRenderer r9 = r3.a
            me.magnum.melonds.domain.model.VideoRenderer r12 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r9 == r12) goto Lec
            goto Le0
        Lec:
            vr4 r9 = r4.getCurrentSurfaceSize()
            java.lang.Object r12 = r9.A
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            java.lang.Object r9 = r9.B
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r12 <= 0) goto L103
            goto L107
        L103:
            int r12 = r4.getWidth()
        L107:
            if (r9 <= 0) goto L10a
            goto L10e
        L10a:
            int r9 = r4.getHeight()
        L10e:
            if (r10 == 0) goto L11d
            int r13 = r10.getWidth()
            if (r13 <= 0) goto L11d
            int r13 = r10.getHeight()
            if (r13 <= 0) goto L11d
            goto L11e
        L11d:
            r10 = r6
        L11e:
            if (r11 == 0) goto L12e
            int r13 = r11.getWidth()
            if (r13 <= 0) goto L12e
            int r13 = r11.getHeight()
            if (r13 <= 0) goto L12e
            r13 = r11
            goto L12f
        L12e:
            r13 = r6
        L12f:
            if (r12 <= 0) goto L13a
            if (r9 > 0) goto L134
            goto L13a
        L134:
            vr4 r9 = new vr4
            r9.<init>(r10, r13)
            goto L13f
        L13a:
            vr4 r9 = new vr4
            r9.<init>(r6, r6)
        L13f:
            java.lang.Object r10 = r9.A
            me.magnum.melonds.domain.model.Rect r10 = (me.magnum.melonds.domain.model.Rect) r10
            java.lang.Object r9 = r9.B
            r19 = r9
            me.magnum.melonds.domain.model.Rect r19 = (me.magnum.melonds.domain.model.Rect) r19
            if (r15 == 0) goto L15a
            int r9 = r15.getWidth()
            if (r9 <= 0) goto L15a
            int r9 = r15.getHeight()
            if (r9 <= 0) goto L15a
            r24 = r15
            goto L15c
        L15a:
            r24 = r6
        L15c:
            if (r2 == 0) goto L16d
            int r9 = r2.getWidth()
            if (r9 <= 0) goto L16d
            int r9 = r2.getHeight()
            if (r9 <= 0) goto L16d
            r25 = r2
            goto L16f
        L16d:
            r25 = r6
        L16f:
            t26 r9 = r0.d0
            if (r9 == 0) goto L17b
            me.magnum.melonds.domain.model.layout.BackgroundMode r9 = r9.b
            if (r9 != 0) goto L178
            goto L17b
        L178:
            r28 = r9
            goto L180
        L17b:
            t26 r9 = defpackage.t26.c
            me.magnum.melonds.domain.model.layout.BackgroundMode r9 = r9.b
            goto L178
        L180:
            me.magnum.melonds.domain.model.VideoFiltering r3 = r3.b
            me.magnum.melonds.domain.model.VideoFiltering r9 = me.magnum.melonds.domain.model.VideoFiltering.RETROARCH
            if (r3 != r9) goto L189
            r30 = r5
            goto L18b
        L189:
            r30 = r8
        L18b:
            java.lang.String r9 = r7.a
            hp5 r12 = r7.b
            java.lang.String r12 = r12.name()
            java.util.Locale r13 = java.util.Locale.ROOT
            java.lang.String r32 = r12.toLowerCase(r13)
            r32.getClass()
            int r12 = r7.c
            java.util.Map r13 = r7.e
            boolean r7 = r7.f
            r26 = r17
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r17 = new me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig
            r29 = r3
            r35 = r7
            r31 = r9
            r33 = r12
            r34 = r13
            r27 = r18
            r18 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r3 = r17
        L1b9:
            t26 r7 = r0.d0
            if (r7 != 0) goto L1bf
            t26 r7 = defpackage.t26.c
        L1bf:
            om2 r9 = r0.A
            r9.e(r4, r3, r7)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L221
            android.view.Window r3 = r0.getWindow()
            if (r3 == 0) goto L221
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L221
            boolean r3 = r3.isAttachedToWindow()
            if (r3 != r5) goto L221
            boolean r0 = r0.B
            if (r0 == 0) goto L21a
            me.magnum.melonds.domain.model.Rect[] r0 = new me.magnum.melonds.domain.model.Rect[]{r11, r2}
            java.util.ArrayList r0 = defpackage.fv.C0(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ht0.v0(r0, r2)
            r6.<init>(r2)
            int r2 = r0.size()
        L1f7:
            if (r8 >= r2) goto L21a
            java.lang.Object r3 = r0.get(r8)
            int r8 = r8 + 1
            me.magnum.melonds.domain.model.Rect r3 = (me.magnum.melonds.domain.model.Rect) r3
            android.graphics.Rect r4 = new android.graphics.Rect
            int r5 = r3.getX()
            int r7 = r3.getY()
            int r9 = r3.getRight()
            int r3 = r3.getBottom()
            r4.<init>(r5, r7, r9, r3)
            r6.add(r4)
            goto L1f7
        L21a:
            if (r6 != 0) goto L21e
            yt1 r6 = defpackage.yt1.A
        L21e:
            defpackage.yz0.r(r1, r6)
        L221:
            return
    }

    @Override // android.app.Presentation, android.app.Dialog
    public final void onStart() {
            r2 = this;
            super.onStart()
            n0 r0 = new n0
            r1 = 24
            r0.<init>(r2, r1)
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r2 = r2.L
            r2.post(r0)
            return
    }

    @Override // android.app.Presentation, android.app.Dialog
    public final void onStop() {
            r1 = this;
            super.onStop()
            om2 r0 = r1.A
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r1 = r1.Z
            r0.d(r1)
            return
    }
}
