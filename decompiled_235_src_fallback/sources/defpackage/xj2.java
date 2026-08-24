package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xj2  reason: default package */
/* loaded from: classes.dex */
public abstract class xj2 extends defpackage.dv3 {
    public android.graphics.drawable.Drawable o0;
    public final android.graphics.Rect p0;
    public final android.graphics.Rect q0;
    public int r0;
    public final boolean s0;
    public boolean t0;

    public xj2(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r3 = 0
            r8.<init>(r9, r10, r3)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.p0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.q0 = r0
            r0 = 119(0x77, float:1.67E-43)
            r8.r0 = r0
            r6 = 1
            r8.s0 = r6
            r7 = 0
            r8.t0 = r7
            int[] r5 = new int[r7]
            r4 = 0
            defpackage.f04.r(r9, r10, r3, r4)
            int[] r2 = defpackage.a75.h
            r0 = r9
            r1 = r10
            defpackage.f04.s(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            int r10 = r8.r0
            int r10 = r9.getInt(r6, r10)
            r8.r0 = r10
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r7)
            if (r10 == 0) goto L3e
            r8.setForeground(r10)
        L3e:
            r10 = 2
            boolean r10 = r9.getBoolean(r10, r6)
            r8.s0 = r10
            r9.recycle()
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r8) {
            r7 = this;
            super.draw(r8)
            android.graphics.drawable.Drawable r0 = r7.o0
            if (r0 == 0) goto L54
            boolean r1 = r7.t0
            if (r1 == 0) goto L51
            r1 = 0
            r7.t0 = r1
            int r2 = r7.getRight()
            int r3 = r7.getLeft()
            int r2 = r2 - r3
            int r3 = r7.getBottom()
            int r4 = r7.getTop()
            int r3 = r3 - r4
            boolean r4 = r7.s0
            android.graphics.Rect r5 = r7.p0
            if (r4 == 0) goto L2a
            r5.set(r1, r1, r2, r3)
            goto L3f
        L2a:
            int r1 = r7.getPaddingLeft()
            int r4 = r7.getPaddingTop()
            int r6 = r7.getPaddingRight()
            int r2 = r2 - r6
            int r6 = r7.getPaddingBottom()
            int r3 = r3 - r6
            r5.set(r1, r4, r2, r3)
        L3f:
            int r1 = r7.r0
            int r2 = r0.getIntrinsicWidth()
            int r3 = r0.getIntrinsicHeight()
            android.graphics.Rect r7 = r7.q0
            android.view.Gravity.apply(r1, r2, r3, r5, r7)
            r0.setBounds(r7)
        L51:
            r0.draw(r8)
        L54:
            return
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float r1, float r2) {
            r0 = this;
            super.drawableHotspotChanged(r1, r2)
            android.graphics.drawable.Drawable r0 = r0.o0
            if (r0 == 0) goto La
            r0.setHotspot(r1, r2)
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r1.o0
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r1.o0
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L16:
            return
    }

    @Override // android.view.View
    public android.graphics.drawable.Drawable getForeground() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.o0
            return r0
    }

    @Override // android.view.View
    public int getForegroundGravity() {
            r0 = this;
            int r0 = r0.r0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
            r0 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r0.o0
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            return
    }

    @Override // defpackage.dv3, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            boolean r2 = r0.t0
            r1 = r1 | r2
            r0.t0 = r1
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r1 = 1
            r0.t0 = r1
            return
    }

    @Override // android.view.View
    public void setForeground(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.o0
            if (r0 == r3) goto L42
            if (r0 == 0) goto Lf
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r2.o0
            r2.unscheduleDrawable(r0)
        Lf:
            r2.o0 = r3
            r0 = 1
            r2.t0 = r0
            if (r3 == 0) goto L39
            r0 = 0
            r2.setWillNotDraw(r0)
            r3.setCallback(r2)
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L2a
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L2a:
            int r0 = r2.r0
            r1 = 119(0x77, float:1.67E-43)
            if (r0 != r1) goto L3c
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.getPadding(r0)
            goto L3c
        L39:
            r2.setWillNotDraw(r0)
        L3c:
            r2.requestLayout()
            r2.invalidate()
        L42:
            return
    }

    @Override // android.view.View
    public void setForegroundGravity(int r2) {
            r1 = this;
            int r0 = r1.r0
            if (r0 == r2) goto L2b
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            if (r0 != 0) goto Le
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r0
        Le:
            r0 = r2 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L14
            r2 = r2 | 48
        L14:
            r1.r0 = r2
            r0 = 119(0x77, float:1.67E-43)
            if (r2 != r0) goto L28
            android.graphics.drawable.Drawable r2 = r1.o0
            if (r2 == 0) goto L28
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.drawable.Drawable r0 = r1.o0
            r0.getPadding(r2)
        L28:
            r1.requestLayout()
        L2b:
            return
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r1 = r1.o0
            if (r2 != r1) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }
}
