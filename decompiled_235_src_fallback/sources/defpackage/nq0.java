package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nq0  reason: default package */
/* loaded from: classes.dex */
public final class nq0 extends defpackage.p24 implements android.graphics.drawable.Drawable.Callback {
    public static final int[] K1 = null;
    public static final android.graphics.drawable.ShapeDrawable L1 = null;
    public android.graphics.PorterDuffColorFilter A1;
    public android.content.res.ColorStateList B1;
    public android.content.res.ColorStateList C0;
    public android.graphics.PorterDuff.Mode C1;
    public android.content.res.ColorStateList D0;
    public int[] D1;
    public float E0;
    public android.content.res.ColorStateList E1;
    public float F0;
    public java.lang.ref.WeakReference F1;
    public android.content.res.ColorStateList G0;
    public android.text.TextUtils.TruncateAt G1;
    public float H0;
    public boolean H1;
    public android.content.res.ColorStateList I0;
    public int I1;
    public java.lang.CharSequence J0;
    public boolean J1;
    public boolean K0;
    public android.graphics.drawable.Drawable L0;
    public android.content.res.ColorStateList M0;
    public float N0;
    public boolean O0;
    public boolean P0;
    public android.graphics.drawable.Drawable Q0;
    public android.graphics.drawable.RippleDrawable R0;
    public android.content.res.ColorStateList S0;
    public float T0;
    public android.text.SpannableStringBuilder U0;
    public boolean V0;
    public boolean W0;
    public android.graphics.drawable.Drawable X0;
    public android.content.res.ColorStateList Y0;
    public defpackage.f84 Z0;
    public defpackage.f84 a1;
    public float b1;
    public float c1;
    public float d1;
    public float e1;
    public float f1;
    public float g1;
    public float h1;
    public float i1;
    public final android.content.Context j1;
    public final android.graphics.Paint k1;
    public final android.graphics.Paint.FontMetrics l1;
    public final android.graphics.RectF m1;
    public final android.graphics.PointF n1;
    public final android.graphics.Path o1;
    public final defpackage.h17 p1;
    public int q1;
    public int r1;
    public int s1;
    public int t1;
    public int u1;
    public int v1;
    public boolean w1;
    public int x1;
    public int y1;
    public android.graphics.ColorFilter z1;

