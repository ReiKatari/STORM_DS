package g5;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: k  reason: collision with root package name */
    public boolean f5588k;

    @Override // g5.q
    public final boolean d(float f8, long j2, View view, d5.e eVar) {
        Method method;
        p pVar;
        float b10;
        if (view instanceof MotionLayout) {
            float b11 = b(f8, j2, view, eVar);
            pVar = this;
            ((MotionLayout) view).setProgress(b11);
        } else if (this.f5588k) {
            return false;
        } else {
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f5588k = true;
                method = null;
            }
            if (method != null) {
                try {
                    b10 = b(f8, j2, view, eVar);
                    pVar = this;
                } catch (IllegalAccessException e6) {
                    e = e6;
                    pVar = this;
                } catch (InvocationTargetException e10) {
                    e = e10;
                    pVar = this;
                }
                try {
                    method.invoke(view, Float.valueOf(b10));
                } catch (IllegalAccessException e11) {
                    e = e11;
                    Log.e("ViewTimeCycle", "unable to setProgress", e);
                    return pVar.f5596h;
                } catch (InvocationTargetException e12) {
                    e = e12;
                    Log.e("ViewTimeCycle", "unable to setProgress", e);
                    return pVar.f5596h;
                }
            } else {
                pVar = this;
            }
        }
        return pVar.f5596h;
    }
}
