package defpackage;

import android.os.Trace;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xq2  reason: default package */
/* loaded from: classes.dex */
public final class xq2 implements px0 {
    public int A;
    public int B;
    public boolean C;
    public final wq2 D;
    public final ArrayList E;
    public boolean F;
    public lk6 G;
    public mk6 H;
    public pk6 I;
    public boolean J;
    public xv4 K;
    public rl0 L;
    public final qx0 M;
    public sq2 N;
    public ld2 O;
    public kh6 P;
    public final cy0 Q;
    public final l61 R;
    public boolean S;
    public long T;
    public yq2 U;
    public final cg7 a;
    public final zx0 b;
    public final mk6 c;
    public final ma4 d;
    public final rl0 e;
    public final rl0 f;
    public final os0 g;
    public final ey0 h;
    public ar2 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public n94 p;
    public boolean q;
    public boolean r;
    public p94 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final r93 n = new r93();
    public final ArrayList s = new ArrayList();
    public final r93 t = new r93();
    public xv4 u = xv4.R;
    public final r93 x = new r93();
    public int z = -1;

    public xq2(cg7 cg7Var, zx0 zx0Var, mk6 mk6Var, ma4 ma4Var, rl0 rl0Var, rl0 rl0Var2, os0 os0Var, ey0 ey0Var) {
        boolean z;
        this.a = cg7Var;
        this.b = zx0Var;
        this.c = mk6Var;
        this.d = ma4Var;
        this.e = rl0Var;
        this.f = rl0Var2;
        this.g = os0Var;
        this.h = ey0Var;
        if (!zx0Var.f() && !zx0Var.d()) {
            z = false;
        } else {
            z = true;
        }
        this.C = z;
        this.D = new wq2(this, 0);
        this.E = new ArrayList();
        lk6 c = mk6Var.c();
        c.c();
        this.G = c;
        mk6 mk6Var2 = new mk6();
        if (zx0Var.f()) {
            mk6Var2.b();
        }
        if (zx0Var.d()) {
            mk6Var2.g0 = new p94();
        }
        this.H = mk6Var2;
        pk6 d = mk6Var2.d();
        d.e(true);
        this.I = d;
        this.M = new qx0(this, rl0Var);
        lk6 c2 = this.H.c();
        try {
            sq2 a = c2.a(0);
            c2.c();
            this.N = a;
            this.O = new ld2();
            this.Q = new cy0(this);
            l61 j = zx0Var.j();
            l61 C = C();
            this.R = j.N(C == null ? vt1.A : C);
        } catch (Throwable th) {
            c2.c();
            throw th;
        }
    }

