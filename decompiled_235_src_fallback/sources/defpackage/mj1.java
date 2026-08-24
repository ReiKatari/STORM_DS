package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mj1  reason: default package */
/* loaded from: classes.dex */
public final class mj1 extends defpackage.qv0 {
    public defpackage.on2 X;
    public defpackage.jj1 Y;
    public final android.view.View Z;
    public final defpackage.gj1 d0;
    public boolean e0;

    public mj1(defpackage.on2 r6, defpackage.jj1 r7, android.view.View r8, defpackage.kk3 r9, defpackage.qh1 r10, java.util.UUID r11) {
            r5 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r8.getContext()
            boolean r2 = r7.e
            if (r2 == 0) goto Le
            r2 = 2132017468(0x7f14013c, float:1.9673215E38)
            goto L11
        Le:
            r2 = 2132017470(0x7f14013e, float:1.967322E38)
        L11:
            r0.<init>(r1, r2)
            r1 = 0
            r5.<init>(r0, r1)
            r5.X = r6
            r5.Y = r7
            r5.Z = r8
            android.view.Window r6 = r5.getWindow()
            r7 = 0
            if (r6 == 0) goto L100
            jj1 r0 = r5.Y
            android.view.Window r2 = r5.getWindow()
            if (r2 == 0) goto L38
            android.view.WindowManager$LayoutParams r3 = r2.getAttributes()
            int r0 = r0.g
            r3.type = r0
            r2.setAttributes(r3)
        L38:
            r0 = 1
            r6.requestFeature(r0)
            r2 = 17170445(0x106000d, float:2.461195E-38)
            r6.setBackgroundDrawableResource(r2)
            jj1 r2 = r5.Y
            boolean r2 = r2.e
            defpackage.kt7.a(r6, r2)
            r2 = 17
            r6.setGravity(r2)
            jj1 r2 = r5.Y
            boolean r2 = r2.e
            if (r2 != 0) goto L78
            r2 = 65792(0x10100, float:9.2194E-41)
            r6.addFlags(r2)
            android.view.WindowManager$LayoutParams r2 = r6.getAttributes()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L69
            qp r4 = defpackage.qp.a
            r4.a(r2)
        L69:
            r4 = 30
            if (r3 < r4) goto L75
            sp r3 = defpackage.sp.a
            r3.b(r2, r1)
            r3.c(r2, r1)
        L75:
            r6.setAttributes(r2)
        L78:
            gj1 r2 = new gj1
            android.content.Context r3 = r5.getContext()
            r2.<init>(r3, r6)
            jj1 r3 = r5.Y
            java.lang.String r3 = r3.f
            r5.setTitle(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Dialog:"
            r3.<init>(r4)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            r3 = 2131427507(0x7f0b00b3, float:1.8476632E38)
            r2.setTag(r3, r11)
            r2.setClipChildren(r1)
            r11 = 1090519040(0x41000000, float:8.0)
            float r10 = r10.e0(r11)
            r2.setElevation(r10)
            kj1 r10 = new kj1
            r10.<init>(r1)
            r2.setOutlineProvider(r10)
            r5.d0 = r2
            android.view.View r6 = r6.getDecorView()
            boolean r10 = r6 instanceof android.view.ViewGroup
            if (r10 == 0) goto Lbd
            r7 = r6
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
        Lbd:
            if (r7 == 0) goto Lc2
            f(r7)
        Lc2:
            r5.setContentView(r2)
            hu3 r6 = defpackage.bl2.B(r8)
            r7 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            r2.setTag(r7, r6)
            bp7 r6 = defpackage.ln2.r(r8)
            r7 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            r2.setTag(r7, r6)
            g56 r6 = defpackage.kn2.C(r8)
            r7 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            r2.setTag(r7, r6)
            on2 r6 = r5.X
            jj1 r7 = r5.Y
            r5.g(r6, r7, r9)
            il4 r6 = r5.b()
            hg r7 = new hg
            r7.<init>(r5, r0)
            r6.getClass()
            d00 r8 = new d00
            r9 = 4
            r8.<init>(r7, r1, r9)
            r6.a(r5, r8)
            return
        L100:
            java.lang.String r5 = "Dialog has no window"
            defpackage.i.m(r5)
            throw r7
    }

    public static final void f(android.view.ViewGroup r4) {
            r0 = 0
            r4.setClipChildren(r0)
            boolean r1 = r4 instanceof defpackage.gj1
            if (r1 == 0) goto L9
            goto L23
        L9:
            int r1 = r4.getChildCount()
        Ld:
            if (r0 >= r1) goto L23
            android.view.View r2 = r4.getChildAt(r0)
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1a
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L1b
        L1a:
            r2 = 0
        L1b:
            if (r2 == 0) goto L20
            f(r2)
        L20:
            int r0 = r0 + 1
            goto Ld
        L23:
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
            r0 = this;
            return
    }

    public final void g(defpackage.on2 r7, defpackage.jj1 r8, defpackage.kk3 r9) {
            r6 = this;
            r6.X = r7
            r6.Y = r8
            y86 r7 = r8.c
            android.view.View r0 = r6.Z
            boolean r0 = defpackage.ak.b(r0)
            int[] r1 = defpackage.z86.a
            int r7 = r7.ordinal()
            r7 = r1[r7]
            r1 = 2
            r2 = 0
            r3 = 1
            if (r7 == r3) goto L25
            if (r7 == r1) goto L23
            r4 = 3
            if (r7 != r4) goto L1f
            goto L26
        L1f:
            defpackage.i.d()
            return
        L23:
            r0 = r3
            goto L26
        L25:
            r0 = r2
        L26:
            android.view.Window r7 = r6.getWindow()
            r7.getClass()
            r4 = 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L33
            r0 = r4
            goto L35
        L33:
            r0 = -8193(0xffffffffffffdfff, float:NaN)
        L35:
            r7.setFlags(r0, r4)
            int[] r7 = defpackage.lj1.a
            int r9 = r9.ordinal()
            r7 = r7[r9]
            if (r7 == r3) goto L4a
            if (r7 != r1) goto L46
            r7 = r3
            goto L4b
        L46:
            defpackage.i.d()
            return
        L4a:
            r7 = r2
        L4b:
            gj1 r9 = r6.d0
            r9.setLayoutDirection(r7)
            boolean r7 = r8.e
            boolean r0 = r8.d
            android.view.Window r1 = r9.i0
            boolean r4 = r9.m0
            if (r4 == 0) goto L65
            boolean r4 = r9.k0
            if (r0 != r4) goto L65
            boolean r4 = r9.l0
            if (r7 == r4) goto L63
            goto L65
        L63:
            r4 = r2
            goto L66
        L65:
            r4 = r3
        L66:
            r9.k0 = r0
            r9.l0 = r7
            if (r4 == 0) goto L83
            android.view.WindowManager$LayoutParams r4 = r1.getAttributes()
            r5 = -2
            if (r0 == 0) goto L75
            r0 = r5
            goto L76
        L75:
            r0 = -1
        L76:
            int r4 = r4.width
            if (r0 != r4) goto L7e
            boolean r4 = r9.m0
            if (r4 != 0) goto L83
        L7e:
            r1.setLayout(r0, r5)
            r9.m0 = r3
        L83:
            boolean r8 = r8.b
            r6.setCanceledOnTouchOutside(r8)
            android.view.Window r6 = r6.getWindow()
            if (r6 == 0) goto L9f
            if (r7 == 0) goto L91
            goto L9c
        L91:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 31
            if (r7 >= r8) goto L9a
            r2 = 16
            goto L9c
        L9a:
            r2 = 48
        L9c:
            r6.setSoftInputMode(r2)
        L9f:
            return
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            jj1 r0 = r1.Y
            boolean r0 = r0.a
            if (r0 == 0) goto L1d
            boolean r0 = r3.isTracking()
            if (r0 == 0) goto L1d
            boolean r0 = r3.isCanceled()
            if (r0 != 0) goto L1d
            r0 = 111(0x6f, float:1.56E-43)
            if (r2 != r0) goto L1d
            on2 r1 = r1.X
            r1.c()
            r1 = 1
            return r1
        L1d:
            boolean r1 = super.onKeyUp(r2, r3)
            return r1
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            jj1 r1 = r9.Y
            boolean r1 = r1.b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L86
            gj1 r1 = r9.d0
            r1.getClass()
            float r5 = r10.getX()
            float r5 = java.lang.Math.abs(r5)
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            float r5 = r10.getY()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L34
            goto L69
        L34:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = defpackage.u24.E(r5)
            if (r7 > r5) goto L69
            if (r5 > r6) goto L69
            float r5 = r10.getY()
            int r5 = defpackage.u24.E(r5)
            if (r8 > r5) goto L69
            if (r5 > r1) goto L69
            goto L86
        L69:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L83
            if (r10 == r4) goto L77
            if (r10 == r2) goto L74
            goto L90
        L74:
            r9.e0 = r3
            return r0
        L77:
            boolean r10 = r9.e0
            if (r10 == 0) goto L90
            on2 r10 = r9.X
            r10.c()
            r9.e0 = r3
            return r4
        L83:
            r9.e0 = r4
            return r4
        L86:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L91
            if (r10 == r4) goto L91
            if (r10 == r2) goto L91
        L90:
            return r0
        L91:
            r9.e0 = r3
            return r0
    }
}
