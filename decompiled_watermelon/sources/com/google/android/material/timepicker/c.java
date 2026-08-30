package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class c extends z1 {
    public final /* synthetic */ ClockFaceView R;

    public c(ClockFaceView clockFaceView) {
        this.R = clockFaceView;
    }

    @Override // defpackage.z1
    public final void d(View view, t2 t2Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = t2Var.a;
        this.A.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.R.v0.get(intValue - 1));
        }
        t2Var.k(s2.a(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        t2Var.b(n2.e);
    }

    @Override // defpackage.z1
    public final boolean g(View view, int i, Bundle bundle) {
        ClockFaceView clockFaceView = this.R;
        ClockHandView clockHandView = clockFaceView.r0;
        Rect rect = clockFaceView.s0;
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
