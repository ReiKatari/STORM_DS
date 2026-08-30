package g3;

import a4.n1;
import a4.o0;
import a4.q0;
import a4.r1;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d {
    public static final boolean A(int i2, q0 q0Var, g0 g0Var, h3.c cVar) {
        g0 g10;
        p2.b bVar = new p2.b(new g0[16]);
        if (!g0Var.A.f1777h0) {
            x3.a.c("visitChildren called on an unattached node");
        }
        p2.b bVar2 = new p2.b(new b3.o[16]);
        b3.o oVar = g0Var.A;
        b3.o oVar2 = oVar.Y;
        if (oVar2 == null) {
            a4.l.b(bVar2, oVar);
        } else {
            bVar2.b(oVar2);
        }
        while (true) {
            int i10 = bVar2.L;
            if (i10 == 0) {
                break;
            }
            b3.o oVar3 = (b3.o) bVar2.k(i10 - 1);
            if ((oVar3.R & 1024) == 0) {
                a4.l.b(bVar2, oVar3);
            } else {
                while (true) {
                    if (oVar3 == null) {
                        break;
                    } else if ((oVar3.L & 1024) != 0) {
                        p2.b bVar3 = null;
                        while (oVar3 != null) {
                            if (oVar3 instanceof g0) {
                                g0 g0Var2 = (g0) oVar3;
                                if (g0Var2.f1777h0) {
                                    bVar.b(g0Var2);
                                }
                            } else if ((oVar3.L & 1024) != 0 && (oVar3 instanceof a4.k)) {
                                int i11 = 0;
                                for (b3.o oVar4 = ((a4.k) oVar3).f247j0; oVar4 != null; oVar4 = oVar4.Y) {
                                    if ((oVar4.L & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            oVar3 = oVar4;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new p2.b(new b3.o[16]);
                                            }
                                            if (oVar3 != null) {
                                                bVar3.b(oVar3);
                                                oVar3 = null;
                                            }
                                            bVar3.b(oVar4);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            oVar3 = a4.l.e(bVar3);
                        }
                    } else {
                        oVar3 = oVar3.Y;
                    }
                }
            }
        }
        while (bVar.L != 0 && (g10 = g(bVar, cVar, i2)) != null) {
            if (g10.Q0().f5537a) {
                return ((Boolean) q0Var.k(g10)).booleanValue();
            }
            if (m(i2, q0Var, g10, cVar)) {
                return true;
            }
            bVar.j(g10);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0197 A[EDGE_INSN: B:160:0x0197->B:127:0x0197 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean B(g3.g0 r12, g3.g0 r13, int r14, a4.q0 r15) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.d.B(g3.g0, g3.g0, int, a4.q0):boolean");
    }

    public static final Boolean C(int i2, q0 q0Var, g0 g0Var, h3.c cVar) {
        e0 T0 = g0Var.T0();
        int[] iArr = m0.f5525a;
        int i10 = iArr[T0.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    if (g0Var.Q0().f5537a) {
                        return (Boolean) q0Var.k(g0Var);
                    }
                    if (cVar == null) {
                        return Boolean.valueOf(h(g0Var, i2, q0Var));
                    }
                    return Boolean.valueOf(A(i2, q0Var, g0Var, cVar));
                }
                m9.o.o();
                return null;
            }
            return Boolean.valueOf(h(g0Var, i2, q0Var));
        }
        g0 o5 = o(g0Var);
        if (o5 != null) {
            int i11 = iArr[o5.T0().ordinal()];
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 4) {
                        m9.o.o();
                        return null;
                    }
                    a0.j.p("ActiveParent must have a focusedChild");
                    return null;
                }
                if (cVar == null) {
                    cVar = j(o5);
                }
                return Boolean.valueOf(m(i2, q0Var, g0Var, cVar));
            }
            Boolean C = C(i2, q0Var, o5, cVar);
            if (!nc.k.a(C, Boolean.FALSE)) {
                return C;
            }
            if (cVar == null) {
                if (o5.T0() == e0.ActiveParent) {
                    g0 f8 = f(o5);
                    if (f8 != null) {
                        cVar = j(f8);
                    } else {
                        a0.j.p("ActiveParent must have a focusedChild");
                        return null;
                    }
                } else {
                    a0.j.p("Searching for active node in inactive hierarchy");
                    return null;
                }
            }
            return Boolean.valueOf(m(i2, q0Var, g0Var, cVar));
        }
        a0.j.p("ActiveParent must have a focusedChild");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(g3.g0 r9, a4.q0 r10) {
        /*
            g3.e0 r0 = r9.T0()
            int[] r1 = g3.k0.f5523a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r0 == r6) goto L40
            if (r0 == r5) goto L3b
            if (r0 == r3) goto L3b
            if (r0 != r2) goto L36
            boolean r0 = x(r9, r10)
            if (r0 != 0) goto L89
            g3.u r0 = r9.Q0()
            boolean r0 = r0.f5537a
            if (r0 == 0) goto L32
            java.lang.Object r9 = r10.k(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            goto L33
        L32:
            r9 = r4
        L33:
            if (r9 == 0) goto L88
            goto L89
        L36:
            m9.o.o()
        L39:
            r9 = 0
            return r9
        L3b:
            boolean r9 = x(r9, r10)
            return r9
        L40:
            g3.g0 r0 = o(r9)
            java.lang.String r7 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L8a
            g3.e0 r8 = r0.T0()
            int r8 = r8.ordinal()
            r1 = r1[r8]
            if (r1 == r6) goto L67
            if (r1 == r5) goto L62
            if (r1 == r3) goto L62
            if (r1 == r2) goto L5e
            m9.o.o()
            goto L39
        L5e:
            a0.j.p(r7)
            goto L39
        L62:
            boolean r9 = n(r9, r0, r5, r10)
            return r9
        L67:
            boolean r1 = a(r0, r10)
            if (r1 != 0) goto L89
            boolean r9 = n(r9, r0, r5, r10)
            if (r9 != 0) goto L89
            g3.u r9 = r0.Q0()
            boolean r9 = r9.f5537a
            if (r9 == 0) goto L88
            java.lang.Object r9 = r10.k(r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L88
            goto L89
        L88:
            return r4
        L89:
            return r6
        L8a:
            a0.j.p(r7)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.d.a(g3.g0, a4.q0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r11 >= r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r10 <= r7) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r9 >= r6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r8 <= r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        if (r21 != 3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        if (r21 != 4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
        if (r21 != 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        r1 = r11 - r19.f6054c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
        if (r21 != 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
        r1 = r19.f6052a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
        if (r21 != 5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
        r1 = r9 - r19.f6055d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        if (r21 != 6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        r1 = r19.f6053b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
        if (r1 >= 0.0f) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
        if (r21 != 3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
        if (r21 != 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
        if (r21 != 5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
        if (r21 != 6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
        if (r11 >= 1.0f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
        if (r1 >= r11) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
        a0.j.p("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
        a0.j.p("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(h3.c r18, h3.c r19, h3.c r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = c(r3, r2, r0)
            float r5 = r2.f6053b
            float r6 = r2.f6055d
            float r7 = r2.f6052a
            float r2 = r2.f6054c
            float r8 = r0.f6055d
            float r9 = r0.f6053b
            float r10 = r0.f6054c
            float r11 = r0.f6052a
            r12 = 0
            if (r4 != 0) goto L9e
            boolean r0 = c(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9e
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L99
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L99
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L99
            goto L4a
        L44:
            if (r3 != r13) goto L9a
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L99
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.f6054c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.f6052a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.f6055d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L95
            float r1 = r1.f6053b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            a0.j.p(r4)
        L93:
            r0 = 0
            return r0
        L95:
            a0.j.p(r4)
            goto L93
        L99:
            return r18
        L9a:
            a0.j.p(r4)
            goto L93
        L9e:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.d.b(h3.c, h3.c, h3.c, int):boolean");
    }

    public static final boolean c(int i2, h3.c cVar, h3.c cVar2) {
        if (i2 == 3 || i2 == 4) {
            if (cVar.f6055d <= cVar2.f6053b || cVar.f6053b >= cVar2.f6055d) {
                return false;
            }
            return true;
        } else if (i2 == 5 || i2 == 6) {
            if (cVar.f6054c <= cVar2.f6052a || cVar.f6052a >= cVar2.f6054c) {
                return false;
            }
            return true;
        } else {
            a0.j.p("This function should only be used for 2-D focus search");
            return false;
        }
    }

    public static final boolean d(g0 g0Var, boolean z10) {
        boolean z11;
        int i2 = h0.f5514a[g0Var.T0().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        m9.o.o();
                        return false;
                    }
                } else {
                    g0 o5 = o(g0Var);
                    if (o5 != null) {
                        z11 = d(o5, z10);
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        g0Var.P0(e0.ActiveParent, e0.Inactive);
                        return true;
                    }
                    return false;
                }
            } else {
                return z10;
            }
        }
        return true;
    }

    public static final void e(g0 g0Var, p2.b bVar) {
        if (!g0Var.A.f1777h0) {
            x3.a.c("visitChildren called on an unattached node");
        }
        p2.b bVar2 = new p2.b(new b3.o[16]);
        b3.o oVar = g0Var.A;
        b3.o oVar2 = oVar.Y;
        if (oVar2 == null) {
            a4.l.b(bVar2, oVar);
        } else {
            bVar2.b(oVar2);
        }
        while (true) {
            int i2 = bVar2.L;
            if (i2 != 0) {
                b3.o oVar3 = (b3.o) bVar2.k(i2 - 1);
                if ((oVar3.R & 1024) == 0) {
                    a4.l.b(bVar2, oVar3);
                } else {
                    while (true) {
                        if (oVar3 == null) {
                            break;
                        } else if ((oVar3.L & 1024) != 0) {
                            p2.b bVar3 = null;
                            while (oVar3 != null) {
                                if (oVar3 instanceof g0) {
                                    g0 g0Var2 = (g0) oVar3;
                                    if (g0Var2.f1777h0 && !a4.l.t(g0Var2).J0) {
                                        if (g0Var2.Q0().f5537a) {
                                            bVar.b(g0Var2);
                                        } else {
                                            e(g0Var2, bVar);
                                        }
                                    }
                                } else if ((oVar3.L & 1024) != 0 && (oVar3 instanceof a4.k)) {
                                    int i10 = 0;
                                    for (b3.o oVar4 = ((a4.k) oVar3).f247j0; oVar4 != null; oVar4 = oVar4.Y) {
                                        if ((oVar4.L & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                oVar3 = oVar4;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new p2.b(new b3.o[16]);
                                                }
                                                if (oVar3 != null) {
                                                    bVar3.b(oVar3);
                                                    oVar3 = null;
                                                }
                                                bVar3.b(oVar4);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVar3 = a4.l.e(bVar3);
                            }
                        } else {
                            oVar3 = oVar3.Y;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public static final g0 f(g0 g0Var) {
        g0 f8 = ((p) ((b4.x) a4.l.u(g0Var)).getFocusOwner()).f();
        if (f8 != null && f8.f1777h0) {
            return f8;
        }
        return null;
    }

    public static final g0 g(p2.b bVar, h3.c cVar, int i2) {
        h3.c h2;
        if (i2 == 3) {
            h2 = cVar.h((cVar.f6054c - cVar.f6052a) + 1, 0.0f);
        } else if (i2 == 4) {
            h2 = cVar.h(-((cVar.f6054c - cVar.f6052a) + 1), 0.0f);
        } else if (i2 == 5) {
            h2 = cVar.h(0.0f, (cVar.f6055d - cVar.f6053b) + 1);
        } else if (i2 == 6) {
            h2 = cVar.h(0.0f, -((cVar.f6055d - cVar.f6053b) + 1));
        } else {
            a0.j.p("This function should only be used for 2-D focus search");
            return null;
        }
        Object[] objArr = bVar.A;
        int i10 = bVar.L;
        g0 g0Var = null;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (s(g0Var2)) {
                h3.c j2 = j(g0Var2);
                if (p(j2, h2, cVar, i2)) {
                    g0Var = g0Var2;
                    h2 = j2;
                }
            }
        }
        return g0Var;
    }

    public static final boolean h(g0 g0Var, int i2, mc.l lVar) {
        h3.c cVar;
        Object obj;
        p2.b bVar = new p2.b(new g0[16]);
        e(g0Var, bVar);
        int i10 = bVar.L;
        if (i10 <= 1) {
            if (i10 == 0) {
                obj = null;
            } else {
                obj = bVar.A[0];
            }
            g0 g0Var2 = (g0) obj;
            if (g0Var2 != null) {
                return ((Boolean) lVar.k(g0Var2)).booleanValue();
            }
        } else {
            if (i2 == 7) {
                i2 = 4;
            }
            if (i2 == 4 || i2 == 6) {
                h3.c j2 = j(g0Var);
                float f8 = j2.f6052a;
                float f10 = j2.f6053b;
                cVar = new h3.c(f8, f10, f8, f10);
            } else if (i2 == 3 || i2 == 5) {
                h3.c j10 = j(g0Var);
                float f11 = j10.f6054c;
                float f12 = j10.f6055d;
                cVar = new h3.c(f11, f12, f11, f12);
            } else {
                a0.j.p("This function should only be used for 2-D focus search");
                return false;
            }
            g0 g10 = g(bVar, cVar, i2);
            if (g10 != null) {
                return ((Boolean) lVar.k(g10)).booleanValue();
            }
        }
        return false;
    }

    public static final b3.p i(b3.p pVar, mc.l lVar) {
        return pVar.f(new s(new v(lVar)));
    }

    public static final h3.c j(g0 g0Var) {
        r1 r1Var;
        if (g0Var.f1777h0 && (r1Var = g0Var.f1771b0) != null) {
            y3.z i2 = y3.c0.i(r1Var);
            if (!i2.U()) {
                i2 = null;
            }
            if (i2 != null) {
                return g0Var.R0(i2);
            }
        }
        return h3.c.f6051e;
    }

    public static final b3.p k(b3.p pVar, z zVar) {
        return pVar.f(new a0(zVar));
    }

    public static final boolean l(g0 g0Var, q0 q0Var) {
        int i2 = k0.f5523a[g0Var.T0().ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    if (g0Var.Q0().f5537a) {
                        return ((Boolean) q0Var.k(g0Var)).booleanValue();
                    }
                    return y(g0Var, q0Var);
                }
                m9.o.o();
                return false;
            }
            return y(g0Var, q0Var);
        }
        g0 o5 = o(g0Var);
        if (o5 != null) {
            if (l(o5, q0Var) || n(g0Var, o5, 1, q0Var)) {
                return true;
            }
            return false;
        }
        a0.j.p("ActiveParent must have a focusedChild");
        return false;
    }

    public static final boolean m(int i2, q0 q0Var, g0 g0Var, h3.c cVar) {
        if (A(i2, q0Var, g0Var, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) z(g0Var, i2, new l0(((p) ((b4.x) a4.l.u(g0Var)).getFocusOwner()).f(), g0Var, cVar, i2, q0Var, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean n(g0 g0Var, g0 g0Var2, int i2, q0 q0Var) {
        if (B(g0Var, g0Var2, i2, q0Var)) {
            return true;
        }
        Boolean bool = (Boolean) z(g0Var, i2, new l0(((p) ((b4.x) a4.l.u(g0Var)).getFocusOwner()).f(), g0Var, g0Var2, i2, q0Var, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final g3.g0 o(g3.g0 r8) {
        /*
            b3.o r0 = r8.A
            boolean r0 = r0.f1777h0
            r1 = 0
            if (r0 != 0) goto L9
            goto Laf
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            x3.a.c(r0)
        L10:
            p2.b r0 = new p2.b
            r2 = 16
            b3.o[] r3 = new b3.o[r2]
            r0.<init>(r3)
            b3.o r8 = r8.A
            b3.o r3 = r8.Y
            if (r3 != 0) goto L23
            a4.l.b(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.L
            if (r8 == 0) goto Laf
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.k(r8)
            b3.o r8 = (b3.o) r8
            int r3 = r8.R
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            a4.l.b(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.L
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto Lac
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof g3.g0
            r5 = 1
            if (r4 == 0) goto L71
            g3.g0 r8 = (g3.g0) r8
            b3.o r4 = r8.A
            boolean r4 = r4.f1777h0
            if (r4 == 0) goto La7
            g3.e0 r4 = r8.T0()
            int[] r6 = g3.i0.f5521b
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r5) goto L70
            r5 = 2
            if (r4 == r5) goto L70
            r5 = 3
            if (r4 == r5) goto L70
            r8 = 4
            if (r4 != r8) goto L6c
            goto La7
        L6c:
            m9.o.o()
            r8 = 0
        L70:
            return r8
        L71:
            int r4 = r8.L
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La7
            boolean r4 = r8 instanceof a4.k
            if (r4 == 0) goto La7
            r4 = r8
            a4.k r4 = (a4.k) r4
            b3.o r4 = r4.f247j0
            r6 = 0
        L81:
            if (r4 == 0) goto La4
            int r7 = r4.L
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto La1
            int r6 = r6 + 1
            if (r6 != r5) goto L8f
            r8 = r4
            goto La1
        L8f:
            if (r3 != 0) goto L98
            p2.b r3 = new p2.b
            b3.o[] r7 = new b3.o[r2]
            r3.<init>(r7)
        L98:
            if (r8 == 0) goto L9e
            r3.b(r8)
            r8 = r1
        L9e:
            r3.b(r4)
        La1:
            b3.o r4 = r4.Y
            goto L81
        La4:
            if (r6 != r5) goto La7
            goto L45
        La7:
            b3.o r8 = a4.l.e(r3)
            goto L45
        Lac:
            b3.o r8 = r8.Y
            goto L3c
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.d.o(g3.g0):g3.g0");
    }

    public static final boolean p(h3.c cVar, h3.c cVar2, h3.c cVar3, int i2) {
        if (q(i2, cVar, cVar3)) {
            if (q(i2, cVar2, cVar3) && !b(cVar3, cVar, cVar2, i2)) {
                if (!b(cVar3, cVar2, cVar, i2) && r(i2, cVar3, cVar) < r(i2, cVar3, cVar2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean q(int i2, h3.c cVar, h3.c cVar2) {
        if (i2 == 3) {
            float f8 = cVar2.f6054c;
            float f10 = cVar2.f6052a;
            float f11 = cVar.f6054c;
            if ((f8 <= f11 && f10 < f11) || f10 <= cVar.f6052a) {
                return false;
            }
            return true;
        } else if (i2 == 4) {
            float f12 = cVar2.f6052a;
            float f13 = cVar2.f6054c;
            float f14 = cVar.f6052a;
            if ((f12 >= f14 && f13 > f14) || f13 >= cVar.f6054c) {
                return false;
            }
            return true;
        } else if (i2 == 5) {
            float f15 = cVar2.f6055d;
            float f16 = cVar2.f6053b;
            float f17 = cVar.f6055d;
            if ((f15 <= f17 && f16 < f17) || f16 <= cVar.f6053b) {
                return false;
            }
            return true;
        } else if (i2 == 6) {
            float f18 = cVar2.f6053b;
            float f19 = cVar2.f6055d;
            float f20 = cVar.f6053b;
            if ((f18 >= f20 && f19 > f20) || f19 >= cVar.f6055d) {
                return false;
            }
            return true;
        } else {
            a0.j.p("This function should only be used for 2-D focus search");
            return false;
        }
    }

    public static final long r(int i2, h3.c cVar, h3.c cVar2) {
        float f8;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (i2 == 3) {
            f8 = cVar.f6052a;
            f10 = cVar2.f6054c;
        } else if (i2 == 4) {
            f8 = cVar2.f6052a;
            f10 = cVar.f6054c;
        } else if (i2 == 5) {
            f8 = cVar.f6053b;
            f10 = cVar2.f6055d;
        } else if (i2 == 6) {
            f8 = cVar2.f6053b;
            f10 = cVar.f6055d;
        } else {
            a0.j.p("This function should only be used for 2-D focus search");
            return 0L;
        }
        float f15 = f8 - f10;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        long j2 = f15;
        if (i2 == 3 || i2 == 4) {
            float f16 = cVar.f6053b;
            f11 = 2;
            f12 = ((cVar.f6055d - f16) / f11) + f16;
            f13 = cVar2.f6053b;
            f14 = cVar2.f6055d;
        } else if (i2 == 5 || i2 == 6) {
            float f17 = cVar.f6052a;
            f11 = 2;
            f12 = ((cVar.f6054c - f17) / f11) + f17;
            f13 = cVar2.f6052a;
            f14 = cVar2.f6054c;
        } else {
            a0.j.p("This function should only be used for 2-D focus search");
            return 0L;
        }
        long j10 = f12 - (((f14 - f13) / f11) + f13);
        return (j10 * j10) + (13 * j2 * j2);
    }

    public static final boolean s(g0 g0Var) {
        o0 o0Var;
        r1 r1Var;
        o0 o0Var2;
        r1 r1Var2 = g0Var.f1771b0;
        if (r1Var2 != null && (o0Var = r1Var2.f315i0) != null && o0Var.I() && (r1Var = g0Var.f1771b0) != null && (o0Var2 = r1Var.f315i0) != null && o0Var2.H()) {
            return true;
        }
        return false;
    }

    public static final b3.p t(b3.p pVar, mc.l lVar) {
        return pVar.f(new c(lVar));
    }

    public static final b u(g0 g0Var, int i2) {
        int i10 = h0.f5514a[g0Var.T0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                b bVar = null;
                if (i10 != 3) {
                    if (i10 != 4) {
                        m9.o.o();
                        return null;
                    }
                } else {
                    g0 o5 = o(g0Var);
                    if (o5 != null) {
                        b u4 = u(o5, i2);
                        b bVar2 = b.None;
                        if (u4 != bVar2) {
                            bVar = u4;
                        }
                        if (bVar == null) {
                            if (!g0Var.f5509j0) {
                                g0Var.f5509j0 = true;
                                try {
                                    u Q0 = g0Var.Q0();
                                    a aVar = new a(i2);
                                    p pVar = (p) ((b4.x) a4.l.u(g0Var)).getFocusOwner();
                                    g0 f8 = pVar.f();
                                    Q0.f5547k.k(aVar);
                                    g0 f10 = pVar.f();
                                    if (aVar.f5498b) {
                                        z zVar = z.f5551b;
                                        return b.Cancelled;
                                    } else if (f8 != f10 && f10 != null) {
                                        if (z.f5553d == z.f5552c) {
                                            return b.Cancelled;
                                        }
                                        return b.Redirected;
                                    } else {
                                        return bVar2;
                                    }
                                } finally {
                                    g0Var.f5509j0 = false;
                                }
                            }
                            return bVar2;
                        }
                        return bVar;
                    }
                    a0.j.h("ActiveParent with no focused child");
                    return null;
                }
            } else {
                return b.Cancelled;
            }
        }
        return b.None;
    }

    public static final b v(g0 g0Var) {
        if (!g0Var.f5510k0) {
            g0Var.f5510k0 = true;
            try {
                u Q0 = g0Var.Q0();
                p pVar = (p) ((b4.x) a4.l.u(g0Var)).getFocusOwner();
                g0 f8 = pVar.f();
                Q0.f5546j.getClass();
                g0 f10 = pVar.f();
                if (f8 != f10 && f10 != null) {
                    if (z.f5553d == z.f5552c) {
                        return b.Cancelled;
                    }
                    return b.Redirected;
                }
            } finally {
                g0Var.f5510k0 = false;
            }
        }
        return b.None;
    }

    public static final b w(g0 g0Var, int i2) {
        b bVar;
        g0 g0Var2;
        n1 n1Var;
        int i10 = h0.f5514a[g0Var.T0().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    if (!g0Var.A.f1777h0) {
                        x3.a.c("visitAncestors called on an unattached node");
                    }
                    b3.o oVar = g0Var.A.X;
                    o0 t5 = a4.l.t(g0Var);
                    loop0: while (true) {
                        bVar = null;
                        if (t5 != null) {
                            if ((t5.A0.f268f.R & 1024) != 0) {
                                while (oVar != null) {
                                    if ((oVar.L & 1024) != 0) {
                                        g0Var2 = oVar;
                                        p2.b bVar2 = null;
                                        while (g0Var2 != null) {
                                            if (g0Var2 instanceof g0) {
                                                break loop0;
                                            }
                                            if ((g0Var2.L & 1024) != 0 && (g0Var2 instanceof a4.k)) {
                                                int i11 = 0;
                                                for (b3.o oVar2 = ((a4.k) g0Var2).f247j0; oVar2 != null; oVar2 = oVar2.Y) {
                                                    if ((oVar2.L & 1024) != 0) {
                                                        i11++;
                                                        if (i11 == 1) {
                                                            g0Var2 = oVar2;
                                                        } else {
                                                            if (bVar2 == null) {
                                                                bVar2 = new p2.b(new b3.o[16]);
                                                            }
                                                            if (g0Var2 != null) {
                                                                bVar2.b(g0Var2);
                                                                g0Var2 = null;
                                                            }
                                                            bVar2.b(oVar2);
                                                        }
                                                    }
                                                }
                                                if (i11 == 1) {
                                                }
                                            }
                                            g0Var2 = a4.l.e(bVar2);
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
                        } else {
                            g0Var2 = null;
                            break;
                        }
                    }
                    g0 g0Var3 = g0Var2;
                    if (g0Var3 == null) {
                        return b.None;
                    }
                    int i12 = h0.f5514a[g0Var3.T0().ordinal()];
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 4) {
                                    b w10 = w(g0Var3, i2);
                                    if (w10 != b.None) {
                                        bVar = w10;
                                    }
                                    if (bVar == null) {
                                        return v(g0Var3);
                                    }
                                    return bVar;
                                }
                                m9.o.o();
                                return null;
                            }
                            return w(g0Var3, i2);
                        }
                        return b.Cancelled;
                    }
                    return v(g0Var3);
                }
                m9.o.o();
                return null;
            }
            g0 o5 = o(g0Var);
            if (o5 != null) {
                return u(o5, i2);
            }
            a0.j.h("ActiveParent with no focused child");
            return null;
        }
        return b.None;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean x(g0 g0Var, q0 q0Var) {
        g0[] g0VarArr = new g0[16];
        if (!g0Var.A.f1777h0) {
            x3.a.c("visitChildren called on an unattached node");
        }
        p2.b bVar = new p2.b(new b3.o[16]);
        b3.o oVar = g0Var.A;
        b3.o oVar2 = oVar.Y;
        if (oVar2 == null) {
            a4.l.b(bVar, oVar);
        } else {
            bVar.b(oVar2);
        }
        int i2 = 0;
        while (true) {
            int i10 = bVar.L;
            if (i10 == 0) {
                break;
            }
            b3.o oVar3 = (b3.o) bVar.k(i10 - 1);
            if ((oVar3.R & 1024) == 0) {
                a4.l.b(bVar, oVar3);
            } else {
                while (true) {
                    if (oVar3 == null) {
                        break;
                    } else if ((oVar3.L & 1024) != 0) {
                        p2.b bVar2 = null;
                        while (oVar3 != null) {
                            if (oVar3 instanceof g0) {
                                g0 g0Var2 = (g0) oVar3;
                                int i11 = i2 + 1;
                                if (g0VarArr.length < i11) {
                                    int length = g0VarArr.length;
                                    ?? r10 = new Object[Math.max(i11, length * 2)];
                                    System.arraycopy(g0VarArr, 0, r10, 0, length);
                                    g0VarArr = r10;
                                }
                                g0VarArr[i2] = g0Var2;
                                i2 = i11;
                            } else if ((oVar3.L & 1024) != 0 && (oVar3 instanceof a4.k)) {
                                int i12 = 0;
                                for (b3.o oVar4 = ((a4.k) oVar3).f247j0; oVar4 != null; oVar4 = oVar4.Y) {
                                    if ((oVar4.L & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            oVar3 = oVar4;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new p2.b(new b3.o[16]);
                                            }
                                            if (oVar3 != null) {
                                                bVar2.b(oVar3);
                                                oVar3 = null;
                                            }
                                            bVar2.b(oVar4);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            oVar3 = a4.l.e(bVar2);
                        }
                    } else {
                        oVar3 = oVar3.Y;
                    }
                }
            }
        }
        Arrays.sort(g0VarArr, 0, i2, j0.f5522a);
        int i13 = i2 - 1;
        if (i13 < g0VarArr.length) {
            while (i13 >= 0) {
                g0 g0Var3 = g0VarArr[i13];
                if (s(g0Var3) && a(g0Var3, q0Var)) {
                    return true;
                }
                i13--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean y(g0 g0Var, q0 q0Var) {
        g0[] g0VarArr = new g0[16];
        if (!g0Var.A.f1777h0) {
            x3.a.c("visitChildren called on an unattached node");
        }
        p2.b bVar = new p2.b(new b3.o[16]);
        b3.o oVar = g0Var.A;
        b3.o oVar2 = oVar.Y;
        if (oVar2 == null) {
            a4.l.b(bVar, oVar);
        } else {
            bVar.b(oVar2);
        }
        int i2 = 0;
        while (true) {
            int i10 = bVar.L;
            if (i10 == 0) {
                break;
            }
            b3.o oVar3 = (b3.o) bVar.k(i10 - 1);
            if ((oVar3.R & 1024) == 0) {
                a4.l.b(bVar, oVar3);
            } else {
                while (true) {
                    if (oVar3 == null) {
                        break;
                    } else if ((oVar3.L & 1024) != 0) {
                        p2.b bVar2 = null;
                        while (oVar3 != null) {
                            if (oVar3 instanceof g0) {
                                g0 g0Var2 = (g0) oVar3;
                                int i11 = i2 + 1;
                                if (g0VarArr.length < i11) {
                                    int length = g0VarArr.length;
                                    ?? r10 = new Object[Math.max(i11, length * 2)];
                                    System.arraycopy(g0VarArr, 0, r10, 0, length);
                                    g0VarArr = r10;
                                }
                                g0VarArr[i2] = g0Var2;
                                i2 = i11;
                            } else if ((oVar3.L & 1024) != 0 && (oVar3 instanceof a4.k)) {
                                int i12 = 0;
                                for (b3.o oVar4 = ((a4.k) oVar3).f247j0; oVar4 != null; oVar4 = oVar4.Y) {
                                    if ((oVar4.L & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            oVar3 = oVar4;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new p2.b(new b3.o[16]);
                                            }
                                            if (oVar3 != null) {
                                                bVar2.b(oVar3);
                                                oVar3 = null;
                                            }
                                            bVar2.b(oVar4);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            oVar3 = a4.l.e(bVar2);
                        }
                    } else {
                        oVar3 = oVar3.Y;
                    }
                }
            }
        }
        Arrays.sort(g0VarArr, 0, i2, j0.f5522a);
        for (int i13 = 0; i13 < i2; i13++) {
            g0 g0Var3 = g0VarArr[i13];
            if (s(g0Var3) && l(g0Var3, q0Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [nc.t, java.lang.Object] */
    public static final Object z(g0 g0Var, int i2, mc.l lVar) {
        int i10;
        int i11;
        Object obj;
        g0 g0Var2;
        p1.p S0;
        int e6;
        n1 n1Var;
        if (!g0Var.A.f1777h0) {
            x3.a.c("visitAncestors called on an unattached node");
        }
        b3.o oVar = g0Var.A.X;
        o0 t5 = a4.l.t(g0Var);
        loop0: while (true) {
            i10 = 0;
            i11 = 1;
            obj = null;
            if (t5 != null) {
                if ((t5.A0.f268f.R & 1024) != 0) {
                    while (oVar != null) {
                        if ((oVar.L & 1024) != 0) {
                            g0Var2 = oVar;
                            p2.b bVar = null;
                            while (g0Var2 != null) {
                                if (g0Var2 instanceof g0) {
                                    break loop0;
                                }
                                if ((g0Var2.L & 1024) != 0 && (g0Var2 instanceof a4.k)) {
                                    int i12 = 0;
                                    for (b3.o oVar2 = ((a4.k) g0Var2).f247j0; oVar2 != null; oVar2 = oVar2.Y) {
                                        if ((oVar2.L & 1024) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                g0Var2 = oVar2;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new p2.b(new b3.o[16]);
                                                }
                                                if (g0Var2 != null) {
                                                    bVar.b(g0Var2);
                                                    g0Var2 = null;
                                                }
                                                bVar.b(oVar2);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                g0Var2 = a4.l.e(bVar);
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
            } else {
                g0Var2 = null;
                break;
            }
        }
        g0 g0Var3 = g0Var2;
        if ((g0Var3 != null && nc.k.a(g0Var3.S0(), g0Var.S0())) || (S0 = g0Var.S0()) == null) {
            return null;
        }
        int i13 = 5;
        if (i2 != 5) {
            i13 = 6;
            if (i2 != 6) {
                i13 = 3;
                if (i2 != 3) {
                    i13 = 4;
                    if (i2 != 4) {
                        if (i2 == 1) {
                            i11 = 2;
                        } else if (i2 != 2) {
                            a0.j.p("Unsupported direction for beyond bounds layout");
                            return null;
                        }
                        if (S0.f11245i0.a() <= 0 && S0.f11245i0.c() && S0.f1777h0) {
                            boolean P0 = S0.P0(i11);
                            p1.q qVar = S0.f11245i0;
                            if (P0) {
                                e6 = qVar.b();
                            } else {
                                e6 = qVar.e();
                            }
                            ?? obj2 = new Object();
                            h1.a aVar = S0.f11246j0;
                            aVar.getClass();
                            p1.j jVar = new p1.j(e6, e6);
                            aVar.f5838a.b(jVar);
                            obj2.A = jVar;
                            int d4 = S0.f11245i0.d() * 2;
                            int a10 = S0.f11245i0.a();
                            if (d4 > a10) {
                                d4 = a10;
                            }
                            while (obj == null && S0.O0((p1.j) obj2.A, i11) && i10 < d4) {
                                p1.j jVar2 = (p1.j) obj2.A;
                                int i14 = jVar2.f11217a;
                                int i15 = jVar2.f11218b;
                                if (S0.P0(i11)) {
                                    i15++;
                                } else {
                                    i14--;
                                }
                                h1.a aVar2 = S0.f11246j0;
                                aVar2.getClass();
                                p1.j jVar3 = new p1.j(i14, i15);
                                aVar2.f5838a.b(jVar3);
                                S0.f11246j0.f5838a.j((p1.j) obj2.A);
                                obj2.A = jVar3;
                                i10++;
                                a4.l.t(S0).k();
                                obj = lVar.k(new p1.o(S0, obj2, i11));
                            }
                            S0.f11246j0.f5838a.j((p1.j) obj2.A);
                            a4.l.t(S0).k();
                            return obj;
                        }
                        return lVar.k(p1.p.f11244l0);
                    }
                }
            }
        }
        i11 = i13;
        if (S0.f11245i0.a() <= 0) {
        }
        return lVar.k(p1.p.f11244l0);
    }
}
