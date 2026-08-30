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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c77  reason: default package */
/* loaded from: classes.dex */
public final class c77 extends t67 {
    public static final PorterDuff.Mode e0 = PorterDuff.Mode.SRC_IN;
    public a77 B;
    public PorterDuffColorFilter L;
    public ColorFilter R;
    public boolean X;
    public boolean Y;
    public final float[] Z;
    public final Matrix c0;
    public final Rect d0;

    /* JADX WARN: Type inference failed for: r0v5, types: [a77, android.graphics.drawable.Drawable$ConstantState] */
    public c77() {
        this.Y = true;
        this.Z = new float[9];
        this.c0 = new Matrix();
        this.d0 = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = e0;
        constantState.b = new z67();
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
        Rect rect = this.d0;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.R;
            if (colorFilter == null) {
                colorFilter = this.L;
            }
            Matrix matrix = this.c0;
            canvas.getMatrix(matrix);
            float[] fArr = this.Z;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != RecyclerView.A1 || abs4 != RecyclerView.A1) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (rect.width() * abs));
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate(rect.width(), RecyclerView.A1);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                a77 a77Var = this.B;
                Bitmap bitmap = a77Var.f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != a77Var.f.getHeight()) {
                    a77Var.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    a77Var.k = true;
                }
                boolean z = this.Y;
                a77 a77Var2 = this.B;
                if (!z) {
                    a77Var2.f.eraseColor(0);
                    Canvas canvas2 = new Canvas(a77Var2.f);
                    z67 z67Var = a77Var2.b;
                    z67Var.a(z67Var.g, z67.p, canvas2, min, min2);
                } else if (a77Var2.k || a77Var2.g != a77Var2.c || a77Var2.h != a77Var2.d || a77Var2.j != a77Var2.e || a77Var2.i != a77Var2.b.getRootAlpha()) {
                    a77 a77Var3 = this.B;
                    a77Var3.f.eraseColor(0);
                    Canvas canvas3 = new Canvas(a77Var3.f);
                    z67 z67Var2 = a77Var3.b;
                    z67Var2.a(z67Var2.g, z67.p, canvas3, min, min2);
                    a77 a77Var4 = this.B;
                    a77Var4.g = a77Var4.c;
                    a77Var4.h = a77Var4.d;
                    a77Var4.i = a77Var4.b.getRootAlpha();
                    a77Var4.j = a77Var4.e;
                    a77Var4.k = false;
                }
                a77 a77Var5 = this.B;
                if (a77Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (a77Var5.l == null) {
                        Paint paint2 = new Paint();
                        a77Var5.l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    a77Var5.l.setAlpha(a77Var5.b.getRootAlpha());
                    a77Var5.l.setColorFilter(colorFilter);
                    paint = a77Var5.l;
                }
                canvas.drawBitmap(a77Var5.f, (Rect) null, rect, paint);
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
            return new b77(this.A.getConstantState());
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
    /* JADX WARN: Type inference failed for: r6v15, types: [v67, java.lang.Object, y67] */
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
        a77 a77Var = this.B;
        a77Var.b = new z67();
        TypedArray b0 = gk2.b0(resources, theme, attributeSet, w81.a);
        a77 a77Var2 = this.B;
        z67 z67Var = a77Var2.b;
        if (!gk2.U(xmlPullParser, "tintMode")) {
            i = -1;
        } else {
            i = b0.getInt(6, -1);
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
                        case ig7.e /* 15 */:
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
        a77Var2.d = mode;
        ColorStateList R = gk2.R(b0, xmlPullParser, theme);
        if (R != null) {
            a77Var2.c = R;
        }
        boolean z = a77Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = b0.getBoolean(5, z);
        }
        a77Var2.e = z;
        float f = z67Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = b0.getFloat(7, f);
        }
        z67Var.j = f;
        float f2 = z67Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = b0.getFloat(8, f2);
        }
        z67Var.k = f2;
        if (z67Var.j > RecyclerView.A1) {
            if (f2 > RecyclerView.A1) {
                z67Var.h = b0.getDimension(3, z67Var.h);
                int i10 = 2;
                float dimension = b0.getDimension(2, z67Var.i);
                z67Var.i = dimension;
                if (z67Var.h > RecyclerView.A1) {
                    if (dimension > RecyclerView.A1) {
                        float alpha = z67Var.getAlpha();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                            alpha = b0.getFloat(4, alpha);
                        }
                        z67Var.setAlpha(alpha);
                        String string = b0.getString(0);
                        if (string != null) {
                            z67Var.m = string;
                            z67Var.o.put(string, z67Var);
                        }
                        b0.recycle();
                        a77Var.a = getChangingConfigurations();
                        int i11 = 1;
                        a77Var.k = true;
                        a77 a77Var3 = this.B;
                        z67 z67Var2 = a77Var3.b;
                        ArrayDeque arrayDeque = new ArrayDeque();
                        w67 w67Var = z67Var2.g;
                        eu euVar = z67Var2.o;
                        arrayDeque.push(w67Var);
                        int eventType = xmlPullParser.getEventType();
                        int depth = xmlPullParser.getDepth() + 1;
                        boolean z2 = true;
                        while (eventType != i11 && (xmlPullParser.getDepth() >= depth || eventType != i9)) {
                            if (eventType == i10) {
                                String name = xmlPullParser.getName();
                                w67 w67Var2 = (w67) arrayDeque.peek();
                                i2 = depth;
                                if ("path".equals(name)) {
                                    ?? y67Var = new y67();
                                    y67Var.e = RecyclerView.A1;
                                    y67Var.g = 1.0f;
                                    y67Var.h = 1.0f;
                                    y67Var.i = RecyclerView.A1;
                                    y67Var.j = 1.0f;
                                    y67Var.k = RecyclerView.A1;
                                    Paint.Cap cap2 = Paint.Cap.BUTT;
                                    y67Var.l = cap2;
                                    Paint.Join join2 = Paint.Join.MITER;
                                    y67Var.m = join2;
                                    y67Var.n = 4.0f;
                                    TypedArray b02 = gk2.b0(resources, theme, attributeSet, w81.c);
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        String string2 = b02.getString(0);
                                        if (string2 != null) {
                                            y67Var.b = string2;
                                        }
                                        String string3 = b02.getString(2);
                                        if (string3 != null) {
                                            y67Var.a = gk2.A(string3);
                                        }
                                        y67Var.f = gk2.S(b02, xmlPullParser, theme, "fillColor", 1);
                                        float f3 = y67Var.h;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                            f3 = b02.getFloat(12, f3);
                                        }
                                        y67Var.h = f3;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null) {
                                            i7 = b02.getInt(8, -1);
                                        } else {
                                            i7 = -1;
                                        }
                                        Paint.Cap cap3 = y67Var.l;
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
                                        y67Var.l = cap;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null) {
                                            i8 = b02.getInt(9, -1);
                                        } else {
                                            i8 = -1;
                                        }
                                        Paint.Join join3 = y67Var.m;
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
                                        y67Var.m = join;
                                        float f4 = y67Var.n;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                            f4 = b02.getFloat(10, f4);
                                        }
                                        y67Var.n = f4;
                                        y67Var.d = gk2.S(b02, xmlPullParser, theme, "strokeColor", 3);
                                        float f5 = y67Var.g;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                            f5 = b02.getFloat(11, f5);
                                        }
                                        y67Var.g = f5;
                                        float f6 = y67Var.e;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                            f6 = b02.getFloat(4, f6);
                                        }
                                        y67Var.e = f6;
                                        float f7 = y67Var.j;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                            f7 = b02.getFloat(6, f7);
                                        }
                                        y67Var.j = f7;
                                        float f8 = y67Var.k;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                            f8 = b02.getFloat(7, f8);
                                        }
                                        y67Var.k = f8;
                                        float f9 = y67Var.i;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                            f9 = b02.getFloat(5, f9);
                                        }
                                        y67Var.i = f9;
                                        int i12 = y67Var.c;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                            i12 = b02.getInt(13, i12);
                                        }
                                        y67Var.c = i12;
                                    }
                                    b02.recycle();
                                    w67Var2.b.add(y67Var);
                                    if (y67Var.getPathName() != null) {
                                        euVar.put(y67Var.getPathName(), y67Var);
                                    }
                                    a77Var3.a = a77Var3.a;
                                    i5 = 1;
                                    z2 = false;
                                } else {
                                    if ("clip-path".equals(name)) {
                                        y67 y67Var2 = new y67();
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                            TypedArray b03 = gk2.b0(resources, theme, attributeSet, w81.d);
                                            String string4 = b03.getString(0);
                                            if (string4 != null) {
                                                y67Var2.b = string4;
                                            }
                                            String string5 = b03.getString(1);
                                            if (string5 != null) {
                                                y67Var2.a = gk2.A(string5);
                                            }
                                            if (!gk2.U(xmlPullParser, "fillType")) {
                                                i6 = 0;
                                            } else {
                                                i6 = b03.getInt(2, 0);
                                            }
                                            y67Var2.c = i6;
                                            b03.recycle();
                                        }
                                        w67Var2.b.add(y67Var2);
                                        if (y67Var2.getPathName() != null) {
                                            euVar.put(y67Var2.getPathName(), y67Var2);
                                        }
                                        a77Var3.a = a77Var3.a;
                                    } else if ("group".equals(name)) {
                                        w67 w67Var3 = new w67();
                                        TypedArray b04 = gk2.b0(resources, theme, attributeSet, w81.b);
                                        float f10 = w67Var3.c;
                                        if (gk2.U(xmlPullParser, "rotation")) {
                                            f10 = b04.getFloat(5, f10);
                                        }
                                        w67Var3.c = f10;
                                        i5 = 1;
                                        w67Var3.d = b04.getFloat(1, w67Var3.d);
                                        w67Var3.e = b04.getFloat(2, w67Var3.e);
                                        float f11 = w67Var3.f;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                            f11 = b04.getFloat(3, f11);
                                        }
                                        w67Var3.f = f11;
                                        float f12 = w67Var3.g;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                            f12 = b04.getFloat(4, f12);
                                        }
                                        w67Var3.g = f12;
                                        float f13 = w67Var3.h;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                            f13 = b04.getFloat(6, f13);
                                        }
                                        w67Var3.h = f13;
                                        float f14 = w67Var3.i;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                            f14 = b04.getFloat(7, f14);
                                        }
                                        w67Var3.i = f14;
                                        String string6 = b04.getString(0);
                                        if (string6 != null) {
                                            w67Var3.k = string6;
                                        }
                                        w67Var3.c();
                                        b04.recycle();
                                        w67Var2.b.add(w67Var3);
                                        arrayDeque.push(w67Var3);
                                        if (w67Var3.getGroupName() != null) {
                                            euVar.put(w67Var3.getGroupName(), w67Var3);
                                        }
                                        a77Var3.a = a77Var3.a;
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
                            this.L = a(a77Var.c, a77Var.d);
                            return;
                        }
                        throw new XmlPullParserException("no path defined");
                    }
                    throw new XmlPullParserException(b0.getPositionDescription() + "<vector> tag requires height > 0");
                }
                throw new XmlPullParserException(b0.getPositionDescription() + "<vector> tag requires width > 0");
            }
            throw new XmlPullParserException(b0.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(b0.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
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
            a77 a77Var = this.B;
            if (a77Var != null) {
                z67 z67Var = a77Var.b;
                if (z67Var.n == null) {
                    z67Var.n = Boolean.valueOf(z67Var.g.a());
                }
                if (!z67Var.n.booleanValue()) {
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

    /* JADX WARN: Type inference failed for: r0v3, types: [a77, android.graphics.drawable.Drawable$ConstantState] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.X && super.mutate() == this) {
            a77 a77Var = this.B;
            ?? constantState = new Drawable.ConstantState();
            constantState.c = null;
            constantState.d = e0;
            if (a77Var != null) {
                constantState.a = a77Var.a;
                z67 z67Var = new z67(a77Var.b);
                constantState.b = z67Var;
                if (a77Var.b.e != null) {
                    z67Var.e = new Paint(a77Var.b.e);
                }
                if (a77Var.b.d != null) {
                    constantState.b.d = new Paint(a77Var.b.d);
                }
                constantState.c = a77Var.c;
                constantState.d = a77Var.d;
                constantState.e = a77Var.e;
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
        a77 a77Var = this.B;
        ColorStateList colorStateList = a77Var.c;
        if (colorStateList != null && (mode = a77Var.d) != null) {
            this.L = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        z67 z67Var = a77Var.b;
        if (z67Var.n == null) {
            z67Var.n = Boolean.valueOf(z67Var.g.a());
        }
        if (z67Var.n.booleanValue()) {
            boolean b = a77Var.b.g.b(iArr);
            a77Var.k |= b;
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
        a77 a77Var = this.B;
        if (a77Var.c != colorStateList) {
            a77Var.c = colorStateList;
            this.L = a(colorStateList, a77Var.d);
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
        a77 a77Var = this.B;
        if (a77Var.d != mode) {
            a77Var.d = mode;
            this.L = a(a77Var.c, mode);
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

    public c77(a77 a77Var) {
        this.Y = true;
        this.Z = new float[9];
        this.c0 = new Matrix();
        this.d0 = new Rect();
        this.B = a77Var;
        this.L = a(a77Var.c, a77Var.d);
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
