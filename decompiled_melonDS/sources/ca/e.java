package ca;

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
import com.google.android.material.chip.Chip;
import ha.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import me.magnum.melonds.R;
import na.h;
import na.j;
import na.m;
import na.n;
import na.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends j implements Drawable.Callback {
    public static final int[] I1 = {16842910};
    public static final ShapeDrawable J1 = new ShapeDrawable(new OvalShape());
    public ColorStateList A0;
    public PorterDuff.Mode A1;
    public ColorStateList B0;
    public int[] B1;
    public float C0;
    public ColorStateList C1;
    public float D0;
    public WeakReference D1;
    public ColorStateList E0;
    public TextUtils.TruncateAt E1;
    public float F0;
    public boolean F1;
    public ColorStateList G0;
    public int G1;
    public CharSequence H0;
    public boolean H1;
    public boolean I0;
    public Drawable J0;
    public ColorStateList K0;
    public float L0;
    public boolean M0;
    public boolean N0;
    public Drawable O0;
    public RippleDrawable P0;
    public ColorStateList Q0;
    public float R0;
    public SpannableStringBuilder S0;
    public boolean T0;
    public boolean U0;
    public Drawable V0;
    public ColorStateList W0;
    public u9.b X0;
    public u9.b Y0;
    public float Z0;

    /* renamed from: a1  reason: collision with root package name */
    public float f2774a1;

    /* renamed from: b1  reason: collision with root package name */
    public float f2775b1;

    /* renamed from: c1  reason: collision with root package name */
    public float f2776c1;

    /* renamed from: d1  reason: collision with root package name */
    public float f2777d1;

    /* renamed from: e1  reason: collision with root package name */
    public float f2778e1;

    /* renamed from: f1  reason: collision with root package name */
    public float f2779f1;

    /* renamed from: g1  reason: collision with root package name */
    public float f2780g1;

    /* renamed from: h1  reason: collision with root package name */
    public final Context f2781h1;

    /* renamed from: i1  reason: collision with root package name */
    public final Paint f2782i1;

    /* renamed from: j1  reason: collision with root package name */
    public final Paint.FontMetrics f2783j1;

    /* renamed from: k1  reason: collision with root package name */
    public final RectF f2784k1;

    /* renamed from: l1  reason: collision with root package name */
    public final PointF f2785l1;

    /* renamed from: m1  reason: collision with root package name */
    public final Path f2786m1;

    /* renamed from: n1  reason: collision with root package name */
    public final g f2787n1;

    /* renamed from: o1  reason: collision with root package name */
    public int f2788o1;

    /* renamed from: p1  reason: collision with root package name */
    public int f2789p1;

    /* renamed from: q1  reason: collision with root package name */
    public int f2790q1;

    /* renamed from: r1  reason: collision with root package name */
    public int f2791r1;

    /* renamed from: s1  reason: collision with root package name */
    public int f2792s1;

    /* renamed from: t1  reason: collision with root package name */
    public int f2793t1;

    /* renamed from: u1  reason: collision with root package name */
    public boolean f2794u1;

    /* renamed from: v1  reason: collision with root package name */
    public int f2795v1;

    /* renamed from: w1  reason: collision with root package name */
    public int f2796w1;

    /* renamed from: x1  reason: collision with root package name */
    public ColorFilter f2797x1;

    /* renamed from: y1  reason: collision with root package name */
    public PorterDuffColorFilter f2798y1;

    /* renamed from: z1  reason: collision with root package name */
    public ColorStateList f2799z1;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2131952811);
        this.D0 = -1.0f;
        this.f2782i1 = new Paint(1);
        this.f2783j1 = new Paint.FontMetrics();
        this.f2784k1 = new RectF();
        this.f2785l1 = new PointF();
        this.f2786m1 = new Path();
        this.f2796w1 = 255;
        this.A1 = PorterDuff.Mode.SRC_IN;
        this.D1 = new WeakReference(null);
        k(context);
        this.f2781h1 = context;
        g gVar = new g(this);
        this.f2787n1 = gVar;
        this.H0 = "";
        gVar.f6431a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = I1;
        setState(iArr);
        R(iArr);
        this.F1 = true;
        J1.setTint(-1);
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
        Chip chip = (Chip) this.D1.get();
        if (chip != null) {
            chip.b(chip.f3024m0);
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
        throw new UnsupportedOperationException("Method not decompiled: ca.e.B(int[], int[]):boolean");
    }

    public final void C(boolean z10) {
        if (this.T0 != z10) {
            this.T0 = z10;
            float v10 = v();
            if (!z10 && this.f2794u1) {
                this.f2794u1 = false;
            }
            float v11 = v();
            invalidateSelf();
            if (v10 != v11) {
                A();
            }
        }
    }

    public final void D(Drawable drawable) {
        if (this.V0 != drawable) {
            float v10 = v();
            this.V0 = drawable;
            float v11 = v();
            b0(this.V0);
            t(this.V0);
            invalidateSelf();
            if (v10 != v11) {
                A();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.W0 != colorStateList) {
            this.W0 = colorStateList;
            if (this.U0 && (drawable = this.V0) != null && this.T0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z10) {
        if (this.U0 != z10) {
            boolean Y = Y();
            this.U0 = z10;
            boolean Y2 = Y();
            if (Y != Y2) {
                Drawable drawable = this.V0;
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

    public final void G(float f8) {
        if (this.D0 != f8) {
            this.D0 = f8;
            m f10 = this.B.f10144a.f();
            f10.f10190e = new na.a(f8);
            f10.f10191f = new na.a(f8);
            f10.f10192g = new na.a(f8);
            f10.f10193h = new na.a(f8);
            setShapeAppearanceModel(f10.a());
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.J0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float v10 = v();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.J0 = drawable3;
            float v11 = v();
            b0(drawable2);
            if (Z()) {
                t(this.J0);
            }
            invalidateSelf();
            if (v10 != v11) {
                A();
            }
        }
    }

    public final void I(float f8) {
        if (this.L0 != f8) {
            float v10 = v();
            this.L0 = f8;
            float v11 = v();
            invalidateSelf();
            if (v10 != v11) {
                A();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        this.M0 = true;
        if (this.K0 != colorStateList) {
            this.K0 = colorStateList;
            if (Z()) {
                this.J0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z10) {
        if (this.I0 != z10) {
            boolean Z = Z();
            this.I0 = z10;
            boolean Z2 = Z();
            if (Z != Z2) {
                Drawable drawable = this.J0;
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
        if (this.E0 != colorStateList) {
            this.E0 = colorStateList;
            if (this.H1) {
                h hVar = this.B;
                if (hVar.f10148e != colorStateList) {
                    hVar.f10148e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void M(float f8) {
        if (this.F0 != f8) {
            this.F0 = f8;
            this.f2782i1.setStrokeWidth(f8);
            if (this.H1) {
                this.B.f10154k = f8;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void N(Drawable drawable) {
        Drawable drawable2 = this.O0;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float w10 = w();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.O0 = drawable3;
            this.P0 = new RippleDrawable(la.a.a(this.G0), this.O0, J1);
            float w11 = w();
            b0(drawable2);
            if (a0()) {
                t(this.O0);
            }
            invalidateSelf();
            if (w10 != w11) {
                A();
            }
        }
    }

    public final void O(float f8) {
        if (this.f2779f1 != f8) {
            this.f2779f1 = f8;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void P(float f8) {
        if (this.R0 != f8) {
            this.R0 = f8;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void Q(float f8) {
        if (this.f2778e1 != f8) {
            this.f2778e1 = f8;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final boolean R(int[] iArr) {
        if (!Arrays.equals(this.B1, iArr)) {
            this.B1 = iArr;
            if (a0()) {
                return B(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    public final void S(ColorStateList colorStateList) {
        if (this.Q0 != colorStateList) {
            this.Q0 = colorStateList;
            if (a0()) {
                this.O0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void T(boolean z10) {
        if (this.N0 != z10) {
            boolean a02 = a0();
            this.N0 = z10;
            boolean a03 = a0();
            if (a02 != a03) {
                Drawable drawable = this.O0;
                if (a03) {
                    t(drawable);
                } else {
                    b0(drawable);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void U(float f8) {
        if (this.f2775b1 != f8) {
            float v10 = v();
            this.f2775b1 = f8;
            float v11 = v();
            invalidateSelf();
            if (v10 != v11) {
                A();
            }
        }
    }

    public final void V(float f8) {
        if (this.f2774a1 != f8) {
            float v10 = v();
            this.f2774a1 = f8;
            float v11 = v();
            invalidateSelf();
            if (v10 != v11) {
                A();
            }
        }
    }

    public final void W(ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            this.G0 = colorStateList;
            this.C1 = null;
            onStateChange(getState());
        }
    }

    public final void X(ka.d dVar) {
        g gVar = this.f2787n1;
        b bVar = gVar.f6432b;
        TextPaint textPaint = gVar.f6431a;
        if (gVar.f6436f != dVar) {
            gVar.f6436f = dVar;
            if (dVar != null) {
                Context context = this.f2781h1;
                dVar.e(context, textPaint, bVar);
                e eVar = (e) gVar.f6435e.get();
                if (eVar != null) {
                    textPaint.drawableState = eVar.getState();
                }
                dVar.d(context, textPaint, bVar);
                gVar.f6434d = true;
            }
            e eVar2 = (e) gVar.f6435e.get();
            if (eVar2 != null) {
                eVar2.A();
                eVar2.invalidateSelf();
                eVar2.onStateChange(eVar2.getState());
            }
        }
    }

    public final boolean Y() {
        if (this.U0 && this.V0 != null && this.f2794u1) {
            return true;
        }
        return false;
    }

    public final boolean Z() {
        if (this.I0 && this.J0 != null) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        if (this.N0 && this.O0 != null) {
            return true;
        }
        return false;
    }

    @Override // na.j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i2;
        Canvas canvas2;
        int i10;
        float f8;
        boolean z10;
        int i11;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i2 = this.f2796w1) != 0) {
            if (i2 < 255) {
                canvas2 = canvas;
                i10 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
            } else {
                canvas2 = canvas;
                i10 = 0;
            }
            boolean z11 = this.H1;
            Paint paint = this.f2782i1;
            RectF rectF = this.f2784k1;
            if (!z11) {
                paint.setColor(this.f2788o1);
                paint.setStyle(Paint.Style.FILL);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, x(), x(), paint);
            }
            if (!this.H1) {
                paint.setColor(this.f2789p1);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f2797x1;
                if (colorFilter == null) {
                    colorFilter = this.f2798y1;
                }
                paint.setColorFilter(colorFilter);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, x(), x(), paint);
            }
            if (this.H1) {
                super.draw(canvas);
            }
            if (this.F0 > 0.0f && !this.H1) {
                paint.setColor(this.f2791r1);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.H1) {
                    ColorFilter colorFilter2 = this.f2797x1;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f2798y1;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f10 = this.F0 / 2.0f;
                rectF.set(bounds.left + f10, bounds.top + f10, bounds.right - f10, bounds.bottom - f10);
                float f11 = this.D0 - (this.F0 / 2.0f);
                canvas2.drawRoundRect(rectF, f11, f11, paint);
            }
            paint.setColor(this.f2792s1);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            if (!this.H1) {
                canvas2.drawRoundRect(rectF, x(), x(), paint);
                f8 = 2.0f;
            } else {
                RectF rectF2 = new RectF(bounds);
                h hVar = this.B;
                n nVar = hVar.f10144a;
                float[] fArr = this.f10182v0;
                float f12 = hVar.f10153j;
                na.g gVar = this.f10173l0;
                p pVar = this.f10174m0;
                f8 = 2.0f;
                Path path = this.f2786m1;
                pVar.a(nVar, fArr, f12, rectF2, gVar, path);
                e(canvas2, paint, path, this.B.f10144a, this.f10182v0, g());
            }
            if (Z()) {
                u(bounds, rectF);
                float f13 = rectF.left;
                float f14 = rectF.top;
                canvas2.translate(f13, f14);
                this.J0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.J0.draw(canvas2);
                canvas2.translate(-f13, -f14);
            }
            if (Y()) {
                u(bounds, rectF);
                float f15 = rectF.left;
                float f16 = rectF.top;
                canvas2.translate(f15, f16);
                this.V0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.V0.draw(canvas2);
                canvas2.translate(-f15, -f16);
            }
            if (this.F1 && this.H0 != null) {
                PointF pointF = this.f2785l1;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.H0;
                g gVar2 = this.f2787n1;
                if (charSequence != null) {
                    float v10 = v() + this.Z0 + this.f2776c1;
                    if (getLayoutDirection() == 0) {
                        pointF.x = bounds.left + v10;
                    } else {
                        pointF.x = bounds.right - v10;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = gVar2.f6431a;
                    Paint.FontMetrics fontMetrics = this.f2783j1;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / f8);
                }
                rectF.setEmpty();
                if (this.H0 != null) {
                    float v11 = v() + this.Z0 + this.f2776c1;
                    float w10 = w() + this.f2780g1 + this.f2777d1;
                    int layoutDirection = getLayoutDirection();
                    int i12 = bounds.left;
                    if (layoutDirection == 0) {
                        rectF.left = i12 + v11;
                        rectF.right = bounds.right - w10;
                    } else {
                        rectF.left = i12 + w10;
                        rectF.right = bounds.right - v11;
                    }
                    rectF.top = bounds.top;
                    rectF.bottom = bounds.bottom;
                }
                ka.d dVar = gVar2.f6436f;
                TextPaint textPaint2 = gVar2.f6431a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    gVar2.f6436f.d(this.f2781h1, textPaint2, gVar2.f6432b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(gVar2.a(this.H0.toString())) > Math.round(rectF.width())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int save = canvas2.save();
                    canvas2.clipRect(rectF);
                    i11 = save;
                } else {
                    i11 = 0;
                }
                CharSequence charSequence2 = this.H0;
                if (z10 && this.E1 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.E1);
                }
                canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
                canvas2 = canvas;
                if (z10) {
                    canvas2.restoreToCount(i11);
                }
            }
            if (a0()) {
                rectF.setEmpty();
                if (a0()) {
                    float f17 = this.f2780g1 + this.f2779f1;
                    if (getLayoutDirection() == 0) {
                        float f18 = bounds.right - f17;
                        rectF.right = f18;
                        rectF.left = f18 - this.R0;
                    } else {
                        float f19 = bounds.left + f17;
                        rectF.left = f19;
                        rectF.right = f19 + this.R0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f20 = this.R0;
                    float f21 = exactCenterY - (f20 / f8);
                    rectF.top = f21;
                    rectF.bottom = f21 + f20;
                }
                float f22 = rectF.left;
                float f23 = rectF.top;
                canvas2.translate(f22, f23);
                this.O0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.P0.setBounds(this.O0.getBounds());
                this.P0.jumpToCurrentState();
                this.P0.draw(canvas2);
                canvas2.translate(-f22, -f23);
            }
            if (this.f2796w1 < 255) {
                canvas2.restoreToCount(i10);
            }
        }
    }

    @Override // na.j, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2796w1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f2797x1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.C0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(w() + this.f2787n1.a(this.H0.toString()) + v() + this.Z0 + this.f2776c1 + this.f2777d1 + this.f2780g1), this.G1);
    }

    @Override // na.j, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // na.j, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.H1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.D0);
            outline2 = outline;
        } else {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.C0, this.D0);
        }
        outline2.setAlpha(this.f2796w1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // na.j, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!y(this.A0) && !y(this.B0) && !y(this.E0)) {
            ka.d dVar = this.f2787n1.f6436f;
            if (dVar == null || (colorStateList = dVar.f8126k) == null || !colorStateList.isStateful()) {
                if ((!this.U0 || this.V0 == null || !this.T0) && !z(this.J0) && !z(this.V0) && !y(this.f2799z1)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (Z()) {
            onLayoutDirectionChanged |= this.J0.setLayoutDirection(i2);
        }
        if (Y()) {
            onLayoutDirectionChanged |= this.V0.setLayoutDirection(i2);
        }
        if (a0()) {
            onLayoutDirectionChanged |= this.O0.setLayoutDirection(i2);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (Z()) {
            onLevelChange |= this.J0.setLevel(i2);
        }
        if (Y()) {
            onLevelChange |= this.V0.setLevel(i2);
        }
        if (a0()) {
            onLevelChange |= this.O0.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // na.j, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.H1) {
            super.onStateChange(iArr);
        }
        return B(iArr, this.B1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // na.j, android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.f2796w1 != i2) {
            this.f2796w1 = i2;
            invalidateSelf();
        }
    }

    @Override // na.j, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f2797x1 != colorFilter) {
            this.f2797x1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // na.j, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f2799z1 != colorStateList) {
            this.f2799z1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // na.j, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.A1 != mode) {
            this.A1 = mode;
            ColorStateList colorStateList = this.f2799z1;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f2798y1 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (Z()) {
            visible |= this.J0.setVisible(z10, z11);
        }
        if (Y()) {
            visible |= this.V0.setVisible(z10, z11);
        }
        if (a0()) {
            visible |= this.O0.setVisible(z10, z11);
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
            if (drawable == this.O0) {
                if (drawable.isStateful()) {
                    drawable.setState(this.B1);
                }
                drawable.setTintList(this.Q0);
                return;
            }
            Drawable drawable2 = this.J0;
            if (drawable == drawable2 && this.M0) {
                drawable2.setTintList(this.K0);
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
        float f8 = this.Z0 + this.f2774a1;
        if (this.f2794u1) {
            drawable = this.V0;
        } else {
            drawable = this.J0;
        }
        float f10 = this.L0;
        if (f10 <= 0.0f && drawable != null) {
            f10 = drawable.getIntrinsicWidth();
        }
        if (getLayoutDirection() == 0) {
            float f11 = rect.left + f8;
            rectF.left = f11;
            rectF.right = f11 + f10;
        } else {
            float f12 = rect.right - f8;
            rectF.right = f12;
            rectF.left = f12 - f10;
        }
        if (this.f2794u1) {
            drawable2 = this.V0;
        } else {
            drawable2 = this.J0;
        }
        float f13 = this.L0;
        if (f13 <= 0.0f && drawable2 != null) {
            f13 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f2781h1.getResources().getDisplayMetrics()));
            if (drawable2.getIntrinsicHeight() <= f13) {
                f13 = drawable2.getIntrinsicHeight();
            }
        }
        float exactCenterY = rect.exactCenterY() - (f13 / 2.0f);
        rectF.top = exactCenterY;
        rectF.bottom = exactCenterY + f13;
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
            return 0.0f;
        }
        float f8 = this.f2774a1;
        if (this.f2794u1) {
            drawable = this.V0;
        } else {
            drawable = this.J0;
        }
        float f10 = this.L0;
        if (f10 <= 0.0f && drawable != null) {
            f10 = drawable.getIntrinsicWidth();
        }
        return f10 + f8 + this.f2775b1;
    }

    public final float w() {
        if (a0()) {
            return this.f2778e1 + this.R0 + this.f2779f1;
        }
        return 0.0f;
    }

    public final float x() {
        if (this.H1) {
            float[] fArr = this.f10182v0;
            if (fArr != null) {
                return fArr[3];
            }
            return this.B.f10144a.f10202e.a(g());
        }
        return this.D0;
    }
}
