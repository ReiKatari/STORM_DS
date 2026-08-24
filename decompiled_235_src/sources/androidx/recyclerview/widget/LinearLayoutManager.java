package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class LinearLayoutManager extends gg5 implements rg5 {
    public final ev3 A;
    public final fv3 B;
    public final int C;
    public final int[] D;
    public int p;
    public gv3 q;
    public ts1 r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public hv3 z;

    /* JADX WARN: Type inference failed for: r1v2, types: [fv3, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new ev3();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        fg5 H = gg5.H(context, attributeSet, i, i2);
        c1(H.a);
        boolean z = H.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            o0();
        }
        d1(H.d);
    }

    @Override // defpackage.gg5
    public void A0(RecyclerView recyclerView, int i) {
        iv3 iv3Var = new iv3(recyclerView.getContext());
        iv3Var.a = i;
        B0(iv3Var);
    }

    @Override // defpackage.gg5
    public boolean C0() {
        if (this.z == null && this.s == this.v) {
            return true;
        }
        return false;
    }

    public void D0(sg5 sg5Var, int[] iArr) {
        int i;
        int i2;
        if (sg5Var.a != -1) {
            i = this.r.n();
        } else {
            i = 0;
        }
        if (this.q.f == -1) {
            i2 = 0;
        } else {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public void E0(sg5 sg5Var, gv3 gv3Var, ls0 ls0Var) {
        int i = gv3Var.d;
        if (i >= 0 && i < sg5Var.b()) {
            ls0Var.a(i, Math.max(0, gv3Var.g));
        }
    }

    public final int F0(sg5 sg5Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        ts1 ts1Var = this.r;
        boolean z = !this.w;
        return gi2.w(sg5Var, ts1Var, M0(z), L0(z), this, this.w);
    }

    public final int G0(sg5 sg5Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        ts1 ts1Var = this.r;
        boolean z = !this.w;
        return gi2.x(sg5Var, ts1Var, M0(z), L0(z), this, this.w, this.u);
    }

    public final int H0(sg5 sg5Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        ts1 ts1Var = this.r;
        boolean z = !this.w;
        return gi2.y(sg5Var, ts1Var, M0(z), L0(z), this, this.w);
    }

    public final int I0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.p == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.p == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.p == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.p != 1 && V0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.p == 1 || !V0()) {
            return -1;
        } else {
            return 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gv3, java.lang.Object] */
    public final void J0() {
        if (this.q == null) {
            ?? obj = new Object();
            obj.a = true;
            obj.h = 0;
            obj.i = 0;
            obj.k = null;
            this.q = obj;
        }
    }

    @Override // defpackage.gg5
    public final boolean K() {
        return true;
    }

    public final int K0(mg5 mg5Var, gv3 gv3Var, sg5 sg5Var, boolean z) {
        int i;
        int i2 = gv3Var.c;
        int i3 = gv3Var.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                gv3Var.g = i3 + i2;
            }
            Y0(mg5Var, gv3Var);
        }
        int i4 = gv3Var.c + gv3Var.h;
        while (true) {
            if ((!gv3Var.l && i4 <= 0) || (i = gv3Var.d) < 0 || i >= sg5Var.b()) {
                break;
            }
            fv3 fv3Var = this.B;
            fv3Var.a = 0;
            fv3Var.b = false;
            fv3Var.c = false;
            fv3Var.d = false;
            W0(mg5Var, sg5Var, gv3Var, fv3Var);
            if (!fv3Var.b) {
                int i5 = gv3Var.b;
                int i6 = fv3Var.a;
                gv3Var.b = (gv3Var.f * i6) + i5;
                if (!fv3Var.c || gv3Var.k != null || !sg5Var.g) {
                    gv3Var.c -= i6;
                    i4 -= i6;
                }
                int i7 = gv3Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    gv3Var.g = i8;
                    int i9 = gv3Var.c;
                    if (i9 < 0) {
                        gv3Var.g = i8 + i9;
                    }
                    Y0(mg5Var, gv3Var);
                }
                if (z && fv3Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - gv3Var.c;
    }

    @Override // defpackage.gg5
    public final boolean L() {
        return this.t;
    }

    public final View L0(boolean z) {
        if (this.u) {
            return P0(0, z, v());
        }
        return P0(v() - 1, z, -1);
    }

    public final View M0(boolean z) {
        if (this.u) {
            return P0(v() - 1, z, -1);
        }
        return P0(0, z, v());
    }

    public final int N0() {
        View P0 = P0(v() - 1, false, -1);
        if (P0 == null) {
            return -1;
        }
        return gg5.G(P0);
    }

    public final View O0(int i, int i2) {
        int i3;
        int i4;
        J0();
        if (i2 > i || i2 < i) {
            if (this.r.g(u(i)) < this.r.m()) {
                i3 = 16644;
                i4 = 16388;
            } else {
                i3 = 4161;
                i4 = 4097;
            }
            if (this.p == 0) {
                return this.c.h(i, i2, i3, i4);
            }
            return this.d.h(i, i2, i3, i4);
        }
        return u(i);
    }

    public final View P0(int i, boolean z, int i2) {
        int i3;
        J0();
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (this.p == 0) {
            return this.c.h(i, i2, i3, 320);
        }
        return this.d.h(i, i2, i3, 320);
    }

    public View Q0(mg5 mg5Var, sg5 sg5Var, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        J0();
        int v = v();
        if (z2) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v;
            i2 = 0;
            i3 = 1;
        }
        int b = sg5Var.b();
        int m = this.r.m();
        int i4 = this.r.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u = u(i2);
            int G = gg5.G(u);
            int g = this.r.g(u);
            int d = this.r.d(u);
            if (G >= 0 && G < b) {
                if (((hg5) u.getLayoutParams()).a.h()) {
                    if (view3 == null) {
                        view3 = u;
                    }
                } else {
                    if (d <= m && g < m) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (g >= i4 && d > i4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z3 && !z4) {
                        return u;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = u;
                        }
                        view2 = u;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = u;
                        }
                        view2 = u;
                    }
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public final int R0(int i, mg5 mg5Var, sg5 sg5Var, boolean z) {
        int i2;
        int i3 = this.r.i() - i;
        if (i3 > 0) {
            int i4 = -b1(-i3, mg5Var, sg5Var);
            int i5 = i + i4;
            if (z && (i2 = this.r.i() - i5) > 0) {
                this.r.q(i2);
                return i2 + i4;
            }
            return i4;
        }
        return 0;
    }

    public final int S0(int i, mg5 mg5Var, sg5 sg5Var, boolean z) {
        int m;
        int m2 = i - this.r.m();
        if (m2 > 0) {
            int i2 = -b1(m2, mg5Var, sg5Var);
            int i3 = i + i2;
            if (z && (m = i3 - this.r.m()) > 0) {
                this.r.q(-m);
                return i2 - m;
            }
            return i2;
        }
        return 0;
    }

    @Override // defpackage.gg5
    public View T(View view, int i, mg5 mg5Var, sg5 sg5Var) {
        int I0;
        View O0;
        View T0;
        a1();
        if (v() != 0 && (I0 = I0(i)) != Integer.MIN_VALUE) {
            J0();
            e1(I0, (int) (this.r.n() * 0.33333334f), false, sg5Var);
            gv3 gv3Var = this.q;
            gv3Var.g = Integer.MIN_VALUE;
            gv3Var.a = false;
            K0(mg5Var, gv3Var, sg5Var, true);
            boolean z = this.u;
            if (I0 == -1) {
                if (z) {
                    O0 = O0(v() - 1, -1);
                } else {
                    O0 = O0(0, v());
                }
            } else if (z) {
                O0 = O0(0, v());
            } else {
                O0 = O0(v() - 1, -1);
            }
            if (I0 == -1) {
                T0 = U0();
            } else {
                T0 = T0();
            }
            if (T0.hasFocusable()) {
                if (O0 != null) {
                    return T0;
                }
            } else {
                return O0;
            }
        }
        return null;
    }

    public final View T0() {
        int v;
        if (this.u) {
            v = 0;
        } else {
            v = v() - 1;
        }
        return u(v);
    }

    @Override // defpackage.gg5
    public final void U(AccessibilityEvent accessibilityEvent) {
        int G;
        super.U(accessibilityEvent);
        if (v() > 0) {
            View P0 = P0(0, false, v());
            if (P0 == null) {
                G = -1;
            } else {
                G = gg5.G(P0);
            }
            accessibilityEvent.setFromIndex(G);
            accessibilityEvent.setToIndex(N0());
        }
    }

    public final View U0() {
        int i;
        if (this.u) {
            i = v() - 1;
        } else {
            i = 0;
        }
        return u(i);
    }

    @Override // defpackage.gg5
    public void V(mg5 mg5Var, sg5 sg5Var, v2 v2Var) {
        super.V(mg5Var, sg5Var, v2Var);
        wf5 wf5Var = this.b.l0;
        if (wf5Var != null && wf5Var.a() > 0) {
            v2Var.b(p2.m);
        }
    }

    public final boolean V0() {
        if (this.b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void W0(mg5 mg5Var, sg5 sg5Var, gv3 gv3Var, fv3 fv3Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        View b = gv3Var.b(mg5Var);
        if (b == null) {
            fv3Var.b = true;
            return;
        }
        hg5 hg5Var = (hg5) b.getLayoutParams();
        List list = gv3Var.k;
        boolean z3 = this.u;
        int i5 = gv3Var.f;
        if (list == null) {
            if (i5 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                b(b, -1, false);
            } else {
                b(b, 0, false);
            }
        } else {
            if (i5 == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                b(b, -1, true);
            } else {
                b(b, 0, true);
            }
        }
        hg5 hg5Var2 = (hg5) b.getLayoutParams();
        Rect O = this.b.O(b);
        int i6 = O.left + O.right;
        int i7 = O.top + O.bottom;
        int w = gg5.w(d(), this.n, this.l, E() + D() + ((ViewGroup.MarginLayoutParams) hg5Var2).leftMargin + ((ViewGroup.MarginLayoutParams) hg5Var2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) hg5Var2).width);
        int w2 = gg5.w(e(), this.o, this.m, C() + F() + ((ViewGroup.MarginLayoutParams) hg5Var2).topMargin + ((ViewGroup.MarginLayoutParams) hg5Var2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) hg5Var2).height);
        if (x0(b, w, w2, hg5Var2)) {
            b.measure(w, w2);
        }
        fv3Var.a = this.r.e(b);
        if (this.p == 1) {
            if (V0()) {
                i4 = this.n - E();
                i2 = i4 - this.r.f(b);
            } else {
                int D = D();
                i4 = this.r.f(b) + D;
                i2 = D;
            }
            int i8 = gv3Var.f;
            i3 = gv3Var.b;
            int i9 = fv3Var.a;
            if (i8 == -1) {
                int i10 = i3 - i9;
                i = i3;
                i3 = i10;
            } else {
                i = i9 + i3;
            }
        } else {
            int F = F();
            int f = this.r.f(b) + F;
            int i11 = gv3Var.f;
            int i12 = gv3Var.b;
            int i13 = fv3Var.a;
            if (i11 == -1) {
                int i14 = i12 - i13;
                i4 = i12;
                i3 = F;
                i = f;
                i2 = i14;
            } else {
                int i15 = i12 + i13;
                i = f;
                i2 = i12;
                i3 = F;
                i4 = i15;
            }
        }
        gg5.N(b, i2, i3, i4, i);
        if (hg5Var.a.h() || hg5Var.a.k()) {
            fv3Var.c = true;
        }
        fv3Var.d = b.hasFocusable();
    }

    public final void Y0(mg5 mg5Var, gv3 gv3Var) {
        if (gv3Var.a && !gv3Var.l) {
            int i = gv3Var.g;
            int i2 = gv3Var.i;
            if (gv3Var.f == -1) {
                int v = v();
                if (i >= 0) {
                    int h = (this.r.h() - i) + i2;
                    if (this.u) {
                        for (int i3 = 0; i3 < v; i3++) {
                            View u = u(i3);
                            if (this.r.g(u) < h || this.r.p(u) < h) {
                                Z0(mg5Var, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = v - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View u2 = u(i5);
                        if (this.r.g(u2) < h || this.r.p(u2) < h) {
                            Z0(mg5Var, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int v2 = v();
                if (this.u) {
                    int i7 = v2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View u3 = u(i8);
                        if (this.r.d(u3) > i6 || this.r.o(u3) > i6) {
                            Z0(mg5Var, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < v2; i9++) {
                    View u4 = u(i9);
                    if (this.r.d(u4) > i6 || this.r.o(u4) > i6) {
                        Z0(mg5Var, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    public final void Z0(mg5 mg5Var, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    View u = u(i3);
                    m0(i3);
                    mg5Var.l(u);
                }
                return;
            }
            while (i > i2) {
                View u2 = u(i);
                m0(i);
                mg5Var.l(u2);
                i--;
            }
        }
    }

    @Override // defpackage.rg5
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < gg5.G(u(0))) {
            z = true;
        }
        if (z != this.u) {
            i2 = -1;
        }
        if (this.p == 0) {
            return new PointF(i2, RecyclerView.B1);
        }
        return new PointF(RecyclerView.B1, i2);
    }

    public final void a1() {
        if (this.p != 1 && V0()) {
            this.u = !this.t;
        } else {
            this.u = this.t;
        }
    }

    public final int b1(int i, mg5 mg5Var, sg5 sg5Var) {
        int i2;
        if (v() != 0 && i != 0) {
            J0();
            this.q.a = true;
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            int abs = Math.abs(i);
            e1(i2, abs, true, sg5Var);
            gv3 gv3Var = this.q;
            int K0 = K0(mg5Var, gv3Var, sg5Var, false) + gv3Var.g;
            if (K0 >= 0) {
                if (abs > K0) {
                    i = i2 * K0;
                }
                this.r.q(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.gg5
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    public final void c1(int i) {
        if (i != 0 && i != 1) {
            i.h(lb1.g(i, "invalid orientation:"));
            return;
        }
        c(null);
        if (i == this.p && this.r != null) {
            return;
        }
        ts1 b = ts1.b(this, i);
        this.r = b;
        this.A.a = b;
        this.p = i;
        o0();
    }

    @Override // defpackage.gg5
    public final boolean d() {
        if (this.p == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.gg5
    public void d0(mg5 mg5Var, sg5 sg5Var) {
        int i;
        View Q0;
        boolean z;
        boolean z2;
        int n;
        int i2;
        boolean z3;
        boolean z4;
        int g;
        int n2;
        int i3;
        boolean z5;
        int i4;
        int i5;
        ?? r4;
        List list;
        boolean z6;
        int i6;
        int i7;
        int R0;
        int i8;
        View q;
        int g2;
        int i9;
        int i10;
        int i11 = -1;
        if ((this.z != null || this.x != -1) && sg5Var.b() == 0) {
            j0(mg5Var);
            return;
        }
        hv3 hv3Var = this.z;
        if (hv3Var != null && (i10 = hv3Var.A) >= 0) {
            this.x = i10;
        }
        J0();
        boolean z7 = false;
        this.q.a = false;
        a1();
        RecyclerView recyclerView = this.b;
        View view = (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.a.B).contains(view)) ? null : null;
        ev3 ev3Var = this.A;
        if (ev3Var.e && this.x == -1 && this.z == null) {
            if (view != null && (this.r.g(view) >= this.r.i() || this.r.d(view) <= this.r.m())) {
                ev3Var.b(view, gg5.G(view));
            }
        } else {
            ev3Var.c();
            ev3Var.d = this.u ^ this.v;
            if (!sg5Var.g && (i2 = this.x) != -1) {
                if (i2 >= 0 && i2 < sg5Var.b()) {
                    int i12 = this.x;
                    ev3Var.b = i12;
                    hv3 hv3Var2 = this.z;
                    if (hv3Var2 != null && hv3Var2.A >= 0) {
                        boolean z8 = hv3Var2.L;
                        ev3Var.d = z8;
                        ts1 ts1Var = this.r;
                        if (z8) {
                            ev3Var.c = ts1Var.i() - this.z.B;
                        } else {
                            ev3Var.c = ts1Var.m() + this.z.B;
                        }
                    } else if (this.y == Integer.MIN_VALUE) {
                        View q2 = q(i12);
                        if (q2 != null) {
                            if (this.r.e(q2) > this.r.n()) {
                                ev3Var.a();
                            } else {
                                int g3 = this.r.g(q2) - this.r.m();
                                ts1 ts1Var2 = this.r;
                                if (g3 < 0) {
                                    ev3Var.c = ts1Var2.m();
                                    ev3Var.d = false;
                                } else if (ts1Var2.i() - this.r.d(q2) < 0) {
                                    ev3Var.c = this.r.i();
                                    ev3Var.d = true;
                                } else {
                                    boolean z9 = ev3Var.d;
                                    ts1 ts1Var3 = this.r;
                                    if (z9) {
                                        int d = ts1Var3.d(q2);
                                        ts1 ts1Var4 = this.r;
                                        if (Integer.MIN_VALUE == ts1Var4.a) {
                                            n2 = 0;
                                        } else {
                                            n2 = ts1Var4.n() - ts1Var4.a;
                                        }
                                        g = n2 + d;
                                    } else {
                                        g = ts1Var3.g(q2);
                                    }
                                    ev3Var.c = g;
                                }
                            }
                        } else {
                            if (v() > 0) {
                                if (this.x < gg5.G(u(0))) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3 == this.u) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                ev3Var.d = z4;
                            }
                            ev3Var.a();
                        }
                    } else {
                        boolean z10 = this.u;
                        ev3Var.d = z10;
                        ts1 ts1Var5 = this.r;
                        if (z10) {
                            ev3Var.c = ts1Var5.i() - this.y;
                        } else {
                            ev3Var.c = ts1Var5.m() + this.y;
                        }
                    }
                    ev3Var.e = true;
                } else {
                    this.x = -1;
                    this.y = Integer.MIN_VALUE;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.b;
                View view2 = (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.B).contains(view2)) ? null : null;
                if (view2 != null) {
                    hg5 hg5Var = (hg5) view2.getLayoutParams();
                    if (!hg5Var.a.h() && hg5Var.a.b() >= 0 && hg5Var.a.b() < sg5Var.b()) {
                        ev3Var.b(view2, gg5.G(view2));
                        ev3Var.e = true;
                    }
                }
                boolean z11 = this.s;
                boolean z12 = this.v;
                if (z11 == z12 && (Q0 = Q0(mg5Var, sg5Var, ev3Var.d, z12)) != null) {
                    int G = gg5.G(Q0);
                    boolean z13 = ev3Var.d;
                    ts1 ts1Var6 = ev3Var.a;
                    if (z13) {
                        int d2 = ts1Var6.d(Q0);
                        ts1 ts1Var7 = ev3Var.a;
                        if (Integer.MIN_VALUE == ts1Var7.a) {
                            n = 0;
                        } else {
                            n = ts1Var7.n() - ts1Var7.a;
                        }
                        ev3Var.c = n + d2;
                    } else {
                        ev3Var.c = ts1Var6.g(Q0);
                    }
                    ev3Var.b = G;
                    if (!sg5Var.g && C0()) {
                        int g4 = this.r.g(Q0);
                        int d3 = this.r.d(Q0);
                        int m = this.r.m();
                        int i13 = this.r.i();
                        if (d3 <= m && g4 < m) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (g4 >= i13 && d3 > i13) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z || z2) {
                            if (ev3Var.d) {
                                m = i13;
                            }
                            ev3Var.c = m;
                        }
                    }
                    ev3Var.e = true;
                }
            }
            ev3Var.a();
            if (this.v) {
                i = sg5Var.b() - 1;
            } else {
                i = 0;
            }
            ev3Var.b = i;
            ev3Var.e = true;
        }
        gv3 gv3Var = this.q;
        if (gv3Var.j >= 0) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        gv3Var.f = i3;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(sg5Var, iArr);
        int m2 = this.r.m() + Math.max(0, iArr[0]);
        int j = this.r.j() + Math.max(0, iArr[1]);
        if (sg5Var.g && (i8 = this.x) != -1 && this.y != Integer.MIN_VALUE && (q = q(i8)) != null) {
            boolean z14 = this.u;
            ts1 ts1Var8 = this.r;
            if (z14) {
                i9 = ts1Var8.i() - this.r.d(q);
                g2 = this.y;
            } else {
                g2 = ts1Var8.g(q) - this.r.m();
                i9 = this.y;
            }
            int i14 = i9 - g2;
            if (i14 > 0) {
                m2 += i14;
            } else {
                j -= i14;
            }
        }
        boolean z15 = ev3Var.d;
        boolean z16 = this.u;
        if (!z15 ? !z16 : z16) {
            i11 = 1;
        }
        X0(mg5Var, sg5Var, ev3Var, i11);
        p(mg5Var);
        gv3 gv3Var2 = this.q;
        if (this.r.k() == 0 && this.r.h() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        gv3Var2.l = z5;
        this.q.getClass();
        this.q.i = 0;
        boolean z17 = ev3Var.d;
        int i15 = ev3Var.b;
        if (z17) {
            g1(i15, ev3Var.c);
            gv3 gv3Var3 = this.q;
            gv3Var3.h = m2;
            K0(mg5Var, gv3Var3, sg5Var, false);
            gv3 gv3Var4 = this.q;
            i5 = gv3Var4.b;
            int i16 = gv3Var4.d;
            int i17 = gv3Var4.c;
            if (i17 > 0) {
                j += i17;
            }
            f1(ev3Var.b, ev3Var.c);
            gv3 gv3Var5 = this.q;
            gv3Var5.h = j;
            gv3Var5.d += gv3Var5.e;
            K0(mg5Var, gv3Var5, sg5Var, false);
            gv3 gv3Var6 = this.q;
            i4 = gv3Var6.b;
            int i18 = gv3Var6.c;
            if (i18 > 0) {
                g1(i16, i5);
                gv3 gv3Var7 = this.q;
                gv3Var7.h = i18;
                K0(mg5Var, gv3Var7, sg5Var, false);
                i5 = this.q.b;
            }
        } else {
            f1(i15, ev3Var.c);
            gv3 gv3Var8 = this.q;
            gv3Var8.h = j;
            K0(mg5Var, gv3Var8, sg5Var, false);
            gv3 gv3Var9 = this.q;
            i4 = gv3Var9.b;
            int i19 = gv3Var9.d;
            int i20 = gv3Var9.c;
            if (i20 > 0) {
                m2 += i20;
            }
            g1(ev3Var.b, ev3Var.c);
            gv3 gv3Var10 = this.q;
            gv3Var10.h = m2;
            gv3Var10.d += gv3Var10.e;
            K0(mg5Var, gv3Var10, sg5Var, false);
            gv3 gv3Var11 = this.q;
            int i21 = gv3Var11.b;
            int i22 = gv3Var11.c;
            if (i22 > 0) {
                f1(i19, i4);
                gv3 gv3Var12 = this.q;
                gv3Var12.h = i22;
                K0(mg5Var, gv3Var12, sg5Var, false);
                i4 = this.q.b;
            }
            i5 = i21;
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int R02 = R0(i4, mg5Var, sg5Var, true);
                i6 = i5 + R02;
                i7 = i4 + R02;
                R0 = S0(i6, mg5Var, sg5Var, false);
            } else {
                int S0 = S0(i5, mg5Var, sg5Var, true);
                i6 = i5 + S0;
                i7 = i4 + S0;
                R0 = R0(i7, mg5Var, sg5Var, false);
            }
            i5 = i6 + R0;
            i4 = i7 + R0;
        }
        if (sg5Var.k && v() != 0 && !sg5Var.g && C0()) {
            List list2 = (List) mg5Var.f;
            int size = list2.size();
            int G2 = gg5.G(u(0));
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i23 < size) {
                wg5 wg5Var = (wg5) list2.get(i23);
                boolean h = wg5Var.h();
                View view3 = wg5Var.a;
                if (!h) {
                    if (wg5Var.b() < G2) {
                        z6 = true;
                    } else {
                        z6 = z7;
                    }
                    boolean z18 = this.u;
                    ts1 ts1Var9 = this.r;
                    if (z6 != z18) {
                        i24 += ts1Var9.e(view3);
                    } else {
                        i25 += ts1Var9.e(view3);
                    }
                }
                i23++;
                z7 = false;
            }
            this.q.k = list2;
            if (i24 > 0) {
                g1(gg5.G(U0()), i5);
                gv3 gv3Var13 = this.q;
                gv3Var13.h = i24;
                r4 = 0;
                gv3Var13.c = 0;
                gv3Var13.a(null);
                K0(mg5Var, this.q, sg5Var, false);
            } else {
                r4 = 0;
            }
            if (i25 > 0) {
                f1(gg5.G(T0()), i4);
                gv3 gv3Var14 = this.q;
                gv3Var14.h = i25;
                gv3Var14.c = r4;
                list = null;
                gv3Var14.a(null);
                K0(mg5Var, this.q, sg5Var, r4);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (!sg5Var.g) {
            ts1 ts1Var10 = this.r;
            ts1Var10.a = ts1Var10.n();
        } else {
            ev3Var.c();
        }
        this.s = this.v;
    }

    public void d1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        o0();
    }

    @Override // defpackage.gg5
    public final boolean e() {
        if (this.p == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gg5
    public void e0(sg5 sg5Var) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void e1(int i, int i2, boolean z, sg5 sg5Var) {
        boolean z2;
        int i3;
        int m;
        gv3 gv3Var = this.q;
        boolean z3 = false;
        int i4 = 1;
        if (this.r.k() == 0 && this.r.h() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        gv3Var.l = z2;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(sg5Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        gv3 gv3Var2 = this.q;
        if (z3) {
            i3 = max2;
        } else {
            i3 = max;
        }
        gv3Var2.h = i3;
        if (!z3) {
            max = max2;
        }
        gv3Var2.i = max;
        if (z3) {
            gv3Var2.h = this.r.j() + i3;
            View T0 = T0();
            gv3 gv3Var3 = this.q;
            if (this.u) {
                i4 = -1;
            }
            gv3Var3.e = i4;
            int G = gg5.G(T0);
            gv3 gv3Var4 = this.q;
            gv3Var3.d = G + gv3Var4.e;
            gv3Var4.b = this.r.d(T0);
            m = this.r.d(T0) - this.r.i();
        } else {
            View U0 = U0();
            gv3 gv3Var5 = this.q;
            gv3Var5.h = this.r.m() + gv3Var5.h;
            gv3 gv3Var6 = this.q;
            if (!this.u) {
                i4 = -1;
            }
            gv3Var6.e = i4;
            int G2 = gg5.G(U0);
            gv3 gv3Var7 = this.q;
            gv3Var6.d = G2 + gv3Var7.e;
            gv3Var7.b = this.r.g(U0);
            m = (-this.r.g(U0)) + this.r.m();
        }
        gv3 gv3Var8 = this.q;
        gv3Var8.c = i2;
        if (z) {
            gv3Var8.c = i2 - m;
        }
        gv3Var8.g = m;
    }

    @Override // defpackage.gg5
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof hv3) {
            hv3 hv3Var = (hv3) parcelable;
            this.z = hv3Var;
            if (this.x != -1) {
                hv3Var.A = -1;
            }
            o0();
        }
    }

    public final void f1(int i, int i2) {
        int i3;
        this.q.c = this.r.i() - i2;
        gv3 gv3Var = this.q;
        if (this.u) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        gv3Var.e = i3;
        gv3Var.d = i;
        gv3Var.f = 1;
        gv3Var.b = i2;
        gv3Var.g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, hv3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.os.Parcelable, hv3, java.lang.Object] */
    @Override // defpackage.gg5
    public final Parcelable g0() {
        hv3 hv3Var = this.z;
        if (hv3Var != null) {
            ?? obj = new Object();
            obj.A = hv3Var.A;
            obj.B = hv3Var.B;
            obj.L = hv3Var.L;
            return obj;
        }
        ?? obj2 = new Object();
        if (v() > 0) {
            J0();
            boolean z = this.s ^ this.u;
            obj2.L = z;
            if (z) {
                View T0 = T0();
                obj2.B = this.r.i() - this.r.d(T0);
                obj2.A = gg5.G(T0);
                return obj2;
            }
            View U0 = U0();
            obj2.A = gg5.G(U0);
            obj2.B = this.r.g(U0) - this.r.m();
            return obj2;
        }
        obj2.A = -1;
        return obj2;
    }

    public final void g1(int i, int i2) {
        int i3;
        this.q.c = i2 - this.r.m();
        gv3 gv3Var = this.q;
        gv3Var.d = i;
        if (this.u) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        gv3Var.e = i3;
        gv3Var.f = -1;
        gv3Var.b = i2;
        gv3Var.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.gg5
    public final void h(int i, int i2, sg5 sg5Var, ls0 ls0Var) {
        int i3;
        if (this.p != 0) {
            i = i2;
        }
        if (v() != 0 && i != 0) {
            J0();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            e1(i3, Math.abs(i), true, sg5Var);
            E0(sg5Var, this.q, ls0Var);
        }
    }

    @Override // defpackage.gg5
    public final void i(int i, ls0 ls0Var) {
        boolean z;
        int i2;
        hv3 hv3Var = this.z;
        int i3 = -1;
        if (hv3Var != null && (i2 = hv3Var.A) >= 0) {
            z = hv3Var.L;
        } else {
            a1();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            ls0Var.a(i2, 0);
            i2 += i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    @Override // defpackage.gg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i0(int i, Bundle bundle) {
        int min;
        if (super.i0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.p == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 >= 0) {
                    RecyclerView recyclerView = this.b;
                    min = Math.min(i2, I(recyclerView.L, recyclerView.d1) - 1);
                    if (min >= 0) {
                        this.x = min;
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
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 >= 0) {
                    RecyclerView recyclerView2 = this.b;
                    min = Math.min(i3, x(recyclerView2.L, recyclerView2.d1) - 1);
                    if (min >= 0) {
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.gg5
    public final int j(sg5 sg5Var) {
        return F0(sg5Var);
    }

    @Override // defpackage.gg5
    public int k(sg5 sg5Var) {
        return G0(sg5Var);
    }

    @Override // defpackage.gg5
    public int l(sg5 sg5Var) {
        return H0(sg5Var);
    }

    @Override // defpackage.gg5
    public final int m(sg5 sg5Var) {
        return F0(sg5Var);
    }

    @Override // defpackage.gg5
    public int n(sg5 sg5Var) {
        return G0(sg5Var);
    }

    @Override // defpackage.gg5
    public int o(sg5 sg5Var) {
        return H0(sg5Var);
    }

    @Override // defpackage.gg5
    public int p0(int i, mg5 mg5Var, sg5 sg5Var) {
        if (this.p == 1) {
            return 0;
        }
        return b1(i, mg5Var, sg5Var);
    }

    @Override // defpackage.gg5
    public final View q(int i) {
        int v = v();
        if (v == 0) {
            return null;
        }
        int G = i - gg5.G(u(0));
        if (G >= 0 && G < v) {
            View u = u(G);
            if (gg5.G(u) == i) {
                return u;
            }
        }
        return super.q(i);
    }

    @Override // defpackage.gg5
    public final void q0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        hv3 hv3Var = this.z;
        if (hv3Var != null) {
            hv3Var.A = -1;
        }
        o0();
    }

    @Override // defpackage.gg5
    public hg5 r() {
        return new hg5(-2, -2);
    }

    @Override // defpackage.gg5
    public int r0(int i, mg5 mg5Var, sg5 sg5Var) {
        if (this.p == 0) {
            return 0;
        }
        return b1(i, mg5Var, sg5Var);
    }

    @Override // defpackage.gg5
    public final boolean y0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int v = v();
            for (int i = 0; i < v; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.gg5
    public final void S(RecyclerView recyclerView) {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [fv3, java.lang.Object] */
    public LinearLayoutManager(int i, boolean z) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new ev3();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        c1(i);
        c(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        o0();
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    public void X0(mg5 mg5Var, sg5 sg5Var, ev3 ev3Var, int i) {
    }
}
