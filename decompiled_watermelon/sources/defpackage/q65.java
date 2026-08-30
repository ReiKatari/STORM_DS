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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q65  reason: default package */
/* loaded from: classes.dex */
public abstract class q65 {
    public vh0 a;
    public RecyclerView b;
    public final wv6 c;
    public final wv6 d;
    public go3 e;
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

    public q65() {
        o65 o65Var = new o65(this, 0);
        o65 o65Var2 = new o65(this, 1);
        this.c = new wv6(o65Var);
        this.d = new wv6(o65Var2);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((r65) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int G(View view) {
        return ((r65) view.getLayoutParams()).a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p65] */
    public static p65 H(Context context, AttributeSet attributeSet, int i, int i2) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yx4.a, i, i2);
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
        r65 r65Var = (r65) view.getLayoutParams();
        Rect rect = r65Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) r65Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) r65Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) r65Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) r65Var).bottomMargin);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q65.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((r65) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public abstract void A0(RecyclerView recyclerView, int i);

    public final int B() {
        g65 g65Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            g65Var = recyclerView.getAdapter();
        } else {
            g65Var = null;
        }
        if (g65Var != null) {
            return g65Var.a();
        }
        return 0;
    }

    public final void B0(go3 go3Var) {
        go3 go3Var2 = this.e;
        if (go3Var2 != null && go3Var != go3Var2 && go3Var2.e) {
            go3Var2.i();
        }
        this.e = go3Var;
        RecyclerView recyclerView = this.b;
        f75 f75Var = recyclerView.Z0;
        f75Var.Z.removeCallbacks(f75Var);
        f75Var.L.abortAnimation();
        if (go3Var.h) {
            Log.w("RecyclerView", "An instance of " + go3Var.getClass().getSimpleName() + " was started more than once. Each instance of" + go3Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        go3Var.b = recyclerView;
        go3Var.c = this;
        int i = go3Var.a;
        if (i != -1) {
            recyclerView.c1.a = i;
            go3Var.e = true;
            go3Var.d = true;
            go3Var.f = recyclerView.l0.q(i);
            go3Var.b.Z0.b();
            go3Var.h = true;
            return;
        }
        i.i("Invalid target position");
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

    public int I(w65 w65Var, c75 c75Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.k0 != null && e()) {
            return this.b.k0.a();
        }
        return 1;
    }

    public final void J(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((r65) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.j0;
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
            int n = recyclerView.d0.n();
            for (int i2 = 0; i2 < n; i2++) {
                recyclerView.d0.m(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int n = recyclerView.d0.n();
            for (int i2 = 0; i2 < n; i2++) {
                recyclerView.d0.m(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, w65 w65Var, c75 c75Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        w65 w65Var = recyclerView.L;
        if (accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            g65 g65Var = this.b.k0;
            if (g65Var != null) {
                accessibilityEvent.setItemCount(g65Var.a());
            }
        }
    }

    public void V(w65 w65Var, c75 c75Var, t2 t2Var) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            t2Var.a(8192);
            t2Var.l(true);
            t2Var.h(67108864, true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            t2Var.a(4096);
            t2Var.l(true);
            t2Var.h(67108864, true);
        }
        t2Var.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(w65Var, c75Var), x(w65Var, c75Var), false, 0));
    }

    public void W(w65 w65Var, c75 c75Var, View view, t2 t2Var) {
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
        t2Var.k(s2.a(false, i, 1, i2, 1));
    }

    public final void X(View view, t2 t2Var) {
        g75 N = RecyclerView.N(view);
        if (N != null && !N.h()) {
            vh0 vh0Var = this.a;
            if (!((ArrayList) vh0Var.b).contains(N.a)) {
                RecyclerView recyclerView = this.b;
                W(recyclerView.L, recyclerView.c1, view, t2Var);
            }
        }
    }

    public final void b(View view, int i, boolean z) {
        int i2;
        g75 N = RecyclerView.N(view);
        if (!z && !N.h()) {
            this.b.e0.i(N);
        } else {
            m66 m66Var = (m66) this.b.e0.B;
            la7 la7Var = (la7) m66Var.get(N);
            if (la7Var == null) {
                la7Var = la7.a();
                m66Var.put(N, la7Var);
            }
            la7Var.a |= 1;
        }
        r65 r65Var = (r65) view.getLayoutParams();
        if (!N.p() && !N.i()) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            vh0 vh0Var = this.a;
            int i3 = -1;
            if (parent == recyclerView) {
                yj yjVar = (yj) vh0Var.e;
                int indexOfChild = ((e65) vh0Var.d).A.indexOfChild(view);
                if (indexOfChild == -1 || yjVar.d(indexOfChild)) {
                    i2 = -1;
                } else {
                    i2 = indexOfChild - yjVar.b(indexOfChild);
                }
                if (i == -1) {
                    i = this.a.n();
                }
                if (i2 != -1) {
                    if (i2 != i) {
                        q65 q65Var = this.b.l0;
                        View u = q65Var.u(i2);
                        if (u != null) {
                            q65Var.u(i2);
                            q65Var.a.i(i2);
                            r65 r65Var2 = (r65) u.getLayoutParams();
                            g75 N2 = RecyclerView.N(u);
                            boolean h = N2.h();
                            RecyclerView recyclerView2 = q65Var.b;
                            if (h) {
                                m66 m66Var2 = (m66) recyclerView2.e0.B;
                                la7 la7Var2 = (la7) m66Var2.get(N2);
                                if (la7Var2 == null) {
                                    la7Var2 = la7.a();
                                    m66Var2.put(N2, la7Var2);
                                }
                                la7Var2.a = 1 | la7Var2.a;
                            } else {
                                recyclerView2.e0.i(N2);
                            }
                            q65Var.a.g(u, i, r65Var2, N2.h());
                        } else {
                            RecyclerView recyclerView3 = q65Var.b;
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + recyclerView3.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.C());
                }
            } else {
                vh0Var.f(view, i, false);
                r65Var.c = true;
                go3 go3Var = this.e;
                if (go3Var != null && go3Var.e) {
                    go3Var.b.getClass();
                    g75 N3 = RecyclerView.N(view);
                    if (N3 != null) {
                        i3 = N3.b();
                    }
                    if (i3 == go3Var.a) {
                        go3Var.f = view;
                        if (RecyclerView.y1) {
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
            this.a.g(view, i, view.getLayoutParams(), false);
        }
        if (r65Var.d) {
            if (RecyclerView.y1) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + r65Var.a);
            }
            N.a.invalidate();
            r65Var.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public abstract boolean d();

    public abstract void d0(w65 w65Var, c75 c75Var);

    public abstract boolean e();

    public abstract void e0(c75 c75Var);

    public boolean f(r65 r65Var) {
        if (r65Var != null) {
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
        w65 w65Var = this.b.L;
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
                if (f < RecyclerView.A1) {
                    if (RecyclerView.x1) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                    }
                }
            } else {
                f = 1.0f;
            }
            if (Float.compare(f, Float.POSITIVE_INFINITY) == 0) {
                RecyclerView recyclerView = this.b;
                g65 g65Var = recyclerView.k0;
                if (g65Var != null) {
                    if (i != 4096) {
                        if (i != 8192) {
                            return true;
                        }
                        recyclerView.k0(0);
                        return true;
                    }
                    recyclerView.k0(g65Var.a() - 1);
                    return true;
                }
            } else {
                if (Float.compare(1.0f, f) != 0 && Float.compare(RecyclerView.A1, f) != 0) {
                    D = (int) (D * f);
                    i2 = (int) (i2 * f);
                }
                this.b.j0(D, true, i2);
                return true;
            }
        }
        return false;
    }

    public abstract int j(c75 c75Var);

    public final void j0(w65 w65Var) {
        for (int v = v() - 1; v >= 0; v--) {
            if (!RecyclerView.N(u(v)).o()) {
                View u = u(v);
                m0(v);
                w65Var.l(u);
            }
        }
    }

    public abstract int k(c75 c75Var);

    public final void k0(w65 w65Var) {
        ArrayList arrayList;
        int size = ((ArrayList) w65Var.c).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) w65Var.c;
            if (i < 0) {
                break;
            }
            View view = ((g75) arrayList.get(i)).a;
            g75 N = RecyclerView.N(view);
            if (!N.o()) {
                N.n(false);
                if (N.j()) {
                    this.b.removeDetachedView(view, false);
                }
                m65 m65Var = this.b.K0;
                if (m65Var != null) {
                    m65Var.d(N);
                }
                N.n(true);
                g75 N2 = RecyclerView.N(view);
                N2.n = null;
                N2.o = false;
                N2.j &= -33;
                w65Var.m(N2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) w65Var.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int l(c75 c75Var);

    public final void l0(View view, w65 w65Var) {
        vh0 vh0Var = this.a;
        e65 e65Var = (e65) vh0Var.d;
        int i = vh0Var.c;
        if (i != 1) {
            if (i != 2) {
                try {
                    vh0Var.c = 1;
                    vh0Var.f = view;
                    int indexOfChild = e65Var.A.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (((yj) vh0Var.e).h(indexOfChild)) {
                            vh0Var.w(view);
                        }
                        e65Var.i(indexOfChild);
                    }
                    vh0Var.c = 0;
                    vh0Var.f = null;
                    w65Var.l(view);
                    return;
                } catch (Throwable th) {
                    vh0Var.c = 0;
                    vh0Var.f = null;
                    throw th;
                }
            }
            i.n("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        i.n("Cannot call removeView(At) within removeView(At)");
    }

    public abstract int m(c75 c75Var);

    public final void m0(int i) {
        if (u(i) != null) {
            vh0 vh0Var = this.a;
            e65 e65Var = (e65) vh0Var.d;
            int i2 = vh0Var.c;
            if (i2 != 1) {
                if (i2 != 2) {
                    try {
                        int o = vh0Var.o(i);
                        View childAt = e65Var.A.getChildAt(o);
                        if (childAt == null) {
                            vh0Var.c = 0;
                            vh0Var.f = null;
                            return;
                        }
                        vh0Var.c = 1;
                        vh0Var.f = childAt;
                        if (((yj) vh0Var.e).h(o)) {
                            vh0Var.w(childAt);
                        }
                        e65Var.i(o);
                        vh0Var.c = 0;
                        vh0Var.f = null;
                        return;
                    } catch (Throwable th) {
                        vh0Var.c = 0;
                        vh0Var.f = null;
                        throw th;
                    }
                }
                i.n("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            i.n("Cannot call removeView(At) within removeView(At)");
        }
    }

    public abstract int n(c75 c75Var);

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
            int r2 = r8.n
            int r3 = r8.E()
            int r2 = r2 - r3
            int r3 = r8.o
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
            androidx.recyclerview.widget.RecyclerView r3 = r8.b
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
            int r3 = r8.n
            int r4 = r8.E()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.C()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.h0
            r8.y(r13, r5)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto Lb5
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto Lb5
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto Lb5
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lb0
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q65.n0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int o(c75 c75Var);

    public final void o0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void p(w65 w65Var) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            g75 N = RecyclerView.N(u);
            if (N.o()) {
                if (RecyclerView.y1) {
                    Log.d("RecyclerView", "ignoring view " + N);
                }
            } else if (N.f() && !N.h() && !this.b.k0.b) {
                m0(v);
                w65Var.m(N);
            } else {
                u(v);
                this.a.i(v);
                w65Var.n(u);
                this.b.e0.i(N);
            }
        }
    }

    public abstract int p0(int i, w65 w65Var, c75 c75Var);

    public View q(int i) {
        int v = v();
        for (int i2 = 0; i2 < v; i2++) {
            View u = u(i2);
            g75 N = RecyclerView.N(u);
            if (N != null && N.b() == i && !N.o() && (this.b.c1.g || !N.h())) {
                return u;
            }
        }
        return null;
    }

    public abstract void q0(int i);

    public abstract r65 r();

    public abstract int r0(int i, w65 w65Var, c75 c75Var);

    public r65 s(Context context, AttributeSet attributeSet) {
        return new r65(context, attributeSet);
    }

    public final void s0(RecyclerView recyclerView) {
        t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public r65 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof r65) {
            return new r65((r65) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new r65((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new r65(layoutParams);
    }

    public final void t0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.B1) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 == 0 && !RecyclerView.B1) {
            this.o = 0;
        }
    }

    public final View u(int i) {
        vh0 vh0Var = this.a;
        if (vh0Var != null) {
            return vh0Var.m(i);
        }
        return null;
    }

    public void u0(Rect rect, int i, int i2) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = aa7.a;
        this.b.setMeasuredDimension(g(i, E, recyclerView.getMinimumWidth()), g(i2, C, this.b.getMinimumHeight()));
    }

    public final int v() {
        vh0 vh0Var = this.a;
        if (vh0Var != null) {
            return vh0Var.n();
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
            Rect rect = this.b.h0;
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
        this.b.h0.set(i6, i4, i3, i5);
        u0(this.b.h0, i, i2);
    }

    public final void w0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.d0;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public int x(w65 w65Var, c75 c75Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.k0 != null && d()) {
            return this.b.k0.a();
        }
        return 1;
    }

    public final boolean x0(View view, int i, int i2, r65 r65Var) {
        if (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) r65Var).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) r65Var).height)) {
            return false;
        }
        return true;
    }

    public void y(View view, Rect rect) {
        boolean z = RecyclerView.x1;
        r65 r65Var = (r65) view.getLayoutParams();
        Rect rect2 = r65Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) r65Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) r65Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) r65Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) r65Var).bottomMargin);
    }

    public boolean y0() {
        return false;
    }

    public final boolean z0(View view, int i, int i2, r65 r65Var) {
        if (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) r65Var).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) r65Var).height)) {
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

    public void i(int i, yp0 yp0Var) {
    }

    public void h(int i, int i2, c75 c75Var, yp0 yp0Var) {
    }
}
