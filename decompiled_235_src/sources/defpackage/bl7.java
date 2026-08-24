package defpackage;

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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bl7  reason: default package */
/* loaded from: classes.dex */
public final class bl7 extends sk7 {
    public static final PorterDuff.Mode f0 = PorterDuff.Mode.SRC_IN;
    public zk7 B;
    public PorterDuffColorFilter L;
    public ColorFilter R;
    public boolean X;
    public boolean Y;
    public final float[] Z;
    public final Matrix d0;
    public final Rect e0;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, zk7] */
    public bl7() {
        this.Y = true;
        this.Z = new float[9];
        this.d0 = new Matrix();
        this.e0 = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = f0;
        constantState.b = new yk7();
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
        Rect rect = this.e0;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.R;
            if (colorFilter == null) {
                colorFilter = this.L;
            }
            Matrix matrix = this.d0;
            canvas.getMatrix(matrix);
            float[] fArr = this.Z;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != RecyclerView.B1 || abs4 != RecyclerView.B1) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (rect.width() * abs));
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate(rect.width(), RecyclerView.B1);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                zk7 zk7Var = this.B;
                Bitmap bitmap = zk7Var.f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != zk7Var.f.getHeight()) {
                    zk7Var.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    zk7Var.k = true;
                }
                boolean z = this.Y;
                zk7 zk7Var2 = this.B;
                if (!z) {
                    zk7Var2.f.eraseColor(0);
                    Canvas canvas2 = new Canvas(zk7Var2.f);
                    yk7 yk7Var = zk7Var2.b;
                    yk7Var.a(yk7Var.g, yk7.p, canvas2, min, min2);
                } else if (zk7Var2.k || zk7Var2.g != zk7Var2.c || zk7Var2.h != zk7Var2.d || zk7Var2.j != zk7Var2.e || zk7Var2.i != zk7Var2.b.getRootAlpha()) {
                    zk7 zk7Var3 = this.B;
                    zk7Var3.f.eraseColor(0);
                    Canvas canvas3 = new Canvas(zk7Var3.f);
                    yk7 yk7Var2 = zk7Var3.b;
                    yk7Var2.a(yk7Var2.g, yk7.p, canvas3, min, min2);
                    zk7 zk7Var4 = this.B;
                    zk7Var4.g = zk7Var4.c;
                    zk7Var4.h = zk7Var4.d;
                    zk7Var4.i = zk7Var4.b.getRootAlpha();
                    zk7Var4.j = zk7Var4.e;
                    zk7Var4.k = false;
                }
                zk7 zk7Var5 = this.B;
                if (zk7Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (zk7Var5.l == null) {
                        Paint paint2 = new Paint();
                        zk7Var5.l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    zk7Var5.l.setAlpha(zk7Var5.b.getRootAlpha());
                    zk7Var5.l.setColorFilter(colorFilter);
                    paint = zk7Var5.l;
                }
                canvas.drawBitmap(zk7Var5.f, (Rect) null, rect, paint);
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
        return this.B.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.B.getChangingConfigurations() | super.getChangingConfigurations();
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
            return new al7(this.A.getConstantState());
        }
        this.B.a = getChangingConfigurations();
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.B.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.B.b.h;
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
    /* JADX WARN: Type inference failed for: r6v15, types: [uk7, xk7, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Paint.Cap cap;
        int i8;
        Paint.Join join;
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        zk7 zk7Var = this.B;
        zk7Var.b = new yk7();
        TypedArray D = xk2.D(resources, theme, attributeSet, jw2.a);
        zk7 zk7Var2 = this.B;
        yk7 yk7Var = zk7Var2.b;
        if (!xk2.v(xmlPullParser, "tintMode")) {
            i = -1;
        } else {
            i = D.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i9 = 3;
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case 15:
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
        zk7Var2.d = mode;
        ColorStateList p = xk2.p(D, xmlPullParser, theme);
        if (p != null) {
            zk7Var2.c = p;
        }
        boolean z = zk7Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = D.getBoolean(5, z);
        }
        zk7Var2.e = z;
        float f = yk7Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = D.getFloat(7, f);
        }
        yk7Var.j = f;
        float f2 = yk7Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = D.getFloat(8, f2);
        }
        yk7Var.k = f2;
        if (yk7Var.j > RecyclerView.B1) {
            if (f2 > RecyclerView.B1) {
                yk7Var.h = D.getDimension(3, yk7Var.h);
                int i10 = 2;
                float dimension = D.getDimension(2, yk7Var.i);
                yk7Var.i = dimension;
                if (yk7Var.h > RecyclerView.B1) {
                    if (dimension > RecyclerView.B1) {
                        float alpha = yk7Var.getAlpha();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                            alpha = D.getFloat(4, alpha);
                        }
                        yk7Var.setAlpha(alpha);
                        String string = D.getString(0);
                        if (string != null) {
                            yk7Var.m = string;
                            yk7Var.o.put(string, yk7Var);
                        }
                        D.recycle();
                        zk7Var.a = getChangingConfigurations();
                        int i11 = 1;
                        zk7Var.k = true;
                        zk7 zk7Var3 = this.B;
                        yk7 yk7Var2 = zk7Var3.b;
                        ArrayDeque arrayDeque = new ArrayDeque();
                        vk7 vk7Var = yk7Var2.g;
                        wu wuVar = yk7Var2.o;
                        arrayDeque.push(vk7Var);
                        int eventType = xmlPullParser.getEventType();
                        int depth = xmlPullParser.getDepth() + 1;
                        boolean z2 = true;
                        while (eventType != i11 && (xmlPullParser.getDepth() >= depth || eventType != i9)) {
                            if (eventType == i10) {
                                String name = xmlPullParser.getName();
                                vk7 vk7Var2 = (vk7) arrayDeque.peek();
                                i2 = depth;
                                if ("path".equals(name)) {
                                    ?? xk7Var = new xk7();
                                    xk7Var.e = RecyclerView.B1;
                                    xk7Var.g = 1.0f;
                                    xk7Var.h = 1.0f;
                                    xk7Var.i = RecyclerView.B1;
                                    xk7Var.j = 1.0f;
                                    xk7Var.k = RecyclerView.B1;
                                    Paint.Cap cap2 = Paint.Cap.BUTT;
                                    xk7Var.l = cap2;
                                    Paint.Join join2 = Paint.Join.MITER;
                                    xk7Var.m = join2;
                                    xk7Var.n = 4.0f;
                                    TypedArray D2 = xk2.D(resources, theme, attributeSet, jw2.c);
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        String string2 = D2.getString(0);
                                        if (string2 != null) {
                                            xk7Var.b = string2;
                                        }
                                        String string3 = D2.getString(2);
                                        if (string3 != null) {
                                            xk7Var.a = kn2.B(string3);
                                        }
                                        xk7Var.f = xk2.q(D2, xmlPullParser, theme, "fillColor", 1);
                                        float f3 = xk7Var.h;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                            f3 = D2.getFloat(12, f3);
                                        }
                                        xk7Var.h = f3;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null) {
                                            i7 = D2.getInt(8, -1);
                                        } else {
                                            i7 = -1;
                                        }
                                        Paint.Cap cap3 = xk7Var.l;
                                        if (i7 != 0) {
                                            if (i7 != 1) {
                                                if (i7 != 2) {
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
                                        xk7Var.l = cap;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null) {
                                            i8 = D2.getInt(9, -1);
                                        } else {
                                            i8 = -1;
                                        }
                                        Paint.Join join3 = xk7Var.m;
                                        if (i8 != 0) {
                                            if (i8 != 1) {
                                                if (i8 != 2) {
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
                                        xk7Var.m = join;
                                        float f4 = xk7Var.n;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                            f4 = D2.getFloat(10, f4);
                                        }
                                        xk7Var.n = f4;
                                        xk7Var.d = xk2.q(D2, xmlPullParser, theme, "strokeColor", 3);
                                        float f5 = xk7Var.g;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                            f5 = D2.getFloat(11, f5);
                                        }
                                        xk7Var.g = f5;
                                        float f6 = xk7Var.e;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                            f6 = D2.getFloat(4, f6);
                                        }
                                        xk7Var.e = f6;
                                        float f7 = xk7Var.j;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                            f7 = D2.getFloat(6, f7);
                                        }
                                        xk7Var.j = f7;
                                        float f8 = xk7Var.k;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                            f8 = D2.getFloat(7, f8);
                                        }
                                        xk7Var.k = f8;
                                        float f9 = xk7Var.i;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                            f9 = D2.getFloat(5, f9);
                                        }
                                        xk7Var.i = f9;
                                        int i12 = xk7Var.c;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                            i12 = D2.getInt(13, i12);
                                        }
                                        xk7Var.c = i12;
                                    }
                                    D2.recycle();
                                    vk7Var2.b.add(xk7Var);
                                    if (xk7Var.getPathName() != null) {
                                        wuVar.put(xk7Var.getPathName(), xk7Var);
                                    }
                                    zk7Var3.a = zk7Var3.a;
                                    i5 = 1;
                                    z2 = false;
                                } else {
                                    if ("clip-path".equals(name)) {
                                        xk7 xk7Var2 = new xk7();
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                            TypedArray D3 = xk2.D(resources, theme, attributeSet, jw2.d);
                                            String string4 = D3.getString(0);
                                            if (string4 != null) {
                                                xk7Var2.b = string4;
                                            }
                                            String string5 = D3.getString(1);
                                            if (string5 != null) {
                                                xk7Var2.a = kn2.B(string5);
                                            }
                                            if (!xk2.v(xmlPullParser, "fillType")) {
                                                i6 = 0;
                                            } else {
                                                i6 = D3.getInt(2, 0);
                                            }
                                            xk7Var2.c = i6;
                                            D3.recycle();
                                        }
                                        vk7Var2.b.add(xk7Var2);
                                        if (xk7Var2.getPathName() != null) {
                                            wuVar.put(xk7Var2.getPathName(), xk7Var2);
                                        }
                                        zk7Var3.a = zk7Var3.a;
                                    } else if ("group".equals(name)) {
                                        vk7 vk7Var3 = new vk7();
                                        TypedArray D4 = xk2.D(resources, theme, attributeSet, jw2.b);
                                        float f10 = vk7Var3.c;
                                        if (xk2.v(xmlPullParser, "rotation")) {
                                            f10 = D4.getFloat(5, f10);
                                        }
                                        vk7Var3.c = f10;
                                        i5 = 1;
                                        vk7Var3.d = D4.getFloat(1, vk7Var3.d);
                                        vk7Var3.e = D4.getFloat(2, vk7Var3.e);
                                        float f11 = vk7Var3.f;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                            f11 = D4.getFloat(3, f11);
                                        }
                                        vk7Var3.f = f11;
                                        float f12 = vk7Var3.g;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                            f12 = D4.getFloat(4, f12);
                                        }
                                        vk7Var3.g = f12;
                                        float f13 = vk7Var3.h;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                            f13 = D4.getFloat(6, f13);
                                        }
                                        vk7Var3.h = f13;
                                        float f14 = vk7Var3.i;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                            f14 = D4.getFloat(7, f14);
                                        }
                                        vk7Var3.i = f14;
                                        String string6 = D4.getString(0);
                                        if (string6 != null) {
                                            vk7Var3.k = string6;
                                        }
                                        vk7Var3.c();
                                        D4.recycle();
                                        vk7Var2.b.add(vk7Var3);
                                        arrayDeque.push(vk7Var3);
                                        if (vk7Var3.getGroupName() != null) {
                                            wuVar.put(vk7Var3.getGroupName(), vk7Var3);
                                        }
                                        zk7Var3.a = zk7Var3.a;
                                    }
                                    i5 = 1;
                                }
                                i4 = i5;
                                i3 = 3;
                            } else {
                                i2 = depth;
                                i3 = i9;
                                i4 = 1;
                                if (eventType == i3 && "group".equals(xmlPullParser.getName())) {
                                    arrayDeque.pop();
                                }
                            }
                            eventType = xmlPullParser.next();
                            i9 = i3;
                            i11 = i4;
                            depth = i2;
                            i10 = 2;
                        }
                        if (!z2) {
                            this.L = a(zk7Var.c, zk7Var.d);
                            return;
                        }
                        throw new XmlPullParserException("no path defined");
                    }
                    throw new XmlPullParserException(D.getPositionDescription() + "<vector> tag requires height > 0");
                }
                throw new XmlPullParserException(D.getPositionDescription() + "<vector> tag requires width > 0");
            }
            throw new XmlPullParserException(D.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(D.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
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
        return this.B.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            zk7 zk7Var = this.B;
            if (zk7Var != null) {
                yk7 yk7Var = zk7Var.b;
                if (yk7Var.n == null) {
                    yk7Var.n = Boolean.valueOf(yk7Var.g.a());
                }
                if (!yk7Var.n.booleanValue()) {
                    ColorStateList colorStateList = this.B.c;
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

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, zk7] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.X && super.mutate() == this) {
            zk7 zk7Var = this.B;
            ?? constantState = new Drawable.ConstantState();
            constantState.c = null;
            constantState.d = f0;
            if (zk7Var != null) {
                constantState.a = zk7Var.a;
                yk7 yk7Var = new yk7(zk7Var.b);
                constantState.b = yk7Var;
                if (zk7Var.b.e != null) {
                    yk7Var.e = new Paint(zk7Var.b.e);
                }
                if (zk7Var.b.d != null) {
                    constantState.b.d = new Paint(zk7Var.b.d);
                }
                constantState.c = zk7Var.c;
                constantState.d = zk7Var.d;
                constantState.e = zk7Var.e;
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
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        zk7 zk7Var = this.B;
        ColorStateList colorStateList = zk7Var.c;
        if (colorStateList != null && (mode = zk7Var.d) != null) {
            this.L = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        yk7 yk7Var = zk7Var.b;
        if (yk7Var.n == null) {
            yk7Var.n = Boolean.valueOf(yk7Var.g.a());
        }
        if (yk7Var.n.booleanValue()) {
            boolean b = zk7Var.b.g.b(iArr);
            zk7Var.k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.B.b.getRootAlpha() != i) {
            this.B.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.B.e = z;
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
    public final void setTint(int i) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        zk7 zk7Var = this.B;
        if (zk7Var.c != colorStateList) {
            zk7Var.c = colorStateList;
            this.L = a(colorStateList, zk7Var.d);
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
        zk7 zk7Var = this.B;
        if (zk7Var.d != mode) {
            zk7Var.d = mode;
            this.L = a(zk7Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
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

    public bl7(zk7 zk7Var) {
        this.Y = true;
        this.Z = new float[9];
        this.d0 = new Matrix();
        this.e0 = new Rect();
        this.B = zk7Var;
        this.L = a(zk7Var.c, zk7Var.d);
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
