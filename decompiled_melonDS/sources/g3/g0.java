package g3;

import a4.n0;
import a4.n1;
import a4.o0;
import a4.x1;
import android.os.Trace;
import b4.q1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 extends b3.o implements a4.i, a4.z, x1, z3.c, a4.j {

    /* renamed from: i0  reason: collision with root package name */
    public final mc.p f5508i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f5509j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f5510k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f5511l0;

    public g0(int i2, mc.p pVar, int i10) {
        this.f5508i0 = (i10 & 4) != 0 ? null : pVar;
        this.f5511l0 = i2;
    }

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    @Override // b3.o
    public final void H0() {
        int i2 = f0.f5507b[T0().ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    return;
                }
                m9.o.o();
                return;
            }
            ((b4.x) a4.l.u(this)).getFocusOwner();
            d.f(this);
            return;
        }
        p pVar = (p) ((b4.x) a4.l.u(this)).getFocusOwner();
        pVar.b(8, true, false);
        pVar.f5530d.a();
    }

    @Override // b3.o
    public final void I0() {
        if (T0().isFocused()) {
            ((p) ((b4.x) a4.l.u(this)).getFocusOwner()).b(8, true, true);
        }
    }

    @Override // a4.x1
    public final void J() {
        U0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object[], java.lang.Object] */
    public final boolean O0(int i2) {
        p2.b bVar;
        e0 e0Var;
        b3.o oVar;
        n1 n1Var;
        Boolean bool;
        char c4;
        n1 n1Var2;
        p2.b bVar2;
        int i10 = f0.f5506a[d.w(this, i2).ordinal()];
        int i11 = 0;
        if (i10 != 1) {
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3 && i10 != 4) {
                m9.o.o();
                return false;
            }
        } else {
            p pVar = (p) ((b4.x) a4.l.u(this)).getFocusOwner();
            g0 f8 = pVar.f();
            e0 T0 = T0();
            if (f8 == this) {
                P0(T0, T0);
                return true;
            } else if (f8 != null || ((p) ((b4.x) a4.l.u(this)).getFocusOwner()).f5527a.A()) {
                char c10 = 16;
                if (f8 != null) {
                    bVar = new p2.b(new g0[16]);
                    if (!f8.A.f1777h0) {
                        x3.a.c("visitAncestors called on an unattached node");
                    }
                    b3.o oVar2 = f8.A.X;
                    o0 t5 = a4.l.t(f8);
                    while (t5 != null) {
                        if ((t5.A0.f268f.R & 1024) != 0) {
                            while (oVar2 != null) {
                                if ((oVar2.L & 1024) != 0) {
                                    b3.o oVar3 = oVar2;
                                    p2.b bVar3 = null;
                                    while (oVar3 != null) {
                                        if (oVar3 instanceof g0) {
                                            bVar.b((g0) oVar3);
                                        } else if ((oVar3.L & 1024) != 0 && (oVar3 instanceof a4.k)) {
                                            int i12 = 0;
                                            for (b3.o oVar4 = ((a4.k) oVar3).f247j0; oVar4 != null; oVar4 = oVar4.Y) {
                                                if ((oVar4.L & 1024) != 0) {
                                                    i12++;
                                                    if (i12 == 1) {
                                                        oVar3 = oVar4;
                                                    } else {
                                                        if (bVar3 == null) {
                                                            bVar2 = new p2.b(new b3.o[16]);
                                                        } else {
                                                            bVar2 = bVar3;
                                                        }
                                                        if (oVar3 != null) {
                                                            bVar2.b(oVar3);
                                                            oVar3 = null;
                                                        }
                                                        bVar2.b(oVar4);
                                                        bVar3 = bVar2;
                                                    }
                                                }
                                            }
                                            if (i12 == 1) {
                                            }
                                        }
                                        oVar3 = a4.l.e(bVar3);
                                    }
                                }
                                oVar2 = oVar2.X;
                            }
                        }
                        t5 = t5.u();
                        if (t5 != null && (n1Var2 = t5.A0) != null) {
                            oVar2 = n1Var2.f267e;
                        } else {
                            oVar2 = null;
                        }
                    }
                } else {
                    bVar = null;
                }
                g0[] g0VarArr = new g0[16];
                if (!this.A.f1777h0) {
                    x3.a.c("visitAncestors called on an unattached node");
                }
                b3.o oVar5 = this.A.X;
                o0 t10 = a4.l.t(this);
                int i13 = 0;
                int i14 = 1;
                b3.o oVar6 = oVar5;
                while (t10 != null) {
                    if ((t10.A0.f268f.R & 1024) != 0) {
                        for (b3.o oVar7 = oVar6; oVar7 != null; oVar7 = oVar7.X) {
                            if ((oVar7.L & 1024) != 0) {
                                b3.o oVar8 = oVar7;
                                p2.b bVar4 = null;
                                while (oVar8 != null) {
                                    if (oVar8 instanceof g0) {
                                        g0 g0Var = (g0) oVar8;
                                        if (bVar != null) {
                                            bool = Boolean.valueOf(bVar.j(g0Var));
                                        } else {
                                            bool = null;
                                        }
                                        if (bool == null || !bool.booleanValue()) {
                                            int i15 = i13 + 1;
                                            if (g0VarArr.length < i15) {
                                                int length = g0VarArr.length;
                                                ?? r62 = new Object[Math.max(i15, length * 2)];
                                                System.arraycopy(g0VarArr, i11, r62, i11, length);
                                                g0VarArr = r62;
                                            }
                                            g0VarArr[i13] = g0Var;
                                            i13 = i15;
                                        }
                                        if (g0Var == f8) {
                                            i14 = i11;
                                        }
                                    } else if ((oVar8.L & 1024) != 0 && (oVar8 instanceof a4.k)) {
                                        b3.o oVar9 = ((a4.k) oVar8).f247j0;
                                        int i16 = i11;
                                        oVar8 = oVar8;
                                        bVar4 = bVar4;
                                        while (oVar9 != null) {
                                            oVar8 = oVar8;
                                            if ((oVar9.L & 1024) != 0) {
                                                i16++;
                                                if (i16 == 1) {
                                                    oVar8 = oVar9;
                                                } else {
                                                    bVar4 = bVar4 == null ? new p2.b(new b3.o[16]) : bVar4;
                                                    if (oVar8 != null) {
                                                        bVar4.b(oVar8);
                                                        oVar8 = null;
                                                    }
                                                    bVar4.b(oVar9);
                                                    oVar9 = oVar9.Y;
                                                    oVar8 = oVar8;
                                                    bVar4 = bVar4;
                                                }
                                            }
                                            oVar9 = oVar9.Y;
                                            oVar8 = oVar8;
                                            bVar4 = bVar4;
                                        }
                                        c4 = 16;
                                        if (i16 == 1) {
                                            c10 = 16;
                                            i11 = 0;
                                        } else {
                                            oVar8 = a4.l.e(bVar4);
                                            c10 = c4;
                                            i11 = 0;
                                        }
                                    }
                                    c4 = 16;
                                    oVar8 = a4.l.e(bVar4);
                                    c10 = c4;
                                    i11 = 0;
                                }
                            }
                            c10 = c10;
                            i11 = 0;
                        }
                    }
                    char c11 = c10;
                    t10 = t10.u();
                    if (t10 != null && (n1Var = t10.A0) != null) {
                        oVar = n1Var.f267e;
                    } else {
                        oVar = null;
                    }
                    c10 = c11;
                    i11 = 0;
                    oVar6 = oVar;
                }
                if (i14 == 0 || f8 == null || d.d(f8, false)) {
                    a4.l.p(this, new a4.m0(9, this));
                    int i17 = h0.f5514a[T0().ordinal()];
                    if (i17 != 1 && i17 != 2) {
                        if (i17 != 3 && i17 != 4) {
                            m9.o.o();
                            return false;
                        }
                        ((p) ((b4.x) a4.l.u(this)).getFocusOwner()).i(this);
                    }
                    if (i14 != 0 && f8 != null) {
                        f8.P0(e0.Active, e0.Inactive);
                    }
                    if (bVar != null) {
                        int i18 = bVar.L - 1;
                        Object[] objArr = bVar.A;
                        if (i18 < objArr.length) {
                            while (i18 >= 0) {
                                g0 g0Var2 = (g0) objArr[i18];
                                if (pVar.f() != this) {
                                    break;
                                }
                                g0Var2.P0(e0.ActiveParent, e0.Inactive);
                                i18--;
                            }
                        }
                    }
                    int i19 = i13 - 1;
                    if (i19 < g0VarArr.length) {
                        while (i19 >= 0) {
                            g0 g0Var3 = g0VarArr[i19];
                            if (pVar.f() != this) {
                                break;
                            }
                            if (g0Var3 == f8) {
                                e0Var = e0.Active;
                            } else {
                                e0Var = e0.Inactive;
                            }
                            g0Var3.P0(e0Var, e0.ActiveParent);
                            i19--;
                        }
                    }
                    if (pVar.f() == this) {
                        P0(T0, e0.Active);
                        if (pVar.f() != this) {
                            break;
                        }
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public final void P0(e0 e0Var, e0 e0Var2) {
        n1 n1Var;
        mc.p pVar;
        p pVar2 = (p) ((b4.x) a4.l.u(this)).getFocusOwner();
        g0 f8 = pVar2.f();
        if (!nc.k.a(e0Var, e0Var2) && (pVar = this.f5508i0) != null) {
            pVar.j(e0Var, e0Var2);
        }
        b3.o oVar = this.A;
        if (!oVar.f1777h0) {
            x3.a.c("visitAncestors called on an unattached node");
        }
        b3.o oVar2 = this.A;
        o0 t5 = a4.l.t(this);
        while (t5 != null) {
            if ((t5.A0.f268f.R & 5120) != 0) {
                while (oVar2 != null) {
                    int i2 = oVar2.L;
                    if ((i2 & 5120) != 0) {
                        if (oVar2 == oVar || (i2 & 1024) == 0) {
                            if ((i2 & 4096) != 0) {
                                b3.o oVar3 = oVar2;
                                p2.b bVar = null;
                                while (oVar3 != null) {
                                    if (oVar3 instanceof g) {
                                        g gVar = (g) oVar3;
                                        if (f8 == pVar2.f()) {
                                            gVar.M(e0Var2);
                                        }
                                    } else if ((oVar3.L & 4096) != 0 && (oVar3 instanceof a4.k)) {
                                        int i10 = 0;
                                        for (b3.o oVar4 = ((a4.k) oVar3).f247j0; oVar4 != null; oVar4 = oVar4.Y) {
                                            if ((oVar4.L & 4096) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    oVar3 = oVar4;
                                                } else {
                                                    if (bVar == null) {
                                                        bVar = new p2.b(new b3.o[16]);
                                                    }
                                                    if (oVar3 != null) {
                                                        bVar.b(oVar3);
                                                        oVar3 = null;
                                                    }
                                                    bVar.b(oVar4);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    oVar3 = a4.l.e(bVar);
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    oVar2 = oVar2.X;
                }
            }
            t5 = t5.u();
            if (t5 != null && (n1Var = t5.A0) != null) {
                oVar2 = n1Var.f267e;
            } else {
                oVar2 = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, g3.u, g3.r] */
    public final u Q0() {
        boolean z10;
        boolean z11;
        n1 n1Var;
        ?? obj = new Object();
        obj.f5537a = true;
        z zVar = z.f5551b;
        obj.f5538b = zVar;
        obj.f5539c = zVar;
        obj.f5540d = zVar;
        obj.f5541e = zVar;
        obj.f5542f = zVar;
        obj.f5543g = zVar;
        obj.f5544h = zVar;
        obj.f5545i = zVar;
        obj.f5546j = t.L;
        obj.f5547k = t.R;
        obj.f5548l = q.f5535a;
        int i2 = this.f5511l0;
        if (i2 == 1) {
            z10 = true;
        } else if (i2 == 0) {
            if (((r3.a) ((r3.c) ((r3.b) a4.l.h(this, q1.m))).f12616a.getValue()).f12615a == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 = !z11;
        } else if (i2 == 2) {
            z10 = false;
        } else {
            a0.j.p("Unknown Focusability");
            return null;
        }
        obj.f5537a = z10;
        b3.o oVar = this.A;
        if (!oVar.f1777h0) {
            x3.a.c("visitAncestors called on an unattached node");
        }
        b3.o oVar2 = this.A;
        o0 t5 = a4.l.t(this);
        loop0: while (t5 != null) {
            if ((t5.A0.f268f.R & 3072) != 0) {
                while (oVar2 != null) {
                    int i10 = oVar2.L;
                    if ((i10 & 3072) != 0) {
                        if (oVar2 != oVar && (i10 & 1024) != 0) {
                            break loop0;
                        } else if ((i10 & 2048) != 0) {
                            b3.o oVar3 = oVar2;
                            p2.b bVar = null;
                            while (oVar3 != null) {
                                if (oVar3 instanceof w) {
                                    ((w) oVar3).C(obj);
                                } else if ((oVar3.L & 2048) != 0 && (oVar3 instanceof a4.k)) {
                                    int i11 = 0;
                                    for (b3.o oVar4 = ((a4.k) oVar3).f247j0; oVar4 != null; oVar4 = oVar4.Y) {
                                        if ((oVar4.L & 2048) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                oVar3 = oVar4;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new p2.b(new b3.o[16]);
                                                }
                                                if (oVar3 != null) {
                                                    bVar.b(oVar3);
                                                    oVar3 = null;
                                                }
                                                bVar.b(oVar4);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                oVar3 = a4.l.e(bVar);
                            }
                        }
                    }
                    oVar2 = oVar2.X;
                }
            }
            t5 = t5.u();
            if (t5 != null && (n1Var = t5.A0) != null) {
                oVar2 = n1Var.f267e;
            } else {
                oVar2 = null;
            }
        }
        return obj;
    }

    public final h3.c R0(y3.z zVar) {
        h3.c cVar = Q0().f5548l;
        if (cVar != q.f5535a) {
            if (zVar == null) {
                return cVar;
            }
            return cVar.i(y3.z.J(zVar, a4.l.s(this), 6));
        } else if (zVar != null) {
            return zVar.k(a4.l.s(this), false);
        } else {
            return pc.a.h(0L, zb.k.T(a4.l.s(this).L));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p1.p S0() {
        /*
            r7 = this;
            b3.o r0 = r7.A
            boolean r0 = r0.f1777h0
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            x3.a.c(r0)
        Lb:
            b3.o r0 = r7.A
            b3.o r0 = r0.X
            a4.o0 r1 = a4.l.t(r7)
        L13:
            r2 = 0
            if (r1 == 0) goto L9d
            a4.n1 r3 = r1.A0
            b3.o r3 = r3.f268f
            int r3 = r3.R
            r4 = 8388640(0x800020, float:1.1754988E-38)
            r3 = r3 & r4
            if (r3 == 0) goto L8c
        L22:
            if (r0 == 0) goto L8c
            int r3 = r0.L
            r5 = r3 & r4
            if (r5 == 0) goto L89
            r5 = 8388608(0x800000, float:1.1754944E-38)
            r5 = r5 & r3
            if (r5 == 0) goto L4f
            boolean r1 = r0 instanceof p1.p
            if (r1 == 0) goto L34
            goto L4a
        L34:
            boolean r1 = r0 instanceof a4.k
            if (r1 == 0) goto L49
            a4.k r0 = (a4.k) r0
            b3.o r0 = r0.f247j0
            r1 = r2
        L3d:
            if (r0 == 0) goto L47
            boolean r3 = r0 instanceof p1.p
            if (r3 == 0) goto L44
            r1 = r0
        L44:
            b3.o r0 = r0.Y
            goto L3d
        L47:
            r0 = r1
            goto L4a
        L49:
            r0 = r2
        L4a:
            p1.p r0 = (p1.p) r0
            if (r0 == 0) goto L9d
            return r0
        L4f:
            r3 = r3 & 32
            if (r3 == 0) goto L89
            boolean r3 = r0 instanceof z3.c
            if (r3 == 0) goto L59
            r5 = r0
            goto L6e
        L59:
            boolean r3 = r0 instanceof a4.k
            if (r3 == 0) goto L6d
            r3 = r0
            a4.k r3 = (a4.k) r3
            b3.o r3 = r3.f247j0
            r5 = r2
        L63:
            if (r3 == 0) goto L6e
            boolean r6 = r3 instanceof z3.c
            if (r6 == 0) goto L6a
            r5 = r3
        L6a:
            b3.o r3 = r3.Y
            goto L63
        L6d:
            r5 = r2
        L6e:
            z3.c r5 = (z3.c) r5
            if (r5 == 0) goto L89
            p7.j r3 = r5.g()
            rd.k r6 = y3.k.f14696a
            boolean r3 = r3.m(r6)
            if (r3 == 0) goto L89
            p7.j r0 = r5.g()
            java.lang.Object r0 = r0.x(r6)
            p1.p r0 = (p1.p) r0
            return r0
        L89:
            b3.o r0 = r0.X
            goto L22
        L8c:
            a4.o0 r1 = r1.u()
            if (r1 == 0) goto L9a
            a4.n1 r0 = r1.A0
            if (r0 == 0) goto L9a
            a4.n2 r0 = r0.f267e
            goto L13
        L9a:
            r0 = r2
            goto L13
        L9d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.g0.S0():p1.p");
    }

    public final e0 T0() {
        n1 n1Var;
        if (!this.f1777h0) {
            return e0.Inactive;
        }
        g0 f8 = ((p) ((b4.x) a4.l.u(this)).getFocusOwner()).f();
        if (f8 == null) {
            return e0.Inactive;
        }
        if (this == f8) {
            return e0.Active;
        }
        if (f8.f1777h0) {
            if (!f8.A.f1777h0) {
                x3.a.c("visitAncestors called on an unattached node");
            }
            b3.o oVar = f8.A.X;
            o0 t5 = a4.l.t(f8);
            while (t5 != null) {
                if ((t5.A0.f268f.R & 1024) != 0) {
                    while (oVar != null) {
                        if ((oVar.L & 1024) != 0) {
                            b3.o oVar2 = oVar;
                            p2.b bVar = null;
                            while (oVar2 != null) {
                                if (oVar2 instanceof g0) {
                                    if (this == ((g0) oVar2)) {
                                        return e0.ActiveParent;
                                    }
                                } else if ((oVar2.L & 1024) != 0 && (oVar2 instanceof a4.k)) {
                                    int i2 = 0;
                                    for (b3.o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                        if ((oVar3.L & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oVar2 = oVar3;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new p2.b(new b3.o[16]);
                                                }
                                                if (oVar2 != null) {
                                                    bVar.b(oVar2);
                                                    oVar2 = null;
                                                }
                                                bVar.b(oVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                oVar2 = a4.l.e(bVar);
                            }
                            continue;
                        }
                        oVar = oVar.X;
                    }
                }
                t5 = t5.u();
                if (t5 != null && (n1Var = t5.A0) != null) {
                    oVar = n1Var.f267e;
                } else {
                    oVar = null;
                }
            }
        }
        return e0.Inactive;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [nc.t, java.lang.Object] */
    public final void U0() {
        int i2 = f0.f5507b[T0().ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4) {
                m9.o.o();
                return;
            }
            return;
        }
        ?? obj = new Object();
        a4.l.p(this, new n0(obj, this));
        Object obj2 = obj.A;
        if (obj2 != null) {
            if (!((r) obj2).a()) {
                ((p) ((b4.x) a4.l.u(this)).getFocusOwner()).b(8, true, true);
                return;
            }
            return;
        }
        nc.k.f("focusProperties");
        throw null;
    }

    public final boolean V0(int i2) {
        boolean h2;
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            if (Q0().f5537a) {
                h2 = O0(i2);
            } else {
                h2 = d.h(this, i2, new b4.u(i2, 4));
            }
            Trace.endSection();
            return h2;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // a4.z
    public final void s(y3.z zVar) {
    }
}
