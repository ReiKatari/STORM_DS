package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iv3  reason: default package */
/* loaded from: classes.dex */
public class iv3 {
    public int a = -1;
    public RecyclerView b;
    public gg5 c;
    public boolean d;
    public boolean e;
    public View f;
    public final qg5 g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, qg5] */
    public iv3(Context context) {
        ?? obj = new Object();
        obj.d = -1;
        obj.f = false;
        obj.g = 0;
        obj.a = 0;
        obj.b = 0;
        obj.c = Integer.MIN_VALUE;
        obj.e = null;
        this.g = obj;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                i.h("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                return 0;
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    public int b(View view, int i) {
        gg5 gg5Var = this.c;
        if (gg5Var != null && gg5Var.d()) {
            hg5 hg5Var = (hg5) view.getLayoutParams();
            return a((view.getLeft() - ((hg5) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) hg5Var).leftMargin, view.getRight() + ((hg5) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) hg5Var).rightMargin, gg5Var.D(), gg5Var.n - gg5Var.E(), i);
        }
        return 0;
    }

    public int c(View view, int i) {
        gg5 gg5Var = this.c;
        if (gg5Var != null && gg5Var.e()) {
            hg5 hg5Var = (hg5) view.getLayoutParams();
            return a((view.getTop() - ((hg5) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) hg5Var).topMargin, view.getBottom() + ((hg5) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) hg5Var).bottomMargin, gg5Var.F(), gg5Var.o - gg5Var.C(), i);
        }
        return 0;
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.m) {
            this.n = d(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }

    public PointF f(int i) {
        gg5 gg5Var = this.c;
        if (gg5Var instanceof rg5) {
            return ((rg5) gg5Var).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + rg5.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i2) {
        float f;
        PointF f2;
        RecyclerView recyclerView = this.b;
        int i3 = -1;
        if (this.a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f == null && this.c != null && (f2 = f(this.a)) != null) {
            float f3 = f2.x;
            if (f3 != RecyclerView.B1 || f2.y != RecyclerView.B1) {
                recyclerView.g0((int) Math.signum(f3), (int) Math.signum(f2.y), null);
            }
        }
        boolean z = false;
        this.d = false;
        View view = this.f;
        qg5 qg5Var = this.g;
        if (view != null) {
            this.b.getClass();
            wg5 N = RecyclerView.N(view);
            if (N != null) {
                i3 = N.b();
            }
            if (i3 == this.a) {
                View view2 = this.f;
                sg5 sg5Var = recyclerView.d1;
                h(view2, qg5Var);
                qg5Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            sg5 sg5Var2 = recyclerView.d1;
            if (this.b.m0.v() == 0) {
                i();
            } else {
                int i4 = this.o;
                int i5 = i4 - i;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                this.o = i5;
                int i6 = this.p;
                int i7 = i6 - i2;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.p = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF f4 = f(this.a);
                    if (f4 != null) {
                        if (f4.x != RecyclerView.B1 || f4.y != RecyclerView.B1) {
                            float f5 = f4.y;
                            float sqrt = (float) Math.sqrt((f5 * f5) + (f * f));
                            float f6 = f4.x / sqrt;
                            f4.x = f6;
                            float f7 = f4.y / sqrt;
                            f4.y = f7;
                            this.k = f4;
                            this.o = (int) (f6 * 10000.0f);
                            this.p = (int) (f7 * 10000.0f);
                            int e = e(10000);
                            qg5Var.a = (int) (this.o * 1.2f);
                            qg5Var.b = (int) (this.p * 1.2f);
                            qg5Var.c = (int) (e * 1.2f);
                            qg5Var.e = this.i;
                            qg5Var.f = true;
                        }
                    }
                    qg5Var.d = this.a;
                    i();
                }
            }
            if (qg5Var.d >= 0) {
                z = true;
            }
            qg5Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.a1.b();
            }
        }
    }

    public void h(View view, qg5 qg5Var) {
        int i;
        int i2;
        int i3;
        PointF pointF = this.k;
        int i4 = 0;
        if (pointF != null && pointF.x != RecyclerView.B1) {
            if (i3 > 0) {
                i = 1;
            } else {
                i = -1;
            }
        } else {
            i = 0;
        }
        int b = b(view, i);
        PointF pointF2 = this.k;
        if (pointF2 != null && pointF2.y != RecyclerView.B1) {
            i4 = i2 > 0 ? 1 : -1;
        }
        int c = c(view, i4);
        int ceil = (int) Math.ceil(e((int) Math.sqrt((c * c) + (b * b))) / 0.3356d);
        if (ceil > 0) {
            qg5Var.a = -b;
            qg5Var.b = -c;
            qg5Var.c = ceil;
            qg5Var.e = this.j;
            qg5Var.f = true;
        }
    }

    public final void i() {
        if (!this.e) {
            return;
        }
        this.e = false;
        this.p = 0;
        this.o = 0;
        this.k = null;
        this.b.d1.a = -1;
        this.f = null;
        this.a = -1;
        this.d = false;
        gg5 gg5Var = this.c;
        if (gg5Var.e == this) {
            gg5Var.e = null;
        }
        this.c = null;
        this.b = null;
    }
}
