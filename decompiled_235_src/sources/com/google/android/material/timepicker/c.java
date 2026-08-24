package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class c extends b2 {
    public final /* synthetic */ ClockFaceView R;

    public c(ClockFaceView clockFaceView) {
        this.R = clockFaceView;
    }

    @Override // defpackage.b2
    public final void d(View view, v2 v2Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = v2Var.a;
        this.A.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.R.w0.get(intValue - 1));
        }
        v2Var.k(u2.b(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        v2Var.b(p2.e);
    }

    @Override // defpackage.b2
    public final boolean g(View view, int i, Bundle bundle) {
        ClockFaceView clockFaceView = this.R;
        ClockHandView clockHandView = clockFaceView.s0;
        Rect rect = clockFaceView.t0;
        if (i == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(rect);
            float centerX = rect.centerX();
            float centerY = rect.centerY();
            clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.g(view, i, bundle);
    }
}
