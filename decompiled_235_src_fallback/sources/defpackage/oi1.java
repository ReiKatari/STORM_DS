package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oi1  reason: default package */
/* loaded from: classes.dex */
public final class oi1 extends defpackage.p0 {
    public final defpackage.jj1 i0;
    public final android.view.WindowManager j0;
    public final android.view.WindowManager.LayoutParams k0;
    public defpackage.on2 l0;
    public boolean m0;
    public final defpackage.vs4 n0;

    public oi1(android.view.View r3, defpackage.jj1 r4, java.util.UUID r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            r1 = 0
            r2.<init>(r0, r1)
            r2.i0 = r4
            android.content.Context r4 = r3.getContext()
            java.lang.String r0 = "window"
            java.lang.Object r4 = r4.getSystemService(r0)
            r4.getClass()
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            r2.j0 = r4
            android.view.WindowManager$LayoutParams r4 = new android.view.WindowManager$LayoutParams
            r4.<init>()
            r0 = 258(0x102, float:3.62E-43)
            r4.flags = r0
            r0 = 1058642330(0x3f19999a, float:0.6)
            r4.dimAmount = r0
            r0 = 16973826(0x1030002, float:2.4060906E-38)
            r4.windowAnimations = r0
            r0 = 1003(0x3eb, float:1.406E-42)
            r4.type = r0
            android.os.IBinder r0 = r3.getApplicationWindowToken()
            r4.token = r0
            r0 = -1
            r4.width = r0
            r4.height = r0
            r0 = -3
            r4.format = r0
            r0 = 17
            r4.gravity = r0
            r2.k0 = r4
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            r2.setId(r4)
            hu3 r4 = defpackage.bl2.B(r3)
            r0 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            r2.setTag(r0, r4)
            bp7 r4 = defpackage.ln2.r(r3)
            r0 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            r2.setTag(r0, r4)
            g56 r3 = defpackage.kn2.C(r3)
            r4 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            r2.setTag(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "DetachedDialog:"
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4 = 2131427507(0x7f0b00b3, float:1.8476632E38)
            r2.setTag(r4, r3)
            r3 = 0
            r2.setClipChildren(r3)
            zv0 r3 = defpackage.jw2.g
            vs4 r3 = defpackage.np2.Y(r3)
            r2.n0 = r3
            return
    }

    @Override // defpackage.p0
    public final void a(defpackage.px0 r20, int r21) {
            r19 = this;
            r0 = r19
            r2 = r20
            xq2 r2 = (defpackage.xq2) r2
            r3 = -427305857(0xffffffffe687d47f, float:-3.2071967E23)
            r2.d0(r3)
            boolean r3 = r2.h(r0)
            r4 = 2
            if (r3 == 0) goto L15
            r3 = 4
            goto L16
        L15:
            r3 = r4
        L16:
            r3 = r21 | r3
            r5 = r3 & 3
            r6 = 1
            r7 = 0
            if (r5 == r4) goto L20
            r4 = r6
            goto L21
        L20:
            r4 = r7
        L21:
            r3 = r3 & r6
            boolean r3 = r2.S(r3, r4)
            if (r3 == 0) goto L1d2
            lc2 r3 = defpackage.dj6.c
            boolean r4 = r2.h(r0)
            java.lang.Object r5 = r2.P()
            vs0 r8 = defpackage.ox0.a
            if (r4 != 0) goto L38
            if (r5 != r8) goto L40
        L38:
            rg r5 = new rg
            r5.<init>(r0, r6)
            r2.l0(r5)
        L40:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r5 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r5
            jg7 r4 = defpackage.jg7.a
            a74 r3 = defpackage.jw6.a(r3, r4, r5)
            e40 r5 = defpackage.d90.Z
            e34 r5 = defpackage.h70.d(r5, r7)
            long r9 = r2.T
            int r9 = java.lang.Long.hashCode(r9)
            xv4 r10 = r2.l()
            a74 r3 = defpackage.l.E(r2, r3)
            ix0 r11 = defpackage.jx0.i
            r11.getClass()
            iy0 r11 = defpackage.ix0.b
            r2.f0()
            boolean r12 = r2.S
            if (r12 == 0) goto L6e
            r2.k(r11)
            goto L71
        L6e:
            r2.o0()
        L71:
            pn r12 = defpackage.ix0.f
            defpackage.yh2.K(r2, r12, r5)
            pn r5 = defpackage.ix0.e
            defpackage.yh2.K(r2, r5, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            pn r10 = defpackage.ix0.g
            defpackage.yh2.K(r2, r10, r9)
            ne r9 = defpackage.ix0.h
            defpackage.yh2.F(r2, r9)
            pn r13 = defpackage.ix0.d
            defpackage.yh2.K(r2, r13, r3)
            jj1 r3 = r0.i0
            boolean r3 = r3.e
            x64 r15 = defpackage.x64.a
            if (r3 == 0) goto L14e
            r3 = 633022555(0x25bb285b, float:3.2466675E-16)
            r2.b0(r3)
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            android.content.Context r16 = r0.getContext()
            android.content.res.Resources r16 = r16.getResources()
            android.content.res.Configuration r14 = r16.getConfiguration()
            int r14 = r14.orientation
            if (r14 != r6) goto Lba
            r14 = r6
            goto Lbb
        Lba:
            r14 = r7
        Lbb:
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.Context r17 = r0.getContext()
            r18 = r14
            android.content.res.Resources$Theme r14 = r17.getTheme()
            r1 = 16843529(0x1010309, float:2.3695736E-38)
            boolean r1 = r14.resolveAttribute(r1, r7, r6)
            if (r1 == 0) goto Ld8
            int r1 = r7.resourceId
            if (r1 == 0) goto Ld8
            goto Ldb
        Ld8:
            r1 = 16974545(0x10302d1, float:2.406292E-38)
        Ldb:
            android.content.Context r14 = r0.getContext()
            android.content.res.Resources r14 = r14.getResources()
            android.content.res.Resources$Theme r14 = r14.newTheme()
            android.content.Context r17 = r0.getContext()
            android.content.res.Resources$Theme r0 = r17.getTheme()
            r14.setTo(r0)
            r14.applyStyle(r1, r6)
            if (r18 == 0) goto Lfb
            r0 = 16843607(0x1010357, float:2.3695954E-38)
            goto Lfe
        Lfb:
            r0 = 16843606(0x1010356, float:2.3695951E-38)
        Lfe:
            boolean r0 = r14.resolveAttribute(r0, r7, r6)
            if (r0 == 0) goto L122
            int r0 = r7.type
            r1 = 5
            if (r0 == r1) goto L11d
            r1 = 6
            if (r0 == r1) goto L115
            int r0 = r3.widthPixels
            float r0 = (float) r0
            r1 = 1063675494(0x3f666666, float:0.9)
            float r0 = r0 * r1
        L113:
            int r0 = (int) r0
            goto L139
        L115:
            int r0 = r3.widthPixels
            float r0 = (float) r0
            float r0 = r7.getFraction(r0, r0)
            goto L113
        L11d:
            float r0 = r7.getDimension(r3)
            goto L113
        L122:
            android.content.Context r0 = r19.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1133248512(0x438c0000, float:280.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r1 = r3.widthPixels
            if (r0 <= r1) goto L139
            r0 = r1
        L139:
            nq6 r1 = defpackage.ky0.h
            java.lang.Object r1 = r2.j(r1)
            qh1 r1 = (defpackage.qh1) r1
            float r0 = r1.Q(r0)
            a74 r0 = defpackage.dj6.l(r15, r0)
            r1 = 0
            r2.p(r1)
            goto L15e
        L14e:
            r1 = r7
            r0 = 633248235(0x25be99eb, float:3.3064045E-16)
            r2.b0(r0)
            r2.p(r1)
            r0 = 3
            r1 = 0
            a74 r0 = defpackage.dj6.n(r15, r1, r0)
        L15e:
            java.lang.Object r1 = r2.P()
            if (r1 != r8) goto L169
            ni1 r1 = defpackage.ni1.b
            r2.l0(r1)
        L169:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r1 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r1
            a74 r0 = defpackage.jw6.a(r0, r4, r1)
            e40 r1 = defpackage.d90.L
            r3 = 0
            e34 r1 = defpackage.h70.d(r1, r3)
            long r3 = r2.T
            int r3 = java.lang.Long.hashCode(r3)
            xv4 r4 = r2.l()
            a74 r0 = defpackage.l.E(r2, r0)
            r2.f0()
            boolean r7 = r2.S
            if (r7 == 0) goto L18f
            r2.k(r11)
            goto L192
        L18f:
            r2.o0()
        L192:
            defpackage.yh2.K(r2, r12, r1)
            defpackage.yh2.K(r2, r5, r4)
            defpackage.i61.w(r3, r2, r10, r2, r9)
            defpackage.yh2.K(r2, r13, r0)
            r0 = r19
            vs4 r1 = r0.n0
            java.lang.Object r1 = r1.getValue()
            eo2 r1 = (defpackage.eo2) r1
            r16 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r1.o(r2, r3)
            r2.p(r6)
            boolean r1 = r2.h(r0)
            java.lang.Object r3 = r2.P()
            if (r1 != 0) goto L1c0
            if (r3 != r8) goto L1c8
        L1c0:
            li1 r3 = new li1
            r3.<init>(r0, r6)
            r2.l0(r3)
        L1c8:
            qn2 r3 = (defpackage.qn2) r3
            r1 = 0
            defpackage.mb3.d(r1, r3, r2)
            r2.p(r6)
            goto L1d5
        L1d2:
            r2.V()
        L1d5:
            cf5 r1 = r2.t()
            if (r1 == 0) goto L1e6
            z5 r2 = new z5
            r3 = 8
            r4 = r21
            r2.<init>(r0, r4, r3)
            r1.d = r2
        L1e6:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            jj1 r0 = r2.i0
            boolean r0 = r0.a
            if (r0 == 0) goto L29
            if (r3 == 0) goto L10
            int r0 = r3.getKeyCode()
            r1 = 4
            if (r0 != r1) goto L10
            goto L1a
        L10:
            if (r3 == 0) goto L29
            int r0 = r3.getKeyCode()
            r1 = 111(0x6f, float:1.56E-43)
            if (r0 != r1) goto L29
        L1a:
            int r0 = r3.getAction()
            if (r0 != 0) goto L29
            on2 r2 = r2.l0
            if (r2 == 0) goto L27
            r2.c()
        L27:
            r2 = 1
            return r2
        L29:
            boolean r2 = super.dispatchKeyEvent(r3)
            return r2
    }

    @Override // defpackage.p0
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
            r0 = this;
            boolean r0 = r0.m0
            return r0
    }
}
