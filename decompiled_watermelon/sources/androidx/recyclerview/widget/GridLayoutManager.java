package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final k91 K;
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
        this.K = new k91(22);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(q65.H(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.q65
    public final boolean C0() {
        if (this.z == null && !this.E) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void E0(c75 c75Var, eo3 eo3Var, yp0 yp0Var) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = eo3Var.d) >= 0 && i < c75Var.b() && i2 > 0; i3++) {
            yp0Var.a(eo3Var.d, Math.max(0, eo3Var.g));
            this.K.getClass();
            i2--;
            eo3Var.d += eo3Var.e;
        }
    }

    @Override // defpackage.q65
    public final int I(w65 w65Var, c75 c75Var) {
        if (this.p == 0) {
            return Math.min(this.F, B());
        }
        if (c75Var.b() < 1) {
            return 0;
        }
        return o1(c75Var.b() - 1, w65Var, c75Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View Q0(w65 w65Var, c75 c75Var, boolean z, boolean z2) {
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
        int b = c75Var.b();
        J0();
        int m = this.r.m();
        int i4 = this.r.i();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View u = u(i2);
            int G = q65.G(u);
            if (G >= 0 && G < b && p1(G, w65Var, c75Var) == 0) {
                if (((r65) u.getLayoutParams()).a.h()) {
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
        if (((java.util.ArrayList) r22.a.b).contains(r3) != false) goto L4;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.q65
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r23, int r24, defpackage.w65 r25, defpackage.c75 r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, w65, c75):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.q65
    public final void V(w65 w65Var, c75 c75Var, t2 t2Var) {
        super.V(w65Var, c75Var, t2Var);
        t2Var.i(GridView.class.getName());
        g65 g65Var = this.b.k0;
        if (g65Var != null && g65Var.a() > 1) {
            t2Var.b(n2.r);
        }
    }

    @Override // defpackage.q65
    public final void W(w65 w65Var, c75 c75Var, View view, t2 t2Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof go2)) {
            X(view, t2Var);
            return;
        }
        go2 go2Var = (go2) layoutParams;
        int o1 = o1(go2Var.a.b(), w65Var, c75Var);
        int i = this.p;
        int i2 = go2Var.e;
        int i3 = go2Var.f;
        if (i == 0) {
            t2Var.k(s2.a(false, i2, i3, o1, 1));
        } else {
            t2Var.k(s2.a(false, o1, 1, i2, i3));
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
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W0(defpackage.w65 r19, defpackage.c75 r20, defpackage.eo3 r21, defpackage.do3 r22) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.W0(w65, c75, eo3, do3):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(w65 w65Var, c75 c75Var, co3 co3Var, int i) {
        boolean z;
        t1();
        if (c75Var.b() > 0 && !c75Var.g) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int p1 = p1(co3Var.b, w65Var, c75Var);
            if (z) {
                while (p1 > 0) {
                    int i2 = co3Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    co3Var.b = i3;
                    p1 = p1(i3, w65Var, c75Var);
                }
            } else {
                int b = c75Var.b() - 1;
                int i4 = co3Var.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int p12 = p1(i5, w65Var, c75Var);
                    if (p12 <= p1) {
                        break;
                    }
                    i4 = i5;
                    p1 = p12;
                }
                co3Var.b = i4;
            }
        }
        i1();
    }

    @Override // defpackage.q65
    public final void Y(int i, int i2) {
        k91 k91Var = this.K;
        k91Var.G();
        ((SparseIntArray) k91Var.B).clear();
    }

    @Override // defpackage.q65
    public final void Z() {
        k91 k91Var = this.K;
        k91Var.G();
        ((SparseIntArray) k91Var.B).clear();
    }

    @Override // defpackage.q65
    public final void a0(int i, int i2) {
        k91 k91Var = this.K;
        k91Var.G();
        ((SparseIntArray) k91Var.B).clear();
    }

    @Override // defpackage.q65
    public final void b0(int i, int i2) {
        k91 k91Var = this.K;
        k91Var.G();
        ((SparseIntArray) k91Var.B).clear();
    }

    @Override // defpackage.q65
    public final void c0(int i, int i2) {
        k91 k91Var = this.K;
        k91Var.G();
        ((SparseIntArray) k91Var.B).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.q65
    public final void d0(w65 w65Var, c75 c75Var) {
        boolean z = c75Var.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int v = v();
            for (int i = 0; i < v; i++) {
                go2 go2Var = (go2) u(i).getLayoutParams();
                int b = go2Var.a.b();
                sparseIntArray2.put(b, go2Var.f);
                sparseIntArray.put(b, go2Var.e);
            }
        }
        super.d0(w65Var, c75Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(boolean z) {
        if (!z) {
            super.d1(false);
        } else {
            vd6.i("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.q65
    public final void e0(c75 c75Var) {
        View q;
        super.e0(c75Var);
        this.E = false;
        int i = this.M;
        if (i != -1 && (q = q(i)) != null) {
            q.sendAccessibilityEvent(67108864);
            this.M = -1;
        }
    }

    @Override // defpackage.q65
    public final boolean f(r65 r65Var) {
        return r65Var instanceof go2;
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
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.q65
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i0(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.i0(int, android.os.Bundle):boolean");
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
            return o1(i, recyclerView.L, recyclerView.c1);
        }
        return p1(i, recyclerView.L, recyclerView.c1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.q65
    public final int k(c75 c75Var) {
        return G0(c75Var);
    }

    public final int k1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        if (i2 == 1) {
            return o1(i, recyclerView.L, recyclerView.c1);
        }
        return p1(i, recyclerView.L, recyclerView.c1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.q65
    public final int l(c75 c75Var) {
        return H0(c75Var);
    }

    public final HashSet l1(int i) {
        return m1(k1(i), i);
    }

    public final HashSet m1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.b;
        int q1 = q1(i2, recyclerView.L, recyclerView.c1);
        for (int i3 = i; i3 < i + q1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.q65
    public final int n(c75 c75Var) {
        return G0(c75Var);
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

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.q65
    public final int o(c75 c75Var) {
        return H0(c75Var);
    }

    public final int o1(int i, w65 w65Var, c75 c75Var) {
        boolean z = c75Var.g;
        k91 k91Var = this.K;
        if (!z) {
            int i2 = this.F;
            k91Var.getClass();
            return k91.F(i, i2);
        }
        int b = w65Var.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        int i3 = this.F;
        k91Var.getClass();
        return k91.F(b, i3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.q65
    public final int p0(int i, w65 w65Var, c75 c75Var) {
        t1();
        i1();
        return super.p0(i, w65Var, c75Var);
    }

    public final int p1(int i, w65 w65Var, c75 c75Var) {
        boolean z = c75Var.g;
        k91 k91Var = this.K;
        if (!z) {
            int i2 = this.F;
            k91Var.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b = w65Var.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        int i4 = this.F;
        k91Var.getClass();
        return b % i4;
    }

    public final int q1(int i, w65 w65Var, c75 c75Var) {
        boolean z = c75Var.g;
        k91 k91Var = this.K;
        if (!z) {
            k91Var.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (w65Var.b(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        k91Var.getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.q65
    public final r65 r() {
        if (this.p == 0) {
            return new go2(-2, -1);
        }
        return new go2(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.q65
    public final int r0(int i, w65 w65Var, c75 c75Var) {
        t1();
        i1();
        return super.r0(i, w65Var, c75Var);
    }

    public final void r1(View view, int i, boolean z) {
        int i2;
        int i3;
        boolean x0;
        go2 go2Var = (go2) view.getLayoutParams();
        Rect rect = go2Var.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) go2Var).topMargin + ((ViewGroup.MarginLayoutParams) go2Var).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) go2Var).leftMargin + ((ViewGroup.MarginLayoutParams) go2Var).rightMargin;
        int n1 = n1(go2Var.e, go2Var.f);
        if (this.p == 1) {
            i3 = q65.w(false, n1, i, i5, ((ViewGroup.MarginLayoutParams) go2Var).width);
            i2 = q65.w(true, this.r.n(), this.m, i4, ((ViewGroup.MarginLayoutParams) go2Var).height);
        } else {
            int w = q65.w(false, n1, i, i4, ((ViewGroup.MarginLayoutParams) go2Var).height);
            int w2 = q65.w(true, this.r.n(), this.l, i5, ((ViewGroup.MarginLayoutParams) go2Var).width);
            i2 = w;
            i3 = w2;
        }
        r65 r65Var = (r65) view.getLayoutParams();
        if (z) {
            x0 = z0(view, i3, i2, r65Var);
        } else {
            x0 = x0(view, i3, i2, r65Var);
        }
        if (x0) {
            view.measure(i3, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [r65, go2] */
    @Override // defpackage.q65
    public final r65 s(Context context, AttributeSet attributeSet) {
        ?? r65Var = new r65(context, attributeSet);
        r65Var.e = -1;
        r65Var.f = 0;
        return r65Var;
    }

    public final void s1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i >= 1) {
            this.F = i;
            this.K.G();
            o0();
            return;
        }
        i.i(wh1.g(i, "Span count should be at least 1. Provided "));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [r65, go2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [r65, go2] */
    @Override // defpackage.q65
    public final r65 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? r65Var = new r65((ViewGroup.MarginLayoutParams) layoutParams);
            r65Var.e = -1;
            r65Var.f = 0;
            return r65Var;
        }
        ?? r65Var2 = new r65(layoutParams);
        r65Var2.e = -1;
        r65Var2.f = 0;
        return r65Var2;
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

    @Override // defpackage.q65
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
            WeakHashMap weakHashMap = aa7.a;
            g2 = q65.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            g = q65.g(i, iArr[iArr.length - 1] + E, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = aa7.a;
            g = q65.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            g2 = q65.g(i2, iArr2[iArr2.length - 1] + C, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    @Override // defpackage.q65
    public final int x(w65 w65Var, c75 c75Var) {
        if (this.p == 1) {
            return Math.min(this.F, B());
        }
        if (c75Var.b() < 1) {
            return 0;
        }
        return o1(c75Var.b() - 1, w65Var, c75Var) + 1;
    }

    public GridLayoutManager() {
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new k91(22);
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
        this.K = new k91(22);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(i);
    }
}
