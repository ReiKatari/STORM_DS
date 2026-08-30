package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sr  reason: default package */
/* loaded from: classes.dex */
public final class sr extends Spinner {
    public static final int[] g0 = {16843505};
    public final y9 A;
    public final Context B;
    public final ir L;
    public SpinnerAdapter R;
    public final boolean c0;
    public final rr d0;
    public int e0;
    public final Rect f0;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sr(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130969773(0x7f0404ad, float:1.7548237E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f0 = r1
            android.content.Context r1 = r12.getContext()
            defpackage.qs6.a(r12, r1)
            int[] r1 = defpackage.by4.v
            n85 r2 = defpackage.n85.q(r13, r14, r1, r0)
            java.lang.Object r3 = r2.L
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            y9 r4 = new y9
            r4.<init>(r12)
            r12.A = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            h11 r6 = new h11
            r6.<init>(r13, r4)
            r12.B = r6
            goto L37
        L35:
            r12.B = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = defpackage.sr.g0     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r12 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r12 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            pr r4 = new pr
            android.content.Context r9 = r12.B
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.B
            n85 r1 = defpackage.n85.q(r9, r14, r1, r0)
            java.lang.Object r9 = r1.L
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.e0 = r9
            android.graphics.drawable.Drawable r9 = r1.f(r8)
            r4.f(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.x0 = r7
            r1.t()
            r12.d0 = r4
            ir r1 = new ir
            r1.<init>(r12, r12, r4)
            r12.L = r1
            goto Laa
        L9d:
            lr r1 = new lr
            r1.<init>(r12)
            r12.d0 = r1
            java.lang.String r4 = r3.getString(r7)
            r1.L = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131624093(0x7f0e009d, float:1.8875356E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.t()
            r12.c0 = r8
            android.widget.SpinnerAdapter r13 = r12.R
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.R = r6
        Lcf:
            y9 r12 = r12.A
            r12.k(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr.<init>(android.content.Context, android.util.AttributeSet):void");
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
            Rect rect = this.f0;
            drawable.getPadding(rect);
            return rect.left + rect.right + i2;
        }
        return i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        rr rrVar = this.d0;
        if (rrVar != null) {
            return rrVar.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        rr rrVar = this.d0;
        if (rrVar != null) {
            return rrVar.l();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.d0 != null) {
            return this.e0;
        }
        return super.getDropDownWidth();
    }

    public final rr getInternalPopup() {
        return this.d0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        rr rrVar = this.d0;
        if (rrVar != null) {
            return rrVar.d();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.B;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        rr rrVar = this.d0;
        if (rrVar != null) {
            return rrVar.m();
        }
        return super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rr rrVar = this.d0;
        if (rrVar != null && rrVar.a()) {
            rrVar.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.d0 != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        qr qrVar = (qr) parcelable;
        super.onRestoreInstanceState(qrVar.getSuperState());
        if (qrVar.A && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new jr(0, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, qr, android.os.Parcelable] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        rr rrVar = this.d0;
        if (rrVar != null && rrVar.a()) {
            z = true;
        } else {
            z = false;
        }
        baseSavedState.A = z;
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ir irVar = this.L;
        if (irVar != null && irVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        rr rrVar = this.d0;
        if (rrVar != null) {
            if (!rrVar.a()) {
                rrVar.k(getTextDirection(), getTextAlignment());
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [mr, android.widget.ListAdapter, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.c0) {
            this.R = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        rr rrVar = this.d0;
        if (rrVar != 0) {
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
                kr.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            rrVar.n(obj);
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

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        rr rrVar = this.d0;
        if (rrVar != null) {
            rrVar.i(i);
            rrVar.j(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        rr rrVar = this.d0;
        if (rrVar != null) {
            rrVar.g(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.d0 != null) {
            this.e0 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        rr rrVar = this.d0;
        if (rrVar != null) {
            rrVar.f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(l07.M(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        rr rrVar = this.d0;
        if (rrVar != null) {
            rrVar.e(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
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
}
