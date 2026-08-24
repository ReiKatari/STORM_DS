package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final yc1 K;
    public final Rect L;
    public int M;
    public int N;
    public int O;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new yc1(22);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(gg5.H(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final boolean C0() {
        if (this.z == null && !this.E) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void E0(sg5 sg5Var, gv3 gv3Var, ls0 ls0Var) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = gv3Var.d) >= 0 && i < sg5Var.b() && i2 > 0; i3++) {
            ls0Var.a(gv3Var.d, Math.max(0, gv3Var.g));
            this.K.getClass();
            i2--;
            gv3Var.d += gv3Var.e;
        }
    }

    @Override // defpackage.gg5
    public final int I(mg5 mg5Var, sg5 sg5Var) {
        if (this.p == 0) {
            return Math.min(this.F, B());
        }
        if (sg5Var.b() < 1) {
            return 0;
        }
        return o1(sg5Var.b() - 1, mg5Var, sg5Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View Q0(mg5 mg5Var, sg5 sg5Var, boolean z, boolean z2) {
        int i;
        int i2;
        int v = v();
        int i3 = 1;
        if (z2) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v;
            i2 = 0;
        }
        int b = sg5Var.b();
        J0();
        int m = this.r.m();
        int i4 = this.r.i();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View u = u(i2);
            int G = gg5.G(u);
            if (G >= 0 && G < b && p1(G, mg5Var, sg5Var) == 0) {
                if (((hg5) u.getLayoutParams()).a.h()) {
                    if (view2 == null) {
                        view2 = u;
                    }
                } else if (this.r.g(u) < i4 && this.r.d(u) >= m) {
                    return u;
                } else {
                    if (view == null) {
                        view = u;
                    }
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
        if (r13 == r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0107, code lost:
        if (r13 == r9) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (((java.util.ArrayList) r22.a.B).contains(r3) != false) goto L4;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, mg5 mg5Var, sg5 sg5Var) {
        View E;
        boolean z;
        int v;
        int i2;
        int i3;
        boolean z2;
        View view2;
        View view3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        mg5 mg5Var2 = mg5Var;
        sg5 sg5Var2 = sg5Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            E = recyclerView.E(view);
            if (E != null) {
            }
        }
        E = null;
        if (E != null) {
            ku2 ku2Var = (ku2) E.getLayoutParams();
            int i6 = ku2Var.e;
            int i7 = ku2Var.f + i6;
            if (super.T(view, i, mg5Var, sg5Var) != null) {
                if (I0(i) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.u) {
                    i3 = v() - 1;
                    v = -1;
                    i2 = -1;
                } else {
                    v = v();
                    i2 = 1;
                    i3 = 0;
                }
                if (this.p == 1 && V0()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int o1 = o1(i3, mg5Var2, sg5Var2);
                View view4 = null;
                int i8 = -1;
                int i9 = -1;
                int i10 = 0;
                int i11 = i3;
                int i12 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i11 == v) {
                        break;
                    }
                    int o12 = o1(i11, mg5Var2, sg5Var2);
                    View u = u(i11);
                    if (u == E) {
                        break;
                    }
                    if (u.hasFocusable() && o12 != o1) {
                        if (view4 != null) {
                            break;
                        }
                        view3 = E;
                        i5 = i10;
                        i4 = v;
                    } else {
                        ku2 ku2Var2 = (ku2) u.getLayoutParams();
                        int i13 = ku2Var2.e;
                        view3 = E;
                        int i14 = ku2Var2.f + i13;
                        if (u.hasFocusable() && i13 == i6 && i14 == i7) {
                            return u;
                        }
                        if ((u.hasFocusable() && view4 == null) || (!u.hasFocusable() && view2 == null)) {
                            i5 = i10;
                            i4 = v;
                        } else {
                            i4 = v;
                            int min = Math.min(i14, i7) - Math.max(i13, i6);
                            if (u.hasFocusable()) {
                                if (min <= i10) {
                                    if (min == i10) {
                                        if (i13 > i9) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                    i5 = i10;
                                }
                                i5 = i10;
                            } else {
                                if (view4 == null) {
                                    i5 = i10;
                                    if (!this.c.j(u) || !this.d.j(u)) {
                                        if (min <= i12) {
                                            if (min == i12) {
                                                if (i13 > i8) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                                i5 = i10;
                            }
                        }
                        boolean hasFocusable = u.hasFocusable();
                        int i15 = ku2Var2.e;
                        if (hasFocusable) {
                            i10 = Math.min(i14, i7) - Math.max(i13, i6);
                            view4 = u;
                            i9 = i15;
                            view5 = view2;
                        } else {
                            i12 = Math.min(i14, i7) - Math.max(i13, i6);
                            i8 = i15;
                            i10 = i5;
                            view5 = u;
                        }
                        i11 += i2;
                        mg5Var2 = mg5Var;
                        sg5Var2 = sg5Var;
                        E = view3;
                        v = i4;
                    }
                    view5 = view2;
                    i10 = i5;
                    i11 += i2;
                    mg5Var2 = mg5Var;
                    sg5Var2 = sg5Var;
                    E = view3;
                    v = i4;
                }
                if (view4 != null) {
                    return view4;
                }
                return view2;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final void V(mg5 mg5Var, sg5 sg5Var, v2 v2Var) {
        super.V(mg5Var, sg5Var, v2Var);
        v2Var.i(GridView.class.getName());
        wf5 wf5Var = this.b.l0;
        if (wf5Var != null && wf5Var.a() > 1) {
            v2Var.b(p2.r);
        }
    }

    @Override // defpackage.gg5
    public final void W(mg5 mg5Var, sg5 sg5Var, View view, v2 v2Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ku2)) {
            X(view, v2Var);
            return;
        }
        ku2 ku2Var = (ku2) layoutParams;
        int o1 = o1(ku2Var.a.b(), mg5Var, sg5Var);
        int i = this.p;
        int i2 = ku2Var.e;
        int i3 = ku2Var.f;
        if (i == 0) {
            v2Var.k(u2.b(false, i2, i3, o1, 1));
        } else {
            v2Var.k(u2.b(false, o1, 1, i2, i3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        r22.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(mg5 mg5Var, sg5 sg5Var, gv3 gv3Var, fv3 fv3Var) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int w;
        int i8;
        ?? r12;
        int i9;
        View b;
        int l = this.r.l();
        if (l != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (v() > 0) {
            i = this.G[this.F];
        } else {
            i = 0;
        }
        if (z) {
            t1();
        }
        if (gv3Var.e == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i10 = this.F;
        if (!z2) {
            i10 = p1(gv3Var.d, mg5Var, sg5Var) + q1(gv3Var.d, mg5Var, sg5Var);
        }
        int i11 = 0;
        while (i11 < this.F && (i9 = gv3Var.d) >= 0 && i9 < sg5Var.b() && i10 > 0) {
            int i12 = gv3Var.d;
            int q1 = q1(i12, mg5Var, sg5Var);
            if (q1 <= this.F) {
                i10 -= q1;
                if (i10 < 0 || (b = gv3Var.b(mg5Var)) == null) {
                    break;
                }
                this.H[i11] = b;
                i11++;
            } else {
                i.h(lb1.o(i61.q(i12, q1, "Item at position ", " requires ", " spans but GridLayoutManager has only "), this.F, " spans."));
                return;
            }
        }
        if (z2) {
            i4 = 1;
            i3 = i11;
            i2 = 0;
        } else {
            i2 = i11 - 1;
            i3 = -1;
            i4 = -1;
        }
        int i13 = 0;
        while (i2 != i3) {
            View view = this.H[i2];
            ku2 ku2Var = (ku2) view.getLayoutParams();
            int q12 = q1(gg5.G(view), mg5Var, sg5Var);
            ku2Var.f = q12;
            ku2Var.e = i13;
            i13 += q12;
            i2 += i4;
        }
        float f = RecyclerView.B1;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            View view2 = this.H[i15];
            if (gv3Var.k == null) {
                if (z2) {
                    r12 = 0;
                    b(view2, -1, false);
                } else {
                    r12 = 0;
                    b(view2, 0, false);
                }
            } else {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.O(view2));
            }
            r1(view2, l, r12);
            int e = this.r.e(view2);
            if (e > i14) {
                i14 = e;
            }
            float f2 = (this.r.f(view2) * 1.0f) / ((ku2) view2.getLayoutParams()).f;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z) {
            h1(Math.max(Math.round(f * this.F), i));
            i14 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                View view3 = this.H[i16];
                r1(view3, 1073741824, true);
                int e2 = this.r.e(view3);
                if (e2 > i14) {
                    i14 = e2;
                }
            }
        }
        for (int i17 = 0; i17 < i11; i17++) {
            View view4 = this.H[i17];
            if (this.r.e(view4) != i14) {
                ku2 ku2Var2 = (ku2) view4.getLayoutParams();
                Rect rect2 = ku2Var2.b;
                int i18 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) ku2Var2).topMargin + ((ViewGroup.MarginLayoutParams) ku2Var2).bottomMargin;
                int i19 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) ku2Var2).leftMargin + ((ViewGroup.MarginLayoutParams) ku2Var2).rightMargin;
                int n1 = n1(ku2Var2.e, ku2Var2.f);
                if (this.p == 1) {
                    i8 = gg5.w(false, n1, 1073741824, i19, ((ViewGroup.MarginLayoutParams) ku2Var2).width);
                    w = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    w = gg5.w(false, n1, 1073741824, i18, ((ViewGroup.MarginLayoutParams) ku2Var2).height);
                    i8 = makeMeasureSpec;
                }
                if (z0(view4, i8, w, (hg5) view4.getLayoutParams())) {
                    view4.measure(i8, w);
                }
            }
        }
        fv3Var.a = i14;
        int i20 = this.p;
        int i21 = gv3Var.f;
        int i22 = gv3Var.b;
        if (i20 == 1) {
            if (i21 == -1) {
                i6 = i22 - i14;
                i7 = 0;
                i5 = 0;
            } else {
                i5 = 0;
                i6 = i22;
                i22 += i14;
                i7 = 0;
            }
        } else {
            if (i21 == -1) {
                i7 = i22 - i14;
                i6 = 0;
                i5 = i22;
            } else {
                i5 = i22 + i14;
                i6 = 0;
                i7 = i22;
            }
            i22 = i6;
        }
        int i23 = 0;
        while (true) {
            View[] viewArr = this.H;
            if (i23 < i11) {
                View view5 = viewArr[i23];
                ku2 ku2Var3 = (ku2) view5.getLayoutParams();
                if (this.p == 1) {
                    if (V0()) {
                        int D = D() + this.G[this.F - ku2Var3.e];
                        i5 = D;
                        i7 = D - this.r.f(view5);
                    } else {
                        i7 = D() + this.G[ku2Var3.e];
                        i5 = this.r.f(view5) + i7;
                    }
                } else {
                    i6 = F() + this.G[ku2Var3.e];
                    i22 = this.r.f(view5) + i6;
                }
                gg5.N(view5, i7, i6, i5, i22);
                if (ku2Var3.a.h() || ku2Var3.a.k()) {
                    fv3Var.c = true;
                }
                fv3Var.d = view5.hasFocusable() | fv3Var.d;
                i23++;
            } else {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(mg5 mg5Var, sg5 sg5Var, ev3 ev3Var, int i) {
        boolean z;
        t1();
        if (sg5Var.b() > 0 && !sg5Var.g) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int p1 = p1(ev3Var.b, mg5Var, sg5Var);
            if (z) {
                while (p1 > 0) {
                    int i2 = ev3Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    ev3Var.b = i3;
                    p1 = p1(i3, mg5Var, sg5Var);
                }
            } else {
                int b = sg5Var.b() - 1;
                int i4 = ev3Var.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int p12 = p1(i5, mg5Var, sg5Var);
                    if (p12 <= p1) {
                        break;
                    }
                    i4 = i5;
                    p1 = p12;
                }
                ev3Var.b = i4;
            }
        }
        i1();
    }

    @Override // defpackage.gg5
    public final void Y(int i, int i2) {
        yc1 yc1Var = this.K;
        yc1Var.F();
        ((SparseIntArray) yc1Var.B).clear();
    }

    @Override // defpackage.gg5
    public final void Z() {
        yc1 yc1Var = this.K;
        yc1Var.F();
        ((SparseIntArray) yc1Var.B).clear();
    }

    @Override // defpackage.gg5
    public final void a0(int i, int i2) {
        yc1 yc1Var = this.K;
        yc1Var.F();
        ((SparseIntArray) yc1Var.B).clear();
    }

    @Override // defpackage.gg5
    public final void b0(int i, int i2) {
        yc1 yc1Var = this.K;
        yc1Var.F();
        ((SparseIntArray) yc1Var.B).clear();
    }

    @Override // defpackage.gg5
    public final void c0(int i, int i2) {
        yc1 yc1Var = this.K;
        yc1Var.F();
        ((SparseIntArray) yc1Var.B).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final void d0(mg5 mg5Var, sg5 sg5Var) {
        boolean z = sg5Var.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int v = v();
            for (int i = 0; i < v; i++) {
                ku2 ku2Var = (ku2) u(i).getLayoutParams();
                int b = ku2Var.a.b();
                sparseIntArray2.put(b, ku2Var.f);
                sparseIntArray.put(b, ku2Var.e);
            }
        }
        super.d0(mg5Var, sg5Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(boolean z) {
        if (!z) {
            super.d1(false);
        } else {
            fa6.h("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final void e0(sg5 sg5Var) {
        View q;
        super.e0(sg5Var);
        this.E = false;
        int i = this.M;
        if (i != -1 && (q = q(i)) != null) {
            q.sendAccessibilityEvent(67108864);
            this.M = -1;
        }
    }

    @Override // defpackage.gg5
    public final boolean f(hg5 hg5Var) {
        return hg5Var instanceof ku2;
    }

    public final void h1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0284  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i0(int i, Bundle bundle) {
        View view;
        wg5 M;
        int K;
        int i2;
        int i3;
        if (i == p2.r.a() && i != -1) {
            int i4 = 0;
            while (true) {
                if (i4 < v()) {
                    View u = u(i4);
                    Objects.requireNonNull(u);
                    if (u.isAccessibilityFocused()) {
                        view = u(i4);
                        break;
                    }
                    i4++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null && bundle != null) {
                int i5 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (P.contains(Integer.valueOf(i5)) && (M = this.b.M(view)) != null) {
                    RecyclerView recyclerView = M.r;
                    if (recyclerView == null) {
                        K = -1;
                    } else {
                        K = recyclerView.K(M);
                    }
                    int k1 = k1(K);
                    int j1 = j1(K);
                    if (k1 >= 0 && j1 >= 0) {
                        if (!l1(K).contains(Integer.valueOf(this.N)) || !m1(j1(K), K).contains(Integer.valueOf(this.O))) {
                            this.N = k1;
                            this.O = j1;
                        }
                        int i6 = this.N;
                        if (i6 == -1) {
                            i6 = k1;
                        }
                        int i7 = this.O;
                        if (i7 != -1) {
                            j1 = i7;
                        }
                        if (i5 != 17) {
                            if (i5 != 33) {
                                if (i5 != 66) {
                                    if (i5 == 130) {
                                        i2 = K + 1;
                                        while (i2 < B()) {
                                            int k12 = k1(i2);
                                            int j12 = j1(i2);
                                            if (k12 < 0 || j12 < 0) {
                                                break;
                                            } else if (this.p == 1) {
                                                if (k12 > i6 && (j12 == j1 || m1(j1(i2), i2).contains(Integer.valueOf(j1)))) {
                                                    this.N = k12;
                                                    break;
                                                }
                                                i2++;
                                            } else {
                                                if (k12 > i6 && j12 == j1) {
                                                    this.N = k1(i2);
                                                    break;
                                                }
                                                i2++;
                                            }
                                        }
                                        i2 = -1;
                                        if (i2 == -1 && (i3 = this.p) == 0) {
                                            if (i5 != 17) {
                                                if (k1 >= 0 && i3 != 1) {
                                                    TreeMap treeMap = new TreeMap(Collections.reverseOrder());
                                                    int i8 = 0;
                                                    loop2: while (true) {
                                                        if (i8 < B()) {
                                                            Iterator it = l1(i8).iterator();
                                                            while (it.hasNext()) {
                                                                Integer num = (Integer) it.next();
                                                                if (num.intValue() < 0) {
                                                                    break loop2;
                                                                }
                                                                treeMap.put(num, Integer.valueOf(i8));
                                                            }
                                                            i8++;
                                                        } else {
                                                            for (Integer num2 : treeMap.keySet()) {
                                                                int intValue = num2.intValue();
                                                                if (intValue < k1) {
                                                                    i2 = ((Integer) treeMap.get(num2)).intValue();
                                                                    this.N = intValue;
                                                                    this.O = j1(i2);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i2 = -1;
                                            } else if (i5 == 66) {
                                                if (k1 >= 0 && i3 != 1) {
                                                    TreeMap treeMap2 = new TreeMap();
                                                    int i9 = 0;
                                                    loop5: while (true) {
                                                        if (i9 < B()) {
                                                            Iterator it2 = l1(i9).iterator();
                                                            while (it2.hasNext()) {
                                                                Integer num3 = (Integer) it2.next();
                                                                if (num3.intValue() < 0) {
                                                                    break loop5;
                                                                } else if (!treeMap2.containsKey(num3)) {
                                                                    treeMap2.put(num3, Integer.valueOf(i9));
                                                                }
                                                            }
                                                            i9++;
                                                        } else {
                                                            for (Integer num4 : treeMap2.keySet()) {
                                                                int intValue2 = num4.intValue();
                                                                if (intValue2 > k1) {
                                                                    i2 = ((Integer) treeMap2.get(num4)).intValue();
                                                                    this.N = intValue2;
                                                                    this.O = 0;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i2 = -1;
                                            }
                                        }
                                        if (i2 != -1) {
                                            q0(i2);
                                            this.M = i2;
                                            return true;
                                        }
                                    }
                                } else {
                                    i2 = K + 1;
                                    while (i2 < B()) {
                                        int k13 = k1(i2);
                                        int j13 = j1(i2);
                                        if (k13 < 0 || j13 < 0) {
                                            break;
                                        } else if (this.p == 1) {
                                            if ((k13 == i6 && j13 > j1) || k13 > i6) {
                                                this.N = k13;
                                                this.O = j13;
                                                break;
                                            }
                                            i2++;
                                        } else {
                                            if (j13 > j1 && l1(i2).contains(Integer.valueOf(i6))) {
                                                this.O = j13;
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                    i2 = -1;
                                    if (i2 == -1) {
                                        if (i5 != 17) {
                                        }
                                    }
                                    if (i2 != -1) {
                                    }
                                }
                            } else {
                                i2 = K - 1;
                                while (i2 >= 0) {
                                    int k14 = k1(i2);
                                    int j14 = j1(i2);
                                    if (k14 < 0 || j14 < 0) {
                                        break;
                                    } else if (this.p == 1) {
                                        if (k14 < i6 && m1(j1(i2), i2).contains(Integer.valueOf(j1))) {
                                            this.N = k14;
                                            break;
                                        }
                                        i2--;
                                    } else {
                                        if (k14 < i6 && j14 == j1) {
                                            this.N = ((Integer) Collections.max(l1(i2))).intValue();
                                            break;
                                        }
                                        i2--;
                                    }
                                }
                                i2 = -1;
                                if (i2 == -1) {
                                }
                                if (i2 != -1) {
                                }
                            }
                        } else {
                            i2 = K - 1;
                            while (i2 >= 0) {
                                int k15 = k1(i2);
                                int j15 = j1(i2);
                                if (k15 < 0 || j15 < 0) {
                                    break;
                                } else if (this.p == 1) {
                                    if ((k15 == i6 && j15 < j1) || k15 < i6) {
                                        this.N = k15;
                                        this.O = j15;
                                        break;
                                    }
                                    i2--;
                                } else {
                                    if (l1(i2).contains(Integer.valueOf(i6)) && j15 < j1) {
                                        this.O = j15;
                                        break;
                                    }
                                    i2--;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                            }
                            if (i2 != -1) {
                            }
                        }
                    }
                }
            }
        } else if (i == 16908343 && bundle != null) {
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i10 != -1 && i11 != -1) {
                int a = this.b.l0.a();
                int i12 = 0;
                while (true) {
                    if (i12 < a) {
                        RecyclerView recyclerView2 = this.b;
                        int p1 = p1(i12, recyclerView2.L, recyclerView2.d1);
                        RecyclerView recyclerView3 = this.b;
                        int o1 = o1(i12, recyclerView3.L, recyclerView3.d1);
                        if (this.p == 1) {
                            if (p1 == i11 && o1 == i10) {
                                break;
                            }
                            i12++;
                        } else {
                            if (p1 == i10 && o1 == i11) {
                                break;
                            }
                            i12++;
                        }
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 > -1) {
                    this.x = i12;
                    this.y = 0;
                    hv3 hv3Var = this.z;
                    if (hv3Var != null) {
                        hv3Var.A = -1;
                    }
                    o0();
                    return true;
                }
            }
        } else {
            return super.i0(i, bundle);
        }
        return false;
    }

    public final void i1() {
        View[] viewArr = this.H;
        if (viewArr != null && viewArr.length == this.F) {
            return;
        }
        this.H = new View[this.F];
    }

    public final int j1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        if (i2 == 0) {
            return o1(i, recyclerView.L, recyclerView.d1);
        }
        return p1(i, recyclerView.L, recyclerView.d1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final int k(sg5 sg5Var) {
        return G0(sg5Var);
    }

    public final int k1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        if (i2 == 1) {
            return o1(i, recyclerView.L, recyclerView.d1);
        }
        return p1(i, recyclerView.L, recyclerView.d1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final int l(sg5 sg5Var) {
        return H0(sg5Var);
    }

    public final HashSet l1(int i) {
        return m1(k1(i), i);
    }

    public final HashSet m1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.b;
        int q1 = q1(i2, recyclerView.L, recyclerView.d1);
        for (int i3 = i; i3 < i + q1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final int n(sg5 sg5Var) {
        return G0(sg5Var);
    }

    public final int n1(int i, int i2) {
        if (this.p == 1 && V0()) {
            int[] iArr = this.G;
            int i3 = this.F;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.G;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final int o(sg5 sg5Var) {
        return H0(sg5Var);
    }

    public final int o1(int i, mg5 mg5Var, sg5 sg5Var) {
        boolean z = sg5Var.g;
        yc1 yc1Var = this.K;
        if (!z) {
            int i2 = this.F;
            yc1Var.getClass();
            return yc1.E(i, i2);
        }
        int b = mg5Var.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        int i3 = this.F;
        yc1Var.getClass();
        return yc1.E(b, i3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final int p0(int i, mg5 mg5Var, sg5 sg5Var) {
        t1();
        i1();
        return super.p0(i, mg5Var, sg5Var);
    }

    public final int p1(int i, mg5 mg5Var, sg5 sg5Var) {
        boolean z = sg5Var.g;
        yc1 yc1Var = this.K;
        if (!z) {
            int i2 = this.F;
            yc1Var.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b = mg5Var.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        int i4 = this.F;
        yc1Var.getClass();
        return b % i4;
    }

    public final int q1(int i, mg5 mg5Var, sg5 sg5Var) {
        boolean z = sg5Var.g;
        yc1 yc1Var = this.K;
        if (!z) {
            yc1Var.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (mg5Var.b(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        yc1Var.getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final hg5 r() {
        if (this.p == 0) {
            return new ku2(-2, -1);
        }
        return new ku2(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final int r0(int i, mg5 mg5Var, sg5 sg5Var) {
        t1();
        i1();
        return super.r0(i, mg5Var, sg5Var);
    }

    public final void r1(View view, int i, boolean z) {
        int i2;
        int i3;
        boolean x0;
        ku2 ku2Var = (ku2) view.getLayoutParams();
        Rect rect = ku2Var.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) ku2Var).topMargin + ((ViewGroup.MarginLayoutParams) ku2Var).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) ku2Var).leftMargin + ((ViewGroup.MarginLayoutParams) ku2Var).rightMargin;
        int n1 = n1(ku2Var.e, ku2Var.f);
        if (this.p == 1) {
            i3 = gg5.w(false, n1, i, i5, ((ViewGroup.MarginLayoutParams) ku2Var).width);
            i2 = gg5.w(true, this.r.n(), this.m, i4, ((ViewGroup.MarginLayoutParams) ku2Var).height);
        } else {
            int w = gg5.w(false, n1, i, i4, ((ViewGroup.MarginLayoutParams) ku2Var).height);
            int w2 = gg5.w(true, this.r.n(), this.l, i5, ((ViewGroup.MarginLayoutParams) ku2Var).width);
            i2 = w;
            i3 = w2;
        }
        hg5 hg5Var = (hg5) view.getLayoutParams();
        if (z) {
            x0 = z0(view, i3, i2, hg5Var);
        } else {
            x0 = x0(view, i3, i2, hg5Var);
        }
        if (x0) {
            view.measure(i3, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hg5, ku2] */
    @Override // defpackage.gg5
    public final hg5 s(Context context, AttributeSet attributeSet) {
        ?? hg5Var = new hg5(context, attributeSet);
        hg5Var.e = -1;
        hg5Var.f = 0;
        return hg5Var;
    }

    public final void s1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i >= 1) {
            this.F = i;
            this.K.F();
            o0();
            return;
        }
        i.h(lb1.g(i, "Span count should be at least 1. Provided "));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [hg5, ku2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [hg5, ku2] */
    @Override // defpackage.gg5
    public final hg5 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? hg5Var = new hg5((ViewGroup.MarginLayoutParams) layoutParams);
            hg5Var.e = -1;
            hg5Var.f = 0;
            return hg5Var;
        }
        ?? hg5Var2 = new hg5(layoutParams);
        hg5Var2.e = -1;
        hg5Var2.f = 0;
        return hg5Var2;
    }

    public final void t1() {
        int C;
        int F;
        if (this.p == 1) {
            C = this.n - E();
            F = D();
        } else {
            C = this.o - C();
            F = F();
        }
        h1(C - F);
    }

    @Override // defpackage.gg5
    public final void u0(Rect rect, int i, int i2) {
        int g;
        int g2;
        if (this.G == null) {
            super.u0(rect, i, i2);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.p == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = ao7.a;
            g2 = gg5.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            g = gg5.g(i, iArr[iArr.length - 1] + E, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = ao7.a;
            g = gg5.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            g2 = gg5.g(i2, iArr2[iArr2.length - 1] + C, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    @Override // defpackage.gg5
    public final int x(mg5 mg5Var, sg5 sg5Var) {
        if (this.p == 1) {
            return Math.min(this.F, B());
        }
        if (sg5Var.b() < 1) {
            return 0;
        }
        return o1(sg5Var.b() - 1, mg5Var, sg5Var) + 1;
    }

    public GridLayoutManager() {
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new yc1(22);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(2);
    }

    public GridLayoutManager(int i) {
        super(1, false);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new yc1(22);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(i);
    }
}
