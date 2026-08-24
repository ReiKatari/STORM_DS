package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView A;

    public b(ClockFaceView clockFaceView) {
        this.A = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.A;
        ClockHandView clockHandView = clockFaceView.s0;
        if (clockFaceView.isShown()) {
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((clockFaceView.getHeight() / 2) - clockHandView.R) - clockFaceView.A0;
            if (height != clockFaceView.q0) {
                clockFaceView.q0 = height;
                clockFaceView.o();
                clockHandView.k0 = clockFaceView.q0;
                clockHandView.invalidate();
            }
        }
        return true;
    }
}
