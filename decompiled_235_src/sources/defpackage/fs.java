package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fs  reason: default package */
/* loaded from: classes.dex */
public final class fs extends Spinner {
    public static final int[] h0 = {16843505};
    public final z9 A;
    public final Context B;
    public final vr L;
    public SpinnerAdapter R;
    public final boolean d0;
    public final es e0;
    public int f0;
    public final Rect g0;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        TypedArray typedArray;
        this.g0 = new Rect();
        h57.a(this, getContext());
        int[] iArr = m75.v;
        m44 A = m44.A(context, attributeSet, iArr, R.attr.spinnerStyle);
        TypedArray typedArray2 = (TypedArray) A.L;
        this.A = new z9(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.B = new p41(context, resourceId);
        } else {
            this.B = context;
        }
        int i = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, h0, R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i = typedArray.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th) {
                th = th;
                typedArray3 = typedArray;
                if (typedArray3 != null) {
                    typedArray3.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i != 0) {
            if (i == 1) {
                cs csVar = new cs(this, this.B, attributeSet);
                m44 A2 = m44.A(this.B, attributeSet, iArr, R.attr.spinnerStyle);
                this.f0 = ((TypedArray) A2.L).getLayoutDimension(3, -2);
                csVar.h(A2.k(1));
                csVar.y0 = typedArray2.getString(2);
                A2.D();
                this.e0 = csVar;
                this.L = new vr(this, this, csVar);
            }
        } else {
            yr yrVar = new yr(this);
            this.e0 = yrVar;
            yrVar.L = typedArray2.getString(2);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
            arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        A.D();
        this.d0 = true;
        SpinnerAdapter spinnerAdapter = this.R;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.R = null;
        }
        this.A.k(attributeSet, R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.g0;
            drawable.getPadding(rect);
            return rect.left + rect.right + i2;
        }
        return i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        es esVar = this.e0;
        if (esVar != null) {
            return esVar.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        es esVar = this.e0;
        if (esVar != null) {
            return esVar.m();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.e0 != null) {
            return this.f0;
        }
        return super.getDropDownWidth();
    }

    public final es getInternalPopup() {
        return this.e0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        es esVar = this.e0;
        if (esVar != null) {
            return esVar.f();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.B;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        es esVar = this.e0;
        if (esVar != null) {
            return esVar.d();
        }
        return super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        es esVar = this.e0;
        if (esVar != null && esVar.a()) {
            esVar.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.e0 != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        ds dsVar = (ds) parcelable;
        super.onRestoreInstanceState(dsVar.getSuperState());
        if (dsVar.A && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new wr(this, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, ds] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        es esVar = this.e0;
        if (esVar != null && esVar.a()) {
            z = true;
        } else {
            z = false;
        }
        baseSavedState.A = z;
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vr vrVar = this.L;
        if (vrVar != null && vrVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        es esVar = this.e0;
        if (esVar != null) {
            if (!esVar.a()) {
                esVar.l(getTextDirection(), getTextAlignment());
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.widget.ListAdapter, zr, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.d0) {
            this.R = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        es esVar = this.e0;
        if (esVar != 0) {
            Context context = this.B;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.A = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.B = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                xr.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            esVar.n(obj);
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

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        es esVar = this.e0;
        if (esVar != null) {
            esVar.k(i);
            esVar.c(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        es esVar = this.e0;
        if (esVar != null) {
            esVar.i(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.e0 != null) {
            this.f0 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        es esVar = this.e0;
        if (esVar != null) {
            esVar.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(hf.S(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        es esVar = this.e0;
        if (esVar != null) {
            esVar.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
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
}
