package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vq  reason: default package */
/* loaded from: classes.dex */
public final class vq {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static vq c;
    public wb5 a;

    public static synchronized vq a() {
        vq vqVar;
        synchronized (vq.class) {
            try {
                if (c == null) {
                    d();
                }
                vqVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vqVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        synchronized (vq.class) {
            e = wb5.e(i, mode);
        }
        return e;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, vq] */
    public static synchronized void d() {
        synchronized (vq.class) {
            if (c == null) {
                ?? obj = new Object();
                c = obj;
                obj.a = wb5.b();
                wb5 wb5Var = c.a;
                ka kaVar = new ka(2);
                synchronized (wb5Var) {
                    wb5Var.e = kaVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, zw0 zw0Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = wb5.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = zw0Var.b;
            if (!z && !zw0Var.a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z) {
                colorStateList = (ColorStateList) zw0Var.c;
            } else {
                colorStateList = null;
            }
            if (zw0Var.a) {
                mode = (PorterDuff.Mode) zw0Var.d;
            } else {
                mode = wb5.f;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = wb5.e(colorStateList.getColorForState(iArr, 0), mode);
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
