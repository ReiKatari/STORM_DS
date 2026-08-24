package com.google.android.material.timepicker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b implements android.view.ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ com.google.android.material.timepicker.ClockFaceView A;

    public b(com.google.android.material.timepicker.ClockFaceView r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
            r4 = this;
            com.google.android.material.timepicker.ClockFaceView r0 = r4.A
            com.google.android.material.timepicker.ClockHandView r1 = r0.s0
            boolean r2 = r0.isShown()
            r3 = 1
            if (r2 != 0) goto Lc
            goto L2f
        Lc:
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r2.removeOnPreDrawListener(r4)
            int r4 = r0.getHeight()
            int r4 = r4 / 2
            int r2 = r1.R
            int r4 = r4 - r2
            int r2 = r0.A0
            int r4 = r4 - r2
            int r2 = r0.q0
            if (r4 == r2) goto L2f
            r0.q0 = r4
            r0.o()
            int r4 = r0.q0
            r1.k0 = r4
            r1.invalidate()
        L2f:
            return r3
    }
}
