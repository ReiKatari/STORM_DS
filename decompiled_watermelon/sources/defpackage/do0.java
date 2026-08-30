package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: do0  reason: default package */
/* loaded from: classes.dex */
public final class do0 extends gv3 implements Drawable.Callback {
    public static final int[] J1 = {16842910};
    public static final ShapeDrawable K1 = new ShapeDrawable(new OvalShape());
    public ColorStateList A1;
    public ColorStateList B0;
    public PorterDuff.Mode B1;
    public ColorStateList C0;
    public int[] C1;
    public float D0;
    public ColorStateList D1;
    public float E0;
    public WeakReference E1;
    public ColorStateList F0;
    public TextUtils.TruncateAt F1;
    public float G0;
    public boolean G1;
    public ColorStateList H0;
    public int H1;
    public CharSequence I0;
    public boolean I1;
    public boolean J0;
    public Drawable K0;
    public ColorStateList L0;
    public float M0;
    public boolean N0;
    public boolean O0;
    public Drawable P0;
    public RippleDrawable Q0;
    public ColorStateList R0;
    public float S0;
    public SpannableStringBuilder T0;
    public boolean U0;
    public boolean V0;
    public Drawable W0;
    public ColorStateList X0;
    public a04 Y0;
    public a04 Z0;
    public float a1;
    public float b1;
    public float c1;
    public float d1;
    public float e1;
    public float f1;
    public float g1;
    public float h1;
    public final Context i1;
    public final Paint j1;
    public final Paint.FontMetrics k1;
    public final RectF l1;
    public final PointF m1;
    public final Path n1;
    public final wo6 o1;
    public int p1;
    public int q1;
    public int r1;
    public int s1;
    public int t1;
    public int u1;
    public boolean v1;
    public int w1;
    public int x1;
    public ColorFilter y1;
    public PorterDuffColorFilter z1;

