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
import com.stormds.emulator.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nq0  reason: default package */
/* loaded from: classes.dex */
public final class nq0 extends p24 implements Drawable.Callback {
    public static final int[] K1 = {16842910};
    public static final ShapeDrawable L1 = new ShapeDrawable(new OvalShape());
    public PorterDuffColorFilter A1;
    public ColorStateList B1;
    public ColorStateList C0;
    public PorterDuff.Mode C1;
    public ColorStateList D0;
    public int[] D1;
    public float E0;
    public ColorStateList E1;
    public float F0;
    public WeakReference F1;
    public ColorStateList G0;
    public TextUtils.TruncateAt G1;
    public float H0;
    public boolean H1;
    public ColorStateList I0;
    public int I1;
    public CharSequence J0;
    public boolean J1;
    public boolean K0;
    public Drawable L0;
    public ColorStateList M0;
    public float N0;
    public boolean O0;
    public boolean P0;
    public Drawable Q0;
    public RippleDrawable R0;
    public ColorStateList S0;
    public float T0;
    public SpannableStringBuilder U0;
    public boolean V0;
    public boolean W0;
    public Drawable X0;
    public ColorStateList Y0;
    public f84 Z0;
    public f84 a1;
    public float b1;
    public float c1;
    public float d1;
    public float e1;
    public float f1;
    public float g1;
    public float h1;
    public float i1;
    public final Context j1;
    public final Paint k1;
    public final Paint.FontMetrics l1;
    public final RectF m1;
    public final PointF n1;
    public final Path o1;
    public final h17 p1;
    public int q1;
    public int r1;
    public int s1;
    public int t1;
    public int u1;
    public int v1;
    public boolean w1;
    public int x1;
    public int y1;
    public ColorFilter z1;

