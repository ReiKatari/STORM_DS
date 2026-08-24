package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kp1  reason: default package */
/* loaded from: classes.dex */
public final class kp1 extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    public android.graphics.drawable.Drawable A;
    public boolean B;

    public final void a(android.graphics.Canvas r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            r0.draw(r1)
            return
    }

    public final void b(float r1, float r2) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            r0.setHotspot(r1, r2)
            return
    }

    public final void c(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            r0.setHotspotBounds(r1, r2, r3, r4)
            return
    }

    public final boolean d(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = super.setVisible(r2, r3)
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r1 = r1.A
            boolean r1 = r1.setVisible(r2, r3)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r2) {
            r1 = this;
            boolean r0 = r1.B
            if (r0 == 0) goto L7
            r1.a(r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            int r0 = r0.getChangingConfigurations()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable getCurrent() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            int r0 = r0.getMinimumHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            int r0 = r0.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            boolean r0 = r0.getPadding(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            int[] r0 = r0.getState()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.Region getTransparentRegion() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            android.graphics.Region r0 = r0.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            boolean r0 = r0.isAutoMirrored()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            boolean r0 = r0.isStateful()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            r0.jumpToCurrentState()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            r0.setBounds(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            boolean r0 = r0.setLevel(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            r0.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            r0.setAlpha(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            r0.setAutoMirrored(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            r0.setChangingConfigurations(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            r0.setColorFilter(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            r0.setDither(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            r0.setFilterBitmap(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float r2, float r3) {
            r1 = this;
            boolean r0 = r1.B
            if (r0 == 0) goto L7
            r1.b(r2, r3)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.B
            if (r0 == 0) goto L7
            r1.c(r2, r3, r4, r5)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] r2) {
            r1 = this;
            boolean r0 = r1.B
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r1 = r1.A
            boolean r1 = r1.setState(r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            r0.setTint(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            r0.setTintList(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            r0.setTintMode(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.B
            if (r0 == 0) goto L9
            boolean r1 = r1.d(r2, r3)
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            r0.unscheduleSelf(r2)
            return
    }
}
