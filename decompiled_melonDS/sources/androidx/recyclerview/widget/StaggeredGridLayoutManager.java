package androidx.recyclerview.widget;

import a0.g;
import a0.j;
import a1.s;
import a6.x0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.preference.Preference;
import b6.f;
import c1.h2;
import j7.c0;
import j7.e0;
import j7.e1;
import j7.f1;
import j7.n1;
import j7.o;
import j7.o1;
import j7.q1;
import j7.t0;
import j7.u0;
import j7.v0;
import j7.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends u0 implements e1 {
    public final g B;
    public final int C;
    public boolean D;
    public boolean E;
    public q1 F;
    public final Rect G;
    public final n1 H;
    public final boolean I;
    public int[] J;
    public final ad.g K;

    /* renamed from: p  reason: collision with root package name */
    public final int f1666p;

    /* renamed from: q  reason: collision with root package name */
    public final s[] f1667q;

    /* renamed from: r  reason: collision with root package name */
    public final e0 f1668r;

    /* renamed from: s  reason: collision with root package name */
    public final e0 f1669s;

    /* renamed from: t  reason: collision with root package name */
    public final int f1670t;

    /* renamed from: u  reason: collision with root package name */
    public int f1671u;

    /* renamed from: v  reason: collision with root package name */
    public final x f1672v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1673w;

    /* renamed from: y  reason: collision with root package name */
    public final BitSet f1675y;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1674x = false;

    /* renamed from: z  reason: collision with root package name */
    public int f1676z = -1;
    public int A = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r6v3, types: [j7.x, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i10) {
        this.f1666p = -1;
        this.f1673w = false;
        g gVar = new g(27, false);
        this.B = gVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new n1(this);
        this.I = true;
        this.K = new ad.g(6, this);
        t0 H = u0.H(context, attributeSet, i2, i10);
        int i11 = H.f7699a;
        if (i11 != 0 && i11 != 1) {
            j.h("invalid orientation.");
            throw null;
        }
        c(null);
        if (i11 != this.f1670t) {
            this.f1670t = i11;
            e0 e0Var = this.f1668r;
            this.f1668r = this.f1669s;
            this.f1669s = e0Var;
            o0();
        }
        int i12 = H.f7700b;
        c(null);
        if (i12 != this.f1666p) {
            gVar.i();
            o0();
            this.f1666p = i12;
            this.f1675y = new BitSet(this.f1666p);
            this.f1667q = new s[this.f1666p];
            for (int i13 = 0; i13 < this.f1666p; i13++) {
                this.f1667q[i13] = new s(this, i13);
            }
            o0();
        }
        boolean z10 = H.f7701c;
        c(null);
        q1 q1Var = this.F;
        if (q1Var != null && q1Var.f7656b0 != z10) {
            q1Var.f7656b0 = z10;
        }
        this.f1673w = z10;
        o0();
        ?? obj = new Object();
        obj.f7728a = true;
        obj.f7733f = 0;
        obj.f7734g = 0;
        this.f1672v = obj;
        this.f1668r = e0.b(this, this.f1670t);
        this.f1669s = e0.b(this, 1 - this.f1670t);
    }

    public static int d1(int i2, int i10, int i11) {
        int mode;
        if ((i10 == 0 && i11 == 0) || ((mode = View.MeasureSpec.getMode(i2)) != Integer.MIN_VALUE && mode != 1073741824)) {
            return i2;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i10) - i11), mode);
    }

    @Override // j7.u0
    public final void A0(RecyclerView recyclerView, int i2) {
        c0 c0Var = new c0(recyclerView.getContext());
        c0Var.f7507a = i2;
        B0(c0Var);
    }

    @Override // j7.u0
    public final boolean C0() {
        if (this.F == null) {
            return true;
        }
        return false;
    }

    public final boolean D0() {
        int K0;
        if (v() != 0 && this.C != 0 && this.f7714g) {
            if (this.f1674x) {
                K0 = L0();
                K0();
            } else {
                K0 = K0();
                L0();
            }
            if (K0 == 0 && P0() != null) {
                this.B.i();
                this.f7713f = true;
                o0();
                return true;
            }
        }
        return false;
    }

    public final int E0(f1 f1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return o.e(f1Var, this.f1668r, H0(z10), G0(z10), this, this.I, this.f1674x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0260, code lost:
        V0(r20, r3);
     */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int F0(c1.h2 r20, j7.x r21, j7.f1 r22) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.F0(c1.h2, j7.x, j7.f1):int");
    }

    public final View G0(boolean z10) {
        int m = this.f1668r.m();
        int i2 = this.f1668r.i();
        View view = null;
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            View u4 = u(v10);
            int g10 = this.f1668r.g(u4);
            int d4 = this.f1668r.d(u4);
            if (d4 > m && g10 < i2) {
                if (d4 > i2 && z10) {
                    if (view == null) {
                        view = u4;
                    }
                } else {
                    return u4;
                }
            }
        }
        return view;
    }

    public final View H0(boolean z10) {
        int m = this.f1668r.m();
        int i2 = this.f1668r.i();
        int v10 = v();
        View view = null;
        for (int i10 = 0; i10 < v10; i10++) {
            View u4 = u(i10);
            int g10 = this.f1668r.g(u4);
            if (this.f1668r.d(u4) > m && g10 < i2) {
                if (g10 < m && z10) {
                    if (view == null) {
                        view = u4;
                    }
                } else {
                    return u4;
                }
            }
        }
        return view;
    }

    @Override // j7.u0
    public final int I(h2 h2Var, f1 f1Var) {
        if (this.f1670t == 0) {
            return Math.min(this.f1666p, f1Var.b());
        }
        return -1;
    }

    public final void I0(h2 h2Var, f1 f1Var, boolean z10) {
        int i2;
        int M0 = M0(Integer.MIN_VALUE);
        if (M0 != Integer.MIN_VALUE && (i2 = this.f1668r.i() - M0) > 0) {
            int i10 = i2 - (-Z0(-i2, h2Var, f1Var));
            if (z10 && i10 > 0) {
                this.f1668r.q(i10);
            }
        }
    }

    public final void J0(h2 h2Var, f1 f1Var, boolean z10) {
        int m;
        int N0 = N0(Preference.DEFAULT_ORDER);
        if (N0 != Integer.MAX_VALUE && (m = N0 - this.f1668r.m()) > 0) {
            int Z0 = m - Z0(m, h2Var, f1Var);
            if (z10 && Z0 > 0) {
                this.f1668r.q(-Z0);
            }
        }
    }

    @Override // j7.u0
    public final boolean K() {
        if (this.C != 0) {
            return true;
        }
        return false;
    }

    public final int K0() {
        if (v() == 0) {
            return 0;
        }
        return u0.G(u(0));
    }

    @Override // j7.u0
    public final boolean L() {
        return this.f1673w;
    }

    public final int L0() {
        int v10 = v();
        if (v10 == 0) {
            return 0;
        }
        return u0.G(u(v10 - 1));
    }

    public final int M0(int i2) {
        int i10 = this.f1667q[0].i(i2);
        for (int i11 = 1; i11 < this.f1666p; i11++) {
            int i12 = this.f1667q[i11].i(i2);
            if (i12 > i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    public final int N0(int i2) {
        int k10 = this.f1667q[0].k(i2);
        for (int i10 = 1; i10 < this.f1666p; i10++) {
            int k11 = this.f1667q[i10].k(i2);
            if (k11 < k10) {
                k10 = k11;
            }
        }
        return k10;
    }

    @Override // j7.u0
    public final void O(int i2) {
        super.O(i2);
        for (int i10 = 0; i10 < this.f1666p; i10++) {
            s sVar = this.f1667q[i10];
            int i11 = sVar.f94b;
            if (i11 != Integer.MIN_VALUE) {
                sVar.f94b = i11 + i2;
            }
            int i12 = sVar.f95c;
            if (i12 != Integer.MIN_VALUE) {
                sVar.f95c = i12 + i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O0(int, int, int):void");
    }

    @Override // j7.u0
    public final void P(int i2) {
        super.P(i2);
        for (int i10 = 0; i10 < this.f1666p; i10++) {
            s sVar = this.f1667q[i10];
            int i11 = sVar.f94b;
            if (i11 != Integer.MIN_VALUE) {
                sVar.f94b = i11 + i2;
            }
            int i12 = sVar.f95c;
            if (i12 != Integer.MIN_VALUE) {
                sVar.f95c = i12 + i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View P0() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P0():android.view.View");
    }

    @Override // j7.u0
    public final void Q() {
        this.B.i();
        for (int i2 = 0; i2 < this.f1666p; i2++) {
            this.f1667q[i2].b();
        }
    }

    public final boolean Q0() {
        if (this.f7709b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void R0(View view, int i2, int i10) {
        RecyclerView recyclerView = this.f7709b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.O(view));
        }
        o1 o1Var = (o1) view.getLayoutParams();
        int d12 = d1(i2, ((ViewGroup.MarginLayoutParams) o1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) o1Var).rightMargin + rect.right);
        int d13 = d1(i10, ((ViewGroup.MarginLayoutParams) o1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) o1Var).bottomMargin + rect.bottom);
        if (x0(view, d12, d13, o1Var)) {
            view.measure(d12, d13);
        }
    }

    @Override // j7.u0
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7709b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i2 = 0; i2 < this.f1666p; i2++) {
            this.f1667q[i2].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0192, code lost:
        if (r16.f1674x != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a0, code lost:
        if (r11 != r16.f1674x) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a2, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a4, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x040a, code lost:
        if (D0() != false) goto L262;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S0(c1.h2 r17, j7.f1 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S0(c1.h2, j7.f1, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
        if (r8.f1670t == 1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0057, code lost:
        if (r8.f1670t == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0063, code lost:
        if (Q0() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x006f, code lost:
        if (Q0() == false) goto L114;
     */
    @Override // j7.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r9, int r10, c1.h2 r11, j7.f1 r12) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T(android.view.View, int, c1.h2, j7.f1):android.view.View");
    }

    public final boolean T0(int i2) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f1670t == 0) {
            if (i2 == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.f1674x) {
                return false;
            }
            return true;
        }
        if (i2 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == this.f1674x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != Q0()) {
            return false;
        }
        return true;
    }

    @Override // j7.u0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View H0 = H0(false);
            View G0 = G0(false);
            if (H0 != null && G0 != null) {
                int G = u0.G(H0);
                int G2 = u0.G(G0);
                if (G < G2) {
                    accessibilityEvent.setFromIndex(G);
                    accessibilityEvent.setToIndex(G2);
                    return;
                }
                accessibilityEvent.setFromIndex(G2);
                accessibilityEvent.setToIndex(G);
            }
        }
    }

    public final void U0(int i2, f1 f1Var) {
        int K0;
        int i10;
        if (i2 > 0) {
            K0 = L0();
            i10 = 1;
        } else {
            K0 = K0();
            i10 = -1;
        }
        x xVar = this.f1672v;
        xVar.f7728a = true;
        b1(K0, f1Var);
        a1(i10);
        xVar.f7730c = K0 + xVar.f7731d;
        xVar.f7729b = Math.abs(i2);
    }

    @Override // j7.u0
    public final void V(h2 h2Var, f1 f1Var, b6.g gVar) {
        super.V(h2Var, f1Var, gVar);
        gVar.i("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void V0(h2 h2Var, x xVar) {
        if (xVar.f7728a && !xVar.f7736i) {
            int i2 = xVar.f7729b;
            int i10 = xVar.f7732e;
            if (i2 == 0) {
                if (i10 == -1) {
                    W0(h2Var, xVar.f7734g);
                    return;
                } else {
                    X0(h2Var, xVar.f7733f);
                    return;
                }
            }
            int i11 = 1;
            if (i10 == -1) {
                int i12 = xVar.f7733f;
                int k10 = this.f1667q[0].k(i12);
                while (i11 < this.f1666p) {
                    int k11 = this.f1667q[i11].k(i12);
                    if (k11 > k10) {
                        k10 = k11;
                    }
                    i11++;
                }
                int i13 = i12 - k10;
                int i14 = xVar.f7734g;
                if (i13 >= 0) {
                    i14 -= Math.min(i13, xVar.f7729b);
                }
                W0(h2Var, i14);
                return;
            }
            int i15 = xVar.f7734g;
            int i16 = this.f1667q[0].i(i15);
            while (i11 < this.f1666p) {
                int i17 = this.f1667q[i11].i(i15);
                if (i17 < i16) {
                    i16 = i17;
                }
                i11++;
            }
            int i18 = i16 - xVar.f7734g;
            int i19 = xVar.f7733f;
            if (i18 >= 0) {
                i19 += Math.min(i18, xVar.f7729b);
            }
            X0(h2Var, i19);
        }
    }

    public final void W0(h2 h2Var, int i2) {
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            View u4 = u(v10);
            if (this.f1668r.g(u4) >= i2 && this.f1668r.p(u4) >= i2) {
                o1 o1Var = (o1) u4.getLayoutParams();
                o1Var.getClass();
                if (((ArrayList) o1Var.f7644e.f98f).size() != 1) {
                    s sVar = o1Var.f7644e;
                    ArrayList arrayList = (ArrayList) sVar.f98f;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    o1 o1Var2 = (o1) view.getLayoutParams();
                    o1Var2.f7644e = null;
                    if (o1Var2.f7722a.h() || o1Var2.f7722a.k()) {
                        sVar.f96d -= ((StaggeredGridLayoutManager) sVar.f99g).f1668r.e(view);
                    }
                    if (size == 1) {
                        sVar.f94b = Integer.MIN_VALUE;
                    }
                    sVar.f95c = Integer.MIN_VALUE;
                    l0(u4, h2Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // j7.u0
    public final void X(h2 h2Var, f1 f1Var, View view, b6.g gVar) {
        int i2;
        int i10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof o1)) {
            W(view, gVar);
            return;
        }
        s sVar = ((o1) layoutParams).f7644e;
        if (this.f1670t == 0) {
            if (sVar == null) {
                i10 = -1;
            } else {
                i10 = sVar.f97e;
            }
            gVar.k(f.a(false, i10, 1, -1, -1));
            return;
        }
        if (sVar == null) {
            i2 = -1;
        } else {
            i2 = sVar.f97e;
        }
        gVar.k(f.a(false, -1, -1, i2, 1));
    }

    public final void X0(h2 h2Var, int i2) {
        while (v() > 0) {
            View u4 = u(0);
            if (this.f1668r.d(u4) <= i2 && this.f1668r.o(u4) <= i2) {
                o1 o1Var = (o1) u4.getLayoutParams();
                o1Var.getClass();
                if (((ArrayList) o1Var.f7644e.f98f).size() != 1) {
                    s sVar = o1Var.f7644e;
                    ArrayList arrayList = (ArrayList) sVar.f98f;
                    View view = (View) arrayList.remove(0);
                    o1 o1Var2 = (o1) view.getLayoutParams();
                    o1Var2.f7644e = null;
                    if (arrayList.size() == 0) {
                        sVar.f95c = Integer.MIN_VALUE;
                    }
                    if (o1Var2.f7722a.h() || o1Var2.f7722a.k()) {
                        sVar.f96d -= ((StaggeredGridLayoutManager) sVar.f99g).f1668r.e(view);
                    }
                    sVar.f94b = Integer.MIN_VALUE;
                    l0(u4, h2Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // j7.u0
    public final void Y(int i2, int i10) {
        O0(i2, i10, 1);
    }

    public final void Y0() {
        if (this.f1670t != 1 && Q0()) {
            this.f1674x = !this.f1673w;
        } else {
            this.f1674x = this.f1673w;
        }
    }

    @Override // j7.u0
    public final void Z() {
        this.B.i();
        o0();
    }

    public final int Z0(int i2, h2 h2Var, f1 f1Var) {
        if (v() == 0 || i2 == 0) {
            return 0;
        }
        U0(i2, f1Var);
        x xVar = this.f1672v;
        int F0 = F0(h2Var, xVar, f1Var);
        if (xVar.f7729b >= F0) {
            if (i2 < 0) {
                i2 = -F0;
            } else {
                i2 = F0;
            }
        }
        this.f1668r.q(-i2);
        this.D = this.f1674x;
        xVar.f7729b = 0;
        V0(h2Var, xVar);
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r4 != r3.f1674x) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r3.f1674x != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        r1 = 1;
     */
    @Override // j7.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f1674x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.K0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f1674x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f1670t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    @Override // j7.u0
    public final void a0(int i2, int i10) {
        O0(i2, i10, 8);
    }

    public final void a1(int i2) {
        boolean z10;
        x xVar = this.f1672v;
        xVar.f7732e = i2;
        boolean z11 = this.f1674x;
        int i10 = 1;
        if (i2 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            i10 = -1;
        }
        xVar.f7731d = i10;
    }

    @Override // j7.u0
    public final void b0(int i2, int i10) {
        O0(i2, i10, 2);
    }

    public final void b1(int i2, f1 f1Var) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        x xVar = this.f1672v;
        boolean z11 = false;
        xVar.f7729b = 0;
        xVar.f7730c = i2;
        c0 c0Var = this.f7712e;
        if (c0Var != null && c0Var.f7511e && (i12 = f1Var.f7550a) != -1) {
            boolean z12 = this.f1674x;
            if (i12 < i2) {
                z10 = true;
            } else {
                z10 = false;
            }
            e0 e0Var = this.f1668r;
            if (z12 == z10) {
                i10 = e0Var.n();
                i11 = 0;
            } else {
                i11 = e0Var.n();
                i10 = 0;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        RecyclerView recyclerView = this.f7709b;
        if (recyclerView != null && recyclerView.f1628e0) {
            xVar.f7733f = this.f1668r.m() - i11;
            xVar.f7734g = this.f1668r.i() + i10;
        } else {
            xVar.f7734g = this.f1668r.h() + i10;
            xVar.f7733f = -i11;
        }
        xVar.f7735h = false;
        xVar.f7728a = true;
        if (this.f1668r.k() == 0 && this.f1668r.h() == 0) {
            z11 = true;
        }
        xVar.f7736i = z11;
    }

    @Override // j7.u0
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // j7.u0
    public final void c0(int i2, int i10) {
        O0(i2, i10, 4);
    }

    public final void c1(s sVar, int i2, int i10) {
        int i11 = sVar.f96d;
        int i12 = sVar.f97e;
        if (i2 == -1) {
            int i13 = sVar.f94b;
            if (i13 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) sVar.f98f).get(0);
                sVar.f94b = ((StaggeredGridLayoutManager) sVar.f99g).f1668r.g(view);
                ((o1) view.getLayoutParams()).getClass();
                i13 = sVar.f94b;
            }
            if (i13 + i11 <= i10) {
                this.f1675y.set(i12, false);
                return;
            }
            return;
        }
        int i14 = sVar.f95c;
        if (i14 == Integer.MIN_VALUE) {
            sVar.a();
            i14 = sVar.f95c;
        }
        if (i14 - i11 >= i10) {
            this.f1675y.set(i12, false);
        }
    }

    @Override // j7.u0
    public final boolean d() {
        if (this.f1670t == 0) {
            return true;
        }
        return false;
    }

    @Override // j7.u0
    public final void d0(h2 h2Var, f1 f1Var) {
        S0(h2Var, f1Var, true);
    }

    @Override // j7.u0
    public final boolean e() {
        if (this.f1670t == 1) {
            return true;
        }
        return false;
    }

    @Override // j7.u0
    public final void e0(f1 f1Var) {
        this.f1676z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // j7.u0
    public final boolean f(v0 v0Var) {
        return v0Var instanceof o1;
    }

    @Override // j7.u0
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof q1) {
            q1 q1Var = (q1) parcelable;
            this.F = q1Var;
            if (this.f1676z != -1) {
                q1Var.A = -1;
                q1Var.B = -1;
                q1Var.R = null;
                q1Var.L = 0;
                q1Var.X = 0;
                q1Var.Y = null;
                q1Var.Z = null;
            }
            o0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, j7.q1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.os.Parcelable, java.lang.Object, j7.q1] */
    @Override // j7.u0
    public final Parcelable g0() {
        int K0;
        View H0;
        int k10;
        int m;
        int[] iArr;
        q1 q1Var = this.F;
        if (q1Var != null) {
            ?? obj = new Object();
            obj.L = q1Var.L;
            obj.A = q1Var.A;
            obj.B = q1Var.B;
            obj.R = q1Var.R;
            obj.X = q1Var.X;
            obj.Y = q1Var.Y;
            obj.f7656b0 = q1Var.f7656b0;
            obj.f7657c0 = q1Var.f7657c0;
            obj.f7658d0 = q1Var.f7658d0;
            obj.Z = q1Var.Z;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f7656b0 = this.f1673w;
        obj2.f7657c0 = this.D;
        obj2.f7658d0 = this.E;
        g gVar = this.B;
        if (gVar != null && (iArr = (int[]) gVar.B) != null) {
            obj2.Y = iArr;
            obj2.X = iArr.length;
            obj2.Z = (ArrayList) gVar.L;
        } else {
            obj2.X = 0;
        }
        int i2 = -1;
        if (v() > 0) {
            if (this.D) {
                K0 = L0();
            } else {
                K0 = K0();
            }
            obj2.A = K0;
            if (this.f1674x) {
                H0 = G0(true);
            } else {
                H0 = H0(true);
            }
            if (H0 != null) {
                i2 = u0.G(H0);
            }
            obj2.B = i2;
            int i10 = this.f1666p;
            obj2.L = i10;
            obj2.R = new int[i10];
            for (int i11 = 0; i11 < this.f1666p; i11++) {
                boolean z10 = this.D;
                s[] sVarArr = this.f1667q;
                if (z10) {
                    k10 = sVarArr[i11].i(Integer.MIN_VALUE);
                    if (k10 != Integer.MIN_VALUE) {
                        m = this.f1668r.i();
                        k10 -= m;
                        obj2.R[i11] = k10;
                    } else {
                        obj2.R[i11] = k10;
                    }
                } else {
                    k10 = sVarArr[i11].k(Integer.MIN_VALUE);
                    if (k10 != Integer.MIN_VALUE) {
                        m = this.f1668r.m();
                        k10 -= m;
                        obj2.R[i11] = k10;
                    } else {
                        obj2.R[i11] = k10;
                    }
                }
            }
            return obj2;
        }
        obj2.A = -1;
        obj2.B = -1;
        obj2.L = 0;
        return obj2;
    }

    @Override // j7.u0
    public final void h(int i2, int i10, f1 f1Var, f2.s sVar) {
        x xVar;
        int i11;
        int i12;
        if (this.f1670t != 0) {
            i2 = i10;
        }
        if (v() != 0 && i2 != 0) {
            U0(i2, f1Var);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f1666p) {
                this.J = new int[this.f1666p];
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.f1666p;
                xVar = this.f1672v;
                if (i13 >= i15) {
                    break;
                }
                if (xVar.f7731d == -1) {
                    i11 = xVar.f7733f;
                    i12 = this.f1667q[i13].k(i11);
                } else {
                    i11 = this.f1667q[i13].i(xVar.f7734g);
                    i12 = xVar.f7734g;
                }
                int i16 = i11 - i12;
                if (i16 >= 0) {
                    this.J[i14] = i16;
                    i14++;
                }
                i13++;
            }
            Arrays.sort(this.J, 0, i14);
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = xVar.f7730c;
                if (i18 >= 0 && i18 < f1Var.b()) {
                    sVar.a(xVar.f7730c, this.J[i17]);
                    xVar.f7730c += xVar.f7731d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // j7.u0
    public final void h0(int i2) {
        if (i2 == 0) {
            D0();
        }
    }

    @Override // j7.u0
    public final int j(f1 f1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return o.d(f1Var, this.f1668r, H0(z10), G0(z10), this, this.I);
    }

    @Override // j7.u0
    public final int k(f1 f1Var) {
        return E0(f1Var);
    }

    @Override // j7.u0
    public final int l(f1 f1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return o.f(f1Var, this.f1668r, H0(z10), G0(z10), this, this.I);
    }

    @Override // j7.u0
    public final int m(f1 f1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return o.d(f1Var, this.f1668r, H0(z10), G0(z10), this, this.I);
    }

    @Override // j7.u0
    public final int n(f1 f1Var) {
        return E0(f1Var);
    }

    @Override // j7.u0
    public final int o(f1 f1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return o.f(f1Var, this.f1668r, H0(z10), G0(z10), this, this.I);
    }

    @Override // j7.u0
    public final int p0(int i2, h2 h2Var, f1 f1Var) {
        return Z0(i2, h2Var, f1Var);
    }

    @Override // j7.u0
    public final void q0(int i2) {
        q1 q1Var = this.F;
        if (q1Var != null && q1Var.A != i2) {
            q1Var.R = null;
            q1Var.L = 0;
            q1Var.A = -1;
            q1Var.B = -1;
        }
        this.f1676z = i2;
        this.A = Integer.MIN_VALUE;
        o0();
    }

    @Override // j7.u0
    public final v0 r() {
        if (this.f1670t == 0) {
            return new v0(-2, -1);
        }
        return new v0(-1, -2);
    }

    @Override // j7.u0
    public final int r0(int i2, h2 h2Var, f1 f1Var) {
        return Z0(i2, h2Var, f1Var);
    }

    @Override // j7.u0
    public final v0 s(Context context, AttributeSet attributeSet) {
        return new v0(context, attributeSet);
    }

    @Override // j7.u0
    public final v0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new v0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new v0(layoutParams);
    }

    @Override // j7.u0
    public final void u0(Rect rect, int i2, int i10) {
        int g10;
        int g11;
        int E = E() + D();
        int C = C() + F();
        int i11 = this.f1670t;
        int i12 = this.f1666p;
        if (i11 == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f7709b;
            WeakHashMap weakHashMap = x0.f533a;
            g11 = u0.g(i10, height, recyclerView.getMinimumHeight());
            g10 = u0.g(i2, (this.f1671u * i12) + E, this.f7709b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.f7709b;
            WeakHashMap weakHashMap2 = x0.f533a;
            g10 = u0.g(i2, width, recyclerView2.getMinimumWidth());
            g11 = u0.g(i10, (this.f1671u * i12) + C, this.f7709b.getMinimumHeight());
        }
        this.f7709b.setMeasuredDimension(g10, g11);
    }

    @Override // j7.u0
    public final int x(h2 h2Var, f1 f1Var) {
        if (this.f1670t == 1) {
            return Math.min(this.f1666p, f1Var.b());
        }
        return -1;
    }
}
