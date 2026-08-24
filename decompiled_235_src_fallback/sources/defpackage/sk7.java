package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sk7  reason: default package */
/* loaded from: classes.dex */
public abstract class sk7 extends android.graphics.drawable.Drawable {
    public android.graphics.drawable.Drawable A;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            if (r0 == 0) goto L7
            r0.applyTheme(r1)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.clearColorFilter()
            return
        L8:
            super.clearColorFilter()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r1 = r0.getCurrent()
            return r1
        L9:
            android.graphics.drawable.Drawable r1 = super.getCurrent()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            int r1 = r0.getMinimumHeight()
            return r1
        L9:
            int r1 = super.getMinimumHeight()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            int r1 = r0.getMinimumWidth()
            return r1
        L9:
            int r1 = super.getMinimumWidth()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            boolean r1 = r0.getPadding(r2)
            return r1
        L9:
            boolean r1 = super.getPadding(r2)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            int[] r1 = r0.getState()
            return r1
        L9:
            int[] r1 = super.getState()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            android.graphics.Region r1 = r0.getTransparentRegion()
            return r1
        L9:
            android.graphics.Region r1 = super.getTransparentRegion()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            if (r0 == 0) goto L7
            r0.jumpToCurrentState()
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            boolean r1 = r0.setLevel(r2)
            return r1
        L9:
            boolean r1 = super.onLevelChange(r2)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.setChangingConfigurations(r2)
            return
        L8:
            super.setChangingConfigurations(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int r2, android.graphics.PorterDuff.Mode r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.setColorFilter(r2, r3)
            return
        L8:
            super.setColorFilter(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            if (r0 == 0) goto L7
            r0.setFilterBitmap(r1)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float r1, float r2) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            if (r0 == 0) goto L7
            r0.setHotspot(r1, r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            if (r0 == 0) goto L7
            r0.setHotspotBounds(r1, r2, r3, r4)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            boolean r1 = r0.setState(r2)
            return r1
        L9:
            boolean r1 = super.setState(r2)
            return r1
    }
}
