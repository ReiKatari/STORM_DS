package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ds  reason: default package */
/* loaded from: classes.dex */
public class ds extends TextView {
    public final y9 A;
    public final zr B;
    public final q03 L;
    public yq R;
    public boolean c0;
    public bq0 d0;
    public Future e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qt6.a(context);
        this.c0 = false;
        this.d0 = null;
        qs6.a(this, getContext());
        y9 y9Var = new y9(this);
        this.A = y9Var;
        y9Var.k(attributeSet, i);
        zr zrVar = new zr(this);
        this.B = zrVar;
        zrVar.f(attributeSet, i);
        zrVar.b();
        q03 q03Var = new q03(10);
        q03Var.B = this;
        this.L = q03Var;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private yq getEmojiTextViewHelper() {
        if (this.R == null) {
            this.R = new yq(this);
        }
        return this.R;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.a();
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (dc7.c) {
            return super.getAutoSizeMaxTextSize();
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            return Math.round(zrVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (dc7.c) {
            return super.getAutoSizeMinTextSize();
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            return Math.round(zrVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (dc7.c) {
            return super.getAutoSizeStepGranularity();
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            return Math.round(zrVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (dc7.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            return zrVar.i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (dc7.c) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            return zrVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mj2.Z(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public as getSuperCaller() {
        if (this.d0 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.d0 = new cs(this);
            } else if (i >= 28) {
                this.d0 = new bs(this);
            } else if (i >= 26) {
                this.d0 = new bq0(13, this);
            }
        }
        return this.d0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        y9 y9Var = this.A;
        if (y9Var != null) {
            return y9Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y9 y9Var = this.A;
        if (y9Var != null) {
            return y9Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.B.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.B.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.e0;
        if (future != null) {
            try {
                this.e0 = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    mj2.B(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        q03 q03Var;
        if (Build.VERSION.SDK_INT < 28 && (q03Var = this.L) != null) {
            TextClassifier textClassifier = (TextClassifier) q03Var.L;
            if (textClassifier == null) {
                return tr.a((TextView) q03Var.B);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public mr4 getTextMetricsParamsCompat() {
        return mj2.B(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.B.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            dk7.G(editorInfo, getText());
        }
        tq5.x(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        zr zrVar = this.B;
        if (zrVar != null && !dc7.c) {
            zrVar.i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.e0;
        if (future != null) {
            try {
                this.e0 = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    mj2.B(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        zr zrVar = this.B;
        if (zrVar != null) {
            is isVar = zrVar.i;
            if (!dc7.c && isVar.f()) {
                isVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (dc7.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (dc7.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (dc7.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = l07.M(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = l07.M(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = l07.M(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = l07.M(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = l07.M(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = l07.M(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = l07.M(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = l07.M(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mj2.d0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().E(i);
        } else {
            mj2.R(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().s(i);
        } else {
            mj2.S(this, i);
        }
    }

    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().K(i, f);
        } else if (i2 >= 34) {
            a2.m(this, i, f);
        } else {
            mj2.T(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(nr4 nr4Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        mj2.B(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        zr zrVar = this.B;
        zrVar.k(colorStateList);
        zrVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        zr zrVar = this.B;
        zrVar.l(mode);
        zrVar.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        q03 q03Var;
        if (Build.VERSION.SDK_INT < 28 && (q03Var = this.L) != null) {
            q03Var.L = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<nr4> future) {
        this.e0 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(mr4 mr4Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = mr4Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(mr4Var.a);
        setBreakStrategy(mr4Var.c);
        setHyphenationFrequency(mr4Var.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = dc7.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            is isVar = zrVar.i;
            if (!z && !isVar.f()) {
                isVar.g(i, f);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.c0) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            hk2 hk2Var = o07.a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                i.i("Context cannot be null");
                return;
            }
        } else {
            typeface2 = null;
        }
        this.c0 = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.c0 = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        mj2.T(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    public ds(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }
}
