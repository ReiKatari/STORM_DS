package u1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f13325a = 0;

    static {
        float f8 = 40;
        p7.m.a(f8, f8);
    }

    public static final void a(final String str, final mc.l lVar, final b3.p pVar, final boolean z10, final l4.r0 r0Var, final o0 o0Var, final n0 n0Var, final int i2, final int i10, final q4.g0 g0Var, mc.l lVar2, final j1.i iVar, final i3.p0 p0Var, final v2.c cVar, n2.m mVar, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        n2.r rVar;
        final mc.l lVar3;
        int i17;
        mc.l lVar4;
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(2026950908);
        if ((i11 & 6) == 0) {
            i13 = (rVar2.f(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= rVar2.h(lVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= rVar2.f(pVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= rVar2.g(z10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= rVar2.g(false) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= rVar2.f(r0Var) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= rVar2.f(o0Var) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= rVar2.f(n0Var) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= rVar2.g(false) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= rVar2.d(i2) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = 196608;
            i15 = i10;
            i16 = i12 | (rVar2.d(i15) ? 4 : 2);
        } else {
            i14 = 196608;
            i15 = i10;
            i16 = i12;
        }
        if ((i12 & 48) == 0) {
            i16 |= rVar2.f(g0Var) ? 32 : 16;
        }
        int i18 = i16 | 384;
        if ((i12 & 3072) == 0) {
            i18 |= rVar2.f(iVar) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i18 |= rVar2.f(p0Var) ? 16384 : 8192;
        }
        if ((i12 & i14) == 0) {
            i18 |= rVar2.h(cVar) ? 131072 : 65536;
        }
        if (rVar2.O(i13 & 1, ((i13 & 306783379) == 306783378 && (74899 & i18) == 74898) ? false : true)) {
            rVar2.T();
            int i19 = i11 & 1;
            n2.e eVar = n2.l.f9953a;
            if (i19 != 0 && !rVar2.y()) {
                rVar2.R();
                lVar4 = lVar2;
                i17 = i18;
            } else {
                Object L = rVar2.L();
                if (L == eVar) {
                    i17 = i18;
                    L = new od.x(22);
                    rVar2.h0(L);
                } else {
                    i17 = i18;
                }
                lVar4 = (mc.l) L;
            }
            rVar2.q();
            Object L2 = rVar2.L();
            if (L2 == eVar) {
                L2 = n2.s.w(new q4.x(str, 6, 0L));
                rVar2.h0(L2);
            }
            n2.w0 w0Var = (n2.w0) L2;
            q4.x xVar = (q4.x) w0Var.getValue();
            q4.x xVar2 = new q4.x(new l4.h(str), xVar.f12277b, xVar.f12278c);
            boolean f8 = rVar2.f(xVar2);
            Object L3 = rVar2.L();
            if (f8 || L3 == eVar) {
                L3 = new q1.e(4, xVar2, w0Var);
                rVar2.h0(L3);
            }
            n2.s.h((mc.a) L3, rVar2);
            boolean z11 = (i13 & 14) == 4;
            Object L4 = rVar2.L();
            if (z11 || L4 == eVar) {
                L4 = n2.s.w(str);
                rVar2.h0(L4);
            }
            n2.w0 w0Var2 = (n2.w0) L4;
            q4.j a10 = o0Var.a(false);
            boolean f10 = ((i13 & 112) == 32) | rVar2.f(w0Var2);
            Object L5 = rVar2.L();
            if (f10 || L5 == eVar) {
                L5 = new ai.c0(lVar, w0Var, w0Var2, 12);
                rVar2.h0(L5);
            }
            int i20 = i17 << 9;
            rVar = rVar2;
            l0.e(xVar2, (mc.l) L5, pVar, r0Var, g0Var, lVar4, iVar, p0Var, true, i2, i15, a10, n0Var, z10, cVar, rVar, (i13 & 896) | ((i13 >> 6) & 7168) | (i20 & 57344) | (i20 & 458752) | (3670016 & i20) | (i20 & 29360128), ((i13 >> 15) & 896) | (i13 & 7168) | (i13 & 57344) | (i17 & 458752));
            lVar3 = lVar4;
        } else {
            rVar = rVar2;
            rVar.R();
            lVar3 = lVar2;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: u1.f
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(i11 | 1);
                    int F2 = n2.s.F(i12);
                    h.a(str, lVar, pVar, z10, r0Var, o0Var, n0Var, i2, i10, g0Var, lVar3, iVar, p0Var, cVar, (n2.m) obj, F, F2);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void b(q4.x xVar, mc.l lVar, b3.p pVar, boolean z10, l4.r0 r0Var, o0 o0Var, n0 n0Var, boolean z11, int i2, int i10, q4.g0 g0Var, mc.l lVar2, j1.i iVar, i3.p0 p0Var, v2.c cVar, n2.m mVar, int i11, int i12) {
        int i13;
        boolean z12;
        int i14;
        int i15;
        mc.l lVar3;
        mc.l lVar4;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-971111025);
        if ((i11 & 6) == 0) {
            i13 = (rVar.f(xVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= rVar.h(lVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= rVar.f(pVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            z12 = z10;
            i13 |= rVar.g(z12) ? 2048 : 1024;
        } else {
            z12 = z10;
        }
        if ((i11 & 24576) == 0) {
            i13 |= rVar.g(false) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i14 = 196608;
            i13 |= rVar.f(r0Var) ? 131072 : 65536;
        } else {
            i14 = 196608;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= rVar.f(o0Var) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= rVar.f(n0Var) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= rVar.g(z11) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= rVar.d(i2) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i15 = i12 | (rVar.d(i10) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= rVar.f(g0Var) ? 32 : 16;
        }
        int i16 = i15 | 384;
        if ((i12 & 3072) == 0) {
            i16 |= rVar.f(iVar) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i16 |= rVar.f(p0Var) ? 16384 : 8192;
        }
        if ((i12 & i14) == 0) {
            i16 |= rVar.h(cVar) ? 131072 : 65536;
        }
        if (rVar.O(i13 & 1, ((i13 & 306783379) == 306783378 && (74899 & i16) == 74898) ? false : true)) {
            rVar.T();
            int i17 = i11 & 1;
            n2.e eVar = n2.l.f9953a;
            if (i17 != 0 && !rVar.y()) {
                rVar.R();
                lVar4 = lVar2;
            } else {
                Object L = rVar.L();
                if (L == eVar) {
                    L = new od.x(22);
                    rVar.h0(L);
                }
                lVar4 = (mc.l) L;
            }
            rVar.q();
            q4.j a10 = o0Var.a(z11);
            boolean z13 = !z11;
            int i18 = z11 ? 1 : i10;
            int i19 = z11 ? 1 : i2;
            boolean z14 = ((i13 & 14) == 4) | ((i13 & 112) == 32);
            Object L2 = rVar.L();
            if (z14 || L2 == eVar) {
                L2 = new he.g(26, xVar, lVar);
                rVar.h0(L2);
            }
            int i20 = i16 << 9;
            mc.l lVar5 = lVar4;
            l0.e(xVar, (mc.l) L2, pVar, r0Var, g0Var, lVar5, iVar, p0Var, z13, i19, i18, a10, n0Var, z12, cVar, rVar, (i13 & 910) | ((i13 >> 6) & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128), (i13 & 7168) | ((i13 >> 15) & 896) | (i13 & 57344) | (i16 & 458752));
            lVar3 = lVar5;
        } else {
            rVar.R();
            lVar3 = lVar2;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new g(xVar, lVar, pVar, z10, r0Var, o0Var, n0Var, z11, i2, i10, g0Var, lVar3, iVar, p0Var, cVar, i11, i12);
        }
    }
}
