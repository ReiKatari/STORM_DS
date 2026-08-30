package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends a6.b {
    public final /* synthetic */ ClockFaceView R;

    public c(ClockFaceView clockFaceView) {
        this.R = clockFaceView;
    }

    @Override // a6.b
    public final void d(View view, b6.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2077a;
        this.A.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.R.f3155u0.get(intValue - 1));
        }
        gVar.k(b6.f.a(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        gVar.b(b6.d.f2056e);
    }

    @Override // a6.b
    public final boolean g(View view, int i2, Bundle bundle) {
        ClockFaceView clockFaceView = this.R;
        ClockHandView clockHandView = clockFaceView.f3151q0;
        Rect rect = clockFaceView.f3152r0;
        if (i2 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(rect);
            float centerX = rect.centerX();
            float centerY = rect.centerY();
            clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.g(view, i2, bundle);
    }
}
