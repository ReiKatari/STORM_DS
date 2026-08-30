package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class s6 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f5397a = 16;

    /* renamed from: b  reason: collision with root package name */
    public static final float f5398b = 12;

    public static final void a(final b7 b7Var, final String str, final mc.p pVar, final q4.g0 g0Var, final mc.p pVar2, final boolean z10, final boolean z11, final boolean z12, final j1.i iVar, final l1.d1 d1Var, final i3.n0 n0Var, final d1 d1Var2, final v2.c cVar, n2.m mVar, final int i2, final int i10) {
        int i11;
        mc.p pVar3;
        boolean z13;
        int i12;
        i3.n0 n0Var2;
        n2.r rVar;
        c2 c2Var;
        boolean z14;
        boolean z15;
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(418608794);
        if ((i2 & 6) == 0) {
            i11 = (rVar2.d(b7Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i11 = i2;
        }
        if ((i2 & 48) == 0) {
            i11 |= rVar2.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            pVar3 = pVar;
            i11 |= rVar2.h(pVar3) ? 256 : 128;
        } else {
            pVar3 = pVar;
        }
        if ((i2 & 3072) == 0) {
            i11 |= rVar2.f(g0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i11 |= rVar2.h(pVar2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i11 |= rVar2.h(null) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i11 |= rVar2.h(null) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i11 |= rVar2.h(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            z13 = z10;
            i11 |= rVar2.g(z13) ? 67108864 : 33554432;
        } else {
            z13 = z10;
        }
        if ((i2 & 805306368) == 0) {
            i11 |= rVar2.g(z11) ? 536870912 : 268435456;
        }
        if ((i10 & 6) == 0) {
            i12 = i10 | (rVar2.g(z12) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= rVar2.f(iVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= rVar2.f(d1Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            n0Var2 = n0Var;
            i12 |= rVar2.f(n0Var2) ? 2048 : 1024;
        } else {
            n0Var2 = n0Var;
        }
        if ((i10 & 24576) == 0) {
            i12 |= rVar2.f(d1Var2) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= rVar2.h(cVar) ? 131072 : 65536;
        }
        boolean z16 = true;
        if (rVar2.O(i11 & 1, ((i11 & 306783379) == 306783378 && (i12 & 74899) == 74898) ? false : true)) {
            boolean z17 = ((i11 & 112) == 32) | ((i11 & 7168) == 2048);
            Object L = rVar2.L();
            if (z17 || L == n2.l.f9953a) {
                L = g0Var.a(new l4.h(str));
                rVar2.h0(L);
            }
            String str2 = ((q4.e0) L).f12244a.B;
            if (((Boolean) a.a.m(iVar, rVar2, (i12 >> 3) & 14).getValue()).booleanValue()) {
                c2Var = c2.Focused;
            } else {
                c2Var = str2.length() == 0 ? c2.UnfocusedEmpty : c2.UnfocusedNotEmpty;
            }
            r6 r6Var = new r6(d1Var2, z11, z12, iVar);
            n2.t2 t2Var = g7.f5161b;
            f7 f7Var = (f7) rVar2.j(t2Var);
            l4.r0 r0Var = f7Var.f5148g;
            l4.r0 r0Var2 = f7Var.f5153l;
            long b10 = r0Var.b();
            long j2 = i3.s.f6687h;
            if ((!i3.s.c(b10, j2) || i3.s.c(r0Var2.b(), j2)) && (i3.s.c(r0Var.b(), j2) || !i3.s.c(r0Var2.b(), j2))) {
                z16 = false;
            }
            rVar2.X(-1443813555);
            long b11 = ((f7) rVar2.j(t2Var)).f5153l.b();
            if (z16) {
                rVar2.X(-887928539);
                if (b11 == 16) {
                    b11 = ((i3.s) r6Var.i(c2Var, rVar2, 0)).f6689a;
                }
                z14 = false;
                rVar2.p(false);
            } else {
                z14 = false;
                rVar2.X(1218284988);
                rVar2.p(false);
            }
            rVar2.p(z14);
            rVar2.X(-1443806289);
            long b12 = ((f7) rVar2.j(t2Var)).f5148g.b();
            if (z16) {
                rVar2.X(-1026713946);
                if (b12 == 16) {
                    b12 = ((i3.s) r6Var.i(c2Var, rVar2, 0)).f6689a;
                }
                z15 = false;
                rVar2.p(false);
            } else {
                z15 = false;
                rVar2.X(798166043);
                rVar2.p(false);
            }
            rVar2.p(z15);
            rVar = rVar2;
            a7.f5044a.a(c2Var, b11, b12, r6Var, pVar2 != null ? true : z15, v2.h.c(33336375, new q6(pVar2, str2, d1Var2, z11, z12, iVar, n0Var2, b7Var, pVar3, z13, d1Var, z16, cVar), rVar2), rVar, 1769472);
        } else {
            rVar = rVar2;
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: g2.l6
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(i2 | 1);
                    int F2 = n2.s.F(i10);
                    s6.a(b7.this, str, pVar, g0Var, pVar2, z10, z11, z12, iVar, d1Var, n0Var, d1Var2, cVar, (n2.m) obj, F, F2);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void b(final long j2, l4.r0 r0Var, final mc.p pVar, n2.m mVar, final int i2, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(2064632657);
        if (rVar.e(j2)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i16 = i11 | i2;
        int i17 = i10 & 2;
        if (i17 != 0) {
            i13 = i16 | 48;
        } else {
            if (rVar.f(r0Var)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i13 = i16 | i12;
        }
        if ((i10 & 4) != 0) {
            i13 |= 384;
        } else if ((i2 & 384) == 0) {
            if (rVar.f(null)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if (rVar.h(pVar)) {
            i15 = 2048;
        } else {
            i15 = 1024;
        }
        int i18 = i13 | i15;
        if ((i18 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i18 & 1, z10)) {
            if (i17 != 0) {
                r0Var = null;
            }
            v2.c c4 = v2.h.c(-650790565, new m6(j2, (Float) null, pVar), rVar);
            if (r0Var != null) {
                rVar.X(-162880673);
                e7.a(r0Var, c4, rVar, ((i18 >> 3) & 14) | 48);
            } else {
                rVar.X(-162879037);
                c4.j(rVar, 6);
            }
            rVar.p(false);
        } else {
            rVar.R();
        }
        final l4.r0 r0Var2 = r0Var;
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: g2.n6
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s6.b(j2, r0Var2, pVar, (n2.m) obj, n2.s.F(i2 | 1), i10);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final Object c(y3.u0 u0Var) {
        y3.d0 d0Var;
        Object n10 = u0Var.n();
        if (n10 instanceof y3.d0) {
            d0Var = (y3.d0) n10;
        } else {
            d0Var = null;
        }
        if (d0Var == null) {
            return null;
        }
        return d0Var.f14670i0;
    }
}
