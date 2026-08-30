package defpackage;

import android.view.MotionEvent;
import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qz3  reason: default package */
/* loaded from: classes.dex */
public final class qz3 {
    public static final qz3 a = new Object();

    public final boolean a(MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i);
        if ((Float.floatToRawIntBits(rawX) & Preference.DEFAULT_ORDER) < 2139095040) {
            rawY = motionEvent.getRawY(i);
            if ((Float.floatToRawIntBits(rawY) & Preference.DEFAULT_ORDER) < 2139095040) {
                return true;
            }
            return false;
        }
        return false;
    }
}
