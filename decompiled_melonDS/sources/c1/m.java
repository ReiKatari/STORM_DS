package c1;

import java.util.ListIterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final long f2469a;

    static {
        long j2 = Integer.MIN_VALUE;
        f2469a = (j2 & 4294967295L) | (j2 << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public static final void a(d1.q1 q1Var, b3.p pVar, mc.l lVar, b3.d dVar, mc.l lVar2, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        mc.l lVar3;
        n2.r rVar;
        boolean z11;
        boolean z12;
        boolean z13;
        a3.b bVar;
        v vVar;
        z2.p pVar2;
        v vVar2;
        d1.k1 k1Var;
        boolean z14;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        mc.l lVar4 = lVar;
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(511725103);
        if ((i2 & 6) == 0) {
            if (rVar2.f(q1Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar2.f(pVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i2 & 384) == 0) {
            if (rVar2.h(lVar4)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i2 & 3072) == 0) {
            if (rVar2.f(dVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        }
        if ((i2 & 24576) == 0) {
            if (rVar2.h(lVar2)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        }
        v2.c cVar2 = cVar;
        if ((196608 & i2) == 0) {
            if (rVar2.h(cVar2)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i10 |= i11;
        }
        if ((74899 & i10) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i10 & 1, z10)) {
            x4.m mVar2 = (x4.m) rVar2.j(b4.q1.f1924n);
            int i17 = i10 & 14;
            if (i17 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object L = rVar2.L();
            Object obj = n2.l.f9953a;
            if (z11 || L == obj) {
                L = new v(q1Var, dVar);
                rVar2.h0(L);
            }
            v vVar3 = L;
            if (i17 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object L2 = rVar2.L();
            z2.p pVar3 = L2;
            if (z12 || L2 == obj) {
                z2.p pVar4 = new z2.p();
                pVar4.addAll(zb.k.Q(new Object[]{q1Var.f3649a.c()}));
                rVar2.h0(pVar4);
                pVar3 = pVar4;
            }
            z2.p pVar5 = (z2.p) pVar3;
            if (i17 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            Object L3 = rVar2.L();
            if (z13 || L3 == obj) {
                long[] jArr = a1.u0.f103a;
                L3 = new a1.m0();
                rVar2.h0(L3);
            }
            a1.m0 m0Var = (a1.m0) L3;
            a3.b bVar2 = q1Var.f3649a;
            n2.f1 f1Var = q1Var.f3652d;
            if (!pVar5.contains(bVar2.c())) {
                pVar5.clear();
                pVar5.add(bVar2.c());
            }
            if (nc.k.a(bVar2.c(), f1Var.getValue())) {
                if (pVar5.size() != 1 || !nc.k.a(pVar5.get(0), bVar2.c())) {
                    pVar5.clear();
                    pVar5.add(bVar2.c());
                }
                if (m0Var.f71e != 1 || m0Var.c(bVar2.c())) {
                    m0Var.a();
                }
                vVar3.f2533b = dVar;
            }
            if (!nc.k.a(bVar2.c(), f1Var.getValue()) && !pVar5.contains(f1Var.getValue())) {
                ListIterator listIterator = pVar5.listIterator();
                int i18 = 0;
                while (true) {
                    a4.r rVar3 = (a4.r) listIterator;
                    bVar = bVar2;
                    if (rVar3.hasNext()) {
                        if (nc.k.a(lVar2.k(rVar3.next()), lVar2.k(f1Var.getValue()))) {
                            break;
                        }
                        i18++;
                        bVar2 = bVar;
                    } else {
                        i18 = -1;
                        break;
                    }
                }
                if (i18 == -1) {
                    pVar5.add(f1Var.getValue());
                } else {
                    pVar5.set(i18, f1Var.getValue());
                }
            } else {
                bVar = bVar2;
            }
            if (m0Var.c(f1Var.getValue()) && m0Var.c(bVar.c())) {
                rVar2.X(1925931827);
                rVar2.p(false);
                lVar3 = lVar4;
                vVar = vVar3;
            } else {
                rVar2.X(1966410449);
                m0Var.a();
                int size = pVar5.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj2 = pVar5.get(i19);
                    m0Var.m(obj2, v2.h.c(-23915175, new j(q1Var, obj2, lVar4, vVar3, pVar5, cVar2), rVar2));
                    i19++;
                    lVar4 = lVar4;
                    cVar2 = cVar;
                }
                lVar3 = lVar4;
                vVar = vVar3;
                rVar2.p(false);
            }
            boolean f8 = rVar2.f(q1Var.f()) | rVar2.f(vVar);
            Object L4 = rVar2.L();
            if (f8 || L4 == obj) {
                L4 = (l0) lVar3.k(vVar);
                rVar2.h0(L4);
            }
            l0 l0Var = (l0) L4;
            d1.q1 q1Var2 = vVar.f2532a;
            boolean f10 = rVar2.f(vVar);
            Object L5 = rVar2.L();
            if (f10 || L5 == obj) {
                L5 = n2.s.w(Boolean.FALSE);
                rVar2.h0(L5);
            }
            n2.w0 w0Var = (n2.w0) L5;
            n2.w0 A = n2.s.A(l0Var.f2461d, rVar2);
            if (nc.k.a(q1Var2.f3649a.c(), q1Var2.f3652d.getValue())) {
                w0Var.setValue(Boolean.FALSE);
            } else if (A.getValue() != null) {
                w0Var.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) w0Var.getValue()).booleanValue();
            b3.p pVar6 = b3.m.f1770a;
            if (booleanValue) {
                rVar2.X(1353077497);
                v vVar4 = vVar;
                pVar2 = pVar5;
                rVar = rVar2;
                vVar2 = vVar4;
                k1Var = d1.u1.c(vVar4.f2532a, d1.d.f3551q, null, rVar, 0, 2);
                boolean f11 = rVar.f(k1Var);
                Object L6 = rVar.L();
                if (f11 || L6 == obj) {
                    o2 o2Var = (o2) A.getValue();
                    L6 = f3.g.c(pVar6);
                    rVar.h0(L6);
                }
                pVar6 = (b3.p) L6;
                rVar.p(false);
            } else {
                pVar2 = pVar5;
                rVar = rVar2;
                vVar2 = vVar;
                rVar.X(1353343539);
                rVar.p(false);
                k1Var = null;
            }
            b3.p f12 = pVar.f(pVar6.f(new r(k1Var, A, vVar2)));
            Object L7 = rVar.L();
            if (L7 == obj) {
                L7 = new o(vVar2);
                rVar.h0(L7);
            }
            o oVar = (o) L7;
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(f12, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            n2.s.C(oVar, a4.g.f215e, rVar);
            n2.s.C(l10, a4.g.f214d, rVar);
            n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            n2.s.y(rVar, a4.g.f217g);
            n2.s.C(c4, a4.g.f213c, rVar);
            rVar.X(-860173498);
            int size2 = pVar2.size();
            int i20 = 0;
            while (i20 < size2) {
                z2.p pVar7 = pVar2;
                Object obj3 = pVar7.get(i20);
                rVar.V(-2026002954, lVar2.k(obj3));
                mc.p pVar8 = (mc.p) m0Var.g(obj3);
                if (pVar8 == null) {
                    rVar.X(1618454323);
                    z14 = false;
                } else {
                    z14 = false;
                    rVar.X(-2026001778);
                    pVar8.j(rVar, 0);
                }
                rVar.p(z14);
                rVar.p(z14);
                i20++;
                pVar2 = pVar7;
            }
            rVar.p(false);
            rVar.p(true);
        } else {
            lVar3 = lVar4;
            rVar = rVar2;
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new k(q1Var, pVar, (mc.l) lVar3, dVar, lVar2, cVar, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.Object r17, b3.p r18, mc.l r19, b3.d r20, java.lang.String r21, mc.l r22, v2.c r23, n2.m r24, int r25, int r26) {
        /*
            r1 = r17
            r8 = r25
            r15 = r24
            n2.r r15 = (n2.r) r15
            r0 = 1501828832(0x598416e0, float:4.647481E15)
            r15.Z(r0)
            boolean r0 = r15.f(r1)
            if (r0 == 0) goto L16
            r0 = 4
            goto L17
        L16:
            r0 = 2
        L17:
            r0 = r0 | r8
            r2 = r26 & 2
            if (r2 == 0) goto L21
            r0 = r0 | 48
        L1e:
            r3 = r18
            goto L33
        L21:
            r3 = r8 & 48
            if (r3 != 0) goto L1e
            r3 = r18
            boolean r4 = r15.f(r3)
            if (r4 == 0) goto L30
            r4 = 32
            goto L32
        L30:
            r4 = 16
        L32:
            r0 = r0 | r4
        L33:
            r4 = r26 & 8
            if (r4 == 0) goto L3c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L39:
            r5 = r20
            goto L4e
        L3c:
            r5 = r8 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L39
            r5 = r20
            boolean r6 = r15.f(r5)
            if (r6 == 0) goto L4b
            r6 = 2048(0x800, float:2.87E-42)
            goto L4d
        L4b:
            r6 = 1024(0x400, float:1.435E-42)
        L4d:
            r0 = r0 | r6
        L4e:
            r6 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r6
            r6 = 599187(0x92493, float:8.3964E-40)
            r6 = r6 & r0
            r7 = 599186(0x92492, float:8.39638E-40)
            r9 = 0
            if (r6 == r7) goto L5d
            r6 = 1
            goto L5e
        L5d:
            r6 = r9
        L5e:
            r7 = r0 & 1
            boolean r6 = r15.O(r7, r6)
            if (r6 == 0) goto La0
            if (r2 == 0) goto L6c
            b3.m r2 = b3.m.f1770a
            r10 = r2
            goto L6d
        L6c:
            r10 = r3
        L6d:
            if (r4 == 0) goto L73
            b3.h r2 = b3.c.A
            r12 = r2
            goto L74
        L73:
            r12 = r5
        L74:
            java.lang.Object r2 = r15.L()
            n2.e r3 = n2.l.f9953a
            if (r2 != r3) goto L81
            c1.e r2 = c1.e.L
            r15.h0(r2)
        L81:
            r13 = r2
            mc.l r13 = (mc.l) r13
            r2 = r0 & 14
            r2 = r2 | 48
            r4 = r21
            d1.q1 r9 = d1.u1.f(r1, r4, r15, r2, r9)
            r0 = r0 & 8176(0x1ff0, float:1.1457E-41)
            r2 = 221184(0x36000, float:3.09945E-40)
            r16 = r0 | r2
            r11 = r19
            r14 = r23
            a(r9, r10, r11, r12, r13, r14, r15, r16)
            r2 = r10
            r4 = r12
            r6 = r13
            goto La9
        La0:
            r4 = r21
            r15.R()
            r6 = r22
            r2 = r3
            r4 = r5
        La9:
            n2.p1 r10 = r15.r()
            if (r10 == 0) goto Lbe
            c1.f r0 = new c1.f
            r3 = r19
            r5 = r21
            r7 = r23
            r9 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f9983d = r0
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.m.b(java.lang.Object, b3.p, mc.l, b3.d, java.lang.String, mc.l, v2.c, n2.m, int, int):void");
    }

    public static final l0 c(c1 c1Var, d1 d1Var) {
        return new l0(c1Var, d1Var, 0.0f, new o2(l.L));
    }
}
