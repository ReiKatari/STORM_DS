package d8;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: d0  reason: collision with root package name */
    public static final PorterDuff.Mode f4010d0 = PorterDuff.Mode.SRC_IN;
    public n B;
    public PorterDuffColorFilter L;
    public ColorFilter R;
    public boolean X;
    public boolean Y;
    public final float[] Z;

    /* renamed from: b0  reason: collision with root package name */
    public final Matrix f4011b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Rect f4012c0;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, d8.n] */
    public p() {
        this.Y = true;
        this.Z = new float[9];
        this.f4011b0 = new Matrix();
        this.f4012c0 = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f3999c = null;
        constantState.f4000d = f4010d0;
        constantState.f3998b = new m();
        this.B = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f4012c0;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.R;
            if (colorFilter == null) {
                colorFilter = this.L;
            }
            Matrix matrix = this.f4011b0;
            canvas.getMatrix(matrix);
            float[] fArr = this.Z;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (rect.width() * abs));
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                n nVar = this.B;
                Bitmap bitmap = nVar.f4002f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f4002f.getHeight()) {
                    nVar.f4002f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    nVar.f4007k = true;
                }
                boolean z10 = this.Y;
                n nVar2 = this.B;
                if (!z10) {
                    nVar2.f4002f.eraseColor(0);
                    Canvas canvas2 = new Canvas(nVar2.f4002f);
                    m mVar = nVar2.f3998b;
                    mVar.a(mVar.f3989g, m.f3982p, canvas2, min, min2);
                } else if (nVar2.f4007k || nVar2.f4003g != nVar2.f3999c || nVar2.f4004h != nVar2.f4000d || nVar2.f4006j != nVar2.f4001e || nVar2.f4005i != nVar2.f3998b.getRootAlpha()) {
                    n nVar3 = this.B;
                    nVar3.f4002f.eraseColor(0);
                    Canvas canvas3 = new Canvas(nVar3.f4002f);
                    m mVar2 = nVar3.f3998b;
                    mVar2.a(mVar2.f3989g, m.f3982p, canvas3, min, min2);
                    n nVar4 = this.B;
                    nVar4.f4003g = nVar4.f3999c;
                    nVar4.f4004h = nVar4.f4000d;
                    nVar4.f4005i = nVar4.f3998b.getRootAlpha();
                    nVar4.f4006j = nVar4.f4001e;
                    nVar4.f4007k = false;
                }
                n nVar5 = this.B;
                if (nVar5.f3998b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (nVar5.f4008l == null) {
                        Paint paint2 = new Paint();
                        nVar5.f4008l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    nVar5.f4008l.setAlpha(nVar5.f3998b.getRootAlpha());
                    nVar5.f4008l.setColorFilter(colorFilter);
                    paint = nVar5.f4008l;
                }
                canvas.drawBitmap(nVar5.f4002f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.B.f3998b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.B.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.R;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.A != null) {
            return new o(this.A.getConstantState());
        }
        this.B.f3997a = getChangingConfigurations();
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.B.f3998b.f3991i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.B.f3998b.f3990h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [d8.i, java.lang.Object, d8.l] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Paint.Cap cap;
        int i16;
        Paint.Join join;
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.B;
        nVar.f3998b = new m();
        TypedArray h2 = p5.b.h(resources, theme, attributeSet, a.f3946a);
        n nVar2 = this.B;
        m mVar = nVar2.f3998b;
        if (!p5.b.e(xmlPullParser, "tintMode")) {
            i2 = -1;
        } else {
            i2 = h2.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i17 = 3;
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 9) {
                    switch (i2) {
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case l1.c.f8512h /* 15 */:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case 16:
                            mode = PorterDuff.Mode.ADD;
                            break;
                    }
                } else {
                    mode = PorterDuff.Mode.SRC_ATOP;
                }
            }
        } else {
            mode = PorterDuff.Mode.SRC_OVER;
        }
        nVar2.f4000d = mode;
        ColorStateList c4 = p5.b.c(h2, xmlPullParser, theme);
        if (c4 != null) {
            nVar2.f3999c = c4;
        }
        boolean z10 = nVar2.f4001e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = h2.getBoolean(5, z10);
        }
        nVar2.f4001e = z10;
        float f8 = mVar.f3992j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f8 = h2.getFloat(7, f8);
        }
        mVar.f3992j = f8;
        float f10 = mVar.f3993k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f10 = h2.getFloat(8, f10);
        }
        mVar.f3993k = f10;
        if (mVar.f3992j > 0.0f) {
            if (f10 > 0.0f) {
                mVar.f3990h = h2.getDimension(3, mVar.f3990h);
                int i18 = 2;
                float dimension = h2.getDimension(2, mVar.f3991i);
                mVar.f3991i = dimension;
                if (mVar.f3990h > 0.0f) {
                    if (dimension > 0.0f) {
                        float alpha = mVar.getAlpha();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                            alpha = h2.getFloat(4, alpha);
                        }
                        mVar.setAlpha(alpha);
                        String string = h2.getString(0);
                        if (string != null) {
                            mVar.m = string;
                            mVar.f3996o.put(string, mVar);
                        }
                        h2.recycle();
                        nVar.f3997a = getChangingConfigurations();
                        int i19 = 1;
                        nVar.f4007k = true;
                        n nVar3 = this.B;
                        m mVar2 = nVar3.f3998b;
                        ArrayDeque arrayDeque = new ArrayDeque();
                        j jVar = mVar2.f3989g;
                        a1.e eVar = mVar2.f3996o;
                        arrayDeque.push(jVar);
                        int eventType = xmlPullParser.getEventType();
                        int depth = xmlPullParser.getDepth() + 1;
                        boolean z11 = true;
                        while (eventType != i19 && (xmlPullParser.getDepth() >= depth || eventType != i17)) {
                            if (eventType == i18) {
                                String name = xmlPullParser.getName();
                                j jVar2 = (j) arrayDeque.peek();
                                i10 = depth;
                                if ("path".equals(name)) {
                                    ?? lVar = new l();
                                    lVar.f3959e = 0.0f;
                                    lVar.f3961g = 1.0f;
                                    lVar.f3962h = 1.0f;
                                    lVar.f3963i = 0.0f;
                                    lVar.f3964j = 1.0f;
                                    lVar.f3965k = 0.0f;
                                    Paint.Cap cap2 = Paint.Cap.BUTT;
                                    lVar.f3966l = cap2;
                                    Paint.Join join2 = Paint.Join.MITER;
                                    lVar.m = join2;
                                    lVar.f3967n = 4.0f;
                                    TypedArray h10 = p5.b.h(resources, theme, attributeSet, a.f3948c);
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        String string2 = h10.getString(0);
                                        if (string2 != null) {
                                            lVar.f3980b = string2;
                                        }
                                        String string3 = h10.getString(2);
                                        if (string3 != null) {
                                            lVar.f3979a = p7.a.m(string3);
                                        }
                                        lVar.f3960f = p5.b.d(h10, xmlPullParser, theme, "fillColor", 1);
                                        float f11 = lVar.f3962h;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                            f11 = h10.getFloat(12, f11);
                                        }
                                        lVar.f3962h = f11;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null) {
                                            i15 = h10.getInt(8, -1);
                                        } else {
                                            i15 = -1;
                                        }
                                        Paint.Cap cap3 = lVar.f3966l;
                                        if (i15 != 0) {
                                            if (i15 != 1) {
                                                if (i15 != 2) {
                                                    cap = cap3;
                                                } else {
                                                    cap = Paint.Cap.SQUARE;
                                                }
                                            } else {
                                                cap = Paint.Cap.ROUND;
                                            }
                                        } else {
                                            cap = cap2;
                                        }
                                        lVar.f3966l = cap;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null) {
                                            i16 = h10.getInt(9, -1);
                                        } else {
                                            i16 = -1;
                                        }
                                        Paint.Join join3 = lVar.m;
                                        if (i16 != 0) {
                                            if (i16 != 1) {
                                                if (i16 != 2) {
                                                    join = join3;
                                                } else {
                                                    join = Paint.Join.BEVEL;
                                                }
                                            } else {
                                                join = Paint.Join.ROUND;
                                            }
                                        } else {
                                            join = join2;
                                        }
                                        lVar.m = join;
                                        float f12 = lVar.f3967n;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                            f12 = h10.getFloat(10, f12);
                                        }
                                        lVar.f3967n = f12;
                                        lVar.f3958d = p5.b.d(h10, xmlPullParser, theme, "strokeColor", 3);
                                        float f13 = lVar.f3961g;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                            f13 = h10.getFloat(11, f13);
                                        }
                                        lVar.f3961g = f13;
                                        float f14 = lVar.f3959e;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                            f14 = h10.getFloat(4, f14);
                                        }
                                        lVar.f3959e = f14;
                                        float f15 = lVar.f3964j;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                            f15 = h10.getFloat(6, f15);
                                        }
                                        lVar.f3964j = f15;
                                        float f16 = lVar.f3965k;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                            f16 = h10.getFloat(7, f16);
                                        }
                                        lVar.f3965k = f16;
                                        float f17 = lVar.f3963i;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                            f17 = h10.getFloat(5, f17);
                                        }
                                        lVar.f3963i = f17;
                                        int i20 = lVar.f3981c;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                            i20 = h10.getInt(13, i20);
                                        }
                                        lVar.f3981c = i20;
                                    }
                                    h10.recycle();
                                    jVar2.f3969b.add(lVar);
                                    if (lVar.getPathName() != null) {
                                        eVar.put(lVar.getPathName(), lVar);
                                    }
                                    nVar3.f3997a = nVar3.f3997a;
                                    i13 = 1;
                                    z11 = false;
                                } else {
                                    if ("clip-path".equals(name)) {
                                        l lVar2 = new l();
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                            TypedArray h11 = p5.b.h(resources, theme, attributeSet, a.f3949d);
                                            String string4 = h11.getString(0);
                                            if (string4 != null) {
                                                lVar2.f3980b = string4;
                                            }
                                            String string5 = h11.getString(1);
                                            if (string5 != null) {
                                                lVar2.f3979a = p7.a.m(string5);
                                            }
                                            if (!p5.b.e(xmlPullParser, "fillType")) {
                                                i14 = 0;
                                            } else {
                                                i14 = h11.getInt(2, 0);
                                            }
                                            lVar2.f3981c = i14;
                                            h11.recycle();
                                        }
                                        jVar2.f3969b.add(lVar2);
                                        if (lVar2.getPathName() != null) {
                                            eVar.put(lVar2.getPathName(), lVar2);
                                        }
                                        nVar3.f3997a = nVar3.f3997a;
                                    } else if ("group".equals(name)) {
                                        j jVar3 = new j();
                                        TypedArray h12 = p5.b.h(resources, theme, attributeSet, a.f3947b);
                                        float f18 = jVar3.f3970c;
                                        if (p5.b.e(xmlPullParser, "rotation")) {
                                            f18 = h12.getFloat(5, f18);
                                        }
                                        jVar3.f3970c = f18;
                                        i13 = 1;
                                        jVar3.f3971d = h12.getFloat(1, jVar3.f3971d);
                                        jVar3.f3972e = h12.getFloat(2, jVar3.f3972e);
                                        float f19 = jVar3.f3973f;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                            f19 = h12.getFloat(3, f19);
                                        }
                                        jVar3.f3973f = f19;
                                        float f20 = jVar3.f3974g;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                            f20 = h12.getFloat(4, f20);
                                        }
                                        jVar3.f3974g = f20;
                                        float f21 = jVar3.f3975h;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                            f21 = h12.getFloat(6, f21);
                                        }
                                        jVar3.f3975h = f21;
                                        float f22 = jVar3.f3976i;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                            f22 = h12.getFloat(7, f22);
                                        }
                                        jVar3.f3976i = f22;
                                        String string6 = h12.getString(0);
                                        if (string6 != null) {
                                            jVar3.f3978k = string6;
                                        }
                                        jVar3.c();
                                        h12.recycle();
                                        jVar2.f3969b.add(jVar3);
                                        arrayDeque.push(jVar3);
                                        if (jVar3.getGroupName() != null) {
                                            eVar.put(jVar3.getGroupName(), jVar3);
                                        }
                                        nVar3.f3997a = nVar3.f3997a;
                                    }
                                    i13 = 1;
                                }
                                i12 = i13;
                                i11 = 3;
                            } else {
                                i10 = depth;
                                i11 = i17;
                                i12 = 1;
                                if (eventType == i11 && "group".equals(xmlPullParser.getName())) {
                                    arrayDeque.pop();
                                }
                            }
                            eventType = xmlPullParser.next();
                            i17 = i11;
                            i19 = i12;
                            depth = i10;
                            i18 = 2;
                        }
                        if (!z11) {
                            this.L = a(nVar.f3999c, nVar.f4000d);
                            return;
                        }
                        throw new XmlPullParserException("no path defined");
                    }
                    throw new XmlPullParserException(h2.getPositionDescription() + "<vector> tag requires height > 0");
                }
                throw new XmlPullParserException(h2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            throw new XmlPullParserException(h2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(h2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.B.f4001e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.B;
            if (nVar != null) {
                m mVar = nVar.f3998b;
                if (mVar.f3995n == null) {
                    mVar.f3995n = Boolean.valueOf(mVar.f3989g.a());
                }
                if (!mVar.f3995n.booleanValue()) {
                    ColorStateList colorStateList = this.B.f3999c;
                    if (colorStateList == null || !colorStateList.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, d8.n] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.X && super.mutate() == this) {
            n nVar = this.B;
            ?? constantState = new Drawable.ConstantState();
            constantState.f3999c = null;
            constantState.f4000d = f4010d0;
            if (nVar != null) {
                constantState.f3997a = nVar.f3997a;
                m mVar = new m(nVar.f3998b);
                constantState.f3998b = mVar;
                if (nVar.f3998b.f3987e != null) {
                    mVar.f3987e = new Paint(nVar.f3998b.f3987e);
                }
                if (nVar.f3998b.f3986d != null) {
                    constantState.f3998b.f3986d = new Paint(nVar.f3998b.f3986d);
                }
                constantState.f3999c = nVar.f3999c;
                constantState.f4000d = nVar.f4000d;
                constantState.f4001e = nVar.f4001e;
            }
            this.B = constantState;
            this.X = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.B;
        ColorStateList colorStateList = nVar.f3999c;
        if (colorStateList != null && (mode = nVar.f4000d) != null) {
            this.L = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        m mVar = nVar.f3998b;
        if (mVar.f3995n == null) {
            mVar.f3995n = Boolean.valueOf(mVar.f3989g.a());
        }
        if (mVar.f3995n.booleanValue()) {
            boolean b10 = nVar.f3998b.f3989g.b(iArr);
            nVar.f4007k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.B.f3998b.getRootAlpha() != i2) {
            this.B.f3998b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.B.f4001e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.R = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTint(i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.B;
        if (nVar.f3999c != colorStateList) {
            nVar.f3999c = colorStateList;
            this.L = a(colorStateList, nVar.f4000d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.B;
        if (nVar.f4000d != mode) {
            nVar.f4000d = mode;
            this.L = a(nVar.f3999c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public p(n nVar) {
        this.Y = true;
        this.Z = new float[9];
        this.f4011b0 = new Matrix();
        this.f4012c0 = new Rect();
        this.B = nVar;
        this.L = a(nVar.f3999c, nVar.f4000d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
