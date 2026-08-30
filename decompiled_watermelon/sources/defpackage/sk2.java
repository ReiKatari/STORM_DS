package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sk2  reason: default package */
/* loaded from: classes.dex */
public final class sk2 implements tu0 {
    public int A;
    public int B;
    public boolean C;
    public final rk2 D;
    public final ArrayList E;
    public boolean F;
    public v86 G;
    public w86 H;
    public z86 I;
    public boolean J;
    public sm4 K;
    public ij0 L;
    public final uu0 M;
    public mk2 N;
    public t82 O;
    public x56 P;
    public final gv0 Q;
    public final e31 R;
    public boolean S;
    public long T;
    public tk2 U;
    public final h27 a;
    public final dv0 b;
    public final w86 c;
    public final g24 d;
    public final ij0 e;
    public final ij0 f;
    public final bq0 g;
    public final iv0 h;
    public vk2 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public h14 p;
    public boolean q;
    public boolean r;
    public j14 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final j33 n = new j33();
    public final ArrayList s = new ArrayList();
    public final j33 t = new j33();
    public sm4 u = sm4.R;
    public final j33 x = new j33();
    public int z = -1;

    public sk2(h27 h27Var, dv0 dv0Var, w86 w86Var, g24 g24Var, ij0 ij0Var, ij0 ij0Var2, bq0 bq0Var, iv0 iv0Var) {
        boolean z;
        this.a = h27Var;
        this.b = dv0Var;
        this.c = w86Var;
        this.d = g24Var;
        this.e = ij0Var;
        this.f = ij0Var2;
        this.g = bq0Var;
        this.h = iv0Var;
        if (!dv0Var.f() && !dv0Var.d()) {
            z = false;
        } else {
            z = true;
        }
        this.C = z;
        this.D = new rk2(0, this);
        this.E = new ArrayList();
        v86 d = w86Var.d();
        d.c();
        this.G = d;
        w86 w86Var2 = new w86();
        if (dv0Var.f()) {
            w86Var2.c();
        }
        if (dv0Var.d()) {
            w86Var2.f0 = new j14();
        }
        this.H = w86Var2;
        z86 i = w86Var2.i();
        i.e(true);
        this.I = i;
        this.M = new uu0(this, ij0Var);
        v86 d2 = this.H.d();
        try {
            mk2 a = d2.a(0);
            d2.c();
            this.N = a;
            this.O = new t82();
            this.Q = new gv0(this);
            e31 j = dv0Var.j();
            e31 z2 = z();
            this.R = j.C(z2 == null ? mp1.A : z2);
        } catch (Throwable th) {
            d2.c();
            throw th;
        }
    }

