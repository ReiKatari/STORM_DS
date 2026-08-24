package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ax3  reason: default package */
/* loaded from: classes.dex */
public class ax3 implements lh6 {
    public static final Method w0;
    public static final Method x0;
    public final Context A;
    public ListAdapter B;
    public mp1 L;
    public int Y;
    public int Z;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public y71 j0;
    public View k0;
    public AdapterView.OnItemClickListener l0;
    public AdapterView.OnItemSelectedListener m0;
    public final Handler r0;
    public Rect t0;
    public boolean u0;
    public final pr v0;
    public final int R = -2;
    public int X = -2;
    public final int d0 = 1002;
    public int h0 = 0;
    public final int i0 = Integer.MAX_VALUE;
    public final xw3 n0 = new xw3(this, 1);
    public final zw3 o0 = new zw3(this, 0);
    public final yw3 p0 = new yw3(this);
    public final xw3 q0 = new xw3(this, 0);
    public final Rect s0 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                w0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                x0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [pr, android.widget.PopupWindow] */
    public ax3(Context context, AttributeSet attributeSet, int i, int i2) {
        Drawable drawable;
        int resourceId;
        this.A = context;
        this.r0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m75.o, i, 0);
        this.Y = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.Z = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.e0 = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, m75.s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = hf.S(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.v0 = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // defpackage.lh6
    public final boolean a() {
        return this.v0.isShowing();
    }

    public final int b() {
        return this.Y;
    }

    public final void c(int i) {
        this.Y = i;
    }

    @Override // defpackage.lh6
    public final void dismiss() {
        pr prVar = this.v0;
        prVar.dismiss();
        prVar.setContentView(null);
        this.L = null;
        this.r0.removeCallbacks(this.n0);
    }

    @Override // defpackage.lh6
    public final void e() {
        int i;
        boolean z;
        int makeMeasureSpec;
        int i2;
        int i3;
        boolean z2;
        mp1 mp1Var;
        int i4;
        int i5;
        mp1 mp1Var2 = this.L;
        Context context = this.A;
        pr prVar = this.v0;
        if (mp1Var2 == null) {
            mp1 p = p(context, !this.u0);
            this.L = p;
            p.setAdapter(this.B);
            this.L.setOnItemClickListener(this.l0);
            this.L.setFocusable(true);
            this.L.setFocusableInTouchMode(true);
            this.L.setOnItemSelectedListener(new np1(this, 2));
            this.L.setOnScrollListener(this.p0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.m0;
            if (onItemSelectedListener != null) {
                this.L.setOnItemSelectedListener(onItemSelectedListener);
            }
            prVar.setContentView(this.L);
        } else {
            ViewGroup viewGroup = (ViewGroup) prVar.getContentView();
        }
        Drawable background = prVar.getBackground();
        Rect rect = this.s0;
        int i6 = 0;
        if (background != null) {
            background.getPadding(rect);
            int i7 = rect.top;
            i = rect.bottom + i7;
            if (!this.e0) {
                this.Z = -i7;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        if (prVar.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        int a = vw3.a(prVar, this.k0, this.Z, z);
        int i8 = this.R;
        if (i8 == -1) {
            i3 = a + i;
        } else {
            int i9 = this.X;
            if (i9 != -2) {
                if (i9 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a2 = this.L.a(makeMeasureSpec, a);
            if (a2 > 0) {
                i2 = this.L.getPaddingBottom() + this.L.getPaddingTop() + i;
            } else {
                i2 = 0;
            }
            i3 = a2 + i2;
        }
        if (prVar.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        prVar.setWindowLayoutType(this.d0);
        if (prVar.isShowing()) {
            if (this.k0.isAttachedToWindow()) {
                int i10 = this.X;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = this.k0.getWidth();
                }
                if (i8 == -1) {
                    if (z2) {
                        i8 = i3;
                    } else {
                        i8 = -1;
                    }
                    int i11 = this.X;
                    if (z2) {
                        if (i11 == -1) {
                            i5 = -1;
                        } else {
                            i5 = 0;
                        }
                        prVar.setWidth(i5);
                        prVar.setHeight(0);
                    } else {
                        if (i11 == -1) {
                            i6 = -1;
                        }
                        prVar.setWidth(i6);
                        prVar.setHeight(-1);
                    }
                } else if (i8 == -2) {
                    i8 = i3;
                }
                prVar.setOutsideTouchable(true);
                View view = this.k0;
                int i12 = this.Y;
                int i13 = this.Z;
                if (i10 < 0) {
                    i10 = -1;
                }
                if (i8 < 0) {
                    i4 = -1;
                } else {
                    i4 = i8;
                }
                prVar.update(view, i12, i13, i10, i4);
                return;
            }
            return;
        }
        int i14 = this.X;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.k0.getWidth();
        }
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = i3;
        }
        prVar.setWidth(i14);
        prVar.setHeight(i8);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = w0;
            if (method != null) {
                try {
                    method.invoke(prVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            ww3.b(prVar, true);
        }
        prVar.setOutsideTouchable(true);
        prVar.setTouchInterceptor(this.o0);
        if (this.g0) {
            prVar.setOverlapAnchor(this.f0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = x0;
            if (method2 != null) {
                try {
                    method2.invoke(prVar, this.t0);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            ww3.a(prVar, this.t0);
        }
        prVar.showAsDropDown(this.k0, this.Y, this.Z, this.h0);
        this.L.setSelection(-1);
        if ((!this.u0 || this.L.isInTouchMode()) && (mp1Var = this.L) != null) {
            mp1Var.setListSelectionHidden(true);
            mp1Var.requestLayout();
        }
        if (!this.u0) {
            this.r0.post(this.q0);
        }
    }

    public final Drawable f() {
        return this.v0.getBackground();
    }

    public final void h(Drawable drawable) {
        this.v0.setBackgroundDrawable(drawable);
    }

    public final void i(int i) {
        this.Z = i;
        this.e0 = true;
    }

    @Override // defpackage.lh6
    public final mp1 j() {
        return this.L;
    }

    public final int m() {
        if (!this.e0) {
            return 0;
        }
        return this.Z;
    }

    public void n(ListAdapter listAdapter) {
        y71 y71Var = this.j0;
        if (y71Var == null) {
            this.j0 = new y71(this, 1);
        } else {
            ListAdapter listAdapter2 = this.B;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(y71Var);
            }
        }
        this.B = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.j0);
        }
        mp1 mp1Var = this.L;
        if (mp1Var != null) {
            mp1Var.setAdapter(this.B);
        }
    }

    public mp1 p(Context context, boolean z) {
        return new mp1(context, z);
    }

    public final void q(int i) {
        Drawable background = this.v0.getBackground();
        if (background != null) {
            Rect rect = this.s0;
            background.getPadding(rect);
            this.X = rect.left + rect.right + i;
            return;
        }
        this.X = i;
    }
}
