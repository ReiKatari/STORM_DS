package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ec7  reason: default package */
/* loaded from: classes.dex */
public class ec7 extends sn2 {
    public static boolean g = true;
    public static boolean h = true;
    public static boolean i = true;
    public static boolean j = true;

    public void W(View view, int i2, int i3, int i4, int i5) {
        if (i) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    public void X(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            if (!sn2.f) {
                try {
                    Field declaredField = View.class.getDeclaredField("mViewFlags");
                    sn2.e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                    Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
                }
                sn2.f = true;
            }
            Field field = sn2.e;
            if (field != null) {
                try {
                    sn2.e.setInt(view, (field.getInt(view) & (-13)) | i2);
                } catch (IllegalAccessException unused2) {
                }
            }
        } else if (j) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused3) {
                j = false;
            }
        }
    }

    public void Y(View view, Matrix matrix) {
        if (g) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }

    public void Z(ViewGroup viewGroup, Matrix matrix) {
        if (h) {
            try {
                viewGroup.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }
}
