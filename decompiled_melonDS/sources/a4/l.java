package a4;

import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final z1 f254a = new z1(1);

    public static final long a(float f8, boolean z10, boolean z11) {
        long j2;
        long floatToRawIntBits = Float.floatToRawIntBits(f8);
        long j10 = 0;
        if (z10) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        if (z11) {
            j10 = 2;
        }
        return ((j2 | j10) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static final void b(p2.b bVar, b3.o oVar) {
        p2.b z10 = t(oVar).z();
        int i2 = z10.L - 1;
        Object[] objArr = z10.A;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                bVar.b(((o0) objArr[i2]).A0.f268f);
                i2--;
            }
        }
    }

    public static final int c(x0 x0Var, y3.q qVar) {
        long H0;
        x0 B0 = x0Var.B0();
        if (B0 == null) {
            x3.a.c("Child of " + x0Var + " cannot be null when calculating alignment line");
        }
        if (x0Var.F0().d().containsKey(qVar)) {
            Integer num = (Integer) x0Var.F0().d().get(qVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int i02 = B0.i0(qVar);
            if (i02 != Integer.MIN_VALUE) {
                B0.f361d0 = true;
                x0Var.f362e0 = true;
                x0Var.L0();
                B0.f361d0 = false;
                x0Var.f362e0 = false;
                if (qVar instanceof y3.q) {
                    H0 = B0.H0() & 4294967295L;
                } else {
                    H0 = B0.H0() >> 32;
                }
                return i02 + ((int) H0);
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final b3.o d(j jVar, int i2) {
        b3.o oVar = ((b3.o) jVar).A.Y;
        if (oVar != null && (oVar.R & i2) != 0) {
            while (oVar != null) {
                int i10 = oVar.L;
                if ((i10 & 2) == 0) {
                    if ((i10 & i2) != 0) {
                        return oVar;
                    }
                    oVar = oVar.Y;
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static final b3.o e(p2.b bVar) {
        int i2;
        if (bVar != null && (i2 = bVar.L) != 0) {
            return (b3.o) bVar.k(i2 - 1);
        }
        return null;
    }

    public static final a0 f(b3.o oVar) {
        if ((oVar.L & 2) != 0) {
            if (oVar instanceof a0) {
                return (a0) oVar;
            }
            if (oVar instanceof k) {
                b3.o oVar2 = ((k) oVar).f247j0;
                while (oVar2 != null) {
                    if (oVar2 instanceof a0) {
                        return (a0) oVar2;
                    }
                    if ((oVar2 instanceof k) && (oVar2.L & 2) != 0) {
                        oVar2 = ((k) oVar2).f247j0;
                    } else {
                        oVar2 = oVar2.Y;
                    }
                }
            }
        }
        return null;
    }

    public static final int g(long j2, long j10) {
        boolean n10 = n(j2);
        if (n10 != n(j10)) {
            if (!n10) {
                return 1;
            }
            return -1;
        }
        int signum = (int) Math.signum(i(j2) - i(j10));
        if (Math.min(i(j2), i(j10)) >= 0.0f && m(j2) != m(j10)) {
            if (!m(j2)) {
                return 1;
            }
            return -1;
        }
        return signum;
    }

    public static final Object h(i iVar, n2.n1 n1Var) {
        if (!((b3.o) iVar).A.f1777h0) {
            x3.a.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        v2.g gVar = (v2.g) t(iVar).f298w0;
        gVar.getClass();
        return n2.s.x(gVar, n1Var);
    }

    public static final float i(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final void j(p pVar) {
        if (((b3.o) pVar).A.f1777h0) {
            r(pVar, 1).e1();
        }
    }

    public static final void k(a0 a0Var) {
        t(a0Var).E();
    }

    public static final void l(l2 l2Var) {
        t(l2Var).F();
    }

    public static final boolean m(long j2) {
        if ((j2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean n(long j2) {
        if ((j2 & 1) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean o(o0 o0Var) {
        o0 o0Var2;
        if (o0Var.f280d0 != null) {
            o0 u4 = o0Var.u();
            if (u4 != null) {
                o0Var2 = u4.f280d0;
            } else {
                o0Var2 = null;
            }
            if (o0Var2 == null || o0Var.B0.f335b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void p(b3.o oVar, mc.a aVar) {
        y1 y1Var = oVar.Z;
        if (y1Var == null) {
            y1Var = new y1((x1) oVar);
            oVar.Z = y1Var;
        }
        e2 snapshotObserver = ((b4.x) u(oVar)).getSnapshotObserver();
        snapshotObserver.f194a.c(y1Var, e.Z, aVar);
    }

    public static final void q(j jVar) {
        c3.d dVar;
        o0 t5 = t(jVar);
        if (!t5.f291o0) {
            b4.x xVar = (b4.x) s0.a(t5);
            if (b4.x.e() && (dVar = xVar.H0) != null) {
                dVar.R.f7417a.o(t5.B, new c3.c(dVar, t5));
            }
        }
    }

    public static final r1 r(j jVar, int i2) {
        r1 r1Var = ((b3.o) jVar).A.f1771b0;
        r1Var.getClass();
        if (r1Var.X0() == jVar && s1.g(i2)) {
            r1 r1Var2 = r1Var.f318l0;
            r1Var2.getClass();
            return r1Var2;
        }
        return r1Var;
    }

    public static final r1 s(j jVar) {
        if (!((b3.o) jVar).A.f1777h0) {
            x3.a.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        r1 r5 = r(jVar, 2);
        if (!r5.X0().f1777h0) {
            x3.a.c("LayoutCoordinates is not attached.");
        }
        return r5;
    }

    public static final o0 t(j jVar) {
        r1 r1Var = ((b3.o) jVar).A.f1771b0;
        if (r1Var != null) {
            return r1Var.f315i0;
        }
        throw w.d.g("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final c2 u(j jVar) {
        c2 c2Var = t(jVar).f286j0;
        if (c2Var != null) {
            return c2Var;
        }
        throw w.d.g("This node does not have an owner.");
    }

    public static final View v(j jVar) {
        if (!((b3.o) jVar).A.f1777h0) {
            x3.a.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) s0.a(t(jVar));
    }

    public static final void w(j jVar, Object obj, mc.l lVar) {
        n1 n1Var;
        boolean z10;
        boolean z11;
        b3.o oVar = (b3.o) jVar;
        if (!oVar.A.f1777h0) {
            x3.a.c("visitAncestors called on an unattached node");
        }
        b3.o oVar2 = oVar.A.X;
        o0 t5 = t(jVar);
        while (t5 != null) {
            if ((t5.A0.f268f.R & 262144) != 0) {
                while (oVar2 != null) {
                    if ((oVar2.L & 262144) != 0) {
                        b3.o oVar3 = oVar2;
                        p2.b bVar = null;
                        while (oVar3 != null) {
                            boolean z12 = true;
                            if (oVar3 instanceof q2) {
                                q2 q2Var = (q2) oVar3;
                                if (obj.equals(q2Var.k())) {
                                    z12 = ((Boolean) lVar.k(q2Var)).booleanValue();
                                }
                                if (!z12) {
                                    return;
                                }
                            } else {
                                if ((oVar3.L & 262144) != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && (oVar3 instanceof k)) {
                                    int i2 = 0;
                                    for (b3.o oVar4 = ((k) oVar3).f247j0; oVar4 != null; oVar4 = oVar4.Y) {
                                        if ((oVar4.L & 262144) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            i2++;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                            }
                            oVar3 = e(bVar);
                        }
                        continue;
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

    public static final void x(q2 q2Var, mc.l lVar) {
        n1 n1Var;
        boolean z10;
        boolean z11;
        b3.o oVar = (b3.o) q2Var;
        if (!oVar.A.f1777h0) {
            x3.a.c("visitAncestors called on an unattached node");
        }
        b3.o oVar2 = oVar.A.X;
        o0 t5 = t(q2Var);
        while (t5 != null) {
            if ((t5.A0.f268f.R & 262144) != 0) {
                while (oVar2 != null) {
                    if ((oVar2.L & 262144) != 0) {
                        b3.o oVar3 = oVar2;
                        p2.b bVar = null;
                        while (oVar3 != null) {
                            boolean z12 = true;
                            if (oVar3 instanceof q2) {
                                q2 q2Var2 = (q2) oVar3;
                                if (nc.k.a(q2Var.k(), q2Var2.k()) && q2Var.getClass() == q2Var2.getClass()) {
                                    z12 = ((Boolean) lVar.k(q2Var2)).booleanValue();
                                }
                                if (!z12) {
                                    return;
                                }
                            } else {
                                if ((oVar3.L & 262144) != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && (oVar3 instanceof k)) {
                                    int i2 = 0;
                                    for (b3.o oVar4 = ((k) oVar3).f247j0; oVar4 != null; oVar4 = oVar4.Y) {
                                        if ((oVar4.L & 262144) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            i2++;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                            }
                            oVar3 = e(bVar);
                        }
                        continue;
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

    public static final void y(j jVar, String str, mc.l lVar) {
        p2 p2Var;
        b3.o oVar = (b3.o) jVar;
        if (!oVar.A.f1777h0) {
            x3.a.c("visitSubtreeIf called on an unattached node");
        }
        p2.b bVar = new p2.b(new b3.o[16]);
        b3.o oVar2 = oVar.A;
        b3.o oVar3 = oVar2.Y;
        if (oVar3 == null) {
            b(bVar, oVar2);
        } else {
            bVar.b(oVar3);
        }
        while (true) {
            int i2 = bVar.L;
            if (i2 != 0) {
                b3.o oVar4 = (b3.o) bVar.k(i2 - 1);
                if ((oVar4.R & 262144) != 0) {
                    for (b3.o oVar5 = oVar4; oVar5 != null && oVar5.f1777h0; oVar5 = oVar5.Y) {
                        if ((oVar5.L & 262144) != 0) {
                            b3.o oVar6 = oVar5;
                            p2.b bVar2 = null;
                            while (oVar6 != null) {
                                if (oVar6 instanceof q2) {
                                    q2 q2Var = (q2) oVar6;
                                    if (str.equals(q2Var.k())) {
                                        p2Var = (p2) lVar.k(q2Var);
                                    } else {
                                        p2Var = p2.ContinueTraversal;
                                    }
                                    if (p2Var != p2.CancelTraversal) {
                                        if (p2Var == p2.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((oVar6.L & 262144) != 0 && (oVar6 instanceof k)) {
                                    int i10 = 0;
                                    for (b3.o oVar7 = ((k) oVar6).f247j0; oVar7 != null; oVar7 = oVar7.Y) {
                                        if ((oVar7.L & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                oVar6 = oVar7;
                                            } else {
                                                if (bVar2 == null) {
                                                    bVar2 = new p2.b(new b3.o[16]);
                                                }
                                                if (oVar6 != null) {
                                                    bVar2.b(oVar6);
                                                    oVar6 = null;
                                                }
                                                bVar2.b(oVar7);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVar6 = e(bVar2);
                            }
                            continue;
                        }
                    }
                }
                b(bVar, oVar4);
            } else {
                return;
            }
        }
    }

    public static final void z(q2 q2Var, mc.l lVar) {
        p2 p2Var;
        b3.o oVar = (b3.o) q2Var;
        if (!oVar.A.f1777h0) {
            x3.a.c("visitSubtreeIf called on an unattached node");
        }
        p2.b bVar = new p2.b(new b3.o[16]);
        b3.o oVar2 = oVar.A;
        b3.o oVar3 = oVar2.Y;
        if (oVar3 == null) {
            b(bVar, oVar2);
        } else {
            bVar.b(oVar3);
        }
        while (true) {
            int i2 = bVar.L;
            if (i2 != 0) {
                b3.o oVar4 = (b3.o) bVar.k(i2 - 1);
                if ((oVar4.R & 262144) != 0) {
                    for (b3.o oVar5 = oVar4; oVar5 != null && oVar5.f1777h0; oVar5 = oVar5.Y) {
                        if ((oVar5.L & 262144) != 0) {
                            b3.o oVar6 = oVar5;
                            p2.b bVar2 = null;
                            while (oVar6 != null) {
                                if (oVar6 instanceof q2) {
                                    q2 q2Var2 = (q2) oVar6;
                                    if (nc.k.a(q2Var.k(), q2Var2.k()) && q2Var.getClass() == q2Var2.getClass()) {
                                        p2Var = (p2) lVar.k(q2Var2);
                                    } else {
                                        p2Var = p2.ContinueTraversal;
                                    }
                                    if (p2Var != p2.CancelTraversal) {
                                        if (p2Var == p2.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((oVar6.L & 262144) != 0 && (oVar6 instanceof k)) {
                                    int i10 = 0;
                                    for (b3.o oVar7 = ((k) oVar6).f247j0; oVar7 != null; oVar7 = oVar7.Y) {
                                        if ((oVar7.L & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                oVar6 = oVar7;
                                            } else {
                                                if (bVar2 == null) {
                                                    bVar2 = new p2.b(new b3.o[16]);
                                                }
                                                if (oVar6 != null) {
                                                    bVar2.b(oVar6);
                                                    oVar6 = null;
                                                }
                                                bVar2.b(oVar7);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVar6 = e(bVar2);
                            }
                            continue;
                        }
                    }
                }
                b(bVar, oVar4);
            } else {
                return;
            }
        }
    }
}
