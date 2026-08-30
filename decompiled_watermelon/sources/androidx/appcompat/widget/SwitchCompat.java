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
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final dj0 P0 = new dj0("thumbPos", 5, Float.class);
    public static final int[] Q0 = {16842912};
    public Drawable A;
    public int A0;
    public ColorStateList B;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public boolean F0;
    public final TextPaint G0;
    public final ColorStateList H0;
    public StaticLayout I0;
    public StaticLayout J0;
    public final ac K0;
    public PorterDuff.Mode L;
    public ObjectAnimator L0;
    public yq M0;
    public cl6 N0;
    public final Rect O0;
    public boolean R;
    public boolean c0;
    public Drawable d0;
    public ColorStateList e0;
    public PorterDuff.Mode f0;
    public boolean g0;
    public boolean h0;
    public int i0;
    public int j0;
    public int k0;
    public boolean l0;
    public CharSequence m0;
    public CharSequence n0;
    public CharSequence o0;
    public CharSequence p0;
    public boolean q0;
    public int r0;
    public final int s0;
    public float t0;
    public float u0;
    public final VelocityTracker v0;
    public final int w0;
    public float x0;
    public int y0;
    public int z0;

    /* JADX WARN: Type inference failed for: r12v11, types: [ac, java.lang.Object] */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchStyle);
        Typeface typeface;
        Typeface create;
        int i;
        int resourceId;
        this.B = null;
        this.L = null;
        this.R = false;
        this.c0 = false;
        this.e0 = null;
        this.f0 = null;
        this.g0 = false;
        this.h0 = false;
        this.v0 = VelocityTracker.obtain();
        this.F0 = true;
        this.O0 = new Rect();
        qs6.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.G0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = by4.w;
        n85 q = n85.q(context, attributeSet, iArr, R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) q.L;
        aa7.m(this, context, iArr, attributeSet, typedArray, R.attr.switchStyle);
        Drawable f = q.f(2);
        this.A = f;
        if (f != null) {
            f.setCallback(this);
        }
        Drawable f2 = q.f(11);
        this.d0 = f2;
        if (f2 != null) {
            f2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.q0 = typedArray.getBoolean(3, true);
        this.i0 = typedArray.getDimensionPixelSize(8, 0);
        this.j0 = typedArray.getDimensionPixelSize(5, 0);
        this.k0 = typedArray.getDimensionPixelSize(6, 0);
        this.l0 = typedArray.getBoolean(4, false);
        ColorStateList e = q.e(9);
        if (e != null) {
            this.B = e;
            this.R = true;
        }
        PorterDuff.Mode c = vk1.c(typedArray.getInt(10, -1), null);
        if (this.L != c) {
            this.L = c;
            this.c0 = true;
        }
        if (this.R || this.c0) {
            a();
        }
        ColorStateList e2 = q.e(12);
        if (e2 != null) {
            this.e0 = e2;
            this.g0 = true;
        }
        PorterDuff.Mode c2 = vk1.c(typedArray.getInt(13, -1), null);
        if (this.f0 != c2) {
            this.f0 = c2;
            this.h0 = true;
        }
        if (this.g0 || this.h0) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, by4.x);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = jv3.x(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.H0 = colorStateList;
            } else {
                this.H0 = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f3 = dimensionPixelSize;
                if (f3 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f3);
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
            float f4 = RecyclerView.A1;
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
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : f4);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(RecyclerView.A1);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                obj.A = context2.getResources().getConfiguration().locale;
                this.K0 = obj;
            } else {
                this.K0 = null;
            }
            setTextOnInternal(this.m0);
            setTextOffInternal(this.o0);
            obtainStyledAttributes.recycle();
        }
        new zr(this).f(attributeSet, R.attr.switchStyle);
        q.t();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.s0 = viewConfiguration.getScaledTouchSlop();
        this.w0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private yq getEmojiTextViewHelper() {
        if (this.M0 == null) {
            this.M0 = new yq(this);
        }
        return this.M0;
    }

    private boolean getTargetCheckedState() {
        if (this.x0 > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        boolean z = dc7.a;
        int layoutDirection = getLayoutDirection();
        float f = this.x0;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.d0;
        if (drawable != null) {
            Rect rect2 = this.O0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.A;
            if (drawable2 != null) {
                rect = vk1.b(drawable2);
            } else {
                rect = vk1.c;
            }
            return ((((this.y0 - this.A0) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.o0 = charSequence;
        TransformationMethod W = ((l) getEmojiTextViewHelper().b.B).W(this.K0);
        if (W != null) {
            charSequence = W.getTransformation(charSequence, this);
        }
        this.p0 = charSequence;
        this.J0 = null;
        if (this.q0) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.m0 = charSequence;
        TransformationMethod W = ((l) getEmojiTextViewHelper().b.B).W(this.K0);
        if (W != null) {
            charSequence = W.getTransformation(charSequence, this);
        }
        this.n0 = charSequence;
        this.I0 = null;
        if (this.q0) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.A;
        if (drawable != null) {
            if (this.R || this.c0) {
                Drawable mutate = drawable.mutate();
                this.A = mutate;
                if (this.R) {
                    mutate.setTintList(this.B);
                }
                if (this.c0) {
                    this.A.setTintMode(this.L);
                }
                if (this.A.isStateful()) {
                    this.A.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.d0;
        if (drawable != null) {
            if (this.g0 || this.h0) {
                Drawable mutate = drawable.mutate();
                this.d0 = mutate;
                if (this.g0) {
                    mutate.setTintList(this.e0);
                }
                if (this.h0) {
                    this.d0.setTintMode(this.f0);
                }
                if (this.d0.isStateful()) {
                    this.d0.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.m0);
        setTextOffInternal(this.o0);
        requestLayout();
    }

    public final void d() {
        if (this.N0 == null && ((l) this.M0.b.B).G() && mo1.d()) {
            mo1 a = mo1.a();
            int c = a.c();
            if (c == 3 || c == 0) {
                cl6 cl6Var = new cl6(this);
                this.N0 = cl6Var;
                a.h(cl6Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        int i3 = this.B0;
        int i4 = this.C0;
        int i5 = this.D0;
        int i6 = this.E0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.A;
        if (drawable != null) {
            rect = vk1.b(drawable);
        } else {
            rect = vk1.c;
        }
        Drawable drawable2 = this.d0;
        Rect rect2 = this.O0;
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
                    this.d0.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.d0.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.A;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.A0 + rect2.right;
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
        Drawable drawable2 = this.d0;
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
        Drawable drawable2 = this.d0;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = dc7.a;
        if (getLayoutDirection() == 1) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.y0;
            if (!TextUtils.isEmpty(getText())) {
                return compoundPaddingLeft + this.k0;
            }
            return compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = dc7.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.y0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.k0;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mj2.Z(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.q0;
    }

    public boolean getSplitTrack() {
        return this.l0;
    }

    public int getSwitchMinWidth() {
        return this.j0;
    }

    public int getSwitchPadding() {
        return this.k0;
    }

    public CharSequence getTextOff() {
        return this.o0;
    }

    public CharSequence getTextOn() {
        return this.m0;
    }

    public Drawable getThumbDrawable() {
        return this.A;
    }

    public final float getThumbPosition() {
        return this.x0;
    }

    public int getThumbTextPadding() {
        return this.i0;
    }

    public ColorStateList getThumbTintList() {
        return this.B;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.L;
    }

    public Drawable getTrackDrawable() {
        return this.d0;
    }

    public ColorStateList getTrackTintList() {
        return this.e0;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f0;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.d0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.L0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.L0.end();
            this.L0 = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, Q0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.d0;
        Rect rect = this.O0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.C0;
        int i2 = this.E0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.A;
        if (drawable != null) {
            if (this.l0 && drawable2 != null) {
                Rect b = vk1.b(drawable2);
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
            staticLayout = this.I0;
        } else {
            staticLayout = this.J0;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.G0;
            ColorStateList colorStateList = this.H0;
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
                charSequence = this.m0;
            } else {
                charSequence = this.o0;
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
            Drawable drawable = this.d0;
            Rect rect = this.O0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b = vk1.b(this.A);
            i5 = Math.max(0, b.left - rect.left);
            i9 = Math.max(0, b.right - rect.right);
        } else {
            i5 = 0;
        }
        boolean z2 = dc7.a;
        if (getLayoutDirection() == 1) {
            i6 = getPaddingLeft() + i5;
            width = ((this.y0 + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.y0) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i8 = getPaddingTop();
                i7 = this.z0 + i8;
            } else {
                i7 = getHeight() - getPaddingBottom();
                i8 = i7 - this.z0;
            }
        } else {
            int paddingTop = getPaddingTop();
            int i10 = this.z0;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i10 / 2);
            i7 = i10 + height;
            i8 = height;
        }
        this.B0 = i6;
        this.C0 = i8;
        this.E0 = i7;
        this.D0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (this.q0) {
            StaticLayout staticLayout = this.I0;
            TextPaint textPaint = this.G0;
            if (staticLayout == null) {
                CharSequence charSequence = this.n0;
                if (charSequence != null) {
                    i7 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
                } else {
                    i7 = 0;
                }
                this.I0 = new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, RecyclerView.A1, true);
            }
            if (this.J0 == null) {
                CharSequence charSequence2 = this.p0;
                if (charSequence2 != null) {
                    i6 = (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint));
                } else {
                    i6 = 0;
                }
                this.J0 = new StaticLayout(charSequence2, textPaint, i6, Layout.Alignment.ALIGN_NORMAL, 1.0f, RecyclerView.A1, true);
            }
        }
        Drawable drawable = this.A;
        Rect rect = this.O0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.A.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.A.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.q0) {
            i5 = (this.i0 * 2) + Math.max(this.I0.getWidth(), this.J0.getWidth());
        } else {
            i5 = 0;
        }
        this.A0 = Math.max(i5, i3);
        Drawable drawable2 = this.d0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i8 = this.d0.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.A;
        if (drawable3 != null) {
            Rect b = vk1.b(drawable3);
            i9 = Math.max(i9, b.left);
            i10 = Math.max(i10, b.right);
        }
        boolean z = this.F0;
        int i11 = this.j0;
        if (z) {
            i11 = Math.max(i11, (this.A0 * 2) + i9 + i10);
        }
        int max = Math.max(i8, i4);
        this.y0 = i11;
        this.z0 = max;
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
            charSequence = this.m0;
        } else {
            charSequence = this.o0;
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
                Object obj = this.m0;
                if (obj == null) {
                    obj = getResources().getString(R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = aa7.a;
                new o97(R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.o0;
            if (obj3 == null) {
                obj3 = getResources().getString(R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = aa7.a;
            new o97(R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj4);
        }
        IBinder windowToken = getWindowToken();
        float f = RecyclerView.A1;
        if (windowToken != null && isLaidOut()) {
            if (isChecked) {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, P0, f);
            this.L0 = ofFloat;
            ofFloat.setDuration(250L);
            this.L0.setAutoCancel(true);
            this.L0.start();
            return;
        }
        ObjectAnimator objectAnimator = this.L0;
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
        super.setCustomSelectionActionModeCallback(mj2.d0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.m0);
        setTextOffInternal(this.o0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.F0 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.q0 != z) {
            this.q0 = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.l0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.j0 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.k0 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.G0;
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
            Object obj = this.o0;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap = aa7.a;
            new o97(R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.m0;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            WeakHashMap weakHashMap = aa7.a;
            new o97(R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
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
        this.x0 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(l07.M(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.i0 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.B = colorStateList;
        this.R = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.L = mode;
        this.c0 = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.d0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.d0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(l07.M(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.e0 = colorStateList;
        this.g0 = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f0 = mode;
        this.h0 = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.A && drawable != this.d0) {
            return false;
        }
        return true;
    }
}