    public static final int R(xq2 xq2Var, int i, boolean z, int i2) {
        int i3;
        boolean z2;
        int i4;
        br2 br2Var;
        Object obj;
        long[] jArr;
        int i5;
        long[] jArr2;
        int i6;
        int i7;
        lk6 lk6Var;
        lk6 lk6Var2 = xq2Var.G;
        int i8 = 0;
        if (lk6Var2.j(i)) {
            int i9 = lk6Var2.i(i);
            Object p = lk6Var2.p(lk6Var2.b, i);
            if (i9 == 206 && nb3.k(p, tx0.e)) {
                Object h = lk6Var2.h(i, 0);
                uq2 uq2Var = null;
                if (h instanceof br2) {
                    br2Var = (br2) h;
                } else {
                    br2Var = null;
                }
                if (br2Var != null) {
                    obj = br2Var.a;
                } else {
                    obj = null;
                }
                if (obj instanceof uq2) {
                    uq2Var = (uq2) obj;
                }
                if (uq2Var != null) {
                    ka4 ka4Var = uq2Var.A.e;
                    Object[] objArr = ka4Var.b;
                    long[] jArr3 = ka4Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j = jArr3[i10];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8;
                                int i12 = 8 - ((~(i10 - length)) >>> 31);
                                int i13 = i8;
                                while (i13 < i12) {
                                    if ((255 & j) < 128) {
                                        xq2 xq2Var2 = (xq2) objArr[(i10 << 3) + i13];
                                        mk6 mk6Var = xq2Var2.c;
                                        if (mk6Var.B > 0 && (mk6Var.A[1] & 67108864) != 0) {
                                            ey0 ey0Var = xq2Var2.h;
                                            synchronized (ey0Var.R) {
                                                ey0Var.p();
                                                i7 = i11;
                                                ja4 ja4Var = ey0Var.j0;
                                                ey0Var.j0 = mp2.q();
                                                ey0Var.r0.i0(ja4Var);
                                            }
                                            rl0 rl0Var = new rl0();
                                            xq2Var2.L = rl0Var;
                                            lk6 c = xq2Var2.c.c();
                                            try {
                                                xq2Var2.G = c;
                                                qx0 qx0Var = xq2Var2.M;
                                                rl0 rl0Var2 = qx0Var.b;
                                                try {
                                                    qx0Var.b = rl0Var;
                                                    xq2Var2.Q(0);
                                                    qx0 qx0Var2 = xq2Var2.M;
                                                    qx0Var2.b();
                                                    jArr2 = jArr3;
                                                    try {
                                                        if (qx0Var2.c) {
                                                            lk6Var = c;
                                                            try {
                                                                qx0Var2.b.m.h0(rn4.d);
                                                                if (qx0Var2.c) {
                                                                    qx0Var2.d(false);
                                                                    qx0Var2.d(false);
                                                                    qx0Var2.b.m.h0(bn4.d);
                                                                    i6 = 0;
                                                                    qx0Var2.c = false;
                                                                    qx0Var.b = rl0Var2;
                                                                    lk6Var.c();
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                qx0Var.b = rl0Var2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            lk6Var = c;
                                                        }
                                                        qx0Var.b = rl0Var2;
                                                        lk6Var.c();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        lk6Var.c();
                                                        throw th;
                                                    }
                                                    i6 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    lk6Var = c;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                lk6Var = c;
                                            }
                                        } else {
                                            jArr2 = jArr3;
                                            i6 = i8;
                                            i7 = i11;
                                        }
                                        xq2Var.b.r(xq2Var2.h);
                                    } else {
                                        jArr2 = jArr3;
                                        i6 = i8;
                                        i7 = i11;
                                    }
                                    j >>= i7;
                                    i13++;
                                    i11 = i7;
                                    i8 = i6;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                i5 = i8;
                                if (i12 != i11) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                i5 = i8;
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                            i8 = i5;
                            jArr3 = jArr;
                        }
                    }
                }
                return lk6Var2.o(i);
            }
            i3 = 1;
            if (!lk6Var2.l(i)) {
                return lk6Var2.o(i);
            }
        } else {
            i3 = 1;
            if (lk6Var2.d(i)) {
                int i14 = lk6Var2.b[(i * 5) + 3] + i;
                int i15 = 0;
                for (int i16 = i + 1; i16 < i14; i16 += lk6Var2.b[(i16 * 5) + 3]) {
                    boolean l = lk6Var2.l(i16);
                    if (l) {
                        xq2Var.M.c();
                        qx0 qx0Var3 = xq2Var.M;
                        Object n = lk6Var2.n(i16);
                        qx0Var3.c();
                        qx0Var3.h.add(n);
                    }
                    if (!l && !z) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (l) {
                        i4 = 0;
                    } else {
                        i4 = i2 + i15;
                    }
                    i15 += R(xq2Var, i16, z2, i4);
                    if (l) {
                        xq2Var.M.c();
                        xq2Var.M.a();
                    }
                }
                if (!lk6Var2.l(i)) {
                    return i15;
                }
            } else if (!lk6Var2.l(i)) {
                return lk6Var2.o(i);
            }
        }
        return i3;
    }

    public final cf5 A() {
        if (this.A == 0) {
            ArrayList arrayList = this.E;
            if (!arrayList.isEmpty()) {
                return (cf5) arrayList.get(arrayList.size() - 1);
            }
            return null;
        }
        return null;
    }

    public final boolean B() {
        if (E() && !this.w) {
            cf5 A = A();
            if (A == null || (A.b & 4) == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final cy0 C() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean D() {
        return this.S;
    }

    public final boolean E() {
        cf5 A;
        if (!this.S && !this.y && !this.w && (A = A()) != null && (A.b & 8) == 0) {
            return true;
        }
        return false;
    }

    public final void F(ArrayList arrayList) {
        xq2 xq2Var = this;
        rl0 rl0Var = xq2Var.f;
        qx0 qx0Var = xq2Var.M;
        rl0 rl0Var2 = qx0Var.b;
        try {
            qx0Var.b = rl0Var;
            rl0Var.m.h0(pn4.d);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                vr4 vr4Var = (vr4) arrayList.get(i);
                o84 o84Var = (o84) vr4Var.A;
                o84 o84Var2 = (o84) vr4Var.B;
                o84Var.getClass();
                sq2 k = yh2.k(null);
                mk6 d = ok6.d(null);
                int a = d.a(k);
                n93 n93Var = new n93();
                qx0Var.b();
                co4 co4Var = qx0Var.b.m;
                co4Var.h0(ym4.d);
                bl2.Q(co4Var, 0, n93Var, 1, k);
                if (d == xq2Var.H) {
                    if (!xq2Var.I.w) {
                        tx0.a("Check failed");
                    }
                    xq2Var.x();
                }
                lk6 c = d.c();
                c.r(a);
                qx0Var.f = a;
                rl0 rl0Var3 = new rl0();
                xq2Var.K(null, null, null, yt1.A, new u6(xq2Var, rl0Var3, c, o84Var));
                rl0 rl0Var4 = qx0Var.b;
                rl0Var4.getClass();
                if (!rl0Var3.m.g0()) {
                    co4 co4Var2 = rl0Var4.m;
                    co4Var2.h0(um4.d);
                    bl2.Q(co4Var2, 0, rl0Var3, 1, n93Var);
                }
                c.c();
                qx0Var.b.m.h0(rn4.d);
                i++;
                xq2Var = this;
            }
            qx0Var.b();
            qx0Var.b.m.h0(cn4.d);
            qx0Var.f = 0;
            qx0Var.b = rl0Var2;
        } catch (Throwable th) {
            qx0Var.b = rl0Var2;
            throw th;
        }
    }

    public final void G(xv4 xv4Var, Object obj) {
        boolean z;
        Z(126665345, null);
        H();
        m0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                pk6.z(this.I);
            }
            if (this.S || nb3.k(this.G.f(), xv4Var)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                N(xv4Var);
            }
            W(tx0.c, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, 0, xv4Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            lb4.z(this, new zv0(-59194059, true, new z5(obj, 12)));
            this.w = z2;
        } finally {
        }
    }

    public final Object H() {
        boolean z = this.S;
        vs0 vs0Var = ox0.a;
        if (z) {
            if (this.r) {
                tx0.a("A call to createNode(), emitNode() or useNode() expected");
                return vs0Var;
            }
        } else {
            Object m = this.G.m();
            if (!this.y || (m instanceof np5)) {
                return m;
            }
        }
        return vs0Var;
    }

    public final List I() {
        ey0 ey0Var;
        zx0 zx0Var = this.b;
        yx0 h = zx0Var.h();
        if (h != null) {
            ey0Var = (ey0) h;
        } else {
            ey0Var = null;
        }
        if (ey0Var != null) {
            mk6 mk6Var = ey0Var.Y;
            lk6 c = ok6.d(mk6Var).c();
            try {
                Integer R = ak7.R(c, zx0Var, 0, c.c);
                if (R != null) {
                    c = ok6.d(mk6Var).c();
                    try {
                        ArrayList I0 = ak7.I0(c, R.intValue(), 0);
                        c.c();
                        return gt0.V0(I0, ey0Var.r0.I());
                    } finally {
                    }
                }
            } finally {
            }
        }
        return yt1.A;
    }

    public final int J(int i) {
        int q = this.G.q(i) + 1;
        int i2 = 0;
        while (q < i) {
            if (!this.G.k(q)) {
                i2++;
            }
            q += this.G.b[(q * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object K(ey0 ey0Var, ey0 ey0Var2, Integer num, List list, on2 on2Var) {
        Object c;
        int i;
        boolean z = this.F;
        int i2 = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                vr4 vr4Var = (vr4) list.get(i3);
                cf5 cf5Var = (cf5) vr4Var.A;
                Object obj = vr4Var.B;
                if (obj != null) {
                    h0(cf5Var, obj);
                } else {
                    h0(cf5Var, null);
                }
            }
            if (ey0Var != null) {
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                if (ey0Var2 != null && ey0Var2 != ey0Var && i >= 0) {
                    ey0Var.n0 = ey0Var2;
                    ey0Var.o0 = i;
                    c = on2Var.c();
                    ey0Var.n0 = null;
                    ey0Var.o0 = 0;
                } else {
                    c = on2Var.c();
                }
            }
            c = on2Var.c();
            this.F = z;
            this.k = i2;
            return c;
        } catch (Throwable th) {
            this.F = z;
            this.k = i2;
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (r4.b < r6) goto L8;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L() {
        xb3 xb3Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        long j;
        boolean z2;
        y94 y94Var;
        long j2;
        int O;
        int i7;
        int i8;
        int i9;
        Object b;
        int J;
        int n0;
        xd5 xd5Var = xd5.s0;
        boolean z3 = this.F;
        this.F = true;
        lk6 lk6Var = this.G;
        int i10 = lk6Var.i;
        int i11 = (i10 * 5) + 3;
        int i12 = lk6Var.b[i11] + i10;
        int i13 = this.k;
        long j3 = this.T;
        int i14 = this.l;
        int i15 = this.m;
        int i16 = lk6Var.g;
        ArrayList arrayList = this.s;
        int O2 = hf.O(i16, arrayList);
        if (O2 < 0) {
            O2 = -(O2 + 1);
        }
        if (O2 < arrayList.size()) {
            xb3Var = (xb3) arrayList.get(O2);
        }
        xb3Var = null;
        int i17 = 1;
        int i18 = i10;
        int i19 = 0;
        while (xb3Var != null) {
            cf5 cf5Var = xb3Var.a;
            int i20 = xb3Var.b;
            xd5 xd5Var2 = xd5Var;
            int O3 = hf.O(i20, arrayList);
            if (O3 >= 0) {
                xb3 xb3Var2 = (xb3) arrayList.remove(O3);
            }
            Object obj = xb3Var.c;
            if (obj == null) {
                cf5Var.getClass();
                i3 = i12;
                i = i11;
                i2 = i13;
            } else {
                int i21 = 8;
                ja4 ja4Var = cf5Var.g;
                if (ja4Var == null) {
                    i3 = i12;
                    i = i11;
                    i2 = i13;
                } else {
                    i = i11;
                    if (obj instanceof ii1) {
                        ii1 ii1Var = (ii1) obj;
                        im6 im6Var = ii1Var.L;
                        if (im6Var == null) {
                            im6Var = xd5Var2;
                        }
                        i2 = i13;
                        i3 = i12;
                        i4 = i14;
                        i5 = i15;
                        z = !im6Var.i(ii1Var.i().f, ja4Var.g(ii1Var));
                    } else {
                        i2 = i13;
                        if (obj instanceof ka4) {
                            ka4 ka4Var = (ka4) obj;
                            if (ka4Var.h()) {
                                Object[] objArr = ka4Var.b;
                                long[] jArr = ka4Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    i4 = i14;
                                    i5 = i15;
                                    int i22 = 0;
                                    while (true) {
                                        long j4 = jArr[i22];
                                        i3 = i12;
                                        Object[] objArr2 = objArr;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i23 = 8 - ((~(i22 - length)) >>> 31);
                                            int i24 = 0;
                                            while (i24 < i23) {
                                                if ((j4 & 255) < 128) {
                                                    i6 = i24;
                                                    Object obj2 = objArr2[(i22 << 3) + i24];
                                                    j = j4;
                                                    if (!(obj2 instanceof ii1)) {
                                                        break;
                                                    }
                                                    ii1 ii1Var2 = (ii1) obj2;
                                                    im6 im6Var2 = ii1Var2.L;
                                                    if (im6Var2 == null) {
                                                        im6Var2 = xd5Var2;
                                                    }
                                                    if (!im6Var2.i(ii1Var2.i().f, ja4Var.g(ii1Var2))) {
                                                        break;
                                                    }
                                                } else {
                                                    i6 = i24;
                                                    j = j4;
                                                }
                                                j4 = j >> i21;
                                                i24 = i6 + 1;
                                            }
                                            if (i23 != i21) {
                                                break;
                                            }
                                        }
                                        if (i22 == length) {
                                            break;
                                        }
                                        i22++;
                                        i12 = i3;
                                        objArr = objArr2;
                                        i21 = 8;
                                    }
                                    z = false;
                                }
                            }
                            i3 = i12;
                            i4 = i14;
                            i5 = i15;
                            z = false;
                        } else {
                            i3 = i12;
                        }
                    }
                    if (!z) {
                        this.G.r(i20);
                        int i25 = this.G.g;
                        O(i18, i25, i10);
                        int q = this.G.q(i25);
                        while (q != i10 && !this.G.l(q)) {
                            q = this.G.q(q);
                        }
                        if (this.G.l(q)) {
                            i7 = 0;
                        } else {
                            i7 = i2;
                        }
                        if (q != i25) {
                            int n02 = (n0(q) - this.G.o(i25)) + i7;
                            while (i7 < n02 && q != i20) {
                                q++;
                                while (q < i20) {
                                    lk6 lk6Var2 = this.G;
                                    int i26 = lk6Var2.b[(q * 5) + 3] + q;
                                    if (i20 >= i26) {
                                        if (lk6Var2.l(q)) {
                                            n0 = i17;
                                        } else {
                                            n0 = n0(q);
                                        }
                                        i7 += n0;
                                        q = i26;
                                    }
                                }
                                break;
                            }
                        }
                        this.k = i7;
                        this.m = J(i25);
                        int q2 = this.G.q(i25);
                        long j5 = 0;
                        int i27 = 3;
                        int i28 = 0;
                        while (true) {
                            if (q2 < 0) {
                                break;
                            } else if (q2 == i10) {
                                j5 ^= Long.rotateLeft(j3, i28);
                                break;
                            } else {
                                lk6 lk6Var3 = this.G;
                                boolean k = lk6Var3.k(q2);
                                int[] iArr = lk6Var3.b;
                                if (k) {
                                    Object p = lk6Var3.p(iArr, q2);
                                    if (p != null) {
                                        if (p instanceof Enum) {
                                            i9 = ((Enum) p).ordinal();
                                        } else {
                                            i9 = p.hashCode();
                                        }
                                        i8 = i25;
                                    } else {
                                        i8 = i25;
                                        i9 = 0;
                                    }
                                } else {
                                    int i29 = lk6Var3.i(q2);
                                    i8 = i25;
                                    if (i29 == 207 && (b = lk6Var3.b(iArr, q2)) != null && !b.equals(ox0.a)) {
                                        i9 = b.hashCode();
                                    } else {
                                        i9 = i29;
                                    }
                                }
                                if (i9 == 126665345) {
                                    j5 ^= Long.rotateLeft(i9, i28);
                                    break;
                                }
                                if (this.G.k(q2)) {
                                    J = 0;
                                } else {
                                    J = J(q2);
                                }
                                j5 = (j5 ^ Long.rotateLeft(i9, i27)) ^ Long.rotateLeft(J, i28);
                                i27 = (i27 + 6) % 64;
                                i28 = (i28 + 6) % 64;
                                q2 = this.G.q(q2);
                                i25 = i8;
                            }
                        }
                        i8 = i25;
                        this.T = j5;
                        this.K = null;
                        eo2 eo2Var = cf5Var.d;
                        if (eo2Var != null) {
                            eo2Var.o(this, Integer.valueOf(i17));
                            this.K = null;
                            lk6 lk6Var4 = this.G;
                            int i30 = lk6Var4.b[i] + i10;
                            int i31 = lk6Var4.g;
                            if (i31 < i10 || i31 > i30) {
                                tx0.a("Index " + i10 + " is not a parent of " + i31);
                            }
                            lk6Var4.i = i10;
                            lk6Var4.h = i30;
                            lk6Var4.l = 0;
                            lk6Var4.m = 0;
                            z2 = z3;
                            i18 = i8;
                            i19 = i17;
                        } else {
                            i.m("Invalid restart scope");
                            return;
                        }
                    } else {
                        ArrayList arrayList2 = this.E;
                        arrayList2.add(cf5Var);
                        this.g.S();
                        ey0 ey0Var = cf5Var.a;
                        if (ey0Var != null && (y94Var = cf5Var.f) != null) {
                            cf5Var.d(i17);
                            try {
                                Object[] objArr3 = y94Var.b;
                                int[] iArr2 = y94Var.c;
                                long[] jArr2 = y94Var.a;
                                int length2 = jArr2.length - 2;
                                z2 = z3;
                                if (length2 >= 0) {
                                    int i32 = 0;
                                    while (true) {
                                        long j6 = jArr2[i32];
                                        long[] jArr3 = jArr2;
                                        Object[] objArr4 = objArr3;
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i33 = 8 - ((~(i32 - length2)) >>> 31);
                                            int i34 = 0;
                                            while (i34 < i33) {
                                                if ((j6 & 255) < 128) {
                                                    int i35 = (i32 << 3) + i34;
                                                    j2 = j6;
                                                    Object obj3 = objArr4[i35];
                                                    int i36 = iArr2[i35];
                                                    ey0Var.y(obj3);
                                                } else {
                                                    j2 = j6;
                                                }
                                                i34++;
                                                j6 = j2 >> 8;
                                            }
                                            if (i33 != 8) {
                                                break;
                                            }
                                        }
                                        if (i32 == length2) {
                                            break;
                                        }
                                        i32++;
                                        objArr3 = objArr4;
                                        jArr2 = jArr3;
                                    }
                                }
                                cf5Var.d(false);
                            } catch (Throwable th) {
                                cf5Var.d(false);
                                throw th;
                            }
                        } else {
                            z2 = z3;
                        }
                        i17 = 1;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    O = hf.O(this.G.g, arrayList);
                    if (O < 0) {
                        O = -(O + 1);
                    }
                    if (O >= arrayList.size()) {
                        xb3 xb3Var3 = (xb3) arrayList.get(O);
                        i12 = i3;
                        if (xb3Var3.b < i12) {
                            xb3Var = xb3Var3;
                            z3 = z2;
                            xd5Var = xd5Var2;
                            i11 = i;
                            i13 = i2;
                            i14 = i4;
                            i15 = i5;
                        }
                    } else {
                        i12 = i3;
                    }
                    xb3Var = null;
                    z3 = z2;
                    xd5Var = xd5Var2;
                    i11 = i;
                    i13 = i2;
                    i14 = i4;
                    i15 = i5;
                }
            }
            i4 = i14;
            i5 = i15;
            z = i17;
            if (!z) {
            }
            O = hf.O(this.G.g, arrayList);
            if (O < 0) {
            }
            if (O >= arrayList.size()) {
            }
            xb3Var = null;
            z3 = z2;
            xd5Var = xd5Var2;
            i11 = i;
            i13 = i2;
            i14 = i4;
            i15 = i5;
        }
        boolean z4 = z3;
        int i37 = i13;
        int i38 = i14;
        int i39 = i15;
        if (i19 != 0) {
            O(i18, i10, i10);
            this.G.t();
            int n03 = n0(i10);
            this.k = i37 + n03;
            this.l = i38 + n03;
            this.m = i39;
        } else {
            U();
        }
        this.T = j3;
        this.F = z4;
    }

    public final void M() {
        int i;
        Q(this.G.g);
        qx0 qx0Var = this.M;
        qx0Var.d(false);
        r93 r93Var = qx0Var.d;
        xq2 xq2Var = qx0Var.a;
        lk6 lk6Var = xq2Var.G;
        if (lk6Var.c > 0 && r93Var.a(-2) != (i = lk6Var.i)) {
            if (!qx0Var.c && qx0Var.e) {
                qx0Var.d(false);
                qx0Var.b.m.h0(fn4.d);
                qx0Var.c = true;
            }
            if (i > 0) {
                sq2 a = lk6Var.a(i);
                r93Var.c(i);
                qx0Var.d(false);
                co4 co4Var = qx0Var.b.m;
                co4Var.h0(en4.d);
                bl2.P(co4Var, 0, a);
                qx0Var.c = true;
            }
        }
        qx0Var.b.m.h0(nn4.d);
        int i2 = qx0Var.f;
        lk6 lk6Var2 = xq2Var.G;
        qx0Var.f = lk6Var2.b[(lk6Var2.g * 5) + 3] + i2;
    }

    public final void N(xv4 xv4Var) {
        p94 p94Var = this.v;
        if (p94Var == null) {
            p94Var = new p94();
            this.v = p94Var;
        }
        p94Var.i(this.G.g, xv4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(int i, int i2, int i3) {
        lk6 lk6Var = this.G;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (lk6Var.q(i) == i2) {
                    i3 = i2;
                } else if (lk6Var.q(i2) != i) {
                    if (lk6Var.q(i) == lk6Var.q(i2)) {
                        i3 = lk6Var.q(i);
                    } else {
                        int i4 = i;
                        int i5 = 0;
                        while (i4 > 0 && i4 != i3) {
                            i4 = lk6Var.q(i4);
                            i5++;
                        }
                        int i6 = i2;
                        int i7 = 0;
                        while (i6 > 0 && i6 != i3) {
                            i6 = lk6Var.q(i6);
                            i7++;
                        }
                        int i8 = i5 - i7;
                        int i9 = i;
                        for (int i10 = 0; i10 < i8; i10++) {
                            i9 = lk6Var.q(i9);
                        }
                        int i11 = i7 - i5;
                        int i12 = i2;
                        for (int i13 = 0; i13 < i11; i13++) {
                            i12 = lk6Var.q(i12);
                        }
                        i3 = i9;
                        for (int i14 = i12; i3 != i14; i14 = lk6Var.q(i14)) {
                            i3 = lk6Var.q(i3);
                        }
                    }
                }
            }
            while (i > 0 && i != i3) {
                if (!lk6Var.l(i)) {
                    this.M.a();
                }
                i = lk6Var.q(i);
            }
            o(i2, i3);
        }
        i3 = i;
        while (i > 0) {
            if (!lk6Var.l(i)) {
            }
            i = lk6Var.q(i);
        }
        o(i2, i3);
    }

    public final Object P() {
        boolean z = this.S;
        vs0 vs0Var = ox0.a;
        if (z) {
            if (this.r) {
                tx0.a("A call to createNode(), emitNode() or useNode() expected");
                return vs0Var;
            }
        } else {
            Object m = this.G.m();
            if (!this.y || (m instanceof np5)) {
                if (m instanceof br2) {
                    return ((br2) m).a;
                }
                return m;
            }
        }
        return vs0Var;
    }

    public final void Q(int i) {
        boolean l = this.G.l(i);
        qx0 qx0Var = this.M;
        if (l) {
            qx0Var.c();
            Object n = this.G.n(i);
            qx0Var.c();
            qx0Var.h.add(n);
        }
        R(this, i, l, 0);
        qx0Var.c();
        if (l) {
            qx0Var.a();
        }
    }

    public final boolean S(int i, boolean z) {
        cf5 A;
        int i2;
        if ((i & 1) == 0 && (this.S || this.y)) {
            kh6 kh6Var = this.P;
            if (kh6Var != null && (A = A()) != null && kh6Var.a()) {
                int i3 = A.b;
                if ((i3 & 512) != 0) {
                    return true;
                }
                int i4 = i3 | 1;
                A.b = i4;
                if (this.y) {
                    i2 = i3 | 129;
                } else {
                    i2 = i4 & (-129);
                }
                A.b = i2 | 256;
                co4 co4Var = this.M.b.m;
                co4Var.h0(mn4.d);
                bl2.P(co4Var, 0, A);
                this.b.q(A);
                return false;
            }
        } else if (!z && E()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T() {
        Object obj;
        int hashCode;
        long rotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        lk6 lk6Var = this.G;
        int g = lk6Var.g();
        int[] iArr = lk6Var.b;
        int i = lk6Var.g;
        if (i < lk6Var.h) {
            obj = lk6Var.p(iArr, i);
        } else {
            obj = null;
        }
        Object f = lk6Var.f();
        int i2 = this.m;
        vs0 vs0Var = ox0.a;
        if (obj == null) {
            if (f != null && g == 207 && !f.equals(vs0Var)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ f.hashCode(), 3) ^ i2;
                boolean z = true;
                if ((iArr[(lk6Var.g * 5) + 1] & 1073741824) == 0) {
                    z = false;
                }
                a0(z, null);
                L();
                lk6Var.e();
                if (obj != null) {
                    if (f != null && g == 207 && !f.equals(vs0Var)) {
                        this.T = Long.rotateRight(Long.rotateRight(this.T ^ i2, 3) ^ f.hashCode(), 3);
                        return;
                    }
                    this.T = Long.rotateRight(g ^ Long.rotateRight(this.T ^ i2, 3), 3);
                    return;
                } else if (obj instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((Enum) obj).ordinal(), 3);
                    return;
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ obj.hashCode(), 3);
                    return;
                }
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ g, 3) ^ i2;
        } else {
            if (obj instanceof Enum) {
                hashCode = ((Enum) obj).ordinal();
            } else {
                hashCode = obj.hashCode();
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ hashCode, 3);
        }
        this.T = rotateLeft;
        boolean z2 = true;
        if ((iArr[(lk6Var.g * 5) + 1] & 1073741824) == 0) {
        }
        a0(z2, null);
        L();
        lk6Var.e();
        if (obj != null) {
        }
    }

    public final void U() {
        int i;
        lk6 lk6Var = this.G;
        int i2 = lk6Var.i;
        if (i2 >= 0) {
            i = lk6Var.b[(i2 * 5) + 1] & 67108863;
        } else {
            i = 0;
        }
        this.l = i;
        lk6Var.t();
    }

    public final void V() {
        if (this.l != 0) {
            tx0.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (!this.S) {
            cf5 A = A();
            if (A != null) {
                int i = A.b;
                if ((i & 128) == 0) {
                    A.b = i | 16;
                }
            }
            if (this.s.isEmpty()) {
                U();
            } else {
                L();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(Object obj, int i, int i2, Object obj2) {
        int hashCode;
        long rotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        ar2 ar2Var;
        ar2 ar2Var2;
        Object valueOf;
        int i3;
        Object obj3;
        int i4;
        int i5;
        int i6;
        int i7;
        Object[] objArr;
        Object[] objArr2;
        int i8;
        int i9;
        int i10;
        boolean z4;
        int i11;
        Object obj4;
        Object obj5 = obj;
        if (this.r) {
            tx0.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i12 = this.m;
        Object obj6 = ox0.a;
        if (obj5 == null) {
            if (obj2 != null && i == 207 && !obj2.equals(obj6)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ obj2.hashCode(), 3) ^ i12;
                if (obj5 == null) {
                    this.m++;
                }
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!this.S) {
                    this.G.k++;
                    pk6 pk6Var = this.I;
                    int i13 = pk6Var.t;
                    if (z) {
                        pk6Var.Q(i, obj6, obj6, true);
                    } else if (obj2 != null) {
                        if (obj5 == null) {
                            obj5 = obj6;
                        }
                        pk6Var.Q(i, obj5, obj2, false);
                    } else {
                        if (obj5 == null) {
                            obj5 = obj6;
                        }
                        pk6Var.Q(i, obj5, obj6, false);
                    }
                    ar2 ar2Var3 = this.j;
                    if (ar2Var3 != null) {
                        int i14 = (-2) - i13;
                        zg3 zg3Var = new zg3(-1, i, i14, -1);
                        ar2Var3.e.i(i14, new nu2(-1, this.k - ar2Var3.b, 0));
                        ar2Var3.d.add(zg3Var);
                    }
                    w(z, null);
                    return;
                }
                if (i2 == 1 && this.y) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.j == null) {
                    int g = this.G.g();
                    if (!z2 && g == i) {
                        lk6 lk6Var = this.G;
                        int i15 = lk6Var.g;
                        if (i15 < lk6Var.h) {
                            obj4 = lk6Var.p(lk6Var.b, i15);
                        } else {
                            obj4 = null;
                        }
                        if (nb3.k(obj5, obj4)) {
                            a0(z, obj2);
                        }
                    }
                    lk6 lk6Var2 = this.G;
                    int[] iArr = lk6Var2.b;
                    ArrayList arrayList = new ArrayList();
                    if (lk6Var2.k <= 0) {
                        int i16 = lk6Var2.g;
                        while (i16 < lk6Var2.h) {
                            int i17 = i16 * 5;
                            int i18 = iArr[i17];
                            Object p = lk6Var2.p(iArr, i16);
                            int i19 = iArr[i17 + 1];
                            if ((i19 & 1073741824) != 0) {
                                z4 = z2;
                                i11 = 1;
                            } else {
                                z4 = z2;
                                i11 = i19 & 67108863;
                            }
                            arrayList.add(new zg3(p, i18, i16, i11));
                            i16 += iArr[i17 + 3];
                            z2 = z4;
                        }
                    }
                    z3 = z2;
                    this.j = new ar2(this.k, arrayList);
                    ar2Var = this.j;
                    if (ar2Var != null) {
                        ArrayList arrayList2 = ar2Var.d;
                        p94 p94Var = ar2Var.e;
                        int i20 = ar2Var.b;
                        if (obj5 != null) {
                            valueOf = new gd3(Integer.valueOf(i), obj5);
                        } else {
                            valueOf = Integer.valueOf(i);
                        }
                        ja4 ja4Var = ((g94) ar2Var.f.getValue()).a;
                        Object g2 = ja4Var.g(valueOf);
                        if (g2 == null) {
                            g2 = null;
                        } else if (g2 instanceof ca4) {
                            ca4 ca4Var = (ca4) g2;
                            Object k = ca4Var.k(0);
                            if (ca4Var.h()) {
                                ja4Var.k(valueOf);
                            }
                            if (ca4Var.b == 1) {
                                ja4Var.m(valueOf, ca4Var.e());
                            }
                            g2 = k;
                        } else {
                            ja4Var.k(valueOf);
                        }
                        zg3 zg3Var2 = (zg3) g2;
                        if (!z3 && zg3Var2 != null) {
                            int i21 = zg3Var2.c;
                            arrayList2.add(zg3Var2);
                            nu2 nu2Var = (nu2) p94Var.b(i21);
                            if (nu2Var != null) {
                                i5 = nu2Var.b;
                            } else {
                                i5 = -1;
                            }
                            this.k = i5 + i20;
                            nu2 nu2Var2 = (nu2) p94Var.b(i21);
                            if (nu2Var2 != null) {
                                i6 = nu2Var2.a;
                            } else {
                                i6 = -1;
                            }
                            int i22 = ar2Var.c;
                            int i23 = i6 - i22;
                            int i24 = 8;
                            if (i6 > i22) {
                                Object[] objArr3 = p94Var.c;
                                long[] jArr = p94Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i25 = 0;
                                    while (true) {
                                        long j = jArr[i25];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i26 = 8 - ((~(i25 - length)) >>> 31);
                                            int i27 = 0;
                                            while (i27 < i26) {
                                                if ((j & 255) < 128) {
                                                    i10 = i24;
                                                    nu2 nu2Var3 = (nu2) objArr3[(i25 << 3) + i27];
                                                    i9 = i23;
                                                    int i28 = nu2Var3.a;
                                                    if (i28 == i6) {
                                                        nu2Var3.a = i22;
                                                    } else if (i22 <= i28 && i28 < i6) {
                                                        nu2Var3.a = i28 + 1;
                                                    }
                                                } else {
                                                    i9 = i23;
                                                    i10 = i24;
                                                }
                                                j >>= i10;
                                                i27++;
                                                i23 = i9;
                                                i24 = i10;
                                            }
                                            i7 = i23;
                                            if (i26 != i24) {
                                                break;
                                            }
                                        } else {
                                            i7 = i23;
                                        }
                                        if (i25 == length) {
                                            break;
                                        }
                                        i25++;
                                        i23 = i7;
                                        i24 = 8;
                                    }
                                } else {
                                    i7 = i23;
                                }
                            } else {
                                i7 = i23;
                                if (i22 > i6) {
                                    Object[] objArr4 = p94Var.c;
                                    long[] jArr2 = p94Var.a;
                                    int length2 = jArr2.length - 2;
                                    if (length2 >= 0) {
                                        int i29 = 0;
                                        while (true) {
                                            long j2 = jArr2[i29];
                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                                int i31 = 0;
                                                while (i31 < i30) {
                                                    if ((j2 & 255) < 128) {
                                                        nu2 nu2Var4 = (nu2) objArr4[(i29 << 3) + i31];
                                                        int i32 = nu2Var4.a;
                                                        if (i32 == i6) {
                                                            nu2Var4.a = i22;
                                                        } else {
                                                            objArr2 = objArr4;
                                                            if (i6 + 1 <= i32 && i32 < i22) {
                                                                nu2Var4.a = i32 - 1;
                                                            }
                                                            j2 >>= 8;
                                                            i31++;
                                                            objArr4 = objArr2;
                                                        }
                                                    }
                                                    objArr2 = objArr4;
                                                    j2 >>= 8;
                                                    i31++;
                                                    objArr4 = objArr2;
                                                }
                                                objArr = objArr4;
                                                if (i30 != 8) {
                                                    break;
                                                }
                                            } else {
                                                objArr = objArr4;
                                            }
                                            if (i29 == length2) {
                                                break;
                                            }
                                            i29++;
                                            objArr4 = objArr;
                                        }
                                    }
                                }
                            }
                            qx0 qx0Var = this.M;
                            int i33 = qx0Var.f;
                            xq2 xq2Var = qx0Var.a;
                            qx0Var.f = (i21 - xq2Var.G.g) + i33;
                            this.G.r(i21);
                            if (i7 > 0) {
                                qx0Var.d(false);
                                r93 r93Var = qx0Var.d;
                                lk6 lk6Var3 = xq2Var.G;
                                if (lk6Var3.c > 0 && r93Var.a(-2) != (i8 = lk6Var3.i)) {
                                    if (!qx0Var.c && qx0Var.e) {
                                        qx0Var.d(false);
                                        qx0Var.b.m.h0(fn4.d);
                                        qx0Var.c = true;
                                    }
                                    if (i8 > 0) {
                                        sq2 a = lk6Var3.a(i8);
                                        r93Var.c(i8);
                                        qx0Var.d(false);
                                        co4 co4Var = qx0Var.b.m;
                                        co4Var.h0(en4.d);
                                        bl2.P(co4Var, 0, a);
                                        qx0Var.c = true;
                                    }
                                }
                                co4 co4Var2 = qx0Var.b.m;
                                co4Var2.h0(jn4.d);
                                co4Var2.e[co4Var2.f - co4Var2.c[co4Var2.d - 1].b] = i7;
                            }
                            a0(z, obj2);
                        } else {
                            this.G.k++;
                            this.S = true;
                            this.K = null;
                            if (this.I.w) {
                                pk6 d = this.H.d();
                                this.I = d;
                                d.M();
                                this.J = false;
                                this.K = null;
                            }
                            this.I.d();
                            pk6 pk6Var2 = this.I;
                            int i34 = pk6Var2.t;
                            if (z) {
                                pk6Var2.Q(i, obj6, obj6, true);
                                i3 = 0;
                            } else if (obj2 != null) {
                                if (obj != null) {
                                    obj6 = obj;
                                }
                                i3 = 0;
                                pk6Var2.Q(i, obj6, obj2, false);
                            } else {
                                i3 = 0;
                                if (obj == null) {
                                    obj3 = obj6;
                                } else {
                                    obj3 = obj;
                                }
                                pk6Var2.Q(i, obj3, obj6, false);
                            }
                            this.N = this.I.b(i34);
                            int i35 = (-2) - i34;
                            zg3 zg3Var3 = new zg3(-1, i, i35, -1);
                            p94Var.i(i35, new nu2(-1, this.k - i20, i3));
                            arrayList2.add(zg3Var3);
                            ArrayList arrayList3 = new ArrayList();
                            if (z) {
                                i4 = i3;
                            } else {
                                i4 = this.k;
                            }
                            ar2Var2 = new ar2(i4, arrayList3);
                            w(z, ar2Var2);
                            return;
                        }
                    }
                    ar2Var2 = null;
                    w(z, ar2Var2);
                    return;
                }
                z3 = z2;
                ar2Var = this.j;
                if (ar2Var != null) {
                }
                ar2Var2 = null;
                w(z, ar2Var2);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ i12;
        } else {
            if (obj5 instanceof Enum) {
                hashCode = ((Enum) obj5).ordinal();
            } else {
                hashCode = obj5.hashCode();
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ hashCode, 3);
        }
        this.T = rotateLeft;
        if (obj5 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.S) {
        }
    }

    public final void X() {
        W(null, -127, 0, null);
    }

    public final void Y(int i, km4 km4Var) {
        W(km4Var, i, 0, null);
    }

    public final void Z(int i, Object obj) {
        W(obj, i, 0, null);
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        ld2 ld2Var = this.O;
        ld2Var.d.e0();
        ld2Var.c.e0();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        lk6 lk6Var = this.G;
        if (!lk6Var.f) {
            lk6Var.c();
        }
        if (!this.I.w) {
            x();
        }
    }

    public final void a0(boolean z, Object obj) {
        if (z) {
            lk6 lk6Var = this.G;
            if (lk6Var.k <= 0) {
                if ((lk6Var.b[(lk6Var.g * 5) + 1] & 1073741824) == 0) {
                    r05.a("Expected a node group");
                }
                lk6Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            qx0 qx0Var = this.M;
            qx0Var.getClass();
            qx0Var.d(false);
            co4 co4Var = qx0Var.b.m;
            co4Var.h0(wn4.d);
            bl2.P(co4Var, 0, obj);
        }
        this.G.u();
    }

    public final void b(eo2 eo2Var, Object obj) {
        if (this.S) {
            co4 co4Var = this.O.c;
            co4Var.h0(xn4.d);
            bl2.P(co4Var, 0, obj);
            eo2Var.getClass();
            ge7.p(2, eo2Var);
            bl2.P(co4Var, 1, eo2Var);
            return;
        }
        qx0 qx0Var = this.M;
        qx0Var.b();
        co4 co4Var2 = qx0Var.b.m;
        co4Var2.h0(xn4.d);
        eo2Var.getClass();
        ge7.p(2, eo2Var);
        bl2.Q(co4Var2, 0, obj, 1, eo2Var);
    }

    public final void b0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            W(null, i, 0, null);
            return;
        }
        if (this.r) {
            tx0.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.m;
        this.m++;
        lk6 lk6Var = this.G;
        boolean z = this.S;
        vs0 vs0Var = ox0.a;
        if (z) {
            lk6Var.k++;
            this.I.Q(i, vs0Var, vs0Var, false);
            w(false, null);
        } else if (lk6Var.g() == i && ((i3 = lk6Var.g) >= lk6Var.h || (lk6Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            lk6Var.u();
            w(false, null);
        } else {
            if (lk6Var.k <= 0 && (i2 = lk6Var.g) != lk6Var.h) {
                int i4 = this.k;
                M();
                this.M.e(i4, lk6Var.s());
                hf.v(i2, this.s, lk6Var.g);
            }
            lk6Var.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                pk6 d = this.H.d();
                this.I = d;
                d.M();
                this.J = false;
                this.K = null;
            }
            pk6 pk6Var = this.I;
            pk6Var.d();
            int i5 = pk6Var.t;
            pk6Var.Q(i, vs0Var, vs0Var, false);
            this.N = pk6Var.b(i5);
            w(false, null);
        }
    }

    public final boolean c(float f) {
        Object H = H();
        if ((H instanceof Float) && f == ((Number) H).floatValue()) {
            return false;
        }
        m0(Float.valueOf(f));
        return true;
    }

    public final void c0(int i) {
        W(null, i, 0, null);
    }

    public final boolean d(int i) {
        Object H = H();
        if ((H instanceof Integer) && i == ((Number) H).intValue()) {
            return false;
        }
        m0(Integer.valueOf(i));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xq2 d0(int i) {
        xb3 xb3Var;
        cf5 cf5Var;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        b0(i);
        boolean z3 = this.S;
        os0 os0Var = this.g;
        ArrayList arrayList = this.E;
        ey0 ey0Var = this.h;
        if (z3) {
            cf5 cf5Var2 = new cf5(ey0Var);
            arrayList.add(cf5Var2);
            m0(cf5Var2);
            cf5Var2.e = this.B;
            cf5Var2.b &= -17;
            os0Var.S();
            return this;
        }
        int i4 = this.G.i;
        ArrayList arrayList2 = this.s;
        int O = hf.O(i4, arrayList2);
        if (O >= 0) {
            xb3Var = (xb3) arrayList2.remove(O);
        } else {
            xb3Var = null;
        }
        Object m = this.G.m();
        if (nb3.k(m, ox0.a)) {
            cf5Var = new cf5(ey0Var);
            m0(cf5Var);
        } else {
            m.getClass();
            cf5Var = (cf5) m;
        }
        if (xb3Var == null) {
            int i5 = cf5Var.b;
            if ((i5 & 64) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                cf5Var.b = i5 & (-65);
            }
            if (!z2) {
                z = false;
                int i6 = cf5Var.b;
                if (!z) {
                    i2 = i6 | 8;
                } else {
                    i2 = i6 & (-9);
                }
                cf5Var.b = i2;
                arrayList.add(cf5Var);
                cf5Var.e = this.B;
                cf5Var.b &= -17;
                os0Var.S();
                i3 = cf5Var.b;
                if ((i3 & 256) != 0) {
                    cf5Var.b = (i3 & (-257)) | 512;
                    co4 co4Var = this.M.b.m;
                    co4Var.h0(sn4.d);
                    bl2.P(co4Var, 0, cf5Var);
                    if (!this.y) {
                        int i7 = cf5Var.b;
                        if ((i7 & 128) != 0) {
                            this.y = true;
                            this.z = this.G.i;
                            cf5Var.b = i7 | 1024;
                        }
                    }
                }
                return this;
            }
        }
        z = true;
        int i62 = cf5Var.b;
        if (!z) {
        }
        cf5Var.b = i2;
        arrayList.add(cf5Var);
        cf5Var.e = this.B;
        cf5Var.b &= -17;
        os0Var.S();
        i3 = cf5Var.b;
        if ((i3 & 256) != 0) {
        }
        return this;
    }

    public final boolean e(long j) {
        Object H = H();
        if ((H instanceof Long) && j == ((Number) H).longValue()) {
            return false;
        }
        m0(Long.valueOf(j));
        return true;
    }

    public final void e0(Object obj) {
        if (!this.S && this.G.g() == 207 && !nb3.k(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        W(null, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 0, obj);
    }

    public final boolean f(Object obj) {
        if (!nb3.k(H(), obj)) {
            m0(obj);
            return true;
        }
        return false;
    }

    public final void f0() {
        W(null, 125, 2, null);
        this.r = true;
    }

    public final boolean g(boolean z) {
        Object H = H();
        if ((H instanceof Boolean) && z == ((Boolean) H).booleanValue()) {
            return false;
        }
        m0(Boolean.valueOf(z));
        return true;
    }

    public final void g0() {
        this.m = 0;
        this.G = this.c.c();
        W(null, 100, 0, null);
        zx0 zx0Var = this.b;
        zx0Var.t();
        xv4 i = zx0Var.i();
        this.x.c(this.w ? 1 : 0);
        this.w = f(i);
        this.K = null;
        if (!this.q) {
            this.q = zx0Var.e();
        }
        if (!this.C) {
            this.C = zx0Var.f();
        }
        if (this.C) {
            nq6 nq6Var = dy0.a;
            nq6Var.getClass();
            i = i.d(nq6Var, new oq6(C()));
        }
        this.u = i;
        Set set = (Set) q60.U(i, r83.a);
        if (set != null) {
            set.add(y());
            zx0Var.o(set);
        }
        W(null, Long.hashCode(zx0Var.g()), 0, null);
    }

    public final boolean h(Object obj) {
        if (H() != obj) {
            m0(obj);
            return true;
        }
        return false;
    }

    public final boolean h0(cf5 cf5Var, Object obj) {
        sq2 sq2Var = cf5Var.c;
        if (sq2Var != null) {
            int a = this.G.a.a(yh2.k(sq2Var));
            if (this.F && a >= this.G.g) {
                ArrayList arrayList = this.s;
                int O = hf.O(a, arrayList);
                if (O < 0) {
                    int i = -(O + 1);
                    if (!(obj instanceof ii1)) {
                        obj = null;
                    }
                    arrayList.add(i, new xb3(cf5Var, a, obj));
                    return true;
                }
                xb3 xb3Var = (xb3) arrayList.get(O);
                if (obj instanceof ii1) {
                    Object obj2 = xb3Var.c;
                    if (obj2 == null) {
                        xb3Var.c = obj;
                        return true;
                    } else if (obj2 instanceof ka4) {
                        ((ka4) obj2).a(obj);
                        return true;
                    } else {
                        ka4 ka4Var = c66.a;
                        ka4 ka4Var2 = new ka4(2);
                        ka4Var2.k(obj2);
                        ka4Var2.k(obj);
                        xb3Var.c = ka4Var2;
                        return true;
                    }
                }
                xb3Var.c = null;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        qx0 qx0Var = this.M;
        qx0Var.c = false;
        qx0Var.d.b = 0;
        qx0Var.f = 0;
        qx0Var.e = true;
        qx0Var.g = 0;
        qx0Var.h.clear();
        qx0Var.i = -1;
        qx0Var.j = -1;
        qx0Var.k = -1;
        qx0Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0(ja4 ja4Var) {
        sq2 sq2Var;
        ArrayList arrayList = this.s;
        for (int U = hf.U(arrayList); -1 < U; U--) {
            xb3 xb3Var = (xb3) arrayList.get(U);
            sq2 sq2Var2 = xb3Var.a.c;
            if (sq2Var2 != null) {
                sq2Var = yh2.k(sq2Var2);
            } else {
                sq2Var = null;
            }
            if (sq2Var != null && sq2Var.a()) {
                int i = xb3Var.b;
                int i2 = sq2Var.a;
                if (i != i2) {
                    xb3Var.b = i2;
                }
            } else {
                arrayList.remove(U);
            }
        }
        Object[] objArr = ja4Var.b;
        Object[] objArr2 = ja4Var.c;
        long[] jArr = ja4Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            cf5 cf5Var = (cf5) obj;
                            sq2 sq2Var3 = cf5Var.c;
                            if (sq2Var3 != null) {
                                int i7 = yh2.k(sq2Var3).a;
                                if (obj2 == d90.C0) {
                                    obj2 = null;
                                }
                                arrayList.add(new xb3(cf5Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        jt0.x0(arrayList, hf.m);
    }

    public final Object j(l55 l55Var) {
        return q60.U(l(), l55Var);
    }

    public final void j0(int i, int i2) {
        if (n0(i) != i2) {
            if (i < 0) {
                n94 n94Var = this.p;
                if (n94Var == null) {
                    n94Var = new n94();
                    this.p = n94Var;
                }
                n94Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void k(on2 on2Var) {
        if (!this.r) {
            tx0.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            tx0.a("createNode() can only be called when inserting");
        }
        r93 r93Var = this.n;
        int i = r93Var.a[r93Var.b - 1];
        pk6 pk6Var = this.I;
        sq2 b = pk6Var.b(pk6Var.v);
        this.l++;
        ld2 ld2Var = this.O;
        co4 co4Var = ld2Var.c;
        co4Var.h0(gn4.e);
        bl2.P(co4Var, 0, on2Var);
        co4Var.e[co4Var.f - co4Var.c[co4Var.d - 1].b] = i;
        bl2.P(co4Var, 1, b);
        co4 co4Var2 = ld2Var.d;
        co4Var2.h0(gn4.f);
        co4Var2.e[co4Var2.f - co4Var2.c[co4Var2.d - 1].b] = i;
        bl2.P(co4Var2, 0, b);
    }

    public final void k0(int i, int i2) {
        int n0 = n0(i);
        if (n0 != i2) {
            int i3 = i2 - n0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int n02 = n0(i) + i3;
                j0(i, n02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        ar2 ar2Var = (ar2) arrayList.get(i4);
                        if (ar2Var != null && ar2Var.a(i, n02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                lk6 lk6Var = this.G;
                if (i < 0) {
                    i = lk6Var.i;
                } else if (!lk6Var.l(i)) {
                    i = this.G.q(i);
                } else {
                    return;
                }
            }
        }
    }

    public final xv4 l() {
        xv4 xv4Var;
        xv4 xv4Var2 = this.K;
        if (xv4Var2 != null) {
            return xv4Var2;
        }
        int i = this.G.i;
        boolean z = this.S;
        km4 km4Var = tx0.c;
        if (z && this.J) {
            int i2 = this.I.v;
            while (i2 > 0) {
                if (this.I.s(i2) == 202 && nb3.k(this.I.t(i2), km4Var)) {
                    Object q = this.I.q(i2);
                    q.getClass();
                    xv4 xv4Var3 = (xv4) q;
                    this.K = xv4Var3;
                    return xv4Var3;
                }
                pk6 pk6Var = this.I;
                i2 = pk6Var.E(pk6Var.b, i2);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    lk6 lk6Var = this.G;
                    if (nb3.k(lk6Var.p(lk6Var.b, i), km4Var)) {
                        p94 p94Var = this.v;
                        if (p94Var == null || (xv4Var = (xv4) p94Var.b(i)) == null) {
                            lk6 lk6Var2 = this.G;
                            Object b = lk6Var2.b(lk6Var2.b, i);
                            b.getClass();
                            xv4Var = (xv4) b;
                        }
                        this.K = xv4Var;
                        return xv4Var;
                    }
                }
                i = this.G.q(i);
            }
        }
        xv4 xv4Var4 = this.u;
        this.K = xv4Var4;
        return xv4Var4;
    }

    public final void l0(Object obj) {
        if (obj instanceof bj5) {
            br2 br2Var = new br2((bj5) obj, this.m - 1);
            if (this.S) {
                co4 co4Var = this.M.b.m;
                co4Var.h0(ln4.d);
                bl2.P(co4Var, 0, br2Var);
            }
            this.d.add(obj);
            obj = br2Var;
        }
        m0(obj);
    }

    public final fx0 m() {
        Collection collection;
        Object obj;
        if (!this.b.k()) {
            return null;
        }
        kw3 I = hf.I();
        pk6 pk6Var = this.I;
        I.addAll(ak7.J(pk6Var, null, pk6Var.t, null));
        lk6 lk6Var = this.G;
        boolean z = lk6Var.f;
        int[] iArr = lk6Var.b;
        if (!z && lk6Var.c != 0) {
            ae5 ae5Var = new ae5(lk6Var);
            int i = lk6Var.i;
            Object valueOf = Integer.valueOf(lk6Var.l - ok6.b(iArr, i));
            while (i >= 0) {
                if (lk6Var.k(i)) {
                    obj = lk6Var.p(iArr, i);
                } else {
                    obj = ox0.a;
                }
                ae5Var.i(lk6Var.i(i), obj, lk6Var.a.g(i), valueOf);
                valueOf = lk6Var.a(i);
                i = lk6Var.q(i);
            }
            collection = (ArrayList) ae5Var.a;
        } else {
            collection = yt1.A;
        }
        I.addAll(collection);
        I.addAll(I());
        return new fx0(hf.A(I), this.C);
    }

    public final void m0(Object obj) {
        if (this.S) {
            pk6 pk6Var = this.I;
            if (pk6Var.n > 0 && pk6Var.i != pk6Var.k) {
                p94 p94Var = pk6Var.s;
                if (p94Var == null) {
                    p94Var = new p94();
                }
                pk6Var.s = p94Var;
                int i = pk6Var.v;
                Object b = p94Var.b(i);
                if (b == null) {
                    b = new ca4();
                    p94Var.i(i, b);
                }
                ((ca4) b).a(obj);
                return;
            }
            pk6Var.F(obj);
            return;
        }
        lk6 lk6Var = this.G;
        boolean z = lk6Var.n;
        qx0 qx0Var = this.M;
        if (z) {
            int b2 = (lk6Var.l - ok6.b(lk6Var.b, lk6Var.i)) - 1;
            if (qx0Var.a.G.i - qx0Var.f < 0) {
                lk6 lk6Var2 = this.G;
                sq2 a = lk6Var2.a(lk6Var2.i);
                co4 co4Var = qx0Var.b.m;
                co4Var.h0(gn4.g);
                bl2.Q(co4Var, 0, obj, 1, a);
                co4Var.e[co4Var.f - co4Var.c[co4Var.d - 1].b] = b2;
                return;
            }
            qx0Var.d(true);
            co4 co4Var2 = qx0Var.b.m;
            co4Var2.h0(gn4.h);
            bl2.P(co4Var2, 0, obj);
            co4Var2.e[co4Var2.f - co4Var2.c[co4Var2.d - 1].b] = b2;
            return;
        }
        sq2 a2 = lk6Var.a(lk6Var.i);
        co4 co4Var3 = qx0Var.b.m;
        co4Var3.h0(tm4.d);
        bl2.Q(co4Var3, 0, a2, 1, obj);
    }

    public final void n(ja4 ja4Var, eo2 eo2Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            tx0.a("Reentrant composition is not supported");
        }
        this.g.S();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(bm6.j().g());
            this.v = null;
            i0(ja4Var);
            this.k = 0;
            this.F = true;
            g0();
            Object H = H();
            if (H != eo2Var && eo2Var != null) {
                m0(eo2Var);
            }
            wq2 wq2Var = this.D;
            ua4 H2 = np2.H();
            H2.b(wq2Var);
            km4 km4Var = tx0.a;
            if (eo2Var != null) {
                Y(MlKitException.CODE_SCANNER_UNAVAILABLE, km4Var);
                lb4.z(this, eo2Var);
                p(false);
            } else if (this.w && H != null && !H.equals(ox0.a)) {
                Y(MlKitException.CODE_SCANNER_UNAVAILABLE, km4Var);
                ge7.p(2, H);
                lb4.z(this, (eo2) H);
                p(false);
            } else {
                T();
            }
            H2.l(H2.L - 1);
            v();
            this.F = false;
            arrayList.clear();
            if (!this.I.w) {
                tx0.a("Check failed");
            }
            x();
        } finally {
            Trace.endSection();
        }
    }

    public final int n0(int i) {
        int i2;
        if (i < 0) {
            n94 n94Var = this.p;
            if (n94Var != null && n94Var.c(i) >= 0) {
                int c = n94Var.c(i);
                if (c >= 0) {
                    return n94Var.c[c];
                }
                fa6.e(lb1.g(i, "Cannot find value for key "));
            }
            return 0;
        }
        int[] iArr = this.o;
        if (iArr != null && (i2 = iArr[i]) >= 0) {
            return i2;
        }
        return this.G.o(i);
    }

    public final void o(int i, int i2) {
        if (i > 0 && i != i2) {
            o(this.G.q(i), i2);
            if (this.G.l(i)) {
                Object n = this.G.n(i);
                qx0 qx0Var = this.M;
                qx0Var.c();
                qx0Var.h.add(n);
            }
        }
    }

    public final void o0() {
        if (!this.r) {
            tx0.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            tx0.a("useNode() called while inserting");
        }
        lk6 lk6Var = this.G;
        Object n = lk6Var.n(lk6Var.i);
        qx0 qx0Var = this.M;
        qx0Var.c();
        qx0Var.h.add(n);
        if (this.y && (n instanceof ww0)) {
            qx0Var.b();
            qx0Var.b.m.h0(zn4.d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05ae  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(boolean z) {
        int hashCode;
        long rotateRight;
        r93 r93Var;
        ArrayList arrayList;
        int i;
        boolean z2;
        int i2;
        lk6 lk6Var;
        ArrayList arrayList2;
        ar2 ar2Var;
        lk6 lk6Var2;
        ?? r3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        r93 r93Var2;
        int i8;
        int i9;
        int i10;
        ArrayList arrayList3;
        ka4 ka4Var;
        int i11;
        int i12;
        ArrayList arrayList4;
        ArrayList arrayList5;
        HashSet hashSet;
        int i13;
        ar2 ar2Var2;
        int i14;
        int i15;
        int i16;
        int i17;
        Object[] objArr;
        long[] jArr;
        int i18;
        Object[] objArr2;
        long[] jArr2;
        int i19;
        Object[] objArr3;
        long[] jArr3;
        int i20;
        Object[] objArr4;
        long[] jArr4;
        int hashCode2;
        long rotateRight2;
        r93 r93Var3 = this.n;
        int i21 = r93Var3.a[r93Var3.b - 2] - 1;
        boolean z3 = this.S;
        vs0 vs0Var = ox0.a;
        if (z3) {
            pk6 pk6Var = this.I;
            int i22 = pk6Var.v;
            int s = pk6Var.s(i22);
            Object t = this.I.t(i22);
            Object q = this.I.q(i22);
            if (t == null) {
                if (q != null && s == 207 && !q.equals(vs0Var)) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ i21, 3) ^ q.hashCode(), 3);
                } else {
                    rotateRight2 = Long.rotateRight(this.T ^ i21, 3) ^ s;
                }
            } else {
                if (t instanceof Enum) {
                    hashCode2 = ((Enum) t).ordinal();
                } else {
                    hashCode2 = t.hashCode();
                }
                rotateRight2 = Long.rotateRight(this.T, 3) ^ hashCode2;
            }
            this.T = Long.rotateRight(rotateRight2, 3);
        } else {
            lk6 lk6Var3 = this.G;
            int i23 = lk6Var3.i;
            int i24 = lk6Var3.i(i23);
            lk6 lk6Var4 = this.G;
            Object p = lk6Var4.p(lk6Var4.b, i23);
            lk6 lk6Var5 = this.G;
            Object b = lk6Var5.b(lk6Var5.b, i23);
            if (p == null) {
                if (b != null && i24 == 207 && !b.equals(vs0Var)) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ i21, 3) ^ b.hashCode(), 3);
                } else {
                    rotateRight = Long.rotateRight(this.T ^ i21, 3) ^ i24;
                }
            } else {
                if (p instanceof Enum) {
                    hashCode = ((Enum) p).ordinal();
                } else {
                    hashCode = p.hashCode();
                }
                rotateRight = Long.rotateRight(this.T, 3) ^ hashCode;
            }
            this.T = Long.rotateRight(rotateRight, 3);
        }
        int i25 = this.l;
        ar2 ar2Var3 = this.j;
        ArrayList arrayList6 = this.s;
        qx0 qx0Var = this.M;
        if (ar2Var3 != null) {
            p94 p94Var = ar2Var3.e;
            int i26 = ar2Var3.b;
            ArrayList arrayList7 = ar2Var3.a;
            if (arrayList7.size() > 0) {
                ArrayList arrayList8 = ar2Var3.d;
                HashSet hashSet2 = new HashSet(arrayList8.size());
                int size = arrayList8.size();
                for (int i27 = 0; i27 < size; i27++) {
                    hashSet2.add(arrayList8.get(i27));
                }
                i = -1;
                ka4 ka4Var2 = c66.a;
                ka4 ka4Var3 = new ka4();
                int size2 = arrayList8.size();
                int size3 = arrayList7.size();
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                while (i28 < size3) {
                    zg3 zg3Var = (zg3) arrayList7.get(i28);
                    if (!hashSet2.contains(zg3Var)) {
                        r93Var2 = r93Var3;
                        nu2 nu2Var = (nu2) p94Var.b(zg3Var.c);
                        if (nu2Var != null) {
                            i8 = nu2Var.b;
                        } else {
                            i8 = -1;
                        }
                        int i31 = zg3Var.c;
                        i9 = i28;
                        qx0Var.e(i8 + i26, zg3Var.d);
                        ar2Var3.a(i31, 0);
                        qx0Var.f = (i31 - qx0Var.a.G.g) + qx0Var.f;
                        this.G.r(i31);
                        M();
                        this.G.s();
                        hf.v(i31, arrayList6, this.G.b[(i31 * 5) + 3] + i31);
                    } else {
                        r93Var2 = r93Var3;
                        i9 = i28;
                        if (!ka4Var3.c(zg3Var)) {
                            int i32 = i29;
                            if (i32 < size2) {
                                zg3 zg3Var2 = (zg3) arrayList8.get(i32);
                                if (zg3Var2 != zg3Var) {
                                    nu2 nu2Var2 = (nu2) p94Var.b(zg3Var2.c);
                                    if (nu2Var2 != null) {
                                        i16 = nu2Var2.b;
                                    } else {
                                        i16 = -1;
                                    }
                                    ka4Var3.a(zg3Var2);
                                    i10 = i32;
                                    i13 = i30;
                                    ar2Var2 = ar2Var3;
                                    if (i16 != i13) {
                                        nu2 nu2Var3 = (nu2) p94Var.b(zg3Var2.c);
                                        if (nu2Var3 != null) {
                                            i17 = nu2Var3.c;
                                        } else {
                                            i17 = zg3Var2.d;
                                        }
                                        ka4Var = ka4Var3;
                                        int i33 = i16 + i26;
                                        i11 = size2;
                                        int i34 = i13 + i26;
                                        if (i17 > 0) {
                                            i12 = i26;
                                            int i35 = qx0Var.l;
                                            if (i35 > 0) {
                                                arrayList4 = arrayList7;
                                                if (qx0Var.j == i33 - i35 && qx0Var.k == i34 - i35) {
                                                    qx0Var.l = i35 + i17;
                                                }
                                            } else {
                                                arrayList4 = arrayList7;
                                            }
                                            qx0Var.c();
                                            qx0Var.j = i33;
                                            qx0Var.k = i34;
                                            qx0Var.l = i17;
                                        } else {
                                            i12 = i26;
                                            arrayList4 = arrayList7;
                                            qx0Var.getClass();
                                        }
                                        if (i16 > i13) {
                                            Object[] objArr5 = p94Var.c;
                                            long[] jArr5 = p94Var.a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList5 = arrayList8;
                                                hashSet = hashSet2;
                                                int i36 = 0;
                                                while (true) {
                                                    long j = jArr5[i36];
                                                    int i37 = i17;
                                                    arrayList3 = arrayList6;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i38 = 8 - ((~(i36 - length)) >>> 31);
                                                        int i39 = 0;
                                                        while (i39 < i38) {
                                                            if ((j & 255) < 128) {
                                                                i20 = i39;
                                                                nu2 nu2Var4 = (nu2) objArr5[(i36 << 3) + i39];
                                                                objArr4 = objArr5;
                                                                int i40 = nu2Var4.b;
                                                                jArr4 = jArr5;
                                                                if (i16 <= i40 && i40 < i16 + i37) {
                                                                    nu2Var4.b = (i40 - i16) + i13;
                                                                } else if (i13 <= i40 && i40 < i16) {
                                                                    nu2Var4.b = i40 + i37;
                                                                }
                                                            } else {
                                                                i20 = i39;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i39 = i20 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i38 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i36 == length) {
                                                        break;
                                                    }
                                                    i36++;
                                                    arrayList6 = arrayList3;
                                                    i17 = i37;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                        } else {
                                            int i41 = i17;
                                            arrayList3 = arrayList6;
                                            arrayList5 = arrayList8;
                                            hashSet = hashSet2;
                                            if (i13 > i16) {
                                                Object[] objArr6 = p94Var.c;
                                                long[] jArr6 = p94Var.a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i42 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i42];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i43 = 8 - ((~(i42 - length2)) >>> 31);
                                                            int i44 = 0;
                                                            while (i44 < i43) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    nu2 nu2Var5 = (nu2) objArr6[(i42 << 3) + i44];
                                                                    jArr2 = jArr6;
                                                                    int i45 = nu2Var5.b;
                                                                    i19 = i16;
                                                                    if (i16 <= i45 && i45 < i19 + i41) {
                                                                        nu2Var5.b = (i45 - i19) + i13;
                                                                    } else if (i19 + 1 <= i45 && i45 < i13) {
                                                                        nu2Var5.b = i45 - i41;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i19 = i16;
                                                                }
                                                                j2 >>= 8;
                                                                i44++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i16 = i19;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i18 = i16;
                                                            if (i43 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i18 = i16;
                                                        }
                                                        if (i42 == length2) {
                                                            break;
                                                        }
                                                        i42++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i16 = i18;
                                                    }
                                                }
                                            }
                                        }
                                        i14 = i9;
                                    } else {
                                        arrayList3 = arrayList6;
                                        ka4Var = ka4Var3;
                                        i11 = size2;
                                        i12 = i26;
                                        arrayList4 = arrayList7;
                                    }
                                    arrayList5 = arrayList8;
                                    hashSet = hashSet2;
                                    i14 = i9;
                                } else {
                                    i10 = i32;
                                    arrayList3 = arrayList6;
                                    ka4Var = ka4Var3;
                                    i11 = size2;
                                    i12 = i26;
                                    arrayList4 = arrayList7;
                                    arrayList5 = arrayList8;
                                    hashSet = hashSet2;
                                    i13 = i30;
                                    ar2Var2 = ar2Var3;
                                    i14 = i9 + 1;
                                }
                                i29 = i10 + 1;
                                nu2 nu2Var6 = (nu2) p94Var.b(zg3Var2.c);
                                if (nu2Var6 != null) {
                                    i15 = nu2Var6.c;
                                } else {
                                    i15 = zg3Var2.d;
                                }
                                int i46 = i13 + i15;
                                i28 = i14;
                                ar2Var3 = ar2Var2;
                                ka4Var3 = ka4Var;
                                size2 = i11;
                                i26 = i12;
                                arrayList7 = arrayList4;
                                arrayList8 = arrayList5;
                                hashSet2 = hashSet;
                                arrayList6 = arrayList3;
                                i30 = i46;
                                r93Var3 = r93Var2;
                            } else {
                                i29 = i32;
                                r93Var3 = r93Var2;
                                i28 = i9;
                            }
                        }
                    }
                    i28 = i9 + 1;
                    r93Var3 = r93Var2;
                }
                r93Var = r93Var3;
                arrayList = arrayList6;
                qx0Var.c();
                if (arrayList7.size() > 0) {
                    lk6 lk6Var6 = this.G;
                    qx0Var.f = (lk6Var6.h - qx0Var.a.G.g) + qx0Var.f;
                    lk6Var6.t();
                }
                z2 = this.S;
                if (!z2) {
                    lk6 lk6Var7 = this.G;
                    int i47 = lk6Var7.m - lk6Var7.l;
                    if (i47 > 0) {
                        if (i47 > 0) {
                            qx0Var.d(false);
                            r93 r93Var4 = qx0Var.d;
                            lk6 lk6Var8 = qx0Var.a.G;
                            if (lk6Var8.c > 0 && r93Var4.a(-2) != (i7 = lk6Var8.i)) {
                                if (!qx0Var.c && qx0Var.e) {
                                    qx0Var.d(false);
                                    qx0Var.b.m.h0(fn4.d);
                                    qx0Var.c = true;
                                }
                                if (i7 > 0) {
                                    sq2 a = lk6Var8.a(i7);
                                    r93Var4.c(i7);
                                    qx0Var.d(false);
                                    co4 co4Var = qx0Var.b.m;
                                    co4Var.h0(en4.d);
                                    bl2.P(co4Var, 0, a);
                                    qx0Var.c = true;
                                }
                            }
                            co4 co4Var2 = qx0Var.b.m;
                            co4Var2.h0(vn4.d);
                            co4Var2.e[co4Var2.f - co4Var2.c[co4Var2.d - 1].b] = i47;
                        } else {
                            qx0Var.getClass();
                        }
                    }
                }
                i2 = this.k;
                while (true) {
                    lk6Var = this.G;
                    if (lk6Var.k > 0 && (i6 = lk6Var.g) != lk6Var.h) {
                        M();
                        qx0Var.e(i2, this.G.s());
                        hf.v(i6, arrayList, this.G.g);
                    }
                }
                if (!z2) {
                    if (z) {
                        ld2 ld2Var = this.O;
                        co4 co4Var3 = ld2Var.d;
                        if (co4Var3.d == 0) {
                            tx0.a("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        co4 co4Var4 = ld2Var.c;
                        ao4[] ao4VarArr = co4Var3.c;
                        int i48 = co4Var3.d - 1;
                        co4Var3.d = i48;
                        ao4 ao4Var = ao4VarArr[i48];
                        ao4VarArr[i48] = null;
                        co4Var4.h0(ao4Var);
                        Object[] objArr7 = co4Var3.g;
                        Object[] objArr8 = co4Var4.g;
                        int i49 = co4Var4.h;
                        int i50 = ao4Var.c;
                        int i51 = co4Var3.h;
                        int i52 = i51 - i50;
                        System.arraycopy(objArr7, i52, objArr8, i49 - i50, i51 - i52);
                        Object[] objArr9 = co4Var3.g;
                        int i53 = co4Var3.h;
                        Arrays.fill(objArr9, i53 - i50, i53, (Object) null);
                        int[] iArr = co4Var3.e;
                        int[] iArr2 = co4Var4.e;
                        int i54 = co4Var4.f;
                        int i55 = ao4Var.b;
                        int i56 = co4Var3.f;
                        fv.r0(i54 - i55, i56 - i55, i56, iArr, iArr2);
                        co4Var3.h -= i50;
                        co4Var3.f -= i55;
                        i25 = 1;
                    }
                    if (this.G.k <= 0) {
                        r05.a("Unbalanced begin/end empty");
                    }
                    lk6Var2.k--;
                    pk6 pk6Var2 = this.I;
                    int i57 = pk6Var2.v;
                    pk6Var2.j();
                    if (this.G.k <= 0) {
                        int i58 = (-2) - i57;
                        this.I.k();
                        this.I.e(true);
                        sq2 sq2Var = this.N;
                        boolean g0 = this.O.c.g0();
                        mk6 mk6Var = this.H;
                        if (g0) {
                            qx0Var.b();
                            qx0Var.d(false);
                            r93 r93Var5 = qx0Var.d;
                            lk6 lk6Var9 = qx0Var.a.G;
                            if (lk6Var9.c > 0 && r93Var5.a(-2) != (i5 = lk6Var9.i)) {
                                if (!qx0Var.c && qx0Var.e) {
                                    qx0Var.d(false);
                                    qx0Var.b.m.h0(fn4.d);
                                    qx0Var.c = true;
                                }
                                if (i5 > 0) {
                                    sq2 a2 = lk6Var9.a(i5);
                                    r93Var5.c(i5);
                                    qx0Var.d(false);
                                    co4 co4Var5 = qx0Var.b.m;
                                    co4Var5.h0(en4.d);
                                    bl2.P(co4Var5, 0, a2);
                                    i4 = 1;
                                    qx0Var.c = true;
                                    qx0Var.c();
                                    co4 co4Var6 = qx0Var.b.m;
                                    co4Var6.h0(hn4.d);
                                    bl2.Q(co4Var6, 0, sq2Var, i4, mk6Var);
                                    r3 = 0;
                                }
                            }
                            i4 = 1;
                            qx0Var.c();
                            co4 co4Var62 = qx0Var.b.m;
                            co4Var62.h0(hn4.d);
                            bl2.Q(co4Var62, 0, sq2Var, i4, mk6Var);
                            r3 = 0;
                        } else {
                            ld2 ld2Var2 = this.O;
                            qx0Var.b();
                            qx0Var.d(false);
                            r93 r93Var6 = qx0Var.d;
                            lk6 lk6Var10 = qx0Var.a.G;
                            if (lk6Var10.c > 0 && r93Var6.a(-2) != (i3 = lk6Var10.i)) {
                                if (!qx0Var.c && qx0Var.e) {
                                    qx0Var.d(false);
                                    qx0Var.b.m.h0(fn4.d);
                                    qx0Var.c = true;
                                }
                                if (i3 > 0) {
                                    sq2 a3 = lk6Var10.a(i3);
                                    r93Var6.c(i3);
                                    qx0Var.d(false);
                                    co4 co4Var7 = qx0Var.b.m;
                                    co4Var7.h0(en4.d);
                                    bl2.P(co4Var7, 0, a3);
                                    qx0Var.c = true;
                                }
                            }
                            qx0Var.c();
                            co4 co4Var8 = qx0Var.b.m;
                            co4Var8.h0(in4.d);
                            int i59 = co4Var8.h - co4Var8.c[co4Var8.d - 1].c;
                            Object[] objArr10 = co4Var8.g;
                            objArr10[i59] = sq2Var;
                            objArr10[i59 + 1] = mk6Var;
                            objArr10[i59 + 2] = ld2Var2;
                            this.O = new ld2();
                            r3 = 0;
                        }
                        this.S = r3;
                        if (this.c.B != 0) {
                            j0(i58, r3);
                            k0(i58, i25);
                        }
                    }
                } else {
                    if (z) {
                        qx0Var.a();
                    }
                    int i60 = qx0Var.a.G.i;
                    r93 r93Var7 = qx0Var.d;
                    int i61 = i;
                    if (r93Var7.a(i61) > i60) {
                        tx0.a("Missed recording an endGroup");
                    }
                    if (r93Var7.a(i61) == i60) {
                        qx0Var.d(false);
                        r93Var7.b();
                        qx0Var.b.m.h0(bn4.d);
                    }
                    int i62 = this.G.i;
                    if (i25 != n0(i62)) {
                        k0(i62, i25);
                    }
                    if (z) {
                        i25 = 1;
                    }
                    this.G.e();
                    qx0Var.c();
                }
                ar2Var = (ar2) this.i.remove(arrayList2.size() - 1);
                if (ar2Var != null && !z2) {
                    ar2Var.c++;
                }
                this.j = ar2Var;
                this.k = r93Var.b() + i25;
                this.m = r93Var.b();
                this.l = r93Var.b() + i25;
            }
        }
        r93Var = r93Var3;
        arrayList = arrayList6;
        i = -1;
        z2 = this.S;
        if (!z2) {
        }
        i2 = this.k;
        while (true) {
            lk6Var = this.G;
            if (lk6Var.k > 0) {
                break;
            }
            M();
            qx0Var.e(i2, this.G.s());
            hf.v(i6, arrayList, this.G.g);
        }
        if (!z2) {
        }
        ar2Var = (ar2) this.i.remove(arrayList2.size() - 1);
        if (ar2Var != null) {
            ar2Var.c++;
        }
        this.j = ar2Var;
        this.k = r93Var.b() + i25;
        this.m = r93Var.b();
        this.l = r93Var.b() + i25;
    }

    public final void q() {
        p(false);
        cf5 A = A();
        if (A != null) {
            int i = A.b;
            if ((i & 1) != 0) {
                A.b = i | 2;
            }
        }
    }

    public final void r() {
        p(true);
    }

    public final void s() {
        p(false);
    }

    public final cf5 t() {
        cf5 cf5Var;
        cf5 cf5Var2;
        sq2 a;
        zu1 zu1Var;
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty()) {
            cf5Var = (cf5) arrayList.remove(arrayList.size() - 1);
        } else {
            cf5Var = null;
        }
        if (cf5Var != null) {
            cf5Var.b &= -9;
            this.g.S();
            int i = this.B;
            y94 y94Var = cf5Var.f;
            if (y94Var != null && (cf5Var.b & 16) == 0) {
                Object[] objArr = y94Var.b;
                int[] iArr = y94Var.c;
                long[] jArr = y94Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    loop0: while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = objArr[i5];
                                    if (iArr[i5] != i) {
                                        zu1Var = new zu1(cf5Var, i, 2, y94Var);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            zu1Var = null;
            qx0 qx0Var = this.M;
            if (zu1Var != null) {
                co4 co4Var = qx0Var.b.m;
                co4Var.h0(an4.d);
                bl2.Q(co4Var, 0, zu1Var, 1, this.h);
            }
            int i6 = cf5Var.b;
            if ((i6 & 512) != 0) {
                cf5Var.b = i6 & (-513);
                co4 co4Var2 = qx0Var.b.m;
                co4Var2.h0(dn4.d);
                bl2.P(co4Var2, 0, cf5Var);
                int i7 = cf5Var.b;
                cf5Var.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    cf5Var.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (cf5Var != null) {
            int i8 = cf5Var.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (cf5Var.c == null) {
                    if (this.S) {
                        pk6 pk6Var = this.I;
                        a = pk6Var.b(pk6Var.v);
                    } else {
                        lk6 lk6Var = this.G;
                        a = lk6Var.a(lk6Var.i);
                    }
                    cf5Var.c = a;
                }
                cf5Var.b &= -5;
                cf5Var2 = cf5Var;
                p(false);
                return cf5Var2;
            }
        }
        cf5Var2 = null;
        p(false);
        return cf5Var2;
    }

    public final void u() {
        if (this.F || this.z != 0) {
            r05.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void v() {
        boolean z = false;
        p(false);
        this.b.c();
        p(false);
        qx0 qx0Var = this.M;
        if (qx0Var.c) {
            qx0Var.d(false);
            qx0Var.d(false);
            qx0Var.b.m.h0(bn4.d);
            qx0Var.c = false;
        }
        qx0Var.b();
        if (qx0Var.d.b != 0) {
            tx0.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            tx0.a("Start/end imbalance");
        }
        i();
        this.G.c();
        if (this.x.b() != 0) {
            z = true;
        }
        this.w = z;
    }

    public final void w(boolean z, ar2 ar2Var) {
        this.i.add(this.j);
        this.j = ar2Var;
        int i = this.l;
        r93 r93Var = this.n;
        r93Var.c(i);
        r93Var.c(this.m);
        r93Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void x() {
        mk6 mk6Var = new mk6();
        if (this.C) {
            mk6Var.b();
        }
        if (this.b.d()) {
            mk6Var.g0 = new p94();
        }
        this.H = mk6Var;
        pk6 d = mk6Var.d();
        d.e(true);
        this.I = d;
    }

    public final by0 y() {
        yq2 yq2Var = this.U;
        if (yq2Var == null) {
            yq2 yq2Var2 = new yq2(this.h);
            this.U = yq2Var2;
            return yq2Var2;
        }
        return yq2Var;
    }

    public final xv4 z() {
        return l();
    }
}
