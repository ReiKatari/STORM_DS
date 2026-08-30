package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zr  reason: default package */
/* loaded from: classes.dex */
public final class zr {
    public final TextView a;
    public zw0 b;
    public zw0 c;
    public zw0 d;
    public zw0 e;
    public zw0 f;
    public zw0 g;
    public zw0 h;
    public final is i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public zr(TextView textView) {
        this.a = textView;
        this.i = new is(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [zw0, java.lang.Object] */
    public static zw0 c(Context context, vq vqVar, int i) {
        ColorStateList f;
        synchronized (vqVar) {
            f = vqVar.a.f(context, i);
        }
        if (f != null) {
            ?? obj = new Object();
            obj.b = true;
            obj.c = f;
            return obj;
        }
        return null;
    }

    public final void a(Drawable drawable, zw0 zw0Var) {
        if (drawable != null && zw0Var != null) {
            vq.e(drawable, zw0Var, this.a.getDrawableState());
        }
    }

    public final void b() {
        zw0 zw0Var = this.b;
        TextView textView = this.a;
        if (zw0Var != null || this.c != null || this.d != null || this.e != null) {
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
        zw0 zw0Var = this.h;
        if (zw0Var != null) {
            return (ColorStateList) zw0Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        zw0 zw0Var = this.h;
        if (zw0Var != null) {
            return (PorterDuff.Mode) zw0Var.d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, by4.x);
        n85 n85Var = new n85(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, RecyclerView.A1);
        }
        m(context, n85Var);
        if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            xr.d(textView, string);
        }
        n85Var.t();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        is isVar = this.i;
        if (isVar.j()) {
            DisplayMetrics displayMetrics = isVar.j.getResources().getDisplayMetrics();
            isVar.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (isVar.h()) {
                isVar.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        is isVar = this.i;
        if (isVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = isVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                isVar.f = is.b(iArr2);
                if (!isVar.i()) {
                    f81.i(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                isVar.g = false;
            }
            if (isVar.h()) {
                isVar.a();
            }
        }
    }

    public final void j(int i) {
        is isVar = this.i;
        if (isVar.j()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = isVar.j.getResources().getDisplayMetrics();
                    isVar.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (isVar.h()) {
                        isVar.a();
                        return;
                    }
                    return;
                }
                i.i(wh1.g(i, "Unknown auto-size text type: "));
                return;
            }
            isVar.a = 0;
            isVar.d = -1.0f;
            isVar.e = -1.0f;
            isVar.c = -1.0f;
            isVar.f = new int[0];
            isVar.b = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [zw0, java.lang.Object] */
    public final void k(ColorStateList colorStateList) {
        boolean z;
        if (this.h == null) {
            this.h = new Object();
        }
        zw0 zw0Var = this.h;
        zw0Var.c = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        zw0Var.b = z;
        this.b = zw0Var;
        this.c = zw0Var;
        this.d = zw0Var;
        this.e = zw0Var;
        this.f = zw0Var;
        this.g = zw0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [zw0, java.lang.Object] */
    public final void l(PorterDuff.Mode mode) {
        boolean z;
        if (this.h == null) {
            this.h = new Object();
        }
        zw0 zw0Var = this.h;
        zw0Var.d = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        zw0Var.a = z;
        this.b = zw0Var;
        this.c = zw0Var;
        this.d = zw0Var;
        this.e = zw0Var;
        this.f = zw0Var;
        this.g = zw0Var;
    }

    public final void m(Context context, n85 n85Var) {
        String string;
        boolean z;
        boolean z2;
        int i = this.j;
        TypedArray typedArray = (TypedArray) n85Var.L;
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
                Typeface i8 = n85Var.i(i4, this.j, new ur(this, i6, i7, new WeakReference(this.a)));
                if (i8 != null) {
                    if (i2 >= 28 && this.k != -1) {
                        Typeface create = Typeface.create(i8, 0);
                        int i9 = this.k;
                        if ((this.j & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.l = yr.a(create, i9, z2);
                    } else {
                        this.l = i8;
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
                int i10 = this.k;
                if ((this.j & 2) != 0) {
                    z3 = true;
                }
                this.l = yr.a(create2, i10, z3);
                return;
            }
            this.l = Typeface.create(string, this.j);
        }
    }
}
