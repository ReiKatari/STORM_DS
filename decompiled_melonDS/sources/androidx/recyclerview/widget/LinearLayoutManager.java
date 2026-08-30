package androidx.recyclerview.widget;

import a0.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b6.d;
import b6.g;
import c1.h2;
import f2.s;
import j7.a0;
import j7.b0;
import j7.c0;
import j7.e0;
import j7.e1;
import j7.f1;
import j7.j1;
import j7.k0;
import j7.o;
import j7.t0;
import j7.u0;
import j7.v0;
import j7.y;
import j7.z;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends u0 implements e1 {
    public final y A;
    public final z B;
    public final int C;
    public final int[] D;

    /* renamed from: p  reason: collision with root package name */
    public int f1605p;

    /* renamed from: q  reason: collision with root package name */
    public a0 f1606q;

    /* renamed from: r  reason: collision with root package name */
    public e0 f1607r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1608s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f1609t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1610u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1611v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f1612w;

    /* renamed from: x  reason: collision with root package name */
    public int f1613x;

    /* renamed from: y  reason: collision with root package name */
    public int f1614y;

    /* renamed from: z  reason: collision with root package name */
    public b0 f1615z;

    /* JADX WARN: Type inference failed for: r1v2, types: [j7.z, java.lang.Object] */
    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i10) {
        this.f1605p = 1;
        this.f1609t = false;
        this.f1610u = false;
        this.f1611v = false;
        this.f1612w = true;
        this.f1613x = -1;
        this.f1614y = Integer.MIN_VALUE;
        this.f1615z = null;
        this.A = new y();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        t0 H = u0.H(context, attributeSet, i2, i10);
        c1(H.f7699a);
        boolean z10 = H.f7701c;
        c(null);
        if (z10 != this.f1609t) {
            this.f1609t = z10;
            o0();
        }
        d1(H.f7702d);
    }

    @Override // j7.u0
    public void A0(RecyclerView recyclerView, int i2) {
        c0 c0Var = new c0(recyclerView.getContext());
        c0Var.f7507a = i2;
        B0(c0Var);
    }

    @Override // j7.u0
    public boolean C0() {
        if (this.f1615z == null && this.f1608s == this.f1611v) {
            return true;
        }
        return false;
    }

    public void D0(f1 f1Var, int[] iArr) {
        int i2;
        int i10;
        if (f1Var.f7550a != -1) {
            i2 = this.f1607r.n();
        } else {
            i2 = 0;
        }
        if (this.f1606q.f7495f == -1) {
            i10 = 0;
        } else {
            i10 = i2;
            i2 = 0;
        }
        iArr[0] = i2;
        iArr[1] = i10;
    }

    public void E0(f1 f1Var, a0 a0Var, s sVar) {
        int i2 = a0Var.f7493d;
        if (i2 >= 0 && i2 < f1Var.b()) {
            sVar.a(i2, Math.max(0, a0Var.f7496g));
        }
    }

    public final int F0(f1 f1Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        e0 e0Var = this.f1607r;
        boolean z10 = !this.f1612w;
        return o.d(f1Var, e0Var, M0(z10), L0(z10), this, this.f1612w);
    }

    public final int G0(f1 f1Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        e0 e0Var = this.f1607r;
        boolean z10 = !this.f1612w;
        return o.e(f1Var, e0Var, M0(z10), L0(z10), this, this.f1612w, this.f1610u);
    }

    public final int H0(f1 f1Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        e0 e0Var = this.f1607r;
        boolean z10 = !this.f1612w;
        return o.f(f1Var, e0Var, M0(z10), L0(z10), this, this.f1612w);
    }

    public final int I0(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 != 66) {
                            if (i2 == 130 && this.f1605p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f1605p == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f1605p == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f1605p == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f1605p != 1 && V0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f1605p == 1 || !V0()) {
            return -1;
        } else {
            return 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, j7.a0] */
    public final void J0() {
        if (this.f1606q == null) {
            ?? obj = new Object();
            obj.f7490a = true;
            obj.f7497h = 0;
            obj.f7498i = 0;
            obj.f7500k = null;
            this.f1606q = obj;
        }
    }

    @Override // j7.u0
    public final boolean K() {
        return true;
    }

    public final int K0(h2 h2Var, a0 a0Var, f1 f1Var, boolean z10) {
        int i2;
        int i10 = a0Var.f7492c;
        int i11 = a0Var.f7496g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                a0Var.f7496g = i11 + i10;
            }
            Y0(h2Var, a0Var);
        }
        int i12 = a0Var.f7492c + a0Var.f7497h;
        while (true) {
            if ((!a0Var.f7501l && i12 <= 0) || (i2 = a0Var.f7493d) < 0 || i2 >= f1Var.b()) {
                break;
            }
            z zVar = this.B;
            zVar.f7746a = 0;
            zVar.f7747b = false;
            zVar.f7748c = false;
            zVar.f7749d = false;
            W0(h2Var, f1Var, a0Var, zVar);
            if (!zVar.f7747b) {
                int i13 = a0Var.f7491b;
                int i14 = zVar.f7746a;
                a0Var.f7491b = (a0Var.f7495f * i14) + i13;
                if (!zVar.f7748c || a0Var.f7500k != null || !f1Var.f7556g) {
                    a0Var.f7492c -= i14;
                    i12 -= i14;
                }
                int i15 = a0Var.f7496g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    a0Var.f7496g = i16;
                    int i17 = a0Var.f7492c;
                    if (i17 < 0) {
                        a0Var.f7496g = i16 + i17;
                    }
                    Y0(h2Var, a0Var);
                }
                if (z10 && zVar.f7749d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - a0Var.f7492c;
    }

    @Override // j7.u0
    public final boolean L() {
        return this.f1609t;
    }

    public final View L0(boolean z10) {
        if (this.f1610u) {
            return P0(0, z10, v());
        }
        return P0(v() - 1, z10, -1);
    }

    public final View M0(boolean z10) {
        if (this.f1610u) {
            return P0(v() - 1, z10, -1);
        }
        return P0(0, z10, v());
    }

    public final int N0() {
        View P0 = P0(v() - 1, false, -1);
        if (P0 == null) {
            return -1;
        }
        return u0.G(P0);
    }

    public final View O0(int i2, int i10) {
        int i11;
        int i12;
        J0();
        if (i10 > i2 || i10 < i2) {
            if (this.f1607r.g(u(i2)) < this.f1607r.m()) {
                i11 = 16644;
                i12 = 16388;
            } else {
                i11 = 4161;
                i12 = 4097;
            }
            if (this.f1605p == 0) {
                return this.f7710c.l(i2, i10, i11, i12);
            }
            return this.f7711d.l(i2, i10, i11, i12);
        }
        return u(i2);
    }

    public final View P0(int i2, boolean z10, int i10) {
        int i11;
        J0();
        if (z10) {
            i11 = 24579;
        } else {
            i11 = 320;
        }
        if (this.f1605p == 0) {
            return this.f7710c.l(i2, i10, i11, 320);
        }
        return this.f7711d.l(i2, i10, i11, 320);
    }

    public View Q0(h2 h2Var, f1 f1Var, boolean z10, boolean z11) {
        int i2;
        int i10;
        int i11;
        boolean z12;
        boolean z13;
        J0();
        int v10 = v();
        if (z11) {
            i10 = v() - 1;
            i2 = -1;
            i11 = -1;
        } else {
            i2 = v10;
            i10 = 0;
            i11 = 1;
        }
        int b10 = f1Var.b();
        int m = this.f1607r.m();
        int i12 = this.f1607r.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i2) {
            View u4 = u(i10);
            int G = u0.G(u4);
            int g10 = this.f1607r.g(u4);
            int d4 = this.f1607r.d(u4);
            if (G >= 0 && G < b10) {
                if (((v0) u4.getLayoutParams()).f7722a.h()) {
                    if (view3 == null) {
                        view3 = u4;
                    }
                } else {
                    if (d4 <= m && g10 < m) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (g10 >= i12 && d4 > i12) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z12 && !z13) {
                        return u4;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = u4;
                        }
                        view2 = u4;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = u4;
                        }
                        view2 = u4;
                    }
                }
            }
            i10 += i11;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public final int R0(int i2, h2 h2Var, f1 f1Var, boolean z10) {
        int i10;
        int i11 = this.f1607r.i() - i2;
        if (i11 > 0) {
            int i12 = -b1(-i11, h2Var, f1Var);
            int i13 = i2 + i12;
            if (z10 && (i10 = this.f1607r.i() - i13) > 0) {
                this.f1607r.q(i10);
                return i10 + i12;
            }
            return i12;
        }
        return 0;
    }

    public final int S0(int i2, h2 h2Var, f1 f1Var, boolean z10) {
        int m;
        int m10 = i2 - this.f1607r.m();
        if (m10 > 0) {
            int i10 = -b1(m10, h2Var, f1Var);
            int i11 = i2 + i10;
            if (z10 && (m = i11 - this.f1607r.m()) > 0) {
                this.f1607r.q(-m);
                return i10 - m;
            }
            return i10;
        }
        return 0;
    }

    @Override // j7.u0
    public View T(View view, int i2, h2 h2Var, f1 f1Var) {
        int I0;
        View O0;
        View T0;
        a1();
        if (v() != 0 && (I0 = I0(i2)) != Integer.MIN_VALUE) {
            J0();
            e1(I0, (int) (this.f1607r.n() * 0.33333334f), false, f1Var);
            a0 a0Var = this.f1606q;
            a0Var.f7496g = Integer.MIN_VALUE;
            a0Var.f7490a = false;
            K0(h2Var, a0Var, f1Var, true);
            boolean z10 = this.f1610u;
            if (I0 == -1) {
                if (z10) {
                    O0 = O0(v() - 1, -1);
                } else {
                    O0 = O0(0, v());
                }
            } else if (z10) {
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
        int v10;
        if (this.f1610u) {
            v10 = 0;
        } else {
            v10 = v() - 1;
        }
        return u(v10);
    }

    @Override // j7.u0
    public final void U(AccessibilityEvent accessibilityEvent) {
        int G;
        super.U(accessibilityEvent);
        if (v() > 0) {
            View P0 = P0(0, false, v());
            if (P0 == null) {
                G = -1;
            } else {
                G = u0.G(P0);
            }
            accessibilityEvent.setFromIndex(G);
            accessibilityEvent.setToIndex(N0());
        }
    }

    public final View U0() {
        int i2;
        if (this.f1610u) {
            i2 = v() - 1;
        } else {
            i2 = 0;
        }
        return u(i2);
    }

    @Override // j7.u0
    public void V(h2 h2Var, f1 f1Var, g gVar) {
        super.V(h2Var, f1Var, gVar);
        k0 k0Var = this.f7709b.f1638j0;
        if (k0Var != null && k0Var.a() > 0) {
            gVar.b(d.m);
        }
    }

    public final boolean V0() {
        if (this.f7709b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void W0(h2 h2Var, f1 f1Var, a0 a0Var, z zVar) {
        boolean z10;
        int f8;
        int i2;
        int i10;
        int i11;
        int D;
        boolean z11;
        View b10 = a0Var.b(h2Var);
        if (b10 == null) {
            zVar.f7747b = true;
            return;
        }
        v0 v0Var = (v0) b10.getLayoutParams();
        List list = a0Var.f7500k;
        boolean z12 = this.f1610u;
        int i12 = a0Var.f7495f;
        if (list == null) {
            if (i12 == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                b(b10, -1, false);
            } else {
                b(b10, 0, false);
            }
        } else {
            if (i12 == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z12 == z10) {
                b(b10, -1, true);
            } else {
                b(b10, 0, true);
            }
        }
        v0 v0Var2 = (v0) b10.getLayoutParams();
        Rect O = this.f7709b.O(b10);
        int i13 = O.left + O.right;
        int i14 = O.top + O.bottom;
        int w10 = u0.w(d(), this.f7720n, this.f7719l, E() + D() + ((ViewGroup.MarginLayoutParams) v0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) v0Var2).rightMargin + i13, ((ViewGroup.MarginLayoutParams) v0Var2).width);
        int w11 = u0.w(e(), this.f7721o, this.m, C() + F() + ((ViewGroup.MarginLayoutParams) v0Var2).topMargin + ((ViewGroup.MarginLayoutParams) v0Var2).bottomMargin + i14, ((ViewGroup.MarginLayoutParams) v0Var2).height);
        if (x0(b10, w10, w11, v0Var2)) {
            b10.measure(w10, w11);
        }
        zVar.f7746a = this.f1607r.e(b10);
        if (this.f1605p == 1) {
            if (V0()) {
                i11 = this.f7720n - E();
                D = i11 - this.f1607r.f(b10);
            } else {
                D = D();
                i11 = this.f1607r.f(b10) + D;
            }
            int i15 = a0Var.f7495f;
            i10 = a0Var.f7491b;
            int i16 = zVar.f7746a;
            if (i15 == -1) {
                int i17 = D;
                f8 = i10;
                i10 -= i16;
                i2 = i17;
            } else {
                i2 = D;
                f8 = i16 + i10;
            }
        } else {
            int F = F();
            f8 = this.f1607r.f(b10) + F;
            int i18 = a0Var.f7495f;
            int i19 = a0Var.f7491b;
            int i20 = zVar.f7746a;
            if (i18 == -1) {
                i2 = i19 - i20;
                i11 = i19;
                i10 = F;
            } else {
                int i21 = i19 + i20;
                i2 = i19;
                i10 = F;
                i11 = i21;
            }
        }
        u0.N(b10, i2, i10, i11, f8);
        if (v0Var.f7722a.h() || v0Var.f7722a.k()) {
            zVar.f7748c = true;
        }
        zVar.f7749d = b10.hasFocusable();
    }

    public final void Y0(h2 h2Var, a0 a0Var) {
        if (a0Var.f7490a && !a0Var.f7501l) {
            int i2 = a0Var.f7496g;
            int i10 = a0Var.f7498i;
            if (a0Var.f7495f == -1) {
                int v10 = v();
                if (i2 >= 0) {
                    int h2 = (this.f1607r.h() - i2) + i10;
                    if (this.f1610u) {
                        for (int i11 = 0; i11 < v10; i11++) {
                            View u4 = u(i11);
                            if (this.f1607r.g(u4) < h2 || this.f1607r.p(u4) < h2) {
                                Z0(h2Var, 0, i11);
                                return;
                            }
                        }
                        return;
                    }
                    int i12 = v10 - 1;
                    for (int i13 = i12; i13 >= 0; i13--) {
                        View u10 = u(i13);
                        if (this.f1607r.g(u10) < h2 || this.f1607r.p(u10) < h2) {
                            Z0(h2Var, i12, i13);
                            return;
                        }
                    }
                }
            } else if (i2 >= 0) {
                int i14 = i2 - i10;
                int v11 = v();
                if (this.f1610u) {
                    int i15 = v11 - 1;
                    for (int i16 = i15; i16 >= 0; i16--) {
                        View u11 = u(i16);
                        if (this.f1607r.d(u11) > i14 || this.f1607r.o(u11) > i14) {
                            Z0(h2Var, i15, i16);
                            return;
                        }
                    }
                    return;
                }
                for (int i17 = 0; i17 < v11; i17++) {
                    View u12 = u(i17);
                    if (this.f1607r.d(u12) > i14 || this.f1607r.o(u12) > i14) {
                        Z0(h2Var, 0, i17);
                        return;
                    }
                }
            }
        }
    }

    public final void Z0(h2 h2Var, int i2, int i10) {
        if (i2 != i10) {
            if (i10 > i2) {
                for (int i11 = i10 - 1; i11 >= i2; i11--) {
                    View u4 = u(i11);
                    m0(i11);
                    h2Var.l(u4);
                }
                return;
            }
            while (i2 > i10) {
                View u10 = u(i2);
                m0(i2);
                h2Var.l(u10);
                i2--;
            }
        }
    }

    @Override // j7.e1
    public final PointF a(int i2) {
        if (v() == 0) {
            return null;
        }
        boolean z10 = false;
        int i10 = 1;
        if (i2 < u0.G(u(0))) {
            z10 = true;
        }
        if (z10 != this.f1610u) {
            i10 = -1;
        }
        if (this.f1605p == 0) {
            return new PointF(i10, 0.0f);
        }
        return new PointF(0.0f, i10);
    }

    public final void a1() {
        if (this.f1605p != 1 && V0()) {
            this.f1610u = !this.f1609t;
        } else {
            this.f1610u = this.f1609t;
        }
    }

    public final int b1(int i2, h2 h2Var, f1 f1Var) {
        int i10;
        if (v() != 0 && i2 != 0) {
            J0();
            this.f1606q.f7490a = true;
            if (i2 > 0) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int abs = Math.abs(i2);
            e1(i10, abs, true, f1Var);
            a0 a0Var = this.f1606q;
            int K0 = K0(h2Var, a0Var, f1Var, false) + a0Var.f7496g;
            if (K0 >= 0) {
                if (abs > K0) {
                    i2 = i10 * K0;
                }
                this.f1607r.q(-i2);
                this.f1606q.f7499j = i2;
                return i2;
            }
        }
        return 0;
    }

    @Override // j7.u0
    public final void c(String str) {
        if (this.f1615z == null) {
            super.c(str);
        }
    }

    public final void c1(int i2) {
        if (i2 != 0 && i2 != 1) {
            j.h(w.d.l(i2, "invalid orientation:"));
            return;
        }
        c(null);
        if (i2 == this.f1605p && this.f1607r != null) {
            return;
        }
        e0 b10 = e0.b(this, i2);
        this.f1607r = b10;
        this.A.f7737a = b10;
        this.f1605p = i2;
        o0();
    }

    @Override // j7.u0
    public final boolean d() {
        if (this.f1605p == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // j7.u0
    public void d0(h2 h2Var, f1 f1Var) {
        int i2;
        View Q0;
        boolean z10;
        boolean z11;
        int n10;
        int i10;
        boolean z12;
        boolean z13;
        int g10;
        int n11;
        int i11;
        boolean z14;
        int i12;
        int i13;
        ?? r42;
        List list;
        boolean z15;
        int i14;
        int i15;
        int R0;
        int i16;
        View q10;
        int g11;
        int i17;
        int i18;
        int i19 = -1;
        if ((this.f1615z != null || this.f1613x != -1) && f1Var.b() == 0) {
            j0(h2Var);
            return;
        }
        b0 b0Var = this.f1615z;
        if (b0Var != null && (i18 = b0Var.A) >= 0) {
            this.f1613x = i18;
        }
        J0();
        boolean z16 = false;
        this.f1606q.f7490a = false;
        a1();
        RecyclerView recyclerView = this.f7709b;
        View view = (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f7708a.f3863e).contains(view)) ? null : null;
        y yVar = this.A;
        if (yVar.f7741e && this.f1613x == -1 && this.f1615z == null) {
            if (view != null && (this.f1607r.g(view) >= this.f1607r.i() || this.f1607r.d(view) <= this.f1607r.m())) {
                yVar.b(view, u0.G(view));
            }
        } else {
            yVar.c();
            yVar.f7740d = this.f1610u ^ this.f1611v;
            if (!f1Var.f7556g && (i10 = this.f1613x) != -1) {
                if (i10 >= 0 && i10 < f1Var.b()) {
                    int i20 = this.f1613x;
                    yVar.f7738b = i20;
                    b0 b0Var2 = this.f1615z;
                    if (b0Var2 != null && b0Var2.A >= 0) {
                        boolean z17 = b0Var2.L;
                        yVar.f7740d = z17;
                        e0 e0Var = this.f1607r;
                        if (z17) {
                            yVar.f7739c = e0Var.i() - this.f1615z.B;
                        } else {
                            yVar.f7739c = e0Var.m() + this.f1615z.B;
                        }
                    } else if (this.f1614y == Integer.MIN_VALUE) {
                        View q11 = q(i20);
                        if (q11 != null) {
                            if (this.f1607r.e(q11) > this.f1607r.n()) {
                                yVar.a();
                            } else {
                                int g12 = this.f1607r.g(q11) - this.f1607r.m();
                                e0 e0Var2 = this.f1607r;
                                if (g12 < 0) {
                                    yVar.f7739c = e0Var2.m();
                                    yVar.f7740d = false;
                                } else if (e0Var2.i() - this.f1607r.d(q11) < 0) {
                                    yVar.f7739c = this.f1607r.i();
                                    yVar.f7740d = true;
                                } else {
                                    boolean z18 = yVar.f7740d;
                                    e0 e0Var3 = this.f1607r;
                                    if (z18) {
                                        int d4 = e0Var3.d(q11);
                                        e0 e0Var4 = this.f1607r;
                                        if (Integer.MIN_VALUE == e0Var4.f7541a) {
                                            n11 = 0;
                                        } else {
                                            n11 = e0Var4.n() - e0Var4.f7541a;
                                        }
                                        g10 = n11 + d4;
                                    } else {
                                        g10 = e0Var3.g(q11);
                                    }
                                    yVar.f7739c = g10;
                                }
                            }
                        } else {
                            if (v() > 0) {
                                if (this.f1613x < u0.G(u(0))) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12 == this.f1610u) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                yVar.f7740d = z13;
                            }
                            yVar.a();
                        }
                    } else {
                        boolean z19 = this.f1610u;
                        yVar.f7740d = z19;
                        e0 e0Var5 = this.f1607r;
                        if (z19) {
                            yVar.f7739c = e0Var5.i() - this.f1614y;
                        } else {
                            yVar.f7739c = e0Var5.m() + this.f1614y;
                        }
                    }
                    yVar.f7741e = true;
                } else {
                    this.f1613x = -1;
                    this.f1614y = Integer.MIN_VALUE;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f7709b;
                View view2 = (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f7708a.f3863e).contains(view2)) ? null : null;
                if (view2 != null) {
                    v0 v0Var = (v0) view2.getLayoutParams();
                    if (!v0Var.f7722a.h() && v0Var.f7722a.b() >= 0 && v0Var.f7722a.b() < f1Var.b()) {
                        yVar.b(view2, u0.G(view2));
                        yVar.f7741e = true;
                    }
                }
                boolean z20 = this.f1608s;
                boolean z21 = this.f1611v;
                if (z20 == z21 && (Q0 = Q0(h2Var, f1Var, yVar.f7740d, z21)) != null) {
                    int G = u0.G(Q0);
                    boolean z22 = yVar.f7740d;
                    e0 e0Var6 = yVar.f7737a;
                    if (z22) {
                        int d10 = e0Var6.d(Q0);
                        e0 e0Var7 = yVar.f7737a;
                        if (Integer.MIN_VALUE == e0Var7.f7541a) {
                            n10 = 0;
                        } else {
                            n10 = e0Var7.n() - e0Var7.f7541a;
                        }
                        yVar.f7739c = n10 + d10;
                    } else {
                        yVar.f7739c = e0Var6.g(Q0);
                    }
                    yVar.f7738b = G;
                    if (!f1Var.f7556g && C0()) {
                        int g13 = this.f1607r.g(Q0);
                        int d11 = this.f1607r.d(Q0);
                        int m = this.f1607r.m();
                        int i21 = this.f1607r.i();
                        if (d11 <= m && g13 < m) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (g13 >= i21 && d11 > i21) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 || z11) {
                            if (yVar.f7740d) {
                                m = i21;
                            }
                            yVar.f7739c = m;
                        }
                    }
                    yVar.f7741e = true;
                }
            }
            yVar.a();
            if (this.f1611v) {
                i2 = f1Var.b() - 1;
            } else {
                i2 = 0;
            }
            yVar.f7738b = i2;
            yVar.f7741e = true;
        }
        a0 a0Var = this.f1606q;
        if (a0Var.f7499j >= 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        a0Var.f7495f = i11;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(f1Var, iArr);
        int m10 = this.f1607r.m() + Math.max(0, iArr[0]);
        int j2 = this.f1607r.j() + Math.max(0, iArr[1]);
        if (f1Var.f7556g && (i16 = this.f1613x) != -1 && this.f1614y != Integer.MIN_VALUE && (q10 = q(i16)) != null) {
            boolean z23 = this.f1610u;
            e0 e0Var8 = this.f1607r;
            if (z23) {
                i17 = e0Var8.i() - this.f1607r.d(q10);
                g11 = this.f1614y;
            } else {
                g11 = e0Var8.g(q10) - this.f1607r.m();
                i17 = this.f1614y;
            }
            int i22 = i17 - g11;
            if (i22 > 0) {
                m10 += i22;
            } else {
                j2 -= i22;
            }
        }
        boolean z24 = yVar.f7740d;
        boolean z25 = this.f1610u;
        if (!z24 ? !z25 : z25) {
            i19 = 1;
        }
        X0(h2Var, f1Var, yVar, i19);
        p(h2Var);
        a0 a0Var2 = this.f1606q;
        if (this.f1607r.k() == 0 && this.f1607r.h() == 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        a0Var2.f7501l = z14;
        this.f1606q.getClass();
        this.f1606q.f7498i = 0;
        boolean z26 = yVar.f7740d;
        int i23 = yVar.f7738b;
        if (z26) {
            g1(i23, yVar.f7739c);
            a0 a0Var3 = this.f1606q;
            a0Var3.f7497h = m10;
            K0(h2Var, a0Var3, f1Var, false);
            a0 a0Var4 = this.f1606q;
            i13 = a0Var4.f7491b;
            int i24 = a0Var4.f7493d;
            int i25 = a0Var4.f7492c;
            if (i25 > 0) {
                j2 += i25;
            }
            f1(yVar.f7738b, yVar.f7739c);
            a0 a0Var5 = this.f1606q;
            a0Var5.f7497h = j2;
            a0Var5.f7493d += a0Var5.f7494e;
            K0(h2Var, a0Var5, f1Var, false);
            a0 a0Var6 = this.f1606q;
            i12 = a0Var6.f7491b;
            int i26 = a0Var6.f7492c;
            if (i26 > 0) {
                g1(i24, i13);
                a0 a0Var7 = this.f1606q;
                a0Var7.f7497h = i26;
                K0(h2Var, a0Var7, f1Var, false);
                i13 = this.f1606q.f7491b;
            }
        } else {
            f1(i23, yVar.f7739c);
            a0 a0Var8 = this.f1606q;
            a0Var8.f7497h = j2;
            K0(h2Var, a0Var8, f1Var, false);
            a0 a0Var9 = this.f1606q;
            i12 = a0Var9.f7491b;
            int i27 = a0Var9.f7493d;
            int i28 = a0Var9.f7492c;
            if (i28 > 0) {
                m10 += i28;
            }
            g1(yVar.f7738b, yVar.f7739c);
            a0 a0Var10 = this.f1606q;
            a0Var10.f7497h = m10;
            a0Var10.f7493d += a0Var10.f7494e;
            K0(h2Var, a0Var10, f1Var, false);
            a0 a0Var11 = this.f1606q;
            int i29 = a0Var11.f7491b;
            int i30 = a0Var11.f7492c;
            if (i30 > 0) {
                f1(i27, i12);
                a0 a0Var12 = this.f1606q;
                a0Var12.f7497h = i30;
                K0(h2Var, a0Var12, f1Var, false);
                i12 = this.f1606q.f7491b;
            }
            i13 = i29;
        }
        if (v() > 0) {
            if (this.f1610u ^ this.f1611v) {
                int R02 = R0(i12, h2Var, f1Var, true);
                i14 = i13 + R02;
                i15 = i12 + R02;
                R0 = S0(i14, h2Var, f1Var, false);
            } else {
                int S0 = S0(i13, h2Var, f1Var, true);
                i14 = i13 + S0;
                i15 = i12 + S0;
                R0 = R0(i15, h2Var, f1Var, false);
            }
            i13 = i14 + R0;
            i12 = i15 + R0;
        }
        if (f1Var.f7560k && v() != 0 && !f1Var.f7556g && C0()) {
            List list2 = (List) h2Var.f2434f;
            int size = list2.size();
            int G2 = u0.G(u(0));
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            while (i31 < size) {
                j1 j1Var = (j1) list2.get(i31);
                boolean h2 = j1Var.h();
                View view3 = j1Var.f7594a;
                if (!h2) {
                    if (j1Var.b() < G2) {
                        z15 = true;
                    } else {
                        z15 = z16;
                    }
                    boolean z27 = this.f1610u;
                    e0 e0Var9 = this.f1607r;
                    if (z15 != z27) {
                        i32 += e0Var9.e(view3);
                    } else {
                        i33 += e0Var9.e(view3);
                    }
                }
                i31++;
                z16 = false;
            }
            this.f1606q.f7500k = list2;
            if (i32 > 0) {
                g1(u0.G(U0()), i13);
                a0 a0Var13 = this.f1606q;
                a0Var13.f7497h = i32;
                r42 = 0;
                a0Var13.f7492c = 0;
                a0Var13.a(null);
                K0(h2Var, this.f1606q, f1Var, false);
            } else {
                r42 = 0;
            }
            if (i33 > 0) {
                f1(u0.G(T0()), i12);
                a0 a0Var14 = this.f1606q;
                a0Var14.f7497h = i33;
                a0Var14.f7492c = r42;
                list = null;
                a0Var14.a(null);
                K0(h2Var, this.f1606q, f1Var, r42);
            } else {
                list = null;
            }
            this.f1606q.f7500k = list;
        }
        if (!f1Var.f7556g) {
            e0 e0Var10 = this.f1607r;
            e0Var10.f7541a = e0Var10.n();
        } else {
            yVar.c();
        }
        this.f1608s = this.f1611v;
    }

    public void d1(boolean z10) {
        c(null);
        if (this.f1611v == z10) {
            return;
        }
        this.f1611v = z10;
        o0();
    }

    @Override // j7.u0
    public final boolean e() {
        if (this.f1605p == 1) {
            return true;
        }
        return false;
    }

    @Override // j7.u0
    public void e0(f1 f1Var) {
        this.f1615z = null;
        this.f1613x = -1;
        this.f1614y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void e1(int i2, int i10, boolean z10, f1 f1Var) {
        boolean z11;
        int i11;
        int m;
        a0 a0Var = this.f1606q;
        boolean z12 = false;
        int i12 = 1;
        if (this.f1607r.k() == 0 && this.f1607r.h() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        a0Var.f7501l = z11;
        this.f1606q.f7495f = i2;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(f1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i2 == 1) {
            z12 = true;
        }
        a0 a0Var2 = this.f1606q;
        if (z12) {
            i11 = max2;
        } else {
            i11 = max;
        }
        a0Var2.f7497h = i11;
        if (!z12) {
            max = max2;
        }
        a0Var2.f7498i = max;
        if (z12) {
            a0Var2.f7497h = this.f1607r.j() + i11;
            View T0 = T0();
            a0 a0Var3 = this.f1606q;
            if (this.f1610u) {
                i12 = -1;
            }
            a0Var3.f7494e = i12;
            int G = u0.G(T0);
            a0 a0Var4 = this.f1606q;
            a0Var3.f7493d = G + a0Var4.f7494e;
            a0Var4.f7491b = this.f1607r.d(T0);
            m = this.f1607r.d(T0) - this.f1607r.i();
        } else {
            View U0 = U0();
            a0 a0Var5 = this.f1606q;
            a0Var5.f7497h = this.f1607r.m() + a0Var5.f7497h;
            a0 a0Var6 = this.f1606q;
            if (!this.f1610u) {
                i12 = -1;
            }
            a0Var6.f7494e = i12;
            int G2 = u0.G(U0);
            a0 a0Var7 = this.f1606q;
            a0Var6.f7493d = G2 + a0Var7.f7494e;
            a0Var7.f7491b = this.f1607r.g(U0);
            m = (-this.f1607r.g(U0)) + this.f1607r.m();
        }
        a0 a0Var8 = this.f1606q;
        a0Var8.f7492c = i10;
        if (z10) {
            a0Var8.f7492c = i10 - m;
        }
        a0Var8.f7496g = m;
    }

    @Override // j7.u0
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof b0) {
            b0 b0Var = (b0) parcelable;
            this.f1615z = b0Var;
            if (this.f1613x != -1) {
                b0Var.A = -1;
            }
            o0();
        }
    }

    public final void f1(int i2, int i10) {
        int i11;
        this.f1606q.f7492c = this.f1607r.i() - i10;
        a0 a0Var = this.f1606q;
        if (this.f1610u) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        a0Var.f7494e = i11;
        a0Var.f7493d = i2;
        a0Var.f7495f = 1;
        a0Var.f7491b = i10;
        a0Var.f7496g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j7.b0, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [j7.b0, android.os.Parcelable, java.lang.Object] */
    @Override // j7.u0
    public final Parcelable g0() {
        b0 b0Var = this.f1615z;
        if (b0Var != null) {
            ?? obj = new Object();
            obj.A = b0Var.A;
            obj.B = b0Var.B;
            obj.L = b0Var.L;
            return obj;
        }
        ?? obj2 = new Object();
        if (v() > 0) {
            J0();
            boolean z10 = this.f1608s ^ this.f1610u;
            obj2.L = z10;
            if (z10) {
                View T0 = T0();
                obj2.B = this.f1607r.i() - this.f1607r.d(T0);
                obj2.A = u0.G(T0);
                return obj2;
            }
            View U0 = U0();
            obj2.A = u0.G(U0);
            obj2.B = this.f1607r.g(U0) - this.f1607r.m();
            return obj2;
        }
        obj2.A = -1;
        return obj2;
    }

    public final void g1(int i2, int i10) {
        int i11;
        this.f1606q.f7492c = i10 - this.f1607r.m();
        a0 a0Var = this.f1606q;
        a0Var.f7493d = i2;
        if (this.f1610u) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        a0Var.f7494e = i11;
        a0Var.f7495f = -1;
        a0Var.f7491b = i10;
        a0Var.f7496g = Integer.MIN_VALUE;
    }

    @Override // j7.u0
    public final void h(int i2, int i10, f1 f1Var, s sVar) {
        int i11;
        if (this.f1605p != 0) {
            i2 = i10;
        }
        if (v() != 0 && i2 != 0) {
            J0();
            if (i2 > 0) {
                i11 = 1;
            } else {
                i11 = -1;
            }
            e1(i11, Math.abs(i2), true, f1Var);
            E0(f1Var, this.f1606q, sVar);
        }
    }

    @Override // j7.u0
    public final void i(int i2, s sVar) {
        boolean z10;
        int i10;
        b0 b0Var = this.f1615z;
        int i11 = -1;
        if (b0Var != null && (i10 = b0Var.A) >= 0) {
            z10 = b0Var.L;
        } else {
            a1();
            z10 = this.f1610u;
            i10 = this.f1613x;
            if (i10 == -1) {
                i10 = z10 ? i2 - 1 : 0;
            }
        }
        if (!z10) {
            i11 = 1;
        }
        for (int i12 = 0; i12 < this.C && i10 >= 0 && i10 < i2; i12++) {
            sVar.a(i10, 0);
            i10 += i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    @Override // j7.u0
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
            int r5 = r4.f1605p
            r0 = -1
            if (r5 != r1) goto L2e
            java.lang.String r5 = "android.view.accessibility.action.ARGUMENT_ROW_INT"
            int r5 = r6.getInt(r5, r0)
            if (r5 >= 0) goto L1e
            goto L56
        L1e:
            androidx.recyclerview.widget.RecyclerView r6 = r4.f7709b
            c1.h2 r3 = r6.L
            j7.f1 r6 = r6.f1621a1
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
            androidx.recyclerview.widget.RecyclerView r6 = r4.f7709b
            c1.h2 r3 = r6.L
            j7.f1 r6 = r6.f1621a1
            int r6 = r4.x(r3, r6)
            int r6 = r6 - r1
            int r5 = java.lang.Math.min(r5, r6)
        L46:
            if (r5 < 0) goto L56
            r4.f1613x = r5
            r4.f1614y = r2
            j7.b0 r5 = r4.f1615z
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

    @Override // j7.u0
    public final int j(f1 f1Var) {
        return F0(f1Var);
    }

    @Override // j7.u0
    public int k(f1 f1Var) {
        return G0(f1Var);
    }

    @Override // j7.u0
    public int l(f1 f1Var) {
        return H0(f1Var);
    }

    @Override // j7.u0
    public final int m(f1 f1Var) {
        return F0(f1Var);
    }

    @Override // j7.u0
    public int n(f1 f1Var) {
        return G0(f1Var);
    }

    @Override // j7.u0
    public int o(f1 f1Var) {
        return H0(f1Var);
    }

    @Override // j7.u0
    public int p0(int i2, h2 h2Var, f1 f1Var) {
        if (this.f1605p == 1) {
            return 0;
        }
        return b1(i2, h2Var, f1Var);
    }

    @Override // j7.u0
    public final View q(int i2) {
        int v10 = v();
        if (v10 == 0) {
            return null;
        }
        int G = i2 - u0.G(u(0));
        if (G >= 0 && G < v10) {
            View u4 = u(G);
            if (u0.G(u4) == i2) {
                return u4;
            }
        }
        return super.q(i2);
    }

    @Override // j7.u0
    public final void q0(int i2) {
        this.f1613x = i2;
        this.f1614y = Integer.MIN_VALUE;
        b0 b0Var = this.f1615z;
        if (b0Var != null) {
            b0Var.A = -1;
        }
        o0();
    }

    @Override // j7.u0
    public v0 r() {
        return new v0(-2, -2);
    }

    @Override // j7.u0
    public int r0(int i2, h2 h2Var, f1 f1Var) {
        if (this.f1605p == 0) {
            return 0;
        }
        return b1(i2, h2Var, f1Var);
    }

    @Override // j7.u0
    public final boolean y0() {
        if (this.m != 1073741824 && this.f7719l != 1073741824) {
            int v10 = v();
            for (int i2 = 0; i2 < v10; i2++) {
                ViewGroup.LayoutParams layoutParams = u(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j7.u0
    public final void S(RecyclerView recyclerView) {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [j7.z, java.lang.Object] */
    public LinearLayoutManager(int i2, boolean z10) {
        this.f1605p = 1;
        this.f1609t = false;
        this.f1610u = false;
        this.f1611v = false;
        this.f1612w = true;
        this.f1613x = -1;
        this.f1614y = Integer.MIN_VALUE;
        this.f1615z = null;
        this.A = new y();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        c1(i2);
        c(null);
        if (z10 == this.f1609t) {
            return;
        }
        this.f1609t = z10;
        o0();
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    public void X0(h2 h2Var, f1 f1Var, y yVar, int i2) {
    }
}
