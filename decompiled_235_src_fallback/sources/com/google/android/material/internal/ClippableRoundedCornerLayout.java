package com.google.android.material.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ClippableRoundedCornerLayout extends android.widget.FrameLayout {
    public final float[] A;

    public ClippableRoundedCornerLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 8
            float[] r1 = new float[r1]
            r1 = {x000e: FILL_ARRAY_DATA  , data: [0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            r0.A = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.dispatchDraw(r1)
            return
    }

    public float[] getCornerRadii() {
            r0 = this;
            float[] r0 = r0.A
            return r0
    }
}
