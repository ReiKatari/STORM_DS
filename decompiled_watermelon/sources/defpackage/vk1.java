package defpackage;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vk1  reason: default package */
/* loaded from: classes.dex */
public abstract class vk1 {
    public static final int[] a = {16842912};
    public static final int[] b = new int[0];
    public static final Rect c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(b);
            } else {
                drawable.setState(a);
            }
            drawable.setState(state);
        }
    }

    public static Rect b(Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            Insets a2 = sk1.a(drawable);
            i = a2.left;
            i2 = a2.top;
            i3 = a2.right;
            i4 = a2.bottom;
            return new Rect(i, i2, i3, i4);
        }
        if (i5 < 29) {
            if (rk1.a) {
                try {
                    Object invoke = rk1.b.invoke(drawable, null);
                    if (invoke != null) {
                        return new Rect(rk1.c.getInt(invoke), rk1.d.getInt(invoke), rk1.e.getInt(invoke), rk1.f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        } else {
            boolean z = rk1.a;
        }
        return c;
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case ig7.e /* 15 */:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
