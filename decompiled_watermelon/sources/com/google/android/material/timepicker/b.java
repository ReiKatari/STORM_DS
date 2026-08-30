package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView A;

    public b(ClockFaceView clockFaceView) {
        this.A = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.A;
        ClockHandView clockHandView = clockFaceView.r0;
        if (clockFaceView.isShown()) {
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((clockFaceView.getHeight() / 2) - clockHandView.R) - clockFaceView.z0;
            if (height != clockFaceView.p0) {
                clockFaceView.p0 = height;
                clockFaceView.o();
                clockHandView.j0 = clockFaceView.p0;
                clockHandView.invalidate();
            }
        }
        return true;
    }
}
