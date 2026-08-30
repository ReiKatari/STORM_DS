package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: un6  reason: default package */
/* loaded from: classes.dex */
public final class un6 {
    public final ColorStateList a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public final ColorStateList k;
    public float l;
    public final int m;
    public boolean n = false;
    public boolean o = false;
    public Typeface p;

    public un6(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, by4.x);
        this.l = obtainStyledAttributes.getDimension(0, RecyclerView.A1);
        this.k = nk2.C(context, obtainStyledAttributes, 3);
        nk2.C(context, obtainStyledAttributes, 4);
        nk2.C(context, obtainStyledAttributes, 5);
        this.d = obtainStyledAttributes.getInt(2, 0);
        this.e = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.m = obtainStyledAttributes.getResourceId(i2, 0);
        this.b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = nk2.C(context, obtainStyledAttributes, 6);
        this.f = obtainStyledAttributes.getFloat(7, RecyclerView.A1);
        this.g = obtainStyledAttributes.getFloat(8, RecyclerView.A1);
        this.h = obtainStyledAttributes.getFloat(9, RecyclerView.A1);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, ay4.t);
        this.i = obtainStyledAttributes2.hasValue(0);
        this.j = obtainStyledAttributes2.getFloat(0, RecyclerView.A1);
        if (Build.VERSION.SDK_INT >= 26) {
            this.c = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.p;
        int i = this.d;
        if (typeface == null && (str = this.b) != null) {
            this.p = Typeface.create(str, i);
        }
        if (this.p == null) {
            int i2 = this.e;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        this.p = Typeface.DEFAULT;
                    } else {
                        this.p = Typeface.MONOSPACE;
                    }
                } else {
                    this.p = Typeface.SERIF;
                }
            } else {
                this.p = Typeface.SANS_SERIF;
            }
            this.p = Typeface.create(this.p, i);
        }
    }

    public final void b(Context context, yf2 yf2Var) {
        if (!c(context)) {
            a();
        }
        int i = this.m;
        if (i == 0) {
            this.n = true;
        }
        if (this.n) {
            yf2Var.K(this.p, true);
            return;
        }
        try {
            sn6 sn6Var = new sn6(this, yf2Var);
            ThreadLocal threadLocal = ac5.a;
            if (context.isRestricted()) {
                sn6Var.j(-4);
            } else {
                ac5.b(context, i, new TypedValue(), 0, sn6Var, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.n = true;
            yf2Var.J(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.b, e);
            this.n = true;
            yf2Var.J(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface b;
        String str;
        Typeface create;
        if (this.n) {
            return true;
        }
        int i = this.m;
        if (i != 0) {
            ThreadLocal threadLocal = ac5.a;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                b = null;
            } else {
                context2 = context;
                b = ac5.b(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (b != null) {
                this.p = b;
                this.n = true;
                return true;
            }
            if (!this.o) {
                this.o = true;
                Resources resources = context2.getResources();
                int i2 = this.m;
                if (i2 != 0 && resources.getResourceTypeName(i2).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i2);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), vx4.b);
                                str = obtainAttributes.getString(7);
                                obtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                }
                str = null;
                if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                    typeface = Typeface.create(create, this.d);
                }
            }
            if (typeface != null) {
                this.p = typeface;
                this.n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, yf2 yf2Var) {
        int i;
        int i2;
        e(context, textPaint, yf2Var);
        ColorStateList colorStateList = this.k;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        ColorStateList colorStateList2 = this.a;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(this.h, this.f, this.g, i2);
    }

    public final void e(Context context, TextPaint textPaint, yf2 yf2Var) {
        Typeface typeface;
        if (c(context) && this.n && (typeface = this.p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.p);
        b(context, new tn6(this, context, textPaint, yf2Var));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        Typeface P = nk2.P(context.getResources().getConfiguration(), typeface);
        if (P != null) {
            typeface = P;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = RecyclerView.A1;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.c);
        }
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
