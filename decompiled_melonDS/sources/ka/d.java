package ka;

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
import k7.w;
import l0.f;
import p5.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f8116a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8117b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8118c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8119d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8120e;

    /* renamed from: f  reason: collision with root package name */
    public final float f8121f;

    /* renamed from: g  reason: collision with root package name */
    public final float f8122g;

    /* renamed from: h  reason: collision with root package name */
    public final float f8123h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8124i;

    /* renamed from: j  reason: collision with root package name */
    public final float f8125j;

    /* renamed from: k  reason: collision with root package name */
    public final ColorStateList f8126k;

    /* renamed from: l  reason: collision with root package name */
    public float f8127l;
    public final int m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8128n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8129o = false;

    /* renamed from: p  reason: collision with root package name */
    public Typeface f8130p;

    public d(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, k.a.f7933x);
        this.f8127l = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f8126k = w.m(context, obtainStyledAttributes, 3);
        w.m(context, obtainStyledAttributes, 4);
        w.m(context, obtainStyledAttributes, 5);
        this.f8119d = obtainStyledAttributes.getInt(2, 0);
        this.f8120e = obtainStyledAttributes.getInt(1, 1);
        int i10 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.m = obtainStyledAttributes.getResourceId(i10, 0);
        this.f8117b = obtainStyledAttributes.getString(i10);
        obtainStyledAttributes.getBoolean(14, false);
        this.f8116a = w.m(context, obtainStyledAttributes, 6);
        this.f8121f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f8122g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f8123h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, t9.a.f13168t);
        this.f8124i = obtainStyledAttributes2.hasValue(0);
        this.f8125j = obtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8118c = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f8130p;
        int i2 = this.f8119d;
        if (typeface == null && (str = this.f8117b) != null) {
            this.f8130p = Typeface.create(str, i2);
        }
        if (this.f8130p == null) {
            int i10 = this.f8120e;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        this.f8130p = Typeface.DEFAULT;
                    } else {
                        this.f8130p = Typeface.MONOSPACE;
                    }
                } else {
                    this.f8130p = Typeface.SERIF;
                }
            } else {
                this.f8130p = Typeface.SANS_SERIF;
            }
            this.f8130p = Typeface.create(this.f8130p, i2);
        }
    }

    public final void b(Context context, f fVar) {
        if (!c(context)) {
            a();
        }
        int i2 = this.m;
        if (i2 == 0) {
            this.f8128n = true;
        }
        if (this.f8128n) {
            fVar.y(this.f8130p, true);
            return;
        }
        try {
            b bVar = new b(this, fVar);
            ThreadLocal threadLocal = k.f11352a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                k.a(context, i2, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f8128n = true;
            fVar.x(1);
        } catch (Exception e6) {
            Log.d("TextAppearance", "Error loading font " + this.f8117b, e6);
            this.f8128n = true;
            fVar.x(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface a10;
        String str;
        Typeface create;
        if (this.f8128n) {
            return true;
        }
        int i2 = this.m;
        if (i2 != 0) {
            ThreadLocal threadLocal = k.f11352a;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                a10 = null;
            } else {
                context2 = context;
                a10 = k.a(context2, i2, new TypedValue(), 0, null, false, true);
            }
            if (a10 != null) {
                this.f8130p = a10;
                this.f8128n = true;
                return true;
            }
            if (!this.f8129o) {
                this.f8129o = true;
                Resources resources = context2.getResources();
                int i10 = this.m;
                if (i10 != 0 && resources.getResourceTypeName(i10).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i10);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), l5.a.f8921b);
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
                    typeface = Typeface.create(create, this.f8119d);
                }
            }
            if (typeface != null) {
                this.f8130p = typeface;
                this.f8128n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, f fVar) {
        int i2;
        int i10;
        e(context, textPaint, fVar);
        ColorStateList colorStateList = this.f8126k;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i2 = -16777216;
        }
        textPaint.setColor(i2);
        ColorStateList colorStateList2 = this.f8116a;
        if (colorStateList2 != null) {
            i10 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i10 = 0;
        }
        textPaint.setShadowLayer(this.f8123h, this.f8121f, this.f8122g, i10);
    }

    public final void e(Context context, TextPaint textPaint, f fVar) {
        Typeface typeface;
        if (c(context) && this.f8128n && (typeface = this.f8130p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f8130p);
        b(context, new c(this, context, textPaint, fVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f8;
        Typeface E = pc.a.E(context.getResources().getConfiguration(), typeface);
        if (E != null) {
            typeface = E;
        }
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f8119d;
        if ((i2 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((i2 & 2) != 0) {
            f8 = -0.25f;
        } else {
            f8 = 0.0f;
        }
        textPaint.setTextSkewX(f8);
        textPaint.setTextSize(this.f8127l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f8118c);
        }
        if (this.f8124i) {
            textPaint.setLetterSpacing(this.f8125j);
        }
    }
}
