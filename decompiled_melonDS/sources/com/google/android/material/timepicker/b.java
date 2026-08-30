package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView A;

    public b(ClockFaceView clockFaceView) {
        this.A = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.A;
        ClockHandView clockHandView = clockFaceView.f3151q0;
        if (clockFaceView.isShown()) {
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((clockFaceView.getHeight() / 2) - clockHandView.R) - clockFaceView.f3159y0;
            if (height != clockFaceView.f3175o0) {
                clockFaceView.f3175o0 = height;
                clockFaceView.o();
                clockHandView.f3169i0 = clockFaceView.f3175o0;
                clockHandView.invalidate();
            }
        }
        return true;
    }
}
