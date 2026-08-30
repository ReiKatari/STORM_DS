package c8;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class f0 extends l0.f {

    /* renamed from: c0  reason: collision with root package name */
    public static boolean f2640c0 = true;

    /* renamed from: d0  reason: collision with root package name */
    public static boolean f2641d0 = true;

    /* renamed from: e0  reason: collision with root package name */
    public static boolean f2642e0 = true;

    /* renamed from: f0  reason: collision with root package name */
    public static boolean f2643f0 = true;

    public void L(View view, int i2, int i10, int i11, int i12) {
        if (f2642e0) {
            try {
                view.setLeftTopRightBottom(i2, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f2642e0 = false;
            }
        }
    }

    public void M(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            if (!l0.f.X) {
                try {
                    Field declaredField = View.class.getDeclaredField("mViewFlags");
                    l0.f.R = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                    Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
                }
                l0.f.X = true;
            }
            Field field = l0.f.R;
            if (field != null) {
                try {
                    l0.f.R.setInt(view, i2 | (field.getInt(view) & (-13)));
                } catch (IllegalAccessException unused2) {
                }
            }
        } else if (f2643f0) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused3) {
                f2643f0 = false;
            }
        }
    }

    public void N(View view, Matrix matrix) {
        if (f2640c0) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f2640c0 = false;
            }
        }
    }

    public void O(ViewGroup viewGroup, Matrix matrix) {
        if (f2641d0) {
            try {
                viewGroup.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f2641d0 = false;
            }
        }
    }
}
