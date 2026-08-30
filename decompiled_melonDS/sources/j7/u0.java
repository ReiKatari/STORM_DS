package j7;

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
import c1.h2;
import h1.c3;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a  reason: collision with root package name */
    public d5.j f7708a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f7709b;

    /* renamed from: c  reason: collision with root package name */
    public final a0.g f7710c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.g f7711d;

    /* renamed from: e  reason: collision with root package name */
    public c0 f7712e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7713f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7714g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7715h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f7716i;

    /* renamed from: j  reason: collision with root package name */
    public int f7717j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7718k;

    /* renamed from: l  reason: collision with root package name */
    public int f7719l;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public int f7720n;

    /* renamed from: o  reason: collision with root package name */
    public int f7721o;

    public u0() {
        s0 s0Var = new s0(this, 0);
        s0 s0Var2 = new s0(this, 1);
        this.f7710c = new a0.g(s0Var);
        this.f7711d = new a0.g(s0Var2);
        this.f7713f = false;
        this.f7714g = false;
        this.f7715h = true;
        this.f7716i = true;
    }

    public static int A(View view) {
        Rect rect = ((v0) view.getLayoutParams()).f7723b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int G(View view) {
        return ((v0) view.getLayoutParams()).f7722a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j7.t0, java.lang.Object] */
    public static t0 H(Context context, AttributeSet attributeSet, int i2, int i10) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i7.a.f7026a, i2, i10);
        obj.f7699a = obtainStyledAttributes.getInt(0, 1);
        obj.f7700b = obtainStyledAttributes.getInt(10, 1);
        obj.f7701c = obtainStyledAttributes.getBoolean(9, false);
        obj.f7702d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean M(int i2, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i2 != i11) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i2) {
                return false;
            }
            return true;
        } else if (size < i2) {
            return false;
        } else {
            return true;
        }
    }

    public static void N(View view, int i2, int i10, int i11, int i12) {
        v0 v0Var = (v0) view.getLayoutParams();
        Rect rect = v0Var.f7723b;
        view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) v0Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) v0Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) v0Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) v0Var).bottomMargin);
    }

    public static int g(int i2, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i10, i11);
            }
            return size;
        }
        return Math.min(size, Math.max(i10, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r6 == 1073741824) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.u0.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((v0) view.getLayoutParams()).f7723b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public abstract void A0(RecyclerView recyclerView, int i2);

    public final int B() {
        k0 k0Var;
        RecyclerView recyclerView = this.f7709b;
        if (recyclerView != null) {
            k0Var = recyclerView.getAdapter();
        } else {
            k0Var = null;
        }
        if (k0Var != null) {
            return k0Var.a();
        }
        return 0;
    }

    public final void B0(c0 c0Var) {
        c0 c0Var2 = this.f7712e;
        if (c0Var2 != null && c0Var != c0Var2 && c0Var2.f7511e) {
            c0Var2.i();
        }
        this.f7712e = c0Var;
        RecyclerView recyclerView = this.f7709b;
        i1 i1Var = recyclerView.X0;
        i1Var.Z.removeCallbacks(i1Var);
        i1Var.L.abortAnimation();
        if (c0Var.f7514h) {
            Log.w("RecyclerView", "An instance of " + c0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + c0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0Var.f7508b = recyclerView;
        c0Var.f7509c = this;
        int i2 = c0Var.f7507a;
        if (i2 != -1) {
            recyclerView.f1621a1.f7550a = i2;
            c0Var.f7511e = true;
            c0Var.f7510d = true;
            c0Var.f7512f = recyclerView.f1640k0.q(i2);
            c0Var.f7508b.X0.b();
            c0Var.f7514h = true;
            return;
        }
        a0.j.h("Invalid target position");
    }

    public final int C() {
        RecyclerView recyclerView = this.f7709b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public boolean C0() {
        return false;
    }

    public final int D() {
        RecyclerView recyclerView = this.f7709b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f7709b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f7709b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int I(h2 h2Var, f1 f1Var) {
        RecyclerView recyclerView = this.f7709b;
        if (recyclerView != null && recyclerView.f1638j0 != null && e()) {
            return this.f7709b.f1638j0.a();
        }
        return 1;
    }

    public final void J(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((v0) view.getLayoutParams()).f7723b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f7709b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f7709b.f1636i0;
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

    public void O(int i2) {
        RecyclerView recyclerView = this.f7709b;
        if (recyclerView != null) {
            int i10 = recyclerView.f1624c0.i();
            for (int i11 = 0; i11 < i10; i11++) {
                recyclerView.f1624c0.h(i11).offsetLeftAndRight(i2);
            }
        }
    }

    public void P(int i2) {
        RecyclerView recyclerView = this.f7709b;
        if (recyclerView != null) {
            int i10 = recyclerView.f1624c0.i();
            for (int i11 = 0; i11 < i10; i11++) {
                recyclerView.f1624c0.h(i11).offsetTopAndBottom(i2);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i2, h2 h2Var, f1 f1Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f7709b;
        h2 h2Var = recyclerView.L;
        if (accessibilityEvent != null) {
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f7709b.canScrollVertically(-1) && !this.f7709b.canScrollHorizontally(-1) && !this.f7709b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            k0 k0Var = this.f7709b.f1638j0;
            if (k0Var != null) {
                accessibilityEvent.setItemCount(k0Var.a());
            }
        }
    }

    public void V(h2 h2Var, f1 f1Var, b6.g gVar) {
        if (this.f7709b.canScrollVertically(-1) || this.f7709b.canScrollHorizontally(-1)) {
            gVar.a(8192);
            gVar.l(true);
            gVar.h(67108864, true);
        }
        if (this.f7709b.canScrollVertically(1) || this.f7709b.canScrollHorizontally(1)) {
            gVar.a(4096);
            gVar.l(true);
            gVar.h(67108864, true);
        }
        gVar.f2077a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(h2Var, f1Var), x(h2Var, f1Var), false, 0));
    }

    public final void W(View view, b6.g gVar) {
        j1 M = RecyclerView.M(view);
        if (M != null && !M.h()) {
            d5.j jVar = this.f7708a;
            if (!((ArrayList) jVar.f3863e).contains(M.f7594a)) {
                RecyclerView recyclerView = this.f7709b;
                X(recyclerView.L, recyclerView.f1621a1, view, gVar);
            }
        }
    }

    public void X(h2 h2Var, f1 f1Var, View view, b6.g gVar) {
        int i2;
        int i10;
        if (e()) {
            i2 = G(view);
        } else {
            i2 = 0;
        }
        if (d()) {
            i10 = G(view);
        } else {
            i10 = 0;
        }
        gVar.k(b6.f.a(false, i2, 1, i10, 1));
    }

    public final void b(View view, int i2, boolean z10) {
        int i10;
        j1 M = RecyclerView.M(view);
        if (!z10 && !M.h()) {
            this.f7709b.f1626d0.c(M);
        } else {
            a1.w0 w0Var = (a1.w0) this.f7709b.f1626d0.f15044a;
            s1 s1Var = (s1) w0Var.get(M);
            if (s1Var == null) {
                s1Var = s1.a();
                w0Var.put(M, s1Var);
            }
            s1Var.f7671a |= 1;
        }
        v0 v0Var = (v0) view.getLayoutParams();
        if (!M.p() && !M.i()) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f7709b;
            d5.j jVar = this.f7708a;
            int i11 = -1;
            if (parent == recyclerView) {
                c3 c3Var = (c3) jVar.f3862d;
                int indexOfChild = ((i0) jVar.f3861c).A.indexOfChild(view);
                if (indexOfChild == -1 || c3Var.e(indexOfChild)) {
                    i10 = -1;
                } else {
                    i10 = indexOfChild - c3Var.c(indexOfChild);
                }
                if (i2 == -1) {
                    i2 = this.f7708a.i();
                }
                if (i10 != -1) {
                    if (i10 != i2) {
                        u0 u0Var = this.f7709b.f1640k0;
                        View u4 = u0Var.u(i10);
                        if (u4 != null) {
                            u0Var.u(i10);
                            u0Var.f7708a.d(i10);
                            v0 v0Var2 = (v0) u4.getLayoutParams();
                            j1 M2 = RecyclerView.M(u4);
                            boolean h2 = M2.h();
                            RecyclerView recyclerView2 = u0Var.f7709b;
                            if (h2) {
                                a1.w0 w0Var2 = (a1.w0) recyclerView2.f1626d0.f15044a;
                                s1 s1Var2 = (s1) w0Var2.get(M2);
                                if (s1Var2 == null) {
                                    s1Var2 = s1.a();
                                    w0Var2.put(M2, s1Var2);
                                }
                                s1Var2.f7671a = 1 | s1Var2.f7671a;
                            } else {
                                recyclerView2.f1626d0.c(M2);
                            }
                            u0Var.f7708a.c(u4, i2, v0Var2, M2.h());
                        } else {
                            RecyclerView recyclerView3 = u0Var.f7709b;
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + recyclerView3.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f7709b.indexOfChild(view) + this.f7709b.B());
                }
            } else {
                jVar.b(view, i2, false);
                v0Var.f7724c = true;
                c0 c0Var = this.f7712e;
                if (c0Var != null && c0Var.f7511e) {
                    c0Var.f7508b.getClass();
                    j1 M3 = RecyclerView.M(view);
                    if (M3 != null) {
                        i11 = M3.b();
                    }
                    if (i11 == c0Var.f7507a) {
                        c0Var.f7512f = view;
                        if (RecyclerView.f1617w1) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        } else {
            if (M.i()) {
                M.f7606n.p(M);
            } else {
                M.f7603j &= -33;
            }
            this.f7708a.c(view, i2, view.getLayoutParams(), false);
        }
        if (v0Var.f7725d) {
            if (RecyclerView.f1617w1) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + v0Var.f7722a);
            }
            M.f7594a.invalidate();
            v0Var.f7725d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f7709b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public abstract boolean d();

    public abstract void d0(h2 h2Var, f1 f1Var);

    public abstract boolean e();

    public abstract void e0(f1 f1Var);

    public boolean f(v0 v0Var) {
        if (v0Var != null) {
            return true;
        }
        return false;
    }

    public Parcelable g0() {
        return null;
    }

    public boolean i0(int i2, Bundle bundle) {
        int i10;
        int D;
        float f8;
        h2 h2Var = this.f7709b.L;
        int i11 = this.f7721o;
        int i12 = this.f7720n;
        Rect rect = new Rect();
        if (this.f7709b.getMatrix().isIdentity() && this.f7709b.getGlobalVisibleRect(rect)) {
            i11 = rect.height();
            i12 = rect.width();
        }
        if (i2 != 4096) {
            if (i2 != 8192) {
                i10 = 0;
                D = 0;
            } else {
                if (this.f7709b.canScrollVertically(-1)) {
                    i10 = -((i11 - F()) - C());
                } else {
                    i10 = 0;
                }
                if (this.f7709b.canScrollHorizontally(-1)) {
                    D = -((i12 - D()) - E());
                }
                D = 0;
            }
        } else {
            if (this.f7709b.canScrollVertically(1)) {
                i10 = (i11 - F()) - C();
            } else {
                i10 = 0;
            }
            if (this.f7709b.canScrollHorizontally(1)) {
                D = (i12 - D()) - E();
            }
            D = 0;
        }
        if (i10 != 0 || D != 0) {
            if (bundle != null) {
                f8 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f8 < 0.0f) {
                    if (RecyclerView.f1616v1) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f8 + ")");
                    }
                }
            } else {
                f8 = 1.0f;
            }
            if (Float.compare(f8, Float.POSITIVE_INFINITY) == 0) {
                RecyclerView recyclerView = this.f7709b;
                k0 k0Var = recyclerView.f1638j0;
                if (k0Var != null) {
                    if (i2 != 4096) {
                        if (i2 != 8192) {
                            return true;
                        }
                        recyclerView.k0(0);
                        return true;
                    }
                    recyclerView.k0(k0Var.a() - 1);
                    return true;
                }
            } else {
                if (Float.compare(1.0f, f8) != 0 && Float.compare(0.0f, f8) != 0) {
                    D = (int) (D * f8);
                    i10 = (int) (i10 * f8);
                }
                this.f7709b.j0(D, true, i10);
                return true;
            }
        }
        return false;
    }

    public abstract int j(f1 f1Var);

    public final void j0(h2 h2Var) {
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            if (!RecyclerView.M(u(v10)).o()) {
                View u4 = u(v10);
                m0(v10);
                h2Var.l(u4);
            }
        }
    }

    public abstract int k(f1 f1Var);

    public final void k0(h2 h2Var) {
        ArrayList arrayList;
        int size = ((ArrayList) h2Var.f2431c).size();
        int i2 = size - 1;
        while (true) {
            arrayList = (ArrayList) h2Var.f2431c;
            if (i2 < 0) {
                break;
            }
            View view = ((j1) arrayList.get(i2)).f7594a;
            j1 M = RecyclerView.M(view);
            if (!M.o()) {
                M.n(false);
                if (M.j()) {
                    this.f7709b.removeDetachedView(view, false);
                }
                q0 q0Var = this.f7709b.I0;
                if (q0Var != null) {
                    q0Var.d(M);
                }
                M.n(true);
                j1 M2 = RecyclerView.M(view);
                M2.f7606n = null;
                M2.f7607o = false;
                M2.f7603j &= -33;
                h2Var.m(M2);
            }
            i2--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) h2Var.f2432d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f7709b.invalidate();
        }
    }

    public abstract int l(f1 f1Var);

    public final void l0(View view, h2 h2Var) {
        d5.j jVar = this.f7708a;
        i0 i0Var = (i0) jVar.f3861c;
        int i2 = jVar.f3860b;
        if (i2 != 1) {
            if (i2 != 2) {
                try {
                    jVar.f3860b = 1;
                    jVar.f3864f = view;
                    int indexOfChild = i0Var.A.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (((c3) jVar.f3862d).h(indexOfChild)) {
                            jVar.s(view);
                        }
                        i0Var.h(indexOfChild);
                    }
                    jVar.f3860b = 0;
                    jVar.f3864f = null;
                    h2Var.l(view);
                    return;
                } catch (Throwable th2) {
                    jVar.f3860b = 0;
                    jVar.f3864f = null;
                    throw th2;
                }
            }
            a0.j.p("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        a0.j.p("Cannot call removeView(At) within removeView(At)");
    }

    public abstract int m(f1 f1Var);

    public final void m0(int i2) {
        if (u(i2) != null) {
            d5.j jVar = this.f7708a;
            i0 i0Var = (i0) jVar.f3861c;
            int i10 = jVar.f3860b;
            if (i10 != 1) {
                if (i10 != 2) {
                    try {
                        int l10 = jVar.l(i2);
                        View childAt = i0Var.A.getChildAt(l10);
                        if (childAt == null) {
                            jVar.f3860b = 0;
                            jVar.f3864f = null;
                            return;
                        }
                        jVar.f3860b = 1;
                        jVar.f3864f = childAt;
                        if (((c3) jVar.f3862d).h(l10)) {
                            jVar.s(childAt);
                        }
                        i0Var.h(l10);
                        jVar.f3860b = 0;
                        jVar.f3864f = null;
                        return;
                    } catch (Throwable th2) {
                        jVar.f3860b = 0;
                        jVar.f3864f = null;
                        throw th2;
                    }
                }
                a0.j.p("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            a0.j.p("Cannot call removeView(At) within removeView(At)");
        }
    }

    public abstract int n(f1 f1Var);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
        if ((r5.bottom - r10) > r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.D()
            int r1 = r8.F()
            int r2 = r8.f7720n
            int r3 = r8.E()
            int r2 = r2 - r3
            int r3 = r8.f7721o
            int r4 = r8.C()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.f7709b
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L5e
            if (r2 == 0) goto L59
            goto L66
        L59:
            int r2 = java.lang.Math.max(r6, r10)
            goto L66
        L5e:
            if (r6 == 0) goto L61
            goto L65
        L61:
            int r6 = java.lang.Math.min(r4, r2)
        L65:
            r2 = r6
        L66:
            if (r1 == 0) goto L69
            goto L6d
        L69:
            int r1 = java.lang.Math.min(r5, r11)
        L6d:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb0
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7e
            goto Lb5
        L7e:
            int r1 = r8.D()
            int r2 = r8.F()
            int r3 = r8.f7720n
            int r4 = r8.E()
            int r3 = r3 - r4
            int r4 = r8.f7721o
            int r5 = r8.C()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f7709b
            android.graphics.Rect r5 = r5.f1632g0
            r8.y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb5
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb5
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb5
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb0
            goto Lb5
        Lb0:
            if (r11 != 0) goto Lb6
            if (r10 == 0) goto Lb5
            goto Lb6
        Lb5:
            return r0
        Lb6:
            if (r12 == 0) goto Lbc
            r9.scrollBy(r11, r10)
            return r7
        Lbc:
            r9.j0(r11, r0, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.u0.n0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int o(f1 f1Var);

    public final void o0() {
        RecyclerView recyclerView = this.f7709b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void p(h2 h2Var) {
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            View u4 = u(v10);
            j1 M = RecyclerView.M(u4);
            if (M.o()) {
                if (RecyclerView.f1617w1) {
                    Log.d("RecyclerView", "ignoring view " + M);
                }
            } else if (M.f() && !M.h() && !this.f7709b.f1638j0.f7620b) {
                m0(v10);
                h2Var.m(M);
            } else {
                u(v10);
                this.f7708a.d(v10);
                h2Var.n(u4);
                this.f7709b.f1626d0.c(M);
            }
        }
    }

    public abstract int p0(int i2, h2 h2Var, f1 f1Var);

    public View q(int i2) {
        int v10 = v();
        for (int i10 = 0; i10 < v10; i10++) {
            View u4 = u(i10);
            j1 M = RecyclerView.M(u4);
            if (M != null && M.b() == i2 && !M.o() && (this.f7709b.f1621a1.f7556g || !M.h())) {
                return u4;
            }
        }
        return null;
    }

    public abstract void q0(int i2);

    public abstract v0 r();

    public abstract int r0(int i2, h2 h2Var, f1 f1Var);

    public v0 s(Context context, AttributeSet attributeSet) {
        return new v0(context, attributeSet);
    }

    public final void s0(RecyclerView recyclerView) {
        t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public v0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof v0) {
            return new v0((v0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new v0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new v0(layoutParams);
    }

    public final void t0(int i2, int i10) {
        this.f7720n = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.f7719l = mode;
        if (mode == 0 && !RecyclerView.f1620z1) {
            this.f7720n = 0;
        }
        this.f7721o = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.m = mode2;
        if (mode2 == 0 && !RecyclerView.f1620z1) {
            this.f7721o = 0;
        }
    }

    public final View u(int i2) {
        d5.j jVar = this.f7708a;
        if (jVar != null) {
            return jVar.h(i2);
        }
        return null;
    }

    public void u0(Rect rect, int i2, int i10) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f7709b;
        WeakHashMap weakHashMap = a6.x0.f533a;
        this.f7709b.setMeasuredDimension(g(i2, E, recyclerView.getMinimumWidth()), g(i10, C, this.f7709b.getMinimumHeight()));
    }

    public final int v() {
        d5.j jVar = this.f7708a;
        if (jVar != null) {
            return jVar.i();
        }
        return 0;
    }

    public final void v0(int i2, int i10) {
        int v10 = v();
        if (v10 == 0) {
            this.f7709b.q(i2, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < v10; i15++) {
            View u4 = u(i15);
            Rect rect = this.f7709b.f1632g0;
            y(u4, rect);
            int i16 = rect.left;
            if (i16 < i14) {
                i14 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i12) {
                i12 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i13) {
                i13 = i19;
            }
        }
        this.f7709b.f1632g0.set(i14, i12, i11, i13);
        u0(this.f7709b.f1632g0, i2, i10);
    }

    public final void w0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f7709b = null;
            this.f7708a = null;
            this.f7720n = 0;
            this.f7721o = 0;
        } else {
            this.f7709b = recyclerView;
            this.f7708a = recyclerView.f1624c0;
            this.f7720n = recyclerView.getWidth();
            this.f7721o = recyclerView.getHeight();
        }
        this.f7719l = 1073741824;
        this.m = 1073741824;
    }

    public int x(h2 h2Var, f1 f1Var) {
        RecyclerView recyclerView = this.f7709b;
        if (recyclerView != null && recyclerView.f1638j0 != null && d()) {
            return this.f7709b.f1638j0.a();
        }
        return 1;
    }

    public final boolean x0(View view, int i2, int i10, v0 v0Var) {
        if (!view.isLayoutRequested() && this.f7715h && M(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) v0Var).width) && M(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) v0Var).height)) {
            return false;
        }
        return true;
    }

    public void y(View view, Rect rect) {
        RecyclerView.N(view, rect);
    }

    public boolean y0() {
        return false;
    }

    public final boolean z0(View view, int i2, int i10, v0 v0Var) {
        if (this.f7715h && M(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) v0Var).width) && M(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) v0Var).height)) {
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

    public void h0(int i2) {
    }

    public void Y(int i2, int i10) {
    }

    public void a0(int i2, int i10) {
    }

    public void b0(int i2, int i10) {
    }

    public void c0(int i2, int i10) {
    }

    public void i(int i2, f2.s sVar) {
    }

    public void h(int i2, int i10, f1 f1Var, f2.s sVar) {
    }
}
