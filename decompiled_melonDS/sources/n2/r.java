package n2;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r implements m {
    public int A;
    public int B;
    public boolean C;
    public final q D;
    public final ArrayList E;
    public boolean F;
    public d2 G;
    public e2 H;
    public h2 I;
    public boolean J;
    public v2.g K;
    public o2.a L;
    public final o2.b M;
    public a N;
    public o2.c O;
    public c2 P;
    public final a3.f Q;
    public final cc.g R;
    public boolean S;
    public long T;
    public x U;

    /* renamed from: a  reason: collision with root package name */
    public final a4.r2 f9994a;

    /* renamed from: b  reason: collision with root package name */
    public final v f9995b;

    /* renamed from: c  reason: collision with root package name */
    public final e2 f9996c;

    /* renamed from: d  reason: collision with root package name */
    public final a1.p0 f9997d;

    /* renamed from: e  reason: collision with root package name */
    public final o2.a f9998e;

    /* renamed from: f  reason: collision with root package name */
    public final o2.a f9999f;

    /* renamed from: g  reason: collision with root package name */
    public final l.i0 f10000g;

    /* renamed from: h  reason: collision with root package name */
    public final y f10001h;

    /* renamed from: j  reason: collision with root package name */
    public k1 f10003j;

    /* renamed from: k  reason: collision with root package name */
    public int f10004k;

    /* renamed from: l  reason: collision with root package name */
    public int f10005l;
    public int m;

    /* renamed from: o  reason: collision with root package name */
    public int[] f10007o;

    /* renamed from: p  reason: collision with root package name */
    public a1.v f10008p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10009q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f10010r;

    /* renamed from: v  reason: collision with root package name */
    public a1.x f10014v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10015w;

    /* renamed from: y  reason: collision with root package name */
    public boolean f10017y;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f10002i = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public final a4.w f10006n = new a4.w();

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f10011s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    public final a4.w f10012t = new a4.w();

    /* renamed from: u  reason: collision with root package name */
    public v2.g f10013u = v2.g.R;

    /* renamed from: x  reason: collision with root package name */
    public final a4.w f10016x = new a4.w();

    /* renamed from: z  reason: collision with root package name */
    public int f10018z = -1;

    public r(a4.r2 r2Var, v vVar, e2 e2Var, a1.p0 p0Var, o2.a aVar, o2.a aVar2, l.i0 i0Var, y yVar) {
        boolean z10;
        this.f9994a = r2Var;
        this.f9995b = vVar;
        this.f9996c = e2Var;
        this.f9997d = p0Var;
        this.f9998e = aVar;
        this.f9999f = aVar2;
        this.f10000g = i0Var;
        this.f10001h = yVar;
        if (!vVar.f() && !vVar.d()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.C = z10;
        this.D = new q(0, this);
        this.E = new ArrayList();
        d2 c4 = e2Var.c();
        c4.c();
        this.G = c4;
        e2 e2Var2 = new e2();
        if (vVar.f()) {
            e2Var2.b();
        }
        if (vVar.d()) {
            e2Var2.f9902e0 = new a1.x();
        }
        this.H = e2Var2;
        h2 d4 = e2Var2.d();
        d4.e(true);
        this.I = d4;
        this.M = new o2.b(this, aVar);
        d2 c10 = this.H.c();
        try {
            a a10 = c10.a(0);
            c10.c();
            this.N = a10;
            this.O = new o2.c();
            this.Q = new a3.f(this);
            cc.g j2 = vVar.j();
            cc.g z11 = z();
            this.R = j2.H(z11 == null ? cc.h.A : z11);
        } catch (Throwable th2) {
            c10.c();
            throw th2;
        }
    }

    public static final int N(r rVar, int i2, boolean z10, int i10) {
        boolean z11;
        int i11;
        y1 y1Var;
        Object obj;
        d2 d2Var = rVar.G;
        if (d2Var.j(i2)) {
            int i12 = d2Var.i(i2);
            Object p10 = d2Var.p(d2Var.f9887b, i2);
            if (i12 == 206 && nc.k.a(p10, t.f10029e)) {
                Object h2 = d2Var.h(i2, 0);
                o oVar = null;
                if (h2 instanceof y1) {
                    y1Var = (y1) h2;
                } else {
                    y1Var = null;
                }
                if (y1Var != null) {
                    obj = y1Var.f10083a;
                } else {
                    obj = null;
                }
                if (obj instanceof o) {
                    oVar = (o) obj;
                }
                if (oVar != null) {
                    for (r rVar2 : oVar.A.f9975e) {
                        e2 e2Var = rVar2.f9996c;
                        if (e2Var.B > 0 && (e2Var.A[1] & 67108864) != 0) {
                            y yVar = rVar2.f10001h;
                            synchronized (yVar.R) {
                                yVar.p();
                                a1.m0 m0Var = yVar.f10073h0;
                                yVar.f10073h0 = k0.d.q();
                                yVar.p0.e0(m0Var);
                            }
                            o2.a aVar = new o2.a();
                            rVar2.L = aVar;
                            d2 c4 = rVar2.f9996c.c();
                            try {
                                rVar2.G = c4;
                                o2.b bVar = rVar2.M;
                                o2.a aVar2 = bVar.f10615b;
                                bVar.f10615b = aVar;
                                rVar2.M(0);
                                o2.b bVar2 = rVar2.M;
                                bVar2.b();
                                if (bVar2.f10616c) {
                                    bVar2.f10615b.f10612d.V(o2.c0.f10629d);
                                    if (bVar2.f10616c) {
                                        bVar2.d(false);
                                        bVar2.d(false);
                                        bVar2.f10615b.f10612d.V(o2.m.f10651d);
                                        bVar2.f10616c = false;
                                    }
                                }
                                bVar.f10615b = aVar2;
                            } finally {
                                c4.c();
                            }
                        }
                        rVar.f9995b.r(rVar2.f10001h);
                    }
                }
                return d2Var.o(i2);
            } else if (!d2Var.l(i2)) {
                return d2Var.o(i2);
            }
        } else if (d2Var.d(i2)) {
            int i13 = d2Var.f9887b[(i2 * 5) + 3] + i2;
            int i14 = 0;
            for (int i15 = i2 + 1; i15 < i13; i15 += d2Var.f9887b[(i15 * 5) + 3]) {
                boolean l10 = d2Var.l(i15);
                if (l10) {
                    rVar.M.c();
                    o2.b bVar3 = rVar.M;
                    Object n10 = d2Var.n(i15);
                    bVar3.c();
                    bVar3.f10621h.add(n10);
                }
                if (!l10 && !z10) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (l10) {
                    i11 = 0;
                } else {
                    i11 = i10 + i14;
                }
                i14 += N(rVar, i15, z11, i11);
                if (l10) {
                    rVar.M.c();
                    rVar.M.a();
                }
            }
            if (!d2Var.l(i2)) {
                return i14;
            }
        } else if (!d2Var.l(i2)) {
            return d2Var.o(i2);
        }
        return 1;
    }

    public final boolean A() {
        p1 x9;
        if (!this.S && !this.f10017y && !this.f10015w && (x9 = x()) != null && (x9.f9981b & 8) == 0) {
            return true;
        }
        return false;
    }

    public final void B(ArrayList arrayList) {
        o2.a aVar = this.f9999f;
        o2.b bVar = this.M;
        o2.a aVar2 = bVar.f10615b;
        try {
            bVar.f10615b = aVar;
            aVar.f10612d.V(o2.a0.f10613d);
            if (arrayList.size() <= 0) {
                bVar.b();
                bVar.f10615b.f10612d.V(o2.n.f10652d);
                bVar.f10619f = 0;
                return;
            }
            yb.j jVar = (yb.j) arrayList.get(0);
            v0 v0Var = (v0) jVar.B;
            ((v0) jVar.A).getClass();
            throw null;
        } finally {
            bVar.f10615b = aVar2;
        }
    }

    public final void C(v2.g gVar, Object obj) {
        boolean z10;
        V(126665345, null);
        D();
        i0(obj);
        long j2 = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                h2.z(this.I);
            }
            if (this.S || nc.k.a(this.G.f(), gVar)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                J(gVar);
            }
            S(t.f10027c, 202, gVar, 0);
            this.K = null;
            this.f10015w = z10;
            throw null;
        } finally {
        }
    }

    public final Object D() {
        boolean z10 = this.S;
        e eVar = l.f9953a;
        if (z10) {
            if (this.f10010r) {
                t.a("A call to createNode(), emitNode() or useNode() expected");
                return eVar;
            }
        } else {
            Object m = this.G.m();
            if (!this.f10017y || (m instanceof b2)) {
                return m;
            }
        }
        return eVar;
    }

    public final List E() {
        y yVar;
        v vVar = this.f9995b;
        u h2 = vVar.h();
        if (h2 != null) {
            yVar = (y) h2;
        } else {
            yVar = null;
        }
        if (yVar != null) {
            e2 e2Var = yVar.Y;
            d2 c4 = e2Var.c();
            try {
                Integer u4 = aj.g.u(c4, vVar, 0, c4.f9888c);
                if (u4 != null) {
                    c4 = e2Var.c();
                    try {
                        ArrayList t02 = aj.g.t0(c4, u4.intValue(), 0);
                        c4.c();
                        return zb.l.e0(t02, yVar.p0.E());
                    } finally {
                    }
                }
            } finally {
            }
        }
        return zb.q.A;
    }

    public final int F(int i2) {
        int q10 = this.G.q(i2) + 1;
        int i10 = 0;
        while (q10 < i2) {
            if (!this.G.k(q10)) {
                i10++;
            }
            q10 += this.G.f9887b[(q10 * 5) + 3];
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
        if (r10 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(n2.y r9, n2.y r10, java.lang.Integer r11, java.util.List r12, mc.a r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.f10004k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.f10004k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            yb.j r6 = (yb.j) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.A     // Catch: java.lang.Throwable -> L24
            n2.p1 r7 = (n2.p1) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.B     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.d0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L62
        L26:
            r8.d0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L59
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L53
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L53
            if (r11 < 0) goto L53
            r9.f10077l0 = r10     // Catch: java.lang.Throwable -> L24
            r9.f10078m0 = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.b()     // Catch: java.lang.Throwable -> L4d
            r9.f10077l0 = r5     // Catch: java.lang.Throwable -> L24
            r9.f10078m0 = r2     // Catch: java.lang.Throwable -> L24
            goto L57
        L4d:
            r10 = move-exception
            r9.f10077l0 = r5     // Catch: java.lang.Throwable -> L24
            r9.f10078m0 = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L53:
            java.lang.Object r10 = r13.b()     // Catch: java.lang.Throwable -> L24
        L57:
            if (r10 != 0) goto L5d
        L59:
            java.lang.Object r10 = r13.b()     // Catch: java.lang.Throwable -> L24
        L5d:
            r8.F = r0
            r8.f10004k = r1
            return r10
        L62:
            r8.F = r0
            r8.f10004k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.r.G(n2.y, n2.y, java.lang.Integer, java.util.List, mc.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (r4.f9959b < r6) goto L8;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H() {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.r.H():void");
    }

    public final void I() {
        int i2;
        M(this.G.f9892g);
        o2.b bVar = this.M;
        bVar.d(false);
        a4.w wVar = bVar.f10617d;
        r rVar = bVar.f10614a;
        d2 d2Var = rVar.G;
        if (d2Var.f9888c > 0 && wVar.a(-2) != (i2 = d2Var.f9894i)) {
            if (!bVar.f10616c && bVar.f10618e) {
                bVar.d(false);
                bVar.f10615b.f10612d.V(o2.q.f10655d);
                bVar.f10616c = true;
            }
            if (i2 > 0) {
                a a10 = d2Var.a(i2);
                wVar.c(i2);
                bVar.d(false);
                o2.k0 k0Var = bVar.f10615b.f10612d;
                k0Var.V(o2.p.f10654d);
                l0.f.C(k0Var, 0, a10);
                bVar.f10616c = true;
            }
        }
        bVar.f10615b.f10612d.V(o2.y.f10667d);
        int i10 = bVar.f10619f;
        d2 d2Var2 = rVar.G;
        bVar.f10619f = d2Var2.f9887b[(d2Var2.f9892g * 5) + 3] + i10;
    }

    public final void J(v2.g gVar) {
        a1.x xVar = this.f10014v;
        if (xVar == null) {
            xVar = new a1.x();
            this.f10014v = xVar;
        }
        xVar.i(this.G.f9892g, gVar);
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
            n2.d2 r0 = r6.G
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
            o2.b r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.r.K(int, int, int):void");
    }

    public final Object L() {
        boolean z10 = this.S;
        e eVar = l.f9953a;
        if (z10) {
            if (this.f10010r) {
                t.a("A call to createNode(), emitNode() or useNode() expected");
                return eVar;
            }
        } else {
            Object m = this.G.m();
            if (!this.f10017y || (m instanceof b2)) {
                if (m instanceof y1) {
                    return ((y1) m).f10083a;
                }
                return m;
            }
        }
        return eVar;
    }

    public final void M(int i2) {
        boolean l10 = this.G.l(i2);
        o2.b bVar = this.M;
        if (l10) {
            bVar.c();
            Object n10 = this.G.n(i2);
            bVar.c();
            bVar.f10621h.add(n10);
        }
        N(this, i2, l10, 0);
        bVar.c();
        if (l10) {
            bVar.a();
        }
    }

    public final boolean O(int i2, boolean z10) {
        p1 x9;
        int i10;
        if ((i2 & 1) == 0 && (this.S || this.f10017y)) {
            c2 c2Var = this.P;
            if (c2Var != null && (x9 = x()) != null && c2Var.b()) {
                int i11 = x9.f9981b;
                if ((i11 & 512) != 0) {
                    return true;
                }
                int i12 = i11 | 1;
                x9.f9981b = i12;
                if (this.f10017y) {
                    i10 = i11 | 129;
                } else {
                    i10 = i12 & (-129);
                }
                x9.f9981b = i10 | 256;
                o2.k0 k0Var = this.M.f10615b.f10612d;
                k0Var.V(o2.x.f10666d);
                l0.f.C(k0Var, 0, x9);
                this.f9995b.q(x9);
                return false;
            }
        } else if (!z10 && A()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.r.P():void");
    }

    public final void Q() {
        int i2;
        d2 d2Var = this.G;
        int i10 = d2Var.f9894i;
        if (i10 >= 0) {
            i2 = d2Var.f9887b[(i10 * 5) + 1] & 67108863;
        } else {
            i2 = 0;
        }
        this.f10005l = i2;
        d2Var.t();
    }

    public final void R() {
        if (this.f10005l != 0) {
            t.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (!this.S) {
            p1 x9 = x();
            if (x9 != null) {
                int i2 = x9.f9981b;
                if ((i2 & 128) == 0) {
                    x9.f9981b = i2 | 16;
                }
            }
            if (this.f10011s.isEmpty()) {
                Q();
            } else {
                H();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(java.lang.Object r29, int r30, java.lang.Object r31, int r32) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.r.S(java.lang.Object, int, java.lang.Object, int):void");
    }

    public final void T() {
        S(null, -127, null, 0);
    }

    public final void U(int i2, z0 z0Var) {
        S(z0Var, i2, null, 0);
    }

    public final void V(int i2, Object obj) {
        S(obj, i2, null, 0);
    }

    public final void W(boolean z10, Object obj) {
        if (z10) {
            d2 d2Var = this.G;
            if (d2Var.f9896k <= 0) {
                if ((d2Var.f9887b[(d2Var.f9892g * 5) + 1] & 1073741824) == 0) {
                    l1.a("Expected a node group");
                }
                d2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            o2.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            o2.k0 k0Var = bVar.f10615b.f10612d;
            k0Var.V(o2.f0.f10635d);
            l0.f.C(k0Var, 0, obj);
        }
        this.G.u();
    }

    public final void X(int i2) {
        int i10;
        int i11;
        if (this.f10003j != null) {
            S(null, i2, null, 0);
            return;
        }
        if (this.f10010r) {
            t.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i2, 3) ^ this.m;
        this.m++;
        d2 d2Var = this.G;
        boolean z10 = this.S;
        e eVar = l.f9953a;
        if (z10) {
            d2Var.f9896k++;
            this.I.Q(i2, eVar, eVar, false);
            u(false, null);
        } else if (d2Var.g() == i2 && ((i11 = d2Var.f9892g) >= d2Var.f9893h || (d2Var.f9887b[(i11 * 5) + 1] & 536870912) == 0)) {
            d2Var.u();
            u(false, null);
        } else {
            if (d2Var.f9896k <= 0 && (i10 = d2Var.f9892g) != d2Var.f9893h) {
                int i12 = this.f10004k;
                I();
                this.M.e(i12, d2Var.s());
                s.i(this.f10011s, i10, d2Var.f9892g);
            }
            d2Var.f9896k++;
            this.S = true;
            this.K = null;
            if (this.I.f9925w) {
                h2 d4 = this.H.d();
                this.I = d4;
                d4.M();
                this.J = false;
                this.K = null;
            }
            h2 h2Var = this.I;
            h2Var.d();
            int i13 = h2Var.f9922t;
            h2Var.Q(i2, eVar, eVar, false);
            this.N = h2Var.b(i13);
            u(false, null);
        }
    }

    public final void Y(int i2) {
        S(null, i2, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n2.r Z(int r7) {
        /*
            r6 = this;
            r6.X(r7)
            boolean r7 = r6.S
            l.i0 r0 = r6.f10000g
            java.util.ArrayList r1 = r6.E
            n2.y r2 = r6.f10001h
            if (r7 == 0) goto L26
            n2.p1 r7 = new n2.p1
            r7.<init>(r2)
            r1.add(r7)
            r6.i0(r7)
            int r1 = r6.B
            r7.f9984e = r1
            int r1 = r7.f9981b
            r1 = r1 & (-17)
            r7.f9981b = r1
            r0.i()
            return r6
        L26:
            n2.d2 r7 = r6.G
            int r7 = r7.f9894i
            java.util.ArrayList r3 = r6.f10011s
            int r7 = n2.s.s(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            n2.n0 r7 = (n2.n0) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            n2.d2 r3 = r6.G
            java.lang.Object r3 = r3.m()
            n2.e r4 = n2.l.f9953a
            boolean r4 = nc.k.a(r3, r4)
            if (r4 == 0) goto L51
            n2.p1 r3 = new n2.p1
            r3.<init>(r2)
            r6.i0(r3)
            goto L56
        L51:
            r3.getClass()
            n2.p1 r3 = (n2.p1) r3
        L56:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L6e
            int r7 = r3.f9981b
            r5 = r7 & 64
            if (r5 == 0) goto L62
            r5 = r4
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L69
            r7 = r7 & (-65)
            r3.f9981b = r7
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r7 = r2
            goto L6f
        L6e:
            r7 = r4
        L6f:
            int r5 = r3.f9981b
            if (r7 == 0) goto L76
            r7 = r5 | 8
            goto L78
        L76:
            r7 = r5 & (-9)
        L78:
            r3.f9981b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.f9984e = r7
            int r7 = r3.f9981b
            r7 = r7 & (-17)
            r3.f9981b = r7
            r0.i()
            int r7 = r3.f9981b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lb4
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.f9981b = r7
            o2.b r7 = r6.M
            o2.a r7 = r7.f10615b
            o2.k0 r7 = r7.f10612d
            o2.d0 r0 = o2.d0.f10631d
            r7.V(r0)
            l0.f.C(r7, r2, r3)
            boolean r7 = r6.f10017y
            if (r7 != 0) goto Lb4
            int r7 = r3.f9981b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lb4
            r6.f10017y = r4
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.f9981b = r7
        Lb4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.r.Z(int):n2.r");
    }

    public final void a() {
        i();
        this.f10002i.clear();
        this.f10006n.f351b = 0;
        this.f10012t.f351b = 0;
        this.f10016x.f351b = 0;
        this.f10014v = null;
        o2.c cVar = this.O;
        cVar.f10628e.R();
        cVar.f10627d.R();
        this.T = 0;
        this.A = 0;
        this.f10010r = false;
        this.S = false;
        this.f10017y = false;
        this.F = false;
        this.f10018z = -1;
        d2 d2Var = this.G;
        if (!d2Var.f9891f) {
            d2Var.c();
        }
        if (!this.I.f9925w) {
            v();
        }
    }

    public final void a0(Object obj) {
        if (!this.S && this.G.g() == 207 && !nc.k.a(this.G.f(), obj) && this.f10018z < 0) {
            this.f10018z = this.G.f9892g;
            this.f10017y = true;
        }
        S(null, 207, obj, 0);
    }

    public final void b(Object obj, mc.p pVar) {
        if (this.S) {
            o2.k0 k0Var = this.O.f10627d;
            k0Var.V(o2.g0.f10637d);
            l0.f.C(k0Var, 0, obj);
            pVar.getClass();
            nc.w.b(2, pVar);
            l0.f.C(k0Var, 1, pVar);
            return;
        }
        o2.b bVar = this.M;
        bVar.b();
        o2.k0 k0Var2 = bVar.f10615b.f10612d;
        k0Var2.V(o2.g0.f10637d);
        pVar.getClass();
        nc.w.b(2, pVar);
        l0.f.D(k0Var2, 0, obj, 1, pVar);
    }

    public final void b0() {
        S(null, 125, null, 2);
        this.f10010r = true;
    }

    public final boolean c(float f8) {
        Object D = D();
        if ((D instanceof Float) && f8 == ((Number) D).floatValue()) {
            return false;
        }
        i0(Float.valueOf(f8));
        return true;
    }

    public final void c0() {
        this.m = 0;
        this.G = this.f9996c.c();
        S(null, 100, null, 0);
        v vVar = this.f9995b;
        vVar.t();
        v2.g i2 = vVar.i();
        this.f10016x.c(this.f10015w ? 1 : 0);
        this.f10015w = f(i2);
        this.K = null;
        if (!this.f10009q) {
            this.f10009q = vVar.e();
        }
        if (!this.C) {
            this.C = vVar.f();
        }
        if (this.C) {
            t2 t2Var = a3.h.f150a;
            t2Var.getClass();
            i2 = i2.d(t2Var, new u2(z()));
        }
        this.f10013u = i2;
        Set set = (Set) s.x(i2, a3.j.f151a);
        if (set != null) {
            set.add(w());
            vVar.o(set);
        }
        S(null, Long.hashCode(vVar.g()), null, 0);
    }

    public final boolean d(int i2) {
        Object D = D();
        if ((D instanceof Integer) && i2 == ((Number) D).intValue()) {
            return false;
        }
        i0(Integer.valueOf(i2));
        return true;
    }

    public final boolean d0(p1 p1Var, Object obj) {
        a aVar = p1Var.f9982c;
        if (aVar != null) {
            int a10 = this.G.f9886a.a(aVar);
            if (this.F && a10 >= this.G.f9892g) {
                ArrayList arrayList = this.f10011s;
                int s10 = s.s(a10, arrayList);
                if (s10 < 0) {
                    int i2 = -(s10 + 1);
                    if (!(obj instanceof e0)) {
                        obj = null;
                    }
                    arrayList.add(i2, new n0(p1Var, a10, obj));
                    return true;
                }
                n0 n0Var = (n0) arrayList.get(s10);
                if (obj instanceof e0) {
                    Object obj2 = n0Var.f9960c;
                    if (obj2 == null) {
                        n0Var.f9960c = obj;
                        return true;
                    } else if (obj2 instanceof a1.n0) {
                        ((a1.n0) obj2).a(obj);
                        return true;
                    } else {
                        a1.n0 n0Var2 = a1.v0.f110a;
                        a1.n0 n0Var3 = new a1.n0(2);
                        n0Var3.k(obj2);
                        n0Var3.k(obj);
                        n0Var.f9960c = n0Var3;
                        return true;
                    }
                }
                n0Var.f9960c = null;
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean e(long j2) {
        Object D = D();
        if ((D instanceof Long) && j2 == ((Number) D).longValue()) {
            return false;
        }
        i0(Long.valueOf(j2));
        return true;
    }

    public final void e0(a1.m0 m0Var) {
        ArrayList arrayList = this.f10011s;
        for (int l10 = p7.t.l(arrayList); -1 < l10; l10--) {
            n0 n0Var = (n0) arrayList.get(l10);
            a aVar = n0Var.f9958a.f9982c;
            if (aVar != null && aVar.a()) {
                int i2 = n0Var.f9959b;
                int i10 = aVar.f9871a;
                if (i2 != i10) {
                    n0Var.f9959b = i10;
                }
            } else {
                arrayList.remove(l10);
            }
        }
        Object[] objArr = m0Var.f68b;
        Object[] objArr2 = m0Var.f69c;
        long[] jArr = m0Var.f67a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j2 = jArr[i11];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j2) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            obj.getClass();
                            p1 p1Var = (p1) obj;
                            a aVar2 = p1Var.f9982c;
                            if (aVar2 != null) {
                                int i15 = aVar2.f9871a;
                                if (obj2 == e.Y) {
                                    obj2 = null;
                                }
                                arrayList.add(new n0(p1Var, i15, obj2));
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        zb.o.I(arrayList, s.f10019a);
    }

    public final boolean f(Object obj) {
        if (!nc.k.a(D(), obj)) {
            i0(obj);
            return true;
        }
        return false;
    }

    public final void f0(int i2, int i10) {
        if (j0(i2) != i10) {
            if (i2 < 0) {
                a1.v vVar = this.f10008p;
                if (vVar == null) {
                    vVar = new a1.v();
                    this.f10008p = vVar;
                }
                vVar.f(i2, i10);
                return;
            }
            int[] iArr = this.f10007o;
            if (iArr == null) {
                int i11 = this.G.f9888c;
                int[] iArr2 = new int[i11];
                Arrays.fill(iArr2, 0, i11, -1);
                this.f10007o = iArr2;
                iArr = iArr2;
            }
            iArr[i2] = i10;
        }
    }

    public final boolean g(boolean z10) {
        Object D = D();
        if ((D instanceof Boolean) && z10 == ((Boolean) D).booleanValue()) {
            return false;
        }
        i0(Boolean.valueOf(z10));
        return true;
    }

    public final void g0(int i2, int i10) {
        int j02 = j0(i2);
        if (j02 != i10) {
            int i11 = i10 - j02;
            ArrayList arrayList = this.f10002i;
            int size = arrayList.size() - 1;
            while (i2 != -1) {
                int j03 = j0(i2) + i11;
                f0(i2, j03);
                int i12 = size;
                while (true) {
                    if (-1 < i12) {
                        k1 k1Var = (k1) arrayList.get(i12);
                        if (k1Var != null && k1Var.a(i2, j03)) {
                            size = i12 - 1;
                            break;
                        }
                        i12--;
                    } else {
                        break;
                    }
                }
                d2 d2Var = this.G;
                if (i2 < 0) {
                    i2 = d2Var.f9894i;
                } else if (!d2Var.l(i2)) {
                    i2 = this.G.q(i2);
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
        if (obj instanceof x1) {
            y1 y1Var = new y1((x1) obj, this.m - 1);
            if (this.S) {
                o2.k0 k0Var = this.M.f10615b.f10612d;
                k0Var.V(o2.w.f10665d);
                l0.f.C(k0Var, 0, y1Var);
            }
            this.f9997d.add(obj);
            obj = y1Var;
        }
        i0(obj);
    }

    public final void i() {
        this.f10003j = null;
        this.f10004k = 0;
        this.f10005l = 0;
        this.T = 0L;
        this.f10010r = false;
        o2.b bVar = this.M;
        bVar.f10616c = false;
        bVar.f10617d.f351b = 0;
        bVar.f10619f = 0;
        bVar.f10618e = true;
        bVar.f10620g = 0;
        bVar.f10621h.clear();
        bVar.f10622i = -1;
        bVar.f10623j = -1;
        bVar.f10624k = -1;
        bVar.f10625l = 0;
        this.E.clear();
        this.f10007o = null;
        this.f10008p = null;
    }

    public final void i0(Object obj) {
        if (this.S) {
            h2 h2Var = this.I;
            if (h2Var.f9916n > 0 && h2Var.f9912i != h2Var.f9914k) {
                a1.x xVar = h2Var.f9921s;
                if (xVar == null) {
                    xVar = new a1.x();
                }
                h2Var.f9921s = xVar;
                int i2 = h2Var.f9924v;
                Object b10 = xVar.b(i2);
                if (b10 == null) {
                    b10 = new a1.h0();
                    xVar.i(i2, b10);
                }
                ((a1.h0) b10).a(obj);
                return;
            }
            h2Var.F(obj);
            return;
        }
        d2 d2Var = this.G;
        boolean z10 = d2Var.f9898n;
        o2.b bVar = this.M;
        if (z10) {
            int b11 = (d2Var.f9897l - g2.b(d2Var.f9887b, d2Var.f9894i)) - 1;
            if (bVar.f10614a.G.f9894i - bVar.f10619f < 0) {
                d2 d2Var2 = this.G;
                a a10 = d2Var2.a(d2Var2.f9894i);
                o2.k0 k0Var = bVar.f10615b.f10612d;
                k0Var.V(o2.r.f10658g);
                l0.f.D(k0Var, 0, obj, 1, a10);
                k0Var.f10646f[k0Var.f10647g - k0Var.f10644d[k0Var.f10645e - 1].f4506b] = b11;
                return;
            }
            bVar.d(true);
            o2.k0 k0Var2 = bVar.f10615b.f10612d;
            k0Var2.V(o2.r.f10659h);
            l0.f.C(k0Var2, 0, obj);
            k0Var2.f10646f[k0Var2.f10647g - k0Var2.f10644d[k0Var2.f10645e - 1].f4506b] = b11;
            return;
        }
        a a11 = d2Var.a(d2Var.f9894i);
        o2.k0 k0Var3 = bVar.f10615b.f10612d;
        k0Var3.V(o2.e.f10632d);
        l0.f.D(k0Var3, 0, a11, 1, obj);
    }

    public final Object j(n1 n1Var) {
        return s.x(l(), n1Var);
    }

    public final int j0(int i2) {
        int i10;
        if (i2 < 0) {
            a1.v vVar = this.f10008p;
            if (vVar == null || vVar.c(i2) < 0) {
                return 0;
            }
            int c4 = vVar.c(i2);
            if (c4 >= 0) {
                return vVar.f106c[c4];
            }
            m9.o.x(w.d.l(i2, "Cannot find value for key "));
            return 0;
        }
        int[] iArr = this.f10007o;
        if (iArr != null && (i10 = iArr[i2]) >= 0) {
            return i10;
        }
        return this.G.o(i2);
    }

    public final void k(mc.a aVar) {
        if (!this.f10010r) {
            t.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f10010r = false;
        if (!this.S) {
            t.a("createNode() can only be called when inserting");
        }
        a4.w wVar = this.f10006n;
        int i2 = wVar.f350a[wVar.f351b - 1];
        h2 h2Var = this.I;
        a b10 = h2Var.b(h2Var.f9924v);
        this.f10005l++;
        o2.c cVar = this.O;
        o2.k0 k0Var = cVar.f10627d;
        k0Var.V(o2.r.f10656e);
        l0.f.C(k0Var, 0, aVar);
        k0Var.f10646f[k0Var.f10647g - k0Var.f10644d[k0Var.f10645e - 1].f4506b] = i2;
        l0.f.C(k0Var, 1, b10);
        o2.k0 k0Var2 = cVar.f10628e;
        k0Var2.V(o2.r.f10657f);
        k0Var2.f10646f[k0Var2.f10647g - k0Var2.f10644d[k0Var2.f10645e - 1].f4506b] = i2;
        l0.f.C(k0Var2, 0, b10);
    }

    public final void k0() {
        if (!this.f10010r) {
            t.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f10010r = false;
        if (this.S) {
            t.a("useNode() called while inserting");
        }
        d2 d2Var = this.G;
        Object n10 = d2Var.n(d2Var.f9894i);
        o2.b bVar = this.M;
        bVar.c();
        bVar.f10621h.add(n10);
        if (this.f10017y && (n10 instanceof h)) {
            bVar.b();
            bVar.f10615b.f10612d.V(o2.i0.f10641d);
        }
    }

    public final v2.g l() {
        v2.g gVar;
        v2.g gVar2 = this.K;
        if (gVar2 != null) {
            return gVar2;
        }
        int i2 = this.G.f9894i;
        boolean z10 = this.S;
        z0 z0Var = t.f10027c;
        if (z10 && this.J) {
            int i10 = this.I.f9924v;
            while (i10 > 0) {
                if (this.I.s(i10) == 202 && nc.k.a(this.I.t(i10), z0Var)) {
                    Object q10 = this.I.q(i10);
                    q10.getClass();
                    v2.g gVar3 = (v2.g) q10;
                    this.K = gVar3;
                    return gVar3;
                }
                h2 h2Var = this.I;
                i10 = h2Var.E(h2Var.f9905b, i10);
            }
        }
        if (this.G.f9888c > 0) {
            while (i2 > 0) {
                if (this.G.i(i2) == 202) {
                    d2 d2Var = this.G;
                    if (nc.k.a(d2Var.p(d2Var.f9887b, i2), z0Var)) {
                        a1.x xVar = this.f10014v;
                        if (xVar == null || (gVar = (v2.g) xVar.b(i2)) == null) {
                            d2 d2Var2 = this.G;
                            Object b10 = d2Var2.b(d2Var2.f9887b, i2);
                            b10.getClass();
                            gVar = (v2.g) b10;
                        }
                        this.K = gVar;
                        return gVar;
                    }
                }
                i2 = this.G.q(i2);
            }
        }
        v2.g gVar4 = this.f10013u;
        this.K = gVar4;
        return gVar4;
    }

    public final a3.a m() {
        Collection collection;
        Object obj;
        if (!this.f9995b.k()) {
            return null;
        }
        ac.b g10 = p7.t.g();
        h2 h2Var = this.I;
        g10.addAll(aj.g.j(h2Var, null, h2Var.f9922t, null));
        d2 d2Var = this.G;
        boolean z10 = d2Var.f9891f;
        int[] iArr = d2Var.f9887b;
        if (!z10 && d2Var.f9888c != 0) {
            a3.m mVar = new a3.m(d2Var);
            int i2 = d2Var.f9894i;
            Object valueOf = Integer.valueOf(d2Var.f9897l - g2.b(iArr, i2));
            while (i2 >= 0) {
                if (d2Var.k(i2)) {
                    obj = d2Var.p(iArr, i2);
                } else {
                    obj = l.f9953a;
                }
                mVar.f(d2Var.i(i2), obj, d2Var.f9886a.f(i2), valueOf);
                valueOf = d2Var.a(i2);
                i2 = d2Var.q(i2);
            }
            collection = (ArrayList) mVar.f147a;
        } else {
            collection = zb.q.A;
        }
        g10.addAll(collection);
        g10.addAll(E());
        return new a3.a(p7.t.d(g10));
    }

    public final void n(a1.m0 m0Var, mc.p pVar) {
        ArrayList arrayList = this.f10011s;
        if (this.F) {
            t.a("Reentrant composition is not supported");
        }
        this.f10000g.i();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(z2.l.j().g());
            this.f10014v = null;
            e0(m0Var);
            this.f10004k = 0;
            this.F = true;
            c0();
            Object D = D();
            if (D != pVar && pVar != null) {
                i0(pVar);
            }
            q qVar = this.D;
            p2.b p10 = s.p();
            p10.b(qVar);
            z0 z0Var = t.f10025a;
            if (pVar != null) {
                U(200, z0Var);
                nc.w.b(2, pVar);
                pVar.j(this, 1);
                p(false);
            } else if (this.f10015w && D != null && !D.equals(l.f9953a)) {
                U(200, z0Var);
                nc.w.b(2, D);
                mc.p pVar2 = (mc.p) D;
                nc.w.b(2, pVar2);
                pVar2.j(this, 1);
                p(false);
            } else {
                P();
            }
            p10.k(p10.L - 1);
            t();
            this.F = false;
            arrayList.clear();
            if (!this.I.f9925w) {
                t.a("Check failed");
            }
            v();
        } finally {
            Trace.endSection();
        }
    }

    public final void o(int i2, int i10) {
        if (i2 > 0 && i2 != i10) {
            o(this.G.q(i2), i10);
            if (this.G.l(i2)) {
                Object n10 = this.G.n(i2);
                o2.b bVar = this.M;
                bVar.c();
                bVar.f10621h.add(n10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05b8  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r43) {
        /*
            Method dump skipped, instructions count: 1614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.r.p(boolean):void");
    }

    public final void q() {
        p(false);
        p1 x9 = x();
        if (x9 != null) {
            int i2 = x9.f9981b;
            if ((i2 & 1) != 0) {
                x9.f9981b = i2 | 2;
            }
        }
    }

    public final p1 r() {
        p1 p1Var;
        p1 p1Var2;
        a a10;
        f1.s1 s1Var;
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty()) {
            p1Var = (p1) arrayList.remove(arrayList.size() - 1);
        } else {
            p1Var = null;
        }
        if (p1Var != null) {
            p1Var.f9981b &= -9;
            this.f10000g.i();
            int i2 = this.B;
            a1.d0 d0Var = p1Var.f9985f;
            if (d0Var != null && (p1Var.f9981b & 16) == 0) {
                Object[] objArr = d0Var.f33b;
                int[] iArr = d0Var.f34c;
                long[] jArr = d0Var.f32a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    loop0: while (true) {
                        long j2 = jArr[i10];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j2 & 255) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj = objArr[i13];
                                    if (iArr[i13] != i2) {
                                        s1Var = new f1.s1(p1Var, i2, d0Var, 1);
                                        break loop0;
                                    }
                                }
                                j2 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            s1Var = null;
            o2.b bVar = this.M;
            if (s1Var != null) {
                o2.k0 k0Var = bVar.f10615b.f10612d;
                k0Var.V(o2.l.f10650d);
                l0.f.D(k0Var, 0, s1Var, 1, this.f10001h);
            }
            int i14 = p1Var.f9981b;
            if ((i14 & 512) != 0) {
                p1Var.f9981b = i14 & (-513);
                o2.k0 k0Var2 = bVar.f10615b.f10612d;
                k0Var2.V(o2.o.f10653d);
                l0.f.C(k0Var2, 0, p1Var);
                int i15 = p1Var.f9981b;
                p1Var.f9981b = i15 & (-129);
                if ((i15 & 1024) != 0) {
                    p1Var.f9981b = i15 & (-1153);
                    this.f10017y = false;
                }
            }
        }
        if (p1Var != null) {
            int i16 = p1Var.f9981b;
            if ((i16 & 16) == 0 && ((i16 & 1) != 0 || this.f10009q)) {
                if (p1Var.f9982c == null) {
                    if (this.S) {
                        h2 h2Var = this.I;
                        a10 = h2Var.b(h2Var.f9924v);
                    } else {
                        d2 d2Var = this.G;
                        a10 = d2Var.a(d2Var.f9894i);
                    }
                    p1Var.f9982c = a10;
                }
                p1Var.f9981b &= -5;
                p1Var2 = p1Var;
                p(false);
                return p1Var2;
            }
        }
        p1Var2 = null;
        p(false);
        return p1Var2;
    }

    public final void s() {
        if (this.F || this.f10018z != 100) {
            l1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f10018z = -1;
        this.f10017y = false;
    }

    public final void t() {
        boolean z10 = false;
        p(false);
        this.f9995b.c();
        p(false);
        o2.b bVar = this.M;
        if (bVar.f10616c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f10615b.f10612d.V(o2.m.f10651d);
            bVar.f10616c = false;
        }
        bVar.b();
        if (bVar.f10617d.f351b != 0) {
            t.a("Missed recording an endGroup()");
        }
        if (!this.f10002i.isEmpty()) {
            t.a("Start/end imbalance");
        }
        i();
        this.G.c();
        if (this.f10016x.b() != 0) {
            z10 = true;
        }
        this.f10015w = z10;
    }

    public final void u(boolean z10, k1 k1Var) {
        this.f10002i.add(this.f10003j);
        this.f10003j = k1Var;
        int i2 = this.f10005l;
        a4.w wVar = this.f10006n;
        wVar.c(i2);
        wVar.c(this.m);
        wVar.c(this.f10004k);
        if (z10) {
            this.f10004k = 0;
        }
        this.f10005l = 0;
        this.m = 0;
    }

    public final void v() {
        e2 e2Var = new e2();
        if (this.C) {
            e2Var.b();
        }
        if (this.f9995b.d()) {
            e2Var.f9902e0 = new a1.x();
        }
        this.H = e2Var;
        h2 d4 = e2Var.d();
        d4.e(true);
        this.I = d4;
    }

    public final a3.d w() {
        x xVar = this.U;
        if (xVar == null) {
            x xVar2 = new x(this.f10001h);
            this.U = xVar2;
            return xVar2;
        }
        return xVar;
    }

    public final p1 x() {
        if (this.A == 0) {
            ArrayList arrayList = this.E;
            if (!arrayList.isEmpty()) {
                return (p1) arrayList.get(arrayList.size() - 1);
            }
            return null;
        }
        return null;
    }

    public final boolean y() {
        if (A() && !this.f10015w) {
            p1 x9 = x();
            if (x9 == null || (x9.f9981b & 4) == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final a3.f z() {
        if (this.f9995b.k()) {
            return this.Q;
        }
        return null;
    }
}
