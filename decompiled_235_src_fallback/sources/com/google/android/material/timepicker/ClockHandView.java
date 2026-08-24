package com.google.android.material.timepicker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class ClockHandView extends android.view.View {
    public static final /* synthetic */ int m0 = 0;
    public final android.animation.ValueAnimator A;
    public boolean B;
    public final java.util.ArrayList L;
    public final int R;
    public final float d0;
    public final android.graphics.Paint e0;
    public final android.graphics.RectF f0;
    public final int g0;
    public float h0;
    public boolean i0;
    public double j0;
    public int k0;
    public int l0;

    public ClockHandView(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r0 = 2130969464(0x7f040378, float:1.754761E38)
            r7.<init>(r8, r9, r0)
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r7.A = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r7.L = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r7.e0 = r2
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r7.f0 = r3
            r3 = 1
            r7.l0 = r3
            int[] r4 = defpackage.a75.e
            r5 = 2132018452(0x7f140514, float:1.9675211E38)
            android.content.res.TypedArray r9 = r8.obtainStyledAttributes(r9, r4, r0, r5)
            r0 = 2130969523(0x7f0403b3, float:1.754773E38)
            r4 = 200(0xc8, float:2.8E-43)
            defpackage.kj2.W(r8, r0, r4)
            r0 = 2130969539(0x7f0403c3, float:1.7547763E38)
            q92 r4 = defpackage.vo.b
            defpackage.kj2.X(r8, r0, r4)
            r0 = 0
            int r4 = r9.getDimensionPixelSize(r3, r0)
            r7.k0 = r4
            r4 = 2
            int r5 = r9.getDimensionPixelSize(r4, r0)
            r7.R = r5
            android.content.res.Resources r5 = r7.getResources()
            r6 = 2131165966(0x7f07030e, float:1.7946164E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r7.g0 = r6
            r6 = 2131165964(0x7f07030c, float:1.794616E38)
            int r5 = r5.getDimensionPixelSize(r6)
            float r5 = (float) r5
            r7.d0 = r5
            int r0 = r9.getColor(r0, r0)
            r2.setAntiAlias(r3)
            r2.setColor(r0)
            r0 = 0
            r7.a(r0)
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r8)
            r8.getScaledTouchSlop()
            r7.setImportantForAccessibility(r4)
            r9.recycle()
            com.google.android.material.timepicker.d r8 = new com.google.android.material.timepicker.d
            r8.<init>(r7)
            r1.addUpdateListener(r8)
            xr0 r7 = new xr0
            r7.<init>()
            r1.addListener(r7)
            return
    }

    public final void a(float r2) {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.A
            r0.cancel()
            r1.b(r2)
            return
    }

    public final void b(float r7) {
            r6 = this;
            r0 = 1135869952(0x43b40000, float:360.0)
            float r7 = r7 % r0
            r6.h0 = r7
            r0 = 1119092736(0x42b40000, float:90.0)
            float r0 = r7 - r0
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            r6.j0 = r0
            int r0 = r6.getHeight()
            r1 = 2
            int r0 = r0 / r1
            int r2 = r6.getWidth()
            int r2 = r2 / r1
            int r3 = r6.l0
            int r4 = r6.k0
            if (r3 != r1) goto L2a
            float r1 = (float) r4
            r3 = 1059648963(0x3f28f5c3, float:0.66)
            float r1 = r1 * r3
            int r4 = java.lang.Math.round(r1)
        L2a:
            float r1 = (float) r2
            float r2 = (float) r4
            double r3 = r6.j0
            double r3 = java.lang.Math.cos(r3)
            float r3 = (float) r3
            float r3 = r3 * r2
            float r3 = r3 + r1
            float r0 = (float) r0
            double r4 = r6.j0
            double r4 = java.lang.Math.sin(r4)
            float r1 = (float) r4
            float r2 = r2 * r1
            float r2 = r2 + r0
            int r0 = r6.R
            float r0 = (float) r0
            float r1 = r3 - r0
            float r4 = r2 - r0
            float r3 = r3 + r0
            float r2 = r2 + r0
            android.graphics.RectF r0 = r6.f0
            r0.set(r1, r4, r3, r2)
            java.util.ArrayList r0 = r6.L
            int r1 = r0.size()
            r2 = 0
        L54:
            if (r2 >= r1) goto L74
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            yr0 r3 = (defpackage.yr0) r3
            com.google.android.material.timepicker.ClockFaceView r3 = (com.google.android.material.timepicker.ClockFaceView) r3
            float r4 = r3.F0
            float r4 = r4 - r7
            float r4 = java.lang.Math.abs(r4)
            r5 = 981668463(0x3a83126f, float:0.001)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L54
            r3.F0 = r7
            r3.p()
            goto L54
        L74:
            r6.invalidate()
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r14) {
            r13 = this;
            super.onDraw(r14)
            int r0 = r13.getHeight()
            r1 = 2
            int r0 = r0 / r1
            int r2 = r13.getWidth()
            int r2 = r2 / r1
            int r3 = r13.l0
            int r4 = r13.k0
            if (r3 != r1) goto L1d
            float r1 = (float) r4
            r3 = 1059648963(0x3f28f5c3, float:0.66)
            float r1 = r1 * r3
            int r4 = java.lang.Math.round(r1)
        L1d:
            float r6 = (float) r2
            float r1 = (float) r4
            double r7 = r13.j0
            double r7 = java.lang.Math.cos(r7)
            float r3 = (float) r7
            float r3 = r3 * r1
            float r3 = r3 + r6
            float r7 = (float) r0
            double r8 = r13.j0
            double r8 = java.lang.Math.sin(r8)
            float r5 = (float) r8
            float r1 = r1 * r5
            float r1 = r1 + r7
            r5 = 0
            android.graphics.Paint r10 = r13.e0
            r10.setStrokeWidth(r5)
            int r5 = r13.R
            float r8 = (float) r5
            r14.drawCircle(r3, r1, r8, r10)
            double r8 = r13.j0
            double r8 = java.lang.Math.sin(r8)
            double r11 = r13.j0
            double r11 = java.lang.Math.cos(r11)
            int r4 = r4 - r5
            float r1 = (float) r4
            double r3 = (double) r1
            double r11 = r11 * r3
            int r1 = (int) r11
            int r2 = r2 + r1
            float r1 = (float) r2
            double r3 = r3 * r8
            int r2 = (int) r3
            int r0 = r0 + r2
            float r9 = (float) r0
            int r0 = r13.g0
            float r0 = (float) r0
            r10.setStrokeWidth(r0)
            r5 = r14
            r8 = r1
            r5.drawLine(r6, r7, r8, r9, r10)
            float r13 = r13.d0
            r5.drawCircle(r6, r7, r13, r10)
            return
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            android.animation.ValueAnimator r1 = r0.A
            boolean r1 = r1.isRunning()
            if (r1 != 0) goto L10
            float r1 = r0.h0
            r0.a(r1)
        L10:
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
            r9 = this;
            int r0 = r10.getActionMasked()
            float r1 = r10.getX()
            float r10 = r10.getY()
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L5f
            if (r0 == r3) goto L18
            if (r0 == r2) goto L18
            r0 = r4
            r5 = r0
            goto L63
        L18:
            boolean r0 = r9.i0
            boolean r5 = r9.B
            if (r5 == 0) goto L5d
            int r5 = r9.getWidth()
            int r5 = r5 / r2
            int r6 = r9.getHeight()
            int r6 = r6 / r2
            float r5 = (float) r5
            float r6 = (float) r6
            float r5 = r1 - r5
            float r6 = r10 - r6
            double r7 = (double) r5
            double r5 = (double) r6
            double r5 = java.lang.Math.hypot(r7, r5)
            float r5 = (float) r5
            int r6 = r9.k0
            float r6 = (float) r6
            r7 = 1059648963(0x3f28f5c3, float:0.66)
            float r6 = r6 * r7
            int r6 = java.lang.Math.round(r6)
            android.content.Context r7 = r9.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 1094713344(0x41400000, float:12.0)
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = android.util.TypedValue.applyDimension(r3, r8, r7)
            float r6 = (float) r6
            float r6 = r6 + r7
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L5a
            r5 = r2
            goto L5b
        L5a:
            r5 = r3
        L5b:
            r9.l0 = r5
        L5d:
            r5 = r4
            goto L63
        L5f:
            r9.i0 = r4
            r5 = r3
            r0 = r4
        L63:
            boolean r6 = r9.i0
            int r7 = r9.getWidth()
            int r7 = r7 / r2
            int r8 = r9.getHeight()
            int r8 = r8 / r2
            float r2 = (float) r7
            float r1 = r1 - r2
            double r1 = (double) r1
            float r7 = (float) r8
            float r10 = r10 - r7
            double r7 = (double) r10
            double r1 = java.lang.Math.atan2(r7, r1)
            double r1 = java.lang.Math.toDegrees(r1)
            int r10 = (int) r1
            int r1 = r10 + 90
            if (r1 >= 0) goto L84
            int r1 = r10 + 450
        L84:
            float r10 = r9.h0
            float r1 = (float) r1
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 == 0) goto L8d
            r10 = r3
            goto L8e
        L8d:
            r10 = r4
        L8e:
            if (r5 == 0) goto L94
            if (r10 == 0) goto L94
        L92:
            r4 = r3
            goto L9c
        L94:
            if (r10 != 0) goto L98
            if (r0 == 0) goto L9c
        L98:
            r9.a(r1)
            goto L92
        L9c:
            r10 = r6 | r4
            r9.i0 = r10
            return r3
    }
}
