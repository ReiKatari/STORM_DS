package androidx.recyclerview.widget;

import a0.g;
import a0.j;
import a6.x0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import b6.d;
import b6.f;
import c1.h2;
import f2.s;
import j7.a0;
import j7.f1;
import j7.k0;
import j7.u0;
import j7.v0;
import j7.w;
import j7.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final g K;
    public final Rect L;
    public int M;
    public int N;
    public int O;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i10) {
        super(context, attributeSet, i2, i10);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new g(26);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(u0.H(context, attributeSet, i2, i10).f7700b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j7.u0
    public final boolean C0() {
        if (this.f1615z == null && !this.E) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void E0(f1 f1Var, a0 a0Var, s sVar) {
        int i2;
        int i10 = this.F;
        for (int i11 = 0; i11 < this.F && (i2 = a0Var.f7493d) >= 0 && i2 < f1Var.b() && i10 > 0; i11++) {
            sVar.a(a0Var.f7493d, Math.max(0, a0Var.f7496g));
            this.K.getClass();
            i10--;
            a0Var.f7493d += a0Var.f7494e;
        }
    }

    @Override // j7.u0
    public final int I(h2 h2Var, f1 f1Var) {
        if (this.f1605p == 0) {
            return Math.min(this.F, B());
        }
        if (f1Var.b() < 1) {
            return 0;
        }
        return o1(f1Var.b() - 1, h2Var, f1Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View Q0(h2 h2Var, f1 f1Var, boolean z10, boolean z11) {
        int i2;
        int i10;
        int v10 = v();
        int i11 = 1;
        if (z11) {
            i10 = v() - 1;
            i2 = -1;
            i11 = -1;
        } else {
            i2 = v10;
            i10 = 0;
        }
        int b10 = f1Var.b();
        J0();
        int m = this.f1607r.m();
        int i12 = this.f1607r.i();
        View view = null;
        View view2 = null;
        while (i10 != i2) {
            View u4 = u(i10);
            int G = u0.G(u4);
            if (G >= 0 && G < b10 && p1(G, h2Var, f1Var) == 0) {
                if (((v0) u4.getLayoutParams()).f7722a.h()) {
                    if (view2 == null) {
                        view2 = u4;
                    }
                } else if (this.f1607r.g(u4) < i12 && this.f1607r.d(u4) >= m) {
                    return u4;
                } else {
                    if (view == null) {
                        view = u4;
                    }
                }
            }
            i10 += i11;
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
        if (((java.util.ArrayList) r22.f7708a.f3863e).contains(r3) != false) goto L4;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, j7.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r23, int r24, c1.h2 r25, j7.f1 r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, c1.h2, j7.f1):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j7.u0
    public final void V(h2 h2Var, f1 f1Var, b6.g gVar) {
        super.V(h2Var, f1Var, gVar);
        gVar.i(GridView.class.getName());
        k0 k0Var = this.f7709b.f1638j0;
        if (k0Var != null && k0Var.a() > 1) {
            gVar.b(d.f2068r);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        r22.f7747b = true;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W0(c1.h2 r19, j7.f1 r20, j7.a0 r21, j7.z r22) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.W0(c1.h2, j7.f1, j7.a0, j7.z):void");
    }

    @Override // j7.u0
    public final void X(h2 h2Var, f1 f1Var, View view, b6.g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof w)) {
            W(view, gVar);
            return;
        }
        w wVar = (w) layoutParams;
        int o12 = o1(wVar.f7722a.b(), h2Var, f1Var);
        int i2 = this.f1605p;
        int i10 = wVar.f7726e;
        int i11 = wVar.f7727f;
        if (i2 == 0) {
            gVar.k(f.a(false, i10, i11, o12, 1));
        } else {
            gVar.k(f.a(false, o12, 1, i10, i11));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(h2 h2Var, f1 f1Var, y yVar, int i2) {
        boolean z10;
        t1();
        if (f1Var.b() > 0 && !f1Var.f7556g) {
            if (i2 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int p12 = p1(yVar.f7738b, h2Var, f1Var);
            if (z10) {
                while (p12 > 0) {
                    int i10 = yVar.f7738b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    yVar.f7738b = i11;
                    p12 = p1(i11, h2Var, f1Var);
                }
            } else {
                int b10 = f1Var.b() - 1;
                int i12 = yVar.f7738b;
                while (i12 < b10) {
                    int i13 = i12 + 1;
                    int p13 = p1(i13, h2Var, f1Var);
                    if (p13 <= p12) {
                        break;
                    }
                    i12 = i13;
                    p12 = p13;
                }
                yVar.f7738b = i12;
            }
        }
        i1();
    }

    @Override // j7.u0
    public final void Y(int i2, int i10) {
        g gVar = this.K;
        gVar.u();
        ((SparseIntArray) gVar.L).clear();
    }

    @Override // j7.u0
    public final void Z() {
        g gVar = this.K;
        gVar.u();
        ((SparseIntArray) gVar.L).clear();
    }

    @Override // j7.u0
    public final void a0(int i2, int i10) {
        g gVar = this.K;
        gVar.u();
        ((SparseIntArray) gVar.L).clear();
    }

    @Override // j7.u0
    public final void b0(int i2, int i10) {
        g gVar = this.K;
        gVar.u();
        ((SparseIntArray) gVar.L).clear();
    }

    @Override // j7.u0
    public final void c0(int i2, int i10) {
        g gVar = this.K;
        gVar.u();
        ((SparseIntArray) gVar.L).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j7.u0
    public final void d0(h2 h2Var, f1 f1Var) {
        boolean z10 = f1Var.f7556g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z10) {
            int v10 = v();
            for (int i2 = 0; i2 < v10; i2++) {
                w wVar = (w) u(i2).getLayoutParams();
                int b10 = wVar.f7722a.b();
                sparseIntArray2.put(b10, wVar.f7727f);
                sparseIntArray.put(b10, wVar.f7726e);
            }
        }
        super.d0(h2Var, f1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(boolean z10) {
        if (!z10) {
            super.d1(false);
        } else {
            o.v("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j7.u0
    public final void e0(f1 f1Var) {
        View q10;
        super.e0(f1Var);
        this.E = false;
        int i2 = this.M;
        if (i2 != -1 && (q10 = q(i2)) != null) {
            q10.sendAccessibilityEvent(67108864);
            this.M = -1;
        }
    }

    @Override // j7.u0
    public final boolean f(v0 v0Var) {
        return v0Var instanceof w;
    }

    public final void h1(int i2) {
        int i10;
        int[] iArr = this.G;
        int i11 = this.F;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i11 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i2 / i11;
        int i14 = i2 % i11;
        int i15 = 0;
        for (int i16 = 1; i16 <= i11; i16++) {
            i12 += i14;
            if (i12 > 0 && i11 - i12 < i14) {
                i10 = i13 + 1;
                i12 -= i11;
            } else {
                i10 = i13;
            }
            i15 += i10;
            iArr[i16] = i15;
        }
        this.G = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0284  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, j7.u0
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

    public final int j1(int i2) {
        int i10 = this.f1605p;
        RecyclerView recyclerView = this.f7709b;
        if (i10 == 0) {
            return o1(i2, recyclerView.L, recyclerView.f1621a1);
        }
        return p1(i2, recyclerView.L, recyclerView.f1621a1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j7.u0
    public final int k(f1 f1Var) {
        return G0(f1Var);
    }

    public final int k1(int i2) {
        int i10 = this.f1605p;
        RecyclerView recyclerView = this.f7709b;
        if (i10 == 1) {
            return o1(i2, recyclerView.L, recyclerView.f1621a1);
        }
        return p1(i2, recyclerView.L, recyclerView.f1621a1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j7.u0
    public final int l(f1 f1Var) {
        return H0(f1Var);
    }

    public final HashSet l1(int i2) {
        return m1(k1(i2), i2);
    }

    public final HashSet m1(int i2, int i10) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f7709b;
        int q12 = q1(i10, recyclerView.L, recyclerView.f1621a1);
        for (int i11 = i2; i11 < i2 + q12; i11++) {
            hashSet.add(Integer.valueOf(i11));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j7.u0
    public final int n(f1 f1Var) {
        return G0(f1Var);
    }

    public final int n1(int i2, int i10) {
        if (this.f1605p == 1 && V0()) {
            int[] iArr = this.G;
            int i11 = this.F;
            return iArr[i11 - i2] - iArr[(i11 - i2) - i10];
        }
        int[] iArr2 = this.G;
        return iArr2[i10 + i2] - iArr2[i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j7.u0
    public final int o(f1 f1Var) {
        return H0(f1Var);
    }

    public final int o1(int i2, h2 h2Var, f1 f1Var) {
        boolean z10 = f1Var.f7556g;
        g gVar = this.K;
        if (!z10) {
            int i10 = this.F;
            gVar.getClass();
            return g.t(i2, i10);
        }
        int b10 = h2Var.b(i2);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
            return 0;
        }
        int i11 = this.F;
        gVar.getClass();
        return g.t(b10, i11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j7.u0
    public final int p0(int i2, h2 h2Var, f1 f1Var) {
        t1();
        i1();
        return super.p0(i2, h2Var, f1Var);
    }

    public final int p1(int i2, h2 h2Var, f1 f1Var) {
        boolean z10 = f1Var.f7556g;
        g gVar = this.K;
        if (!z10) {
            int i10 = this.F;
            gVar.getClass();
            return i2 % i10;
        }
        int i11 = this.J.get(i2, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = h2Var.b(i2);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
            return 0;
        }
        int i12 = this.F;
        gVar.getClass();
        return b10 % i12;
    }

    public final int q1(int i2, h2 h2Var, f1 f1Var) {
        boolean z10 = f1Var.f7556g;
        g gVar = this.K;
        if (!z10) {
            gVar.getClass();
            return 1;
        }
        int i10 = this.I.get(i2, -1);
        if (i10 != -1) {
            return i10;
        }
        if (h2Var.b(i2) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
            return 1;
        }
        gVar.getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j7.u0
    public final v0 r() {
        if (this.f1605p == 0) {
            return new w(-2, -1);
        }
        return new w(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j7.u0
    public final int r0(int i2, h2 h2Var, f1 f1Var) {
        t1();
        i1();
        return super.r0(i2, h2Var, f1Var);
    }

    public final void r1(View view, int i2, boolean z10) {
        int i10;
        int i11;
        boolean x02;
        w wVar = (w) view.getLayoutParams();
        Rect rect = wVar.f7723b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) wVar).topMargin + ((ViewGroup.MarginLayoutParams) wVar).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) wVar).leftMargin + ((ViewGroup.MarginLayoutParams) wVar).rightMargin;
        int n12 = n1(wVar.f7726e, wVar.f7727f);
        if (this.f1605p == 1) {
            i11 = u0.w(false, n12, i2, i13, ((ViewGroup.MarginLayoutParams) wVar).width);
            i10 = u0.w(true, this.f1607r.n(), this.m, i12, ((ViewGroup.MarginLayoutParams) wVar).height);
        } else {
            int w10 = u0.w(false, n12, i2, i12, ((ViewGroup.MarginLayoutParams) wVar).height);
            int w11 = u0.w(true, this.f1607r.n(), this.f7719l, i13, ((ViewGroup.MarginLayoutParams) wVar).width);
            i10 = w10;
            i11 = w11;
        }
        v0 v0Var = (v0) view.getLayoutParams();
        if (z10) {
            x02 = z0(view, i11, i10, v0Var);
        } else {
            x02 = x0(view, i11, i10, v0Var);
        }
        if (x02) {
            view.measure(i11, i10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j7.v0, j7.w] */
    @Override // j7.u0
    public final v0 s(Context context, AttributeSet attributeSet) {
        ?? v0Var = new v0(context, attributeSet);
        v0Var.f7726e = -1;
        v0Var.f7727f = 0;
        return v0Var;
    }

    public final void s1(int i2) {
        if (i2 == this.F) {
            return;
        }
        this.E = true;
        if (i2 >= 1) {
            this.F = i2;
            this.K.u();
            o0();
            return;
        }
        j.h(w.d.l(i2, "Span count should be at least 1. Provided "));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j7.v0, j7.w] */
    /* JADX WARN: Type inference failed for: r0v2, types: [j7.v0, j7.w] */
    @Override // j7.u0
    public final v0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? v0Var = new v0((ViewGroup.MarginLayoutParams) layoutParams);
            v0Var.f7726e = -1;
            v0Var.f7727f = 0;
            return v0Var;
        }
        ?? v0Var2 = new v0(layoutParams);
        v0Var2.f7726e = -1;
        v0Var2.f7727f = 0;
        return v0Var2;
    }

    public final void t1() {
        int C;
        int F;
        if (this.f1605p == 1) {
            C = this.f7720n - E();
            F = D();
        } else {
            C = this.f7721o - C();
            F = F();
        }
        h1(C - F);
    }

    @Override // j7.u0
    public final void u0(Rect rect, int i2, int i10) {
        int g10;
        int g11;
        if (this.G == null) {
            super.u0(rect, i2, i10);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.f1605p == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f7709b;
            WeakHashMap weakHashMap = x0.f533a;
            g11 = u0.g(i10, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            g10 = u0.g(i2, iArr[iArr.length - 1] + E, this.f7709b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.f7709b;
            WeakHashMap weakHashMap2 = x0.f533a;
            g10 = u0.g(i2, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            g11 = u0.g(i10, iArr2[iArr2.length - 1] + C, this.f7709b.getMinimumHeight());
        }
        this.f7709b.setMeasuredDimension(g10, g11);
    }

    @Override // j7.u0
    public final int x(h2 h2Var, f1 f1Var) {
        if (this.f1605p == 1) {
            return Math.min(this.F, B());
        }
        if (f1Var.b() < 1) {
            return 0;
        }
        return o1(f1Var.b() - 1, h2Var, f1Var) + 1;
    }

    public GridLayoutManager(int i2) {
        super(1, false);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new g(26);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(i2);
    }
}
