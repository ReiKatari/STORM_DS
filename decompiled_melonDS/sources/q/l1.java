package q;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f11952a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f11953b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f11954c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && i2 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(f11953b);
            } else {
                drawable.setState(f11952a);
            }
            drawable.setState(state);
        }
    }

    public static Rect b(Drawable drawable) {
        int i2;
        int i10;
        int i11;
        int i12;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            Insets a10 = k1.a(drawable);
            i2 = a10.left;
            i10 = a10.top;
            i11 = a10.right;
            i12 = a10.bottom;
            return new Rect(i2, i10, i11, i12);
        }
        if (i13 < 29) {
            if (j1.f11928a) {
                try {
                    Object invoke = j1.f11929b.invoke(drawable, null);
                    if (invoke != null) {
                        return new Rect(j1.f11930c.getInt(invoke), j1.f11931d.getInt(invoke), j1.f11932e.getInt(invoke), j1.f11933f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        } else {
            boolean z10 = j1.f11928a;
        }
        return f11954c;
    }

    public static PorterDuff.Mode c(int i2, PorterDuff.Mode mode) {
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 9) {
                    switch (i2) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case l1.c.f8512h /* 15 */:
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