    public do0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2132018366);
        this.E0 = -1.0f;
        this.j1 = new Paint(1);
        this.k1 = new Paint.FontMetrics();
        this.l1 = new RectF();
        this.m1 = new PointF();
        this.n1 = new Path();
        this.x1 = 255;
        this.B1 = PorterDuff.Mode.SRC_IN;
        this.E1 = new WeakReference(null);
        k(context);
        this.i1 = context;
        wo6 wo6Var = new wo6(this);
        this.o1 = wo6Var;
        this.I0 = "";
        wo6Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = J1;
        setState(iArr);
        R(iArr);
        this.G1 = true;
        K1.setTint(-1);
    }

    public static void b0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean y(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean z(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public final void A() {
        Chip chip = (Chip) this.E1.get();
        if (chip != null) {
            chip.b(chip.n0);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(int[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do0.B(int[], int[]):boolean");
    }

    public final void C(boolean z) {
        if (this.U0 != z) {
            this.U0 = z;
            float v = v();
            if (!z && this.v1) {
                this.v1 = false;
            }
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void D(Drawable drawable) {
        if (this.W0 != drawable) {
            float v = v();
            this.W0 = drawable;
            float v2 = v();
            b0(this.W0);
            t(this.W0);
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.X0 != colorStateList) {
            this.X0 = colorStateList;
            if (this.V0 && (drawable = this.W0) != null && this.U0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z) {
        if (this.V0 != z) {
            boolean Y = Y();
            this.V0 = z;
            boolean Y2 = Y();
            if (Y != Y2) {
                Drawable drawable = this.W0;
                if (Y2) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void G(float f) {
        if (this.E0 != f) {
            this.E0 = f;
            z26 f2 = this.B.a.f();
            f2.e = new s(f);
            f2.f = new s(f);
            f2.g = new s(f);
            f2.h = new s(f);
            setShapeAppearanceModel(f2.a());
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.K0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float v = v();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.K0 = drawable3;
            float v2 = v();
            b0(drawable2);
            if (Z()) {
                t(this.K0);
            }
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void I(float f) {
        if (this.M0 != f) {
            float v = v();
            this.M0 = f;
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        this.N0 = true;
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            if (Z()) {
                this.K0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z) {
        if (this.J0 != z) {
            boolean Z = Z();
            this.J0 = z;
            boolean Z2 = Z();
            if (Z != Z2) {
                Drawable drawable = this.K0;
                if (Z2) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            if (this.I1) {
                ev3 ev3Var = this.B;
                if (ev3Var.e != colorStateList) {
                    ev3Var.e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void M(float f) {
        if (this.G0 != f) {
            this.G0 = f;
            this.j1.setStrokeWidth(f);
            if (this.I1) {
                this.B.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void N(Drawable drawable) {
        Drawable drawable2 = this.P0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float w = w();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.P0 = drawable3;
            this.Q0 = new RippleDrawable(ng5.a(this.H0), this.P0, K1);
            float w2 = w();
            b0(drawable2);
            if (a0()) {
                t(this.P0);
            }
            invalidateSelf();
            if (w != w2) {
                A();
            }
        }
    }

    public final void O(float f) {
        if (this.g1 != f) {
            this.g1 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void P(float f) {
        if (this.S0 != f) {
            this.S0 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void Q(float f) {
        if (this.f1 != f) {
            this.f1 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final boolean R(int[] iArr) {
        if (!Arrays.equals(this.C1, iArr)) {
            this.C1 = iArr;
            if (a0()) {
                return B(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    public final void S(ColorStateList colorStateList) {
        if (this.R0 != colorStateList) {
            this.R0 = colorStateList;
            if (a0()) {
                this.P0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void T(boolean z) {
        if (this.O0 != z) {
            boolean a0 = a0();
            this.O0 = z;
            boolean a02 = a0();
            if (a0 != a02) {
                Drawable drawable = this.P0;
                if (a02) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void U(float f) {
        if (this.c1 != f) {
            float v = v();
            this.c1 = f;
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void V(float f) {
        if (this.b1 != f) {
            float v = v();
            this.b1 = f;
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void W(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            this.D1 = null;
            onStateChange(getState());
        }
    }

    public final void X(un6 un6Var) {
        wo6 wo6Var = this.o1;
        ao0 ao0Var = wo6Var.b;
        TextPaint textPaint = wo6Var.a;
        if (wo6Var.f != un6Var) {
            wo6Var.f = un6Var;
            if (un6Var != null) {
                Context context = this.i1;
                un6Var.e(context, textPaint, ao0Var);
                do0 do0Var = (do0) wo6Var.e.get();
                if (do0Var != null) {
                    textPaint.drawableState = do0Var.getState();
                }
                un6Var.d(context, textPaint, ao0Var);
                wo6Var.d = true;
            }
            do0 do0Var2 = (do0) wo6Var.e.get();
            if (do0Var2 != null) {
                do0Var2.A();
                do0Var2.invalidateSelf();
                do0Var2.onStateChange(do0Var2.getState());
            }
        }
    }

    public final boolean Y() {
        if (this.V0 && this.W0 != null && this.v1) {
            return true;
        }
        return false;
    }

    public final boolean Z() {
        if (this.J0 && this.K0 != null) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        if (this.O0 && this.P0 != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gv3, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        boolean z;
        int i3;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.x1) != 0) {
            if (i < 255) {
                canvas2 = canvas;
                i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
            } else {
                canvas2 = canvas;
                i2 = 0;
            }
            boolean z2 = this.I1;
            Paint paint = this.j1;
            RectF rectF = this.l1;
            if (!z2) {
                paint.setColor(this.p1);
                paint.setStyle(Paint.Style.FILL);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, x(), x(), paint);
            }
            if (!this.I1) {
                paint.setColor(this.q1);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.y1;
                if (colorFilter == null) {
                    colorFilter = this.z1;
                }
                paint.setColorFilter(colorFilter);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, x(), x(), paint);
            }
            if (this.I1) {
                super.draw(canvas);
            }
            if (this.G0 > RecyclerView.A1 && !this.I1) {
                paint.setColor(this.s1);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.I1) {
                    ColorFilter colorFilter2 = this.y1;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.z1;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f2 = this.G0 / 2.0f;
                rectF.set(bounds.left + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
                float f3 = this.E0 - (this.G0 / 2.0f);
                canvas2.drawRoundRect(rectF, f3, f3, paint);
            }
            paint.setColor(this.t1);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            if (!this.I1) {
                canvas2.drawRoundRect(rectF, x(), x(), paint);
                f = 2.0f;
            } else {
                RectF rectF2 = new RectF(bounds);
                ev3 ev3Var = this.B;
                a36 a36Var = ev3Var.a;
                float[] fArr = this.w0;
                float f4 = ev3Var.j;
                dv3 dv3Var = this.m0;
                c36 c36Var = this.n0;
                f = 2.0f;
                Path path = this.n1;
                c36Var.a(a36Var, fArr, f4, rectF2, dv3Var, path);
                e(canvas2, paint, path, this.B.a, this.w0, g());
            }
            if (Z()) {
                u(bounds, rectF);
                float f5 = rectF.left;
                float f6 = rectF.top;
                canvas2.translate(f5, f6);
                this.K0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.K0.draw(canvas2);
                canvas2.translate(-f5, -f6);
            }
            if (Y()) {
                u(bounds, rectF);
                float f7 = rectF.left;
                float f8 = rectF.top;
                canvas2.translate(f7, f8);
                this.W0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.W0.draw(canvas2);
                canvas2.translate(-f7, -f8);
            }
            if (this.G1 && this.I0 != null) {
                PointF pointF = this.m1;
                pointF.set(RecyclerView.A1, RecyclerView.A1);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.I0;
                wo6 wo6Var = this.o1;
                if (charSequence != null) {
                    float v = v() + this.a1 + this.d1;
                    if (getLayoutDirection() == 0) {
                        pointF.x = bounds.left + v;
                    } else {
                        pointF.x = bounds.right - v;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = wo6Var.a;
                    Paint.FontMetrics fontMetrics = this.k1;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / f);
                }
                rectF.setEmpty();
                if (this.I0 != null) {
                    float v2 = v() + this.a1 + this.d1;
                    float w = w() + this.h1 + this.e1;
                    int layoutDirection = getLayoutDirection();
                    int i4 = bounds.left;
                    if (layoutDirection == 0) {
                        rectF.left = i4 + v2;
                        rectF.right = bounds.right - w;
                    } else {
                        rectF.left = i4 + w;
                        rectF.right = bounds.right - v2;
                    }
                    rectF.top = bounds.top;
                    rectF.bottom = bounds.bottom;
                }
                un6 un6Var = wo6Var.f;
                TextPaint textPaint2 = wo6Var.a;
                if (un6Var != null) {
                    textPaint2.drawableState = getState();
                    wo6Var.f.d(this.i1, textPaint2, wo6Var.b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(wo6Var.a(this.I0.toString())) > Math.round(rectF.width())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int save = canvas2.save();
                    canvas2.clipRect(rectF);
                    i3 = save;
                } else {
                    i3 = 0;
                }
                CharSequence charSequence2 = this.I0;
                if (z && this.F1 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.F1);
                }
                canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
                canvas2 = canvas;
                if (z) {
                    canvas2.restoreToCount(i3);
                }
            }
            if (a0()) {
                rectF.setEmpty();
                if (a0()) {
                    float f9 = this.h1 + this.g1;
                    if (getLayoutDirection() == 0) {
                        float f10 = bounds.right - f9;
                        rectF.right = f10;
                        rectF.left = f10 - this.S0;
                    } else {
                        float f11 = bounds.left + f9;
                        rectF.left = f11;
                        rectF.right = f11 + this.S0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f12 = this.S0;
                    float f13 = exactCenterY - (f12 / f);
                    rectF.top = f13;
                    rectF.bottom = f13 + f12;
                }
                float f14 = rectF.left;
                float f15 = rectF.top;
                canvas2.translate(f14, f15);
                this.P0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.Q0.setBounds(this.P0.getBounds());
                this.Q0.jumpToCurrentState();
                this.Q0.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (this.x1 < 255) {
                canvas2.restoreToCount(i2);
            }
        }
    }

    @Override // defpackage.gv3, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.x1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.y1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.D0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(w() + this.o1.a(this.I0.toString()) + v() + this.a1 + this.d1 + this.e1 + this.h1), this.H1);
    }

    @Override // defpackage.gv3, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.gv3, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.I1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.E0);
            outline2 = outline;
        } else {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.D0, this.E0);
        }
        outline2.setAlpha(this.x1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.gv3, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!y(this.B0) && !y(this.C0) && !y(this.F0)) {
            un6 un6Var = this.o1.f;
            if (un6Var == null || (colorStateList = un6Var.k) == null || !colorStateList.isStateful()) {
                if ((!this.V0 || this.W0 == null || !this.U0) && !z(this.K0) && !z(this.W0) && !y(this.A1)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (Z()) {
            onLayoutDirectionChanged |= this.K0.setLayoutDirection(i);
        }
        if (Y()) {
            onLayoutDirectionChanged |= this.W0.setLayoutDirection(i);
        }
        if (a0()) {
            onLayoutDirectionChanged |= this.P0.setLayoutDirection(i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (Z()) {
            onLevelChange |= this.K0.setLevel(i);
        }
        if (Y()) {
            onLevelChange |= this.W0.setLevel(i);
        }
        if (a0()) {
            onLevelChange |= this.P0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.gv3, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.I1) {
            super.onStateChange(iArr);
        }
        return B(iArr, this.C1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.gv3, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.x1 != i) {
            this.x1 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.gv3, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.y1 != colorFilter) {
            this.y1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.gv3, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.A1 != colorStateList) {
            this.A1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.gv3, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.B1 != mode) {
            this.B1 = mode;
            ColorStateList colorStateList = this.A1;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.z1 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (Z()) {
            visible |= this.K0.setVisible(z, z2);
        }
        if (Y()) {
            visible |= this.W0.setVisible(z, z2);
        }
        if (a0()) {
            visible |= this.P0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.P0) {
                if (drawable.isStateful()) {
                    drawable.setState(this.C1);
                }
                drawable.setTintList(this.R0);
                return;
            }
            Drawable drawable2 = this.K0;
            if (drawable == drawable2 && this.N0) {
                drawable2.setTintList(this.L0);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void u(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (!Z() && !Y()) {
            return;
        }
        float f = this.a1 + this.b1;
        if (this.v1) {
            drawable = this.W0;
        } else {
            drawable = this.K0;
        }
        float f2 = this.M0;
        if (f2 <= RecyclerView.A1 && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        if (getLayoutDirection() == 0) {
            float f3 = rect.left + f;
            rectF.left = f3;
            rectF.right = f3 + f2;
        } else {
            float f4 = rect.right - f;
            rectF.right = f4;
            rectF.left = f4 - f2;
        }
        if (this.v1) {
            drawable2 = this.W0;
        } else {
            drawable2 = this.K0;
        }
        float f5 = this.M0;
        if (f5 <= RecyclerView.A1 && drawable2 != null) {
            f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.i1.getResources().getDisplayMetrics()));
            if (drawable2.getIntrinsicHeight() <= f5) {
                f5 = drawable2.getIntrinsicHeight();
            }
        }
        float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
        rectF.top = exactCenterY;
        rectF.bottom = exactCenterY + f5;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        Drawable drawable;
        if (!Z() && !Y()) {
            return RecyclerView.A1;
        }
        float f = this.b1;
        if (this.v1) {
            drawable = this.W0;
        } else {
            drawable = this.K0;
        }
        float f2 = this.M0;
        if (f2 <= RecyclerView.A1 && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.c1;
    }

    public final float w() {
        if (a0()) {
            return this.f1 + this.S0 + this.g1;
        }
        return RecyclerView.A1;
    }

    public final float x() {
        if (this.I1) {
            float[] fArr = this.w0;
            if (fArr != null) {
                return fArr[3];
            }
            return this.B.a.e.a(g());
        }
        return this.E0;
    }
}