    public static final int N(sk2 sk2Var, int i, boolean z, int i2) {
        int i3;
        boolean z2;
        int i4;
        wk2 wk2Var;
        Object obj;
        long[] jArr;
        int i5;
        long[] jArr2;
        int i6;
        int i7;
        v86 v86Var;
        v86 v86Var2 = sk2Var.G;
        int i8 = 0;
        if (v86Var2.j(i)) {
            int i9 = v86Var2.i(i);
            Object p = v86Var2.p(v86Var2.b, i);
            if (i9 == 206 && b53.x(p, xu0.e)) {
                Object h = v86Var2.h(i, 0);
                pk2 pk2Var = null;
                if (h instanceof wk2) {
                    wk2Var = (wk2) h;
                } else {
                    wk2Var = null;
                }
                if (wk2Var != null) {
                    obj = wk2Var.a;
                } else {
                    obj = null;
                }
                if (obj instanceof pk2) {
                    pk2Var = (pk2) obj;
                }
                if (pk2Var != null) {
                    e24 e24Var = pk2Var.A.e;
                    Object[] objArr = e24Var.b;
                    long[] jArr3 = e24Var.a;
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
                                        sk2 sk2Var2 = (sk2) objArr[(i10 << 3) + i13];
                                        w86 w86Var = sk2Var2.c;
                                        if (w86Var.B > 0 && (w86Var.A[1] & 67108864) != 0) {
                                            iv0 iv0Var = sk2Var2.h;
                                            synchronized (iv0Var.R) {
                                                iv0Var.p();
                                                i7 = i11;
                                                d24 d24Var = iv0Var.i0;
                                                iv0Var.i0 = oo2.y();
                                                iv0Var.q0.e0(d24Var);
                                            }
                                            ij0 ij0Var = new ij0();
                                            sk2Var2.L = ij0Var;
                                            v86 d = sk2Var2.c.d();
                                            try {
                                                sk2Var2.G = d;
                                                uu0 uu0Var = sk2Var2.M;
                                                ij0 ij0Var2 = uu0Var.b;
                                                try {
                                                    uu0Var.b = ij0Var;
                                                    sk2Var2.M(0);
                                                    uu0 uu0Var2 = sk2Var2.M;
                                                    uu0Var2.b();
                                                    jArr2 = jArr3;
                                                    try {
                                                        if (uu0Var2.c) {
                                                            v86Var = d;
                                                            try {
                                                                uu0Var2.b.q0.h0(qe4.d);
                                                                if (uu0Var2.c) {
                                                                    uu0Var2.d(false);
                                                                    uu0Var2.d(false);
                                                                    uu0Var2.b.q0.h0(ae4.d);
                                                                    i6 = 0;
                                                                    uu0Var2.c = false;
                                                                    uu0Var.b = ij0Var2;
                                                                    v86Var.c();
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                uu0Var.b = ij0Var2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            v86Var = d;
                                                        }
                                                        uu0Var.b = ij0Var2;
                                                        v86Var.c();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        v86Var.c();
                                                        throw th;
                                                    }
                                                    i6 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    v86Var = d;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                v86Var = d;
                                            }
                                        } else {
                                            jArr2 = jArr3;
                                            i6 = i8;
                                            i7 = i11;
                                        }
                                        sk2Var.b.r(sk2Var2.h);
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
                return v86Var2.o(i);
            }
            i3 = 1;
            if (!v86Var2.l(i)) {
                return v86Var2.o(i);
            }
        } else {
            i3 = 1;
            if (v86Var2.d(i)) {
                int i14 = v86Var2.b[(i * 5) + 3] + i;
                int i15 = 0;
                for (int i16 = i + 1; i16 < i14; i16 += v86Var2.b[(i16 * 5) + 3]) {
                    boolean l = v86Var2.l(i16);
                    if (l) {
                        sk2Var.M.c();
                        uu0 uu0Var3 = sk2Var.M;
                        Object n = v86Var2.n(i16);
                        uu0Var3.c();
                        uu0Var3.h.add(n);
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
                    i15 += N(sk2Var, i16, z2, i4);
                    if (l) {
                        sk2Var.M.c();
                        sk2Var.M.a();
                    }
                }
                if (!v86Var2.l(i)) {
                    return i15;
                }
            } else if (!v86Var2.l(i)) {
                return v86Var2.o(i);
            }
        }
        return i3;
    }

    public final boolean A() {
        m55 x;
        if (!this.S && !this.y && !this.w && (x = x()) != null && (x.b & 8) == 0) {
            return true;
        }
        return false;
    }

    public final void B(ArrayList arrayList) {
        sk2 sk2Var = this;
        ij0 ij0Var = sk2Var.f;
        uu0 uu0Var = sk2Var.M;
        ij0 ij0Var2 = uu0Var.b;
        try {
            uu0Var.b = ij0Var;
            ij0Var.q0.h0(oe4.d);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                ti4 ti4Var = (ti4) arrayList.get(i);
                j04 j04Var = (j04) ti4Var.A;
                j04 j04Var2 = (j04) ti4Var.B;
                j04Var.getClass();
                mk2 p = nk2.p(null);
                w86 d = y86.d(null);
                int b = d.b(p);
                f33 f33Var = new f33();
                uu0Var.b();
                bf4 bf4Var = uu0Var.b.q0;
                bf4Var.h0(xd4.d);
                hi2.W(bf4Var, 0, f33Var, 1, p);
                if (d == sk2Var.H) {
                    if (!sk2Var.I.w) {
                        xu0.a("Check failed");
                    }
                    sk2Var.v();
                }
                v86 d2 = d.d();
                d2.r(b);
                uu0Var.f = b;
                ij0 ij0Var3 = new ij0();
                sk2Var.G(null, null, null, pp1.A, new t6(sk2Var, ij0Var3, d2, j04Var));
                ij0 ij0Var4 = uu0Var.b;
                ij0Var4.getClass();
                if (!ij0Var3.q0.g0()) {
                    bf4 bf4Var2 = ij0Var4.q0;
                    bf4Var2.h0(td4.d);
                    hi2.W(bf4Var2, 0, ij0Var3, 1, f33Var);
                }
                d2.c();
                uu0Var.b.q0.h0(qe4.d);
                i++;
                sk2Var = this;
            }
            uu0Var.b();
            uu0Var.b.q0.h0(be4.d);
            uu0Var.f = 0;
            uu0Var.b = ij0Var2;
        } catch (Throwable th) {
            uu0Var.b = ij0Var2;
            throw th;
        }
    }

    public final void C(sm4 sm4Var, Object obj) {
        boolean z;
        V(126665345, null);
        D();
        i0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                z86.z(this.I);
            }
            if (this.S || b53.x(this.G.f(), sm4Var)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                J(sm4Var);
            }
            S(202, 0, xu0.c, sm4Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            a53.J(this, new et0(-59194059, true, new z5(12, obj)));
            this.w = z2;
        } finally {
        }
    }

    public final Object D() {
        boolean z = this.S;
        sn1 sn1Var = su0.a;
        if (z) {
            if (this.r) {
                xu0.a("A call to createNode(), emitNode() or useNode() expected");
                return sn1Var;
            }
        } else {
            Object m = this.G.m();
            if (!this.y || (m instanceof qf5)) {
                return m;
            }
        }
        return sn1Var;
    }

    public final List E() {
        iv0 iv0Var;
        dv0 dv0Var = this.b;
        cv0 h = dv0Var.h();
        if (h != null) {
            iv0Var = (iv0) h;
        } else {
            iv0Var = null;
        }
        if (iv0Var != null) {
            w86 w86Var = iv0Var.Y;
            v86 d = y86.d(w86Var).d();
            try {
                Integer u = jv3.u(d, dv0Var, 0, d.c);
                if (u != null) {
                    d = y86.d(w86Var).d();
                    try {
                        ArrayList e0 = jv3.e0(d, u.intValue(), 0);
                        d.c();
                        return tq0.X0(e0, iv0Var.q0.E());
                    } finally {
                    }
                }
            } finally {
            }
        }
        return pp1.A;
    }

    public final int F(int i) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(defpackage.iv0 r9, defpackage.iv0 r10, java.lang.Integer r11, java.util.List r12, defpackage.ki2 r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            ti4 r6 = (defpackage.ti4) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.A     // Catch: java.lang.Throwable -> L24
            m55 r7 = (defpackage.m55) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.B     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.d0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L5e
        L26:
            r8.d0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L55
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L4f
            if (r10 == r9) goto L4f
            if (r11 < 0) goto L4f
            r9.m0 = r10     // Catch: java.lang.Throwable -> L24
            r9.n0 = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.c()     // Catch: java.lang.Throwable -> L49
            r9.m0 = r5     // Catch: java.lang.Throwable -> L24
            r9.n0 = r2     // Catch: java.lang.Throwable -> L24
            goto L53
        L49:
            r10 = move-exception
            r9.m0 = r5     // Catch: java.lang.Throwable -> L24
            r9.n0 = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L4f:
            java.lang.Object r10 = r13.c()     // Catch: java.lang.Throwable -> L24
        L53:
            if (r10 != 0) goto L59
        L55:
            java.lang.Object r10 = r13.c()     // Catch: java.lang.Throwable -> L24
        L59:
            r8.F = r0
            r8.k = r1
            return r10
        L5e:
            r8.F = r0
            r8.k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk2.G(iv0, iv0, java.lang.Integer, java.util.List, ki2):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H() {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk2.H():void");
    }

    public final void I() {
        int i;
        M(this.G.g);
        uu0 uu0Var = this.M;
        uu0Var.d(false);
        j33 j33Var = uu0Var.d;
        sk2 sk2Var = uu0Var.a;
        v86 v86Var = sk2Var.G;
        if (v86Var.c > 0 && j33Var.a(-2) != (i = v86Var.i)) {
            if (!uu0Var.c && uu0Var.e) {
                uu0Var.d(false);
                uu0Var.b.q0.h0(ee4.d);
                uu0Var.c = true;
            }
            if (i > 0) {
                mk2 a = v86Var.a(i);
                j33Var.c(i);
                uu0Var.d(false);
                bf4 bf4Var = uu0Var.b.q0;
                bf4Var.h0(de4.d);
                hi2.V(bf4Var, 0, a);
                uu0Var.c = true;
            }
        }
        uu0Var.b.q0.h0(me4.d);
        int i2 = uu0Var.f;
        v86 v86Var2 = sk2Var.G;
        uu0Var.f = v86Var2.b[(v86Var2.g * 5) + 3] + i2;
    }

    public final void J(sm4 sm4Var) {
        j14 j14Var = this.v;
        if (j14Var == null) {
            j14Var = new j14();
            this.v = j14Var;
        }
        j14Var.i(this.G.g, sm4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(int r7, int r8, int r9) {
        /*
            r6 = this;
            v86 r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            uu0 r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk2.K(int, int, int):void");
    }

    public final Object L() {
        boolean z = this.S;
        sn1 sn1Var = su0.a;
        if (z) {
            if (this.r) {
                xu0.a("A call to createNode(), emitNode() or useNode() expected");
                return sn1Var;
            }
        } else {
            Object m = this.G.m();
            if (!this.y || (m instanceof qf5)) {
                if (m instanceof wk2) {
                    return ((wk2) m).a;
                }
                return m;
            }
        }
        return sn1Var;
    }

    public final void M(int i) {
        boolean l = this.G.l(i);
        uu0 uu0Var = this.M;
        if (l) {
            uu0Var.c();
            Object n = this.G.n(i);
            uu0Var.c();
            uu0Var.h.add(n);
        }
        N(this, i, l, 0);
        uu0Var.c();
        if (l) {
            uu0Var.a();
        }
    }

    public final boolean O(int i, boolean z) {
        m55 x;
        int i2;
        if ((i & 1) == 0 && (this.S || this.y)) {
            x56 x56Var = this.P;
            if (x56Var != null && (x = x()) != null && x56Var.a()) {
                int i3 = x.b;
                if ((i3 & 512) != 0) {
                    return true;
                }
                int i4 = i3 | 1;
                x.b = i4;
                if (this.y) {
                    i2 = i3 | 129;
                } else {
                    i2 = i4 & (-129);
                }
                x.b = i2 | 256;
                bf4 bf4Var = this.M.b.q0;
                bf4Var.h0(le4.d);
                hi2.V(bf4Var, 0, x);
                this.b.q(x);
                return false;
            }
        } else if (!z && A()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk2.P():void");
    }

    public final void Q() {
        int i;
        v86 v86Var = this.G;
        int i2 = v86Var.i;
        if (i2 >= 0) {
            i = v86Var.b[(i2 * 5) + 1] & 67108863;
        } else {
            i = 0;
        }
        this.l = i;
        v86Var.t();
    }

    public final void R() {
        if (this.l != 0) {
            xu0.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (!this.S) {
            m55 x = x();
            if (x != null) {
                int i = x.b;
                if ((i & 128) == 0) {
                    x.b = i | 16;
                }
            }
            if (this.s.isEmpty()) {
                Q();
            } else {
                H();
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(int r27, int r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk2.S(int, int, java.lang.Object, java.lang.Object):void");
    }

    public final void T() {
        S(-127, 0, null, null);
    }

    public final void U(int i, jd4 jd4Var) {
        S(i, 0, jd4Var, null);
    }

    public final void V(int i, Object obj) {
        S(i, 0, obj, null);
    }

    public final void W(boolean z, Object obj) {
        if (z) {
            v86 v86Var = this.G;
            if (v86Var.k <= 0) {
                if ((v86Var.b[(v86Var.g * 5) + 1] & 1073741824) == 0) {
                    or4.a("Expected a node group");
                }
                v86Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            uu0 uu0Var = this.M;
            uu0Var.getClass();
            uu0Var.d(false);
            bf4 bf4Var = uu0Var.b.q0;
            bf4Var.h0(ve4.d);
            hi2.V(bf4Var, 0, obj);
        }
        this.G.u();
    }

    public final void X(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            S(i, 0, null, null);
            return;
        }
        if (this.r) {
            xu0.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.m;
        this.m++;
        v86 v86Var = this.G;
        boolean z = this.S;
        sn1 sn1Var = su0.a;
        if (z) {
            v86Var.k++;
            this.I.Q(i, sn1Var, sn1Var, false);
            u(false, null);
        } else if (v86Var.g() == i && ((i3 = v86Var.g) >= v86Var.h || (v86Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            v86Var.u();
            u(false, null);
        } else {
            if (v86Var.k <= 0 && (i2 = v86Var.g) != v86Var.h) {
                int i4 = this.k;
                I();
                this.M.e(i4, v86Var.s());
                f34.r(i2, v86Var.g, this.s);
            }
            v86Var.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                z86 i5 = this.H.i();
                this.I = i5;
                i5.M();
                this.J = false;
                this.K = null;
            }
            z86 z86Var = this.I;
            z86Var.d();
            int i6 = z86Var.t;
            z86Var.Q(i, sn1Var, sn1Var, false);
            this.N = z86Var.b(i6);
            u(false, null);
        }
    }

    public final void Y(int i) {
        S(i, 0, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.sk2 Z(int r7) {
        /*
            r6 = this;
            r6.X(r7)
            boolean r7 = r6.S
            bq0 r0 = r6.g
            java.util.ArrayList r1 = r6.E
            iv0 r2 = r6.h
            if (r7 == 0) goto L26
            m55 r7 = new m55
            r7.<init>(r2)
            r1.add(r7)
            r6.i0(r7)
            int r1 = r6.B
            r7.e = r1
            int r1 = r7.b
            r1 = r1 & (-17)
            r7.b = r1
            r0.R()
            return r6
        L26:
            v86 r7 = r6.G
            int r7 = r7.i
            java.util.ArrayList r3 = r6.s
            int r7 = defpackage.f34.A(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            k53 r7 = (defpackage.k53) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            v86 r3 = r6.G
            java.lang.Object r3 = r3.m()
            sn1 r4 = defpackage.su0.a
            boolean r4 = defpackage.b53.x(r3, r4)
            if (r4 == 0) goto L51
            m55 r3 = new m55
            r3.<init>(r2)
            r6.i0(r3)
            goto L56
        L51:
            r3.getClass()
            m55 r3 = (defpackage.m55) r3
        L56:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L6e
            int r7 = r3.b
            r5 = r7 & 64
            if (r5 == 0) goto L62
            r5 = r4
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L69
            r7 = r7 & (-65)
            r3.b = r7
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r7 = r2
            goto L6f
        L6e:
            r7 = r4
        L6f:
            int r5 = r3.b
            if (r7 == 0) goto L76
            r7 = r5 | 8
            goto L78
        L76:
            r7 = r5 & (-9)
        L78:
            r3.b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.e = r7
            int r7 = r3.b
            r7 = r7 & (-17)
            r3.b = r7
            r0.R()
            int r7 = r3.b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lba
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.b = r7
            uu0 r7 = r6.M
            ij0 r7 = r7.b
            bf4 r7 = r7.q0
            re4 r0 = defpackage.re4.d
            r7.h0(r0)
            defpackage.hi2.V(r7, r2, r3)
            boolean r7 = r6.y
            if (r7 != 0) goto Lba
            int r7 = r3.b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lba
            r6.y = r4
            v86 r0 = r6.G
            int r0 = r0.i
            r6.z = r0
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.b = r7
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk2.Z(int):sk2");
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        t82 t82Var = this.O;
        t82Var.d0.e0();
        t82Var.c0.e0();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        v86 v86Var = this.G;
        if (!v86Var.f) {
            v86Var.c();
        }
        if (!this.I.w) {
            v();
        }
    }

    public final void a0(Object obj) {
        if (!this.S && this.G.g() == 207 && !b53.x(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        S(207, 0, null, obj);
    }

    public final void b(aj2 aj2Var, Object obj) {
        if (this.S) {
            bf4 bf4Var = this.O.c0;
            bf4Var.h0(we4.d);
            hi2.V(bf4Var, 0, obj);
            aj2Var.getClass();
            l07.q(2, aj2Var);
            hi2.V(bf4Var, 1, aj2Var);
            return;
        }
        uu0 uu0Var = this.M;
        uu0Var.b();
        bf4 bf4Var2 = uu0Var.b.q0;
        bf4Var2.h0(we4.d);
        aj2Var.getClass();
        l07.q(2, aj2Var);
        hi2.W(bf4Var2, 0, obj, 1, aj2Var);
    }

    public final void b0() {
        S(125, 2, null, null);
        this.r = true;
    }

    public final boolean c(float f) {
        Object D = D();
        if ((D instanceof Float) && f == ((Number) D).floatValue()) {
            return false;
        }
        i0(Float.valueOf(f));
        return true;
    }

    public final void c0() {
        this.m = 0;
        this.G = this.c.d();
        S(100, 0, null, null);
        dv0 dv0Var = this.b;
        dv0Var.t();
        sm4 i = dv0Var.i();
        this.x.c(this.w ? 1 : 0);
        this.w = f(i);
        this.K = null;
        if (!this.q) {
            this.q = dv0Var.e();
        }
        if (!this.C) {
            this.C = dv0Var.f();
        }
        if (this.C) {
            ye6 ye6Var = hv0.a;
            ye6Var.getClass();
            i = i.d(ye6Var, new ze6(z()));
        }
        this.u = i;
        Set set = (Set) l.L(i, k23.a);
        if (set != null) {
            set.add(w());
            dv0Var.o(set);
        }
        S(Long.hashCode(dv0Var.g()), 0, null, null);
    }

    public final boolean d(int i) {
        Object D = D();
        if ((D instanceof Integer) && i == ((Number) D).intValue()) {
            return false;
        }
        i0(Integer.valueOf(i));
        return true;
    }

    public final boolean d0(m55 m55Var, Object obj) {
        mk2 mk2Var = m55Var.c;
        if (mk2Var != null) {
            int b = this.G.a.b(nk2.p(mk2Var));
            if (this.F && b >= this.G.g) {
                ArrayList arrayList = this.s;
                int A = f34.A(b, arrayList);
                if (A < 0) {
                    int i = -(A + 1);
                    if (!(obj instanceof ee1)) {
                        obj = null;
                    }
                    arrayList.add(i, new k53(m55Var, b, obj));
                    return true;
                }
                k53 k53Var = (k53) arrayList.get(A);
                if (obj instanceof ee1) {
                    Object obj2 = k53Var.c;
                    if (obj2 == null) {
                        k53Var.c = obj;
                        return true;
                    } else if (obj2 instanceof e24) {
                        ((e24) obj2).a(obj);
                        return true;
                    } else {
                        e24 e24Var = xu5.a;
                        e24 e24Var2 = new e24(2);
                        e24Var2.k(obj2);
                        e24Var2.k(obj);
                        k53Var.c = e24Var2;
                        return true;
                    }
                }
                k53Var.c = null;
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean e(long j) {
        Object D = D();
        if ((D instanceof Long) && j == ((Number) D).longValue()) {
            return false;
        }
        i0(Long.valueOf(j));
        return true;
    }

    public final void e0(d24 d24Var) {
        mk2 mk2Var;
        ArrayList arrayList = this.s;
        for (int P = l07.P(arrayList); -1 < P; P--) {
            k53 k53Var = (k53) arrayList.get(P);
            mk2 mk2Var2 = k53Var.a.c;
            if (mk2Var2 != null) {
                mk2Var = nk2.p(mk2Var2);
            } else {
                mk2Var = null;
            }
            if (mk2Var != null && mk2Var.a()) {
                int i = k53Var.b;
                int i2 = mk2Var.a;
                if (i != i2) {
                    k53Var.b = i2;
                }
            } else {
                arrayList.remove(P);
            }
        }
        Object[] objArr = d24Var.b;
        Object[] objArr2 = d24Var.c;
        long[] jArr = d24Var.a;
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
                            m55 m55Var = (m55) obj;
                            mk2 mk2Var3 = m55Var.c;
                            if (mk2Var3 != null) {
                                int i7 = nk2.p(mk2Var3).a;
                                if (obj2 == y60.z0) {
                                    obj2 = null;
                                }
                                arrayList.add(new k53(m55Var, i7, obj2));
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
        wq0.A0(arrayList, f34.i);
    }

    public final boolean f(Object obj) {
        if (!b53.x(D(), obj)) {
            i0(obj);
            return true;
        }
        return false;
    }

    public final void f0(int i, int i2) {
        if (j0(i) != i2) {
            if (i < 0) {
                h14 h14Var = this.p;
                if (h14Var == null) {
                    h14Var = new h14();
                    this.p = h14Var;
                }
                h14Var.f(i, i2);
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

    public final boolean g(boolean z) {
        Object D = D();
        if ((D instanceof Boolean) && z == ((Boolean) D).booleanValue()) {
            return false;
        }
        i0(Boolean.valueOf(z));
        return true;
    }

    public final void g0(int i, int i2) {
        int j0 = j0(i);
        if (j0 != i2) {
            int i3 = i2 - j0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int j02 = j0(i) + i3;
                f0(i, j02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        vk2 vk2Var = (vk2) arrayList.get(i4);
                        if (vk2Var != null && vk2Var.a(i, j02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                v86 v86Var = this.G;
                if (i < 0) {
                    i = v86Var.i;
                } else if (!v86Var.l(i)) {
                    i = this.G.q(i);
                } else {
                    return;
                }
            }
        }
    }

    public final boolean h(Object obj) {
        if (D() != obj) {
            i0(obj);
            return true;
        }
        return false;
    }

    public final void h0(Object obj) {
        if (obj instanceof l95) {
            wk2 wk2Var = new wk2((l95) obj, this.m - 1);
            if (this.S) {
                bf4 bf4Var = this.M.b.q0;
                bf4Var.h0(ke4.d);
                hi2.V(bf4Var, 0, wk2Var);
            }
            this.d.add(obj);
            obj = wk2Var;
        }
        i0(obj);
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        uu0 uu0Var = this.M;
        uu0Var.c = false;
        uu0Var.d.b = 0;
        uu0Var.f = 0;
        uu0Var.e = true;
        uu0Var.g = 0;
        uu0Var.h.clear();
        uu0Var.i = -1;
        uu0Var.j = -1;
        uu0Var.k = -1;
        uu0Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0(Object obj) {
        if (this.S) {
            z86 z86Var = this.I;
            if (z86Var.n > 0 && z86Var.i != z86Var.k) {
                j14 j14Var = z86Var.s;
                if (j14Var == null) {
                    j14Var = new j14();
                }
                z86Var.s = j14Var;
                int i = z86Var.v;
                Object b = j14Var.b(i);
                if (b == null) {
                    b = new w14();
                    j14Var.i(i, b);
                }
                ((w14) b).a(obj);
                return;
            }
            z86Var.F(obj);
            return;
        }
        v86 v86Var = this.G;
        boolean z = v86Var.n;
        uu0 uu0Var = this.M;
        if (z) {
            int b2 = (v86Var.l - y86.b(v86Var.b, v86Var.i)) - 1;
            if (uu0Var.a.G.i - uu0Var.f < 0) {
                v86 v86Var2 = this.G;
                mk2 a = v86Var2.a(v86Var2.i);
                bf4 bf4Var = uu0Var.b.q0;
                bf4Var.h0(fe4.g);
                hi2.W(bf4Var, 0, obj, 1, a);
                bf4Var.e0[bf4Var.f0 - bf4Var.c0[bf4Var.d0 - 1].b] = b2;
                return;
            }
            uu0Var.d(true);
            bf4 bf4Var2 = uu0Var.b.q0;
            bf4Var2.h0(fe4.h);
            hi2.V(bf4Var2, 0, obj);
            bf4Var2.e0[bf4Var2.f0 - bf4Var2.c0[bf4Var2.d0 - 1].b] = b2;
            return;
        }
        mk2 a2 = v86Var.a(v86Var.i);
        bf4 bf4Var3 = uu0Var.b.q0;
        bf4Var3.h0(sd4.d);
        hi2.W(bf4Var3, 0, a2, 1, obj);
    }

    public final Object j(ew4 ew4Var) {
        return l.L(l(), ew4Var);
    }

    public final int j0(int i) {
        int i2;
        if (i < 0) {
            h14 h14Var = this.p;
            if (h14Var != null && h14Var.c(i) >= 0) {
                int c = h14Var.c(i);
                if (c >= 0) {
                    return h14Var.c[c];
                }
                vd6.e(wh1.g(i, "Cannot find value for key "));
            }
            return 0;
        }
        int[] iArr = this.o;
        if (iArr != null && (i2 = iArr[i]) >= 0) {
            return i2;
        }
        return this.G.o(i);
    }

    public final void k(ki2 ki2Var) {
        if (!this.r) {
            xu0.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            xu0.a("createNode() can only be called when inserting");
        }
        j33 j33Var = this.n;
        int i = j33Var.a[j33Var.b - 1];
        z86 z86Var = this.I;
        mk2 b = z86Var.b(z86Var.v);
        this.l++;
        t82 t82Var = this.O;
        bf4 bf4Var = t82Var.c0;
        bf4Var.h0(fe4.e);
        hi2.V(bf4Var, 0, ki2Var);
        bf4Var.e0[bf4Var.f0 - bf4Var.c0[bf4Var.d0 - 1].b] = i;
        hi2.V(bf4Var, 1, b);
        bf4 bf4Var2 = t82Var.d0;
        bf4Var2.h0(fe4.f);
        bf4Var2.e0[bf4Var2.f0 - bf4Var2.c0[bf4Var2.d0 - 1].b] = i;
        hi2.V(bf4Var2, 0, b);
    }

    public final void k0() {
        if (!this.r) {
            xu0.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            xu0.a("useNode() called while inserting");
        }
        v86 v86Var = this.G;
        Object n = v86Var.n(v86Var.i);
        uu0 uu0Var = this.M;
        uu0Var.c();
        uu0Var.h.add(n);
        if (this.y && (n instanceof au0)) {
            uu0Var.b();
            uu0Var.b.q0.h0(ye4.d);
        }
    }

    public final sm4 l() {
        sm4 sm4Var;
        sm4 sm4Var2 = this.K;
        if (sm4Var2 != null) {
            return sm4Var2;
        }
        int i = this.G.i;
        boolean z = this.S;
        jd4 jd4Var = xu0.c;
        if (z && this.J) {
            int i2 = this.I.v;
            while (i2 > 0) {
                if (this.I.s(i2) == 202 && b53.x(this.I.t(i2), jd4Var)) {
                    Object q = this.I.q(i2);
                    q.getClass();
                    sm4 sm4Var3 = (sm4) q;
                    this.K = sm4Var3;
                    return sm4Var3;
                }
                z86 z86Var = this.I;
                i2 = z86Var.E(z86Var.b, i2);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    v86 v86Var = this.G;
                    if (b53.x(v86Var.p(v86Var.b, i), jd4Var)) {
                        j14 j14Var = this.v;
                        if (j14Var == null || (sm4Var = (sm4) j14Var.b(i)) == null) {
                            v86 v86Var2 = this.G;
                            Object b = v86Var2.b(v86Var2.b, i);
                            b.getClass();
                            sm4Var = (sm4) b;
                        }
                        this.K = sm4Var;
                        return sm4Var;
                    }
                }
                i = this.G.q(i);
            }
        }
        sm4 sm4Var4 = this.u;
        this.K = sm4Var4;
        return sm4Var4;
    }

    public final ju0 m() {
        Collection collection;
        Object obj;
        if (!this.b.k()) {
            return null;
        }
        ip3 C = l07.C();
        z86 z86Var = this.I;
        C.addAll(jv3.l(z86Var, null, z86Var.t, null));
        v86 v86Var = this.G;
        boolean z = v86Var.f;
        int[] iArr = v86Var.b;
        if (!z && v86Var.c != 0) {
            n45 n45Var = new n45(v86Var);
            int i = v86Var.i;
            Object valueOf = Integer.valueOf(v86Var.l - y86.b(iArr, i));
            while (i >= 0) {
                if (v86Var.k(i)) {
                    obj = v86Var.p(iArr, i);
                } else {
                    obj = su0.a;
                }
                n45Var.i(v86Var.i(i), obj, v86Var.a.k(i), valueOf);
                valueOf = v86Var.a(i);
                i = v86Var.q(i);
            }
            collection = (ArrayList) n45Var.a;
        } else {
            collection = pp1.A;
        }
        C.addAll(collection);
        C.addAll(E());
        return new ju0(l07.t(C), this.C);
    }

    public final void n(d24 d24Var, aj2 aj2Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            xu0.a("Reentrant composition is not supported");
        }
        this.g.R();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(ma6.j().g());
            this.v = null;
            e0(d24Var);
            this.k = 0;
            this.F = true;
            c0();
            Object D = D();
            if (D != aj2Var && aj2Var != null) {
                i0(aj2Var);
            }
            rk2 rk2Var = this.D;
            o24 p = me2.p();
            p.b(rk2Var);
            jd4 jd4Var = xu0.a;
            if (aj2Var != null) {
                U(200, jd4Var);
                a53.J(this, aj2Var);
                p(false);
            } else if (this.w && D != null && !D.equals(su0.a)) {
                U(200, jd4Var);
                l07.q(2, D);
                a53.J(this, (aj2) D);
                p(false);
            } else {
                P();
            }
            p.l(p.L - 1);
            t();
            this.F = false;
            arrayList.clear();
            if (!this.I.w) {
                xu0.a("Check failed");
            }
            v();
        } finally {
            Trace.endSection();
        }
    }

    public final void o(int i, int i2) {
        if (i > 0 && i != i2) {
            o(this.G.q(i), i2);
            if (this.G.l(i)) {
                Object n = this.G.n(i);
                uu0 uu0Var = this.M;
                uu0Var.c();
                uu0Var.h.add(n);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05ae  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r43) {
        /*
            Method dump skipped, instructions count: 1604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk2.p(boolean):void");
    }

    public final void q() {
        p(false);
        m55 x = x();
        if (x != null) {
            int i = x.b;
            if ((i & 1) != 0) {
                x.b = i | 2;
            }
        }
    }

    public final m55 r() {
        m55 m55Var;
        m55 m55Var2;
        mk2 a;
        lq1 lq1Var;
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty()) {
            m55Var = (m55) arrayList.remove(arrayList.size() - 1);
        } else {
            m55Var = null;
        }
        if (m55Var != null) {
            m55Var.b &= -9;
            this.g.R();
            int i = this.B;
            s14 s14Var = m55Var.f;
            if (s14Var != null && (m55Var.b & 16) == 0) {
                Object[] objArr = s14Var.b;
                int[] iArr = s14Var.c;
                long[] jArr = s14Var.a;
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
                                        lq1Var = new lq1(i, 2, m55Var, s14Var);
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
            lq1Var = null;
            uu0 uu0Var = this.M;
            if (lq1Var != null) {
                bf4 bf4Var = uu0Var.b.q0;
                bf4Var.h0(zd4.d);
                hi2.W(bf4Var, 0, lq1Var, 1, this.h);
            }
            int i6 = m55Var.b;
            if ((i6 & 512) != 0) {
                m55Var.b = i6 & (-513);
                bf4 bf4Var2 = uu0Var.b.q0;
                bf4Var2.h0(ce4.d);
                hi2.V(bf4Var2, 0, m55Var);
                int i7 = m55Var.b;
                m55Var.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    m55Var.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (m55Var != null) {
            int i8 = m55Var.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (m55Var.c == null) {
                    if (this.S) {
                        z86 z86Var = this.I;
                        a = z86Var.b(z86Var.v);
                    } else {
                        v86 v86Var = this.G;
                        a = v86Var.a(v86Var.i);
                    }
                    m55Var.c = a;
                }
                m55Var.b &= -5;
                m55Var2 = m55Var;
                p(false);
                return m55Var2;
            }
        }
        m55Var2 = null;
        p(false);
        return m55Var2;
    }

    public final void s() {
        if (this.F || this.z != 0) {
            or4.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void t() {
        boolean z = false;
        p(false);
        this.b.c();
        p(false);
        uu0 uu0Var = this.M;
        if (uu0Var.c) {
            uu0Var.d(false);
            uu0Var.d(false);
            uu0Var.b.q0.h0(ae4.d);
            uu0Var.c = false;
        }
        uu0Var.b();
        if (uu0Var.d.b != 0) {
            xu0.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            xu0.a("Start/end imbalance");
        }
        i();
        this.G.c();
        if (this.x.b() != 0) {
            z = true;
        }
        this.w = z;
    }

    public final void u(boolean z, vk2 vk2Var) {
        this.i.add(this.j);
        this.j = vk2Var;
        int i = this.l;
        j33 j33Var = this.n;
        j33Var.c(i);
        j33Var.c(this.m);
        j33Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void v() {
        w86 w86Var = new w86();
        if (this.C) {
            w86Var.c();
        }
        if (this.b.d()) {
            w86Var.f0 = new j14();
        }
        this.H = w86Var;
        z86 i = w86Var.i();
        i.e(true);
        this.I = i;
    }

    public final fv0 w() {
        tk2 tk2Var = this.U;
        if (tk2Var == null) {
            tk2 tk2Var2 = new tk2(this.h);
            this.U = tk2Var2;
            return tk2Var2;
        }
        return tk2Var;
    }

    public final m55 x() {
        if (this.A == 0) {
            ArrayList arrayList = this.E;
            if (!arrayList.isEmpty()) {
                return (m55) arrayList.get(arrayList.size() - 1);
            }
            return null;
        }
        return null;
    }

    public final boolean y() {
        if (A() && !this.w) {
            m55 x = x();
            if (x == null || (x.b & 4) == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final gv0 z() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }
}
