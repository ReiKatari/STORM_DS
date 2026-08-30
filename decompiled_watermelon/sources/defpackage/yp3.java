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
import androidx.preference.Preference;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yp3  reason: default package */
/* loaded from: classes.dex */
public class yp3 implements y56 {
    public static final Method v0;
    public static final Method w0;
    public final Context A;
    public ListAdapter B;
    public fl1 L;
    public int Y;
    public int Z;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public o41 i0;
    public View j0;
    public AdapterView.OnItemClickListener k0;
    public AdapterView.OnItemSelectedListener l0;
    public final Handler q0;
    public Rect s0;
    public boolean t0;
    public final cr u0;
    public final int R = -2;
    public int X = -2;
    public final int c0 = 1002;
    public int g0 = 0;
    public final int h0 = Preference.DEFAULT_ORDER;
    public final vp3 m0 = new vp3(this, 1);
    public final xp3 n0 = new xp3(0, this);
    public final wp3 o0 = new wp3(this);
    public final vp3 p0 = new vp3(this, 0);
    public final Rect r0 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                v0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                w0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.widget.PopupWindow, cr] */
    public yp3(Context context, AttributeSet attributeSet, int i, int i2) {
        Drawable drawable;
        int resourceId;
        this.A = context;
        this.q0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, by4.o, i, 0);
        this.Y = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.Z = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.d0 = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, by4.s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = l07.M(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.u0 = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // defpackage.y56
    public final boolean a() {
        return this.u0.isShowing();
    }

    public final int b() {
        return this.Y;
    }

    @Override // defpackage.y56
    public final void c() {
        int i;
        boolean z;
        int makeMeasureSpec;
        int i2;
        int i3;
        boolean z2;
        fl1 fl1Var;
        int i4;
        int i5;
        fl1 fl1Var2 = this.L;
        Context context = this.A;
        cr crVar = this.u0;
        if (fl1Var2 == null) {
            fl1 o = o(context, !this.t0);
            this.L = o;
            o.setAdapter(this.B);
            this.L.setOnItemClickListener(this.k0);
            this.L.setFocusable(true);
            this.L.setFocusableInTouchMode(true);
            this.L.setOnItemSelectedListener(new gl1(2, this));
            this.L.setOnScrollListener(this.o0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.l0;
            if (onItemSelectedListener != null) {
                this.L.setOnItemSelectedListener(onItemSelectedListener);
            }
            crVar.setContentView(this.L);
        } else {
            ViewGroup viewGroup = (ViewGroup) crVar.getContentView();
        }
        Drawable background = crVar.getBackground();
        Rect rect = this.r0;
        int i6 = 0;
        if (background != null) {
            background.getPadding(rect);
            int i7 = rect.top;
            i = rect.bottom + i7;
            if (!this.d0) {
                this.Z = -i7;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        if (crVar.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        int a = tp3.a(crVar, this.j0, this.Z, z);
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
        if (crVar.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        crVar.setWindowLayoutType(this.c0);
        if (crVar.isShowing()) {
            if (this.j0.isAttachedToWindow()) {
                int i10 = this.X;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = this.j0.getWidth();
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
                        crVar.setWidth(i5);
                        crVar.setHeight(0);
                    } else {
                        if (i11 == -1) {
                            i6 = -1;
                        }
                        crVar.setWidth(i6);
                        crVar.setHeight(-1);
                    }
                } else if (i8 == -2) {
                    i8 = i3;
                }
                crVar.setOutsideTouchable(true);
                View view = this.j0;
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
                crVar.update(view, i12, i13, i10, i4);
                return;
            }
            return;
        }
        int i14 = this.X;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.j0.getWidth();
        }
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = i3;
        }
        crVar.setWidth(i14);
        crVar.setHeight(i8);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = v0;
            if (method != null) {
                try {
                    method.invoke(crVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            up3.b(crVar, true);
        }
        crVar.setOutsideTouchable(true);
        crVar.setTouchInterceptor(this.n0);
        if (this.f0) {
            crVar.setOverlapAnchor(this.e0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = w0;
            if (method2 != null) {
                try {
                    method2.invoke(crVar, this.s0);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            up3.a(crVar, this.s0);
        }
        crVar.showAsDropDown(this.j0, this.Y, this.Z, this.g0);
        this.L.setSelection(-1);
        if ((!this.t0 || this.L.isInTouchMode()) && (fl1Var = this.L) != null) {
            fl1Var.setListSelectionHidden(true);
            fl1Var.requestLayout();
        }
        if (!this.t0) {
            this.q0.post(this.p0);
        }
    }

    public final Drawable d() {
        return this.u0.getBackground();
    }

    @Override // defpackage.y56
    public final void dismiss() {
        cr crVar = this.u0;
        crVar.dismiss();
        crVar.setContentView(null);
        this.L = null;
        this.q0.removeCallbacks(this.m0);
    }

    public final void f(Drawable drawable) {
        this.u0.setBackgroundDrawable(drawable);
    }

    public final void g(int i) {
        this.Z = i;
        this.d0 = true;
    }

    @Override // defpackage.y56
    public final fl1 h() {
        return this.L;
    }

    public final void j(int i) {
        this.Y = i;
    }

    public final int l() {
        if (!this.d0) {
            return 0;
        }
        return this.Z;
    }

    public void n(ListAdapter listAdapter) {
        o41 o41Var = this.i0;
        if (o41Var == null) {
            this.i0 = new o41(1, this);
        } else {
            ListAdapter listAdapter2 = this.B;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(o41Var);
            }
        }
        this.B = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.i0);
        }
        fl1 fl1Var = this.L;
        if (fl1Var != null) {
            fl1Var.setAdapter(this.B);
        }
    }

    public fl1 o(Context context, boolean z) {
        return new fl1(context, z);
    }

    public final void p(int i) {
        Drawable background = this.u0.getBackground();
        if (background != null) {
            Rect rect = this.r0;
            background.getPadding(rect);
            this.X = rect.left + rect.right + i;
            return;
        }
        this.X = i;
    }
}
