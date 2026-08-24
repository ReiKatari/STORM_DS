package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ms  reason: default package */
/* loaded from: classes.dex */
public final class ms {
    public final TextView a;
    public wz0 b;
    public wz0 c;
    public wz0 d;
    public wz0 e;
    public wz0 f;
    public wz0 g;
    public wz0 h;
    public final vs i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public ms(TextView textView) {
        this.a = textView;
        this.i = new vs(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, wz0] */
    public static wz0 c(Context context, ir irVar, int i) {
        ColorStateList f;
        synchronized (irVar) {
            f = irVar.a.f(context, i);
        }
        if (f != null) {
            ?? obj = new Object();
            obj.b = true;
            obj.c = f;
            return obj;
        }
        return null;
    }

    public final void a(Drawable drawable, wz0 wz0Var) {
        if (drawable != null && wz0Var != null) {
            ir.e(drawable, wz0Var, this.a.getDrawableState());
        }
    }

    public final void b() {
        wz0 wz0Var = this.b;
        TextView textView = this.a;
        if (wz0Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        wz0 wz0Var = this.h;
        if (wz0Var != null) {
            return (ColorStateList) wz0Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        wz0 wz0Var = this.h;
        if (wz0Var != null) {
            return (PorterDuff.Mode) wz0Var.d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        float f;
        float f2;
        float f3;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i2;
        float f4;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        ir a = ir.a();
        int[] iArr = m75.h;
        m44 A = m44.A(context, attributeSet, iArr, i);
        ao7.m(textView, textView.getContext(), iArr, attributeSet, (TypedArray) A.L, i);
        TypedArray typedArray = (TypedArray) A.L;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a, typedArray.getResourceId(6, 0));
        }
        A.D();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = m75.x;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            m44 m44Var = new m44(context, obtainStyledAttributes);
            if (!z3 && obtainStyledAttributes.hasValue(14)) {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            m(context, m44Var);
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
            } else {
                str2 = null;
            }
            if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(13)) {
                str = obtainStyledAttributes.getString(13);
            } else {
                str = null;
            }
            m44Var.D();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        m44 m44Var2 = new m44(context, obtainStyledAttributes2);
        if (!z3 && obtainStyledAttributes2.hasValue(14)) {
            z2 = obtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i5 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, RecyclerView.B1);
        }
        m(context, m44Var2);
        m44Var2.D();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            ks.d(textView, str);
        }
        if (str2 != null) {
            js.b(textView, js.a(str2));
        }
        vs vsVar = this.i;
        Context context2 = vsVar.j;
        int[] iArr3 = m75.i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = vsVar.i;
        ao7.m(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            vsVar.a = obtainStyledAttributes3.getInt(5, 0);
        }
        if (obtainStyledAttributes3.hasValue(4)) {
            f = obtainStyledAttributes3.getDimension(4, -1.0f);
        } else {
            f = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(2)) {
            f2 = obtainStyledAttributes3.getDimension(2, -1.0f);
        } else {
            f2 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(1)) {
            f3 = obtainStyledAttributes3.getDimension(1, -1.0f);
        } else {
            f3 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr4[i6] = obtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                vsVar.f = vs.b(iArr4);
                vsVar.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (vsVar.j()) {
            if (vsVar.a == 1) {
                if (!vsVar.g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f2 == -1.0f) {
                        i4 = 2;
                        f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i4 = 2;
                    }
                    if (f3 == -1.0f) {
                        f3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                    }
                    float f5 = f3;
                    if (f == -1.0f) {
                        f = 1.0f;
                    }
                    vsVar.k(f2, f5, f);
                }
                vsVar.h();
            }
        } else {
            vsVar.a = 0;
        }
        if (eq7.c && vsVar.a != 0) {
            int[] iArr5 = vsVar.f;
            if (iArr5.length > 0) {
                if (ks.a(textView) != -1.0f) {
                    ks.b(textView, Math.round(vsVar.d), Math.round(vsVar.e), Math.round(vsVar.c), 0);
                } else {
                    ks.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        if (resourceId4 != -1) {
            drawable = a.b(context, resourceId4);
        } else {
            drawable = null;
        }
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        if (resourceId5 != -1) {
            drawable2 = a.b(context, resourceId5);
        } else {
            drawable2 = null;
        }
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        if (resourceId6 != -1) {
            drawable3 = a.b(context, resourceId6);
        } else {
            drawable3 = null;
        }
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        if (resourceId7 != -1) {
            drawable4 = a.b(context, resourceId7);
        } else {
            drawable4 = null;
        }
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        if (resourceId8 != -1) {
            drawable5 = a.b(context, resourceId8);
        } else {
            drawable5 = null;
        }
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        if (resourceId9 != -1) {
            drawable6 = a.b(context, resourceId9);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
                Drawable drawable7 = compoundDrawablesRelative[0];
                if (drawable7 == null && compoundDrawablesRelative[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative[1];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative[3];
                    }
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative[2], drawable4);
                }
            }
        } else {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative2[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative2[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = ge7.A(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(bp1.c(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i7 = peekValue.data;
                int i8 = i7 & 15;
                f4 = TypedValue.complexToFloat(i7);
                i3 = i8;
                i2 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i2) {
                    ii2.O(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i2) {
                    ii2.P(textView, dimensionPixelSize2);
                }
                if (f4 == -1.0f) {
                    if (i3 == i2) {
                        ii2.Q(textView, (int) f4);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        c2.m(textView, i3, f4);
                        return;
                    } else {
                        ii2.Q(textView, Math.round(TypedValue.applyDimension(i3, f4, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i2 = -1;
            f4 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i2 = -1;
            f4 = -1.0f;
        }
        i3 = i2;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i2) {
        }
        if (dimensionPixelSize2 != i2) {
        }
        if (f4 == -1.0f) {
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, m75.x);
        m44 m44Var = new m44(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, RecyclerView.B1);
        }
        m(context, m44Var);
        if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            ks.d(textView, string);
        }
        m44Var.D();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        vs vsVar = this.i;
        if (vsVar.j()) {
            DisplayMetrics displayMetrics = vsVar.j.getResources().getDisplayMetrics();
            vsVar.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (vsVar.h()) {
                vsVar.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        vs vsVar = this.i;
        if (vsVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = vsVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                vsVar.f = vs.b(iArr2);
                if (!vsVar.i()) {
                    e41.A(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                vsVar.g = false;
            }
            if (vsVar.h()) {
                vsVar.a();
            }
        }
    }

    public final void j(int i) {
        vs vsVar = this.i;
        if (vsVar.j()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = vsVar.j.getResources().getDisplayMetrics();
                    vsVar.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (vsVar.h()) {
                        vsVar.a();
                        return;
                    }
                    return;
                }
                i.h(lb1.g(i, "Unknown auto-size text type: "));
                return;
            }
            vsVar.a = 0;
            vsVar.d = -1.0f;
            vsVar.e = -1.0f;
            vsVar.c = -1.0f;
            vsVar.f = new int[0];
            vsVar.b = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wz0] */
    public final void k(ColorStateList colorStateList) {
        boolean z;
        if (this.h == null) {
            this.h = new Object();
        }
        wz0 wz0Var = this.h;
        wz0Var.c = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        wz0Var.b = z;
        this.b = wz0Var;
        this.c = wz0Var;
        this.d = wz0Var;
        this.e = wz0Var;
        this.f = wz0Var;
        this.g = wz0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wz0] */
    public final void l(PorterDuff.Mode mode) {
        boolean z;
        if (this.h == null) {
            this.h = new Object();
        }
        wz0 wz0Var = this.h;
        wz0Var.d = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        wz0Var.a = z;
        this.b = wz0Var;
        this.c = wz0Var;
        this.d = wz0Var;
        this.e = wz0Var;
        this.f = wz0Var;
        this.g = wz0Var;
    }

    public final void m(Context context, m44 m44Var) {
        String string;
        boolean z;
        boolean z2;
        int i = this.j;
        TypedArray typedArray = (TypedArray) m44Var.L;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        int i4 = 10;
        boolean z3 = false;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            this.l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.l = Typeface.SERIF;
                    return;
                }
                this.l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.l = null;
        if (typedArray.hasValue(12)) {
            i4 = 12;
        }
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface n = m44Var.n(i4, this.j, new hs(this, i6, i7, new WeakReference(this.a)));
                if (n != null) {
                    if (i2 >= 28 && this.k != -1) {
                        Typeface create = Typeface.create(n, 0);
                        int i8 = this.k;
                        if ((this.j & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.l = ls.a(create, i8, z2);
                    } else {
                        this.l = n;
                    }
                }
                if (this.l == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.m = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l == null && (string = typedArray.getString(i4)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i9 = this.k;
                if ((this.j & 2) != 0) {
                    z3 = true;
                }
                this.l = ls.a(create2, i9, z3);
                return;
            }
            this.l = Typeface.create(string, this.j);
        }
    }
}
