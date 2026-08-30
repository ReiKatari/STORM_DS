package b4;

import android.view.MotionEvent;
import androidx.preference.Preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a  reason: collision with root package name */
    public static final j2 f1868a = new Object();

    public final boolean a(MotionEvent motionEvent, int i2) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i2);
        if ((Float.floatToRawIntBits(rawX) & Preference.DEFAULT_ORDER) < 2139095040) {
            rawY = motionEvent.getRawY(i2);
            if ((Float.floatToRawIntBits(rawY) & Preference.DEFAULT_ORDER) < 2139095040) {
                return true;
            }
            return false;
        }
        return false;
    }
}
