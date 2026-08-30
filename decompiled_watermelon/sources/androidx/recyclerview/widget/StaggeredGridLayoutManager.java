package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends q65 implements b75 {
    public final ci3 B;
    public final int C;
    public boolean D;
    public boolean E;
    public id6 F;
    public final Rect G;
    public final fd6 H;
    public final boolean I;
    public int[] J;
    public final es4 K;
    public final int p;
    public final us3[] q;
    public final io1 r;
    public final io1 s;
    public final int t;
    public int u;
    public final tg3 v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r6v3, types: [tg3, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        ci3 ci3Var = new ci3(23, false);
        this.B = ci3Var;
        this.C = 2;
        this.G = new Rect();
        this.H = new fd6(this);
        this.I = true;
        this.K = new es4(22, this);
        p65 H = q65.H(context, attributeSet, i, i2);
        int i3 = H.a;
        if (i3 != 0 && i3 != 1) {
            i.i("invalid orientation.");
            throw null;
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            io1 io1Var = this.r;
            this.r = this.s;
            this.s = io1Var;
            o0();
        }
        int i4 = H.b;
        c(null);
        if (i4 != this.p) {
            ci3Var.p();
            o0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new us3[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new us3(this, i5);
            }
            o0();
        }
        boolean z = H.c;
        c(null);
        id6 id6Var = this.F;
        if (id6Var != null && id6Var.c0 != z) {
            id6Var.c0 = z;
        }
        this.w = z;
        o0();
        ?? obj = new Object();
        obj.a = true;
        obj.f = 0;
        obj.g = 0;
        this.v = obj;
        this.r = io1.b(this, this.t);
        this.s = io1.b(this, 1 - this.t);
    }

    public static int d1(int i, int i2, int i3) {
        int mode;
        if ((i2 == 0 && i3 == 0) || ((mode = View.MeasureSpec.getMode(i)) != Integer.MIN_VALUE && mode != 1073741824)) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    @Override // defpackage.q65
    public final void A0(RecyclerView recyclerView, int i) {
        go3 go3Var = new go3(recyclerView.getContext());
        go3Var.a = i;
        B0(go3Var);
    }

    @Override // defpackage.q65
    public final boolean C0() {
        if (this.F == null) {
            return true;
        }
        return false;
    }

    public final boolean D0() {
        int K0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                K0 = L0();
                K0();
            } else {
                K0 = K0();
                L0();
            }
            if (K0 == 0 && P0() != null) {
                this.B.p();
                this.f = true;
                o0();
                return true;
            }
        }
        return false;
    }

    public final int E0(c75 c75Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return ve2.t(c75Var, this.r, H0(z), G0(z), this, this.I, this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0270, code lost:
        V0(r1, r7);
     */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int F0(defpackage.w65 r25, defpackage.tg3 r26, defpackage.c75 r27) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.F0(w65, tg3, c75):int");
    }

    public final View G0(boolean z) {
        io1 io1Var = this.r;
        int m = io1Var.m();
        int i = io1Var.i();
        View view = null;
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            int g = io1Var.g(u);
            int d = io1Var.d(u);
            if (d > m && g < i) {
                if (d > i && z) {
                    if (view == null) {
                        view = u;
                    }
                } else {
                    return u;
                }
            }
        }
        return view;
    }

    public final View H0(boolean z) {
        io1 io1Var = this.r;
        int m = io1Var.m();
        int i = io1Var.i();
        int v = v();
        View view = null;
        for (int i2 = 0; i2 < v; i2++) {
            View u = u(i2);
            int g = io1Var.g(u);
            if (io1Var.d(u) > m && g < i) {
                if (g < m && z) {
                    if (view == null) {
                        view = u;
                    }
                } else {
                    return u;
                }
            }
        }
        return view;
    }

    @Override // defpackage.q65
    public final int I(w65 w65Var, c75 c75Var) {
        if (this.t == 0) {
            return Math.min(this.p, c75Var.b());
        }
        return -1;
    }

    public final void I0(w65 w65Var, c75 c75Var, boolean z) {
        int i;
        int M0 = M0(Integer.MIN_VALUE);
        if (M0 != Integer.MIN_VALUE && (i = this.r.i() - M0) > 0) {
            int i2 = i - (-Z0(-i, w65Var, c75Var));
            if (z && i2 > 0) {
                this.r.q(i2);
            }
        }
    }

    public final void J0(w65 w65Var, c75 c75Var, boolean z) {
        int m;
        int N0 = N0(Preference.DEFAULT_ORDER);
        if (N0 != Integer.MAX_VALUE && (m = N0 - this.r.m()) > 0) {
            int Z0 = m - Z0(m, w65Var, c75Var);
            if (z && Z0 > 0) {
                this.r.q(-Z0);
            }
        }
    }

    @Override // defpackage.q65
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
        return q65.G(u(0));
    }

    @Override // defpackage.q65
    public final boolean L() {
        return this.w;
    }

    public final int L0() {
        int v = v();
        if (v == 0) {
            return 0;
        }
        return q65.G(u(v - 1));
    }

    public final int M0(int i) {
        int i2 = this.q[0].i(i);
        for (int i3 = 1; i3 < this.p; i3++) {
            int i4 = this.q[i3].i(i);
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    public final int N0(int i) {
        int k = this.q[0].k(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int k2 = this.q[i2].k(i);
            if (k2 < k) {
                k = k2;
            }
        }
        return k;
    }

    @Override // defpackage.q65
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            us3 us3Var = this.q[i2];
            int i3 = us3Var.b;
            if (i3 != Integer.MIN_VALUE) {
                us3Var.b = i3 + i;
            }
            int i4 = us3Var.c;
            if (i4 != Integer.MIN_VALUE) {
                us3Var.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O0(int, int, int):void");
    }

    @Override // defpackage.q65
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            us3 us3Var = this.q[i2];
            int i3 = us3Var.b;
            if (i3 != Integer.MIN_VALUE) {
                us3Var.b = i3 + i;
            }
            int i4 = us3Var.c;
            if (i4 != Integer.MIN_VALUE) {
                us3Var.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View P0() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P0():android.view.View");
    }

    @Override // defpackage.q65
    public final void Q() {
        this.B.p();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    public final boolean Q0() {
        if (this.b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void R0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.O(view));
        }
        gd6 gd6Var = (gd6) view.getLayoutParams();
        int d1 = d1(i, ((ViewGroup.MarginLayoutParams) gd6Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) gd6Var).rightMargin + rect.right);
        int d12 = d1(i2, ((ViewGroup.MarginLayoutParams) gd6Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) gd6Var).bottomMargin + rect.bottom);
        if (x0(view, d1, d12, gd6Var)) {
            view.measure(d1, d12);
        }
    }

    @Override // defpackage.q65
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0187, code lost:
        if (r4 != r17.x) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0189, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018b, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0179, code lost:
        if (r17.x != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:290:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S0(defpackage.w65 r18, defpackage.c75 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S0(w65, c75, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
        if (r0 == 1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
        if (r0 == 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005b, code lost:
        if (Q0() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0065, code lost:
        if (Q0() == false) goto L107;
     */
    @Override // defpackage.q65
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T(android.view.View r9, int r10, defpackage.w65 r11, defpackage.c75 r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T(android.view.View, int, w65, c75):android.view.View");
    }

    public final boolean T0(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.t == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 == this.x) {
                return false;
            }
            return true;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.x) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != Q0()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.q65
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View H0 = H0(false);
            View G0 = G0(false);
            if (H0 != null && G0 != null) {
                int G = q65.G(H0);
                int G2 = q65.G(G0);
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

    public final void U0(int i, c75 c75Var) {
        int K0;
        int i2;
        if (i > 0) {
            K0 = L0();
            i2 = 1;
        } else {
            K0 = K0();
            i2 = -1;
        }
        tg3 tg3Var = this.v;
        tg3Var.a = true;
        b1(K0, c75Var);
        a1(i2);
        tg3Var.c = K0 + tg3Var.d;
        tg3Var.b = Math.abs(i);
    }

    @Override // defpackage.q65
    public final void V(w65 w65Var, c75 c75Var, t2 t2Var) {
        super.V(w65Var, c75Var, t2Var);
        t2Var.i("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void V0(w65 w65Var, tg3 tg3Var) {
        if (tg3Var.a && !tg3Var.i) {
            int i = tg3Var.b;
            int i2 = tg3Var.e;
            if (i == 0) {
                if (i2 == -1) {
                    W0(w65Var, tg3Var.g);
                    return;
                } else {
                    X0(w65Var, tg3Var.f);
                    return;
                }
            }
            int i3 = this.p;
            us3[] us3VarArr = this.q;
            int i4 = 1;
            if (i2 == -1) {
                int i5 = tg3Var.f;
                int k = us3VarArr[0].k(i5);
                while (i4 < i3) {
                    int k2 = us3VarArr[i4].k(i5);
                    if (k2 > k) {
                        k = k2;
                    }
                    i4++;
                }
                int i6 = i5 - k;
                int i7 = tg3Var.g;
                if (i6 >= 0) {
                    i7 -= Math.min(i6, tg3Var.b);
                }
                W0(w65Var, i7);
                return;
            }
            int i8 = tg3Var.g;
            int i9 = us3VarArr[0].i(i8);
            while (i4 < i3) {
                int i10 = us3VarArr[i4].i(i8);
                if (i10 < i9) {
                    i9 = i10;
                }
                i4++;
            }
            int i11 = i9 - tg3Var.g;
            int i12 = tg3Var.f;
            if (i11 >= 0) {
                i12 += Math.min(i11, tg3Var.b);
            }
            X0(w65Var, i12);
        }
    }

    @Override // defpackage.q65
    public final void W(w65 w65Var, c75 c75Var, View view, t2 t2Var) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof gd6)) {
            X(view, t2Var);
            return;
        }
        us3 us3Var = ((gd6) layoutParams).e;
        if (this.t == 0) {
            if (us3Var == null) {
                i2 = -1;
            } else {
                i2 = us3Var.e;
            }
            t2Var.k(s2.a(false, i2, 1, -1, -1));
            return;
        }
        if (us3Var == null) {
            i = -1;
        } else {
            i = us3Var.e;
        }
        t2Var.k(s2.a(false, -1, -1, i, 1));
    }

    public final void W0(w65 w65Var, int i) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            io1 io1Var = this.r;
            if (io1Var.g(u) >= i && io1Var.p(u) >= i) {
                gd6 gd6Var = (gd6) u.getLayoutParams();
                gd6Var.getClass();
                if (((ArrayList) gd6Var.e.f).size() != 1) {
                    us3 us3Var = gd6Var.e;
                    ArrayList arrayList = (ArrayList) us3Var.f;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    gd6 gd6Var2 = (gd6) view.getLayoutParams();
                    gd6Var2.e = null;
                    if (gd6Var2.a.h() || gd6Var2.a.k()) {
                        us3Var.d -= ((StaggeredGridLayoutManager) us3Var.g).r.e(view);
                    }
                    if (size == 1) {
                        us3Var.b = Integer.MIN_VALUE;
                    }
                    us3Var.c = Integer.MIN_VALUE;
                    l0(u, w65Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void X0(w65 w65Var, int i) {
        while (v() > 0) {
            View u = u(0);
            io1 io1Var = this.r;
            if (io1Var.d(u) <= i && io1Var.o(u) <= i) {
                gd6 gd6Var = (gd6) u.getLayoutParams();
                gd6Var.getClass();
                if (((ArrayList) gd6Var.e.f).size() != 1) {
                    us3 us3Var = gd6Var.e;
                    ArrayList arrayList = (ArrayList) us3Var.f;
                    View view = (View) arrayList.remove(0);
                    gd6 gd6Var2 = (gd6) view.getLayoutParams();
                    gd6Var2.e = null;
                    if (arrayList.size() == 0) {
                        us3Var.c = Integer.MIN_VALUE;
                    }
                    if (gd6Var2.a.h() || gd6Var2.a.k()) {
                        us3Var.d -= ((StaggeredGridLayoutManager) us3Var.g).r.e(view);
                    }
                    us3Var.b = Integer.MIN_VALUE;
                    l0(u, w65Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.q65
    public final void Y(int i, int i2) {
        O0(i, i2, 1);
    }

    public final void Y0() {
        if (this.t != 1 && Q0()) {
            this.x = !this.w;
        } else {
            this.x = this.w;
        }
    }

    @Override // defpackage.q65
    public final void Z() {
        this.B.p();
        o0();
    }

    public final int Z0(int i, w65 w65Var, c75 c75Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        U0(i, c75Var);
        tg3 tg3Var = this.v;
        int F0 = F0(w65Var, tg3Var, c75Var);
        if (tg3Var.b >= F0) {
            if (i < 0) {
                i = -F0;
            } else {
                i = F0;
            }
        }
        this.r.q(-i);
        this.D = this.x;
        tg3Var.b = 0;
        V0(w65Var, tg3Var);
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r4 != r3.x) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r3.x != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        r1 = 1;
     */
    @Override // defpackage.b75
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
            boolean r4 = r3.x
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
            boolean r0 = r3.x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r3 = 0
            return r3
        L24:
            int r3 = r3.t
            r0 = 0
            if (r3 != 0) goto L2f
            float r3 = (float) r1
            r4.x = r3
            r4.y = r0
            return r4
        L2f:
            r4.x = r0
            float r3 = (float) r1
            r4.y = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    @Override // defpackage.q65
    public final void a0(int i, int i2) {
        O0(i, i2, 8);
    }

    public final void a1(int i) {
        boolean z;
        tg3 tg3Var = this.v;
        tg3Var.e = i;
        boolean z2 = this.x;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        tg3Var.d = i2;
    }

    @Override // defpackage.q65
    public final void b0(int i, int i2) {
        O0(i, i2, 2);
    }

    public final void b1(int i, c75 c75Var) {
        int i2;
        int i3;
        int i4;
        boolean z;
        tg3 tg3Var = this.v;
        boolean z2 = false;
        tg3Var.b = 0;
        tg3Var.c = i;
        go3 go3Var = this.e;
        io1 io1Var = this.r;
        if (go3Var != null && go3Var.e && (i4 = c75Var.a) != -1) {
            boolean z3 = this.x;
            if (i4 < i) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                i2 = io1Var.n();
                i3 = 0;
            } else {
                i3 = io1Var.n();
                i2 = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.f0) {
            tg3Var.f = io1Var.m() - i3;
            tg3Var.g = io1Var.i() + i2;
        } else {
            tg3Var.g = io1Var.h() + i2;
            tg3Var.f = -i3;
        }
        tg3Var.h = false;
        tg3Var.a = true;
        if (io1Var.k() == 0 && io1Var.h() == 0) {
            z2 = true;
        }
        tg3Var.i = z2;
    }

    @Override // defpackage.q65
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // defpackage.q65
    public final void c0(int i, int i2) {
        O0(i, i2, 4);
    }

    public final void c1(us3 us3Var, int i, int i2) {
        int i3 = us3Var.d;
        int i4 = us3Var.e;
        BitSet bitSet = this.y;
        if (i == -1) {
            int i5 = us3Var.b;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) us3Var.f).get(0);
                us3Var.b = ((StaggeredGridLayoutManager) us3Var.g).r.g(view);
                ((gd6) view.getLayoutParams()).getClass();
                i5 = us3Var.b;
            }
            if (i5 + i3 <= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = us3Var.c;
        if (i6 == Integer.MIN_VALUE) {
            us3Var.a();
            i6 = us3Var.c;
        }
        if (i6 - i3 >= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // defpackage.q65
    public final boolean d() {
        if (this.t == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.q65
    public final void d0(w65 w65Var, c75 c75Var) {
        S0(w65Var, c75Var, true);
    }

    @Override // defpackage.q65
    public final boolean e() {
        if (this.t == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.q65
    public final void e0(c75 c75Var) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // defpackage.q65
    public final boolean f(r65 r65Var) {
        return r65Var instanceof gd6;
    }

    @Override // defpackage.q65
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof id6) {
            id6 id6Var = (id6) parcelable;
            this.F = id6Var;
            if (this.z != -1) {
                id6Var.A = -1;
                id6Var.B = -1;
                id6Var.R = null;
                id6Var.L = 0;
                id6Var.X = 0;
                id6Var.Y = null;
                id6Var.Z = null;
            }
            o0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, id6] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.os.Parcelable, java.lang.Object, id6] */
    @Override // defpackage.q65
    public final Parcelable g0() {
        int K0;
        View H0;
        int k;
        int m;
        int[] iArr;
        id6 id6Var = this.F;
        if (id6Var != null) {
            ?? obj = new Object();
            obj.L = id6Var.L;
            obj.A = id6Var.A;
            obj.B = id6Var.B;
            obj.R = id6Var.R;
            obj.X = id6Var.X;
            obj.Y = id6Var.Y;
            obj.c0 = id6Var.c0;
            obj.d0 = id6Var.d0;
            obj.e0 = id6Var.e0;
            obj.Z = id6Var.Z;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.c0 = this.w;
        obj2.d0 = this.D;
        obj2.e0 = this.E;
        ci3 ci3Var = this.B;
        if (ci3Var != null && (iArr = (int[]) ci3Var.B) != null) {
            obj2.Y = iArr;
            obj2.X = iArr.length;
            obj2.Z = (ArrayList) ci3Var.L;
        } else {
            obj2.X = 0;
        }
        int i = -1;
        if (v() > 0) {
            if (this.D) {
                K0 = L0();
            } else {
                K0 = K0();
            }
            obj2.A = K0;
            if (this.x) {
                H0 = G0(true);
            } else {
                H0 = H0(true);
            }
            if (H0 != null) {
                i = q65.G(H0);
            }
            obj2.B = i;
            int i2 = this.p;
            obj2.L = i2;
            obj2.R = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                boolean z = this.D;
                io1 io1Var = this.r;
                us3[] us3VarArr = this.q;
                if (z) {
                    k = us3VarArr[i3].i(Integer.MIN_VALUE);
                    if (k != Integer.MIN_VALUE) {
                        m = io1Var.i();
                        k -= m;
                        obj2.R[i3] = k;
                    } else {
                        obj2.R[i3] = k;
                    }
                } else {
                    k = us3VarArr[i3].k(Integer.MIN_VALUE);
                    if (k != Integer.MIN_VALUE) {
                        m = io1Var.m();
                        k -= m;
                        obj2.R[i3] = k;
                    } else {
                        obj2.R[i3] = k;
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

    @Override // defpackage.q65
    public final void h(int i, int i2, c75 c75Var, yp0 yp0Var) {
        tg3 tg3Var;
        int i3;
        if (this.t != 0) {
            i = i2;
        }
        if (v() != 0 && i != 0) {
            U0(i, c75Var);
            int[] iArr = this.J;
            int i4 = this.p;
            if (iArr == null || iArr.length < i4) {
                this.J = new int[i4];
            }
            int i5 = 0;
            int i6 = 0;
            while (true) {
                tg3Var = this.v;
                if (i5 >= i4) {
                    break;
                }
                int i7 = tg3Var.d;
                us3[] us3VarArr = this.q;
                if (i7 == -1) {
                    int i8 = tg3Var.f;
                    i3 = i8 - us3VarArr[i5].k(i8);
                } else {
                    i3 = us3VarArr[i5].i(tg3Var.g) - tg3Var.g;
                }
                if (i3 >= 0) {
                    this.J[i6] = i3;
                    i6++;
                }
                i5++;
            }
            Arrays.sort(this.J, 0, i6);
            for (int i9 = 0; i9 < i6; i9++) {
                int i10 = tg3Var.c;
                if (i10 >= 0 && i10 < c75Var.b()) {
                    yp0Var.a(tg3Var.c, this.J[i9]);
                    tg3Var.c += tg3Var.d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.q65
    public final void h0(int i) {
        if (i == 0) {
            D0();
        }
    }

    @Override // defpackage.q65
    public final int j(c75 c75Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return ve2.s(c75Var, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.q65
    public final int k(c75 c75Var) {
        return E0(c75Var);
    }

    @Override // defpackage.q65
    public final int l(c75 c75Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return ve2.u(c75Var, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.q65
    public final int m(c75 c75Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return ve2.s(c75Var, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.q65
    public final int n(c75 c75Var) {
        return E0(c75Var);
    }

    @Override // defpackage.q65
    public final int o(c75 c75Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return ve2.u(c75Var, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.q65
    public final int p0(int i, w65 w65Var, c75 c75Var) {
        return Z0(i, w65Var, c75Var);
    }

    @Override // defpackage.q65
    public final void q0(int i) {
        id6 id6Var = this.F;
        if (id6Var != null && id6Var.A != i) {
            id6Var.R = null;
            id6Var.L = 0;
            id6Var.A = -1;
            id6Var.B = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        o0();
    }

    @Override // defpackage.q65
    public final r65 r() {
        if (this.t == 0) {
            return new r65(-2, -1);
        }
        return new r65(-1, -2);
    }

    @Override // defpackage.q65
    public final int r0(int i, w65 w65Var, c75 c75Var) {
        return Z0(i, w65Var, c75Var);
    }

    @Override // defpackage.q65
    public final r65 s(Context context, AttributeSet attributeSet) {
        return new r65(context, attributeSet);
    }

    @Override // defpackage.q65
    public final r65 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new r65((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new r65(layoutParams);
    }

    @Override // defpackage.q65
    public final void u0(Rect rect, int i, int i2) {
        int g;
        int g2;
        int E = E() + D();
        int C = C() + F();
        int i3 = this.t;
        int i4 = this.p;
        if (i3 == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = aa7.a;
            g2 = q65.g(i2, height, recyclerView.getMinimumHeight());
            g = q65.g(i, (this.u * i4) + E, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = aa7.a;
            g = q65.g(i, width, recyclerView2.getMinimumWidth());
            g2 = q65.g(i2, (this.u * i4) + C, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    @Override // defpackage.q65
    public final int x(w65 w65Var, c75 c75Var) {
        if (this.t == 1) {
            return Math.min(this.p, c75Var.b());
        }
        return -1;
    }
}
