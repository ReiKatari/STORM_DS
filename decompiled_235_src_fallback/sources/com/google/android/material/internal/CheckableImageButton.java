package com.google.android.material.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CheckableImageButton extends defpackage.mr implements android.widget.Checkable {
    public static final int[] f0 = null;
    public boolean R;
    public boolean d0;
    public boolean e0;

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.internal.CheckableImageButton.f0 = r0
            return
    }

    public CheckableImageButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969254(0x7f0402a6, float:1.7547185E38)
            r1.<init>(r2, r3, r0)
            r2 = 1
            r1.d0 = r2
            r1.e0 = r2
            l60 r2 = new l60
            r3 = 1
            r2.<init>(r1, r3)
            defpackage.ao7.n(r1, r2)
            return
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
            r0 = this;
            boolean r0 = r0.R
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
            r1 = this;
            boolean r0 = r1.R
            if (r0 == 0) goto L11
            int r2 = r2 + 1
            int[] r1 = super.onCreateDrawableState(r2)
            int[] r2 = com.google.android.material.internal.CheckableImageButton.f0
            int[] r1 = android.view.View.mergeDrawableStates(r1, r2)
            return r1
        L11:
            int[] r1 = super.onCreateDrawableState(r2)
            return r1
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.cq0
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            cq0 r2 = (defpackage.cq0) r2
            android.os.Parcelable r0 = r2.A
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.L
            r1.setChecked(r2)
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            cq0 r1 = new cq0
            r1.<init>(r0)
            boolean r2 = r2.R
            r1.L = r2
            return r1
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            boolean r0 = r1.d0
            if (r0 == r2) goto La
            r1.d0 = r2
            r2 = 0
            r1.sendAccessibilityEvent(r2)
        La:
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            boolean r0 = r1.d0
            if (r0 == 0) goto L12
            boolean r0 = r1.R
            if (r0 == r2) goto L12
            r1.R = r2
            r1.refreshDrawableState()
            r2 = 2048(0x800, float:2.87E-42)
            r1.sendAccessibilityEvent(r2)
        L12:
            return
    }

    public void setPressable(boolean r1) {
            r0 = this;
            r0.e0 = r1
            return
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
            r1 = this;
            boolean r0 = r1.e0
            if (r0 == 0) goto L7
            super.setPressed(r2)
        L7:
            return
    }

    @Override // android.widget.Checkable
    public final void toggle() {
            r1 = this;
            boolean r0 = r1.R
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
