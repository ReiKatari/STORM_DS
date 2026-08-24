package androidx.appcompat.widget;

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
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final ml0 Q0 = new ml0("thumbPos", 5, Float.class);
    public static final int[] R0 = {16842912};
    public Drawable A;
    public int A0;
    public ColorStateList B;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;
    public final TextPaint H0;
    public final ColorStateList I0;
    public StaticLayout J0;
    public StaticLayout K0;
    public PorterDuff.Mode L;
    public final oc L0;
    public ObjectAnimator M0;
    public lr N0;
    public ww6 O0;
    public final Rect P0;
    public boolean R;
    public boolean d0;
    public Drawable e0;
    public ColorStateList f0;
    public PorterDuff.Mode g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public CharSequence n0;
    public CharSequence o0;
    public CharSequence p0;
    public CharSequence q0;
    public boolean r0;
    public int s0;
    public final int t0;
    public float u0;
    public float v0;
    public final VelocityTracker w0;
    public final int x0;
    public float y0;
    public int z0;

    /* JADX WARN: Type inference failed for: r12v11, types: [oc, java.lang.Object] */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchStyle);
        Typeface typeface;
        Typeface create;
        int i;
        int resourceId;
        this.B = null;
        this.L = null;
        this.R = false;
        this.d0 = false;
        this.f0 = null;
        this.g0 = null;
        this.h0 = false;
        this.i0 = false;
        this.w0 = VelocityTracker.obtain();
        this.G0 = true;
        this.P0 = new Rect();
        h57.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.H0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = m75.w;
        m44 A = m44.A(context, attributeSet, iArr, R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) A.L;
        ao7.m(this, context, iArr, attributeSet, typedArray, R.attr.switchStyle);
        Drawable k = A.k(2);
        this.A = k;
        if (k != null) {
            k.setCallback(this);
        }
        Drawable k2 = A.k(11);
        this.e0 = k2;
        if (k2 != null) {
            k2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.r0 = typedArray.getBoolean(3, true);
        this.j0 = typedArray.getDimensionPixelSize(8, 0);
        this.k0 = typedArray.getDimensionPixelSize(5, 0);
        this.l0 = typedArray.getDimensionPixelSize(6, 0);
        this.m0 = typedArray.getBoolean(4, false);
        ColorStateList g = A.g(9);
        if (g != null) {
            this.B = g;
            this.R = true;
        }
        PorterDuff.Mode c = bp1.c(typedArray.getInt(10, -1), null);
        if (this.L != c) {
            this.L = c;
            this.d0 = true;
        }
        if (this.R || this.d0) {
            a();
        }
        ColorStateList g2 = A.g(12);
        if (g2 != null) {
            this.f0 = g2;
            this.h0 = true;
        }
        PorterDuff.Mode c2 = bp1.c(typedArray.getInt(13, -1), null);
        if (this.g0 != c2) {
            this.g0 = c2;
            this.i0 = true;
        }
        if (this.h0 || this.i0) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, m75.x);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = ge7.A(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.I0 = colorStateList;
            } else {
                this.I0 = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = obtainStyledAttributes.getInt(1, -1);
            int i3 = obtainStyledAttributes.getInt(2, -1);
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
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
            float f2 = RecyclerView.B1;
            if (i3 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i3);
                } else {
                    create = Typeface.create(typeface, i3);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i = create.getStyle();
                } else {
                    i = 0;
                }
                int i4 = (~i) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : f2);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(RecyclerView.B1);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                obj.A = context2.getResources().getConfiguration().locale;
                this.L0 = obj;
            } else {
                this.L0 = null;
            }
            setTextOnInternal(this.n0);
            setTextOffInternal(this.p0);
            obtainStyledAttributes.recycle();
        }
        new ms(this).f(attributeSet, R.attr.switchStyle);
        A.D();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.t0 = viewConfiguration.getScaledTouchSlop();
        this.x0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private lr getEmojiTextViewHelper() {
        if (this.N0 == null) {
            this.N0 = new lr(this);
        }
        return this.N0;
    }

    private boolean getTargetCheckedState() {
        if (this.y0 > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        boolean z = eq7.a;
        int layoutDirection = getLayoutDirection();
        float f = this.y0;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.e0;
        if (drawable != null) {
            Rect rect2 = this.P0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.A;
            if (drawable2 != null) {
                rect = bp1.b(drawable2);
            } else {
                rect = bp1.c;
            }
            return ((((this.z0 - this.B0) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.p0 = charSequence;
        TransformationMethod I = ((jw2) getEmojiTextViewHelper().b.B).I(this.L0);
        if (I != null) {
            charSequence = I.getTransformation(charSequence, this);
        }
        this.q0 = charSequence;
        this.K0 = null;
        if (this.r0) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.n0 = charSequence;
        TransformationMethod I = ((jw2) getEmojiTextViewHelper().b.B).I(this.L0);
        if (I != null) {
            charSequence = I.getTransformation(charSequence, this);
        }
        this.o0 = charSequence;
        this.J0 = null;
        if (this.r0) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.A;
        if (drawable != null) {
            if (this.R || this.d0) {
                Drawable mutate = drawable.mutate();
                this.A = mutate;
                if (this.R) {
                    mutate.setTintList(this.B);
                }
                if (this.d0) {
                    this.A.setTintMode(this.L);
                }
                if (this.A.isStateful()) {
                    this.A.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.e0;
        if (drawable != null) {
            if (this.h0 || this.i0) {
                Drawable mutate = drawable.mutate();
                this.e0 = mutate;
                if (this.h0) {
                    mutate.setTintList(this.f0);
                }
                if (this.i0) {
                    this.e0.setTintMode(this.g0);
                }
                if (this.e0.isStateful()) {
                    this.e0.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.n0);
        setTextOffInternal(this.p0);
        requestLayout();
    }

    public final void d() {
        if (this.O0 == null && ((jw2) this.N0.b.B).u() && ws1.d()) {
            ws1 a = ws1.a();
            int c = a.c();
            if (c == 3 || c == 0) {
                ww6 ww6Var = new ww6(this);
                this.O0 = ww6Var;
                a.h(ww6Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        int i3 = this.C0;
        int i4 = this.D0;
        int i5 = this.E0;
        int i6 = this.F0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.A;
        if (drawable != null) {
            rect = bp1.b(drawable);
        } else {
            rect = bp1.c;
        }
        Drawable drawable2 = this.e0;
        Rect rect2 = this.P0;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if (i9 > i10) {
                    i = (i9 - i10) + i4;
                } else {
                    i = i4;
                }
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.e0.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.e0.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.A;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.B0 + rect2.right;
            this.A.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.e0;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        Drawable drawable2 = this.e0;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = eq7.a;
        if (getLayoutDirection() == 1) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.z0;
            if (!TextUtils.isEmpty(getText())) {
                return compoundPaddingLeft + this.l0;
            }
            return compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = eq7.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.z0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.l0;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ii2.Z(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.r0;
    }

    public boolean getSplitTrack() {
        return this.m0;
    }

    public int getSwitchMinWidth() {
        return this.k0;
    }

    public int getSwitchPadding() {
        return this.l0;
    }

    public CharSequence getTextOff() {
        return this.p0;
    }

    public CharSequence getTextOn() {
        return this.n0;
    }

    public Drawable getThumbDrawable() {
        return this.A;
    }

    public final float getThumbPosition() {
        return this.y0;
    }

    public int getThumbTextPadding() {
        return this.j0;
    }

    public ColorStateList getThumbTintList() {
        return this.B;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.L;
    }

    public Drawable getTrackDrawable() {
        return this.e0;
    }

    public ColorStateList getTrackTintList() {
        return this.f0;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.g0;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.e0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.M0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.M0.end();
            this.M0 = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, R0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.e0;
        Rect rect = this.P0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.D0;
        int i2 = this.F0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.A;
        if (drawable != null) {
            if (this.m0 && drawable2 != null) {
                Rect b = bp1.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b.left;
                rect.right -= b.right;
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
            staticLayout = this.J0;
        } else {
            staticLayout = this.K0;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.H0;
            ColorStateList colorStateList = this.I0;
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
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
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
                charSequence = this.n0;
            } else {
                charSequence = this.p0;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.A != null) {
            Drawable drawable = this.e0;
            Rect rect = this.P0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b = bp1.b(this.A);
            i5 = Math.max(0, b.left - rect.left);
            i9 = Math.max(0, b.right - rect.right);
        } else {
            i5 = 0;
        }
        boolean z2 = eq7.a;
        if (getLayoutDirection() == 1) {
            i6 = getPaddingLeft() + i5;
            width = ((this.z0 + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.z0) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i8 = getPaddingTop();
                i7 = this.A0 + i8;
            } else {
                i7 = getHeight() - getPaddingBottom();
                i8 = i7 - this.A0;
            }
        } else {
            int paddingTop = getPaddingTop();
            int i10 = this.A0;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i10 / 2);
            i7 = i10 + height;
            i8 = height;
        }
        this.C0 = i6;
        this.D0 = i8;
        this.F0 = i7;
        this.E0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (this.r0) {
            StaticLayout staticLayout = this.J0;
            TextPaint textPaint = this.H0;
            if (staticLayout == null) {
                CharSequence charSequence = this.o0;
                if (charSequence != null) {
                    i7 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
                } else {
                    i7 = 0;
                }
                this.J0 = new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, RecyclerView.B1, true);
            }
            if (this.K0 == null) {
                CharSequence charSequence2 = this.q0;
                if (charSequence2 != null) {
                    i6 = (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint));
                } else {
                    i6 = 0;
                }
                this.K0 = new StaticLayout(charSequence2, textPaint, i6, Layout.Alignment.ALIGN_NORMAL, 1.0f, RecyclerView.B1, true);
            }
        }
        Drawable drawable = this.A;
        Rect rect = this.P0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.A.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.A.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.r0) {
            i5 = (this.j0 * 2) + Math.max(this.J0.getWidth(), this.K0.getWidth());
        } else {
            i5 = 0;
        }
        this.B0 = Math.max(i5, i3);
        Drawable drawable2 = this.e0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i8 = this.e0.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.A;
        if (drawable3 != null) {
            Rect b = bp1.b(drawable3);
            i9 = Math.max(i9, b.left);
            i10 = Math.max(i10, b.right);
        }
        boolean z = this.G0;
        int i11 = this.k0;
        if (z) {
            i11 = Math.max(i11, (this.B0 * 2) + i9 + i10);
        }
        int max = Math.max(i8, i4);
        this.z0 = i11;
        this.A0 = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.n0;
        } else {
            charSequence = this.p0;
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
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float f;
        VelocityTracker velocityTracker = this.w0;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.t0;
        if (actionMasked != 0) {
            float f2 = RecyclerView.B1;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.s0;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            float x = motionEvent.getX();
                            int thumbScrollRange = getThumbScrollRange();
                            float f3 = x - this.u0;
                            if (thumbScrollRange != 0) {
                                f = f3 / thumbScrollRange;
                            } else if (f3 > RecyclerView.B1) {
                                f = 1.0f;
                            } else {
                                f = -1.0f;
                            }
                            boolean z3 = eq7.a;
                            if (getLayoutDirection() == 1) {
                                f = -f;
                            }
                            float f4 = this.y0;
                            float f5 = f + f4;
                            if (f5 >= RecyclerView.B1) {
                                if (f5 > 1.0f) {
                                    f2 = 1.0f;
                                } else {
                                    f2 = f5;
                                }
                            }
                            if (f2 != f4) {
                                this.u0 = x;
                                setThumbPosition(f2);
                            }
                            return true;
                        }
                    } else {
                        float x2 = motionEvent.getX();
                        float y = motionEvent.getY();
                        float f6 = i;
                        if (Math.abs(x2 - this.u0) > f6 || Math.abs(y - this.v0) > f6) {
                            this.s0 = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.u0 = x2;
                            this.v0 = y;
                            return true;
                        }
                    }
                }
            }
            if (this.s0 == 2) {
                this.s0 = 0;
                if (motionEvent.getAction() == 1 && isEnabled()) {
                    z = true;
                } else {
                    z = false;
                }
                boolean isChecked = isChecked();
                if (z) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(xVelocity) > this.x0) {
                        boolean z4 = eq7.a;
                        if (getLayoutDirection() != 1 ? xVelocity > RecyclerView.B1 : xVelocity < RecyclerView.B1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = getTargetCheckedState();
                    }
                } else {
                    z2 = isChecked;
                }
                if (z2 != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z2);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.s0 = 0;
            velocityTracker.clear();
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.A != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.A;
                Rect rect = this.P0;
                drawable.getPadding(rect);
                int i3 = this.D0 - i;
                int i4 = (this.C0 + thumbOffset) - i;
                int i5 = this.B0 + i4 + rect.left + rect.right + i;
                int i6 = this.F0 + i;
                if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                    this.s0 = 1;
                    this.u0 = x3;
                    this.v0 = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.n0;
                if (obj == null) {
                    obj = getResources().getString(R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = ao7.a;
                new on7(R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.p0;
            if (obj3 == null) {
                obj3 = getResources().getString(R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = ao7.a;
            new on7(R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj4);
        }
        IBinder windowToken = getWindowToken();
        float f = RecyclerView.B1;
        if (windowToken != null && isLaidOut()) {
            if (isChecked) {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, Q0, f);
            this.M0 = ofFloat;
            ofFloat.setDuration(250L);
            this.M0.setAutoCancel(true);
            this.M0.start();
            return;
        }
        ObjectAnimator objectAnimator = this.M0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f = 1.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ii2.c0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.n0);
        setTextOffInternal(this.p0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.G0 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.r0 != z) {
            this.r0 = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.m0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.k0 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.l0 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.H0;
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
            Object obj = this.p0;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap = ao7.a;
            new on7(R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.n0;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            WeakHashMap weakHashMap = ao7.a;
            new on7(R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
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

    public void setThumbPosition(float f) {
        this.y0 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(hf.S(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.j0 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.B = colorStateList;
        this.R = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.L = mode;
        this.d0 = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.e0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(hf.S(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f0 = colorStateList;
        this.h0 = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.g0 = mode;
        this.i0 = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.A && drawable != this.e0) {
            return false;
        }
        return true;
    }
}
