package n2;

import b4.i3;
import h1.x2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final a4.e0 f10019a = new a4.e0(7);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f10020b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final h0 f10021c = new Object();

    public static final w0 A(Object obj, m mVar) {
        r rVar = (r) mVar;
        Object L = rVar.L();
        if (L == l.f9953a) {
            L = w(obj);
            rVar.h0(L);
        }
        w0 w0Var = (w0) L;
        w0Var.setValue(obj);
        return w0Var;
    }

    public static final void B(h2 h2Var, int i2, Object obj) {
        int h2 = h2Var.h(i2);
        Object[] objArr = h2Var.f9906c;
        Object obj2 = objArr[h2];
        objArr[h2] = l.f9953a;
        if (obj == obj2) {
            return;
        }
        t.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void C(Object obj, mc.p pVar, m mVar) {
        r rVar = (r) mVar;
        if (!rVar.S && nc.k.a(rVar.L(), obj)) {
            return;
        }
        rVar.h0(obj);
        rVar.b(obj, pVar);
    }

    public static final cd.z0 D(mc.a aVar) {
        return new cd.z0(new i3(aVar, null));
    }

    public static final int E(a1.w wVar) {
        int c4;
        int i2 = wVar.f112b;
        int c10 = wVar.c(0);
        while (wVar.f112b != 0 && wVar.c(0) == c10) {
            int i10 = wVar.f112b;
            if (i10 != 0) {
                wVar.e(0, wVar.f111a[i10 - 1]);
                wVar.d(wVar.f112b - 1);
                int i11 = wVar.f112b;
                int i12 = i11 >>> 1;
                int i13 = 0;
                while (i13 < i12) {
                    int c11 = wVar.c(i13);
                    int i14 = (i13 + 1) * 2;
                    int i15 = i14 - 1;
                    int c12 = wVar.c(i15);
                    if (i14 < i11 && (c4 = wVar.c(i14)) > c12) {
                        if (c4 > c11) {
                            wVar.e(i13, c4);
                            wVar.e(i14, c11);
                            i13 = i14;
                        }
                    } else if (c12 > c11) {
                        wVar.e(i13, c12);
                        wVar.e(i15, c11);
                        i13 = i15;
                    }
                }
            } else {
                m9.o.x("IntList is empty.");
                return 0;
            }
        }
        return c10;
    }

    public static final int F(int i2) {
        int i10 = 306783378 & i2;
        int i11 = 613566756 & i2;
        return (i2 & (-920350135)) | (i11 >> 1) | i10 | ((i10 << 1) & i11);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [s2.d, v2.f] */
    public static final v2.g G(o1[] o1VarArr, v2.g gVar, v2.g gVar2) {
        v2.g gVar3 = v2.g.R;
        ?? dVar = new s2.d(gVar3);
        dVar.Z = gVar3;
        for (o1 o1Var : o1VarArr) {
            n1 n1Var = (n1) o1Var.f9968e;
            if (o1Var.f9967d || !gVar.containsKey(n1Var)) {
                dVar.put(n1Var, n1Var.c(o1Var, (v2) gVar2.get(n1Var)));
            }
        }
        return dVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(n2.o1 r11, mc.p r12, n2.m r13, int r14) {
        /*
            n2.r r13 = (n2.r) r13
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.Z(r0)
            a4.w r0 = r13.f10016x
            v2.g r1 = r13.l()
            r2 = 201(0xc9, float:2.82E-43)
            n2.z0 r3 = n2.t.f10026b
            r13.U(r2, r3)
            java.lang.Object r2 = r13.L()
            n2.e r3 = n2.l.f9953a
            boolean r3 = nc.k.a(r2, r3)
            r4 = 0
            if (r3 == 0) goto L24
            r2 = r4
            goto L29
        L24:
            r2.getClass()
            n2.v2 r2 = (n2.v2) r2
        L29:
            java.lang.Object r3 = r11.f9968e
            n2.n1 r3 = (n2.n1) r3
            n2.v2 r5 = r3.c(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L3a
            r13.h0(r5)
        L3a:
            boolean r6 = r13.S
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L52
            boolean r2 = r11.f9967d
            if (r2 != 0) goto L4a
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L4e
        L4a:
            v2.g r1 = r1.d(r3, r5)
        L4e:
            r13.J = r7
        L50:
            r2 = r8
            goto L8d
        L52:
            n2.d2 r6 = r13.G
            int r9 = r6.f9892g
            int[] r10 = r6.f9887b
            java.lang.Object r6 = r6.b(r10, r9)
            r6.getClass()
            v2.g r6 = (v2.g) r6
            boolean r9 = r13.A()
            if (r9 == 0) goto L69
            if (r2 != 0) goto L74
        L69:
            boolean r9 = r11.f9967d
            if (r9 != 0) goto L82
            boolean r9 = r1.containsKey(r3)
            if (r9 != 0) goto L74
            goto L82
        L74:
            if (r2 == 0) goto L7b
            boolean r2 = r13.f10015w
            if (r2 != 0) goto L7b
            goto L80
        L7b:
            boolean r2 = r13.f10015w
            if (r2 == 0) goto L80
            goto L86
        L80:
            r1 = r6
            goto L86
        L82:
            v2.g r1 = r1.d(r3, r5)
        L86:
            boolean r2 = r13.f10017y
            if (r2 != 0) goto L8c
            if (r6 == r1) goto L50
        L8c:
            r2 = r7
        L8d:
            if (r2 == 0) goto L96
            boolean r3 = r13.S
            if (r3 != 0) goto L96
            r13.J(r1)
        L96:
            boolean r3 = r13.f10015w
            r0.c(r3)
            r13.f10015w = r2
            r13.K = r1
            r2 = 202(0xca, float:2.83E-43)
            n2.z0 r3 = n2.t.f10027c
            r13.S(r3, r2, r1, r8)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.j(r13, r1)
            r13.p(r8)
            r13.p(r8)
            int r0 = r0.b()
            if (r0 == 0) goto Lbe
            goto Lbf
        Lbe:
            r7 = r8
        Lbf:
            r13.f10015w = r7
            r13.K = r4
            n2.p1 r13 = r13.r()
            if (r13 == 0) goto Ld1
            ai.r r0 = new ai.r
            r1 = 6
            r0.<init>(r11, r12, r14, r1)
            r13.f9983d = r0
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.s.a(n2.o1, mc.p, n2.m, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v4, types: [s2.d, v2.f] */
    /* JADX WARN: Type inference failed for: r7v6, types: [s2.d, v2.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(n2.o1[] r10, mc.p r11, n2.m r12, int r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.s.b(n2.o1[], mc.p, n2.m, int):void");
    }

    public static final void c(Object obj, Object obj2, mc.l lVar, m mVar) {
        r rVar = (r) mVar;
        boolean f8 = rVar.f(obj) | rVar.f(obj2);
        Object L = rVar.L();
        if (f8 || L == l.f9953a) {
            L = new f0(lVar);
            rVar.h0(L);
        }
        f0 f0Var = (f0) L;
    }

    public static final void d(Object obj, mc.l lVar, m mVar) {
        r rVar = (r) mVar;
        boolean f8 = rVar.f(obj);
        Object L = rVar.L();
        if (f8 || L == l.f9953a) {
            L = new f0(lVar);
            rVar.h0(L);
        }
        f0 f0Var = (f0) L;
    }

    public static final void e(Object[] objArr, mc.l lVar, m mVar) {
        boolean z10 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z10 |= ((r) mVar).f(obj);
        }
        r rVar = (r) mVar;
        Object L = rVar.L();
        if (!z10 && L != l.f9953a) {
            return;
        }
        rVar.h0(new f0(lVar));
    }

    public static final void f(Object obj, Object obj2, mc.p pVar, m mVar) {
        r rVar = (r) mVar;
        cc.g gVar = rVar.R;
        boolean f8 = rVar.f(obj) | rVar.f(obj2);
        Object L = rVar.L();
        if (f8 || L == l.f9953a) {
            L = new r0(gVar, pVar);
            rVar.h0(L);
        }
        r0 r0Var = (r0) L;
    }

    public static final void g(Object obj, mc.p pVar, m mVar) {
        r rVar = (r) mVar;
        cc.g gVar = rVar.R;
        boolean f8 = rVar.f(obj);
        Object L = rVar.L();
        if (f8 || L == l.f9953a) {
            L = new r0(gVar, pVar);
            rVar.h0(L);
        }
        r0 r0Var = (r0) L;
    }

    public static final void h(mc.a aVar, m mVar) {
        o2.k0 k0Var = ((r) mVar).M.f10615b.f10612d;
        k0Var.V(o2.b0.f10626d);
        l0.f.C(k0Var, 0, aVar);
    }

    public static final void i(List list, int i2, int i10) {
        int s10 = s(i2, list);
        if (s10 < 0) {
            s10 = -(s10 + 1);
        }
        while (s10 < list.size() && ((n0) list.get(s10)).f9959b < i10) {
            n0 n0Var = (n0) list.remove(s10);
        }
    }

    public static final void j(a1.w wVar, int i2) {
        if (wVar.f112b != 0 && (wVar.c(0) == i2 || wVar.c(wVar.f112b - 1) == i2)) {
            return;
        }
        int i10 = wVar.f112b;
        wVar.a(i2);
        while (i10 > 0) {
            int i11 = ((i10 + 1) >>> 1) - 1;
            int c4 = wVar.c(i11);
            if (i2 <= c4) {
                break;
            }
            wVar.e(i10, c4);
            i10 = i11;
        }
        wVar.e(i10, i2);
    }

    public static void k(h2 h2Var, List list, y yVar) {
        Object obj;
        p1 p1Var;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                int c4 = h2Var.c((a) list.get(i2));
                int N = h2Var.N(h2Var.f9905b, h2Var.r(c4));
                if (N < h2Var.g(h2Var.f9905b, h2Var.r(c4 + 1))) {
                    obj = h2Var.f9906c[h2Var.h(N)];
                } else {
                    obj = l.f9953a;
                }
                if (obj instanceof p1) {
                    p1Var = (p1) obj;
                } else {
                    p1Var = null;
                }
                if (p1Var != null) {
                    p1Var.f9980a = yVar;
                }
            }
        }
    }

    public static final w0 l(cd.h hVar, Object obj, cc.g gVar, m mVar, int i2, int i10) {
        if ((i10 & 2) != 0) {
            gVar = cc.h.A;
        }
        r rVar = (r) mVar;
        boolean h2 = rVar.h(gVar) | rVar.h(hVar);
        Object L = rVar.L();
        e eVar = l.f9953a;
        if (h2 || L == eVar) {
            L = new x2(gVar, hVar, null, 15);
            rVar.h0(L);
        }
        mc.p pVar = (mc.p) L;
        Object L2 = rVar.L();
        if (L2 == eVar) {
            L2 = w(obj);
            rVar.h0(L2);
        }
        w0 w0Var = (w0) L2;
        boolean h10 = rVar.h(pVar);
        Object L3 = rVar.L();
        if (h10 || L3 == eVar) {
            L3 = new n2(pVar, w0Var, null, 1);
            rVar.h0(L3);
        }
        f(hVar, gVar, (mc.p) L3, rVar);
        return w0Var;
    }

    public static final w0 m(cd.o1 o1Var, m mVar) {
        return l(o1Var, o1Var.getValue(), cc.h.A, mVar, 0, 0);
    }

    public static final void n(d2 d2Var, ArrayList arrayList, int i2) {
        boolean l10 = d2Var.l(i2);
        int[] iArr = d2Var.f9887b;
        if (l10) {
            arrayList.add(d2Var.n(i2));
            return;
        }
        int i10 = iArr[(i2 * 5) + 3] + i2;
        for (int i11 = i2 + 1; i11 < i10; i11 += iArr[(i11 * 5) + 3]) {
            n(d2Var, arrayList, i11);
        }
    }

    public static final zc.u o(m mVar) {
        return new a2(((r) mVar).R);
    }

    public static final p2.b p() {
        p1.c1 c1Var = m2.f9957b;
        p2.b bVar = (p2.b) c1Var.d();
        if (bVar == null) {
            p2.b bVar2 = new p2.b(new q[0]);
            c1Var.r(bVar2);
            return bVar2;
        }
        return bVar;
    }

    public static final e0 q(mc.a aVar) {
        p1.c1 c1Var = m2.f9956a;
        return new e0(aVar, null);
    }

    public static final e0 r(mc.a aVar, e eVar) {
        p1.c1 c1Var = m2.f9956a;
        return new e0(aVar, eVar);
    }

    public static final int s(int i2, List list) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int b10 = nc.k.b(((n0) list.get(i11)).f9959b, i2);
            if (b10 < 0) {
                i10 = i11 + 1;
            } else if (b10 > 0) {
                size = i11 - 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public static final b4.a1 t(cc.g gVar) {
        b4.a1 a1Var = (b4.a1) gVar.t(e.L);
        if (a1Var != null) {
            return a1Var;
        }
        a0.j.p("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final void u(m mVar, Integer num, mc.p pVar) {
        r rVar = (r) mVar;
        if (rVar.S) {
            rVar.b(num, pVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List v(h2 h2Var, int i2, h2 h2Var2, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        zb.q qVar;
        boolean z14;
        boolean z15;
        int i10;
        int i11;
        int i12;
        int u4 = h2Var.u(i2);
        int i13 = i2 + u4;
        int f8 = h2Var.f(i2);
        int f10 = h2Var.f(i13);
        int i14 = f10 - f8;
        if (i2 >= 0 && (h2Var.f9905b[(h2Var.r(i2) * 5) + 1] & 201326592) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        h2Var2.w(u4);
        h2Var2.x(i14, h2Var2.f9922t);
        if (h2Var.f9910g < i13) {
            h2Var.B(i13);
        }
        if (h2Var.f9914k < f10) {
            h2Var.C(f10, i13);
        }
        int[] iArr = h2Var2.f9905b;
        int i15 = h2Var2.f9922t;
        int i16 = i15 * 5;
        zb.k.g(i16, i2 * 5, i13 * 5, h2Var.f9905b, iArr);
        Object[] objArr = h2Var2.f9906c;
        int i17 = h2Var2.f9912i;
        System.arraycopy(h2Var.f9906c, f8, objArr, i17, i14);
        int i18 = h2Var2.f9924v;
        iArr[i16 + 2] = i18;
        int i19 = i15 - i2;
        int i20 = i15 + u4;
        int g10 = i17 - h2Var2.g(iArr, i15);
        int i21 = h2Var2.m;
        int i22 = h2Var2.f9915l;
        int length = objArr.length;
        boolean z16 = z13;
        int i23 = i21;
        int i24 = i15;
        while (i24 < i20) {
            if (i24 != i15) {
                int i25 = (i24 * 5) + 2;
                iArr[i25] = iArr[i25] + i19;
            }
            int[] iArr2 = iArr;
            int g11 = h2Var2.g(iArr, i24) + g10;
            if (i23 < i24) {
                i11 = i15;
                i12 = 0;
            } else {
                i11 = i15;
                i12 = h2Var2.f9914k;
            }
            iArr2[(i24 * 5) + 4] = h2.i(g11, i12, i22, length);
            if (i24 == i23) {
                i23++;
            }
            i24++;
            i15 = i11;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        h2Var2.m = i23;
        int a10 = g2.a(h2Var.f9907d, i2, h2Var.p());
        int a11 = g2.a(h2Var.f9907d, i13, h2Var.p());
        if (a10 < a11) {
            ArrayList arrayList = h2Var.f9907d;
            ArrayList arrayList2 = new ArrayList(a11 - a10);
            for (int i26 = a10; i26 < a11; i26++) {
                a aVar = (a) arrayList.get(i26);
                aVar.f9871a += i19;
                arrayList2.add(aVar);
            }
            h2Var2.f9907d.addAll(g2.a(h2Var2.f9907d, h2Var2.f9922t, h2Var2.p()), arrayList2);
            arrayList.subList(a10, a11).clear();
            qVar = arrayList2;
        } else {
            qVar = zb.q.A;
        }
        if (!qVar.isEmpty()) {
            HashMap hashMap = h2Var.f9908e;
            HashMap hashMap2 = h2Var2.f9908e;
            if (hashMap != null && hashMap2 != null) {
                int size = qVar.size();
                for (int i27 = 0; i27 < size; i27++) {
                    m0 m0Var = (m0) hashMap.get((a) qVar.get(i27));
                }
            }
        }
        int i28 = h2Var2.f9924v;
        h2Var2.O(i18);
        int E = h2Var.E(h2Var.f9905b, i2);
        if (!z12) {
            z14 = false;
        } else if (z10) {
            if (E >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                h2Var.P();
                h2Var.a(E - h2Var.f9922t);
                h2Var.P();
            }
            h2Var.a(i2 - h2Var.f9922t);
            boolean H = h2Var.H();
            if (z15) {
                h2Var.M();
                h2Var.j();
                h2Var.M();
                h2Var.j();
            }
            z14 = H;
        } else {
            boolean I = h2Var.I(i2, u4);
            h2Var.J(f8, i14, i2 - 1);
            z14 = I;
        }
        if (z14) {
            t.a("Unexpectedly removed anchors");
        }
        int i29 = h2Var2.f9917o;
        int i30 = iArr3[i16 + 1];
        if ((1073741824 & i30) != 0) {
            i10 = 1;
        } else {
            i10 = i30 & 67108863;
        }
        h2Var2.f9917o = i29 + i10;
        if (z11) {
            h2Var2.f9922t = i20;
            h2Var2.f9912i = i17 + i14;
        }
        if (z16) {
            h2Var2.T(i18);
        }
        return qVar;
    }

    public static f1 w(Object obj) {
        return new f1(obj, e.Z);
    }

    public static final Object x(v2.g gVar, n1 n1Var) {
        n1Var.getClass();
        Object obj = gVar.get(n1Var);
        if (obj == null) {
            obj = n1Var.b();
        }
        return ((v2) obj).a(gVar);
    }

    public static final void y(m mVar, mc.l lVar) {
        ((r) mVar).b(yb.y.f14813a, new ai.s0(16, lVar));
    }

    public static final p z(m mVar) {
        y1 y1Var;
        r rVar = (r) mVar;
        rVar.U(206, t.f10029e);
        if (rVar.S) {
            h2.z(rVar.I);
        }
        Object D = rVar.D();
        if (D instanceof y1) {
            y1Var = (y1) D;
        } else {
            y1Var = null;
        }
        if (y1Var == null) {
            y1Var = new y1(new o(new p(rVar, rVar.T, rVar.f10009q, rVar.C, rVar.f10001h.f10079n0)), -1);
            rVar.i0(y1Var);
        }
        x1 x1Var = y1Var.f10083a;
        x1Var.getClass();
        p pVar = ((o) x1Var).A;
        pVar.f9976f.setValue(rVar.l());
        rVar.p(false);
        return pVar;
    }
}
