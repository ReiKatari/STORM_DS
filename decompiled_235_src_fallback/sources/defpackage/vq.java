package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vq  reason: default package */
/* loaded from: classes.dex */
public final class vq implements defpackage.zk4, defpackage.k31, defpackage.a54 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.fr B;

    public /* synthetic */ vq(defpackage.fr r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.a54
    public boolean M(defpackage.i44 r4) {
            r3 = this;
            int r0 = r3.A
            r1 = 1
            r2 = 108(0x6c, float:1.51E-43)
            fr r3 = r3.B
            switch(r0) {
                case 2: goto L24;
                default: goto La;
            }
        La:
            i44 r0 = r4.k()
            if (r4 != r0) goto L23
            boolean r0 = r3.A0
            if (r0 == 0) goto L23
            android.view.Window r0 = r3.h0
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L23
            boolean r3 = r3.L0
            if (r3 != 0) goto L23
            r0.onMenuOpened(r2, r4)
        L23:
            return r1
        L24:
            android.view.Window r3 = r3.h0
            android.view.Window$Callback r3 = r3.getCallback()
            if (r3 == 0) goto L2f
            r3.onMenuOpened(r2, r4)
        L2f:
            return r1
    }

    @Override // defpackage.zk4
    public defpackage.vu7 U(android.view.View r17, defpackage.vu7 r18) {
            r16 = this;
            r1 = r17
            r2 = r18
            int r3 = r2.d()
            r0 = r16
            fr r4 = r0.B
            android.content.Context r5 = r4.g0
            int r6 = r2.d()
            androidx.appcompat.widget.ActionBarContextView r0 = r4.q0
            r7 = 29
            if (r0 == 0) goto L17b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L17b
            androidx.appcompat.widget.ActionBarContextView r0 = r4.q0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r10 = r0
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            androidx.appcompat.widget.ActionBarContextView r0 = r4.q0
            boolean r0 = r0.isShown()
            r11 = 1
            if (r0 == 0) goto L163
            android.graphics.Rect r0 = r4.X0
            if (r0 != 0) goto L44
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.X0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.Y0 = r0
        L44:
            android.graphics.Rect r12 = r4.X0
            android.graphics.Rect r0 = r4.Y0
            int r13 = r2.b()
            int r14 = r2.d()
            int r15 = r2.c()
            r16 = 0
            int r9 = r2.a()
            r12.set(r13, r14, r15, r9)
            android.view.ViewGroup r9 = r4.v0
            java.lang.Class<android.graphics.Rect> r13 = android.graphics.Rect.class
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r7) goto L6b
            boolean r13 = defpackage.eq7.a
            defpackage.bq7.a(r9, r12, r0)
            goto La7
        L6b:
            boolean r14 = defpackage.eq7.a
            java.lang.String r15 = "ViewUtils"
            if (r14 != 0) goto L95
            defpackage.eq7.a = r11
            java.lang.Class<android.view.View> r14 = android.view.View.class
            java.lang.String r7 = "computeFitSystemWindows"
            r8 = 2
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch: java.lang.NoSuchMethodException -> L90
            r8[r16] = r13     // Catch: java.lang.NoSuchMethodException -> L90
            r8[r11] = r13     // Catch: java.lang.NoSuchMethodException -> L90
            java.lang.reflect.Method r7 = r14.getDeclaredMethod(r7, r8)     // Catch: java.lang.NoSuchMethodException -> L90
            defpackage.eq7.b = r7     // Catch: java.lang.NoSuchMethodException -> L90
            boolean r7 = r7.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L90
            if (r7 != 0) goto L95
            java.lang.reflect.Method r7 = defpackage.eq7.b     // Catch: java.lang.NoSuchMethodException -> L90
            r7.setAccessible(r11)     // Catch: java.lang.NoSuchMethodException -> L90
            goto L95
        L90:
            java.lang.String r7 = "Could not find method computeFitSystemWindows. Oh well."
            android.util.Log.d(r15, r7)
        L95:
            java.lang.reflect.Method r7 = defpackage.eq7.b
            if (r7 == 0) goto La7
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r0}     // Catch: java.lang.Exception -> La1
            r7.invoke(r9, r0)     // Catch: java.lang.Exception -> La1
            goto La7
        La1:
            r0 = move-exception
            java.lang.String r7 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r15, r7, r0)
        La7:
            int r0 = r12.top
            int r7 = r12.left
            int r8 = r12.right
            android.view.ViewGroup r9 = r4.v0
            java.util.WeakHashMap r12 = defpackage.ao7.a
            vu7 r9 = defpackage.tn7.a(r9)
            if (r9 != 0) goto Lba
            r12 = r16
            goto Lbe
        Lba:
            int r12 = r9.b()
        Lbe:
            if (r9 != 0) goto Lc3
            r9 = r16
            goto Lc7
        Lc3:
            int r9 = r9.c()
        Lc7:
            int r13 = r10.topMargin
            if (r13 != r0) goto Ld7
            int r13 = r10.leftMargin
            if (r13 != r7) goto Ld7
            int r13 = r10.rightMargin
            if (r13 == r8) goto Ld4
            goto Ld7
        Ld4:
            r7 = r16
            goto Lde
        Ld7:
            r10.topMargin = r0
            r10.leftMargin = r7
            r10.rightMargin = r8
            r7 = r11
        Lde:
            if (r0 <= 0) goto L106
            android.view.View r0 = r4.x0
            if (r0 != 0) goto L106
            android.view.View r0 = new android.view.View
            r0.<init>(r5)
            r4.x0 = r0
            r8 = 8
            r0.setVisibility(r8)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r13 = r10.topMargin
            r14 = 51
            r15 = -1
            r0.<init>(r15, r13, r14)
            r0.leftMargin = r12
            r0.rightMargin = r9
            android.view.ViewGroup r9 = r4.v0
            android.view.View r12 = r4.x0
            r9.addView(r12, r15, r0)
            goto L12b
        L106:
            r8 = 8
            android.view.View r0 = r4.x0
            if (r0 == 0) goto L12b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r13 = r0.height
            int r14 = r10.topMargin
            if (r13 != r14) goto L120
            int r13 = r0.leftMargin
            if (r13 != r12) goto L120
            int r13 = r0.rightMargin
            if (r13 == r9) goto L12b
        L120:
            r0.height = r14
            r0.leftMargin = r12
            r0.rightMargin = r9
            android.view.View r9 = r4.x0
            r9.setLayoutParams(r0)
        L12b:
            android.view.View r0 = r4.x0
            if (r0 == 0) goto L130
            goto L132
        L130:
            r11 = r16
        L132:
            if (r11 == 0) goto L156
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L156
            android.view.View r0 = r4.x0
            int r9 = r0.getWindowSystemUiVisibility()
            r9 = r9 & 8192(0x2000, float:1.148E-41)
            if (r9 == 0) goto L14c
            r9 = 2131099654(0x7f060006, float:1.7811667E38)
            int r5 = r5.getColor(r9)
            goto L153
        L14c:
            r9 = 2131099653(0x7f060005, float:1.7811665E38)
            int r5 = r5.getColor(r9)
        L153:
            r0.setBackgroundColor(r5)
        L156:
            boolean r0 = r4.C0
            if (r0 != 0) goto L15e
            if (r11 == 0) goto L15e
            r6 = r16
        L15e:
            r5 = r16
            r0 = r11
            r11 = r7
            goto L173
        L163:
            r16 = 0
            r8 = 8
            int r0 = r10.topMargin
            r5 = r16
            if (r0 == 0) goto L171
            r10.topMargin = r5
            r0 = r5
            goto L173
        L171:
            r0 = r5
            r11 = r0
        L173:
            if (r11 == 0) goto L17f
            androidx.appcompat.widget.ActionBarContextView r7 = r4.q0
            r7.setLayoutParams(r10)
            goto L17f
        L17b:
            r5 = 0
            r8 = 8
            r0 = r5
        L17f:
            android.view.View r4 = r4.x0
            if (r4 == 0) goto L189
            if (r0 == 0) goto L186
            r8 = r5
        L186:
            r4.setVisibility(r8)
        L189:
            if (r3 == r6) goto L1e6
            int r0 = r2.b()
            int r3 = r2.c()
            int r4 = r2.a()
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 36
            if (r5 < r7) goto L1a3
            hu7 r5 = new hu7
            r5.<init>(r2)
            goto L1da
        L1a3:
            r7 = 35
            if (r5 < r7) goto L1ad
            gu7 r5 = new gu7
            r5.<init>(r2)
            goto L1da
        L1ad:
            r7 = 34
            if (r5 < r7) goto L1b7
            fu7 r5 = new fu7
            r5.<init>(r2)
            goto L1da
        L1b7:
            r7 = 31
            if (r5 < r7) goto L1c1
            eu7 r5 = new eu7
            r5.<init>(r2)
            goto L1da
        L1c1:
            r7 = 30
            if (r5 < r7) goto L1cb
            du7 r5 = new du7
            r5.<init>(r2)
            goto L1da
        L1cb:
            r7 = 29
            if (r5 < r7) goto L1d5
            cu7 r5 = new cu7
            r5.<init>(r2)
            goto L1da
        L1d5:
            bu7 r5 = new bu7
            r5.<init>(r2)
        L1da:
            e83 r0 = defpackage.e83.c(r0, r6, r3, r4)
            r5.h(r0)
            vu7 r0 = r5.b()
            goto L1e7
        L1e6:
            r0 = r2
        L1e7:
            java.util.WeakHashMap r2 = defpackage.ao7.a
            android.view.WindowInsets r2 = r0.f()
            if (r2 == 0) goto L1fd
            android.view.WindowInsets r3 = r1.onApplyWindowInsets(r2)
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1fd
            vu7 r0 = defpackage.vu7.g(r1, r3)
        L1fd:
            return r0
    }

    @Override // defpackage.a54
    public void d(defpackage.i44 r9, boolean r10) {
            r8 = this;
            int r0 = r8.A
            fr r8 = r8.B
            switch(r0) {
                case 2: goto L3c;
                default: goto L7;
            }
        L7:
            i44 r0 = r9.k()
            r1 = 0
            r2 = 1
            if (r0 == r9) goto L11
            r3 = r2
            goto L12
        L11:
            r3 = r1
        L12:
            if (r3 == 0) goto L15
            r9 = r0
        L15:
            er[] r4 = r8.G0
            if (r4 == 0) goto L1b
            int r5 = r4.length
            goto L1c
        L1b:
            r5 = r1
        L1c:
            if (r1 >= r5) goto L2a
            r6 = r4[r1]
            if (r6 == 0) goto L27
            i44 r7 = r6.h
            if (r7 != r9) goto L27
            goto L2b
        L27:
            int r1 = r1 + 1
            goto L1c
        L2a:
            r6 = 0
        L2b:
            if (r6 == 0) goto L3b
            if (r3 == 0) goto L38
            int r9 = r6.a
            r8.t(r9, r6, r0)
            r8.v(r6, r2)
            goto L3b
        L38:
            r8.v(r6, r10)
        L3b:
            return
        L3c:
            r8.u(r9)
            return
    }
}
