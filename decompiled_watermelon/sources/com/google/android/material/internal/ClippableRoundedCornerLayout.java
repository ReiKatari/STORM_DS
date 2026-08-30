package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {
    public final float[] A;

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new float[]{RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1};
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float[] getCornerRadii() {
        return this.A;
    }
}
