package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v16  reason: default package */
/* loaded from: classes.dex */
public final class v16 extends android.graphics.drawable.Drawable {
    public float a;
    public final android.graphics.Paint b;
    public final android.graphics.RectF c;
    public final android.graphics.Rect d;
    public float e;
    public boolean f;
    public boolean g;
    public android.content.res.ColorStateList h;
    public android.graphics.PorterDuffColorFilter i;
    public android.content.res.ColorStateList j;
    public android.graphics.PorterDuff.Mode k;

    public v16(android.content.res.ColorStateList r3, float r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f = r0
            r1 = 1
            r2.g = r1
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.k = r1
            r2.a = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r1 = 5
            r4.<init>(r1)
            r2.b = r4
            if (r3 != 0) goto L1d
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r0)
        L1d:
            r2.h = r3
            int[] r0 = r2.getState()
            android.content.res.ColorStateList r1 = r2.h
            int r1 = r1.getDefaultColor()
            int r3 = r3.getColorForState(r0, r1)
            r4.setColor(r3)
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r2.c = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.d = r3
            return
    }

    public final android.graphics.PorterDuffColorFilter a(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3) {
            r1 = this;
            if (r2 == 0) goto L14
            if (r3 != 0) goto L5
            goto L14
        L5:
            int[] r1 = r1.getState()
            r0 = 0
            int r1 = r2.getColorForState(r1, r0)
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r1, r3)
            return r2
        L14:
            r1 = 0
            return r1
    }

    public final void b(android.graphics.Rect r12) {
            r11 = this;
            if (r12 != 0) goto L6
            android.graphics.Rect r12 = r11.getBounds()
        L6:
            int r0 = r12.left
            float r0 = (float) r0
            int r1 = r12.top
            float r1 = (float) r1
            int r2 = r12.right
            float r2 = (float) r2
            int r3 = r12.bottom
            float r3 = (float) r3
            android.graphics.RectF r4 = r11.c
            r4.set(r0, r1, r2, r3)
            android.graphics.Rect r0 = r11.d
            r0.set(r12)
            boolean r12 = r11.f
            if (r12 == 0) goto L56
            float r12 = r11.e
            float r1 = r11.a
            boolean r11 = r11.g
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 1069547520(0x3fc00000, float:1.5)
            if (r11 == 0) goto L37
            float r5 = r5 * r12
            double r5 = (double) r5
            double r7 = defpackage.w16.a
            double r7 = r2 - r7
            double r9 = (double) r1
            double r7 = r7 * r9
            double r7 = r7 + r5
            float r5 = (float) r7
            goto L3a
        L37:
            int r6 = defpackage.w16.b
            float r5 = r5 * r12
        L3a:
            if (r11 == 0) goto L44
            double r11 = (double) r12
            double r6 = defpackage.w16.a
            double r2 = r2 - r6
            double r6 = (double) r1
            double r2 = r2 * r6
            double r2 = r2 + r11
            float r12 = (float) r2
        L44:
            double r11 = (double) r12
            double r11 = java.lang.Math.ceil(r11)
            int r11 = (int) r11
            double r1 = (double) r5
            double r1 = java.lang.Math.ceil(r1)
            int r12 = (int) r1
            r0.inset(r11, r12)
            r4.set(r0)
        L56:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r4) {
            r3 = this;
            android.graphics.PorterDuffColorFilter r0 = r3.i
            android.graphics.Paint r1 = r3.b
            if (r0 == 0) goto L13
            android.graphics.ColorFilter r0 = r1.getColorFilter()
            if (r0 != 0) goto L13
            android.graphics.PorterDuffColorFilter r0 = r3.i
            r1.setColorFilter(r0)
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            android.graphics.RectF r2 = r3.c
            float r3 = r3.a
            r4.drawRoundRect(r2, r3, r3, r1)
            if (r0 == 0) goto L21
            r3 = 0
            r1.setColorFilter(r3)
        L21:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.d
            float r1 = r1.a
            r2.setRoundRect(r0, r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.j
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L1a
        La:
            android.content.res.ColorStateList r0 = r1.h
            if (r0 == 0) goto L14
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L1a
        L14:
            boolean r1 = super.isStateful()
            if (r1 == 0) goto L1c
        L1a:
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            r0.b(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.h
            int r1 = r0.getDefaultColor()
            int r4 = r0.getColorForState(r4, r1)
            android.graphics.Paint r0 = r3.b
            int r1 = r0.getColor()
            r2 = 1
            if (r4 == r1) goto L15
            r1 = r2
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 == 0) goto L1b
            r0.setColor(r4)
        L1b:
            android.content.res.ColorStateList r4 = r3.j
            if (r4 == 0) goto L2a
            android.graphics.PorterDuff$Mode r0 = r3.k
            if (r0 == 0) goto L2a
            android.graphics.PorterDuffColorFilter r4 = r3.a(r4, r0)
            r3.i = r4
            return r2
        L2a:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
            r0 = this;
            android.graphics.Paint r0 = r0.b
            r0.setAlpha(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            android.graphics.Paint r0 = r0.b
            r0.setColorFilter(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.j = r2
            android.graphics.PorterDuff$Mode r0 = r1.k
            android.graphics.PorterDuffColorFilter r2 = r1.a(r2, r0)
            r1.i = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.k = r2
            android.content.res.ColorStateList r0 = r1.j
            android.graphics.PorterDuffColorFilter r2 = r1.a(r0, r2)
            r1.i = r2
            r1.invalidateSelf()
            return
    }
}
