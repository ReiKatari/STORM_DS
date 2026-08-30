package q;

import android.annotation.SuppressLint;
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
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class z0 extends TextView {
    public final a4.k2 A;
    public final v0 B;
    public final z L;
    public u R;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f12068b0;

    /* renamed from: c0  reason: collision with root package name */
    public l.i0 f12069c0;

    /* renamed from: d0  reason: collision with root package name */
    public Future f12070d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c3.a(context);
        this.f12068b0 = false;
        this.f12069c0 = null;
        b3.a(this, getContext());
        a4.k2 k2Var = new a4.k2(this);
        this.A = k2Var;
        k2Var.k(attributeSet, i2);
        v0 v0Var = new v0(this);
        this.B = v0Var;
        v0Var.f(attributeSet, i2);
        v0Var.b();
        z zVar = new z();
        zVar.f12066b = this;
        this.L = zVar;
        getEmojiTextViewHelper().b(attributeSet, i2);
    }

    private u getEmojiTextViewHelper() {
        if (this.R == null) {
            this.R = new u(this);
        }
        return this.R;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.a();
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (u3.f12029c) {
            return super.getAutoSizeMaxTextSize();
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            return Math.round(v0Var.f12038i.f11894e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (u3.f12029c) {
            return super.getAutoSizeMinTextSize();
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            return Math.round(v0Var.f12038i.f11893d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (u3.f12029c) {
            return super.getAutoSizeStepGranularity();
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            return Math.round(v0Var.f12038i.f11892c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (u3.f12029c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            return v0Var.f12038i.f11895f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (u3.f12029c) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            return v0Var.f12038i.f11890a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return aj.g.w0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public w0 getSuperCaller() {
        if (this.f12069c0 == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                this.f12069c0 = new y0(this);
            } else if (i2 >= 28) {
                this.f12069c0 = new x0(this);
            } else if (i2 >= 26) {
                this.f12069c0 = new l.i0(26, this);
            }
        }
        return this.f12069c0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            return k2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            return k2Var.i();
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
        Future future = this.f12070d0;
        if (future != null) {
            try {
                this.f12070d0 = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    aj.g.D(this);
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
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.L) != null) {
            TextClassifier textClassifier = (TextClassifier) zVar.f12067c;
            if (textClassifier == null) {
                return q0.a((TextView) zVar.f12066b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public x5.d getTextMetricsParamsCompat() {
        return aj.g.D(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.B.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            c6.d.a(editorInfo, getText());
        }
        zb.k.E(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 && i2 < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        super.onLayout(z10, i2, i10, i11, i12);
        v0 v0Var = this.B;
        if (v0Var != null && !u3.f12029c) {
            v0Var.f12038i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i10) {
        Future future = this.f12070d0;
        if (future != null) {
            try {
                this.f12070d0 = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    aj.g.D(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i2, i10);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i10, int i11) {
        super.onTextChanged(charSequence, i2, i10, i11);
        v0 v0Var = this.B;
        if (v0Var != null) {
            e1 e1Var = v0Var.f12038i;
            if (!u3.f12029c && e1Var.f()) {
                e1Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i10, int i11, int i12) {
        if (u3.f12029c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i10, i11, i12);
            return;
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.h(i2, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (u3.f12029c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.i(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (u3.f12029c) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.j(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.o(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i2 != 0) {
            drawable = k7.w.p(context, i2);
        } else {
            drawable = null;
        }
        if (i10 != 0) {
            drawable2 = k7.w.p(context, i10);
        } else {
            drawable2 = null;
        }
        if (i11 != 0) {
            drawable3 = k7.w.p(context, i11);
        } else {
            drawable3 = null;
        }
        if (i12 != 0) {
            drawable4 = k7.w.p(context, i12);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i2 != 0) {
            drawable = k7.w.p(context, i2);
        } else {
            drawable = null;
        }
        if (i10 != 0) {
            drawable2 = k7.w.p(context, i10);
        } else {
            drawable2 = null;
        }
        if (i11 != 0) {
            drawable3 = k7.w.p(context, i11);
        } else {
            drawable3 = null;
        }
        if (i12 != 0) {
            drawable4 = k7.w.p(context, i12);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(aj.g.A0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i2);
        } else {
            aj.g.j0(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i2);
        } else {
            aj.g.k0(this, i2);
        }
    }

    public final void setLineHeight(int i2, float f8) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            getSuperCaller().f(i2, f8);
        } else if (i10 >= 34) {
            a6.g0.n(this, i2, f8);
        } else {
            aj.g.l0(this, Math.round(TypedValue.applyDimension(i2, f8, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(x5.e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        aj.g.D(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.B;
        v0Var.k(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.B;
        v0Var.l(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.L) != null) {
            zVar.f12067c = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<x5.e> future) {
        this.f12070d0 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(x5.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f14364b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        getPaint().set(dVar.f14363a);
        setBreakStrategy(dVar.f14365c);
        setHyphenationFrequency(dVar.f14366d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f8) {
        boolean z10 = u3.f12029c;
        if (z10) {
            super.setTextSize(i2, f8);
            return;
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            e1 e1Var = v0Var.f12038i;
            if (!z10 && !e1Var.f()) {
                e1Var.g(i2, f8);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typeface2;
        if (this.f12068b0) {
            return;
        }
        if (typeface != null && i2 > 0) {
            Context context = getContext();
            p7.j jVar = q5.e.f12290a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i2);
            } else {
                a0.j.h("Context cannot be null");
                return;
            }
        } else {
            typeface2 = null;
        }
        this.f12068b0 = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f12068b0 = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        aj.g.l0(this, i2);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    public z0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }
}
