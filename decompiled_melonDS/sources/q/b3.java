package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b3 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f11855a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f11856b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f11857c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f11858d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f11859e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f11860f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f11861g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(k.a.f7920j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList d4 = d(context, i2);
        if (d4 != null && d4.isStateful()) {
            return d4.getColorForState(f11856b, d4.getDefaultColor());
        }
        ThreadLocal threadLocal = f11855a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f8 = typedValue.getFloat();
        int c4 = c(context, i2);
        return q5.a.d(c4, Math.round(Color.alpha(c4) * f8));
    }

    public static int c(Context context, int i2) {
        int[] iArr = f11861g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i2) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f11861g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = aj.g.z(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
