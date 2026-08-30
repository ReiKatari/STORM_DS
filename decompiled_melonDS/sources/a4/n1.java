package a4;

import java.util.HashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f263a;

    /* renamed from: b  reason: collision with root package name */
    public final m1 f264b;

    /* renamed from: c  reason: collision with root package name */
    public final v f265c;

    /* renamed from: d  reason: collision with root package name */
    public r1 f266d;

    /* renamed from: e  reason: collision with root package name */
    public final n2 f267e;

    /* renamed from: f  reason: collision with root package name */
    public b3.o f268f;

    /* renamed from: g  reason: collision with root package name */
    public p2.b f269g;

    /* renamed from: h  reason: collision with root package name */
    public p2.b f270h;

    /* renamed from: i  reason: collision with root package name */
    public final p2.b f271i;

    /* renamed from: j  reason: collision with root package name */
    public l1 f272j;

    /* JADX WARN: Type inference failed for: r0v0, types: [a4.m1, b3.o] */
    public n1(o0 o0Var) {
        this.f263a = o0Var;
        ?? oVar = new b3.o();
        oVar.R = -1;
        this.f264b = oVar;
        v vVar = new v(o0Var);
        this.f265c = vVar;
        this.f266d = vVar;
        n2 n2Var = vVar.N0;
        this.f267e = n2Var;
        this.f268f = n2Var;
        this.f271i = new p2.b(new b3.p[16]);
    }

    public static final void a(n1 n1Var, b3.o oVar, r1 r1Var) {
        v vVar;
        for (b3.o oVar2 = oVar.X; oVar2 != null; oVar2 = oVar2.X) {
            if (oVar2 == n1Var.f264b) {
                o0 u4 = n1Var.f263a.u();
                if (u4 != null) {
                    vVar = u4.A0.f265c;
                } else {
                    vVar = null;
                }
                r1Var.f319m0 = vVar;
                n1Var.f266d = r1Var;
                return;
            } else if ((oVar2.L & 2) == 0) {
                oVar2.N0(r1Var);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [a4.c, b3.o] */
    public static b3.o b(b3.n nVar, b3.o oVar) {
        b3.o oVar2;
        if (nVar instanceof j1) {
            oVar2 = ((j1) nVar).e();
            oVar2.L = s1.f(oVar2);
        } else {
            ?? oVar3 = new b3.o();
            oVar3.L = s1.d(nVar);
            oVar3.f157i0 = nVar;
            new HashSet();
            oVar2 = oVar3;
        }
        if (oVar2.f1777h0) {
            x3.a.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        oVar2.f1772c0 = true;
        b3.o oVar4 = oVar.Y;
        if (oVar4 != null) {
            oVar4.X = oVar2;
            oVar2.Y = oVar4;
        }
        oVar.Y = oVar2;
        oVar2.X = oVar;
        return oVar2;
    }

    public static b3.o c(b3.o oVar) {
        boolean z10 = oVar.f1777h0;
        if (z10) {
            a1.d0 d0Var = s1.f333a;
            if (!z10) {
                x3.a.c("autoInvalidateRemovedNode called on unattached node");
            }
            s1.a(oVar, -1, 2);
            oVar.L0();
            oVar.F0();
        }
        b3.o oVar2 = oVar.Y;
        b3.o oVar3 = oVar.X;
        if (oVar2 != null) {
            oVar2.X = oVar3;
            oVar.Y = null;
        }
        if (oVar3 != null) {
            oVar3.Y = oVar2;
            oVar.X = null;
        }
        oVar3.getClass();
        return oVar3;
    }

    public static void h(b3.n nVar, b3.n nVar2, b3.o oVar) {
        if ((nVar instanceof j1) && (nVar2 instanceof j1)) {
            oVar.getClass();
            ((j1) nVar2).g(oVar);
            if (oVar.f1777h0) {
                s1.c(oVar);
            } else {
                oVar.f1773d0 = true;
            }
        } else if (oVar instanceof c) {
            c cVar = (c) oVar;
            boolean z10 = cVar.f1777h0;
            if (z10) {
                if (!z10) {
                    x3.a.c("unInitializeModifier called on unattached node");
                }
                if ((cVar.L & 8) != 0) {
                    ((b4.x) l.u(cVar)).x();
                }
            }
            cVar.f157i0 = nVar2;
            cVar.L = s1.d(nVar2);
            if (cVar.f1777h0) {
                cVar.O0(false);
            }
            if (oVar.f1777h0) {
                s1.c(oVar);
            } else {
                oVar.f1773d0 = true;
            }
        } else {
            x3.a.c("Unknown Modifier.Node type");
        }
    }

    public final boolean d(int i2) {
        if ((i2 & this.f268f.R) != 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        for (b3.o oVar = this.f268f; oVar != null; oVar = oVar.Y) {
            oVar.K0();
            if (oVar.f1772c0) {
                a1.d0 d0Var = s1.f333a;
                if (!oVar.f1777h0) {
                    x3.a.c("autoInvalidateInsertedNode called on unattached node");
                }
                s1.a(oVar, -1, 1);
            }
            if (oVar.f1773d0) {
                s1.c(oVar);
            }
            oVar.f1772c0 = false;
            oVar.f1773d0 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026a, code lost:
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d0, code lost:
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
        if ((r19 & 1) != 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0154, code lost:
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0156, code lost:
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0157, code lost:
        if (r13 > r3) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0159, code lost:
        if (r13 == r12) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015b, code lost:
        if (r13 == r3) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016e, code lost:
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0182, code lost:
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0188, code lost:
        if (r3 == 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018a, code lost:
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018d, code lost:
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
        if (r14 != r11) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0191, code lost:
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0194, code lost:
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0196, code lost:
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a0, code lost:
        if (r14 <= r7) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a2, code lost:
        if (r11 <= r15) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b0, code lost:
        if (r0.b(r14 - 1, r27 - 1) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bd, code lost:
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c1, code lost:
        if (r24 == 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c3, code lost:
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c5, code lost:
        if (r11 < r12) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c7, code lost:
        if (r11 > r3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cd, code lost:
        if (r16[r17 + r11] < r14) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cf, code lost:
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r32, p2.b r33, p2.b r34, b3.o r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.n1.f(int, p2.b, p2.b, b3.o, boolean):void");
    }

    public final void g() {
        o0 o0Var;
        v vVar;
        d0 d0Var;
        b3.o oVar = this.f267e.X;
        r1 r1Var = this.f265c;
        b3.o oVar2 = oVar;
        while (true) {
            o0Var = this.f263a;
            if (oVar2 == null) {
                break;
            }
            a0 f8 = l.f(oVar2);
            if (f8 != null) {
                r1 r1Var2 = oVar2.f1771b0;
                if (r1Var2 != null) {
                    d0 d0Var2 = (d0) r1Var2;
                    a0 a0Var = d0Var2.N0;
                    d0Var2.y1(f8);
                    d0Var = d0Var2;
                    if (a0Var != oVar2) {
                        b2 b2Var = d0Var2.H0;
                        d0Var = d0Var2;
                        if (b2Var != null) {
                            ((b4.y1) b2Var).c();
                            d0Var = d0Var2;
                        }
                    }
                } else {
                    d0 d0Var3 = new d0(o0Var, f8);
                    oVar2.N0(d0Var3);
                    d0Var = d0Var3;
                }
                r1Var.f319m0 = d0Var;
                d0Var.f318l0 = r1Var;
                r1Var = d0Var;
            } else {
                oVar2.N0(r1Var);
            }
            oVar2 = oVar2.X;
        }
        o0 u4 = o0Var.u();
        if (u4 != null) {
            vVar = u4.A0.f265c;
        } else {
            vVar = null;
        }
        r1Var.f319m0 = vVar;
        this.f266d = r1Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        b3.o oVar = this.f268f;
        n2 n2Var = this.f267e;
        if (oVar != n2Var) {
            while (true) {
                if (oVar == null || oVar == n2Var) {
                    break;
                }
                sb2.append(String.valueOf(oVar));
                if (oVar.Y == n2Var) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                oVar = oVar.Y;
            }
        } else {
            sb2.append("]");
        }
        return sb2.toString();
    }
}
