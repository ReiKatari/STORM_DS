package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: at0  reason: default package */
/* loaded from: classes.dex */
public final class at0 {
    public final android.text.TextUtils.TruncateAt A;
    public java.lang.CharSequence B;
    public java.lang.CharSequence C;
    public boolean D;
    public final boolean E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final android.text.TextPaint O;
    public final android.text.TextPaint P;
    public android.animation.TimeInterpolator Q;
    public android.animation.TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public android.content.res.ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public android.text.StaticLayout Z;
    public final com.google.android.material.textfield.TextInputLayout a;
    public float a0;
    public float b;
    public float b0;
    public final android.graphics.Rect c;
    public float c0;
    public final android.graphics.Rect d;
    public java.lang.CharSequence d0;
    public final android.graphics.RectF e;
    public int e0;
    public int f;
    public int f0;
    public int g;
    public final float g0;
    public float h;
    public final int h0;
    public float i;
    public int i0;
    public android.content.res.ColorStateList j;
    public int j0;
    public android.content.res.ColorStateList k;
    public boolean k0;
    public int l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public android.graphics.Typeface s;
    public android.graphics.Typeface t;
    public android.graphics.Typeface u;
    public android.graphics.Typeface v;
    public android.graphics.Typeface w;
    public android.graphics.Typeface x;
    public android.graphics.Typeface y;
    public defpackage.pj0 z;

    public at0(com.google.android.material.textfield.TextInputLayout r3) {
            r2 = this;
            r2.<init>()
            r0 = 16
            r2.f = r0
            r2.g = r0
            r0 = 1097859072(0x41700000, float:15.0)
            r2.h = r0
            r2.i = r0
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r2.A = r0
            r0 = 1
            r2.E = r0
            r2.e0 = r0
            r2.f0 = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.g0 = r1
            r2.h0 = r0
            r0 = -1
            r2.i0 = r0
            r2.j0 = r0
            r2.a = r3
            android.text.TextPaint r0 = new android.text.TextPaint
            r1 = 129(0x81, float:1.81E-43)
            r0.<init>(r1)
            r2.O = r0
            android.text.TextPaint r1 = new android.text.TextPaint
            r1.<init>(r0)
            r2.P = r1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.d = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.c = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.e = r0
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            r2.i(r3)
            return
    }

