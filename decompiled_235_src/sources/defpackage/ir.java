package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ir  reason: default package */
/* loaded from: classes.dex */
public final class ir {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static ir c;
    public ol5 a;

    public static synchronized ir a() {
        ir irVar;
        synchronized (ir.class) {
            try {
                if (c == null) {
                    d();
                }
                irVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return irVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        synchronized (ir.class) {
            e = ol5.e(i, mode);
        }
        return e;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ir, java.lang.Object] */
    public static synchronized void d() {
        synchronized (ir.class) {
            if (c == null) {
                ?? obj = new Object();
                c = obj;
                obj.a = ol5.b();
                ol5 ol5Var = c.a;
                pa paVar = new pa(2);
                synchronized (ol5Var) {
                    ol5Var.e = paVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, wz0 wz0Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = ol5.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = wz0Var.b;
            if (!z && !wz0Var.a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z) {
                colorStateList = (ColorStateList) wz0Var.c;
            } else {
                colorStateList = null;
            }
            if (wz0Var.a) {
                mode = (PorterDuff.Mode) wz0Var.d;
            } else {
                mode = ol5.f;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = ol5.e(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.c(context, i);
    }
}
