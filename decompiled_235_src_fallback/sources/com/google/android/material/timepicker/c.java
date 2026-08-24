package com.google.android.material.timepicker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class c extends defpackage.b2 {
    public final /* synthetic */ com.google.android.material.timepicker.ClockFaceView R;

    public c(com.google.android.material.timepicker.ClockFaceView r1) {
            r0 = this;
            r0.R = r1
            r0.<init>()
            return
    }

    @Override // defpackage.b2
    public final void d(android.view.View r4, defpackage.v2 r5) {
            r3 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.a
            android.view.View$AccessibilityDelegate r1 = r3.A
            r1.onInitializeAccessibilityNodeInfo(r4, r0)
            r1 = 2131427715(0x7f0b0183, float:1.8477054E38)
            java.lang.Object r1 = r4.getTag(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 <= 0) goto L25
            com.google.android.material.timepicker.ClockFaceView r3 = r3.R
            android.util.SparseArray r3 = r3.w0
            int r2 = r1 + (-1)
            java.lang.Object r3 = r3.get(r2)
            android.view.View r3 = (android.view.View) r3
            r0.setTraversalAfter(r3)
        L25:
            r3 = 0
            boolean r4 = r4.isSelected()
            r2 = 1
            u2 r3 = defpackage.u2.b(r4, r3, r2, r1, r2)
            r5.k(r3)
            r0.setClickable(r2)
            p2 r3 = defpackage.p2.e
            r5.b(r3)
            return
    }

    @Override // defpackage.b2
    public final boolean g(android.view.View r12, int r13, android.os.Bundle r14) {
            r11 = this;
            com.google.android.material.timepicker.ClockFaceView r0 = r11.R
            com.google.android.material.timepicker.ClockHandView r1 = r0.s0
            android.graphics.Rect r0 = r0.t0
            r2 = 16
            if (r13 != r2) goto L2f
            long r3 = android.os.SystemClock.uptimeMillis()
            r12.getHitRect(r0)
            int r11 = r0.centerX()
            float r8 = (float) r11
            int r11 = r0.centerY()
            float r9 = (float) r11
            r7 = 0
            r10 = 0
            r5 = r3
            android.view.MotionEvent r11 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r1.onTouchEvent(r11)
            r7 = 1
            android.view.MotionEvent r11 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r1.onTouchEvent(r11)
            r11 = 1
            return r11
        L2f:
            boolean r11 = super.g(r12, r13, r14)
            return r11
    }
}
