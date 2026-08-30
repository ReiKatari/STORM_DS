package g5;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: f  reason: collision with root package name */
    public boolean f5578f;

    @Override // g5.l
    public final void c(View view, float f8) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(a(f8));
        } else if (!this.f5578f) {
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f5578f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f8)));
                } catch (IllegalAccessException e6) {
                    Log.e("ViewSpline", "unable to setProgress", e6);
                } catch (InvocationTargetException e10) {
                    Log.e("ViewSpline", "unable to setProgress", e10);
                }
            }
        }
    }
}