    public static int a(float r5, int r6, int r7) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r5
            int r1 = android.graphics.Color.alpha(r6)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r2 = android.graphics.Color.alpha(r7)
            float r2 = (float) r2
            float r2 = r2 * r5
            float r2 = r2 + r1
            int r1 = android.graphics.Color.red(r6)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r3 = android.graphics.Color.red(r7)
            float r3 = (float) r3
            float r3 = r3 * r5
            float r3 = r3 + r1
            int r1 = android.graphics.Color.green(r6)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r4 = android.graphics.Color.green(r7)
            float r4 = (float) r4
            float r4 = r4 * r5
            float r4 = r4 + r1
            int r6 = android.graphics.Color.blue(r6)
            float r6 = (float) r6
            float r6 = r6 * r0
            int r7 = android.graphics.Color.blue(r7)
            float r7 = (float) r7
            float r7 = r7 * r5
            float r7 = r7 + r6
            int r5 = java.lang.Math.round(r2)
            int r6 = java.lang.Math.round(r3)
            int r0 = java.lang.Math.round(r4)
            int r7 = java.lang.Math.round(r7)
            int r5 = android.graphics.Color.argb(r5, r6, r0, r7)
            return r5
    }

    public static float h(float r0, float r1, float r2, android.animation.TimeInterpolator r3) {
            if (r3 == 0) goto L6
            float r2 = r3.getInterpolation(r2)
        L6:
            float r0 = defpackage.vo.a(r0, r1, r2)
            return r0
    }

    public final void b() {
            r9 = this;
            float r0 = r9.b
            android.graphics.Rect r1 = r9.c
            int r2 = r1.left
            float r2 = (float) r2
            android.graphics.Rect r3 = r9.d
            int r4 = r3.left
            float r4 = (float) r4
            android.animation.TimeInterpolator r5 = r9.Q
            float r2 = h(r2, r4, r0, r5)
            android.graphics.RectF r4 = r9.e
            r4.left = r2
            float r2 = r9.m
            float r5 = r9.n
            android.animation.TimeInterpolator r6 = r9.Q
            float r2 = h(r2, r5, r0, r6)
            r4.top = r2
            int r2 = r1.right
            float r2 = (float) r2
            int r5 = r3.right
            float r5 = (float) r5
            android.animation.TimeInterpolator r6 = r9.Q
            float r2 = h(r2, r5, r0, r6)
            r4.right = r2
            int r1 = r1.bottom
            float r1 = (float) r1
            int r2 = r3.bottom
            float r2 = (float) r2
            android.animation.TimeInterpolator r3 = r9.Q
            float r1 = h(r1, r2, r0, r3)
            r4.bottom = r1
            float r1 = r9.o
            float r2 = r9.p
            android.animation.TimeInterpolator r3 = r9.Q
            float r1 = h(r1, r2, r0, r3)
            r9.q = r1
            float r1 = r9.m
            float r2 = r9.n
            android.animation.TimeInterpolator r3 = r9.Q
            float r1 = h(r1, r2, r0, r3)
            r9.r = r1
            r1 = 0
            r9.d(r0, r1)
            com.google.android.material.textfield.TextInputLayout r2 = r9.a
            r2.postInvalidateOnAnimation()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r3 - r0
            q92 r5 = defpackage.vo.b
            r6 = 0
            float r4 = h(r6, r3, r4, r5)
            float r4 = r3 - r4
            r9.b0 = r4
            r2.postInvalidateOnAnimation()
            float r3 = h(r3, r6, r0, r5)
            r9.c0 = r3
            r2.postInvalidateOnAnimation()
            android.content.res.ColorStateList r3 = r9.k
            android.content.res.ColorStateList r4 = r9.j
            android.text.TextPaint r7 = r9.O
            if (r3 == r4) goto L94
            int r3 = r9.g(r4)
            android.content.res.ColorStateList r4 = r9.k
            int r4 = r9.g(r4)
            int r3 = a(r0, r3, r4)
            r7.setColor(r3)
            goto L9b
        L94:
            int r3 = r9.g(r3)
            r7.setColor(r3)
        L9b:
            float r3 = r9.W
            float r4 = r9.X
            int r8 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r8 == 0) goto Lab
            float r3 = h(r4, r3, r0, r5)
            r7.setLetterSpacing(r3)
            goto Lae
        Lab:
            r7.setLetterSpacing(r3)
        Lae:
            float r3 = r9.S
            float r3 = defpackage.vo.a(r6, r3, r0)
            r9.H = r3
            float r3 = r9.T
            float r3 = defpackage.vo.a(r6, r3, r0)
            r9.I = r3
            float r3 = r9.U
            float r3 = defpackage.vo.a(r6, r3, r0)
            r9.J = r3
            android.content.res.ColorStateList r3 = r9.V
            int r3 = r9.g(r3)
            int r0 = a(r0, r1, r3)
            r9.K = r0
            float r1 = r9.H
            float r3 = r9.I
            float r9 = r9.J
            r7.setShadowLayer(r1, r3, r9, r0)
            r2.postInvalidateOnAnimation()
            return
    }

    public final boolean c(java.lang.CharSequence r3) {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.a
            int r0 = r0.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            boolean r2 = r2.E
            if (r2 == 0) goto L1f
            if (r1 == 0) goto L14
            g60 r2 = defpackage.f17.d
            goto L16
        L14:
            g60 r2 = defpackage.f17.c
        L16:
            int r0 = r3.length()
            boolean r2 = r2.e(r0, r3)
            return r2
        L1f:
            return r1
    }

    public final void d(float r16, boolean r17) {
            r15 = this;
            r0 = r16
            java.lang.CharSequence r1 = r15.B
            if (r1 != 0) goto L8
            goto L10c
        L8:
            android.graphics.Rect r1 = r15.d
            int r1 = r1.width()
            float r1 = (float) r1
            android.graphics.Rect r2 = r15.c
            int r2 = r2.width()
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r0 - r3
            float r4 = java.lang.Math.abs(r4)
            r5 = 925353388(0x3727c5ac, float:1.0E-5)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r6 = 0
            if (r4 >= 0) goto L60
            boolean r4 = r15.o()
            if (r4 == 0) goto L2f
            float r4 = r15.i
            goto L31
        L2f:
            float r4 = r15.h
        L31:
            boolean r5 = r15.o()
            if (r5 == 0) goto L3a
            float r5 = r15.W
            goto L3c
        L3a:
            float r5 = r15.X
        L3c:
            boolean r7 = r15.o()
            if (r7 == 0) goto L44
            r7 = r3
            goto L51
        L44:
            float r7 = r15.h
            float r8 = r15.i
            android.animation.TimeInterpolator r9 = r15.R
            float r7 = h(r7, r8, r0, r9)
            float r8 = r15.h
            float r7 = r7 / r8
        L51:
            r15.F = r7
            boolean r7 = r15.o()
            if (r7 == 0) goto L5a
            goto L5b
        L5a:
            r1 = r2
        L5b:
            android.graphics.Typeface r2 = r15.s
            r8 = r2
            r2 = r1
            goto L9b
        L60:
            float r4 = r15.h
            float r7 = r15.X
            android.graphics.Typeface r8 = r15.v
            float r9 = r0 - r6
            float r9 = java.lang.Math.abs(r9)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 >= 0) goto L73
            r15.F = r3
            goto L82
        L73:
            float r5 = r15.h
            float r9 = r15.i
            android.animation.TimeInterpolator r10 = r15.R
            float r5 = h(r5, r9, r0, r10)
            float r9 = r15.h
            float r5 = r5 / r9
            r15.F = r5
        L82:
            float r5 = r15.i
            float r9 = r15.h
            float r5 = r5 / r9
            float r9 = r2 * r5
            if (r17 != 0) goto L9a
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 <= 0) goto L9a
            boolean r9 = r15.o()
            if (r9 == 0) goto L9a
            float r1 = r1 / r5
            float r2 = java.lang.Math.min(r1, r2)
        L9a:
            r5 = r7
        L9b:
            r1 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto La4
            int r0 = r15.e0
            goto La6
        La4:
            int r0 = r15.f0
        La6:
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            android.text.TextPaint r11 = r15.O
            r6 = 1
            r7 = 0
            if (r1 <= 0) goto L105
            float r1 = r15.G
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto Lb6
            r1 = r6
            goto Lb7
        Lb6:
            r1 = r7
        Lb7:
            float r9 = r15.Y
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 == 0) goto Lbf
            r9 = r6
            goto Lc0
        Lbf:
            r9 = r7
        Lc0:
            android.graphics.Typeface r10 = r15.y
            if (r10 == r8) goto Lc6
            r10 = r6
            goto Lc7
        Lc6:
            r10 = r7
        Lc7:
            android.text.StaticLayout r12 = r15.Z
            if (r12 == 0) goto Ld6
            int r12 = r12.getWidth()
            float r12 = (float) r12
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 == 0) goto Ld6
            r12 = r6
            goto Ld7
        Ld6:
            r12 = r7
        Ld7:
            int r13 = r15.L
            if (r13 == r0) goto Ldd
            r13 = r6
            goto Lde
        Ldd:
            r13 = r7
        Lde:
            if (r1 != 0) goto Lef
            if (r9 != 0) goto Lef
            if (r12 != 0) goto Lef
            if (r10 != 0) goto Lef
            if (r13 != 0) goto Lef
            boolean r1 = r15.N
            if (r1 == 0) goto Led
            goto Lef
        Led:
            r1 = r7
            goto Lf0
        Lef:
            r1 = r6
        Lf0:
            r15.G = r4
            r15.Y = r5
            r15.y = r8
            r15.N = r7
            r15.L = r0
            float r4 = r15.F
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L101
            r7 = r6
        L101:
            r11.setLinearText(r7)
            r7 = r1
        L105:
            java.lang.CharSequence r1 = r15.C
            if (r1 == 0) goto L10d
            if (r7 == 0) goto L10c
            goto L10d
        L10c:
            return
        L10d:
            float r1 = r15.G
            r11.setTextSize(r1)
            android.graphics.Typeface r1 = r15.y
            r11.setTypeface(r1)
            float r1 = r15.Y
            r11.setLetterSpacing(r1)
            java.lang.CharSequence r1 = r15.B
            boolean r1 = r15.c(r1)
            r15.D = r1
            int r4 = r15.e0
            if (r4 > r6) goto L12c
            int r4 = r15.f0
            if (r4 <= r6) goto L12e
        L12c:
            if (r1 == 0) goto L130
        L12e:
            r10 = r6
            goto L131
        L130:
            r10 = r0
        L131:
            java.lang.CharSequence r12 = r15.B
            boolean r0 = r15.o()
            if (r0 == 0) goto L13a
            goto L13c
        L13a:
            float r3 = r15.F
        L13c:
            float r13 = r2 * r3
            boolean r14 = r15.D
            r9 = r15
            android.text.StaticLayout r0 = r9.e(r10, r11, r12, r13, r14)
            r15.Z = r0
            java.lang.CharSequence r0 = r0.getText()
            r15.C = r0
            return
    }

    public final android.text.StaticLayout e(int r4, android.text.TextPaint r5, java.lang.CharSequence r6, float r7, boolean r8) {
            r3 = this;
            r0 = 1
            if (r4 != r0) goto L6
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L29
        L6:
            int r1 = r3.f
            boolean r2 = r3.D
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r2)
            r1 = r1 & 7
            if (r1 == r0) goto L27
            boolean r0 = r3.D
            r2 = 5
            if (r1 == r2) goto L1f
            if (r0 == 0) goto L1c
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L29
        L1c:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L29
        L1f:
            if (r0 == 0) goto L24
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L29
        L24:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L29
        L27:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
        L29:
            int r7 = (int) r7
            mq6 r1 = new mq6
            r1.<init>(r6, r5, r7)
            android.text.TextUtils$TruncateAt r5 = r3.A
            r1.l = r5
            r1.k = r8
            r1.e = r0
            r5 = 0
            r1.j = r5
            r1.f = r4
            r4 = 0
            r1.g = r4
            float r4 = r3.g0
            r1.h = r4
            int r3 = r3.h0
            r1.i = r3
            r3 = 0
            r1.m = r3
            android.text.StaticLayout r3 = r1.a()
            r3.getClass()
            return r3
    }

    public final float f() {
            r2 = this;
            int r0 = r2.i0
            r1 = -1
            if (r0 == r1) goto L7
            float r2 = (float) r0
            return r2
        L7:
            float r0 = r2.i
            android.text.TextPaint r1 = r2.P
            r1.setTextSize(r0)
            android.graphics.Typeface r0 = r2.s
            r1.setTypeface(r0)
            float r2 = r2.W
            r1.setLetterSpacing(r2)
            float r2 = r1.ascent()
            float r2 = -r2
            return r2
    }

    public final int g(android.content.res.ColorStateList r2) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            int[] r1 = r1.M
            if (r1 == 0) goto Ld
            int r1 = r2.getColorForState(r1, r0)
            return r1
        Ld:
            int r1 = r2.getDefaultColor()
            return r1
    }

    public final void i(android.content.res.Configuration r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L30
            android.graphics.Typeface r0 = r2.u
            if (r0 == 0) goto L10
            android.graphics.Typeface r0 = defpackage.ln2.P(r3, r0)
            r2.t = r0
        L10:
            android.graphics.Typeface r0 = r2.x
            if (r0 == 0) goto L1a
            android.graphics.Typeface r3 = defpackage.ln2.P(r3, r0)
            r2.w = r3
        L1a:
            android.graphics.Typeface r3 = r2.t
            if (r3 == 0) goto L1f
            goto L21
        L1f:
            android.graphics.Typeface r3 = r2.u
        L21:
            r2.s = r3
            android.graphics.Typeface r3 = r2.w
            if (r3 == 0) goto L28
            goto L2a
        L28:
            android.graphics.Typeface r3 = r2.x
        L2a:
            r2.v = r3
            r3 = 1
            r2.j(r3)
        L30:
            return
    }

    public final void j(boolean r15) {
            r14 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r14.a
            int r1 = r0.getHeight()
            if (r1 <= 0) goto Le
            int r1 = r0.getWidth()
            if (r1 > 0) goto L10
        Le:
            if (r15 == 0) goto L199
        L10:
            r1 = 1065353216(0x3f800000, float:1.0)
            r14.d(r1, r15)
            java.lang.CharSequence r1 = r14.C
            android.text.TextPaint r2 = r14.O
            if (r1 == 0) goto L36
            android.text.StaticLayout r1 = r14.Z
            if (r1 == 0) goto L36
            boolean r1 = r14.o()
            java.lang.CharSequence r3 = r14.C
            if (r1 == 0) goto L34
            android.text.StaticLayout r1 = r14.Z
            int r1 = r1.getWidth()
            float r1 = (float) r1
            android.text.TextUtils$TruncateAt r4 = r14.A
            java.lang.CharSequence r3 = android.text.TextUtils.ellipsize(r3, r2, r1, r4)
        L34:
            r14.d0 = r3
        L36:
            java.lang.CharSequence r1 = r14.d0
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L47
            int r5 = r1.length()
            float r1 = r2.measureText(r1, r3, r5)
            r14.a0 = r1
            goto L49
        L47:
            r14.a0 = r4
        L49:
            int r1 = r14.g
            boolean r5 = r14.D
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r5)
            r5 = r1 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            android.graphics.Rect r9 = r14.d
            if (r5 == r7) goto L7d
            if (r5 == r6) goto L72
            float r5 = r2.descent()
            float r10 = r2.ascent()
            float r5 = r5 - r10
            float r5 = r5 / r8
            int r10 = r9.centerY()
            float r10 = (float) r10
            float r10 = r10 - r5
            r14.n = r10
            goto L82
        L72:
            int r5 = r9.bottom
            float r5 = (float) r5
            float r10 = r2.ascent()
            float r10 = r10 + r5
            r14.n = r10
            goto L82
        L7d:
            int r5 = r9.top
            float r5 = (float) r5
            r14.n = r5
        L82:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r5
            r10 = 5
            r11 = 1
            if (r1 == r11) goto L9b
            if (r1 == r10) goto L92
            int r1 = r9.left
            float r1 = (float) r1
            r14.p = r1
            goto La6
        L92:
            int r1 = r9.right
            float r1 = (float) r1
            float r12 = r14.a0
            float r1 = r1 - r12
            r14.p = r1
            goto La6
        L9b:
            int r1 = r9.centerX()
            float r1 = (float) r1
            float r12 = r14.a0
            float r12 = r12 / r8
            float r1 = r1 - r12
            r14.p = r1
        La6:
            float r1 = r14.a0
            int r12 = r9.width()
            float r12 = (float) r12
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 > 0) goto Lcc
            float r1 = r14.p
            int r12 = r9.left
            float r12 = (float) r12
            float r12 = r12 - r1
            float r12 = java.lang.Math.max(r4, r12)
            float r12 = r12 + r1
            r14.p = r12
            int r1 = r9.right
            float r1 = (float) r1
            float r13 = r14.a0
            float r13 = r13 + r12
            float r1 = r1 - r13
            float r1 = java.lang.Math.min(r4, r1)
            float r1 = r1 + r12
            r14.p = r1
        Lcc:
            float r1 = r14.i
            android.text.TextPaint r12 = r14.P
            r12.setTextSize(r1)
            android.graphics.Typeface r1 = r14.s
            r12.setTypeface(r1)
            float r1 = r14.W
            r12.setLetterSpacing(r1)
            float r1 = r12.ascent()
            float r1 = -r1
            float r12 = r12.descent()
            float r12 = r12 + r1
            int r1 = r9.height()
            float r1 = (float) r1
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 > 0) goto L10d
            float r1 = r14.n
            int r12 = r9.top
            float r12 = (float) r12
            float r12 = r12 - r1
            float r12 = java.lang.Math.max(r4, r12)
            float r12 = r12 + r1
            r14.n = r12
            int r1 = r9.bottom
            float r1 = (float) r1
            float r9 = r14.f()
            float r9 = r9 + r12
            float r1 = r1 - r9
            float r1 = java.lang.Math.min(r4, r1)
            float r1 = r1 + r12
            r14.n = r1
        L10d:
            r14.d(r4, r15)
            android.text.StaticLayout r15 = r14.Z
            if (r15 == 0) goto L11a
            int r15 = r15.getHeight()
            float r15 = (float) r15
            goto L11b
        L11a:
            r15 = r4
        L11b:
            android.text.StaticLayout r1 = r14.Z
            if (r1 == 0) goto L129
            int r9 = r14.e0
            if (r9 <= r11) goto L129
            int r1 = r1.getWidth()
            float r1 = (float) r1
            goto L137
        L129:
            java.lang.CharSequence r1 = r14.C
            if (r1 == 0) goto L136
            int r9 = r1.length()
            float r1 = r2.measureText(r1, r3, r9)
            goto L137
        L136:
            r1 = r4
        L137:
            android.text.StaticLayout r9 = r14.Z
            if (r9 == 0) goto L140
            int r9 = r9.getLineCount()
            goto L141
        L140:
            r9 = r3
        L141:
            r14.l = r9
            int r9 = r14.f
            boolean r12 = r14.D
            int r9 = android.view.Gravity.getAbsoluteGravity(r9, r12)
            r12 = r9 & 112(0x70, float:1.57E-43)
            android.graphics.Rect r13 = r14.c
            if (r12 == r7) goto L16d
            if (r12 == r6) goto L15d
            float r15 = r15 / r8
            int r2 = r13.centerY()
            float r2 = (float) r2
            float r2 = r2 - r15
            r14.m = r2
            goto L172
        L15d:
            int r6 = r13.bottom
            float r6 = (float) r6
            float r6 = r6 - r15
            boolean r15 = r14.k0
            if (r15 == 0) goto L169
            float r4 = r2.descent()
        L169:
            float r6 = r6 + r4
            r14.m = r6
            goto L172
        L16d:
            int r15 = r13.top
            float r15 = (float) r15
            r14.m = r15
        L172:
            r15 = r9 & r5
            if (r15 == r11) goto L185
            if (r15 == r10) goto L17e
            int r15 = r13.left
            float r15 = (float) r15
            r14.o = r15
            goto L18e
        L17e:
            int r15 = r13.right
            float r15 = (float) r15
            float r15 = r15 - r1
            r14.o = r15
            goto L18e
        L185:
            int r15 = r13.centerX()
            float r15 = (float) r15
            float r1 = r1 / r8
            float r15 = r15 - r1
            r14.o = r15
        L18e:
            float r15 = r14.b
            r14.d(r15, r3)
            r0.postInvalidateOnAnimation()
            r14.b()
        L199:
            return
    }

    public final void k(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.k
            if (r0 != r2) goto La
            android.content.res.ColorStateList r0 = r1.j
            if (r0 == r2) goto L9
            goto La
        L9:
            return
        La:
            r1.k = r2
            r1.j = r2
            r2 = 0
            r1.j(r2)
            return
    }

    public final boolean l(android.graphics.Typeface r3) {
            r2 = this;
            pj0 r0 = r2.z
            r1 = 1
            if (r0 == 0) goto L7
            r0.g = r1
        L7:
            android.graphics.Typeface r0 = r2.u
            if (r0 == r3) goto L28
            r2.u = r3
            com.google.android.material.textfield.TextInputLayout r0 = r2.a
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.graphics.Typeface r3 = defpackage.ln2.P(r0, r3)
            r2.t = r3
            if (r3 != 0) goto L25
            android.graphics.Typeface r3 = r2.u
        L25:
            r2.s = r3
            return r1
        L28:
            r2 = 0
            return r2
    }

    public final void m(float r3) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r3 = r0
            goto Le
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            float r0 = r2.b
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L19
            r2.b = r3
            r2.b()
        L19:
            return
    }

    public final void n(android.graphics.Typeface r4) {
            r3 = this;
            boolean r0 = r3.l(r4)
            android.graphics.Typeface r1 = r3.x
            r2 = 0
            if (r1 == r4) goto L27
            r3.x = r4
            com.google.android.material.textfield.TextInputLayout r1 = r3.a
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            android.graphics.Typeface r4 = defpackage.ln2.P(r1, r4)
            r3.w = r4
            if (r4 != 0) goto L23
            android.graphics.Typeface r4 = r3.x
        L23:
            r3.v = r4
            r4 = 1
            goto L28
        L27:
            r4 = r2
        L28:
            if (r0 != 0) goto L2e
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            return
        L2e:
            r3.j(r2)
            return
    }

    public final boolean o() {
            r1 = this;
            int r1 = r1.f0
            r0 = 1
            if (r1 != r0) goto L6
            return r0
        L6:
            r1 = 0
            return r1
    }
}
