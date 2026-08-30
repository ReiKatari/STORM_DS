package q;

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
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 extends Spinner {

    /* renamed from: f0  reason: collision with root package name */
    public static final int[] f11982f0 = {16843505};
    public final a4.k2 A;
    public final Context B;
    public final f0 L;
    public SpinnerAdapter R;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f11983b0;

    /* renamed from: c0  reason: collision with root package name */
    public final o0 f11984c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f11985d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Rect f11986e0;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p0(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130969773(0x7f0404ad, float:1.7548237E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f11986e0 = r1
            android.content.Context r1 = r12.getContext()
            q.b3.a(r12, r1)
            int[] r1 = k.a.f7931v
            p1.c1 r2 = p1.c1.o(r13, r14, r1, r0)
            java.lang.Object r3 = r2.B
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            a4.k2 r4 = new a4.k2
            r4.<init>(r12)
            r12.A = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            o.c r6 = new o.c
            r6.<init>(r13, r4)
            r12.B = r6
            goto L37
        L35:
            r12.B = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = q.p0.f11982f0     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r13 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r13 = move-exception
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
            q.l0 r4 = new q.l0
            android.content.Context r9 = r12.B
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.B
            p1.c1 r1 = p1.c1.o(r9, r14, r1, r0)
            java.lang.Object r9 = r1.B
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.f11985d0 = r9
            android.graphics.drawable.Drawable r9 = r1.h(r8)
            r4.g(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f11948w0 = r7
            r1.p()
            r12.f11984c0 = r4
            q.f0 r1 = new q.f0
            r1.<init>(r12, r12, r4)
            r12.L = r1
            goto Laa
        L9d:
            q.h0 r1 = new q.h0
            r1.<init>(r12)
            r12.f11984c0 = r1
            java.lang.String r4 = r3.getString(r7)
            r1.L = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131558550(0x7f0d0096, float:1.8742419E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.p()
            r12.f11983b0 = r8
            android.widget.SpinnerAdapter r13 = r12.R
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.R = r6
        Lcf:
            a4.k2 r13 = r12.A
            r13.k(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q.p0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i10 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i10 = Math.max(i10, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f11986e0;
            drawable.getPadding(rect);
            return rect.left + rect.right + i10;
        }
        return i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        o0 o0Var = this.f11984c0;
        if (o0Var != null) {
            return o0Var.a();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        o0 o0Var = this.f11984c0;
        if (o0Var != null) {
            return o0Var.l();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f11984c0 != null) {
            return this.f11985d0;
        }
        return super.getDropDownWidth();
    }

    public final o0 getInternalPopup() {
        return this.f11984c0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        o0 o0Var = this.f11984c0;
        if (o0Var != null) {
            return o0Var.d();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.B;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        o0 o0Var = this.f11984c0;
        if (o0Var != null) {
            return o0Var.m();
        }
        return super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o0 o0Var = this.f11984c0;
        if (o0Var != null && o0Var.b()) {
            o0Var.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i10) {
        super.onMeasure(i2, i10);
        if (this.f11984c0 != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        n0 n0Var = (n0) parcelable;
        super.onRestoreInstanceState(n0Var.getSuperState());
        if (n0Var.A && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new p.d(2, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, q.n0] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        o0 o0Var = this.f11984c0;
        if (o0Var != null && o0Var.b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        baseSavedState.A = z10;
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.L;
        if (f0Var != null && f0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        o0 o0Var = this.f11984c0;
        if (o0Var != null) {
            if (!o0Var.b()) {
                o0Var.k(getTextDirection(), getTextAlignment());
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [q.i0, android.widget.ListAdapter, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f11983b0) {
            this.R = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        o0 o0Var = this.f11984c0;
        if (o0Var != 0) {
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
                g0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            o0Var.p(obj);
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

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        o0 o0Var = this.f11984c0;
        if (o0Var != null) {
            o0Var.i(i2);
            o0Var.j(i2);
            return;
        }
        super.setDropDownHorizontalOffset(i2);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        o0 o0Var = this.f11984c0;
        if (o0Var != null) {
            o0Var.h(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f11984c0 != null) {
            this.f11985d0 = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        o0 o0Var = this.f11984c0;
        if (o0Var != null) {
            o0Var.g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(k7.w.p(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        o0 o0Var = this.f11984c0;
        if (o0Var != null) {
            o0Var.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
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
}
