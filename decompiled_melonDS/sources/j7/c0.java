package j7;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public int f7507a = -1;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f7508b;

    /* renamed from: c  reason: collision with root package name */
    public u0 f7509c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7510d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7511e;

    /* renamed from: f  reason: collision with root package name */
    public View f7512f;

    /* renamed from: g  reason: collision with root package name */
    public final d1 f7513g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7514h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f7515i;

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f7516j;

    /* renamed from: k  reason: collision with root package name */
    public PointF f7517k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f7518l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public float f7519n;

    /* renamed from: o  reason: collision with root package name */
    public int f7520o;

    /* renamed from: p  reason: collision with root package name */
    public int f7521p;

    /* JADX WARN: Type inference failed for: r1v0, types: [j7.d1, java.lang.Object] */
    public c0(Context context) {
        ?? obj = new Object();
        obj.f7531d = -1;
        obj.f7533f = false;
        obj.f7534g = 0;
        obj.f7528a = 0;
        obj.f7529b = 0;
        obj.f7530c = Integer.MIN_VALUE;
        obj.f7532e = null;
        this.f7513g = obj;
        this.f7515i = new LinearInterpolator();
        this.f7516j = new DecelerateInterpolator();
        this.m = false;
        this.f7520o = 0;
        this.f7521p = 0;
        this.f7518l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i2, int i10, int i11, int i12, int i13) {
        if (i13 != -1) {
            if (i13 != 0) {
                if (i13 == 1) {
                    return i12 - i10;
                }
                a0.j.h("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                return 0;
            }
            int i14 = i11 - i2;
            if (i14 > 0) {
                return i14;
            }
            int i15 = i12 - i10;
            if (i15 < 0) {
                return i15;
            }
            return 0;
        }
        return i11 - i2;
    }

    public int b(View view, int i2) {
        u0 u0Var = this.f7509c;
        if (u0Var != null && u0Var.d()) {
            v0 v0Var = (v0) view.getLayoutParams();
            return a((view.getLeft() - ((v0) view.getLayoutParams()).f7723b.left) - ((ViewGroup.MarginLayoutParams) v0Var).leftMargin, view.getRight() + ((v0) view.getLayoutParams()).f7723b.right + ((ViewGroup.MarginLayoutParams) v0Var).rightMargin, u0Var.D(), u0Var.f7720n - u0Var.E(), i2);
        }
        return 0;
    }

    public int c(View view, int i2) {
        u0 u0Var = this.f7509c;
        if (u0Var != null && u0Var.e()) {
            v0 v0Var = (v0) view.getLayoutParams();
            return a((view.getTop() - ((v0) view.getLayoutParams()).f7723b.top) - ((ViewGroup.MarginLayoutParams) v0Var).topMargin, view.getBottom() + ((v0) view.getLayoutParams()).f7723b.bottom + ((ViewGroup.MarginLayoutParams) v0Var).bottomMargin, u0Var.F(), u0Var.f7721o - u0Var.C(), i2);
        }
        return 0;
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i2) {
        float abs = Math.abs(i2);
        if (!this.m) {
            this.f7519n = d(this.f7518l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.f7519n);
    }

    public PointF f(int i2) {
        u0 u0Var = this.f7509c;
        if (u0Var instanceof e1) {
            return ((e1) u0Var).a(i2);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + e1.class.getCanonicalName());
        return null;
    }

    public final void g(int i2, int i10) {
        float f8;
        PointF f10;
        RecyclerView recyclerView = this.f7508b;
        int i11 = -1;
        if (this.f7507a == -1 || recyclerView == null) {
            i();
        }
        if (this.f7510d && this.f7512f == null && this.f7509c != null && (f10 = f(this.f7507a)) != null) {
            float f11 = f10.x;
            if (f11 != 0.0f || f10.y != 0.0f) {
                recyclerView.g0((int) Math.signum(f11), (int) Math.signum(f10.y), null);
            }
        }
        boolean z10 = false;
        this.f7510d = false;
        View view = this.f7512f;
        d1 d1Var = this.f7513g;
        if (view != null) {
            this.f7508b.getClass();
            j1 M = RecyclerView.M(view);
            if (M != null) {
                i11 = M.b();
            }
            if (i11 == this.f7507a) {
                View view2 = this.f7512f;
                f1 f1Var = recyclerView.f1621a1;
                h(view2, d1Var);
                d1Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f7512f = null;
            }
        }
        if (this.f7511e) {
            f1 f1Var2 = recyclerView.f1621a1;
            if (this.f7508b.f1640k0.v() == 0) {
                i();
            } else {
                int i12 = this.f7520o;
                int i13 = i12 - i2;
                if (i12 * i13 <= 0) {
                    i13 = 0;
                }
                this.f7520o = i13;
                int i14 = this.f7521p;
                int i15 = i14 - i10;
                if (i14 * i15 <= 0) {
                    i15 = 0;
                }
                this.f7521p = i15;
                if (i13 == 0 && i15 == 0) {
                    PointF f12 = f(this.f7507a);
                    if (f12 != null) {
                        if (f12.x != 0.0f || f12.y != 0.0f) {
                            float f13 = f12.y;
                            float sqrt = (float) Math.sqrt((f13 * f13) + (f8 * f8));
                            float f14 = f12.x / sqrt;
                            f12.x = f14;
                            float f15 = f12.y / sqrt;
                            f12.y = f15;
                            this.f7517k = f12;
                            this.f7520o = (int) (f14 * 10000.0f);
                            this.f7521p = (int) (f15 * 10000.0f);
                            int e6 = e(10000);
                            d1Var.f7528a = (int) (this.f7520o * 1.2f);
                            d1Var.f7529b = (int) (this.f7521p * 1.2f);
                            d1Var.f7530c = (int) (e6 * 1.2f);
                            d1Var.f7532e = this.f7515i;
                            d1Var.f7533f = true;
                        }
                    }
                    d1Var.f7531d = this.f7507a;
                    i();
                }
            }
            if (d1Var.f7531d >= 0) {
                z10 = true;
            }
            d1Var.a(recyclerView);
            if (z10 && this.f7511e) {
                this.f7510d = true;
                recyclerView.X0.b();
            }
        }
    }

    public void h(View view, d1 d1Var) {
        int i2;
        int i10;
        int i11;
        PointF pointF = this.f7517k;
        int i12 = 0;
        if (pointF != null && pointF.x != 0.0f) {
            if (i11 > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
        } else {
            i2 = 0;
        }
        int b10 = b(view, i2);
        PointF pointF2 = this.f7517k;
        if (pointF2 != null && pointF2.y != 0.0f) {
            i12 = i10 > 0 ? 1 : -1;
        }
        int c4 = c(view, i12);
        int ceil = (int) Math.ceil(e((int) Math.sqrt((c4 * c4) + (b10 * b10))) / 0.3356d);
        if (ceil > 0) {
            d1Var.f7528a = -b10;
            d1Var.f7529b = -c4;
            d1Var.f7530c = ceil;
            d1Var.f7532e = this.f7516j;
            d1Var.f7533f = true;
        }
    }

    public final void i() {
        if (!this.f7511e) {
            return;
        }
        this.f7511e = false;
        this.f7521p = 0;
        this.f7520o = 0;
        this.f7517k = null;
        this.f7508b.f1621a1.f7550a = -1;
        this.f7512f = null;
        this.f7507a = -1;
        this.f7510d = false;
        u0 u0Var = this.f7509c;
        if (u0Var.f7712e == this) {
            u0Var.f7712e = null;
        }
        this.f7509c = null;
        this.f7508b = null;
    }
}
