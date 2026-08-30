package q;

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
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f12030a;

    /* renamed from: b  reason: collision with root package name */
    public pi.l f12031b;

    /* renamed from: c  reason: collision with root package name */
    public pi.l f12032c;

    /* renamed from: d  reason: collision with root package name */
    public pi.l f12033d;

    /* renamed from: e  reason: collision with root package name */
    public pi.l f12034e;

    /* renamed from: f  reason: collision with root package name */
    public pi.l f12035f;

    /* renamed from: g  reason: collision with root package name */
    public pi.l f12036g;

    /* renamed from: h  reason: collision with root package name */
    public pi.l f12037h;

    /* renamed from: i  reason: collision with root package name */
    public final e1 f12038i;

    /* renamed from: j  reason: collision with root package name */
    public int f12039j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f12040k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f12041l;
    public boolean m;

    public v0(TextView textView) {
        this.f12030a = textView;
        this.f12038i = new e1(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [pi.l, java.lang.Object] */
    public static pi.l c(Context context, r rVar, int i2) {
        ColorStateList f8;
        synchronized (rVar) {
            f8 = rVar.f12003a.f(context, i2);
        }
        if (f8 != null) {
            ?? obj = new Object();
            obj.f11752b = true;
            obj.f11753c = f8;
            return obj;
        }
        return null;
    }

    public final void a(Drawable drawable, pi.l lVar) {
        if (drawable != null && lVar != null) {
            r.e(drawable, lVar, this.f12030a.getDrawableState());
        }
    }

    public final void b() {
        pi.l lVar = this.f12031b;
        TextView textView = this.f12030a;
        if (lVar != null || this.f12032c != null || this.f12033d != null || this.f12034e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f12031b);
            a(compoundDrawables[1], this.f12032c);
            a(compoundDrawables[2], this.f12033d);
            a(compoundDrawables[3], this.f12034e);
        }
        if (this.f12035f == null && this.f12036g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f12035f);
        a(compoundDrawablesRelative[2], this.f12036g);
    }

    public final ColorStateList d() {
        pi.l lVar = this.f12037h;
        if (lVar != null) {
            return (ColorStateList) lVar.f11753c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        pi.l lVar = this.f12037h;
        if (lVar != null) {
            return (PorterDuff.Mode) lVar.f11754d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r26, int r27) {
        /*
            Method dump skipped, instructions count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.v0.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i2) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, k.a.f7933x);
        p1.c1 c1Var = new p1.c1(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f12030a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, c1Var);
        if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            t0.d(textView, string);
        }
        c1Var.p();
        Typeface typeface = this.f12041l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f12039j);
        }
    }

    public final void h(int i2, int i10, int i11, int i12) {
        e1 e1Var = this.f12038i;
        if (e1Var.j()) {
            DisplayMetrics displayMetrics = e1Var.f11899j.getResources().getDisplayMetrics();
            e1Var.k(TypedValue.applyDimension(i12, i2, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (e1Var.h()) {
                e1Var.a();
            }
        }
    }

    public final void i(int[] iArr, int i2) {
        e1 e1Var = this.f12038i;
        if (e1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = e1Var.f11899j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArr2[i10] = Math.round(TypedValue.applyDimension(i2, iArr[i10], displayMetrics));
                    }
                }
                e1Var.f11895f = e1.b(iArr2);
                if (!e1Var.i()) {
                    m9.o.q(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                e1Var.f11896g = false;
            }
            if (e1Var.h()) {
                e1Var.a();
            }
        }
    }

    public final void j(int i2) {
        e1 e1Var = this.f12038i;
        if (e1Var.j()) {
            if (i2 != 0) {
                if (i2 == 1) {
                    DisplayMetrics displayMetrics = e1Var.f11899j.getResources().getDisplayMetrics();
                    e1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (e1Var.h()) {
                        e1Var.a();
                        return;
                    }
                    return;
                }
                a0.j.h(w.d.l(i2, "Unknown auto-size text type: "));
                return;
            }
            e1Var.f11890a = 0;
            e1Var.f11893d = -1.0f;
            e1Var.f11894e = -1.0f;
            e1Var.f11892c = -1.0f;
            e1Var.f11895f = new int[0];
            e1Var.f11891b = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [pi.l, java.lang.Object] */
    public final void k(ColorStateList colorStateList) {
        boolean z10;
        if (this.f12037h == null) {
            this.f12037h = new Object();
        }
        pi.l lVar = this.f12037h;
        lVar.f11753c = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        lVar.f11752b = z10;
        this.f12031b = lVar;
        this.f12032c = lVar;
        this.f12033d = lVar;
        this.f12034e = lVar;
        this.f12035f = lVar;
        this.f12036g = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [pi.l, java.lang.Object] */
    public final void l(PorterDuff.Mode mode) {
        boolean z10;
        if (this.f12037h == null) {
            this.f12037h = new Object();
        }
        pi.l lVar = this.f12037h;
        lVar.f11754d = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        lVar.f11751a = z10;
        this.f12031b = lVar;
        this.f12032c = lVar;
        this.f12033d = lVar;
        this.f12034e = lVar;
        this.f12035f = lVar;
        this.f12036g = lVar;
    }

    public final void m(Context context, p1.c1 c1Var) {
        String string;
        boolean z10;
        boolean z11;
        int i2 = this.f12039j;
        TypedArray typedArray = (TypedArray) c1Var.B;
        this.f12039j = typedArray.getInt(2, i2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.f12040k = i11;
            if (i11 != -1) {
                this.f12039j &= 2;
            }
        }
        int i12 = 10;
        boolean z12 = false;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            this.f12041l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f12041l = Typeface.SERIF;
                    return;
                }
                this.f12041l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f12041l = null;
        if (typedArray.hasValue(12)) {
            i12 = 12;
        }
        int i14 = this.f12040k;
        int i15 = this.f12039j;
        if (!context.isRestricted()) {
            try {
                Typeface k10 = c1Var.k(i12, this.f12039j, new r0(this, i14, i15, new WeakReference(this.f12030a)));
                if (k10 != null) {
                    if (i10 >= 28 && this.f12040k != -1) {
                        Typeface create = Typeface.create(k10, 0);
                        int i16 = this.f12040k;
                        if ((this.f12039j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f12041l = u0.a(create, i16, z11);
                    } else {
                        this.f12041l = k10;
                    }
                }
                if (this.f12041l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f12041l == null && (string = typedArray.getString(i12)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f12040k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i17 = this.f12040k;
                if ((this.f12039j & 2) != 0) {
                    z12 = true;
                }
                this.f12041l = u0.a(create2, i17, z12);
                return;
            }
            this.f12041l = Typeface.create(string, this.f12039j);
        }
    }
}
