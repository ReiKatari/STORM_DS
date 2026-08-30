package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f12001b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static r f12002c;

    /* renamed from: a  reason: collision with root package name */
    public k2 f12003a;

    public static synchronized r a() {
        r rVar;
        synchronized (r.class) {
            try {
                if (f12002c == null) {
                    d();
                }
                rVar = f12002c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public static synchronized PorterDuffColorFilter c(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter e6;
        synchronized (r.class) {
            e6 = k2.e(i2, mode);
        }
        return e6;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [q.r, java.lang.Object] */
    public static synchronized void d() {
        synchronized (r.class) {
            if (f12002c == null) {
                ?? obj = new Object();
                f12002c = obj;
                obj.f12003a = k2.b();
                k2 k2Var = f12002c.f12003a;
                w.x0 x0Var = new w.x0(8);
                synchronized (k2Var) {
                    k2Var.f11941e = x0Var;
                }
            }
        }
    }

    public static void e(Drawable drawable, pi.l lVar, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = k2.f11934f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = lVar.f11752b;
            if (!z10 && !lVar.f11751a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z10) {
                colorStateList = (ColorStateList) lVar.f11753c;
            } else {
                colorStateList = null;
            }
            if (lVar.f11751a) {
                mode = (PorterDuff.Mode) lVar.f11754d;
            } else {
                mode = k2.f11934f;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = k2.e(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i2) {
        return this.f12003a.c(context, i2);
    }
}
