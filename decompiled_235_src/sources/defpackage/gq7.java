package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq7  reason: default package */
/* loaded from: classes.dex */
public class gq7 extends mp2 {
    public static boolean f = true;
    public static boolean g = true;
    public static boolean h = true;
    public static boolean i = true;

    public void b0(View view, int i2, int i3, int i4, int i5) {
        if (h) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }

    public void c0(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            if (!mp2.e) {
                try {
                    Field declaredField = View.class.getDeclaredField("mViewFlags");
                    mp2.d = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                    Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
                }
                mp2.e = true;
            }
            Field field = mp2.d;
            if (field != null) {
                try {
                    mp2.d.setInt(view, (field.getInt(view) & (-13)) | i2);
                } catch (IllegalAccessException unused2) {
                }
            }
        } else if (i) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused3) {
                i = false;
            }
        }
    }

    public void d0(View view, Matrix matrix) {
        if (f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    public void e0(ViewGroup viewGroup, Matrix matrix) {
        if (g) {
            try {
                viewGroup.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
