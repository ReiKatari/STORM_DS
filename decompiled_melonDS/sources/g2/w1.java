package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class w1 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f5444a = 56;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    public static final void a(final mc.a aVar, final b3.p pVar, i3.n0 n0Var, long j2, long j10, z0 z0Var, final v2.c cVar, n2.m mVar, final int i2) {
        int i10;
        boolean z10;
        n2.r rVar;
        final i3.n0 n0Var2;
        final long j11;
        final long j12;
        final z0 z0Var2;
        long b10;
        z0 z0Var3;
        t1.d dVar;
        int i11;
        long j13;
        int i12;
        b3.p pVar2;
        int i13;
        int i14;
        int i15;
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(-482679837);
        if ((i2 & 6) == 0) {
            if (rVar2.h(aVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i15 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar2.f(pVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 |= i14;
        }
        int i16 = i10 | 384;
        if ((i2 & 3072) == 0) {
            i16 = i10 | 1408;
        }
        if ((i2 & 24576) == 0) {
            i16 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i16 |= 65536;
        }
        if ((1572864 & i2) == 0) {
            i16 |= 524288;
        }
        if ((12582912 & i2) == 0) {
            if (rVar2.h(cVar)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i16 |= i13;
        }
        if ((4793491 & i16) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i16 & 1, z10)) {
            rVar2.T();
            int i17 = i2 & 1;
            n2.e eVar = n2.l.f9953a;
            if (i17 != 0 && !rVar2.y()) {
                rVar2.R();
                i11 = i16 & (-4193281);
                dVar = n0Var;
                j13 = j2;
                b10 = j10;
                z0Var3 = z0Var;
            } else {
                t1.d dVar2 = ((u3) rVar2.j(w3.f5448a)).f5420a;
                t1.c cVar2 = new t1.c(50);
                dVar2.getClass();
                t1.d dVar3 = new t1.d(cVar2, cVar2, cVar2, cVar2);
                long i18 = ((l0) rVar2.j(m0.f5257a)).i();
                b10 = m0.b(i18, rVar2);
                float f8 = 6;
                float f10 = 12;
                float f11 = 8;
                boolean c4 = rVar2.c(f8) | rVar2.c(f10) | rVar2.c(f11) | rVar2.c(f11);
                Object L = rVar2.L();
                if (c4 || L == eVar) {
                    L = new z0(f8, f10, f11, f11);
                    rVar2.h0(L);
                }
                z0Var3 = L;
                dVar = dVar3;
                i11 = i16 & (-4193281);
                j13 = i18;
            }
            rVar2.q();
            rVar2.X(36032728);
            Object L2 = rVar2.L();
            if (L2 == eVar) {
                L2 = new j1.i();
                rVar2.h0(L2);
            }
            j1.i iVar = (j1.i) L2;
            rVar2.p(false);
            Object L3 = rVar2.L();
            if (L3 == eVar) {
                L3 = new d1.x1(24);
                rVar2.h0(L3);
            }
            b3.p a10 = i4.n.a(pVar, false, (mc.l) L3);
            z0Var3.getClass();
            rVar2.X(-478475335);
            boolean f12 = rVar2.f(iVar);
            Object L4 = rVar2.L();
            if (!f12 && L4 != eVar) {
                i12 = i11;
                pVar2 = a10;
            } else {
                i12 = i11;
                pVar2 = a10;
                L4 = new t1(z0Var3.f5491a, z0Var3.f5492b, z0Var3.f5493c, z0Var3.f5494d);
                rVar2.h0(L4);
            }
            t1 t1Var = (t1) L4;
            boolean h2 = rVar2.h(t1Var) | rVar2.f(z0Var3);
            Object L5 = rVar2.L();
            if (h2 || L5 == eVar) {
                L5 = new di.b(t1Var, z0Var3, null, 6);
                rVar2.h0(L5);
            }
            n2.s.g(z0Var3, (mc.p) L5, rVar2);
            boolean f13 = rVar2.f(iVar) | rVar2.h(t1Var);
            Object L6 = rVar2.L();
            if (f13 || L6 == eVar) {
                L6 = new a2.o(iVar, t1Var, (cc.c) null, 21);
                rVar2.h0(L6);
            }
            n2.s.g(iVar, (mc.p) L6, rVar2);
            d1.k kVar = t1Var.f5406e.f3525c;
            rVar2.p(false);
            long j14 = b10;
            rVar = rVar2;
            n0.i(aVar, pVar2, false, dVar, j13, j14, ((x4.f) kVar.B.getValue()).A, iVar, v2.h.c(-1823447062, new u1(b10, cVar, 0), rVar2), rVar, (i12 & 14) | 805306368, 68);
            z0Var2 = z0Var3;
            n0Var2 = dVar;
            j11 = j13;
            j12 = j14;
        } else {
            rVar = rVar2;
            rVar.R();
            n0Var2 = n0Var;
            j11 = j2;
            j12 = j10;
            z0Var2 = z0Var;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: g2.v1
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w1.a(mc.a.this, pVar, n0Var2, j11, j12, z0Var2, cVar, (n2.m) obj, n2.s.F(i2 | 1));
                    return yb.y.f14813a;
                }
            };
        }
    }
}
