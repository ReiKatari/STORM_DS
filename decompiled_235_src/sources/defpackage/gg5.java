package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gg5  reason: default package */
/* loaded from: classes.dex */
public abstract class gg5 {
    public dk0 a;
    public RecyclerView b;
    public final rr6 c;
    public final rr6 d;
    public iv3 e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public gg5() {
        eg5 eg5Var = new eg5(this, 0);
        eg5 eg5Var2 = new eg5(this, 1);
        this.c = new rr6(eg5Var);
        this.d = new rr6(eg5Var2);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((hg5) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int G(View view) {
        return ((hg5) view.getLayoutParams()).a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fg5, java.lang.Object] */
    public static fg5 H(Context context, AttributeSet attributeSet, int i, int i2) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j75.a, i, i2);
        obj.a = obtainStyledAttributes.getInt(0, 1);
        obj.b = obtainStyledAttributes.getInt(10, 1);
        obj.c = obtainStyledAttributes.getBoolean(9, false);
        obj.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        } else if (size < i) {
            return false;
        } else {
            return true;
        }
    }

    public static void N(View view, int i, int i2, int i3, int i4) {
        hg5 hg5Var = (hg5) view.getLayoutParams();
        Rect rect = hg5Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) hg5Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) hg5Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) hg5Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) hg5Var).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r6 == 1073741824) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(boolean z, int i, int i2, int i3, int i4) {
        int max = Math.max(0, i - i3);
        if (z) {
            if (i4 < 0) {
                if (i4 == -1) {
                    if (i2 != Integer.MIN_VALUE) {
                        if (i2 != 0) {
                        }
                    }
                    i4 = max;
                }
                i2 = 0;
                i4 = 0;
            }
            i2 = 1073741824;
        } else {
            if (i4 < 0) {
                if (i4 != -1) {
                    if (i4 == -2) {
                        if (i2 != Integer.MIN_VALUE && i2 != 1073741824) {
                            i4 = max;
                            i2 = 0;
                        } else {
                            i4 = max;
                            i2 = Integer.MIN_VALUE;
                        }
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i4 = max;
            }
            i2 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int z(View view) {
        Rect rect = ((hg5) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public abstract void A0(RecyclerView recyclerView, int i);

    public final int B() {
        wf5 wf5Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            wf5Var = recyclerView.getAdapter();
        } else {
            wf5Var = null;
        }
        if (wf5Var != null) {
            return wf5Var.a();
        }
        return 0;
    }

    public final void B0(iv3 iv3Var) {
        iv3 iv3Var2 = this.e;
        if (iv3Var2 != null && iv3Var != iv3Var2 && iv3Var2.e) {
            iv3Var2.i();
        }
        this.e = iv3Var;
        RecyclerView recyclerView = this.b;
        vg5 vg5Var = recyclerView.a1;
        vg5Var.Z.removeCallbacks(vg5Var);
        vg5Var.L.abortAnimation();
        if (iv3Var.h) {
            Log.w("RecyclerView", "An instance of " + iv3Var.getClass().getSimpleName() + " was started more than once. Each instance of" + iv3Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        iv3Var.b = recyclerView;
        iv3Var.c = this;
        int i = iv3Var.a;
        if (i != -1) {
            recyclerView.d1.a = i;
            iv3Var.e = true;
            iv3Var.d = true;
            iv3Var.f = recyclerView.m0.q(i);
            iv3Var.b.a1.b();
            iv3Var.h = true;
            return;
        }
        i.h("Invalid target position");
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public boolean C0() {
        return false;
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int I(mg5 mg5Var, sg5 sg5Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.l0 != null && e()) {
            return this.b.l0.a();
        }
        return 1;
    }

    public final void J(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((hg5) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.k0;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean K();

    public boolean L() {
        return false;
    }

    public void O(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int q = recyclerView.e0.q();
            for (int i2 = 0; i2 < q; i2++) {
                recyclerView.e0.p(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int q = recyclerView.e0.q();
            for (int i2 = 0; i2 < q; i2++) {
                recyclerView.e0.p(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, mg5 mg5Var, sg5 sg5Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        mg5 mg5Var = recyclerView.L;
        if (accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            wf5 wf5Var = this.b.l0;
            if (wf5Var != null) {
                accessibilityEvent.setItemCount(wf5Var.a());
            }
        }
    }

    public void V(mg5 mg5Var, sg5 sg5Var, v2 v2Var) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            v2Var.a(8192);
            v2Var.l(true);
            v2Var.h(67108864, true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            v2Var.a(4096);
            v2Var.l(true);
            v2Var.h(67108864, true);
        }
        v2Var.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(mg5Var, sg5Var), x(mg5Var, sg5Var), false, 0));
    }

    public void W(mg5 mg5Var, sg5 sg5Var, View view, v2 v2Var) {
        int i;
        int i2;
        if (e()) {
            i = G(view);
        } else {
            i = 0;
        }
        if (d()) {
            i2 = G(view);
        } else {
            i2 = 0;
        }
        v2Var.k(u2.b(false, i, 1, i2, 1));
    }

    public final void X(View view, v2 v2Var) {
        wg5 N = RecyclerView.N(view);
        if (N != null && !N.h()) {
            dk0 dk0Var = this.a;
            if (!((ArrayList) dk0Var.B).contains(N.a)) {
                RecyclerView recyclerView = this.b;
                W(recyclerView.L, recyclerView.d1, view, v2Var);
            }
        }
    }

    public final void b(View view, int i, boolean z) {
        int i2;
        wg5 N = RecyclerView.N(view);
        if (!z && !N.h()) {
            this.b.f0.m(N);
        } else {
            ci6 ci6Var = (ci6) this.b.f0.B;
            lo7 lo7Var = (lo7) ci6Var.get(N);
            if (lo7Var == null) {
                lo7Var = lo7.a();
                ci6Var.put(N, lo7Var);
            }
            lo7Var.a |= 1;
        }
        hg5 hg5Var = (hg5) view.getLayoutParams();
        if (!N.p() && !N.i()) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            dk0 dk0Var = this.a;
            int i3 = -1;
            if (parent == recyclerView) {
                kk kkVar = (kk) dk0Var.X;
                int indexOfChild = ((uf5) dk0Var.R).A.indexOfChild(view);
                if (indexOfChild == -1 || kkVar.d(indexOfChild)) {
                    i2 = -1;
                } else {
                    i2 = indexOfChild - kkVar.b(indexOfChild);
                }
                if (i == -1) {
                    i = this.a.q();
                }
                if (i2 != -1) {
                    if (i2 != i) {
                        gg5 gg5Var = this.b.m0;
                        View u = gg5Var.u(i2);
                        if (u != null) {
                            gg5Var.u(i2);
                            gg5Var.a.k(i2);
                            hg5 hg5Var2 = (hg5) u.getLayoutParams();
                            wg5 N2 = RecyclerView.N(u);
                            boolean h = N2.h();
                            RecyclerView recyclerView2 = gg5Var.b;
                            if (h) {
                                ci6 ci6Var2 = (ci6) recyclerView2.f0.B;
                                lo7 lo7Var2 = (lo7) ci6Var2.get(N2);
                                if (lo7Var2 == null) {
                                    lo7Var2 = lo7.a();
                                    ci6Var2.put(N2, lo7Var2);
                                }
                                lo7Var2.a = 1 | lo7Var2.a;
                            } else {
                                recyclerView2.f0.m(N2);
                            }
                            gg5Var.a.h(u, i, hg5Var2, N2.h());
                        } else {
                            RecyclerView recyclerView3 = gg5Var.b;
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + recyclerView3.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.C());
                }
            } else {
                dk0Var.g(view, i, false);
                hg5Var.c = true;
                iv3 iv3Var = this.e;
                if (iv3Var != null && iv3Var.e) {
                    iv3Var.b.getClass();
                    wg5 N3 = RecyclerView.N(view);
                    if (N3 != null) {
                        i3 = N3.b();
                    }
                    if (i3 == iv3Var.a) {
                        iv3Var.f = view;
                        if (RecyclerView.z1) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        } else {
            if (N.i()) {
                N.n.p(N);
            } else {
                N.j &= -33;
            }
            this.a.h(view, i, view.getLayoutParams(), false);
        }
        if (hg5Var.d) {
            if (RecyclerView.z1) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + hg5Var.a);
            }
            N.a.invalidate();
            hg5Var.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public abstract boolean d();

    public abstract void d0(mg5 mg5Var, sg5 sg5Var);

    public abstract boolean e();

    public abstract void e0(sg5 sg5Var);

    public boolean f(hg5 hg5Var) {
        if (hg5Var != null) {
            return true;
        }
        return false;
    }

    public Parcelable g0() {
        return null;
    }

    public boolean i0(int i, Bundle bundle) {
        int i2;
        int D;
        float f;
        mg5 mg5Var = this.b.L;
        int i3 = this.o;
        int i4 = this.n;
        Rect rect = new Rect();
        if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
            i3 = rect.height();
            i4 = rect.width();
        }
        if (i != 4096) {
            if (i != 8192) {
                i2 = 0;
                D = 0;
            } else {
                if (this.b.canScrollVertically(-1)) {
                    i2 = -((i3 - F()) - C());
                } else {
                    i2 = 0;
                }
                if (this.b.canScrollHorizontally(-1)) {
                    D = -((i4 - D()) - E());
                }
                D = 0;
            }
        } else {
            if (this.b.canScrollVertically(1)) {
                i2 = (i3 - F()) - C();
            } else {
                i2 = 0;
            }
            if (this.b.canScrollHorizontally(1)) {
                D = (i4 - D()) - E();
            }
            D = 0;
        }
        if (i2 != 0 || D != 0) {
            if (bundle != null) {
                f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f < RecyclerView.B1) {
                    if (RecyclerView.y1) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                    }
                }
            } else {
                f = 1.0f;
            }
            if (Float.compare(f, Float.POSITIVE_INFINITY) == 0) {
                RecyclerView recyclerView = this.b;
                wf5 wf5Var = recyclerView.l0;
                if (wf5Var != null) {
                    if (i != 4096) {
                        if (i != 8192) {
                            return true;
                        }
                        recyclerView.k0(0);
                        return true;
                    }
                    recyclerView.k0(wf5Var.a() - 1);
                    return true;
                }
            } else {
                if (Float.compare(1.0f, f) != 0 && Float.compare(RecyclerView.B1, f) != 0) {
                    D = (int) (D * f);
                    i2 = (int) (i2 * f);
                }
                this.b.j0(D, true, i2);
                return true;
            }
        }
        return false;
    }

    public abstract int j(sg5 sg5Var);

    public final void j0(mg5 mg5Var) {
        for (int v = v() - 1; v >= 0; v--) {
            if (!RecyclerView.N(u(v)).o()) {
                View u = u(v);
                m0(v);
                mg5Var.l(u);
            }
        }
    }

    public abstract int k(sg5 sg5Var);

    public final void k0(mg5 mg5Var) {
        ArrayList arrayList;
        int size = ((ArrayList) mg5Var.c).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) mg5Var.c;
            if (i < 0) {
                break;
            }
            View view = ((wg5) arrayList.get(i)).a;
            wg5 N = RecyclerView.N(view);
            if (!N.o()) {
                N.n(false);
                if (N.j()) {
                    this.b.removeDetachedView(view, false);
                }
                cg5 cg5Var = this.b.L0;
                if (cg5Var != null) {
                    cg5Var.d(N);
                }
                N.n(true);
                wg5 N2 = RecyclerView.N(view);
                N2.n = null;
                N2.o = false;
                N2.j &= -33;
                mg5Var.m(N2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) mg5Var.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int l(sg5 sg5Var);

    public final void l0(View view, mg5 mg5Var) {
        dk0 dk0Var = this.a;
        uf5 uf5Var = (uf5) dk0Var.R;
        int i = dk0Var.L;
        if (i != 1) {
            if (i != 2) {
                try {
                    dk0Var.L = 1;
                    dk0Var.Y = view;
                    int indexOfChild = uf5Var.A.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (((kk) dk0Var.X).h(indexOfChild)) {
                            dk0Var.z(view);
                        }
                        uf5Var.j(indexOfChild);
                    }
                    dk0Var.L = 0;
                    dk0Var.Y = null;
                    mg5Var.l(view);
                    return;
                } catch (Throwable th) {
                    dk0Var.L = 0;
                    dk0Var.Y = null;
                    throw th;
                }
            }
            i.m("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        i.m("Cannot call removeView(At) within removeView(At)");
    }

    public abstract int m(sg5 sg5Var);

    public final void m0(int i) {
        if (u(i) != null) {
            dk0 dk0Var = this.a;
            uf5 uf5Var = (uf5) dk0Var.R;
            int i2 = dk0Var.L;
            if (i2 != 1) {
                if (i2 != 2) {
                    try {
                        int r = dk0Var.r(i);
                        View childAt = uf5Var.A.getChildAt(r);
                        if (childAt == null) {
                            dk0Var.L = 0;
                            dk0Var.Y = null;
                            return;
                        }
                        dk0Var.L = 1;
                        dk0Var.Y = childAt;
                        if (((kk) dk0Var.X).h(r)) {
                            dk0Var.z(childAt);
                        }
                        uf5Var.j(r);
                        dk0Var.L = 0;
                        dk0Var.Y = null;
                        return;
                    } catch (Throwable th) {
                        dk0Var.L = 0;
                        dk0Var.Y = null;
                        throw th;
                    }
                }
                i.m("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            i.m("Cannot call removeView(At) within removeView(At)");
        }
    }

    public abstract int n(sg5 sg5Var);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
        if ((r5.bottom - r10) > r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int D = D();
        int F = F();
        int E = this.n - E();
        int C = this.o - C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - D;
        int min = Math.min(0, i);
        int i2 = top - F;
        int min2 = Math.min(0, i2);
        int i3 = width - E;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - C);
        if (this.b.getLayoutDirection() == 1) {
            if (max == 0) {
                max = Math.max(min, i3);
            }
        } else {
            if (min == 0) {
                min = Math.min(i, max);
            }
            max = min;
        }
        if (min2 == 0) {
            min2 = Math.min(i2, max2);
        }
        int[] iArr = {max, min2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int D2 = D();
                int F2 = F();
                int E2 = this.n - E();
                int C2 = this.o - C();
                Rect rect2 = this.b.i0;
                y(focusedChild, rect2);
                if (rect2.left - i4 < E2) {
                    if (rect2.right - i4 > D2) {
                        if (rect2.top - i5 < C2) {
                        }
                    }
                }
            }
            return false;
        }
        if (i4 != 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.j0(i4, false, i5);
            return true;
        }
        return false;
    }

    public abstract int o(sg5 sg5Var);

    public final void o0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void p(mg5 mg5Var) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            wg5 N = RecyclerView.N(u);
            if (N.o()) {
                if (RecyclerView.z1) {
                    Log.d("RecyclerView", "ignoring view " + N);
                }
            } else if (N.f() && !N.h() && !this.b.l0.b) {
                m0(v);
                mg5Var.m(N);
            } else {
                u(v);
                this.a.k(v);
                mg5Var.n(u);
                this.b.f0.m(N);
            }
        }
    }

    public abstract int p0(int i, mg5 mg5Var, sg5 sg5Var);

    public View q(int i) {
        int v = v();
        for (int i2 = 0; i2 < v; i2++) {
            View u = u(i2);
            wg5 N = RecyclerView.N(u);
            if (N != null && N.b() == i && !N.o() && (this.b.d1.g || !N.h())) {
                return u;
            }
        }
        return null;
    }

    public abstract void q0(int i);

    public abstract hg5 r();

    public abstract int r0(int i, mg5 mg5Var, sg5 sg5Var);

    public hg5 s(Context context, AttributeSet attributeSet) {
        return new hg5(context, attributeSet);
    }

    public final void s0(RecyclerView recyclerView) {
        t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public hg5 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof hg5) {
            return new hg5((hg5) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new hg5((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new hg5(layoutParams);
    }

    public final void t0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.C1) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 == 0 && !RecyclerView.C1) {
            this.o = 0;
        }
    }

    public final View u(int i) {
        dk0 dk0Var = this.a;
        if (dk0Var != null) {
            return dk0Var.p(i);
        }
        return null;
    }

    public void u0(Rect rect, int i, int i2) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = ao7.a;
        RecyclerView.g(this.b, g(i, E, recyclerView.getMinimumWidth()), g(i2, C, this.b.getMinimumHeight()));
    }

    public final int v() {
        dk0 dk0Var = this.a;
        if (dk0Var != null) {
            return dk0Var.q();
        }
        return 0;
    }

    public final void v0(int i, int i2) {
        int v = v();
        if (v == 0) {
            this.b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v; i7++) {
            View u = u(i7);
            Rect rect = this.b.i0;
            y(u, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.i0.set(i6, i4, i3, i5);
        u0(this.b.i0, i, i2);
    }

    public final void w0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.e0;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public int x(mg5 mg5Var, sg5 sg5Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.l0 != null && d()) {
            return this.b.l0.a();
        }
        return 1;
    }

    public final boolean x0(View view, int i, int i2, hg5 hg5Var) {
        if (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) hg5Var).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) hg5Var).height)) {
            return false;
        }
        return true;
    }

    public void y(View view, Rect rect) {
        boolean z = RecyclerView.y1;
        hg5 hg5Var = (hg5) view.getLayoutParams();
        Rect rect2 = hg5Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) hg5Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) hg5Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) hg5Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) hg5Var).bottomMargin);
    }

    public boolean y0() {
        return false;
    }

    public final boolean z0(View view, int i, int i2, hg5 hg5Var) {
        if (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) hg5Var).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) hg5Var).height)) {
            return false;
        }
        return true;
    }

    public void Q() {
    }

    public void Z() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public void f0(Parcelable parcelable) {
    }

    public void h0(int i) {
    }

    public void Y(int i, int i2) {
    }

    public void a0(int i, int i2) {
    }

    public void b0(int i, int i2) {
    }

    public void c0(int i, int i2) {
    }

    public void i(int i, ls0 ls0Var) {
    }

    public void h(int i, int i2, sg5 sg5Var, ls0 ls0Var) {
    }
}
