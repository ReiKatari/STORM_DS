package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.stormds.emulator.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ol5  reason: default package */
/* loaded from: classes.dex */
public final class ol5 {
    public static ol5 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public pa e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final nl5 h = new yz3(6);

    public static synchronized ol5 b() {
        ol5 ol5Var;
        synchronized (ol5.class) {
            try {
                if (g == null) {
                    g = new ol5();
                }
                ol5Var = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ol5Var;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (ol5.class) {
            nl5 nl5Var = h;
            nl5Var.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) nl5Var.h(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) nl5Var.l(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable a(Context context, int i) {
        Drawable newDrawable;
        LayerDrawable k;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            hz3 hz3Var = (hz3) this.b.get(context);
            if (hz3Var != null) {
                WeakReference weakReference = (WeakReference) hz3Var.b(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        hz3Var.g(j);
                    }
                }
            }
            newDrawable = null;
        }
        if (newDrawable != null) {
            return newDrawable;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                k = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                k = pa.k(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                k = pa.k(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                k = pa.k(this, context, R.dimen.abc_star_small);
            }
            if (k == null) {
                k.setChangingConfigurations(typedValue.changingConfigurations);
                synchronized (this) {
                    try {
                        Drawable.ConstantState constantState2 = k.getConstantState();
                        if (constantState2 != null) {
                            hz3 hz3Var2 = (hz3) this.b.get(context);
                            if (hz3Var2 == null) {
                                hz3Var2 = new hz3((Object) null);
                                this.b.put(context, hz3Var2);
                            }
                            hz3Var2.f(j, new WeakReference(constantState2));
                            return k;
                        }
                        return k;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return k;
        }
        k = null;
        if (k == null) {
        }
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z) {
        Drawable a;
        try {
            if (!this.d) {
                this.d = true;
                Drawable c = c(context, R.drawable.abc_vector_test);
                if (c == null || (!(c instanceof bl7) && !"android.graphics.drawable.VectorDrawable".equals(c.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a = a(context, i);
            if (a == null) {
                a = context.getDrawable(i);
            }
            if (a != null) {
                a = g(context, i, z, a);
            }
            if (a != null) {
                bp1.a(a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        un6 un6Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (un6Var = (un6) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) un6Var.c(i);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            pa paVar = this.e;
            if (paVar != null) {
                colorStateList2 = paVar.l(context, i);
            }
            if (colorStateList2 != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                un6 un6Var2 = (un6) this.a.get(context);
                if (un6Var2 == null) {
                    un6Var2 = new un6(0);
                    this.a.put(context, un6Var2);
                }
                un6Var2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int round;
        ColorStateList f2 = f(context, i);
        PorterDuff.Mode mode = null;
        if (f2 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f2);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        pa paVar = this.e;
        int i2 = R.attr.colorControlNormal;
        if (paVar != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c = h57.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = ir.b;
                pa.u(findDrawableByLayerId, c, mode2);
                pa.u(layerDrawable.findDrawableByLayerId(16908303), h57.c(context, R.attr.colorControlNormal), mode2);
                pa.u(layerDrawable.findDrawableByLayerId(16908301), h57.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            } else if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b = h57.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = ir.b;
                pa.u(findDrawableByLayerId2, b, mode3);
                pa.u(layerDrawable2.findDrawableByLayerId(16908303), h57.c(context, R.attr.colorControlActivated), mode3);
                pa.u(layerDrawable2.findDrawableByLayerId(16908301), h57.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        pa paVar2 = this.e;
        boolean z3 = false;
        if (paVar2 != null) {
            PorterDuff.Mode mode4 = ir.b;
            if (!pa.e((int[]) paVar2.B, i)) {
                if (pa.e((int[]) paVar2.R, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    i2 = 16842801;
                    if (pa.e((int[]) paVar2.X, i)) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        round = Math.round(40.8f);
                        i2 = 16842800;
                        z2 = true;
                        if (z2) {
                            Drawable mutate2 = drawable.mutate();
                            mutate2.setColorFilter(ir.c(h57.c(context, i2), mode4));
                            if (round != -1) {
                                mutate2.setAlpha(round);
                            }
                            z3 = true;
                        }
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        z2 = false;
                        i2 = 0;
                        round = -1;
                        if (z2) {
                        }
                    }
                }
            }
            z2 = true;
            round = -1;
            if (z2) {
            }
        }
        if (!z3 && z) {
            return null;
        }
        return drawable;
    }
}
