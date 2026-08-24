package me.magnum.melonds.translator.ui;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class GameTranslationOverlayView extends android.view.View {
    public final defpackage.o41 A;
    public long A0;
    public final java.util.ArrayList B;
    public defpackage.jp2 B0;
    public final android.graphics.RectF C0;
    public final android.graphics.RectF D0;
    public final android.graphics.RectF E0;
    public me.magnum.melonds.translator.ui.GameTranslationOverlayView.a F0;
    public int G0;
    public float H0;
    public float I0;
    public final android.graphics.RectF J0;
    public final android.graphics.RectF K0;
    public final java.util.ArrayList L;
    public final android.graphics.Paint L0;
    public final android.graphics.Paint M0;
    public final android.graphics.Paint N0;
    public final android.graphics.Paint O0;
    public final android.graphics.Paint P0;
    public final android.graphics.Paint Q0;
    public defpackage.ya7 R;
    public final android.graphics.Paint R0;
    public final android.text.TextPaint S0;
    public final android.graphics.Paint T0;
    public final android.graphics.Paint U0;
    public final android.graphics.Paint V0;
    public final android.graphics.Paint W0;
    public final android.graphics.Paint X0;
    public final android.graphics.Paint Y0;
    public final android.graphics.Paint Z0;
    public final android.graphics.Paint a1;
    public final android.graphics.Paint b1;
    public final android.graphics.Paint c1;
    public float d0;
    public final android.graphics.Paint d1;
    public float e0;
    public final android.graphics.Paint e1;
    public boolean f0;
    public final android.graphics.Paint f1;
    public defpackage.on2 g0;
    public final android.graphics.Paint g1;
    public defpackage.qn2 h0;
    public final android.graphics.Paint h1;
    public defpackage.on2 i0;
    public float i1;
    public defpackage.qn2 j0;
    public final android.graphics.RectF j1;
    public defpackage.qn2 k0;
    public final android.graphics.RectF k1;
    public boolean l0;
    public final android.graphics.RectF l1;
    public boolean m0;
    public final android.graphics.RectF m1;
    public float n0;
    public defpackage.on2 n1;
    public float o0;
    public final defpackage.n0 o1;
    public final float p0;
    public boolean q0;
    public float r0;
    public float s0;
    public boolean t0;
    public final android.os.Handler u0;
    public boolean v0;
    public boolean w0;
    public float x0;
    public float y0;
    public final android.graphics.RectF z0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public enum a extends java.lang.Enum {
        private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
        private static final /* synthetic */ me.magnum.melonds.translator.ui.GameTranslationOverlayView.a[] $VALUES = null;
        public static final me.magnum.melonds.translator.ui.GameTranslationOverlayView.a DRAW_NEW = null;
        public static final me.magnum.melonds.translator.ui.GameTranslationOverlayView.a MOVE_REGION = null;
        public static final me.magnum.melonds.translator.ui.GameTranslationOverlayView.a NONE = null;
        public static final me.magnum.melonds.translator.ui.GameTranslationOverlayView.a RESIZE_REGION = null;

        private static final /* synthetic */ me.magnum.melonds.translator.ui.GameTranslationOverlayView.a[] $values() {
                me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r0 = me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.NONE
                me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r1 = me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.DRAW_NEW
                me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r2 = me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.MOVE_REGION
                me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r3 = me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.RESIZE_REGION
                me.magnum.melonds.translator.ui.GameTranslationOverlayView$a[] r0 = new me.magnum.melonds.translator.ui.GameTranslationOverlayView.a[]{r0, r1, r2, r3}
                return r0
        }

        static {
                me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r0 = new me.magnum.melonds.translator.ui.GameTranslationOverlayView$a
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.NONE = r0
                me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r0 = new me.magnum.melonds.translator.ui.GameTranslationOverlayView$a
                java.lang.String r1 = "DRAW_NEW"
                r2 = 1
                r0.<init>(r1, r2)
                me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.DRAW_NEW = r0
                me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r0 = new me.magnum.melonds.translator.ui.GameTranslationOverlayView$a
                java.lang.String r1 = "MOVE_REGION"
                r2 = 2
                r0.<init>(r1, r2)
                me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.MOVE_REGION = r0
                me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r0 = new me.magnum.melonds.translator.ui.GameTranslationOverlayView$a
                java.lang.String r1 = "RESIZE_REGION"
                r2 = 3
                r0.<init>(r1, r2)
                me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.RESIZE_REGION = r0
                me.magnum.melonds.translator.ui.GameTranslationOverlayView$a[] r0 = $values()
                me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.$VALUES = r0
                u52 r0 = defpackage.nc1.L(r0)
                me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.$ENTRIES = r0
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static defpackage.t52 getEntries() {
                t52 r0 = me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.$ENTRIES
                return r0
        }

        public static me.magnum.melonds.translator.ui.GameTranslationOverlayView.a valueOf(java.lang.String r1) {
                java.lang.Class<me.magnum.melonds.translator.ui.GameTranslationOverlayView$a> r0 = me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r1 = (me.magnum.melonds.translator.ui.GameTranslationOverlayView.a) r1
                return r1
        }

        public static me.magnum.melonds.translator.ui.GameTranslationOverlayView.a[] values() {
                me.magnum.melonds.translator.ui.GameTranslationOverlayView$a[] r0 = me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.$VALUES
                java.lang.Object r0 = r0.clone()
                me.magnum.melonds.translator.ui.GameTranslationOverlayView$a[] r0 = (me.magnum.melonds.translator.ui.GameTranslationOverlayView.a[]) r0
                return r0
        }
    }

    public GameTranslationOverlayView(android.content.Context r17, android.util.AttributeSet r18) {
            r16 = this;
            r0 = r16
            r17.getClass()
            r1 = 0
            r2 = r17
            r3 = r18
            r0.<init>(r2, r3, r1)
            xe1 r2 = defpackage.xk1.a
            jv2 r2 = defpackage.e04.a
            gu6 r3 = defpackage.oi2.c()
            r2.getClass()
            l61 r2 = defpackage.jw2.y(r2, r3)
            o41 r2 = defpackage.g04.i(r2)
            r0.A = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.B = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.L = r2
            ya7 r2 = defpackage.ya7.SMART_BACKGROUND_MATCH
            r0.R = r2
            r2 = 1064011039(0x3f6b851f, float:0.92)
            r0.d0 = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.e0 = r2
            r2 = 1
            r0.l0 = r2
            r3 = 1116471296(0x428c0000, float:70.0)
            r0.n0 = r3
            r3 = 1133248512(0x438c0000, float:280.0)
            r0.o0 = r3
            r3 = 1115815936(0x42820000, float:65.0)
            r0.p0 = r3
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r4)
            r0.u0 = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r0.z0 = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r0.C0 = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r0.D0 = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r0.E0 = r3
            me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r3 = me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.NONE
            r0.F0 = r3
            r3 = -1
            r0.G0 = r3
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r0.J0 = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r0.K0 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r2)
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r4.setStyle(r5)
            r0.L0 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r2)
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r4.setStyle(r6)
            r7 = 1075838976(0x40200000, float:2.5)
            r4.setStrokeWidth(r7)
            java.lang.String r7 = "#4DFFFFFF"
            int r7 = android.graphics.Color.parseColor(r7)
            r4.setColor(r7)
            r0.M0 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r2)
            r4.setStyle(r5)
            java.lang.String r7 = "#80000000"
            int r7 = android.graphics.Color.parseColor(r7)
            r4.setColor(r7)
            r0.N0 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r2)
            r4.setStyle(r5)
            java.lang.String r7 = "#E60F172A"
            int r8 = android.graphics.Color.parseColor(r7)
            r4.setColor(r8)
            r0.O0 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r2)
            r4.setStyle(r5)
            java.lang.String r8 = "#4D00E5FF"
            int r8 = android.graphics.Color.parseColor(r8)
            r4.setColor(r8)
            r0.P0 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r2)
            r4.setStyle(r6)
            r8 = 1080033280(0x40600000, float:3.5)
            r4.setStrokeWidth(r8)
            java.lang.String r9 = "#FF00E5FF"
            int r9 = android.graphics.Color.parseColor(r9)
            r4.setColor(r9)
            r0.Q0 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r2)
            java.lang.String r9 = "#00E5FF"
            int r10 = android.graphics.Color.parseColor(r9)
            r4.setColor(r10)
            android.graphics.Paint$Align r10 = android.graphics.Paint.Align.CENTER
            r4.setTextAlign(r10)
            java.lang.String r11 = "sans-serif-medium"
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r11, r2)
            r4.setTypeface(r12)
            r12 = 1105199104(0x41e00000, float:28.0)
            r4.setTextSize(r12)
            r0.R0 = r4
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>(r2)
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r11, r2)
            r4.setTypeface(r12)
            r0.S0 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r2)
            r4.setStyle(r6)
            r12 = 1086324736(0x40c00000, float:6.0)
            r4.setStrokeWidth(r12)
            int r12 = android.graphics.Color.parseColor(r9)
            r4.setColor(r12)
            android.graphics.Paint$Cap r12 = android.graphics.Paint.Cap.ROUND
            r4.setStrokeCap(r12)
            r0.T0 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r2)
            r4.setStyle(r5)
            r12 = 55
            r13 = 229(0xe5, float:3.21E-43)
            r14 = 255(0xff, float:3.57E-43)
            int r12 = android.graphics.Color.argb(r12, r1, r13, r14)
            r4.setColor(r12)
            r0.U0 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r2)
            r4.setStyle(r6)
            r12 = 1077936128(0x40400000, float:3.0)
            r4.setStrokeWidth(r12)
            int r12 = android.graphics.Color.parseColor(r9)
            r4.setColor(r12)
            android.graphics.DashPathEffect r12 = new android.graphics.DashPathEffect
            r15 = 2
            float[] r15 = new float[r15]
            r15 = {x02aa: FILL_ARRAY_DATA  , data: [1097859072, 1092616192} // fill-array
            r3 = 0
            r12.<init>(r15, r3)
            r4.setPathEffect(r12)
            r0.V0 = r4
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r2)
            r3.setStyle(r5)
            int r4 = android.graphics.Color.parseColor(r7)
            r3.setColor(r4)
            r0.W0 = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r2)
            int r4 = android.graphics.Color.parseColor(r9)
            r3.setColor(r4)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT_BOLD
            r3.setTypeface(r4)
            r4 = 1102053376(0x41b00000, float:22.0)
            r3.setTextSize(r4)
            r3.setTextAlign(r10)
            r0.X0 = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r2)
            r3.setStyle(r5)
            r12 = 45
            int r1 = android.graphics.Color.argb(r12, r1, r13, r14)
            r3.setColor(r1)
            r0.Y0 = r3
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r2)
            r1.setStyle(r6)
            r1.setStrokeWidth(r8)
            int r3 = android.graphics.Color.parseColor(r9)
            r1.setColor(r3)
            r0.Z0 = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r2)
            r1.setStyle(r5)
            int r3 = android.graphics.Color.parseColor(r9)
            r1.setColor(r3)
            r0.a1 = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r2)
            r1.setStyle(r5)
            int r3 = android.graphics.Color.parseColor(r7)
            r1.setColor(r3)
            r0.b1 = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r2)
            int r3 = android.graphics.Color.parseColor(r9)
            r1.setColor(r3)
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r11, r2)
            r1.setTypeface(r3)
            r1.setTextSize(r4)
            r0.c1 = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r2)
            r1.setStyle(r5)
            java.lang.String r3 = "#CCEF4444"
            int r3 = android.graphics.Color.parseColor(r3)
            r1.setColor(r3)
            r0.d1 = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r2)
            r3 = -1
            r1.setColor(r3)
            r1.setTextAlign(r10)
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r11, r2)
            r1.setTypeface(r3)
            r3 = 1101004800(0x41a00000, float:20.0)
            r1.setTextSize(r3)
            r0.e1 = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r2)
            r1.setStyle(r5)
            int r3 = android.graphics.Color.parseColor(r7)
            r1.setColor(r3)
            r0.f1 = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r2)
            r1.setStyle(r6)
            r3 = 1073741824(0x40000000, float:2.0)
            r1.setStrokeWidth(r3)
            java.lang.String r3 = "#8000E5FF"
            int r3 = android.graphics.Color.parseColor(r3)
            r1.setColor(r3)
            r0.g1 = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r2)
            r3 = -1
            r1.setColor(r3)
            r1.setTextAlign(r10)
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r11, r2)
            r1.setTypeface(r2)
            r2 = 1103101952(0x41c00000, float:24.0)
            r1.setTextSize(r2)
            r0.h1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.j1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.k1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.l1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.m1 = r1
            n0 r1 = new n0
            r2 = 28
            r1.<init>(r0, r2)
            r0.o1 = r1
            return
    }

    public final void a() {
            r1 = this;
            java.util.ArrayList r0 = r1.B
            r0.clear()
            r0 = 0
            r1.B0 = r0
            r0 = 0
            r1.setTranslating(r0)
            r1.invalidate()
            return
    }

    public final void b(android.graphics.Canvas r1, android.graphics.RectF r2, float r3, float r4, float r5, float r6, java.lang.String r7, java.lang.String r8) {
            r0 = this;
            float r5 = r5 + r3
            float r6 = r6 + r4
            r2.set(r3, r4, r5, r6)
            int r3 = android.graphics.Color.parseColor(r8)
            int r4 = android.graphics.Color.red(r3)
            int r5 = android.graphics.Color.green(r3)
            int r6 = android.graphics.Color.blue(r3)
            r8 = 45
            int r4 = android.graphics.Color.argb(r8, r4, r5, r6)
            android.graphics.Paint r5 = r0.f1
            r5.setColor(r4)
            android.graphics.Paint r4 = r0.g1
            r4.setColor(r3)
            r6 = 1075838976(0x40200000, float:2.5)
            r4.setStrokeWidth(r6)
            android.graphics.Paint r6 = r0.h1
            r6.setColor(r3)
            r3 = 1096810496(0x41600000, float:14.0)
            r1.drawRoundRect(r2, r3, r3, r5)
            r1.drawRoundRect(r2, r3, r3, r4)
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r3 = 1097334784(0x41680000, float:14.5)
            float r0 = r0 * r3
            r3 = 1103626240(0x41c80000, float:25.0)
            float r0 = java.lang.Math.max(r3, r0)
            r6.setTextSize(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r6.setTypeface(r0)
            float r0 = r2.centerY()
            float r3 = r6.descent()
            float r4 = r6.ascent()
            float r4 = r4 + r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r3
            float r0 = r0 - r4
            float r2 = r2.centerX()
            r1.drawText(r7, r2, r0, r6)
            return
    }

    public final float getBubbleOpacity() {
            r0 = this;
            float r0 = r0.d0
            return r0
    }

    public final java.util.List<defpackage.ua7> getCustomRegions() {
            r0 = this;
            java.util.ArrayList r0 = r0.L
            return r0
    }

    public final float getFontSizeScale() {
            r0 = this;
            float r0 = r0.e0
            return r0
    }

    public final defpackage.on2 getOnDismissRequested() {
            r0 = this;
            on2 r0 = r0.i0
            return r0
    }

    public final defpackage.on2 getOnFloatingButtonLongClickListener() {
            r0 = this;
            on2 r0 = r0.n1
            return r0
    }

    public final defpackage.qn2 getOnLassoRegionSelected() {
            r0 = this;
            qn2 r0 = r0.h0
            return r0
    }

    public final defpackage.qn2 getOnRegionsSaved() {
            r0 = this;
            qn2 r0 = r0.j0
            return r0
    }

    public final defpackage.qn2 getOnSpeakWordRequested() {
            r0 = this;
            qn2 r0 = r0.k0
            return r0
    }

    public final defpackage.on2 getOnTriggerTranslationRequested() {
            r0 = this;
            on2 r0 = r0.g0
            return r0
    }

    public final defpackage.ya7 getOverlayStyle() {
            r0 = this;
            ya7 r0 = r0.R
            return r0
    }

    public final boolean getShowFloatingButton() {
            r0 = this;
            boolean r0 = r0.l0
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r49) {
            r48 = this;
            r0 = r48
            r1 = r49
            r1.getClass()
            super.onDraw(r49)
            int r2 = r0.getWidth()
            float r6 = (float) r2
            int r2 = r0.getHeight()
            float r7 = (float) r2
            r2 = 0
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 <= 0) goto L8be
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 > 0) goto L1f
            goto L8be
        L1f:
            boolean r3 = r0.m0
            java.lang.String r9 = "✕"
            android.graphics.Paint r10 = r0.d1
            android.graphics.Paint r15 = r0.N0
            r16 = 1111490560(0x42400000, float:48.0)
            r17 = 1107296256(0x42000000, float:32.0)
            r18 = 1102053376(0x41b00000, float:22.0)
            android.graphics.Paint r13 = r0.e1
            r19 = 1096810496(0x41600000, float:14.0)
            r20 = 1101004800(0x41a00000, float:20.0)
            android.graphics.Paint r12 = r0.M0
            android.graphics.Paint r5 = r0.Z0
            android.graphics.Paint r4 = r0.L0
            r24 = 1077936128(0x40400000, float:3.0)
            r25 = 1092616192(0x41200000, float:10.0)
            r26 = 1082130432(0x40800000, float:4.0)
            r27 = 1094713344(0x41400000, float:12.0)
            r14 = 0
            r29 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L211
            r3 = 125(0x7d, float:1.75E-43)
            int r3 = android.graphics.Color.argb(r3, r14, r14, r14)
            r1.drawColor(r3)
            java.util.ArrayList r3 = r0.L
            int r14 = r3.size()
            r11 = 0
        L56:
            r31 = 1107820544(0x42080000, float:34.0)
            android.graphics.Paint r2 = r0.Y0
            if (r11 >= r14) goto L11f
            java.lang.Object r30 = r3.get(r11)
            r8 = r30
            ua7 r8 = (defpackage.ua7) r8
            android.graphics.RectF r8 = r8.b
            r34 = r3
            float r3 = r8.left
            float r3 = r3 * r6
            r35 = r6
            float r6 = r8.top
            float r6 = r6 * r7
            r36 = r7
            float r7 = r8.right
            float r7 = r7 * r35
            float r8 = r8.bottom
            float r8 = r8 * r36
            r30 = r11
            android.graphics.RectF r11 = new android.graphics.RectF
            r11.<init>(r3, r6, r7, r8)
            r37 = r6
            r6 = 1090519040(0x41000000, float:8.0)
            r1.drawRoundRect(r11, r6, r6, r2)
            r1.drawRoundRect(r11, r6, r6, r5)
            android.content.Context r2 = r0.getContext()
            int r11 = r30 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r30 = r11
            r11 = 2131952755(0x7f130473, float:1.9541962E38)
            java.lang.String r2 = r2.getString(r11, r6)
            r2.getClass()
            android.graphics.Paint r6 = r0.c1
            float r11 = r6.measureText(r2)
            float r11 = r11 + r20
            r38 = r11
            android.graphics.RectF r11 = new android.graphics.RectF
            float r39 = r37 - r31
            r40 = r14
            float r14 = r39 - r26
            r39 = r12
            r12 = 0
            float r14 = java.lang.Math.max(r12, r14)
            float r12 = r3 + r38
            r38 = r4
            float r4 = r37 - r26
            r41 = r15
            r15 = r31
            float r4 = java.lang.Math.max(r15, r4)
            r11.<init>(r3, r14, r12, r4)
            android.graphics.Paint r3 = r0.b1
            r4 = 1086324736(0x40c00000, float:6.0)
            r1.drawRoundRect(r11, r4, r4, r3)
            r1.drawRoundRect(r11, r4, r4, r5)
            float r3 = r11.left
            float r3 = r3 + r25
            float r4 = r11.bottom
            r11 = 1091567616(0x41100000, float:9.0)
            float r4 = r4 - r11
            r1.drawText(r2, r3, r4, r6)
            float r2 = r7 - r26
            float r6 = r37 + r26
            r3 = 1099956224(0x41900000, float:18.0)
            r1.drawCircle(r2, r6, r3, r10)
            float r3 = r13.descent()
            float r4 = r13.ascent()
            float r4 = r4 + r3
            float r4 = r4 / r29
            float r6 = r6 - r4
            r1.drawText(r9, r2, r6, r13)
            android.graphics.RectF r2 = new android.graphics.RectF
            float r3 = r7 - r18
            float r4 = r8 - r18
            r2.<init>(r3, r4, r7, r8)
            android.graphics.Paint r3 = r0.a1
            r4 = r26
            r1.drawRoundRect(r2, r4, r4, r3)
            r11 = r30
            r3 = r34
            r6 = r35
            r7 = r36
            r4 = r38
            r12 = r39
            r14 = r40
            r15 = r41
            goto L56
        L11f:
            r38 = r4
            r36 = r7
            r39 = r12
            r41 = r15
            me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r3 = r0.F0
            me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r4 = me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.DRAW_NEW
            if (r3 != r4) goto L137
            android.graphics.RectF r3 = r0.K0
            r6 = 1090519040(0x41000000, float:8.0)
            r1.drawRoundRect(r3, r6, r6, r2)
            r1.drawRoundRect(r3, r6, r6, r5)
        L137:
            android.content.Context r2 = r0.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1126170624(0x43200000, float:160.0)
            float r3 = r3 * r2
            r4 = 1130102784(0x435c0000, float:220.0)
            float r3 = java.lang.Math.max(r4, r3)
            r4 = 1115947008(0x42840000, float:66.0)
            float r5 = r2 * r16
            float r6 = java.lang.Math.max(r4, r5)
            float r8 = r2 * r27
            r4 = 1098907648(0x41800000, float:16.0)
            float r9 = java.lang.Math.max(r4, r8)
            float r12 = r2 * r19
            r5 = 1099956224(0x41900000, float:18.0)
            float r5 = java.lang.Math.max(r5, r12)
            r26 = 1082130432(0x40800000, float:4.0)
            float r8 = r6 * r26
            float r7 = r9 * r24
            float r7 = r7 + r8
            float r8 = r5 * r29
            float r8 = r8 + r7
            float r2 = r2 * r4
            r4 = 1103101952(0x41c00000, float:24.0)
            float r2 = java.lang.Math.max(r4, r2)
            float r7 = r36 - r8
            float r7 = r7 / r29
            float r4 = java.lang.Math.max(r4, r7)
            android.graphics.RectF r7 = new android.graphics.RectF
            float r10 = r2 + r3
            float r8 = r8 + r4
            r7.<init>(r2, r4, r10, r8)
            r10 = r20
            r8 = r41
            r1.drawRoundRect(r7, r10, r10, r8)
            java.lang.String r8 = "#E60F172A"
            int r8 = android.graphics.Color.parseColor(r8)
            r11 = r38
            r11.setColor(r8)
            r1.drawRoundRect(r7, r10, r10, r11)
            java.lang.String r8 = "#4D00E5FF"
            int r8 = android.graphics.Color.parseColor(r8)
            r12 = r39
            r12.setColor(r8)
            r1.drawRoundRect(r7, r10, r10, r12)
            float r4 = r4 + r5
            r22 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 + r22
            float r5 = r3 - r17
            android.content.Context r3 = r0.getContext()
            r7 = 2131952727(0x7f130457, float:1.9541905E38)
            java.lang.String r7 = r3.getString(r7)
            r7.getClass()
            java.lang.String r8 = "#00E5FF"
            r3 = r2
            android.graphics.RectF r2 = r0.j1
            r0.b(r1, r2, r3, r4, r5, r6, r7, r8)
            float r9 = r9 + r6
            float r4 = r4 + r9
            android.content.Context r1 = r0.getContext()
            r2 = 2131952731(0x7f13045b, float:1.9541913E38)
            java.lang.String r7 = r1.getString(r2)
            r7.getClass()
            java.lang.String r8 = "#FFAA00"
            android.graphics.RectF r2 = r0.k1
            r1 = r49
            r0.b(r1, r2, r3, r4, r5, r6, r7, r8)
            float r4 = r4 + r9
            android.content.Context r1 = r0.getContext()
            r2 = 2131952759(0x7f130477, float:1.954197E38)
            java.lang.String r7 = r1.getString(r2)
            r7.getClass()
            java.lang.String r8 = "#10B981"
            android.graphics.RectF r2 = r0.l1
            r1 = r49
            r0.b(r1, r2, r3, r4, r5, r6, r7, r8)
            float r4 = r4 + r9
            android.content.Context r1 = r0.getContext()
            r2 = 2131952732(0x7f13045c, float:1.9541915E38)
            java.lang.String r7 = r1.getString(r2)
            r7.getClass()
            java.lang.String r8 = "#EF4444"
            android.graphics.RectF r2 = r0.m1
            r1 = r49
            r0.b(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L211:
            r11 = r4
            r35 = r6
            r36 = r7
            r8 = r15
            r6 = r0
            java.util.ArrayList r0 = r6.B
            int r2 = r0.size()
            r3 = 0
        L21f:
            if (r3 >= r2) goto L54c
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            ta7 r4 = (defpackage.ta7) r4
            android.graphics.RectF r15 = r4.c
            r32 = 1066611507(0x3f933333, float:1.15)
            float r7 = r15.left
            float r7 = r7 * r35
            float r14 = r15.top
            float r14 = r14 * r36
            r37 = r0
            float r0 = r15.right
            float r0 = r0 * r35
            float r15 = r15.bottom
            float r15 = r15 * r36
            r38 = r0
            java.lang.String r0 = r4.b
            boolean r39 = defpackage.qs6.v0(r0)
            if (r39 == 0) goto L24c
            java.lang.String r0 = r4.a
        L24c:
            float r38 = r38 - r7
            r39 = r2
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            float r40 = r35 * r2
            int r40 = (r38 > r40 ? 1 : (r38 == r40 ? 0 : -1))
            r41 = 1042536202(0x3e23d70a, float:0.16)
            if (r40 > 0) goto L277
            r40 = r2
            int r2 = r0.length()
            r42 = r3
            r3 = 18
            if (r2 > r3) goto L27b
            float r2 = r36 * r40
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 <= 0) goto L275
            float r2 = r35 * r41
            int r2 = (r38 > r2 ? 1 : (r38 == r2 ? 0 : -1))
            if (r2 <= 0) goto L275
            goto L27b
        L275:
            r2 = 0
            goto L27c
        L277:
            r40 = r2
            r42 = r3
        L27b:
            r2 = 1
        L27c:
            if (r2 == 0) goto L281
            r3 = 1103101952(0x41c00000, float:24.0)
            goto L283
        L281:
            r3 = r27
        L283:
            if (r2 == 0) goto L288
            r43 = r27
            goto L28a
        L288:
            r43 = 1086324736(0x40c00000, float:6.0)
        L28a:
            if (r2 == 0) goto L296
            r44 = 1063675494(0x3f666666, float:0.9)
            float r44 = r44 * r35
        L291:
            r45 = r2
            r2 = r44
            goto L29b
        L296:
            float r44 = r3 * r29
            float r44 = r44 + r38
            goto L291
        L29b:
            float r44 = r3 * r29
            r46 = r3
            float r3 = r44 + r38
            float r2 = java.lang.Math.max(r3, r2)
            r22 = 1098907648(0x41800000, float:16.0)
            float r3 = r35 - r22
            int r38 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r38 <= 0) goto L2ae
            r2 = r3
        L2ae:
            if (r45 == 0) goto L2c2
            float r3 = r35 - r2
            float r3 = r3 / r29
            r33 = 1090519040(0x41000000, float:8.0)
            int r7 = (r3 > r33 ? 1 : (r3 == r33 ? 0 : -1))
            if (r7 >= 0) goto L2bc
            r3 = r33
        L2bc:
            r38 = r2
            r2 = r3
            r3 = r33
            goto L2da
        L2c2:
            r3 = 1090519040(0x41000000, float:8.0)
            float r7 = r7 - r46
            float r33 = r35 - r2
            float r33 = r33 - r3
            int r38 = (r33 > r3 ? 1 : (r33 == r3 ? 0 : -1))
            if (r38 >= 0) goto L2d2
            r38 = r2
            r2 = r3
            goto L2d6
        L2d2:
            r38 = r2
            r2 = r33
        L2d6:
            float r2 = defpackage.gi2.p(r7, r3, r2)
        L2da:
            float r7 = r2 + r38
            float r38 = r35 - r3
            int r3 = (r7 > r38 ? 1 : (r7 == r38 ? 0 : -1))
            if (r3 <= 0) goto L2e4
            r7 = r38
        L2e4:
            if (r45 == 0) goto L2e9
            r3 = 1119354880(0x42b80000, float:92.0)
            goto L2ef
        L2e9:
            float r3 = r15 - r14
            float r38 = r43 * r29
            float r3 = r38 + r3
        L2ef:
            float r15 = r15 - r14
            float r38 = r43 * r29
            float r15 = r38 + r15
            float r3 = java.lang.Math.max(r15, r3)
            r22 = 1098907648(0x41800000, float:16.0)
            float r15 = r36 - r22
            int r38 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r38 <= 0) goto L301
            r3 = r15
        L301:
            if (r45 == 0) goto L31b
            r15 = 1090519040(0x41000000, float:8.0)
            float r14 = r14 - r15
            float r33 = r36 - r3
            float r33 = r33 - r15
            int r38 = (r33 > r15 ? 1 : (r33 == r15 ? 0 : -1))
            if (r38 >= 0) goto L312
            r38 = r3
            r3 = r15
            goto L316
        L312:
            r38 = r3
            r3 = r33
        L316:
            float r3 = defpackage.gi2.p(r14, r15, r3)
            goto L331
        L31b:
            r38 = r3
            r15 = 1090519040(0x41000000, float:8.0)
            float r14 = r14 - r43
            float r3 = r36 - r38
            float r33 = r3 - r15
            int r3 = (r33 > r15 ? 1 : (r33 == r15 ? 0 : -1))
            if (r3 >= 0) goto L32b
            r3 = r15
            goto L32d
        L32b:
            r3 = r33
        L32d:
            float r3 = defpackage.gi2.p(r14, r15, r3)
        L331:
            float r14 = r3 + r38
            float r38 = r36 - r15
            int r15 = (r14 > r38 ? 1 : (r14 == r38 ? 0 : -1))
            if (r15 <= 0) goto L33b
            r14 = r38
        L33b:
            android.graphics.RectF r15 = new android.graphics.RectF
            r15.<init>(r2, r3, r7, r14)
            android.graphics.RectF r2 = new android.graphics.RectF
            float r3 = r15.left
            float r3 = r3 + r29
            float r7 = r15.top
            float r7 = r7 + r24
            float r14 = r15.right
            float r14 = r14 + r29
            r38 = r9
            float r9 = r15.bottom
            float r9 = r9 + r24
            r2.<init>(r3, r7, r14, r9)
            r3 = r19
            r1.drawRoundRect(r2, r3, r3, r8)
            int r2 = r4.d
            float r3 = r6.d0
            r7 = 1065353216(0x3f800000, float:1.0)
            r9 = r40
            float r3 = defpackage.gi2.p(r3, r9, r7)
            r9 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r9
            int r3 = (int) r3
            r9 = 60
            r14 = 255(0xff, float:3.57E-43)
            int r3 = defpackage.gi2.q(r3, r9, r14)
            int r9 = android.graphics.Color.red(r2)
            float r9 = (float) r9
            r40 = 1064178811(0x3f6e147b, float:0.93)
            float r9 = r9 * r40
            int r9 = (int) r9
            r43 = r7
            r7 = 0
            int r9 = defpackage.gi2.q(r9, r7, r14)
            int r7 = android.graphics.Color.green(r2)
            float r7 = (float) r7
            float r7 = r7 * r40
            int r7 = (int) r7
            r44 = r2
            r2 = 0
            int r7 = defpackage.gi2.q(r7, r2, r14)
            int r2 = android.graphics.Color.blue(r44)
            float r2 = (float) r2
            float r2 = r2 * r40
            int r2 = (int) r2
            r40 = r13
            r13 = 0
            int r2 = defpackage.gi2.q(r2, r13, r14)
            int r2 = android.graphics.Color.argb(r3, r9, r7, r2)
            r11.setColor(r2)
            r2 = 1096810496(0x41600000, float:14.0)
            r1.drawRoundRect(r15, r2, r2, r11)
            int r2 = android.graphics.Color.red(r44)
            float r2 = (float) r2
            float r2 = r2 * r32
            int r2 = (int) r2
            int r2 = defpackage.gi2.q(r2, r13, r14)
            int r7 = android.graphics.Color.green(r44)
            float r7 = (float) r7
            float r7 = r7 * r32
            int r7 = (int) r7
            int r7 = defpackage.gi2.q(r7, r13, r14)
            int r9 = android.graphics.Color.blue(r44)
            float r9 = (float) r9
            float r9 = r9 * r32
            int r9 = (int) r9
            int r9 = defpackage.gi2.q(r9, r13, r14)
            float r3 = (float) r3
            r13 = 1059481190(0x3f266666, float:0.65)
            float r3 = r3 * r13
            int r3 = (int) r3
            r13 = 30
            r14 = 200(0xc8, float:2.8E-43)
            int r3 = defpackage.gi2.q(r3, r13, r14)
            int r2 = android.graphics.Color.argb(r3, r2, r7, r9)
            r12.setColor(r2)
            r2 = r29
            r12.setStrokeWidth(r2)
            r2 = 1096810496(0x41600000, float:14.0)
            r1.drawRoundRect(r15, r2, r2, r12)
            int r2 = r4.e
            float r3 = r15.width()
            float r3 = r3 - r17
            int r3 = (int) r3
            r4 = 20
            int r3 = java.lang.Math.max(r4, r3)
            float r7 = r15.height()
            r20 = 1101004800(0x41a00000, float:20.0)
            float r7 = r7 - r20
            int r7 = (int) r7
            int r4 = java.lang.Math.max(r4, r7)
            float r7 = r15.height()
            r9 = 1052938076(0x3ec28f5c, float:0.38)
            float r7 = r7 * r9
            float r9 = r6.e0
            float r7 = r7 * r9
            r9 = r16
            r13 = r18
            float r7 = defpackage.gi2.p(r7, r13, r9)
            r13 = 32
            boolean r13 = defpackage.qs6.k0(r0, r13)
            if (r13 != 0) goto L435
            int r13 = r0.length()
            r14 = 15
            if (r13 >= r14) goto L435
            android.text.Layout$Alignment r13 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L437
        L435:
            android.text.Layout$Alignment r13 = android.text.Layout.Alignment.ALIGN_NORMAL
        L437:
            android.text.TextPaint r14 = r6.S0
            r14.setTextSize(r7)
            r14.setColor(r2)
            java.lang.String r9 = "sans-serif-medium"
            r32 = r2
            r2 = 1
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r9, r2)
            r14.setTypeface(r2)
            int r2 = r0.length()
            r9 = 0
            android.text.StaticLayout$Builder r2 = android.text.StaticLayout.Builder.obtain(r0, r9, r2, r14, r3)
            android.text.StaticLayout$Builder r2 = r2.setAlignment(r13)
            r30 = r7
            r7 = 1066863165(0x3f970a3d, float:1.18)
            r45 = r10
            r10 = r24
            android.text.StaticLayout$Builder r2 = r2.setLineSpacing(r10, r7)
            android.text.StaticLayout$Builder r2 = r2.setIncludePad(r9)
            android.text.StaticLayout r2 = r2.build()
            r2.getClass()
            r10 = r30
        L472:
            int r7 = r2.getHeight()
            if (r7 <= r4) goto L4a9
            r22 = 1098907648(0x41800000, float:16.0)
            int r7 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r7 <= 0) goto L4a9
            float r10 = r10 - r43
            r14.setTextSize(r10)
            int r2 = r0.length()
            android.text.StaticLayout$Builder r2 = android.text.StaticLayout.Builder.obtain(r0, r9, r2, r14, r3)
            android.text.StaticLayout$Builder r2 = r2.setAlignment(r13)
            r46 = r4
            r4 = 1066863165(0x3f970a3d, float:1.18)
            r7 = 1077936128(0x40400000, float:3.0)
            android.text.StaticLayout$Builder r2 = r2.setLineSpacing(r7, r4)
            android.text.StaticLayout$Builder r2 = r2.setIncludePad(r9)
            android.text.StaticLayout r2 = r2.build()
            r2.getClass()
            r4 = r46
            r9 = 0
            goto L472
        L4a9:
            float r4 = r15.left
            r22 = 1098907648(0x41800000, float:16.0)
            float r4 = r4 + r22
            float r7 = r15.top
            float r9 = r15.height()
            int r15 = r2.getHeight()
            float r15 = (float) r15
            float r9 = r9 - r15
            r29 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r29
            r15 = r25
            float r9 = java.lang.Math.max(r15, r9)
            float r9 = r9 + r7
            android.text.TextPaint r7 = new android.text.TextPaint
            r7.<init>(r14)
            android.graphics.Paint$Style r14 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r14)
            float r10 = r10 * r41
            r14 = 1075838976(0x40200000, float:2.5)
            r15 = 1086324736(0x40c00000, float:6.0)
            float r10 = defpackage.gi2.p(r10, r14, r15)
            r7.setStrokeWidth(r10)
            android.graphics.Paint$Cap r10 = android.graphics.Paint.Cap.ROUND
            r7.setStrokeCap(r10)
            android.graphics.Paint$Join r10 = android.graphics.Paint.Join.ROUND
            r7.setStrokeJoin(r10)
            float r10 = android.graphics.Color.luminance(r32)
            r14 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            r14 = 235(0xeb, float:3.3E-43)
            if (r10 <= 0) goto L4f9
            r10 = 0
            int r14 = android.graphics.Color.argb(r14, r10, r10, r10)
            goto L500
        L4f9:
            r10 = 0
            r15 = 255(0xff, float:3.57E-43)
            int r14 = android.graphics.Color.argb(r14, r15, r15, r15)
        L500:
            r7.setColor(r14)
            int r14 = r0.length()
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r0, r10, r14, r7, r3)
            android.text.StaticLayout$Builder r0 = r0.setAlignment(r13)
            r3 = 1066863165(0x3f970a3d, float:1.18)
            r7 = 1077936128(0x40400000, float:3.0)
            android.text.StaticLayout$Builder r0 = r0.setLineSpacing(r7, r3)
            android.text.StaticLayout$Builder r0 = r0.setIncludePad(r10)
            android.text.StaticLayout r0 = r0.build()
            r0.getClass()
            r1.save()
            r1.translate(r4, r9)
            r0.draw(r1)
            r2.draw(r1)
            r1.restore()
            r0 = r37
            r9 = r38
            r2 = r39
            r13 = r40
            r3 = r42
            r10 = r45
            r16 = 1111490560(0x42400000, float:48.0)
            r18 = 1102053376(0x41b00000, float:22.0)
            r19 = 1096810496(0x41600000, float:14.0)
            r24 = 1077936128(0x40400000, float:3.0)
            r25 = 1092616192(0x41200000, float:10.0)
            r29 = 1073741824(0x40000000, float:2.0)
            goto L21f
        L54c:
            r38 = r9
            r45 = r10
            r40 = r13
            r32 = 1066611507(0x3f933333, float:1.15)
            boolean r0 = r6.v0
            android.graphics.Paint r2 = r6.X0
            android.graphics.Paint r3 = r6.W0
            r7 = 1088421888(0x40e00000, float:7.0)
            if (r0 == 0) goto L593
            r0 = 1062836634(0x3f59999a, float:0.85)
            float r0 = r0 * r35
            r4 = 1137836032(0x43d20000, float:420.0)
            float r0 = java.lang.Math.min(r0, r4)
            android.graphics.RectF r4 = new android.graphics.RectF
            float r9 = r35 - r0
            r29 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r29
            float r0 = r35 + r0
            float r0 = r0 / r29
            r10 = 1116209152(0x42880000, float:68.0)
            r13 = 1103101952(0x41c00000, float:24.0)
            r4.<init>(r9, r13, r0, r10)
            r0 = r27
            r1.drawRoundRect(r4, r0, r0, r3)
            r1.drawRoundRect(r4, r0, r0, r5)
            float r0 = r4.centerX()
            float r4 = r4.centerY()
            float r4 = r4 + r7
            java.lang.String r9 = "👆 Выделите рамку пальцем на экране"
            r1.drawText(r9, r0, r4, r2)
        L593:
            boolean r0 = r6.w0
            r4 = 1110441984(0x42300000, float:44.0)
            r9 = 1108344832(0x42100000, float:36.0)
            if (r0 == 0) goto L5ee
            android.graphics.RectF r0 = r6.z0
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto L5ee
            android.graphics.Paint r10 = r6.U0
            r15 = 1092616192(0x41200000, float:10.0)
            r1.drawRoundRect(r0, r15, r15, r10)
            android.graphics.Paint r10 = r6.V0
            r1.drawRoundRect(r0, r15, r15, r10)
            android.graphics.RectF r10 = new android.graphics.RectF
            float r13 = r0.centerX()
            r14 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 - r14
            float r15 = r0.top
            float r15 = r15 - r9
            r28 = 1086324736(0x40c00000, float:6.0)
            float r15 = r15 - r28
            r16 = r7
            r7 = 1090519040(0x41000000, float:8.0)
            float r15 = java.lang.Math.max(r7, r15)
            float r17 = r0.centerX()
            float r14 = r17 + r14
            float r0 = r0.top
            float r0 = r0 - r28
            float r0 = java.lang.Math.max(r4, r0)
            r10.<init>(r13, r15, r14, r0)
            r1.drawRoundRect(r10, r7, r7, r3)
            r1.drawRoundRect(r10, r7, r7, r5)
            float r0 = r10.centerX()
            float r3 = r10.centerY()
            float r3 = r3 + r16
            java.lang.String r5 = "🔍 Перевести область"
            r1.drawText(r5, r0, r3, r2)
            goto L5f0
        L5ee:
            r16 = r7
        L5f0:
            jp2 r7 = r6.B0
            if (r7 == 0) goto L814
            r0 = 1064011039(0x3f6b851f, float:0.92)
            float r0 = r0 * r35
            r2 = 1141309440(0x44070000, float:540.0)
            float r0 = java.lang.Math.min(r0, r2)
            r2 = 1060320051(0x3f333333, float:0.7)
            float r2 = r2 * r36
            r3 = 1136525312(0x43be0000, float:380.0)
            float r2 = java.lang.Math.min(r2, r3)
            float r3 = r35 - r0
            r29 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r29
            float r5 = r36 - r2
            float r5 = r5 / r29
            float r0 = r0 + r3
            float r2 = r2 + r5
            android.graphics.RectF r10 = r6.C0
            r10.set(r3, r5, r0, r2)
            r0 = 130(0x82, float:1.82E-43)
            r2 = 0
            int r0 = android.graphics.Color.argb(r0, r2, r2, r2)
            r1.drawColor(r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            float r2 = r10.left
            r26 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 + r26
            float r3 = r10.top
            r28 = 1086324736(0x40c00000, float:6.0)
            float r3 = r3 + r28
            float r5 = r10.right
            float r5 = r5 + r26
            float r13 = r10.bottom
            float r13 = r13 + r28
            r0.<init>(r2, r3, r5, r13)
            r3 = 1099956224(0x41900000, float:18.0)
            r1.drawRoundRect(r0, r3, r3, r8)
            java.lang.String r0 = "#F20F172A"
            int r0 = android.graphics.Color.parseColor(r0)
            r11.setColor(r0)
            r1.drawRoundRect(r10, r3, r3, r11)
            java.lang.String r0 = "#FF00E5FF"
            int r0 = android.graphics.Color.parseColor(r0)
            r12.setColor(r0)
            r0 = 1077936128(0x40400000, float:3.0)
            r12.setStrokeWidth(r0)
            r1.drawRoundRect(r10, r3, r3, r12)
            float r0 = r10.right
            float r2 = r0 - r4
            float r3 = r10.top
            r27 = 1094713344(0x41400000, float:12.0)
            float r5 = r3 + r27
            float r0 = r0 - r27
            float r3 = r3 + r4
            android.graphics.RectF r4 = r6.D0
            r4.set(r2, r5, r0, r3)
            r0 = r45
            r15 = 1090519040(0x41000000, float:8.0)
            r1.drawRoundRect(r4, r15, r15, r0)
            float r0 = r4.centerX()
            float r2 = r4.centerY()
            float r2 = r2 + r16
            r3 = r38
            r4 = r40
            r1.drawText(r3, r0, r2, r4)
            android.text.TextPaint r0 = new android.text.TextPaint
            r2 = 1
            r0.<init>(r2)
            java.lang.String r2 = "#00E5FF"
            int r2 = android.graphics.Color.parseColor(r2)
            r0.setColor(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r2)
            r4 = 1103101952(0x41c00000, float:24.0)
            r0.setTextSize(r4)
            float r3 = r10.left
            r20 = 1101004800(0x41a00000, float:20.0)
            float r3 = r3 + r20
            float r5 = r10.top
            r31 = 1107820544(0x42080000, float:34.0)
            float r5 = r5 + r31
            java.lang.String r12 = "📖 Словарь & Разбор фразы"
            r1.drawText(r12, r3, r5, r0)
            float r0 = r10.top
            r3 = 1115684864(0x42800000, float:64.0)
            float r0 = r0 + r3
            android.text.TextPaint r3 = new android.text.TextPaint
            r5 = 1
            r3.<init>(r5)
            r12 = -1
            r3.setColor(r12)
            r3.setTypeface(r2)
            r13 = 1105199104(0x41e00000, float:28.0)
            r3.setTextSize(r13)
            java.lang.String r2 = r7.a
            r5 = 45
            java.lang.String r2 = defpackage.qs6.S0(r5, r2)
            float r5 = r10.left
            r20 = 1101004800(0x41a00000, float:20.0)
            float r5 = r5 + r20
            r1.drawText(r2, r5, r0, r3)
            r31 = 1107820544(0x42080000, float:34.0)
            float r0 = r0 + r31
            android.text.TextPaint r2 = new android.text.TextPaint
            r5 = 1
            r2.<init>(r5)
            java.lang.String r3 = "#94A3B8"
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setColor(r3)
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT
            r2.setTypeface(r3)
            r3 = 1102053376(0x41b00000, float:22.0)
            r2.setTextSize(r3)
            java.lang.String r3 = r7.b
            r5 = 55
            java.lang.String r3 = defpackage.qs6.S0(r5, r3)
            float r5 = r10.left
            r20 = 1101004800(0x41a00000, float:20.0)
            float r5 = r5 + r20
            r1.drawText(r3, r5, r0, r2)
            float r2 = r0 + r9
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            java.lang.String r0 = "#334155"
            int r0 = android.graphics.Color.parseColor(r0)
            r5.setColor(r0)
            r0 = 1069547520(0x3fc00000, float:1.5)
            r5.setStrokeWidth(r0)
            float r0 = r10.left
            float r0 = r0 + r20
            float r3 = r10.right
            float r3 = r3 - r20
            r21 = r4
            r4 = r2
            r47 = r1
            r1 = r0
            r0 = r47
            r0.drawLine(r1, r2, r3, r4, r5)
            r1 = r0
            float r2 = r2 + r21
            java.util.ArrayList r0 = r7.c
            r3 = 3
            java.util.List r0 = defpackage.gt0.e1(r0, r3)
            java.util.Iterator r0 = r0.iterator()
        L740:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L7d2
            java.lang.Object r3 = r0.next()
            kp2 r3 = (defpackage.kp2) r3
            android.text.TextPaint r4 = new android.text.TextPaint
            r5 = 1
            r4.<init>(r5)
            java.lang.String r7 = "#38BDF8"
            int r7 = android.graphics.Color.parseColor(r7)
            r4.setColor(r7)
            android.graphics.Typeface r7 = android.graphics.Typeface.DEFAULT_BOLD
            r4.setTypeface(r7)
            r7 = 1102053376(0x41b00000, float:22.0)
            r4.setTextSize(r7)
            android.text.TextPaint r9 = new android.text.TextPaint
            r9.<init>(r5)
            java.lang.String r14 = "#F59E0B"
            int r14 = android.graphics.Color.parseColor(r14)
            r9.setColor(r14)
            android.graphics.Typeface r14 = android.graphics.Typeface.DEFAULT
            r9.setTypeface(r14)
            r14 = 1099956224(0x41900000, float:18.0)
            r9.setTextSize(r14)
            java.lang.String r15 = r3.c
            boolean r15 = defpackage.qs6.v0(r15)
            if (r15 != 0) goto L790
            java.lang.String r15 = r3.c
            java.lang.String r5 = " ["
            java.lang.String r7 = "]"
            java.lang.String r5 = defpackage.lb1.A(r5, r15, r7)
            goto L792
        L790:
            java.lang.String r5 = ""
        L792:
            java.lang.String r7 = r3.a
            java.lang.String r15 = "• "
            java.lang.String r7 = defpackage.lb1.A(r15, r7, r5)
            r17 = r13
            float r13 = r10.left
            r20 = 1101004800(0x41a00000, float:20.0)
            float r13 = r13 + r20
            r1.drawText(r7, r13, r2, r4)
            java.lang.String r7 = r3.d
            java.lang.String r13 = " ("
            java.lang.String r14 = ")"
            java.lang.String r7 = defpackage.lb1.A(r13, r7, r14)
            float r13 = r10.left
            float r13 = r13 + r20
            java.lang.String r3 = r3.a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r15)
            r14.append(r3)
            r14.append(r5)
            java.lang.String r3 = r14.toString()
            float r3 = r4.measureText(r3)
            float r3 = r3 + r13
            r1.drawText(r7, r3, r2, r9)
            float r2 = r2 + r17
            r13 = r17
            goto L740
        L7d2:
            float r0 = r10.left
            r20 = 1101004800(0x41a00000, float:20.0)
            float r2 = r0 + r20
            float r3 = r10.bottom
            r4 = 1112539136(0x42500000, float:52.0)
            float r4 = r3 - r4
            r23 = 1130102784(0x435c0000, float:220.0)
            float r0 = r0 + r23
            r19 = 1096810496(0x41600000, float:14.0)
            float r3 = r3 - r19
            android.graphics.RectF r5 = r6.E0
            r5.set(r2, r4, r0, r3)
            java.lang.String r0 = "#10B981"
            int r0 = android.graphics.Color.parseColor(r0)
            android.graphics.Paint r2 = r6.f1
            r2.setColor(r0)
            r15 = 1092616192(0x41200000, float:10.0)
            r1.drawRoundRect(r5, r15, r15, r2)
            android.graphics.Paint r0 = r6.h1
            r0.setColor(r12)
            r10 = 1101004800(0x41a00000, float:20.0)
            r0.setTextSize(r10)
            float r2 = r5.centerX()
            float r3 = r5.centerY()
            float r3 = r3 + r16
            java.lang.String r4 = "Озвучить ▶️"
            r1.drawText(r4, r2, r3, r0)
        L814:
            boolean r0 = r6.f0
            if (r0 == 0) goto L859
            r29 = 1073741824(0x40000000, float:2.0)
            float r0 = r35 / r29
            r2 = 1053609165(0x3ecccccd, float:0.4)
            float r7 = r36 * r2
            java.lang.String r2 = "#CC0F172A"
            int r2 = android.graphics.Color.parseColor(r2)
            r11.setColor(r2)
            r2 = 1116143616(0x42870000, float:67.5)
            r1.drawCircle(r0, r7, r2, r11)
            float r2 = r6.i1
            r27 = 1094713344(0x41400000, float:12.0)
            float r2 = r2 + r27
            r3 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 % r3
            r6.i1 = r2
            android.graphics.RectF r1 = new android.graphics.RectF
            r2 = 1110704128(0x42340000, float:45.0)
            float r3 = r0 - r2
            float r4 = r7 - r2
            float r0 = r0 + r2
            float r7 = r7 + r2
            r1.<init>(r3, r4, r0, r7)
            float r2 = r6.i1
            r4 = 0
            android.graphics.Paint r5 = r6.T0
            r3 = 1132593152(0x43820000, float:260.0)
            r0 = r49
            r0.drawArc(r1, r2, r3, r4, r5)
            r1 = r0
            r2 = 16
            r6.postInvalidateDelayed(r2)
        L859:
            boolean r0 = r6.l0
            if (r0 == 0) goto L8be
            float r0 = r6.n0
            float r2 = r6.p0
            r33 = 1090519040(0x41000000, float:8.0)
            float r3 = r2 + r33
            float r4 = r35 - r2
            float r4 = r4 - r33
            float r0 = defpackage.gi2.p(r0, r3, r4)
            r6.n0 = r0
            float r0 = r6.o0
            float r7 = r36 - r2
            float r7 = r7 - r33
            float r0 = defpackage.gi2.p(r0, r3, r7)
            r6.o0 = r0
            float r3 = r6.n0
            r29 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 + r29
            r24 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 + r24
            r1.drawCircle(r3, r0, r2, r8)
            float r0 = r6.n0
            float r3 = r6.o0
            float r7 = r2 * r32
            android.graphics.Paint r4 = r6.P0
            r1.drawCircle(r0, r3, r7, r4)
            float r0 = r6.n0
            float r3 = r6.o0
            android.graphics.Paint r4 = r6.O0
            r1.drawCircle(r0, r3, r2, r4)
            float r0 = r6.n0
            float r3 = r6.o0
            android.graphics.Paint r4 = r6.Q0
            r1.drawCircle(r0, r3, r2, r4)
            float r0 = r6.o0
            android.graphics.Paint r2 = r6.R0
            float r3 = r2.descent()
            float r4 = r2.ascent()
            float r4 = r4 + r3
            r29 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r29
            float r0 = r0 - r4
            java.lang.String r3 = "TR"
            float r4 = r6.n0
            r1.drawText(r3, r4, r0, r2)
        L8be:
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
            r20 = this;
            r0 = r20
            r21.getClass()
            float r1 = r21.getX()
            float r2 = r21.getY()
            int r3 = r0.getWidth()
            float r3 = (float) r3
            int r4 = r0.getHeight()
            float r4 = (float) r4
            jp2 r5 = r0.B0
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L5a
            int r3 = r21.getActionMasked()
            if (r3 != 0) goto L48
            android.graphics.RectF r3 = r0.D0
            boolean r3 = r3.contains(r1, r2)
            if (r3 == 0) goto L31
            r0.B0 = r6
            r0.invalidate()
            return r7
        L31:
            android.graphics.RectF r3 = r0.E0
            boolean r3 = r3.contains(r1, r2)
            if (r3 == 0) goto L4c
            qn2 r1 = r0.k0
            if (r1 == 0) goto L48
            jp2 r0 = r0.B0
            r0.getClass()
            java.lang.String r0 = r0.a
            r1.g(r0)
            return r7
        L48:
            r16 = r7
            goto L3fb
        L4c:
            android.graphics.RectF r3 = r0.C0
            boolean r1 = r3.contains(r1, r2)
            if (r1 != 0) goto L48
            r0.B0 = r6
            r0.invalidate()
            return r7
        L5a:
            boolean r5 = r0.m0
            r8 = 3
            r9 = 2
            r10 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            if (r5 == 0) goto L77
            int r5 = r21.getActionMasked()
            r13 = -1
            android.graphics.RectF r14 = r0.K0
            android.graphics.RectF r15 = r0.J0
            java.util.ArrayList r6 = r0.L
            if (r5 == 0) goto L174
            if (r5 == r7) goto L139
            if (r5 == r9) goto L7f
            if (r5 == r8) goto L139
        L77:
            r17 = r3
            r18 = r4
            r16 = r7
            goto L25d
        L7f:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r5 = r0.F0
            int[] r12 = me.magnum.melonds.translator.ui.a.a
            int r5 = r5.ordinal()
            r5 = r12[r5]
            if (r5 == r7) goto L11a
            if (r5 == r9) goto Ld5
            if (r5 == r8) goto L90
            goto L48
        L90:
            int r5 = r6.size()
            int r8 = r0.G0
            if (r8 < 0) goto L48
            if (r8 >= r5) goto L48
            float r5 = r0.H0
            float r1 = r1 - r5
            float r1 = r1 / r3
            float r3 = r0.I0
            float r2 = r2 - r3
            float r2 = r2 / r4
            float r3 = r15.right
            float r3 = r3 + r1
            float r1 = r15.left
            r4 = 1028443341(0x3d4ccccd, float:0.05)
            float r1 = r1 + r4
            float r1 = defpackage.gi2.p(r3, r1, r11)
            float r3 = r15.bottom
            float r3 = r3 + r2
            float r2 = r15.top
            float r2 = r2 + r4
            float r2 = defpackage.gi2.p(r3, r2, r11)
            int r3 = r0.G0
            java.lang.Object r4 = r6.get(r3)
            ua7 r4 = (defpackage.ua7) r4
            android.graphics.RectF r5 = new android.graphics.RectF
            float r8 = r15.left
            float r9 = r15.top
            r5.<init>(r8, r9, r1, r2)
            ua7 r1 = defpackage.ua7.a(r4, r5)
            r6.set(r3, r1)
            r0.invalidate()
            return r7
        Ld5:
            int r5 = r6.size()
            int r8 = r0.G0
            if (r8 < 0) goto L48
            if (r8 >= r5) goto L48
            float r5 = r0.H0
            float r1 = r1 - r5
            float r1 = r1 / r3
            float r3 = r0.I0
            float r2 = r2 - r3
            float r2 = r2 / r4
            float r3 = r15.width()
            float r4 = r15.height()
            float r5 = r15.left
            float r5 = r5 + r1
            float r1 = r11 - r3
            float r1 = defpackage.gi2.p(r5, r10, r1)
            float r5 = r15.top
            float r5 = r5 + r2
            float r11 = r11 - r4
            float r2 = defpackage.gi2.p(r5, r10, r11)
            int r5 = r0.G0
            java.lang.Object r8 = r6.get(r5)
            ua7 r8 = (defpackage.ua7) r8
            android.graphics.RectF r9 = new android.graphics.RectF
            float r3 = r3 + r1
            float r4 = r4 + r2
            r9.<init>(r1, r2, r3, r4)
            ua7 r1 = defpackage.ua7.a(r8, r9)
            r6.set(r5, r1)
            r0.invalidate()
            return r7
        L11a:
            float r3 = r0.H0
            float r3 = java.lang.Math.min(r3, r1)
            float r4 = r0.I0
            float r4 = java.lang.Math.min(r4, r2)
            float r5 = r0.H0
            float r1 = java.lang.Math.max(r5, r1)
            float r5 = r0.I0
            float r2 = java.lang.Math.max(r5, r2)
            r14.set(r3, r4, r1, r2)
            r0.invalidate()
            return r7
        L139:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r1 = r0.F0
            me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r2 = me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.DRAW_NEW
            if (r1 != r2) goto L16a
            float r1 = r14.width()
            r2 = 1109393408(0x42200000, float:40.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L16a
            float r1 = r14.height()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L16a
            ua7 r1 = new ua7
            android.graphics.RectF r2 = new android.graphics.RectF
            float r5 = r14.left
            float r5 = r5 / r3
            float r8 = r14.top
            float r8 = r8 / r4
            float r9 = r14.right
            float r9 = r9 / r3
            float r3 = r14.bottom
            float r3 = r3 / r4
            r2.<init>(r5, r8, r9, r3)
            r1.<init>(r2)
            r6.add(r1)
        L16a:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r1 = me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.NONE
            r0.F0 = r1
            r0.G0 = r13
            r0.invalidate()
            return r7
        L174:
            android.graphics.RectF r5 = r0.j1
            boolean r5 = r5.contains(r1, r2)
            if (r5 == 0) goto L199
            ua7 r1 = new ua7
            android.graphics.RectF r2 = new android.graphics.RectF
            r3 = 1063675495(0x3f666667, float:0.90000004)
            r4 = 1062501090(0x3f547ae2, float:0.83000004)
            r5 = 1036831949(0x3dcccccd, float:0.1)
            r8 = 1057803469(0x3f0ccccd, float:0.55)
            r2.<init>(r5, r8, r3, r4)
            r1.<init>(r2)
            r6.add(r1)
            r0.invalidate()
            return r7
        L199:
            android.graphics.RectF r5 = r0.k1
            boolean r5 = r5.contains(r1, r2)
            if (r5 == 0) goto L1a8
            r6.clear()
            r0.invalidate()
            return r7
        L1a8:
            android.graphics.RectF r5 = r0.l1
            boolean r5 = r5.contains(r1, r2)
            if (r5 == 0) goto L1bf
            qn2 r1 = r0.j0
            if (r1 == 0) goto L1bb
            java.util.List r2 = defpackage.gt0.k1(r6)
            r1.g(r2)
        L1bb:
            r0.setEditRegionsMode(r12)
            return r7
        L1bf:
            android.graphics.RectF r5 = r0.m1
            boolean r5 = r5.contains(r1, r2)
            if (r5 == 0) goto L1cb
            r0.setEditRegionsMode(r12)
            return r7
        L1cb:
            int r5 = r6.size()
            int r5 = r5 + r13
            if (r5 < 0) goto L24c
        L1d2:
            int r8 = r5 + (-1)
            java.lang.Object r9 = r6.get(r5)
            ua7 r9 = (defpackage.ua7) r9
            android.graphics.RectF r9 = r9.b
            float r10 = r9.right
            float r10 = r10 * r3
            float r11 = r9.top
            float r11 = r11 * r4
            float r12 = r1 - r10
            double r12 = (double) r12
            r16 = r7
            float r7 = r2 - r11
            r17 = r3
            r18 = r4
            double r3 = (double) r7
            double r3 = java.lang.Math.hypot(r12, r3)
            float r3 = (float) r3
            r4 = 1107296256(0x42000000, float:32.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L200
            r6.remove(r5)
            r0.invalidate()
            return r16
        L200:
            float r3 = r9.bottom
            float r3 = r3 * r18
            float r4 = r2 - r3
            r19 = r6
            double r6 = (double) r4
            double r6 = java.lang.Math.hypot(r12, r6)
            float r4 = (float) r6
            r6 = 1108344832(0x42100000, float:36.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L222
            me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r3 = me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.RESIZE_REGION
            r0.F0 = r3
            r0.G0 = r5
            r0.H0 = r1
            r0.I0 = r2
            r15.set(r9)
            return r16
        L222:
            float r4 = r9.left
            float r4 = r4 * r17
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r4, r11, r10, r3)
            boolean r3 = r6.contains(r1, r2)
            if (r3 == 0) goto L23f
            me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r3 = me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.MOVE_REGION
            r0.F0 = r3
            r0.G0 = r5
            r0.H0 = r1
            r0.I0 = r2
            r15.set(r9)
            return r16
        L23f:
            if (r8 >= 0) goto L242
            goto L24e
        L242:
            r5 = r8
            r7 = r16
            r3 = r17
            r4 = r18
            r6 = r19
            goto L1d2
        L24c:
            r16 = r7
        L24e:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView$a r3 = me.magnum.melonds.translator.ui.GameTranslationOverlayView.a.DRAW_NEW
            r0.F0 = r3
            r0.H0 = r1
            r0.I0 = r2
            r14.set(r1, r2, r1, r2)
            r0.invalidate()
            return r16
        L25d:
            boolean r3 = r0.v0
            if (r3 == 0) goto L300
            int r3 = r21.getActionMasked()
            android.graphics.RectF r4 = r0.z0
            if (r3 == 0) goto L2f1
            r5 = r16
            if (r3 == r5) goto L295
            if (r3 == r9) goto L274
            if (r3 == r8) goto L295
            r5 = 1
            goto L302
        L274:
            float r3 = r0.x0
            float r3 = java.lang.Math.min(r3, r1)
            float r5 = r0.y0
            float r5 = java.lang.Math.min(r5, r2)
            float r6 = r0.x0
            float r1 = java.lang.Math.max(r6, r1)
            float r6 = r0.y0
            float r2 = java.lang.Math.max(r6, r2)
            r4.set(r3, r5, r1, r2)
            r0.invalidate()
            r16 = 1
            return r16
        L295:
            r0.setLassoModeActive(r12)
            r0.w0 = r12
            float r1 = r4.width()
            r2 = 1108082688(0x420c0000, float:35.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L2e9
            float r1 = r4.height()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L2e9
            android.graphics.RectF r1 = new android.graphics.RectF
            float r2 = r4.left
            float r2 = r2 / r17
            float r2 = defpackage.gi2.p(r2, r10, r11)
            float r3 = r4.top
            float r3 = r3 / r18
            float r3 = defpackage.gi2.p(r3, r10, r11)
            float r5 = r4.right
            float r5 = r5 / r17
            float r5 = defpackage.gi2.p(r5, r10, r11)
            float r6 = r4.bottom
            float r6 = r6 / r18
            float r6 = defpackage.gi2.p(r6, r10, r11)
            r1.<init>(r2, r3, r5, r6)
            r4.setEmpty()
            r0.invalidate()
            qn2 r0 = r0.h0
            if (r0 == 0) goto L2e5
            ua7 r2 = new ua7
            r2.<init>(r1)
            r0.g(r2)
            r5 = 1
            return r5
        L2e5:
            r16 = 1
            goto L3fb
        L2e9:
            r5 = 1
            r4.setEmpty()
            r0.invalidate()
            return r5
        L2f1:
            r5 = r16
            r0.w0 = r5
            r0.x0 = r1
            r0.y0 = r2
            r4.set(r1, r2, r1, r2)
            r0.invalidate()
            return r5
        L300:
            r5 = r16
        L302:
            int r3 = r21.getActionMasked()
            n0 r4 = r0.o1
            android.os.Handler r6 = r0.u0
            if (r3 == 0) goto L37b
            if (r3 == r5) goto L344
            if (r3 == r9) goto L31d
            if (r3 == r8) goto L314
            goto L3fc
        L314:
            r6.removeCallbacks(r4)
            r0.q0 = r12
            r0.invalidate()
            return r12
        L31d:
            boolean r3 = r0.q0
            if (r3 == 0) goto L3fc
            float r3 = r0.r0
            float r3 = r1 - r3
            double r7 = (double) r3
            float r3 = r0.s0
            float r3 = r2 - r3
            double r9 = (double) r3
            double r7 = java.lang.Math.hypot(r7, r9)
            float r3 = (float) r7
            r5 = 1098907648(0x41800000, float:16.0)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 1
            if (r3 <= 0) goto L33c
            r0.t0 = r5
            r6.removeCallbacks(r4)
        L33c:
            r0.n0 = r1
            r0.o0 = r2
            r0.invalidate()
            return r5
        L344:
            boolean r1 = r0.q0
            if (r1 == 0) goto L3fc
            r6.removeCallbacks(r4)
            r0.q0 = r12
            boolean r1 = r0.t0
            if (r1 != 0) goto L376
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.A0
            long r3 = r1 - r3
            r5 = 350(0x15e, double:1.73E-321)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L36b
            r1 = 0
            r0.A0 = r1
            r5 = 1
            r0.setLassoModeActive(r5)
            r0.invalidate()
            goto L377
        L36b:
            r5 = 1
            r0.A0 = r1
            on2 r1 = r0.g0
            if (r1 == 0) goto L377
            r1.c()
            goto L377
        L376:
            r5 = 1
        L377:
            r0.invalidate()
            return r5
        L37b:
            float r3 = r0.n0
            float r3 = r1 - r3
            double r9 = (double) r3
            float r3 = r0.o0
            float r3 = r2 - r3
            double r13 = (double) r3
            double r9 = java.lang.Math.hypot(r9, r13)
            float r3 = (float) r9
            boolean r5 = r0.l0
            if (r5 == 0) goto L3a6
            float r5 = r0.p0
            r7 = 1097859072(0x41700000, float:15.0)
            float r5 = r5 + r7
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L3a6
            r5 = 1
            r0.q0 = r5
            r0.t0 = r12
            r0.r0 = r1
            r0.s0 = r2
            r0 = 500(0x1f4, double:2.47E-321)
            r6.postDelayed(r4, r0)
            return r5
        L3a6:
            java.util.ArrayList r3 = r0.B
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L3fc
            int r4 = r3.size()
        L3b2:
            if (r12 >= r4) goto L3f2
            java.lang.Object r5 = r3.get(r12)
            int r12 = r12 + 1
            ta7 r5 = (defpackage.ta7) r5
            android.graphics.RectF r6 = r5.c
            float r7 = r6.left
            float r7 = r7 * r17
            float r9 = r6.top
            float r9 = r9 * r18
            float r10 = r6.right
            float r10 = r10 * r17
            float r6 = r6.bottom
            float r6 = r6 * r18
            android.graphics.RectF r11 = new android.graphics.RectF
            r13 = 1092616192(0x41200000, float:10.0)
            float r7 = r7 - r13
            float r9 = r9 - r13
            float r10 = r10 + r13
            float r6 = r6 + r13
            r11.<init>(r7, r9, r10, r6)
            boolean r6 = r11.contains(r1, r2)
            if (r6 == 0) goto L3ef
            xd1 r1 = new xd1
            r2 = 18
            r6 = 0
            r1.<init>(r5, r0, r6, r2)
            o41 r0 = r0.A
            defpackage.hv.L(r0, r6, r6, r1, r8)
            r16 = 1
            return r16
        L3ef:
            r16 = 1
            goto L3b2
        L3f2:
            r16 = 1
            on2 r0 = r0.i0
            if (r0 == 0) goto L3fb
            r0.c()
        L3fb:
            return r16
        L3fc:
            return r12
    }

    public final void setBubbleOpacity(float r1) {
            r0 = this;
            r0.d0 = r1
            return
    }

    public final void setEditRegionsMode(boolean r1) {
            r0 = this;
            r0.m0 = r1
            if (r1 == 0) goto Lc
            java.util.ArrayList r1 = r0.B
            r1.clear()
            r1 = 0
            r0.B0 = r1
        Lc:
            r0.invalidate()
            return
    }

    public final void setFontSizeScale(float r1) {
            r0 = this;
            r0.e0 = r1
            return
    }

    public final void setLassoModeActive(boolean r1) {
            r0 = this;
            r0.v0 = r1
            r0.invalidate()
            return
    }

    public final void setOnDismissRequested(defpackage.on2 r1) {
            r0 = this;
            r0.i0 = r1
            return
    }

    public final void setOnFloatingButtonLongClickListener(defpackage.on2 r1) {
            r0 = this;
            r0.n1 = r1
            return
    }

    public final void setOnLassoRegionSelected(defpackage.qn2 r1) {
            r0 = this;
            r0.h0 = r1
            return
    }

    public final void setOnRegionsSaved(defpackage.qn2 r1) {
            r0 = this;
            r0.j0 = r1
            return
    }

    public final void setOnSpeakWordRequested(defpackage.qn2 r1) {
            r0 = this;
            r0.k0 = r1
            return
    }

    public final void setOnTriggerTranslationRequested(defpackage.on2 r1) {
            r0 = this;
            r0.g0 = r1
            return
    }

    public final void setOverlayStyle(defpackage.ya7 r1) {
            r0 = this;
            r1.getClass()
            r0.R = r1
            return
    }

    public final void setSavedRegions(java.util.List<defpackage.ua7> r2) {
            r1 = this;
            r2.getClass()
            java.util.ArrayList r0 = r1.L
            r0.clear()
            r0.addAll(r2)
            r1.invalidate()
            return
    }

    public final void setShowFloatingButton(boolean r1) {
            r0 = this;
            r0.l0 = r1
            r0.invalidate()
            return
    }

    public final void setTranslatedBlocks(java.util.List<defpackage.ta7> r2) {
            r1 = this;
            r2.getClass()
            java.util.ArrayList r0 = r1.B
            r0.clear()
            r0.addAll(r2)
            r2 = 0
            r1.setTranslating(r2)
            r2 = 0
            r1.B0 = r2
            r1.invalidate()
            return
    }

    public final void setTranslating(boolean r1) {
            r0 = this;
            r0.f0 = r1
            r0.invalidate()
            return
    }
}