    public nq0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2132018374);
        this.F0 = -1.0f;
        this.k1 = new Paint(1);
        this.l1 = new Paint.FontMetrics();
        this.m1 = new RectF();
        this.n1 = new PointF();
        this.o1 = new Path();
        this.y1 = 255;
        this.C1 = PorterDuff.Mode.SRC_IN;
        this.F1 = new WeakReference(null);
        k(context);
        this.j1 = context;
        h17 h17Var = new h17(this);
        this.p1 = h17Var;
        this.J0 = "";
        h17Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = K1;
        setState(iArr);
        R(iArr);
        this.H1 = true;
        L1.setTint(-1);
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
        Chip chip = (Chip) this.F1.get();
        if (chip != null) {
            chip.b(chip.o0);
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
    */
    public final boolean B(int[] iArr, int[] iArr2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        g07 g07Var;
        int i5;
        int[] state;
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        int i6;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList2;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList3 = this.C0;
        if (colorStateList3 != null) {
            i = colorStateList3.getColorForState(iArr, this.q1);
        } else {
            i = 0;
        }
        int c = c(i);
        boolean z5 = true;
        if (this.q1 != c) {
            this.q1 = c;
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.D0;
        if (colorStateList4 != null) {
            i2 = colorStateList4.getColorForState(iArr, this.r1);
        } else {
            i2 = 0;
        }
        int c2 = c(i2);
        if (this.r1 != c2) {
            this.r1 = c2;
            onStateChange = true;
        }
        int b = tt0.b(c2, c);
        if (this.s1 != b) {
            z = true;
        } else {
            z = false;
        }
        if (this.B.d == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z | z2) {
            this.s1 = b;
            n(ColorStateList.valueOf(b));
            onStateChange = true;
        }
        ColorStateList colorStateList5 = this.G0;
        if (colorStateList5 != null) {
            i3 = colorStateList5.getColorForState(iArr, this.t1);
        } else {
            i3 = 0;
        }
        if (this.t1 != i3) {
            this.t1 = i3;
            onStateChange = true;
        }
        if (this.E1 != null) {
            int[] iArr3 = lq5.a;
            boolean z6 = false;
            boolean z7 = false;
            for (int i7 : iArr) {
                if (i7 == 16842910) {
                    z6 = true;
                } else if (i7 == 16842908 || i7 == 16842919 || i7 == 16843623) {
                    z7 = true;
                }
            }
            if (z6 && z7) {
                i4 = this.E1.getColorForState(iArr, this.u1);
                if (this.u1 != i4) {
                    this.u1 = i4;
                }
                g07Var = this.p1.f;
                if (g07Var == null && (colorStateList2 = g07Var.k) != null) {
                    i5 = colorStateList2.getColorForState(iArr, this.v1);
                } else {
                    i5 = 0;
                }
                if (this.v1 != i5) {
                    this.v1 = i5;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        } else if (state[i8] == 16842912) {
                            if (this.V0) {
                                z3 = true;
                            }
                        } else {
                            i8++;
                        }
                    }
                }
                z3 = false;
                if (this.w1 == z3 && this.X0 != null) {
                    float v = v();
                    this.w1 = z3;
                    if (v != v()) {
                        onStateChange = true;
                        z4 = true;
                    } else {
                        z4 = false;
                        onStateChange = true;
                    }
                } else {
                    z4 = false;
                }
                colorStateList = this.B1;
                if (colorStateList == null) {
                    i6 = colorStateList.getColorForState(iArr, this.x1);
                } else {
                    i6 = 0;
                }
                if (this.x1 == i6) {
                    this.x1 = i6;
                    ColorStateList colorStateList6 = this.B1;
                    PorterDuff.Mode mode = this.C1;
                    if (colorStateList6 != null && mode != null) {
                        porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                    } else {
                        porterDuffColorFilter = null;
                    }
                    this.A1 = porterDuffColorFilter;
                } else {
                    z5 = onStateChange;
                }
                if (z(this.L0)) {
                    z5 |= this.L0.setState(iArr);
                }
                if (z(this.X0)) {
                    z5 |= this.X0.setState(iArr);
                }
                if (z(this.Q0)) {
                    int[] iArr4 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
                    z5 |= this.Q0.setState(iArr4);
                }
                if (z(this.R0)) {
                    z5 |= this.R0.setState(iArr2);
                }
                if (z5) {
                    invalidateSelf();
                }
                if (z4) {
                    A();
                }
                return z5;
            }
        }
        i4 = 0;
        if (this.u1 != i4) {
        }
        g07Var = this.p1.f;
        if (g07Var == null) {
        }
        i5 = 0;
        if (this.v1 != i5) {
        }
        state = getState();
        if (state != null) {
        }
        z3 = false;
        if (this.w1 == z3) {
        }
        z4 = false;
        colorStateList = this.B1;
        if (colorStateList == null) {
        }
        if (this.x1 == i6) {
        }
        if (z(this.L0)) {
        }
        if (z(this.X0)) {
        }
        if (z(this.Q0)) {
        }
        if (z(this.R0)) {
        }
        if (z5) {
        }
        if (z4) {
        }
        return z5;
    }

    public final void C(boolean z) {
        if (this.V0 != z) {
            this.V0 = z;
            float v = v();
            if (!z && this.w1) {
                this.w1 = false;
            }
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void D(Drawable drawable) {
        if (this.X0 != drawable) {
            float v = v();
            this.X0 = drawable;
            float v2 = v();
            b0(this.X0);
            t(this.X0);
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.Y0 != colorStateList) {
            this.Y0 = colorStateList;
            if (this.W0 && (drawable = this.X0) != null && this.V0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z) {
        if (this.W0 != z) {
            boolean Y = Y();
            this.W0 = z;
            boolean Y2 = Y();
            if (Y != Y2) {
                Drawable drawable = this.X0;
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
        if (this.F0 != f) {
            this.F0 = f;
            le6 f2 = this.B.a.f();
            f2.e = new t(f);
            f2.f = new t(f);
            f2.g = new t(f);
            f2.h = new t(f);
            setShapeAppearanceModel(f2.a());
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.L0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float v = v();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.L0 = drawable3;
            float v2 = v();
            b0(drawable2);
            if (Z()) {
                t(this.L0);
            }
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void I(float f) {
        if (this.N0 != f) {
            float v = v();
            this.N0 = f;
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        this.O0 = true;
        if (this.M0 != colorStateList) {
            this.M0 = colorStateList;
            if (Z()) {
                this.L0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z) {
        if (this.K0 != z) {
            boolean Z = Z();
            this.K0 = z;
            boolean Z2 = Z();
            if (Z != Z2) {
                Drawable drawable = this.L0;
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
        if (this.G0 != colorStateList) {
            this.G0 = colorStateList;
            if (this.J1) {
                n24 n24Var = this.B;
                if (n24Var.e != colorStateList) {
                    n24Var.e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void M(float f) {
        if (this.H0 != f) {
            this.H0 = f;
            this.k1.setStrokeWidth(f);
            if (this.J1) {
                this.B.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void N(Drawable drawable) {
        Drawable drawable2 = this.Q0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float w = w();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.Q0 = drawable3;
            this.R0 = new RippleDrawable(lq5.a(this.I0), this.Q0, L1);
            float w2 = w();
            b0(drawable2);
            if (a0()) {
                t(this.Q0);
            }
            invalidateSelf();
            if (w != w2) {
                A();
            }
        }
    }

    public final void O(float f) {
        if (this.h1 != f) {
            this.h1 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void P(float f) {
        if (this.T0 != f) {
            this.T0 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void Q(float f) {
        if (this.g1 != f) {
            this.g1 = f;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final boolean R(int[] iArr) {
        if (!Arrays.equals(this.D1, iArr)) {
            this.D1 = iArr;
            if (a0()) {
                return B(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    public final void S(ColorStateList colorStateList) {
        if (this.S0 != colorStateList) {
            this.S0 = colorStateList;
            if (a0()) {
                this.Q0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void T(boolean z) {
        if (this.P0 != z) {
            boolean a0 = a0();
            this.P0 = z;
            boolean a02 = a0();
            if (a0 != a02) {
                Drawable drawable = this.Q0;
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
        if (this.d1 != f) {
            float v = v();
            this.d1 = f;
            float v2 = v();
            invalidateSelf();
            if (v != v2) {
                A();
            }
        }
    }

    public final void V(float f) {
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

    public final void W(ColorStateList colorStateList) {
        if (this.I0 != colorStateList) {
            this.I0 = colorStateList;
            this.E1 = null;
            onStateChange(getState());
        }
    }

    public final void X(g07 g07Var) {
        h17 h17Var = this.p1;
        kq0 kq0Var = h17Var.b;
        TextPaint textPaint = h17Var.a;
        if (h17Var.f != g07Var) {
            h17Var.f = g07Var;
            if (g07Var != null) {
                Context context = this.j1;
                g07Var.e(context, textPaint, kq0Var);
                nq0 nq0Var = (nq0) h17Var.e.get();
                if (nq0Var != null) {
                    textPaint.drawableState = nq0Var.getState();
                }
                g07Var.d(context, textPaint, kq0Var);
                h17Var.d = true;
            }
            nq0 nq0Var2 = (nq0) h17Var.e.get();
            if (nq0Var2 != null) {
                nq0Var2.A();
                nq0Var2.invalidateSelf();
                nq0Var2.onStateChange(nq0Var2.getState());
            }
        }
    }

    public final boolean Y() {
        if (this.W0 && this.X0 != null && this.w1) {
            return true;
        }
        return false;
    }

    public final boolean Z() {
        if (this.K0 && this.L0 != null) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        if (this.P0 && this.Q0 != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        boolean z;
        int i3;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.y1) != 0) {
            if (i < 255) {
                canvas2 = canvas;
                i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
            } else {
                canvas2 = canvas;
                i2 = 0;
            }
            boolean z2 = this.J1;
            Paint paint = this.k1;
            RectF rectF = this.m1;
            if (!z2) {
                paint.setColor(this.q1);
                paint.setStyle(Paint.Style.FILL);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, x(), x(), paint);
            }
            if (!this.J1) {
                paint.setColor(this.r1);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.z1;
                if (colorFilter == null) {
                    colorFilter = this.A1;
                }
                paint.setColorFilter(colorFilter);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, x(), x(), paint);
            }
            if (this.J1) {
                super.draw(canvas);
            }
            if (this.H0 > RecyclerView.B1 && !this.J1) {
                paint.setColor(this.t1);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.J1) {
                    ColorFilter colorFilter2 = this.z1;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.A1;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f2 = this.H0 / 2.0f;
                rectF.set(bounds.left + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
                float f3 = this.F0 - (this.H0 / 2.0f);
                canvas2.drawRoundRect(rectF, f3, f3, paint);
            }
            paint.setColor(this.u1);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            if (!this.J1) {
                canvas2.drawRoundRect(rectF, x(), x(), paint);
                f = 2.0f;
            } else {
                RectF rectF2 = new RectF(bounds);
                n24 n24Var = this.B;
                me6 me6Var = n24Var.a;
                float[] fArr = this.x0;
                float f4 = n24Var.j;
                m24 m24Var = this.n0;
                oe6 oe6Var = this.o0;
                f = 2.0f;
                Path path = this.o1;
                oe6Var.a(me6Var, fArr, f4, rectF2, m24Var, path);
                e(canvas2, paint, path, this.B.a, this.x0, g());
            }
            if (Z()) {
                u(bounds, rectF);
                float f5 = rectF.left;
                float f6 = rectF.top;
                canvas2.translate(f5, f6);
                this.L0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.L0.draw(canvas2);
                canvas2.translate(-f5, -f6);
            }
            if (Y()) {
                u(bounds, rectF);
                float f7 = rectF.left;
                float f8 = rectF.top;
                canvas2.translate(f7, f8);
                this.X0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.X0.draw(canvas2);
                canvas2.translate(-f7, -f8);
            }
            if (this.H1 && this.J0 != null) {
                PointF pointF = this.n1;
                pointF.set(RecyclerView.B1, RecyclerView.B1);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.J0;
                h17 h17Var = this.p1;
                if (charSequence != null) {
                    float v = v() + this.b1 + this.e1;
                    if (getLayoutDirection() == 0) {
                        pointF.x = bounds.left + v;
                    } else {
                        pointF.x = bounds.right - v;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = h17Var.a;
                    Paint.FontMetrics fontMetrics = this.l1;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / f);
                }
                rectF.setEmpty();
                if (this.J0 != null) {
                    float v2 = v() + this.b1 + this.e1;
                    float w = w() + this.i1 + this.f1;
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
                g07 g07Var = h17Var.f;
                TextPaint textPaint2 = h17Var.a;
                if (g07Var != null) {
                    textPaint2.drawableState = getState();
                    h17Var.f.d(this.j1, textPaint2, h17Var.b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(h17Var.a(this.J0.toString())) > Math.round(rectF.width())) {
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
                CharSequence charSequence2 = this.J0;
                if (z && this.G1 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.G1);
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
                    float f9 = this.i1 + this.h1;
                    if (getLayoutDirection() == 0) {
                        float f10 = bounds.right - f9;
                        rectF.right = f10;
                        rectF.left = f10 - this.T0;
                    } else {
                        float f11 = bounds.left + f9;
                        rectF.left = f11;
                        rectF.right = f11 + this.T0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f12 = this.T0;
                    float f13 = exactCenterY - (f12 / f);
                    rectF.top = f13;
                    rectF.bottom = f13 + f12;
                }
                float f14 = rectF.left;
                float f15 = rectF.top;
                canvas2.translate(f14, f15);
                this.Q0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.R0.setBounds(this.Q0.getBounds());
                this.R0.jumpToCurrentState();
                this.R0.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (this.y1 < 255) {
                canvas2.restoreToCount(i2);
            }
        }
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.y1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.z1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.E0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(w() + this.p1.a(this.J0.toString()) + v() + this.b1 + this.e1 + this.f1 + this.i1), this.I1);
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.J1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.F0);
            outline2 = outline;
        } else {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.E0, this.F0);
        }
        outline2.setAlpha(this.y1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!y(this.C0) && !y(this.D0) && !y(this.G0)) {
            g07 g07Var = this.p1.f;
            if (g07Var == null || (colorStateList = g07Var.k) == null || !colorStateList.isStateful()) {
                if ((!this.W0 || this.X0 == null || !this.V0) && !z(this.L0) && !z(this.X0) && !y(this.B1)) {
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
            onLayoutDirectionChanged |= this.L0.setLayoutDirection(i);
        }
        if (Y()) {
            onLayoutDirectionChanged |= this.X0.setLayoutDirection(i);
        }
        if (a0()) {
            onLayoutDirectionChanged |= this.Q0.setLayoutDirection(i);
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
            onLevelChange |= this.L0.setLevel(i);
        }
        if (Y()) {
            onLevelChange |= this.X0.setLevel(i);
        }
        if (a0()) {
            onLevelChange |= this.Q0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.J1) {
            super.onStateChange(iArr);
        }
        return B(iArr, this.D1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.y1 != i) {
            this.y1 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.z1 != colorFilter) {
            this.z1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.B1 != colorStateList) {
            this.B1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.p24, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.C1 != mode) {
            this.C1 = mode;
            ColorStateList colorStateList = this.B1;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.A1 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (Z()) {
            visible |= this.L0.setVisible(z, z2);
        }
        if (Y()) {
            visible |= this.X0.setVisible(z, z2);
        }
        if (a0()) {
            visible |= this.Q0.setVisible(z, z2);
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
            if (drawable == this.Q0) {
                if (drawable.isStateful()) {
                    drawable.setState(this.D1);
                }
                drawable.setTintList(this.S0);
                return;
            }
            Drawable drawable2 = this.L0;
            if (drawable == drawable2 && this.O0) {
                drawable2.setTintList(this.M0);
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
        float f = this.b1 + this.c1;
        if (this.w1) {
            drawable = this.X0;
        } else {
            drawable = this.L0;
        }
        float f2 = this.N0;
        if (f2 <= RecyclerView.B1 && drawable != null) {
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
        if (this.w1) {
            drawable2 = this.X0;
        } else {
            drawable2 = this.L0;
        }
        float f5 = this.N0;
        if (f5 <= RecyclerView.B1 && drawable2 != null) {
            f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.j1.getResources().getDisplayMetrics()));
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
            return RecyclerView.B1;
        }
        float f = this.c1;
        if (this.w1) {
            drawable = this.X0;
        } else {
            drawable = this.L0;
        }
        float f2 = this.N0;
        if (f2 <= RecyclerView.B1 && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.d1;
    }

    public final float w() {
        if (a0()) {
            return this.g1 + this.T0 + this.h1;
        }
        return RecyclerView.B1;
    }

    public final float x() {
        if (this.J1) {
            float[] fArr = this.x0;
            if (fArr != null) {
                return fArr[3];
            }
            return this.B.a.e.a(g());
        }
        return this.F0;
    }
}
