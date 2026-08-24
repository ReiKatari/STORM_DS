package defpackage;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vp7  reason: default package */
/* loaded from: classes.dex */
public final class vp7 extends wp7 {
    public boolean k;

    @Override // defpackage.wp7
    public final boolean d(float f, long j, ng3 ng3Var, View view) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(b(f, j, ng3Var, view));
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
                    method.invoke(view, Float.valueOf(b(f, j, ng3Var, view)));
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
