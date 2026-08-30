package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class LinearLayoutManager extends q65 implements b75 {
    public final co3 A;
    public final do3 B;
    public final int C;
    public final int[] D;
    public int p;
    public eo3 q;
    public io1 r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public fo3 z;

    /* JADX WARN: Type inference failed for: r1v2, types: [do3, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new co3();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        p65 H = q65.H(context, attributeSet, i, i2);
        c1(H.a);
        boolean z = H.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            o0();
        }
        d1(H.d);
    }

    @Override // defpackage.q65
    public void A0(RecyclerView recyclerView, int i) {
        go3 go3Var = new go3(recyclerView.getContext());
        go3Var.a = i;
        B0(go3Var);
    }

    @Override // defpackage.q65
    public boolean C0() {
        if (this.z == null && this.s == this.v) {
            return true;
        }
        return false;
    }

    public void D0(c75 c75Var, int[] iArr) {
        int i;
        int i2;
        if (c75Var.a != -1) {
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

    public void E0(c75 c75Var, eo3 eo3Var, yp0 yp0Var) {
        int i = eo3Var.d;
        if (i >= 0 && i < c75Var.b()) {
            yp0Var.a(i, Math.max(0, eo3Var.g));
        }
    }

    public final int F0(c75 c75Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        io1 io1Var = this.r;
        boolean z = !this.w;
        return ve2.s(c75Var, io1Var, M0(z), L0(z), this, this.w);
    }

    public final int G0(c75 c75Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        io1 io1Var = this.r;
        boolean z = !this.w;
        return ve2.t(c75Var, io1Var, M0(z), L0(z), this, this.w, this.u);
    }

    public final int H0(c75 c75Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        io1 io1Var = this.r;
        boolean z = !this.w;
        return ve2.u(c75Var, io1Var, M0(z), L0(z), this, this.w);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [eo3, java.lang.Object] */
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

    @Override // defpackage.q65
    public final boolean K() {
        return true;
    }

    public final int K0(w65 w65Var, eo3 eo3Var, c75 c75Var, boolean z) {
        int i;
        int i2 = eo3Var.c;
        int i3 = eo3Var.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                eo3Var.g = i3 + i2;
            }
            Y0(w65Var, eo3Var);
        }
        int i4 = eo3Var.c + eo3Var.h;
        while (true) {
            if ((!eo3Var.l && i4 <= 0) || (i = eo3Var.d) < 0 || i >= c75Var.b()) {
                break;
            }
            do3 do3Var = this.B;
            do3Var.a = 0;
            do3Var.b = false;
            do3Var.c = false;
            do3Var.d = false;
            W0(w65Var, c75Var, eo3Var, do3Var);
            if (!do3Var.b) {
                int i5 = eo3Var.b;
                int i6 = do3Var.a;
                eo3Var.b = (eo3Var.f * i6) + i5;
                if (!do3Var.c || eo3Var.k != null || !c75Var.g) {
                    eo3Var.c -= i6;
                    i4 -= i6;
                }
                int i7 = eo3Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    eo3Var.g = i8;
                    int i9 = eo3Var.c;
                    if (i9 < 0) {
                        eo3Var.g = i8 + i9;
                    }
                    Y0(w65Var, eo3Var);
                }
                if (z && do3Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - eo3Var.c;
    }

    @Override // defpackage.q65
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
        return q65.G(P0);
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
                return this.c.f(i, i2, i3, i4);
            }
            return this.d.f(i, i2, i3, i4);
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
            return this.c.f(i, i2, i3, 320);
        }
        return this.d.f(i, i2, i3, 320);
    }

    public View Q0(w65 w65Var, c75 c75Var, boolean z, boolean z2) {
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
        int b = c75Var.b();
        int m = this.r.m();
        int i4 = this.r.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u = u(i2);
            int G = q65.G(u);
            int g = this.r.g(u);
            int d = this.r.d(u);
            if (G >= 0 && G < b) {
                if (((r65) u.getLayoutParams()).a.h()) {
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

    public final int R0(int i, w65 w65Var, c75 c75Var, boolean z) {
        int i2;
        int i3 = this.r.i() - i;
        if (i3 > 0) {
            int i4 = -b1(-i3, w65Var, c75Var);
            int i5 = i + i4;
            if (z && (i2 = this.r.i() - i5) > 0) {
                this.r.q(i2);
                return i2 + i4;
            }
            return i4;
        }
        return 0;
    }

    public final int S0(int i, w65 w65Var, c75 c75Var, boolean z) {
        int m;
        int m2 = i - this.r.m();
        if (m2 > 0) {
            int i2 = -b1(m2, w65Var, c75Var);
            int i3 = i + i2;
            if (z && (m = i3 - this.r.m()) > 0) {
                this.r.q(-m);
                return i2 - m;
            }
            return i2;
        }
        return 0;
    }

    @Override // defpackage.q65
    public View T(View view, int i, w65 w65Var, c75 c75Var) {
        int I0;
        View O0;
        View T0;
        a1();
        if (v() != 0 && (I0 = I0(i)) != Integer.MIN_VALUE) {
            J0();
            e1(I0, (int) (this.r.n() * 0.33333334f), false, c75Var);
            eo3 eo3Var = this.q;
            eo3Var.g = Integer.MIN_VALUE;
            eo3Var.a = false;
            K0(w65Var, eo3Var, c75Var, true);
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

    @Override // defpackage.q65
    public final void U(AccessibilityEvent accessibilityEvent) {
        int G;
        super.U(accessibilityEvent);
        if (v() > 0) {
            View P0 = P0(0, false, v());
            if (P0 == null) {
                G = -1;
            } else {
                G = q65.G(P0);
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

    @Override // defpackage.q65
    public void V(w65 w65Var, c75 c75Var, t2 t2Var) {
        super.V(w65Var, c75Var, t2Var);
        g65 g65Var = this.b.k0;
        if (g65Var != null && g65Var.a() > 0) {
            t2Var.b(n2.m);
        }
    }

    public final boolean V0() {
        if (this.b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void W0(w65 w65Var, c75 c75Var, eo3 eo3Var, do3 do3Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        View b = eo3Var.b(w65Var);
        if (b == null) {
            do3Var.b = true;
            return;
        }
        r65 r65Var = (r65) b.getLayoutParams();
        List list = eo3Var.k;
        boolean z3 = this.u;
        int i5 = eo3Var.f;
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
        r65 r65Var2 = (r65) b.getLayoutParams();
        Rect O = this.b.O(b);
        int i6 = O.left + O.right;
        int i7 = O.top + O.bottom;
        int w = q65.w(d(), this.n, this.l, E() + D() + ((ViewGroup.MarginLayoutParams) r65Var2).leftMargin + ((ViewGroup.MarginLayoutParams) r65Var2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) r65Var2).width);
        int w2 = q65.w(e(), this.o, this.m, C() + F() + ((ViewGroup.MarginLayoutParams) r65Var2).topMargin + ((ViewGroup.MarginLayoutParams) r65Var2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) r65Var2).height);
        if (x0(b, w, w2, r65Var2)) {
            b.measure(w, w2);
        }
        do3Var.a = this.r.e(b);
        if (this.p == 1) {
            if (V0()) {
                i4 = this.n - E();
                i2 = i4 - this.r.f(b);
            } else {
                int D = D();
                i4 = this.r.f(b) + D;
                i2 = D;
            }
            int i8 = eo3Var.f;
            i3 = eo3Var.b;
            int i9 = do3Var.a;
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
            int i11 = eo3Var.f;
            int i12 = eo3Var.b;
            int i13 = do3Var.a;
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
        q65.N(b, i2, i3, i4, i);
        if (r65Var.a.h() || r65Var.a.k()) {
            do3Var.c = true;
        }
        do3Var.d = b.hasFocusable();
    }

    public final void Y0(w65 w65Var, eo3 eo3Var) {
        if (eo3Var.a && !eo3Var.l) {
            int i = eo3Var.g;
            int i2 = eo3Var.i;
            if (eo3Var.f == -1) {
                int v = v();
                if (i >= 0) {
                    int h = (this.r.h() - i) + i2;
                    if (this.u) {
                        for (int i3 = 0; i3 < v; i3++) {
                            View u = u(i3);
                            if (this.r.g(u) < h || this.r.p(u) < h) {
                                Z0(w65Var, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = v - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View u2 = u(i5);
                        if (this.r.g(u2) < h || this.r.p(u2) < h) {
                            Z0(w65Var, i4, i5);
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
                            Z0(w65Var, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < v2; i9++) {
                    View u4 = u(i9);
                    if (this.r.d(u4) > i6 || this.r.o(u4) > i6) {
                        Z0(w65Var, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    public final void Z0(w65 w65Var, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    View u = u(i3);
                    m0(i3);
                    w65Var.l(u);
                }
                return;
            }
            while (i > i2) {
                View u2 = u(i);
                m0(i);
                w65Var.l(u2);
                i--;
            }
        }
    }

    @Override // defpackage.b75
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < q65.G(u(0))) {
            z = true;
        }
        if (z != this.u) {
            i2 = -1;
        }
        if (this.p == 0) {
            return new PointF(i2, RecyclerView.A1);
        }
        return new PointF(RecyclerView.A1, i2);
    }

    public final void a1() {
        if (this.p != 1 && V0()) {
            this.u = !this.t;
        } else {
            this.u = this.t;
        }
    }

    public final int b1(int i, w65 w65Var, c75 c75Var) {
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
            e1(i2, abs, true, c75Var);
            eo3 eo3Var = this.q;
            int K0 = K0(w65Var, eo3Var, c75Var, false) + eo3Var.g;
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

    @Override // defpackage.q65
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    public final void c1(int i) {
        if (i != 0 && i != 1) {
            i.i(wh1.g(i, "invalid orientation:"));
            return;
        }
        c(null);
        if (i == this.p && this.r != null) {
            return;
        }
        io1 b = io1.b(this, i);
        this.r = b;
        this.A.a = b;
        this.p = i;
        o0();
    }

    @Override // defpackage.q65
    public final boolean d() {
        if (this.p == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.q65
    public void d0(w65 w65Var, c75 c75Var) {
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
        if ((this.z != null || this.x != -1) && c75Var.b() == 0) {
            j0(w65Var);
            return;
        }
        fo3 fo3Var = this.z;
        if (fo3Var != null && (i10 = fo3Var.A) >= 0) {
            this.x = i10;
        }
        J0();
        boolean z7 = false;
        this.q.a = false;
        a1();
        RecyclerView recyclerView = this.b;
        View view = (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.a.b).contains(view)) ? null : null;
        co3 co3Var = this.A;
        if (co3Var.e && this.x == -1 && this.z == null) {
            if (view != null && (this.r.g(view) >= this.r.i() || this.r.d(view) <= this.r.m())) {
                co3Var.b(view, q65.G(view));
            }
        } else {
            co3Var.c();
            co3Var.d = this.u ^ this.v;
            if (!c75Var.g && (i2 = this.x) != -1) {
                if (i2 >= 0 && i2 < c75Var.b()) {
                    int i12 = this.x;
                    co3Var.b = i12;
                    fo3 fo3Var2 = this.z;
                    if (fo3Var2 != null && fo3Var2.A >= 0) {
                        boolean z8 = fo3Var2.L;
                        co3Var.d = z8;
                        io1 io1Var = this.r;
                        if (z8) {
                            co3Var.c = io1Var.i() - this.z.B;
                        } else {
                            co3Var.c = io1Var.m() + this.z.B;
                        }
                    } else if (this.y == Integer.MIN_VALUE) {
                        View q2 = q(i12);
                        if (q2 != null) {
                            if (this.r.e(q2) > this.r.n()) {
                                co3Var.a();
                            } else {
                                int g3 = this.r.g(q2) - this.r.m();
                                io1 io1Var2 = this.r;
                                if (g3 < 0) {
                                    co3Var.c = io1Var2.m();
                                    co3Var.d = false;
                                } else if (io1Var2.i() - this.r.d(q2) < 0) {
                                    co3Var.c = this.r.i();
                                    co3Var.d = true;
                                } else {
                                    boolean z9 = co3Var.d;
                                    io1 io1Var3 = this.r;
                                    if (z9) {
                                        int d = io1Var3.d(q2);
                                        io1 io1Var4 = this.r;
                                        if (Integer.MIN_VALUE == io1Var4.a) {
                                            n2 = 0;
                                        } else {
                                            n2 = io1Var4.n() - io1Var4.a;
                                        }
                                        g = n2 + d;
                                    } else {
                                        g = io1Var3.g(q2);
                                    }
                                    co3Var.c = g;
                                }
                            }
                        } else {
                            if (v() > 0) {
                                if (this.x < q65.G(u(0))) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3 == this.u) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                co3Var.d = z4;
                            }
                            co3Var.a();
                        }
                    } else {
                        boolean z10 = this.u;
                        co3Var.d = z10;
                        io1 io1Var5 = this.r;
                        if (z10) {
                            co3Var.c = io1Var5.i() - this.y;
                        } else {
                            co3Var.c = io1Var5.m() + this.y;
                        }
                    }
                    co3Var.e = true;
                } else {
                    this.x = -1;
                    this.y = Integer.MIN_VALUE;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.b;
                View view2 = (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.b).contains(view2)) ? null : null;
                if (view2 != null) {
                    r65 r65Var = (r65) view2.getLayoutParams();
                    if (!r65Var.a.h() && r65Var.a.b() >= 0 && r65Var.a.b() < c75Var.b()) {
                        co3Var.b(view2, q65.G(view2));
                        co3Var.e = true;
                    }
                }
                boolean z11 = this.s;
                boolean z12 = this.v;
                if (z11 == z12 && (Q0 = Q0(w65Var, c75Var, co3Var.d, z12)) != null) {
                    int G = q65.G(Q0);
                    boolean z13 = co3Var.d;
                    io1 io1Var6 = co3Var.a;
                    if (z13) {
                        int d2 = io1Var6.d(Q0);
                        io1 io1Var7 = co3Var.a;
                        if (Integer.MIN_VALUE == io1Var7.a) {
                            n = 0;
                        } else {
                            n = io1Var7.n() - io1Var7.a;
                        }
                        co3Var.c = n + d2;
                    } else {
                        co3Var.c = io1Var6.g(Q0);
                    }
                    co3Var.b = G;
                    if (!c75Var.g && C0()) {
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
                            if (co3Var.d) {
                                m = i13;
                            }
                            co3Var.c = m;
                        }
                    }
                    co3Var.e = true;
                }
            }
            co3Var.a();
            if (this.v) {
                i = c75Var.b() - 1;
            } else {
                i = 0;
            }
            co3Var.b = i;
            co3Var.e = true;
        }
        eo3 eo3Var = this.q;
        if (eo3Var.j >= 0) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        eo3Var.f = i3;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(c75Var, iArr);
        int m2 = this.r.m() + Math.max(0, iArr[0]);
        int j = this.r.j() + Math.max(0, iArr[1]);
        if (c75Var.g && (i8 = this.x) != -1 && this.y != Integer.MIN_VALUE && (q = q(i8)) != null) {
            boolean z14 = this.u;
            io1 io1Var8 = this.r;
            if (z14) {
                i9 = io1Var8.i() - this.r.d(q);
                g2 = this.y;
            } else {
                g2 = io1Var8.g(q) - this.r.m();
                i9 = this.y;
            }
            int i14 = i9 - g2;
            if (i14 > 0) {
                m2 += i14;
            } else {
                j -= i14;
            }
        }
        boolean z15 = co3Var.d;
        boolean z16 = this.u;
        if (!z15 ? !z16 : z16) {
            i11 = 1;
        }
        X0(w65Var, c75Var, co3Var, i11);
        p(w65Var);
        eo3 eo3Var2 = this.q;
        if (this.r.k() == 0 && this.r.h() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        eo3Var2.l = z5;
        this.q.getClass();
        this.q.i = 0;
        boolean z17 = co3Var.d;
        int i15 = co3Var.b;
        if (z17) {
            g1(i15, co3Var.c);
            eo3 eo3Var3 = this.q;
            eo3Var3.h = m2;
            K0(w65Var, eo3Var3, c75Var, false);
            eo3 eo3Var4 = this.q;
            i5 = eo3Var4.b;
            int i16 = eo3Var4.d;
            int i17 = eo3Var4.c;
            if (i17 > 0) {
                j += i17;
            }
            f1(co3Var.b, co3Var.c);
            eo3 eo3Var5 = this.q;
            eo3Var5.h = j;
            eo3Var5.d += eo3Var5.e;
            K0(w65Var, eo3Var5, c75Var, false);
            eo3 eo3Var6 = this.q;
            i4 = eo3Var6.b;
            int i18 = eo3Var6.c;
            if (i18 > 0) {
                g1(i16, i5);
                eo3 eo3Var7 = this.q;
                eo3Var7.h = i18;
                K0(w65Var, eo3Var7, c75Var, false);
                i5 = this.q.b;
            }
        } else {
            f1(i15, co3Var.c);
            eo3 eo3Var8 = this.q;
            eo3Var8.h = j;
            K0(w65Var, eo3Var8, c75Var, false);
            eo3 eo3Var9 = this.q;
            i4 = eo3Var9.b;
            int i19 = eo3Var9.d;
            int i20 = eo3Var9.c;
            if (i20 > 0) {
                m2 += i20;
            }
            g1(co3Var.b, co3Var.c);
            eo3 eo3Var10 = this.q;
            eo3Var10.h = m2;
            eo3Var10.d += eo3Var10.e;
            K0(w65Var, eo3Var10, c75Var, false);
            eo3 eo3Var11 = this.q;
            int i21 = eo3Var11.b;
            int i22 = eo3Var11.c;
            if (i22 > 0) {
                f1(i19, i4);
                eo3 eo3Var12 = this.q;
                eo3Var12.h = i22;
                K0(w65Var, eo3Var12, c75Var, false);
                i4 = this.q.b;
            }
            i5 = i21;
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int R02 = R0(i4, w65Var, c75Var, true);
                i6 = i5 + R02;
                i7 = i4 + R02;
                R0 = S0(i6, w65Var, c75Var, false);
            } else {
                int S0 = S0(i5, w65Var, c75Var, true);
                i6 = i5 + S0;
                i7 = i4 + S0;
                R0 = R0(i7, w65Var, c75Var, false);
            }
            i5 = i6 + R0;
            i4 = i7 + R0;
        }
        if (c75Var.k && v() != 0 && !c75Var.g && C0()) {
            List list2 = (List) w65Var.f;
            int size = list2.size();
            int G2 = q65.G(u(0));
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i23 < size) {
                g75 g75Var = (g75) list2.get(i23);
                boolean h = g75Var.h();
                View view3 = g75Var.a;
                if (!h) {
                    if (g75Var.b() < G2) {
                        z6 = true;
                    } else {
                        z6 = z7;
                    }
                    boolean z18 = this.u;
                    io1 io1Var9 = this.r;
                    if (z6 != z18) {
                        i24 += io1Var9.e(view3);
                    } else {
                        i25 += io1Var9.e(view3);
                    }
                }
                i23++;
                z7 = false;
            }
            this.q.k = list2;
            if (i24 > 0) {
                g1(q65.G(U0()), i5);
                eo3 eo3Var13 = this.q;
                eo3Var13.h = i24;
                r4 = 0;
                eo3Var13.c = 0;
                eo3Var13.a(null);
                K0(w65Var, this.q, c75Var, false);
            } else {
                r4 = 0;
            }
            if (i25 > 0) {
                f1(q65.G(T0()), i4);
                eo3 eo3Var14 = this.q;
                eo3Var14.h = i25;
                eo3Var14.c = r4;
                list = null;
                eo3Var14.a(null);
                K0(w65Var, this.q, c75Var, r4);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (!c75Var.g) {
            io1 io1Var10 = this.r;
            io1Var10.a = io1Var10.n();
        } else {
            co3Var.c();
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

    @Override // defpackage.q65
    public final boolean e() {
        if (this.p == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.q65
    public void e0(c75 c75Var) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void e1(int i, int i2, boolean z, c75 c75Var) {
        boolean z2;
        int i3;
        int m;
        eo3 eo3Var = this.q;
        boolean z3 = false;
        int i4 = 1;
        if (this.r.k() == 0 && this.r.h() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        eo3Var.l = z2;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(c75Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        eo3 eo3Var2 = this.q;
        if (z3) {
            i3 = max2;
        } else {
            i3 = max;
        }
        eo3Var2.h = i3;
        if (!z3) {
            max = max2;
        }
        eo3Var2.i = max;
        if (z3) {
            eo3Var2.h = this.r.j() + i3;
            View T0 = T0();
            eo3 eo3Var3 = this.q;
            if (this.u) {
                i4 = -1;
            }
            eo3Var3.e = i4;
            int G = q65.G(T0);
            eo3 eo3Var4 = this.q;
            eo3Var3.d = G + eo3Var4.e;
            eo3Var4.b = this.r.d(T0);
            m = this.r.d(T0) - this.r.i();
        } else {
            View U0 = U0();
            eo3 eo3Var5 = this.q;
            eo3Var5.h = this.r.m() + eo3Var5.h;
            eo3 eo3Var6 = this.q;
            if (!this.u) {
                i4 = -1;
            }
            eo3Var6.e = i4;
            int G2 = q65.G(U0);
            eo3 eo3Var7 = this.q;
            eo3Var6.d = G2 + eo3Var7.e;
            eo3Var7.b = this.r.g(U0);
            m = (-this.r.g(U0)) + this.r.m();
        }
        eo3 eo3Var8 = this.q;
        eo3Var8.c = i2;
        if (z) {
            eo3Var8.c = i2 - m;
        }
        eo3Var8.g = m;
    }

    @Override // defpackage.q65
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof fo3) {
            fo3 fo3Var = (fo3) parcelable;
            this.z = fo3Var;
            if (this.x != -1) {
                fo3Var.A = -1;
            }
            o0();
        }
    }

    public final void f1(int i, int i2) {
        int i3;
        this.q.c = this.r.i() - i2;
        eo3 eo3Var = this.q;
        if (this.u) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        eo3Var.e = i3;
        eo3Var.d = i;
        eo3Var.f = 1;
        eo3Var.b = i2;
        eo3Var.g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, fo3] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.os.Parcelable, java.lang.Object, fo3] */
    @Override // defpackage.q65
    public final Parcelable g0() {
        fo3 fo3Var = this.z;
        if (fo3Var != null) {
            ?? obj = new Object();
            obj.A = fo3Var.A;
            obj.B = fo3Var.B;
            obj.L = fo3Var.L;
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
                obj2.A = q65.G(T0);
                return obj2;
            }
            View U0 = U0();
            obj2.A = q65.G(U0);
            obj2.B = this.r.g(U0) - this.r.m();
            return obj2;
        }
        obj2.A = -1;
        return obj2;
    }

    public final void g1(int i, int i2) {
        int i3;
        this.q.c = i2 - this.r.m();
        eo3 eo3Var = this.q;
        eo3Var.d = i;
        if (this.u) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        eo3Var.e = i3;
        eo3Var.f = -1;
        eo3Var.b = i2;
        eo3Var.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.q65
    public final void h(int i, int i2, c75 c75Var, yp0 yp0Var) {
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
            e1(i3, Math.abs(i), true, c75Var);
            E0(c75Var, this.q, yp0Var);
        }
    }

    @Override // defpackage.q65
    public final void i(int i, yp0 yp0Var) {
        boolean z;
        int i2;
        fo3 fo3Var = this.z;
        int i3 = -1;
        if (fo3Var != null && (i2 = fo3Var.A) >= 0) {
            z = fo3Var.L;
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
            yp0Var.a(i2, 0);
            i2 += i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    @Override // defpackage.q65
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i0(int r5, android.os.Bundle r6) {
        /*
            r4 = this;
            boolean r0 = super.i0(r5, r6)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 16908343(0x1020037, float:2.3877383E-38)
            r2 = 0
            if (r5 != r0) goto L56
            if (r6 == 0) goto L56
            int r5 = r4.p
            r0 = -1
            if (r5 != r1) goto L2e
            java.lang.String r5 = "android.view.accessibility.action.ARGUMENT_ROW_INT"
            int r5 = r6.getInt(r5, r0)
            if (r5 >= 0) goto L1e
            goto L56
        L1e:
            androidx.recyclerview.widget.RecyclerView r6 = r4.b
            w65 r3 = r6.L
            c75 r6 = r6.c1
            int r6 = r4.I(r3, r6)
            int r6 = r6 - r1
            int r5 = java.lang.Math.min(r5, r6)
            goto L46
        L2e:
            java.lang.String r5 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT"
            int r5 = r6.getInt(r5, r0)
            if (r5 >= 0) goto L37
            goto L56
        L37:
            androidx.recyclerview.widget.RecyclerView r6 = r4.b
            w65 r3 = r6.L
            c75 r6 = r6.c1
            int r6 = r4.x(r3, r6)
            int r6 = r6 - r1
            int r5 = java.lang.Math.min(r5, r6)
        L46:
            if (r5 < 0) goto L56
            r4.x = r5
            r4.y = r2
            fo3 r5 = r4.z
            if (r5 == 0) goto L52
            r5.A = r0
        L52:
            r4.o0()
            return r1
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.i0(int, android.os.Bundle):boolean");
    }

    @Override // defpackage.q65
    public final int j(c75 c75Var) {
        return F0(c75Var);
    }

    @Override // defpackage.q65
    public int k(c75 c75Var) {
        return G0(c75Var);
    }

    @Override // defpackage.q65
    public int l(c75 c75Var) {
        return H0(c75Var);
    }

    @Override // defpackage.q65
    public final int m(c75 c75Var) {
        return F0(c75Var);
    }

    @Override // defpackage.q65
    public int n(c75 c75Var) {
        return G0(c75Var);
    }

    @Override // defpackage.q65
    public int o(c75 c75Var) {
        return H0(c75Var);
    }

    @Override // defpackage.q65
    public int p0(int i, w65 w65Var, c75 c75Var) {
        if (this.p == 1) {
            return 0;
        }
        return b1(i, w65Var, c75Var);
    }

    @Override // defpackage.q65
    public final View q(int i) {
        int v = v();
        if (v == 0) {
            return null;
        }
        int G = i - q65.G(u(0));
        if (G >= 0 && G < v) {
            View u = u(G);
            if (q65.G(u) == i) {
                return u;
            }
        }
        return super.q(i);
    }

    @Override // defpackage.q65
    public final void q0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        fo3 fo3Var = this.z;
        if (fo3Var != null) {
            fo3Var.A = -1;
        }
        o0();
    }

    @Override // defpackage.q65
    public r65 r() {
        return new r65(-2, -2);
    }

    @Override // defpackage.q65
    public int r0(int i, w65 w65Var, c75 c75Var) {
        if (this.p == 0) {
            return 0;
        }
        return b1(i, w65Var, c75Var);
    }

    @Override // defpackage.q65
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

    @Override // defpackage.q65
    public final void S(RecyclerView recyclerView) {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [do3, java.lang.Object] */
    public LinearLayoutManager(int i, boolean z) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new co3();
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

    public void X0(w65 w65Var, c75 c75Var, co3 co3Var, int i) {
    }
}