    static {
            r0 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r0}
            defpackage.nq0.K1 = r0
            android.graphics.drawable.ShapeDrawable r0 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r1 = new android.graphics.drawable.shapes.OvalShape
            r1.<init>()
            r0.<init>(r1)
            defpackage.nq0.L1 = r0
            return
    }

    public nq0(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 2130968800(0x7f0400e0, float:1.7546264E38)
            r1 = 2132018374(0x7f1404c6, float:1.9675053E38)
            r2.<init>(r3, r4, r0, r1)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.F0 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r0 = 1
            r4.<init>(r0)
            r2.k1 = r4
            android.graphics.Paint$FontMetrics r4 = new android.graphics.Paint$FontMetrics
            r4.<init>()
            r2.l1 = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r2.m1 = r4
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            r2.n1 = r4
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            r2.o1 = r4
            r4 = 255(0xff, float:3.57E-43)
            r2.y1 = r4
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.C1 = r4
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r1 = 0
            r4.<init>(r1)
            r2.F1 = r4
            r2.k(r3)
            r2.j1 = r3
            h17 r4 = new h17
            r4.<init>(r2)
            r2.p1 = r4
            java.lang.String r1 = ""
            r2.J0 = r1
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            android.text.TextPaint r4 = r4.a
            r4.density = r3
            int[] r3 = defpackage.nq0.K1
            r2.setState(r3)
            r2.R(r3)
            r2.H1 = r0
            android.graphics.drawable.ShapeDrawable r2 = defpackage.nq0.L1
            r3 = -1
            r2.setTint(r3)
            return
    }

    public static void b0(android.graphics.drawable.Drawable r1) {
            if (r1 == 0) goto L6
            r0 = 0
            r1.setCallback(r0)
        L6:
            return
    }

    public static boolean y(android.content.res.ColorStateList r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static boolean z(android.graphics.drawable.Drawable r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void A() {
            r1 = this;
            java.lang.ref.WeakReference r1 = r1.F1
            java.lang.Object r1 = r1.get()
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            if (r1 == 0) goto L15
            int r0 = r1.o0
            r1.b(r0)
            r1.requestLayout()
            r1.invalidateOutline()
        L15:
            return
    }

    public final boolean B(int[] r10, int[] r11) {
            r9 = this;
            boolean r0 = super.onStateChange(r10)
            android.content.res.ColorStateList r1 = r9.C0
            r2 = 0
            if (r1 == 0) goto L10
            int r3 = r9.q1
            int r1 = r1.getColorForState(r10, r3)
            goto L11
        L10:
            r1 = r2
        L11:
            int r1 = r9.c(r1)
            int r3 = r9.q1
            r4 = 1
            if (r3 == r1) goto L1d
            r9.q1 = r1
            r0 = r4
        L1d:
            android.content.res.ColorStateList r3 = r9.D0
            if (r3 == 0) goto L28
            int r5 = r9.r1
            int r3 = r3.getColorForState(r10, r5)
            goto L29
        L28:
            r3 = r2
        L29:
            int r3 = r9.c(r3)
            int r5 = r9.r1
            if (r5 == r3) goto L34
            r9.r1 = r3
            r0 = r4
        L34:
            int r1 = defpackage.tt0.b(r3, r1)
            int r3 = r9.s1
            if (r3 == r1) goto L3e
            r3 = r4
            goto L3f
        L3e:
            r3 = r2
        L3f:
            n24 r5 = r9.B
            android.content.res.ColorStateList r5 = r5.d
            if (r5 != 0) goto L47
            r5 = r4
            goto L48
        L47:
            r5 = r2
        L48:
            r3 = r3 | r5
            if (r3 == 0) goto L55
            r9.s1 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r9.n(r0)
            r0 = r4
        L55:
            android.content.res.ColorStateList r1 = r9.G0
            if (r1 == 0) goto L60
            int r3 = r9.t1
            int r1 = r1.getColorForState(r10, r3)
            goto L61
        L60:
            r1 = r2
        L61:
            int r3 = r9.t1
            if (r3 == r1) goto L68
            r9.t1 = r1
            r0 = r4
        L68:
            android.content.res.ColorStateList r1 = r9.E1
            if (r1 == 0) goto La0
            int[] r1 = defpackage.lq5.a
            int r1 = r10.length
            r3 = r2
            r5 = r3
            r6 = r5
        L72:
            if (r3 >= r1) goto L93
            r7 = r10[r3]
            r8 = 16842910(0x101009e, float:2.3694E-38)
            if (r7 != r8) goto L7d
            r5 = r4
            goto L90
        L7d:
            r8 = 16842908(0x101009c, float:2.3693995E-38)
            if (r7 != r8) goto L84
        L82:
            r6 = r4
            goto L90
        L84:
            r8 = 16842919(0x10100a7, float:2.3694026E-38)
            if (r7 != r8) goto L8a
            goto L82
        L8a:
            r8 = 16843623(0x1010367, float:2.3696E-38)
            if (r7 != r8) goto L90
            goto L82
        L90:
            int r3 = r3 + 1
            goto L72
        L93:
            if (r5 == 0) goto La0
            if (r6 == 0) goto La0
            android.content.res.ColorStateList r1 = r9.E1
            int r3 = r9.u1
            int r1 = r1.getColorForState(r10, r3)
            goto La1
        La0:
            r1 = r2
        La1:
            int r3 = r9.u1
            if (r3 == r1) goto La7
            r9.u1 = r1
        La7:
            h17 r1 = r9.p1
            g07 r1 = r1.f
            if (r1 == 0) goto Lb8
            android.content.res.ColorStateList r1 = r1.k
            if (r1 == 0) goto Lb8
            int r3 = r9.v1
            int r1 = r1.getColorForState(r10, r3)
            goto Lb9
        Lb8:
            r1 = r2
        Lb9:
            int r3 = r9.v1
            if (r3 == r1) goto Lc0
            r9.v1 = r1
            r0 = r4
        Lc0:
            int[] r1 = r9.getState()
            if (r1 != 0) goto Lc7
            goto Ldb
        Lc7:
            int r3 = r1.length
            r5 = r2
        Lc9:
            if (r5 >= r3) goto Ldb
            r6 = r1[r5]
            r7 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r6 != r7) goto Ld8
            boolean r1 = r9.V0
            if (r1 == 0) goto Ldb
            r1 = r4
            goto Ldc
        Ld8:
            int r5 = r5 + 1
            goto Lc9
        Ldb:
            r1 = r2
        Ldc:
            boolean r3 = r9.w1
            if (r3 == r1) goto Lf8
            android.graphics.drawable.Drawable r3 = r9.X0
            if (r3 == 0) goto Lf8
            float r0 = r9.v()
            r9.w1 = r1
            float r1 = r9.v()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lf5
            r0 = r4
            r1 = r0
            goto Lf9
        Lf5:
            r1 = r2
            r0 = r4
            goto Lf9
        Lf8:
            r1 = r2
        Lf9:
            android.content.res.ColorStateList r3 = r9.B1
            if (r3 == 0) goto L104
            int r5 = r9.x1
            int r3 = r3.getColorForState(r10, r5)
            goto L105
        L104:
            r3 = r2
        L105:
            int r5 = r9.x1
            if (r5 == r3) goto L126
            r9.x1 = r3
            android.content.res.ColorStateList r0 = r9.B1
            android.graphics.PorterDuff$Mode r3 = r9.C1
            if (r0 == 0) goto L122
            if (r3 != 0) goto L114
            goto L122
        L114:
            int[] r5 = r9.getState()
            int r0 = r0.getColorForState(r5, r2)
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
            r5.<init>(r0, r3)
            goto L123
        L122:
            r5 = 0
        L123:
            r9.A1 = r5
            goto L127
        L126:
            r4 = r0
        L127:
            android.graphics.drawable.Drawable r0 = r9.L0
            boolean r0 = z(r0)
            if (r0 == 0) goto L136
            android.graphics.drawable.Drawable r0 = r9.L0
            boolean r0 = r0.setState(r10)
            r4 = r4 | r0
        L136:
            android.graphics.drawable.Drawable r0 = r9.X0
            boolean r0 = z(r0)
            if (r0 == 0) goto L145
            android.graphics.drawable.Drawable r0 = r9.X0
            boolean r0 = r0.setState(r10)
            r4 = r4 | r0
        L145:
            android.graphics.drawable.Drawable r0 = r9.Q0
            boolean r0 = z(r0)
            if (r0 == 0) goto L162
            int r0 = r10.length
            int r3 = r11.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r10.length
            java.lang.System.arraycopy(r10, r2, r0, r2, r3)
            int r10 = r10.length
            int r3 = r11.length
            java.lang.System.arraycopy(r11, r2, r0, r10, r3)
            android.graphics.drawable.Drawable r10 = r9.Q0
            boolean r10 = r10.setState(r0)
            r4 = r4 | r10
        L162:
            android.graphics.drawable.RippleDrawable r10 = r9.R0
            boolean r10 = z(r10)
            if (r10 == 0) goto L171
            android.graphics.drawable.RippleDrawable r10 = r9.R0
            boolean r10 = r10.setState(r11)
            r4 = r4 | r10
        L171:
            if (r4 == 0) goto L176
            r9.invalidateSelf()
        L176:
            if (r1 == 0) goto L17b
            r9.A()
        L17b:
            return r4
    }

    public final void C(boolean r2) {
            r1 = this;
            boolean r0 = r1.V0
            if (r0 == r2) goto L21
            r1.V0 = r2
            float r0 = r1.v()
            if (r2 != 0) goto L13
            boolean r2 = r1.w1
            if (r2 == 0) goto L13
            r2 = 0
            r1.w1 = r2
        L13:
            float r2 = r1.v()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            r1.A()
        L21:
            return
    }

    public final void D(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.X0
            if (r0 == r3) goto L22
            float r0 = r2.v()
            r2.X0 = r3
            float r3 = r2.v()
            android.graphics.drawable.Drawable r1 = r2.X0
            b0(r1)
            android.graphics.drawable.Drawable r1 = r2.X0
            r2.t(r1)
            r2.invalidateSelf()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            r2.A()
        L22:
            return
    }

    public final void E(android.content.res.ColorStateList r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.Y0
            if (r0 == r3) goto L1c
            r2.Y0 = r3
            boolean r0 = r2.W0
            if (r0 == 0) goto L15
            android.graphics.drawable.Drawable r0 = r2.X0
            if (r0 == 0) goto L15
            boolean r1 = r2.V0
            if (r1 == 0) goto L15
            r0.setTintList(r3)
        L15:
            int[] r3 = r2.getState()
            r2.onStateChange(r3)
        L1c:
            return
    }

    public final void F(boolean r2) {
            r1 = this;
            boolean r0 = r1.W0
            if (r0 == r2) goto L21
            boolean r0 = r1.Y()
            r1.W0 = r2
            boolean r2 = r1.Y()
            if (r0 == r2) goto L21
            android.graphics.drawable.Drawable r0 = r1.X0
            if (r2 == 0) goto L18
            r1.t(r0)
            goto L1b
        L18:
            b0(r0)
        L1b:
            r1.invalidateSelf()
            r1.A()
        L21:
            return
    }

    public final void G(float r3) {
            r2 = this;
            float r0 = r2.F0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L33
            r2.F0 = r3
            n24 r0 = r2.B
            me6 r0 = r0.a
            le6 r0 = r0.f()
            t r1 = new t
            r1.<init>(r3)
            r0.e = r1
            t r1 = new t
            r1.<init>(r3)
            r0.f = r1
            t r1 = new t
            r1.<init>(r3)
            r0.g = r1
            t r1 = new t
            r1.<init>(r3)
            r0.h = r1
            me6 r3 = r0.a()
            r2.setShapeAppearanceModel(r3)
        L33:
            return
    }

    public final void H(android.graphics.drawable.Drawable r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.L0
            r1 = 0
            if (r0 == 0) goto L6
            goto L7
        L6:
            r0 = r1
        L7:
            if (r0 == r4) goto L31
            float r2 = r3.v()
            if (r4 == 0) goto L13
            android.graphics.drawable.Drawable r1 = r4.mutate()
        L13:
            r3.L0 = r1
            float r4 = r3.v()
            b0(r0)
            boolean r0 = r3.Z()
            if (r0 == 0) goto L27
            android.graphics.drawable.Drawable r0 = r3.L0
            r3.t(r0)
        L27:
            r3.invalidateSelf()
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L31
            r3.A()
        L31:
            return
    }

    public final void I(float r2) {
            r1 = this;
            float r0 = r1.N0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.v()
            r1.N0 = r2
            float r2 = r1.v()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.A()
        L1a:
            return
    }

    public final void J(android.content.res.ColorStateList r2) {
            r1 = this;
            r0 = 1
            r1.O0 = r0
            android.content.res.ColorStateList r0 = r1.M0
            if (r0 == r2) goto L1b
            r1.M0 = r2
            boolean r0 = r1.Z()
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r1.L0
            r0.setTintList(r2)
        L14:
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L1b:
            return
    }

    public final void K(boolean r2) {
            r1 = this;
            boolean r0 = r1.K0
            if (r0 == r2) goto L21
            boolean r0 = r1.Z()
            r1.K0 = r2
            boolean r2 = r1.Z()
            if (r0 == r2) goto L21
            android.graphics.drawable.Drawable r0 = r1.L0
            if (r2 == 0) goto L18
            r1.t(r0)
            goto L1b
        L18:
            b0(r0)
        L1b:
            r1.invalidateSelf()
            r1.A()
        L21:
            return
    }

    public final void L(android.content.res.ColorStateList r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.G0
            if (r0 == r3) goto L20
            r2.G0 = r3
            boolean r0 = r2.J1
            if (r0 == 0) goto L19
            n24 r0 = r2.B
            android.content.res.ColorStateList r1 = r0.e
            if (r1 == r3) goto L19
            r0.e = r3
            int[] r3 = r2.getState()
            r2.onStateChange(r3)
        L19:
            int[] r3 = r2.getState()
            r2.onStateChange(r3)
        L20:
            return
    }

    public final void M(float r2) {
            r1 = this;
            float r0 = r1.H0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1b
            r1.H0 = r2
            android.graphics.Paint r0 = r1.k1
            r0.setStrokeWidth(r2)
            boolean r0 = r1.J1
            if (r0 == 0) goto L18
            n24 r0 = r1.B
            r0.k = r2
            r1.invalidateSelf()
        L18:
            r1.invalidateSelf()
        L1b:
            return
    }

    public final void N(android.graphics.drawable.Drawable r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.Q0
            r1 = 0
            if (r0 == 0) goto L6
            goto L7
        L6:
            r0 = r1
        L7:
            if (r0 == r6) goto L42
            float r2 = r5.w()
            if (r6 == 0) goto L13
            android.graphics.drawable.Drawable r1 = r6.mutate()
        L13:
            r5.Q0 = r1
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r1 = r5.I0
            android.content.res.ColorStateList r1 = defpackage.lq5.a(r1)
            android.graphics.drawable.Drawable r3 = r5.Q0
            android.graphics.drawable.ShapeDrawable r4 = defpackage.nq0.L1
            r6.<init>(r1, r3, r4)
            r5.R0 = r6
            float r6 = r5.w()
            b0(r0)
            boolean r0 = r5.a0()
            if (r0 == 0) goto L38
            android.graphics.drawable.Drawable r0 = r5.Q0
            r5.t(r0)
        L38:
            r5.invalidateSelf()
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L42
            r5.A()
        L42:
            return
    }

    public final void O(float r2) {
            r1 = this;
            float r0 = r1.h1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.h1 = r2
            r1.invalidateSelf()
            boolean r2 = r1.a0()
            if (r2 == 0) goto L14
            r1.A()
        L14:
            return
    }

    public final void P(float r2) {
            r1 = this;
            float r0 = r1.T0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.T0 = r2
            r1.invalidateSelf()
            boolean r2 = r1.a0()
            if (r2 == 0) goto L14
            r1.A()
        L14:
            return
    }

    public final void Q(float r2) {
            r1 = this;
            float r0 = r1.g1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L14
            r1.g1 = r2
            r1.invalidateSelf()
            boolean r2 = r1.a0()
            if (r2 == 0) goto L14
            r1.A()
        L14:
            return
    }

    public final boolean R(int[] r2) {
            r1 = this;
            int[] r0 = r1.D1
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 != 0) goto L19
            r1.D1 = r2
            boolean r0 = r1.a0()
            if (r0 == 0) goto L19
            int[] r0 = r1.getState()
            boolean r1 = r1.B(r0, r2)
            return r1
        L19:
            r1 = 0
            return r1
    }

    public final void S(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.S0
            if (r0 == r2) goto L18
            r1.S0 = r2
            boolean r0 = r1.a0()
            if (r0 == 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.Q0
            r0.setTintList(r2)
        L11:
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L18:
            return
    }

    public final void T(boolean r2) {
            r1 = this;
            boolean r0 = r1.P0
            if (r0 == r2) goto L21
            boolean r0 = r1.a0()
            r1.P0 = r2
            boolean r2 = r1.a0()
            if (r0 == r2) goto L21
            android.graphics.drawable.Drawable r0 = r1.Q0
            if (r2 == 0) goto L18
            r1.t(r0)
            goto L1b
        L18:
            b0(r0)
        L1b:
            r1.invalidateSelf()
            r1.A()
        L21:
            return
    }

    public final void U(float r2) {
            r1 = this;
            float r0 = r1.d1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.v()
            r1.d1 = r2
            float r2 = r1.v()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.A()
        L1a:
            return
    }

    public final void V(float r2) {
            r1 = this;
            float r0 = r1.c1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            float r0 = r1.v()
            r1.c1 = r2
            float r2 = r1.v()
            r1.invalidateSelf()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1a
            r1.A()
        L1a:
            return
    }

    public final void W(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.I0
            if (r0 == r2) goto L10
            r1.I0 = r2
            r2 = 0
            r1.E1 = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L10:
            return
    }

    public final void X(defpackage.g07 r5) {
            r4 = this;
            h17 r0 = r4.p1
            kq0 r1 = r0.b
            android.text.TextPaint r2 = r0.a
            g07 r3 = r0.f
            if (r3 == r5) goto L40
            r0.f = r5
            if (r5 == 0) goto L29
            android.content.Context r4 = r4.j1
            r5.e(r4, r2, r1)
            java.lang.ref.WeakReference r3 = r0.e
            java.lang.Object r3 = r3.get()
            nq0 r3 = (defpackage.nq0) r3
            if (r3 == 0) goto L23
            int[] r3 = r3.getState()
            r2.drawableState = r3
        L23:
            r5.d(r4, r2, r1)
            r4 = 1
            r0.d = r4
        L29:
            java.lang.ref.WeakReference r4 = r0.e
            java.lang.Object r4 = r4.get()
            nq0 r4 = (defpackage.nq0) r4
            if (r4 == 0) goto L40
            r4.A()
            r4.invalidateSelf()
            int[] r5 = r4.getState()
            r4.onStateChange(r5)
        L40:
            return
    }

    public final boolean Y() {
            r1 = this;
            boolean r0 = r1.W0
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r1.X0
            if (r0 == 0) goto Le
            boolean r1 = r1.w1
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final boolean Z() {
            r1 = this;
            boolean r0 = r1.K0
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r1 = r1.L0
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public final boolean a0() {
            r1 = this;
            boolean r0 = r1.P0
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r1 = r1.Q0
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r23) {
            r22 = this;
            r0 = r22
            android.graphics.Rect r7 = r0.getBounds()
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L2cd
            int r6 = r0.y1
            if (r6 != 0) goto L12
            goto L2cd
        L12:
            r8 = 255(0xff, float:3.57E-43)
            r9 = 0
            if (r6 >= r8) goto L2b
            int r1 = r7.left
            float r2 = (float) r1
            int r1 = r7.top
            float r3 = (float) r1
            int r1 = r7.right
            float r4 = (float) r1
            int r1 = r7.bottom
            float r5 = (float) r1
            r1 = r23
            int r2 = r1.saveLayerAlpha(r2, r3, r4, r5, r6)
            r10 = r2
            goto L2e
        L2b:
            r1 = r23
            r10 = r9
        L2e:
            boolean r2 = r0.J1
            r3 = r2
            android.graphics.Paint r2 = r0.k1
            android.graphics.RectF r11 = r0.m1
            if (r3 != 0) goto L4f
            int r3 = r0.q1
            r2.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            r11.set(r7)
            float r3 = r0.x()
            float r4 = r0.x()
            r1.drawRoundRect(r11, r3, r4, r2)
        L4f:
            boolean r3 = r0.J1
            if (r3 != 0) goto L75
            int r3 = r0.r1
            r2.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            android.graphics.ColorFilter r3 = r0.z1
            if (r3 == 0) goto L62
            goto L64
        L62:
            android.graphics.PorterDuffColorFilter r3 = r0.A1
        L64:
            r2.setColorFilter(r3)
            r11.set(r7)
            float r3 = r0.x()
            float r4 = r0.x()
            r1.drawRoundRect(r11, r3, r4, r2)
        L75:
            boolean r3 = r0.J1
            if (r3 == 0) goto L7c
            super.draw(r23)
        L7c:
            float r3 = r0.H0
            r12 = 0
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            r13 = 1073741824(0x40000000, float:2.0)
            if (r3 <= 0) goto Lc0
            boolean r3 = r0.J1
            if (r3 != 0) goto Lc0
            int r3 = r0.t1
            r2.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            boolean r3 = r0.J1
            if (r3 != 0) goto La1
            android.graphics.ColorFilter r3 = r0.z1
            if (r3 == 0) goto L9c
            goto L9e
        L9c:
            android.graphics.PorterDuffColorFilter r3 = r0.A1
        L9e:
            r2.setColorFilter(r3)
        La1:
            int r3 = r7.left
            float r3 = (float) r3
            float r4 = r0.H0
            float r4 = r4 / r13
            float r3 = r3 + r4
            int r5 = r7.top
            float r5 = (float) r5
            float r5 = r5 + r4
            int r6 = r7.right
            float r6 = (float) r6
            float r6 = r6 - r4
            int r14 = r7.bottom
            float r14 = (float) r14
            float r14 = r14 - r4
            r11.set(r3, r5, r6, r14)
            float r3 = r0.F0
            float r4 = r0.H0
            float r4 = r4 / r13
            float r3 = r3 - r4
            r1.drawRoundRect(r11, r3, r3, r2)
        Lc0:
            int r3 = r0.u1
            r2.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            r11.set(r7)
            boolean r3 = r0.J1
            if (r3 != 0) goto Le0
            float r3 = r0.x()
            float r4 = r0.x()
            r1.drawRoundRect(r11, r3, r4, r2)
            r21 = r13
        Lde:
            r13 = r0
            goto L112
        Le0:
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r7)
            n24 r4 = r0.B
            me6 r15 = r4.a
            float[] r5 = r0.x0
            float r4 = r4.j
            m24 r6 = r0.n0
            oe6 r14 = r0.o0
            r21 = r13
            android.graphics.Path r13 = r0.o1
            r18 = r3
            r17 = r4
            r16 = r5
            r19 = r6
            r20 = r13
            r14.a(r15, r16, r17, r18, r19, r20)
            r3 = r20
            android.graphics.RectF r6 = r0.g()
            n24 r4 = r0.B
            me6 r4 = r4.a
            float[] r5 = r0.x0
            r0.e(r1, r2, r3, r4, r5, r6)
            goto Lde
        L112:
            boolean r0 = r13.Z()
            if (r0 == 0) goto L13b
            r13.u(r7, r11)
            float r0 = r11.left
            float r2 = r11.top
            r1.translate(r0, r2)
            android.graphics.drawable.Drawable r3 = r13.L0
            float r4 = r11.width()
            int r4 = (int) r4
            float r5 = r11.height()
            int r5 = (int) r5
            r3.setBounds(r9, r9, r4, r5)
            android.graphics.drawable.Drawable r3 = r13.L0
            r3.draw(r1)
            float r0 = -r0
            float r2 = -r2
            r1.translate(r0, r2)
        L13b:
            boolean r0 = r13.Y()
            if (r0 == 0) goto L164
            r13.u(r7, r11)
            float r0 = r11.left
            float r2 = r11.top
            r1.translate(r0, r2)
            android.graphics.drawable.Drawable r3 = r13.X0
            float r4 = r11.width()
            int r4 = (int) r4
            float r5 = r11.height()
            int r5 = (int) r5
            r3.setBounds(r9, r9, r4, r5)
            android.graphics.drawable.Drawable r3 = r13.X0
            r3.draw(r1)
            float r0 = -r0
            float r2 = -r2
            r1.translate(r0, r2)
        L164:
            boolean r0 = r13.H1
            if (r0 == 0) goto L257
            java.lang.CharSequence r0 = r13.J0
            if (r0 == 0) goto L257
            android.graphics.PointF r0 = r13.n1
            r0.set(r12, r12)
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.LEFT
            java.lang.CharSequence r3 = r13.J0
            h17 r4 = r13.p1
            if (r3 == 0) goto L1ae
            float r3 = r13.b1
            float r5 = r13.v()
            float r5 = r5 + r3
            float r3 = r13.e1
            float r5 = r5 + r3
            int r3 = r13.getLayoutDirection()
            if (r3 != 0) goto L190
            int r3 = r7.left
            float r3 = (float) r3
            float r3 = r3 + r5
            r0.x = r3
            goto L198
        L190:
            int r2 = r7.right
            float r2 = (float) r2
            float r2 = r2 - r5
            r0.x = r2
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.RIGHT
        L198:
            int r3 = r7.centerY()
            float r3 = (float) r3
            android.text.TextPaint r5 = r4.a
            android.graphics.Paint$FontMetrics r6 = r13.l1
            r5.getFontMetrics(r6)
            float r5 = r6.descent
            float r6 = r6.ascent
            float r5 = r5 + r6
            float r5 = r5 / r21
            float r3 = r3 - r5
            r0.y = r3
        L1ae:
            r11.setEmpty()
            java.lang.CharSequence r3 = r13.J0
            if (r3 == 0) goto L1f0
            float r3 = r13.b1
            float r5 = r13.v()
            float r5 = r5 + r3
            float r3 = r13.e1
            float r5 = r5 + r3
            float r3 = r13.i1
            float r6 = r13.w()
            float r6 = r6 + r3
            float r3 = r13.f1
            float r6 = r6 + r3
            int r3 = r13.getLayoutDirection()
            int r12 = r7.left
            if (r3 != 0) goto L1dc
            float r3 = (float) r12
            float r3 = r3 + r5
            r11.left = r3
            int r3 = r7.right
            float r3 = (float) r3
            float r3 = r3 - r6
            r11.right = r3
            goto L1e6
        L1dc:
            float r3 = (float) r12
            float r3 = r3 + r6
            r11.left = r3
            int r3 = r7.right
            float r3 = (float) r3
            float r3 = r3 - r5
            r11.right = r3
        L1e6:
            int r3 = r7.top
            float r3 = (float) r3
            r11.top = r3
            int r3 = r7.bottom
            float r3 = (float) r3
            r11.bottom = r3
        L1f0:
            g07 r3 = r4.f
            android.text.TextPaint r6 = r4.a
            if (r3 == 0) goto L205
            int[] r3 = r13.getState()
            r6.drawableState = r3
            g07 r3 = r4.f
            kq0 r5 = r4.b
            android.content.Context r12 = r13.j1
            r3.d(r12, r6, r5)
        L205:
            r6.setTextAlign(r2)
            java.lang.CharSequence r2 = r13.J0
            java.lang.String r2 = r2.toString()
            float r2 = r4.a(r2)
            int r2 = java.lang.Math.round(r2)
            float r3 = r11.width()
            int r3 = java.lang.Math.round(r3)
            if (r2 <= r3) goto L223
            r2 = 1
            r12 = r2
            goto L224
        L223:
            r12 = r9
        L224:
            if (r12 == 0) goto L22f
            int r2 = r1.save()
            r1.clipRect(r11)
            r14 = r2
            goto L230
        L22f:
            r14 = r9
        L230:
            java.lang.CharSequence r2 = r13.J0
            if (r12 == 0) goto L242
            android.text.TextUtils$TruncateAt r3 = r13.G1
            if (r3 == 0) goto L242
            float r3 = r11.width()
            android.text.TextUtils$TruncateAt r4 = r13.G1
            java.lang.CharSequence r2 = android.text.TextUtils.ellipsize(r2, r6, r3, r4)
        L242:
            int r3 = r2.length()
            float r4 = r0.x
            float r5 = r0.y
            r1 = r2
            r2 = 0
            r0 = r23
            r0.drawText(r1, r2, r3, r4, r5, r6)
            r1 = r0
            if (r12 == 0) goto L257
            r1.restoreToCount(r14)
        L257:
            boolean r0 = r13.a0()
            if (r0 == 0) goto L2c6
            r11.setEmpty()
            boolean r0 = r13.a0()
            if (r0 == 0) goto L296
            float r0 = r13.i1
            float r2 = r13.h1
            float r0 = r0 + r2
            int r2 = r13.getLayoutDirection()
            if (r2 != 0) goto L27d
            int r2 = r7.right
            float r2 = (float) r2
            float r2 = r2 - r0
            r11.right = r2
            float r0 = r13.T0
            float r2 = r2 - r0
            r11.left = r2
            goto L288
        L27d:
            int r2 = r7.left
            float r2 = (float) r2
            float r2 = r2 + r0
            r11.left = r2
            float r0 = r13.T0
            float r2 = r2 + r0
            r11.right = r2
        L288:
            float r0 = r7.exactCenterY()
            float r2 = r13.T0
            float r3 = r2 / r21
            float r0 = r0 - r3
            r11.top = r0
            float r0 = r0 + r2
            r11.bottom = r0
        L296:
            float r0 = r11.left
            float r2 = r11.top
            r1.translate(r0, r2)
            android.graphics.drawable.Drawable r3 = r13.Q0
            float r4 = r11.width()
            int r4 = (int) r4
            float r5 = r11.height()
            int r5 = (int) r5
            r3.setBounds(r9, r9, r4, r5)
            android.graphics.drawable.RippleDrawable r3 = r13.R0
            android.graphics.drawable.Drawable r4 = r13.Q0
            android.graphics.Rect r4 = r4.getBounds()
            r3.setBounds(r4)
            android.graphics.drawable.RippleDrawable r3 = r13.R0
            r3.jumpToCurrentState()
            android.graphics.drawable.RippleDrawable r3 = r13.R0
            r3.draw(r1)
            float r0 = -r0
            float r2 = -r2
            r1.translate(r0, r2)
        L2c6:
            int r0 = r13.y1
            if (r0 >= r8) goto L2cd
            r1.restoreToCount(r10)
        L2cd:
            return
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final int getAlpha() {
            r0 = this;
            int r0 = r0.y1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
            r0 = this;
            android.graphics.ColorFilter r0 = r0.z1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r0 = this;
            float r0 = r0.E0
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r3 = this;
            float r0 = r3.b1
            float r1 = r3.v()
            float r1 = r1 + r0
            float r0 = r3.e1
            float r1 = r1 + r0
            java.lang.CharSequence r0 = r3.J0
            java.lang.String r0 = r0.toString()
            h17 r2 = r3.p1
            float r0 = r2.a(r0)
            float r0 = r0 + r1
            float r1 = r3.f1
            float r0 = r0 + r1
            float r1 = r3.w()
            float r1 = r1 + r0
            float r0 = r3.i1
            float r1 = r1 + r0
            int r0 = java.lang.Math.round(r1)
            int r3 = r3.I1
            int r3 = java.lang.Math.min(r0, r3)
            return r3
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            r0 = -3
            return r0
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline r9) {
            r8 = this;
            boolean r0 = r8.J1
            if (r0 == 0) goto L8
            super.getOutline(r9)
            return
        L8:
            android.graphics.Rect r0 = r8.getBounds()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L19
            float r1 = r8.F0
            r9.setRoundRect(r0, r1)
            r2 = r9
            goto L28
        L19:
            int r5 = r8.getIntrinsicWidth()
            float r0 = r8.E0
            int r6 = (int) r0
            float r7 = r8.F0
            r3 = 0
            r4 = 0
            r2 = r9
            r2.setRoundRect(r3, r4, r5, r6, r7)
        L28:
            int r8 = r8.y1
            float r8 = (float) r8
            r9 = 1132396544(0x437f0000, float:255.0)
            float r8 = r8 / r9
            r2.setAlpha(r8)
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.invalidateDrawable(r0)
        L9:
            return
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.C0
            boolean r0 = y(r0)
            if (r0 != 0) goto L51
            android.content.res.ColorStateList r0 = r1.D0
            boolean r0 = y(r0)
            if (r0 != 0) goto L51
            android.content.res.ColorStateList r0 = r1.G0
            boolean r0 = y(r0)
            if (r0 != 0) goto L51
            h17 r0 = r1.p1
            g07 r0 = r0.f
            if (r0 == 0) goto L29
            android.content.res.ColorStateList r0 = r0.k
            if (r0 == 0) goto L29
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L29
            goto L51
        L29:
            boolean r0 = r1.W0
            if (r0 == 0) goto L36
            android.graphics.drawable.Drawable r0 = r1.X0
            if (r0 == 0) goto L36
            boolean r0 = r1.V0
            if (r0 == 0) goto L36
            goto L51
        L36:
            android.graphics.drawable.Drawable r0 = r1.L0
            boolean r0 = z(r0)
            if (r0 != 0) goto L51
            android.graphics.drawable.Drawable r0 = r1.X0
            boolean r0 = z(r0)
            if (r0 != 0) goto L51
            android.content.res.ColorStateList r1 = r1.B1
            boolean r1 = y(r1)
            if (r1 == 0) goto L4f
            goto L51
        L4f:
            r1 = 0
            return r1
        L51:
            r1 = 1
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int r3) {
            r2 = this;
            boolean r0 = super.onLayoutDirectionChanged(r3)
            boolean r1 = r2.Z()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.L0
            boolean r1 = r1.setLayoutDirection(r3)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.Y()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.X0
            boolean r1 = r1.setLayoutDirection(r3)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.a0()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.Q0
            boolean r3 = r1.setLayoutDirection(r3)
            r0 = r0 | r3
        L2b:
            if (r0 == 0) goto L30
            r2.invalidateSelf()
        L30:
            r2 = 1
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r3) {
            r2 = this;
            boolean r0 = super.onLevelChange(r3)
            boolean r1 = r2.Z()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.L0
            boolean r1 = r1.setLevel(r3)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.Y()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.X0
            boolean r1 = r1.setLevel(r3)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.a0()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.Q0
            boolean r3 = r1.setLevel(r3)
            r0 = r0 | r3
        L2b:
            if (r0 == 0) goto L30
            r2.invalidateSelf()
        L30:
            return r0
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
            r1 = this;
            boolean r0 = r1.J1
            if (r0 == 0) goto L7
            super.onStateChange(r2)
        L7:
            int[] r0 = r1.D1
            boolean r1 = r1.B(r2, r0)
            return r1
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.scheduleDrawable(r0, r2, r3)
        L9:
            return
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            int r0 = r1.y1
            if (r0 == r2) goto L9
            r1.y1 = r2
            r1.invalidateSelf()
        L9:
            return
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.z1
            if (r0 == r2) goto L9
            r1.z1 = r2
            r1.invalidateSelf()
        L9:
            return
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.B1
            if (r0 == r2) goto Ld
            r1.B1 = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        Ld:
            return
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            android.graphics.PorterDuff$Mode r0 = r3.C1
            if (r0 == r4) goto L22
            r3.C1 = r4
            android.content.res.ColorStateList r0 = r3.B1
            if (r0 == 0) goto L1c
            if (r4 != 0) goto Ld
            goto L1c
        Ld:
            int[] r1 = r3.getState()
            r2 = 0
            int r0 = r0.getColorForState(r1, r2)
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r0, r4)
            goto L1d
        L1c:
            r1 = 0
        L1d:
            r3.A1 = r1
            r3.invalidateSelf()
        L22:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            boolean r1 = r2.Z()
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r2.L0
            boolean r1 = r1.setVisible(r3, r4)
            r0 = r0 | r1
        L11:
            boolean r1 = r2.Y()
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.X0
            boolean r1 = r1.setVisible(r3, r4)
            r0 = r0 | r1
        L1e:
            boolean r1 = r2.a0()
            if (r1 == 0) goto L2b
            android.graphics.drawable.Drawable r1 = r2.Q0
            boolean r3 = r1.setVisible(r3, r4)
            r0 = r0 | r3
        L2b:
            if (r0 == 0) goto L30
            r2.invalidateSelf()
        L30:
            return r0
    }

    public final void t(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L4b
        L3:
            r3.setCallback(r2)
            int r0 = r2.getLayoutDirection()
            r3.setLayoutDirection(r0)
            int r0 = r2.getLevel()
            r3.setLevel(r0)
            boolean r0 = r2.isVisible()
            r1 = 0
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r0 = r2.Q0
            if (r3 != r0) goto L31
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L2b
            int[] r0 = r2.D1
            r3.setState(r0)
        L2b:
            android.content.res.ColorStateList r2 = r2.S0
            r3.setTintList(r2)
            return
        L31:
            android.graphics.drawable.Drawable r0 = r2.L0
            if (r3 != r0) goto L3e
            boolean r1 = r2.O0
            if (r1 == 0) goto L3e
            android.content.res.ColorStateList r1 = r2.M0
            r0.setTintList(r1)
        L3e:
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L4b
            int[] r2 = r2.getState()
            r3.setState(r2)
        L4b:
            return
    }

    public final void u(android.graphics.Rect r6, android.graphics.RectF r7) {
            r5 = this;
            r7.setEmpty()
            boolean r0 = r5.Z()
            if (r0 != 0) goto L11
            boolean r0 = r5.Y()
            if (r0 == 0) goto L10
            goto L11
        L10:
            return
        L11:
            float r0 = r5.b1
            float r1 = r5.c1
            float r0 = r0 + r1
            boolean r1 = r5.w1
            if (r1 == 0) goto L1d
            android.graphics.drawable.Drawable r1 = r5.X0
            goto L1f
        L1d:
            android.graphics.drawable.Drawable r1 = r5.L0
        L1f:
            float r2 = r5.N0
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 > 0) goto L2d
            if (r1 == 0) goto L2d
            int r1 = r1.getIntrinsicWidth()
            float r2 = (float) r1
        L2d:
            int r1 = r5.getLayoutDirection()
            if (r1 != 0) goto L3d
            int r1 = r6.left
            float r1 = (float) r1
            float r1 = r1 + r0
            r7.left = r1
            float r1 = r1 + r2
            r7.right = r1
            goto L46
        L3d:
            int r1 = r6.right
            float r1 = (float) r1
            float r1 = r1 - r0
            r7.right = r1
            float r1 = r1 - r2
            r7.left = r1
        L46:
            boolean r0 = r5.w1
            if (r0 == 0) goto L4d
            android.graphics.drawable.Drawable r0 = r5.X0
            goto L4f
        L4d:
            android.graphics.drawable.Drawable r0 = r5.L0
        L4f:
            float r1 = r5.N0
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 > 0) goto L7c
            if (r0 == 0) goto L7c
            android.content.Context r5 = r5.j1
            android.content.res.Resources r5 = r5.getResources()
            r1 = 1103101952(0x41c00000, float:24.0)
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            r2 = 1
            float r5 = android.util.TypedValue.applyDimension(r2, r1, r5)
            double r1 = (double) r5
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r5 = r0.getIntrinsicHeight()
            float r5 = (float) r5
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 > 0) goto L7c
            int r5 = r0.getIntrinsicHeight()
            float r1 = (float) r5
        L7c:
            float r5 = r6.exactCenterY()
            r6 = 1073741824(0x40000000, float:2.0)
            float r6 = r1 / r6
            float r5 = r5 - r6
            r7.top = r5
            float r5 = r5 + r1
            r7.bottom = r5
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L9
            r1.unscheduleDrawable(r0, r2)
        L9:
            return
    }

    public final float v() {
            r4 = this;
            boolean r0 = r4.Z()
            r1 = 0
            if (r0 != 0) goto Lf
            boolean r0 = r4.Y()
            if (r0 == 0) goto Le
            goto Lf
        Le:
            return r1
        Lf:
            float r0 = r4.c1
            boolean r2 = r4.w1
            if (r2 == 0) goto L18
            android.graphics.drawable.Drawable r2 = r4.X0
            goto L1a
        L18:
            android.graphics.drawable.Drawable r2 = r4.L0
        L1a:
            float r3 = r4.N0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L27
            if (r2 == 0) goto L27
            int r1 = r2.getIntrinsicWidth()
            float r3 = (float) r1
        L27:
            float r3 = r3 + r0
            float r4 = r4.d1
            float r3 = r3 + r4
            return r3
    }

    public final float w() {
            r2 = this;
            boolean r0 = r2.a0()
            if (r0 == 0) goto Lf
            float r0 = r2.g1
            float r1 = r2.T0
            float r0 = r0 + r1
            float r2 = r2.h1
            float r0 = r0 + r2
            return r0
        Lf:
            r2 = 0
            return r2
    }

    public final float x() {
            r1 = this;
            boolean r0 = r1.J1
            if (r0 == 0) goto L1b
            float[] r0 = r1.x0
            if (r0 == 0) goto Lc
            r1 = 3
            r1 = r0[r1]
            return r1
        Lc:
            n24 r0 = r1.B
            me6 r0 = r0.a
            f61 r0 = r0.e
            android.graphics.RectF r1 = r1.g()
            float r1 = r0.a(r1)
            return r1
        L1b:
            float r1 = r1.F0
            return r1
    }
}
