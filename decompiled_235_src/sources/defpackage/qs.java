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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qs  reason: default package */
/* loaded from: classes.dex */
public class qs extends TextView {
    public final z9 A;
    public final ms B;
    public final u63 L;
    public lr R;
    public boolean d0;
    public os0 e0;
    public Future f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h67.a(context);
        this.d0 = false;
        this.e0 = null;
        h57.a(this, getContext());
        z9 z9Var = new z9(this);
        this.A = z9Var;
        z9Var.k(attributeSet, i);
        ms msVar = new ms(this);
        this.B = msVar;
        msVar.f(attributeSet, i);
        msVar.b();
        u63 u63Var = new u63(10);
        u63Var.B = this;
        this.L = u63Var;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private lr getEmojiTextViewHelper() {
        if (this.R == null) {
            this.R = new lr(this);
        }
        return this.R;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.a();
        }
        ms msVar = this.B;
        if (msVar != null) {
            msVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (eq7.c) {
            return super.getAutoSizeMaxTextSize();
        }
        ms msVar = this.B;
        if (msVar != null) {
            return Math.round(msVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (eq7.c) {
            return super.getAutoSizeMinTextSize();
        }
        ms msVar = this.B;
        if (msVar != null) {
            return Math.round(msVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (eq7.c) {
            return super.getAutoSizeStepGranularity();
        }
        ms msVar = this.B;
        if (msVar != null) {
            return Math.round(msVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (eq7.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        ms msVar = this.B;
        if (msVar != null) {
            return msVar.i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (eq7.c) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        ms msVar = this.B;
        if (msVar != null) {
            return msVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ii2.Z(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ns getSuperCaller() {
        if (this.e0 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.e0 = new ps(this);
            } else if (i >= 28) {
                this.e0 = new os(this);
            } else if (i >= 26) {
                this.e0 = new os0(this, 13);
            }
        }
        return this.e0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        z9 z9Var = this.A;
        if (z9Var != null) {
            return z9Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        z9 z9Var = this.A;
        if (z9Var != null) {
            return z9Var.i();
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
        Future future = this.f0;
        if (future != null) {
            try {
                this.f0 = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    ii2.A(this);
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
        u63 u63Var;
        if (Build.VERSION.SDK_INT < 28 && (u63Var = this.L) != null) {
            TextClassifier textClassifier = (TextClassifier) u63Var.L;
            if (textClassifier == null) {
                return gs.a((TextView) u63Var.B);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public p05 getTextMetricsParamsCompat() {
        return ii2.A(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.B.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            jw2.C(editorInfo, getText());
        }
        l.G(editorInfo, onCreateInputConnection, this);
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
        ms msVar = this.B;
        if (msVar != null && !eq7.c) {
            msVar.i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f0;
        if (future != null) {
            try {
                this.f0 = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    ii2.A(this);
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
        ms msVar = this.B;
        if (msVar != null) {
            vs vsVar = msVar.i;
            if (!eq7.c && vsVar.f()) {
                vsVar.a();
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
        if (eq7.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        ms msVar = this.B;
        if (msVar != null) {
            msVar.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (eq7.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        ms msVar = this.B;
        if (msVar != null) {
            msVar.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (eq7.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        ms msVar = this.B;
        if (msVar != null) {
            msVar.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.B;
        if (msVar != null) {
            msVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.B;
        if (msVar != null) {
            msVar.b();
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
            drawable = hf.S(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = hf.S(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = hf.S(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = hf.S(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.B;
        if (msVar != null) {
            msVar.b();
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
            drawable = hf.S(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = hf.S(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = hf.S(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = hf.S(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.B;
        if (msVar != null) {
            msVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ii2.c0(callback, this));
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
            getSuperCaller().I(i);
        } else {
            ii2.O(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().B(i);
        } else {
            ii2.P(this, i);
        }
    }

    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().L(i, f);
        } else if (i2 >= 34) {
            c2.m(this, i, f);
        } else {
            ii2.Q(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(q05 q05Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        ii2.A(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ms msVar = this.B;
        msVar.k(colorStateList);
        msVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ms msVar = this.B;
        msVar.l(mode);
        msVar.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ms msVar = this.B;
        if (msVar != null) {
            msVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        u63 u63Var;
        if (Build.VERSION.SDK_INT < 28 && (u63Var = this.L) != null) {
            u63Var.L = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<q05> future) {
        this.f0 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(p05 p05Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = p05Var.b;
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
        getPaint().set(p05Var.a);
        setBreakStrategy(p05Var.c);
        setHyphenationFrequency(p05Var.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = eq7.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        ms msVar = this.B;
        if (msVar != null) {
            vs vsVar = msVar.i;
            if (!z && !vsVar.f()) {
                vsVar.g(i, f);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.d0) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            bl2 bl2Var = je7.a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                i.h("Context cannot be null");
                return;
            }
        } else {
            typeface2 = null;
        }
        this.d0 = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.d0 = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        ii2.Q(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.B;
        if (msVar != null) {
            msVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.B;
        if (msVar != null) {
            msVar.b();
        }
    }

    public qs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }
}
