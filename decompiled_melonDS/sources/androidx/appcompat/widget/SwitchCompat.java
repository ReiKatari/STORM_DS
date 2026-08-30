package androidx.appcompat.widget;

import a6.k0;
import a6.x0;
import aj.g;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.WeakHashMap;
import k7.w;
import m6.i;
import me.magnum.melonds.R;
import p1.c1;
import q.a3;
import q.b3;
import q.l1;
import q.u;
import q.u3;
import q.v0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final c8.b O0 = new c8.b(Float.class, "thumbPos", 7);
    public static final int[] P0 = {16842912};
    public Drawable A;
    public int A0;
    public ColorStateList B;
    public int B0;
    public int C0;
    public int D0;
    public boolean E0;
    public final TextPaint F0;
    public final ColorStateList G0;
    public StaticLayout H0;
    public StaticLayout I0;
    public final n.a J0;
    public ObjectAnimator K0;
    public PorterDuff.Mode L;
    public u L0;
    public a3 M0;
    public final Rect N0;
    public boolean R;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f983b0;

    /* renamed from: c0  reason: collision with root package name */
    public Drawable f984c0;

    /* renamed from: d0  reason: collision with root package name */
    public ColorStateList f985d0;

    /* renamed from: e0  reason: collision with root package name */
    public PorterDuff.Mode f986e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f987f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f988g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f989h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f990i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f991j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f992k0;

    /* renamed from: l0  reason: collision with root package name */
    public CharSequence f993l0;

    /* renamed from: m0  reason: collision with root package name */
    public CharSequence f994m0;

    /* renamed from: n0  reason: collision with root package name */
    public CharSequence f995n0;

    /* renamed from: o0  reason: collision with root package name */
    public CharSequence f996o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f997q0;

    /* renamed from: r0  reason: collision with root package name */
    public final int f998r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f999s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f1000t0;

    /* renamed from: u0  reason: collision with root package name */
    public final VelocityTracker f1001u0;

    /* renamed from: v0  reason: collision with root package name */
    public final int f1002v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f1003w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f1004x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f1005y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f1006z0;

    /* JADX WARN: Type inference failed for: r14v11, types: [n.a, java.lang.Object] */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchStyle);
        Typeface typeface;
        Typeface create;
        int i2;
        int resourceId;
        this.B = null;
        this.L = null;
        this.R = false;
        this.f983b0 = false;
        this.f985d0 = null;
        this.f986e0 = null;
        this.f987f0 = false;
        this.f988g0 = false;
        this.f1001u0 = VelocityTracker.obtain();
        this.E0 = true;
        this.N0 = new Rect();
        b3.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.F0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = k.a.f7932w;
        c1 o5 = c1.o(context, attributeSet, iArr, R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) o5.B;
        x0.n(this, context, iArr, attributeSet, typedArray, R.attr.switchStyle);
        Drawable h2 = o5.h(2);
        this.A = h2;
        if (h2 != null) {
            h2.setCallback(this);
        }
        Drawable h10 = o5.h(11);
        this.f984c0 = h10;
        if (h10 != null) {
            h10.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.p0 = typedArray.getBoolean(3, true);
        this.f989h0 = typedArray.getDimensionPixelSize(8, 0);
        this.f990i0 = typedArray.getDimensionPixelSize(5, 0);
        this.f991j0 = typedArray.getDimensionPixelSize(6, 0);
        this.f992k0 = typedArray.getBoolean(4, false);
        ColorStateList e6 = o5.e(9);
        if (e6 != null) {
            this.B = e6;
            this.R = true;
        }
        PorterDuff.Mode c4 = l1.c(typedArray.getInt(10, -1), null);
        if (this.L != c4) {
            this.L = c4;
            this.f983b0 = true;
        }
        if (this.R || this.f983b0) {
            a();
        }
        ColorStateList e10 = o5.e(12);
        if (e10 != null) {
            this.f985d0 = e10;
            this.f987f0 = true;
        }
        PorterDuff.Mode c10 = l1.c(typedArray.getInt(13, -1), null);
        if (this.f986e0 != c10) {
            this.f986e0 = c10;
            this.f988g0 = true;
        }
        if (this.f987f0 || this.f988g0) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, k.a.f7933x);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = g.z(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.G0 = colorStateList;
            } else {
                this.G0 = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f8 = dimensionPixelSize;
                if (f8 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f8);
                    requestLayout();
                }
            }
            int i10 = obtainStyledAttributes.getInt(1, -1);
            int i11 = obtainStyledAttributes.getInt(2, -1);
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (i11 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i11);
                } else {
                    create = Typeface.create(typeface, i11);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i2 = create.getStyle();
                } else {
                    i2 = 0;
                }
                int i12 = (~i2) & i11;
                textPaint.setFakeBoldText((i12 & 1) != 0);
                textPaint.setTextSkewX((2 & i12) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                obj.A = context2.getResources().getConfiguration().locale;
                this.J0 = obj;
            } else {
                this.J0 = null;
            }
            setTextOnInternal(this.f993l0);
            setTextOffInternal(this.f995n0);
            obtainStyledAttributes.recycle();
        }
        new v0(this).f(attributeSet, R.attr.switchStyle);
        o5.p();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f998r0 = viewConfiguration.getScaledTouchSlop();
        this.f1002v0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private u getEmojiTextViewHelper() {
        if (this.L0 == null) {
            this.L0 = new u(this);
        }
        return this.L0;
    }

    private boolean getTargetCheckedState() {
        if (this.f1003w0 > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        boolean z10 = u3.f12027a;
        int layoutDirection = getLayoutDirection();
        float f8 = this.f1003w0;
        if (layoutDirection == 1) {
            f8 = 1.0f - f8;
        }
        return (int) ((f8 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f984c0;
        if (drawable != null) {
            Rect rect2 = this.N0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.A;
            if (drawable2 != null) {
                rect = l1.b(drawable2);
            } else {
                rect = l1.f11954c;
            }
            return ((((this.f1004x0 - this.f1006z0) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f995n0 = charSequence;
        TransformationMethod B0 = ((g) getEmojiTextViewHelper().f12024b.B).B0(this.J0);
        if (B0 != null) {
            charSequence = B0.getTransformation(charSequence, this);
        }
        this.f996o0 = charSequence;
        this.I0 = null;
        if (this.p0) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f993l0 = charSequence;
        TransformationMethod B0 = ((g) getEmojiTextViewHelper().f12024b.B).B0(this.J0);
        if (B0 != null) {
            charSequence = B0.getTransformation(charSequence, this);
        }
        this.f994m0 = charSequence;
        this.H0 = null;
        if (this.p0) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.A;
        if (drawable != null) {
            if (this.R || this.f983b0) {
                Drawable mutate = drawable.mutate();
                this.A = mutate;
                if (this.R) {
                    mutate.setTintList(this.B);
                }
                if (this.f983b0) {
                    this.A.setTintMode(this.L);
                }
                if (this.A.isStateful()) {
                    this.A.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f984c0;
        if (drawable != null) {
            if (this.f987f0 || this.f988g0) {
                Drawable mutate = drawable.mutate();
                this.f984c0 = mutate;
                if (this.f987f0) {
                    mutate.setTintList(this.f985d0);
                }
                if (this.f988g0) {
                    this.f984c0.setTintMode(this.f986e0);
                }
                if (this.f984c0.isStateful()) {
                    this.f984c0.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f993l0);
        setTextOffInternal(this.f995n0);
        requestLayout();
    }

    public final void d() {
        if (this.M0 == null && ((g) this.L0.f12024b.B).M() && i.d()) {
            i a10 = i.a();
            int c4 = a10.c();
            if (c4 == 3 || c4 == 0) {
                a3 a3Var = new a3(this);
                this.M0 = a3Var;
                a10.h(a3Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i2;
        int i10;
        int i11 = this.A0;
        int i12 = this.B0;
        int i13 = this.C0;
        int i14 = this.D0;
        int thumbOffset = getThumbOffset() + i11;
        Drawable drawable = this.A;
        if (drawable != null) {
            rect = l1.b(drawable);
        } else {
            rect = l1.f11954c;
        }
        Drawable drawable2 = this.f984c0;
        Rect rect2 = this.N0;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i15 = rect2.left;
            thumbOffset += i15;
            if (rect != null) {
                int i16 = rect.left;
                if (i16 > i15) {
                    i11 += i16 - i15;
                }
                int i17 = rect.top;
                int i18 = rect2.top;
                if (i17 > i18) {
                    i2 = (i17 - i18) + i12;
                } else {
                    i2 = i12;
                }
                int i19 = rect.right;
                int i20 = rect2.right;
                if (i19 > i20) {
                    i13 -= i19 - i20;
                }
                int i21 = rect.bottom;
                int i22 = rect2.bottom;
                if (i21 > i22) {
                    i10 = i14 - (i21 - i22);
                    this.f984c0.setBounds(i11, i2, i13, i10);
                }
            } else {
                i2 = i12;
            }
            i10 = i14;
            this.f984c0.setBounds(i11, i2, i13, i10);
        }
        Drawable drawable3 = this.A;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i23 = thumbOffset - rect2.left;
            int i24 = thumbOffset + this.f1006z0 + rect2.right;
            this.A.setBounds(i23, i12, i24, i14);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i23, i12, i24, i14);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f8, float f10) {
        super.drawableHotspotChanged(f8, f10);
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setHotspot(f8, f10);
        }
        Drawable drawable2 = this.f984c0;
        if (drawable2 != null) {
            drawable2.setHotspot(f8, f10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A;
        if (drawable != null && drawable.isStateful()) {
            z10 = drawable.setState(drawableState);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f984c0;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z10 = u3.f12027a;
        if (getLayoutDirection() == 1) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1004x0;
            if (!TextUtils.isEmpty(getText())) {
                return compoundPaddingLeft + this.f991j0;
            }
            return compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z10 = u3.f12027a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1004x0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f991j0;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.w0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.p0;
    }

    public boolean getSplitTrack() {
        return this.f992k0;
    }

    public int getSwitchMinWidth() {
        return this.f990i0;
    }

    public int getSwitchPadding() {
        return this.f991j0;
    }

    public CharSequence getTextOff() {
        return this.f995n0;
    }

    public CharSequence getTextOn() {
        return this.f993l0;
    }

    public Drawable getThumbDrawable() {
        return this.A;
    }

    public final float getThumbPosition() {
        return this.f1003w0;
    }

    public int getThumbTextPadding() {
        return this.f989h0;
    }

    public ColorStateList getThumbTintList() {
        return this.B;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.L;
    }

    public Drawable getTrackDrawable() {
        return this.f984c0;
    }

    public ColorStateList getTrackTintList() {
        return this.f985d0;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f986e0;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f984c0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.K0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.K0.end();
            this.K0 = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, P0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f984c0;
        Rect rect = this.N0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.B0;
        int i10 = this.D0;
        int i11 = i2 + rect.top;
        int i12 = i10 - rect.bottom;
        Drawable drawable2 = this.A;
        if (drawable != null) {
            if (this.f992k0 && drawable2 != null) {
                Rect b10 = l1.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b10.left;
                rect.right -= b10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.H0;
        } else {
            staticLayout = this.I0;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.F0;
            ColorStateList colorStateList = this.G0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i11 + i12) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f993l0;
            } else {
                charSequence = this.f995n0;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(' ');
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        int i13;
        int width;
        int i14;
        int i15;
        int i16;
        super.onLayout(z10, i2, i10, i11, i12);
        int i17 = 0;
        if (this.A != null) {
            Drawable drawable = this.f984c0;
            Rect rect = this.N0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b10 = l1.b(this.A);
            i13 = Math.max(0, b10.left - rect.left);
            i17 = Math.max(0, b10.right - rect.right);
        } else {
            i13 = 0;
        }
        boolean z11 = u3.f12027a;
        if (getLayoutDirection() == 1) {
            i14 = getPaddingLeft() + i13;
            width = ((this.f1004x0 + i14) - i13) - i17;
        } else {
            width = (getWidth() - getPaddingRight()) - i17;
            i14 = (width - this.f1004x0) + i13 + i17;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i16 = getPaddingTop();
                i15 = this.f1005y0 + i16;
            } else {
                i15 = getHeight() - getPaddingBottom();
                i16 = i15 - this.f1005y0;
            }
        } else {
            int paddingTop = getPaddingTop();
            int i18 = this.f1005y0;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i18 / 2);
            i15 = i18 + height;
            i16 = height;
        }
        this.A0 = i14;
        this.B0 = i16;
        this.D0 = i15;
        this.C0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        if (this.p0) {
            StaticLayout staticLayout = this.H0;
            TextPaint textPaint = this.F0;
            if (staticLayout == null) {
                CharSequence charSequence = this.f994m0;
                if (charSequence != null) {
                    i15 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
                } else {
                    i15 = 0;
                }
                this.H0 = new StaticLayout(charSequence, textPaint, i15, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.I0 == null) {
                CharSequence charSequence2 = this.f996o0;
                if (charSequence2 != null) {
                    i14 = (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint));
                } else {
                    i14 = 0;
                }
                this.I0 = new StaticLayout(charSequence2, textPaint, i14, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.A;
        Rect rect = this.N0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i11 = (this.A.getIntrinsicWidth() - rect.left) - rect.right;
            i12 = this.A.getIntrinsicHeight();
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (this.p0) {
            i13 = (this.f989h0 * 2) + Math.max(this.H0.getWidth(), this.I0.getWidth());
        } else {
            i13 = 0;
        }
        this.f1006z0 = Math.max(i13, i11);
        Drawable drawable2 = this.f984c0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i16 = this.f984c0.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i17 = rect.left;
        int i18 = rect.right;
        Drawable drawable3 = this.A;
        if (drawable3 != null) {
            Rect b10 = l1.b(drawable3);
            i17 = Math.max(i17, b10.left);
            i18 = Math.max(i18, b10.right);
        }
        boolean z10 = this.E0;
        int i19 = this.f990i0;
        if (z10) {
            i19 = Math.max(i19, (this.f1006z0 * 2) + i17 + i18);
        }
        int max = Math.max(i16, i12);
        this.f1004x0 = i19;
        this.f1005y0 = max;
        super.onMeasure(i2, i10);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f993l0;
        } else {
            charSequence = this.f995n0;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r1 != 3) goto L7;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f993l0;
                if (obj == null) {
                    obj = getResources().getString(R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = x0.f533a;
                new k0(R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.f995n0;
            if (obj3 == null) {
                obj3 = getResources().getString(R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = x0.f533a;
            new k0(R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj4);
        }
        float f8 = 0.0f;
        if (getWindowToken() != null && isLaidOut()) {
            if (isChecked) {
                f8 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, O0, f8);
            this.K0 = ofFloat;
            ofFloat.setDuration(250L);
            this.K0.setAutoCancel(true);
            this.K0.start();
            return;
        }
        ObjectAnimator objectAnimator = this.K0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f8 = 1.0f;
        }
        setThumbPosition(f8);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.A0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.f993l0);
        setTextOffInternal(this.f995n0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.E0 = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.p0 != z10) {
            this.p0 = z10;
            requestLayout();
            if (z10) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f992k0 = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f990i0 = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f991j0 = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.F0;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f995n0;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap = x0.f533a;
            new k0(R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f993l0;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            WeakHashMap weakHashMap = x0.f533a;
            new k0(R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.A;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.A = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f8) {
        this.f1003w0 = f8;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(w.p(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f989h0 = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.B = colorStateList;
        this.R = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.L = mode;
        this.f983b0 = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f984c0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f984c0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(w.p(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f985d0 = colorStateList;
        this.f987f0 = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f986e0 = mode;
        this.f988g0 = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.A && drawable != this.f984c0) {
            return false;
        }
        return true;
    }
}
