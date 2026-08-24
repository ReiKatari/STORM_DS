package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hq5  reason: default package */
/* loaded from: classes.dex */
public final class hq5 extends android.view.View {
    public static final int[] e0 = null;
    public static final int[] f0 = null;
    public defpackage.ug7 A;
    public java.lang.Boolean B;
    public java.lang.Long L;
    public defpackage.rk3 R;
    public defpackage.a5 d0;

    static {
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            r1 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r0, r1}
            defpackage.hq5.e0 = r0
            r0 = 0
            int[] r0 = new int[r0]
            defpackage.hq5.f0 = r0
            return
    }

    public static /* synthetic */ void a(defpackage.hq5 r0) {
            setRippleState$lambda$1(r0)
            return
    }

    private final void setRippleState(boolean r7) {
            r6 = this;
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            rk3 r2 = r6.R
            if (r2 == 0) goto Le
            r6.removeCallbacks(r2)
            r2.run()
        Le:
            java.lang.Long r2 = r6.L
            if (r2 == 0) goto L17
            long r2 = r2.longValue()
            goto L19
        L17:
            r2 = 0
        L19:
            long r2 = r0 - r2
            if (r7 != 0) goto L32
            r4 = 5
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L32
            rk3 r7 = new rk3
            r2 = 9
            r7.<init>(r6, r2)
            r6.R = r7
            r2 = 50
            r6.postDelayed(r7, r2)
            goto L40
        L32:
            if (r7 == 0) goto L37
            int[] r7 = defpackage.hq5.e0
            goto L39
        L37:
            int[] r7 = defpackage.hq5.f0
        L39:
            ug7 r2 = r6.A
            if (r2 == 0) goto L40
            r2.setState(r7)
        L40:
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r6.L = r7
            return
    }

    private static final void setRippleState$lambda$1(defpackage.hq5 r2) {
            ug7 r0 = r2.A
            if (r0 == 0) goto L9
            int[] r1 = defpackage.hq5.f0
            r0.setState(r1)
        L9:
            r0 = 0
            r2.R = r0
            return
    }

    public final void b(defpackage.l25 r3, boolean r4, long r5, int r7, long r8, float r10, defpackage.a5 r11) {
            r2 = this;
            ug7 r0 = r2.A
            if (r0 == 0) goto L10
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r1 = r2.B
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
        L10:
            ug7 r0 = new ug7
            r0.<init>(r4)
            r2.setBackground(r0)
            r2.A = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.B = r0
        L20:
            ug7 r0 = r2.A
            r0.getClass()
            r2.d0 = r11
            r11 = r10
            r9 = r8
            r8 = r7
            r6 = r5
            r5 = r2
            r5.e(r6, r8, r9, r11)
            if (r4 == 0) goto L4c
            long r6 = r3.a
            r2 = 32
            long r6 = r6 >> r2
            int r2 = (int) r6
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r3 = r3.a
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r0.setHotspot(r2, r3)
            goto L61
        L4c:
            android.graphics.Rect r2 = r0.getBounds()
            int r2 = r2.centerX()
            float r2 = (float) r2
            android.graphics.Rect r3 = r0.getBounds()
            int r3 = r3.centerY()
            float r3 = (float) r3
            r0.setHotspot(r2, r3)
        L61:
            r2 = 1
            r5.setRippleState(r2)
            return
    }

    public final void c() {
            r2 = this;
            r0 = 0
            r2.d0 = r0
            rk3 r0 = r2.R
            if (r0 == 0) goto L13
            r2.removeCallbacks(r0)
            rk3 r0 = r2.R
            r0.getClass()
            r0.run()
            goto L1c
        L13:
            ug7 r0 = r2.A
            if (r0 == 0) goto L1c
            int[] r1 = defpackage.hq5.f0
            r0.setState(r1)
        L1c:
            ug7 r0 = r2.A
            if (r0 != 0) goto L21
            return
        L21:
            r1 = 0
            r0.setVisible(r1, r1)
            r2.unscheduleDrawable(r0)
            return
    }

    public final void d() {
            r1 = this;
            r0 = 0
            r1.setRippleState(r0)
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r2) {
            r1 = this;
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto La
            r1.c()
            return
        La:
            super.draw(r2)
            return
    }

    public final void e(long r4, int r6, long r7, float r9) {
            r3 = this;
            ug7 r0 = r3.A
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r0.getRadius()
            if (r1 == r6) goto Le
            r0.setRadius(r6)
        Le:
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r6 >= r1) goto L17
            r6 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r6
        L17:
            r6 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r1 <= 0) goto L1e
            r9 = r6
        L1e:
            long r6 = defpackage.kt0.c(r9, r7)
            kt0 r8 = r0.B
            r9 = 0
            if (r8 != 0) goto L29
            r8 = r9
            goto L2f
        L29:
            long r1 = r8.a
            boolean r8 = defpackage.kt0.d(r1, r6)
        L2f:
            if (r8 != 0) goto L43
            kt0 r8 = new kt0
            r8.<init>(r6)
            r0.B = r8
            int r6 = defpackage.hv.b0(r6)
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r6)
            r0.setColor(r6)
        L43:
            android.graphics.Rect r6 = new android.graphics.Rect
            float r7 = defpackage.xi6.e(r4)
            int r7 = defpackage.u24.E(r7)
            float r4 = defpackage.xi6.c(r4)
            int r4 = defpackage.u24.E(r4)
            r6.<init>(r9, r9, r7, r4)
            int r4 = r6.left
            r3.setLeft(r4)
            int r4 = r6.top
            r3.setTop(r4)
            int r4 = r6.right
            r3.setRight(r4)
            int r4 = r6.bottom
            r3.setBottom(r4)
            r0.setBounds(r6)
            return
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            a5 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.c()
        L7:
            return
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
            r0 = this;
            return
    }
}
