package defpackage;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ub7  reason: default package */
/* loaded from: classes.dex */
public final class ub7 extends vb7 {
    public boolean k;

    @Override // defpackage.vb7
    public final boolean d(float f, long j, u93 u93Var, View view) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(b(f, j, u93Var, view));
        } else if (this.k) {
            return false;
        } else {
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.k = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(b(f, j, u93Var, view)));
                } catch (IllegalAccessException e) {
                    Log.e("ViewTimeCycle", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewTimeCycle", "unable to setProgress", e2);
                }
            }
        }
        return this.h;
    }
}
