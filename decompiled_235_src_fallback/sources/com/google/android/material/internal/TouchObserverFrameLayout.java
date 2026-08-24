package com.google.android.material.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TouchObserverFrameLayout extends android.widget.FrameLayout {
    public android.view.View.OnTouchListener A;

    public TouchObserverFrameLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.View$OnTouchListener r0 = r1.A
            if (r0 == 0) goto L7
            r0.onTouch(r1, r2)
        L7:
            boolean r1 = super.onInterceptTouchEvent(r2)
            return r1
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener r1) {
            r0 = this;
            r0.A = r1
            return
    }
}
