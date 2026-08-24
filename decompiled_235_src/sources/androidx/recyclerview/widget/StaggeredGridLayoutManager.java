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
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends gg5 implements rg5 {
    public final ap3 B;
    public final int C;
    public boolean D;
    public boolean E;
    public yo6 F;
    public final Rect G;
    public final vo6 H;
    public final boolean I;
    public int[] J;
    public final g15 K;
    public final int p;
    public final yz3[] q;
    public final ts1 r;
    public final ts1 s;
    public final int t;
    public int u;
    public final rn3 v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r6v3, types: [rn3, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        ap3 ap3Var = new ap3(29, false);
        this.B = ap3Var;
        this.C = 2;
        this.G = new Rect();
        this.H = new vo6(this);
        this.I = true;
        this.K = new g15(this, 21);
        fg5 H = gg5.H(context, attributeSet, i, i2);
        int i3 = H.a;
        if (i3 != 0 && i3 != 1) {
            i.h("invalid orientation.");
            throw null;
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            ts1 ts1Var = this.r;
            this.r = this.s;
            this.s = ts1Var;
            o0();
        }
        int i4 = H.b;
        c(null);
        if (i4 != this.p) {
            ap3Var.n();
            o0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new yz3[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new yz3(this, i5);
            }
            o0();
        }
        boolean z = H.c;
        c(null);
        yo6 yo6Var = this.F;
        if (yo6Var != null && yo6Var.d0 != z) {
            yo6Var.d0 = z;
        }
        this.w = z;
        o0();
        ?? obj = new Object();
        obj.a = true;
        obj.f = 0;
        obj.g = 0;
        this.v = obj;
        this.r = ts1.b(this, this.t);
        this.s = ts1.b(this, 1 - this.t);
    }

    public static int d1(int i, int i2, int i3) {
        int mode;
        if ((i2 == 0 && i3 == 0) || ((mode = View.MeasureSpec.getMode(i)) != Integer.MIN_VALUE && mode != 1073741824)) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    @Override // defpackage.gg5
    public final void A0(RecyclerView recyclerView, int i) {
        iv3 iv3Var = new iv3(recyclerView.getContext());
        iv3Var.a = i;
        B0(iv3Var);
    }

    @Override // defpackage.gg5
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
                this.B.n();
                this.f = true;
                o0();
                return true;
            }
        }
        return false;
    }

    public final int E0(sg5 sg5Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return gi2.x(sg5Var, this.r, H0(z), G0(z), this, this.I, this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0270, code lost:
        V0(r1, r7);
     */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F0(mg5 mg5Var, rn3 rn3Var, sg5 sg5Var) {
        int i;
        yz3[] yz3VarArr;
        int m;
        int M0;
        int i2;
        BitSet bitSet;
        int i3;
        yz3[] yz3VarArr2;
        yz3 yz3Var;
        ?? r5;
        int k;
        int e;
        int i4;
        int i5;
        BitSet bitSet2;
        int i6;
        int i7;
        mg5 mg5Var2 = mg5Var;
        BitSet bitSet3 = this.y;
        int i8 = this.p;
        bitSet3.set(0, i8, true);
        rn3 rn3Var2 = this.v;
        if (rn3Var2.i) {
            if (rn3Var.e == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (rn3Var.e == 1) {
            i = rn3Var.g + rn3Var.b;
        } else {
            i = rn3Var.f - rn3Var.b;
        }
        int i9 = rn3Var.e;
        int i10 = 0;
        while (true) {
            yz3VarArr = this.q;
            if (i10 >= i8) {
                break;
            }
            if (!((ArrayList) yz3VarArr[i10].f).isEmpty()) {
                c1(yz3VarArr[i10], i9, i);
            }
            i10++;
        }
        boolean z = this.x;
        ts1 ts1Var = this.r;
        if (z) {
            m = ts1Var.i();
        } else {
            m = ts1Var.m();
        }
        boolean z2 = false;
        while (true) {
            int i11 = rn3Var.c;
            if (i11 < 0 || i11 >= sg5Var.b() || (!rn3Var2.i && bitSet3.isEmpty())) {
                break;
            }
            View e2 = mg5Var2.e(rn3Var.c);
            rn3Var.c += rn3Var.d;
            wo6 wo6Var = (wo6) e2.getLayoutParams();
            int b = wo6Var.a.b();
            ap3 ap3Var = this.B;
            int[] iArr = (int[]) ap3Var.B;
            if (iArr != null && b < iArr.length) {
                i2 = iArr[b];
            } else {
                i2 = -1;
            }
            if (i2 == -1) {
                if (T0(rn3Var.e)) {
                    i3 = i8;
                    i7 = i8 - 1;
                    i8 = -1;
                    i6 = -1;
                } else {
                    i3 = i8;
                    i6 = 1;
                    i7 = 0;
                }
                yz3 yz3Var2 = null;
                int i12 = i6;
                if (rn3Var.e == 1) {
                    int m2 = ts1Var.m();
                    yz3VarArr2 = yz3VarArr;
                    int i13 = i7;
                    int i14 = Integer.MAX_VALUE;
                    while (i13 != i8) {
                        int i15 = i13;
                        yz3 yz3Var3 = yz3VarArr2[i15];
                        BitSet bitSet4 = bitSet3;
                        int i16 = yz3Var3.i(m2);
                        if (i16 < i14) {
                            i14 = i16;
                            yz3Var2 = yz3Var3;
                        }
                        i13 = i15 + i12;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    yz3VarArr2 = yz3VarArr;
                    int i17 = ts1Var.i();
                    int i18 = i7;
                    int i19 = Integer.MIN_VALUE;
                    while (i18 != i8) {
                        yz3 yz3Var4 = yz3VarArr2[i18];
                        int i20 = i8;
                        int k2 = yz3Var4.k(i17);
                        if (k2 > i19) {
                            i19 = k2;
                            yz3Var2 = yz3Var4;
                        }
                        i18 += i12;
                        i8 = i20;
                    }
                }
                yz3Var = yz3Var2;
                ap3Var.q(b);
                ((int[]) ap3Var.B)[b] = yz3Var.e;
            } else {
                bitSet = bitSet3;
                i3 = i8;
                yz3VarArr2 = yz3VarArr;
                yz3Var = yz3VarArr2[i2];
            }
            wo6Var.e = yz3Var;
            if (rn3Var.e == 1) {
                r5 = 0;
                b(e2, -1, false);
            } else {
                r5 = 0;
                b(e2, 0, false);
            }
            int i21 = this.t;
            if (i21 == 1) {
                R0(e2, gg5.w(r5, this.u, this.l, r5, ((ViewGroup.MarginLayoutParams) wo6Var).width), gg5.w(true, this.o, this.m, C() + F(), ((ViewGroup.MarginLayoutParams) wo6Var).height));
            } else {
                R0(e2, gg5.w(true, this.n, this.l, E() + D(), ((ViewGroup.MarginLayoutParams) wo6Var).width), gg5.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) wo6Var).height));
            }
            if (rn3Var.e == 1) {
                e = yz3Var.i(m);
                k = ts1Var.e(e2) + e;
            } else {
                k = yz3Var.k(m);
                e = k - ts1Var.e(e2);
            }
            int i22 = rn3Var.e;
            yz3 yz3Var5 = wo6Var.e;
            if (i22 == 1) {
                yz3Var5.getClass();
                wo6 wo6Var2 = (wo6) e2.getLayoutParams();
                wo6Var2.e = yz3Var5;
                ArrayList arrayList = (ArrayList) yz3Var5.f;
                arrayList.add(e2);
                yz3Var5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    yz3Var5.b = Integer.MIN_VALUE;
                }
                if (wo6Var2.a.h() || wo6Var2.a.k()) {
                    yz3Var5.d = ((StaggeredGridLayoutManager) yz3Var5.g).r.e(e2) + yz3Var5.d;
                }
            } else {
                yz3Var5.getClass();
                wo6 wo6Var3 = (wo6) e2.getLayoutParams();
                wo6Var3.e = yz3Var5;
                ArrayList arrayList2 = (ArrayList) yz3Var5.f;
                arrayList2.add(0, e2);
                yz3Var5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    yz3Var5.c = Integer.MIN_VALUE;
                }
                if (wo6Var3.a.h() || wo6Var3.a.k()) {
                    yz3Var5.d = ((StaggeredGridLayoutManager) yz3Var5.g).r.e(e2) + yz3Var5.d;
                }
            }
            boolean Q0 = Q0();
            ts1 ts1Var2 = this.s;
            if (Q0 && i21 == 1) {
                i5 = ts1Var2.i() - (((i3 - 1) - yz3Var.e) * this.u);
                i4 = i5 - ts1Var2.e(e2);
            } else {
                int m3 = (yz3Var.e * this.u) + ts1Var2.m();
                int e3 = ts1Var2.e(e2) + m3;
                i4 = m3;
                i5 = e3;
            }
            z2 = true;
            if (i21 == 1) {
                gg5.N(e2, i4, e, i5, k);
            } else {
                gg5.N(e2, e, i4, k, i5);
            }
            c1(yz3Var, rn3Var2.e, i);
            mg5Var2 = mg5Var;
            V0(mg5Var2, rn3Var2);
            if (rn3Var2.h && e2.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(yz3Var.e, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i8 = i3;
            yz3VarArr = yz3VarArr2;
        }
        if (rn3Var2.e == -1) {
            M0 = ts1Var.m() - N0(ts1Var.m());
        } else {
            M0 = M0(ts1Var.i()) - ts1Var.i();
        }
        if (M0 > 0) {
            return Math.min(rn3Var.b, M0);
        }
        return 0;
    }

    public final View G0(boolean z) {
        ts1 ts1Var = this.r;
        int m = ts1Var.m();
        int i = ts1Var.i();
        View view = null;
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            int g = ts1Var.g(u);
            int d = ts1Var.d(u);
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
        ts1 ts1Var = this.r;
        int m = ts1Var.m();
        int i = ts1Var.i();
        int v = v();
        View view = null;
        for (int i2 = 0; i2 < v; i2++) {
            View u = u(i2);
            int g = ts1Var.g(u);
            if (ts1Var.d(u) > m && g < i) {
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

    @Override // defpackage.gg5
    public final int I(mg5 mg5Var, sg5 sg5Var) {
        if (this.t == 0) {
            return Math.min(this.p, sg5Var.b());
        }
        return -1;
    }

    public final void I0(mg5 mg5Var, sg5 sg5Var, boolean z) {
        int i;
        int M0 = M0(Integer.MIN_VALUE);
        if (M0 != Integer.MIN_VALUE && (i = this.r.i() - M0) > 0) {
            int i2 = i - (-Z0(-i, mg5Var, sg5Var));
            if (z && i2 > 0) {
                this.r.q(i2);
            }
        }
    }

    public final void J0(mg5 mg5Var, sg5 sg5Var, boolean z) {
        int m;
        int N0 = N0(Integer.MAX_VALUE);
        if (N0 != Integer.MAX_VALUE && (m = N0 - this.r.m()) > 0) {
            int Z0 = m - Z0(m, mg5Var, sg5Var);
            if (z && Z0 > 0) {
                this.r.q(-Z0);
            }
        }
    }

    @Override // defpackage.gg5
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
        return gg5.G(u(0));
    }

    @Override // defpackage.gg5
    public final boolean L() {
        return this.w;
    }

    public final int L0() {
        int v = v();
        if (v == 0) {
            return 0;
        }
        return gg5.G(u(v - 1));
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

    @Override // defpackage.gg5
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            yz3 yz3Var = this.q[i2];
            int i3 = yz3Var.b;
            if (i3 != Integer.MIN_VALUE) {
                yz3Var.b = i3 + i;
            }
            int i4 = yz3Var.c;
            if (i4 != Integer.MIN_VALUE) {
                yz3Var.c = i4 + i;
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
    */
    public final void O0(int i, int i2, int i3) {
        int K0;
        int i4;
        int i5;
        ap3 ap3Var;
        int[] iArr;
        int L0;
        ArrayList arrayList;
        xo6 xo6Var;
        int i6;
        if (this.x) {
            K0 = L0();
        } else {
            K0 = K0();
        }
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
                ap3Var = this.B;
                iArr = (int[]) ap3Var.B;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) ap3Var.L;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                xo6Var = (xo6) ((ArrayList) ap3Var.L).get(size);
                                if (xo6Var.A == i5) {
                                    break;
                                }
                            }
                        }
                        xo6Var = null;
                        if (xo6Var != null) {
                            ((ArrayList) ap3Var.L).remove(xo6Var);
                        }
                        int size2 = ((ArrayList) ap3Var.L).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size2) {
                                if (((xo6) ((ArrayList) ap3Var.L).get(i7)).A >= i5) {
                                    break;
                                }
                                i7++;
                            } else {
                                i7 = -1;
                                break;
                            }
                        }
                        if (i7 != -1) {
                            ((ArrayList) ap3Var.L).remove(i7);
                            i6 = ((xo6) ((ArrayList) ap3Var.L).get(i7)).A;
                            int[] iArr2 = (int[]) ap3Var.B;
                            if (i6 == -1) {
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) ap3Var.B).length;
                            } else {
                                Arrays.fill((int[]) ap3Var.B, i5, Math.min(i6 + 1, iArr2.length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    int[] iArr22 = (int[]) ap3Var.B;
                    if (i6 == -1) {
                    }
                }
                if (i3 == 1) {
                    if (i3 != 2) {
                        if (i3 == 8) {
                            ap3Var.u(i, 1);
                            ap3Var.t(i2, 1);
                        }
                    } else {
                        ap3Var.u(i, i2);
                    }
                } else {
                    ap3Var.t(i, i2);
                }
                if (i4 <= K0) {
                    if (this.x) {
                        L0 = K0();
                    } else {
                        L0 = L0();
                    }
                    if (i5 <= L0) {
                        o0();
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            i4 = i + i2;
        }
        i5 = i;
        ap3Var = this.B;
        iArr = (int[]) ap3Var.B;
        if (iArr != null) {
            arrayList = (ArrayList) ap3Var.L;
            if (arrayList != null) {
            }
            i6 = -1;
            int[] iArr222 = (int[]) ap3Var.B;
            if (i6 == -1) {
            }
        }
        if (i3 == 1) {
        }
        if (i4 <= K0) {
        }
    }

    @Override // defpackage.gg5
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            yz3 yz3Var = this.q[i2];
            int i3 = yz3Var.b;
            if (i3 != Integer.MIN_VALUE) {
                yz3Var.b = i3 + i;
            }
            int i4 = yz3Var.c;
            if (i4 != Integer.MIN_VALUE) {
                yz3Var.c = i4 + i;
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
    */
    public final View P0() {
        char c;
        boolean z;
        boolean z2;
        int v = v();
        int i = v - 1;
        int i2 = this.p;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        int i3 = -1;
        if (this.t == 1 && Q0()) {
            c = 1;
        } else {
            c = 65535;
        }
        if (this.x) {
            v = -1;
        } else {
            i = 0;
        }
        if (i < v) {
            i3 = 1;
        }
        while (i != v) {
            View u = u(i);
            wo6 wo6Var = (wo6) u.getLayoutParams();
            boolean z3 = bitSet.get(wo6Var.e.e);
            ts1 ts1Var = this.r;
            if (z3) {
                yz3 yz3Var = wo6Var.e;
                if (this.x) {
                    int i4 = yz3Var.c;
                    if (i4 == Integer.MIN_VALUE) {
                        yz3Var.a();
                        i4 = yz3Var.c;
                    }
                    if (i4 < ts1Var.i()) {
                        ArrayList arrayList = (ArrayList) yz3Var.f;
                        ((wo6) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u;
                    }
                } else {
                    int i5 = yz3Var.b;
                    ArrayList arrayList2 = (ArrayList) yz3Var.f;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        yz3Var.b = ((StaggeredGridLayoutManager) yz3Var.g).r.g(view);
                        ((wo6) view.getLayoutParams()).getClass();
                        i5 = yz3Var.b;
                    }
                    if (i5 > ts1Var.m()) {
                        ((wo6) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return u;
                    }
                }
                bitSet.clear(wo6Var.e.e);
            }
            i += i3;
            if (i != v) {
                View u2 = u(i);
                if (this.x) {
                    int d = ts1Var.d(u);
                    int d2 = ts1Var.d(u2);
                    if (d >= d2) {
                        if (d == d2) {
                            if (wo6Var.e.e - ((wo6) u2.getLayoutParams()).e.e >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (c >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z == z2) {
                                return u;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        return u;
                    }
                } else {
                    int g = ts1Var.g(u);
                    int g2 = ts1Var.g(u2);
                    if (g <= g2) {
                        if (g == g2) {
                            if (wo6Var.e.e - ((wo6) u2.getLayoutParams()).e.e >= 0) {
                            }
                            if (c >= 0) {
                            }
                            if (z == z2) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        return u;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.gg5
    public final void Q() {
        this.B.n();
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
        wo6 wo6Var = (wo6) view.getLayoutParams();
        int d1 = d1(i, ((ViewGroup.MarginLayoutParams) wo6Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) wo6Var).rightMargin + rect.right);
        int d12 = d1(i2, ((ViewGroup.MarginLayoutParams) wo6Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) wo6Var).bottomMargin + rect.bottom);
        if (x0(view, d1, d12, wo6Var)) {
            view.measure(d1, d12);
        }
    }

    @Override // defpackage.gg5
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
    */
    public final void S0(mg5 mg5Var, sg5 sg5Var, boolean z) {
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        yo6 yo6Var;
        int k;
        int i2;
        boolean z5;
        int i3;
        boolean z6;
        boolean z7;
        int m;
        int K0;
        int m2;
        int m3;
        yo6 yo6Var2 = this.F;
        vo6 vo6Var = this.H;
        if ((yo6Var2 != null || this.z != -1) && sg5Var.b() == 0) {
            j0(mg5Var);
            vo6Var.a();
            return;
        }
        boolean z8 = vo6Var.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = vo6Var.g;
        if (z8 && this.z == -1 && this.F == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        yz3[] yz3VarArr = this.q;
        int i4 = this.p;
        ap3 ap3Var = this.B;
        if (z2) {
            vo6Var.a();
            yo6 yo6Var3 = this.F;
            ts1 ts1Var = this.r;
            if (yo6Var3 != null) {
                int i5 = yo6Var3.L;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            yz3VarArr[i6].b();
                            yo6 yo6Var4 = this.F;
                            int i7 = yo6Var4.R[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                if (yo6Var4.e0) {
                                    m3 = ts1Var.i();
                                } else {
                                    m3 = ts1Var.m();
                                }
                                i7 += m3;
                            }
                            yz3 yz3Var = yz3VarArr[i6];
                            yz3Var.b = i7;
                            yz3Var.c = i7;
                        }
                    } else {
                        yo6Var3.R = null;
                        yo6Var3.L = 0;
                        yo6Var3.X = 0;
                        yo6Var3.Y = null;
                        yo6Var3.Z = null;
                        yo6Var3.A = yo6Var3.B;
                    }
                }
                yo6 yo6Var5 = this.F;
                this.E = yo6Var5.f0;
                boolean z9 = yo6Var5.d0;
                c(null);
                yo6 yo6Var6 = this.F;
                if (yo6Var6 != null && yo6Var6.d0 != z9) {
                    yo6Var6.d0 = z9;
                }
                this.w = z9;
                o0();
                Y0();
                yo6 yo6Var7 = this.F;
                int i8 = yo6Var7.A;
                if (i8 != -1) {
                    this.z = i8;
                    vo6Var.c = yo6Var7.e0;
                } else {
                    vo6Var.c = this.x;
                }
                if (yo6Var7.X > 1) {
                    ap3Var.B = yo6Var7.Y;
                    ap3Var.L = yo6Var7.Z;
                }
            } else {
                Y0();
                vo6Var.c = this.x;
            }
            if (!sg5Var.g && (i3 = this.z) != -1) {
                if (i3 >= 0 && i3 < sg5Var.b()) {
                    yo6 yo6Var8 = this.F;
                    if (yo6Var8 != null && yo6Var8.A != -1 && yo6Var8.L >= 1) {
                        vo6Var.b = Integer.MIN_VALUE;
                        vo6Var.a = this.z;
                    } else {
                        View q = q(this.z);
                        if (q != null) {
                            if (this.x) {
                                K0 = L0();
                            } else {
                                K0 = K0();
                            }
                            vo6Var.a = K0;
                            if (this.A != Integer.MIN_VALUE) {
                                if (vo6Var.c) {
                                    vo6Var.b = (ts1Var.i() - this.A) - ts1Var.d(q);
                                } else {
                                    vo6Var.b = (ts1Var.m() + this.A) - ts1Var.g(q);
                                }
                            } else if (ts1Var.e(q) > ts1Var.n()) {
                                if (vo6Var.c) {
                                    m2 = ts1Var.i();
                                } else {
                                    m2 = ts1Var.m();
                                }
                                vo6Var.b = m2;
                            } else {
                                int g = ts1Var.g(q) - ts1Var.m();
                                if (g < 0) {
                                    vo6Var.b = -g;
                                } else {
                                    int i9 = ts1Var.i() - ts1Var.d(q);
                                    if (i9 < 0) {
                                        vo6Var.b = i9;
                                    } else {
                                        vo6Var.b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i10 = this.z;
                            vo6Var.a = i10;
                            int i11 = this.A;
                            if (i11 == Integer.MIN_VALUE) {
                                if (v() != 0) {
                                    if (i10 < K0()) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                }
                                vo6Var.c = z7;
                                ts1 ts1Var2 = staggeredGridLayoutManager.r;
                                if (z7) {
                                    m = ts1Var2.i();
                                } else {
                                    m = ts1Var2.m();
                                }
                                vo6Var.b = m;
                            } else {
                                boolean z10 = vo6Var.c;
                                ts1 ts1Var3 = staggeredGridLayoutManager.r;
                                if (z10) {
                                    vo6Var.b = ts1Var3.i() - i11;
                                } else {
                                    vo6Var.b = ts1Var3.m() + i11;
                                }
                            }
                            z5 = true;
                            vo6Var.d = true;
                            vo6Var.e = z5;
                        }
                    }
                    z5 = true;
                    vo6Var.e = z5;
                } else {
                    this.z = -1;
                    this.A = Integer.MIN_VALUE;
                }
            }
            if (this.D) {
                int b = sg5Var.b();
                for (int v = v() - 1; v >= 0; v--) {
                    i2 = gg5.G(u(v));
                    if (i2 >= 0 && i2 < b) {
                        break;
                    }
                }
                i2 = 0;
                vo6Var.a = i2;
                vo6Var.b = Integer.MIN_VALUE;
                z5 = true;
                vo6Var.e = z5;
            } else {
                int b2 = sg5Var.b();
                int v2 = v();
                for (int i12 = 0; i12 < v2; i12++) {
                    int G = gg5.G(u(i12));
                    if (G >= 0 && G < b2) {
                        i2 = G;
                        break;
                    }
                }
                i2 = 0;
                vo6Var.a = i2;
                vo6Var.b = Integer.MIN_VALUE;
                z5 = true;
                vo6Var.e = z5;
            }
        }
        if (this.F != null || this.z != -1 || (vo6Var.c == this.D && Q0() == this.E)) {
            i = 1;
        } else {
            ap3Var.n();
            i = 1;
            vo6Var.d = true;
        }
        if (v() > 0 && ((yo6Var = this.F) == null || yo6Var.L < i)) {
            if (vo6Var.d) {
                for (int i13 = 0; i13 < i4; i13++) {
                    yz3VarArr[i13].b();
                    int i14 = vo6Var.b;
                    if (i14 != Integer.MIN_VALUE) {
                        yz3 yz3Var2 = yz3VarArr[i13];
                        yz3Var2.b = i14;
                        yz3Var2.c = i14;
                    }
                }
            } else if (!z2 && vo6Var.f != null) {
                for (int i15 = 0; i15 < i4; i15++) {
                    yz3 yz3Var3 = yz3VarArr[i15];
                    yz3Var3.b();
                    int i16 = vo6Var.f[i15];
                    yz3Var3.b = i16;
                    yz3Var3.c = i16;
                }
            } else {
                for (int i17 = 0; i17 < i4; i17++) {
                    yz3 yz3Var4 = yz3VarArr[i17];
                    boolean z11 = this.x;
                    int i18 = vo6Var.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) yz3Var4.g;
                    if (z11) {
                        k = yz3Var4.i(Integer.MIN_VALUE);
                    } else {
                        k = yz3Var4.k(Integer.MIN_VALUE);
                    }
                    yz3Var4.b();
                    if (k != Integer.MIN_VALUE && ((!z11 || k >= staggeredGridLayoutManager2.r.i()) && (z11 || k <= staggeredGridLayoutManager2.r.m()))) {
                        if (i18 != Integer.MIN_VALUE) {
                            k += i18;
                        }
                        yz3Var4.c = k;
                        yz3Var4.b = k;
                    }
                }
                int length = yz3VarArr.length;
                int[] iArr = vo6Var.f;
                if (iArr == null || iArr.length < length) {
                    vo6Var.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i19 = 0; i19 < length; i19++) {
                    vo6Var.f[i19] = yz3VarArr[i19].k(Integer.MIN_VALUE);
                }
            }
        }
        p(mg5Var);
        rn3 rn3Var = this.v;
        rn3Var.a = false;
        ts1 ts1Var4 = this.s;
        int n = ts1Var4.n();
        this.u = n / i4;
        View.MeasureSpec.makeMeasureSpec(n, ts1Var4.k());
        b1(vo6Var.a, sg5Var);
        if (vo6Var.c) {
            a1(-1);
            F0(mg5Var, rn3Var, sg5Var);
            a1(1);
            rn3Var.c = vo6Var.a + rn3Var.d;
            F0(mg5Var, rn3Var, sg5Var);
        } else {
            a1(1);
            F0(mg5Var, rn3Var, sg5Var);
            a1(-1);
            rn3Var.c = vo6Var.a + rn3Var.d;
            F0(mg5Var, rn3Var, sg5Var);
        }
        if (ts1Var4.k() != 1073741824) {
            int v3 = v();
            float f = RecyclerView.B1;
            for (int i20 = 0; i20 < v3; i20++) {
                View u = u(i20);
                float e = ts1Var4.e(u);
                if (e >= f) {
                    ((wo6) u.getLayoutParams()).getClass();
                    f = Math.max(f, e);
                }
            }
            int i21 = this.u;
            int round = Math.round(f * i4);
            if (ts1Var4.k() == Integer.MIN_VALUE) {
                round = Math.min(round, ts1Var4.n());
            }
            this.u = round / i4;
            View.MeasureSpec.makeMeasureSpec(round, ts1Var4.k());
            if (this.u != i21) {
                for (int i22 = 0; i22 < v3; i22++) {
                    View u2 = u(i22);
                    wo6 wo6Var = (wo6) u2.getLayoutParams();
                    wo6Var.getClass();
                    boolean Q0 = Q0();
                    int i23 = this.t;
                    if (Q0 && i23 == 1) {
                        int i24 = -((i4 - 1) - wo6Var.e.e);
                        u2.offsetLeftAndRight((this.u * i24) - (i24 * i21));
                    } else {
                        int i25 = wo6Var.e.e;
                        int i26 = this.u * i25;
                        int i27 = i25 * i21;
                        if (i23 == 1) {
                            u2.offsetLeftAndRight(i26 - i27);
                        } else {
                            u2.offsetTopAndBottom(i26 - i27);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.x) {
                z3 = true;
                I0(mg5Var, sg5Var, true);
                J0(mg5Var, sg5Var, false);
            } else {
                z3 = true;
                J0(mg5Var, sg5Var, true);
                I0(mg5Var, sg5Var, false);
            }
        } else {
            z3 = true;
        }
        if (z && !sg5Var.g && this.C != 0 && v() > 0 && P0() != null) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            if (D0()) {
                z4 = z3;
                if (sg5Var.g) {
                    vo6Var.a();
                }
                this.D = vo6Var.c;
                this.E = Q0();
                if (!z4) {
                    vo6Var.a();
                    S0(mg5Var, sg5Var, false);
                    return;
                }
                return;
            }
        }
        z4 = false;
        if (sg5Var.g) {
        }
        this.D = vo6Var.c;
        this.E = Q0();
        if (!z4) {
        }
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
    @Override // defpackage.gg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, mg5 mg5Var, sg5 sg5Var) {
        int i2;
        int K0;
        boolean z;
        boolean z2;
        int f;
        int f2;
        int f3;
        if (v() != 0) {
            RecyclerView recyclerView = this.b;
            View view2 = (recyclerView == null || (view2 = recyclerView.E(view)) == null || ((ArrayList) this.a.B).contains(view2)) ? null : null;
            if (view2 != null) {
                Y0();
                int i3 = this.t;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66) {
                                }
                            }
                            i2 = Integer.MIN_VALUE;
                        }
                    } else {
                        if (i3 != 1) {
                        }
                        i2 = 1;
                    }
                } else {
                    if (i3 != 1) {
                    }
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    wo6 wo6Var = (wo6) view2.getLayoutParams();
                    wo6Var.getClass();
                    yz3 yz3Var = wo6Var.e;
                    if (i2 == 1) {
                        K0 = L0();
                    } else {
                        K0 = K0();
                    }
                    b1(K0, sg5Var);
                    a1(i2);
                    rn3 rn3Var = this.v;
                    rn3Var.c = rn3Var.d + K0;
                    rn3Var.b = (int) (this.r.n() * 0.33333334f);
                    rn3Var.h = true;
                    rn3Var.a = false;
                    F0(mg5Var, rn3Var, sg5Var);
                    this.D = this.x;
                    View j = yz3Var.j(K0, i2);
                    if (j != null && j != view2) {
                        return j;
                    }
                    boolean T0 = T0(i2);
                    yz3[] yz3VarArr = this.q;
                    int i4 = this.p;
                    if (T0) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View j2 = yz3VarArr[i5].j(K0, i2);
                            if (j2 != null && j2 != view2) {
                                return j2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View j3 = yz3VarArr[i6].j(K0, i2);
                            if (j3 != null && j3 != view2) {
                                return j3;
                            }
                        }
                    }
                    boolean z3 = !this.w;
                    if (i2 == -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z3 == z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        f = yz3Var.e();
                    } else {
                        f = yz3Var.f();
                    }
                    View q = q(f);
                    if (q != null && q != view2) {
                        return q;
                    }
                    if (T0(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != yz3Var.e) {
                                if (z2) {
                                    f3 = yz3VarArr[i7].e();
                                } else {
                                    f3 = yz3VarArr[i7].f();
                                }
                                View q2 = q(f3);
                                if (q2 != null && q2 != view2) {
                                    return q2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            if (z2) {
                                f2 = yz3VarArr[i8].e();
                            } else {
                                f2 = yz3VarArr[i8].f();
                            }
                            View q3 = q(f2);
                            if (q3 != null && q3 != view2) {
                                return q3;
                            }
                        }
                    }
                }
            }
        }
        return null;
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

    @Override // defpackage.gg5
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View H0 = H0(false);
            View G0 = G0(false);
            if (H0 != null && G0 != null) {
                int G = gg5.G(H0);
                int G2 = gg5.G(G0);
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

    public final void U0(int i, sg5 sg5Var) {
        int K0;
        int i2;
        if (i > 0) {
            K0 = L0();
            i2 = 1;
        } else {
            K0 = K0();
            i2 = -1;
        }
        rn3 rn3Var = this.v;
        rn3Var.a = true;
        b1(K0, sg5Var);
        a1(i2);
        rn3Var.c = K0 + rn3Var.d;
        rn3Var.b = Math.abs(i);
    }

    @Override // defpackage.gg5
    public final void V(mg5 mg5Var, sg5 sg5Var, v2 v2Var) {
        super.V(mg5Var, sg5Var, v2Var);
        v2Var.i("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void V0(mg5 mg5Var, rn3 rn3Var) {
        if (rn3Var.a && !rn3Var.i) {
            int i = rn3Var.b;
            int i2 = rn3Var.e;
            if (i == 0) {
                if (i2 == -1) {
                    W0(mg5Var, rn3Var.g);
                    return;
                } else {
                    X0(mg5Var, rn3Var.f);
                    return;
                }
            }
            int i3 = this.p;
            yz3[] yz3VarArr = this.q;
            int i4 = 1;
            if (i2 == -1) {
                int i5 = rn3Var.f;
                int k = yz3VarArr[0].k(i5);
                while (i4 < i3) {
                    int k2 = yz3VarArr[i4].k(i5);
                    if (k2 > k) {
                        k = k2;
                    }
                    i4++;
                }
                int i6 = i5 - k;
                int i7 = rn3Var.g;
                if (i6 >= 0) {
                    i7 -= Math.min(i6, rn3Var.b);
                }
                W0(mg5Var, i7);
                return;
            }
            int i8 = rn3Var.g;
            int i9 = yz3VarArr[0].i(i8);
            while (i4 < i3) {
                int i10 = yz3VarArr[i4].i(i8);
                if (i10 < i9) {
                    i9 = i10;
                }
                i4++;
            }
            int i11 = i9 - rn3Var.g;
            int i12 = rn3Var.f;
            if (i11 >= 0) {
                i12 += Math.min(i11, rn3Var.b);
            }
            X0(mg5Var, i12);
        }
    }

    @Override // defpackage.gg5
    public final void W(mg5 mg5Var, sg5 sg5Var, View view, v2 v2Var) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof wo6)) {
            X(view, v2Var);
            return;
        }
        yz3 yz3Var = ((wo6) layoutParams).e;
        if (this.t == 0) {
            if (yz3Var == null) {
                i2 = -1;
            } else {
                i2 = yz3Var.e;
            }
            v2Var.k(u2.b(false, i2, 1, -1, -1));
            return;
        }
        if (yz3Var == null) {
            i = -1;
        } else {
            i = yz3Var.e;
        }
        v2Var.k(u2.b(false, -1, -1, i, 1));
    }

    public final void W0(mg5 mg5Var, int i) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            ts1 ts1Var = this.r;
            if (ts1Var.g(u) >= i && ts1Var.p(u) >= i) {
                wo6 wo6Var = (wo6) u.getLayoutParams();
                wo6Var.getClass();
                if (((ArrayList) wo6Var.e.f).size() != 1) {
                    yz3 yz3Var = wo6Var.e;
                    ArrayList arrayList = (ArrayList) yz3Var.f;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    wo6 wo6Var2 = (wo6) view.getLayoutParams();
                    wo6Var2.e = null;
                    if (wo6Var2.a.h() || wo6Var2.a.k()) {
                        yz3Var.d -= ((StaggeredGridLayoutManager) yz3Var.g).r.e(view);
                    }
                    if (size == 1) {
                        yz3Var.b = Integer.MIN_VALUE;
                    }
                    yz3Var.c = Integer.MIN_VALUE;
                    l0(u, mg5Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void X0(mg5 mg5Var, int i) {
        while (v() > 0) {
            View u = u(0);
            ts1 ts1Var = this.r;
            if (ts1Var.d(u) <= i && ts1Var.o(u) <= i) {
                wo6 wo6Var = (wo6) u.getLayoutParams();
                wo6Var.getClass();
                if (((ArrayList) wo6Var.e.f).size() != 1) {
                    yz3 yz3Var = wo6Var.e;
                    ArrayList arrayList = (ArrayList) yz3Var.f;
                    View view = (View) arrayList.remove(0);
                    wo6 wo6Var2 = (wo6) view.getLayoutParams();
                    wo6Var2.e = null;
                    if (arrayList.size() == 0) {
                        yz3Var.c = Integer.MIN_VALUE;
                    }
                    if (wo6Var2.a.h() || wo6Var2.a.k()) {
                        yz3Var.d -= ((StaggeredGridLayoutManager) yz3Var.g).r.e(view);
                    }
                    yz3Var.b = Integer.MIN_VALUE;
                    l0(u, mg5Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.gg5
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

    @Override // defpackage.gg5
    public final void Z() {
        this.B.n();
        o0();
    }

    public final int Z0(int i, mg5 mg5Var, sg5 sg5Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        U0(i, sg5Var);
        rn3 rn3Var = this.v;
        int F0 = F0(mg5Var, rn3Var, sg5Var);
        if (rn3Var.b >= F0) {
            if (i < 0) {
                i = -F0;
            } else {
                i = F0;
            }
        }
        this.r.q(-i);
        this.D = this.x;
        rn3Var.b = 0;
        V0(mg5Var, rn3Var);
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
    @Override // defpackage.rg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF a(int i) {
        boolean z;
        int i2 = -1;
        if (v() != 0) {
            if (i < K0()) {
                z = true;
            } else {
                z = false;
            }
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = i2;
            pointF.y = RecyclerView.B1;
            return pointF;
        }
        pointF.x = RecyclerView.B1;
        pointF.y = i2;
        return pointF;
    }

    @Override // defpackage.gg5
    public final void a0(int i, int i2) {
        O0(i, i2, 8);
    }

    public final void a1(int i) {
        boolean z;
        rn3 rn3Var = this.v;
        rn3Var.e = i;
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
        rn3Var.d = i2;
    }

    @Override // defpackage.gg5
    public final void b0(int i, int i2) {
        O0(i, i2, 2);
    }

    public final void b1(int i, sg5 sg5Var) {
        int i2;
        int i3;
        int i4;
        boolean z;
        rn3 rn3Var = this.v;
        boolean z2 = false;
        rn3Var.b = 0;
        rn3Var.c = i;
        iv3 iv3Var = this.e;
        ts1 ts1Var = this.r;
        if (iv3Var != null && iv3Var.e && (i4 = sg5Var.a) != -1) {
            boolean z3 = this.x;
            if (i4 < i) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                i2 = ts1Var.n();
                i3 = 0;
            } else {
                i3 = ts1Var.n();
                i2 = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.g0) {
            rn3Var.f = ts1Var.m() - i3;
            rn3Var.g = ts1Var.i() + i2;
        } else {
            rn3Var.g = ts1Var.h() + i2;
            rn3Var.f = -i3;
        }
        rn3Var.h = false;
        rn3Var.a = true;
        if (ts1Var.k() == 0 && ts1Var.h() == 0) {
            z2 = true;
        }
        rn3Var.i = z2;
    }

    @Override // defpackage.gg5
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // defpackage.gg5
    public final void c0(int i, int i2) {
        O0(i, i2, 4);
    }

    public final void c1(yz3 yz3Var, int i, int i2) {
        int i3 = yz3Var.d;
        int i4 = yz3Var.e;
        BitSet bitSet = this.y;
        if (i == -1) {
            int i5 = yz3Var.b;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) yz3Var.f).get(0);
                yz3Var.b = ((StaggeredGridLayoutManager) yz3Var.g).r.g(view);
                ((wo6) view.getLayoutParams()).getClass();
                i5 = yz3Var.b;
            }
            if (i5 + i3 <= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = yz3Var.c;
        if (i6 == Integer.MIN_VALUE) {
            yz3Var.a();
            i6 = yz3Var.c;
        }
        if (i6 - i3 >= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // defpackage.gg5
    public final boolean d() {
        if (this.t == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gg5
    public final void d0(mg5 mg5Var, sg5 sg5Var) {
        S0(mg5Var, sg5Var, true);
    }

    @Override // defpackage.gg5
    public final boolean e() {
        if (this.t == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gg5
    public final void e0(sg5 sg5Var) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // defpackage.gg5
    public final boolean f(hg5 hg5Var) {
        return hg5Var instanceof wo6;
    }

    @Override // defpackage.gg5
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof yo6) {
            yo6 yo6Var = (yo6) parcelable;
            this.F = yo6Var;
            if (this.z != -1) {
                yo6Var.A = -1;
                yo6Var.B = -1;
                yo6Var.R = null;
                yo6Var.L = 0;
                yo6Var.X = 0;
                yo6Var.Y = null;
                yo6Var.Z = null;
            }
            o0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [yo6, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [yo6, android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.gg5
    public final Parcelable g0() {
        int K0;
        View H0;
        int k;
        int m;
        int[] iArr;
        yo6 yo6Var = this.F;
        if (yo6Var != null) {
            ?? obj = new Object();
            obj.L = yo6Var.L;
            obj.A = yo6Var.A;
            obj.B = yo6Var.B;
            obj.R = yo6Var.R;
            obj.X = yo6Var.X;
            obj.Y = yo6Var.Y;
            obj.d0 = yo6Var.d0;
            obj.e0 = yo6Var.e0;
            obj.f0 = yo6Var.f0;
            obj.Z = yo6Var.Z;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.d0 = this.w;
        obj2.e0 = this.D;
        obj2.f0 = this.E;
        ap3 ap3Var = this.B;
        if (ap3Var != null && (iArr = (int[]) ap3Var.B) != null) {
            obj2.Y = iArr;
            obj2.X = iArr.length;
            obj2.Z = (ArrayList) ap3Var.L;
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
                i = gg5.G(H0);
            }
            obj2.B = i;
            int i2 = this.p;
            obj2.L = i2;
            obj2.R = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                boolean z = this.D;
                ts1 ts1Var = this.r;
                yz3[] yz3VarArr = this.q;
                if (z) {
                    k = yz3VarArr[i3].i(Integer.MIN_VALUE);
                    if (k != Integer.MIN_VALUE) {
                        m = ts1Var.i();
                        k -= m;
                        obj2.R[i3] = k;
                    } else {
                        obj2.R[i3] = k;
                    }
                } else {
                    k = yz3VarArr[i3].k(Integer.MIN_VALUE);
                    if (k != Integer.MIN_VALUE) {
                        m = ts1Var.m();
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

    @Override // defpackage.gg5
    public final void h(int i, int i2, sg5 sg5Var, ls0 ls0Var) {
        rn3 rn3Var;
        int i3;
        if (this.t != 0) {
            i = i2;
        }
        if (v() != 0 && i != 0) {
            U0(i, sg5Var);
            int[] iArr = this.J;
            int i4 = this.p;
            if (iArr == null || iArr.length < i4) {
                this.J = new int[i4];
            }
            int i5 = 0;
            int i6 = 0;
            while (true) {
                rn3Var = this.v;
                if (i5 >= i4) {
                    break;
                }
                int i7 = rn3Var.d;
                yz3[] yz3VarArr = this.q;
                if (i7 == -1) {
                    int i8 = rn3Var.f;
                    i3 = i8 - yz3VarArr[i5].k(i8);
                } else {
                    i3 = yz3VarArr[i5].i(rn3Var.g) - rn3Var.g;
                }
                if (i3 >= 0) {
                    this.J[i6] = i3;
                    i6++;
                }
                i5++;
            }
            Arrays.sort(this.J, 0, i6);
            for (int i9 = 0; i9 < i6; i9++) {
                int i10 = rn3Var.c;
                if (i10 >= 0 && i10 < sg5Var.b()) {
                    ls0Var.a(rn3Var.c, this.J[i9]);
                    rn3Var.c += rn3Var.d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.gg5
    public final void h0(int i) {
        if (i == 0) {
            D0();
        }
    }

    @Override // defpackage.gg5
    public final int j(sg5 sg5Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return gi2.w(sg5Var, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.gg5
    public final int k(sg5 sg5Var) {
        return E0(sg5Var);
    }

    @Override // defpackage.gg5
    public final int l(sg5 sg5Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return gi2.y(sg5Var, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.gg5
    public final int m(sg5 sg5Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return gi2.w(sg5Var, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.gg5
    public final int n(sg5 sg5Var) {
        return E0(sg5Var);
    }

    @Override // defpackage.gg5
    public final int o(sg5 sg5Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return gi2.y(sg5Var, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.gg5
    public final int p0(int i, mg5 mg5Var, sg5 sg5Var) {
        return Z0(i, mg5Var, sg5Var);
    }

    @Override // defpackage.gg5
    public final void q0(int i) {
        yo6 yo6Var = this.F;
        if (yo6Var != null && yo6Var.A != i) {
            yo6Var.R = null;
            yo6Var.L = 0;
            yo6Var.A = -1;
            yo6Var.B = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        o0();
    }

    @Override // defpackage.gg5
    public final hg5 r() {
        if (this.t == 0) {
            return new hg5(-2, -1);
        }
        return new hg5(-1, -2);
    }

    @Override // defpackage.gg5
    public final int r0(int i, mg5 mg5Var, sg5 sg5Var) {
        return Z0(i, mg5Var, sg5Var);
    }

    @Override // defpackage.gg5
    public final hg5 s(Context context, AttributeSet attributeSet) {
        return new hg5(context, attributeSet);
    }

    @Override // defpackage.gg5
    public final hg5 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new hg5((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new hg5(layoutParams);
    }

    @Override // defpackage.gg5
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
            WeakHashMap weakHashMap = ao7.a;
            g2 = gg5.g(i2, height, recyclerView.getMinimumHeight());
            g = gg5.g(i, (this.u * i4) + E, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = ao7.a;
            g = gg5.g(i, width, recyclerView2.getMinimumWidth());
            g2 = gg5.g(i2, (this.u * i4) + C, this.b.getMinimumHeight());
        }
        RecyclerView.g(this.b, g, g2);
    }

    @Override // defpackage.gg5
    public final int x(mg5 mg5Var, sg5 sg5Var) {
        if (this.t == 1) {
            return Math.min(this.p, sg5Var.b());
        }
        return -1;
    }
}
