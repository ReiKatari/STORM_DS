package q;

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
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class d2 implements p.b0 {

    /* renamed from: u0  reason: collision with root package name */
    public static final Method f11863u0;

    /* renamed from: v0  reason: collision with root package name */
    public static final Method f11864v0;
    public final Context A;
    public ListAdapter B;
    public r1 L;
    public int Y;
    public int Z;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f11866c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f11867d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f11868e0;

    /* renamed from: h0  reason: collision with root package name */
    public g6.a f11871h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f11872i0;

    /* renamed from: j0  reason: collision with root package name */
    public AdapterView.OnItemClickListener f11873j0;

    /* renamed from: k0  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f11874k0;
    public final Handler p0;

    /* renamed from: r0  reason: collision with root package name */
    public Rect f11880r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f11881s0;

    /* renamed from: t0  reason: collision with root package name */
    public final y f11882t0;
    public final int R = -2;
    public int X = -2;

    /* renamed from: b0  reason: collision with root package name */
    public final int f11865b0 = 1002;

    /* renamed from: f0  reason: collision with root package name */
    public int f11869f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f11870g0 = Preference.DEFAULT_ORDER;

    /* renamed from: l0  reason: collision with root package name */
    public final a2 f11875l0 = new a2(this, 1);

    /* renamed from: m0  reason: collision with root package name */
    public final c2 f11876m0 = new c2(this);

    /* renamed from: n0  reason: collision with root package name */
    public final b2 f11877n0 = new b2(this);

    /* renamed from: o0  reason: collision with root package name */
    public final a2 f11878o0 = new a2(this, 0);

    /* renamed from: q0  reason: collision with root package name */
    public final Rect f11879q0 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f11863u0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f11864v0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.widget.PopupWindow, q.y] */
    public d2(Context context, AttributeSet attributeSet, int i2, int i10) {
        Drawable drawable;
        int resourceId;
        this.A = context;
        this.p0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f7924o, i2, 0);
        this.Y = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.Z = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f11866c0 = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i2, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, k.a.f7928s, i2, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = k7.w.p(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.f11882t0 = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final int a() {
        return this.Y;
    }

    @Override // p.b0
    public final boolean b() {
        return this.f11882t0.isShowing();
    }

    @Override // p.b0
    public final void c() {
        int i2;
        boolean z10;
        int makeMeasureSpec;
        int i10;
        int i11;
        boolean z11;
        r1 r1Var;
        int i12;
        int i13;
        r1 r1Var2 = this.L;
        Context context = this.A;
        y yVar = this.f11882t0;
        if (r1Var2 == null) {
            r1 q10 = q(context, !this.f11881s0);
            this.L = q10;
            q10.setAdapter(this.B);
            this.L.setOnItemClickListener(this.f11873j0);
            this.L.setFocusable(true);
            this.L.setFocusableInTouchMode(true);
            this.L.setOnItemSelectedListener(new x1(0, this));
            this.L.setOnScrollListener(this.f11877n0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f11874k0;
            if (onItemSelectedListener != null) {
                this.L.setOnItemSelectedListener(onItemSelectedListener);
            }
            yVar.setContentView(this.L);
        } else {
            ViewGroup viewGroup = (ViewGroup) yVar.getContentView();
        }
        Drawable background = yVar.getBackground();
        Rect rect = this.f11879q0;
        int i14 = 0;
        if (background != null) {
            background.getPadding(rect);
            int i15 = rect.top;
            i2 = rect.bottom + i15;
            if (!this.f11866c0) {
                this.Z = -i15;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        if (yVar.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        int a10 = y1.a(yVar, this.f11872i0, this.Z, z10);
        int i16 = this.R;
        if (i16 == -1) {
            i11 = a10 + i2;
        } else {
            int i17 = this.X;
            if (i17 != -2) {
                if (i17 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a11 = this.L.a(makeMeasureSpec, a10);
            if (a11 > 0) {
                i10 = this.L.getPaddingBottom() + this.L.getPaddingTop() + i2;
            } else {
                i10 = 0;
            }
            i11 = a11 + i10;
        }
        if (yVar.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        yVar.setWindowLayoutType(this.f11865b0);
        if (yVar.isShowing()) {
            if (this.f11872i0.isAttachedToWindow()) {
                int i18 = this.X;
                if (i18 == -1) {
                    i18 = -1;
                } else if (i18 == -2) {
                    i18 = this.f11872i0.getWidth();
                }
                if (i16 == -1) {
                    if (z11) {
                        i16 = i11;
                    } else {
                        i16 = -1;
                    }
                    int i19 = this.X;
                    if (z11) {
                        if (i19 == -1) {
                            i13 = -1;
                        } else {
                            i13 = 0;
                        }
                        yVar.setWidth(i13);
                        yVar.setHeight(0);
                    } else {
                        if (i19 == -1) {
                            i14 = -1;
                        }
                        yVar.setWidth(i14);
                        yVar.setHeight(-1);
                    }
                } else if (i16 == -2) {
                    i16 = i11;
                }
                yVar.setOutsideTouchable(true);
                int i20 = i18;
                View view = this.f11872i0;
                int i21 = this.Y;
                int i22 = this.Z;
                if (i20 < 0) {
                    i12 = -1;
                } else {
                    i12 = i20;
                }
                if (i16 < 0) {
                    i16 = -1;
                }
                yVar.update(view, i21, i22, i12, i16);
                return;
            }
            return;
        }
        int i23 = this.X;
        if (i23 == -1) {
            i23 = -1;
        } else if (i23 == -2) {
            i23 = this.f11872i0.getWidth();
        }
        if (i16 == -1) {
            i16 = -1;
        } else if (i16 == -2) {
            i16 = i11;
        }
        yVar.setWidth(i23);
        yVar.setHeight(i16);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f11863u0;
            if (method != null) {
                try {
                    method.invoke(yVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            z1.b(yVar, true);
        }
        yVar.setOutsideTouchable(true);
        yVar.setTouchInterceptor(this.f11876m0);
        if (this.f11868e0) {
            yVar.setOverlapAnchor(this.f11867d0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f11864v0;
            if (method2 != null) {
                try {
                    method2.invoke(yVar, this.f11880r0);
                } catch (Exception e6) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e6);
                }
            }
        } else {
            z1.a(yVar, this.f11880r0);
        }
        yVar.showAsDropDown(this.f11872i0, this.Y, this.Z, this.f11869f0);
        this.L.setSelection(-1);
        if ((!this.f11881s0 || this.L.isInTouchMode()) && (r1Var = this.L) != null) {
            r1Var.setListSelectionHidden(true);
            r1Var.requestLayout();
        }
        if (!this.f11881s0) {
            this.p0.post(this.f11878o0);
        }
    }

    public final Drawable d() {
        return this.f11882t0.getBackground();
    }

    @Override // p.b0
    public final void dismiss() {
        y yVar = this.f11882t0;
        yVar.dismiss();
        yVar.setContentView(null);
        this.L = null;
        this.p0.removeCallbacks(this.f11875l0);
    }

    @Override // p.b0
    public final r1 e() {
        return this.L;
    }

    public final void g(Drawable drawable) {
        this.f11882t0.setBackgroundDrawable(drawable);
    }

    public final void h(int i2) {
        this.Z = i2;
        this.f11866c0 = true;
    }

    public final void j(int i2) {
        this.Y = i2;
    }

    public final int l() {
        if (!this.f11866c0) {
            return 0;
        }
        return this.Z;
    }

    public void p(ListAdapter listAdapter) {
        g6.a aVar = this.f11871h0;
        if (aVar == null) {
            this.f11871h0 = new g6.a(1, this);
        } else {
            ListAdapter listAdapter2 = this.B;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(aVar);
            }
        }
        this.B = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f11871h0);
        }
        r1 r1Var = this.L;
        if (r1Var != null) {
            r1Var.setAdapter(this.B);
        }
    }

    public r1 q(Context context, boolean z10) {
        return new r1(context, z10);
    }

    public final void r(int i2) {
        Drawable background = this.f11882t0.getBackground();
        if (background != null) {
            Rect rect = this.f11879q0;
            background.getPadding(rect);
            this.X = rect.left + rect.right + i2;
            return;
        }
        this.X = i2;
    }
}
