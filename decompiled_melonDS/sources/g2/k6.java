package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k6 {

    /* renamed from: a  reason: collision with root package name */
    public static final k6 f5223a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final float f5224b = 56;

    /* renamed from: c  reason: collision with root package name */
    public static final float f5225c = 280;

    /* renamed from: d  reason: collision with root package name */
    public static final float f5226d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final float f5227e = 2;

    public static t1.d c(n2.m mVar) {
        return ((u3) ((n2.r) mVar).j(w3.f5448a)).f5420a;
    }

    public final void a(final boolean z10, final boolean z11, final j1.i iVar, final d1 d1Var, final i3.n0 n0Var, float f8, float f10, n2.m mVar, final int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        final float f11;
        final float f12;
        float f13;
        int i15;
        float f14;
        long j2;
        boolean z13;
        n2.s2 A;
        float f15;
        n2.s2 A2;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(943754022);
        if (rVar.g(z10)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i16 = i2 | i10;
        if (rVar.g(z11)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i17 = i16 | i11;
        if (rVar.f(iVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i18 = i17 | i12;
        if (rVar.f(d1Var)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i19 = i18 | i13;
        if (rVar.f(n0Var)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        int i20 = i19 | i14 | 589824;
        if ((4793491 & i20) != 4793490) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (rVar.O(i20 & 1, z12)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
                f13 = f8;
                i15 = i20 & (-4128769);
                f14 = f10;
            } else {
                f13 = f5227e;
                i15 = i20 & (-4128769);
                f14 = f5226d;
            }
            rVar.q();
            n2.w0 m = a.a.m(iVar, rVar, ((i15 & 8190) >> 6) & 14);
            d1Var.getClass();
            rVar.X(476110356);
            n2.w0 m10 = a.a.m(iVar, rVar, ((i15 & 8190) >> 6) & 14);
            if (!z10) {
                j2 = d1Var.f5097h;
            } else if (z11) {
                j2 = d1Var.f5096g;
            } else if (((Boolean) m10.getValue()).booleanValue()) {
                j2 = d1Var.f5094e;
            } else {
                j2 = d1Var.f5095f;
            }
            if (z10) {
                rVar.X(1822093355);
                z13 = false;
                A = c1.i2.a(j2, d1.d.r(150, 0, null, 6), rVar, 48, 12);
                rVar.p(false);
            } else {
                z13 = false;
                rVar.X(1822196213);
                A = n2.s.A(new i3.s(j2), rVar);
                rVar.p(false);
            }
            rVar.p(z13);
            if (((Boolean) m.getValue()).booleanValue()) {
                f15 = f13;
            } else {
                f15 = f14;
            }
            if (z10) {
                rVar.X(1361082574);
                A2 = d1.e.a(f15, d1.d.r(150, 0, null, 6), rVar, 48);
                rVar.p(false);
            } else {
                rVar.X(1361186796);
                A2 = n2.s.A(new x4.f(f14), rVar);
                rVar.p(false);
            }
            f1.v vVar = (f1.v) n2.s.A(new f1.v(((x4.f) A2.getValue()).A, new i3.p0(((i3.s) A.getValue()).f6689a)), rVar).getValue();
            l1.p.a(new f1.u(vVar.f4658a, vVar.f4659b, n0Var), rVar, 0);
            f12 = f14;
            f11 = f13;
        } else {
            rVar.R();
            f11 = f8;
            f12 = f10;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(z10, z11, iVar, d1Var, n0Var, f11, f12, i2) { // from class: g2.j6
                public final /* synthetic */ boolean B;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ j1.i R;
                public final /* synthetic */ d1 X;
                public final /* synthetic */ i3.n0 Y;
                public final /* synthetic */ float Z;

                /* renamed from: b0  reason: collision with root package name */
                public final /* synthetic */ float f5208b0;

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(12582913);
                    k6.this.a(this.B, this.L, this.R, this.X, this.Y, this.Z, this.f5208b0, (n2.m) obj, F);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public final void b(final String str, final mc.p pVar, final boolean z10, final boolean z11, final q4.g0 g0Var, final j1.i iVar, final boolean z12, final mc.p pVar2, final i3.n0 n0Var, final d1 d1Var, l1.d1 d1Var2, final v2.c cVar, n2.m mVar, final int i2) {
        String str2;
        int i10;
        mc.p pVar3;
        boolean z13;
        boolean z14;
        q4.g0 g0Var2;
        int i11;
        int i12;
        int i13;
        boolean z15;
        n2.r rVar;
        final l1.d1 d1Var3;
        int i14;
        l1.h1 h1Var;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(1154925202);
        if ((i2 & 6) == 0) {
            str2 = str;
            if (rVar2.f(str2)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i10 = i24 | i2;
        } else {
            str2 = str;
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            pVar3 = pVar;
            if (rVar2.h(pVar3)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i10 |= i23;
        } else {
            pVar3 = pVar;
        }
        if ((i2 & 384) == 0) {
            z13 = z10;
            if (rVar2.g(z13)) {
                i22 = 256;
            } else {
                i22 = 128;
            }
            i10 |= i22;
        } else {
            z13 = z10;
        }
        if ((i2 & 3072) == 0) {
            z14 = z11;
            if (rVar2.g(z14)) {
                i21 = 2048;
            } else {
                i21 = 1024;
            }
            i10 |= i21;
        } else {
            z14 = z11;
        }
        if ((i2 & 24576) == 0) {
            g0Var2 = g0Var;
            if (rVar2.f(g0Var2)) {
                i20 = 16384;
            } else {
                i20 = 8192;
            }
            i10 |= i20;
        } else {
            g0Var2 = g0Var;
        }
        if ((i2 & 196608) == 0) {
            if (rVar2.f(iVar)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i10 |= i19;
        }
        if ((i2 & 1572864) == 0) {
            if (rVar2.g(z12)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i10 |= i18;
        }
        if ((i2 & 12582912) == 0) {
            if (rVar2.h(pVar2)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i10 |= i17;
        }
        if ((i2 & 100663296) == 0) {
            if (rVar2.h(null)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i10 |= i16;
        }
        if ((i2 & 805306368) == 0) {
            if (rVar2.h(null)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i10 |= i15;
        }
        if (rVar2.h(null)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i25 = 221184 | i11;
        if (rVar2.f(n0Var)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i26 = i25 | i12;
        if (rVar2.f(d1Var)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i27 = i26 | i13 | 1024;
        if ((306783379 & i10) == 306783378 && (74899 & i27) == 74898) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (rVar2.O(i10 & 1, z15)) {
            rVar2.T();
            if ((i2 & 1) != 0 && !rVar2.y()) {
                rVar2.R();
                i14 = i27 & (-7169);
                h1Var = d1Var2;
            } else {
                float f8 = s6.f5397a;
                i14 = i27 & (-7169);
                h1Var = new l1.h1(f8, f8, f8, f8);
            }
            rVar2.q();
            int i28 = i10 << 3;
            rVar = rVar2;
            int i29 = ((i10 >> 3) & 7168) | (i28 & 112) | 6 | (i28 & 896);
            int i30 = i10 >> 9;
            int i31 = i29 | (i30 & 57344) | (i30 & 458752) | (i30 & 3670016) | ((i14 << 21) & 29360128) | ((i10 << 15) & 234881024) | ((i10 << 21) & 1879048192);
            int i32 = ((i10 >> 18) & 14) | ((i10 >> 12) & 112);
            int i33 = i14 << 6;
            q4.g0 g0Var3 = g0Var2;
            s6.a(b7.Outlined, str2, pVar3, g0Var3, pVar2, z14, z13, z12, iVar, h1Var, n0Var, d1Var, cVar, rVar, i31, i32 | (i33 & 7168) | (i33 & 57344) | 196608);
            d1Var3 = h1Var;
        } else {
            rVar = rVar2;
            rVar.R();
            d1Var3 = d1Var2;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: g2.i6
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(i2 | 1);
                    k6.this.b(str, pVar, z10, z11, g0Var, iVar, z12, pVar2, n0Var, d1Var, d1Var3, cVar, (n2.m) obj, F);
                    return yb.y.f14813a;
                }
            };
        }
    }
}
